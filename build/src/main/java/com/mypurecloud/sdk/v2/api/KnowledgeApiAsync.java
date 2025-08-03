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
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentChunkRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentChunkResponse;
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
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseChunksSearchRequest;
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
import java.util.concurrent.Future;

public class KnowledgeApiAsync {
  private final ApiClient pcapiClient;

  public KnowledgeApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public KnowledgeApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete knowledge base
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeBase> deleteKnowledgeKnowledgebaseAsync(DeleteKnowledgeKnowledgebaseRequest request, final AsyncApiCallback<KnowledgeBase> callback) {
    try {
      final SettableFuture<KnowledgeBase> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeBase>() {}, new AsyncApiCallback<ApiResponse<KnowledgeBase>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete knowledge base
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeBase>> deleteKnowledgeKnowledgebaseAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeBase>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeBase>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeBase>() {}, new AsyncApiCallback<ApiResponse<KnowledgeBase>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CategoryResponse> deleteKnowledgeKnowledgebaseCategoryAsync(DeleteKnowledgeKnowledgebaseCategoryRequest request, final AsyncApiCallback<CategoryResponse> callback) {
    try {
      final SettableFuture<CategoryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CategoryResponse>() {}, new AsyncApiCallback<ApiResponse<CategoryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CategoryResponse>> deleteKnowledgeKnowledgebaseCategoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CategoryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CategoryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CategoryResponse>() {}, new AsyncApiCallback<ApiResponse<CategoryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteKnowledgeKnowledgebaseDocumentAsync(DeleteKnowledgeKnowledgebaseDocumentRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteKnowledgeKnowledgebaseDocumentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a variation for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteKnowledgeKnowledgebaseDocumentVariationAsync(DeleteKnowledgeKnowledgebaseDocumentVariationRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a variation for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteKnowledgeKnowledgebaseDocumentVariationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete export job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteKnowledgeKnowledgebaseExportJobAsync(DeleteKnowledgeKnowledgebaseExportJobRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete export job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteKnowledgeKnowledgebaseExportJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteKnowledgeKnowledgebaseImportJobAsync(DeleteKnowledgeKnowledgebaseImportJobRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteKnowledgeKnowledgebaseImportJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete label
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LabelResponse> deleteKnowledgeKnowledgebaseLabelAsync(DeleteKnowledgeKnowledgebaseLabelRequest request, final AsyncApiCallback<LabelResponse> callback) {
    try {
      final SettableFuture<LabelResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LabelResponse>() {}, new AsyncApiCallback<ApiResponse<LabelResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LabelResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete label
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LabelResponse>> deleteKnowledgeKnowledgebaseLabelAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LabelResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LabelResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LabelResponse>() {}, new AsyncApiCallback<ApiResponse<LabelResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LabelResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeCategory> deleteKnowledgeKnowledgebaseLanguageCategoryAsync(DeleteKnowledgeKnowledgebaseLanguageCategoryRequest request, final AsyncApiCallback<KnowledgeCategory> callback) {
    try {
      final SettableFuture<KnowledgeCategory> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeCategory>() {}, new AsyncApiCallback<ApiResponse<KnowledgeCategory>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeCategory> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeCategory>> deleteKnowledgeKnowledgebaseLanguageCategoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeCategory>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeCategory>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeCategory>() {}, new AsyncApiCallback<ApiResponse<KnowledgeCategory>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeCategory> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeCategory> response = (ApiResponse<KnowledgeCategory>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeCategory> response = (ApiResponse<KnowledgeCategory>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeDocument> deleteKnowledgeKnowledgebaseLanguageDocumentAsync(DeleteKnowledgeKnowledgebaseLanguageDocumentRequest request, final AsyncApiCallback<KnowledgeDocument> callback) {
    try {
      final SettableFuture<KnowledgeDocument> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocument>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocument>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocument> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeDocument>> deleteKnowledgeKnowledgebaseLanguageDocumentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeDocument>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocument>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocument>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocument>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocument> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete import operation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<Void> deleteKnowledgeKnowledgebaseLanguageDocumentsImportAsync(DeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete import operation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<Void>> deleteKnowledgeKnowledgebaseLanguageDocumentsImportAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete Salesforce Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteKnowledgeKnowledgebaseSourcesSalesforceSourceIdAsync(DeleteKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete Salesforce Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteKnowledgeKnowledgebaseSourcesSalesforceSourceIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete ServiceNow Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteKnowledgeKnowledgebaseSourcesServicenowSourceIdAsync(DeleteKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete ServiceNow Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteKnowledgeKnowledgebaseSourcesServicenowSourceIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete synchronization job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteKnowledgeKnowledgebaseSynchronizeJobAsync(DeleteKnowledgeKnowledgebaseSynchronizeJobRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete synchronization job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteKnowledgeKnowledgebaseSynchronizeJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get categories
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GuestCategoryResponseListing> getKnowledgeGuestSessionCategoriesAsync(GetKnowledgeGuestSessionCategoriesRequest request, final AsyncApiCallback<GuestCategoryResponseListing> callback) {
    try {
      final SettableFuture<GuestCategoryResponseListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GuestCategoryResponseListing>() {}, new AsyncApiCallback<ApiResponse<GuestCategoryResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<GuestCategoryResponseListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get categories
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GuestCategoryResponseListing>> getKnowledgeGuestSessionCategoriesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GuestCategoryResponseListing>> callback) {
    try {
      final SettableFuture<ApiResponse<GuestCategoryResponseListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GuestCategoryResponseListing>() {}, new AsyncApiCallback<ApiResponse<GuestCategoryResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<GuestCategoryResponseListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GuestCategoryResponseListing> response = (ApiResponse<GuestCategoryResponseListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GuestCategoryResponseListing> response = (ApiResponse<GuestCategoryResponseListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a knowledge document by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeGuestDocumentResponse> getKnowledgeGuestSessionDocumentAsync(GetKnowledgeGuestSessionDocumentRequest request, final AsyncApiCallback<KnowledgeGuestDocumentResponse> callback) {
    try {
      final SettableFuture<KnowledgeGuestDocumentResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeGuestDocumentResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeGuestDocumentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeGuestDocumentResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a knowledge document by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeGuestDocumentResponse>> getKnowledgeGuestSessionDocumentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeGuestDocumentResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeGuestDocumentResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeGuestDocumentResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeGuestDocumentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeGuestDocumentResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeGuestDocumentResponse> response = (ApiResponse<KnowledgeGuestDocumentResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeGuestDocumentResponse> response = (ApiResponse<KnowledgeGuestDocumentResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeGuestDocumentResponseListing> getKnowledgeGuestSessionDocumentsAsync(GetKnowledgeGuestSessionDocumentsRequest request, final AsyncApiCallback<KnowledgeGuestDocumentResponseListing> callback) {
    try {
      final SettableFuture<KnowledgeGuestDocumentResponseListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeGuestDocumentResponseListing>() {}, new AsyncApiCallback<ApiResponse<KnowledgeGuestDocumentResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeGuestDocumentResponseListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeGuestDocumentResponseListing>> getKnowledgeGuestSessionDocumentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeGuestDocumentResponseListing>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeGuestDocumentResponseListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeGuestDocumentResponseListing>() {}, new AsyncApiCallback<ApiResponse<KnowledgeGuestDocumentResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeGuestDocumentResponseListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeGuestDocumentResponseListing> response = (ApiResponse<KnowledgeGuestDocumentResponseListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeGuestDocumentResponseListing> response = (ApiResponse<KnowledgeGuestDocumentResponseListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get sync options available for a knowledge-connect integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeIntegrationOptionsResponse> getKnowledgeIntegrationOptionsAsync(GetKnowledgeIntegrationOptionsRequest request, final AsyncApiCallback<KnowledgeIntegrationOptionsResponse> callback) {
    try {
      final SettableFuture<KnowledgeIntegrationOptionsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeIntegrationOptionsResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeIntegrationOptionsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeIntegrationOptionsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get sync options available for a knowledge-connect integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeIntegrationOptionsResponse>> getKnowledgeIntegrationOptionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeIntegrationOptionsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeIntegrationOptionsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeIntegrationOptionsResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeIntegrationOptionsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeIntegrationOptionsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeIntegrationOptionsResponse> response = (ApiResponse<KnowledgeIntegrationOptionsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeIntegrationOptionsResponse> response = (ApiResponse<KnowledgeIntegrationOptionsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get knowledge base
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeBase> getKnowledgeKnowledgebaseAsync(GetKnowledgeKnowledgebaseRequest request, final AsyncApiCallback<KnowledgeBase> callback) {
    try {
      final SettableFuture<KnowledgeBase> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeBase>() {}, new AsyncApiCallback<ApiResponse<KnowledgeBase>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get knowledge base
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeBase>> getKnowledgeKnowledgebaseAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeBase>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeBase>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeBase>() {}, new AsyncApiCallback<ApiResponse<KnowledgeBase>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get categories
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CategoryResponseListing> getKnowledgeKnowledgebaseCategoriesAsync(GetKnowledgeKnowledgebaseCategoriesRequest request, final AsyncApiCallback<CategoryResponseListing> callback) {
    try {
      final SettableFuture<CategoryResponseListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CategoryResponseListing>() {}, new AsyncApiCallback<ApiResponse<CategoryResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryResponseListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get categories
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CategoryResponseListing>> getKnowledgeKnowledgebaseCategoriesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CategoryResponseListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CategoryResponseListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CategoryResponseListing>() {}, new AsyncApiCallback<ApiResponse<CategoryResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryResponseListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryResponseListing> response = (ApiResponse<CategoryResponseListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryResponseListing> response = (ApiResponse<CategoryResponseListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CategoryResponse> getKnowledgeKnowledgebaseCategoryAsync(GetKnowledgeKnowledgebaseCategoryRequest request, final AsyncApiCallback<CategoryResponse> callback) {
    try {
      final SettableFuture<CategoryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CategoryResponse>() {}, new AsyncApiCallback<ApiResponse<CategoryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CategoryResponse>> getKnowledgeKnowledgebaseCategoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CategoryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CategoryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CategoryResponse>() {}, new AsyncApiCallback<ApiResponse<CategoryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentResponse> getKnowledgeKnowledgebaseDocumentAsync(GetKnowledgeKnowledgebaseDocumentRequest request, final AsyncApiCallback<KnowledgeDocumentResponse> callback) {
    try {
      final SettableFuture<KnowledgeDocumentResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentResponse>> getKnowledgeKnowledgebaseDocumentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentResponse> response = (ApiResponse<KnowledgeDocumentResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentResponse> response = (ApiResponse<KnowledgeDocumentResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of feedback records given on a document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentFeedbackResponseListing> getKnowledgeKnowledgebaseDocumentFeedbackAsync(GetKnowledgeKnowledgebaseDocumentFeedbackRequest request, final AsyncApiCallback<KnowledgeDocumentFeedbackResponseListing> callback) {
    try {
      final SettableFuture<KnowledgeDocumentFeedbackResponseListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentFeedbackResponseListing>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentFeedbackResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentFeedbackResponseListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of feedback records given on a document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentFeedbackResponseListing>> getKnowledgeKnowledgebaseDocumentFeedbackAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentFeedbackResponseListing>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentFeedbackResponseListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentFeedbackResponseListing>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentFeedbackResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentFeedbackResponseListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentFeedbackResponseListing> response = (ApiResponse<KnowledgeDocumentFeedbackResponseListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentFeedbackResponseListing> response = (ApiResponse<KnowledgeDocumentFeedbackResponseListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a single feedback record given on a document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentFeedbackResponse> getKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdAsync(GetKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest request, final AsyncApiCallback<KnowledgeDocumentFeedbackResponse> callback) {
    try {
      final SettableFuture<KnowledgeDocumentFeedbackResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentFeedbackResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentFeedbackResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentFeedbackResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a single feedback record given on a document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentFeedbackResponse>> getKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentFeedbackResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentFeedbackResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentFeedbackResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentFeedbackResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentFeedbackResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentFeedbackResponse> response = (ApiResponse<KnowledgeDocumentFeedbackResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentFeedbackResponse> response = (ApiResponse<KnowledgeDocumentFeedbackResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a variation for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DocumentVariationResponse> getKnowledgeKnowledgebaseDocumentVariationAsync(GetKnowledgeKnowledgebaseDocumentVariationRequest request, final AsyncApiCallback<DocumentVariationResponse> callback) {
    try {
      final SettableFuture<DocumentVariationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DocumentVariationResponse>() {}, new AsyncApiCallback<ApiResponse<DocumentVariationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentVariationResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a variation for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DocumentVariationResponse>> getKnowledgeKnowledgebaseDocumentVariationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DocumentVariationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<DocumentVariationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DocumentVariationResponse>() {}, new AsyncApiCallback<ApiResponse<DocumentVariationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentVariationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentVariationResponse> response = (ApiResponse<DocumentVariationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentVariationResponse> response = (ApiResponse<DocumentVariationResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get variations for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DocumentVariationResponseListing> getKnowledgeKnowledgebaseDocumentVariationsAsync(GetKnowledgeKnowledgebaseDocumentVariationsRequest request, final AsyncApiCallback<DocumentVariationResponseListing> callback) {
    try {
      final SettableFuture<DocumentVariationResponseListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DocumentVariationResponseListing>() {}, new AsyncApiCallback<ApiResponse<DocumentVariationResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentVariationResponseListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get variations for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DocumentVariationResponseListing>> getKnowledgeKnowledgebaseDocumentVariationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DocumentVariationResponseListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DocumentVariationResponseListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DocumentVariationResponseListing>() {}, new AsyncApiCallback<ApiResponse<DocumentVariationResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentVariationResponseListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentVariationResponseListing> response = (ApiResponse<DocumentVariationResponseListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentVariationResponseListing> response = (ApiResponse<DocumentVariationResponseListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get document version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentVersion> getKnowledgeKnowledgebaseDocumentVersionAsync(GetKnowledgeKnowledgebaseDocumentVersionRequest request, final AsyncApiCallback<KnowledgeDocumentVersion> callback) {
    try {
      final SettableFuture<KnowledgeDocumentVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentVersion>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentVersion>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get document version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentVersion>> getKnowledgeKnowledgebaseDocumentVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentVersion>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentVersion>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentVersion> response = (ApiResponse<KnowledgeDocumentVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentVersion> response = (ApiResponse<KnowledgeDocumentVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get variation for the given document version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentVersionVariation> getKnowledgeKnowledgebaseDocumentVersionVariationAsync(GetKnowledgeKnowledgebaseDocumentVersionVariationRequest request, final AsyncApiCallback<KnowledgeDocumentVersionVariation> callback) {
    try {
      final SettableFuture<KnowledgeDocumentVersionVariation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentVersionVariation>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentVersionVariation>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentVersionVariation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get variation for the given document version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentVersionVariation>> getKnowledgeKnowledgebaseDocumentVersionVariationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentVersionVariation>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentVersionVariation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentVersionVariation>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentVersionVariation>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentVersionVariation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentVersionVariation> response = (ApiResponse<KnowledgeDocumentVersionVariation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentVersionVariation> response = (ApiResponse<KnowledgeDocumentVersionVariation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get variations for the given document version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentVersionVariationListing> getKnowledgeKnowledgebaseDocumentVersionVariationsAsync(GetKnowledgeKnowledgebaseDocumentVersionVariationsRequest request, final AsyncApiCallback<KnowledgeDocumentVersionVariationListing> callback) {
    try {
      final SettableFuture<KnowledgeDocumentVersionVariationListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentVersionVariationListing>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentVersionVariationListing>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentVersionVariationListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get variations for the given document version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentVersionVariationListing>> getKnowledgeKnowledgebaseDocumentVersionVariationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentVersionVariationListing>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentVersionVariationListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentVersionVariationListing>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentVersionVariationListing>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentVersionVariationListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentVersionVariationListing> response = (ApiResponse<KnowledgeDocumentVersionVariationListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentVersionVariationListing> response = (ApiResponse<KnowledgeDocumentVersionVariationListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get document versions.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentVersionListing> getKnowledgeKnowledgebaseDocumentVersionsAsync(GetKnowledgeKnowledgebaseDocumentVersionsRequest request, final AsyncApiCallback<KnowledgeDocumentVersionListing> callback) {
    try {
      final SettableFuture<KnowledgeDocumentVersionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentVersionListing>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentVersionListing>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentVersionListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get document versions.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentVersionListing>> getKnowledgeKnowledgebaseDocumentVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentVersionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentVersionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentVersionListing>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentVersionListing>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentVersionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentVersionListing> response = (ApiResponse<KnowledgeDocumentVersionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentVersionListing> response = (ApiResponse<KnowledgeDocumentVersionListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentResponseListing> getKnowledgeKnowledgebaseDocumentsAsync(GetKnowledgeKnowledgebaseDocumentsRequest request, final AsyncApiCallback<KnowledgeDocumentResponseListing> callback) {
    try {
      final SettableFuture<KnowledgeDocumentResponseListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentResponseListing>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentResponseListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentResponseListing>> getKnowledgeKnowledgebaseDocumentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentResponseListing>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentResponseListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentResponseListing>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentResponseListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentResponseListing> response = (ApiResponse<KnowledgeDocumentResponseListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentResponseListing> response = (ApiResponse<KnowledgeDocumentResponseListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get export job report
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeExportJobResponse> getKnowledgeKnowledgebaseExportJobAsync(GetKnowledgeKnowledgebaseExportJobRequest request, final AsyncApiCallback<KnowledgeExportJobResponse> callback) {
    try {
      final SettableFuture<KnowledgeExportJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeExportJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeExportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeExportJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get export job report
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeExportJobResponse>> getKnowledgeKnowledgebaseExportJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeExportJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeExportJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeExportJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeExportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeExportJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeExportJobResponse> response = (ApiResponse<KnowledgeExportJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeExportJobResponse> response = (ApiResponse<KnowledgeExportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get import job report
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeImportJobResponse> getKnowledgeKnowledgebaseImportJobAsync(GetKnowledgeKnowledgebaseImportJobRequest request, final AsyncApiCallback<KnowledgeImportJobResponse> callback) {
    try {
      final SettableFuture<KnowledgeImportJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeImportJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeImportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeImportJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get import job report
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeImportJobResponse>> getKnowledgeKnowledgebaseImportJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeImportJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeImportJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeImportJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeImportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeImportJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeImportJobResponse> response = (ApiResponse<KnowledgeImportJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeImportJobResponse> response = (ApiResponse<KnowledgeImportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get label
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LabelResponse> getKnowledgeKnowledgebaseLabelAsync(GetKnowledgeKnowledgebaseLabelRequest request, final AsyncApiCallback<LabelResponse> callback) {
    try {
      final SettableFuture<LabelResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LabelResponse>() {}, new AsyncApiCallback<ApiResponse<LabelResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LabelResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get label
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LabelResponse>> getKnowledgeKnowledgebaseLabelAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LabelResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LabelResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LabelResponse>() {}, new AsyncApiCallback<ApiResponse<LabelResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LabelResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get labels
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LabelListing> getKnowledgeKnowledgebaseLabelsAsync(GetKnowledgeKnowledgebaseLabelsRequest request, final AsyncApiCallback<LabelListing> callback) {
    try {
      final SettableFuture<LabelListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LabelListing>() {}, new AsyncApiCallback<ApiResponse<LabelListing>>() {
        @Override
        public void onCompleted(ApiResponse<LabelListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get labels
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LabelListing>> getKnowledgeKnowledgebaseLabelsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LabelListing>> callback) {
    try {
      final SettableFuture<ApiResponse<LabelListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LabelListing>() {}, new AsyncApiCallback<ApiResponse<LabelListing>>() {
        @Override
        public void onCompleted(ApiResponse<LabelListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LabelListing> response = (ApiResponse<LabelListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LabelListing> response = (ApiResponse<LabelListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get categories
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<CategoryListing> getKnowledgeKnowledgebaseLanguageCategoriesAsync(GetKnowledgeKnowledgebaseLanguageCategoriesRequest request, final AsyncApiCallback<CategoryListing> callback) {
    try {
      final SettableFuture<CategoryListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CategoryListing>() {}, new AsyncApiCallback<ApiResponse<CategoryListing>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get categories
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<CategoryListing>> getKnowledgeKnowledgebaseLanguageCategoriesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CategoryListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CategoryListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CategoryListing>() {}, new AsyncApiCallback<ApiResponse<CategoryListing>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryListing> response = (ApiResponse<CategoryListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryListing> response = (ApiResponse<CategoryListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeExtendedCategory> getKnowledgeKnowledgebaseLanguageCategoryAsync(GetKnowledgeKnowledgebaseLanguageCategoryRequest request, final AsyncApiCallback<KnowledgeExtendedCategory> callback) {
    try {
      final SettableFuture<KnowledgeExtendedCategory> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeExtendedCategory>() {}, new AsyncApiCallback<ApiResponse<KnowledgeExtendedCategory>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeExtendedCategory> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeExtendedCategory>> getKnowledgeKnowledgebaseLanguageCategoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeExtendedCategory>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeExtendedCategory>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeExtendedCategory>() {}, new AsyncApiCallback<ApiResponse<KnowledgeExtendedCategory>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeExtendedCategory> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeDocument> getKnowledgeKnowledgebaseLanguageDocumentAsync(GetKnowledgeKnowledgebaseLanguageDocumentRequest request, final AsyncApiCallback<KnowledgeDocument> callback) {
    try {
      final SettableFuture<KnowledgeDocument> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocument>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocument>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocument> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeDocument>> getKnowledgeKnowledgebaseLanguageDocumentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeDocument>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocument>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocument>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocument>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocument> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get document content upload status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeDocumentContentUpload> getKnowledgeKnowledgebaseLanguageDocumentUploadAsync(GetKnowledgeKnowledgebaseLanguageDocumentUploadRequest request, final AsyncApiCallback<KnowledgeDocumentContentUpload> callback) {
    try {
      final SettableFuture<KnowledgeDocumentContentUpload> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentContentUpload>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentContentUpload>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentContentUpload> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get document content upload status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeDocumentContentUpload>> getKnowledgeKnowledgebaseLanguageDocumentUploadAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentContentUpload>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentContentUpload>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentContentUpload>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentContentUpload>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentContentUpload> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentContentUpload> response = (ApiResponse<KnowledgeDocumentContentUpload>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentContentUpload> response = (ApiResponse<KnowledgeDocumentContentUpload>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get documents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<DocumentListing> getKnowledgeKnowledgebaseLanguageDocumentsAsync(GetKnowledgeKnowledgebaseLanguageDocumentsRequest request, final AsyncApiCallback<DocumentListing> callback) {
    try {
      final SettableFuture<DocumentListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DocumentListing>() {}, new AsyncApiCallback<ApiResponse<DocumentListing>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get documents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<DocumentListing>> getKnowledgeKnowledgebaseLanguageDocumentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DocumentListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DocumentListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DocumentListing>() {}, new AsyncApiCallback<ApiResponse<DocumentListing>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentListing> response = (ApiResponse<DocumentListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentListing> response = (ApiResponse<DocumentListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get import operation report
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeImport> getKnowledgeKnowledgebaseLanguageDocumentsImportAsync(GetKnowledgeKnowledgebaseLanguageDocumentsImportRequest request, final AsyncApiCallback<KnowledgeImport> callback) {
    try {
      final SettableFuture<KnowledgeImport> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeImport>() {}, new AsyncApiCallback<ApiResponse<KnowledgeImport>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeImport> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get import operation report
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeImport>> getKnowledgeKnowledgebaseLanguageDocumentsImportAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeImport>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeImport>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeImport>() {}, new AsyncApiCallback<ApiResponse<KnowledgeImport>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeImport> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get training detail
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeTraining> getKnowledgeKnowledgebaseLanguageTrainingAsync(GetKnowledgeKnowledgebaseLanguageTrainingRequest request, final AsyncApiCallback<KnowledgeTraining> callback) {
    try {
      final SettableFuture<KnowledgeTraining> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeTraining>() {}, new AsyncApiCallback<ApiResponse<KnowledgeTraining>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeTraining> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get training detail
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeTraining>> getKnowledgeKnowledgebaseLanguageTrainingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeTraining>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeTraining>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeTraining>() {}, new AsyncApiCallback<ApiResponse<KnowledgeTraining>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeTraining> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all trainings information for a knowledgebase
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<TrainingListing> getKnowledgeKnowledgebaseLanguageTrainingsAsync(GetKnowledgeKnowledgebaseLanguageTrainingsRequest request, final AsyncApiCallback<TrainingListing> callback) {
    try {
      final SettableFuture<TrainingListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TrainingListing>() {}, new AsyncApiCallback<ApiResponse<TrainingListing>>() {
        @Override
        public void onCompleted(ApiResponse<TrainingListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all trainings information for a knowledgebase
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<TrainingListing>> getKnowledgeKnowledgebaseLanguageTrainingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TrainingListing>> callback) {
    try {
      final SettableFuture<ApiResponse<TrainingListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TrainingListing>() {}, new AsyncApiCallback<ApiResponse<TrainingListing>>() {
        @Override
        public void onCompleted(ApiResponse<TrainingListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TrainingListing> response = (ApiResponse<TrainingListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TrainingListing> response = (ApiResponse<TrainingListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get operations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OperationListing> getKnowledgeKnowledgebaseOperationsAsync(GetKnowledgeKnowledgebaseOperationsRequest request, final AsyncApiCallback<OperationListing> callback) {
    try {
      final SettableFuture<OperationListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OperationListing>() {}, new AsyncApiCallback<ApiResponse<OperationListing>>() {
        @Override
        public void onCompleted(ApiResponse<OperationListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get operations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OperationListing>> getKnowledgeKnowledgebaseOperationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OperationListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OperationListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OperationListing>() {}, new AsyncApiCallback<ApiResponse<OperationListing>>() {
        @Override
        public void onCompleted(ApiResponse<OperationListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OperationListing> response = (ApiResponse<OperationListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OperationListing> response = (ApiResponse<OperationListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get ids of operation creator users and oauth clients
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OperationCreatorUserResponse> getKnowledgeKnowledgebaseOperationsUsersQueryAsync(GetKnowledgeKnowledgebaseOperationsUsersQueryRequest request, final AsyncApiCallback<OperationCreatorUserResponse> callback) {
    try {
      final SettableFuture<OperationCreatorUserResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OperationCreatorUserResponse>() {}, new AsyncApiCallback<ApiResponse<OperationCreatorUserResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OperationCreatorUserResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get ids of operation creator users and oauth clients
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OperationCreatorUserResponse>> getKnowledgeKnowledgebaseOperationsUsersQueryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OperationCreatorUserResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<OperationCreatorUserResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OperationCreatorUserResponse>() {}, new AsyncApiCallback<ApiResponse<OperationCreatorUserResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OperationCreatorUserResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OperationCreatorUserResponse> response = (ApiResponse<OperationCreatorUserResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OperationCreatorUserResponse> response = (ApiResponse<OperationCreatorUserResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get parse job report
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeParseJobResponse> getKnowledgeKnowledgebaseParseJobAsync(GetKnowledgeKnowledgebaseParseJobRequest request, final AsyncApiCallback<KnowledgeParseJobResponse> callback) {
    try {
      final SettableFuture<KnowledgeParseJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeParseJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeParseJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeParseJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get parse job report
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeParseJobResponse>> getKnowledgeKnowledgebaseParseJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeParseJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeParseJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeParseJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeParseJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeParseJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeParseJobResponse> response = (ApiResponse<KnowledgeParseJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeParseJobResponse> response = (ApiResponse<KnowledgeParseJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Knowledge integration sources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<SourceBaseResponse>> getKnowledgeKnowledgebaseSourcesAsync(GetKnowledgeKnowledgebaseSourcesRequest request, final AsyncApiCallback<List<SourceBaseResponse>> callback) {
    try {
      final SettableFuture<List<SourceBaseResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<SourceBaseResponse>>() {}, new AsyncApiCallback<ApiResponse<List<SourceBaseResponse>>>() {
        @Override
        public void onCompleted(ApiResponse<List<SourceBaseResponse>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Knowledge integration sources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<SourceBaseResponse>>> getKnowledgeKnowledgebaseSourcesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<SourceBaseResponse>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<SourceBaseResponse>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<SourceBaseResponse>>() {}, new AsyncApiCallback<ApiResponse<List<SourceBaseResponse>>>() {
        @Override
        public void onCompleted(ApiResponse<List<SourceBaseResponse>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<SourceBaseResponse>> response = (ApiResponse<List<SourceBaseResponse>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<SourceBaseResponse>> response = (ApiResponse<List<SourceBaseResponse>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Salesforce Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SalesforceSourceResponse> getKnowledgeKnowledgebaseSourcesSalesforceSourceIdAsync(GetKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest request, final AsyncApiCallback<SalesforceSourceResponse> callback) {
    try {
      final SettableFuture<SalesforceSourceResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SalesforceSourceResponse>() {}, new AsyncApiCallback<ApiResponse<SalesforceSourceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SalesforceSourceResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Salesforce Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SalesforceSourceResponse>> getKnowledgeKnowledgebaseSourcesSalesforceSourceIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SalesforceSourceResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SalesforceSourceResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SalesforceSourceResponse>() {}, new AsyncApiCallback<ApiResponse<SalesforceSourceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SalesforceSourceResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SalesforceSourceResponse> response = (ApiResponse<SalesforceSourceResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SalesforceSourceResponse> response = (ApiResponse<SalesforceSourceResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get ServiceNow Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ServiceNowSourceResponse> getKnowledgeKnowledgebaseSourcesServicenowSourceIdAsync(GetKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest request, final AsyncApiCallback<ServiceNowSourceResponse> callback) {
    try {
      final SettableFuture<ServiceNowSourceResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ServiceNowSourceResponse>() {}, new AsyncApiCallback<ApiResponse<ServiceNowSourceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceNowSourceResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get ServiceNow Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ServiceNowSourceResponse>> getKnowledgeKnowledgebaseSourcesServicenowSourceIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ServiceNowSourceResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ServiceNowSourceResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ServiceNowSourceResponse>() {}, new AsyncApiCallback<ApiResponse<ServiceNowSourceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceNowSourceResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceNowSourceResponse> response = (ApiResponse<ServiceNowSourceResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceNowSourceResponse> response = (ApiResponse<ServiceNowSourceResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get synchronization job report
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeSyncJobResponse> getKnowledgeKnowledgebaseSynchronizeJobAsync(GetKnowledgeKnowledgebaseSynchronizeJobRequest request, final AsyncApiCallback<KnowledgeSyncJobResponse> callback) {
    try {
      final SettableFuture<KnowledgeSyncJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeSyncJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSyncJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get synchronization job report
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeSyncJobResponse>> getKnowledgeKnowledgebaseSynchronizeJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeSyncJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeSyncJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSyncJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get knowledge base unanswered group for a particular groupId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UnansweredGroup> getKnowledgeKnowledgebaseUnansweredGroupAsync(GetKnowledgeKnowledgebaseUnansweredGroupRequest request, final AsyncApiCallback<UnansweredGroup> callback) {
    try {
      final SettableFuture<UnansweredGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UnansweredGroup>() {}, new AsyncApiCallback<ApiResponse<UnansweredGroup>>() {
        @Override
        public void onCompleted(ApiResponse<UnansweredGroup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get knowledge base unanswered group for a particular groupId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UnansweredGroup>> getKnowledgeKnowledgebaseUnansweredGroupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UnansweredGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<UnansweredGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UnansweredGroup>() {}, new AsyncApiCallback<ApiResponse<UnansweredGroup>>() {
        @Override
        public void onCompleted(ApiResponse<UnansweredGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UnansweredGroup> response = (ApiResponse<UnansweredGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UnansweredGroup> response = (ApiResponse<UnansweredGroup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get knowledge base unanswered phrase group for a particular phraseGroupId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UnansweredPhraseGroup> getKnowledgeKnowledgebaseUnansweredGroupPhrasegroupAsync(GetKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest request, final AsyncApiCallback<UnansweredPhraseGroup> callback) {
    try {
      final SettableFuture<UnansweredPhraseGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UnansweredPhraseGroup>() {}, new AsyncApiCallback<ApiResponse<UnansweredPhraseGroup>>() {
        @Override
        public void onCompleted(ApiResponse<UnansweredPhraseGroup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get knowledge base unanswered phrase group for a particular phraseGroupId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UnansweredPhraseGroup>> getKnowledgeKnowledgebaseUnansweredGroupPhrasegroupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UnansweredPhraseGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<UnansweredPhraseGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UnansweredPhraseGroup>() {}, new AsyncApiCallback<ApiResponse<UnansweredPhraseGroup>>() {
        @Override
        public void onCompleted(ApiResponse<UnansweredPhraseGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UnansweredPhraseGroup> response = (ApiResponse<UnansweredPhraseGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UnansweredPhraseGroup> response = (ApiResponse<UnansweredPhraseGroup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get knowledge base unanswered groups
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UnansweredGroups> getKnowledgeKnowledgebaseUnansweredGroupsAsync(GetKnowledgeKnowledgebaseUnansweredGroupsRequest request, final AsyncApiCallback<UnansweredGroups> callback) {
    try {
      final SettableFuture<UnansweredGroups> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UnansweredGroups>() {}, new AsyncApiCallback<ApiResponse<UnansweredGroups>>() {
        @Override
        public void onCompleted(ApiResponse<UnansweredGroups> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get knowledge base unanswered groups
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UnansweredGroups>> getKnowledgeKnowledgebaseUnansweredGroupsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UnansweredGroups>> callback) {
    try {
      final SettableFuture<ApiResponse<UnansweredGroups>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UnansweredGroups>() {}, new AsyncApiCallback<ApiResponse<UnansweredGroups>>() {
        @Override
        public void onCompleted(ApiResponse<UnansweredGroups> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UnansweredGroups> response = (ApiResponse<UnansweredGroups>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UnansweredGroups> response = (ApiResponse<UnansweredGroups>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get content upload from URL job status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GetUploadSourceUrlJobStatusResponse> getKnowledgeKnowledgebaseUploadsUrlsJobAsync(GetKnowledgeKnowledgebaseUploadsUrlsJobRequest request, final AsyncApiCallback<GetUploadSourceUrlJobStatusResponse> callback) {
    try {
      final SettableFuture<GetUploadSourceUrlJobStatusResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GetUploadSourceUrlJobStatusResponse>() {}, new AsyncApiCallback<ApiResponse<GetUploadSourceUrlJobStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GetUploadSourceUrlJobStatusResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get content upload from URL job status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetUploadSourceUrlJobStatusResponse>> getKnowledgeKnowledgebaseUploadsUrlsJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GetUploadSourceUrlJobStatusResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<GetUploadSourceUrlJobStatusResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GetUploadSourceUrlJobStatusResponse>() {}, new AsyncApiCallback<ApiResponse<GetUploadSourceUrlJobStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GetUploadSourceUrlJobStatusResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GetUploadSourceUrlJobStatusResponse> response = (ApiResponse<GetUploadSourceUrlJobStatusResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GetUploadSourceUrlJobStatusResponse> response = (ApiResponse<GetUploadSourceUrlJobStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get knowledge bases
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeBaseListing> getKnowledgeKnowledgebasesAsync(GetKnowledgeKnowledgebasesRequest request, final AsyncApiCallback<KnowledgeBaseListing> callback) {
    try {
      final SettableFuture<KnowledgeBaseListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeBaseListing>() {}, new AsyncApiCallback<ApiResponse<KnowledgeBaseListing>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeBaseListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get knowledge bases
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeBaseListing>> getKnowledgeKnowledgebasesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeBaseListing>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeBaseListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeBaseListing>() {}, new AsyncApiCallback<ApiResponse<KnowledgeBaseListing>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeBaseListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeBaseListing> response = (ApiResponse<KnowledgeBaseListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeBaseListing> response = (ApiResponse<KnowledgeBaseListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update search result.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchKnowledgeGuestSessionDocumentsSearchSearchIdAsync(PatchKnowledgeGuestSessionDocumentsSearchSearchIdRequest request, final AsyncApiCallback<Void> callback) {
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
   * Update search result.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchKnowledgeGuestSessionDocumentsSearchSearchIdAsync(ApiRequest<SearchUpdateRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Update knowledge base
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeBase> patchKnowledgeKnowledgebaseAsync(PatchKnowledgeKnowledgebaseRequest request, final AsyncApiCallback<KnowledgeBase> callback) {
    try {
      final SettableFuture<KnowledgeBase> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeBase>() {}, new AsyncApiCallback<ApiResponse<KnowledgeBase>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update knowledge base
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeBase>> patchKnowledgeKnowledgebaseAsync(ApiRequest<KnowledgeBaseUpdateRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeBase>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeBase>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeBase>() {}, new AsyncApiCallback<ApiResponse<KnowledgeBase>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CategoryResponse> patchKnowledgeKnowledgebaseCategoryAsync(PatchKnowledgeKnowledgebaseCategoryRequest request, final AsyncApiCallback<CategoryResponse> callback) {
    try {
      final SettableFuture<CategoryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CategoryResponse>() {}, new AsyncApiCallback<ApiResponse<CategoryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CategoryResponse>> patchKnowledgeKnowledgebaseCategoryAsync(ApiRequest<CategoryUpdateRequest> request, final AsyncApiCallback<ApiResponse<CategoryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CategoryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CategoryResponse>() {}, new AsyncApiCallback<ApiResponse<CategoryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentResponse> patchKnowledgeKnowledgebaseDocumentAsync(PatchKnowledgeKnowledgebaseDocumentRequest request, final AsyncApiCallback<KnowledgeDocumentResponse> callback) {
    try {
      final SettableFuture<KnowledgeDocumentResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentResponse>> patchKnowledgeKnowledgebaseDocumentAsync(ApiRequest<KnowledgeDocumentReq> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentResponse> response = (ApiResponse<KnowledgeDocumentResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentResponse> response = (ApiResponse<KnowledgeDocumentResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update feedback on a document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentFeedbackResponse> patchKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdAsync(PatchKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdRequest request, final AsyncApiCallback<KnowledgeDocumentFeedbackResponse> callback) {
    try {
      final SettableFuture<KnowledgeDocumentFeedbackResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentFeedbackResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentFeedbackResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentFeedbackResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update feedback on a document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentFeedbackResponse>> patchKnowledgeKnowledgebaseDocumentFeedbackFeedbackIdAsync(ApiRequest<KnowledgeDocumentFeedbackUpdateRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentFeedbackResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentFeedbackResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentFeedbackResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentFeedbackResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentFeedbackResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentFeedbackResponse> response = (ApiResponse<KnowledgeDocumentFeedbackResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentFeedbackResponse> response = (ApiResponse<KnowledgeDocumentFeedbackResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a variation for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DocumentVariationResponse> patchKnowledgeKnowledgebaseDocumentVariationAsync(PatchKnowledgeKnowledgebaseDocumentVariationRequest request, final AsyncApiCallback<DocumentVariationResponse> callback) {
    try {
      final SettableFuture<DocumentVariationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DocumentVariationResponse>() {}, new AsyncApiCallback<ApiResponse<DocumentVariationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentVariationResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a variation for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DocumentVariationResponse>> patchKnowledgeKnowledgebaseDocumentVariationAsync(ApiRequest<DocumentVariationRequest> request, final AsyncApiCallback<ApiResponse<DocumentVariationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<DocumentVariationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DocumentVariationResponse>() {}, new AsyncApiCallback<ApiResponse<DocumentVariationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentVariationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentVariationResponse> response = (ApiResponse<DocumentVariationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentVariationResponse> response = (ApiResponse<DocumentVariationResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update search result.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchKnowledgeKnowledgebaseDocumentsSearchSearchIdAsync(PatchKnowledgeKnowledgebaseDocumentsSearchSearchIdRequest request, final AsyncApiCallback<Void> callback) {
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
   * Update search result.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchKnowledgeKnowledgebaseDocumentsSearchSearchIdAsync(ApiRequest<SearchUpdateRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Start import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeImportJobResponse> patchKnowledgeKnowledgebaseImportJobAsync(PatchKnowledgeKnowledgebaseImportJobRequest request, final AsyncApiCallback<KnowledgeImportJobResponse> callback) {
    try {
      final SettableFuture<KnowledgeImportJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeImportJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeImportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeImportJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeImportJobResponse>> patchKnowledgeKnowledgebaseImportJobAsync(ApiRequest<ImportStatusRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeImportJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeImportJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeImportJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeImportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeImportJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeImportJobResponse> response = (ApiResponse<KnowledgeImportJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeImportJobResponse> response = (ApiResponse<KnowledgeImportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update label
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LabelResponse> patchKnowledgeKnowledgebaseLabelAsync(PatchKnowledgeKnowledgebaseLabelRequest request, final AsyncApiCallback<LabelResponse> callback) {
    try {
      final SettableFuture<LabelResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LabelResponse>() {}, new AsyncApiCallback<ApiResponse<LabelResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LabelResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update label
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LabelResponse>> patchKnowledgeKnowledgebaseLabelAsync(ApiRequest<LabelUpdateRequest> request, final AsyncApiCallback<ApiResponse<LabelResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LabelResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LabelResponse>() {}, new AsyncApiCallback<ApiResponse<LabelResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LabelResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeExtendedCategory> patchKnowledgeKnowledgebaseLanguageCategoryAsync(PatchKnowledgeKnowledgebaseLanguageCategoryRequest request, final AsyncApiCallback<KnowledgeExtendedCategory> callback) {
    try {
      final SettableFuture<KnowledgeExtendedCategory> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeExtendedCategory>() {}, new AsyncApiCallback<ApiResponse<KnowledgeExtendedCategory>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeExtendedCategory> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeExtendedCategory>> patchKnowledgeKnowledgebaseLanguageCategoryAsync(ApiRequest<KnowledgeCategoryRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeExtendedCategory>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeExtendedCategory>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeExtendedCategory>() {}, new AsyncApiCallback<ApiResponse<KnowledgeExtendedCategory>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeExtendedCategory> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeDocument> patchKnowledgeKnowledgebaseLanguageDocumentAsync(PatchKnowledgeKnowledgebaseLanguageDocumentRequest request, final AsyncApiCallback<KnowledgeDocument> callback) {
    try {
      final SettableFuture<KnowledgeDocument> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocument>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocument>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocument> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeDocument>> patchKnowledgeKnowledgebaseLanguageDocumentAsync(ApiRequest<KnowledgeDocumentRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeDocument>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocument>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocument>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocument>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocument> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update documents collection
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<DocumentListing> patchKnowledgeKnowledgebaseLanguageDocumentsAsync(PatchKnowledgeKnowledgebaseLanguageDocumentsRequest request, final AsyncApiCallback<DocumentListing> callback) {
    try {
      final SettableFuture<DocumentListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DocumentListing>() {}, new AsyncApiCallback<ApiResponse<DocumentListing>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update documents collection
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<DocumentListing>> patchKnowledgeKnowledgebaseLanguageDocumentsAsync(ApiRequest<List<KnowledgeDocumentBulkRequest>> request, final AsyncApiCallback<ApiResponse<DocumentListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DocumentListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DocumentListing>() {}, new AsyncApiCallback<ApiResponse<DocumentListing>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentListing> response = (ApiResponse<DocumentListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentListing> response = (ApiResponse<DocumentListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start import operation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeImport> patchKnowledgeKnowledgebaseLanguageDocumentsImportAsync(PatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest request, final AsyncApiCallback<KnowledgeImport> callback) {
    try {
      final SettableFuture<KnowledgeImport> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeImport>() {}, new AsyncApiCallback<ApiResponse<KnowledgeImport>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeImport> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start import operation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeImport>> patchKnowledgeKnowledgebaseLanguageDocumentsImportAsync(ApiRequest<ImportStatusRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeImport>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeImport>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeImport>() {}, new AsyncApiCallback<ApiResponse<KnowledgeImport>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeImport> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Send update to the parse operation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchKnowledgeKnowledgebaseParseJobAsync(PatchKnowledgeKnowledgebaseParseJobRequest request, final AsyncApiCallback<Void> callback) {
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
   * Send update to the parse operation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchKnowledgeKnowledgebaseParseJobAsync(ApiRequest<KnowledgeParseJobRequestPatch> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Update synchronization job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeSyncJobResponse> patchKnowledgeKnowledgebaseSynchronizeJobAsync(PatchKnowledgeKnowledgebaseSynchronizeJobRequest request, final AsyncApiCallback<KnowledgeSyncJobResponse> callback) {
    try {
      final SettableFuture<KnowledgeSyncJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeSyncJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSyncJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update synchronization job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeSyncJobResponse>> patchKnowledgeKnowledgebaseSynchronizeJobAsync(ApiRequest<SyncStatusRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeSyncJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeSyncJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSyncJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Knowledge base unanswered phrase group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UnansweredPhraseGroupUpdateResponse> patchKnowledgeKnowledgebaseUnansweredGroupPhrasegroupAsync(PatchKnowledgeKnowledgebaseUnansweredGroupPhrasegroupRequest request, final AsyncApiCallback<UnansweredPhraseGroupUpdateResponse> callback) {
    try {
      final SettableFuture<UnansweredPhraseGroupUpdateResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UnansweredPhraseGroupUpdateResponse>() {}, new AsyncApiCallback<ApiResponse<UnansweredPhraseGroupUpdateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UnansweredPhraseGroupUpdateResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Knowledge base unanswered phrase group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UnansweredPhraseGroupUpdateResponse>> patchKnowledgeKnowledgebaseUnansweredGroupPhrasegroupAsync(ApiRequest<UnansweredPhraseGroupPatchRequestBody> request, final AsyncApiCallback<ApiResponse<UnansweredPhraseGroupUpdateResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UnansweredPhraseGroupUpdateResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UnansweredPhraseGroupUpdateResponse>() {}, new AsyncApiCallback<ApiResponse<UnansweredPhraseGroupUpdateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UnansweredPhraseGroupUpdateResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UnansweredPhraseGroupUpdateResponse> response = (ApiResponse<UnansweredPhraseGroupUpdateResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UnansweredPhraseGroupUpdateResponse> response = (ApiResponse<UnansweredPhraseGroupUpdateResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UploadUrlResponse> postKnowledgeDocumentuploadsAsync(PostKnowledgeDocumentuploadsRequest request, final AsyncApiCallback<UploadUrlResponse> callback) {
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
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UploadUrlResponse>> postKnowledgeDocumentuploadsAsync(ApiRequest<UploadUrlRequest> request, final AsyncApiCallback<ApiResponse<UploadUrlResponse>> callback) {
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
   * Indicate that the document was copied by the user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postKnowledgeGuestSessionDocumentCopiesAsync(PostKnowledgeGuestSessionDocumentCopiesRequest request, final AsyncApiCallback<Void> callback) {
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
   * Indicate that the document was copied by the user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postKnowledgeGuestSessionDocumentCopiesAsync(ApiRequest<KnowledgeGuestDocumentCopy> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Give feedback on a document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeGuestDocumentFeedback> postKnowledgeGuestSessionDocumentFeedbackAsync(PostKnowledgeGuestSessionDocumentFeedbackRequest request, final AsyncApiCallback<KnowledgeGuestDocumentFeedback> callback) {
    try {
      final SettableFuture<KnowledgeGuestDocumentFeedback> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeGuestDocumentFeedback>() {}, new AsyncApiCallback<ApiResponse<KnowledgeGuestDocumentFeedback>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeGuestDocumentFeedback> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Give feedback on a document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeGuestDocumentFeedback>> postKnowledgeGuestSessionDocumentFeedbackAsync(ApiRequest<KnowledgeGuestDocumentFeedback> request, final AsyncApiCallback<ApiResponse<KnowledgeGuestDocumentFeedback>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeGuestDocumentFeedback>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeGuestDocumentFeedback>() {}, new AsyncApiCallback<ApiResponse<KnowledgeGuestDocumentFeedback>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeGuestDocumentFeedback> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeGuestDocumentFeedback> response = (ApiResponse<KnowledgeGuestDocumentFeedback>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeGuestDocumentFeedback> response = (ApiResponse<KnowledgeGuestDocumentFeedback>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create view event for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postKnowledgeGuestSessionDocumentViewsAsync(PostKnowledgeGuestSessionDocumentViewsRequest request, final AsyncApiCallback<Void> callback) {
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
   * Create view event for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postKnowledgeGuestSessionDocumentViewsAsync(ApiRequest<KnowledgeGuestDocumentView> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Answer documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeGuestAnswerDocumentsResponse> postKnowledgeGuestSessionDocumentsAnswersAsync(PostKnowledgeGuestSessionDocumentsAnswersRequest request, final AsyncApiCallback<KnowledgeGuestAnswerDocumentsResponse> callback) {
    try {
      final SettableFuture<KnowledgeGuestAnswerDocumentsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeGuestAnswerDocumentsResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeGuestAnswerDocumentsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeGuestAnswerDocumentsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Answer documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeGuestAnswerDocumentsResponse>> postKnowledgeGuestSessionDocumentsAnswersAsync(ApiRequest<KnowledgeDocumentsAnswerFilter> request, final AsyncApiCallback<ApiResponse<KnowledgeGuestAnswerDocumentsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeGuestAnswerDocumentsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeGuestAnswerDocumentsResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeGuestAnswerDocumentsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeGuestAnswerDocumentsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeGuestAnswerDocumentsResponse> response = (ApiResponse<KnowledgeGuestAnswerDocumentsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeGuestAnswerDocumentsResponse> response = (ApiResponse<KnowledgeGuestAnswerDocumentsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Indicate that documents were presented to the user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postKnowledgeGuestSessionDocumentsPresentationsAsync(PostKnowledgeGuestSessionDocumentsPresentationsRequest request, final AsyncApiCallback<Void> callback) {
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
   * Indicate that documents were presented to the user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postKnowledgeGuestSessionDocumentsPresentationsAsync(ApiRequest<KnowledgeGuestDocumentPresentation> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Search the documents in a guest session.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentGuestSearch> postKnowledgeGuestSessionDocumentsSearchAsync(PostKnowledgeGuestSessionDocumentsSearchRequest request, final AsyncApiCallback<KnowledgeDocumentGuestSearch> callback) {
    try {
      final SettableFuture<KnowledgeDocumentGuestSearch> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentGuestSearch>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentGuestSearch>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentGuestSearch> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search the documents in a guest session.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentGuestSearch>> postKnowledgeGuestSessionDocumentsSearchAsync(ApiRequest<KnowledgeDocumentGuestSearchRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentGuestSearch>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentGuestSearch>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentGuestSearch>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentGuestSearch>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentGuestSearch> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentGuestSearch> response = (ApiResponse<KnowledgeDocumentGuestSearch>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentGuestSearch> response = (ApiResponse<KnowledgeDocumentGuestSearch>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query the knowledge documents to provide suggestions for auto completion.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeGuestDocumentSuggestion> postKnowledgeGuestSessionDocumentsSearchSuggestionsAsync(PostKnowledgeGuestSessionDocumentsSearchSuggestionsRequest request, final AsyncApiCallback<KnowledgeGuestDocumentSuggestion> callback) {
    try {
      final SettableFuture<KnowledgeGuestDocumentSuggestion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeGuestDocumentSuggestion>() {}, new AsyncApiCallback<ApiResponse<KnowledgeGuestDocumentSuggestion>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeGuestDocumentSuggestion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query the knowledge documents to provide suggestions for auto completion.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeGuestDocumentSuggestion>> postKnowledgeGuestSessionDocumentsSearchSuggestionsAsync(ApiRequest<KnowledgeGuestDocumentSuggestionRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeGuestDocumentSuggestion>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeGuestDocumentSuggestion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeGuestDocumentSuggestion>() {}, new AsyncApiCallback<ApiResponse<KnowledgeGuestDocumentSuggestion>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeGuestDocumentSuggestion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeGuestDocumentSuggestion> response = (ApiResponse<KnowledgeGuestDocumentSuggestion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeGuestDocumentSuggestion> response = (ApiResponse<KnowledgeGuestDocumentSuggestion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create guest session
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeGuestSession> postKnowledgeGuestSessionsAsync(PostKnowledgeGuestSessionsRequest request, final AsyncApiCallback<KnowledgeGuestSession> callback) {
    try {
      final SettableFuture<KnowledgeGuestSession> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeGuestSession>() {}, new AsyncApiCallback<ApiResponse<KnowledgeGuestSession>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeGuestSession> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create guest session
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeGuestSession>> postKnowledgeGuestSessionsAsync(ApiRequest<KnowledgeGuestSession> request, final AsyncApiCallback<ApiResponse<KnowledgeGuestSession>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeGuestSession>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeGuestSession>() {}, new AsyncApiCallback<ApiResponse<KnowledgeGuestSession>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeGuestSession> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeGuestSession> response = (ApiResponse<KnowledgeGuestSession>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeGuestSession> response = (ApiResponse<KnowledgeGuestSession>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CategoryResponse> postKnowledgeKnowledgebaseCategoriesAsync(PostKnowledgeKnowledgebaseCategoriesRequest request, final AsyncApiCallback<CategoryResponse> callback) {
    try {
      final SettableFuture<CategoryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CategoryResponse>() {}, new AsyncApiCallback<ApiResponse<CategoryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CategoryResponse>> postKnowledgeKnowledgebaseCategoriesAsync(ApiRequest<CategoryCreateRequest> request, final AsyncApiCallback<ApiResponse<CategoryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CategoryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CategoryResponse>() {}, new AsyncApiCallback<ApiResponse<CategoryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryResponse> response = (ApiResponse<CategoryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search for chunks in a knowledge base
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentChunkResponse> postKnowledgeKnowledgebaseChunksSearchAsync(PostKnowledgeKnowledgebaseChunksSearchRequest request, final AsyncApiCallback<KnowledgeDocumentChunkResponse> callback) {
    try {
      final SettableFuture<KnowledgeDocumentChunkResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentChunkResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentChunkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentChunkResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search for chunks in a knowledge base
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentChunkResponse>> postKnowledgeKnowledgebaseChunksSearchAsync(ApiRequest<KnowledgeDocumentChunkRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentChunkResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentChunkResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentChunkResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentChunkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentChunkResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentChunkResponse> response = (ApiResponse<KnowledgeDocumentChunkResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentChunkResponse> response = (ApiResponse<KnowledgeDocumentChunkResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Indicate that the document was copied by the user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postKnowledgeKnowledgebaseDocumentCopiesAsync(PostKnowledgeKnowledgebaseDocumentCopiesRequest request, final AsyncApiCallback<Void> callback) {
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
   * Indicate that the document was copied by the user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postKnowledgeKnowledgebaseDocumentCopiesAsync(ApiRequest<KnowledgeDocumentCopy> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Give feedback on a document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentFeedbackResponse> postKnowledgeKnowledgebaseDocumentFeedbackAsync(PostKnowledgeKnowledgebaseDocumentFeedbackRequest request, final AsyncApiCallback<KnowledgeDocumentFeedbackResponse> callback) {
    try {
      final SettableFuture<KnowledgeDocumentFeedbackResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentFeedbackResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentFeedbackResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentFeedbackResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Give feedback on a document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentFeedbackResponse>> postKnowledgeKnowledgebaseDocumentFeedbackAsync(ApiRequest<KnowledgeDocumentFeedback> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentFeedbackResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentFeedbackResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentFeedbackResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentFeedbackResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentFeedbackResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentFeedbackResponse> response = (ApiResponse<KnowledgeDocumentFeedbackResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentFeedbackResponse> response = (ApiResponse<KnowledgeDocumentFeedbackResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a variation for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DocumentVariationResponse> postKnowledgeKnowledgebaseDocumentVariationsAsync(PostKnowledgeKnowledgebaseDocumentVariationsRequest request, final AsyncApiCallback<DocumentVariationResponse> callback) {
    try {
      final SettableFuture<DocumentVariationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DocumentVariationResponse>() {}, new AsyncApiCallback<ApiResponse<DocumentVariationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentVariationResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a variation for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DocumentVariationResponse>> postKnowledgeKnowledgebaseDocumentVariationsAsync(ApiRequest<DocumentVariationRequest> request, final AsyncApiCallback<ApiResponse<DocumentVariationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<DocumentVariationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DocumentVariationResponse>() {}, new AsyncApiCallback<ApiResponse<DocumentVariationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentVariationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentVariationResponse> response = (ApiResponse<DocumentVariationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentVariationResponse> response = (ApiResponse<DocumentVariationResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates or restores a document version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentVersion> postKnowledgeKnowledgebaseDocumentVersionsAsync(PostKnowledgeKnowledgebaseDocumentVersionsRequest request, final AsyncApiCallback<KnowledgeDocumentVersion> callback) {
    try {
      final SettableFuture<KnowledgeDocumentVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentVersion>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentVersion>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates or restores a document version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentVersion>> postKnowledgeKnowledgebaseDocumentVersionsAsync(ApiRequest<KnowledgeDocumentVersion> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentVersion>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentVersion>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentVersion> response = (ApiResponse<KnowledgeDocumentVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentVersion> response = (ApiResponse<KnowledgeDocumentVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create view for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postKnowledgeKnowledgebaseDocumentViewsAsync(PostKnowledgeKnowledgebaseDocumentViewsRequest request, final AsyncApiCallback<Void> callback) {
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
   * Create view for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postKnowledgeKnowledgebaseDocumentViewsAsync(ApiRequest<KnowledgeDocumentView> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Create document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentResponse> postKnowledgeKnowledgebaseDocumentsAsync(PostKnowledgeKnowledgebaseDocumentsRequest request, final AsyncApiCallback<KnowledgeDocumentResponse> callback) {
    try {
      final SettableFuture<KnowledgeDocumentResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentResponse>> postKnowledgeKnowledgebaseDocumentsAsync(ApiRequest<KnowledgeDocumentCreateRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentResponse> response = (ApiResponse<KnowledgeDocumentResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentResponse> response = (ApiResponse<KnowledgeDocumentResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Answer documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeAnswerDocumentsResponse> postKnowledgeKnowledgebaseDocumentsAnswersAsync(PostKnowledgeKnowledgebaseDocumentsAnswersRequest request, final AsyncApiCallback<KnowledgeAnswerDocumentsResponse> callback) {
    try {
      final SettableFuture<KnowledgeAnswerDocumentsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeAnswerDocumentsResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeAnswerDocumentsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeAnswerDocumentsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Answer documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeAnswerDocumentsResponse>> postKnowledgeKnowledgebaseDocumentsAnswersAsync(ApiRequest<KnowledgeDocumentsAnswerFilter> request, final AsyncApiCallback<ApiResponse<KnowledgeAnswerDocumentsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeAnswerDocumentsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeAnswerDocumentsResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeAnswerDocumentsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeAnswerDocumentsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeAnswerDocumentsResponse> response = (ApiResponse<KnowledgeAnswerDocumentsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeAnswerDocumentsResponse> response = (ApiResponse<KnowledgeAnswerDocumentsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk remove documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkResponse> postKnowledgeKnowledgebaseDocumentsBulkRemoveAsync(PostKnowledgeKnowledgebaseDocumentsBulkRemoveRequest request, final AsyncApiCallback<BulkResponse> callback) {
    try {
      final SettableFuture<BulkResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkResponse>() {}, new AsyncApiCallback<ApiResponse<BulkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk remove documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkResponse>> postKnowledgeKnowledgebaseDocumentsBulkRemoveAsync(ApiRequest<KnowledgeDocumentBulkRemoveRequest> request, final AsyncApiCallback<ApiResponse<BulkResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkResponse>() {}, new AsyncApiCallback<ApiResponse<BulkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk update documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkResponse> postKnowledgeKnowledgebaseDocumentsBulkUpdateAsync(PostKnowledgeKnowledgebaseDocumentsBulkUpdateRequest request, final AsyncApiCallback<BulkResponse> callback) {
    try {
      final SettableFuture<BulkResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkResponse>() {}, new AsyncApiCallback<ApiResponse<BulkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk update documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkResponse>> postKnowledgeKnowledgebaseDocumentsBulkUpdateAsync(ApiRequest<KnowledgeDocumentBulkUpdateRequest> request, final AsyncApiCallback<ApiResponse<BulkResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkResponse>() {}, new AsyncApiCallback<ApiResponse<BulkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Indicate that documents were presented to the user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postKnowledgeKnowledgebaseDocumentsPresentationsAsync(PostKnowledgeKnowledgebaseDocumentsPresentationsRequest request, final AsyncApiCallback<Void> callback) {
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
   * Indicate that documents were presented to the user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postKnowledgeKnowledgebaseDocumentsPresentationsAsync(ApiRequest<KnowledgeDocumentPresentation> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Query for knowledge documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentQueryResponse> postKnowledgeKnowledgebaseDocumentsQueryAsync(PostKnowledgeKnowledgebaseDocumentsQueryRequest request, final AsyncApiCallback<KnowledgeDocumentQueryResponse> callback) {
    try {
      final SettableFuture<KnowledgeDocumentQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentQueryResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for knowledge documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentQueryResponse>> postKnowledgeKnowledgebaseDocumentsQueryAsync(ApiRequest<KnowledgeDocumentQuery> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentQueryResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentQueryResponse> response = (ApiResponse<KnowledgeDocumentQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentQueryResponse> response = (ApiResponse<KnowledgeDocumentQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search the documents in a knowledge base.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentSearch> postKnowledgeKnowledgebaseDocumentsSearchAsync(PostKnowledgeKnowledgebaseDocumentsSearchRequest request, final AsyncApiCallback<KnowledgeDocumentSearch> callback) {
    try {
      final SettableFuture<KnowledgeDocumentSearch> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentSearch>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentSearch>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentSearch> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search the documents in a knowledge base.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentSearch>> postKnowledgeKnowledgebaseDocumentsSearchAsync(ApiRequest<KnowledgeDocumentSearchRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentSearch>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentSearch>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentSearch>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentSearch>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentSearch> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentSearch> response = (ApiResponse<KnowledgeDocumentSearch>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentSearch> response = (ApiResponse<KnowledgeDocumentSearch>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query the knowledge documents to provide suggestions for auto completion.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeDocumentSuggestion> postKnowledgeKnowledgebaseDocumentsSearchSuggestionsAsync(PostKnowledgeKnowledgebaseDocumentsSearchSuggestionsRequest request, final AsyncApiCallback<KnowledgeDocumentSuggestion> callback) {
    try {
      final SettableFuture<KnowledgeDocumentSuggestion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentSuggestion>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentSuggestion>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentSuggestion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query the knowledge documents to provide suggestions for auto completion.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeDocumentSuggestion>> postKnowledgeKnowledgebaseDocumentsSearchSuggestionsAsync(ApiRequest<KnowledgeDocumentSuggestionRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentSuggestion>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentSuggestion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentSuggestion>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentSuggestion>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentSuggestion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentSuggestion> response = (ApiResponse<KnowledgeDocumentSuggestion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentSuggestion> response = (ApiResponse<KnowledgeDocumentSuggestion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk add document versions.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkResponse> postKnowledgeKnowledgebaseDocumentsVersionsBulkAddAsync(PostKnowledgeKnowledgebaseDocumentsVersionsBulkAddRequest request, final AsyncApiCallback<BulkResponse> callback) {
    try {
      final SettableFuture<BulkResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkResponse>() {}, new AsyncApiCallback<ApiResponse<BulkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk add document versions.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkResponse>> postKnowledgeKnowledgebaseDocumentsVersionsBulkAddAsync(ApiRequest<KnowledgeDocumentBulkVersionAddRequest> request, final AsyncApiCallback<ApiResponse<BulkResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkResponse>() {}, new AsyncApiCallback<ApiResponse<BulkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create export job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeExportJobResponse> postKnowledgeKnowledgebaseExportJobsAsync(PostKnowledgeKnowledgebaseExportJobsRequest request, final AsyncApiCallback<KnowledgeExportJobResponse> callback) {
    try {
      final SettableFuture<KnowledgeExportJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeExportJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeExportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeExportJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create export job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeExportJobResponse>> postKnowledgeKnowledgebaseExportJobsAsync(ApiRequest<KnowledgeExportJobRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeExportJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeExportJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeExportJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeExportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeExportJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeExportJobResponse> response = (ApiResponse<KnowledgeExportJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeExportJobResponse> response = (ApiResponse<KnowledgeExportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeImportJobResponse> postKnowledgeKnowledgebaseImportJobsAsync(PostKnowledgeKnowledgebaseImportJobsRequest request, final AsyncApiCallback<KnowledgeImportJobResponse> callback) {
    try {
      final SettableFuture<KnowledgeImportJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeImportJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeImportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeImportJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeImportJobResponse>> postKnowledgeKnowledgebaseImportJobsAsync(ApiRequest<KnowledgeImportJobRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeImportJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeImportJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeImportJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeImportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeImportJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeImportJobResponse> response = (ApiResponse<KnowledgeImportJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeImportJobResponse> response = (ApiResponse<KnowledgeImportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new label
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LabelResponse> postKnowledgeKnowledgebaseLabelsAsync(PostKnowledgeKnowledgebaseLabelsRequest request, final AsyncApiCallback<LabelResponse> callback) {
    try {
      final SettableFuture<LabelResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LabelResponse>() {}, new AsyncApiCallback<ApiResponse<LabelResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LabelResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new label
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LabelResponse>> postKnowledgeKnowledgebaseLabelsAsync(ApiRequest<LabelCreateRequest> request, final AsyncApiCallback<ApiResponse<LabelResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LabelResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LabelResponse>() {}, new AsyncApiCallback<ApiResponse<LabelResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LabelResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LabelResponse> response = (ApiResponse<LabelResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeExtendedCategory> postKnowledgeKnowledgebaseLanguageCategoriesAsync(PostKnowledgeKnowledgebaseLanguageCategoriesRequest request, final AsyncApiCallback<KnowledgeExtendedCategory> callback) {
    try {
      final SettableFuture<KnowledgeExtendedCategory> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeExtendedCategory>() {}, new AsyncApiCallback<ApiResponse<KnowledgeExtendedCategory>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeExtendedCategory> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeExtendedCategory>> postKnowledgeKnowledgebaseLanguageCategoriesAsync(ApiRequest<KnowledgeCategoryRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeExtendedCategory>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeExtendedCategory>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeExtendedCategory>() {}, new AsyncApiCallback<ApiResponse<KnowledgeExtendedCategory>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeExtendedCategory> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Upload Article Content
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeDocumentContentUpload> postKnowledgeKnowledgebaseLanguageDocumentUploadsAsync(PostKnowledgeKnowledgebaseLanguageDocumentUploadsRequest request, final AsyncApiCallback<KnowledgeDocumentContentUpload> callback) {
    try {
      final SettableFuture<KnowledgeDocumentContentUpload> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocumentContentUpload>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentContentUpload>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentContentUpload> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Upload Article Content
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeDocumentContentUpload>> postKnowledgeKnowledgebaseLanguageDocumentUploadsAsync(ApiRequest<KnowledgeDocumentContentUpload> request, final AsyncApiCallback<ApiResponse<KnowledgeDocumentContentUpload>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocumentContentUpload>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocumentContentUpload>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocumentContentUpload>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocumentContentUpload> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentContentUpload> response = (ApiResponse<KnowledgeDocumentContentUpload>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocumentContentUpload> response = (ApiResponse<KnowledgeDocumentContentUpload>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeDocument> postKnowledgeKnowledgebaseLanguageDocumentsAsync(PostKnowledgeKnowledgebaseLanguageDocumentsRequest request, final AsyncApiCallback<KnowledgeDocument> callback) {
    try {
      final SettableFuture<KnowledgeDocument> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeDocument>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocument>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocument> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeDocument>> postKnowledgeKnowledgebaseLanguageDocumentsAsync(ApiRequest<KnowledgeDocumentRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeDocument>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeDocument>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeDocument>() {}, new AsyncApiCallback<ApiResponse<KnowledgeDocument>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeDocument> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create import operation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeImport> postKnowledgeKnowledgebaseLanguageDocumentsImportsAsync(PostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest request, final AsyncApiCallback<KnowledgeImport> callback) {
    try {
      final SettableFuture<KnowledgeImport> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeImport>() {}, new AsyncApiCallback<ApiResponse<KnowledgeImport>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeImport> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create import operation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeImport>> postKnowledgeKnowledgebaseLanguageDocumentsImportsAsync(ApiRequest<KnowledgeImport> request, final AsyncApiCallback<ApiResponse<KnowledgeImport>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeImport>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeImport>() {}, new AsyncApiCallback<ApiResponse<KnowledgeImport>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeImport> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Promote trained documents from draft state to active.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeTraining> postKnowledgeKnowledgebaseLanguageTrainingPromoteAsync(PostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest request, final AsyncApiCallback<KnowledgeTraining> callback) {
    try {
      final SettableFuture<KnowledgeTraining> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeTraining>() {}, new AsyncApiCallback<ApiResponse<KnowledgeTraining>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeTraining> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Promote trained documents from draft state to active.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeTraining>> postKnowledgeKnowledgebaseLanguageTrainingPromoteAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeTraining>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeTraining>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeTraining>() {}, new AsyncApiCallback<ApiResponse<KnowledgeTraining>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeTraining> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Trigger training
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeTraining> postKnowledgeKnowledgebaseLanguageTrainingsAsync(PostKnowledgeKnowledgebaseLanguageTrainingsRequest request, final AsyncApiCallback<KnowledgeTraining> callback) {
    try {
      final SettableFuture<KnowledgeTraining> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeTraining>() {}, new AsyncApiCallback<ApiResponse<KnowledgeTraining>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeTraining> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Trigger training
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeTraining>> postKnowledgeKnowledgebaseLanguageTrainingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KnowledgeTraining>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeTraining>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeTraining>() {}, new AsyncApiCallback<ApiResponse<KnowledgeTraining>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeTraining> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Import the parsed articles
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postKnowledgeKnowledgebaseParseJobImportAsync(PostKnowledgeKnowledgebaseParseJobImportRequest request, final AsyncApiCallback<Void> callback) {
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
   * Import the parsed articles
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postKnowledgeKnowledgebaseParseJobImportAsync(ApiRequest<KnowledgeParseJobRequestImport> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Create parse job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeParseJobResponse> postKnowledgeKnowledgebaseParseJobsAsync(PostKnowledgeKnowledgebaseParseJobsRequest request, final AsyncApiCallback<KnowledgeParseJobResponse> callback) {
    try {
      final SettableFuture<KnowledgeParseJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeParseJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeParseJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeParseJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create parse job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeParseJobResponse>> postKnowledgeKnowledgebaseParseJobsAsync(ApiRequest<KnowledgeParseJobRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeParseJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeParseJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeParseJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeParseJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeParseJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeParseJobResponse> response = (ApiResponse<KnowledgeParseJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeParseJobResponse> response = (ApiResponse<KnowledgeParseJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search Documents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeSearchResponse> postKnowledgeKnowledgebaseSearchAsync(PostKnowledgeKnowledgebaseSearchRequest request, final AsyncApiCallback<KnowledgeSearchResponse> callback) {
    try {
      final SettableFuture<KnowledgeSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSearchResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search Documents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeSearchResponse>> postKnowledgeKnowledgebaseSearchAsync(ApiRequest<KnowledgeSearchRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSearchResponse> response = (ApiResponse<KnowledgeSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSearchResponse> response = (ApiResponse<KnowledgeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Salesforce Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeSyncJobResponse> postKnowledgeKnowledgebaseSourcesSalesforceAsync(PostKnowledgeKnowledgebaseSourcesSalesforceRequest request, final AsyncApiCallback<KnowledgeSyncJobResponse> callback) {
    try {
      final SettableFuture<KnowledgeSyncJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeSyncJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSyncJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Salesforce Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeSyncJobResponse>> postKnowledgeKnowledgebaseSourcesSalesforceAsync(ApiRequest<SalesforceSourceRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeSyncJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeSyncJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSyncJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start sync on Salesforce Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SourceSyncResponse> postKnowledgeKnowledgebaseSourcesSalesforceSourceIdSyncAsync(PostKnowledgeKnowledgebaseSourcesSalesforceSourceIdSyncRequest request, final AsyncApiCallback<SourceSyncResponse> callback) {
    try {
      final SettableFuture<SourceSyncResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SourceSyncResponse>() {}, new AsyncApiCallback<ApiResponse<SourceSyncResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SourceSyncResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start sync on Salesforce Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SourceSyncResponse>> postKnowledgeKnowledgebaseSourcesSalesforceSourceIdSyncAsync(ApiRequest<Object> request, final AsyncApiCallback<ApiResponse<SourceSyncResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SourceSyncResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SourceSyncResponse>() {}, new AsyncApiCallback<ApiResponse<SourceSyncResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SourceSyncResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SourceSyncResponse> response = (ApiResponse<SourceSyncResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SourceSyncResponse> response = (ApiResponse<SourceSyncResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create ServiceNow Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeSyncJobResponse> postKnowledgeKnowledgebaseSourcesServicenowAsync(PostKnowledgeKnowledgebaseSourcesServicenowRequest request, final AsyncApiCallback<KnowledgeSyncJobResponse> callback) {
    try {
      final SettableFuture<KnowledgeSyncJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeSyncJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSyncJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create ServiceNow Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeSyncJobResponse>> postKnowledgeKnowledgebaseSourcesServicenowAsync(ApiRequest<ServiceNowSourceRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeSyncJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeSyncJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSyncJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start synchronization on ServiceNow Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SourceSyncResponse> postKnowledgeKnowledgebaseSourcesServicenowSourceIdSyncAsync(PostKnowledgeKnowledgebaseSourcesServicenowSourceIdSyncRequest request, final AsyncApiCallback<SourceSyncResponse> callback) {
    try {
      final SettableFuture<SourceSyncResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SourceSyncResponse>() {}, new AsyncApiCallback<ApiResponse<SourceSyncResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SourceSyncResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start synchronization on ServiceNow Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SourceSyncResponse>> postKnowledgeKnowledgebaseSourcesServicenowSourceIdSyncAsync(ApiRequest<Object> request, final AsyncApiCallback<ApiResponse<SourceSyncResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SourceSyncResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SourceSyncResponse>() {}, new AsyncApiCallback<ApiResponse<SourceSyncResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SourceSyncResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SourceSyncResponse> response = (ApiResponse<SourceSyncResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SourceSyncResponse> response = (ApiResponse<SourceSyncResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create synchronization job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeSyncJobResponse> postKnowledgeKnowledgebaseSynchronizeJobsAsync(PostKnowledgeKnowledgebaseSynchronizeJobsRequest request, final AsyncApiCallback<KnowledgeSyncJobResponse> callback) {
    try {
      final SettableFuture<KnowledgeSyncJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeSyncJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSyncJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create synchronization job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeSyncJobResponse>> postKnowledgeKnowledgebaseSynchronizeJobsAsync(ApiRequest<KnowledgeSyncJobRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeSyncJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeSyncJobResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSyncJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSyncJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSyncJobResponse> response = (ApiResponse<KnowledgeSyncJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create content upload from URL job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CreateUploadSourceUrlJobResponse> postKnowledgeKnowledgebaseUploadsUrlsJobsAsync(PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest request, final AsyncApiCallback<CreateUploadSourceUrlJobResponse> callback) {
    try {
      final SettableFuture<CreateUploadSourceUrlJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CreateUploadSourceUrlJobResponse>() {}, new AsyncApiCallback<ApiResponse<CreateUploadSourceUrlJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CreateUploadSourceUrlJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create content upload from URL job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CreateUploadSourceUrlJobResponse>> postKnowledgeKnowledgebaseUploadsUrlsJobsAsync(ApiRequest<CreateUploadSourceUrlJobRequest> request, final AsyncApiCallback<ApiResponse<CreateUploadSourceUrlJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CreateUploadSourceUrlJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CreateUploadSourceUrlJobResponse>() {}, new AsyncApiCallback<ApiResponse<CreateUploadSourceUrlJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CreateUploadSourceUrlJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CreateUploadSourceUrlJobResponse> response = (ApiResponse<CreateUploadSourceUrlJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CreateUploadSourceUrlJobResponse> response = (ApiResponse<CreateUploadSourceUrlJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new knowledge base
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KnowledgeBase> postKnowledgeKnowledgebasesAsync(PostKnowledgeKnowledgebasesRequest request, final AsyncApiCallback<KnowledgeBase> callback) {
    try {
      final SettableFuture<KnowledgeBase> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeBase>() {}, new AsyncApiCallback<ApiResponse<KnowledgeBase>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new knowledge base
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KnowledgeBase>> postKnowledgeKnowledgebasesAsync(ApiRequest<KnowledgeBaseCreateRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeBase>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeBase>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeBase>() {}, new AsyncApiCallback<ApiResponse<KnowledgeBase>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Salesforce Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SalesforceSourceResponse> putKnowledgeKnowledgebaseSourcesSalesforceSourceIdAsync(PutKnowledgeKnowledgebaseSourcesSalesforceSourceIdRequest request, final AsyncApiCallback<SalesforceSourceResponse> callback) {
    try {
      final SettableFuture<SalesforceSourceResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SalesforceSourceResponse>() {}, new AsyncApiCallback<ApiResponse<SalesforceSourceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SalesforceSourceResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Salesforce Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SalesforceSourceResponse>> putKnowledgeKnowledgebaseSourcesSalesforceSourceIdAsync(ApiRequest<SalesforceSourceRequest> request, final AsyncApiCallback<ApiResponse<SalesforceSourceResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SalesforceSourceResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SalesforceSourceResponse>() {}, new AsyncApiCallback<ApiResponse<SalesforceSourceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SalesforceSourceResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SalesforceSourceResponse> response = (ApiResponse<SalesforceSourceResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SalesforceSourceResponse> response = (ApiResponse<SalesforceSourceResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update ServiceNow Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ServiceNowSourceResponse> putKnowledgeKnowledgebaseSourcesServicenowSourceIdAsync(PutKnowledgeKnowledgebaseSourcesServicenowSourceIdRequest request, final AsyncApiCallback<ServiceNowSourceResponse> callback) {
    try {
      final SettableFuture<ServiceNowSourceResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ServiceNowSourceResponse>() {}, new AsyncApiCallback<ApiResponse<ServiceNowSourceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceNowSourceResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update ServiceNow Knowledge integration source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ServiceNowSourceResponse>> putKnowledgeKnowledgebaseSourcesServicenowSourceIdAsync(ApiRequest<ServiceNowSourceRequest> request, final AsyncApiCallback<ApiResponse<ServiceNowSourceResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ServiceNowSourceResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ServiceNowSourceResponse>() {}, new AsyncApiCallback<ApiResponse<ServiceNowSourceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceNowSourceResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceNowSourceResponse> response = (ApiResponse<ServiceNowSourceResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceNowSourceResponse> response = (ApiResponse<ServiceNowSourceResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
