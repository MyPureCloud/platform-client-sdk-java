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
   * @throws ApiException if fails to make API call
   */
  public void deleteContentmanagementDocument(String documentId, Boolean override) throws IOException, ApiException {
    deleteContentmanagementDocumentWithHttpInfo(documentId, override);
  }

  /**
   * Delete a document.
   * 
   * @param documentId Document ID (required)
   * @param override Override any lock on the document (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteContentmanagementDocumentWithHttpInfo(String documentId, Boolean override) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'documentId' when calling deleteContentmanagementDocument");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "documentId" + "\\}", pcapiClient.escapeString(documentId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "override", override));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteContentmanagementDocument(DeleteContentmanagementDocumentRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteContentmanagementDocument(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @param shareId Share ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteContentmanagementShare(String shareId) throws IOException, ApiException {
    deleteContentmanagementShareWithHttpInfo(shareId);
  }

  /**
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @param shareId Share ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteContentmanagementShareWithHttpInfo(String shareId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'shareId' is set
    if (shareId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'shareId' when calling deleteContentmanagementShare");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/shares/{shareId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shareId" + "\\}", pcapiClient.escapeString(shareId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteContentmanagementShare(DeleteContentmanagementShareRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Deletes an existing share.
   * This revokes sharing rights specified in the share record
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteContentmanagementShare(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Cancel the command for this status
   * 
   * @param statusId Status ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteContentmanagementStatusStatusId(String statusId) throws IOException, ApiException {
    deleteContentmanagementStatusStatusIdWithHttpInfo(statusId);
  }

  /**
   * Cancel the command for this status
   * 
   * @param statusId Status ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteContentmanagementStatusStatusIdWithHttpInfo(String statusId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'statusId' is set
    if (statusId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'statusId' when calling deleteContentmanagementStatusStatusId");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/status/{statusId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusId" + "\\}", pcapiClient.escapeString(statusId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Cancel the command for this status
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteContentmanagementStatusStatusId(DeleteContentmanagementStatusStatusIdRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Cancel the command for this status
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteContentmanagementStatusStatusId(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param moveChildrenToWorkspaceId New location for objects in deleted workspace. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteContentmanagementWorkspace(String workspaceId, String moveChildrenToWorkspaceId) throws IOException, ApiException {
    deleteContentmanagementWorkspaceWithHttpInfo(workspaceId, moveChildrenToWorkspaceId);
  }

  /**
   * Delete a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param moveChildrenToWorkspaceId New location for objects in deleted workspace. (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteContentmanagementWorkspaceWithHttpInfo(String workspaceId, String moveChildrenToWorkspaceId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling deleteContentmanagementWorkspace");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "moveChildrenToWorkspaceId", moveChildrenToWorkspaceId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteContentmanagementWorkspace(DeleteContentmanagementWorkspaceRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteContentmanagementWorkspace(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete a member from a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteContentmanagementWorkspaceMember(String workspaceId, String memberId) throws IOException, ApiException {
    deleteContentmanagementWorkspaceMemberWithHttpInfo(workspaceId, memberId);
  }

  /**
   * Delete a member from a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteContentmanagementWorkspaceMemberWithHttpInfo(String workspaceId, String memberId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling deleteContentmanagementWorkspaceMember");
    }
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'memberId' when calling deleteContentmanagementWorkspaceMember");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "memberId" + "\\}", pcapiClient.escapeString(memberId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete a member from a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteContentmanagementWorkspaceMember(DeleteContentmanagementWorkspaceMemberRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a member from a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteContentmanagementWorkspaceMember(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteContentmanagementWorkspaceTagvalue(String workspaceId, String tagId) throws IOException, ApiException {
    deleteContentmanagementWorkspaceTagvalueWithHttpInfo(workspaceId, tagId);
  }

  /**
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteContentmanagementWorkspaceTagvalueWithHttpInfo(String workspaceId, String tagId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling deleteContentmanagementWorkspaceTagvalue");
    }
    
    // verify the required parameter 'tagId' is set
    if (tagId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'tagId' when calling deleteContentmanagementWorkspaceTagvalue");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "tagId" + "\\}", pcapiClient.escapeString(tagId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteContentmanagementWorkspaceTagvalue(DeleteContentmanagementWorkspaceTagvalueRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete workspace tag
   * Delete a tag from a workspace. Will remove this tag from all documents.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteContentmanagementWorkspaceTagvalue(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Get a document.
   * 
   * @param documentId Document ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Document
   * @throws ApiException if fails to make API call
   */
  public Document getContentmanagementDocument(String documentId, List<String> expand) throws IOException, ApiException {
    return getContentmanagementDocumentWithHttpInfo(documentId, expand).getBody();
  }

  /**
   * Get a document.
   * 
   * @param documentId Document ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Document
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Document> getContentmanagementDocumentWithHttpInfo(String documentId, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'documentId' when calling getContentmanagementDocument");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "documentId" + "\\}", pcapiClient.escapeString(documentId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Document>() {});
  }

  /**
   * Get a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Document getContentmanagementDocument(GetContentmanagementDocumentRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Document>() {});
  }

  /**
   * Get a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Document> getContentmanagementDocument(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Document>invokeAPIVerbose(request, new TypeReference<Document>() {});
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
   * @throws ApiException if fails to make API call
   */
  public DocumentAuditEntityListing getContentmanagementDocumentAudits(String documentId, Integer pageSize, Integer pageNumber, String transactionFilter, String level, String sortBy, String sortOrder) throws IOException, ApiException {
    return getContentmanagementDocumentAuditsWithHttpInfo(documentId, pageSize, pageNumber, transactionFilter, level, sortBy, sortOrder).getBody();
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
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentAuditEntityListing> getContentmanagementDocumentAuditsWithHttpInfo(String documentId, Integer pageSize, Integer pageNumber, String transactionFilter, String level, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'documentId' when calling getContentmanagementDocumentAudits");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/documents/{documentId}/audits".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "documentId" + "\\}", pcapiClient.escapeString(documentId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "transactionFilter", transactionFilter));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "level", level));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DocumentAuditEntityListing>() {});
  }

  /**
   * Get a list of audits for a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DocumentAuditEntityListing getContentmanagementDocumentAudits(GetContentmanagementDocumentAuditsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DocumentAuditEntityListing>() {});
  }

  /**
   * Get a list of audits for a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentAuditEntityListing> getContentmanagementDocumentAudits(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DocumentAuditEntityListing>invokeAPIVerbose(request, new TypeReference<DocumentAuditEntityListing>() {});
  }

  /**
   * Download a document.
   * 
   * @param documentId Document ID (required)
   * @param disposition Request how the content will be downloaded: a file attachment or inline. Default is attachment. (optional)
   * @param contentType The requested format for the specified document. If supported, the document will be returned in that format. Example contentType&#x3D;audio/wav (optional)
   * @return DownloadResponse
   * @throws ApiException if fails to make API call
   */
  public DownloadResponse getContentmanagementDocumentContent(String documentId, String disposition, String contentType) throws IOException, ApiException {
    return getContentmanagementDocumentContentWithHttpInfo(documentId, disposition, contentType).getBody();
  }

  /**
   * Download a document.
   * 
   * @param documentId Document ID (required)
   * @param disposition Request how the content will be downloaded: a file attachment or inline. Default is attachment. (optional)
   * @param contentType The requested format for the specified document. If supported, the document will be returned in that format. Example contentType&#x3D;audio/wav (optional)
   * @return DownloadResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DownloadResponse> getContentmanagementDocumentContentWithHttpInfo(String documentId, String disposition, String contentType) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'documentId' when calling getContentmanagementDocumentContent");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/documents/{documentId}/content".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "documentId" + "\\}", pcapiClient.escapeString(documentId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "disposition", disposition));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "contentType", contentType));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DownloadResponse>() {});
  }

  /**
   * Download a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DownloadResponse getContentmanagementDocumentContent(GetContentmanagementDocumentContentRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DownloadResponse>() {});
  }

  /**
   * Download a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DownloadResponse> getContentmanagementDocumentContent(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DownloadResponse>invokeAPIVerbose(request, new TypeReference<DownloadResponse>() {});
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
   * @throws ApiException if fails to make API call
   */
  public DocumentEntityListing getContentmanagementDocuments(String workspaceId, String name, List<String> expand, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) throws IOException, ApiException {
    return getContentmanagementDocumentsWithHttpInfo(workspaceId, name, expand, pageSize, pageNumber, sortBy, sortOrder).getBody();
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
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentEntityListing> getContentmanagementDocumentsWithHttpInfo(String workspaceId, String name, List<String> expand, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling getContentmanagementDocuments");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/documents".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "workspaceId", workspaceId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DocumentEntityListing>() {});
  }

  /**
   * Get a list of documents.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DocumentEntityListing getContentmanagementDocuments(GetContentmanagementDocumentsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DocumentEntityListing>() {});
  }

  /**
   * Get a list of documents.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentEntityListing> getContentmanagementDocuments(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DocumentEntityListing>invokeAPIVerbose(request, new TypeReference<DocumentEntityListing>() {});
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
   * @throws ApiException if fails to make API call
   */
  public QueryResults getContentmanagementQuery(String queryPhrase, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, List<String> expand) throws IOException, ApiException {
    return getContentmanagementQueryWithHttpInfo(queryPhrase, pageSize, pageNumber, sortBy, sortOrder, expand).getBody();
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
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueryResults> getContentmanagementQueryWithHttpInfo(String queryPhrase, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'queryPhrase' is set
    if (queryPhrase == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queryPhrase' when calling getContentmanagementQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/query".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "queryPhrase", queryPhrase));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<QueryResults>() {});
  }

  /**
   * Query content
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public QueryResults getContentmanagementQuery(GetContentmanagementQueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<QueryResults>() {});
  }

  /**
   * Query content
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueryResults> getContentmanagementQuery(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<QueryResults>invokeAPIVerbose(request, new TypeReference<QueryResults>() {});
  }

  /**
   * Get a Security Profile
   * 
   * @param securityProfileId Security Profile Id (required)
   * @return SecurityProfile
   * @throws ApiException if fails to make API call
   */
  public SecurityProfile getContentmanagementSecurityprofile(String securityProfileId) throws IOException, ApiException {
    return getContentmanagementSecurityprofileWithHttpInfo(securityProfileId).getBody();
  }

  /**
   * Get a Security Profile
   * 
   * @param securityProfileId Security Profile Id (required)
   * @return SecurityProfile
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SecurityProfile> getContentmanagementSecurityprofileWithHttpInfo(String securityProfileId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'securityProfileId' is set
    if (securityProfileId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'securityProfileId' when calling getContentmanagementSecurityprofile");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/securityprofiles/{securityProfileId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "securityProfileId" + "\\}", pcapiClient.escapeString(securityProfileId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SecurityProfile>() {});
  }

  /**
   * Get a Security Profile
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SecurityProfile getContentmanagementSecurityprofile(GetContentmanagementSecurityprofileRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SecurityProfile>() {});
  }

  /**
   * Get a Security Profile
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SecurityProfile> getContentmanagementSecurityprofile(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<SecurityProfile>invokeAPIVerbose(request, new TypeReference<SecurityProfile>() {});
  }

  /**
   * Get a List of Security Profiles
   * 
   * @return SecurityProfileEntityListing
   * @throws ApiException if fails to make API call
   */
  public SecurityProfileEntityListing getContentmanagementSecurityprofiles() throws IOException, ApiException {
    return getContentmanagementSecurityprofilesWithHttpInfo().getBody();
  }

  /**
   * Get a List of Security Profiles
   * 
   * @return SecurityProfileEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SecurityProfileEntityListing> getContentmanagementSecurityprofilesWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/securityprofiles".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SecurityProfileEntityListing>() {});
  }

  /**
   * Get a List of Security Profiles
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SecurityProfileEntityListing getContentmanagementSecurityprofiles(GetContentmanagementSecurityprofilesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SecurityProfileEntityListing>() {});
  }

  /**
   * Get a List of Security Profiles
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SecurityProfileEntityListing> getContentmanagementSecurityprofiles(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<SecurityProfileEntityListing>invokeAPIVerbose(request, new TypeReference<SecurityProfileEntityListing>() {});
  }

  /**
   * Retrieve details about an existing share.
   * 
   * @param shareId Share ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Share
   * @throws ApiException if fails to make API call
   */
  public Share getContentmanagementShare(String shareId, List<String> expand) throws IOException, ApiException {
    return getContentmanagementShareWithHttpInfo(shareId, expand).getBody();
  }

  /**
   * Retrieve details about an existing share.
   * 
   * @param shareId Share ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Share
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Share> getContentmanagementShareWithHttpInfo(String shareId, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'shareId' is set
    if (shareId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'shareId' when calling getContentmanagementShare");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/shares/{shareId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "shareId" + "\\}", pcapiClient.escapeString(shareId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Share>() {});
  }

  /**
   * Retrieve details about an existing share.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Share getContentmanagementShare(GetContentmanagementShareRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Share>() {});
  }

  /**
   * Retrieve details about an existing share.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Share> getContentmanagementShare(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Share>invokeAPIVerbose(request, new TypeReference<Share>() {});
  }

  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @param sharedId Shared ID (required)
   * @param redirect Turn on or off redirect (optional, default to true)
   * @param disposition Request how the share content will be downloaded: attached as a file or inline. Default is attachment. (optional, default to attachment)
   * @param contentType The requested format for the specified document. If supported, the document will be returned in that format. Example contentType&#x3D;audio/wav (optional)
   * @param expand Expand some document fields (optional)
   * @return SharedResponse
   * @throws ApiException if fails to make API call
   */
  public SharedResponse getContentmanagementSharedSharedId(String sharedId, Boolean redirect, String disposition, String contentType, String expand) throws IOException, ApiException {
    return getContentmanagementSharedSharedIdWithHttpInfo(sharedId, redirect, disposition, contentType, expand).getBody();
  }

  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @param sharedId Shared ID (required)
   * @param redirect Turn on or off redirect (optional, default to true)
   * @param disposition Request how the share content will be downloaded: attached as a file or inline. Default is attachment. (optional, default to attachment)
   * @param contentType The requested format for the specified document. If supported, the document will be returned in that format. Example contentType&#x3D;audio/wav (optional)
   * @param expand Expand some document fields (optional)
   * @return SharedResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SharedResponse> getContentmanagementSharedSharedIdWithHttpInfo(String sharedId, Boolean redirect, String disposition, String contentType, String expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'sharedId' is set
    if (sharedId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sharedId' when calling getContentmanagementSharedSharedId");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/shared/{sharedId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "sharedId" + "\\}", pcapiClient.escapeString(sharedId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "redirect", redirect));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "disposition", disposition));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "contentType", contentType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SharedResponse>() {});
  }

  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SharedResponse getContentmanagementSharedSharedId(GetContentmanagementSharedSharedIdRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SharedResponse>() {});
  }

  /**
   * Get shared documents. Securely download a shared document.
   * This method requires the download sharing URI obtained in the get document response (downloadSharingUri). Documents may be shared between users in the same workspace. Documents may also be shared between any user by creating a content management share.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SharedResponse> getContentmanagementSharedSharedId(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<SharedResponse>invokeAPIVerbose(request, new TypeReference<SharedResponse>() {});
  }

  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @param entityId Filters the shares returned to only the entity specified by the value of this parameter. (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return ShareEntityListing
   * @throws ApiException if fails to make API call
   */
  public ShareEntityListing getContentmanagementShares(String entityId, List<String> expand, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return getContentmanagementSharesWithHttpInfo(entityId, expand, pageSize, pageNumber).getBody();
  }

  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @param entityId Filters the shares returned to only the entity specified by the value of this parameter. (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return ShareEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ShareEntityListing> getContentmanagementSharesWithHttpInfo(String entityId, List<String> expand, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/shares".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "entityId", entityId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ShareEntityListing>() {});
  }

  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ShareEntityListing getContentmanagementShares(GetContentmanagementSharesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ShareEntityListing>() {});
  }

  /**
   * Gets a list of shares.  You must specify at least one filter (e.g. entityId).
   * Failing to specify a filter will return 400.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ShareEntityListing> getContentmanagementShares(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ShareEntityListing>invokeAPIVerbose(request, new TypeReference<ShareEntityListing>() {});
  }

  /**
   * Get a list of statuses for pending operations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return CommandStatusEntityListing
   * @throws ApiException if fails to make API call
   */
  public CommandStatusEntityListing getContentmanagementStatus(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return getContentmanagementStatusWithHttpInfo(pageSize, pageNumber).getBody();
  }

  /**
   * Get a list of statuses for pending operations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return CommandStatusEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CommandStatusEntityListing> getContentmanagementStatusWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/status".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CommandStatusEntityListing>() {});
  }

  /**
   * Get a list of statuses for pending operations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CommandStatusEntityListing getContentmanagementStatus(GetContentmanagementStatusRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CommandStatusEntityListing>() {});
  }

  /**
   * Get a list of statuses for pending operations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CommandStatusEntityListing> getContentmanagementStatus(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CommandStatusEntityListing>invokeAPIVerbose(request, new TypeReference<CommandStatusEntityListing>() {});
  }

  /**
   * Get a status.
   * 
   * @param statusId Status ID (required)
   * @return CommandStatus
   * @throws ApiException if fails to make API call
   */
  public CommandStatus getContentmanagementStatusStatusId(String statusId) throws IOException, ApiException {
    return getContentmanagementStatusStatusIdWithHttpInfo(statusId).getBody();
  }

  /**
   * Get a status.
   * 
   * @param statusId Status ID (required)
   * @return CommandStatus
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CommandStatus> getContentmanagementStatusStatusIdWithHttpInfo(String statusId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'statusId' is set
    if (statusId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'statusId' when calling getContentmanagementStatusStatusId");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/status/{statusId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "statusId" + "\\}", pcapiClient.escapeString(statusId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CommandStatus>() {});
  }

  /**
   * Get a status.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CommandStatus getContentmanagementStatusStatusId(GetContentmanagementStatusStatusIdRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CommandStatus>() {});
  }

  /**
   * Get a status.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CommandStatus> getContentmanagementStatusStatusId(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CommandStatus>invokeAPIVerbose(request, new TypeReference<CommandStatus>() {});
  }

  /**
   * Get usage details.
   * 
   * @return Usage
   * @throws ApiException if fails to make API call
   */
  public Usage getContentmanagementUsage() throws IOException, ApiException {
    return getContentmanagementUsageWithHttpInfo().getBody();
  }

  /**
   * Get usage details.
   * 
   * @return Usage
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Usage> getContentmanagementUsageWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/usage".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Usage>() {});
  }

  /**
   * Get usage details.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Usage getContentmanagementUsage(GetContentmanagementUsageRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Usage>() {});
  }

  /**
   * Get usage details.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Usage> getContentmanagementUsage(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Usage>invokeAPIVerbose(request, new TypeReference<Usage>() {});
  }

  /**
   * Get a workspace.
   * 
   * @param workspaceId Workspace ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public Workspace getContentmanagementWorkspace(String workspaceId, List<String> expand) throws IOException, ApiException {
    return getContentmanagementWorkspaceWithHttpInfo(workspaceId, expand).getBody();
  }

  /**
   * Get a workspace.
   * 
   * @param workspaceId Workspace ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workspace> getContentmanagementWorkspaceWithHttpInfo(String workspaceId, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling getContentmanagementWorkspace");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Workspace>() {});
  }

  /**
   * Get a workspace.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Workspace getContentmanagementWorkspace(GetContentmanagementWorkspaceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Workspace>() {});
  }

  /**
   * Get a workspace.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workspace> getContentmanagementWorkspace(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Workspace>invokeAPIVerbose(request, new TypeReference<Workspace>() {});
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
   * @throws ApiException if fails to make API call
   */
  public DocumentEntityListing getContentmanagementWorkspaceDocuments(String workspaceId, List<String> expand, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) throws IOException, ApiException {
    return getContentmanagementWorkspaceDocumentsWithHttpInfo(workspaceId, expand, pageSize, pageNumber, sortBy, sortOrder).getBody();
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
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentEntityListing> getContentmanagementWorkspaceDocumentsWithHttpInfo(String workspaceId, List<String> expand, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling getContentmanagementWorkspaceDocuments");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}/documents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DocumentEntityListing>() {});
  }

  /**
   * Get a list of documents.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DocumentEntityListing getContentmanagementWorkspaceDocuments(GetContentmanagementWorkspaceDocumentsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DocumentEntityListing>() {});
  }

  /**
   * Get a list of documents.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentEntityListing> getContentmanagementWorkspaceDocuments(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DocumentEntityListing>invokeAPIVerbose(request, new TypeReference<DocumentEntityListing>() {});
  }

  /**
   * Get a workspace member
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkspaceMember
   * @throws ApiException if fails to make API call
   */
  public WorkspaceMember getContentmanagementWorkspaceMember(String workspaceId, String memberId, List<String> expand) throws IOException, ApiException {
    return getContentmanagementWorkspaceMemberWithHttpInfo(workspaceId, memberId, expand).getBody();
  }

  /**
   * Get a workspace member
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkspaceMember
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkspaceMember> getContentmanagementWorkspaceMemberWithHttpInfo(String workspaceId, String memberId, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling getContentmanagementWorkspaceMember");
    }
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'memberId' when calling getContentmanagementWorkspaceMember");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "memberId" + "\\}", pcapiClient.escapeString(memberId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WorkspaceMember>() {});
  }

  /**
   * Get a workspace member
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WorkspaceMember getContentmanagementWorkspaceMember(GetContentmanagementWorkspaceMemberRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WorkspaceMember>() {});
  }

  /**
   * Get a workspace member
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkspaceMember> getContentmanagementWorkspaceMember(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<WorkspaceMember>invokeAPIVerbose(request, new TypeReference<WorkspaceMember>() {});
  }

  /**
   * Get a list workspace members
   * 
   * @param workspaceId Workspace ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkspaceMemberEntityListing
   * @throws ApiException if fails to make API call
   */
  public WorkspaceMemberEntityListing getContentmanagementWorkspaceMembers(String workspaceId, Integer pageSize, Integer pageNumber, List<String> expand) throws IOException, ApiException {
    return getContentmanagementWorkspaceMembersWithHttpInfo(workspaceId, pageSize, pageNumber, expand).getBody();
  }

  /**
   * Get a list workspace members
   * 
   * @param workspaceId Workspace ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkspaceMemberEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkspaceMemberEntityListing> getContentmanagementWorkspaceMembersWithHttpInfo(String workspaceId, Integer pageSize, Integer pageNumber, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling getContentmanagementWorkspaceMembers");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}/members".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WorkspaceMemberEntityListing>() {});
  }

  /**
   * Get a list workspace members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WorkspaceMemberEntityListing getContentmanagementWorkspaceMembers(GetContentmanagementWorkspaceMembersRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WorkspaceMemberEntityListing>() {});
  }

  /**
   * Get a list workspace members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkspaceMemberEntityListing> getContentmanagementWorkspaceMembers(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<WorkspaceMemberEntityListing>invokeAPIVerbose(request, new TypeReference<WorkspaceMemberEntityListing>() {});
  }

  /**
   * Get a workspace tag
   * 
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return TagValue
   * @throws ApiException if fails to make API call
   */
  public TagValue getContentmanagementWorkspaceTagvalue(String workspaceId, String tagId, List<String> expand) throws IOException, ApiException {
    return getContentmanagementWorkspaceTagvalueWithHttpInfo(workspaceId, tagId, expand).getBody();
  }

  /**
   * Get a workspace tag
   * 
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return TagValue
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagValue> getContentmanagementWorkspaceTagvalueWithHttpInfo(String workspaceId, String tagId, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling getContentmanagementWorkspaceTagvalue");
    }
    
    // verify the required parameter 'tagId' is set
    if (tagId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'tagId' when calling getContentmanagementWorkspaceTagvalue");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "tagId" + "\\}", pcapiClient.escapeString(tagId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TagValue>() {});
  }

  /**
   * Get a workspace tag
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TagValue getContentmanagementWorkspaceTagvalue(GetContentmanagementWorkspaceTagvalueRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TagValue>() {});
  }

  /**
   * Get a workspace tag
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagValue> getContentmanagementWorkspaceTagvalue(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<TagValue>invokeAPIVerbose(request, new TypeReference<TagValue>() {});
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
   * @throws ApiException if fails to make API call
   */
  public TagValueEntityListing getContentmanagementWorkspaceTagvalues(String workspaceId, String value, Integer pageSize, Integer pageNumber, List<String> expand) throws IOException, ApiException {
    return getContentmanagementWorkspaceTagvaluesWithHttpInfo(workspaceId, value, pageSize, pageNumber, expand).getBody();
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
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagValueEntityListing> getContentmanagementWorkspaceTagvaluesWithHttpInfo(String workspaceId, String value, Integer pageSize, Integer pageNumber, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling getContentmanagementWorkspaceTagvalues");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "value", value));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TagValueEntityListing>() {});
  }

  /**
   * Get a list of workspace tags
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TagValueEntityListing getContentmanagementWorkspaceTagvalues(GetContentmanagementWorkspaceTagvaluesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TagValueEntityListing>() {});
  }

  /**
   * Get a list of workspace tags
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagValueEntityListing> getContentmanagementWorkspaceTagvalues(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<TagValueEntityListing>invokeAPIVerbose(request, new TypeReference<TagValueEntityListing>() {});
  }

  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param access Requested access level. (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkspaceEntityListing
   * @throws ApiException if fails to make API call
   */
  public WorkspaceEntityListing getContentmanagementWorkspaces(Integer pageSize, Integer pageNumber, List<String> access, List<String> expand) throws IOException, ApiException {
    return getContentmanagementWorkspacesWithHttpInfo(pageSize, pageNumber, access, expand).getBody();
  }

  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param access Requested access level. (optional)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkspaceEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkspaceEntityListing> getContentmanagementWorkspacesWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> access, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "access", access));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WorkspaceEntityListing>() {});
  }

  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WorkspaceEntityListing getContentmanagementWorkspaces(GetContentmanagementWorkspacesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WorkspaceEntityListing>() {});
  }

  /**
   * Get a list of workspaces.
   * Specifying &#39;content&#39; access will return all workspaces the user has document access to, while &#39;admin&#39; access will return all group workspaces the user has administrative rights to.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkspaceEntityListing> getContentmanagementWorkspaces(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<WorkspaceEntityListing>invokeAPIVerbose(request, new TypeReference<WorkspaceEntityListing>() {});
  }

  /**
   * Query audits
   * 
   * @param body Allows for a filtered query returning facet information (required)
   * @return QueryResults
   * @throws ApiException if fails to make API call
   */
  public QueryResults postContentmanagementAuditquery(ContentQueryRequest body) throws IOException, ApiException {
    return postContentmanagementAuditqueryWithHttpInfo(body).getBody();
  }

  /**
   * Query audits
   * 
   * @param body Allows for a filtered query returning facet information (required)
   * @return QueryResults
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueryResults> postContentmanagementAuditqueryWithHttpInfo(ContentQueryRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postContentmanagementAuditquery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/auditquery".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<QueryResults>() {});
  }

  /**
   * Query audits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public QueryResults postContentmanagementAuditquery(PostContentmanagementAuditqueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<QueryResults>() {});
  }

  /**
   * Query audits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueryResults> postContentmanagementAuditquery(ApiRequest<ContentQueryRequest> request) throws IOException, ApiException {
    return pcapiClient.<QueryResults>invokeAPIVerbose(request, new TypeReference<QueryResults>() {});
  }

  /**
   * Update a document.
   * 
   * @param documentId Document ID (required)
   * @param body Document (required)
   * @param expand Expand some document fields (optional)
   * @param override Override any lock on the document (optional)
   * @return Document
   * @throws ApiException if fails to make API call
   */
  public Document postContentmanagementDocument(String documentId, DocumentUpdate body, String expand, Boolean override) throws IOException, ApiException {
    return postContentmanagementDocumentWithHttpInfo(documentId, body, expand, override).getBody();
  }

  /**
   * Update a document.
   * 
   * @param documentId Document ID (required)
   * @param body Document (required)
   * @param expand Expand some document fields (optional)
   * @param override Override any lock on the document (optional)
   * @return Document
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Document> postContentmanagementDocumentWithHttpInfo(String documentId, DocumentUpdate body, String expand, Boolean override) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'documentId' when calling postContentmanagementDocument");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postContentmanagementDocument");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "documentId" + "\\}", pcapiClient.escapeString(documentId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "override", override));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Document>() {});
  }

  /**
   * Update a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Document postContentmanagementDocument(PostContentmanagementDocumentRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Document>() {});
  }

  /**
   * Update a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Document> postContentmanagementDocument(ApiRequest<DocumentUpdate> request) throws IOException, ApiException {
    return pcapiClient.<Document>invokeAPIVerbose(request, new TypeReference<Document>() {});
  }

  /**
   * Replace the contents of a document.
   * 
   * @param documentId Document ID (required)
   * @param body Replace Request (required)
   * @param override Override any lock on the document (optional)
   * @return ReplaceResponse
   * @throws ApiException if fails to make API call
   */
  public ReplaceResponse postContentmanagementDocumentContent(String documentId, ReplaceRequest body, Boolean override) throws IOException, ApiException {
    return postContentmanagementDocumentContentWithHttpInfo(documentId, body, override).getBody();
  }

  /**
   * Replace the contents of a document.
   * 
   * @param documentId Document ID (required)
   * @param body Replace Request (required)
   * @param override Override any lock on the document (optional)
   * @return ReplaceResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReplaceResponse> postContentmanagementDocumentContentWithHttpInfo(String documentId, ReplaceRequest body, Boolean override) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'documentId' when calling postContentmanagementDocumentContent");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postContentmanagementDocumentContent");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/documents/{documentId}/content".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "documentId" + "\\}", pcapiClient.escapeString(documentId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "override", override));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ReplaceResponse>() {});
  }

  /**
   * Replace the contents of a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ReplaceResponse postContentmanagementDocumentContent(PostContentmanagementDocumentContentRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ReplaceResponse>() {});
  }

  /**
   * Replace the contents of a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReplaceResponse> postContentmanagementDocumentContent(ApiRequest<ReplaceRequest> request) throws IOException, ApiException {
    return pcapiClient.<ReplaceResponse>invokeAPIVerbose(request, new TypeReference<ReplaceResponse>() {});
  }

  /**
   * Add a document.
   * 
   * @param body Document (required)
   * @param copySource Copy a document within a workspace or to a new workspace. Provide a document ID as the copy source. (optional)
   * @param moveSource Move a document to a new workspace. Provide a document ID as the move source. (optional)
   * @param override Override any lock on the source document (optional)
   * @return Document
   * @throws ApiException if fails to make API call
   */
  public Document postContentmanagementDocuments(DocumentUpload body, String copySource, String moveSource, Boolean override) throws IOException, ApiException {
    return postContentmanagementDocumentsWithHttpInfo(body, copySource, moveSource, override).getBody();
  }

  /**
   * Add a document.
   * 
   * @param body Document (required)
   * @param copySource Copy a document within a workspace or to a new workspace. Provide a document ID as the copy source. (optional)
   * @param moveSource Move a document to a new workspace. Provide a document ID as the move source. (optional)
   * @param override Override any lock on the source document (optional)
   * @return Document
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Document> postContentmanagementDocumentsWithHttpInfo(DocumentUpload body, String copySource, String moveSource, Boolean override) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postContentmanagementDocuments");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/documents".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "copySource", copySource));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "moveSource", moveSource));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "override", override));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Document>() {});
  }

  /**
   * Add a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Document postContentmanagementDocuments(PostContentmanagementDocumentsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Document>() {});
  }

  /**
   * Add a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Document> postContentmanagementDocuments(ApiRequest<DocumentUpload> request) throws IOException, ApiException {
    return pcapiClient.<Document>invokeAPIVerbose(request, new TypeReference<Document>() {});
  }

  /**
   * Query content
   * 
   * @param body Allows for a filtered query returning facet information (required)
   * @param expand Expand some document fields (optional)
   * @return QueryResults
   * @throws ApiException if fails to make API call
   */
  public QueryResults postContentmanagementQuery(QueryRequest body, String expand) throws IOException, ApiException {
    return postContentmanagementQueryWithHttpInfo(body, expand).getBody();
  }

  /**
   * Query content
   * 
   * @param body Allows for a filtered query returning facet information (required)
   * @param expand Expand some document fields (optional)
   * @return QueryResults
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueryResults> postContentmanagementQueryWithHttpInfo(QueryRequest body, String expand) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postContentmanagementQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/query".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<QueryResults>() {});
  }

  /**
   * Query content
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public QueryResults postContentmanagementQuery(PostContentmanagementQueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<QueryResults>() {});
  }

  /**
   * Query content
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueryResults> postContentmanagementQuery(ApiRequest<QueryRequest> request) throws IOException, ApiException {
    return pcapiClient.<QueryResults>invokeAPIVerbose(request, new TypeReference<QueryResults>() {});
  }

  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @param body CreateShareRequest - entity id and type and a single member or list of members are required (required)
   * @return CreateShareResponse
   * @throws ApiException if fails to make API call
   */
  public CreateShareResponse postContentmanagementShares(CreateShareRequest body) throws IOException, ApiException {
    return postContentmanagementSharesWithHttpInfo(body).getBody();
  }

  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @param body CreateShareRequest - entity id and type and a single member or list of members are required (required)
   * @return CreateShareResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateShareResponse> postContentmanagementSharesWithHttpInfo(CreateShareRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postContentmanagementShares");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/shares".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CreateShareResponse>() {});
  }

  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CreateShareResponse postContentmanagementShares(PostContentmanagementSharesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CreateShareResponse>() {});
  }

  /**
   * Creates a new share or updates an existing share if the entity has already been shared
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateShareResponse> postContentmanagementShares(ApiRequest<CreateShareRequest> request) throws IOException, ApiException {
    return pcapiClient.<CreateShareResponse>invokeAPIVerbose(request, new TypeReference<CreateShareResponse>() {});
  }

  /**
   * Create a workspace tag
   * 
   * @param workspaceId Workspace ID (required)
   * @param body tag (required)
   * @return TagValue
   * @throws ApiException if fails to make API call
   */
  public TagValue postContentmanagementWorkspaceTagvalues(String workspaceId, TagValue body) throws IOException, ApiException {
    return postContentmanagementWorkspaceTagvaluesWithHttpInfo(workspaceId, body).getBody();
  }

  /**
   * Create a workspace tag
   * 
   * @param workspaceId Workspace ID (required)
   * @param body tag (required)
   * @return TagValue
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagValue> postContentmanagementWorkspaceTagvaluesWithHttpInfo(String workspaceId, TagValue body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling postContentmanagementWorkspaceTagvalues");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postContentmanagementWorkspaceTagvalues");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TagValue>() {});
  }

  /**
   * Create a workspace tag
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TagValue postContentmanagementWorkspaceTagvalues(PostContentmanagementWorkspaceTagvaluesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TagValue>() {});
  }

  /**
   * Create a workspace tag
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagValue> postContentmanagementWorkspaceTagvalues(ApiRequest<TagValue> request) throws IOException, ApiException {
    return pcapiClient.<TagValue>invokeAPIVerbose(request, new TypeReference<TagValue>() {});
  }

  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param body query (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return TagValueEntityListing
   * @throws ApiException if fails to make API call
   */
  public TagValueEntityListing postContentmanagementWorkspaceTagvaluesQuery(String workspaceId, TagQueryRequest body, List<String> expand) throws IOException, ApiException {
    return postContentmanagementWorkspaceTagvaluesQueryWithHttpInfo(workspaceId, body, expand).getBody();
  }

  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param body query (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return TagValueEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagValueEntityListing> postContentmanagementWorkspaceTagvaluesQueryWithHttpInfo(String workspaceId, TagQueryRequest body, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling postContentmanagementWorkspaceTagvaluesQuery");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postContentmanagementWorkspaceTagvaluesQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/query".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TagValueEntityListing>() {});
  }

  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TagValueEntityListing postContentmanagementWorkspaceTagvaluesQuery(PostContentmanagementWorkspaceTagvaluesQueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TagValueEntityListing>() {});
  }

  /**
   * Perform a prefix query on tags in the workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagValueEntityListing> postContentmanagementWorkspaceTagvaluesQuery(ApiRequest<TagQueryRequest> request) throws IOException, ApiException {
    return pcapiClient.<TagValueEntityListing>invokeAPIVerbose(request, new TypeReference<TagValueEntityListing>() {});
  }

  /**
   * Create a group workspace
   * 
   * @param body Workspace (required)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public Workspace postContentmanagementWorkspaces(WorkspaceCreate body) throws IOException, ApiException {
    return postContentmanagementWorkspacesWithHttpInfo(body).getBody();
  }

  /**
   * Create a group workspace
   * 
   * @param body Workspace (required)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workspace> postContentmanagementWorkspacesWithHttpInfo(WorkspaceCreate body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postContentmanagementWorkspaces");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Workspace>() {});
  }

  /**
   * Create a group workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Workspace postContentmanagementWorkspaces(PostContentmanagementWorkspacesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Workspace>() {});
  }

  /**
   * Create a group workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workspace> postContentmanagementWorkspaces(ApiRequest<WorkspaceCreate> request) throws IOException, ApiException {
    return pcapiClient.<Workspace>invokeAPIVerbose(request, new TypeReference<Workspace>() {});
  }

  /**
   * Update a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param body Workspace (required)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public Workspace putContentmanagementWorkspace(String workspaceId, Workspace body) throws IOException, ApiException {
    return putContentmanagementWorkspaceWithHttpInfo(workspaceId, body).getBody();
  }

  /**
   * Update a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param body Workspace (required)
   * @return Workspace
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workspace> putContentmanagementWorkspaceWithHttpInfo(String workspaceId, Workspace body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling putContentmanagementWorkspace");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putContentmanagementWorkspace");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Workspace>() {});
  }

  /**
   * Update a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Workspace putContentmanagementWorkspace(PutContentmanagementWorkspaceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Workspace>() {});
  }

  /**
   * Update a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Workspace> putContentmanagementWorkspace(ApiRequest<Workspace> request) throws IOException, ApiException {
    return pcapiClient.<Workspace>invokeAPIVerbose(request, new TypeReference<Workspace>() {});
  }

  /**
   * Add a member to a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @param body Workspace Member (required)
   * @return WorkspaceMember
   * @throws ApiException if fails to make API call
   */
  public WorkspaceMember putContentmanagementWorkspaceMember(String workspaceId, String memberId, WorkspaceMember body) throws IOException, ApiException {
    return putContentmanagementWorkspaceMemberWithHttpInfo(workspaceId, memberId, body).getBody();
  }

  /**
   * Add a member to a workspace
   * 
   * @param workspaceId Workspace ID (required)
   * @param memberId Member ID (required)
   * @param body Workspace Member (required)
   * @return WorkspaceMember
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkspaceMember> putContentmanagementWorkspaceMemberWithHttpInfo(String workspaceId, String memberId, WorkspaceMember body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling putContentmanagementWorkspaceMember");
    }
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'memberId' when calling putContentmanagementWorkspaceMember");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putContentmanagementWorkspaceMember");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "memberId" + "\\}", pcapiClient.escapeString(memberId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WorkspaceMember>() {});
  }

  /**
   * Add a member to a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WorkspaceMember putContentmanagementWorkspaceMember(PutContentmanagementWorkspaceMemberRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WorkspaceMember>() {});
  }

  /**
   * Add a member to a workspace
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkspaceMember> putContentmanagementWorkspaceMember(ApiRequest<WorkspaceMember> request) throws IOException, ApiException {
    return pcapiClient.<WorkspaceMember>invokeAPIVerbose(request, new TypeReference<WorkspaceMember>() {});
  }

  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @param body Workspace (required)
   * @return TagValue
   * @throws ApiException if fails to make API call
   */
  public TagValue putContentmanagementWorkspaceTagvalue(String workspaceId, String tagId, TagValue body) throws IOException, ApiException {
    return putContentmanagementWorkspaceTagvalueWithHttpInfo(workspaceId, tagId, body).getBody();
  }

  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @param workspaceId Workspace ID (required)
   * @param tagId Tag ID (required)
   * @param body Workspace (required)
   * @return TagValue
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagValue> putContentmanagementWorkspaceTagvalueWithHttpInfo(String workspaceId, String tagId, TagValue body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'workspaceId' when calling putContentmanagementWorkspaceTagvalue");
    }
    
    // verify the required parameter 'tagId' is set
    if (tagId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'tagId' when calling putContentmanagementWorkspaceTagvalue");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putContentmanagementWorkspaceTagvalue");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", pcapiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "tagId" + "\\}", pcapiClient.escapeString(tagId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TagValue>() {});
  }

  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TagValue putContentmanagementWorkspaceTagvalue(PutContentmanagementWorkspaceTagvalueRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TagValue>() {});
  }

  /**
   * Update a workspace tag. Will update all documents with the new tag value.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TagValue> putContentmanagementWorkspaceTagvalue(ApiRequest<TagValue> request) throws IOException, ApiException {
    return pcapiClient.<TagValue>invokeAPIVerbose(request, new TypeReference<TagValue>() {});
  }

}
