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

import com.mypurecloud.sdk.v2.model.KnowledgeBase;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.KnowledgeCategory;
import com.mypurecloud.sdk.v2.model.KnowledgeDocument;
import com.mypurecloud.sdk.v2.model.CategoryListing;
import com.mypurecloud.sdk.v2.model.KnowledgeExtendedCategory;
import com.mypurecloud.sdk.v2.model.DocumentListing;
import com.mypurecloud.sdk.v2.model.KnowledgeImport;
import com.mypurecloud.sdk.v2.model.KnowledgeTraining;
import com.mypurecloud.sdk.v2.model.TrainingListing;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeCategoryRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkRequest;
import com.mypurecloud.sdk.v2.model.ImportStatusRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseLanguageCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseLanguageDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageDocumentsImportRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageTrainingRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageTrainingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebasesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLanguageCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLanguageDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLanguageDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeDocumentuploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageTrainingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebasesRequest;

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
   * Get documents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
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
  public Future<ApiResponse<KnowledgeBase>> patchKnowledgeKnowledgebaseAsync(ApiRequest<KnowledgeBase> request, final AsyncApiCallback<ApiResponse<KnowledgeBase>> callback) {
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
   * Create new category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
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
   * Create document
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
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
   * Search Documents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
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
  public Future<ApiResponse<KnowledgeBase>> postKnowledgeKnowledgebasesAsync(ApiRequest<KnowledgeBase> request, final AsyncApiCallback<ApiResponse<KnowledgeBase>> callback) {
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
