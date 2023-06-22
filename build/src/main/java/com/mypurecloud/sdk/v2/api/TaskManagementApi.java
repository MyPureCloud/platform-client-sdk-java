package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Workbin;
import com.mypurecloud.sdk.v2.model.WorkbinChangeListing;
import com.mypurecloud.sdk.v2.model.WorkbinCreate;
import com.mypurecloud.sdk.v2.model.WorkbinQueryEntityListing;
import com.mypurecloud.sdk.v2.model.WorkbinQueryRequest;
import com.mypurecloud.sdk.v2.model.WorkbinUpdate;
import com.mypurecloud.sdk.v2.model.WorkbinVersion;
import com.mypurecloud.sdk.v2.model.WorkbinVersionListing;
import com.mypurecloud.sdk.v2.model.Workitem;
import com.mypurecloud.sdk.v2.model.WorkitemChangeListing;
import com.mypurecloud.sdk.v2.model.WorkitemCreate;
import com.mypurecloud.sdk.v2.model.WorkitemManualAssign;
import com.mypurecloud.sdk.v2.model.WorkitemPostQueryEntityListing;
import com.mypurecloud.sdk.v2.model.WorkitemQueryPostRequest;
import com.mypurecloud.sdk.v2.model.WorkitemStatus;
import com.mypurecloud.sdk.v2.model.WorkitemStatusCreate;
import com.mypurecloud.sdk.v2.model.WorkitemStatusUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemTerminate;
import com.mypurecloud.sdk.v2.model.WorkitemUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemVersion;
import com.mypurecloud.sdk.v2.model.WorkitemVersionListing;
import com.mypurecloud.sdk.v2.model.WorkitemWrapup;
import com.mypurecloud.sdk.v2.model.WorkitemWrapupEntityListing;
import com.mypurecloud.sdk.v2.model.WorkitemWrapupUpdate;
import com.mypurecloud.sdk.v2.model.Worktype;
import com.mypurecloud.sdk.v2.model.WorktypeChangeListing;
import com.mypurecloud.sdk.v2.model.WorktypeCreate;
import com.mypurecloud.sdk.v2.model.WorktypeQueryEntityListing;
import com.mypurecloud.sdk.v2.model.WorktypeQueryRequest;
import com.mypurecloud.sdk.v2.model.WorktypeUpdate;
import com.mypurecloud.sdk.v2.model.WorktypeVersion;
import com.mypurecloud.sdk.v2.model.WorktypeVersionListing;


import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorkbinRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorkitemRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorkitemsSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorktypeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorktypeStatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkbinRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkbinHistoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkbinVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkbinVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemHistoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemUserWrapupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemWrapupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsSchemaVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsSchemaVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeHistoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeStatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorkbinRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorkitemRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorkitemAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorkitemUserWrapupsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorkitemUsersMeWrapupsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorktypeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorktypeStatusRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkbinsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkbinsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemAcdCancelRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemDisconnectRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemTerminateRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemsSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorktypeStatusesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorktypesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorktypesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutTaskmanagementWorkitemsSchemaRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManagementApi {
  private final ApiClient pcapiClient;

  public TaskManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TaskManagementApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a workbin
   * 
   * deleteTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workbinId Workbin ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTaskmanagementWorkbin(String workbinId) throws IOException, ApiException {
     deleteTaskmanagementWorkbin(createDeleteTaskmanagementWorkbinRequest(workbinId));
  }

  /**
   * Delete a workbin
   * 
   * deleteTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workbinId Workbin ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTaskmanagementWorkbinWithHttpInfo(String workbinId) throws IOException {
    return deleteTaskmanagementWorkbin(createDeleteTaskmanagementWorkbinRequest(workbinId).withHttpInfo());
  }

  private DeleteTaskmanagementWorkbinRequest createDeleteTaskmanagementWorkbinRequest(String workbinId) {
    return DeleteTaskmanagementWorkbinRequest.builder()
            .withWorkbinId(workbinId)

            .build();
  }

  /**
   * Delete a workbin
   * 
   * deleteTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTaskmanagementWorkbin(DeleteTaskmanagementWorkbinRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a workbin
   * 
   * deleteTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTaskmanagementWorkbin(ApiRequest<Void> request) throws IOException {
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
   * Delete a workitem
   * 
   * deleteTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTaskmanagementWorkitem(String workitemId) throws IOException, ApiException {
     deleteTaskmanagementWorkitem(createDeleteTaskmanagementWorkitemRequest(workitemId));
  }

  /**
   * Delete a workitem
   * 
   * deleteTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTaskmanagementWorkitemWithHttpInfo(String workitemId) throws IOException {
    return deleteTaskmanagementWorkitem(createDeleteTaskmanagementWorkitemRequest(workitemId).withHttpInfo());
  }

  private DeleteTaskmanagementWorkitemRequest createDeleteTaskmanagementWorkitemRequest(String workitemId) {
    return DeleteTaskmanagementWorkitemRequest.builder()
            .withWorkitemId(workitemId)

            .build();
  }

  /**
   * Delete a workitem
   * 
   * deleteTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTaskmanagementWorkitem(DeleteTaskmanagementWorkitemRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a workitem
   * 
   * deleteTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTaskmanagementWorkitem(ApiRequest<Void> request) throws IOException {
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
   * Delete a schema
   * 
   * deleteTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTaskmanagementWorkitemsSchema(String schemaId) throws IOException, ApiException {
     deleteTaskmanagementWorkitemsSchema(createDeleteTaskmanagementWorkitemsSchemaRequest(schemaId));
  }

  /**
   * Delete a schema
   * 
   * deleteTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTaskmanagementWorkitemsSchemaWithHttpInfo(String schemaId) throws IOException {
    return deleteTaskmanagementWorkitemsSchema(createDeleteTaskmanagementWorkitemsSchemaRequest(schemaId).withHttpInfo());
  }

  private DeleteTaskmanagementWorkitemsSchemaRequest createDeleteTaskmanagementWorkitemsSchemaRequest(String schemaId) {
    return DeleteTaskmanagementWorkitemsSchemaRequest.builder()
            .withSchemaId(schemaId)

            .build();
  }

  /**
   * Delete a schema
   * 
   * deleteTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTaskmanagementWorkitemsSchema(DeleteTaskmanagementWorkitemsSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a schema
   * 
   * deleteTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTaskmanagementWorkitemsSchema(ApiRequest<Void> request) throws IOException {
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
   * Delete a worktype
   * 
   * deleteTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTaskmanagementWorktype(String worktypeId) throws IOException, ApiException {
     deleteTaskmanagementWorktype(createDeleteTaskmanagementWorktypeRequest(worktypeId));
  }

  /**
   * Delete a worktype
   * 
   * deleteTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTaskmanagementWorktypeWithHttpInfo(String worktypeId) throws IOException {
    return deleteTaskmanagementWorktype(createDeleteTaskmanagementWorktypeRequest(worktypeId).withHttpInfo());
  }

  private DeleteTaskmanagementWorktypeRequest createDeleteTaskmanagementWorktypeRequest(String worktypeId) {
    return DeleteTaskmanagementWorktypeRequest.builder()
            .withWorktypeId(worktypeId)

            .build();
  }

  /**
   * Delete a worktype
   * 
   * deleteTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTaskmanagementWorktype(DeleteTaskmanagementWorktypeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a worktype
   * 
   * deleteTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTaskmanagementWorktype(ApiRequest<Void> request) throws IOException {
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
   * Delete a status
   * 
   * deleteTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param statusId Status id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTaskmanagementWorktypeStatus(String worktypeId, String statusId) throws IOException, ApiException {
     deleteTaskmanagementWorktypeStatus(createDeleteTaskmanagementWorktypeStatusRequest(worktypeId, statusId));
  }

  /**
   * Delete a status
   * 
   * deleteTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param statusId Status id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTaskmanagementWorktypeStatusWithHttpInfo(String worktypeId, String statusId) throws IOException {
    return deleteTaskmanagementWorktypeStatus(createDeleteTaskmanagementWorktypeStatusRequest(worktypeId, statusId).withHttpInfo());
  }

  private DeleteTaskmanagementWorktypeStatusRequest createDeleteTaskmanagementWorktypeStatusRequest(String worktypeId, String statusId) {
    return DeleteTaskmanagementWorktypeStatusRequest.builder()
            .withWorktypeId(worktypeId)

            .withStatusId(statusId)

            .build();
  }

  /**
   * Delete a status
   * 
   * deleteTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTaskmanagementWorktypeStatus(DeleteTaskmanagementWorktypeStatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a status
   * 
   * deleteTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTaskmanagementWorktypeStatus(ApiRequest<Void> request) throws IOException {
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
   * Get a workbin
   * 
   * getTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workbinId Workbin ID (required)
   * @return Workbin
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workbin getTaskmanagementWorkbin(String workbinId) throws IOException, ApiException {
    return  getTaskmanagementWorkbin(createGetTaskmanagementWorkbinRequest(workbinId));
  }

  /**
   * Get a workbin
   * 
   * getTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workbinId Workbin ID (required)
   * @return Workbin
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workbin> getTaskmanagementWorkbinWithHttpInfo(String workbinId) throws IOException {
    return getTaskmanagementWorkbin(createGetTaskmanagementWorkbinRequest(workbinId).withHttpInfo());
  }

  private GetTaskmanagementWorkbinRequest createGetTaskmanagementWorkbinRequest(String workbinId) {
    return GetTaskmanagementWorkbinRequest.builder()
            .withWorkbinId(workbinId)

            .build();
  }

  /**
   * Get a workbin
   * 
   * getTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return Workbin
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workbin getTaskmanagementWorkbin(GetTaskmanagementWorkbinRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Workbin> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Workbin>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a workbin
   * 
   * getTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workbin> getTaskmanagementWorkbin(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Workbin>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Workbin> response = (ApiResponse<Workbin>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Workbin> response = (ApiResponse<Workbin>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a listing of a workbin's attribute change history
   * 
   * getTaskmanagementWorkbinHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workbinId Workbin ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorkbinChangeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkbinChangeListing getTaskmanagementWorkbinHistory(String workbinId, String after, Integer pageSize, String sortOrder) throws IOException, ApiException {
    return  getTaskmanagementWorkbinHistory(createGetTaskmanagementWorkbinHistoryRequest(workbinId, after, pageSize, sortOrder));
  }

  /**
   * Get a listing of a workbin's attribute change history
   * 
   * getTaskmanagementWorkbinHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workbinId Workbin ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorkbinChangeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkbinChangeListing> getTaskmanagementWorkbinHistoryWithHttpInfo(String workbinId, String after, Integer pageSize, String sortOrder) throws IOException {
    return getTaskmanagementWorkbinHistory(createGetTaskmanagementWorkbinHistoryRequest(workbinId, after, pageSize, sortOrder).withHttpInfo());
  }

  private GetTaskmanagementWorkbinHistoryRequest createGetTaskmanagementWorkbinHistoryRequest(String workbinId, String after, Integer pageSize, String sortOrder) {
    return GetTaskmanagementWorkbinHistoryRequest.builder()
            .withWorkbinId(workbinId)

            .withAfter(after)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get a listing of a workbin's attribute change history
   * 
   * getTaskmanagementWorkbinHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkbinChangeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkbinChangeListing getTaskmanagementWorkbinHistory(GetTaskmanagementWorkbinHistoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkbinChangeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkbinChangeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a listing of a workbin's attribute change history
   * 
   * getTaskmanagementWorkbinHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkbinChangeListing> getTaskmanagementWorkbinHistory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkbinChangeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkbinChangeListing> response = (ApiResponse<WorkbinChangeListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkbinChangeListing> response = (ApiResponse<WorkbinChangeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a version of a workbin
   * 
   * getTaskmanagementWorkbinVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workbinId Workbin ID (required)
   * @param entityVersion Workbin version (required)
   * @return WorkbinVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkbinVersion getTaskmanagementWorkbinVersion(String workbinId, Integer entityVersion) throws IOException, ApiException {
    return  getTaskmanagementWorkbinVersion(createGetTaskmanagementWorkbinVersionRequest(workbinId, entityVersion));
  }

  /**
   * Get a version of a workbin
   * 
   * getTaskmanagementWorkbinVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workbinId Workbin ID (required)
   * @param entityVersion Workbin version (required)
   * @return WorkbinVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkbinVersion> getTaskmanagementWorkbinVersionWithHttpInfo(String workbinId, Integer entityVersion) throws IOException {
    return getTaskmanagementWorkbinVersion(createGetTaskmanagementWorkbinVersionRequest(workbinId, entityVersion).withHttpInfo());
  }

  private GetTaskmanagementWorkbinVersionRequest createGetTaskmanagementWorkbinVersionRequest(String workbinId, Integer entityVersion) {
    return GetTaskmanagementWorkbinVersionRequest.builder()
            .withWorkbinId(workbinId)

            .withEntityVersion(entityVersion)

            .build();
  }

  /**
   * Get a version of a workbin
   * 
   * getTaskmanagementWorkbinVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkbinVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkbinVersion getTaskmanagementWorkbinVersion(GetTaskmanagementWorkbinVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkbinVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkbinVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a version of a workbin
   * 
   * getTaskmanagementWorkbinVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkbinVersion> getTaskmanagementWorkbinVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkbinVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkbinVersion> response = (ApiResponse<WorkbinVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkbinVersion> response = (ApiResponse<WorkbinVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all versions of a workbin
   * 
   * getTaskmanagementWorkbinVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workbinId Workbin ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorkbinVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkbinVersionListing getTaskmanagementWorkbinVersions(String workbinId, String after, Integer pageSize, String sortOrder) throws IOException, ApiException {
    return  getTaskmanagementWorkbinVersions(createGetTaskmanagementWorkbinVersionsRequest(workbinId, after, pageSize, sortOrder));
  }

  /**
   * Get all versions of a workbin
   * 
   * getTaskmanagementWorkbinVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workbinId Workbin ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorkbinVersionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkbinVersionListing> getTaskmanagementWorkbinVersionsWithHttpInfo(String workbinId, String after, Integer pageSize, String sortOrder) throws IOException {
    return getTaskmanagementWorkbinVersions(createGetTaskmanagementWorkbinVersionsRequest(workbinId, after, pageSize, sortOrder).withHttpInfo());
  }

  private GetTaskmanagementWorkbinVersionsRequest createGetTaskmanagementWorkbinVersionsRequest(String workbinId, String after, Integer pageSize, String sortOrder) {
    return GetTaskmanagementWorkbinVersionsRequest.builder()
            .withWorkbinId(workbinId)

            .withAfter(after)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get all versions of a workbin
   * 
   * getTaskmanagementWorkbinVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkbinVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkbinVersionListing getTaskmanagementWorkbinVersions(GetTaskmanagementWorkbinVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkbinVersionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkbinVersionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all versions of a workbin
   * 
   * getTaskmanagementWorkbinVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkbinVersionListing> getTaskmanagementWorkbinVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkbinVersionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkbinVersionListing> response = (ApiResponse<WorkbinVersionListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkbinVersionListing> response = (ApiResponse<WorkbinVersionListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a workitem
   * 
   * getTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param expands Which fields to expand. Comma separated if more than one. (optional)
   * @return Workitem
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workitem getTaskmanagementWorkitem(String workitemId, String expands) throws IOException, ApiException {
    return  getTaskmanagementWorkitem(createGetTaskmanagementWorkitemRequest(workitemId, expands));
  }

  /**
   * Get a workitem
   * 
   * getTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param expands Which fields to expand. Comma separated if more than one. (optional)
   * @return Workitem
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workitem> getTaskmanagementWorkitemWithHttpInfo(String workitemId, String expands) throws IOException {
    return getTaskmanagementWorkitem(createGetTaskmanagementWorkitemRequest(workitemId, expands).withHttpInfo());
  }

  private GetTaskmanagementWorkitemRequest createGetTaskmanagementWorkitemRequest(String workitemId, String expands) {
    return GetTaskmanagementWorkitemRequest.builder()
            .withWorkitemId(workitemId)

            .withExpands(expands)

            .build();
  }

  /**
   * Get a workitem
   * 
   * getTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return Workitem
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workitem getTaskmanagementWorkitem(GetTaskmanagementWorkitemRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Workitem> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Workitem>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a workitem
   * 
   * getTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workitem> getTaskmanagementWorkitem(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Workitem>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a listing of a workitem's attribute change history
   * 
   * getTaskmanagementWorkitemHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorkitemChangeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemChangeListing getTaskmanagementWorkitemHistory(String workitemId, String after, Integer pageSize, String sortOrder) throws IOException, ApiException {
    return  getTaskmanagementWorkitemHistory(createGetTaskmanagementWorkitemHistoryRequest(workitemId, after, pageSize, sortOrder));
  }

  /**
   * Get a listing of a workitem's attribute change history
   * 
   * getTaskmanagementWorkitemHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorkitemChangeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemChangeListing> getTaskmanagementWorkitemHistoryWithHttpInfo(String workitemId, String after, Integer pageSize, String sortOrder) throws IOException {
    return getTaskmanagementWorkitemHistory(createGetTaskmanagementWorkitemHistoryRequest(workitemId, after, pageSize, sortOrder).withHttpInfo());
  }

  private GetTaskmanagementWorkitemHistoryRequest createGetTaskmanagementWorkitemHistoryRequest(String workitemId, String after, Integer pageSize, String sortOrder) {
    return GetTaskmanagementWorkitemHistoryRequest.builder()
            .withWorkitemId(workitemId)

            .withAfter(after)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get a listing of a workitem's attribute change history
   * 
   * getTaskmanagementWorkitemHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkitemChangeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemChangeListing getTaskmanagementWorkitemHistory(GetTaskmanagementWorkitemHistoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkitemChangeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkitemChangeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a listing of a workitem's attribute change history
   * 
   * getTaskmanagementWorkitemHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemChangeListing> getTaskmanagementWorkitemHistory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkitemChangeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemChangeListing> response = (ApiResponse<WorkitemChangeListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemChangeListing> response = (ApiResponse<WorkitemChangeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all wrapup codes added for the given user for a workitem.
   * 
   * getTaskmanagementWorkitemUserWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId The ID of the Workitem. (required)
   * @param userId The ID of the user (required)
   * @param expands Which fields, if any, to expand. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 50. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorkitemWrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemWrapup getTaskmanagementWorkitemUserWrapups(String workitemId, String userId, String expands, String after, Integer pageSize, String sortOrder) throws IOException, ApiException {
    return  getTaskmanagementWorkitemUserWrapups(createGetTaskmanagementWorkitemUserWrapupsRequest(workitemId, userId, expands, after, pageSize, sortOrder));
  }

  /**
   * Get all wrapup codes added for the given user for a workitem.
   * 
   * getTaskmanagementWorkitemUserWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId The ID of the Workitem. (required)
   * @param userId The ID of the user (required)
   * @param expands Which fields, if any, to expand. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 50. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorkitemWrapup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemWrapup> getTaskmanagementWorkitemUserWrapupsWithHttpInfo(String workitemId, String userId, String expands, String after, Integer pageSize, String sortOrder) throws IOException {
    return getTaskmanagementWorkitemUserWrapups(createGetTaskmanagementWorkitemUserWrapupsRequest(workitemId, userId, expands, after, pageSize, sortOrder).withHttpInfo());
  }

  private GetTaskmanagementWorkitemUserWrapupsRequest createGetTaskmanagementWorkitemUserWrapupsRequest(String workitemId, String userId, String expands, String after, Integer pageSize, String sortOrder) {
    return GetTaskmanagementWorkitemUserWrapupsRequest.builder()
            .withWorkitemId(workitemId)

            .withUserId(userId)

            .withExpands(expands)

            .withAfter(after)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get all wrapup codes added for the given user for a workitem.
   * 
   * getTaskmanagementWorkitemUserWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkitemWrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemWrapup getTaskmanagementWorkitemUserWrapups(GetTaskmanagementWorkitemUserWrapupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkitemWrapup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkitemWrapup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all wrapup codes added for the given user for a workitem.
   * 
   * getTaskmanagementWorkitemUserWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemWrapup> getTaskmanagementWorkitemUserWrapups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkitemWrapup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemWrapup> response = (ApiResponse<WorkitemWrapup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemWrapup> response = (ApiResponse<WorkitemWrapup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a version of a workitem
   * 
   * getTaskmanagementWorkitemVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param entityVersion Workitem version (required)
   * @return WorkitemVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemVersion getTaskmanagementWorkitemVersion(String workitemId, Integer entityVersion) throws IOException, ApiException {
    return  getTaskmanagementWorkitemVersion(createGetTaskmanagementWorkitemVersionRequest(workitemId, entityVersion));
  }

  /**
   * Get a version of a workitem
   * 
   * getTaskmanagementWorkitemVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param entityVersion Workitem version (required)
   * @return WorkitemVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemVersion> getTaskmanagementWorkitemVersionWithHttpInfo(String workitemId, Integer entityVersion) throws IOException {
    return getTaskmanagementWorkitemVersion(createGetTaskmanagementWorkitemVersionRequest(workitemId, entityVersion).withHttpInfo());
  }

  private GetTaskmanagementWorkitemVersionRequest createGetTaskmanagementWorkitemVersionRequest(String workitemId, Integer entityVersion) {
    return GetTaskmanagementWorkitemVersionRequest.builder()
            .withWorkitemId(workitemId)

            .withEntityVersion(entityVersion)

            .build();
  }

  /**
   * Get a version of a workitem
   * 
   * getTaskmanagementWorkitemVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkitemVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemVersion getTaskmanagementWorkitemVersion(GetTaskmanagementWorkitemVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkitemVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkitemVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a version of a workitem
   * 
   * getTaskmanagementWorkitemVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemVersion> getTaskmanagementWorkitemVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkitemVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemVersion> response = (ApiResponse<WorkitemVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemVersion> response = (ApiResponse<WorkitemVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all versions of a workitem
   * 
   * getTaskmanagementWorkitemVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorkitemVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemVersionListing getTaskmanagementWorkitemVersions(String workitemId, String after, Integer pageSize, String sortOrder) throws IOException, ApiException {
    return  getTaskmanagementWorkitemVersions(createGetTaskmanagementWorkitemVersionsRequest(workitemId, after, pageSize, sortOrder));
  }

  /**
   * Get all versions of a workitem
   * 
   * getTaskmanagementWorkitemVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorkitemVersionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemVersionListing> getTaskmanagementWorkitemVersionsWithHttpInfo(String workitemId, String after, Integer pageSize, String sortOrder) throws IOException {
    return getTaskmanagementWorkitemVersions(createGetTaskmanagementWorkitemVersionsRequest(workitemId, after, pageSize, sortOrder).withHttpInfo());
  }

  private GetTaskmanagementWorkitemVersionsRequest createGetTaskmanagementWorkitemVersionsRequest(String workitemId, String after, Integer pageSize, String sortOrder) {
    return GetTaskmanagementWorkitemVersionsRequest.builder()
            .withWorkitemId(workitemId)

            .withAfter(after)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get all versions of a workitem
   * 
   * getTaskmanagementWorkitemVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkitemVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemVersionListing getTaskmanagementWorkitemVersions(GetTaskmanagementWorkitemVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkitemVersionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkitemVersionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all versions of a workitem
   * 
   * getTaskmanagementWorkitemVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemVersionListing> getTaskmanagementWorkitemVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkitemVersionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemVersionListing> response = (ApiResponse<WorkitemVersionListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemVersionListing> response = (ApiResponse<WorkitemVersionListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all wrapup codes added for all users for a workitem.
   * 
   * getTaskmanagementWorkitemWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId The ID of the Workitem. (required)
   * @param expands Which fields, if any, to expand. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 50. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorkitemWrapupEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemWrapupEntityListing getTaskmanagementWorkitemWrapups(String workitemId, String expands, String after, Integer pageSize, String sortOrder) throws IOException, ApiException {
    return  getTaskmanagementWorkitemWrapups(createGetTaskmanagementWorkitemWrapupsRequest(workitemId, expands, after, pageSize, sortOrder));
  }

  /**
   * Get all wrapup codes added for all users for a workitem.
   * 
   * getTaskmanagementWorkitemWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId The ID of the Workitem. (required)
   * @param expands Which fields, if any, to expand. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 50. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorkitemWrapupEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemWrapupEntityListing> getTaskmanagementWorkitemWrapupsWithHttpInfo(String workitemId, String expands, String after, Integer pageSize, String sortOrder) throws IOException {
    return getTaskmanagementWorkitemWrapups(createGetTaskmanagementWorkitemWrapupsRequest(workitemId, expands, after, pageSize, sortOrder).withHttpInfo());
  }

  private GetTaskmanagementWorkitemWrapupsRequest createGetTaskmanagementWorkitemWrapupsRequest(String workitemId, String expands, String after, Integer pageSize, String sortOrder) {
    return GetTaskmanagementWorkitemWrapupsRequest.builder()
            .withWorkitemId(workitemId)

            .withExpands(expands)

            .withAfter(after)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get all wrapup codes added for all users for a workitem.
   * 
   * getTaskmanagementWorkitemWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkitemWrapupEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemWrapupEntityListing getTaskmanagementWorkitemWrapups(GetTaskmanagementWorkitemWrapupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkitemWrapupEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkitemWrapupEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all wrapup codes added for all users for a workitem.
   * 
   * getTaskmanagementWorkitemWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemWrapupEntityListing> getTaskmanagementWorkitemWrapups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkitemWrapupEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemWrapupEntityListing> response = (ApiResponse<WorkitemWrapupEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemWrapupEntityListing> response = (ApiResponse<WorkitemWrapupEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a schema
   * 
   * getTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getTaskmanagementWorkitemsSchema(String schemaId) throws IOException, ApiException {
    return  getTaskmanagementWorkitemsSchema(createGetTaskmanagementWorkitemsSchemaRequest(schemaId));
  }

  /**
   * Get a schema
   * 
   * getTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getTaskmanagementWorkitemsSchemaWithHttpInfo(String schemaId) throws IOException {
    return getTaskmanagementWorkitemsSchema(createGetTaskmanagementWorkitemsSchemaRequest(schemaId).withHttpInfo());
  }

  private GetTaskmanagementWorkitemsSchemaRequest createGetTaskmanagementWorkitemsSchemaRequest(String schemaId) {
    return GetTaskmanagementWorkitemsSchemaRequest.builder()
            .withSchemaId(schemaId)

            .build();
  }

  /**
   * Get a schema
   * 
   * getTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getTaskmanagementWorkitemsSchema(GetTaskmanagementWorkitemsSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a schema
   * 
   * getTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getTaskmanagementWorkitemsSchema(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a specific version of a schema
   * 
   * getTaskmanagementWorkitemsSchemaVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @param versionId Schema version (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getTaskmanagementWorkitemsSchemaVersion(String schemaId, String versionId) throws IOException, ApiException {
    return  getTaskmanagementWorkitemsSchemaVersion(createGetTaskmanagementWorkitemsSchemaVersionRequest(schemaId, versionId));
  }

  /**
   * Get a specific version of a schema
   * 
   * getTaskmanagementWorkitemsSchemaVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @param versionId Schema version (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getTaskmanagementWorkitemsSchemaVersionWithHttpInfo(String schemaId, String versionId) throws IOException {
    return getTaskmanagementWorkitemsSchemaVersion(createGetTaskmanagementWorkitemsSchemaVersionRequest(schemaId, versionId).withHttpInfo());
  }

  private GetTaskmanagementWorkitemsSchemaVersionRequest createGetTaskmanagementWorkitemsSchemaVersionRequest(String schemaId, String versionId) {
    return GetTaskmanagementWorkitemsSchemaVersionRequest.builder()
            .withSchemaId(schemaId)

            .withVersionId(versionId)

            .build();
  }

  /**
   * Get a specific version of a schema
   * 
   * getTaskmanagementWorkitemsSchemaVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getTaskmanagementWorkitemsSchemaVersion(GetTaskmanagementWorkitemsSchemaVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a specific version of a schema
   * 
   * getTaskmanagementWorkitemsSchemaVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getTaskmanagementWorkitemsSchemaVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all versions of a schema
   * 
   * getTaskmanagementWorkitemsSchemaVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getTaskmanagementWorkitemsSchemaVersions(String schemaId) throws IOException, ApiException {
    return  getTaskmanagementWorkitemsSchemaVersions(createGetTaskmanagementWorkitemsSchemaVersionsRequest(schemaId));
  }

  /**
   * Get all versions of a schema
   * 
   * getTaskmanagementWorkitemsSchemaVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getTaskmanagementWorkitemsSchemaVersionsWithHttpInfo(String schemaId) throws IOException {
    return getTaskmanagementWorkitemsSchemaVersions(createGetTaskmanagementWorkitemsSchemaVersionsRequest(schemaId).withHttpInfo());
  }

  private GetTaskmanagementWorkitemsSchemaVersionsRequest createGetTaskmanagementWorkitemsSchemaVersionsRequest(String schemaId) {
    return GetTaskmanagementWorkitemsSchemaVersionsRequest.builder()
            .withSchemaId(schemaId)

            .build();
  }

  /**
   * Get all versions of a schema
   * 
   * getTaskmanagementWorkitemsSchemaVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getTaskmanagementWorkitemsSchemaVersions(GetTaskmanagementWorkitemsSchemaVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all versions of a schema
   * 
   * getTaskmanagementWorkitemsSchemaVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getTaskmanagementWorkitemsSchemaVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of schemas.
   * 
   * getTaskmanagementWorkitemsSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @return DataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchemaListing getTaskmanagementWorkitemsSchemas() throws IOException, ApiException {
    return  getTaskmanagementWorkitemsSchemas(createGetTaskmanagementWorkitemsSchemasRequest());
  }

  /**
   * Get a list of schemas.
   * 
   * getTaskmanagementWorkitemsSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @return DataSchemaListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchemaListing> getTaskmanagementWorkitemsSchemasWithHttpInfo() throws IOException {
    return getTaskmanagementWorkitemsSchemas(createGetTaskmanagementWorkitemsSchemasRequest().withHttpInfo());
  }

  private GetTaskmanagementWorkitemsSchemasRequest createGetTaskmanagementWorkitemsSchemasRequest() {
    return GetTaskmanagementWorkitemsSchemasRequest.builder()
            .build();
  }

  /**
   * Get a list of schemas.
   * 
   * getTaskmanagementWorkitemsSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return DataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchemaListing getTaskmanagementWorkitemsSchemas(GetTaskmanagementWorkitemsSchemasRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchemaListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchemaListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of schemas.
   * 
   * getTaskmanagementWorkitemsSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchemaListing> getTaskmanagementWorkitemsSchemas(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchemaListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a worktype
   * 
   * getTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param expands Which fields, if any, to expand. (optional)
   * @return Worktype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Worktype getTaskmanagementWorktype(String worktypeId, List<String> expands) throws IOException, ApiException {
    return  getTaskmanagementWorktype(createGetTaskmanagementWorktypeRequest(worktypeId, expands));
  }

  /**
   * Get a worktype
   * 
   * getTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param expands Which fields, if any, to expand. (optional)
   * @return Worktype
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Worktype> getTaskmanagementWorktypeWithHttpInfo(String worktypeId, List<String> expands) throws IOException {
    return getTaskmanagementWorktype(createGetTaskmanagementWorktypeRequest(worktypeId, expands).withHttpInfo());
  }

  private GetTaskmanagementWorktypeRequest createGetTaskmanagementWorktypeRequest(String worktypeId, List<String> expands) {
    return GetTaskmanagementWorktypeRequest.builder()
            .withWorktypeId(worktypeId)

            .withExpands(expands)

            .build();
  }

  /**
   * Get a worktype
   * 
   * getTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return Worktype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Worktype getTaskmanagementWorktype(GetTaskmanagementWorktypeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Worktype> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Worktype>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a worktype
   * 
   * getTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Worktype> getTaskmanagementWorktype(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Worktype>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Worktype> response = (ApiResponse<Worktype>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Worktype> response = (ApiResponse<Worktype>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a listing of a worktype's attribute change history
   * 
   * getTaskmanagementWorktypeHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorktypeChangeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorktypeChangeListing getTaskmanagementWorktypeHistory(String worktypeId, String after, Integer pageSize, String sortOrder) throws IOException, ApiException {
    return  getTaskmanagementWorktypeHistory(createGetTaskmanagementWorktypeHistoryRequest(worktypeId, after, pageSize, sortOrder));
  }

  /**
   * Get a listing of a worktype's attribute change history
   * 
   * getTaskmanagementWorktypeHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorktypeChangeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorktypeChangeListing> getTaskmanagementWorktypeHistoryWithHttpInfo(String worktypeId, String after, Integer pageSize, String sortOrder) throws IOException {
    return getTaskmanagementWorktypeHistory(createGetTaskmanagementWorktypeHistoryRequest(worktypeId, after, pageSize, sortOrder).withHttpInfo());
  }

  private GetTaskmanagementWorktypeHistoryRequest createGetTaskmanagementWorktypeHistoryRequest(String worktypeId, String after, Integer pageSize, String sortOrder) {
    return GetTaskmanagementWorktypeHistoryRequest.builder()
            .withWorktypeId(worktypeId)

            .withAfter(after)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get a listing of a worktype's attribute change history
   * 
   * getTaskmanagementWorktypeHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorktypeChangeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorktypeChangeListing getTaskmanagementWorktypeHistory(GetTaskmanagementWorktypeHistoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorktypeChangeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorktypeChangeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a listing of a worktype's attribute change history
   * 
   * getTaskmanagementWorktypeHistory is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorktypeChangeListing> getTaskmanagementWorktypeHistory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorktypeChangeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorktypeChangeListing> response = (ApiResponse<WorktypeChangeListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorktypeChangeListing> response = (ApiResponse<WorktypeChangeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a status
   * 
   * getTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param statusId Status id (required)
   * @return WorkitemStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemStatus getTaskmanagementWorktypeStatus(String worktypeId, String statusId) throws IOException, ApiException {
    return  getTaskmanagementWorktypeStatus(createGetTaskmanagementWorktypeStatusRequest(worktypeId, statusId));
  }

  /**
   * Get a status
   * 
   * getTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param statusId Status id (required)
   * @return WorkitemStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemStatus> getTaskmanagementWorktypeStatusWithHttpInfo(String worktypeId, String statusId) throws IOException {
    return getTaskmanagementWorktypeStatus(createGetTaskmanagementWorktypeStatusRequest(worktypeId, statusId).withHttpInfo());
  }

  private GetTaskmanagementWorktypeStatusRequest createGetTaskmanagementWorktypeStatusRequest(String worktypeId, String statusId) {
    return GetTaskmanagementWorktypeStatusRequest.builder()
            .withWorktypeId(worktypeId)

            .withStatusId(statusId)

            .build();
  }

  /**
   * Get a status
   * 
   * getTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkitemStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemStatus getTaskmanagementWorktypeStatus(GetTaskmanagementWorktypeStatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkitemStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkitemStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a status
   * 
   * getTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemStatus> getTaskmanagementWorktypeStatus(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkitemStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemStatus> response = (ApiResponse<WorkitemStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemStatus> response = (ApiResponse<WorkitemStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a version of a worktype
   * 
   * getTaskmanagementWorktypeVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param entityVersion Worktype version (required)
   * @return WorktypeVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorktypeVersion getTaskmanagementWorktypeVersion(String worktypeId, Integer entityVersion) throws IOException, ApiException {
    return  getTaskmanagementWorktypeVersion(createGetTaskmanagementWorktypeVersionRequest(worktypeId, entityVersion));
  }

  /**
   * Get a version of a worktype
   * 
   * getTaskmanagementWorktypeVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param entityVersion Worktype version (required)
   * @return WorktypeVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorktypeVersion> getTaskmanagementWorktypeVersionWithHttpInfo(String worktypeId, Integer entityVersion) throws IOException {
    return getTaskmanagementWorktypeVersion(createGetTaskmanagementWorktypeVersionRequest(worktypeId, entityVersion).withHttpInfo());
  }

  private GetTaskmanagementWorktypeVersionRequest createGetTaskmanagementWorktypeVersionRequest(String worktypeId, Integer entityVersion) {
    return GetTaskmanagementWorktypeVersionRequest.builder()
            .withWorktypeId(worktypeId)

            .withEntityVersion(entityVersion)

            .build();
  }

  /**
   * Get a version of a worktype
   * 
   * getTaskmanagementWorktypeVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorktypeVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorktypeVersion getTaskmanagementWorktypeVersion(GetTaskmanagementWorktypeVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorktypeVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorktypeVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a version of a worktype
   * 
   * getTaskmanagementWorktypeVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorktypeVersion> getTaskmanagementWorktypeVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorktypeVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorktypeVersion> response = (ApiResponse<WorktypeVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorktypeVersion> response = (ApiResponse<WorktypeVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all versions of a worktype
   * 
   * getTaskmanagementWorktypeVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorktypeVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorktypeVersionListing getTaskmanagementWorktypeVersions(String worktypeId, String after, Integer pageSize, String sortOrder) throws IOException, ApiException {
    return  getTaskmanagementWorktypeVersions(createGetTaskmanagementWorktypeVersionsRequest(worktypeId, after, pageSize, sortOrder));
  }

  /**
   * Get all versions of a worktype
   * 
   * getTaskmanagementWorktypeVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200. (optional, default to 25)
   * @param sortOrder Ascending or descending sort order (optional, default to descending)
   * @return WorktypeVersionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorktypeVersionListing> getTaskmanagementWorktypeVersionsWithHttpInfo(String worktypeId, String after, Integer pageSize, String sortOrder) throws IOException {
    return getTaskmanagementWorktypeVersions(createGetTaskmanagementWorktypeVersionsRequest(worktypeId, after, pageSize, sortOrder).withHttpInfo());
  }

  private GetTaskmanagementWorktypeVersionsRequest createGetTaskmanagementWorktypeVersionsRequest(String worktypeId, String after, Integer pageSize, String sortOrder) {
    return GetTaskmanagementWorktypeVersionsRequest.builder()
            .withWorktypeId(worktypeId)

            .withAfter(after)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get all versions of a worktype
   * 
   * getTaskmanagementWorktypeVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorktypeVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorktypeVersionListing getTaskmanagementWorktypeVersions(GetTaskmanagementWorktypeVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorktypeVersionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorktypeVersionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all versions of a worktype
   * 
   * getTaskmanagementWorktypeVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorktypeVersionListing> getTaskmanagementWorktypeVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorktypeVersionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorktypeVersionListing> response = (ApiResponse<WorktypeVersionListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorktypeVersionListing> response = (ApiResponse<WorktypeVersionListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the attributes of a workbin
   * 
   * patchTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workbinId Workbin ID (required)
   * @param body Json with attributes and their new values: {\"description\":\"new description\", \"name\":\"new name\"}. (required)
   * @return Workbin
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workbin patchTaskmanagementWorkbin(String workbinId, WorkbinUpdate body) throws IOException, ApiException {
    return  patchTaskmanagementWorkbin(createPatchTaskmanagementWorkbinRequest(workbinId, body));
  }

  /**
   * Update the attributes of a workbin
   * 
   * patchTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workbinId Workbin ID (required)
   * @param body Json with attributes and their new values: {\"description\":\"new description\", \"name\":\"new name\"}. (required)
   * @return Workbin
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workbin> patchTaskmanagementWorkbinWithHttpInfo(String workbinId, WorkbinUpdate body) throws IOException {
    return patchTaskmanagementWorkbin(createPatchTaskmanagementWorkbinRequest(workbinId, body).withHttpInfo());
  }

  private PatchTaskmanagementWorkbinRequest createPatchTaskmanagementWorkbinRequest(String workbinId, WorkbinUpdate body) {
    return PatchTaskmanagementWorkbinRequest.builder()
            .withWorkbinId(workbinId)

            .withBody(body)

            .build();
  }

  /**
   * Update the attributes of a workbin
   * 
   * patchTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return Workbin
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workbin patchTaskmanagementWorkbin(PatchTaskmanagementWorkbinRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Workbin> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Workbin>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the attributes of a workbin
   * 
   * patchTaskmanagementWorkbin is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workbin> patchTaskmanagementWorkbin(ApiRequest<WorkbinUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Workbin>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Workbin> response = (ApiResponse<Workbin>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Workbin> response = (ApiResponse<Workbin>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the attributes of a workitem
   * 
   * patchTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param body Workitem (required)
   * @return Workitem
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workitem patchTaskmanagementWorkitem(String workitemId, WorkitemUpdate body) throws IOException, ApiException {
    return  patchTaskmanagementWorkitem(createPatchTaskmanagementWorkitemRequest(workitemId, body));
  }

  /**
   * Update the attributes of a workitem
   * 
   * patchTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param body Workitem (required)
   * @return Workitem
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workitem> patchTaskmanagementWorkitemWithHttpInfo(String workitemId, WorkitemUpdate body) throws IOException {
    return patchTaskmanagementWorkitem(createPatchTaskmanagementWorkitemRequest(workitemId, body).withHttpInfo());
  }

  private PatchTaskmanagementWorkitemRequest createPatchTaskmanagementWorkitemRequest(String workitemId, WorkitemUpdate body) {
    return PatchTaskmanagementWorkitemRequest.builder()
            .withWorkitemId(workitemId)

            .withBody(body)

            .build();
  }

  /**
   * Update the attributes of a workitem
   * 
   * patchTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return Workitem
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workitem patchTaskmanagementWorkitem(PatchTaskmanagementWorkitemRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Workitem> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Workitem>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the attributes of a workitem
   * 
   * patchTaskmanagementWorkitem is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workitem> patchTaskmanagementWorkitem(ApiRequest<WorkitemUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Workitem>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Attempts to manually assign a specified workitem to a specified user.  Ignores bullseye ring, PAR score, skills, and languages.
   * 
   * patchTaskmanagementWorkitemAssignment is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param body Targeted user (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchTaskmanagementWorkitemAssignment(String workitemId, WorkitemManualAssign body) throws IOException, ApiException {
     patchTaskmanagementWorkitemAssignment(createPatchTaskmanagementWorkitemAssignmentRequest(workitemId, body));
  }

  /**
   * Attempts to manually assign a specified workitem to a specified user.  Ignores bullseye ring, PAR score, skills, and languages.
   * 
   * patchTaskmanagementWorkitemAssignment is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param body Targeted user (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchTaskmanagementWorkitemAssignmentWithHttpInfo(String workitemId, WorkitemManualAssign body) throws IOException {
    return patchTaskmanagementWorkitemAssignment(createPatchTaskmanagementWorkitemAssignmentRequest(workitemId, body).withHttpInfo());
  }

  private PatchTaskmanagementWorkitemAssignmentRequest createPatchTaskmanagementWorkitemAssignmentRequest(String workitemId, WorkitemManualAssign body) {
    return PatchTaskmanagementWorkitemAssignmentRequest.builder()
            .withWorkitemId(workitemId)

            .withBody(body)

            .build();
  }

  /**
   * Attempts to manually assign a specified workitem to a specified user.  Ignores bullseye ring, PAR score, skills, and languages.
   * 
   * patchTaskmanagementWorkitemAssignment is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchTaskmanagementWorkitemAssignment(PatchTaskmanagementWorkitemAssignmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Attempts to manually assign a specified workitem to a specified user.  Ignores bullseye ring, PAR score, skills, and languages.
   * 
   * patchTaskmanagementWorkitemAssignment is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchTaskmanagementWorkitemAssignment(ApiRequest<WorkitemManualAssign> request) throws IOException {
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
   * Add/Remove a wrapup code for a given user in a workitem.
   * 
   * patchTaskmanagementWorkitemUserWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId The ID of the Workitem. (required)
   * @param userId The ID of the user (required)
   * @param body Request body to add/remove a wrapup code for a workitem (required)
   * @return WorkitemWrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemWrapup patchTaskmanagementWorkitemUserWrapups(String workitemId, String userId, WorkitemWrapupUpdate body) throws IOException, ApiException {
    return  patchTaskmanagementWorkitemUserWrapups(createPatchTaskmanagementWorkitemUserWrapupsRequest(workitemId, userId, body));
  }

  /**
   * Add/Remove a wrapup code for a given user in a workitem.
   * 
   * patchTaskmanagementWorkitemUserWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId The ID of the Workitem. (required)
   * @param userId The ID of the user (required)
   * @param body Request body to add/remove a wrapup code for a workitem (required)
   * @return WorkitemWrapup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemWrapup> patchTaskmanagementWorkitemUserWrapupsWithHttpInfo(String workitemId, String userId, WorkitemWrapupUpdate body) throws IOException {
    return patchTaskmanagementWorkitemUserWrapups(createPatchTaskmanagementWorkitemUserWrapupsRequest(workitemId, userId, body).withHttpInfo());
  }

  private PatchTaskmanagementWorkitemUserWrapupsRequest createPatchTaskmanagementWorkitemUserWrapupsRequest(String workitemId, String userId, WorkitemWrapupUpdate body) {
    return PatchTaskmanagementWorkitemUserWrapupsRequest.builder()
            .withWorkitemId(workitemId)

            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Add/Remove a wrapup code for a given user in a workitem.
   * 
   * patchTaskmanagementWorkitemUserWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkitemWrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemWrapup patchTaskmanagementWorkitemUserWrapups(PatchTaskmanagementWorkitemUserWrapupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkitemWrapup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkitemWrapup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add/Remove a wrapup code for a given user in a workitem.
   * 
   * patchTaskmanagementWorkitemUserWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemWrapup> patchTaskmanagementWorkitemUserWrapups(ApiRequest<WorkitemWrapupUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkitemWrapup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemWrapup> response = (ApiResponse<WorkitemWrapup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemWrapup> response = (ApiResponse<WorkitemWrapup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add/Remove a wrapup code for the current user in a workitem.
   * 
   * patchTaskmanagementWorkitemUsersMeWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId The ID of the Workitem. (required)
   * @param body Request body to add/remove the wrapup code for workitem (required)
   * @return WorkitemWrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemWrapup patchTaskmanagementWorkitemUsersMeWrapups(String workitemId, WorkitemWrapupUpdate body) throws IOException, ApiException {
    return  patchTaskmanagementWorkitemUsersMeWrapups(createPatchTaskmanagementWorkitemUsersMeWrapupsRequest(workitemId, body));
  }

  /**
   * Add/Remove a wrapup code for the current user in a workitem.
   * 
   * patchTaskmanagementWorkitemUsersMeWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId The ID of the Workitem. (required)
   * @param body Request body to add/remove the wrapup code for workitem (required)
   * @return WorkitemWrapup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemWrapup> patchTaskmanagementWorkitemUsersMeWrapupsWithHttpInfo(String workitemId, WorkitemWrapupUpdate body) throws IOException {
    return patchTaskmanagementWorkitemUsersMeWrapups(createPatchTaskmanagementWorkitemUsersMeWrapupsRequest(workitemId, body).withHttpInfo());
  }

  private PatchTaskmanagementWorkitemUsersMeWrapupsRequest createPatchTaskmanagementWorkitemUsersMeWrapupsRequest(String workitemId, WorkitemWrapupUpdate body) {
    return PatchTaskmanagementWorkitemUsersMeWrapupsRequest.builder()
            .withWorkitemId(workitemId)

            .withBody(body)

            .build();
  }

  /**
   * Add/Remove a wrapup code for the current user in a workitem.
   * 
   * patchTaskmanagementWorkitemUsersMeWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkitemWrapup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemWrapup patchTaskmanagementWorkitemUsersMeWrapups(PatchTaskmanagementWorkitemUsersMeWrapupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkitemWrapup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkitemWrapup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add/Remove a wrapup code for the current user in a workitem.
   * 
   * patchTaskmanagementWorkitemUsersMeWrapups is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemWrapup> patchTaskmanagementWorkitemUsersMeWrapups(ApiRequest<WorkitemWrapupUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkitemWrapup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemWrapup> response = (ApiResponse<WorkitemWrapup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemWrapup> response = (ApiResponse<WorkitemWrapup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the attributes of a worktype
   * 
   * patchTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param body body (optional)
   * @return Worktype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Worktype patchTaskmanagementWorktype(String worktypeId, WorktypeUpdate body) throws IOException, ApiException {
    return  patchTaskmanagementWorktype(createPatchTaskmanagementWorktypeRequest(worktypeId, body));
  }

  /**
   * Update the attributes of a worktype
   * 
   * patchTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param body body (optional)
   * @return Worktype
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Worktype> patchTaskmanagementWorktypeWithHttpInfo(String worktypeId, WorktypeUpdate body) throws IOException {
    return patchTaskmanagementWorktype(createPatchTaskmanagementWorktypeRequest(worktypeId, body).withHttpInfo());
  }

  private PatchTaskmanagementWorktypeRequest createPatchTaskmanagementWorktypeRequest(String worktypeId, WorktypeUpdate body) {
    return PatchTaskmanagementWorktypeRequest.builder()
            .withWorktypeId(worktypeId)

            .withBody(body)

            .build();
  }

  /**
   * Update the attributes of a worktype
   * 
   * patchTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return Worktype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Worktype patchTaskmanagementWorktype(PatchTaskmanagementWorktypeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Worktype> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Worktype>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the attributes of a worktype
   * 
   * patchTaskmanagementWorktype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Worktype> patchTaskmanagementWorktype(ApiRequest<WorktypeUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Worktype>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Worktype> response = (ApiResponse<Worktype>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Worktype> response = (ApiResponse<Worktype>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the attributes of a status
   * 
   * patchTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param statusId Status id (required)
   * @param body body (optional)
   * @return WorkitemStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemStatus patchTaskmanagementWorktypeStatus(String worktypeId, String statusId, WorkitemStatusUpdate body) throws IOException, ApiException {
    return  patchTaskmanagementWorktypeStatus(createPatchTaskmanagementWorktypeStatusRequest(worktypeId, statusId, body));
  }

  /**
   * Update the attributes of a status
   * 
   * patchTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param statusId Status id (required)
   * @param body body (optional)
   * @return WorkitemStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemStatus> patchTaskmanagementWorktypeStatusWithHttpInfo(String worktypeId, String statusId, WorkitemStatusUpdate body) throws IOException {
    return patchTaskmanagementWorktypeStatus(createPatchTaskmanagementWorktypeStatusRequest(worktypeId, statusId, body).withHttpInfo());
  }

  private PatchTaskmanagementWorktypeStatusRequest createPatchTaskmanagementWorktypeStatusRequest(String worktypeId, String statusId, WorkitemStatusUpdate body) {
    return PatchTaskmanagementWorktypeStatusRequest.builder()
            .withWorktypeId(worktypeId)

            .withStatusId(statusId)

            .withBody(body)

            .build();
  }

  /**
   * Update the attributes of a status
   * 
   * patchTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkitemStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemStatus patchTaskmanagementWorktypeStatus(PatchTaskmanagementWorktypeStatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkitemStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkitemStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the attributes of a status
   * 
   * patchTaskmanagementWorktypeStatus is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemStatus> patchTaskmanagementWorktypeStatus(ApiRequest<WorkitemStatusUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkitemStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemStatus> response = (ApiResponse<WorkitemStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemStatus> response = (ApiResponse<WorkitemStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a workbin
   * 
   * postTaskmanagementWorkbins is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body body (optional)
   * @return Workbin
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workbin postTaskmanagementWorkbins(WorkbinCreate body) throws IOException, ApiException {
    return  postTaskmanagementWorkbins(createPostTaskmanagementWorkbinsRequest(body));
  }

  /**
   * Create a workbin
   * 
   * postTaskmanagementWorkbins is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body body (optional)
   * @return Workbin
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workbin> postTaskmanagementWorkbinsWithHttpInfo(WorkbinCreate body) throws IOException {
    return postTaskmanagementWorkbins(createPostTaskmanagementWorkbinsRequest(body).withHttpInfo());
  }

  private PostTaskmanagementWorkbinsRequest createPostTaskmanagementWorkbinsRequest(WorkbinCreate body) {
    return PostTaskmanagementWorkbinsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a workbin
   * 
   * postTaskmanagementWorkbins is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return Workbin
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workbin postTaskmanagementWorkbins(PostTaskmanagementWorkbinsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Workbin> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Workbin>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a workbin
   * 
   * postTaskmanagementWorkbins is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workbin> postTaskmanagementWorkbins(ApiRequest<WorkbinCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Workbin>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Workbin> response = (ApiResponse<Workbin>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Workbin> response = (ApiResponse<Workbin>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for workbins
   * 
   * postTaskmanagementWorkbinsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body QueryPostRequest (required)
   * @return WorkbinQueryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkbinQueryEntityListing postTaskmanagementWorkbinsQuery(WorkbinQueryRequest body) throws IOException, ApiException {
    return  postTaskmanagementWorkbinsQuery(createPostTaskmanagementWorkbinsQueryRequest(body));
  }

  /**
   * Query for workbins
   * 
   * postTaskmanagementWorkbinsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body QueryPostRequest (required)
   * @return WorkbinQueryEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkbinQueryEntityListing> postTaskmanagementWorkbinsQueryWithHttpInfo(WorkbinQueryRequest body) throws IOException {
    return postTaskmanagementWorkbinsQuery(createPostTaskmanagementWorkbinsQueryRequest(body).withHttpInfo());
  }

  private PostTaskmanagementWorkbinsQueryRequest createPostTaskmanagementWorkbinsQueryRequest(WorkbinQueryRequest body) {
    return PostTaskmanagementWorkbinsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for workbins
   * 
   * postTaskmanagementWorkbinsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkbinQueryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkbinQueryEntityListing postTaskmanagementWorkbinsQuery(PostTaskmanagementWorkbinsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkbinQueryEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkbinQueryEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for workbins
   * 
   * postTaskmanagementWorkbinsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkbinQueryEntityListing> postTaskmanagementWorkbinsQuery(ApiRequest<WorkbinQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkbinQueryEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkbinQueryEntityListing> response = (ApiResponse<WorkbinQueryEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkbinQueryEntityListing> response = (ApiResponse<WorkbinQueryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Cancel the assignment process for a workitem that is currently queued for assignment through ACD.
   * 
   * postTaskmanagementWorkitemAcdCancel is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @return Workitem
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workitem postTaskmanagementWorkitemAcdCancel(String workitemId) throws IOException, ApiException {
    return  postTaskmanagementWorkitemAcdCancel(createPostTaskmanagementWorkitemAcdCancelRequest(workitemId));
  }

  /**
   * Cancel the assignment process for a workitem that is currently queued for assignment through ACD.
   * 
   * postTaskmanagementWorkitemAcdCancel is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @return Workitem
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workitem> postTaskmanagementWorkitemAcdCancelWithHttpInfo(String workitemId) throws IOException {
    return postTaskmanagementWorkitemAcdCancel(createPostTaskmanagementWorkitemAcdCancelRequest(workitemId).withHttpInfo());
  }

  private PostTaskmanagementWorkitemAcdCancelRequest createPostTaskmanagementWorkitemAcdCancelRequest(String workitemId) {
    return PostTaskmanagementWorkitemAcdCancelRequest.builder()
            .withWorkitemId(workitemId)

            .build();
  }

  /**
   * Cancel the assignment process for a workitem that is currently queued for assignment through ACD.
   * 
   * postTaskmanagementWorkitemAcdCancel is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return Workitem
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workitem postTaskmanagementWorkitemAcdCancel(PostTaskmanagementWorkitemAcdCancelRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Workitem> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Workitem>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Cancel the assignment process for a workitem that is currently queued for assignment through ACD.
   * 
   * postTaskmanagementWorkitemAcdCancel is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workitem> postTaskmanagementWorkitemAcdCancel(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Workitem>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Disconnect the assignee of the workitem
   * 
   * postTaskmanagementWorkitemDisconnect is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @return Workitem
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workitem postTaskmanagementWorkitemDisconnect(String workitemId) throws IOException, ApiException {
    return  postTaskmanagementWorkitemDisconnect(createPostTaskmanagementWorkitemDisconnectRequest(workitemId));
  }

  /**
   * Disconnect the assignee of the workitem
   * 
   * postTaskmanagementWorkitemDisconnect is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @return Workitem
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workitem> postTaskmanagementWorkitemDisconnectWithHttpInfo(String workitemId) throws IOException {
    return postTaskmanagementWorkitemDisconnect(createPostTaskmanagementWorkitemDisconnectRequest(workitemId).withHttpInfo());
  }

  private PostTaskmanagementWorkitemDisconnectRequest createPostTaskmanagementWorkitemDisconnectRequest(String workitemId) {
    return PostTaskmanagementWorkitemDisconnectRequest.builder()
            .withWorkitemId(workitemId)

            .build();
  }

  /**
   * Disconnect the assignee of the workitem
   * 
   * postTaskmanagementWorkitemDisconnect is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return Workitem
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workitem postTaskmanagementWorkitemDisconnect(PostTaskmanagementWorkitemDisconnectRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Workitem> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Workitem>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Disconnect the assignee of the workitem
   * 
   * postTaskmanagementWorkitemDisconnect is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workitem> postTaskmanagementWorkitemDisconnect(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Workitem>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Terminate a workitem
   * 
   * postTaskmanagementWorkitemTerminate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param body Terminated request (optional)
   * @return Workitem
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workitem postTaskmanagementWorkitemTerminate(String workitemId, WorkitemTerminate body) throws IOException, ApiException {
    return  postTaskmanagementWorkitemTerminate(createPostTaskmanagementWorkitemTerminateRequest(workitemId, body));
  }

  /**
   * Terminate a workitem
   * 
   * postTaskmanagementWorkitemTerminate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param workitemId Workitem ID (required)
   * @param body Terminated request (optional)
   * @return Workitem
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workitem> postTaskmanagementWorkitemTerminateWithHttpInfo(String workitemId, WorkitemTerminate body) throws IOException {
    return postTaskmanagementWorkitemTerminate(createPostTaskmanagementWorkitemTerminateRequest(workitemId, body).withHttpInfo());
  }

  private PostTaskmanagementWorkitemTerminateRequest createPostTaskmanagementWorkitemTerminateRequest(String workitemId, WorkitemTerminate body) {
    return PostTaskmanagementWorkitemTerminateRequest.builder()
            .withWorkitemId(workitemId)

            .withBody(body)

            .build();
  }

  /**
   * Terminate a workitem
   * 
   * postTaskmanagementWorkitemTerminate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return Workitem
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workitem postTaskmanagementWorkitemTerminate(PostTaskmanagementWorkitemTerminateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Workitem> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Workitem>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Terminate a workitem
   * 
   * postTaskmanagementWorkitemTerminate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workitem> postTaskmanagementWorkitemTerminate(ApiRequest<WorkitemTerminate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Workitem>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a workitem
   * 
   * postTaskmanagementWorkitems is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body Workitem (required)
   * @return Workitem
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workitem postTaskmanagementWorkitems(WorkitemCreate body) throws IOException, ApiException {
    return  postTaskmanagementWorkitems(createPostTaskmanagementWorkitemsRequest(body));
  }

  /**
   * Create a workitem
   * 
   * postTaskmanagementWorkitems is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body Workitem (required)
   * @return Workitem
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workitem> postTaskmanagementWorkitemsWithHttpInfo(WorkitemCreate body) throws IOException {
    return postTaskmanagementWorkitems(createPostTaskmanagementWorkitemsRequest(body).withHttpInfo());
  }

  private PostTaskmanagementWorkitemsRequest createPostTaskmanagementWorkitemsRequest(WorkitemCreate body) {
    return PostTaskmanagementWorkitemsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a workitem
   * 
   * postTaskmanagementWorkitems is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return Workitem
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Workitem postTaskmanagementWorkitems(PostTaskmanagementWorkitemsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Workitem> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Workitem>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a workitem
   * 
   * postTaskmanagementWorkitems is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Workitem> postTaskmanagementWorkitems(ApiRequest<WorkitemCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Workitem>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for workitems
   * This query requires at least one EQ filter on the workbinId, assigneeId or typeId attributes.
   * postTaskmanagementWorkitemsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body WorkitemQueryPostRequest (required)
   * @return WorkitemPostQueryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemPostQueryEntityListing postTaskmanagementWorkitemsQuery(WorkitemQueryPostRequest body) throws IOException, ApiException {
    return  postTaskmanagementWorkitemsQuery(createPostTaskmanagementWorkitemsQueryRequest(body));
  }

  /**
   * Query for workitems
   * This query requires at least one EQ filter on the workbinId, assigneeId or typeId attributes.
   * postTaskmanagementWorkitemsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body WorkitemQueryPostRequest (required)
   * @return WorkitemPostQueryEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemPostQueryEntityListing> postTaskmanagementWorkitemsQueryWithHttpInfo(WorkitemQueryPostRequest body) throws IOException {
    return postTaskmanagementWorkitemsQuery(createPostTaskmanagementWorkitemsQueryRequest(body).withHttpInfo());
  }

  private PostTaskmanagementWorkitemsQueryRequest createPostTaskmanagementWorkitemsQueryRequest(WorkitemQueryPostRequest body) {
    return PostTaskmanagementWorkitemsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for workitems
   * This query requires at least one EQ filter on the workbinId, assigneeId or typeId attributes.
   * postTaskmanagementWorkitemsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkitemPostQueryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemPostQueryEntityListing postTaskmanagementWorkitemsQuery(PostTaskmanagementWorkitemsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkitemPostQueryEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkitemPostQueryEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for workitems
   * This query requires at least one EQ filter on the workbinId, assigneeId or typeId attributes.
   * postTaskmanagementWorkitemsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemPostQueryEntityListing> postTaskmanagementWorkitemsQuery(ApiRequest<WorkitemQueryPostRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkitemPostQueryEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemPostQueryEntityListing> response = (ApiResponse<WorkitemPostQueryEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemPostQueryEntityListing> response = (ApiResponse<WorkitemPostQueryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a schema
   * 
   * postTaskmanagementWorkitemsSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body Schema (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema postTaskmanagementWorkitemsSchemas(DataSchema body) throws IOException, ApiException {
    return  postTaskmanagementWorkitemsSchemas(createPostTaskmanagementWorkitemsSchemasRequest(body));
  }

  /**
   * Create a schema
   * 
   * postTaskmanagementWorkitemsSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body Schema (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> postTaskmanagementWorkitemsSchemasWithHttpInfo(DataSchema body) throws IOException {
    return postTaskmanagementWorkitemsSchemas(createPostTaskmanagementWorkitemsSchemasRequest(body).withHttpInfo());
  }

  private PostTaskmanagementWorkitemsSchemasRequest createPostTaskmanagementWorkitemsSchemasRequest(DataSchema body) {
    return PostTaskmanagementWorkitemsSchemasRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a schema
   * 
   * postTaskmanagementWorkitemsSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema postTaskmanagementWorkitemsSchemas(PostTaskmanagementWorkitemsSchemasRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a schema
   * 
   * postTaskmanagementWorkitemsSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> postTaskmanagementWorkitemsSchemas(ApiRequest<DataSchema> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add a status to a worktype
   * 
   * postTaskmanagementWorktypeStatuses is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param body body (optional)
   * @return WorkitemStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemStatus postTaskmanagementWorktypeStatuses(String worktypeId, WorkitemStatusCreate body) throws IOException, ApiException {
    return  postTaskmanagementWorktypeStatuses(createPostTaskmanagementWorktypeStatusesRequest(worktypeId, body));
  }

  /**
   * Add a status to a worktype
   * 
   * postTaskmanagementWorktypeStatuses is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param worktypeId Worktype id (required)
   * @param body body (optional)
   * @return WorkitemStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemStatus> postTaskmanagementWorktypeStatusesWithHttpInfo(String worktypeId, WorkitemStatusCreate body) throws IOException {
    return postTaskmanagementWorktypeStatuses(createPostTaskmanagementWorktypeStatusesRequest(worktypeId, body).withHttpInfo());
  }

  private PostTaskmanagementWorktypeStatusesRequest createPostTaskmanagementWorktypeStatusesRequest(String worktypeId, WorkitemStatusCreate body) {
    return PostTaskmanagementWorktypeStatusesRequest.builder()
            .withWorktypeId(worktypeId)

            .withBody(body)

            .build();
  }

  /**
   * Add a status to a worktype
   * 
   * postTaskmanagementWorktypeStatuses is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorkitemStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkitemStatus postTaskmanagementWorktypeStatuses(PostTaskmanagementWorktypeStatusesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkitemStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkitemStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a status to a worktype
   * 
   * postTaskmanagementWorktypeStatuses is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkitemStatus> postTaskmanagementWorktypeStatuses(ApiRequest<WorkitemStatusCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkitemStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemStatus> response = (ApiResponse<WorkitemStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkitemStatus> response = (ApiResponse<WorkitemStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a worktype
   * 
   * postTaskmanagementWorktypes is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body body (optional)
   * @return Worktype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Worktype postTaskmanagementWorktypes(WorktypeCreate body) throws IOException, ApiException {
    return  postTaskmanagementWorktypes(createPostTaskmanagementWorktypesRequest(body));
  }

  /**
   * Create a worktype
   * 
   * postTaskmanagementWorktypes is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body body (optional)
   * @return Worktype
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Worktype> postTaskmanagementWorktypesWithHttpInfo(WorktypeCreate body) throws IOException {
    return postTaskmanagementWorktypes(createPostTaskmanagementWorktypesRequest(body).withHttpInfo());
  }

  private PostTaskmanagementWorktypesRequest createPostTaskmanagementWorktypesRequest(WorktypeCreate body) {
    return PostTaskmanagementWorktypesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a worktype
   * 
   * postTaskmanagementWorktypes is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return Worktype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Worktype postTaskmanagementWorktypes(PostTaskmanagementWorktypesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Worktype> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Worktype>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a worktype
   * 
   * postTaskmanagementWorktypes is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Worktype> postTaskmanagementWorktypes(ApiRequest<WorktypeCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Worktype>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Worktype> response = (ApiResponse<Worktype>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Worktype> response = (ApiResponse<Worktype>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for worktypes
   * 
   * postTaskmanagementWorktypesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body QueryPostRequest (required)
   * @return WorktypeQueryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorktypeQueryEntityListing postTaskmanagementWorktypesQuery(WorktypeQueryRequest body) throws IOException, ApiException {
    return  postTaskmanagementWorktypesQuery(createPostTaskmanagementWorktypesQueryRequest(body));
  }

  /**
   * Query for worktypes
   * 
   * postTaskmanagementWorktypesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body QueryPostRequest (required)
   * @return WorktypeQueryEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorktypeQueryEntityListing> postTaskmanagementWorktypesQueryWithHttpInfo(WorktypeQueryRequest body) throws IOException {
    return postTaskmanagementWorktypesQuery(createPostTaskmanagementWorktypesQueryRequest(body).withHttpInfo());
  }

  private PostTaskmanagementWorktypesQueryRequest createPostTaskmanagementWorktypesQueryRequest(WorktypeQueryRequest body) {
    return PostTaskmanagementWorktypesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for worktypes
   * 
   * postTaskmanagementWorktypesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return WorktypeQueryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorktypeQueryEntityListing postTaskmanagementWorktypesQuery(PostTaskmanagementWorktypesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorktypeQueryEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorktypeQueryEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for worktypes
   * 
   * postTaskmanagementWorktypesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorktypeQueryEntityListing> postTaskmanagementWorktypesQuery(ApiRequest<WorktypeQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorktypeQueryEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorktypeQueryEntityListing> response = (ApiResponse<WorktypeQueryEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorktypeQueryEntityListing> response = (ApiResponse<WorktypeQueryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a schema
   * 
   * putTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @param body Data Schema (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema putTaskmanagementWorkitemsSchema(String schemaId, DataSchema body) throws IOException, ApiException {
    return  putTaskmanagementWorkitemsSchema(createPutTaskmanagementWorkitemsSchemaRequest(schemaId, body));
  }

  /**
   * Update a schema
   * 
   * putTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @param body Data Schema (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> putTaskmanagementWorkitemsSchemaWithHttpInfo(String schemaId, DataSchema body) throws IOException {
    return putTaskmanagementWorkitemsSchema(createPutTaskmanagementWorkitemsSchemaRequest(schemaId, body).withHttpInfo());
  }

  private PutTaskmanagementWorkitemsSchemaRequest createPutTaskmanagementWorkitemsSchemaRequest(String schemaId, DataSchema body) {
    return PutTaskmanagementWorkitemsSchemaRequest.builder()
            .withSchemaId(schemaId)

            .withBody(body)

            .build();
  }

  /**
   * Update a schema
   * 
   * putTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema putTaskmanagementWorkitemsSchema(PutTaskmanagementWorkitemsSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a schema
   * 
   * putTaskmanagementWorkitemsSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> putTaskmanagementWorkitemsSchema(ApiRequest<DataSchema> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
