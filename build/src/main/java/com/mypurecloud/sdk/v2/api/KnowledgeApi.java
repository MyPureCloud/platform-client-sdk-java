package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.BulkResponse;
import com.mypurecloud.sdk.v2.model.CategoryCreateRequest;
import com.mypurecloud.sdk.v2.model.CategoryListing;
import com.mypurecloud.sdk.v2.model.CategoryResponse;
import com.mypurecloud.sdk.v2.model.CategoryResponseListing;
import com.mypurecloud.sdk.v2.model.CategoryUpdateRequest;
import com.mypurecloud.sdk.v2.model.CreateUploadSourceUrlJobRequest;
import com.mypurecloud.sdk.v2.model.CreateUploadSourceUrlJobResponse;
import com.mypurecloud.sdk.v2.model.DocumentListing;
import com.mypurecloud.sdk.v2.model.DocumentVariationRequest;
import com.mypurecloud.sdk.v2.model.DocumentVariationResponse;
import com.mypurecloud.sdk.v2.model.DocumentVariationResponseListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GetUploadSourceUrlJobStatusResponse;
import com.mypurecloud.sdk.v2.model.GuestCategoryResponseListing;
import com.mypurecloud.sdk.v2.model.ImportStatusRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeAnswerDocumentsResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeBase;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseCreateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseUpdateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeCategory;
import com.mypurecloud.sdk.v2.model.KnowledgeCategoryRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocument;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkRemoveRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkUpdateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkVersionAddRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentContentUpload;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentCopy;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentCreateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedback;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackResponseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackUpdateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentGuestSearch;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentGuestSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentPresentation;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentQuery;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentQueryResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentReq;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentResponseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSearch;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSuggestion;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSuggestionRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersion;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersionListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersionVariation;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersionVariationListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentView;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentsAnswerFilter;
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeExtendedCategory;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestAnswerDocumentsResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentCopy;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentFeedback;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentPresentation;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentResponseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentSuggestion;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentSuggestionRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentView;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestSession;
import com.mypurecloud.sdk.v2.model.KnowledgeImport;
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeIntegrationOptionsResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobRequestImport;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobRequestPatch;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSyncJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSyncJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeTraining;
import com.mypurecloud.sdk.v2.model.LabelCreateRequest;
import com.mypurecloud.sdk.v2.model.LabelListing;
import com.mypurecloud.sdk.v2.model.LabelResponse;
import com.mypurecloud.sdk.v2.model.LabelUpdateRequest;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.OperationCreatorUserResponse;
import com.mypurecloud.sdk.v2.model.OperationListing;
import com.mypurecloud.sdk.v2.model.SalesforceSourceRequest;
import com.mypurecloud.sdk.v2.model.SalesforceSourceResponse;
import com.mypurecloud.sdk.v2.model.SearchUpdateRequest;
import com.mypurecloud.sdk.v2.model.ServiceNowSourceRequest;
import com.mypurecloud.sdk.v2.model.ServiceNowSourceResponse;
import com.mypurecloud.sdk.v2.model.SourceBaseResponse;
import com.mypurecloud.sdk.v2.model.SourceSyncResponse;
import com.mypurecloud.sdk.v2.model.SyncStatusRequest;
import com.mypurecloud.sdk.v2.model.TrainingListing;
import com.mypurecloud.sdk.v2.model.UnansweredGroup;
import com.mypurecloud.sdk.v2.model.UnansweredGroups;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroup;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroupPatchRequestBody;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroupUpdateResponse;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseDocumentVariationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseExportJobRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseImportJobRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseLabelRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseLanguageCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseLanguageDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseSynchronizeJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeGuestSessionCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeGuestSessionDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeGuestSessionDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeIntegrationOptionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseDocumentFeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseDocumentVariationRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseDocumentVariationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseDocumentVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseDocumentVersionVariationRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseDocumentVersionVariationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseDocumentVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseExportJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseImportJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLabelRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLabelsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageDocumentUploadRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageDocumentsImportRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageTrainingRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageTrainingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseOperationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseOperationsUsersQueryRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseParseJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseSourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseSynchronizeJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseUnansweredGroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseUnansweredGroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseUploadsUrlsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebasesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeGuestSessionDocumentsSearchSearchIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseDocumentVariationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseDocumentsSearchSearchIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseImportJobRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLabelRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLanguageCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLanguageDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLanguageDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseParseJobRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseSynchronizeJobRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeDocumentuploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeGuestSessionDocumentCopiesRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeGuestSessionDocumentFeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeGuestSessionDocumentViewsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeGuestSessionDocumentsAnswersRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeGuestSessionDocumentsPresentationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeGuestSessionDocumentsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeGuestSessionDocumentsSearchSuggestionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeGuestSessionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentCopiesRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentFeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentVariationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentViewsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentsAnswersRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentsBulkRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentsBulkUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentsPresentationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentsSearchSuggestionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseDocumentsVersionsBulkAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseExportJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseImportJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLabelsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageDocumentUploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageTrainingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseParseJobImportRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseParseJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseSourcesSalesforceRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseSourcesSalesforceSourceIdSyncRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseSourcesServicenowRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseSourcesServicenowSourceIdSyncRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseSynchronizeJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebasesRequest;
import com.mypurecloud.sdk.v2.api.request.PutKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KnowledgeApi {
  private final ApiClient pcapiClient;

  public KnowledgeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public KnowledgeApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete knowledge base
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase deleteKnowledgeKnowledgebase(String knowledgeBaseId) throws IOException, ApiException {
    return  deleteKnowledgeKnowledgebase(createDeleteKnowledgeKnowledgebaseRequest(knowledgeBaseId));
  }

  /**
   * Delete knowledge base
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @return KnowledgeBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> deleteKnowledgeKnowledgebaseWithHttpInfo(String knowledgeBaseId) throws IOException {
    return deleteKnowledgeKnowledgebase(createDeleteKnowledgeKnowledgebaseRequest(knowledgeBaseId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseRequest createDeleteKnowledgeKnowledgebaseRequest(String knowledgeBaseId) {
    return DeleteKnowledgeKnowledgebaseRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .build();
  }

  /**
   * Delete knowledge base
   * 
   * @param request The request object
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase deleteKnowledgeKnowledgebase(DeleteKnowledgeKnowledgebaseRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete knowledge base
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> deleteKnowledgeKnowledgebase(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete category
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param categoryId Category ID (required)
   * @return CategoryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryResponse deleteKnowledgeKnowledgebaseCategory(String knowledgeBaseId, String categoryId) throws IOException, ApiException {
    return  deleteKnowledgeKnowledgebaseCategory(createDeleteKnowledgeKnowledgebaseCategoryRequest(knowledgeBaseId, categoryId));
  }

  /**
   * Delete category
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param categoryId Category ID (required)
   * @return CategoryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryResponse> deleteKnowledgeKnowledgebaseCategoryWithHttpInfo(String knowledgeBaseId, String categoryId) throws IOException {
    return deleteKnowledgeKnowledgebaseCategory(createDeleteKnowledgeKnowledgebaseCategoryRequest(knowledgeBaseId, categoryId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseCategoryRequest createDeleteKnowledgeKnowledgebaseCategoryRequest(String knowledgeBaseId, String categoryId) {
    return DeleteKnowledgeKnowledgebaseCategoryRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withCategoryId(categoryId)

            .build();
  }

  /**
   * Delete category
   * 
   * @param request The request object
   * @return CategoryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryResponse deleteKnowledgeKnowledgebaseCategory(DeleteKnowledgeKnowledgebaseCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CategoryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CategoryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryResponse> deleteKnowledgeKnowledgebaseCategory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CategoryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete document.
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseDocument(String knowledgeBaseId, String documentId) throws IOException, ApiException {
     deleteKnowledgeKnowledgebaseDocument(createDeleteKnowledgeKnowledgebaseDocumentRequest(knowledgeBaseId, documentId));
  }

  /**
   * Delete document.
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseDocumentWithHttpInfo(String knowledgeBaseId, String documentId) throws IOException {
    return deleteKnowledgeKnowledgebaseDocument(createDeleteKnowledgeKnowledgebaseDocumentRequest(knowledgeBaseId, documentId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseDocumentRequest createDeleteKnowledgeKnowledgebaseDocumentRequest(String knowledgeBaseId, String documentId) {
    return DeleteKnowledgeKnowledgebaseDocumentRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .build();
  }

  /**
   * Delete document.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseDocument(DeleteKnowledgeKnowledgebaseDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseDocument(ApiRequest<Void> request) throws IOException {
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
   * Delete a variation for a document.
   * 
   * @param documentVariationId Globally unique identifier for a document variation. (required)
   * @param documentId Globally unique identifier for a document. (required)
   * @param knowledgeBaseId Globally unique identifier for a knowledge base. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseDocumentVariation(String documentVariationId, String documentId, String knowledgeBaseId) throws IOException, ApiException {
     deleteKnowledgeKnowledgebaseDocumentVariation(createDeleteKnowledgeKnowledgebaseDocumentVariationRequest(documentVariationId, documentId, knowledgeBaseId));
  }

  /**
   * Delete a variation for a document.
   * 
   * @param documentVariationId Globally unique identifier for a document variation. (required)
   * @param documentId Globally unique identifier for a document. (required)
   * @param knowledgeBaseId Globally unique identifier for a knowledge base. (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseDocumentVariationWithHttpInfo(String documentVariationId, String documentId, String knowledgeBaseId) throws IOException {
    return deleteKnowledgeKnowledgebaseDocumentVariation(createDeleteKnowledgeKnowledgebaseDocumentVariationRequest(documentVariationId, documentId, knowledgeBaseId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseDocumentVariationRequest createDeleteKnowledgeKnowledgebaseDocumentVariationRequest(String documentVariationId, String documentId, String knowledgeBaseId) {
    return DeleteKnowledgeKnowledgebaseDocumentVariationRequest.builder()
            .withDocumentVariationId(documentVariationId)

            .withDocumentId(documentId)

            .withKnowledgeBaseId(knowledgeBaseId)

            .build();
  }

  /**
   * Delete a variation for a document.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseDocumentVariation(DeleteKnowledgeKnowledgebaseDocumentVariationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a variation for a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseDocumentVariation(ApiRequest<Void> request) throws IOException {
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
   * Delete export job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param exportJobId Export job ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseExportJob(String knowledgeBaseId, String exportJobId) throws IOException, ApiException {
     deleteKnowledgeKnowledgebaseExportJob(createDeleteKnowledgeKnowledgebaseExportJobRequest(knowledgeBaseId, exportJobId));
  }

  /**
   * Delete export job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param exportJobId Export job ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseExportJobWithHttpInfo(String knowledgeBaseId, String exportJobId) throws IOException {
    return deleteKnowledgeKnowledgebaseExportJob(createDeleteKnowledgeKnowledgebaseExportJobRequest(knowledgeBaseId, exportJobId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseExportJobRequest createDeleteKnowledgeKnowledgebaseExportJobRequest(String knowledgeBaseId, String exportJobId) {
    return DeleteKnowledgeKnowledgebaseExportJobRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withExportJobId(exportJobId)

            .build();
  }

  /**
   * Delete export job
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseExportJob(DeleteKnowledgeKnowledgebaseExportJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete export job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseExportJob(ApiRequest<Void> request) throws IOException {
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
   * Delete import job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param importJobId Import job ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseImportJob(String knowledgeBaseId, String importJobId) throws IOException, ApiException {
     deleteKnowledgeKnowledgebaseImportJob(createDeleteKnowledgeKnowledgebaseImportJobRequest(knowledgeBaseId, importJobId));
  }

  /**
   * Delete import job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param importJobId Import job ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseImportJobWithHttpInfo(String knowledgeBaseId, String importJobId) throws IOException {
    return deleteKnowledgeKnowledgebaseImportJob(createDeleteKnowledgeKnowledgebaseImportJobRequest(knowledgeBaseId, importJobId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseImportJobRequest createDeleteKnowledgeKnowledgebaseImportJobRequest(String knowledgeBaseId, String importJobId) {
    return DeleteKnowledgeKnowledgebaseImportJobRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withImportJobId(importJobId)

            .build();
  }

  /**
   * Delete import job
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseImportJob(DeleteKnowledgeKnowledgebaseImportJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete import job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseImportJob(ApiRequest<Void> request) throws IOException {
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
   * Delete label
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param labelId Label ID (required)
   * @return LabelResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LabelResponse deleteKnowledgeKnowledgebaseLabel(String knowledgeBaseId, String labelId) throws IOException, ApiException {
    return  deleteKnowledgeKnowledgebaseLabel(createDeleteKnowledgeKnowledgebaseLabelRequest(knowledgeBaseId, labelId));
  }

  /**
   * Delete label
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param labelId Label ID (required)
   * @return LabelResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LabelResponse> deleteKnowledgeKnowledgebaseLabelWithHttpInfo(String knowledgeBaseId, String labelId) throws IOException {
    return deleteKnowledgeKnowledgebaseLabel(createDeleteKnowledgeKnowledgebaseLabelRequest(knowledgeBaseId, labelId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseLabelRequest createDeleteKnowledgeKnowledgebaseLabelRequest(String knowledgeBaseId, String labelId) {
    return DeleteKnowledgeKnowledgebaseLabelRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLabelId(labelId)

            .build();
  }

  /**
   * Delete label
   * 
   * @param request The request object
   * @return LabelResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LabelResponse deleteKnowledgeKnowledgebaseLabel(DeleteKnowledgeKnowledgebaseLabelRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LabelResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LabelResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete label
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LabelResponse> deleteKnowledgeKnowledgebaseLabel(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LabelResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete category
   * 
   * @param categoryId Category ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeCategory deleteKnowledgeKnowledgebaseLanguageCategory(String categoryId, String knowledgeBaseId, String languageCode) throws IOException, ApiException {
    return  deleteKnowledgeKnowledgebaseLanguageCategory(createDeleteKnowledgeKnowledgebaseLanguageCategoryRequest(categoryId, knowledgeBaseId, languageCode));
  }

  /**
   * Delete category
   * 
   * @param categoryId Category ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeCategory
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeCategory> deleteKnowledgeKnowledgebaseLanguageCategoryWithHttpInfo(String categoryId, String knowledgeBaseId, String languageCode) throws IOException {
    return deleteKnowledgeKnowledgebaseLanguageCategory(createDeleteKnowledgeKnowledgebaseLanguageCategoryRequest(categoryId, knowledgeBaseId, languageCode).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseLanguageCategoryRequest createDeleteKnowledgeKnowledgebaseLanguageCategoryRequest(String categoryId, String knowledgeBaseId, String languageCode) {
    return DeleteKnowledgeKnowledgebaseLanguageCategoryRequest.builder()
            .withCategoryId(categoryId)

            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Delete category
   * 
   * @param request The request object
   * @return KnowledgeCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeCategory deleteKnowledgeKnowledgebaseLanguageCategory(DeleteKnowledgeKnowledgebaseLanguageCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeCategory> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeCategory>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeCategory> deleteKnowledgeKnowledgebaseLanguageCategory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeCategory>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeCategory> response = (ApiResponse<KnowledgeCategory>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeCategory> response = (ApiResponse<KnowledgeCategory>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete document
   * 
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeDocument deleteKnowledgeKnowledgebaseLanguageDocument(String documentId, String knowledgeBaseId, String languageCode) throws IOException, ApiException {
    return  deleteKnowledgeKnowledgebaseLanguageDocument(createDeleteKnowledgeKnowledgebaseLanguageDocumentRequest(documentId, knowledgeBaseId, languageCode));
  }

  /**
   * Delete document
   * 
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeDocument
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeDocument> deleteKnowledgeKnowledgebaseLanguageDocumentWithHttpInfo(String documentId, String knowledgeBaseId, String languageCode) throws IOException {
    return deleteKnowledgeKnowledgebaseLanguageDocument(createDeleteKnowledgeKnowledgebaseLanguageDocumentRequest(documentId, knowledgeBaseId, languageCode).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseLanguageDocumentRequest createDeleteKnowledgeKnowledgebaseLanguageDocumentRequest(String documentId, String knowledgeBaseId, String languageCode) {
    return DeleteKnowledgeKnowledgebaseLanguageDocumentRequest.builder()
            .withDocumentId(documentId)

            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Delete document
   * 
   * @param request The request object
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeDocument deleteKnowledgeKnowledgebaseLanguageDocument(DeleteKnowledgeKnowledgebaseLanguageDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeDocument> deleteKnowledgeKnowledgebaseLanguageDocument(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete import operation
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param importId Import ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public void deleteKnowledgeKnowledgebaseLanguageDocumentsImport(String knowledgeBaseId, String languageCode, String importId) throws IOException, ApiException {
     deleteKnowledgeKnowledgebaseLanguageDocumentsImport(createDeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest(knowledgeBaseId, languageCode, importId));
  }

  /**
   * Delete import operation
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param importId Import ID (required)
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseLanguageDocumentsImportWithHttpInfo(String knowledgeBaseId, String languageCode, String importId) throws IOException {
    return deleteKnowledgeKnowledgebaseLanguageDocumentsImport(createDeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest(knowledgeBaseId, languageCode, importId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest createDeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest(String knowledgeBaseId, String languageCode, String importId) {
    return DeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withImportId(importId)

            .build();
  }

  /**
   * Delete import operation
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public void deleteKnowledgeKnowledgebaseLanguageDocumentsImport(DeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete import operation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseLanguageDocumentsImport(ApiRequest<Void> request) throws IOException {
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
   * Delete Salesforce Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseSourcesSalesforceSourceId(String knowledgeBaseId, String sourceId) throws IOException, ApiException {
     deleteKnowledgeKnowledgebaseSourcesSalesforceSourceId(createDeleteKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest(knowledgeBaseId, sourceId));
  }

  /**
   * Delete Salesforce Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseSourcesSalesforceSourceIdWithHttpInfo(String knowledgeBaseId, String sourceId) throws IOException {
    return deleteKnowledgeKnowledgebaseSourcesSalesforceSourceId(createDeleteKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest(knowledgeBaseId, sourceId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest createDeleteKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest(String knowledgeBaseId, String sourceId) {
    return DeleteKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withSourceId(sourceId)

            .build();
  }

  /**
   * Delete Salesforce Knowledge integration source
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseSourcesSalesforceSourceId(DeleteKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Salesforce Knowledge integration source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseSourcesSalesforceSourceId(ApiRequest<Void> request) throws IOException {
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
   * Delete ServiceNow Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseSourcesServicenowSourceId(String knowledgeBaseId, String sourceId) throws IOException, ApiException {
     deleteKnowledgeKnowledgebaseSourcesServicenowSourceId(createDeleteKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest(knowledgeBaseId, sourceId));
  }

  /**
   * Delete ServiceNow Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseSourcesServicenowSourceIdWithHttpInfo(String knowledgeBaseId, String sourceId) throws IOException {
    return deleteKnowledgeKnowledgebaseSourcesServicenowSourceId(createDeleteKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest(knowledgeBaseId, sourceId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest createDeleteKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest(String knowledgeBaseId, String sourceId) {
    return DeleteKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withSourceId(sourceId)

            .build();
  }

  /**
   * Delete ServiceNow Knowledge integration source
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseSourcesServicenowSourceId(DeleteKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete ServiceNow Knowledge integration source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseSourcesServicenowSourceId(ApiRequest<Void> request) throws IOException {
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
   * Delete synchronization job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param syncJobId Synchronization job ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseSynchronizeJob(String knowledgeBaseId, String syncJobId) throws IOException, ApiException {
     deleteKnowledgeKnowledgebaseSynchronizeJob(createDeleteKnowledgeKnowledgebaseSynchronizeJobRequest(knowledgeBaseId, syncJobId));
  }

  /**
   * Delete synchronization job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param syncJobId Synchronization job ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseSynchronizeJobWithHttpInfo(String knowledgeBaseId, String syncJobId) throws IOException {
    return deleteKnowledgeKnowledgebaseSynchronizeJob(createDeleteKnowledgeKnowledgebaseSynchronizeJobRequest(knowledgeBaseId, syncJobId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseSynchronizeJobRequest createDeleteKnowledgeKnowledgebaseSynchronizeJobRequest(String knowledgeBaseId, String syncJobId) {
    return DeleteKnowledgeKnowledgebaseSynchronizeJobRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withSyncJobId(syncJobId)

            .build();
  }

  /**
   * Delete synchronization job
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseSynchronizeJob(DeleteKnowledgeKnowledgebaseSynchronizeJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete synchronization job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseSynchronizeJob(ApiRequest<Void> request) throws IOException {
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
   * Get categories
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param parentId If specified, retrieves the children categories by parent category ID. (optional)
   * @param isRoot If specified, retrieves only the root categories. (optional)
   * @param name Filter to return the categories that starts with the given category name. (optional)
   * @param sortBy Name: sort by category names alphabetically; Hierarchy: sort by the full path of hierarchical category names alphabetically (optional, default to Name)
   * @param expand The specified entity attribute will be filled. Supported value:\"Ancestors\": every ancestors will be filled via the parent attribute recursively,but only the id, name, parentId will be present for the ancestors. (optional)
   * @param includeDocumentCount If specified, retrieves the number of documents related to category. (optional)
   * @return GuestCategoryResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuestCategoryResponseListing getKnowledgeGuestSessionCategories(String sessionId, String before, String after, String pageSize, String parentId, Boolean isRoot, String name, String sortBy, String expand, Boolean includeDocumentCount) throws IOException, ApiException {
    return  getKnowledgeGuestSessionCategories(createGetKnowledgeGuestSessionCategoriesRequest(sessionId, before, after, pageSize, parentId, isRoot, name, sortBy, expand, includeDocumentCount));
  }

  /**
   * Get categories
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param parentId If specified, retrieves the children categories by parent category ID. (optional)
   * @param isRoot If specified, retrieves only the root categories. (optional)
   * @param name Filter to return the categories that starts with the given category name. (optional)
   * @param sortBy Name: sort by category names alphabetically; Hierarchy: sort by the full path of hierarchical category names alphabetically (optional, default to Name)
   * @param expand The specified entity attribute will be filled. Supported value:\"Ancestors\": every ancestors will be filled via the parent attribute recursively,but only the id, name, parentId will be present for the ancestors. (optional)
   * @param includeDocumentCount If specified, retrieves the number of documents related to category. (optional)
   * @return GuestCategoryResponseListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuestCategoryResponseListing> getKnowledgeGuestSessionCategoriesWithHttpInfo(String sessionId, String before, String after, String pageSize, String parentId, Boolean isRoot, String name, String sortBy, String expand, Boolean includeDocumentCount) throws IOException {
    return getKnowledgeGuestSessionCategories(createGetKnowledgeGuestSessionCategoriesRequest(sessionId, before, after, pageSize, parentId, isRoot, name, sortBy, expand, includeDocumentCount).withHttpInfo());
  }

  private GetKnowledgeGuestSessionCategoriesRequest createGetKnowledgeGuestSessionCategoriesRequest(String sessionId, String before, String after, String pageSize, String parentId, Boolean isRoot, String name, String sortBy, String expand, Boolean includeDocumentCount) {
    return GetKnowledgeGuestSessionCategoriesRequest.builder()
            .withSessionId(sessionId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withParentId(parentId)

            .withIsRoot(isRoot)

            .withName(name)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withIncludeDocumentCount(includeDocumentCount)

            .build();
  }

  /**
   * Get categories
   * 
   * @param request The request object
   * @return GuestCategoryResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuestCategoryResponseListing getKnowledgeGuestSessionCategories(GetKnowledgeGuestSessionCategoriesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GuestCategoryResponseListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GuestCategoryResponseListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get categories
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuestCategoryResponseListing> getKnowledgeGuestSessionCategories(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GuestCategoryResponseListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GuestCategoryResponseListing> response = (ApiResponse<GuestCategoryResponseListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GuestCategoryResponseListing> response = (ApiResponse<GuestCategoryResponseListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a knowledge document by ID.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param documentId Document ID (required)
   * @return KnowledgeGuestDocumentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeGuestDocumentResponse getKnowledgeGuestSessionDocument(String sessionId, String documentId) throws IOException, ApiException {
    return  getKnowledgeGuestSessionDocument(createGetKnowledgeGuestSessionDocumentRequest(sessionId, documentId));
  }

  /**
   * Get a knowledge document by ID.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param documentId Document ID (required)
   * @return KnowledgeGuestDocumentResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeGuestDocumentResponse> getKnowledgeGuestSessionDocumentWithHttpInfo(String sessionId, String documentId) throws IOException {
    return getKnowledgeGuestSessionDocument(createGetKnowledgeGuestSessionDocumentRequest(sessionId, documentId).withHttpInfo());
  }

  private GetKnowledgeGuestSessionDocumentRequest createGetKnowledgeGuestSessionDocumentRequest(String sessionId, String documentId) {
    return GetKnowledgeGuestSessionDocumentRequest.builder()
            .withSessionId(sessionId)

            .withDocumentId(documentId)

            .build();
  }

  /**
   * Get a knowledge document by ID.
   * 
   * @param request The request object
   * @return KnowledgeGuestDocumentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeGuestDocumentResponse getKnowledgeGuestSessionDocument(GetKnowledgeGuestSessionDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeGuestDocumentResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeGuestDocumentResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a knowledge document by ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeGuestDocumentResponse> getKnowledgeGuestSessionDocument(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeGuestDocumentResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeGuestDocumentResponse> response = (ApiResponse<KnowledgeGuestDocumentResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeGuestDocumentResponse> response = (ApiResponse<KnowledgeGuestDocumentResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get documents.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param categoryId If specified, retrieves documents associated with category ids, comma separated values expected. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return KnowledgeGuestDocumentResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeGuestDocumentResponseListing getKnowledgeGuestSessionDocuments(String sessionId, List<String> categoryId, Integer pageSize) throws IOException, ApiException {
    return  getKnowledgeGuestSessionDocuments(createGetKnowledgeGuestSessionDocumentsRequest(sessionId, categoryId, pageSize));
  }

  /**
   * Get documents.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param categoryId If specified, retrieves documents associated with category ids, comma separated values expected. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return KnowledgeGuestDocumentResponseListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeGuestDocumentResponseListing> getKnowledgeGuestSessionDocumentsWithHttpInfo(String sessionId, List<String> categoryId, Integer pageSize) throws IOException {
    return getKnowledgeGuestSessionDocuments(createGetKnowledgeGuestSessionDocumentsRequest(sessionId, categoryId, pageSize).withHttpInfo());
  }

  private GetKnowledgeGuestSessionDocumentsRequest createGetKnowledgeGuestSessionDocumentsRequest(String sessionId, List<String> categoryId, Integer pageSize) {
    return GetKnowledgeGuestSessionDocumentsRequest.builder()
            .withSessionId(sessionId)

            .withCategoryId(categoryId)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get documents.
   * 
   * @param request The request object
   * @return KnowledgeGuestDocumentResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeGuestDocumentResponseListing getKnowledgeGuestSessionDocuments(GetKnowledgeGuestSessionDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeGuestDocumentResponseListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeGuestDocumentResponseListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get documents.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeGuestDocumentResponseListing> getKnowledgeGuestSessionDocuments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeGuestDocumentResponseListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeGuestDocumentResponseListing> response = (ApiResponse<KnowledgeGuestDocumentResponseListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeGuestDocumentResponseListing> response = (ApiResponse<KnowledgeGuestDocumentResponseListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get sync options available for a knowledge-connect integration
   * 
   * @param integrationId Integration ID (required)
   * @param knowledgeBaseIds Narrowing down filtering option results by knowledge base. (optional)
   * @return KnowledgeIntegrationOptionsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeIntegrationOptionsResponse getKnowledgeIntegrationOptions(String integrationId, List<String> knowledgeBaseIds) throws IOException, ApiException {
    return  getKnowledgeIntegrationOptions(createGetKnowledgeIntegrationOptionsRequest(integrationId, knowledgeBaseIds));
  }

  /**
   * Get sync options available for a knowledge-connect integration
   * 
   * @param integrationId Integration ID (required)
   * @param knowledgeBaseIds Narrowing down filtering option results by knowledge base. (optional)
   * @return KnowledgeIntegrationOptionsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeIntegrationOptionsResponse> getKnowledgeIntegrationOptionsWithHttpInfo(String integrationId, List<String> knowledgeBaseIds) throws IOException {
    return getKnowledgeIntegrationOptions(createGetKnowledgeIntegrationOptionsRequest(integrationId, knowledgeBaseIds).withHttpInfo());
  }

  private GetKnowledgeIntegrationOptionsRequest createGetKnowledgeIntegrationOptionsRequest(String integrationId, List<String> knowledgeBaseIds) {
    return GetKnowledgeIntegrationOptionsRequest.builder()
            .withIntegrationId(integrationId)

            .withKnowledgeBaseIds(knowledgeBaseIds)

            .build();
  }

  /**
   * Get sync options available for a knowledge-connect integration
   * 
   * @param request The request object
   * @return KnowledgeIntegrationOptionsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeIntegrationOptionsResponse getKnowledgeIntegrationOptions(GetKnowledgeIntegrationOptionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeIntegrationOptionsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeIntegrationOptionsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get sync options available for a knowledge-connect integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeIntegrationOptionsResponse> getKnowledgeIntegrationOptions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeIntegrationOptionsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeIntegrationOptionsResponse> response = (ApiResponse<KnowledgeIntegrationOptionsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeIntegrationOptionsResponse> response = (ApiResponse<KnowledgeIntegrationOptionsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get knowledge base
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase getKnowledgeKnowledgebase(String knowledgeBaseId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebase(createGetKnowledgeKnowledgebaseRequest(knowledgeBaseId));
  }

  /**
   * Get knowledge base
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @return KnowledgeBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> getKnowledgeKnowledgebaseWithHttpInfo(String knowledgeBaseId) throws IOException {
    return getKnowledgeKnowledgebase(createGetKnowledgeKnowledgebaseRequest(knowledgeBaseId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseRequest createGetKnowledgeKnowledgebaseRequest(String knowledgeBaseId) {
    return GetKnowledgeKnowledgebaseRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .build();
  }

  /**
   * Get knowledge base
   * 
   * @param request The request object
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase getKnowledgeKnowledgebase(GetKnowledgeKnowledgebaseRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get knowledge base
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> getKnowledgeKnowledgebase(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get categories
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param parentId If specified, retrieves the children categories by parent category ID. (optional)
   * @param isRoot If specified, retrieves only the root categories. (optional)
   * @param name Filter to return the categories that starts with the given category name. (optional)
   * @param sortBy Name: sort by category names alphabetically; Hierarchy: sort by the full path of hierarchical category names alphabetically (optional, default to Name)
   * @param expand The specified entity attribute will be filled. Supported value:\"Ancestors\": every ancestors will be filled via the parent attribute recursively,but only the id, name, parentId will be present for the ancestors. (optional)
   * @param includeDocumentCount If specified, retrieves the number of documents related to category. (optional)
   * @return CategoryResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryResponseListing getKnowledgeKnowledgebaseCategories(String knowledgeBaseId, String before, String after, String pageSize, String parentId, Boolean isRoot, String name, String sortBy, String expand, Boolean includeDocumentCount) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseCategories(createGetKnowledgeKnowledgebaseCategoriesRequest(knowledgeBaseId, before, after, pageSize, parentId, isRoot, name, sortBy, expand, includeDocumentCount));
  }

  /**
   * Get categories
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param parentId If specified, retrieves the children categories by parent category ID. (optional)
   * @param isRoot If specified, retrieves only the root categories. (optional)
   * @param name Filter to return the categories that starts with the given category name. (optional)
   * @param sortBy Name: sort by category names alphabetically; Hierarchy: sort by the full path of hierarchical category names alphabetically (optional, default to Name)
   * @param expand The specified entity attribute will be filled. Supported value:\"Ancestors\": every ancestors will be filled via the parent attribute recursively,but only the id, name, parentId will be present for the ancestors. (optional)
   * @param includeDocumentCount If specified, retrieves the number of documents related to category. (optional)
   * @return CategoryResponseListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryResponseListing> getKnowledgeKnowledgebaseCategoriesWithHttpInfo(String knowledgeBaseId, String before, String after, String pageSize, String parentId, Boolean isRoot, String name, String sortBy, String expand, Boolean includeDocumentCount) throws IOException {
    return getKnowledgeKnowledgebaseCategories(createGetKnowledgeKnowledgebaseCategoriesRequest(knowledgeBaseId, before, after, pageSize, parentId, isRoot, name, sortBy, expand, includeDocumentCount).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseCategoriesRequest createGetKnowledgeKnowledgebaseCategoriesRequest(String knowledgeBaseId, String before, String after, String pageSize, String parentId, Boolean isRoot, String name, String sortBy, String expand, Boolean includeDocumentCount) {
    return GetKnowledgeKnowledgebaseCategoriesRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withParentId(parentId)

            .withIsRoot(isRoot)

            .withName(name)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withIncludeDocumentCount(includeDocumentCount)

            .build();
  }

  /**
   * Get categories
   * 
   * @param request The request object
   * @return CategoryResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryResponseListing getKnowledgeKnowledgebaseCategories(GetKnowledgeKnowledgebaseCategoriesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CategoryResponseListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CategoryResponseListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get categories
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryResponseListing> getKnowledgeKnowledgebaseCategories(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CategoryResponseListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryResponseListing> response = (ApiResponse<CategoryResponseListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryResponseListing> response = (ApiResponse<CategoryResponseListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get category
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param categoryId Category ID (required)
   * @return CategoryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryResponse getKnowledgeKnowledgebaseCategory(String knowledgeBaseId, String categoryId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseCategory(createGetKnowledgeKnowledgebaseCategoryRequest(knowledgeBaseId, categoryId));
  }

  /**
   * Get category
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param categoryId Category ID (required)
   * @return CategoryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryResponse> getKnowledgeKnowledgebaseCategoryWithHttpInfo(String knowledgeBaseId, String categoryId) throws IOException {
    return getKnowledgeKnowledgebaseCategory(createGetKnowledgeKnowledgebaseCategoryRequest(knowledgeBaseId, categoryId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseCategoryRequest createGetKnowledgeKnowledgebaseCategoryRequest(String knowledgeBaseId, String categoryId) {
    return GetKnowledgeKnowledgebaseCategoryRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withCategoryId(categoryId)

            .build();
  }

  /**
   * Get category
   * 
   * @param request The request object
   * @return CategoryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryResponse getKnowledgeKnowledgebaseCategory(GetKnowledgeKnowledgebaseCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CategoryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CategoryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryResponse> getKnowledgeKnowledgebaseCategory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CategoryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get document.
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. Max No. of variations that can be returned on expand is 20. (optional)
   * @param state \"when state is \"Draft\", draft version of the document is returned,otherwise by default published version is returned in the response. (optional)
   * @return KnowledgeDocumentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentResponse getKnowledgeKnowledgebaseDocument(String knowledgeBaseId, String documentId, List<String> expand, String state) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseDocument(createGetKnowledgeKnowledgebaseDocumentRequest(knowledgeBaseId, documentId, expand, state));
  }

  /**
   * Get document.
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. Max No. of variations that can be returned on expand is 20. (optional)
   * @param state \"when state is \"Draft\", draft version of the document is returned,otherwise by default published version is returned in the response. (optional)
   * @return KnowledgeDocumentResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentResponse> getKnowledgeKnowledgebaseDocumentWithHttpInfo(String knowledgeBaseId, String documentId, List<String> expand, String state) throws IOException {
    return getKnowledgeKnowledgebaseDocument(createGetKnowledgeKnowledgebaseDocumentRequest(knowledgeBaseId, documentId, expand, state).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseDocumentRequest createGetKnowledgeKnowledgebaseDocumentRequest(String knowledgeBaseId, String documentId, List<String> expand, String state) {
    return GetKnowledgeKnowledgebaseDocumentRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withExpand(expand)

            .withState(state)

            .build();
  }

  /**
   * Get document.
   * 
   * @param request The request object
   * @return KnowledgeDocumentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentResponse getKnowledgeKnowledgebaseDocument(GetKnowledgeKnowledgebaseDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentResponse> getKnowledgeKnowledgebaseDocument(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentResponse> response = (ApiResponse<KnowledgeDocumentResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentResponse> response = (ApiResponse<KnowledgeDocumentResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of feedback records given on a document
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param onlyCommented If true, only feedback records that have comment are returned. If false, feedback records with and without comment are returned. Default: false. (optional)
   * @param documentVersionId Document version ID to filter by. Supported only if onlyCommented=true is set. (optional)
   * @param documentVariationId Document variation ID to filter by. Supported only if onlyCommented=true is set. (optional)
   * @param appType Application type to filter by. Supported only if onlyCommented=true is set. (optional)
   * @param queryType Query type to filter by. Supported only if onlyCommented=true is set. (optional)
   * @param userId The ID of the user, who created the feedback, to filter by. Supported only if onlyCommented=true is set. (optional)
   * @param queueId Queue ID to filter by. Supported only if onlyCommented=true is set. (optional)
   * @param state State to filter by. Supported only if onlyCommented=true is set. Default: Final (optional)
   * @return KnowledgeDocumentFeedbackResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentFeedbackResponseListing getKnowledgeKnowledgebaseDocumentFeedback(String knowledgeBaseId, String documentId, String before, String after, String pageSize, Boolean onlyCommented, String documentVersionId, String documentVariationId, String appType, String queryType, String userId, String queueId, String state) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseDocumentFeedback(createGetKnowledgeKnowledgebaseDocumentFeedbackRequest(knowledgeBaseId, documentId, before, after, pageSize, onlyCommented, documentVersionId, documentVariationId, appType, queryType, userId, queueId, state));
  }

  /**
   * Get a list of feedback records given on a document
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param onlyCommented If true, only feedback records that have comment are returned. If false, feedback records with and without comment are returned. Default: false. (optional)
   * @param documentVersionId Document version ID to filter by. Supported only if onlyCommented=true is set. (optional)
   * @param documentVariationId Document variation ID to filter by. Supported only if onlyCommented=true is set. (optional)
   * @param appType Application type to filter by. Supported only if onlyCommented=true is set. (optional)
   * @param queryType Query type to filter by. Supported only if onlyCommented=true is set. (optional)
   * @param userId The ID of the user, who created the feedback, to filter by. Supported only if onlyCommented=true is set. (optional)
   * @param queueId Queue ID to filter by. Supported only if onlyCommented=true is set. (optional)
   * @param state State to filter by. Supported only if onlyCommented=true is set. Default: Final (optional)
   * @return KnowledgeDocumentFeedbackResponseListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentFeedbackResponseListing> getKnowledgeKnowledgebaseDocumentFeedbackWithHttpInfo(String knowledgeBaseId, String documentId, String before, String after, String pageSize, Boolean onlyCommented, String documentVersionId, String documentVariationId, String appType, String queryType, String userId, String queueId, String state) throws IOException {
    return getKnowledgeKnowledgebaseDocumentFeedback(createGetKnowledgeKnowledgebaseDocumentFeedbackRequest(knowledgeBaseId, documentId, before, after, pageSize, onlyCommented, documentVersionId, documentVariationId, appType, queryType, userId, queueId, state).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseDocumentFeedbackRequest createGetKnowledgeKnowledgebaseDocumentFeedbackRequest(String knowledgeBaseId, String documentId, String before, String after, String pageSize, Boolean onlyCommented, String documentVersionId, String documentVariationId, String appType, String queryType, String userId, String queueId, String state) {
    return GetKnowledgeKnowledgebaseDocumentFeedbackRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withOnlyCommented(onlyCommented)

            .withDocumentVersionId(documentVersionId)

            .withDocumentVariationId(documentVariationId)

            .withAppType(appType)

            .withQueryType(queryType)

            .withUserId(userId)

            .withQueueId(queueId)

            .withState(state)

            .build();
  }

  /**
   * Get a list of feedback records given on a document
   * 
   * @param request The request object
   * @return KnowledgeDocumentFeedbackResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentFeedbackResponseListing getKnowledgeKnowledgebaseDocumentFeedback(GetKnowledgeKnowledgebaseDocumentFeedbackRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentFeedbackResponseListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentFeedbackResponseListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of feedback records given on a document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentFeedbackResponseListing> getKnowledgeKnowledgebaseDocumentFeedback(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentFeedbackResponseListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentFeedbackResponseListing> response = (ApiResponse<KnowledgeDocumentFeedbackResponseListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentFeedbackResponseListing> response = (ApiResponse<KnowledgeDocumentFeedbackResponseListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a single feedback record given on a document
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param feedbackId Feedback ID. (required)
   * @return KnowledgeDocumentFeedbackResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentFeedbackResponse getKnowledgeKnowledgebaseDocumentFeedbackFeedbackId(String knowledgeBaseId, String documentId, String feedbackId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseDocumentFeedbackFeedbackId(createGetKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest(knowledgeBaseId, documentId, feedbackId));
  }

  /**
   * Get a single feedback record given on a document
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param feedbackId Feedback ID. (required)
   * @return KnowledgeDocumentFeedbackResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentFeedbackResponse> getKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdWithHttpInfo(String knowledgeBaseId, String documentId, String feedbackId) throws IOException {
    return getKnowledgeKnowledgebaseDocumentFeedbackFeedbackId(createGetKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest(knowledgeBaseId, documentId, feedbackId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest createGetKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest(String knowledgeBaseId, String documentId, String feedbackId) {
    return GetKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withFeedbackId(feedbackId)

            .build();
  }

  /**
   * Get a single feedback record given on a document
   * 
   * @param request The request object
   * @return KnowledgeDocumentFeedbackResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentFeedbackResponse getKnowledgeKnowledgebaseDocumentFeedbackFeedbackId(GetKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentFeedbackResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentFeedbackResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single feedback record given on a document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentFeedbackResponse> getKnowledgeKnowledgebaseDocumentFeedbackFeedbackId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentFeedbackResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentFeedbackResponse> response = (ApiResponse<KnowledgeDocumentFeedbackResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentFeedbackResponse> response = (ApiResponse<KnowledgeDocumentFeedbackResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a variation for a document.
   * 
   * @param documentVariationId Globally unique identifier for a document variation. (required)
   * @param documentId Globally unique identifier for a document. (required)
   * @param knowledgeBaseId Globally unique identifier for a knowledge base. (required)
   * @param documentState The state of the document. (optional)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @return DocumentVariationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentVariationResponse getKnowledgeKnowledgebaseDocumentVariation(String documentVariationId, String documentId, String knowledgeBaseId, String documentState, List<String> expand) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseDocumentVariation(createGetKnowledgeKnowledgebaseDocumentVariationRequest(documentVariationId, documentId, knowledgeBaseId, documentState, expand));
  }

  /**
   * Get a variation for a document.
   * 
   * @param documentVariationId Globally unique identifier for a document variation. (required)
   * @param documentId Globally unique identifier for a document. (required)
   * @param knowledgeBaseId Globally unique identifier for a knowledge base. (required)
   * @param documentState The state of the document. (optional)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @return DocumentVariationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentVariationResponse> getKnowledgeKnowledgebaseDocumentVariationWithHttpInfo(String documentVariationId, String documentId, String knowledgeBaseId, String documentState, List<String> expand) throws IOException {
    return getKnowledgeKnowledgebaseDocumentVariation(createGetKnowledgeKnowledgebaseDocumentVariationRequest(documentVariationId, documentId, knowledgeBaseId, documentState, expand).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseDocumentVariationRequest createGetKnowledgeKnowledgebaseDocumentVariationRequest(String documentVariationId, String documentId, String knowledgeBaseId, String documentState, List<String> expand) {
    return GetKnowledgeKnowledgebaseDocumentVariationRequest.builder()
            .withDocumentVariationId(documentVariationId)

            .withDocumentId(documentId)

            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentState(documentState)

            .withExpand(expand)

            .build();
  }

  /**
   * Get a variation for a document.
   * 
   * @param request The request object
   * @return DocumentVariationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentVariationResponse getKnowledgeKnowledgebaseDocumentVariation(GetKnowledgeKnowledgebaseDocumentVariationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentVariationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentVariationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a variation for a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentVariationResponse> getKnowledgeKnowledgebaseDocumentVariation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentVariationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentVariationResponse> response = (ApiResponse<DocumentVariationResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentVariationResponse> response = (ApiResponse<DocumentVariationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get variations for a document.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param documentState The state of the document. (optional)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @return DocumentVariationResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentVariationResponseListing getKnowledgeKnowledgebaseDocumentVariations(String knowledgeBaseId, String documentId, String before, String after, String pageSize, String documentState, List<String> expand) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseDocumentVariations(createGetKnowledgeKnowledgebaseDocumentVariationsRequest(knowledgeBaseId, documentId, before, after, pageSize, documentState, expand));
  }

  /**
   * Get variations for a document.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param documentState The state of the document. (optional)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @return DocumentVariationResponseListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentVariationResponseListing> getKnowledgeKnowledgebaseDocumentVariationsWithHttpInfo(String knowledgeBaseId, String documentId, String before, String after, String pageSize, String documentState, List<String> expand) throws IOException {
    return getKnowledgeKnowledgebaseDocumentVariations(createGetKnowledgeKnowledgebaseDocumentVariationsRequest(knowledgeBaseId, documentId, before, after, pageSize, documentState, expand).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseDocumentVariationsRequest createGetKnowledgeKnowledgebaseDocumentVariationsRequest(String knowledgeBaseId, String documentId, String before, String after, String pageSize, String documentState, List<String> expand) {
    return GetKnowledgeKnowledgebaseDocumentVariationsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withDocumentState(documentState)

            .withExpand(expand)

            .build();
  }

  /**
   * Get variations for a document.
   * 
   * @param request The request object
   * @return DocumentVariationResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentVariationResponseListing getKnowledgeKnowledgebaseDocumentVariations(GetKnowledgeKnowledgebaseDocumentVariationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentVariationResponseListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentVariationResponseListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get variations for a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentVariationResponseListing> getKnowledgeKnowledgebaseDocumentVariations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentVariationResponseListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentVariationResponseListing> response = (ApiResponse<DocumentVariationResponseListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentVariationResponseListing> response = (ApiResponse<DocumentVariationResponseListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get document version.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param versionId Globally unique identifier for the document version. (required)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @return KnowledgeDocumentVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentVersion getKnowledgeKnowledgebaseDocumentVersion(String knowledgeBaseId, String documentId, String versionId, List<String> expand) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseDocumentVersion(createGetKnowledgeKnowledgebaseDocumentVersionRequest(knowledgeBaseId, documentId, versionId, expand));
  }

  /**
   * Get document version.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param versionId Globally unique identifier for the document version. (required)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @return KnowledgeDocumentVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentVersion> getKnowledgeKnowledgebaseDocumentVersionWithHttpInfo(String knowledgeBaseId, String documentId, String versionId, List<String> expand) throws IOException {
    return getKnowledgeKnowledgebaseDocumentVersion(createGetKnowledgeKnowledgebaseDocumentVersionRequest(knowledgeBaseId, documentId, versionId, expand).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseDocumentVersionRequest createGetKnowledgeKnowledgebaseDocumentVersionRequest(String knowledgeBaseId, String documentId, String versionId, List<String> expand) {
    return GetKnowledgeKnowledgebaseDocumentVersionRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withVersionId(versionId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get document version.
   * 
   * @param request The request object
   * @return KnowledgeDocumentVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentVersion getKnowledgeKnowledgebaseDocumentVersion(GetKnowledgeKnowledgebaseDocumentVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get document version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentVersion> getKnowledgeKnowledgebaseDocumentVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentVersion> response = (ApiResponse<KnowledgeDocumentVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentVersion> response = (ApiResponse<KnowledgeDocumentVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get variation for the given document version.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param versionId Globally unique identifier for the document version. (required)
   * @param variationId Globally unique identifier for the document version variation. (required)
   * @return KnowledgeDocumentVersionVariation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentVersionVariation getKnowledgeKnowledgebaseDocumentVersionVariation(String knowledgeBaseId, String documentId, String versionId, String variationId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseDocumentVersionVariation(createGetKnowledgeKnowledgebaseDocumentVersionVariationRequest(knowledgeBaseId, documentId, versionId, variationId));
  }

  /**
   * Get variation for the given document version.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param versionId Globally unique identifier for the document version. (required)
   * @param variationId Globally unique identifier for the document version variation. (required)
   * @return KnowledgeDocumentVersionVariation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentVersionVariation> getKnowledgeKnowledgebaseDocumentVersionVariationWithHttpInfo(String knowledgeBaseId, String documentId, String versionId, String variationId) throws IOException {
    return getKnowledgeKnowledgebaseDocumentVersionVariation(createGetKnowledgeKnowledgebaseDocumentVersionVariationRequest(knowledgeBaseId, documentId, versionId, variationId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseDocumentVersionVariationRequest createGetKnowledgeKnowledgebaseDocumentVersionVariationRequest(String knowledgeBaseId, String documentId, String versionId, String variationId) {
    return GetKnowledgeKnowledgebaseDocumentVersionVariationRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withVersionId(versionId)

            .withVariationId(variationId)

            .build();
  }

  /**
   * Get variation for the given document version.
   * 
   * @param request The request object
   * @return KnowledgeDocumentVersionVariation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentVersionVariation getKnowledgeKnowledgebaseDocumentVersionVariation(GetKnowledgeKnowledgebaseDocumentVersionVariationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentVersionVariation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentVersionVariation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get variation for the given document version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentVersionVariation> getKnowledgeKnowledgebaseDocumentVersionVariation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentVersionVariation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentVersionVariation> response = (ApiResponse<KnowledgeDocumentVersionVariation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentVersionVariation> response = (ApiResponse<KnowledgeDocumentVersionVariation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get variations for the given document version.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param versionId Globally unique identifier for the document version. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return KnowledgeDocumentVersionVariationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentVersionVariationListing getKnowledgeKnowledgebaseDocumentVersionVariations(String knowledgeBaseId, String documentId, String versionId, String before, String after, String pageSize) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseDocumentVersionVariations(createGetKnowledgeKnowledgebaseDocumentVersionVariationsRequest(knowledgeBaseId, documentId, versionId, before, after, pageSize));
  }

  /**
   * Get variations for the given document version.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param versionId Globally unique identifier for the document version. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @return KnowledgeDocumentVersionVariationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentVersionVariationListing> getKnowledgeKnowledgebaseDocumentVersionVariationsWithHttpInfo(String knowledgeBaseId, String documentId, String versionId, String before, String after, String pageSize) throws IOException {
    return getKnowledgeKnowledgebaseDocumentVersionVariations(createGetKnowledgeKnowledgebaseDocumentVersionVariationsRequest(knowledgeBaseId, documentId, versionId, before, after, pageSize).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseDocumentVersionVariationsRequest createGetKnowledgeKnowledgebaseDocumentVersionVariationsRequest(String knowledgeBaseId, String documentId, String versionId, String before, String after, String pageSize) {
    return GetKnowledgeKnowledgebaseDocumentVersionVariationsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withVersionId(versionId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get variations for the given document version.
   * 
   * @param request The request object
   * @return KnowledgeDocumentVersionVariationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentVersionVariationListing getKnowledgeKnowledgebaseDocumentVersionVariations(GetKnowledgeKnowledgebaseDocumentVersionVariationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentVersionVariationListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentVersionVariationListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get variations for the given document version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentVersionVariationListing> getKnowledgeKnowledgebaseDocumentVersionVariations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentVersionVariationListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentVersionVariationListing> response = (ApiResponse<KnowledgeDocumentVersionVariationListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentVersionVariationListing> response = (ApiResponse<KnowledgeDocumentVersionVariationListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get document versions.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @return KnowledgeDocumentVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentVersionListing getKnowledgeKnowledgebaseDocumentVersions(String knowledgeBaseId, String documentId, String before, String after, String pageSize, List<String> expand) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseDocumentVersions(createGetKnowledgeKnowledgebaseDocumentVersionsRequest(knowledgeBaseId, documentId, before, after, pageSize, expand));
  }

  /**
   * Get document versions.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @return KnowledgeDocumentVersionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentVersionListing> getKnowledgeKnowledgebaseDocumentVersionsWithHttpInfo(String knowledgeBaseId, String documentId, String before, String after, String pageSize, List<String> expand) throws IOException {
    return getKnowledgeKnowledgebaseDocumentVersions(createGetKnowledgeKnowledgebaseDocumentVersionsRequest(knowledgeBaseId, documentId, before, after, pageSize, expand).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseDocumentVersionsRequest createGetKnowledgeKnowledgebaseDocumentVersionsRequest(String knowledgeBaseId, String documentId, String before, String after, String pageSize, List<String> expand) {
    return GetKnowledgeKnowledgebaseDocumentVersionsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withExpand(expand)

            .build();
  }

  /**
   * Get document versions.
   * 
   * @param request The request object
   * @return KnowledgeDocumentVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentVersionListing getKnowledgeKnowledgebaseDocumentVersions(GetKnowledgeKnowledgebaseDocumentVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentVersionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentVersionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get document versions.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentVersionListing> getKnowledgeKnowledgebaseDocumentVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentVersionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentVersionListing> response = (ApiResponse<KnowledgeDocumentVersionListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentVersionListing> response = (ApiResponse<KnowledgeDocumentVersionListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get documents.
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param interval Retrieves the documents modified in specified date and time range. If the after and before cursor parameters are within this interval, it would return valid data, otherwise it throws an error.The dates in the interval are represented in ISO-8601 format: YYYY-MM-DDThh:mm:ssZ/YYYY-MM-DDThh:mm:ssZ (optional)
   * @param documentId Retrieves the specified documents, comma separated values expected. (optional)
   * @param categoryId If specified, retrieves documents associated with category ids, comma separated values expected. (optional)
   * @param includeSubcategories Works along with 'categoryId' query parameter. If specified, retrieves documents associated with category ids and its children categories. (optional)
   * @param includeDrafts If includeDrafts is true, Documents in the draft state are also returned in the response. (optional)
   * @param labelIds If specified, retrieves documents associated with label ids, comma separated values expected. (optional)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @param externalIds If specified, retrieves documents associated with external ids, comma separated values expected. (optional)
   * @return KnowledgeDocumentResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentResponseListing getKnowledgeKnowledgebaseDocuments(String knowledgeBaseId, String before, String after, String pageSize, String interval, List<String> documentId, List<String> categoryId, Boolean includeSubcategories, Boolean includeDrafts, List<String> labelIds, List<String> expand, List<String> externalIds) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseDocuments(createGetKnowledgeKnowledgebaseDocumentsRequest(knowledgeBaseId, before, after, pageSize, interval, documentId, categoryId, includeSubcategories, includeDrafts, labelIds, expand, externalIds));
  }

  /**
   * Get documents.
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param interval Retrieves the documents modified in specified date and time range. If the after and before cursor parameters are within this interval, it would return valid data, otherwise it throws an error.The dates in the interval are represented in ISO-8601 format: YYYY-MM-DDThh:mm:ssZ/YYYY-MM-DDThh:mm:ssZ (optional)
   * @param documentId Retrieves the specified documents, comma separated values expected. (optional)
   * @param categoryId If specified, retrieves documents associated with category ids, comma separated values expected. (optional)
   * @param includeSubcategories Works along with 'categoryId' query parameter. If specified, retrieves documents associated with category ids and its children categories. (optional)
   * @param includeDrafts If includeDrafts is true, Documents in the draft state are also returned in the response. (optional)
   * @param labelIds If specified, retrieves documents associated with label ids, comma separated values expected. (optional)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @param externalIds If specified, retrieves documents associated with external ids, comma separated values expected. (optional)
   * @return KnowledgeDocumentResponseListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentResponseListing> getKnowledgeKnowledgebaseDocumentsWithHttpInfo(String knowledgeBaseId, String before, String after, String pageSize, String interval, List<String> documentId, List<String> categoryId, Boolean includeSubcategories, Boolean includeDrafts, List<String> labelIds, List<String> expand, List<String> externalIds) throws IOException {
    return getKnowledgeKnowledgebaseDocuments(createGetKnowledgeKnowledgebaseDocumentsRequest(knowledgeBaseId, before, after, pageSize, interval, documentId, categoryId, includeSubcategories, includeDrafts, labelIds, expand, externalIds).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseDocumentsRequest createGetKnowledgeKnowledgebaseDocumentsRequest(String knowledgeBaseId, String before, String after, String pageSize, String interval, List<String> documentId, List<String> categoryId, Boolean includeSubcategories, Boolean includeDrafts, List<String> labelIds, List<String> expand, List<String> externalIds) {
    return GetKnowledgeKnowledgebaseDocumentsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withInterval(interval)

            .withDocumentId(documentId)

            .withCategoryId(categoryId)

            .withIncludeSubcategories(includeSubcategories)

            .withIncludeDrafts(includeDrafts)

            .withLabelIds(labelIds)

            .withExpand(expand)

            .withExternalIds(externalIds)

            .build();
  }

  /**
   * Get documents.
   * 
   * @param request The request object
   * @return KnowledgeDocumentResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentResponseListing getKnowledgeKnowledgebaseDocuments(GetKnowledgeKnowledgebaseDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentResponseListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentResponseListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get documents.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentResponseListing> getKnowledgeKnowledgebaseDocuments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentResponseListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentResponseListing> response = (ApiResponse<KnowledgeDocumentResponseListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentResponseListing> response = (ApiResponse<KnowledgeDocumentResponseListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get export job report
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param exportJobId Export job ID (required)
   * @return KnowledgeExportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeExportJobResponse getKnowledgeKnowledgebaseExportJob(String knowledgeBaseId, String exportJobId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseExportJob(createGetKnowledgeKnowledgebaseExportJobRequest(knowledgeBaseId, exportJobId));
  }

  /**
   * Get export job report
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param exportJobId Export job ID (required)
   * @return KnowledgeExportJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeExportJobResponse> getKnowledgeKnowledgebaseExportJobWithHttpInfo(String knowledgeBaseId, String exportJobId) throws IOException {
    return getKnowledgeKnowledgebaseExportJob(createGetKnowledgeKnowledgebaseExportJobRequest(knowledgeBaseId, exportJobId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseExportJobRequest createGetKnowledgeKnowledgebaseExportJobRequest(String knowledgeBaseId, String exportJobId) {
    return GetKnowledgeKnowledgebaseExportJobRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withExportJobId(exportJobId)

            .build();
  }

  /**
   * Get export job report
   * 
   * @param request The request object
   * @return KnowledgeExportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeExportJobResponse getKnowledgeKnowledgebaseExportJob(GetKnowledgeKnowledgebaseExportJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeExportJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeExportJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get export job report
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeExportJobResponse> getKnowledgeKnowledgebaseExportJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeExportJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExportJobResponse> response = (ApiResponse<KnowledgeExportJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExportJobResponse> response = (ApiResponse<KnowledgeExportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get import job report
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param importJobId Import job ID (required)
   * @param expand If expand contains 'urls' downloadURL and failedEntitiesURL will be filled. (optional)
   * @return KnowledgeImportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeImportJobResponse getKnowledgeKnowledgebaseImportJob(String knowledgeBaseId, String importJobId, List<String> expand) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseImportJob(createGetKnowledgeKnowledgebaseImportJobRequest(knowledgeBaseId, importJobId, expand));
  }

  /**
   * Get import job report
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param importJobId Import job ID (required)
   * @param expand If expand contains 'urls' downloadURL and failedEntitiesURL will be filled. (optional)
   * @return KnowledgeImportJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeImportJobResponse> getKnowledgeKnowledgebaseImportJobWithHttpInfo(String knowledgeBaseId, String importJobId, List<String> expand) throws IOException {
    return getKnowledgeKnowledgebaseImportJob(createGetKnowledgeKnowledgebaseImportJobRequest(knowledgeBaseId, importJobId, expand).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseImportJobRequest createGetKnowledgeKnowledgebaseImportJobRequest(String knowledgeBaseId, String importJobId, List<String> expand) {
    return GetKnowledgeKnowledgebaseImportJobRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withImportJobId(importJobId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get import job report
   * 
   * @param request The request object
   * @return KnowledgeImportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeImportJobResponse getKnowledgeKnowledgebaseImportJob(GetKnowledgeKnowledgebaseImportJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeImportJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeImportJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get import job report
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeImportJobResponse> getKnowledgeKnowledgebaseImportJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeImportJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImportJobResponse> response = (ApiResponse<KnowledgeImportJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImportJobResponse> response = (ApiResponse<KnowledgeImportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get label
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param labelId Label ID (required)
   * @return LabelResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LabelResponse getKnowledgeKnowledgebaseLabel(String knowledgeBaseId, String labelId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLabel(createGetKnowledgeKnowledgebaseLabelRequest(knowledgeBaseId, labelId));
  }

  /**
   * Get label
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param labelId Label ID (required)
   * @return LabelResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LabelResponse> getKnowledgeKnowledgebaseLabelWithHttpInfo(String knowledgeBaseId, String labelId) throws IOException {
    return getKnowledgeKnowledgebaseLabel(createGetKnowledgeKnowledgebaseLabelRequest(knowledgeBaseId, labelId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLabelRequest createGetKnowledgeKnowledgebaseLabelRequest(String knowledgeBaseId, String labelId) {
    return GetKnowledgeKnowledgebaseLabelRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLabelId(labelId)

            .build();
  }

  /**
   * Get label
   * 
   * @param request The request object
   * @return LabelResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LabelResponse getKnowledgeKnowledgebaseLabel(GetKnowledgeKnowledgebaseLabelRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LabelResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LabelResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get label
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LabelResponse> getKnowledgeKnowledgebaseLabel(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LabelResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get labels
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param name Filter to return the labels that contains the given phrase in the name. (optional)
   * @param includeDocumentCount If specified, retrieves the number of documents related to label. (optional)
   * @return LabelListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LabelListing getKnowledgeKnowledgebaseLabels(String knowledgeBaseId, String before, String after, String pageSize, String name, Boolean includeDocumentCount) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLabels(createGetKnowledgeKnowledgebaseLabelsRequest(knowledgeBaseId, before, after, pageSize, name, includeDocumentCount));
  }

  /**
   * Get labels
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param name Filter to return the labels that contains the given phrase in the name. (optional)
   * @param includeDocumentCount If specified, retrieves the number of documents related to label. (optional)
   * @return LabelListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LabelListing> getKnowledgeKnowledgebaseLabelsWithHttpInfo(String knowledgeBaseId, String before, String after, String pageSize, String name, Boolean includeDocumentCount) throws IOException {
    return getKnowledgeKnowledgebaseLabels(createGetKnowledgeKnowledgebaseLabelsRequest(knowledgeBaseId, before, after, pageSize, name, includeDocumentCount).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLabelsRequest createGetKnowledgeKnowledgebaseLabelsRequest(String knowledgeBaseId, String before, String after, String pageSize, String name, Boolean includeDocumentCount) {
    return GetKnowledgeKnowledgebaseLabelsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withName(name)

            .withIncludeDocumentCount(includeDocumentCount)

            .build();
  }

  /**
   * Get labels
   * 
   * @param request The request object
   * @return LabelListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LabelListing getKnowledgeKnowledgebaseLabels(GetKnowledgeKnowledgebaseLabelsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LabelListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LabelListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get labels
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LabelListing> getKnowledgeKnowledgebaseLabels(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LabelListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LabelListing> response = (ApiResponse<LabelListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LabelListing> response = (ApiResponse<LabelListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get categories
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param name Filter to return the categories that starts with the given category name. (optional)
   * @return CategoryListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public CategoryListing getKnowledgeKnowledgebaseLanguageCategories(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String name) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageCategories(createGetKnowledgeKnowledgebaseLanguageCategoriesRequest(knowledgeBaseId, languageCode, before, after, limit, pageSize, name));
  }

  /**
   * Get categories
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param name Filter to return the categories that starts with the given category name. (optional)
   * @return CategoryListing
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<CategoryListing> getKnowledgeKnowledgebaseLanguageCategoriesWithHttpInfo(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String name) throws IOException {
    return getKnowledgeKnowledgebaseLanguageCategories(createGetKnowledgeKnowledgebaseLanguageCategoriesRequest(knowledgeBaseId, languageCode, before, after, limit, pageSize, name).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageCategoriesRequest createGetKnowledgeKnowledgebaseLanguageCategoriesRequest(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String name) {
    return GetKnowledgeKnowledgebaseLanguageCategoriesRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withBefore(before)

            .withAfter(after)

            .withLimit(limit)

            .withPageSize(pageSize)

            .withName(name)

            .build();
  }

  /**
   * Get categories
   * 
   * @param request The request object
   * @return CategoryListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public CategoryListing getKnowledgeKnowledgebaseLanguageCategories(GetKnowledgeKnowledgebaseLanguageCategoriesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CategoryListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CategoryListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get categories
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<CategoryListing> getKnowledgeKnowledgebaseLanguageCategories(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CategoryListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryListing> response = (ApiResponse<CategoryListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryListing> response = (ApiResponse<CategoryListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get category
   * 
   * @param categoryId Category ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeExtendedCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeExtendedCategory getKnowledgeKnowledgebaseLanguageCategory(String categoryId, String knowledgeBaseId, String languageCode) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageCategory(createGetKnowledgeKnowledgebaseLanguageCategoryRequest(categoryId, knowledgeBaseId, languageCode));
  }

  /**
   * Get category
   * 
   * @param categoryId Category ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeExtendedCategory
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeExtendedCategory> getKnowledgeKnowledgebaseLanguageCategoryWithHttpInfo(String categoryId, String knowledgeBaseId, String languageCode) throws IOException {
    return getKnowledgeKnowledgebaseLanguageCategory(createGetKnowledgeKnowledgebaseLanguageCategoryRequest(categoryId, knowledgeBaseId, languageCode).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageCategoryRequest createGetKnowledgeKnowledgebaseLanguageCategoryRequest(String categoryId, String knowledgeBaseId, String languageCode) {
    return GetKnowledgeKnowledgebaseLanguageCategoryRequest.builder()
            .withCategoryId(categoryId)

            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Get category
   * 
   * @param request The request object
   * @return KnowledgeExtendedCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeExtendedCategory getKnowledgeKnowledgebaseLanguageCategory(GetKnowledgeKnowledgebaseLanguageCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeExtendedCategory> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeExtendedCategory>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeExtendedCategory> getKnowledgeKnowledgebaseLanguageCategory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeExtendedCategory>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get document
   * 
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeDocument getKnowledgeKnowledgebaseLanguageDocument(String documentId, String knowledgeBaseId, String languageCode) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageDocument(createGetKnowledgeKnowledgebaseLanguageDocumentRequest(documentId, knowledgeBaseId, languageCode));
  }

  /**
   * Get document
   * 
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeDocument
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeDocument> getKnowledgeKnowledgebaseLanguageDocumentWithHttpInfo(String documentId, String knowledgeBaseId, String languageCode) throws IOException {
    return getKnowledgeKnowledgebaseLanguageDocument(createGetKnowledgeKnowledgebaseLanguageDocumentRequest(documentId, knowledgeBaseId, languageCode).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageDocumentRequest createGetKnowledgeKnowledgebaseLanguageDocumentRequest(String documentId, String knowledgeBaseId, String languageCode) {
    return GetKnowledgeKnowledgebaseLanguageDocumentRequest.builder()
            .withDocumentId(documentId)

            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Get document
   * 
   * @param request The request object
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeDocument getKnowledgeKnowledgebaseLanguageDocument(GetKnowledgeKnowledgebaseLanguageDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeDocument> getKnowledgeKnowledgebaseLanguageDocument(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get document content upload status
   * 
   * getKnowledgeKnowledgebaseLanguageDocumentUpload is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param uploadId UploadId (required)
   * @return KnowledgeDocumentContentUpload
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeDocumentContentUpload getKnowledgeKnowledgebaseLanguageDocumentUpload(String documentId, String knowledgeBaseId, String languageCode, String uploadId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageDocumentUpload(createGetKnowledgeKnowledgebaseLanguageDocumentUploadRequest(documentId, knowledgeBaseId, languageCode, uploadId));
  }

  /**
   * Get document content upload status
   * 
   * getKnowledgeKnowledgebaseLanguageDocumentUpload is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param uploadId UploadId (required)
   * @return KnowledgeDocumentContentUpload
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeDocumentContentUpload> getKnowledgeKnowledgebaseLanguageDocumentUploadWithHttpInfo(String documentId, String knowledgeBaseId, String languageCode, String uploadId) throws IOException {
    return getKnowledgeKnowledgebaseLanguageDocumentUpload(createGetKnowledgeKnowledgebaseLanguageDocumentUploadRequest(documentId, knowledgeBaseId, languageCode, uploadId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageDocumentUploadRequest createGetKnowledgeKnowledgebaseLanguageDocumentUploadRequest(String documentId, String knowledgeBaseId, String languageCode, String uploadId) {
    return GetKnowledgeKnowledgebaseLanguageDocumentUploadRequest.builder()
            .withDocumentId(documentId)

            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withUploadId(uploadId)

            .build();
  }

  /**
   * Get document content upload status
   * 
   * getKnowledgeKnowledgebaseLanguageDocumentUpload is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return KnowledgeDocumentContentUpload
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeDocumentContentUpload getKnowledgeKnowledgebaseLanguageDocumentUpload(GetKnowledgeKnowledgebaseLanguageDocumentUploadRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentContentUpload> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentContentUpload>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get document content upload status
   * 
   * getKnowledgeKnowledgebaseLanguageDocumentUpload is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeDocumentContentUpload> getKnowledgeKnowledgebaseLanguageDocumentUpload(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentContentUpload>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentContentUpload> response = (ApiResponse<KnowledgeDocumentContentUpload>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentContentUpload> response = (ApiResponse<KnowledgeDocumentContentUpload>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get documents
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param categories Filter by categories ids, comma separated values expected. (optional)
   * @param title Filter by document title. (optional)
   * @param sortBy Sort by. (optional)
   * @param sortOrder Sort Order. (optional)
   * @param documentIds Comma-separated list of document identifiers to fetch by. (optional)
   * @return DocumentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public DocumentListing getKnowledgeKnowledgebaseLanguageDocuments(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String categories, String title, String sortBy, String sortOrder, List<String> documentIds) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageDocuments(createGetKnowledgeKnowledgebaseLanguageDocumentsRequest(knowledgeBaseId, languageCode, before, after, limit, pageSize, categories, title, sortBy, sortOrder, documentIds));
  }

  /**
   * Get documents
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param categories Filter by categories ids, comma separated values expected. (optional)
   * @param title Filter by document title. (optional)
   * @param sortBy Sort by. (optional)
   * @param sortOrder Sort Order. (optional)
   * @param documentIds Comma-separated list of document identifiers to fetch by. (optional)
   * @return DocumentListing
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<DocumentListing> getKnowledgeKnowledgebaseLanguageDocumentsWithHttpInfo(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String categories, String title, String sortBy, String sortOrder, List<String> documentIds) throws IOException {
    return getKnowledgeKnowledgebaseLanguageDocuments(createGetKnowledgeKnowledgebaseLanguageDocumentsRequest(knowledgeBaseId, languageCode, before, after, limit, pageSize, categories, title, sortBy, sortOrder, documentIds).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageDocumentsRequest createGetKnowledgeKnowledgebaseLanguageDocumentsRequest(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String categories, String title, String sortBy, String sortOrder, List<String> documentIds) {
    return GetKnowledgeKnowledgebaseLanguageDocumentsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withBefore(before)

            .withAfter(after)

            .withLimit(limit)

            .withPageSize(pageSize)

            .withCategories(categories)

            .withTitle(title)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withDocumentIds(documentIds)

            .build();
  }

  /**
   * Get documents
   * 
   * @param request The request object
   * @return DocumentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public DocumentListing getKnowledgeKnowledgebaseLanguageDocuments(GetKnowledgeKnowledgebaseLanguageDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get documents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<DocumentListing> getKnowledgeKnowledgebaseLanguageDocuments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentListing> response = (ApiResponse<DocumentListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentListing> response = (ApiResponse<DocumentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get import operation report
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param importId Import ID (required)
   * @return KnowledgeImport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeImport getKnowledgeKnowledgebaseLanguageDocumentsImport(String knowledgeBaseId, String languageCode, String importId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageDocumentsImport(createGetKnowledgeKnowledgebaseLanguageDocumentsImportRequest(knowledgeBaseId, languageCode, importId));
  }

  /**
   * Get import operation report
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param importId Import ID (required)
   * @return KnowledgeImport
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeImport> getKnowledgeKnowledgebaseLanguageDocumentsImportWithHttpInfo(String knowledgeBaseId, String languageCode, String importId) throws IOException {
    return getKnowledgeKnowledgebaseLanguageDocumentsImport(createGetKnowledgeKnowledgebaseLanguageDocumentsImportRequest(knowledgeBaseId, languageCode, importId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageDocumentsImportRequest createGetKnowledgeKnowledgebaseLanguageDocumentsImportRequest(String knowledgeBaseId, String languageCode, String importId) {
    return GetKnowledgeKnowledgebaseLanguageDocumentsImportRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withImportId(importId)

            .build();
  }

  /**
   * Get import operation report
   * 
   * @param request The request object
   * @return KnowledgeImport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeImport getKnowledgeKnowledgebaseLanguageDocumentsImport(GetKnowledgeKnowledgebaseLanguageDocumentsImportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeImport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeImport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get import operation report
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeImport> getKnowledgeKnowledgebaseLanguageDocumentsImport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeImport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get training detail
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param trainingId Training ID (required)
   * @return KnowledgeTraining
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeTraining getKnowledgeKnowledgebaseLanguageTraining(String knowledgeBaseId, String languageCode, String trainingId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageTraining(createGetKnowledgeKnowledgebaseLanguageTrainingRequest(knowledgeBaseId, languageCode, trainingId));
  }

  /**
   * Get training detail
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param trainingId Training ID (required)
   * @return KnowledgeTraining
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeTraining> getKnowledgeKnowledgebaseLanguageTrainingWithHttpInfo(String knowledgeBaseId, String languageCode, String trainingId) throws IOException {
    return getKnowledgeKnowledgebaseLanguageTraining(createGetKnowledgeKnowledgebaseLanguageTrainingRequest(knowledgeBaseId, languageCode, trainingId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageTrainingRequest createGetKnowledgeKnowledgebaseLanguageTrainingRequest(String knowledgeBaseId, String languageCode, String trainingId) {
    return GetKnowledgeKnowledgebaseLanguageTrainingRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withTrainingId(trainingId)

            .build();
  }

  /**
   * Get training detail
   * 
   * @param request The request object
   * @return KnowledgeTraining
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeTraining getKnowledgeKnowledgebaseLanguageTraining(GetKnowledgeKnowledgebaseLanguageTrainingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeTraining> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeTraining>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get training detail
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeTraining> getKnowledgeKnowledgebaseLanguageTraining(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeTraining>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all trainings information for a knowledgebase
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param knowledgeDocumentsState Return the training with the specified state of the trained documents. (optional)
   * @return TrainingListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public TrainingListing getKnowledgeKnowledgebaseLanguageTrainings(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String knowledgeDocumentsState) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageTrainings(createGetKnowledgeKnowledgebaseLanguageTrainingsRequest(knowledgeBaseId, languageCode, before, after, limit, pageSize, knowledgeDocumentsState));
  }

  /**
   * Get all trainings information for a knowledgebase
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param knowledgeDocumentsState Return the training with the specified state of the trained documents. (optional)
   * @return TrainingListing
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<TrainingListing> getKnowledgeKnowledgebaseLanguageTrainingsWithHttpInfo(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String knowledgeDocumentsState) throws IOException {
    return getKnowledgeKnowledgebaseLanguageTrainings(createGetKnowledgeKnowledgebaseLanguageTrainingsRequest(knowledgeBaseId, languageCode, before, after, limit, pageSize, knowledgeDocumentsState).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageTrainingsRequest createGetKnowledgeKnowledgebaseLanguageTrainingsRequest(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String knowledgeDocumentsState) {
    return GetKnowledgeKnowledgebaseLanguageTrainingsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withBefore(before)

            .withAfter(after)

            .withLimit(limit)

            .withPageSize(pageSize)

            .withKnowledgeDocumentsState(knowledgeDocumentsState)

            .build();
  }

  /**
   * Get all trainings information for a knowledgebase
   * 
   * @param request The request object
   * @return TrainingListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public TrainingListing getKnowledgeKnowledgebaseLanguageTrainings(GetKnowledgeKnowledgebaseLanguageTrainingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrainingListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrainingListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all trainings information for a knowledgebase
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<TrainingListing> getKnowledgeKnowledgebaseLanguageTrainings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrainingListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrainingListing> response = (ApiResponse<TrainingListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TrainingListing> response = (ApiResponse<TrainingListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get operations
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param userId If specified, retrieves operations associated with user ids, comma separated values expected. (optional)
   * @param type If specified, retrieves operations with specified operation type, comma separated values expected. (optional)
   * @param status If specified, retrieves operations with specified operation status, comma separated values expected. (optional)
   * @param interval Retrieves the operations modified in specified date and time range. If the after and before cursor parameters are within this interval, it would return valid data, otherwise it throws an error.The dates in the interval are represented in ISO-8601 format: YYYY-MM-DDThh:mm:ssZ/YYYY-MM-DDThh:mm:ssZ (optional)
   * @param sourceId If specified, retrieves operations associated with source ids, comma separated values expected. (optional)
   * @return OperationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OperationListing getKnowledgeKnowledgebaseOperations(String knowledgeBaseId, String before, String after, String pageSize, List<String> userId, List<String> type, List<String> status, String interval, List<String> sourceId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseOperations(createGetKnowledgeKnowledgebaseOperationsRequest(knowledgeBaseId, before, after, pageSize, userId, type, status, interval, sourceId));
  }

  /**
   * Get operations
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param userId If specified, retrieves operations associated with user ids, comma separated values expected. (optional)
   * @param type If specified, retrieves operations with specified operation type, comma separated values expected. (optional)
   * @param status If specified, retrieves operations with specified operation status, comma separated values expected. (optional)
   * @param interval Retrieves the operations modified in specified date and time range. If the after and before cursor parameters are within this interval, it would return valid data, otherwise it throws an error.The dates in the interval are represented in ISO-8601 format: YYYY-MM-DDThh:mm:ssZ/YYYY-MM-DDThh:mm:ssZ (optional)
   * @param sourceId If specified, retrieves operations associated with source ids, comma separated values expected. (optional)
   * @return OperationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OperationListing> getKnowledgeKnowledgebaseOperationsWithHttpInfo(String knowledgeBaseId, String before, String after, String pageSize, List<String> userId, List<String> type, List<String> status, String interval, List<String> sourceId) throws IOException {
    return getKnowledgeKnowledgebaseOperations(createGetKnowledgeKnowledgebaseOperationsRequest(knowledgeBaseId, before, after, pageSize, userId, type, status, interval, sourceId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseOperationsRequest createGetKnowledgeKnowledgebaseOperationsRequest(String knowledgeBaseId, String before, String after, String pageSize, List<String> userId, List<String> type, List<String> status, String interval, List<String> sourceId) {
    return GetKnowledgeKnowledgebaseOperationsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withUserId(userId)

            .withType(type)

            .withStatus(status)

            .withInterval(interval)

            .withSourceId(sourceId)

            .build();
  }

  /**
   * Get operations
   * 
   * @param request The request object
   * @return OperationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OperationListing getKnowledgeKnowledgebaseOperations(GetKnowledgeKnowledgebaseOperationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OperationListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OperationListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get operations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OperationListing> getKnowledgeKnowledgebaseOperations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OperationListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OperationListing> response = (ApiResponse<OperationListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OperationListing> response = (ApiResponse<OperationListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get ids of operation creator users and oauth clients
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @return OperationCreatorUserResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OperationCreatorUserResponse getKnowledgeKnowledgebaseOperationsUsersQuery(String knowledgeBaseId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseOperationsUsersQuery(createGetKnowledgeKnowledgebaseOperationsUsersQueryRequest(knowledgeBaseId));
  }

  /**
   * Get ids of operation creator users and oauth clients
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @return OperationCreatorUserResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OperationCreatorUserResponse> getKnowledgeKnowledgebaseOperationsUsersQueryWithHttpInfo(String knowledgeBaseId) throws IOException {
    return getKnowledgeKnowledgebaseOperationsUsersQuery(createGetKnowledgeKnowledgebaseOperationsUsersQueryRequest(knowledgeBaseId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseOperationsUsersQueryRequest createGetKnowledgeKnowledgebaseOperationsUsersQueryRequest(String knowledgeBaseId) {
    return GetKnowledgeKnowledgebaseOperationsUsersQueryRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .build();
  }

  /**
   * Get ids of operation creator users and oauth clients
   * 
   * @param request The request object
   * @return OperationCreatorUserResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OperationCreatorUserResponse getKnowledgeKnowledgebaseOperationsUsersQuery(GetKnowledgeKnowledgebaseOperationsUsersQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OperationCreatorUserResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OperationCreatorUserResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get ids of operation creator users and oauth clients
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OperationCreatorUserResponse> getKnowledgeKnowledgebaseOperationsUsersQuery(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OperationCreatorUserResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OperationCreatorUserResponse> response = (ApiResponse<OperationCreatorUserResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OperationCreatorUserResponse> response = (ApiResponse<OperationCreatorUserResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get parse job report
   * 
   * getKnowledgeKnowledgebaseParseJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param parseJobId Parse job ID (required)
   * @param expand If expand contains 'urls' downloadURL and failedEntitiesURL will be filled. (optional)
   * @return KnowledgeParseJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeParseJobResponse getKnowledgeKnowledgebaseParseJob(String knowledgeBaseId, String parseJobId, List<String> expand) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseParseJob(createGetKnowledgeKnowledgebaseParseJobRequest(knowledgeBaseId, parseJobId, expand));
  }

  /**
   * Get parse job report
   * 
   * getKnowledgeKnowledgebaseParseJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param parseJobId Parse job ID (required)
   * @param expand If expand contains 'urls' downloadURL and failedEntitiesURL will be filled. (optional)
   * @return KnowledgeParseJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeParseJobResponse> getKnowledgeKnowledgebaseParseJobWithHttpInfo(String knowledgeBaseId, String parseJobId, List<String> expand) throws IOException {
    return getKnowledgeKnowledgebaseParseJob(createGetKnowledgeKnowledgebaseParseJobRequest(knowledgeBaseId, parseJobId, expand).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseParseJobRequest createGetKnowledgeKnowledgebaseParseJobRequest(String knowledgeBaseId, String parseJobId, List<String> expand) {
    return GetKnowledgeKnowledgebaseParseJobRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withParseJobId(parseJobId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get parse job report
   * 
   * getKnowledgeKnowledgebaseParseJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return KnowledgeParseJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeParseJobResponse getKnowledgeKnowledgebaseParseJob(GetKnowledgeKnowledgebaseParseJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeParseJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeParseJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get parse job report
   * 
   * getKnowledgeKnowledgebaseParseJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeParseJobResponse> getKnowledgeKnowledgebaseParseJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeParseJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeParseJobResponse> response = (ApiResponse<KnowledgeParseJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeParseJobResponse> response = (ApiResponse<KnowledgeParseJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Knowledge integration sources
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param type If specified, retrieves integration sources with specified integration type. (optional)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @param ids If specified, retrieves integration sources with specified IDs. (optional)
   * @return List<SourceBaseResponse>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<SourceBaseResponse> getKnowledgeKnowledgebaseSources(String knowledgeBaseId, String type, List<String> expand, List<String> ids) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseSources(createGetKnowledgeKnowledgebaseSourcesRequest(knowledgeBaseId, type, expand, ids));
  }

  /**
   * Get Knowledge integration sources
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param type If specified, retrieves integration sources with specified integration type. (optional)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @param ids If specified, retrieves integration sources with specified IDs. (optional)
   * @return List<SourceBaseResponse>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<SourceBaseResponse>> getKnowledgeKnowledgebaseSourcesWithHttpInfo(String knowledgeBaseId, String type, List<String> expand, List<String> ids) throws IOException {
    return getKnowledgeKnowledgebaseSources(createGetKnowledgeKnowledgebaseSourcesRequest(knowledgeBaseId, type, expand, ids).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseSourcesRequest createGetKnowledgeKnowledgebaseSourcesRequest(String knowledgeBaseId, String type, List<String> expand, List<String> ids) {
    return GetKnowledgeKnowledgebaseSourcesRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withType(type)

            .withExpand(expand)

            .withIds(ids)

            .build();
  }

  /**
   * Get Knowledge integration sources
   * 
   * @param request The request object
   * @return List<SourceBaseResponse>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<SourceBaseResponse> getKnowledgeKnowledgebaseSources(GetKnowledgeKnowledgebaseSourcesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<SourceBaseResponse>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<SourceBaseResponse>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Knowledge integration sources
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<SourceBaseResponse>> getKnowledgeKnowledgebaseSources(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<SourceBaseResponse>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<SourceBaseResponse>> response = (ApiResponse<List<SourceBaseResponse>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<SourceBaseResponse>> response = (ApiResponse<List<SourceBaseResponse>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Salesforce Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @return SalesforceSourceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SalesforceSourceResponse getKnowledgeKnowledgebaseSourcesSalesforceSourceId(String knowledgeBaseId, String sourceId, List<String> expand) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseSourcesSalesforceSourceId(createGetKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest(knowledgeBaseId, sourceId, expand));
  }

  /**
   * Get Salesforce Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @return SalesforceSourceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SalesforceSourceResponse> getKnowledgeKnowledgebaseSourcesSalesforceSourceIdWithHttpInfo(String knowledgeBaseId, String sourceId, List<String> expand) throws IOException {
    return getKnowledgeKnowledgebaseSourcesSalesforceSourceId(createGetKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest(knowledgeBaseId, sourceId, expand).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest createGetKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest(String knowledgeBaseId, String sourceId, List<String> expand) {
    return GetKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withSourceId(sourceId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get Salesforce Knowledge integration source
   * 
   * @param request The request object
   * @return SalesforceSourceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SalesforceSourceResponse getKnowledgeKnowledgebaseSourcesSalesforceSourceId(GetKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SalesforceSourceResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SalesforceSourceResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Salesforce Knowledge integration source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SalesforceSourceResponse> getKnowledgeKnowledgebaseSourcesSalesforceSourceId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SalesforceSourceResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SalesforceSourceResponse> response = (ApiResponse<SalesforceSourceResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SalesforceSourceResponse> response = (ApiResponse<SalesforceSourceResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get ServiceNow Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @return ServiceNowSourceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceNowSourceResponse getKnowledgeKnowledgebaseSourcesServicenowSourceId(String knowledgeBaseId, String sourceId, List<String> expand) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseSourcesServicenowSourceId(createGetKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest(knowledgeBaseId, sourceId, expand));
  }

  /**
   * Get ServiceNow Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @param expand The specified entity attributes will be filled. Comma separated values expected. (optional)
   * @return ServiceNowSourceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceNowSourceResponse> getKnowledgeKnowledgebaseSourcesServicenowSourceIdWithHttpInfo(String knowledgeBaseId, String sourceId, List<String> expand) throws IOException {
    return getKnowledgeKnowledgebaseSourcesServicenowSourceId(createGetKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest(knowledgeBaseId, sourceId, expand).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest createGetKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest(String knowledgeBaseId, String sourceId, List<String> expand) {
    return GetKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withSourceId(sourceId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get ServiceNow Knowledge integration source
   * 
   * @param request The request object
   * @return ServiceNowSourceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceNowSourceResponse getKnowledgeKnowledgebaseSourcesServicenowSourceId(GetKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ServiceNowSourceResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ServiceNowSourceResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get ServiceNow Knowledge integration source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceNowSourceResponse> getKnowledgeKnowledgebaseSourcesServicenowSourceId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ServiceNowSourceResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceNowSourceResponse> response = (ApiResponse<ServiceNowSourceResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceNowSourceResponse> response = (ApiResponse<ServiceNowSourceResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get synchronization job report
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param syncJobId Synchronization job ID (required)
   * @return KnowledgeSyncJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSyncJobResponse getKnowledgeKnowledgebaseSynchronizeJob(String knowledgeBaseId, String syncJobId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseSynchronizeJob(createGetKnowledgeKnowledgebaseSynchronizeJobRequest(knowledgeBaseId, syncJobId));
  }

  /**
   * Get synchronization job report
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param syncJobId Synchronization job ID (required)
   * @return KnowledgeSyncJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSyncJobResponse> getKnowledgeKnowledgebaseSynchronizeJobWithHttpInfo(String knowledgeBaseId, String syncJobId) throws IOException {
    return getKnowledgeKnowledgebaseSynchronizeJob(createGetKnowledgeKnowledgebaseSynchronizeJobRequest(knowledgeBaseId, syncJobId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseSynchronizeJobRequest createGetKnowledgeKnowledgebaseSynchronizeJobRequest(String knowledgeBaseId, String syncJobId) {
    return GetKnowledgeKnowledgebaseSynchronizeJobRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withSyncJobId(syncJobId)

            .build();
  }

  /**
   * Get synchronization job report
   * 
   * @param request The request object
   * @return KnowledgeSyncJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSyncJobResponse getKnowledgeKnowledgebaseSynchronizeJob(GetKnowledgeKnowledgebaseSynchronizeJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeSyncJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeSyncJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get synchronization job report
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSyncJobResponse> getKnowledgeKnowledgebaseSynchronizeJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeSyncJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get knowledge base unanswered group for a particular groupId
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param groupId The ID of the group to be retrieved. (required)
   * @param app The app value to be used for filtering phrases. (optional)
   * @param dateStart The start date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd The end date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return UnansweredGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnansweredGroup getKnowledgeKnowledgebaseUnansweredGroup(String knowledgeBaseId, String groupId, String app, LocalDate dateStart, LocalDate dateEnd) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseUnansweredGroup(createGetKnowledgeKnowledgebaseUnansweredGroupRequest(knowledgeBaseId, groupId, app, dateStart, dateEnd));
  }

  /**
   * Get knowledge base unanswered group for a particular groupId
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param groupId The ID of the group to be retrieved. (required)
   * @param app The app value to be used for filtering phrases. (optional)
   * @param dateStart The start date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd The end date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return UnansweredGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnansweredGroup> getKnowledgeKnowledgebaseUnansweredGroupWithHttpInfo(String knowledgeBaseId, String groupId, String app, LocalDate dateStart, LocalDate dateEnd) throws IOException {
    return getKnowledgeKnowledgebaseUnansweredGroup(createGetKnowledgeKnowledgebaseUnansweredGroupRequest(knowledgeBaseId, groupId, app, dateStart, dateEnd).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseUnansweredGroupRequest createGetKnowledgeKnowledgebaseUnansweredGroupRequest(String knowledgeBaseId, String groupId, String app, LocalDate dateStart, LocalDate dateEnd) {
    return GetKnowledgeKnowledgebaseUnansweredGroupRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withGroupId(groupId)

            .withApp(app)

            .withDateStart(dateStart)

            .withDateEnd(dateEnd)

            .build();
  }

  /**
   * Get knowledge base unanswered group for a particular groupId
   * 
   * @param request The request object
   * @return UnansweredGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnansweredGroup getKnowledgeKnowledgebaseUnansweredGroup(GetKnowledgeKnowledgebaseUnansweredGroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UnansweredGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UnansweredGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get knowledge base unanswered group for a particular groupId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnansweredGroup> getKnowledgeKnowledgebaseUnansweredGroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UnansweredGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UnansweredGroup> response = (ApiResponse<UnansweredGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UnansweredGroup> response = (ApiResponse<UnansweredGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get knowledge base unanswered phrase group for a particular phraseGroupId
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param groupId The ID of the group to be retrieved. (required)
   * @param phraseGroupId The ID of the phraseGroup to be retrieved. (required)
   * @param app The app value to be used for filtering phrases. (optional)
   * @param dateStart The start date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd The end date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return UnansweredPhraseGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnansweredPhraseGroup getKnowledgeKnowledgebaseUnansweredGroupPhrasegroup(String knowledgeBaseId, String groupId, String phraseGroupId, String app, LocalDate dateStart, LocalDate dateEnd) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseUnansweredGroupPhrasegroup(createGetKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest(knowledgeBaseId, groupId, phraseGroupId, app, dateStart, dateEnd));
  }

  /**
   * Get knowledge base unanswered phrase group for a particular phraseGroupId
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param groupId The ID of the group to be retrieved. (required)
   * @param phraseGroupId The ID of the phraseGroup to be retrieved. (required)
   * @param app The app value to be used for filtering phrases. (optional)
   * @param dateStart The start date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd The end date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return UnansweredPhraseGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnansweredPhraseGroup> getKnowledgeKnowledgebaseUnansweredGroupPhrasegroupWithHttpInfo(String knowledgeBaseId, String groupId, String phraseGroupId, String app, LocalDate dateStart, LocalDate dateEnd) throws IOException {
    return getKnowledgeKnowledgebaseUnansweredGroupPhrasegroup(createGetKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest(knowledgeBaseId, groupId, phraseGroupId, app, dateStart, dateEnd).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest createGetKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest(String knowledgeBaseId, String groupId, String phraseGroupId, String app, LocalDate dateStart, LocalDate dateEnd) {
    return GetKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withGroupId(groupId)

            .withPhraseGroupId(phraseGroupId)

            .withApp(app)

            .withDateStart(dateStart)

            .withDateEnd(dateEnd)

            .build();
  }

  /**
   * Get knowledge base unanswered phrase group for a particular phraseGroupId
   * 
   * @param request The request object
   * @return UnansweredPhraseGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnansweredPhraseGroup getKnowledgeKnowledgebaseUnansweredGroupPhrasegroup(GetKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UnansweredPhraseGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UnansweredPhraseGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get knowledge base unanswered phrase group for a particular phraseGroupId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnansweredPhraseGroup> getKnowledgeKnowledgebaseUnansweredGroupPhrasegroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UnansweredPhraseGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UnansweredPhraseGroup> response = (ApiResponse<UnansweredPhraseGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UnansweredPhraseGroup> response = (ApiResponse<UnansweredPhraseGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get knowledge base unanswered groups
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param app The app value to be used for filtering phrases. (optional)
   * @param dateStart The start date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd The end date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return UnansweredGroups
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnansweredGroups getKnowledgeKnowledgebaseUnansweredGroups(String knowledgeBaseId, String app, LocalDate dateStart, LocalDate dateEnd) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseUnansweredGroups(createGetKnowledgeKnowledgebaseUnansweredGroupsRequest(knowledgeBaseId, app, dateStart, dateEnd));
  }

  /**
   * Get knowledge base unanswered groups
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param app The app value to be used for filtering phrases. (optional)
   * @param dateStart The start date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd The end date to be used for filtering phrases. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return UnansweredGroups
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnansweredGroups> getKnowledgeKnowledgebaseUnansweredGroupsWithHttpInfo(String knowledgeBaseId, String app, LocalDate dateStart, LocalDate dateEnd) throws IOException {
    return getKnowledgeKnowledgebaseUnansweredGroups(createGetKnowledgeKnowledgebaseUnansweredGroupsRequest(knowledgeBaseId, app, dateStart, dateEnd).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseUnansweredGroupsRequest createGetKnowledgeKnowledgebaseUnansweredGroupsRequest(String knowledgeBaseId, String app, LocalDate dateStart, LocalDate dateEnd) {
    return GetKnowledgeKnowledgebaseUnansweredGroupsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withApp(app)

            .withDateStart(dateStart)

            .withDateEnd(dateEnd)

            .build();
  }

  /**
   * Get knowledge base unanswered groups
   * 
   * @param request The request object
   * @return UnansweredGroups
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnansweredGroups getKnowledgeKnowledgebaseUnansweredGroups(GetKnowledgeKnowledgebaseUnansweredGroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UnansweredGroups> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UnansweredGroups>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get knowledge base unanswered groups
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnansweredGroups> getKnowledgeKnowledgebaseUnansweredGroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UnansweredGroups>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UnansweredGroups> response = (ApiResponse<UnansweredGroups>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UnansweredGroups> response = (ApiResponse<UnansweredGroups>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get content upload from URL job status
   * 
   * getKnowledgeKnowledgebaseUploadsUrlsJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param jobId Upload job ID (required)
   * @return GetUploadSourceUrlJobStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetUploadSourceUrlJobStatusResponse getKnowledgeKnowledgebaseUploadsUrlsJob(String knowledgeBaseId, String jobId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseUploadsUrlsJob(createGetKnowledgeKnowledgebaseUploadsUrlsJobRequest(knowledgeBaseId, jobId));
  }

  /**
   * Get content upload from URL job status
   * 
   * getKnowledgeKnowledgebaseUploadsUrlsJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param jobId Upload job ID (required)
   * @return GetUploadSourceUrlJobStatusResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetUploadSourceUrlJobStatusResponse> getKnowledgeKnowledgebaseUploadsUrlsJobWithHttpInfo(String knowledgeBaseId, String jobId) throws IOException {
    return getKnowledgeKnowledgebaseUploadsUrlsJob(createGetKnowledgeKnowledgebaseUploadsUrlsJobRequest(knowledgeBaseId, jobId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseUploadsUrlsJobRequest createGetKnowledgeKnowledgebaseUploadsUrlsJobRequest(String knowledgeBaseId, String jobId) {
    return GetKnowledgeKnowledgebaseUploadsUrlsJobRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withJobId(jobId)

            .build();
  }

  /**
   * Get content upload from URL job status
   * 
   * getKnowledgeKnowledgebaseUploadsUrlsJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return GetUploadSourceUrlJobStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetUploadSourceUrlJobStatusResponse getKnowledgeKnowledgebaseUploadsUrlsJob(GetKnowledgeKnowledgebaseUploadsUrlsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetUploadSourceUrlJobStatusResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetUploadSourceUrlJobStatusResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get content upload from URL job status
   * 
   * getKnowledgeKnowledgebaseUploadsUrlsJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetUploadSourceUrlJobStatusResponse> getKnowledgeKnowledgebaseUploadsUrlsJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetUploadSourceUrlJobStatusResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetUploadSourceUrlJobStatusResponse> response = (ApiResponse<GetUploadSourceUrlJobStatusResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GetUploadSourceUrlJobStatusResponse> response = (ApiResponse<GetUploadSourceUrlJobStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get knowledge bases
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 100. Deprecated in favour of pageSize (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @param name Filter by Name. (optional)
   * @param coreLanguage Filter by core language. (optional)
   * @param published Filter by published status. (optional)
   * @param sortBy Sort by. (optional)
   * @param sortOrder Sort Order. (optional)
   * @return KnowledgeBaseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBaseListing getKnowledgeKnowledgebases(String before, String after, String limit, String pageSize, String name, String coreLanguage, Boolean published, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getKnowledgeKnowledgebases(createGetKnowledgeKnowledgebasesRequest(before, after, limit, pageSize, name, coreLanguage, published, sortBy, sortOrder));
  }

  /**
   * Get knowledge bases
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 100. Deprecated in favour of pageSize (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @param name Filter by Name. (optional)
   * @param coreLanguage Filter by core language. (optional)
   * @param published Filter by published status. (optional)
   * @param sortBy Sort by. (optional)
   * @param sortOrder Sort Order. (optional)
   * @return KnowledgeBaseListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBaseListing> getKnowledgeKnowledgebasesWithHttpInfo(String before, String after, String limit, String pageSize, String name, String coreLanguage, Boolean published, String sortBy, String sortOrder) throws IOException {
    return getKnowledgeKnowledgebases(createGetKnowledgeKnowledgebasesRequest(before, after, limit, pageSize, name, coreLanguage, published, sortBy, sortOrder).withHttpInfo());
  }

  private GetKnowledgeKnowledgebasesRequest createGetKnowledgeKnowledgebasesRequest(String before, String after, String limit, String pageSize, String name, String coreLanguage, Boolean published, String sortBy, String sortOrder) {
    return GetKnowledgeKnowledgebasesRequest.builder()
            .withBefore(before)

            .withAfter(after)

            .withLimit(limit)

            .withPageSize(pageSize)

            .withName(name)

            .withCoreLanguage(coreLanguage)

            .withPublished(published)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get knowledge bases
   * 
   * @param request The request object
   * @return KnowledgeBaseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBaseListing getKnowledgeKnowledgebases(GetKnowledgeKnowledgebasesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeBaseListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeBaseListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get knowledge bases
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBaseListing> getKnowledgeKnowledgebases(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeBaseListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBaseListing> response = (ApiResponse<KnowledgeBaseListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBaseListing> response = (ApiResponse<KnowledgeBaseListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update search result.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param searchId Search Result ID (required)
   * @param body  (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchKnowledgeGuestSessionDocumentsSearchSearchId(String sessionId, String searchId, SearchUpdateRequest body) throws IOException, ApiException {
     patchKnowledgeGuestSessionDocumentsSearchSearchId(createPatchKnowledgeGuestSessionDocumentsSearchSearchIdRequest(sessionId, searchId, body));
  }

  /**
   * Update search result.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param searchId Search Result ID (required)
   * @param body  (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchKnowledgeGuestSessionDocumentsSearchSearchIdWithHttpInfo(String sessionId, String searchId, SearchUpdateRequest body) throws IOException {
    return patchKnowledgeGuestSessionDocumentsSearchSearchId(createPatchKnowledgeGuestSessionDocumentsSearchSearchIdRequest(sessionId, searchId, body).withHttpInfo());
  }

  private PatchKnowledgeGuestSessionDocumentsSearchSearchIdRequest createPatchKnowledgeGuestSessionDocumentsSearchSearchIdRequest(String sessionId, String searchId, SearchUpdateRequest body) {
    return PatchKnowledgeGuestSessionDocumentsSearchSearchIdRequest.builder()
            .withSessionId(sessionId)

            .withSearchId(searchId)

            .withBody(body)

            .build();
  }

  /**
   * Update search result.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchKnowledgeGuestSessionDocumentsSearchSearchId(PatchKnowledgeGuestSessionDocumentsSearchSearchIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update search result.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchKnowledgeGuestSessionDocumentsSearchSearchId(ApiRequest<SearchUpdateRequest> request) throws IOException {
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
   * Update knowledge base
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase patchKnowledgeKnowledgebase(String knowledgeBaseId, KnowledgeBaseUpdateRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebase(createPatchKnowledgeKnowledgebaseRequest(knowledgeBaseId, body));
  }

  /**
   * Update knowledge base
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> patchKnowledgeKnowledgebaseWithHttpInfo(String knowledgeBaseId, KnowledgeBaseUpdateRequest body) throws IOException {
    return patchKnowledgeKnowledgebase(createPatchKnowledgeKnowledgebaseRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseRequest createPatchKnowledgeKnowledgebaseRequest(String knowledgeBaseId, KnowledgeBaseUpdateRequest body) {
    return PatchKnowledgeKnowledgebaseRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Update knowledge base
   * 
   * @param request The request object
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase patchKnowledgeKnowledgebase(PatchKnowledgeKnowledgebaseRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update knowledge base
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> patchKnowledgeKnowledgebase(ApiRequest<KnowledgeBaseUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update category
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param categoryId Category ID (required)
   * @param body  (required)
   * @return CategoryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryResponse patchKnowledgeKnowledgebaseCategory(String knowledgeBaseId, String categoryId, CategoryUpdateRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseCategory(createPatchKnowledgeKnowledgebaseCategoryRequest(knowledgeBaseId, categoryId, body));
  }

  /**
   * Update category
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param categoryId Category ID (required)
   * @param body  (required)
   * @return CategoryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryResponse> patchKnowledgeKnowledgebaseCategoryWithHttpInfo(String knowledgeBaseId, String categoryId, CategoryUpdateRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseCategory(createPatchKnowledgeKnowledgebaseCategoryRequest(knowledgeBaseId, categoryId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseCategoryRequest createPatchKnowledgeKnowledgebaseCategoryRequest(String knowledgeBaseId, String categoryId, CategoryUpdateRequest body) {
    return PatchKnowledgeKnowledgebaseCategoryRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withCategoryId(categoryId)

            .withBody(body)

            .build();
  }

  /**
   * Update category
   * 
   * @param request The request object
   * @return CategoryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryResponse patchKnowledgeKnowledgebaseCategory(PatchKnowledgeKnowledgebaseCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CategoryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CategoryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryResponse> patchKnowledgeKnowledgebaseCategory(ApiRequest<CategoryUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CategoryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update document.
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param body  (required)
   * @return KnowledgeDocumentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentResponse patchKnowledgeKnowledgebaseDocument(String knowledgeBaseId, String documentId, KnowledgeDocumentReq body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseDocument(createPatchKnowledgeKnowledgebaseDocumentRequest(knowledgeBaseId, documentId, body));
  }

  /**
   * Update document.
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param body  (required)
   * @return KnowledgeDocumentResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentResponse> patchKnowledgeKnowledgebaseDocumentWithHttpInfo(String knowledgeBaseId, String documentId, KnowledgeDocumentReq body) throws IOException {
    return patchKnowledgeKnowledgebaseDocument(createPatchKnowledgeKnowledgebaseDocumentRequest(knowledgeBaseId, documentId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseDocumentRequest createPatchKnowledgeKnowledgebaseDocumentRequest(String knowledgeBaseId, String documentId, KnowledgeDocumentReq body) {
    return PatchKnowledgeKnowledgebaseDocumentRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withBody(body)

            .build();
  }

  /**
   * Update document.
   * 
   * @param request The request object
   * @return KnowledgeDocumentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentResponse patchKnowledgeKnowledgebaseDocument(PatchKnowledgeKnowledgebaseDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentResponse> patchKnowledgeKnowledgebaseDocument(ApiRequest<KnowledgeDocumentReq> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentResponse> response = (ApiResponse<KnowledgeDocumentResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentResponse> response = (ApiResponse<KnowledgeDocumentResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update feedback on a document
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param feedbackId Feedback ID. (required)
   * @param body  (optional)
   * @return KnowledgeDocumentFeedbackResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentFeedbackResponse patchKnowledgeKnowledgebaseDocumentFeedbackFeedbackId(String knowledgeBaseId, String documentId, String feedbackId, KnowledgeDocumentFeedbackUpdateRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseDocumentFeedbackFeedbackId(createPatchKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest(knowledgeBaseId, documentId, feedbackId, body));
  }

  /**
   * Update feedback on a document
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param feedbackId Feedback ID. (required)
   * @param body  (optional)
   * @return KnowledgeDocumentFeedbackResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentFeedbackResponse> patchKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdWithHttpInfo(String knowledgeBaseId, String documentId, String feedbackId, KnowledgeDocumentFeedbackUpdateRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseDocumentFeedbackFeedbackId(createPatchKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest(knowledgeBaseId, documentId, feedbackId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest createPatchKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest(String knowledgeBaseId, String documentId, String feedbackId, KnowledgeDocumentFeedbackUpdateRequest body) {
    return PatchKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withFeedbackId(feedbackId)

            .withBody(body)

            .build();
  }

  /**
   * Update feedback on a document
   * 
   * @param request The request object
   * @return KnowledgeDocumentFeedbackResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentFeedbackResponse patchKnowledgeKnowledgebaseDocumentFeedbackFeedbackId(PatchKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentFeedbackResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentFeedbackResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update feedback on a document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentFeedbackResponse> patchKnowledgeKnowledgebaseDocumentFeedbackFeedbackId(ApiRequest<KnowledgeDocumentFeedbackUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentFeedbackResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentFeedbackResponse> response = (ApiResponse<KnowledgeDocumentFeedbackResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentFeedbackResponse> response = (ApiResponse<KnowledgeDocumentFeedbackResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a variation for a document.
   * 
   * @param documentVariationId Globally unique identifier for a document variation. (required)
   * @param documentId Globally unique identifier for a document. (required)
   * @param knowledgeBaseId Globally unique identifier for a knowledge base. (required)
   * @param body  (required)
   * @return DocumentVariationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentVariationResponse patchKnowledgeKnowledgebaseDocumentVariation(String documentVariationId, String documentId, String knowledgeBaseId, DocumentVariationRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseDocumentVariation(createPatchKnowledgeKnowledgebaseDocumentVariationRequest(documentVariationId, documentId, knowledgeBaseId, body));
  }

  /**
   * Update a variation for a document.
   * 
   * @param documentVariationId Globally unique identifier for a document variation. (required)
   * @param documentId Globally unique identifier for a document. (required)
   * @param knowledgeBaseId Globally unique identifier for a knowledge base. (required)
   * @param body  (required)
   * @return DocumentVariationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentVariationResponse> patchKnowledgeKnowledgebaseDocumentVariationWithHttpInfo(String documentVariationId, String documentId, String knowledgeBaseId, DocumentVariationRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseDocumentVariation(createPatchKnowledgeKnowledgebaseDocumentVariationRequest(documentVariationId, documentId, knowledgeBaseId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseDocumentVariationRequest createPatchKnowledgeKnowledgebaseDocumentVariationRequest(String documentVariationId, String documentId, String knowledgeBaseId, DocumentVariationRequest body) {
    return PatchKnowledgeKnowledgebaseDocumentVariationRequest.builder()
            .withDocumentVariationId(documentVariationId)

            .withDocumentId(documentId)

            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Update a variation for a document.
   * 
   * @param request The request object
   * @return DocumentVariationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentVariationResponse patchKnowledgeKnowledgebaseDocumentVariation(PatchKnowledgeKnowledgebaseDocumentVariationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentVariationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentVariationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a variation for a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentVariationResponse> patchKnowledgeKnowledgebaseDocumentVariation(ApiRequest<DocumentVariationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentVariationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentVariationResponse> response = (ApiResponse<DocumentVariationResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentVariationResponse> response = (ApiResponse<DocumentVariationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update search result.
   * 
   * @param knowledgeBaseId The ID of knowledge base containing the documents to query. (required)
   * @param searchId Search Result ID (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchKnowledgeKnowledgebaseDocumentsSearchSearchId(String knowledgeBaseId, String searchId, SearchUpdateRequest body) throws IOException, ApiException {
     patchKnowledgeKnowledgebaseDocumentsSearchSearchId(createPatchKnowledgeKnowledgebaseDocumentsSearchSearchIdRequest(knowledgeBaseId, searchId, body));
  }

  /**
   * Update search result.
   * 
   * @param knowledgeBaseId The ID of knowledge base containing the documents to query. (required)
   * @param searchId Search Result ID (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchKnowledgeKnowledgebaseDocumentsSearchSearchIdWithHttpInfo(String knowledgeBaseId, String searchId, SearchUpdateRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseDocumentsSearchSearchId(createPatchKnowledgeKnowledgebaseDocumentsSearchSearchIdRequest(knowledgeBaseId, searchId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseDocumentsSearchSearchIdRequest createPatchKnowledgeKnowledgebaseDocumentsSearchSearchIdRequest(String knowledgeBaseId, String searchId, SearchUpdateRequest body) {
    return PatchKnowledgeKnowledgebaseDocumentsSearchSearchIdRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withSearchId(searchId)

            .withBody(body)

            .build();
  }

  /**
   * Update search result.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchKnowledgeKnowledgebaseDocumentsSearchSearchId(PatchKnowledgeKnowledgebaseDocumentsSearchSearchIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update search result.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchKnowledgeKnowledgebaseDocumentsSearchSearchId(ApiRequest<SearchUpdateRequest> request) throws IOException {
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
   * Start import job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param importJobId Import job ID (required)
   * @param body  (required)
   * @return KnowledgeImportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeImportJobResponse patchKnowledgeKnowledgebaseImportJob(String knowledgeBaseId, String importJobId, ImportStatusRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseImportJob(createPatchKnowledgeKnowledgebaseImportJobRequest(knowledgeBaseId, importJobId, body));
  }

  /**
   * Start import job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param importJobId Import job ID (required)
   * @param body  (required)
   * @return KnowledgeImportJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeImportJobResponse> patchKnowledgeKnowledgebaseImportJobWithHttpInfo(String knowledgeBaseId, String importJobId, ImportStatusRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseImportJob(createPatchKnowledgeKnowledgebaseImportJobRequest(knowledgeBaseId, importJobId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseImportJobRequest createPatchKnowledgeKnowledgebaseImportJobRequest(String knowledgeBaseId, String importJobId, ImportStatusRequest body) {
    return PatchKnowledgeKnowledgebaseImportJobRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withImportJobId(importJobId)

            .withBody(body)

            .build();
  }

  /**
   * Start import job
   * 
   * @param request The request object
   * @return KnowledgeImportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeImportJobResponse patchKnowledgeKnowledgebaseImportJob(PatchKnowledgeKnowledgebaseImportJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeImportJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeImportJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start import job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeImportJobResponse> patchKnowledgeKnowledgebaseImportJob(ApiRequest<ImportStatusRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeImportJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImportJobResponse> response = (ApiResponse<KnowledgeImportJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImportJobResponse> response = (ApiResponse<KnowledgeImportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update label
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param labelId Label ID (required)
   * @param body  (required)
   * @return LabelResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LabelResponse patchKnowledgeKnowledgebaseLabel(String knowledgeBaseId, String labelId, LabelUpdateRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseLabel(createPatchKnowledgeKnowledgebaseLabelRequest(knowledgeBaseId, labelId, body));
  }

  /**
   * Update label
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param labelId Label ID (required)
   * @param body  (required)
   * @return LabelResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LabelResponse> patchKnowledgeKnowledgebaseLabelWithHttpInfo(String knowledgeBaseId, String labelId, LabelUpdateRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseLabel(createPatchKnowledgeKnowledgebaseLabelRequest(knowledgeBaseId, labelId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseLabelRequest createPatchKnowledgeKnowledgebaseLabelRequest(String knowledgeBaseId, String labelId, LabelUpdateRequest body) {
    return PatchKnowledgeKnowledgebaseLabelRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLabelId(labelId)

            .withBody(body)

            .build();
  }

  /**
   * Update label
   * 
   * @param request The request object
   * @return LabelResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LabelResponse patchKnowledgeKnowledgebaseLabel(PatchKnowledgeKnowledgebaseLabelRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LabelResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LabelResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update label
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LabelResponse> patchKnowledgeKnowledgebaseLabel(ApiRequest<LabelUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LabelResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update category
   * 
   * @param categoryId Category ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeExtendedCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeExtendedCategory patchKnowledgeKnowledgebaseLanguageCategory(String categoryId, String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseLanguageCategory(createPatchKnowledgeKnowledgebaseLanguageCategoryRequest(categoryId, knowledgeBaseId, languageCode, body));
  }

  /**
   * Update category
   * 
   * @param categoryId Category ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeExtendedCategory
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeExtendedCategory> patchKnowledgeKnowledgebaseLanguageCategoryWithHttpInfo(String categoryId, String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseLanguageCategory(createPatchKnowledgeKnowledgebaseLanguageCategoryRequest(categoryId, knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseLanguageCategoryRequest createPatchKnowledgeKnowledgebaseLanguageCategoryRequest(String categoryId, String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) {
    return PatchKnowledgeKnowledgebaseLanguageCategoryRequest.builder()
            .withCategoryId(categoryId)

            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withBody(body)

            .build();
  }

  /**
   * Update category
   * 
   * @param request The request object
   * @return KnowledgeExtendedCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeExtendedCategory patchKnowledgeKnowledgebaseLanguageCategory(PatchKnowledgeKnowledgebaseLanguageCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeExtendedCategory> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeExtendedCategory>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeExtendedCategory> patchKnowledgeKnowledgebaseLanguageCategory(ApiRequest<KnowledgeCategoryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeExtendedCategory>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update document
   * 
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeDocument patchKnowledgeKnowledgebaseLanguageDocument(String documentId, String knowledgeBaseId, String languageCode, KnowledgeDocumentRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseLanguageDocument(createPatchKnowledgeKnowledgebaseLanguageDocumentRequest(documentId, knowledgeBaseId, languageCode, body));
  }

  /**
   * Update document
   * 
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeDocument
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeDocument> patchKnowledgeKnowledgebaseLanguageDocumentWithHttpInfo(String documentId, String knowledgeBaseId, String languageCode, KnowledgeDocumentRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseLanguageDocument(createPatchKnowledgeKnowledgebaseLanguageDocumentRequest(documentId, knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseLanguageDocumentRequest createPatchKnowledgeKnowledgebaseLanguageDocumentRequest(String documentId, String knowledgeBaseId, String languageCode, KnowledgeDocumentRequest body) {
    return PatchKnowledgeKnowledgebaseLanguageDocumentRequest.builder()
            .withDocumentId(documentId)

            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withBody(body)

            .build();
  }

  /**
   * Update document
   * 
   * @param request The request object
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeDocument patchKnowledgeKnowledgebaseLanguageDocument(PatchKnowledgeKnowledgebaseLanguageDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeDocument> patchKnowledgeKnowledgebaseLanguageDocument(ApiRequest<KnowledgeDocumentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update documents collection
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return DocumentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public DocumentListing patchKnowledgeKnowledgebaseLanguageDocuments(String knowledgeBaseId, String languageCode, List<KnowledgeDocumentBulkRequest> body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseLanguageDocuments(createPatchKnowledgeKnowledgebaseLanguageDocumentsRequest(knowledgeBaseId, languageCode, body));
  }

  /**
   * Update documents collection
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return DocumentListing
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<DocumentListing> patchKnowledgeKnowledgebaseLanguageDocumentsWithHttpInfo(String knowledgeBaseId, String languageCode, List<KnowledgeDocumentBulkRequest> body) throws IOException {
    return patchKnowledgeKnowledgebaseLanguageDocuments(createPatchKnowledgeKnowledgebaseLanguageDocumentsRequest(knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseLanguageDocumentsRequest createPatchKnowledgeKnowledgebaseLanguageDocumentsRequest(String knowledgeBaseId, String languageCode, List<KnowledgeDocumentBulkRequest> body) {
    return PatchKnowledgeKnowledgebaseLanguageDocumentsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withBody(body)

            .build();
  }

  /**
   * Update documents collection
   * 
   * @param request The request object
   * @return DocumentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public DocumentListing patchKnowledgeKnowledgebaseLanguageDocuments(PatchKnowledgeKnowledgebaseLanguageDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update documents collection
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<DocumentListing> patchKnowledgeKnowledgebaseLanguageDocuments(ApiRequest<List<KnowledgeDocumentBulkRequest>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentListing> response = (ApiResponse<DocumentListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentListing> response = (ApiResponse<DocumentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start import operation
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param importId Import ID (required)
   * @param body  (required)
   * @return KnowledgeImport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeImport patchKnowledgeKnowledgebaseLanguageDocumentsImport(String knowledgeBaseId, String languageCode, String importId, ImportStatusRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseLanguageDocumentsImport(createPatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest(knowledgeBaseId, languageCode, importId, body));
  }

  /**
   * Start import operation
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param importId Import ID (required)
   * @param body  (required)
   * @return KnowledgeImport
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeImport> patchKnowledgeKnowledgebaseLanguageDocumentsImportWithHttpInfo(String knowledgeBaseId, String languageCode, String importId, ImportStatusRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseLanguageDocumentsImport(createPatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest(knowledgeBaseId, languageCode, importId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest createPatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest(String knowledgeBaseId, String languageCode, String importId, ImportStatusRequest body) {
    return PatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withImportId(importId)

            .withBody(body)

            .build();
  }

  /**
   * Start import operation
   * 
   * @param request The request object
   * @return KnowledgeImport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeImport patchKnowledgeKnowledgebaseLanguageDocumentsImport(PatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeImport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeImport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start import operation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeImport> patchKnowledgeKnowledgebaseLanguageDocumentsImport(ApiRequest<ImportStatusRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeImport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Send update to the parse operation
   * 
   * patchKnowledgeKnowledgebaseParseJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param parseJobId Parse job ID (required)
   * @param body  (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchKnowledgeKnowledgebaseParseJob(String knowledgeBaseId, String parseJobId, KnowledgeParseJobRequestPatch body) throws IOException, ApiException {
     patchKnowledgeKnowledgebaseParseJob(createPatchKnowledgeKnowledgebaseParseJobRequest(knowledgeBaseId, parseJobId, body));
  }

  /**
   * Send update to the parse operation
   * 
   * patchKnowledgeKnowledgebaseParseJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param parseJobId Parse job ID (required)
   * @param body  (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchKnowledgeKnowledgebaseParseJobWithHttpInfo(String knowledgeBaseId, String parseJobId, KnowledgeParseJobRequestPatch body) throws IOException {
    return patchKnowledgeKnowledgebaseParseJob(createPatchKnowledgeKnowledgebaseParseJobRequest(knowledgeBaseId, parseJobId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseParseJobRequest createPatchKnowledgeKnowledgebaseParseJobRequest(String knowledgeBaseId, String parseJobId, KnowledgeParseJobRequestPatch body) {
    return PatchKnowledgeKnowledgebaseParseJobRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withParseJobId(parseJobId)

            .withBody(body)

            .build();
  }

  /**
   * Send update to the parse operation
   * 
   * patchKnowledgeKnowledgebaseParseJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchKnowledgeKnowledgebaseParseJob(PatchKnowledgeKnowledgebaseParseJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Send update to the parse operation
   * 
   * patchKnowledgeKnowledgebaseParseJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchKnowledgeKnowledgebaseParseJob(ApiRequest<KnowledgeParseJobRequestPatch> request) throws IOException {
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
   * Update synchronization job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param syncJobId Synchronization job ID (required)
   * @param body  (required)
   * @return KnowledgeSyncJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSyncJobResponse patchKnowledgeKnowledgebaseSynchronizeJob(String knowledgeBaseId, String syncJobId, SyncStatusRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseSynchronizeJob(createPatchKnowledgeKnowledgebaseSynchronizeJobRequest(knowledgeBaseId, syncJobId, body));
  }

  /**
   * Update synchronization job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param syncJobId Synchronization job ID (required)
   * @param body  (required)
   * @return KnowledgeSyncJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSyncJobResponse> patchKnowledgeKnowledgebaseSynchronizeJobWithHttpInfo(String knowledgeBaseId, String syncJobId, SyncStatusRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseSynchronizeJob(createPatchKnowledgeKnowledgebaseSynchronizeJobRequest(knowledgeBaseId, syncJobId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseSynchronizeJobRequest createPatchKnowledgeKnowledgebaseSynchronizeJobRequest(String knowledgeBaseId, String syncJobId, SyncStatusRequest body) {
    return PatchKnowledgeKnowledgebaseSynchronizeJobRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withSyncJobId(syncJobId)

            .withBody(body)

            .build();
  }

  /**
   * Update synchronization job
   * 
   * @param request The request object
   * @return KnowledgeSyncJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSyncJobResponse patchKnowledgeKnowledgebaseSynchronizeJob(PatchKnowledgeKnowledgebaseSynchronizeJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeSyncJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeSyncJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update synchronization job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSyncJobResponse> patchKnowledgeKnowledgebaseSynchronizeJob(ApiRequest<SyncStatusRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeSyncJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a Knowledge base unanswered phrase group
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param groupId The ID of the group to be updated. (required)
   * @param phraseGroupId The ID of the phraseGroup to be updated. (required)
   * @param body Request body of the update unanswered group endpoint. (required)
   * @return UnansweredPhraseGroupUpdateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnansweredPhraseGroupUpdateResponse patchKnowledgeKnowledgebaseUnansweredGroupPhrasegroup(String knowledgeBaseId, String groupId, String phraseGroupId, UnansweredPhraseGroupPatchRequestBody body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseUnansweredGroupPhrasegroup(createPatchKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest(knowledgeBaseId, groupId, phraseGroupId, body));
  }

  /**
   * Update a Knowledge base unanswered phrase group
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param groupId The ID of the group to be updated. (required)
   * @param phraseGroupId The ID of the phraseGroup to be updated. (required)
   * @param body Request body of the update unanswered group endpoint. (required)
   * @return UnansweredPhraseGroupUpdateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnansweredPhraseGroupUpdateResponse> patchKnowledgeKnowledgebaseUnansweredGroupPhrasegroupWithHttpInfo(String knowledgeBaseId, String groupId, String phraseGroupId, UnansweredPhraseGroupPatchRequestBody body) throws IOException {
    return patchKnowledgeKnowledgebaseUnansweredGroupPhrasegroup(createPatchKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest(knowledgeBaseId, groupId, phraseGroupId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest createPatchKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest(String knowledgeBaseId, String groupId, String phraseGroupId, UnansweredPhraseGroupPatchRequestBody body) {
    return PatchKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withGroupId(groupId)

            .withPhraseGroupId(phraseGroupId)

            .withBody(body)

            .build();
  }

  /**
   * Update a Knowledge base unanswered phrase group
   * 
   * @param request The request object
   * @return UnansweredPhraseGroupUpdateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnansweredPhraseGroupUpdateResponse patchKnowledgeKnowledgebaseUnansweredGroupPhrasegroup(PatchKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UnansweredPhraseGroupUpdateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UnansweredPhraseGroupUpdateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Knowledge base unanswered phrase group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnansweredPhraseGroupUpdateResponse> patchKnowledgeKnowledgebaseUnansweredGroupPhrasegroup(ApiRequest<UnansweredPhraseGroupPatchRequestBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UnansweredPhraseGroupUpdateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UnansweredPhraseGroupUpdateResponse> response = (ApiResponse<UnansweredPhraseGroupUpdateResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UnansweredPhraseGroupUpdateResponse> response = (ApiResponse<UnansweredPhraseGroupUpdateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postKnowledgeDocumentuploads(UploadUrlRequest body) throws IOException, ApiException {
    return  postKnowledgeDocumentuploads(createPostKnowledgeDocumentuploadsRequest(body));
  }

  /**
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postKnowledgeDocumentuploadsWithHttpInfo(UploadUrlRequest body) throws IOException {
    return postKnowledgeDocumentuploads(createPostKnowledgeDocumentuploadsRequest(body).withHttpInfo());
  }

  private PostKnowledgeDocumentuploadsRequest createPostKnowledgeDocumentuploadsRequest(UploadUrlRequest body) {
    return PostKnowledgeDocumentuploadsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postKnowledgeDocumentuploads(PostKnowledgeDocumentuploadsRequest request) throws IOException, ApiException {
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
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postKnowledgeDocumentuploads(ApiRequest<UploadUrlRequest> request) throws IOException {
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
   * Indicate that the document was copied by the user.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param documentId Document ID (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeGuestSessionDocumentCopies(String sessionId, String documentId, KnowledgeGuestDocumentCopy body) throws IOException, ApiException {
     postKnowledgeGuestSessionDocumentCopies(createPostKnowledgeGuestSessionDocumentCopiesRequest(sessionId, documentId, body));
  }

  /**
   * Indicate that the document was copied by the user.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param documentId Document ID (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeGuestSessionDocumentCopiesWithHttpInfo(String sessionId, String documentId, KnowledgeGuestDocumentCopy body) throws IOException {
    return postKnowledgeGuestSessionDocumentCopies(createPostKnowledgeGuestSessionDocumentCopiesRequest(sessionId, documentId, body).withHttpInfo());
  }

  private PostKnowledgeGuestSessionDocumentCopiesRequest createPostKnowledgeGuestSessionDocumentCopiesRequest(String sessionId, String documentId, KnowledgeGuestDocumentCopy body) {
    return PostKnowledgeGuestSessionDocumentCopiesRequest.builder()
            .withSessionId(sessionId)

            .withDocumentId(documentId)

            .withBody(body)

            .build();
  }

  /**
   * Indicate that the document was copied by the user.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeGuestSessionDocumentCopies(PostKnowledgeGuestSessionDocumentCopiesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Indicate that the document was copied by the user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeGuestSessionDocumentCopies(ApiRequest<KnowledgeGuestDocumentCopy> request) throws IOException {
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
   * Give feedback on a document
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param documentId Document ID. (required)
   * @param body  (optional)
   * @return KnowledgeGuestDocumentFeedback
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeGuestDocumentFeedback postKnowledgeGuestSessionDocumentFeedback(String sessionId, String documentId, KnowledgeGuestDocumentFeedback body) throws IOException, ApiException {
    return  postKnowledgeGuestSessionDocumentFeedback(createPostKnowledgeGuestSessionDocumentFeedbackRequest(sessionId, documentId, body));
  }

  /**
   * Give feedback on a document
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param documentId Document ID. (required)
   * @param body  (optional)
   * @return KnowledgeGuestDocumentFeedback
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeGuestDocumentFeedback> postKnowledgeGuestSessionDocumentFeedbackWithHttpInfo(String sessionId, String documentId, KnowledgeGuestDocumentFeedback body) throws IOException {
    return postKnowledgeGuestSessionDocumentFeedback(createPostKnowledgeGuestSessionDocumentFeedbackRequest(sessionId, documentId, body).withHttpInfo());
  }

  private PostKnowledgeGuestSessionDocumentFeedbackRequest createPostKnowledgeGuestSessionDocumentFeedbackRequest(String sessionId, String documentId, KnowledgeGuestDocumentFeedback body) {
    return PostKnowledgeGuestSessionDocumentFeedbackRequest.builder()
            .withSessionId(sessionId)

            .withDocumentId(documentId)

            .withBody(body)

            .build();
  }

  /**
   * Give feedback on a document
   * 
   * @param request The request object
   * @return KnowledgeGuestDocumentFeedback
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeGuestDocumentFeedback postKnowledgeGuestSessionDocumentFeedback(PostKnowledgeGuestSessionDocumentFeedbackRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeGuestDocumentFeedback> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeGuestDocumentFeedback>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Give feedback on a document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeGuestDocumentFeedback> postKnowledgeGuestSessionDocumentFeedback(ApiRequest<KnowledgeGuestDocumentFeedback> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeGuestDocumentFeedback>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeGuestDocumentFeedback> response = (ApiResponse<KnowledgeGuestDocumentFeedback>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeGuestDocumentFeedback> response = (ApiResponse<KnowledgeGuestDocumentFeedback>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create view event for a document.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param documentId Document ID (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeGuestSessionDocumentViews(String sessionId, String documentId, KnowledgeGuestDocumentView body) throws IOException, ApiException {
     postKnowledgeGuestSessionDocumentViews(createPostKnowledgeGuestSessionDocumentViewsRequest(sessionId, documentId, body));
  }

  /**
   * Create view event for a document.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param documentId Document ID (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeGuestSessionDocumentViewsWithHttpInfo(String sessionId, String documentId, KnowledgeGuestDocumentView body) throws IOException {
    return postKnowledgeGuestSessionDocumentViews(createPostKnowledgeGuestSessionDocumentViewsRequest(sessionId, documentId, body).withHttpInfo());
  }

  private PostKnowledgeGuestSessionDocumentViewsRequest createPostKnowledgeGuestSessionDocumentViewsRequest(String sessionId, String documentId, KnowledgeGuestDocumentView body) {
    return PostKnowledgeGuestSessionDocumentViewsRequest.builder()
            .withSessionId(sessionId)

            .withDocumentId(documentId)

            .withBody(body)

            .build();
  }

  /**
   * Create view event for a document.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeGuestSessionDocumentViews(PostKnowledgeGuestSessionDocumentViewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Create view event for a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeGuestSessionDocumentViews(ApiRequest<KnowledgeGuestDocumentView> request) throws IOException {
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
   * Answer documents.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param body  (required)
   * @return KnowledgeGuestAnswerDocumentsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeGuestAnswerDocumentsResponse postKnowledgeGuestSessionDocumentsAnswers(String sessionId, KnowledgeDocumentsAnswerFilter body) throws IOException, ApiException {
    return  postKnowledgeGuestSessionDocumentsAnswers(createPostKnowledgeGuestSessionDocumentsAnswersRequest(sessionId, body));
  }

  /**
   * Answer documents.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param body  (required)
   * @return KnowledgeGuestAnswerDocumentsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeGuestAnswerDocumentsResponse> postKnowledgeGuestSessionDocumentsAnswersWithHttpInfo(String sessionId, KnowledgeDocumentsAnswerFilter body) throws IOException {
    return postKnowledgeGuestSessionDocumentsAnswers(createPostKnowledgeGuestSessionDocumentsAnswersRequest(sessionId, body).withHttpInfo());
  }

  private PostKnowledgeGuestSessionDocumentsAnswersRequest createPostKnowledgeGuestSessionDocumentsAnswersRequest(String sessionId, KnowledgeDocumentsAnswerFilter body) {
    return PostKnowledgeGuestSessionDocumentsAnswersRequest.builder()
            .withSessionId(sessionId)

            .withBody(body)

            .build();
  }

  /**
   * Answer documents.
   * 
   * @param request The request object
   * @return KnowledgeGuestAnswerDocumentsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeGuestAnswerDocumentsResponse postKnowledgeGuestSessionDocumentsAnswers(PostKnowledgeGuestSessionDocumentsAnswersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeGuestAnswerDocumentsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeGuestAnswerDocumentsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Answer documents.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeGuestAnswerDocumentsResponse> postKnowledgeGuestSessionDocumentsAnswers(ApiRequest<KnowledgeDocumentsAnswerFilter> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeGuestAnswerDocumentsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeGuestAnswerDocumentsResponse> response = (ApiResponse<KnowledgeGuestAnswerDocumentsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeGuestAnswerDocumentsResponse> response = (ApiResponse<KnowledgeGuestAnswerDocumentsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Indicate that documents were presented to the user.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeGuestSessionDocumentsPresentations(String sessionId, KnowledgeGuestDocumentPresentation body) throws IOException, ApiException {
     postKnowledgeGuestSessionDocumentsPresentations(createPostKnowledgeGuestSessionDocumentsPresentationsRequest(sessionId, body));
  }

  /**
   * Indicate that documents were presented to the user.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeGuestSessionDocumentsPresentationsWithHttpInfo(String sessionId, KnowledgeGuestDocumentPresentation body) throws IOException {
    return postKnowledgeGuestSessionDocumentsPresentations(createPostKnowledgeGuestSessionDocumentsPresentationsRequest(sessionId, body).withHttpInfo());
  }

  private PostKnowledgeGuestSessionDocumentsPresentationsRequest createPostKnowledgeGuestSessionDocumentsPresentationsRequest(String sessionId, KnowledgeGuestDocumentPresentation body) {
    return PostKnowledgeGuestSessionDocumentsPresentationsRequest.builder()
            .withSessionId(sessionId)

            .withBody(body)

            .build();
  }

  /**
   * Indicate that documents were presented to the user.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeGuestSessionDocumentsPresentations(PostKnowledgeGuestSessionDocumentsPresentationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Indicate that documents were presented to the user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeGuestSessionDocumentsPresentations(ApiRequest<KnowledgeGuestDocumentPresentation> request) throws IOException {
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
   * Search the documents in a guest session.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param expand Fields, if any, to expand for each document in the search result matching the query. (optional)
   * @param body  (optional)
   * @return KnowledgeDocumentGuestSearch
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentGuestSearch postKnowledgeGuestSessionDocumentsSearch(String sessionId, List<String> expand, KnowledgeDocumentGuestSearchRequest body) throws IOException, ApiException {
    return  postKnowledgeGuestSessionDocumentsSearch(createPostKnowledgeGuestSessionDocumentsSearchRequest(sessionId, expand, body));
  }

  /**
   * Search the documents in a guest session.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param expand Fields, if any, to expand for each document in the search result matching the query. (optional)
   * @param body  (optional)
   * @return KnowledgeDocumentGuestSearch
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentGuestSearch> postKnowledgeGuestSessionDocumentsSearchWithHttpInfo(String sessionId, List<String> expand, KnowledgeDocumentGuestSearchRequest body) throws IOException {
    return postKnowledgeGuestSessionDocumentsSearch(createPostKnowledgeGuestSessionDocumentsSearchRequest(sessionId, expand, body).withHttpInfo());
  }

  private PostKnowledgeGuestSessionDocumentsSearchRequest createPostKnowledgeGuestSessionDocumentsSearchRequest(String sessionId, List<String> expand, KnowledgeDocumentGuestSearchRequest body) {
    return PostKnowledgeGuestSessionDocumentsSearchRequest.builder()
            .withSessionId(sessionId)

            .withExpand(expand)

            .withBody(body)

            .build();
  }

  /**
   * Search the documents in a guest session.
   * 
   * @param request The request object
   * @return KnowledgeDocumentGuestSearch
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentGuestSearch postKnowledgeGuestSessionDocumentsSearch(PostKnowledgeGuestSessionDocumentsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentGuestSearch> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentGuestSearch>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search the documents in a guest session.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentGuestSearch> postKnowledgeGuestSessionDocumentsSearch(ApiRequest<KnowledgeDocumentGuestSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentGuestSearch>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentGuestSearch> response = (ApiResponse<KnowledgeDocumentGuestSearch>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentGuestSearch> response = (ApiResponse<KnowledgeDocumentGuestSearch>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query the knowledge documents to provide suggestions for auto completion.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param body  (optional)
   * @return KnowledgeGuestDocumentSuggestion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeGuestDocumentSuggestion postKnowledgeGuestSessionDocumentsSearchSuggestions(String sessionId, KnowledgeGuestDocumentSuggestionRequest body) throws IOException, ApiException {
    return  postKnowledgeGuestSessionDocumentsSearchSuggestions(createPostKnowledgeGuestSessionDocumentsSearchSuggestionsRequest(sessionId, body));
  }

  /**
   * Query the knowledge documents to provide suggestions for auto completion.
   * 
   * @param sessionId Knowledge guest session ID. (required)
   * @param body  (optional)
   * @return KnowledgeGuestDocumentSuggestion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeGuestDocumentSuggestion> postKnowledgeGuestSessionDocumentsSearchSuggestionsWithHttpInfo(String sessionId, KnowledgeGuestDocumentSuggestionRequest body) throws IOException {
    return postKnowledgeGuestSessionDocumentsSearchSuggestions(createPostKnowledgeGuestSessionDocumentsSearchSuggestionsRequest(sessionId, body).withHttpInfo());
  }

  private PostKnowledgeGuestSessionDocumentsSearchSuggestionsRequest createPostKnowledgeGuestSessionDocumentsSearchSuggestionsRequest(String sessionId, KnowledgeGuestDocumentSuggestionRequest body) {
    return PostKnowledgeGuestSessionDocumentsSearchSuggestionsRequest.builder()
            .withSessionId(sessionId)

            .withBody(body)

            .build();
  }

  /**
   * Query the knowledge documents to provide suggestions for auto completion.
   * 
   * @param request The request object
   * @return KnowledgeGuestDocumentSuggestion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeGuestDocumentSuggestion postKnowledgeGuestSessionDocumentsSearchSuggestions(PostKnowledgeGuestSessionDocumentsSearchSuggestionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeGuestDocumentSuggestion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeGuestDocumentSuggestion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query the knowledge documents to provide suggestions for auto completion.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeGuestDocumentSuggestion> postKnowledgeGuestSessionDocumentsSearchSuggestions(ApiRequest<KnowledgeGuestDocumentSuggestionRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeGuestDocumentSuggestion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeGuestDocumentSuggestion> response = (ApiResponse<KnowledgeGuestDocumentSuggestion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeGuestDocumentSuggestion> response = (ApiResponse<KnowledgeGuestDocumentSuggestion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create guest session
   * 
   * @param body  (required)
   * @return KnowledgeGuestSession
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeGuestSession postKnowledgeGuestSessions(KnowledgeGuestSession body) throws IOException, ApiException {
    return  postKnowledgeGuestSessions(createPostKnowledgeGuestSessionsRequest(body));
  }

  /**
   * Create guest session
   * 
   * @param body  (required)
   * @return KnowledgeGuestSession
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeGuestSession> postKnowledgeGuestSessionsWithHttpInfo(KnowledgeGuestSession body) throws IOException {
    return postKnowledgeGuestSessions(createPostKnowledgeGuestSessionsRequest(body).withHttpInfo());
  }

  private PostKnowledgeGuestSessionsRequest createPostKnowledgeGuestSessionsRequest(KnowledgeGuestSession body) {
    return PostKnowledgeGuestSessionsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create guest session
   * 
   * @param request The request object
   * @return KnowledgeGuestSession
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeGuestSession postKnowledgeGuestSessions(PostKnowledgeGuestSessionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeGuestSession> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeGuestSession>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create guest session
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeGuestSession> postKnowledgeGuestSessions(ApiRequest<KnowledgeGuestSession> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeGuestSession>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeGuestSession> response = (ApiResponse<KnowledgeGuestSession>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeGuestSession> response = (ApiResponse<KnowledgeGuestSession>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create new category
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return CategoryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryResponse postKnowledgeKnowledgebaseCategories(String knowledgeBaseId, CategoryCreateRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseCategories(createPostKnowledgeKnowledgebaseCategoriesRequest(knowledgeBaseId, body));
  }

  /**
   * Create new category
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return CategoryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryResponse> postKnowledgeKnowledgebaseCategoriesWithHttpInfo(String knowledgeBaseId, CategoryCreateRequest body) throws IOException {
    return postKnowledgeKnowledgebaseCategories(createPostKnowledgeKnowledgebaseCategoriesRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseCategoriesRequest createPostKnowledgeKnowledgebaseCategoriesRequest(String knowledgeBaseId, CategoryCreateRequest body) {
    return PostKnowledgeKnowledgebaseCategoriesRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Create new category
   * 
   * @param request The request object
   * @return CategoryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryResponse postKnowledgeKnowledgebaseCategories(PostKnowledgeKnowledgebaseCategoriesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CategoryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CategoryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create new category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryResponse> postKnowledgeKnowledgebaseCategories(ApiRequest<CategoryCreateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CategoryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Indicate that the document was copied by the user.
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeKnowledgebaseDocumentCopies(String knowledgeBaseId, String documentId, KnowledgeDocumentCopy body) throws IOException, ApiException {
     postKnowledgeKnowledgebaseDocumentCopies(createPostKnowledgeKnowledgebaseDocumentCopiesRequest(knowledgeBaseId, documentId, body));
  }

  /**
   * Indicate that the document was copied by the user.
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeKnowledgebaseDocumentCopiesWithHttpInfo(String knowledgeBaseId, String documentId, KnowledgeDocumentCopy body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentCopies(createPostKnowledgeKnowledgebaseDocumentCopiesRequest(knowledgeBaseId, documentId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentCopiesRequest createPostKnowledgeKnowledgebaseDocumentCopiesRequest(String knowledgeBaseId, String documentId, KnowledgeDocumentCopy body) {
    return PostKnowledgeKnowledgebaseDocumentCopiesRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withBody(body)

            .build();
  }

  /**
   * Indicate that the document was copied by the user.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeKnowledgebaseDocumentCopies(PostKnowledgeKnowledgebaseDocumentCopiesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Indicate that the document was copied by the user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeKnowledgebaseDocumentCopies(ApiRequest<KnowledgeDocumentCopy> request) throws IOException {
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
   * Give feedback on a document
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param body  (optional)
   * @return KnowledgeDocumentFeedbackResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentFeedbackResponse postKnowledgeKnowledgebaseDocumentFeedback(String knowledgeBaseId, String documentId, KnowledgeDocumentFeedback body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseDocumentFeedback(createPostKnowledgeKnowledgebaseDocumentFeedbackRequest(knowledgeBaseId, documentId, body));
  }

  /**
   * Give feedback on a document
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param body  (optional)
   * @return KnowledgeDocumentFeedbackResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentFeedbackResponse> postKnowledgeKnowledgebaseDocumentFeedbackWithHttpInfo(String knowledgeBaseId, String documentId, KnowledgeDocumentFeedback body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentFeedback(createPostKnowledgeKnowledgebaseDocumentFeedbackRequest(knowledgeBaseId, documentId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentFeedbackRequest createPostKnowledgeKnowledgebaseDocumentFeedbackRequest(String knowledgeBaseId, String documentId, KnowledgeDocumentFeedback body) {
    return PostKnowledgeKnowledgebaseDocumentFeedbackRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withBody(body)

            .build();
  }

  /**
   * Give feedback on a document
   * 
   * @param request The request object
   * @return KnowledgeDocumentFeedbackResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentFeedbackResponse postKnowledgeKnowledgebaseDocumentFeedback(PostKnowledgeKnowledgebaseDocumentFeedbackRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentFeedbackResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentFeedbackResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Give feedback on a document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentFeedbackResponse> postKnowledgeKnowledgebaseDocumentFeedback(ApiRequest<KnowledgeDocumentFeedback> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentFeedbackResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentFeedbackResponse> response = (ApiResponse<KnowledgeDocumentFeedbackResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentFeedbackResponse> response = (ApiResponse<KnowledgeDocumentFeedbackResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a variation for a document.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param body  (required)
   * @return DocumentVariationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentVariationResponse postKnowledgeKnowledgebaseDocumentVariations(String knowledgeBaseId, String documentId, DocumentVariationRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseDocumentVariations(createPostKnowledgeKnowledgebaseDocumentVariationsRequest(knowledgeBaseId, documentId, body));
  }

  /**
   * Create a variation for a document.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param body  (required)
   * @return DocumentVariationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentVariationResponse> postKnowledgeKnowledgebaseDocumentVariationsWithHttpInfo(String knowledgeBaseId, String documentId, DocumentVariationRequest body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentVariations(createPostKnowledgeKnowledgebaseDocumentVariationsRequest(knowledgeBaseId, documentId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentVariationsRequest createPostKnowledgeKnowledgebaseDocumentVariationsRequest(String knowledgeBaseId, String documentId, DocumentVariationRequest body) {
    return PostKnowledgeKnowledgebaseDocumentVariationsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withBody(body)

            .build();
  }

  /**
   * Create a variation for a document.
   * 
   * @param request The request object
   * @return DocumentVariationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentVariationResponse postKnowledgeKnowledgebaseDocumentVariations(PostKnowledgeKnowledgebaseDocumentVariationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentVariationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentVariationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a variation for a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentVariationResponse> postKnowledgeKnowledgebaseDocumentVariations(ApiRequest<DocumentVariationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentVariationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentVariationResponse> response = (ApiResponse<DocumentVariationResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentVariationResponse> response = (ApiResponse<DocumentVariationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates or restores a document version.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param body  (required)
   * @return KnowledgeDocumentVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentVersion postKnowledgeKnowledgebaseDocumentVersions(String knowledgeBaseId, String documentId, KnowledgeDocumentVersion body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseDocumentVersions(createPostKnowledgeKnowledgebaseDocumentVersionsRequest(knowledgeBaseId, documentId, body));
  }

  /**
   * Creates or restores a document version.
   * 
   * @param knowledgeBaseId Globally unique identifier for the knowledge base. (required)
   * @param documentId Globally unique identifier for the document. (required)
   * @param body  (required)
   * @return KnowledgeDocumentVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentVersion> postKnowledgeKnowledgebaseDocumentVersionsWithHttpInfo(String knowledgeBaseId, String documentId, KnowledgeDocumentVersion body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentVersions(createPostKnowledgeKnowledgebaseDocumentVersionsRequest(knowledgeBaseId, documentId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentVersionsRequest createPostKnowledgeKnowledgebaseDocumentVersionsRequest(String knowledgeBaseId, String documentId, KnowledgeDocumentVersion body) {
    return PostKnowledgeKnowledgebaseDocumentVersionsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withBody(body)

            .build();
  }

  /**
   * Creates or restores a document version.
   * 
   * @param request The request object
   * @return KnowledgeDocumentVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentVersion postKnowledgeKnowledgebaseDocumentVersions(PostKnowledgeKnowledgebaseDocumentVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates or restores a document version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentVersion> postKnowledgeKnowledgebaseDocumentVersions(ApiRequest<KnowledgeDocumentVersion> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentVersion> response = (ApiResponse<KnowledgeDocumentVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentVersion> response = (ApiResponse<KnowledgeDocumentVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create view for a document.
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeKnowledgebaseDocumentViews(String knowledgeBaseId, String documentId, KnowledgeDocumentView body) throws IOException, ApiException {
     postKnowledgeKnowledgebaseDocumentViews(createPostKnowledgeKnowledgebaseDocumentViewsRequest(knowledgeBaseId, documentId, body));
  }

  /**
   * Create view for a document.
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param documentId Document ID. (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeKnowledgebaseDocumentViewsWithHttpInfo(String knowledgeBaseId, String documentId, KnowledgeDocumentView body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentViews(createPostKnowledgeKnowledgebaseDocumentViewsRequest(knowledgeBaseId, documentId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentViewsRequest createPostKnowledgeKnowledgebaseDocumentViewsRequest(String knowledgeBaseId, String documentId, KnowledgeDocumentView body) {
    return PostKnowledgeKnowledgebaseDocumentViewsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withDocumentId(documentId)

            .withBody(body)

            .build();
  }

  /**
   * Create view for a document.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeKnowledgebaseDocumentViews(PostKnowledgeKnowledgebaseDocumentViewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Create view for a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeKnowledgebaseDocumentViews(ApiRequest<KnowledgeDocumentView> request) throws IOException {
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
   * Create document.
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeDocumentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentResponse postKnowledgeKnowledgebaseDocuments(String knowledgeBaseId, KnowledgeDocumentCreateRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseDocuments(createPostKnowledgeKnowledgebaseDocumentsRequest(knowledgeBaseId, body));
  }

  /**
   * Create document.
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeDocumentResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentResponse> postKnowledgeKnowledgebaseDocumentsWithHttpInfo(String knowledgeBaseId, KnowledgeDocumentCreateRequest body) throws IOException {
    return postKnowledgeKnowledgebaseDocuments(createPostKnowledgeKnowledgebaseDocumentsRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentsRequest createPostKnowledgeKnowledgebaseDocumentsRequest(String knowledgeBaseId, KnowledgeDocumentCreateRequest body) {
    return PostKnowledgeKnowledgebaseDocumentsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Create document.
   * 
   * @param request The request object
   * @return KnowledgeDocumentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentResponse postKnowledgeKnowledgebaseDocuments(PostKnowledgeKnowledgebaseDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentResponse> postKnowledgeKnowledgebaseDocuments(ApiRequest<KnowledgeDocumentCreateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentResponse> response = (ApiResponse<KnowledgeDocumentResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentResponse> response = (ApiResponse<KnowledgeDocumentResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Answer documents.
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeAnswerDocumentsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeAnswerDocumentsResponse postKnowledgeKnowledgebaseDocumentsAnswers(String knowledgeBaseId, KnowledgeDocumentsAnswerFilter body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseDocumentsAnswers(createPostKnowledgeKnowledgebaseDocumentsAnswersRequest(knowledgeBaseId, body));
  }

  /**
   * Answer documents.
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeAnswerDocumentsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeAnswerDocumentsResponse> postKnowledgeKnowledgebaseDocumentsAnswersWithHttpInfo(String knowledgeBaseId, KnowledgeDocumentsAnswerFilter body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentsAnswers(createPostKnowledgeKnowledgebaseDocumentsAnswersRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentsAnswersRequest createPostKnowledgeKnowledgebaseDocumentsAnswersRequest(String knowledgeBaseId, KnowledgeDocumentsAnswerFilter body) {
    return PostKnowledgeKnowledgebaseDocumentsAnswersRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Answer documents.
   * 
   * @param request The request object
   * @return KnowledgeAnswerDocumentsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeAnswerDocumentsResponse postKnowledgeKnowledgebaseDocumentsAnswers(PostKnowledgeKnowledgebaseDocumentsAnswersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeAnswerDocumentsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeAnswerDocumentsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Answer documents.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeAnswerDocumentsResponse> postKnowledgeKnowledgebaseDocumentsAnswers(ApiRequest<KnowledgeDocumentsAnswerFilter> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeAnswerDocumentsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeAnswerDocumentsResponse> response = (ApiResponse<KnowledgeAnswerDocumentsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeAnswerDocumentsResponse> response = (ApiResponse<KnowledgeAnswerDocumentsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Bulk remove documents.
   * 
   * postKnowledgeKnowledgebaseDocumentsBulkRemove is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return BulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkResponse postKnowledgeKnowledgebaseDocumentsBulkRemove(String knowledgeBaseId, KnowledgeDocumentBulkRemoveRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseDocumentsBulkRemove(createPostKnowledgeKnowledgebaseDocumentsBulkRemoveRequest(knowledgeBaseId, body));
  }

  /**
   * Bulk remove documents.
   * 
   * postKnowledgeKnowledgebaseDocumentsBulkRemove is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return BulkResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkResponse> postKnowledgeKnowledgebaseDocumentsBulkRemoveWithHttpInfo(String knowledgeBaseId, KnowledgeDocumentBulkRemoveRequest body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentsBulkRemove(createPostKnowledgeKnowledgebaseDocumentsBulkRemoveRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentsBulkRemoveRequest createPostKnowledgeKnowledgebaseDocumentsBulkRemoveRequest(String knowledgeBaseId, KnowledgeDocumentBulkRemoveRequest body) {
    return PostKnowledgeKnowledgebaseDocumentsBulkRemoveRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Bulk remove documents.
   * 
   * postKnowledgeKnowledgebaseDocumentsBulkRemove is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return BulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkResponse postKnowledgeKnowledgebaseDocumentsBulkRemove(PostKnowledgeKnowledgebaseDocumentsBulkRemoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk remove documents.
   * 
   * postKnowledgeKnowledgebaseDocumentsBulkRemove is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkResponse> postKnowledgeKnowledgebaseDocumentsBulkRemove(ApiRequest<KnowledgeDocumentBulkRemoveRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Bulk update documents.
   * 
   * postKnowledgeKnowledgebaseDocumentsBulkUpdate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return BulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkResponse postKnowledgeKnowledgebaseDocumentsBulkUpdate(String knowledgeBaseId, KnowledgeDocumentBulkUpdateRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseDocumentsBulkUpdate(createPostKnowledgeKnowledgebaseDocumentsBulkUpdateRequest(knowledgeBaseId, body));
  }

  /**
   * Bulk update documents.
   * 
   * postKnowledgeKnowledgebaseDocumentsBulkUpdate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return BulkResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkResponse> postKnowledgeKnowledgebaseDocumentsBulkUpdateWithHttpInfo(String knowledgeBaseId, KnowledgeDocumentBulkUpdateRequest body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentsBulkUpdate(createPostKnowledgeKnowledgebaseDocumentsBulkUpdateRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentsBulkUpdateRequest createPostKnowledgeKnowledgebaseDocumentsBulkUpdateRequest(String knowledgeBaseId, KnowledgeDocumentBulkUpdateRequest body) {
    return PostKnowledgeKnowledgebaseDocumentsBulkUpdateRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Bulk update documents.
   * 
   * postKnowledgeKnowledgebaseDocumentsBulkUpdate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return BulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkResponse postKnowledgeKnowledgebaseDocumentsBulkUpdate(PostKnowledgeKnowledgebaseDocumentsBulkUpdateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk update documents.
   * 
   * postKnowledgeKnowledgebaseDocumentsBulkUpdate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkResponse> postKnowledgeKnowledgebaseDocumentsBulkUpdate(ApiRequest<KnowledgeDocumentBulkUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Indicate that documents were presented to the user.
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeKnowledgebaseDocumentsPresentations(String knowledgeBaseId, KnowledgeDocumentPresentation body) throws IOException, ApiException {
     postKnowledgeKnowledgebaseDocumentsPresentations(createPostKnowledgeKnowledgebaseDocumentsPresentationsRequest(knowledgeBaseId, body));
  }

  /**
   * Indicate that documents were presented to the user.
   * 
   * @param knowledgeBaseId Knowledge base ID. (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeKnowledgebaseDocumentsPresentationsWithHttpInfo(String knowledgeBaseId, KnowledgeDocumentPresentation body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentsPresentations(createPostKnowledgeKnowledgebaseDocumentsPresentationsRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentsPresentationsRequest createPostKnowledgeKnowledgebaseDocumentsPresentationsRequest(String knowledgeBaseId, KnowledgeDocumentPresentation body) {
    return PostKnowledgeKnowledgebaseDocumentsPresentationsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Indicate that documents were presented to the user.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeKnowledgebaseDocumentsPresentations(PostKnowledgeKnowledgebaseDocumentsPresentationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Indicate that documents were presented to the user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeKnowledgebaseDocumentsPresentations(ApiRequest<KnowledgeDocumentPresentation> request) throws IOException {
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
   * Query for knowledge documents.
   * 
   * @param knowledgeBaseId Knowledge Base ID (required)
   * @param expand Fields, if any, to expand for each document in the search result matching the query. (optional)
   * @param body  (optional)
   * @return KnowledgeDocumentQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentQueryResponse postKnowledgeKnowledgebaseDocumentsQuery(String knowledgeBaseId, List<String> expand, KnowledgeDocumentQuery body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseDocumentsQuery(createPostKnowledgeKnowledgebaseDocumentsQueryRequest(knowledgeBaseId, expand, body));
  }

  /**
   * Query for knowledge documents.
   * 
   * @param knowledgeBaseId Knowledge Base ID (required)
   * @param expand Fields, if any, to expand for each document in the search result matching the query. (optional)
   * @param body  (optional)
   * @return KnowledgeDocumentQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentQueryResponse> postKnowledgeKnowledgebaseDocumentsQueryWithHttpInfo(String knowledgeBaseId, List<String> expand, KnowledgeDocumentQuery body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentsQuery(createPostKnowledgeKnowledgebaseDocumentsQueryRequest(knowledgeBaseId, expand, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentsQueryRequest createPostKnowledgeKnowledgebaseDocumentsQueryRequest(String knowledgeBaseId, List<String> expand, KnowledgeDocumentQuery body) {
    return PostKnowledgeKnowledgebaseDocumentsQueryRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withExpand(expand)

            .withBody(body)

            .build();
  }

  /**
   * Query for knowledge documents.
   * 
   * @param request The request object
   * @return KnowledgeDocumentQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentQueryResponse postKnowledgeKnowledgebaseDocumentsQuery(PostKnowledgeKnowledgebaseDocumentsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for knowledge documents.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentQueryResponse> postKnowledgeKnowledgebaseDocumentsQuery(ApiRequest<KnowledgeDocumentQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentQueryResponse> response = (ApiResponse<KnowledgeDocumentQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentQueryResponse> response = (ApiResponse<KnowledgeDocumentQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Search the documents in a knowledge base.
   * 
   * @param knowledgeBaseId The ID of knowledge base containing the documents to query. (required)
   * @param expand Fields, if any, to expand for each document in the search result matching the query. (optional)
   * @param body  (optional)
   * @return KnowledgeDocumentSearch
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentSearch postKnowledgeKnowledgebaseDocumentsSearch(String knowledgeBaseId, List<String> expand, KnowledgeDocumentSearchRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseDocumentsSearch(createPostKnowledgeKnowledgebaseDocumentsSearchRequest(knowledgeBaseId, expand, body));
  }

  /**
   * Search the documents in a knowledge base.
   * 
   * @param knowledgeBaseId The ID of knowledge base containing the documents to query. (required)
   * @param expand Fields, if any, to expand for each document in the search result matching the query. (optional)
   * @param body  (optional)
   * @return KnowledgeDocumentSearch
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentSearch> postKnowledgeKnowledgebaseDocumentsSearchWithHttpInfo(String knowledgeBaseId, List<String> expand, KnowledgeDocumentSearchRequest body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentsSearch(createPostKnowledgeKnowledgebaseDocumentsSearchRequest(knowledgeBaseId, expand, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentsSearchRequest createPostKnowledgeKnowledgebaseDocumentsSearchRequest(String knowledgeBaseId, List<String> expand, KnowledgeDocumentSearchRequest body) {
    return PostKnowledgeKnowledgebaseDocumentsSearchRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withExpand(expand)

            .withBody(body)

            .build();
  }

  /**
   * Search the documents in a knowledge base.
   * 
   * @param request The request object
   * @return KnowledgeDocumentSearch
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentSearch postKnowledgeKnowledgebaseDocumentsSearch(PostKnowledgeKnowledgebaseDocumentsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentSearch> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentSearch>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search the documents in a knowledge base.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentSearch> postKnowledgeKnowledgebaseDocumentsSearch(ApiRequest<KnowledgeDocumentSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentSearch>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentSearch> response = (ApiResponse<KnowledgeDocumentSearch>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentSearch> response = (ApiResponse<KnowledgeDocumentSearch>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query the knowledge documents to provide suggestions for auto completion.
   * 
   * @param knowledgeBaseId The ID of knowledge base containing the documents to query. (required)
   * @param body  (optional)
   * @return KnowledgeDocumentSuggestion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentSuggestion postKnowledgeKnowledgebaseDocumentsSearchSuggestions(String knowledgeBaseId, KnowledgeDocumentSuggestionRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseDocumentsSearchSuggestions(createPostKnowledgeKnowledgebaseDocumentsSearchSuggestionsRequest(knowledgeBaseId, body));
  }

  /**
   * Query the knowledge documents to provide suggestions for auto completion.
   * 
   * @param knowledgeBaseId The ID of knowledge base containing the documents to query. (required)
   * @param body  (optional)
   * @return KnowledgeDocumentSuggestion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentSuggestion> postKnowledgeKnowledgebaseDocumentsSearchSuggestionsWithHttpInfo(String knowledgeBaseId, KnowledgeDocumentSuggestionRequest body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentsSearchSuggestions(createPostKnowledgeKnowledgebaseDocumentsSearchSuggestionsRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentsSearchSuggestionsRequest createPostKnowledgeKnowledgebaseDocumentsSearchSuggestionsRequest(String knowledgeBaseId, KnowledgeDocumentSuggestionRequest body) {
    return PostKnowledgeKnowledgebaseDocumentsSearchSuggestionsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Query the knowledge documents to provide suggestions for auto completion.
   * 
   * @param request The request object
   * @return KnowledgeDocumentSuggestion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocumentSuggestion postKnowledgeKnowledgebaseDocumentsSearchSuggestions(PostKnowledgeKnowledgebaseDocumentsSearchSuggestionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentSuggestion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentSuggestion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query the knowledge documents to provide suggestions for auto completion.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocumentSuggestion> postKnowledgeKnowledgebaseDocumentsSearchSuggestions(ApiRequest<KnowledgeDocumentSuggestionRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentSuggestion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentSuggestion> response = (ApiResponse<KnowledgeDocumentSuggestion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentSuggestion> response = (ApiResponse<KnowledgeDocumentSuggestion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Bulk add document versions.
   * 
   * postKnowledgeKnowledgebaseDocumentsVersionsBulkAdd is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return BulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkResponse postKnowledgeKnowledgebaseDocumentsVersionsBulkAdd(String knowledgeBaseId, KnowledgeDocumentBulkVersionAddRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseDocumentsVersionsBulkAdd(createPostKnowledgeKnowledgebaseDocumentsVersionsBulkAddRequest(knowledgeBaseId, body));
  }

  /**
   * Bulk add document versions.
   * 
   * postKnowledgeKnowledgebaseDocumentsVersionsBulkAdd is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return BulkResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkResponse> postKnowledgeKnowledgebaseDocumentsVersionsBulkAddWithHttpInfo(String knowledgeBaseId, KnowledgeDocumentBulkVersionAddRequest body) throws IOException {
    return postKnowledgeKnowledgebaseDocumentsVersionsBulkAdd(createPostKnowledgeKnowledgebaseDocumentsVersionsBulkAddRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseDocumentsVersionsBulkAddRequest createPostKnowledgeKnowledgebaseDocumentsVersionsBulkAddRequest(String knowledgeBaseId, KnowledgeDocumentBulkVersionAddRequest body) {
    return PostKnowledgeKnowledgebaseDocumentsVersionsBulkAddRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Bulk add document versions.
   * 
   * postKnowledgeKnowledgebaseDocumentsVersionsBulkAdd is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return BulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkResponse postKnowledgeKnowledgebaseDocumentsVersionsBulkAdd(PostKnowledgeKnowledgebaseDocumentsVersionsBulkAddRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk add document versions.
   * 
   * postKnowledgeKnowledgebaseDocumentsVersionsBulkAdd is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkResponse> postKnowledgeKnowledgebaseDocumentsVersionsBulkAdd(ApiRequest<KnowledgeDocumentBulkVersionAddRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create export job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeExportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeExportJobResponse postKnowledgeKnowledgebaseExportJobs(String knowledgeBaseId, KnowledgeExportJobRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseExportJobs(createPostKnowledgeKnowledgebaseExportJobsRequest(knowledgeBaseId, body));
  }

  /**
   * Create export job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeExportJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeExportJobResponse> postKnowledgeKnowledgebaseExportJobsWithHttpInfo(String knowledgeBaseId, KnowledgeExportJobRequest body) throws IOException {
    return postKnowledgeKnowledgebaseExportJobs(createPostKnowledgeKnowledgebaseExportJobsRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseExportJobsRequest createPostKnowledgeKnowledgebaseExportJobsRequest(String knowledgeBaseId, KnowledgeExportJobRequest body) {
    return PostKnowledgeKnowledgebaseExportJobsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Create export job
   * 
   * @param request The request object
   * @return KnowledgeExportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeExportJobResponse postKnowledgeKnowledgebaseExportJobs(PostKnowledgeKnowledgebaseExportJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeExportJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeExportJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create export job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeExportJobResponse> postKnowledgeKnowledgebaseExportJobs(ApiRequest<KnowledgeExportJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeExportJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExportJobResponse> response = (ApiResponse<KnowledgeExportJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExportJobResponse> response = (ApiResponse<KnowledgeExportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create import job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeImportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeImportJobResponse postKnowledgeKnowledgebaseImportJobs(String knowledgeBaseId, KnowledgeImportJobRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseImportJobs(createPostKnowledgeKnowledgebaseImportJobsRequest(knowledgeBaseId, body));
  }

  /**
   * Create import job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeImportJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeImportJobResponse> postKnowledgeKnowledgebaseImportJobsWithHttpInfo(String knowledgeBaseId, KnowledgeImportJobRequest body) throws IOException {
    return postKnowledgeKnowledgebaseImportJobs(createPostKnowledgeKnowledgebaseImportJobsRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseImportJobsRequest createPostKnowledgeKnowledgebaseImportJobsRequest(String knowledgeBaseId, KnowledgeImportJobRequest body) {
    return PostKnowledgeKnowledgebaseImportJobsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Create import job
   * 
   * @param request The request object
   * @return KnowledgeImportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeImportJobResponse postKnowledgeKnowledgebaseImportJobs(PostKnowledgeKnowledgebaseImportJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeImportJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeImportJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create import job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeImportJobResponse> postKnowledgeKnowledgebaseImportJobs(ApiRequest<KnowledgeImportJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeImportJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImportJobResponse> response = (ApiResponse<KnowledgeImportJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImportJobResponse> response = (ApiResponse<KnowledgeImportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create new label
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return LabelResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LabelResponse postKnowledgeKnowledgebaseLabels(String knowledgeBaseId, LabelCreateRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseLabels(createPostKnowledgeKnowledgebaseLabelsRequest(knowledgeBaseId, body));
  }

  /**
   * Create new label
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return LabelResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LabelResponse> postKnowledgeKnowledgebaseLabelsWithHttpInfo(String knowledgeBaseId, LabelCreateRequest body) throws IOException {
    return postKnowledgeKnowledgebaseLabels(createPostKnowledgeKnowledgebaseLabelsRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseLabelsRequest createPostKnowledgeKnowledgebaseLabelsRequest(String knowledgeBaseId, LabelCreateRequest body) {
    return PostKnowledgeKnowledgebaseLabelsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Create new label
   * 
   * @param request The request object
   * @return LabelResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LabelResponse postKnowledgeKnowledgebaseLabels(PostKnowledgeKnowledgebaseLabelsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LabelResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LabelResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create new label
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LabelResponse> postKnowledgeKnowledgebaseLabels(ApiRequest<LabelCreateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LabelResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create new category
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeExtendedCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeExtendedCategory postKnowledgeKnowledgebaseLanguageCategories(String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseLanguageCategories(createPostKnowledgeKnowledgebaseLanguageCategoriesRequest(knowledgeBaseId, languageCode, body));
  }

  /**
   * Create new category
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeExtendedCategory
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeExtendedCategory> postKnowledgeKnowledgebaseLanguageCategoriesWithHttpInfo(String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) throws IOException {
    return postKnowledgeKnowledgebaseLanguageCategories(createPostKnowledgeKnowledgebaseLanguageCategoriesRequest(knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseLanguageCategoriesRequest createPostKnowledgeKnowledgebaseLanguageCategoriesRequest(String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) {
    return PostKnowledgeKnowledgebaseLanguageCategoriesRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withBody(body)

            .build();
  }

  /**
   * Create new category
   * 
   * @param request The request object
   * @return KnowledgeExtendedCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeExtendedCategory postKnowledgeKnowledgebaseLanguageCategories(PostKnowledgeKnowledgebaseLanguageCategoriesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeExtendedCategory> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeExtendedCategory>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create new category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeExtendedCategory> postKnowledgeKnowledgebaseLanguageCategories(ApiRequest<KnowledgeCategoryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeExtendedCategory>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Upload Article Content
   * 
   * postKnowledgeKnowledgebaseLanguageDocumentUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeDocumentContentUpload
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeDocumentContentUpload postKnowledgeKnowledgebaseLanguageDocumentUploads(String documentId, String knowledgeBaseId, String languageCode, KnowledgeDocumentContentUpload body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseLanguageDocumentUploads(createPostKnowledgeKnowledgebaseLanguageDocumentUploadsRequest(documentId, knowledgeBaseId, languageCode, body));
  }

  /**
   * Upload Article Content
   * 
   * postKnowledgeKnowledgebaseLanguageDocumentUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeDocumentContentUpload
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeDocumentContentUpload> postKnowledgeKnowledgebaseLanguageDocumentUploadsWithHttpInfo(String documentId, String knowledgeBaseId, String languageCode, KnowledgeDocumentContentUpload body) throws IOException {
    return postKnowledgeKnowledgebaseLanguageDocumentUploads(createPostKnowledgeKnowledgebaseLanguageDocumentUploadsRequest(documentId, knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseLanguageDocumentUploadsRequest createPostKnowledgeKnowledgebaseLanguageDocumentUploadsRequest(String documentId, String knowledgeBaseId, String languageCode, KnowledgeDocumentContentUpload body) {
    return PostKnowledgeKnowledgebaseLanguageDocumentUploadsRequest.builder()
            .withDocumentId(documentId)

            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withBody(body)

            .build();
  }

  /**
   * Upload Article Content
   * 
   * postKnowledgeKnowledgebaseLanguageDocumentUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return KnowledgeDocumentContentUpload
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeDocumentContentUpload postKnowledgeKnowledgebaseLanguageDocumentUploads(PostKnowledgeKnowledgebaseLanguageDocumentUploadsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocumentContentUpload> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocumentContentUpload>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Upload Article Content
   * 
   * postKnowledgeKnowledgebaseLanguageDocumentUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeDocumentContentUpload> postKnowledgeKnowledgebaseLanguageDocumentUploads(ApiRequest<KnowledgeDocumentContentUpload> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocumentContentUpload>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentContentUpload> response = (ApiResponse<KnowledgeDocumentContentUpload>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocumentContentUpload> response = (ApiResponse<KnowledgeDocumentContentUpload>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create document
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeDocument postKnowledgeKnowledgebaseLanguageDocuments(String knowledgeBaseId, String languageCode, KnowledgeDocumentRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseLanguageDocuments(createPostKnowledgeKnowledgebaseLanguageDocumentsRequest(knowledgeBaseId, languageCode, body));
  }

  /**
   * Create document
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeDocument
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeDocument> postKnowledgeKnowledgebaseLanguageDocumentsWithHttpInfo(String knowledgeBaseId, String languageCode, KnowledgeDocumentRequest body) throws IOException {
    return postKnowledgeKnowledgebaseLanguageDocuments(createPostKnowledgeKnowledgebaseLanguageDocumentsRequest(knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseLanguageDocumentsRequest createPostKnowledgeKnowledgebaseLanguageDocumentsRequest(String knowledgeBaseId, String languageCode, KnowledgeDocumentRequest body) {
    return PostKnowledgeKnowledgebaseLanguageDocumentsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withBody(body)

            .build();
  }

  /**
   * Create document
   * 
   * @param request The request object
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeDocument postKnowledgeKnowledgebaseLanguageDocuments(PostKnowledgeKnowledgebaseLanguageDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeDocument> postKnowledgeKnowledgebaseLanguageDocuments(ApiRequest<KnowledgeDocumentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create import operation
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeImport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeImport postKnowledgeKnowledgebaseLanguageDocumentsImports(String knowledgeBaseId, String languageCode, KnowledgeImport body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseLanguageDocumentsImports(createPostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest(knowledgeBaseId, languageCode, body));
  }

  /**
   * Create import operation
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeImport
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeImport> postKnowledgeKnowledgebaseLanguageDocumentsImportsWithHttpInfo(String knowledgeBaseId, String languageCode, KnowledgeImport body) throws IOException {
    return postKnowledgeKnowledgebaseLanguageDocumentsImports(createPostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest(knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest createPostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest(String knowledgeBaseId, String languageCode, KnowledgeImport body) {
    return PostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withBody(body)

            .build();
  }

  /**
   * Create import operation
   * 
   * @param request The request object
   * @return KnowledgeImport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeImport postKnowledgeKnowledgebaseLanguageDocumentsImports(PostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeImport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeImport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create import operation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeImport> postKnowledgeKnowledgebaseLanguageDocumentsImports(ApiRequest<KnowledgeImport> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeImport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Promote trained documents from draft state to active.
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param trainingId Training ID (required)
   * @return KnowledgeTraining
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeTraining postKnowledgeKnowledgebaseLanguageTrainingPromote(String knowledgeBaseId, String languageCode, String trainingId) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseLanguageTrainingPromote(createPostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest(knowledgeBaseId, languageCode, trainingId));
  }

  /**
   * Promote trained documents from draft state to active.
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param trainingId Training ID (required)
   * @return KnowledgeTraining
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeTraining> postKnowledgeKnowledgebaseLanguageTrainingPromoteWithHttpInfo(String knowledgeBaseId, String languageCode, String trainingId) throws IOException {
    return postKnowledgeKnowledgebaseLanguageTrainingPromote(createPostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest(knowledgeBaseId, languageCode, trainingId).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest createPostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest(String knowledgeBaseId, String languageCode, String trainingId) {
    return PostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .withTrainingId(trainingId)

            .build();
  }

  /**
   * Promote trained documents from draft state to active.
   * 
   * @param request The request object
   * @return KnowledgeTraining
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeTraining postKnowledgeKnowledgebaseLanguageTrainingPromote(PostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeTraining> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeTraining>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Promote trained documents from draft state to active.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeTraining> postKnowledgeKnowledgebaseLanguageTrainingPromote(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeTraining>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Trigger training
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeTraining
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeTraining postKnowledgeKnowledgebaseLanguageTrainings(String knowledgeBaseId, String languageCode) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseLanguageTrainings(createPostKnowledgeKnowledgebaseLanguageTrainingsRequest(knowledgeBaseId, languageCode));
  }

  /**
   * Trigger training
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeTraining
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeTraining> postKnowledgeKnowledgebaseLanguageTrainingsWithHttpInfo(String knowledgeBaseId, String languageCode) throws IOException {
    return postKnowledgeKnowledgebaseLanguageTrainings(createPostKnowledgeKnowledgebaseLanguageTrainingsRequest(knowledgeBaseId, languageCode).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseLanguageTrainingsRequest createPostKnowledgeKnowledgebaseLanguageTrainingsRequest(String knowledgeBaseId, String languageCode) {
    return PostKnowledgeKnowledgebaseLanguageTrainingsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Trigger training
   * 
   * @param request The request object
   * @return KnowledgeTraining
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeTraining postKnowledgeKnowledgebaseLanguageTrainings(PostKnowledgeKnowledgebaseLanguageTrainingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeTraining> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeTraining>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Trigger training
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeTraining> postKnowledgeKnowledgebaseLanguageTrainings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeTraining>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Import the parsed articles
   * 
   * postKnowledgeKnowledgebaseParseJobImport is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param parseJobId Parse job ID (required)
   * @param body  (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeKnowledgebaseParseJobImport(String knowledgeBaseId, String parseJobId, KnowledgeParseJobRequestImport body) throws IOException, ApiException {
     postKnowledgeKnowledgebaseParseJobImport(createPostKnowledgeKnowledgebaseParseJobImportRequest(knowledgeBaseId, parseJobId, body));
  }

  /**
   * Import the parsed articles
   * 
   * postKnowledgeKnowledgebaseParseJobImport is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param parseJobId Parse job ID (required)
   * @param body  (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeKnowledgebaseParseJobImportWithHttpInfo(String knowledgeBaseId, String parseJobId, KnowledgeParseJobRequestImport body) throws IOException {
    return postKnowledgeKnowledgebaseParseJobImport(createPostKnowledgeKnowledgebaseParseJobImportRequest(knowledgeBaseId, parseJobId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseParseJobImportRequest createPostKnowledgeKnowledgebaseParseJobImportRequest(String knowledgeBaseId, String parseJobId, KnowledgeParseJobRequestImport body) {
    return PostKnowledgeKnowledgebaseParseJobImportRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withParseJobId(parseJobId)

            .withBody(body)

            .build();
  }

  /**
   * Import the parsed articles
   * 
   * postKnowledgeKnowledgebaseParseJobImport is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postKnowledgeKnowledgebaseParseJobImport(PostKnowledgeKnowledgebaseParseJobImportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Import the parsed articles
   * 
   * postKnowledgeKnowledgebaseParseJobImport is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postKnowledgeKnowledgebaseParseJobImport(ApiRequest<KnowledgeParseJobRequestImport> request) throws IOException {
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
   * Create parse job
   * 
   * postKnowledgeKnowledgebaseParseJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeParseJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeParseJobResponse postKnowledgeKnowledgebaseParseJobs(String knowledgeBaseId, KnowledgeParseJobRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseParseJobs(createPostKnowledgeKnowledgebaseParseJobsRequest(knowledgeBaseId, body));
  }

  /**
   * Create parse job
   * 
   * postKnowledgeKnowledgebaseParseJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeParseJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeParseJobResponse> postKnowledgeKnowledgebaseParseJobsWithHttpInfo(String knowledgeBaseId, KnowledgeParseJobRequest body) throws IOException {
    return postKnowledgeKnowledgebaseParseJobs(createPostKnowledgeKnowledgebaseParseJobsRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseParseJobsRequest createPostKnowledgeKnowledgebaseParseJobsRequest(String knowledgeBaseId, KnowledgeParseJobRequest body) {
    return PostKnowledgeKnowledgebaseParseJobsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Create parse job
   * 
   * postKnowledgeKnowledgebaseParseJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return KnowledgeParseJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeParseJobResponse postKnowledgeKnowledgebaseParseJobs(PostKnowledgeKnowledgebaseParseJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeParseJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeParseJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create parse job
   * 
   * postKnowledgeKnowledgebaseParseJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeParseJobResponse> postKnowledgeKnowledgebaseParseJobs(ApiRequest<KnowledgeParseJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeParseJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeParseJobResponse> response = (ApiResponse<KnowledgeParseJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeParseJobResponse> response = (ApiResponse<KnowledgeParseJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Search Documents
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (optional)
   * @return KnowledgeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeSearchResponse postKnowledgeKnowledgebaseSearch(String knowledgeBaseId, KnowledgeSearchRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseSearch(createPostKnowledgeKnowledgebaseSearchRequest(knowledgeBaseId, body));
  }

  /**
   * Search Documents
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (optional)
   * @return KnowledgeSearchResponse
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeSearchResponse> postKnowledgeKnowledgebaseSearchWithHttpInfo(String knowledgeBaseId, KnowledgeSearchRequest body) throws IOException {
    return postKnowledgeKnowledgebaseSearch(createPostKnowledgeKnowledgebaseSearchRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseSearchRequest createPostKnowledgeKnowledgebaseSearchRequest(String knowledgeBaseId, KnowledgeSearchRequest body) {
    return PostKnowledgeKnowledgebaseSearchRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Search Documents
   * 
   * @param request The request object
   * @return KnowledgeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public KnowledgeSearchResponse postKnowledgeKnowledgebaseSearch(PostKnowledgeKnowledgebaseSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search Documents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<KnowledgeSearchResponse> postKnowledgeKnowledgebaseSearch(ApiRequest<KnowledgeSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSearchResponse> response = (ApiResponse<KnowledgeSearchResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSearchResponse> response = (ApiResponse<KnowledgeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create Salesforce Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeSyncJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSyncJobResponse postKnowledgeKnowledgebaseSourcesSalesforce(String knowledgeBaseId, SalesforceSourceRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseSourcesSalesforce(createPostKnowledgeKnowledgebaseSourcesSalesforceRequest(knowledgeBaseId, body));
  }

  /**
   * Create Salesforce Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeSyncJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSyncJobResponse> postKnowledgeKnowledgebaseSourcesSalesforceWithHttpInfo(String knowledgeBaseId, SalesforceSourceRequest body) throws IOException {
    return postKnowledgeKnowledgebaseSourcesSalesforce(createPostKnowledgeKnowledgebaseSourcesSalesforceRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseSourcesSalesforceRequest createPostKnowledgeKnowledgebaseSourcesSalesforceRequest(String knowledgeBaseId, SalesforceSourceRequest body) {
    return PostKnowledgeKnowledgebaseSourcesSalesforceRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Create Salesforce Knowledge integration source
   * 
   * @param request The request object
   * @return KnowledgeSyncJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSyncJobResponse postKnowledgeKnowledgebaseSourcesSalesforce(PostKnowledgeKnowledgebaseSourcesSalesforceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeSyncJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeSyncJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Salesforce Knowledge integration source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSyncJobResponse> postKnowledgeKnowledgebaseSourcesSalesforce(ApiRequest<SalesforceSourceRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeSyncJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start sync on Salesforce Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @return SourceSyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SourceSyncResponse postKnowledgeKnowledgebaseSourcesSalesforceSourceIdSync(String knowledgeBaseId, String sourceId) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseSourcesSalesforceSourceIdSync(createPostKnowledgeKnowledgebaseSourcesSalesforceSourceIdSyncRequest(knowledgeBaseId, sourceId));
  }

  /**
   * Start sync on Salesforce Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @return SourceSyncResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SourceSyncResponse> postKnowledgeKnowledgebaseSourcesSalesforceSourceIdSyncWithHttpInfo(String knowledgeBaseId, String sourceId) throws IOException {
    return postKnowledgeKnowledgebaseSourcesSalesforceSourceIdSync(createPostKnowledgeKnowledgebaseSourcesSalesforceSourceIdSyncRequest(knowledgeBaseId, sourceId).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseSourcesSalesforceSourceIdSyncRequest createPostKnowledgeKnowledgebaseSourcesSalesforceSourceIdSyncRequest(String knowledgeBaseId, String sourceId) {
    return PostKnowledgeKnowledgebaseSourcesSalesforceSourceIdSyncRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withSourceId(sourceId)

            .build();
  }

  /**
   * Start sync on Salesforce Knowledge integration source
   * 
   * @param request The request object
   * @return SourceSyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SourceSyncResponse postKnowledgeKnowledgebaseSourcesSalesforceSourceIdSync(PostKnowledgeKnowledgebaseSourcesSalesforceSourceIdSyncRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SourceSyncResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SourceSyncResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start sync on Salesforce Knowledge integration source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SourceSyncResponse> postKnowledgeKnowledgebaseSourcesSalesforceSourceIdSync(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SourceSyncResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SourceSyncResponse> response = (ApiResponse<SourceSyncResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SourceSyncResponse> response = (ApiResponse<SourceSyncResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create ServiceNow Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeSyncJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSyncJobResponse postKnowledgeKnowledgebaseSourcesServicenow(String knowledgeBaseId, ServiceNowSourceRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseSourcesServicenow(createPostKnowledgeKnowledgebaseSourcesServicenowRequest(knowledgeBaseId, body));
  }

  /**
   * Create ServiceNow Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeSyncJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSyncJobResponse> postKnowledgeKnowledgebaseSourcesServicenowWithHttpInfo(String knowledgeBaseId, ServiceNowSourceRequest body) throws IOException {
    return postKnowledgeKnowledgebaseSourcesServicenow(createPostKnowledgeKnowledgebaseSourcesServicenowRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseSourcesServicenowRequest createPostKnowledgeKnowledgebaseSourcesServicenowRequest(String knowledgeBaseId, ServiceNowSourceRequest body) {
    return PostKnowledgeKnowledgebaseSourcesServicenowRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Create ServiceNow Knowledge integration source
   * 
   * @param request The request object
   * @return KnowledgeSyncJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSyncJobResponse postKnowledgeKnowledgebaseSourcesServicenow(PostKnowledgeKnowledgebaseSourcesServicenowRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeSyncJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeSyncJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create ServiceNow Knowledge integration source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSyncJobResponse> postKnowledgeKnowledgebaseSourcesServicenow(ApiRequest<ServiceNowSourceRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeSyncJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start synchronization on ServiceNow Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @return SourceSyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SourceSyncResponse postKnowledgeKnowledgebaseSourcesServicenowSourceIdSync(String knowledgeBaseId, String sourceId) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseSourcesServicenowSourceIdSync(createPostKnowledgeKnowledgebaseSourcesServicenowSourceIdSyncRequest(knowledgeBaseId, sourceId));
  }

  /**
   * Start synchronization on ServiceNow Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @return SourceSyncResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SourceSyncResponse> postKnowledgeKnowledgebaseSourcesServicenowSourceIdSyncWithHttpInfo(String knowledgeBaseId, String sourceId) throws IOException {
    return postKnowledgeKnowledgebaseSourcesServicenowSourceIdSync(createPostKnowledgeKnowledgebaseSourcesServicenowSourceIdSyncRequest(knowledgeBaseId, sourceId).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseSourcesServicenowSourceIdSyncRequest createPostKnowledgeKnowledgebaseSourcesServicenowSourceIdSyncRequest(String knowledgeBaseId, String sourceId) {
    return PostKnowledgeKnowledgebaseSourcesServicenowSourceIdSyncRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withSourceId(sourceId)

            .build();
  }

  /**
   * Start synchronization on ServiceNow Knowledge integration source
   * 
   * @param request The request object
   * @return SourceSyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SourceSyncResponse postKnowledgeKnowledgebaseSourcesServicenowSourceIdSync(PostKnowledgeKnowledgebaseSourcesServicenowSourceIdSyncRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SourceSyncResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SourceSyncResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start synchronization on ServiceNow Knowledge integration source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SourceSyncResponse> postKnowledgeKnowledgebaseSourcesServicenowSourceIdSync(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SourceSyncResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SourceSyncResponse> response = (ApiResponse<SourceSyncResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SourceSyncResponse> response = (ApiResponse<SourceSyncResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create synchronization job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeSyncJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSyncJobResponse postKnowledgeKnowledgebaseSynchronizeJobs(String knowledgeBaseId, KnowledgeSyncJobRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseSynchronizeJobs(createPostKnowledgeKnowledgebaseSynchronizeJobsRequest(knowledgeBaseId, body));
  }

  /**
   * Create synchronization job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeSyncJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSyncJobResponse> postKnowledgeKnowledgebaseSynchronizeJobsWithHttpInfo(String knowledgeBaseId, KnowledgeSyncJobRequest body) throws IOException {
    return postKnowledgeKnowledgebaseSynchronizeJobs(createPostKnowledgeKnowledgebaseSynchronizeJobsRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseSynchronizeJobsRequest createPostKnowledgeKnowledgebaseSynchronizeJobsRequest(String knowledgeBaseId, KnowledgeSyncJobRequest body) {
    return PostKnowledgeKnowledgebaseSynchronizeJobsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Create synchronization job
   * 
   * @param request The request object
   * @return KnowledgeSyncJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSyncJobResponse postKnowledgeKnowledgebaseSynchronizeJobs(PostKnowledgeKnowledgebaseSynchronizeJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeSyncJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeSyncJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create synchronization job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSyncJobResponse> postKnowledgeKnowledgebaseSynchronizeJobs(ApiRequest<KnowledgeSyncJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeSyncJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create content upload from URL job
   * 
   * postKnowledgeKnowledgebaseUploadsUrlsJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body uploadRequest (required)
   * @return CreateUploadSourceUrlJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateUploadSourceUrlJobResponse postKnowledgeKnowledgebaseUploadsUrlsJobs(String knowledgeBaseId, CreateUploadSourceUrlJobRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseUploadsUrlsJobs(createPostKnowledgeKnowledgebaseUploadsUrlsJobsRequest(knowledgeBaseId, body));
  }

  /**
   * Create content upload from URL job
   * 
   * postKnowledgeKnowledgebaseUploadsUrlsJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body uploadRequest (required)
   * @return CreateUploadSourceUrlJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateUploadSourceUrlJobResponse> postKnowledgeKnowledgebaseUploadsUrlsJobsWithHttpInfo(String knowledgeBaseId, CreateUploadSourceUrlJobRequest body) throws IOException {
    return postKnowledgeKnowledgebaseUploadsUrlsJobs(createPostKnowledgeKnowledgebaseUploadsUrlsJobsRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest createPostKnowledgeKnowledgebaseUploadsUrlsJobsRequest(String knowledgeBaseId, CreateUploadSourceUrlJobRequest body) {
    return PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Create content upload from URL job
   * 
   * postKnowledgeKnowledgebaseUploadsUrlsJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return CreateUploadSourceUrlJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateUploadSourceUrlJobResponse postKnowledgeKnowledgebaseUploadsUrlsJobs(PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CreateUploadSourceUrlJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CreateUploadSourceUrlJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create content upload from URL job
   * 
   * postKnowledgeKnowledgebaseUploadsUrlsJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateUploadSourceUrlJobResponse> postKnowledgeKnowledgebaseUploadsUrlsJobs(ApiRequest<CreateUploadSourceUrlJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CreateUploadSourceUrlJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CreateUploadSourceUrlJobResponse> response = (ApiResponse<CreateUploadSourceUrlJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CreateUploadSourceUrlJobResponse> response = (ApiResponse<CreateUploadSourceUrlJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create new knowledge base
   * 
   * @param body  (required)
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase postKnowledgeKnowledgebases(KnowledgeBaseCreateRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebases(createPostKnowledgeKnowledgebasesRequest(body));
  }

  /**
   * Create new knowledge base
   * 
   * @param body  (required)
   * @return KnowledgeBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> postKnowledgeKnowledgebasesWithHttpInfo(KnowledgeBaseCreateRequest body) throws IOException {
    return postKnowledgeKnowledgebases(createPostKnowledgeKnowledgebasesRequest(body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebasesRequest createPostKnowledgeKnowledgebasesRequest(KnowledgeBaseCreateRequest body) {
    return PostKnowledgeKnowledgebasesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create new knowledge base
   * 
   * @param request The request object
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase postKnowledgeKnowledgebases(PostKnowledgeKnowledgebasesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create new knowledge base
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> postKnowledgeKnowledgebases(ApiRequest<KnowledgeBaseCreateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update Salesforce Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @param body  (required)
   * @return SalesforceSourceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SalesforceSourceResponse putKnowledgeKnowledgebaseSourcesSalesforceSourceId(String knowledgeBaseId, String sourceId, SalesforceSourceRequest body) throws IOException, ApiException {
    return  putKnowledgeKnowledgebaseSourcesSalesforceSourceId(createPutKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest(knowledgeBaseId, sourceId, body));
  }

  /**
   * Update Salesforce Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @param body  (required)
   * @return SalesforceSourceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SalesforceSourceResponse> putKnowledgeKnowledgebaseSourcesSalesforceSourceIdWithHttpInfo(String knowledgeBaseId, String sourceId, SalesforceSourceRequest body) throws IOException {
    return putKnowledgeKnowledgebaseSourcesSalesforceSourceId(createPutKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest(knowledgeBaseId, sourceId, body).withHttpInfo());
  }

  private PutKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest createPutKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest(String knowledgeBaseId, String sourceId, SalesforceSourceRequest body) {
    return PutKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withSourceId(sourceId)

            .withBody(body)

            .build();
  }

  /**
   * Update Salesforce Knowledge integration source
   * 
   * @param request The request object
   * @return SalesforceSourceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SalesforceSourceResponse putKnowledgeKnowledgebaseSourcesSalesforceSourceId(PutKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SalesforceSourceResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SalesforceSourceResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Salesforce Knowledge integration source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SalesforceSourceResponse> putKnowledgeKnowledgebaseSourcesSalesforceSourceId(ApiRequest<SalesforceSourceRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SalesforceSourceResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SalesforceSourceResponse> response = (ApiResponse<SalesforceSourceResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SalesforceSourceResponse> response = (ApiResponse<SalesforceSourceResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update ServiceNow Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @param body  (required)
   * @return ServiceNowSourceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceNowSourceResponse putKnowledgeKnowledgebaseSourcesServicenowSourceId(String knowledgeBaseId, String sourceId, ServiceNowSourceRequest body) throws IOException, ApiException {
    return  putKnowledgeKnowledgebaseSourcesServicenowSourceId(createPutKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest(knowledgeBaseId, sourceId, body));
  }

  /**
   * Update ServiceNow Knowledge integration source
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param sourceId Source ID (required)
   * @param body  (required)
   * @return ServiceNowSourceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceNowSourceResponse> putKnowledgeKnowledgebaseSourcesServicenowSourceIdWithHttpInfo(String knowledgeBaseId, String sourceId, ServiceNowSourceRequest body) throws IOException {
    return putKnowledgeKnowledgebaseSourcesServicenowSourceId(createPutKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest(knowledgeBaseId, sourceId, body).withHttpInfo());
  }

  private PutKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest createPutKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest(String knowledgeBaseId, String sourceId, ServiceNowSourceRequest body) {
    return PutKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withSourceId(sourceId)

            .withBody(body)

            .build();
  }

  /**
   * Update ServiceNow Knowledge integration source
   * 
   * @param request The request object
   * @return ServiceNowSourceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceNowSourceResponse putKnowledgeKnowledgebaseSourcesServicenowSourceId(PutKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ServiceNowSourceResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ServiceNowSourceResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update ServiceNow Knowledge integration source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceNowSourceResponse> putKnowledgeKnowledgebaseSourcesServicenowSourceId(ApiRequest<ServiceNowSourceRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ServiceNowSourceResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceNowSourceResponse> response = (ApiResponse<ServiceNowSourceResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceNowSourceResponse> response = (ApiResponse<ServiceNowSourceResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
