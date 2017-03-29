package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

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
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteContentmanagementDocumentAsync(DeleteContentmanagementDocumentRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteContentmanagementDocumentAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteContentmanagementShareAsync(DeleteContentmanagementShareRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteContentmanagementShareAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Cancel the command for this status
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteContentmanagementStatusStatusIdAsync(DeleteContentmanagementStatusStatusIdRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Cancel the command for this status
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteContentmanagementStatusStatusIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteContentmanagementWorkspaceAsync(DeleteContentmanagementWorkspaceRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteContentmanagementWorkspaceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete a member from a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteContentmanagementWorkspaceMemberAsync(DeleteContentmanagementWorkspaceMemberRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a member from a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteContentmanagementWorkspaceMemberAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteContentmanagementWorkspaceTagvalueAsync(DeleteContentmanagementWorkspaceTagvalueRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteContentmanagementWorkspaceTagvalueAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Get a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Document> getContentmanagementDocumentAsync(GetContentmanagementDocumentRequest request, AsyncApiCallback<Document> callback) throws ApiException {
    return pcapiClient.<Document>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Document>() {}, callback);
  }

  /**
   * Get a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Document>> getContentmanagementDocumentAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Document>> callback) throws ApiException {
    return pcapiClient.<Document>invokeAPIVerboseAsync(request, new TypeReference<Document>() {}, callback);
  }

  /**
   * Get a list of audits for a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DocumentAuditEntityListing> getContentmanagementDocumentAuditsAsync(GetContentmanagementDocumentAuditsRequest request, AsyncApiCallback<DocumentAuditEntityListing> callback) throws ApiException {
    return pcapiClient.<DocumentAuditEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DocumentAuditEntityListing>() {}, callback);
  }

  /**
   * Get a list of audits for a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DocumentAuditEntityListing>> getContentmanagementDocumentAuditsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DocumentAuditEntityListing>> callback) throws ApiException {
    return pcapiClient.<DocumentAuditEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DocumentAuditEntityListing>() {}, callback);
  }

  /**
   * Download a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DownloadResponse> getContentmanagementDocumentContentAsync(GetContentmanagementDocumentContentRequest request, AsyncApiCallback<DownloadResponse> callback) throws ApiException {
    return pcapiClient.<DownloadResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DownloadResponse>() {}, callback);
  }

  /**
   * Download a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DownloadResponse>> getContentmanagementDocumentContentAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DownloadResponse>> callback) throws ApiException {
    return pcapiClient.<DownloadResponse>invokeAPIVerboseAsync(request, new TypeReference<DownloadResponse>() {}, callback);
  }

  /**
   * Get a list of documents.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DocumentEntityListing> getContentmanagementDocumentsAsync(GetContentmanagementDocumentsRequest request, AsyncApiCallback<DocumentEntityListing> callback) throws ApiException {
    return pcapiClient.<DocumentEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DocumentEntityListing>() {}, callback);
  }

  /**
   * Get a list of documents.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DocumentEntityListing>> getContentmanagementDocumentsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DocumentEntityListing>> callback) throws ApiException {
    return pcapiClient.<DocumentEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DocumentEntityListing>() {}, callback);
  }

  /**
   * Query content
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<QueryResults> getContentmanagementQueryAsync(GetContentmanagementQueryRequest request, AsyncApiCallback<QueryResults> callback) throws ApiException {
    return pcapiClient.<QueryResults>invokeAPIAsync(request.withHttpInfo(), new TypeReference<QueryResults>() {}, callback);
  }

  /**
   * Query content
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<QueryResults>> getContentmanagementQueryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<QueryResults>> callback) throws ApiException {
    return pcapiClient.<QueryResults>invokeAPIVerboseAsync(request, new TypeReference<QueryResults>() {}, callback);
  }

  /**
   * Get a Security Profile
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SecurityProfile> getContentmanagementSecurityprofileAsync(GetContentmanagementSecurityprofileRequest request, AsyncApiCallback<SecurityProfile> callback) throws ApiException {
    return pcapiClient.<SecurityProfile>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SecurityProfile>() {}, callback);
  }

  /**
   * Get a Security Profile
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SecurityProfile>> getContentmanagementSecurityprofileAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SecurityProfile>> callback) throws ApiException {
    return pcapiClient.<SecurityProfile>invokeAPIVerboseAsync(request, new TypeReference<SecurityProfile>() {}, callback);
  }

  /**
   * Get a List of Security Profiles
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SecurityProfileEntityListing> getContentmanagementSecurityprofilesAsync(GetContentmanagementSecurityprofilesRequest request, AsyncApiCallback<SecurityProfileEntityListing> callback) throws ApiException {
    return pcapiClient.<SecurityProfileEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SecurityProfileEntityListing>() {}, callback);
  }

  /**
   * Get a List of Security Profiles
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SecurityProfileEntityListing>> getContentmanagementSecurityprofilesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SecurityProfileEntityListing>> callback) throws ApiException {
    return pcapiClient.<SecurityProfileEntityListing>invokeAPIVerboseAsync(request, new TypeReference<SecurityProfileEntityListing>() {}, callback);
  }

  /**
   * Retrieve details about an existing share.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Share> getContentmanagementShareAsync(GetContentmanagementShareRequest request, AsyncApiCallback<Share> callback) throws ApiException {
    return pcapiClient.<Share>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Share>() {}, callback);
  }

  /**
   * Retrieve details about an existing share.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Share>> getContentmanagementShareAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Share>> callback) throws ApiException {
    return pcapiClient.<Share>invokeAPIVerboseAsync(request, new TypeReference<Share>() {}, callback);
  }

  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SharedResponse> getContentmanagementSharedSharedIdAsync(GetContentmanagementSharedSharedIdRequest request, AsyncApiCallback<SharedResponse> callback) throws ApiException {
    return pcapiClient.<SharedResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SharedResponse>() {}, callback);
  }

  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SharedResponse>> getContentmanagementSharedSharedIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SharedResponse>> callback) throws ApiException {
    return pcapiClient.<SharedResponse>invokeAPIVerboseAsync(request, new TypeReference<SharedResponse>() {}, callback);
  }

  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ShareEntityListing> getContentmanagementSharesAsync(GetContentmanagementSharesRequest request, AsyncApiCallback<ShareEntityListing> callback) throws ApiException {
    return pcapiClient.<ShareEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ShareEntityListing>() {}, callback);
  }

  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ShareEntityListing>> getContentmanagementSharesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ShareEntityListing>> callback) throws ApiException {
    return pcapiClient.<ShareEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ShareEntityListing>() {}, callback);
  }

  /**
   * Get a list of statuses for pending operations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CommandStatusEntityListing> getContentmanagementStatusAsync(GetContentmanagementStatusRequest request, AsyncApiCallback<CommandStatusEntityListing> callback) throws ApiException {
    return pcapiClient.<CommandStatusEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CommandStatusEntityListing>() {}, callback);
  }

  /**
   * Get a list of statuses for pending operations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CommandStatusEntityListing>> getContentmanagementStatusAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CommandStatusEntityListing>> callback) throws ApiException {
    return pcapiClient.<CommandStatusEntityListing>invokeAPIVerboseAsync(request, new TypeReference<CommandStatusEntityListing>() {}, callback);
  }

  /**
   * Get a status.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CommandStatus> getContentmanagementStatusStatusIdAsync(GetContentmanagementStatusStatusIdRequest request, AsyncApiCallback<CommandStatus> callback) throws ApiException {
    return pcapiClient.<CommandStatus>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CommandStatus>() {}, callback);
  }

  /**
   * Get a status.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CommandStatus>> getContentmanagementStatusStatusIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CommandStatus>> callback) throws ApiException {
    return pcapiClient.<CommandStatus>invokeAPIVerboseAsync(request, new TypeReference<CommandStatus>() {}, callback);
  }

  /**
   * Get usage details.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Usage> getContentmanagementUsageAsync(GetContentmanagementUsageRequest request, AsyncApiCallback<Usage> callback) throws ApiException {
    return pcapiClient.<Usage>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Usage>() {}, callback);
  }

  /**
   * Get usage details.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Usage>> getContentmanagementUsageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Usage>> callback) throws ApiException {
    return pcapiClient.<Usage>invokeAPIVerboseAsync(request, new TypeReference<Usage>() {}, callback);
  }

  /**
   * Get a workspace.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Workspace> getContentmanagementWorkspaceAsync(GetContentmanagementWorkspaceRequest request, AsyncApiCallback<Workspace> callback) throws ApiException {
    return pcapiClient.<Workspace>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Workspace>() {}, callback);
  }

  /**
   * Get a workspace.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Workspace>> getContentmanagementWorkspaceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Workspace>> callback) throws ApiException {
    return pcapiClient.<Workspace>invokeAPIVerboseAsync(request, new TypeReference<Workspace>() {}, callback);
  }

  /**
   * Get a list of documents.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DocumentEntityListing> getContentmanagementWorkspaceDocumentsAsync(GetContentmanagementWorkspaceDocumentsRequest request, AsyncApiCallback<DocumentEntityListing> callback) throws ApiException {
    return pcapiClient.<DocumentEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DocumentEntityListing>() {}, callback);
  }

  /**
   * Get a list of documents.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DocumentEntityListing>> getContentmanagementWorkspaceDocumentsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DocumentEntityListing>> callback) throws ApiException {
    return pcapiClient.<DocumentEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DocumentEntityListing>() {}, callback);
  }

  /**
   * Get a workspace member
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WorkspaceMember> getContentmanagementWorkspaceMemberAsync(GetContentmanagementWorkspaceMemberRequest request, AsyncApiCallback<WorkspaceMember> callback) throws ApiException {
    return pcapiClient.<WorkspaceMember>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WorkspaceMember>() {}, callback);
  }

  /**
   * Get a workspace member
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WorkspaceMember>> getContentmanagementWorkspaceMemberAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WorkspaceMember>> callback) throws ApiException {
    return pcapiClient.<WorkspaceMember>invokeAPIVerboseAsync(request, new TypeReference<WorkspaceMember>() {}, callback);
  }

  /**
   * Get a list workspace members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WorkspaceMemberEntityListing> getContentmanagementWorkspaceMembersAsync(GetContentmanagementWorkspaceMembersRequest request, AsyncApiCallback<WorkspaceMemberEntityListing> callback) throws ApiException {
    return pcapiClient.<WorkspaceMemberEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WorkspaceMemberEntityListing>() {}, callback);
  }

  /**
   * Get a list workspace members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WorkspaceMemberEntityListing>> getContentmanagementWorkspaceMembersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WorkspaceMemberEntityListing>> callback) throws ApiException {
    return pcapiClient.<WorkspaceMemberEntityListing>invokeAPIVerboseAsync(request, new TypeReference<WorkspaceMemberEntityListing>() {}, callback);
  }

  /**
   * Get a workspace tag
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TagValue> getContentmanagementWorkspaceTagvalueAsync(GetContentmanagementWorkspaceTagvalueRequest request, AsyncApiCallback<TagValue> callback) throws ApiException {
    return pcapiClient.<TagValue>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TagValue>() {}, callback);
  }

  /**
   * Get a workspace tag
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TagValue>> getContentmanagementWorkspaceTagvalueAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TagValue>> callback) throws ApiException {
    return pcapiClient.<TagValue>invokeAPIVerboseAsync(request, new TypeReference<TagValue>() {}, callback);
  }

  /**
   * Get a list of workspace tags
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TagValueEntityListing> getContentmanagementWorkspaceTagvaluesAsync(GetContentmanagementWorkspaceTagvaluesRequest request, AsyncApiCallback<TagValueEntityListing> callback) throws ApiException {
    return pcapiClient.<TagValueEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TagValueEntityListing>() {}, callback);
  }

  /**
   * Get a list of workspace tags
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TagValueEntityListing>> getContentmanagementWorkspaceTagvaluesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TagValueEntityListing>> callback) throws ApiException {
    return pcapiClient.<TagValueEntityListing>invokeAPIVerboseAsync(request, new TypeReference<TagValueEntityListing>() {}, callback);
  }

  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WorkspaceEntityListing> getContentmanagementWorkspacesAsync(GetContentmanagementWorkspacesRequest request, AsyncApiCallback<WorkspaceEntityListing> callback) throws ApiException {
    return pcapiClient.<WorkspaceEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WorkspaceEntityListing>() {}, callback);
  }

  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WorkspaceEntityListing>> getContentmanagementWorkspacesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WorkspaceEntityListing>> callback) throws ApiException {
    return pcapiClient.<WorkspaceEntityListing>invokeAPIVerboseAsync(request, new TypeReference<WorkspaceEntityListing>() {}, callback);
  }

  /**
   * Query audits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<QueryResults> postContentmanagementAuditqueryAsync(PostContentmanagementAuditqueryRequest request, AsyncApiCallback<QueryResults> callback) throws ApiException {
    return pcapiClient.<QueryResults>invokeAPIAsync(request.withHttpInfo(), new TypeReference<QueryResults>() {}, callback);
  }

  /**
   * Query audits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<QueryResults>> postContentmanagementAuditqueryAsync(ApiRequest<ContentQueryRequest> request, AsyncApiCallback<ApiResponse<QueryResults>> callback) throws ApiException {
    return pcapiClient.<QueryResults>invokeAPIVerboseAsync(request, new TypeReference<QueryResults>() {}, callback);
  }

  /**
   * Update a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Document> postContentmanagementDocumentAsync(PostContentmanagementDocumentRequest request, AsyncApiCallback<Document> callback) throws ApiException {
    return pcapiClient.<Document>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Document>() {}, callback);
  }

  /**
   * Update a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Document>> postContentmanagementDocumentAsync(ApiRequest<DocumentUpdate> request, AsyncApiCallback<ApiResponse<Document>> callback) throws ApiException {
    return pcapiClient.<Document>invokeAPIVerboseAsync(request, new TypeReference<Document>() {}, callback);
  }

  /**
   * Replace the contents of a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ReplaceResponse> postContentmanagementDocumentContentAsync(PostContentmanagementDocumentContentRequest request, AsyncApiCallback<ReplaceResponse> callback) throws ApiException {
    return pcapiClient.<ReplaceResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ReplaceResponse>() {}, callback);
  }

  /**
   * Replace the contents of a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ReplaceResponse>> postContentmanagementDocumentContentAsync(ApiRequest<ReplaceRequest> request, AsyncApiCallback<ApiResponse<ReplaceResponse>> callback) throws ApiException {
    return pcapiClient.<ReplaceResponse>invokeAPIVerboseAsync(request, new TypeReference<ReplaceResponse>() {}, callback);
  }

  /**
   * Add a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Document> postContentmanagementDocumentsAsync(PostContentmanagementDocumentsRequest request, AsyncApiCallback<Document> callback) throws ApiException {
    return pcapiClient.<Document>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Document>() {}, callback);
  }

  /**
   * Add a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Document>> postContentmanagementDocumentsAsync(ApiRequest<DocumentUpload> request, AsyncApiCallback<ApiResponse<Document>> callback) throws ApiException {
    return pcapiClient.<Document>invokeAPIVerboseAsync(request, new TypeReference<Document>() {}, callback);
  }

  /**
   * Query content
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<QueryResults> postContentmanagementQueryAsync(PostContentmanagementQueryRequest request, AsyncApiCallback<QueryResults> callback) throws ApiException {
    return pcapiClient.<QueryResults>invokeAPIAsync(request.withHttpInfo(), new TypeReference<QueryResults>() {}, callback);
  }

  /**
   * Query content
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<QueryResults>> postContentmanagementQueryAsync(ApiRequest<QueryRequest> request, AsyncApiCallback<ApiResponse<QueryResults>> callback) throws ApiException {
    return pcapiClient.<QueryResults>invokeAPIVerboseAsync(request, new TypeReference<QueryResults>() {}, callback);
  }

  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CreateShareResponse> postContentmanagementSharesAsync(PostContentmanagementSharesRequest request, AsyncApiCallback<CreateShareResponse> callback) throws ApiException {
    return pcapiClient.<CreateShareResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CreateShareResponse>() {}, callback);
  }

  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CreateShareResponse>> postContentmanagementSharesAsync(ApiRequest<CreateShareRequest> request, AsyncApiCallback<ApiResponse<CreateShareResponse>> callback) throws ApiException {
    return pcapiClient.<CreateShareResponse>invokeAPIVerboseAsync(request, new TypeReference<CreateShareResponse>() {}, callback);
  }

  /**
   * Create a workspace tag
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TagValue> postContentmanagementWorkspaceTagvaluesAsync(PostContentmanagementWorkspaceTagvaluesRequest request, AsyncApiCallback<TagValue> callback) throws ApiException {
    return pcapiClient.<TagValue>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TagValue>() {}, callback);
  }

  /**
   * Create a workspace tag
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TagValue>> postContentmanagementWorkspaceTagvaluesAsync(ApiRequest<TagValue> request, AsyncApiCallback<ApiResponse<TagValue>> callback) throws ApiException {
    return pcapiClient.<TagValue>invokeAPIVerboseAsync(request, new TypeReference<TagValue>() {}, callback);
  }

  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TagValueEntityListing> postContentmanagementWorkspaceTagvaluesQueryAsync(PostContentmanagementWorkspaceTagvaluesQueryRequest request, AsyncApiCallback<TagValueEntityListing> callback) throws ApiException {
    return pcapiClient.<TagValueEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TagValueEntityListing>() {}, callback);
  }

  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TagValueEntityListing>> postContentmanagementWorkspaceTagvaluesQueryAsync(ApiRequest<TagQueryRequest> request, AsyncApiCallback<ApiResponse<TagValueEntityListing>> callback) throws ApiException {
    return pcapiClient.<TagValueEntityListing>invokeAPIVerboseAsync(request, new TypeReference<TagValueEntityListing>() {}, callback);
  }

  /**
   * Create a group workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Workspace> postContentmanagementWorkspacesAsync(PostContentmanagementWorkspacesRequest request, AsyncApiCallback<Workspace> callback) throws ApiException {
    return pcapiClient.<Workspace>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Workspace>() {}, callback);
  }

  /**
   * Create a group workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Workspace>> postContentmanagementWorkspacesAsync(ApiRequest<WorkspaceCreate> request, AsyncApiCallback<ApiResponse<Workspace>> callback) throws ApiException {
    return pcapiClient.<Workspace>invokeAPIVerboseAsync(request, new TypeReference<Workspace>() {}, callback);
  }

  /**
   * Update a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Workspace> putContentmanagementWorkspaceAsync(PutContentmanagementWorkspaceRequest request, AsyncApiCallback<Workspace> callback) throws ApiException {
    return pcapiClient.<Workspace>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Workspace>() {}, callback);
  }

  /**
   * Update a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Workspace>> putContentmanagementWorkspaceAsync(ApiRequest<Workspace> request, AsyncApiCallback<ApiResponse<Workspace>> callback) throws ApiException {
    return pcapiClient.<Workspace>invokeAPIVerboseAsync(request, new TypeReference<Workspace>() {}, callback);
  }

  /**
   * Add a member to a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WorkspaceMember> putContentmanagementWorkspaceMemberAsync(PutContentmanagementWorkspaceMemberRequest request, AsyncApiCallback<WorkspaceMember> callback) throws ApiException {
    return pcapiClient.<WorkspaceMember>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WorkspaceMember>() {}, callback);
  }

  /**
   * Add a member to a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WorkspaceMember>> putContentmanagementWorkspaceMemberAsync(ApiRequest<WorkspaceMember> request, AsyncApiCallback<ApiResponse<WorkspaceMember>> callback) throws ApiException {
    return pcapiClient.<WorkspaceMember>invokeAPIVerboseAsync(request, new TypeReference<WorkspaceMember>() {}, callback);
  }

  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TagValue> putContentmanagementWorkspaceTagvalueAsync(PutContentmanagementWorkspaceTagvalueRequest request, AsyncApiCallback<TagValue> callback) throws ApiException {
    return pcapiClient.<TagValue>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TagValue>() {}, callback);
  }

  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TagValue>> putContentmanagementWorkspaceTagvalueAsync(ApiRequest<TagValue> request, AsyncApiCallback<ApiResponse<TagValue>> callback) throws ApiException {
    return pcapiClient.<TagValue>invokeAPIVerboseAsync(request, new TypeReference<TagValue>() {}, callback);
  }

}
