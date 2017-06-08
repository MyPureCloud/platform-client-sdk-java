package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

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


public class ContentManagementApi {
  private final ApiClient pcapiClient;

  public ContentManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContentManagementApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a document.
   * 
   * @param documentId Document ID (required)
   * @param override Override any lock on the document (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteContentmanagementDocument(String documentId, Boolean override) throws IOException, ApiException {
     deleteContentmanagementDocument(createDeleteContentmanagementDocumentRequest(documentId, override));
  }

  /**
   * Delete a document.
   * 
   * @param documentId Document ID (required)
   * @param override Override any lock on the document (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteContentmanagementDocumentWithHttpInfo(String documentId, Boolean override) throws IOException {
    return deleteContentmanagementDocument(createDeleteContentmanagementDocumentRequest(documentId, override).withHttpInfo());
  }

  private DeleteContentmanagementDocumentRequest createDeleteContentmanagementDocumentRequest(String documentId, Boolean override) {
    return DeleteContentmanagementDocumentRequest.builder()
            .withDocumentId(documentId)
    
            .withOverride(override)
    
            .build();
  }

  /**
   * Delete a document.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteContentmanagementDocument(DeleteContentmanagementDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteContentmanagementDocument(ApiRequest<Void> request) throws IOException {
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
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @param shareId Share ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteContentmanagementShare(String shareId) throws IOException, ApiException {
     deleteContentmanagementShare(createDeleteContentmanagementShareRequest(shareId));
  }

  /**
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @param shareId Share ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteContentmanagementShareWithHttpInfo(String shareId) throws IOException {
    return deleteContentmanagementShare(createDeleteContentmanagementShareRequest(shareId).withHttpInfo());
  }

  private DeleteContentmanagementShareRequest createDeleteContentmanagementShareRequest(String shareId) {
    return DeleteContentmanagementShareRequest.builder()
            .withShareId(shareId)
    
            .build();
  }

  /**
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteContentmanagementShare(DeleteContentmanagementShareRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteContentmanagementShare(ApiRequest<Void> request) throws IOException {
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
   * Cancel the command for this status
   * 
   * @param statusId Status ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteContentmanagementStatusStatusId(String statusId) throws IOException, ApiException {
     deleteContentmanagementStatusStatusId(createDeleteContentmanagementStatusStatusIdRequest(statusId));
  }

  /**
   * Cancel the command for this status
   * 
   * @param statusId Status ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteContentmanagementStatusStatusIdWithHttpInfo(String statusId) throws IOException {
    return deleteContentmanagementStatusStatusId(createDeleteContentmanagementStatusStatusIdRequest(statusId).withHttpInfo());
  }

  private DeleteContentmanagementStatusStatusIdRequest createDeleteContentmanagementStatusStatusIdRequest(String statusId) {
    return DeleteContentmanagementStatusStatusIdRequest.builder()
            .withStatusId(statusId)
    
            .build();
  }

  /**
   * Cancel the command for this status
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteContentmanagementStatusStatusId(DeleteContentmanagementStatusStatusIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Cancel the command for this status
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteContentmanagementStatusStatusId(ApiRequest<Void> request) throws IOException {
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
   * Delete a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param moveChildrenToWorkspaceId New location for objects in deleted workspace. (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteContentmanagementWorkspace(String workspaceId, String moveChildrenToWorkspaceId) throws IOException, ApiException {
     deleteContentmanagementWorkspace(createDeleteContentmanagementWorkspaceRequest(workspaceId, moveChildrenToWorkspaceId));
  }

  /**
   * Delete a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param moveChildrenToWorkspaceId New location for objects in deleted workspace. (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteContentmanagementWorkspaceWithHttpInfo(String workspaceId, String moveChildrenToWorkspaceId) throws IOException {
    return deleteContentmanagementWorkspace(createDeleteContentmanagementWorkspaceRequest(workspaceId, moveChildrenToWorkspaceId).withHttpInfo());
  }

  private DeleteContentmanagementWorkspaceRequest createDeleteContentmanagementWorkspaceRequest(String workspaceId, String moveChildrenToWorkspaceId) {
    return DeleteContentmanagementWorkspaceRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withMoveChildrenToWorkspaceId(moveChildrenToWorkspaceId)
    
            .build();
  }

  /**
   * Delete a workspace
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteContentmanagementWorkspace(DeleteContentmanagementWorkspaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a workspace
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteContentmanagementWorkspace(ApiRequest<Void> request) throws IOException {
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
   * Delete a member from a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteContentmanagementWorkspaceMember(String workspaceId, String memberId) throws IOException, ApiException {
     deleteContentmanagementWorkspaceMember(createDeleteContentmanagementWorkspaceMemberRequest(workspaceId, memberId));
  }

  /**
   * Delete a member from a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteContentmanagementWorkspaceMemberWithHttpInfo(String workspaceId, String memberId) throws IOException {
    return deleteContentmanagementWorkspaceMember(createDeleteContentmanagementWorkspaceMemberRequest(workspaceId, memberId).withHttpInfo());
  }

  private DeleteContentmanagementWorkspaceMemberRequest createDeleteContentmanagementWorkspaceMemberRequest(String workspaceId, String memberId) {
    return DeleteContentmanagementWorkspaceMemberRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withMemberId(memberId)
    
            .build();
  }

  /**
   * Delete a member from a workspace
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteContentmanagementWorkspaceMember(DeleteContentmanagementWorkspaceMemberRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a member from a workspace
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteContentmanagementWorkspaceMember(ApiRequest<Void> request) throws IOException {
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
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteContentmanagementWorkspaceTagvalue(String workspaceId, String tagId) throws IOException, ApiException {
     deleteContentmanagementWorkspaceTagvalue(createDeleteContentmanagementWorkspaceTagvalueRequest(workspaceId, tagId));
  }

  /**
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteContentmanagementWorkspaceTagvalueWithHttpInfo(String workspaceId, String tagId) throws IOException {
    return deleteContentmanagementWorkspaceTagvalue(createDeleteContentmanagementWorkspaceTagvalueRequest(workspaceId, tagId).withHttpInfo());
  }

  private DeleteContentmanagementWorkspaceTagvalueRequest createDeleteContentmanagementWorkspaceTagvalueRequest(String workspaceId, String tagId) {
    return DeleteContentmanagementWorkspaceTagvalueRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withTagId(tagId)
    
            .build();
  }

  /**
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteContentmanagementWorkspaceTagvalue(DeleteContentmanagementWorkspaceTagvalueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteContentmanagementWorkspaceTagvalue(ApiRequest<Void> request) throws IOException {
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
   * Get a document.
   * 
   * @param documentId Document ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Document
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Document getContentmanagementDocument(String documentId, List<String> expand) throws IOException, ApiException {
    return  getContentmanagementDocument(createGetContentmanagementDocumentRequest(documentId, expand));
  }

  /**
   * Get a document.
   * 
   * @param documentId Document ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Document
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Document> getContentmanagementDocumentWithHttpInfo(String documentId, List<String> expand) throws IOException {
    return getContentmanagementDocument(createGetContentmanagementDocumentRequest(documentId, expand).withHttpInfo());
  }

  private GetContentmanagementDocumentRequest createGetContentmanagementDocumentRequest(String documentId, List<String> expand) {
    return GetContentmanagementDocumentRequest.builder()
            .withDocumentId(documentId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a document.
   * 
   * @param request The request object
   * @return Document
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Document getContentmanagementDocument(GetContentmanagementDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Document> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Document>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Document> getContentmanagementDocument(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Document>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Document> response = (ApiResponse<Document>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Document> response = (ApiResponse<Document>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of audits for a document.
   * 
   * @param documentId Document ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param transactionFilter Transaction filter (optional)
   * @param level level (optional, default to USER)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to ascending)
   * @return DocumentAuditEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentAuditEntityListing getContentmanagementDocumentAudits(String documentId, Integer pageSize, Integer pageNumber, String transactionFilter, String level, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getContentmanagementDocumentAudits(createGetContentmanagementDocumentAuditsRequest(documentId, pageSize, pageNumber, transactionFilter, level, sortBy, sortOrder));
  }

  /**
   * Get a list of audits for a document.
   * 
   * @param documentId Document ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param transactionFilter Transaction filter (optional)
   * @param level level (optional, default to USER)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to ascending)
   * @return DocumentAuditEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentAuditEntityListing> getContentmanagementDocumentAuditsWithHttpInfo(String documentId, Integer pageSize, Integer pageNumber, String transactionFilter, String level, String sortBy, String sortOrder) throws IOException {
    return getContentmanagementDocumentAudits(createGetContentmanagementDocumentAuditsRequest(documentId, pageSize, pageNumber, transactionFilter, level, sortBy, sortOrder).withHttpInfo());
  }

  private GetContentmanagementDocumentAuditsRequest createGetContentmanagementDocumentAuditsRequest(String documentId, Integer pageSize, Integer pageNumber, String transactionFilter, String level, String sortBy, String sortOrder) {
    return GetContentmanagementDocumentAuditsRequest.builder()
            .withDocumentId(documentId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withTransactionFilter(transactionFilter)
    
            .withLevel(level)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get a list of audits for a document.
   * 
   * @param request The request object
   * @return DocumentAuditEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentAuditEntityListing getContentmanagementDocumentAudits(GetContentmanagementDocumentAuditsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentAuditEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentAuditEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of audits for a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentAuditEntityListing> getContentmanagementDocumentAudits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentAuditEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentAuditEntityListing> response = (ApiResponse<DocumentAuditEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentAuditEntityListing> response = (ApiResponse<DocumentAuditEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Download a document.
   * 
   * @param documentId Document ID (required)
   * @param disposition Request how the content will be downloaded: a file attachment or inline. Default is attachment. (optional)
   * @param contentType The requested format for the specified document. If supported, the document will be returned in that format. Example contentType=audio/wav (optional)
   * @return DownloadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DownloadResponse getContentmanagementDocumentContent(String documentId, String disposition, String contentType) throws IOException, ApiException {
    return  getContentmanagementDocumentContent(createGetContentmanagementDocumentContentRequest(documentId, disposition, contentType));
  }

  /**
   * Download a document.
   * 
   * @param documentId Document ID (required)
   * @param disposition Request how the content will be downloaded: a file attachment or inline. Default is attachment. (optional)
   * @param contentType The requested format for the specified document. If supported, the document will be returned in that format. Example contentType=audio/wav (optional)
   * @return DownloadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DownloadResponse> getContentmanagementDocumentContentWithHttpInfo(String documentId, String disposition, String contentType) throws IOException {
    return getContentmanagementDocumentContent(createGetContentmanagementDocumentContentRequest(documentId, disposition, contentType).withHttpInfo());
  }

  private GetContentmanagementDocumentContentRequest createGetContentmanagementDocumentContentRequest(String documentId, String disposition, String contentType) {
    return GetContentmanagementDocumentContentRequest.builder()
            .withDocumentId(documentId)
    
            .withDisposition(disposition)
    
            .withContentType(contentType)
    
            .build();
  }

  /**
   * Download a document.
   * 
   * @param request The request object
   * @return DownloadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DownloadResponse getContentmanagementDocumentContent(GetContentmanagementDocumentContentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DownloadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DownloadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Download a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DownloadResponse> getContentmanagementDocumentContent(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DownloadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DownloadResponse> response = (ApiResponse<DownloadResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DownloadResponse> response = (ApiResponse<DownloadResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of documents.
   * 
   * @param workspaceId Workspace ID (required)
   * @param name Name (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy name or dateCreated (optional)
   * @param sortOrder ascending or descending (optional, default to ascending)
   * @return DocumentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentEntityListing getContentmanagementDocuments(String workspaceId, String name, List<String> expand, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getContentmanagementDocuments(createGetContentmanagementDocumentsRequest(workspaceId, name, expand, pageSize, pageNumber, sortBy, sortOrder));
  }

  /**
   * Get a list of documents.
   * 
   * @param workspaceId Workspace ID (required)
   * @param name Name (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy name or dateCreated (optional)
   * @param sortOrder ascending or descending (optional, default to ascending)
   * @return DocumentEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentEntityListing> getContentmanagementDocumentsWithHttpInfo(String workspaceId, String name, List<String> expand, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) throws IOException {
    return getContentmanagementDocuments(createGetContentmanagementDocumentsRequest(workspaceId, name, expand, pageSize, pageNumber, sortBy, sortOrder).withHttpInfo());
  }

  private GetContentmanagementDocumentsRequest createGetContentmanagementDocumentsRequest(String workspaceId, String name, List<String> expand, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) {
    return GetContentmanagementDocumentsRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withName(name)
    
            .withExpand(expand)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get a list of documents.
   * 
   * @param request The request object
   * @return DocumentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentEntityListing getContentmanagementDocuments(GetContentmanagementDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of documents.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentEntityListing> getContentmanagementDocuments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentEntityListing> response = (ApiResponse<DocumentEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentEntityListing> response = (ApiResponse<DocumentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query content
   * 
   * @param queryPhrase Phrase tokens are ANDed together over all searchable fields (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy name or dateCreated (optional, default to name)
   * @param sortOrder ascending or descending (optional, default to ascending)
   * @param expand Which fields, if any, to expand. (optional)
   * @return QueryResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueryResults getContentmanagementQuery(String queryPhrase, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, List<String> expand) throws IOException, ApiException {
    return  getContentmanagementQuery(createGetContentmanagementQueryRequest(queryPhrase, pageSize, pageNumber, sortBy, sortOrder, expand));
  }

  /**
   * Query content
   * 
   * @param queryPhrase Phrase tokens are ANDed together over all searchable fields (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy name or dateCreated (optional, default to name)
   * @param sortOrder ascending or descending (optional, default to ascending)
   * @param expand Which fields, if any, to expand. (optional)
   * @return QueryResults
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueryResults> getContentmanagementQueryWithHttpInfo(String queryPhrase, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, List<String> expand) throws IOException {
    return getContentmanagementQuery(createGetContentmanagementQueryRequest(queryPhrase, pageSize, pageNumber, sortBy, sortOrder, expand).withHttpInfo());
  }

  private GetContentmanagementQueryRequest createGetContentmanagementQueryRequest(String queryPhrase, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, List<String> expand) {
    return GetContentmanagementQueryRequest.builder()
            .withQueryPhrase(queryPhrase)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Query content
   * 
   * @param request The request object
   * @return QueryResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueryResults getContentmanagementQuery(GetContentmanagementQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueryResults> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueryResults>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query content
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueryResults> getContentmanagementQuery(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueryResults>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueryResults> response = (ApiResponse<QueryResults>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<QueryResults> response = (ApiResponse<QueryResults>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Security Profile
   * 
   * @param securityProfileId Security Profile Id (required)
   * @return SecurityProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SecurityProfile getContentmanagementSecurityprofile(String securityProfileId) throws IOException, ApiException {
    return  getContentmanagementSecurityprofile(createGetContentmanagementSecurityprofileRequest(securityProfileId));
  }

  /**
   * Get a Security Profile
   * 
   * @param securityProfileId Security Profile Id (required)
   * @return SecurityProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SecurityProfile> getContentmanagementSecurityprofileWithHttpInfo(String securityProfileId) throws IOException {
    return getContentmanagementSecurityprofile(createGetContentmanagementSecurityprofileRequest(securityProfileId).withHttpInfo());
  }

  private GetContentmanagementSecurityprofileRequest createGetContentmanagementSecurityprofileRequest(String securityProfileId) {
    return GetContentmanagementSecurityprofileRequest.builder()
            .withSecurityProfileId(securityProfileId)
    
            .build();
  }

  /**
   * Get a Security Profile
   * 
   * @param request The request object
   * @return SecurityProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SecurityProfile getContentmanagementSecurityprofile(GetContentmanagementSecurityprofileRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SecurityProfile> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SecurityProfile>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Security Profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SecurityProfile> getContentmanagementSecurityprofile(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SecurityProfile>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SecurityProfile> response = (ApiResponse<SecurityProfile>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SecurityProfile> response = (ApiResponse<SecurityProfile>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a List of Security Profiles
   * 
   * @return SecurityProfileEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SecurityProfileEntityListing getContentmanagementSecurityprofiles() throws IOException, ApiException {
    return  getContentmanagementSecurityprofiles(createGetContentmanagementSecurityprofilesRequest());
  }

  /**
   * Get a List of Security Profiles
   * 
   * @return SecurityProfileEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SecurityProfileEntityListing> getContentmanagementSecurityprofilesWithHttpInfo() throws IOException {
    return getContentmanagementSecurityprofiles(createGetContentmanagementSecurityprofilesRequest().withHttpInfo());
  }

  private GetContentmanagementSecurityprofilesRequest createGetContentmanagementSecurityprofilesRequest() {
    return GetContentmanagementSecurityprofilesRequest.builder()
            .build();
  }

  /**
   * Get a List of Security Profiles
   * 
   * @param request The request object
   * @return SecurityProfileEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SecurityProfileEntityListing getContentmanagementSecurityprofiles(GetContentmanagementSecurityprofilesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SecurityProfileEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SecurityProfileEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a List of Security Profiles
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SecurityProfileEntityListing> getContentmanagementSecurityprofiles(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SecurityProfileEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SecurityProfileEntityListing> response = (ApiResponse<SecurityProfileEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SecurityProfileEntityListing> response = (ApiResponse<SecurityProfileEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve details about an existing share.
   * 
   * @param shareId Share ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Share
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Share getContentmanagementShare(String shareId, List<String> expand) throws IOException, ApiException {
    return  getContentmanagementShare(createGetContentmanagementShareRequest(shareId, expand));
  }

  /**
   * Retrieve details about an existing share.
   * 
   * @param shareId Share ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Share
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Share> getContentmanagementShareWithHttpInfo(String shareId, List<String> expand) throws IOException {
    return getContentmanagementShare(createGetContentmanagementShareRequest(shareId, expand).withHttpInfo());
  }

  private GetContentmanagementShareRequest createGetContentmanagementShareRequest(String shareId, List<String> expand) {
    return GetContentmanagementShareRequest.builder()
            .withShareId(shareId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Retrieve details about an existing share.
   * 
   * @param request The request object
   * @return Share
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Share getContentmanagementShare(GetContentmanagementShareRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Share> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Share>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve details about an existing share.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Share> getContentmanagementShare(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Share>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Share> response = (ApiResponse<Share>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Share> response = (ApiResponse<Share>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @param sharedId Shared ID (required)
   * @param redirect Turn on or off redirect (optional, default to true)
   * @param disposition Request how the share content will be downloaded: attached as a file or inline. Default is attachment. (optional, default to attachment)
   * @param contentType The requested format for the specified document. If supported, the document will be returned in that format. Example contentType=audio/wav (optional)
   * @param expand Expand some document fields (optional)
   * @return SharedResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SharedResponse getContentmanagementSharedSharedId(String sharedId, Boolean redirect, String disposition, String contentType, String expand) throws IOException, ApiException {
    return  getContentmanagementSharedSharedId(createGetContentmanagementSharedSharedIdRequest(sharedId, redirect, disposition, contentType, expand));
  }

  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @param sharedId Shared ID (required)
   * @param redirect Turn on or off redirect (optional, default to true)
   * @param disposition Request how the share content will be downloaded: attached as a file or inline. Default is attachment. (optional, default to attachment)
   * @param contentType The requested format for the specified document. If supported, the document will be returned in that format. Example contentType=audio/wav (optional)
   * @param expand Expand some document fields (optional)
   * @return SharedResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SharedResponse> getContentmanagementSharedSharedIdWithHttpInfo(String sharedId, Boolean redirect, String disposition, String contentType, String expand) throws IOException {
    return getContentmanagementSharedSharedId(createGetContentmanagementSharedSharedIdRequest(sharedId, redirect, disposition, contentType, expand).withHttpInfo());
  }

  private GetContentmanagementSharedSharedIdRequest createGetContentmanagementSharedSharedIdRequest(String sharedId, Boolean redirect, String disposition, String contentType, String expand) {
    return GetContentmanagementSharedSharedIdRequest.builder()
            .withSharedId(sharedId)
    
            .withRedirect(redirect)
    
            .withDisposition(disposition)
    
            .withContentType(contentType)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @param request The request object
   * @return SharedResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SharedResponse getContentmanagementSharedSharedId(GetContentmanagementSharedSharedIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SharedResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SharedResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SharedResponse> getContentmanagementSharedSharedId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SharedResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SharedResponse> response = (ApiResponse<SharedResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SharedResponse> response = (ApiResponse<SharedResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @param entityId Filters the shares returned to only the entity specified by the value of this parameter. (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return ShareEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShareEntityListing getContentmanagementShares(String entityId, List<String> expand, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getContentmanagementShares(createGetContentmanagementSharesRequest(entityId, expand, pageSize, pageNumber));
  }

  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @param entityId Filters the shares returned to only the entity specified by the value of this parameter. (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return ShareEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShareEntityListing> getContentmanagementSharesWithHttpInfo(String entityId, List<String> expand, Integer pageSize, Integer pageNumber) throws IOException {
    return getContentmanagementShares(createGetContentmanagementSharesRequest(entityId, expand, pageSize, pageNumber).withHttpInfo());
  }

  private GetContentmanagementSharesRequest createGetContentmanagementSharesRequest(String entityId, List<String> expand, Integer pageSize, Integer pageNumber) {
    return GetContentmanagementSharesRequest.builder()
            .withEntityId(entityId)
    
            .withExpand(expand)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @param request The request object
   * @return ShareEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShareEntityListing getContentmanagementShares(GetContentmanagementSharesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ShareEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ShareEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShareEntityListing> getContentmanagementShares(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ShareEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ShareEntityListing> response = (ApiResponse<ShareEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ShareEntityListing> response = (ApiResponse<ShareEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of statuses for pending operations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return CommandStatusEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommandStatusEntityListing getContentmanagementStatus(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getContentmanagementStatus(createGetContentmanagementStatusRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of statuses for pending operations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return CommandStatusEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommandStatusEntityListing> getContentmanagementStatusWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getContentmanagementStatus(createGetContentmanagementStatusRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetContentmanagementStatusRequest createGetContentmanagementStatusRequest(Integer pageSize, Integer pageNumber) {
    return GetContentmanagementStatusRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of statuses for pending operations
   * 
   * @param request The request object
   * @return CommandStatusEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommandStatusEntityListing getContentmanagementStatus(GetContentmanagementStatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CommandStatusEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CommandStatusEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of statuses for pending operations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommandStatusEntityListing> getContentmanagementStatus(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CommandStatusEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CommandStatusEntityListing> response = (ApiResponse<CommandStatusEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CommandStatusEntityListing> response = (ApiResponse<CommandStatusEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a status.
   * 
   * @param statusId Status ID (required)
   * @return CommandStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommandStatus getContentmanagementStatusStatusId(String statusId) throws IOException, ApiException {
    return  getContentmanagementStatusStatusId(createGetContentmanagementStatusStatusIdRequest(statusId));
  }

  /**
   * Get a status.
   * 
   * @param statusId Status ID (required)
   * @return CommandStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommandStatus> getContentmanagementStatusStatusIdWithHttpInfo(String statusId) throws IOException {
    return getContentmanagementStatusStatusId(createGetContentmanagementStatusStatusIdRequest(statusId).withHttpInfo());
  }

  private GetContentmanagementStatusStatusIdRequest createGetContentmanagementStatusStatusIdRequest(String statusId) {
    return GetContentmanagementStatusStatusIdRequest.builder()
            .withStatusId(statusId)
    
            .build();
  }

  /**
   * Get a status.
   * 
   * @param request The request object
   * @return CommandStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommandStatus getContentmanagementStatusStatusId(GetContentmanagementStatusStatusIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CommandStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CommandStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a status.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommandStatus> getContentmanagementStatusStatusId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CommandStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CommandStatus> response = (ApiResponse<CommandStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CommandStatus> response = (ApiResponse<CommandStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get usage details.
   * 
   * @return Usage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Usage getContentmanagementUsage() throws IOException, ApiException {
    return  getContentmanagementUsage(createGetContentmanagementUsageRequest());
  }

  /**
   * Get usage details.
   * 
   * @return Usage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Usage> getContentmanagementUsageWithHttpInfo() throws IOException {
    return getContentmanagementUsage(createGetContentmanagementUsageRequest().withHttpInfo());
  }

  private GetContentmanagementUsageRequest createGetContentmanagementUsageRequest() {
    return GetContentmanagementUsageRequest.builder()
            .build();
  }

  /**
   * Get usage details.
   * 
   * @param request The request object
   * @return Usage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Usage getContentmanagementUsage(GetContentmanagementUsageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Usage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Usage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get usage details.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Usage> getContentmanagementUsage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Usage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Usage> response = (ApiResponse<Usage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Usage> response = (ApiResponse<Usage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a workspace.
   * 
   * @param workspaceId Workspace ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Workspace
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workspace getContentmanagementWorkspace(String workspaceId, List<String> expand) throws IOException, ApiException {
    return  getContentmanagementWorkspace(createGetContentmanagementWorkspaceRequest(workspaceId, expand));
  }

  /**
   * Get a workspace.
   * 
   * @param workspaceId Workspace ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Workspace
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workspace> getContentmanagementWorkspaceWithHttpInfo(String workspaceId, List<String> expand) throws IOException {
    return getContentmanagementWorkspace(createGetContentmanagementWorkspaceRequest(workspaceId, expand).withHttpInfo());
  }

  private GetContentmanagementWorkspaceRequest createGetContentmanagementWorkspaceRequest(String workspaceId, List<String> expand) {
    return GetContentmanagementWorkspaceRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a workspace.
   * 
   * @param request The request object
   * @return Workspace
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workspace getContentmanagementWorkspace(GetContentmanagementWorkspaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Workspace> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Workspace>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a workspace.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workspace> getContentmanagementWorkspace(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Workspace>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Workspace> response = (ApiResponse<Workspace>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Workspace> response = (ApiResponse<Workspace>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of documents.
   * 
   * @param workspaceId Workspace ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy name or dateCreated (optional)
   * @param sortOrder ascending or descending (optional, default to ascending)
   * @return DocumentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentEntityListing getContentmanagementWorkspaceDocuments(String workspaceId, List<String> expand, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getContentmanagementWorkspaceDocuments(createGetContentmanagementWorkspaceDocumentsRequest(workspaceId, expand, pageSize, pageNumber, sortBy, sortOrder));
  }

  /**
   * Get a list of documents.
   * 
   * @param workspaceId Workspace ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy name or dateCreated (optional)
   * @param sortOrder ascending or descending (optional, default to ascending)
   * @return DocumentEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentEntityListing> getContentmanagementWorkspaceDocumentsWithHttpInfo(String workspaceId, List<String> expand, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) throws IOException {
    return getContentmanagementWorkspaceDocuments(createGetContentmanagementWorkspaceDocumentsRequest(workspaceId, expand, pageSize, pageNumber, sortBy, sortOrder).withHttpInfo());
  }

  private GetContentmanagementWorkspaceDocumentsRequest createGetContentmanagementWorkspaceDocumentsRequest(String workspaceId, List<String> expand, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) {
    return GetContentmanagementWorkspaceDocumentsRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withExpand(expand)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get a list of documents.
   * 
   * @param request The request object
   * @return DocumentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentEntityListing getContentmanagementWorkspaceDocuments(GetContentmanagementWorkspaceDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of documents.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentEntityListing> getContentmanagementWorkspaceDocuments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentEntityListing> response = (ApiResponse<DocumentEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentEntityListing> response = (ApiResponse<DocumentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a workspace member
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkspaceMember
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkspaceMember getContentmanagementWorkspaceMember(String workspaceId, String memberId, List<String> expand) throws IOException, ApiException {
    return  getContentmanagementWorkspaceMember(createGetContentmanagementWorkspaceMemberRequest(workspaceId, memberId, expand));
  }

  /**
   * Get a workspace member
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkspaceMember
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkspaceMember> getContentmanagementWorkspaceMemberWithHttpInfo(String workspaceId, String memberId, List<String> expand) throws IOException {
    return getContentmanagementWorkspaceMember(createGetContentmanagementWorkspaceMemberRequest(workspaceId, memberId, expand).withHttpInfo());
  }

  private GetContentmanagementWorkspaceMemberRequest createGetContentmanagementWorkspaceMemberRequest(String workspaceId, String memberId, List<String> expand) {
    return GetContentmanagementWorkspaceMemberRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withMemberId(memberId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a workspace member
   * 
   * @param request The request object
   * @return WorkspaceMember
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkspaceMember getContentmanagementWorkspaceMember(GetContentmanagementWorkspaceMemberRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkspaceMember> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkspaceMember>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a workspace member
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkspaceMember> getContentmanagementWorkspaceMember(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkspaceMember>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkspaceMember> response = (ApiResponse<WorkspaceMember>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkspaceMember> response = (ApiResponse<WorkspaceMember>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list workspace members
   * 
   * @param workspaceId Workspace ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkspaceMemberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkspaceMemberEntityListing getContentmanagementWorkspaceMembers(String workspaceId, Integer pageSize, Integer pageNumber, List<String> expand) throws IOException, ApiException {
    return  getContentmanagementWorkspaceMembers(createGetContentmanagementWorkspaceMembersRequest(workspaceId, pageSize, pageNumber, expand));
  }

  /**
   * Get a list workspace members
   * 
   * @param workspaceId Workspace ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkspaceMemberEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkspaceMemberEntityListing> getContentmanagementWorkspaceMembersWithHttpInfo(String workspaceId, Integer pageSize, Integer pageNumber, List<String> expand) throws IOException {
    return getContentmanagementWorkspaceMembers(createGetContentmanagementWorkspaceMembersRequest(workspaceId, pageSize, pageNumber, expand).withHttpInfo());
  }

  private GetContentmanagementWorkspaceMembersRequest createGetContentmanagementWorkspaceMembersRequest(String workspaceId, Integer pageSize, Integer pageNumber, List<String> expand) {
    return GetContentmanagementWorkspaceMembersRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a list workspace members
   * 
   * @param request The request object
   * @return WorkspaceMemberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkspaceMemberEntityListing getContentmanagementWorkspaceMembers(GetContentmanagementWorkspaceMembersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkspaceMemberEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkspaceMemberEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list workspace members
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkspaceMemberEntityListing> getContentmanagementWorkspaceMembers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkspaceMemberEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkspaceMemberEntityListing> response = (ApiResponse<WorkspaceMemberEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkspaceMemberEntityListing> response = (ApiResponse<WorkspaceMemberEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a workspace tag
   * 
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return TagValue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TagValue getContentmanagementWorkspaceTagvalue(String workspaceId, String tagId, List<String> expand) throws IOException, ApiException {
    return  getContentmanagementWorkspaceTagvalue(createGetContentmanagementWorkspaceTagvalueRequest(workspaceId, tagId, expand));
  }

  /**
   * Get a workspace tag
   * 
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return TagValue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TagValue> getContentmanagementWorkspaceTagvalueWithHttpInfo(String workspaceId, String tagId, List<String> expand) throws IOException {
    return getContentmanagementWorkspaceTagvalue(createGetContentmanagementWorkspaceTagvalueRequest(workspaceId, tagId, expand).withHttpInfo());
  }

  private GetContentmanagementWorkspaceTagvalueRequest createGetContentmanagementWorkspaceTagvalueRequest(String workspaceId, String tagId, List<String> expand) {
    return GetContentmanagementWorkspaceTagvalueRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withTagId(tagId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a workspace tag
   * 
   * @param request The request object
   * @return TagValue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TagValue getContentmanagementWorkspaceTagvalue(GetContentmanagementWorkspaceTagvalueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TagValue> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TagValue>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a workspace tag
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TagValue> getContentmanagementWorkspaceTagvalue(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TagValue>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TagValue> response = (ApiResponse<TagValue>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TagValue> response = (ApiResponse<TagValue>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of workspace tags
   * 
   * @param workspaceId Workspace ID (required)
   * @param value filter the list of tags returned (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Which fields, if any, to expand. (optional)
   * @return TagValueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TagValueEntityListing getContentmanagementWorkspaceTagvalues(String workspaceId, String value, Integer pageSize, Integer pageNumber, List<String> expand) throws IOException, ApiException {
    return  getContentmanagementWorkspaceTagvalues(createGetContentmanagementWorkspaceTagvaluesRequest(workspaceId, value, pageSize, pageNumber, expand));
  }

  /**
   * Get a list of workspace tags
   * 
   * @param workspaceId Workspace ID (required)
   * @param value filter the list of tags returned (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Which fields, if any, to expand. (optional)
   * @return TagValueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TagValueEntityListing> getContentmanagementWorkspaceTagvaluesWithHttpInfo(String workspaceId, String value, Integer pageSize, Integer pageNumber, List<String> expand) throws IOException {
    return getContentmanagementWorkspaceTagvalues(createGetContentmanagementWorkspaceTagvaluesRequest(workspaceId, value, pageSize, pageNumber, expand).withHttpInfo());
  }

  private GetContentmanagementWorkspaceTagvaluesRequest createGetContentmanagementWorkspaceTagvaluesRequest(String workspaceId, String value, Integer pageSize, Integer pageNumber, List<String> expand) {
    return GetContentmanagementWorkspaceTagvaluesRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withValue(value)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a list of workspace tags
   * 
   * @param request The request object
   * @return TagValueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TagValueEntityListing getContentmanagementWorkspaceTagvalues(GetContentmanagementWorkspaceTagvaluesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TagValueEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TagValueEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of workspace tags
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TagValueEntityListing> getContentmanagementWorkspaceTagvalues(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TagValueEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TagValueEntityListing> response = (ApiResponse<TagValueEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TagValueEntityListing> response = (ApiResponse<TagValueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param access Requested access level. (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkspaceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkspaceEntityListing getContentmanagementWorkspaces(Integer pageSize, Integer pageNumber, List<String> access, List<String> expand) throws IOException, ApiException {
    return  getContentmanagementWorkspaces(createGetContentmanagementWorkspacesRequest(pageSize, pageNumber, access, expand));
  }

  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param access Requested access level. (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkspaceEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkspaceEntityListing> getContentmanagementWorkspacesWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> access, List<String> expand) throws IOException {
    return getContentmanagementWorkspaces(createGetContentmanagementWorkspacesRequest(pageSize, pageNumber, access, expand).withHttpInfo());
  }

  private GetContentmanagementWorkspacesRequest createGetContentmanagementWorkspacesRequest(Integer pageSize, Integer pageNumber, List<String> access, List<String> expand) {
    return GetContentmanagementWorkspacesRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withAccess(access)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @param request The request object
   * @return WorkspaceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkspaceEntityListing getContentmanagementWorkspaces(GetContentmanagementWorkspacesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkspaceEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkspaceEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkspaceEntityListing> getContentmanagementWorkspaces(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkspaceEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkspaceEntityListing> response = (ApiResponse<WorkspaceEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkspaceEntityListing> response = (ApiResponse<WorkspaceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query audits
   * 
   * @param body Allows for a filtered query returning facet information (required)
   * @return QueryResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueryResults postContentmanagementAuditquery(ContentQueryRequest body) throws IOException, ApiException {
    return  postContentmanagementAuditquery(createPostContentmanagementAuditqueryRequest(body));
  }

  /**
   * Query audits
   * 
   * @param body Allows for a filtered query returning facet information (required)
   * @return QueryResults
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueryResults> postContentmanagementAuditqueryWithHttpInfo(ContentQueryRequest body) throws IOException {
    return postContentmanagementAuditquery(createPostContentmanagementAuditqueryRequest(body).withHttpInfo());
  }

  private PostContentmanagementAuditqueryRequest createPostContentmanagementAuditqueryRequest(ContentQueryRequest body) {
    return PostContentmanagementAuditqueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query audits
   * 
   * @param request The request object
   * @return QueryResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueryResults postContentmanagementAuditquery(PostContentmanagementAuditqueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueryResults> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueryResults>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query audits
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueryResults> postContentmanagementAuditquery(ApiRequest<ContentQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueryResults>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueryResults> response = (ApiResponse<QueryResults>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<QueryResults> response = (ApiResponse<QueryResults>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a document.
   * 
   * @param documentId Document ID (required)
   * @param body Document (required)
   * @param expand Expand some document fields (optional)
   * @param override Override any lock on the document (optional)
   * @return Document
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Document postContentmanagementDocument(String documentId, DocumentUpdate body, String expand, Boolean override) throws IOException, ApiException {
    return  postContentmanagementDocument(createPostContentmanagementDocumentRequest(documentId, body, expand, override));
  }

  /**
   * Update a document.
   * 
   * @param documentId Document ID (required)
   * @param body Document (required)
   * @param expand Expand some document fields (optional)
   * @param override Override any lock on the document (optional)
   * @return Document
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Document> postContentmanagementDocumentWithHttpInfo(String documentId, DocumentUpdate body, String expand, Boolean override) throws IOException {
    return postContentmanagementDocument(createPostContentmanagementDocumentRequest(documentId, body, expand, override).withHttpInfo());
  }

  private PostContentmanagementDocumentRequest createPostContentmanagementDocumentRequest(String documentId, DocumentUpdate body, String expand, Boolean override) {
    return PostContentmanagementDocumentRequest.builder()
            .withDocumentId(documentId)
    
            .withBody(body)
    
            .withExpand(expand)
    
            .withOverride(override)
    
            .build();
  }

  /**
   * Update a document.
   * 
   * @param request The request object
   * @return Document
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Document postContentmanagementDocument(PostContentmanagementDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Document> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Document>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Document> postContentmanagementDocument(ApiRequest<DocumentUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Document>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Document> response = (ApiResponse<Document>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Document> response = (ApiResponse<Document>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Replace the contents of a document.
   * 
   * @param documentId Document ID (required)
   * @param body Replace Request (required)
   * @param override Override any lock on the document (optional)
   * @return ReplaceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReplaceResponse postContentmanagementDocumentContent(String documentId, ReplaceRequest body, Boolean override) throws IOException, ApiException {
    return  postContentmanagementDocumentContent(createPostContentmanagementDocumentContentRequest(documentId, body, override));
  }

  /**
   * Replace the contents of a document.
   * 
   * @param documentId Document ID (required)
   * @param body Replace Request (required)
   * @param override Override any lock on the document (optional)
   * @return ReplaceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReplaceResponse> postContentmanagementDocumentContentWithHttpInfo(String documentId, ReplaceRequest body, Boolean override) throws IOException {
    return postContentmanagementDocumentContent(createPostContentmanagementDocumentContentRequest(documentId, body, override).withHttpInfo());
  }

  private PostContentmanagementDocumentContentRequest createPostContentmanagementDocumentContentRequest(String documentId, ReplaceRequest body, Boolean override) {
    return PostContentmanagementDocumentContentRequest.builder()
            .withDocumentId(documentId)
    
            .withBody(body)
    
            .withOverride(override)
    
            .build();
  }

  /**
   * Replace the contents of a document.
   * 
   * @param request The request object
   * @return ReplaceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReplaceResponse postContentmanagementDocumentContent(PostContentmanagementDocumentContentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReplaceResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReplaceResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Replace the contents of a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReplaceResponse> postContentmanagementDocumentContent(ApiRequest<ReplaceRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReplaceResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReplaceResponse> response = (ApiResponse<ReplaceResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReplaceResponse> response = (ApiResponse<ReplaceResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add a document.
   * 
   * @param body Document (required)
   * @param copySource Copy a document within a workspace or to a new workspace. Provide a document ID as the copy source. (optional)
   * @param moveSource Move a document to a new workspace. Provide a document ID as the move source. (optional)
   * @param override Override any lock on the source document (optional)
   * @return Document
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Document postContentmanagementDocuments(DocumentUpload body, String copySource, String moveSource, Boolean override) throws IOException, ApiException {
    return  postContentmanagementDocuments(createPostContentmanagementDocumentsRequest(body, copySource, moveSource, override));
  }

  /**
   * Add a document.
   * 
   * @param body Document (required)
   * @param copySource Copy a document within a workspace or to a new workspace. Provide a document ID as the copy source. (optional)
   * @param moveSource Move a document to a new workspace. Provide a document ID as the move source. (optional)
   * @param override Override any lock on the source document (optional)
   * @return Document
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Document> postContentmanagementDocumentsWithHttpInfo(DocumentUpload body, String copySource, String moveSource, Boolean override) throws IOException {
    return postContentmanagementDocuments(createPostContentmanagementDocumentsRequest(body, copySource, moveSource, override).withHttpInfo());
  }

  private PostContentmanagementDocumentsRequest createPostContentmanagementDocumentsRequest(DocumentUpload body, String copySource, String moveSource, Boolean override) {
    return PostContentmanagementDocumentsRequest.builder()
            .withBody(body)
    
            .withCopySource(copySource)
    
            .withMoveSource(moveSource)
    
            .withOverride(override)
    
            .build();
  }

  /**
   * Add a document.
   * 
   * @param request The request object
   * @return Document
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Document postContentmanagementDocuments(PostContentmanagementDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Document> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Document>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Document> postContentmanagementDocuments(ApiRequest<DocumentUpload> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Document>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Document> response = (ApiResponse<Document>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Document> response = (ApiResponse<Document>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query content
   * 
   * @param body Allows for a filtered query returning facet information (required)
   * @param expand Expand some document fields (optional)
   * @return QueryResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueryResults postContentmanagementQuery(QueryRequest body, String expand) throws IOException, ApiException {
    return  postContentmanagementQuery(createPostContentmanagementQueryRequest(body, expand));
  }

  /**
   * Query content
   * 
   * @param body Allows for a filtered query returning facet information (required)
   * @param expand Expand some document fields (optional)
   * @return QueryResults
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueryResults> postContentmanagementQueryWithHttpInfo(QueryRequest body, String expand) throws IOException {
    return postContentmanagementQuery(createPostContentmanagementQueryRequest(body, expand).withHttpInfo());
  }

  private PostContentmanagementQueryRequest createPostContentmanagementQueryRequest(QueryRequest body, String expand) {
    return PostContentmanagementQueryRequest.builder()
            .withBody(body)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Query content
   * 
   * @param request The request object
   * @return QueryResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueryResults postContentmanagementQuery(PostContentmanagementQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueryResults> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueryResults>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query content
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueryResults> postContentmanagementQuery(ApiRequest<QueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueryResults>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueryResults> response = (ApiResponse<QueryResults>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<QueryResults> response = (ApiResponse<QueryResults>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @param body CreateShareRequest - entity id and type and a single member or list of members are required (required)
   * @return CreateShareResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateShareResponse postContentmanagementShares(CreateShareRequest body) throws IOException, ApiException {
    return  postContentmanagementShares(createPostContentmanagementSharesRequest(body));
  }

  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @param body CreateShareRequest - entity id and type and a single member or list of members are required (required)
   * @return CreateShareResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateShareResponse> postContentmanagementSharesWithHttpInfo(CreateShareRequest body) throws IOException {
    return postContentmanagementShares(createPostContentmanagementSharesRequest(body).withHttpInfo());
  }

  private PostContentmanagementSharesRequest createPostContentmanagementSharesRequest(CreateShareRequest body) {
    return PostContentmanagementSharesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @param request The request object
   * @return CreateShareResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateShareResponse postContentmanagementShares(PostContentmanagementSharesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CreateShareResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CreateShareResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateShareResponse> postContentmanagementShares(ApiRequest<CreateShareRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CreateShareResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CreateShareResponse> response = (ApiResponse<CreateShareResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CreateShareResponse> response = (ApiResponse<CreateShareResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a workspace tag
   * 
   * @param workspaceId Workspace ID (required)
   * @param body tag (required)
   * @return TagValue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TagValue postContentmanagementWorkspaceTagvalues(String workspaceId, TagValue body) throws IOException, ApiException {
    return  postContentmanagementWorkspaceTagvalues(createPostContentmanagementWorkspaceTagvaluesRequest(workspaceId, body));
  }

  /**
   * Create a workspace tag
   * 
   * @param workspaceId Workspace ID (required)
   * @param body tag (required)
   * @return TagValue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TagValue> postContentmanagementWorkspaceTagvaluesWithHttpInfo(String workspaceId, TagValue body) throws IOException {
    return postContentmanagementWorkspaceTagvalues(createPostContentmanagementWorkspaceTagvaluesRequest(workspaceId, body).withHttpInfo());
  }

  private PostContentmanagementWorkspaceTagvaluesRequest createPostContentmanagementWorkspaceTagvaluesRequest(String workspaceId, TagValue body) {
    return PostContentmanagementWorkspaceTagvaluesRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a workspace tag
   * 
   * @param request The request object
   * @return TagValue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TagValue postContentmanagementWorkspaceTagvalues(PostContentmanagementWorkspaceTagvaluesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TagValue> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TagValue>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a workspace tag
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TagValue> postContentmanagementWorkspaceTagvalues(ApiRequest<TagValue> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TagValue>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TagValue> response = (ApiResponse<TagValue>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TagValue> response = (ApiResponse<TagValue>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param body query (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return TagValueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TagValueEntityListing postContentmanagementWorkspaceTagvaluesQuery(String workspaceId, TagQueryRequest body, List<String> expand) throws IOException, ApiException {
    return  postContentmanagementWorkspaceTagvaluesQuery(createPostContentmanagementWorkspaceTagvaluesQueryRequest(workspaceId, body, expand));
  }

  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param body query (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return TagValueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TagValueEntityListing> postContentmanagementWorkspaceTagvaluesQueryWithHttpInfo(String workspaceId, TagQueryRequest body, List<String> expand) throws IOException {
    return postContentmanagementWorkspaceTagvaluesQuery(createPostContentmanagementWorkspaceTagvaluesQueryRequest(workspaceId, body, expand).withHttpInfo());
  }

  private PostContentmanagementWorkspaceTagvaluesQueryRequest createPostContentmanagementWorkspaceTagvaluesQueryRequest(String workspaceId, TagQueryRequest body, List<String> expand) {
    return PostContentmanagementWorkspaceTagvaluesQueryRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withBody(body)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @param request The request object
   * @return TagValueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TagValueEntityListing postContentmanagementWorkspaceTagvaluesQuery(PostContentmanagementWorkspaceTagvaluesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TagValueEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TagValueEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TagValueEntityListing> postContentmanagementWorkspaceTagvaluesQuery(ApiRequest<TagQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TagValueEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TagValueEntityListing> response = (ApiResponse<TagValueEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TagValueEntityListing> response = (ApiResponse<TagValueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a group workspace
   * 
   * @param body Workspace (required)
   * @return Workspace
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workspace postContentmanagementWorkspaces(WorkspaceCreate body) throws IOException, ApiException {
    return  postContentmanagementWorkspaces(createPostContentmanagementWorkspacesRequest(body));
  }

  /**
   * Create a group workspace
   * 
   * @param body Workspace (required)
   * @return Workspace
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workspace> postContentmanagementWorkspacesWithHttpInfo(WorkspaceCreate body) throws IOException {
    return postContentmanagementWorkspaces(createPostContentmanagementWorkspacesRequest(body).withHttpInfo());
  }

  private PostContentmanagementWorkspacesRequest createPostContentmanagementWorkspacesRequest(WorkspaceCreate body) {
    return PostContentmanagementWorkspacesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a group workspace
   * 
   * @param request The request object
   * @return Workspace
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workspace postContentmanagementWorkspaces(PostContentmanagementWorkspacesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Workspace> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Workspace>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a group workspace
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workspace> postContentmanagementWorkspaces(ApiRequest<WorkspaceCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Workspace>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Workspace> response = (ApiResponse<Workspace>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Workspace> response = (ApiResponse<Workspace>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param body Workspace (required)
   * @return Workspace
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workspace putContentmanagementWorkspace(String workspaceId, Workspace body) throws IOException, ApiException {
    return  putContentmanagementWorkspace(createPutContentmanagementWorkspaceRequest(workspaceId, body));
  }

  /**
   * Update a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param body Workspace (required)
   * @return Workspace
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workspace> putContentmanagementWorkspaceWithHttpInfo(String workspaceId, Workspace body) throws IOException {
    return putContentmanagementWorkspace(createPutContentmanagementWorkspaceRequest(workspaceId, body).withHttpInfo());
  }

  private PutContentmanagementWorkspaceRequest createPutContentmanagementWorkspaceRequest(String workspaceId, Workspace body) {
    return PutContentmanagementWorkspaceRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a workspace
   * 
   * @param request The request object
   * @return Workspace
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workspace putContentmanagementWorkspace(PutContentmanagementWorkspaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Workspace> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Workspace>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a workspace
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workspace> putContentmanagementWorkspace(ApiRequest<Workspace> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Workspace>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Workspace> response = (ApiResponse<Workspace>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Workspace> response = (ApiResponse<Workspace>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add a member to a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @param body Workspace Member (required)
   * @return WorkspaceMember
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkspaceMember putContentmanagementWorkspaceMember(String workspaceId, String memberId, WorkspaceMember body) throws IOException, ApiException {
    return  putContentmanagementWorkspaceMember(createPutContentmanagementWorkspaceMemberRequest(workspaceId, memberId, body));
  }

  /**
   * Add a member to a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @param body Workspace Member (required)
   * @return WorkspaceMember
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkspaceMember> putContentmanagementWorkspaceMemberWithHttpInfo(String workspaceId, String memberId, WorkspaceMember body) throws IOException {
    return putContentmanagementWorkspaceMember(createPutContentmanagementWorkspaceMemberRequest(workspaceId, memberId, body).withHttpInfo());
  }

  private PutContentmanagementWorkspaceMemberRequest createPutContentmanagementWorkspaceMemberRequest(String workspaceId, String memberId, WorkspaceMember body) {
    return PutContentmanagementWorkspaceMemberRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withMemberId(memberId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add a member to a workspace
   * 
   * @param request The request object
   * @return WorkspaceMember
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkspaceMember putContentmanagementWorkspaceMember(PutContentmanagementWorkspaceMemberRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkspaceMember> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkspaceMember>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a member to a workspace
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkspaceMember> putContentmanagementWorkspaceMember(ApiRequest<WorkspaceMember> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkspaceMember>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkspaceMember> response = (ApiResponse<WorkspaceMember>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkspaceMember> response = (ApiResponse<WorkspaceMember>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @param body Workspace (required)
   * @return TagValue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TagValue putContentmanagementWorkspaceTagvalue(String workspaceId, String tagId, TagValue body) throws IOException, ApiException {
    return  putContentmanagementWorkspaceTagvalue(createPutContentmanagementWorkspaceTagvalueRequest(workspaceId, tagId, body));
  }

  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @param body Workspace (required)
   * @return TagValue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TagValue> putContentmanagementWorkspaceTagvalueWithHttpInfo(String workspaceId, String tagId, TagValue body) throws IOException {
    return putContentmanagementWorkspaceTagvalue(createPutContentmanagementWorkspaceTagvalueRequest(workspaceId, tagId, body).withHttpInfo());
  }

  private PutContentmanagementWorkspaceTagvalueRequest createPutContentmanagementWorkspaceTagvalueRequest(String workspaceId, String tagId, TagValue body) {
    return PutContentmanagementWorkspaceTagvalueRequest.builder()
            .withWorkspaceId(workspaceId)
    
            .withTagId(tagId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @param request The request object
   * @return TagValue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TagValue putContentmanagementWorkspaceTagvalue(PutContentmanagementWorkspaceTagvalueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TagValue> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TagValue>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TagValue> putContentmanagementWorkspaceTagvalue(ApiRequest<TagValue> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TagValue>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TagValue> response = (ApiResponse<TagValue>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TagValue> response = (ApiResponse<TagValue>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
