package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.CaseAssociation;
import com.mypurecloud.sdk.v2.model.CaseAssociationCreate;
import com.mypurecloud.sdk.v2.model.CaseAssociationListing;
import com.mypurecloud.sdk.v2.model.CaseAssociationQuery;
import com.mypurecloud.sdk.v2.model.CaseAssociationQueryEntityListing;
import com.mypurecloud.sdk.v2.model.CaseCreate;
import com.mypurecloud.sdk.v2.model.CaseDateDueUpdate;
import com.mypurecloud.sdk.v2.model.CaseListing;
import com.mypurecloud.sdk.v2.model.CasePriorityUpdate;
import com.mypurecloud.sdk.v2.model.CaseSummaryUpdate;
import com.mypurecloud.sdk.v2.model.Caseplan;
import com.mypurecloud.sdk.v2.model.CaseplanCreate;
import com.mypurecloud.sdk.v2.model.CaseplanCreateResponse;
import com.mypurecloud.sdk.v2.model.CaseplanDataSchema;
import com.mypurecloud.sdk.v2.model.CaseplanDataSchemaListing;
import com.mypurecloud.sdk.v2.model.CaseplanDataSchemaRequest;
import com.mypurecloud.sdk.v2.model.CaseplanListing;
import com.mypurecloud.sdk.v2.model.CaseplanQueryEntityListing;
import com.mypurecloud.sdk.v2.model.CaseplanQueryRequest;
import com.mypurecloud.sdk.v2.model.CaseplanUpdate;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IntakeSettingsListing;
import com.mypurecloud.sdk.v2.model.IntakeSettingsUpdate;
import com.mypurecloud.sdk.v2.model.ModelCase;
import com.mypurecloud.sdk.v2.model.Stage;
import com.mypurecloud.sdk.v2.model.StageListing;
import com.mypurecloud.sdk.v2.model.Stageplan;
import com.mypurecloud.sdk.v2.model.StageplanListing;
import com.mypurecloud.sdk.v2.model.StageplanUpdate;
import com.mypurecloud.sdk.v2.model.Step;
import com.mypurecloud.sdk.v2.model.StepListing;
import com.mypurecloud.sdk.v2.model.Stepplan;
import com.mypurecloud.sdk.v2.model.StepplanListing;
import com.mypurecloud.sdk.v2.model.StepplanUpdate;
import com.mypurecloud.sdk.v2.model.TerminateJob;


import com.mypurecloud.sdk.v2.api.request.DeleteCasemanagementCaseRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteCasemanagementCaseplanRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteCasemanagementCaseplanDataschemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseAssociationRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseAssociationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseStageRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseStageStepRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseStageStepsRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseStagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseTerminateJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseplanVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseplanVersionDataschemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseplanVersionIntakesettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseplanVersionStageplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseplanVersionStageplanStepplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseplanVersionStageplanStepplansRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseplanVersionStageplansRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCaseplansRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCasesExternalcontactRequest;
import com.mypurecloud.sdk.v2.api.request.GetCasemanagementCasesReferenceRequest;
import com.mypurecloud.sdk.v2.api.request.PatchCasemanagementCaseDatedueRequest;
import com.mypurecloud.sdk.v2.api.request.PatchCasemanagementCasePriorityRequest;
import com.mypurecloud.sdk.v2.api.request.PatchCasemanagementCaseSummaryRequest;
import com.mypurecloud.sdk.v2.api.request.PatchCasemanagementCaseplanRequest;
import com.mypurecloud.sdk.v2.api.request.PatchCasemanagementCaseplanStageplanRequest;
import com.mypurecloud.sdk.v2.api.request.PatchCasemanagementCaseplanStageplanStepplanRequest;
import com.mypurecloud.sdk.v2.api.request.PostCasemanagementCaseAssociationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostCasemanagementCaseTerminateJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostCasemanagementCaseplanDataschemasRequest;
import com.mypurecloud.sdk.v2.api.request.PostCasemanagementCaseplanPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostCasemanagementCaseplanVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostCasemanagementCaseplansRequest;
import com.mypurecloud.sdk.v2.api.request.PostCasemanagementCaseplansQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostCasemanagementCasesRequest;
import com.mypurecloud.sdk.v2.api.request.PostCasemanagementCasesAssociationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutCasemanagementCaseplanDataschemaRequest;
import com.mypurecloud.sdk.v2.api.request.PutCasemanagementCaseplanIntakesettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CaseManagementApi {
  private final ApiClient pcapiClient;

  public CaseManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CaseManagementApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a Case.
   * 
   * @param caseId Case identifier. (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteCasemanagementCase(String caseId) throws IOException, ApiException {
    return  deleteCasemanagementCase(createDeleteCasemanagementCaseRequest(caseId));
  }

  /**
   * Delete a Case.
   * 
   * @param caseId Case identifier. (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteCasemanagementCaseWithHttpInfo(String caseId) throws IOException {
    return deleteCasemanagementCase(createDeleteCasemanagementCaseRequest(caseId).withHttpInfo());
  }

  private DeleteCasemanagementCaseRequest createDeleteCasemanagementCaseRequest(String caseId) {
    return DeleteCasemanagementCaseRequest.builder()
            .withCaseId(caseId)

            .build();
  }

  /**
   * Delete a Case.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteCasemanagementCase(DeleteCasemanagementCaseRequest request) throws IOException, ApiException {
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
   * Delete a Case.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteCasemanagementCase(ApiRequest<Void> request) throws IOException {
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
   * Delete a Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteCasemanagementCaseplan(String caseplanId) throws IOException, ApiException {
    return  deleteCasemanagementCaseplan(createDeleteCasemanagementCaseplanRequest(caseplanId));
  }

  /**
   * Delete a Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteCasemanagementCaseplanWithHttpInfo(String caseplanId) throws IOException {
    return deleteCasemanagementCaseplan(createDeleteCasemanagementCaseplanRequest(caseplanId).withHttpInfo());
  }

  private DeleteCasemanagementCaseplanRequest createDeleteCasemanagementCaseplanRequest(String caseplanId) {
    return DeleteCasemanagementCaseplanRequest.builder()
            .withCaseplanId(caseplanId)

            .build();
  }

  /**
   * Delete a Caseplan.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteCasemanagementCaseplan(DeleteCasemanagementCaseplanRequest request) throws IOException, ApiException {
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
   * Delete a Caseplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteCasemanagementCaseplan(ApiRequest<Void> request) throws IOException {
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
   * Remove a data schema from a draft Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param schemaKeyName Schema key (for example \"default\"). (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteCasemanagementCaseplanDataschema(String caseplanId, String schemaKeyName) throws IOException, ApiException {
    return  deleteCasemanagementCaseplanDataschema(createDeleteCasemanagementCaseplanDataschemaRequest(caseplanId, schemaKeyName));
  }

  /**
   * Remove a data schema from a draft Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param schemaKeyName Schema key (for example \"default\"). (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteCasemanagementCaseplanDataschemaWithHttpInfo(String caseplanId, String schemaKeyName) throws IOException {
    return deleteCasemanagementCaseplanDataschema(createDeleteCasemanagementCaseplanDataschemaRequest(caseplanId, schemaKeyName).withHttpInfo());
  }

  private DeleteCasemanagementCaseplanDataschemaRequest createDeleteCasemanagementCaseplanDataschemaRequest(String caseplanId, String schemaKeyName) {
    return DeleteCasemanagementCaseplanDataschemaRequest.builder()
            .withCaseplanId(caseplanId)

            .withSchemaKeyName(schemaKeyName)

            .build();
  }

  /**
   * Remove a data schema from a draft Caseplan.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteCasemanagementCaseplanDataschema(DeleteCasemanagementCaseplanDataschemaRequest request) throws IOException, ApiException {
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
   * Remove a data schema from a draft Caseplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteCasemanagementCaseplanDataschema(ApiRequest<Void> request) throws IOException {
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
   * Get a Case.
   * 
   * @param caseId Case identifier. (required)
   * @param expands Fields to expand. (optional)
   * @return ModelCase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelCase getCasemanagementCase(String caseId, String expands) throws IOException, ApiException {
    return  getCasemanagementCase(createGetCasemanagementCaseRequest(caseId, expands));
  }

  /**
   * Get a Case.
   * 
   * @param caseId Case identifier. (required)
   * @param expands Fields to expand. (optional)
   * @return ModelCase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelCase> getCasemanagementCaseWithHttpInfo(String caseId, String expands) throws IOException {
    return getCasemanagementCase(createGetCasemanagementCaseRequest(caseId, expands).withHttpInfo());
  }

  private GetCasemanagementCaseRequest createGetCasemanagementCaseRequest(String caseId, String expands) {
    return GetCasemanagementCaseRequest.builder()
            .withCaseId(caseId)

            .withExpands(expands)

            .build();
  }

  /**
   * Get a Case.
   * 
   * @param request The request object
   * @return ModelCase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelCase getCasemanagementCase(GetCasemanagementCaseRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ModelCase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ModelCase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Case.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelCase> getCasemanagementCase(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ModelCase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ModelCase> response = (ApiResponse<ModelCase>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ModelCase> response = (ApiResponse<ModelCase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Case Association.
   * 
   * @param caseId Case identifier. (required)
   * @param associationId Case association identifier. (required)
   * @return CaseAssociation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseAssociation getCasemanagementCaseAssociation(String caseId, String associationId) throws IOException, ApiException {
    return  getCasemanagementCaseAssociation(createGetCasemanagementCaseAssociationRequest(caseId, associationId));
  }

  /**
   * Get a Case Association.
   * 
   * @param caseId Case identifier. (required)
   * @param associationId Case association identifier. (required)
   * @return CaseAssociation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseAssociation> getCasemanagementCaseAssociationWithHttpInfo(String caseId, String associationId) throws IOException {
    return getCasemanagementCaseAssociation(createGetCasemanagementCaseAssociationRequest(caseId, associationId).withHttpInfo());
  }

  private GetCasemanagementCaseAssociationRequest createGetCasemanagementCaseAssociationRequest(String caseId, String associationId) {
    return GetCasemanagementCaseAssociationRequest.builder()
            .withCaseId(caseId)

            .withAssociationId(associationId)

            .build();
  }

  /**
   * Get a Case Association.
   * 
   * @param request The request object
   * @return CaseAssociation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseAssociation getCasemanagementCaseAssociation(GetCasemanagementCaseAssociationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CaseAssociation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CaseAssociation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Case Association.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseAssociation> getCasemanagementCaseAssociation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CaseAssociation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CaseAssociation> response = (ApiResponse<CaseAssociation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CaseAssociation> response = (ApiResponse<CaseAssociation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Case associations for the Case.
   * 
   * @param caseId Case identifier. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return CaseAssociationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseAssociationListing getCasemanagementCaseAssociations(String caseId, String before, String after, String pageSize) throws IOException, ApiException {
    return  getCasemanagementCaseAssociations(createGetCasemanagementCaseAssociationsRequest(caseId, before, after, pageSize));
  }

  /**
   * Get a list of Case associations for the Case.
   * 
   * @param caseId Case identifier. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return CaseAssociationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseAssociationListing> getCasemanagementCaseAssociationsWithHttpInfo(String caseId, String before, String after, String pageSize) throws IOException {
    return getCasemanagementCaseAssociations(createGetCasemanagementCaseAssociationsRequest(caseId, before, after, pageSize).withHttpInfo());
  }

  private GetCasemanagementCaseAssociationsRequest createGetCasemanagementCaseAssociationsRequest(String caseId, String before, String after, String pageSize) {
    return GetCasemanagementCaseAssociationsRequest.builder()
            .withCaseId(caseId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get a list of Case associations for the Case.
   * 
   * @param request The request object
   * @return CaseAssociationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseAssociationListing getCasemanagementCaseAssociations(GetCasemanagementCaseAssociationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CaseAssociationListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CaseAssociationListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Case associations for the Case.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseAssociationListing> getCasemanagementCaseAssociations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CaseAssociationListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CaseAssociationListing> response = (ApiResponse<CaseAssociationListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CaseAssociationListing> response = (ApiResponse<CaseAssociationListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Stage.
   * 
   * @param caseId Case identifier. (required)
   * @param stageId Stage identifier. (required)
   * @return Stage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Stage getCasemanagementCaseStage(String caseId, String stageId) throws IOException, ApiException {
    return  getCasemanagementCaseStage(createGetCasemanagementCaseStageRequest(caseId, stageId));
  }

  /**
   * Get a Stage.
   * 
   * @param caseId Case identifier. (required)
   * @param stageId Stage identifier. (required)
   * @return Stage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Stage> getCasemanagementCaseStageWithHttpInfo(String caseId, String stageId) throws IOException {
    return getCasemanagementCaseStage(createGetCasemanagementCaseStageRequest(caseId, stageId).withHttpInfo());
  }

  private GetCasemanagementCaseStageRequest createGetCasemanagementCaseStageRequest(String caseId, String stageId) {
    return GetCasemanagementCaseStageRequest.builder()
            .withCaseId(caseId)

            .withStageId(stageId)

            .build();
  }

  /**
   * Get a Stage.
   * 
   * @param request The request object
   * @return Stage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Stage getCasemanagementCaseStage(GetCasemanagementCaseStageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Stage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Stage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Stage.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Stage> getCasemanagementCaseStage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Stage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Stage> response = (ApiResponse<Stage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Stage> response = (ApiResponse<Stage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Step.
   * 
   * @param caseId Case identifier. (required)
   * @param stageId Stage identifier. (required)
   * @param stepId Step identifier. (required)
   * @return Step
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Step getCasemanagementCaseStageStep(String caseId, String stageId, String stepId) throws IOException, ApiException {
    return  getCasemanagementCaseStageStep(createGetCasemanagementCaseStageStepRequest(caseId, stageId, stepId));
  }

  /**
   * Get a Step.
   * 
   * @param caseId Case identifier. (required)
   * @param stageId Stage identifier. (required)
   * @param stepId Step identifier. (required)
   * @return Step
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Step> getCasemanagementCaseStageStepWithHttpInfo(String caseId, String stageId, String stepId) throws IOException {
    return getCasemanagementCaseStageStep(createGetCasemanagementCaseStageStepRequest(caseId, stageId, stepId).withHttpInfo());
  }

  private GetCasemanagementCaseStageStepRequest createGetCasemanagementCaseStageStepRequest(String caseId, String stageId, String stepId) {
    return GetCasemanagementCaseStageStepRequest.builder()
            .withCaseId(caseId)

            .withStageId(stageId)

            .withStepId(stepId)

            .build();
  }

  /**
   * Get a Step.
   * 
   * @param request The request object
   * @return Step
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Step getCasemanagementCaseStageStep(GetCasemanagementCaseStageStepRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Step> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Step>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Step.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Step> getCasemanagementCaseStageStep(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Step>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Step> response = (ApiResponse<Step>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Step> response = (ApiResponse<Step>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Steps.
   * 
   * @param caseId Case identifier. (required)
   * @param stageId Stage identifier. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return StepListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StepListing getCasemanagementCaseStageSteps(String caseId, String stageId, String before, String after, String pageSize) throws IOException, ApiException {
    return  getCasemanagementCaseStageSteps(createGetCasemanagementCaseStageStepsRequest(caseId, stageId, before, after, pageSize));
  }

  /**
   * Get a list of Steps.
   * 
   * @param caseId Case identifier. (required)
   * @param stageId Stage identifier. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return StepListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StepListing> getCasemanagementCaseStageStepsWithHttpInfo(String caseId, String stageId, String before, String after, String pageSize) throws IOException {
    return getCasemanagementCaseStageSteps(createGetCasemanagementCaseStageStepsRequest(caseId, stageId, before, after, pageSize).withHttpInfo());
  }

  private GetCasemanagementCaseStageStepsRequest createGetCasemanagementCaseStageStepsRequest(String caseId, String stageId, String before, String after, String pageSize) {
    return GetCasemanagementCaseStageStepsRequest.builder()
            .withCaseId(caseId)

            .withStageId(stageId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get a list of Steps.
   * 
   * @param request The request object
   * @return StepListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StepListing getCasemanagementCaseStageSteps(GetCasemanagementCaseStageStepsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StepListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StepListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Steps.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StepListing> getCasemanagementCaseStageSteps(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StepListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StepListing> response = (ApiResponse<StepListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<StepListing> response = (ApiResponse<StepListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Stages.
   * 
   * @param caseId Case identifier. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return StageListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StageListing getCasemanagementCaseStages(String caseId, String before, String after, String pageSize) throws IOException, ApiException {
    return  getCasemanagementCaseStages(createGetCasemanagementCaseStagesRequest(caseId, before, after, pageSize));
  }

  /**
   * Get a list of Stages.
   * 
   * @param caseId Case identifier. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return StageListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StageListing> getCasemanagementCaseStagesWithHttpInfo(String caseId, String before, String after, String pageSize) throws IOException {
    return getCasemanagementCaseStages(createGetCasemanagementCaseStagesRequest(caseId, before, after, pageSize).withHttpInfo());
  }

  private GetCasemanagementCaseStagesRequest createGetCasemanagementCaseStagesRequest(String caseId, String before, String after, String pageSize) {
    return GetCasemanagementCaseStagesRequest.builder()
            .withCaseId(caseId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get a list of Stages.
   * 
   * @param request The request object
   * @return StageListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StageListing getCasemanagementCaseStages(GetCasemanagementCaseStagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StageListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StageListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Stages.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StageListing> getCasemanagementCaseStages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StageListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StageListing> response = (ApiResponse<StageListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<StageListing> response = (ApiResponse<StageListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Terminate Job for a Case.
   * 
   * @param caseId Case identifier. (required)
   * @param jobId Terminate Job identifier. (required)
   * @return TerminateJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TerminateJob getCasemanagementCaseTerminateJob(String caseId, String jobId) throws IOException, ApiException {
    return  getCasemanagementCaseTerminateJob(createGetCasemanagementCaseTerminateJobRequest(caseId, jobId));
  }

  /**
   * Get a Terminate Job for a Case.
   * 
   * @param caseId Case identifier. (required)
   * @param jobId Terminate Job identifier. (required)
   * @return TerminateJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TerminateJob> getCasemanagementCaseTerminateJobWithHttpInfo(String caseId, String jobId) throws IOException {
    return getCasemanagementCaseTerminateJob(createGetCasemanagementCaseTerminateJobRequest(caseId, jobId).withHttpInfo());
  }

  private GetCasemanagementCaseTerminateJobRequest createGetCasemanagementCaseTerminateJobRequest(String caseId, String jobId) {
    return GetCasemanagementCaseTerminateJobRequest.builder()
            .withCaseId(caseId)

            .withJobId(jobId)

            .build();
  }

  /**
   * Get a Terminate Job for a Case.
   * 
   * @param request The request object
   * @return TerminateJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TerminateJob getCasemanagementCaseTerminateJob(GetCasemanagementCaseTerminateJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TerminateJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TerminateJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Terminate Job for a Case.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TerminateJob> getCasemanagementCaseTerminateJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TerminateJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TerminateJob> response = (ApiResponse<TerminateJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TerminateJob> response = (ApiResponse<TerminateJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @return Caseplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Caseplan getCasemanagementCaseplan(String caseplanId) throws IOException, ApiException {
    return  getCasemanagementCaseplan(createGetCasemanagementCaseplanRequest(caseplanId));
  }

  /**
   * Get a Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @return Caseplan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Caseplan> getCasemanagementCaseplanWithHttpInfo(String caseplanId) throws IOException {
    return getCasemanagementCaseplan(createGetCasemanagementCaseplanRequest(caseplanId).withHttpInfo());
  }

  private GetCasemanagementCaseplanRequest createGetCasemanagementCaseplanRequest(String caseplanId) {
    return GetCasemanagementCaseplanRequest.builder()
            .withCaseplanId(caseplanId)

            .build();
  }

  /**
   * Get a Caseplan.
   * 
   * @param request The request object
   * @return Caseplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Caseplan getCasemanagementCaseplan(GetCasemanagementCaseplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Caseplan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Caseplan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Caseplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Caseplan> getCasemanagementCaseplan(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Caseplan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Caseplan> response = (ApiResponse<Caseplan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Caseplan> response = (ApiResponse<Caseplan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Caseplan version.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @return Caseplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Caseplan getCasemanagementCaseplanVersion(String caseplanId, String versionId) throws IOException, ApiException {
    return  getCasemanagementCaseplanVersion(createGetCasemanagementCaseplanVersionRequest(caseplanId, versionId));
  }

  /**
   * Get a Caseplan version.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @return Caseplan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Caseplan> getCasemanagementCaseplanVersionWithHttpInfo(String caseplanId, String versionId) throws IOException {
    return getCasemanagementCaseplanVersion(createGetCasemanagementCaseplanVersionRequest(caseplanId, versionId).withHttpInfo());
  }

  private GetCasemanagementCaseplanVersionRequest createGetCasemanagementCaseplanVersionRequest(String caseplanId, String versionId) {
    return GetCasemanagementCaseplanVersionRequest.builder()
            .withCaseplanId(caseplanId)

            .withVersionId(versionId)

            .build();
  }

  /**
   * Get a Caseplan version.
   * 
   * @param request The request object
   * @return Caseplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Caseplan getCasemanagementCaseplanVersion(GetCasemanagementCaseplanVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Caseplan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Caseplan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Caseplan version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Caseplan> getCasemanagementCaseplanVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Caseplan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Caseplan> response = (ApiResponse<Caseplan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Caseplan> response = (ApiResponse<Caseplan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the data schemas for a Caseplan version.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @return CaseplanDataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseplanDataSchemaListing getCasemanagementCaseplanVersionDataschemas(String caseplanId, String versionId) throws IOException, ApiException {
    return  getCasemanagementCaseplanVersionDataschemas(createGetCasemanagementCaseplanVersionDataschemasRequest(caseplanId, versionId));
  }

  /**
   * Get the data schemas for a Caseplan version.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @return CaseplanDataSchemaListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseplanDataSchemaListing> getCasemanagementCaseplanVersionDataschemasWithHttpInfo(String caseplanId, String versionId) throws IOException {
    return getCasemanagementCaseplanVersionDataschemas(createGetCasemanagementCaseplanVersionDataschemasRequest(caseplanId, versionId).withHttpInfo());
  }

  private GetCasemanagementCaseplanVersionDataschemasRequest createGetCasemanagementCaseplanVersionDataschemasRequest(String caseplanId, String versionId) {
    return GetCasemanagementCaseplanVersionDataschemasRequest.builder()
            .withCaseplanId(caseplanId)

            .withVersionId(versionId)

            .build();
  }

  /**
   * Get the data schemas for a Caseplan version.
   * 
   * @param request The request object
   * @return CaseplanDataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseplanDataSchemaListing getCasemanagementCaseplanVersionDataschemas(GetCasemanagementCaseplanVersionDataschemasRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CaseplanDataSchemaListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CaseplanDataSchemaListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the data schemas for a Caseplan version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseplanDataSchemaListing> getCasemanagementCaseplanVersionDataschemas(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CaseplanDataSchemaListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CaseplanDataSchemaListing> response = (ApiResponse<CaseplanDataSchemaListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CaseplanDataSchemaListing> response = (ApiResponse<CaseplanDataSchemaListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the intake settings for a Caseplan version.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @return IntakeSettingsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntakeSettingsListing getCasemanagementCaseplanVersionIntakesettings(String caseplanId, String versionId) throws IOException, ApiException {
    return  getCasemanagementCaseplanVersionIntakesettings(createGetCasemanagementCaseplanVersionIntakesettingsRequest(caseplanId, versionId));
  }

  /**
   * Get the intake settings for a Caseplan version.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @return IntakeSettingsListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntakeSettingsListing> getCasemanagementCaseplanVersionIntakesettingsWithHttpInfo(String caseplanId, String versionId) throws IOException {
    return getCasemanagementCaseplanVersionIntakesettings(createGetCasemanagementCaseplanVersionIntakesettingsRequest(caseplanId, versionId).withHttpInfo());
  }

  private GetCasemanagementCaseplanVersionIntakesettingsRequest createGetCasemanagementCaseplanVersionIntakesettingsRequest(String caseplanId, String versionId) {
    return GetCasemanagementCaseplanVersionIntakesettingsRequest.builder()
            .withCaseplanId(caseplanId)

            .withVersionId(versionId)

            .build();
  }

  /**
   * Get the intake settings for a Caseplan version.
   * 
   * @param request The request object
   * @return IntakeSettingsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntakeSettingsListing getCasemanagementCaseplanVersionIntakesettings(GetCasemanagementCaseplanVersionIntakesettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntakeSettingsListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntakeSettingsListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the intake settings for a Caseplan version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntakeSettingsListing> getCasemanagementCaseplanVersionIntakesettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntakeSettingsListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntakeSettingsListing> response = (ApiResponse<IntakeSettingsListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IntakeSettingsListing> response = (ApiResponse<IntakeSettingsListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Stageplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @param stageplanId Stageplan identifier. (required)
   * @param expands Fields to expand. (optional)
   * @return Stageplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Stageplan getCasemanagementCaseplanVersionStageplan(String caseplanId, String versionId, String stageplanId, List<String> expands) throws IOException, ApiException {
    return  getCasemanagementCaseplanVersionStageplan(createGetCasemanagementCaseplanVersionStageplanRequest(caseplanId, versionId, stageplanId, expands));
  }

  /**
   * Get a Stageplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @param stageplanId Stageplan identifier. (required)
   * @param expands Fields to expand. (optional)
   * @return Stageplan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Stageplan> getCasemanagementCaseplanVersionStageplanWithHttpInfo(String caseplanId, String versionId, String stageplanId, List<String> expands) throws IOException {
    return getCasemanagementCaseplanVersionStageplan(createGetCasemanagementCaseplanVersionStageplanRequest(caseplanId, versionId, stageplanId, expands).withHttpInfo());
  }

  private GetCasemanagementCaseplanVersionStageplanRequest createGetCasemanagementCaseplanVersionStageplanRequest(String caseplanId, String versionId, String stageplanId, List<String> expands) {
    return GetCasemanagementCaseplanVersionStageplanRequest.builder()
            .withCaseplanId(caseplanId)

            .withVersionId(versionId)

            .withStageplanId(stageplanId)

            .withExpands(expands)

            .build();
  }

  /**
   * Get a Stageplan.
   * 
   * @param request The request object
   * @return Stageplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Stageplan getCasemanagementCaseplanVersionStageplan(GetCasemanagementCaseplanVersionStageplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Stageplan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Stageplan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Stageplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Stageplan> getCasemanagementCaseplanVersionStageplan(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Stageplan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Stageplan> response = (ApiResponse<Stageplan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Stageplan> response = (ApiResponse<Stageplan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Stepplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @param stageplanId Stageplan identifier. (required)
   * @param stepplanId Stepplan identifier. (required)
   * @param expands Fields to expand. (optional)
   * @return Stepplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Stepplan getCasemanagementCaseplanVersionStageplanStepplan(String caseplanId, String versionId, String stageplanId, String stepplanId, List<String> expands) throws IOException, ApiException {
    return  getCasemanagementCaseplanVersionStageplanStepplan(createGetCasemanagementCaseplanVersionStageplanStepplanRequest(caseplanId, versionId, stageplanId, stepplanId, expands));
  }

  /**
   * Get a Stepplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @param stageplanId Stageplan identifier. (required)
   * @param stepplanId Stepplan identifier. (required)
   * @param expands Fields to expand. (optional)
   * @return Stepplan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Stepplan> getCasemanagementCaseplanVersionStageplanStepplanWithHttpInfo(String caseplanId, String versionId, String stageplanId, String stepplanId, List<String> expands) throws IOException {
    return getCasemanagementCaseplanVersionStageplanStepplan(createGetCasemanagementCaseplanVersionStageplanStepplanRequest(caseplanId, versionId, stageplanId, stepplanId, expands).withHttpInfo());
  }

  private GetCasemanagementCaseplanVersionStageplanStepplanRequest createGetCasemanagementCaseplanVersionStageplanStepplanRequest(String caseplanId, String versionId, String stageplanId, String stepplanId, List<String> expands) {
    return GetCasemanagementCaseplanVersionStageplanStepplanRequest.builder()
            .withCaseplanId(caseplanId)

            .withVersionId(versionId)

            .withStageplanId(stageplanId)

            .withStepplanId(stepplanId)

            .withExpands(expands)

            .build();
  }

  /**
   * Get a Stepplan.
   * 
   * @param request The request object
   * @return Stepplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Stepplan getCasemanagementCaseplanVersionStageplanStepplan(GetCasemanagementCaseplanVersionStageplanStepplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Stepplan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Stepplan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Stepplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Stepplan> getCasemanagementCaseplanVersionStageplanStepplan(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Stepplan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Stepplan> response = (ApiResponse<Stepplan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Stepplan> response = (ApiResponse<Stepplan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Stepplans.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @param stageplanId Stageplan identifier. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param expands Fields to expand. (optional)
   * @return StepplanListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StepplanListing getCasemanagementCaseplanVersionStageplanStepplans(String caseplanId, String versionId, String stageplanId, String before, String after, String pageSize, List<String> expands) throws IOException, ApiException {
    return  getCasemanagementCaseplanVersionStageplanStepplans(createGetCasemanagementCaseplanVersionStageplanStepplansRequest(caseplanId, versionId, stageplanId, before, after, pageSize, expands));
  }

  /**
   * Get a list of Stepplans.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @param stageplanId Stageplan identifier. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param expands Fields to expand. (optional)
   * @return StepplanListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StepplanListing> getCasemanagementCaseplanVersionStageplanStepplansWithHttpInfo(String caseplanId, String versionId, String stageplanId, String before, String after, String pageSize, List<String> expands) throws IOException {
    return getCasemanagementCaseplanVersionStageplanStepplans(createGetCasemanagementCaseplanVersionStageplanStepplansRequest(caseplanId, versionId, stageplanId, before, after, pageSize, expands).withHttpInfo());
  }

  private GetCasemanagementCaseplanVersionStageplanStepplansRequest createGetCasemanagementCaseplanVersionStageplanStepplansRequest(String caseplanId, String versionId, String stageplanId, String before, String after, String pageSize, List<String> expands) {
    return GetCasemanagementCaseplanVersionStageplanStepplansRequest.builder()
            .withCaseplanId(caseplanId)

            .withVersionId(versionId)

            .withStageplanId(stageplanId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withExpands(expands)

            .build();
  }

  /**
   * Get a list of Stepplans.
   * 
   * @param request The request object
   * @return StepplanListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StepplanListing getCasemanagementCaseplanVersionStageplanStepplans(GetCasemanagementCaseplanVersionStageplanStepplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StepplanListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StepplanListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Stepplans.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StepplanListing> getCasemanagementCaseplanVersionStageplanStepplans(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StepplanListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StepplanListing> response = (ApiResponse<StepplanListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<StepplanListing> response = (ApiResponse<StepplanListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Stageplans.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param expands Fields to expand. (optional)
   * @return StageplanListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StageplanListing getCasemanagementCaseplanVersionStageplans(String caseplanId, String versionId, String before, String after, String pageSize, List<String> expands) throws IOException, ApiException {
    return  getCasemanagementCaseplanVersionStageplans(createGetCasemanagementCaseplanVersionStageplansRequest(caseplanId, versionId, before, after, pageSize, expands));
  }

  /**
   * Get a list of Stageplans.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param versionId Caseplan version identifier. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param expands Fields to expand. (optional)
   * @return StageplanListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StageplanListing> getCasemanagementCaseplanVersionStageplansWithHttpInfo(String caseplanId, String versionId, String before, String after, String pageSize, List<String> expands) throws IOException {
    return getCasemanagementCaseplanVersionStageplans(createGetCasemanagementCaseplanVersionStageplansRequest(caseplanId, versionId, before, after, pageSize, expands).withHttpInfo());
  }

  private GetCasemanagementCaseplanVersionStageplansRequest createGetCasemanagementCaseplanVersionStageplansRequest(String caseplanId, String versionId, String before, String after, String pageSize, List<String> expands) {
    return GetCasemanagementCaseplanVersionStageplansRequest.builder()
            .withCaseplanId(caseplanId)

            .withVersionId(versionId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withExpands(expands)

            .build();
  }

  /**
   * Get a list of Stageplans.
   * 
   * @param request The request object
   * @return StageplanListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StageplanListing getCasemanagementCaseplanVersionStageplans(GetCasemanagementCaseplanVersionStageplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StageplanListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StageplanListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Stageplans.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StageplanListing> getCasemanagementCaseplanVersionStageplans(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StageplanListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StageplanListing> response = (ApiResponse<StageplanListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<StageplanListing> response = (ApiResponse<StageplanListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Caseplans.
   * 
   * @param after Cursor that points to the end of the previously returned set of Caseplans. (optional)
   * @param pageSize Number of Caseplans to return. Maximum is 200. (optional)
   * @param customerIntentId Filter by customer intent. (optional)
   * @param divisionIds Filter by divisions. (optional)
   * @return CaseplanListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseplanListing getCasemanagementCaseplans(String after, Integer pageSize, String customerIntentId, String divisionIds) throws IOException, ApiException {
    return  getCasemanagementCaseplans(createGetCasemanagementCaseplansRequest(after, pageSize, customerIntentId, divisionIds));
  }

  /**
   * Get a list of Caseplans.
   * 
   * @param after Cursor that points to the end of the previously returned set of Caseplans. (optional)
   * @param pageSize Number of Caseplans to return. Maximum is 200. (optional)
   * @param customerIntentId Filter by customer intent. (optional)
   * @param divisionIds Filter by divisions. (optional)
   * @return CaseplanListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseplanListing> getCasemanagementCaseplansWithHttpInfo(String after, Integer pageSize, String customerIntentId, String divisionIds) throws IOException {
    return getCasemanagementCaseplans(createGetCasemanagementCaseplansRequest(after, pageSize, customerIntentId, divisionIds).withHttpInfo());
  }

  private GetCasemanagementCaseplansRequest createGetCasemanagementCaseplansRequest(String after, Integer pageSize, String customerIntentId, String divisionIds) {
    return GetCasemanagementCaseplansRequest.builder()
            .withAfter(after)

            .withPageSize(pageSize)

            .withCustomerIntentId(customerIntentId)

            .withDivisionIds(divisionIds)

            .build();
  }

  /**
   * Get a list of Caseplans.
   * 
   * @param request The request object
   * @return CaseplanListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseplanListing getCasemanagementCaseplans(GetCasemanagementCaseplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CaseplanListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CaseplanListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Caseplans.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseplanListing> getCasemanagementCaseplans(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CaseplanListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CaseplanListing> response = (ApiResponse<CaseplanListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CaseplanListing> response = (ApiResponse<CaseplanListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Cases for an External Contact.
   * 
   * @param externalContactId External contact identifier. (required)
   * @param after Cursor pointing to the end of the previously returned page of Cases. (optional)
   * @param pageSize Number of Cases to return (maximum 200). (optional)
   * @param divisionIds Filter by divisions. (optional)
   * @param expands Fields to expand. (optional)
   * @return CaseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseListing getCasemanagementCasesExternalcontact(String externalContactId, String after, Integer pageSize, String divisionIds, List<String> expands) throws IOException, ApiException {
    return  getCasemanagementCasesExternalcontact(createGetCasemanagementCasesExternalcontactRequest(externalContactId, after, pageSize, divisionIds, expands));
  }

  /**
   * Get a list of Cases for an External Contact.
   * 
   * @param externalContactId External contact identifier. (required)
   * @param after Cursor pointing to the end of the previously returned page of Cases. (optional)
   * @param pageSize Number of Cases to return (maximum 200). (optional)
   * @param divisionIds Filter by divisions. (optional)
   * @param expands Fields to expand. (optional)
   * @return CaseListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseListing> getCasemanagementCasesExternalcontactWithHttpInfo(String externalContactId, String after, Integer pageSize, String divisionIds, List<String> expands) throws IOException {
    return getCasemanagementCasesExternalcontact(createGetCasemanagementCasesExternalcontactRequest(externalContactId, after, pageSize, divisionIds, expands).withHttpInfo());
  }

  private GetCasemanagementCasesExternalcontactRequest createGetCasemanagementCasesExternalcontactRequest(String externalContactId, String after, Integer pageSize, String divisionIds, List<String> expands) {
    return GetCasemanagementCasesExternalcontactRequest.builder()
            .withExternalContactId(externalContactId)

            .withAfter(after)

            .withPageSize(pageSize)

            .withDivisionIds(divisionIds)

            .withExpands(expands)

            .build();
  }

  /**
   * Get a list of Cases for an External Contact.
   * 
   * @param request The request object
   * @return CaseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseListing getCasemanagementCasesExternalcontact(GetCasemanagementCasesExternalcontactRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CaseListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CaseListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Cases for an External Contact.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseListing> getCasemanagementCasesExternalcontact(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CaseListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CaseListing> response = (ApiResponse<CaseListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CaseListing> response = (ApiResponse<CaseListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Case by reference.
   * 
   * @param referenceId Case reference. (required)
   * @param expands Fields to expand. (optional)
   * @return ModelCase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelCase getCasemanagementCasesReference(String referenceId, String expands) throws IOException, ApiException {
    return  getCasemanagementCasesReference(createGetCasemanagementCasesReferenceRequest(referenceId, expands));
  }

  /**
   * Get a Case by reference.
   * 
   * @param referenceId Case reference. (required)
   * @param expands Fields to expand. (optional)
   * @return ModelCase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelCase> getCasemanagementCasesReferenceWithHttpInfo(String referenceId, String expands) throws IOException {
    return getCasemanagementCasesReference(createGetCasemanagementCasesReferenceRequest(referenceId, expands).withHttpInfo());
  }

  private GetCasemanagementCasesReferenceRequest createGetCasemanagementCasesReferenceRequest(String referenceId, String expands) {
    return GetCasemanagementCasesReferenceRequest.builder()
            .withReferenceId(referenceId)

            .withExpands(expands)

            .build();
  }

  /**
   * Get a Case by reference.
   * 
   * @param request The request object
   * @return ModelCase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelCase getCasemanagementCasesReference(GetCasemanagementCasesReferenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ModelCase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ModelCase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Case by reference.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelCase> getCasemanagementCasesReference(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ModelCase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ModelCase> response = (ApiResponse<ModelCase>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ModelCase> response = (ApiResponse<ModelCase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the due date of a Case.
   * 
   * @param caseId Case identifier. (required)
   * @param body Due date update. (required)
   * @return ModelCase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelCase patchCasemanagementCaseDatedue(String caseId, CaseDateDueUpdate body) throws IOException, ApiException {
    return  patchCasemanagementCaseDatedue(createPatchCasemanagementCaseDatedueRequest(caseId, body));
  }

  /**
   * Update the due date of a Case.
   * 
   * @param caseId Case identifier. (required)
   * @param body Due date update. (required)
   * @return ModelCase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelCase> patchCasemanagementCaseDatedueWithHttpInfo(String caseId, CaseDateDueUpdate body) throws IOException {
    return patchCasemanagementCaseDatedue(createPatchCasemanagementCaseDatedueRequest(caseId, body).withHttpInfo());
  }

  private PatchCasemanagementCaseDatedueRequest createPatchCasemanagementCaseDatedueRequest(String caseId, CaseDateDueUpdate body) {
    return PatchCasemanagementCaseDatedueRequest.builder()
            .withCaseId(caseId)

            .withBody(body)

            .build();
  }

  /**
   * Update the due date of a Case.
   * 
   * @param request The request object
   * @return ModelCase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelCase patchCasemanagementCaseDatedue(PatchCasemanagementCaseDatedueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ModelCase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ModelCase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the due date of a Case.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelCase> patchCasemanagementCaseDatedue(ApiRequest<CaseDateDueUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ModelCase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ModelCase> response = (ApiResponse<ModelCase>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ModelCase> response = (ApiResponse<ModelCase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update priority of a Case.
   * 
   * @param caseId Case identifier. (required)
   * @param body Priority update. (required)
   * @return ModelCase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelCase patchCasemanagementCasePriority(String caseId, CasePriorityUpdate body) throws IOException, ApiException {
    return  patchCasemanagementCasePriority(createPatchCasemanagementCasePriorityRequest(caseId, body));
  }

  /**
   * Update priority of a Case.
   * 
   * @param caseId Case identifier. (required)
   * @param body Priority update. (required)
   * @return ModelCase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelCase> patchCasemanagementCasePriorityWithHttpInfo(String caseId, CasePriorityUpdate body) throws IOException {
    return patchCasemanagementCasePriority(createPatchCasemanagementCasePriorityRequest(caseId, body).withHttpInfo());
  }

  private PatchCasemanagementCasePriorityRequest createPatchCasemanagementCasePriorityRequest(String caseId, CasePriorityUpdate body) {
    return PatchCasemanagementCasePriorityRequest.builder()
            .withCaseId(caseId)

            .withBody(body)

            .build();
  }

  /**
   * Update priority of a Case.
   * 
   * @param request The request object
   * @return ModelCase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelCase patchCasemanagementCasePriority(PatchCasemanagementCasePriorityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ModelCase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ModelCase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update priority of a Case.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelCase> patchCasemanagementCasePriority(ApiRequest<CasePriorityUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ModelCase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ModelCase> response = (ApiResponse<ModelCase>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ModelCase> response = (ApiResponse<ModelCase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update summary of a Case.
   * 
   * @param caseId Case identifier. (required)
   * @param body Summary update. (required)
   * @return ModelCase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelCase patchCasemanagementCaseSummary(String caseId, CaseSummaryUpdate body) throws IOException, ApiException {
    return  patchCasemanagementCaseSummary(createPatchCasemanagementCaseSummaryRequest(caseId, body));
  }

  /**
   * Update summary of a Case.
   * 
   * @param caseId Case identifier. (required)
   * @param body Summary update. (required)
   * @return ModelCase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelCase> patchCasemanagementCaseSummaryWithHttpInfo(String caseId, CaseSummaryUpdate body) throws IOException {
    return patchCasemanagementCaseSummary(createPatchCasemanagementCaseSummaryRequest(caseId, body).withHttpInfo());
  }

  private PatchCasemanagementCaseSummaryRequest createPatchCasemanagementCaseSummaryRequest(String caseId, CaseSummaryUpdate body) {
    return PatchCasemanagementCaseSummaryRequest.builder()
            .withCaseId(caseId)

            .withBody(body)

            .build();
  }

  /**
   * Update summary of a Case.
   * 
   * @param request The request object
   * @return ModelCase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelCase patchCasemanagementCaseSummary(PatchCasemanagementCaseSummaryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ModelCase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ModelCase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update summary of a Case.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelCase> patchCasemanagementCaseSummary(ApiRequest<CaseSummaryUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ModelCase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ModelCase> response = (ApiResponse<ModelCase>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ModelCase> response = (ApiResponse<ModelCase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the attributes of a Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param body Caseplan update. (required)
   * @return Caseplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Caseplan patchCasemanagementCaseplan(String caseplanId, CaseplanUpdate body) throws IOException, ApiException {
    return  patchCasemanagementCaseplan(createPatchCasemanagementCaseplanRequest(caseplanId, body));
  }

  /**
   * Update the attributes of a Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param body Caseplan update. (required)
   * @return Caseplan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Caseplan> patchCasemanagementCaseplanWithHttpInfo(String caseplanId, CaseplanUpdate body) throws IOException {
    return patchCasemanagementCaseplan(createPatchCasemanagementCaseplanRequest(caseplanId, body).withHttpInfo());
  }

  private PatchCasemanagementCaseplanRequest createPatchCasemanagementCaseplanRequest(String caseplanId, CaseplanUpdate body) {
    return PatchCasemanagementCaseplanRequest.builder()
            .withCaseplanId(caseplanId)

            .withBody(body)

            .build();
  }

  /**
   * Update the attributes of a Caseplan.
   * 
   * @param request The request object
   * @return Caseplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Caseplan patchCasemanagementCaseplan(PatchCasemanagementCaseplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Caseplan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Caseplan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the attributes of a Caseplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Caseplan> patchCasemanagementCaseplan(ApiRequest<CaseplanUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Caseplan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Caseplan> response = (ApiResponse<Caseplan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Caseplan> response = (ApiResponse<Caseplan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the attributes of a Stageplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param stageplanId Stageplan identifier. (required)
   * @param body Stageplan update. (required)
   * @return Stageplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Stageplan patchCasemanagementCaseplanStageplan(String caseplanId, String stageplanId, StageplanUpdate body) throws IOException, ApiException {
    return  patchCasemanagementCaseplanStageplan(createPatchCasemanagementCaseplanStageplanRequest(caseplanId, stageplanId, body));
  }

  /**
   * Update the attributes of a Stageplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param stageplanId Stageplan identifier. (required)
   * @param body Stageplan update. (required)
   * @return Stageplan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Stageplan> patchCasemanagementCaseplanStageplanWithHttpInfo(String caseplanId, String stageplanId, StageplanUpdate body) throws IOException {
    return patchCasemanagementCaseplanStageplan(createPatchCasemanagementCaseplanStageplanRequest(caseplanId, stageplanId, body).withHttpInfo());
  }

  private PatchCasemanagementCaseplanStageplanRequest createPatchCasemanagementCaseplanStageplanRequest(String caseplanId, String stageplanId, StageplanUpdate body) {
    return PatchCasemanagementCaseplanStageplanRequest.builder()
            .withCaseplanId(caseplanId)

            .withStageplanId(stageplanId)

            .withBody(body)

            .build();
  }

  /**
   * Update the attributes of a Stageplan.
   * 
   * @param request The request object
   * @return Stageplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Stageplan patchCasemanagementCaseplanStageplan(PatchCasemanagementCaseplanStageplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Stageplan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Stageplan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the attributes of a Stageplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Stageplan> patchCasemanagementCaseplanStageplan(ApiRequest<StageplanUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Stageplan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Stageplan> response = (ApiResponse<Stageplan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Stageplan> response = (ApiResponse<Stageplan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the attributes of a Stepplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param stageplanId Stageplan identifier. (required)
   * @param stepplanId Stepplan identifier. (required)
   * @param body Stepplan update. (required)
   * @return Stepplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Stepplan patchCasemanagementCaseplanStageplanStepplan(String caseplanId, String stageplanId, String stepplanId, StepplanUpdate body) throws IOException, ApiException {
    return  patchCasemanagementCaseplanStageplanStepplan(createPatchCasemanagementCaseplanStageplanStepplanRequest(caseplanId, stageplanId, stepplanId, body));
  }

  /**
   * Update the attributes of a Stepplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param stageplanId Stageplan identifier. (required)
   * @param stepplanId Stepplan identifier. (required)
   * @param body Stepplan update. (required)
   * @return Stepplan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Stepplan> patchCasemanagementCaseplanStageplanStepplanWithHttpInfo(String caseplanId, String stageplanId, String stepplanId, StepplanUpdate body) throws IOException {
    return patchCasemanagementCaseplanStageplanStepplan(createPatchCasemanagementCaseplanStageplanStepplanRequest(caseplanId, stageplanId, stepplanId, body).withHttpInfo());
  }

  private PatchCasemanagementCaseplanStageplanStepplanRequest createPatchCasemanagementCaseplanStageplanStepplanRequest(String caseplanId, String stageplanId, String stepplanId, StepplanUpdate body) {
    return PatchCasemanagementCaseplanStageplanStepplanRequest.builder()
            .withCaseplanId(caseplanId)

            .withStageplanId(stageplanId)

            .withStepplanId(stepplanId)

            .withBody(body)

            .build();
  }

  /**
   * Update the attributes of a Stepplan.
   * 
   * @param request The request object
   * @return Stepplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Stepplan patchCasemanagementCaseplanStageplanStepplan(PatchCasemanagementCaseplanStageplanStepplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Stepplan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Stepplan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the attributes of a Stepplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Stepplan> patchCasemanagementCaseplanStageplanStepplan(ApiRequest<StepplanUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Stepplan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Stepplan> response = (ApiResponse<Stepplan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Stepplan> response = (ApiResponse<Stepplan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Case association.
   * 
   * @param caseId Case identifier. (required)
   * @param body Case association create request. (required)
   * @return CaseAssociation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseAssociation postCasemanagementCaseAssociations(String caseId, CaseAssociationCreate body) throws IOException, ApiException {
    return  postCasemanagementCaseAssociations(createPostCasemanagementCaseAssociationsRequest(caseId, body));
  }

  /**
   * Create a Case association.
   * 
   * @param caseId Case identifier. (required)
   * @param body Case association create request. (required)
   * @return CaseAssociation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseAssociation> postCasemanagementCaseAssociationsWithHttpInfo(String caseId, CaseAssociationCreate body) throws IOException {
    return postCasemanagementCaseAssociations(createPostCasemanagementCaseAssociationsRequest(caseId, body).withHttpInfo());
  }

  private PostCasemanagementCaseAssociationsRequest createPostCasemanagementCaseAssociationsRequest(String caseId, CaseAssociationCreate body) {
    return PostCasemanagementCaseAssociationsRequest.builder()
            .withCaseId(caseId)

            .withBody(body)

            .build();
  }

  /**
   * Create a Case association.
   * 
   * @param request The request object
   * @return CaseAssociation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseAssociation postCasemanagementCaseAssociations(PostCasemanagementCaseAssociationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CaseAssociation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CaseAssociation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Case association.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseAssociation> postCasemanagementCaseAssociations(ApiRequest<CaseAssociationCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CaseAssociation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CaseAssociation> response = (ApiResponse<CaseAssociation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CaseAssociation> response = (ApiResponse<CaseAssociation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Terminate Job for a Case.
   * 
   * @param caseId Case identifier. (required)
   * @return TerminateJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TerminateJob postCasemanagementCaseTerminateJobs(String caseId) throws IOException, ApiException {
    return  postCasemanagementCaseTerminateJobs(createPostCasemanagementCaseTerminateJobsRequest(caseId));
  }

  /**
   * Create a Terminate Job for a Case.
   * 
   * @param caseId Case identifier. (required)
   * @return TerminateJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TerminateJob> postCasemanagementCaseTerminateJobsWithHttpInfo(String caseId) throws IOException {
    return postCasemanagementCaseTerminateJobs(createPostCasemanagementCaseTerminateJobsRequest(caseId).withHttpInfo());
  }

  private PostCasemanagementCaseTerminateJobsRequest createPostCasemanagementCaseTerminateJobsRequest(String caseId) {
    return PostCasemanagementCaseTerminateJobsRequest.builder()
            .withCaseId(caseId)

            .build();
  }

  /**
   * Create a Terminate Job for a Case.
   * 
   * @param request The request object
   * @return TerminateJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TerminateJob postCasemanagementCaseTerminateJobs(PostCasemanagementCaseTerminateJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TerminateJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TerminateJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Terminate Job for a Case.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TerminateJob> postCasemanagementCaseTerminateJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TerminateJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TerminateJob> response = (ApiResponse<TerminateJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TerminateJob> response = (ApiResponse<TerminateJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add a data schema to a draft Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param body Data schema reference. (required)
   * @return CaseplanDataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseplanDataSchema postCasemanagementCaseplanDataschemas(String caseplanId, CaseplanDataSchemaRequest body) throws IOException, ApiException {
    return  postCasemanagementCaseplanDataschemas(createPostCasemanagementCaseplanDataschemasRequest(caseplanId, body));
  }

  /**
   * Add a data schema to a draft Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param body Data schema reference. (required)
   * @return CaseplanDataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseplanDataSchema> postCasemanagementCaseplanDataschemasWithHttpInfo(String caseplanId, CaseplanDataSchemaRequest body) throws IOException {
    return postCasemanagementCaseplanDataschemas(createPostCasemanagementCaseplanDataschemasRequest(caseplanId, body).withHttpInfo());
  }

  private PostCasemanagementCaseplanDataschemasRequest createPostCasemanagementCaseplanDataschemasRequest(String caseplanId, CaseplanDataSchemaRequest body) {
    return PostCasemanagementCaseplanDataschemasRequest.builder()
            .withCaseplanId(caseplanId)

            .withBody(body)

            .build();
  }

  /**
   * Add a data schema to a draft Caseplan.
   * 
   * @param request The request object
   * @return CaseplanDataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseplanDataSchema postCasemanagementCaseplanDataschemas(PostCasemanagementCaseplanDataschemasRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CaseplanDataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CaseplanDataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a data schema to a draft Caseplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseplanDataSchema> postCasemanagementCaseplanDataschemas(ApiRequest<CaseplanDataSchemaRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CaseplanDataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CaseplanDataSchema> response = (ApiResponse<CaseplanDataSchema>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CaseplanDataSchema> response = (ApiResponse<CaseplanDataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Publish Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @return Caseplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Caseplan postCasemanagementCaseplanPublish(String caseplanId) throws IOException, ApiException {
    return  postCasemanagementCaseplanPublish(createPostCasemanagementCaseplanPublishRequest(caseplanId));
  }

  /**
   * Publish Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @return Caseplan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Caseplan> postCasemanagementCaseplanPublishWithHttpInfo(String caseplanId) throws IOException {
    return postCasemanagementCaseplanPublish(createPostCasemanagementCaseplanPublishRequest(caseplanId).withHttpInfo());
  }

  private PostCasemanagementCaseplanPublishRequest createPostCasemanagementCaseplanPublishRequest(String caseplanId) {
    return PostCasemanagementCaseplanPublishRequest.builder()
            .withCaseplanId(caseplanId)

            .build();
  }

  /**
   * Publish Caseplan.
   * 
   * @param request The request object
   * @return Caseplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Caseplan postCasemanagementCaseplanPublish(PostCasemanagementCaseplanPublishRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Caseplan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Caseplan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish Caseplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Caseplan> postCasemanagementCaseplanPublish(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Caseplan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Caseplan> response = (ApiResponse<Caseplan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Caseplan> response = (ApiResponse<Caseplan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create Caseplan version.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @return Caseplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Caseplan postCasemanagementCaseplanVersions(String caseplanId) throws IOException, ApiException {
    return  postCasemanagementCaseplanVersions(createPostCasemanagementCaseplanVersionsRequest(caseplanId));
  }

  /**
   * Create Caseplan version.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @return Caseplan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Caseplan> postCasemanagementCaseplanVersionsWithHttpInfo(String caseplanId) throws IOException {
    return postCasemanagementCaseplanVersions(createPostCasemanagementCaseplanVersionsRequest(caseplanId).withHttpInfo());
  }

  private PostCasemanagementCaseplanVersionsRequest createPostCasemanagementCaseplanVersionsRequest(String caseplanId) {
    return PostCasemanagementCaseplanVersionsRequest.builder()
            .withCaseplanId(caseplanId)

            .build();
  }

  /**
   * Create Caseplan version.
   * 
   * @param request The request object
   * @return Caseplan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Caseplan postCasemanagementCaseplanVersions(PostCasemanagementCaseplanVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Caseplan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Caseplan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Caseplan version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Caseplan> postCasemanagementCaseplanVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Caseplan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Caseplan> response = (ApiResponse<Caseplan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Caseplan> response = (ApiResponse<Caseplan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Caseplan.
   * 
   * @param body Caseplan create request. (required)
   * @return CaseplanCreateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseplanCreateResponse postCasemanagementCaseplans(CaseplanCreate body) throws IOException, ApiException {
    return  postCasemanagementCaseplans(createPostCasemanagementCaseplansRequest(body));
  }

  /**
   * Create a Caseplan.
   * 
   * @param body Caseplan create request. (required)
   * @return CaseplanCreateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseplanCreateResponse> postCasemanagementCaseplansWithHttpInfo(CaseplanCreate body) throws IOException {
    return postCasemanagementCaseplans(createPostCasemanagementCaseplansRequest(body).withHttpInfo());
  }

  private PostCasemanagementCaseplansRequest createPostCasemanagementCaseplansRequest(CaseplanCreate body) {
    return PostCasemanagementCaseplansRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a Caseplan.
   * 
   * @param request The request object
   * @return CaseplanCreateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseplanCreateResponse postCasemanagementCaseplans(PostCasemanagementCaseplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CaseplanCreateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CaseplanCreateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Caseplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseplanCreateResponse> postCasemanagementCaseplans(ApiRequest<CaseplanCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CaseplanCreateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CaseplanCreateResponse> response = (ApiResponse<CaseplanCreateResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CaseplanCreateResponse> response = (ApiResponse<CaseplanCreateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for Caseplans.
   * This endpoint supports two filtering modes. The recommended approach uses 'filters' (generic filter model) and 'attributes' (field projection). During the migration period, the legacy fields 'name', 'nameSearchType', and 'divisionIds' remain available as an alternative.
   * @param body Caseplan query request. (required)
   * @return CaseplanQueryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseplanQueryEntityListing postCasemanagementCaseplansQuery(CaseplanQueryRequest body) throws IOException, ApiException {
    return  postCasemanagementCaseplansQuery(createPostCasemanagementCaseplansQueryRequest(body));
  }

  /**
   * Query for Caseplans.
   * This endpoint supports two filtering modes. The recommended approach uses 'filters' (generic filter model) and 'attributes' (field projection). During the migration period, the legacy fields 'name', 'nameSearchType', and 'divisionIds' remain available as an alternative.
   * @param body Caseplan query request. (required)
   * @return CaseplanQueryEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseplanQueryEntityListing> postCasemanagementCaseplansQueryWithHttpInfo(CaseplanQueryRequest body) throws IOException {
    return postCasemanagementCaseplansQuery(createPostCasemanagementCaseplansQueryRequest(body).withHttpInfo());
  }

  private PostCasemanagementCaseplansQueryRequest createPostCasemanagementCaseplansQueryRequest(CaseplanQueryRequest body) {
    return PostCasemanagementCaseplansQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for Caseplans.
   * This endpoint supports two filtering modes. The recommended approach uses 'filters' (generic filter model) and 'attributes' (field projection). During the migration period, the legacy fields 'name', 'nameSearchType', and 'divisionIds' remain available as an alternative.
   * @param request The request object
   * @return CaseplanQueryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseplanQueryEntityListing postCasemanagementCaseplansQuery(PostCasemanagementCaseplansQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CaseplanQueryEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CaseplanQueryEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for Caseplans.
   * This endpoint supports two filtering modes. The recommended approach uses 'filters' (generic filter model) and 'attributes' (field projection). During the migration period, the legacy fields 'name', 'nameSearchType', and 'divisionIds' remain available as an alternative.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseplanQueryEntityListing> postCasemanagementCaseplansQuery(ApiRequest<CaseplanQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CaseplanQueryEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CaseplanQueryEntityListing> response = (ApiResponse<CaseplanQueryEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CaseplanQueryEntityListing> response = (ApiResponse<CaseplanQueryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Case.
   * 
   * @param body Case create request. (required)
   * @return ModelCase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelCase postCasemanagementCases(CaseCreate body) throws IOException, ApiException {
    return  postCasemanagementCases(createPostCasemanagementCasesRequest(body));
  }

  /**
   * Create a Case.
   * 
   * @param body Case create request. (required)
   * @return ModelCase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelCase> postCasemanagementCasesWithHttpInfo(CaseCreate body) throws IOException {
    return postCasemanagementCases(createPostCasemanagementCasesRequest(body).withHttpInfo());
  }

  private PostCasemanagementCasesRequest createPostCasemanagementCasesRequest(CaseCreate body) {
    return PostCasemanagementCasesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a Case.
   * 
   * @param request The request object
   * @return ModelCase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelCase postCasemanagementCases(PostCasemanagementCasesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ModelCase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ModelCase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Case.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelCase> postCasemanagementCases(ApiRequest<CaseCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ModelCase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ModelCase> response = (ApiResponse<ModelCase>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ModelCase> response = (ApiResponse<ModelCase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for Case associations by interaction.
   * 
   * @param body Case association query request. (required)
   * @return CaseAssociationQueryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseAssociationQueryEntityListing postCasemanagementCasesAssociationsQuery(CaseAssociationQuery body) throws IOException, ApiException {
    return  postCasemanagementCasesAssociationsQuery(createPostCasemanagementCasesAssociationsQueryRequest(body));
  }

  /**
   * Query for Case associations by interaction.
   * 
   * @param body Case association query request. (required)
   * @return CaseAssociationQueryEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseAssociationQueryEntityListing> postCasemanagementCasesAssociationsQueryWithHttpInfo(CaseAssociationQuery body) throws IOException {
    return postCasemanagementCasesAssociationsQuery(createPostCasemanagementCasesAssociationsQueryRequest(body).withHttpInfo());
  }

  private PostCasemanagementCasesAssociationsQueryRequest createPostCasemanagementCasesAssociationsQueryRequest(CaseAssociationQuery body) {
    return PostCasemanagementCasesAssociationsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for Case associations by interaction.
   * 
   * @param request The request object
   * @return CaseAssociationQueryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseAssociationQueryEntityListing postCasemanagementCasesAssociationsQuery(PostCasemanagementCasesAssociationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CaseAssociationQueryEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CaseAssociationQueryEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for Case associations by interaction.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseAssociationQueryEntityListing> postCasemanagementCasesAssociationsQuery(ApiRequest<CaseAssociationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CaseAssociationQueryEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CaseAssociationQueryEntityListing> response = (ApiResponse<CaseAssociationQueryEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CaseAssociationQueryEntityListing> response = (ApiResponse<CaseAssociationQueryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a data schema on a draft Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param schemaKeyName Schema key (for example \"default\"). (required)
   * @param body Data schema reference. (required)
   * @return CaseplanDataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseplanDataSchema putCasemanagementCaseplanDataschema(String caseplanId, String schemaKeyName, CaseplanDataSchemaRequest body) throws IOException, ApiException {
    return  putCasemanagementCaseplanDataschema(createPutCasemanagementCaseplanDataschemaRequest(caseplanId, schemaKeyName, body));
  }

  /**
   * Update a data schema on a draft Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param schemaKeyName Schema key (for example \"default\"). (required)
   * @param body Data schema reference. (required)
   * @return CaseplanDataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseplanDataSchema> putCasemanagementCaseplanDataschemaWithHttpInfo(String caseplanId, String schemaKeyName, CaseplanDataSchemaRequest body) throws IOException {
    return putCasemanagementCaseplanDataschema(createPutCasemanagementCaseplanDataschemaRequest(caseplanId, schemaKeyName, body).withHttpInfo());
  }

  private PutCasemanagementCaseplanDataschemaRequest createPutCasemanagementCaseplanDataschemaRequest(String caseplanId, String schemaKeyName, CaseplanDataSchemaRequest body) {
    return PutCasemanagementCaseplanDataschemaRequest.builder()
            .withCaseplanId(caseplanId)

            .withSchemaKeyName(schemaKeyName)

            .withBody(body)

            .build();
  }

  /**
   * Update a data schema on a draft Caseplan.
   * 
   * @param request The request object
   * @return CaseplanDataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CaseplanDataSchema putCasemanagementCaseplanDataschema(PutCasemanagementCaseplanDataschemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CaseplanDataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CaseplanDataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a data schema on a draft Caseplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CaseplanDataSchema> putCasemanagementCaseplanDataschema(ApiRequest<CaseplanDataSchemaRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CaseplanDataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CaseplanDataSchema> response = (ApiResponse<CaseplanDataSchema>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CaseplanDataSchema> response = (ApiResponse<CaseplanDataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the intake settings for a Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param body Intake settings update. (required)
   * @return IntakeSettingsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntakeSettingsListing putCasemanagementCaseplanIntakesettings(String caseplanId, IntakeSettingsUpdate body) throws IOException, ApiException {
    return  putCasemanagementCaseplanIntakesettings(createPutCasemanagementCaseplanIntakesettingsRequest(caseplanId, body));
  }

  /**
   * Update the intake settings for a Caseplan.
   * 
   * @param caseplanId Caseplan identifier. (required)
   * @param body Intake settings update. (required)
   * @return IntakeSettingsListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntakeSettingsListing> putCasemanagementCaseplanIntakesettingsWithHttpInfo(String caseplanId, IntakeSettingsUpdate body) throws IOException {
    return putCasemanagementCaseplanIntakesettings(createPutCasemanagementCaseplanIntakesettingsRequest(caseplanId, body).withHttpInfo());
  }

  private PutCasemanagementCaseplanIntakesettingsRequest createPutCasemanagementCaseplanIntakesettingsRequest(String caseplanId, IntakeSettingsUpdate body) {
    return PutCasemanagementCaseplanIntakesettingsRequest.builder()
            .withCaseplanId(caseplanId)

            .withBody(body)

            .build();
  }

  /**
   * Update the intake settings for a Caseplan.
   * 
   * @param request The request object
   * @return IntakeSettingsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntakeSettingsListing putCasemanagementCaseplanIntakesettings(PutCasemanagementCaseplanIntakesettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntakeSettingsListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntakeSettingsListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the intake settings for a Caseplan.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntakeSettingsListing> putCasemanagementCaseplanIntakesettings(ApiRequest<IntakeSettingsUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntakeSettingsListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntakeSettingsListing> response = (ApiResponse<IntakeSettingsListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IntakeSettingsListing> response = (ApiResponse<IntakeSettingsListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
