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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Document;
import com.mypurecloud.sdk.v2.model.DocumentAuditEntityListing;
import com.mypurecloud.sdk.v2.model.DownloadResponse;
import com.mypurecloud.sdk.v2.model.DocumentEntityListing;
import com.mypurecloud.sdk.v2.model.QueryResults;
import com.mypurecloud.sdk.v2.model.SecurityProfile;
import com.mypurecloud.sdk.v2.model.SecurityProfileEntityListing;
import com.mypurecloud.sdk.v2.model.Share;
import com.mypurecloud.sdk.v2.model.SharedResponse;
import com.mypurecloud.sdk.v2.model.ShareEntityListing;
import com.mypurecloud.sdk.v2.model.CommandStatusEntityListing;
import com.mypurecloud.sdk.v2.model.CommandStatus;
import com.mypurecloud.sdk.v2.model.Usage;
import com.mypurecloud.sdk.v2.model.Workspace;
import com.mypurecloud.sdk.v2.model.WorkspaceMember;
import com.mypurecloud.sdk.v2.model.WorkspaceMemberEntityListing;
import com.mypurecloud.sdk.v2.model.TagValue;
import com.mypurecloud.sdk.v2.model.TagValueEntityListing;
import com.mypurecloud.sdk.v2.model.WorkspaceEntityListing;
import com.mypurecloud.sdk.v2.model.ContentQueryRequest;
import com.mypurecloud.sdk.v2.model.DocumentUpdate;
import com.mypurecloud.sdk.v2.model.ReplaceRequest;
import com.mypurecloud.sdk.v2.model.ReplaceResponse;
import com.mypurecloud.sdk.v2.model.DocumentUpload;
import com.mypurecloud.sdk.v2.model.QueryRequest;
import com.mypurecloud.sdk.v2.model.CreateShareResponse;
import com.mypurecloud.sdk.v2.model.CreateShareRequest;
import com.mypurecloud.sdk.v2.model.TagQueryRequest;
import com.mypurecloud.sdk.v2.model.WorkspaceCreate;


import com.mypurecloud.sdk.v2.api.request.DeleteContentmanagementDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteContentmanagementShareRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteContentmanagementStatusStatusIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteContentmanagementWorkspaceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteContentmanagementWorkspaceMemberRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteContentmanagementWorkspaceTagvalueRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementDocumentAuditsRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementDocumentContentRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementQueryRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementSecurityprofileRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementSecurityprofilesRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementShareRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementSharedSharedIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementSharesRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementStatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementStatusStatusIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementUsageRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementWorkspaceRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementWorkspaceDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementWorkspaceMemberRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementWorkspaceMembersRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementWorkspaceTagvalueRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementWorkspaceTagvaluesRequest;
import com.mypurecloud.sdk.v2.api.request.GetContentmanagementWorkspacesRequest;
import com.mypurecloud.sdk.v2.api.request.PostContentmanagementAuditqueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostContentmanagementDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.PostContentmanagementDocumentContentRequest;
import com.mypurecloud.sdk.v2.api.request.PostContentmanagementDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostContentmanagementQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostContentmanagementSharesRequest;
import com.mypurecloud.sdk.v2.api.request.PostContentmanagementWorkspaceTagvaluesRequest;
import com.mypurecloud.sdk.v2.api.request.PostContentmanagementWorkspaceTagvaluesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostContentmanagementWorkspacesRequest;
import com.mypurecloud.sdk.v2.api.request.PutContentmanagementWorkspaceRequest;
import com.mypurecloud.sdk.v2.api.request.PutContentmanagementWorkspaceMemberRequest;
import com.mypurecloud.sdk.v2.api.request.PutContentmanagementWorkspaceTagvalueRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class ContentManagementApiAsync {
  private final ApiClient pcapiClient;

  public ContentManagementApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public ContentManagementApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteContentmanagementDocumentAsync(DeleteContentmanagementDocumentRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteContentmanagementDocumentAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteContentmanagementShareAsync(DeleteContentmanagementShareRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteContentmanagementShareAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Cancel the command for this status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteContentmanagementStatusStatusIdAsync(DeleteContentmanagementStatusStatusIdRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Cancel the command for this status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteContentmanagementStatusStatusIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a workspace
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteContentmanagementWorkspaceAsync(DeleteContentmanagementWorkspaceRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a workspace
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteContentmanagementWorkspaceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a member from a workspace
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteContentmanagementWorkspaceMemberAsync(DeleteContentmanagementWorkspaceMemberRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a member from a workspace
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteContentmanagementWorkspaceMemberAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteContentmanagementWorkspaceTagvalueAsync(DeleteContentmanagementWorkspaceTagvalueRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteContentmanagementWorkspaceTagvalueAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Get a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Document> getContentmanagementDocumentAsync(GetContentmanagementDocumentRequest request, AsyncApiCallback<Document> callback) {
    try {
      SettableFuture<Document> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Document>() {}, new AsyncApiCallback<ApiResponse<Document>>() {
        @Override
        public void onCompleted(ApiResponse<Document> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Document>> getContentmanagementDocumentAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Document>> callback) {
    try {
      SettableFuture<ApiResponse<Document>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Document>() {}, new AsyncApiCallback<ApiResponse<Document>>() {
        @Override
        public void onCompleted(ApiResponse<Document> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Document> response = (ApiResponse<Document>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Document> response = (ApiResponse<Document>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of audits for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DocumentAuditEntityListing> getContentmanagementDocumentAuditsAsync(GetContentmanagementDocumentAuditsRequest request, AsyncApiCallback<DocumentAuditEntityListing> callback) {
    try {
      SettableFuture<DocumentAuditEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DocumentAuditEntityListing>() {}, new AsyncApiCallback<ApiResponse<DocumentAuditEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentAuditEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of audits for a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DocumentAuditEntityListing>> getContentmanagementDocumentAuditsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DocumentAuditEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<DocumentAuditEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DocumentAuditEntityListing>() {}, new AsyncApiCallback<ApiResponse<DocumentAuditEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentAuditEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentAuditEntityListing> response = (ApiResponse<DocumentAuditEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentAuditEntityListing> response = (ApiResponse<DocumentAuditEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Download a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DownloadResponse> getContentmanagementDocumentContentAsync(GetContentmanagementDocumentContentRequest request, AsyncApiCallback<DownloadResponse> callback) {
    try {
      SettableFuture<DownloadResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DownloadResponse>() {}, new AsyncApiCallback<ApiResponse<DownloadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DownloadResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Download a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DownloadResponse>> getContentmanagementDocumentContentAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DownloadResponse>> callback) {
    try {
      SettableFuture<ApiResponse<DownloadResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DownloadResponse>() {}, new AsyncApiCallback<ApiResponse<DownloadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DownloadResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DownloadResponse> response = (ApiResponse<DownloadResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DownloadResponse> response = (ApiResponse<DownloadResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DocumentEntityListing> getContentmanagementDocumentsAsync(GetContentmanagementDocumentsRequest request, AsyncApiCallback<DocumentEntityListing> callback) {
    try {
      SettableFuture<DocumentEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DocumentEntityListing>() {}, new AsyncApiCallback<ApiResponse<DocumentEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DocumentEntityListing>> getContentmanagementDocumentsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DocumentEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<DocumentEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DocumentEntityListing>() {}, new AsyncApiCallback<ApiResponse<DocumentEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentEntityListing> response = (ApiResponse<DocumentEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentEntityListing> response = (ApiResponse<DocumentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query content
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QueryResults> getContentmanagementQueryAsync(GetContentmanagementQueryRequest request, AsyncApiCallback<QueryResults> callback) {
    try {
      SettableFuture<QueryResults> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QueryResults>() {}, new AsyncApiCallback<ApiResponse<QueryResults>>() {
        @Override
        public void onCompleted(ApiResponse<QueryResults> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query content
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QueryResults>> getContentmanagementQueryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<QueryResults>> callback) {
    try {
      SettableFuture<ApiResponse<QueryResults>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QueryResults>() {}, new AsyncApiCallback<ApiResponse<QueryResults>>() {
        @Override
        public void onCompleted(ApiResponse<QueryResults> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QueryResults> response = (ApiResponse<QueryResults>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QueryResults> response = (ApiResponse<QueryResults>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Security Profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SecurityProfile> getContentmanagementSecurityprofileAsync(GetContentmanagementSecurityprofileRequest request, AsyncApiCallback<SecurityProfile> callback) {
    try {
      SettableFuture<SecurityProfile> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SecurityProfile>() {}, new AsyncApiCallback<ApiResponse<SecurityProfile>>() {
        @Override
        public void onCompleted(ApiResponse<SecurityProfile> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Security Profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SecurityProfile>> getContentmanagementSecurityprofileAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SecurityProfile>> callback) {
    try {
      SettableFuture<ApiResponse<SecurityProfile>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SecurityProfile>() {}, new AsyncApiCallback<ApiResponse<SecurityProfile>>() {
        @Override
        public void onCompleted(ApiResponse<SecurityProfile> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SecurityProfile> response = (ApiResponse<SecurityProfile>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SecurityProfile> response = (ApiResponse<SecurityProfile>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a List of Security Profiles
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SecurityProfileEntityListing> getContentmanagementSecurityprofilesAsync(GetContentmanagementSecurityprofilesRequest request, AsyncApiCallback<SecurityProfileEntityListing> callback) {
    try {
      SettableFuture<SecurityProfileEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SecurityProfileEntityListing>() {}, new AsyncApiCallback<ApiResponse<SecurityProfileEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SecurityProfileEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a List of Security Profiles
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SecurityProfileEntityListing>> getContentmanagementSecurityprofilesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SecurityProfileEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<SecurityProfileEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SecurityProfileEntityListing>() {}, new AsyncApiCallback<ApiResponse<SecurityProfileEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SecurityProfileEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SecurityProfileEntityListing> response = (ApiResponse<SecurityProfileEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SecurityProfileEntityListing> response = (ApiResponse<SecurityProfileEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve details about an existing share.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Share> getContentmanagementShareAsync(GetContentmanagementShareRequest request, AsyncApiCallback<Share> callback) {
    try {
      SettableFuture<Share> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Share>() {}, new AsyncApiCallback<ApiResponse<Share>>() {
        @Override
        public void onCompleted(ApiResponse<Share> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve details about an existing share.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Share>> getContentmanagementShareAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Share>> callback) {
    try {
      SettableFuture<ApiResponse<Share>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Share>() {}, new AsyncApiCallback<ApiResponse<Share>>() {
        @Override
        public void onCompleted(ApiResponse<Share> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Share> response = (ApiResponse<Share>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Share> response = (ApiResponse<Share>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SharedResponse> getContentmanagementSharedSharedIdAsync(GetContentmanagementSharedSharedIdRequest request, AsyncApiCallback<SharedResponse> callback) {
    try {
      SettableFuture<SharedResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SharedResponse>() {}, new AsyncApiCallback<ApiResponse<SharedResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SharedResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SharedResponse>> getContentmanagementSharedSharedIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SharedResponse>> callback) {
    try {
      SettableFuture<ApiResponse<SharedResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SharedResponse>() {}, new AsyncApiCallback<ApiResponse<SharedResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SharedResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SharedResponse> response = (ApiResponse<SharedResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SharedResponse> response = (ApiResponse<SharedResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ShareEntityListing> getContentmanagementSharesAsync(GetContentmanagementSharesRequest request, AsyncApiCallback<ShareEntityListing> callback) {
    try {
      SettableFuture<ShareEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ShareEntityListing>() {}, new AsyncApiCallback<ApiResponse<ShareEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ShareEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ShareEntityListing>> getContentmanagementSharesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ShareEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<ShareEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ShareEntityListing>() {}, new AsyncApiCallback<ApiResponse<ShareEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ShareEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ShareEntityListing> response = (ApiResponse<ShareEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ShareEntityListing> response = (ApiResponse<ShareEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of statuses for pending operations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CommandStatusEntityListing> getContentmanagementStatusAsync(GetContentmanagementStatusRequest request, AsyncApiCallback<CommandStatusEntityListing> callback) {
    try {
      SettableFuture<CommandStatusEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CommandStatusEntityListing>() {}, new AsyncApiCallback<ApiResponse<CommandStatusEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CommandStatusEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of statuses for pending operations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CommandStatusEntityListing>> getContentmanagementStatusAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CommandStatusEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<CommandStatusEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CommandStatusEntityListing>() {}, new AsyncApiCallback<ApiResponse<CommandStatusEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CommandStatusEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CommandStatusEntityListing> response = (ApiResponse<CommandStatusEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CommandStatusEntityListing> response = (ApiResponse<CommandStatusEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a status.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CommandStatus> getContentmanagementStatusStatusIdAsync(GetContentmanagementStatusStatusIdRequest request, AsyncApiCallback<CommandStatus> callback) {
    try {
      SettableFuture<CommandStatus> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CommandStatus>() {}, new AsyncApiCallback<ApiResponse<CommandStatus>>() {
        @Override
        public void onCompleted(ApiResponse<CommandStatus> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a status.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CommandStatus>> getContentmanagementStatusStatusIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CommandStatus>> callback) {
    try {
      SettableFuture<ApiResponse<CommandStatus>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CommandStatus>() {}, new AsyncApiCallback<ApiResponse<CommandStatus>>() {
        @Override
        public void onCompleted(ApiResponse<CommandStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CommandStatus> response = (ApiResponse<CommandStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CommandStatus> response = (ApiResponse<CommandStatus>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get usage details.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Usage> getContentmanagementUsageAsync(GetContentmanagementUsageRequest request, AsyncApiCallback<Usage> callback) {
    try {
      SettableFuture<Usage> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Usage>() {}, new AsyncApiCallback<ApiResponse<Usage>>() {
        @Override
        public void onCompleted(ApiResponse<Usage> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get usage details.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Usage>> getContentmanagementUsageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Usage>> callback) {
    try {
      SettableFuture<ApiResponse<Usage>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Usage>() {}, new AsyncApiCallback<ApiResponse<Usage>>() {
        @Override
        public void onCompleted(ApiResponse<Usage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Usage> response = (ApiResponse<Usage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Usage> response = (ApiResponse<Usage>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a workspace.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Workspace> getContentmanagementWorkspaceAsync(GetContentmanagementWorkspaceRequest request, AsyncApiCallback<Workspace> callback) {
    try {
      SettableFuture<Workspace> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Workspace>() {}, new AsyncApiCallback<ApiResponse<Workspace>>() {
        @Override
        public void onCompleted(ApiResponse<Workspace> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a workspace.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Workspace>> getContentmanagementWorkspaceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Workspace>> callback) {
    try {
      SettableFuture<ApiResponse<Workspace>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Workspace>() {}, new AsyncApiCallback<ApiResponse<Workspace>>() {
        @Override
        public void onCompleted(ApiResponse<Workspace> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Workspace> response = (ApiResponse<Workspace>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Workspace> response = (ApiResponse<Workspace>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DocumentEntityListing> getContentmanagementWorkspaceDocumentsAsync(GetContentmanagementWorkspaceDocumentsRequest request, AsyncApiCallback<DocumentEntityListing> callback) {
    try {
      SettableFuture<DocumentEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DocumentEntityListing>() {}, new AsyncApiCallback<ApiResponse<DocumentEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of documents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DocumentEntityListing>> getContentmanagementWorkspaceDocumentsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DocumentEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<DocumentEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DocumentEntityListing>() {}, new AsyncApiCallback<ApiResponse<DocumentEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentEntityListing> response = (ApiResponse<DocumentEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentEntityListing> response = (ApiResponse<DocumentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a workspace member
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkspaceMember> getContentmanagementWorkspaceMemberAsync(GetContentmanagementWorkspaceMemberRequest request, AsyncApiCallback<WorkspaceMember> callback) {
    try {
      SettableFuture<WorkspaceMember> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkspaceMember>() {}, new AsyncApiCallback<ApiResponse<WorkspaceMember>>() {
        @Override
        public void onCompleted(ApiResponse<WorkspaceMember> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a workspace member
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkspaceMember>> getContentmanagementWorkspaceMemberAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WorkspaceMember>> callback) {
    try {
      SettableFuture<ApiResponse<WorkspaceMember>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkspaceMember>() {}, new AsyncApiCallback<ApiResponse<WorkspaceMember>>() {
        @Override
        public void onCompleted(ApiResponse<WorkspaceMember> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkspaceMember> response = (ApiResponse<WorkspaceMember>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkspaceMember> response = (ApiResponse<WorkspaceMember>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list workspace members
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkspaceMemberEntityListing> getContentmanagementWorkspaceMembersAsync(GetContentmanagementWorkspaceMembersRequest request, AsyncApiCallback<WorkspaceMemberEntityListing> callback) {
    try {
      SettableFuture<WorkspaceMemberEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkspaceMemberEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorkspaceMemberEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkspaceMemberEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list workspace members
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkspaceMemberEntityListing>> getContentmanagementWorkspaceMembersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WorkspaceMemberEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<WorkspaceMemberEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkspaceMemberEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorkspaceMemberEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkspaceMemberEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkspaceMemberEntityListing> response = (ApiResponse<WorkspaceMemberEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkspaceMemberEntityListing> response = (ApiResponse<WorkspaceMemberEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a workspace tag
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TagValue> getContentmanagementWorkspaceTagvalueAsync(GetContentmanagementWorkspaceTagvalueRequest request, AsyncApiCallback<TagValue> callback) {
    try {
      SettableFuture<TagValue> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TagValue>() {}, new AsyncApiCallback<ApiResponse<TagValue>>() {
        @Override
        public void onCompleted(ApiResponse<TagValue> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a workspace tag
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TagValue>> getContentmanagementWorkspaceTagvalueAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TagValue>> callback) {
    try {
      SettableFuture<ApiResponse<TagValue>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TagValue>() {}, new AsyncApiCallback<ApiResponse<TagValue>>() {
        @Override
        public void onCompleted(ApiResponse<TagValue> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TagValue> response = (ApiResponse<TagValue>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TagValue> response = (ApiResponse<TagValue>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of workspace tags
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TagValueEntityListing> getContentmanagementWorkspaceTagvaluesAsync(GetContentmanagementWorkspaceTagvaluesRequest request, AsyncApiCallback<TagValueEntityListing> callback) {
    try {
      SettableFuture<TagValueEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TagValueEntityListing>() {}, new AsyncApiCallback<ApiResponse<TagValueEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TagValueEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of workspace tags
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TagValueEntityListing>> getContentmanagementWorkspaceTagvaluesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TagValueEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<TagValueEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TagValueEntityListing>() {}, new AsyncApiCallback<ApiResponse<TagValueEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TagValueEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TagValueEntityListing> response = (ApiResponse<TagValueEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TagValueEntityListing> response = (ApiResponse<TagValueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkspaceEntityListing> getContentmanagementWorkspacesAsync(GetContentmanagementWorkspacesRequest request, AsyncApiCallback<WorkspaceEntityListing> callback) {
    try {
      SettableFuture<WorkspaceEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkspaceEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorkspaceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkspaceEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkspaceEntityListing>> getContentmanagementWorkspacesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WorkspaceEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<WorkspaceEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkspaceEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorkspaceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkspaceEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkspaceEntityListing> response = (ApiResponse<WorkspaceEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkspaceEntityListing> response = (ApiResponse<WorkspaceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query audits
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QueryResults> postContentmanagementAuditqueryAsync(PostContentmanagementAuditqueryRequest request, AsyncApiCallback<QueryResults> callback) {
    try {
      SettableFuture<QueryResults> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QueryResults>() {}, new AsyncApiCallback<ApiResponse<QueryResults>>() {
        @Override
        public void onCompleted(ApiResponse<QueryResults> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query audits
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QueryResults>> postContentmanagementAuditqueryAsync(ApiRequest<ContentQueryRequest> request, AsyncApiCallback<ApiResponse<QueryResults>> callback) {
    try {
      SettableFuture<ApiResponse<QueryResults>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QueryResults>() {}, new AsyncApiCallback<ApiResponse<QueryResults>>() {
        @Override
        public void onCompleted(ApiResponse<QueryResults> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QueryResults> response = (ApiResponse<QueryResults>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QueryResults> response = (ApiResponse<QueryResults>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Document> postContentmanagementDocumentAsync(PostContentmanagementDocumentRequest request, AsyncApiCallback<Document> callback) {
    try {
      SettableFuture<Document> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Document>() {}, new AsyncApiCallback<ApiResponse<Document>>() {
        @Override
        public void onCompleted(ApiResponse<Document> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Document>> postContentmanagementDocumentAsync(ApiRequest<DocumentUpdate> request, AsyncApiCallback<ApiResponse<Document>> callback) {
    try {
      SettableFuture<ApiResponse<Document>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Document>() {}, new AsyncApiCallback<ApiResponse<Document>>() {
        @Override
        public void onCompleted(ApiResponse<Document> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Document> response = (ApiResponse<Document>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Document> response = (ApiResponse<Document>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace the contents of a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReplaceResponse> postContentmanagementDocumentContentAsync(PostContentmanagementDocumentContentRequest request, AsyncApiCallback<ReplaceResponse> callback) {
    try {
      SettableFuture<ReplaceResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReplaceResponse>() {}, new AsyncApiCallback<ApiResponse<ReplaceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ReplaceResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Replace the contents of a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReplaceResponse>> postContentmanagementDocumentContentAsync(ApiRequest<ReplaceRequest> request, AsyncApiCallback<ApiResponse<ReplaceResponse>> callback) {
    try {
      SettableFuture<ApiResponse<ReplaceResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReplaceResponse>() {}, new AsyncApiCallback<ApiResponse<ReplaceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ReplaceResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReplaceResponse> response = (ApiResponse<ReplaceResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReplaceResponse> response = (ApiResponse<ReplaceResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Document> postContentmanagementDocumentsAsync(PostContentmanagementDocumentsRequest request, AsyncApiCallback<Document> callback) {
    try {
      SettableFuture<Document> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Document>() {}, new AsyncApiCallback<ApiResponse<Document>>() {
        @Override
        public void onCompleted(ApiResponse<Document> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add a document.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Document>> postContentmanagementDocumentsAsync(ApiRequest<DocumentUpload> request, AsyncApiCallback<ApiResponse<Document>> callback) {
    try {
      SettableFuture<ApiResponse<Document>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Document>() {}, new AsyncApiCallback<ApiResponse<Document>>() {
        @Override
        public void onCompleted(ApiResponse<Document> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Document> response = (ApiResponse<Document>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Document> response = (ApiResponse<Document>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query content
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QueryResults> postContentmanagementQueryAsync(PostContentmanagementQueryRequest request, AsyncApiCallback<QueryResults> callback) {
    try {
      SettableFuture<QueryResults> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QueryResults>() {}, new AsyncApiCallback<ApiResponse<QueryResults>>() {
        @Override
        public void onCompleted(ApiResponse<QueryResults> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query content
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QueryResults>> postContentmanagementQueryAsync(ApiRequest<QueryRequest> request, AsyncApiCallback<ApiResponse<QueryResults>> callback) {
    try {
      SettableFuture<ApiResponse<QueryResults>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QueryResults>() {}, new AsyncApiCallback<ApiResponse<QueryResults>>() {
        @Override
        public void onCompleted(ApiResponse<QueryResults> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QueryResults> response = (ApiResponse<QueryResults>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QueryResults> response = (ApiResponse<QueryResults>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CreateShareResponse> postContentmanagementSharesAsync(PostContentmanagementSharesRequest request, AsyncApiCallback<CreateShareResponse> callback) {
    try {
      SettableFuture<CreateShareResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CreateShareResponse>() {}, new AsyncApiCallback<ApiResponse<CreateShareResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CreateShareResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CreateShareResponse>> postContentmanagementSharesAsync(ApiRequest<CreateShareRequest> request, AsyncApiCallback<ApiResponse<CreateShareResponse>> callback) {
    try {
      SettableFuture<ApiResponse<CreateShareResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CreateShareResponse>() {}, new AsyncApiCallback<ApiResponse<CreateShareResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CreateShareResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CreateShareResponse> response = (ApiResponse<CreateShareResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CreateShareResponse> response = (ApiResponse<CreateShareResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a workspace tag
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TagValue> postContentmanagementWorkspaceTagvaluesAsync(PostContentmanagementWorkspaceTagvaluesRequest request, AsyncApiCallback<TagValue> callback) {
    try {
      SettableFuture<TagValue> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TagValue>() {}, new AsyncApiCallback<ApiResponse<TagValue>>() {
        @Override
        public void onCompleted(ApiResponse<TagValue> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a workspace tag
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TagValue>> postContentmanagementWorkspaceTagvaluesAsync(ApiRequest<TagValue> request, AsyncApiCallback<ApiResponse<TagValue>> callback) {
    try {
      SettableFuture<ApiResponse<TagValue>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TagValue>() {}, new AsyncApiCallback<ApiResponse<TagValue>>() {
        @Override
        public void onCompleted(ApiResponse<TagValue> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TagValue> response = (ApiResponse<TagValue>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TagValue> response = (ApiResponse<TagValue>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TagValueEntityListing> postContentmanagementWorkspaceTagvaluesQueryAsync(PostContentmanagementWorkspaceTagvaluesQueryRequest request, AsyncApiCallback<TagValueEntityListing> callback) {
    try {
      SettableFuture<TagValueEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TagValueEntityListing>() {}, new AsyncApiCallback<ApiResponse<TagValueEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TagValueEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TagValueEntityListing>> postContentmanagementWorkspaceTagvaluesQueryAsync(ApiRequest<TagQueryRequest> request, AsyncApiCallback<ApiResponse<TagValueEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<TagValueEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TagValueEntityListing>() {}, new AsyncApiCallback<ApiResponse<TagValueEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TagValueEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TagValueEntityListing> response = (ApiResponse<TagValueEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TagValueEntityListing> response = (ApiResponse<TagValueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a group workspace
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Workspace> postContentmanagementWorkspacesAsync(PostContentmanagementWorkspacesRequest request, AsyncApiCallback<Workspace> callback) {
    try {
      SettableFuture<Workspace> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Workspace>() {}, new AsyncApiCallback<ApiResponse<Workspace>>() {
        @Override
        public void onCompleted(ApiResponse<Workspace> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a group workspace
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Workspace>> postContentmanagementWorkspacesAsync(ApiRequest<WorkspaceCreate> request, AsyncApiCallback<ApiResponse<Workspace>> callback) {
    try {
      SettableFuture<ApiResponse<Workspace>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Workspace>() {}, new AsyncApiCallback<ApiResponse<Workspace>>() {
        @Override
        public void onCompleted(ApiResponse<Workspace> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Workspace> response = (ApiResponse<Workspace>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Workspace> response = (ApiResponse<Workspace>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a workspace
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Workspace> putContentmanagementWorkspaceAsync(PutContentmanagementWorkspaceRequest request, AsyncApiCallback<Workspace> callback) {
    try {
      SettableFuture<Workspace> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Workspace>() {}, new AsyncApiCallback<ApiResponse<Workspace>>() {
        @Override
        public void onCompleted(ApiResponse<Workspace> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a workspace
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Workspace>> putContentmanagementWorkspaceAsync(ApiRequest<Workspace> request, AsyncApiCallback<ApiResponse<Workspace>> callback) {
    try {
      SettableFuture<ApiResponse<Workspace>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Workspace>() {}, new AsyncApiCallback<ApiResponse<Workspace>>() {
        @Override
        public void onCompleted(ApiResponse<Workspace> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Workspace> response = (ApiResponse<Workspace>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Workspace> response = (ApiResponse<Workspace>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add a member to a workspace
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkspaceMember> putContentmanagementWorkspaceMemberAsync(PutContentmanagementWorkspaceMemberRequest request, AsyncApiCallback<WorkspaceMember> callback) {
    try {
      SettableFuture<WorkspaceMember> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkspaceMember>() {}, new AsyncApiCallback<ApiResponse<WorkspaceMember>>() {
        @Override
        public void onCompleted(ApiResponse<WorkspaceMember> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add a member to a workspace
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkspaceMember>> putContentmanagementWorkspaceMemberAsync(ApiRequest<WorkspaceMember> request, AsyncApiCallback<ApiResponse<WorkspaceMember>> callback) {
    try {
      SettableFuture<ApiResponse<WorkspaceMember>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkspaceMember>() {}, new AsyncApiCallback<ApiResponse<WorkspaceMember>>() {
        @Override
        public void onCompleted(ApiResponse<WorkspaceMember> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkspaceMember> response = (ApiResponse<WorkspaceMember>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkspaceMember> response = (ApiResponse<WorkspaceMember>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TagValue> putContentmanagementWorkspaceTagvalueAsync(PutContentmanagementWorkspaceTagvalueRequest request, AsyncApiCallback<TagValue> callback) {
    try {
      SettableFuture<TagValue> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TagValue>() {}, new AsyncApiCallback<ApiResponse<TagValue>>() {
        @Override
        public void onCompleted(ApiResponse<TagValue> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TagValue>> putContentmanagementWorkspaceTagvalueAsync(ApiRequest<TagValue> request, AsyncApiCallback<ApiResponse<TagValue>> callback) {
    try {
      SettableFuture<ApiResponse<TagValue>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TagValue>() {}, new AsyncApiCallback<ApiResponse<TagValue>>() {
        @Override
        public void onCompleted(ApiResponse<TagValue> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TagValue> response = (ApiResponse<TagValue>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TagValue> response = (ApiResponse<TagValue>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
