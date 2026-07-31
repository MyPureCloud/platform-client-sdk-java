package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.BulkAddDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.BulkAddDecisionTableRowsResponse;
import com.mypurecloud.sdk.v2.model.BulkDeleteDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.BulkUpdateDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.BulkUpdateDecisionTableRowsResponse;
import com.mypurecloud.sdk.v2.model.BusinessRulesDataSchema;
import com.mypurecloud.sdk.v2.model.BusinessRulesDataSchemaListing;
import com.mypurecloud.sdk.v2.model.BusinessRulesSchemaCreateRequest;
import com.mypurecloud.sdk.v2.model.BusinessRulesSchemaUpdateRequest;
import com.mypurecloud.sdk.v2.model.CopyDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CoretypeListing;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableImportJobRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableVersionRequest;
import com.mypurecloud.sdk.v2.model.DecisionTable;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionRequest;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionResponse;
import com.mypurecloud.sdk.v2.model.DecisionTableExportJob;
import com.mypurecloud.sdk.v2.model.DecisionTableExportJobListing;
import com.mypurecloud.sdk.v2.model.DecisionTableExportJobRequest;
import com.mypurecloud.sdk.v2.model.DecisionTableImportJob;
import com.mypurecloud.sdk.v2.model.DecisionTableImportJobListing;
import com.mypurecloud.sdk.v2.model.DecisionTableListing;
import com.mypurecloud.sdk.v2.model.DecisionTableRow;
import com.mypurecloud.sdk.v2.model.DecisionTableRowListing;
import com.mypurecloud.sdk.v2.model.DecisionTableVersion;
import com.mypurecloud.sdk.v2.model.DecisionTableVersionListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.PutDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.SearchDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableImportJobRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableVersionRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableExportRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableImportRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableVersionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableVersionRowRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableExportRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableExportsRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableImportRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableImportsRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableVersionRowRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableVersionRowsRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontablesRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontablesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesSchemasCoretypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesSchemasCoretypesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchBusinessrulesDecisiontableRequest;
import com.mypurecloud.sdk.v2.api.request.PatchBusinessrulesDecisiontableImportRequest;
import com.mypurecloud.sdk.v2.api.request.PatchBusinessrulesDecisiontableVersionRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableExecuteRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableExportsRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableImportsRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionExecuteRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionRowsRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionRowsBulkAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionRowsBulkRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionRowsBulkUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionRowsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionSyncRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontablesRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.PutBusinessrulesDecisiontableVersionPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PutBusinessrulesDecisiontableVersionRowRequest;
import com.mypurecloud.sdk.v2.api.request.PutBusinessrulesSchemaRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessRulesApi {
  private final ApiClient pcapiClient;

  public BusinessRulesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BusinessRulesApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a decision table
   * 
   * @param tableId Table ID (required)
   * @param forceDelete Force delete decision table (under certain conditions) (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteBusinessrulesDecisiontable(String tableId, Boolean forceDelete) throws IOException, ApiException {
     deleteBusinessrulesDecisiontable(createDeleteBusinessrulesDecisiontableRequest(tableId, forceDelete));
  }

  /**
   * Delete a decision table
   * 
   * @param tableId Table ID (required)
   * @param forceDelete Force delete decision table (under certain conditions) (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteBusinessrulesDecisiontableWithHttpInfo(String tableId, Boolean forceDelete) throws IOException {
    return deleteBusinessrulesDecisiontable(createDeleteBusinessrulesDecisiontableRequest(tableId, forceDelete).withHttpInfo());
  }

  private DeleteBusinessrulesDecisiontableRequest createDeleteBusinessrulesDecisiontableRequest(String tableId, Boolean forceDelete) {
    return DeleteBusinessrulesDecisiontableRequest.builder()
            .withTableId(tableId)

            .withForceDelete(forceDelete)

            .build();
  }

  /**
   * Delete a decision table
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteBusinessrulesDecisiontable(DeleteBusinessrulesDecisiontableRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a decision table
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteBusinessrulesDecisiontable(ApiRequest<Void> request) throws IOException {
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
   * Delete an export job for a decision table
   * 
   * @param tableId Table ID (required)
   * @param exportJobId Export Job ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteBusinessrulesDecisiontableExport(String tableId, String exportJobId) throws IOException, ApiException {
     deleteBusinessrulesDecisiontableExport(createDeleteBusinessrulesDecisiontableExportRequest(tableId, exportJobId));
  }

  /**
   * Delete an export job for a decision table
   * 
   * @param tableId Table ID (required)
   * @param exportJobId Export Job ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteBusinessrulesDecisiontableExportWithHttpInfo(String tableId, String exportJobId) throws IOException {
    return deleteBusinessrulesDecisiontableExport(createDeleteBusinessrulesDecisiontableExportRequest(tableId, exportJobId).withHttpInfo());
  }

  private DeleteBusinessrulesDecisiontableExportRequest createDeleteBusinessrulesDecisiontableExportRequest(String tableId, String exportJobId) {
    return DeleteBusinessrulesDecisiontableExportRequest.builder()
            .withTableId(tableId)

            .withExportJobId(exportJobId)

            .build();
  }

  /**
   * Delete an export job for a decision table
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteBusinessrulesDecisiontableExport(DeleteBusinessrulesDecisiontableExportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an export job for a decision table
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteBusinessrulesDecisiontableExport(ApiRequest<Void> request) throws IOException {
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
   * Delete decision table row import job
   * 
   * @param tableId Table ID (required)
   * @param importJobId Import job ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteBusinessrulesDecisiontableImport(String tableId, String importJobId) throws IOException, ApiException {
     deleteBusinessrulesDecisiontableImport(createDeleteBusinessrulesDecisiontableImportRequest(tableId, importJobId));
  }

  /**
   * Delete decision table row import job
   * 
   * @param tableId Table ID (required)
   * @param importJobId Import job ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteBusinessrulesDecisiontableImportWithHttpInfo(String tableId, String importJobId) throws IOException {
    return deleteBusinessrulesDecisiontableImport(createDeleteBusinessrulesDecisiontableImportRequest(tableId, importJobId).withHttpInfo());
  }

  private DeleteBusinessrulesDecisiontableImportRequest createDeleteBusinessrulesDecisiontableImportRequest(String tableId, String importJobId) {
    return DeleteBusinessrulesDecisiontableImportRequest.builder()
            .withTableId(tableId)

            .withImportJobId(importJobId)

            .build();
  }

  /**
   * Delete decision table row import job
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteBusinessrulesDecisiontableImport(DeleteBusinessrulesDecisiontableImportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete decision table row import job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteBusinessrulesDecisiontableImport(ApiRequest<Void> request) throws IOException {
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
   * Delete a decision table version
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteBusinessrulesDecisiontableVersion(String tableId, Integer tableVersion) throws IOException, ApiException {
     deleteBusinessrulesDecisiontableVersion(createDeleteBusinessrulesDecisiontableVersionRequest(tableId, tableVersion));
  }

  /**
   * Delete a decision table version
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteBusinessrulesDecisiontableVersionWithHttpInfo(String tableId, Integer tableVersion) throws IOException {
    return deleteBusinessrulesDecisiontableVersion(createDeleteBusinessrulesDecisiontableVersionRequest(tableId, tableVersion).withHttpInfo());
  }

  private DeleteBusinessrulesDecisiontableVersionRequest createDeleteBusinessrulesDecisiontableVersionRequest(String tableId, Integer tableVersion) {
    return DeleteBusinessrulesDecisiontableVersionRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .build();
  }

  /**
   * Delete a decision table version
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteBusinessrulesDecisiontableVersion(DeleteBusinessrulesDecisiontableVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a decision table version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteBusinessrulesDecisiontableVersion(ApiRequest<Void> request) throws IOException {
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
   * Delete a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param rowId Row ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteBusinessrulesDecisiontableVersionRow(String tableId, Integer tableVersion, String rowId) throws IOException, ApiException {
     deleteBusinessrulesDecisiontableVersionRow(createDeleteBusinessrulesDecisiontableVersionRowRequest(tableId, tableVersion, rowId));
  }

  /**
   * Delete a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param rowId Row ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteBusinessrulesDecisiontableVersionRowWithHttpInfo(String tableId, Integer tableVersion, String rowId) throws IOException {
    return deleteBusinessrulesDecisiontableVersionRow(createDeleteBusinessrulesDecisiontableVersionRowRequest(tableId, tableVersion, rowId).withHttpInfo());
  }

  private DeleteBusinessrulesDecisiontableVersionRowRequest createDeleteBusinessrulesDecisiontableVersionRowRequest(String tableId, Integer tableVersion, String rowId) {
    return DeleteBusinessrulesDecisiontableVersionRowRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withRowId(rowId)

            .build();
  }

  /**
   * Delete a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteBusinessrulesDecisiontableVersionRow(DeleteBusinessrulesDecisiontableVersionRowRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteBusinessrulesDecisiontableVersionRow(ApiRequest<Void> request) throws IOException {
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
   * @param schemaId Schema ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteBusinessrulesSchema(String schemaId) throws IOException, ApiException {
     deleteBusinessrulesSchema(createDeleteBusinessrulesSchemaRequest(schemaId));
  }

  /**
   * Delete a schema
   * 
   * @param schemaId Schema ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteBusinessrulesSchemaWithHttpInfo(String schemaId) throws IOException {
    return deleteBusinessrulesSchema(createDeleteBusinessrulesSchemaRequest(schemaId).withHttpInfo());
  }

  private DeleteBusinessrulesSchemaRequest createDeleteBusinessrulesSchemaRequest(String schemaId) {
    return DeleteBusinessrulesSchemaRequest.builder()
            .withSchemaId(schemaId)

            .build();
  }

  /**
   * Delete a schema
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteBusinessrulesSchema(DeleteBusinessrulesSchemaRequest request) throws IOException, ApiException {
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
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteBusinessrulesSchema(ApiRequest<Void> request) throws IOException {
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
   * Get a decision table
   * 
   * @param tableId Table ID (required)
   * @return DecisionTable
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTable getBusinessrulesDecisiontable(String tableId) throws IOException, ApiException {
    return  getBusinessrulesDecisiontable(createGetBusinessrulesDecisiontableRequest(tableId));
  }

  /**
   * Get a decision table
   * 
   * @param tableId Table ID (required)
   * @return DecisionTable
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTable> getBusinessrulesDecisiontableWithHttpInfo(String tableId) throws IOException {
    return getBusinessrulesDecisiontable(createGetBusinessrulesDecisiontableRequest(tableId).withHttpInfo());
  }

  private GetBusinessrulesDecisiontableRequest createGetBusinessrulesDecisiontableRequest(String tableId) {
    return GetBusinessrulesDecisiontableRequest.builder()
            .withTableId(tableId)

            .build();
  }

  /**
   * Get a decision table
   * 
   * @param request The request object
   * @return DecisionTable
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTable getBusinessrulesDecisiontable(GetBusinessrulesDecisiontableRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTable> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTable>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a decision table
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTable> getBusinessrulesDecisiontable(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTable>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTable> response = (ApiResponse<DecisionTable>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTable> response = (ApiResponse<DecisionTable>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an export job for a decision table
   * 
   * @param tableId Table ID (required)
   * @param exportJobId Export Job ID (required)
   * @return DecisionTableExportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableExportJob getBusinessrulesDecisiontableExport(String tableId, String exportJobId) throws IOException, ApiException {
    return  getBusinessrulesDecisiontableExport(createGetBusinessrulesDecisiontableExportRequest(tableId, exportJobId));
  }

  /**
   * Get an export job for a decision table
   * 
   * @param tableId Table ID (required)
   * @param exportJobId Export Job ID (required)
   * @return DecisionTableExportJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableExportJob> getBusinessrulesDecisiontableExportWithHttpInfo(String tableId, String exportJobId) throws IOException {
    return getBusinessrulesDecisiontableExport(createGetBusinessrulesDecisiontableExportRequest(tableId, exportJobId).withHttpInfo());
  }

  private GetBusinessrulesDecisiontableExportRequest createGetBusinessrulesDecisiontableExportRequest(String tableId, String exportJobId) {
    return GetBusinessrulesDecisiontableExportRequest.builder()
            .withTableId(tableId)

            .withExportJobId(exportJobId)

            .build();
  }

  /**
   * Get an export job for a decision table
   * 
   * @param request The request object
   * @return DecisionTableExportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableExportJob getBusinessrulesDecisiontableExport(GetBusinessrulesDecisiontableExportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableExportJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableExportJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an export job for a decision table
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableExportJob> getBusinessrulesDecisiontableExport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableExportJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableExportJob> response = (ApiResponse<DecisionTableExportJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableExportJob> response = (ApiResponse<DecisionTableExportJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * List export jobs for a decision table
   * 
   * @param tableId Table ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @return DecisionTableExportJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableExportJobListing getBusinessrulesDecisiontableExports(String tableId, String after, String pageSize) throws IOException, ApiException {
    return  getBusinessrulesDecisiontableExports(createGetBusinessrulesDecisiontableExportsRequest(tableId, after, pageSize));
  }

  /**
   * List export jobs for a decision table
   * 
   * @param tableId Table ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @return DecisionTableExportJobListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableExportJobListing> getBusinessrulesDecisiontableExportsWithHttpInfo(String tableId, String after, String pageSize) throws IOException {
    return getBusinessrulesDecisiontableExports(createGetBusinessrulesDecisiontableExportsRequest(tableId, after, pageSize).withHttpInfo());
  }

  private GetBusinessrulesDecisiontableExportsRequest createGetBusinessrulesDecisiontableExportsRequest(String tableId, String after, String pageSize) {
    return GetBusinessrulesDecisiontableExportsRequest.builder()
            .withTableId(tableId)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * List export jobs for a decision table
   * 
   * @param request The request object
   * @return DecisionTableExportJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableExportJobListing getBusinessrulesDecisiontableExports(GetBusinessrulesDecisiontableExportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableExportJobListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableExportJobListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List export jobs for a decision table
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableExportJobListing> getBusinessrulesDecisiontableExports(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableExportJobListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableExportJobListing> response = (ApiResponse<DecisionTableExportJobListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableExportJobListing> response = (ApiResponse<DecisionTableExportJobListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get decision table row import job
   * 
   * @param tableId Table ID (required)
   * @param importJobId Import job ID (required)
   * @return DecisionTableImportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableImportJob getBusinessrulesDecisiontableImport(String tableId, String importJobId) throws IOException, ApiException {
    return  getBusinessrulesDecisiontableImport(createGetBusinessrulesDecisiontableImportRequest(tableId, importJobId));
  }

  /**
   * Get decision table row import job
   * 
   * @param tableId Table ID (required)
   * @param importJobId Import job ID (required)
   * @return DecisionTableImportJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableImportJob> getBusinessrulesDecisiontableImportWithHttpInfo(String tableId, String importJobId) throws IOException {
    return getBusinessrulesDecisiontableImport(createGetBusinessrulesDecisiontableImportRequest(tableId, importJobId).withHttpInfo());
  }

  private GetBusinessrulesDecisiontableImportRequest createGetBusinessrulesDecisiontableImportRequest(String tableId, String importJobId) {
    return GetBusinessrulesDecisiontableImportRequest.builder()
            .withTableId(tableId)

            .withImportJobId(importJobId)

            .build();
  }

  /**
   * Get decision table row import job
   * 
   * @param request The request object
   * @return DecisionTableImportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableImportJob getBusinessrulesDecisiontableImport(GetBusinessrulesDecisiontableImportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableImportJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableImportJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get decision table row import job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableImportJob> getBusinessrulesDecisiontableImport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableImportJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableImportJob> response = (ApiResponse<DecisionTableImportJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableImportJob> response = (ApiResponse<DecisionTableImportJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * List decision table row import jobs
   * 
   * @param tableId Table ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @return DecisionTableImportJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableImportJobListing getBusinessrulesDecisiontableImports(String tableId, String after, String pageSize) throws IOException, ApiException {
    return  getBusinessrulesDecisiontableImports(createGetBusinessrulesDecisiontableImportsRequest(tableId, after, pageSize));
  }

  /**
   * List decision table row import jobs
   * 
   * @param tableId Table ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @return DecisionTableImportJobListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableImportJobListing> getBusinessrulesDecisiontableImportsWithHttpInfo(String tableId, String after, String pageSize) throws IOException {
    return getBusinessrulesDecisiontableImports(createGetBusinessrulesDecisiontableImportsRequest(tableId, after, pageSize).withHttpInfo());
  }

  private GetBusinessrulesDecisiontableImportsRequest createGetBusinessrulesDecisiontableImportsRequest(String tableId, String after, String pageSize) {
    return GetBusinessrulesDecisiontableImportsRequest.builder()
            .withTableId(tableId)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * List decision table row import jobs
   * 
   * @param request The request object
   * @return DecisionTableImportJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableImportJobListing getBusinessrulesDecisiontableImports(GetBusinessrulesDecisiontableImportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableImportJobListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableImportJobListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List decision table row import jobs
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableImportJobListing> getBusinessrulesDecisiontableImports(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableImportJobListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableImportJobListing> response = (ApiResponse<DecisionTableImportJobListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableImportJobListing> response = (ApiResponse<DecisionTableImportJobListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a decision table version
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion getBusinessrulesDecisiontableVersion(String tableId, Integer tableVersion) throws IOException, ApiException {
    return  getBusinessrulesDecisiontableVersion(createGetBusinessrulesDecisiontableVersionRequest(tableId, tableVersion));
  }

  /**
   * Get a decision table version
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @return DecisionTableVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> getBusinessrulesDecisiontableVersionWithHttpInfo(String tableId, Integer tableVersion) throws IOException {
    return getBusinessrulesDecisiontableVersion(createGetBusinessrulesDecisiontableVersionRequest(tableId, tableVersion).withHttpInfo());
  }

  private GetBusinessrulesDecisiontableVersionRequest createGetBusinessrulesDecisiontableVersionRequest(String tableId, Integer tableVersion) {
    return GetBusinessrulesDecisiontableVersionRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .build();
  }

  /**
   * Get a decision table version
   * 
   * @param request The request object
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion getBusinessrulesDecisiontableVersion(GetBusinessrulesDecisiontableVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a decision table version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> getBusinessrulesDecisiontableVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a decision table row
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param rowId Row ID (required)
   * @return DecisionTableRow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableRow getBusinessrulesDecisiontableVersionRow(String tableId, Integer tableVersion, String rowId) throws IOException, ApiException {
    return  getBusinessrulesDecisiontableVersionRow(createGetBusinessrulesDecisiontableVersionRowRequest(tableId, tableVersion, rowId));
  }

  /**
   * Get a decision table row
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param rowId Row ID (required)
   * @return DecisionTableRow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableRow> getBusinessrulesDecisiontableVersionRowWithHttpInfo(String tableId, Integer tableVersion, String rowId) throws IOException {
    return getBusinessrulesDecisiontableVersionRow(createGetBusinessrulesDecisiontableVersionRowRequest(tableId, tableVersion, rowId).withHttpInfo());
  }

  private GetBusinessrulesDecisiontableVersionRowRequest createGetBusinessrulesDecisiontableVersionRowRequest(String tableId, Integer tableVersion, String rowId) {
    return GetBusinessrulesDecisiontableVersionRowRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withRowId(rowId)

            .build();
  }

  /**
   * Get a decision table row
   * 
   * @param request The request object
   * @return DecisionTableRow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableRow getBusinessrulesDecisiontableVersionRow(GetBusinessrulesDecisiontableVersionRowRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableRow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableRow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a decision table row
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableRow> getBusinessrulesDecisiontableVersionRow(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableRow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableRow> response = (ApiResponse<DecisionTableRow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableRow> response = (ApiResponse<DecisionTableRow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of decision table rows.
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param pageNumber Page number of the entities to return. Defaults to 1. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. Defaults to 25. (optional)
   * @return DecisionTableRowListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableRowListing getBusinessrulesDecisiontableVersionRows(String tableId, Integer tableVersion, String pageNumber, String pageSize) throws IOException, ApiException {
    return  getBusinessrulesDecisiontableVersionRows(createGetBusinessrulesDecisiontableVersionRowsRequest(tableId, tableVersion, pageNumber, pageSize));
  }

  /**
   * Get a list of decision table rows.
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param pageNumber Page number of the entities to return. Defaults to 1. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. Defaults to 25. (optional)
   * @return DecisionTableRowListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableRowListing> getBusinessrulesDecisiontableVersionRowsWithHttpInfo(String tableId, Integer tableVersion, String pageNumber, String pageSize) throws IOException {
    return getBusinessrulesDecisiontableVersionRows(createGetBusinessrulesDecisiontableVersionRowsRequest(tableId, tableVersion, pageNumber, pageSize).withHttpInfo());
  }

  private GetBusinessrulesDecisiontableVersionRowsRequest createGetBusinessrulesDecisiontableVersionRowsRequest(String tableId, Integer tableVersion, String pageNumber, String pageSize) {
    return GetBusinessrulesDecisiontableVersionRowsRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get a list of decision table rows.
   * 
   * @param request The request object
   * @return DecisionTableRowListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableRowListing getBusinessrulesDecisiontableVersionRows(GetBusinessrulesDecisiontableVersionRowsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableRowListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableRowListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of decision table rows.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableRowListing> getBusinessrulesDecisiontableVersionRows(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableRowListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableRowListing> response = (ApiResponse<DecisionTableRowListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableRowListing> response = (ApiResponse<DecisionTableRowListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of decision table versions
   * 
   * @param tableId Table ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @return DecisionTableVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersionListing getBusinessrulesDecisiontableVersions(String tableId, String after, String pageSize) throws IOException, ApiException {
    return  getBusinessrulesDecisiontableVersions(createGetBusinessrulesDecisiontableVersionsRequest(tableId, after, pageSize));
  }

  /**
   * Get a list of decision table versions
   * 
   * @param tableId Table ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @return DecisionTableVersionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersionListing> getBusinessrulesDecisiontableVersionsWithHttpInfo(String tableId, String after, String pageSize) throws IOException {
    return getBusinessrulesDecisiontableVersions(createGetBusinessrulesDecisiontableVersionsRequest(tableId, after, pageSize).withHttpInfo());
  }

  private GetBusinessrulesDecisiontableVersionsRequest createGetBusinessrulesDecisiontableVersionsRequest(String tableId, String after, String pageSize) {
    return GetBusinessrulesDecisiontableVersionsRequest.builder()
            .withTableId(tableId)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get a list of decision table versions
   * 
   * @param request The request object
   * @return DecisionTableVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersionListing getBusinessrulesDecisiontableVersions(GetBusinessrulesDecisiontableVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableVersionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableVersionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of decision table versions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersionListing> getBusinessrulesDecisiontableVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableVersionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersionListing> response = (ApiResponse<DecisionTableVersionListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersionListing> response = (ApiResponse<DecisionTableVersionListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of decision tables.
   * 
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @param divisionIds One or more comma separated divisions to filters decision tables by. If nothing is provided, the decision tables associated with the list of divisions that the user has access to will be returned. (optional)
   * @param name Search for decision tables with a name that contains the given search string. Search is case insensitive and will match any table that contains this string in any part of the name. (optional)
   * @return DecisionTableListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableListing getBusinessrulesDecisiontables(String after, String pageSize, List<String> divisionIds, String name) throws IOException, ApiException {
    return  getBusinessrulesDecisiontables(createGetBusinessrulesDecisiontablesRequest(after, pageSize, divisionIds, name));
  }

  /**
   * Get a list of decision tables.
   * 
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @param divisionIds One or more comma separated divisions to filters decision tables by. If nothing is provided, the decision tables associated with the list of divisions that the user has access to will be returned. (optional)
   * @param name Search for decision tables with a name that contains the given search string. Search is case insensitive and will match any table that contains this string in any part of the name. (optional)
   * @return DecisionTableListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableListing> getBusinessrulesDecisiontablesWithHttpInfo(String after, String pageSize, List<String> divisionIds, String name) throws IOException {
    return getBusinessrulesDecisiontables(createGetBusinessrulesDecisiontablesRequest(after, pageSize, divisionIds, name).withHttpInfo());
  }

  private GetBusinessrulesDecisiontablesRequest createGetBusinessrulesDecisiontablesRequest(String after, String pageSize, List<String> divisionIds, String name) {
    return GetBusinessrulesDecisiontablesRequest.builder()
            .withAfter(after)

            .withPageSize(pageSize)

            .withDivisionIds(divisionIds)

            .withName(name)

            .build();
  }

  /**
   * Get a list of decision tables.
   * 
   * @param request The request object
   * @return DecisionTableListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableListing getBusinessrulesDecisiontables(GetBusinessrulesDecisiontablesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of decision tables.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableListing> getBusinessrulesDecisiontables(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableListing> response = (ApiResponse<DecisionTableListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableListing> response = (ApiResponse<DecisionTableListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Search for decision tables.
   * 
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @param schemaId Search for decision tables that use the schema with this ID. Cannot be combined with name search. Search results will not be paginated if used. (optional)
   * @param name Search for decision tables with a name that contains the given search string. Search is case insensitive and will match any table that contains this string in any part of the name. Cannot be combined with schema search. Search results will not be paginated if used. (optional)
   * @param withPublishedVersion Filters results to only decision tables that have at least one version in Published status (optional)
   * @param expand Fields to expand in response (optional)
   * @param ids Decision table IDs to search for (optional)
   * @return DecisionTableListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableListing getBusinessrulesDecisiontablesSearch(String after, String pageSize, String schemaId, String name, Boolean withPublishedVersion, List<String> expand, List<String> ids) throws IOException, ApiException {
    return  getBusinessrulesDecisiontablesSearch(createGetBusinessrulesDecisiontablesSearchRequest(after, pageSize, schemaId, name, withPublishedVersion, expand, ids));
  }

  /**
   * Search for decision tables.
   * 
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @param schemaId Search for decision tables that use the schema with this ID. Cannot be combined with name search. Search results will not be paginated if used. (optional)
   * @param name Search for decision tables with a name that contains the given search string. Search is case insensitive and will match any table that contains this string in any part of the name. Cannot be combined with schema search. Search results will not be paginated if used. (optional)
   * @param withPublishedVersion Filters results to only decision tables that have at least one version in Published status (optional)
   * @param expand Fields to expand in response (optional)
   * @param ids Decision table IDs to search for (optional)
   * @return DecisionTableListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableListing> getBusinessrulesDecisiontablesSearchWithHttpInfo(String after, String pageSize, String schemaId, String name, Boolean withPublishedVersion, List<String> expand, List<String> ids) throws IOException {
    return getBusinessrulesDecisiontablesSearch(createGetBusinessrulesDecisiontablesSearchRequest(after, pageSize, schemaId, name, withPublishedVersion, expand, ids).withHttpInfo());
  }

  private GetBusinessrulesDecisiontablesSearchRequest createGetBusinessrulesDecisiontablesSearchRequest(String after, String pageSize, String schemaId, String name, Boolean withPublishedVersion, List<String> expand, List<String> ids) {
    return GetBusinessrulesDecisiontablesSearchRequest.builder()
            .withAfter(after)

            .withPageSize(pageSize)

            .withSchemaId(schemaId)

            .withName(name)

            .withWithPublishedVersion(withPublishedVersion)

            .withExpand(expand)

            .withIds(ids)

            .build();
  }

  /**
   * Search for decision tables.
   * 
   * @param request The request object
   * @return DecisionTableListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableListing getBusinessrulesDecisiontablesSearch(GetBusinessrulesDecisiontablesSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search for decision tables.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableListing> getBusinessrulesDecisiontablesSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableListing> response = (ApiResponse<DecisionTableListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableListing> response = (ApiResponse<DecisionTableListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a schema
   * 
   * @param schemaId Schema ID (required)
   * @return BusinessRulesDataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessRulesDataSchema getBusinessrulesSchema(String schemaId) throws IOException, ApiException {
    return  getBusinessrulesSchema(createGetBusinessrulesSchemaRequest(schemaId));
  }

  /**
   * Get a schema
   * 
   * @param schemaId Schema ID (required)
   * @return BusinessRulesDataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessRulesDataSchema> getBusinessrulesSchemaWithHttpInfo(String schemaId) throws IOException {
    return getBusinessrulesSchema(createGetBusinessrulesSchemaRequest(schemaId).withHttpInfo());
  }

  private GetBusinessrulesSchemaRequest createGetBusinessrulesSchemaRequest(String schemaId) {
    return GetBusinessrulesSchemaRequest.builder()
            .withSchemaId(schemaId)

            .build();
  }

  /**
   * Get a schema
   * 
   * @param request The request object
   * @return BusinessRulesDataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessRulesDataSchema getBusinessrulesSchema(GetBusinessrulesSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessRulesDataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessRulesDataSchema>() {});
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
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessRulesDataSchema> getBusinessrulesSchema(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessRulesDataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessRulesDataSchema> response = (ApiResponse<BusinessRulesDataSchema>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessRulesDataSchema> response = (ApiResponse<BusinessRulesDataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of schemas.
   * 
   * @return BusinessRulesDataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessRulesDataSchemaListing getBusinessrulesSchemas() throws IOException, ApiException {
    return  getBusinessrulesSchemas(createGetBusinessrulesSchemasRequest());
  }

  /**
   * Get a list of schemas.
   * 
   * @return BusinessRulesDataSchemaListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessRulesDataSchemaListing> getBusinessrulesSchemasWithHttpInfo() throws IOException {
    return getBusinessrulesSchemas(createGetBusinessrulesSchemasRequest().withHttpInfo());
  }

  private GetBusinessrulesSchemasRequest createGetBusinessrulesSchemasRequest() {
    return GetBusinessrulesSchemasRequest.builder()
            .build();
  }

  /**
   * Get a list of schemas.
   * 
   * @param request The request object
   * @return BusinessRulesDataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessRulesDataSchemaListing getBusinessrulesSchemas(GetBusinessrulesSchemasRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessRulesDataSchemaListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessRulesDataSchemaListing>() {});
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
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessRulesDataSchemaListing> getBusinessrulesSchemas(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessRulesDataSchemaListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessRulesDataSchemaListing> response = (ApiResponse<BusinessRulesDataSchemaListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessRulesDataSchemaListing> response = (ApiResponse<BusinessRulesDataSchemaListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a specific named core type.
   * 
   * @param coreTypeName The core type's name (required)
   * @return Coretype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Coretype getBusinessrulesSchemasCoretype(String coreTypeName) throws IOException, ApiException {
    return  getBusinessrulesSchemasCoretype(createGetBusinessrulesSchemasCoretypeRequest(coreTypeName));
  }

  /**
   * Get a specific named core type.
   * 
   * @param coreTypeName The core type's name (required)
   * @return Coretype
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Coretype> getBusinessrulesSchemasCoretypeWithHttpInfo(String coreTypeName) throws IOException {
    return getBusinessrulesSchemasCoretype(createGetBusinessrulesSchemasCoretypeRequest(coreTypeName).withHttpInfo());
  }

  private GetBusinessrulesSchemasCoretypeRequest createGetBusinessrulesSchemasCoretypeRequest(String coreTypeName) {
    return GetBusinessrulesSchemasCoretypeRequest.builder()
            .withCoreTypeName(coreTypeName)

            .build();
  }

  /**
   * Get a specific named core type.
   * 
   * @param request The request object
   * @return Coretype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Coretype getBusinessrulesSchemasCoretype(GetBusinessrulesSchemasCoretypeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Coretype> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Coretype>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a specific named core type.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Coretype> getBusinessrulesSchemasCoretype(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Coretype>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @return CoretypeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoretypeListing getBusinessrulesSchemasCoretypes() throws IOException, ApiException {
    return  getBusinessrulesSchemasCoretypes(createGetBusinessrulesSchemasCoretypesRequest());
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @return CoretypeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoretypeListing> getBusinessrulesSchemasCoretypesWithHttpInfo() throws IOException {
    return getBusinessrulesSchemasCoretypes(createGetBusinessrulesSchemasCoretypesRequest().withHttpInfo());
  }

  private GetBusinessrulesSchemasCoretypesRequest createGetBusinessrulesSchemasCoretypesRequest() {
    return GetBusinessrulesSchemasCoretypesRequest.builder()
            .build();
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @param request The request object
   * @return CoretypeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoretypeListing getBusinessrulesSchemasCoretypes(GetBusinessrulesSchemasCoretypesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoretypeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoretypeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoretypeListing> getBusinessrulesSchemasCoretypes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoretypeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a decision table
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param body Decision Table (required)
   * @return DecisionTable
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTable patchBusinessrulesDecisiontable(String tableId, UpdateDecisionTableRequest body) throws IOException, ApiException {
    return  patchBusinessrulesDecisiontable(createPatchBusinessrulesDecisiontableRequest(tableId, body));
  }

  /**
   * Update a decision table
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param body Decision Table (required)
   * @return DecisionTable
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTable> patchBusinessrulesDecisiontableWithHttpInfo(String tableId, UpdateDecisionTableRequest body) throws IOException {
    return patchBusinessrulesDecisiontable(createPatchBusinessrulesDecisiontableRequest(tableId, body).withHttpInfo());
  }

  private PatchBusinessrulesDecisiontableRequest createPatchBusinessrulesDecisiontableRequest(String tableId, UpdateDecisionTableRequest body) {
    return PatchBusinessrulesDecisiontableRequest.builder()
            .withTableId(tableId)

            .withBody(body)

            .build();
  }

  /**
   * Update a decision table
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return DecisionTable
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTable patchBusinessrulesDecisiontable(PatchBusinessrulesDecisiontableRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTable> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTable>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a decision table
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTable> patchBusinessrulesDecisiontable(ApiRequest<UpdateDecisionTableRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTable>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTable> response = (ApiResponse<DecisionTable>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTable> response = (ApiResponse<DecisionTable>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update decision table row import job
   * Cancels an in-progress import job by supplying a status of Cancelled. Cancellation is idempotent: cancelling a job that is already Cancelled returns 200 with the cancelled job. Cancelling a job that is still Uploading or Processing returns 200. A job that has already finished (Complete or Failed) can no longer be cancelled.
   * @param tableId Table ID (required)
   * @param importJobId Import job ID (required)
   * @param body Import job update request (required)
   * @return DecisionTableImportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableImportJob patchBusinessrulesDecisiontableImport(String tableId, String importJobId, UpdateDecisionTableImportJobRequest body) throws IOException, ApiException {
    return  patchBusinessrulesDecisiontableImport(createPatchBusinessrulesDecisiontableImportRequest(tableId, importJobId, body));
  }

  /**
   * Update decision table row import job
   * Cancels an in-progress import job by supplying a status of Cancelled. Cancellation is idempotent: cancelling a job that is already Cancelled returns 200 with the cancelled job. Cancelling a job that is still Uploading or Processing returns 200. A job that has already finished (Complete or Failed) can no longer be cancelled.
   * @param tableId Table ID (required)
   * @param importJobId Import job ID (required)
   * @param body Import job update request (required)
   * @return DecisionTableImportJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableImportJob> patchBusinessrulesDecisiontableImportWithHttpInfo(String tableId, String importJobId, UpdateDecisionTableImportJobRequest body) throws IOException {
    return patchBusinessrulesDecisiontableImport(createPatchBusinessrulesDecisiontableImportRequest(tableId, importJobId, body).withHttpInfo());
  }

  private PatchBusinessrulesDecisiontableImportRequest createPatchBusinessrulesDecisiontableImportRequest(String tableId, String importJobId, UpdateDecisionTableImportJobRequest body) {
    return PatchBusinessrulesDecisiontableImportRequest.builder()
            .withTableId(tableId)

            .withImportJobId(importJobId)

            .withBody(body)

            .build();
  }

  /**
   * Update decision table row import job
   * Cancels an in-progress import job by supplying a status of Cancelled. Cancellation is idempotent: cancelling a job that is already Cancelled returns 200 with the cancelled job. Cancelling a job that is still Uploading or Processing returns 200. A job that has already finished (Complete or Failed) can no longer be cancelled.
   * @param request The request object
   * @return DecisionTableImportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableImportJob patchBusinessrulesDecisiontableImport(PatchBusinessrulesDecisiontableImportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableImportJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableImportJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update decision table row import job
   * Cancels an in-progress import job by supplying a status of Cancelled. Cancellation is idempotent: cancelling a job that is already Cancelled returns 200 with the cancelled job. Cancelling a job that is still Uploading or Processing returns 200. A job that has already finished (Complete or Failed) can no longer be cancelled.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableImportJob> patchBusinessrulesDecisiontableImport(ApiRequest<UpdateDecisionTableImportJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableImportJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableImportJob> response = (ApiResponse<DecisionTableImportJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableImportJob> response = (ApiResponse<DecisionTableImportJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a decision table version
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Decision Table (required)
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion patchBusinessrulesDecisiontableVersion(String tableId, Integer tableVersion, UpdateDecisionTableVersionRequest body) throws IOException, ApiException {
    return  patchBusinessrulesDecisiontableVersion(createPatchBusinessrulesDecisiontableVersionRequest(tableId, tableVersion, body));
  }

  /**
   * Update a decision table version
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Decision Table (required)
   * @return DecisionTableVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> patchBusinessrulesDecisiontableVersionWithHttpInfo(String tableId, Integer tableVersion, UpdateDecisionTableVersionRequest body) throws IOException {
    return patchBusinessrulesDecisiontableVersion(createPatchBusinessrulesDecisiontableVersionRequest(tableId, tableVersion, body).withHttpInfo());
  }

  private PatchBusinessrulesDecisiontableVersionRequest createPatchBusinessrulesDecisiontableVersionRequest(String tableId, Integer tableVersion, UpdateDecisionTableVersionRequest body) {
    return PatchBusinessrulesDecisiontableVersionRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withBody(body)

            .build();
  }

  /**
   * Update a decision table version
   * 
   * @param request The request object
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion patchBusinessrulesDecisiontableVersion(PatchBusinessrulesDecisiontableVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a decision table version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> patchBusinessrulesDecisiontableVersion(ApiRequest<UpdateDecisionTableVersionRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Execute a published decision table
   * Example request payload: {\"inputs\":{\"schemaPropertykey1\":\"inputValue1\",\"schemaPropertykey2\":\"inputValue2\"}}
   * @param tableId Table ID (required)
   * @param body Decision Table (required)
   * @return DecisionTableExecutionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableExecutionResponse postBusinessrulesDecisiontableExecute(String tableId, DecisionTableExecutionRequest body) throws IOException, ApiException {
    return  postBusinessrulesDecisiontableExecute(createPostBusinessrulesDecisiontableExecuteRequest(tableId, body));
  }

  /**
   * Execute a published decision table
   * Example request payload: {\"inputs\":{\"schemaPropertykey1\":\"inputValue1\",\"schemaPropertykey2\":\"inputValue2\"}}
   * @param tableId Table ID (required)
   * @param body Decision Table (required)
   * @return DecisionTableExecutionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableExecutionResponse> postBusinessrulesDecisiontableExecuteWithHttpInfo(String tableId, DecisionTableExecutionRequest body) throws IOException {
    return postBusinessrulesDecisiontableExecute(createPostBusinessrulesDecisiontableExecuteRequest(tableId, body).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableExecuteRequest createPostBusinessrulesDecisiontableExecuteRequest(String tableId, DecisionTableExecutionRequest body) {
    return PostBusinessrulesDecisiontableExecuteRequest.builder()
            .withTableId(tableId)

            .withBody(body)

            .build();
  }

  /**
   * Execute a published decision table
   * Example request payload: {\"inputs\":{\"schemaPropertykey1\":\"inputValue1\",\"schemaPropertykey2\":\"inputValue2\"}}
   * @param request The request object
   * @return DecisionTableExecutionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableExecutionResponse postBusinessrulesDecisiontableExecute(PostBusinessrulesDecisiontableExecuteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableExecutionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableExecutionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Execute a published decision table
   * Example request payload: {\"inputs\":{\"schemaPropertykey1\":\"inputValue1\",\"schemaPropertykey2\":\"inputValue2\"}}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableExecutionResponse> postBusinessrulesDecisiontableExecute(ApiRequest<DecisionTableExecutionRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableExecutionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableExecutionResponse> response = (ApiResponse<DecisionTableExecutionResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableExecutionResponse> response = (ApiResponse<DecisionTableExecutionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an export job for a decision table version
   * 
   * @param tableId Table ID (required)
   * @param body Export job request (required)
   * @return DecisionTableExportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableExportJob postBusinessrulesDecisiontableExports(String tableId, DecisionTableExportJobRequest body) throws IOException, ApiException {
    return  postBusinessrulesDecisiontableExports(createPostBusinessrulesDecisiontableExportsRequest(tableId, body));
  }

  /**
   * Create an export job for a decision table version
   * 
   * @param tableId Table ID (required)
   * @param body Export job request (required)
   * @return DecisionTableExportJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableExportJob> postBusinessrulesDecisiontableExportsWithHttpInfo(String tableId, DecisionTableExportJobRequest body) throws IOException {
    return postBusinessrulesDecisiontableExports(createPostBusinessrulesDecisiontableExportsRequest(tableId, body).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableExportsRequest createPostBusinessrulesDecisiontableExportsRequest(String tableId, DecisionTableExportJobRequest body) {
    return PostBusinessrulesDecisiontableExportsRequest.builder()
            .withTableId(tableId)

            .withBody(body)

            .build();
  }

  /**
   * Create an export job for a decision table version
   * 
   * @param request The request object
   * @return DecisionTableExportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableExportJob postBusinessrulesDecisiontableExports(PostBusinessrulesDecisiontableExportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableExportJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableExportJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an export job for a decision table version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableExportJob> postBusinessrulesDecisiontableExports(ApiRequest<DecisionTableExportJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableExportJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableExportJob> response = (ApiResponse<DecisionTableExportJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableExportJob> response = (ApiResponse<DecisionTableExportJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a decision table row import job
   * 
   * @param tableId Table ID (required)
   * @param body Import job create request (required)
   * @return DecisionTableImportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableImportJob postBusinessrulesDecisiontableImports(String tableId, CreateDecisionTableImportJobRequest body) throws IOException, ApiException {
    return  postBusinessrulesDecisiontableImports(createPostBusinessrulesDecisiontableImportsRequest(tableId, body));
  }

  /**
   * Create a decision table row import job
   * 
   * @param tableId Table ID (required)
   * @param body Import job create request (required)
   * @return DecisionTableImportJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableImportJob> postBusinessrulesDecisiontableImportsWithHttpInfo(String tableId, CreateDecisionTableImportJobRequest body) throws IOException {
    return postBusinessrulesDecisiontableImports(createPostBusinessrulesDecisiontableImportsRequest(tableId, body).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableImportsRequest createPostBusinessrulesDecisiontableImportsRequest(String tableId, CreateDecisionTableImportJobRequest body) {
    return PostBusinessrulesDecisiontableImportsRequest.builder()
            .withTableId(tableId)

            .withBody(body)

            .build();
  }

  /**
   * Create a decision table row import job
   * 
   * @param request The request object
   * @return DecisionTableImportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableImportJob postBusinessrulesDecisiontableImports(PostBusinessrulesDecisiontableImportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableImportJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableImportJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a decision table row import job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableImportJob> postBusinessrulesDecisiontableImports(ApiRequest<CreateDecisionTableImportJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableImportJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableImportJob> response = (ApiResponse<DecisionTableImportJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableImportJob> response = (ApiResponse<DecisionTableImportJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Copy a decision table version
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Decision Table (required)
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion postBusinessrulesDecisiontableVersionCopy(String tableId, Integer tableVersion, CopyDecisionTableRequest body) throws IOException, ApiException {
    return  postBusinessrulesDecisiontableVersionCopy(createPostBusinessrulesDecisiontableVersionCopyRequest(tableId, tableVersion, body));
  }

  /**
   * Copy a decision table version
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Decision Table (required)
   * @return DecisionTableVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> postBusinessrulesDecisiontableVersionCopyWithHttpInfo(String tableId, Integer tableVersion, CopyDecisionTableRequest body) throws IOException {
    return postBusinessrulesDecisiontableVersionCopy(createPostBusinessrulesDecisiontableVersionCopyRequest(tableId, tableVersion, body).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableVersionCopyRequest createPostBusinessrulesDecisiontableVersionCopyRequest(String tableId, Integer tableVersion, CopyDecisionTableRequest body) {
    return PostBusinessrulesDecisiontableVersionCopyRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withBody(body)

            .build();
  }

  /**
   * Copy a decision table version
   * 
   * @param request The request object
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion postBusinessrulesDecisiontableVersionCopy(PostBusinessrulesDecisiontableVersionCopyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Copy a decision table version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> postBusinessrulesDecisiontableVersionCopy(ApiRequest<CopyDecisionTableRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Execute a decision table version
   * Example request payload: {\"inputs\":{\"schemaPropertykey1\":\"inputValue1\",\"schemaPropertykey2\":\"inputValue2\"}}
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Decision Table (required)
   * @return DecisionTableExecutionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableExecutionResponse postBusinessrulesDecisiontableVersionExecute(String tableId, Integer tableVersion, DecisionTableExecutionRequest body) throws IOException, ApiException {
    return  postBusinessrulesDecisiontableVersionExecute(createPostBusinessrulesDecisiontableVersionExecuteRequest(tableId, tableVersion, body));
  }

  /**
   * Execute a decision table version
   * Example request payload: {\"inputs\":{\"schemaPropertykey1\":\"inputValue1\",\"schemaPropertykey2\":\"inputValue2\"}}
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Decision Table (required)
   * @return DecisionTableExecutionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableExecutionResponse> postBusinessrulesDecisiontableVersionExecuteWithHttpInfo(String tableId, Integer tableVersion, DecisionTableExecutionRequest body) throws IOException {
    return postBusinessrulesDecisiontableVersionExecute(createPostBusinessrulesDecisiontableVersionExecuteRequest(tableId, tableVersion, body).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableVersionExecuteRequest createPostBusinessrulesDecisiontableVersionExecuteRequest(String tableId, Integer tableVersion, DecisionTableExecutionRequest body) {
    return PostBusinessrulesDecisiontableVersionExecuteRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withBody(body)

            .build();
  }

  /**
   * Execute a decision table version
   * Example request payload: {\"inputs\":{\"schemaPropertykey1\":\"inputValue1\",\"schemaPropertykey2\":\"inputValue2\"}}
   * @param request The request object
   * @return DecisionTableExecutionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableExecutionResponse postBusinessrulesDecisiontableVersionExecute(PostBusinessrulesDecisiontableVersionExecuteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableExecutionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableExecutionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Execute a decision table version
   * Example request payload: {\"inputs\":{\"schemaPropertykey1\":\"inputValue1\",\"schemaPropertykey2\":\"inputValue2\"}}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableExecutionResponse> postBusinessrulesDecisiontableVersionExecute(ApiRequest<DecisionTableExecutionRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableExecutionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableExecutionResponse> response = (ApiResponse<DecisionTableExecutionResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableExecutionResponse> response = (ApiResponse<DecisionTableExecutionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Create decision table row request (required)
   * @return DecisionTableRow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableRow postBusinessrulesDecisiontableVersionRows(String tableId, Integer tableVersion, CreateDecisionTableRowRequest body) throws IOException, ApiException {
    return  postBusinessrulesDecisiontableVersionRows(createPostBusinessrulesDecisiontableVersionRowsRequest(tableId, tableVersion, body));
  }

  /**
   * Create a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Create decision table row request (required)
   * @return DecisionTableRow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableRow> postBusinessrulesDecisiontableVersionRowsWithHttpInfo(String tableId, Integer tableVersion, CreateDecisionTableRowRequest body) throws IOException {
    return postBusinessrulesDecisiontableVersionRows(createPostBusinessrulesDecisiontableVersionRowsRequest(tableId, tableVersion, body).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableVersionRowsRequest createPostBusinessrulesDecisiontableVersionRowsRequest(String tableId, Integer tableVersion, CreateDecisionTableRowRequest body) {
    return PostBusinessrulesDecisiontableVersionRowsRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withBody(body)

            .build();
  }

  /**
   * Create a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return DecisionTableRow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableRow postBusinessrulesDecisiontableVersionRows(PostBusinessrulesDecisiontableVersionRowsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableRow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableRow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableRow> postBusinessrulesDecisiontableVersionRows(ApiRequest<CreateDecisionTableRowRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableRow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableRow> response = (ApiResponse<DecisionTableRow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableRow> response = (ApiResponse<DecisionTableRow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Bulk add decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Bulk add decision table rows request (required)
   * @return BulkAddDecisionTableRowsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkAddDecisionTableRowsResponse postBusinessrulesDecisiontableVersionRowsBulkAdd(String tableId, Integer tableVersion, BulkAddDecisionTableRowsRequest body) throws IOException, ApiException {
    return  postBusinessrulesDecisiontableVersionRowsBulkAdd(createPostBusinessrulesDecisiontableVersionRowsBulkAddRequest(tableId, tableVersion, body));
  }

  /**
   * Bulk add decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Bulk add decision table rows request (required)
   * @return BulkAddDecisionTableRowsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkAddDecisionTableRowsResponse> postBusinessrulesDecisiontableVersionRowsBulkAddWithHttpInfo(String tableId, Integer tableVersion, BulkAddDecisionTableRowsRequest body) throws IOException {
    return postBusinessrulesDecisiontableVersionRowsBulkAdd(createPostBusinessrulesDecisiontableVersionRowsBulkAddRequest(tableId, tableVersion, body).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableVersionRowsBulkAddRequest createPostBusinessrulesDecisiontableVersionRowsBulkAddRequest(String tableId, Integer tableVersion, BulkAddDecisionTableRowsRequest body) {
    return PostBusinessrulesDecisiontableVersionRowsBulkAddRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withBody(body)

            .build();
  }

  /**
   * Bulk add decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return BulkAddDecisionTableRowsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkAddDecisionTableRowsResponse postBusinessrulesDecisiontableVersionRowsBulkAdd(PostBusinessrulesDecisiontableVersionRowsBulkAddRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkAddDecisionTableRowsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkAddDecisionTableRowsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk add decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkAddDecisionTableRowsResponse> postBusinessrulesDecisiontableVersionRowsBulkAdd(ApiRequest<BulkAddDecisionTableRowsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkAddDecisionTableRowsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkAddDecisionTableRowsResponse> response = (ApiResponse<BulkAddDecisionTableRowsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BulkAddDecisionTableRowsResponse> response = (ApiResponse<BulkAddDecisionTableRowsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Bulk delete decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body  (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postBusinessrulesDecisiontableVersionRowsBulkRemove(String tableId, Integer tableVersion, BulkDeleteDecisionTableRowsRequest body) throws IOException, ApiException {
     postBusinessrulesDecisiontableVersionRowsBulkRemove(createPostBusinessrulesDecisiontableVersionRowsBulkRemoveRequest(tableId, tableVersion, body));
  }

  /**
   * Bulk delete decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body  (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postBusinessrulesDecisiontableVersionRowsBulkRemoveWithHttpInfo(String tableId, Integer tableVersion, BulkDeleteDecisionTableRowsRequest body) throws IOException {
    return postBusinessrulesDecisiontableVersionRowsBulkRemove(createPostBusinessrulesDecisiontableVersionRowsBulkRemoveRequest(tableId, tableVersion, body).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableVersionRowsBulkRemoveRequest createPostBusinessrulesDecisiontableVersionRowsBulkRemoveRequest(String tableId, Integer tableVersion, BulkDeleteDecisionTableRowsRequest body) {
    return PostBusinessrulesDecisiontableVersionRowsBulkRemoveRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withBody(body)

            .build();
  }

  /**
   * Bulk delete decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postBusinessrulesDecisiontableVersionRowsBulkRemove(PostBusinessrulesDecisiontableVersionRowsBulkRemoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Bulk delete decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postBusinessrulesDecisiontableVersionRowsBulkRemove(ApiRequest<BulkDeleteDecisionTableRowsRequest> request) throws IOException {
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
   * Bulk update decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Bulk update decision table rows request (required)
   * @return BulkUpdateDecisionTableRowsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkUpdateDecisionTableRowsResponse postBusinessrulesDecisiontableVersionRowsBulkUpdate(String tableId, Integer tableVersion, BulkUpdateDecisionTableRowsRequest body) throws IOException, ApiException {
    return  postBusinessrulesDecisiontableVersionRowsBulkUpdate(createPostBusinessrulesDecisiontableVersionRowsBulkUpdateRequest(tableId, tableVersion, body));
  }

  /**
   * Bulk update decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Bulk update decision table rows request (required)
   * @return BulkUpdateDecisionTableRowsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkUpdateDecisionTableRowsResponse> postBusinessrulesDecisiontableVersionRowsBulkUpdateWithHttpInfo(String tableId, Integer tableVersion, BulkUpdateDecisionTableRowsRequest body) throws IOException {
    return postBusinessrulesDecisiontableVersionRowsBulkUpdate(createPostBusinessrulesDecisiontableVersionRowsBulkUpdateRequest(tableId, tableVersion, body).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableVersionRowsBulkUpdateRequest createPostBusinessrulesDecisiontableVersionRowsBulkUpdateRequest(String tableId, Integer tableVersion, BulkUpdateDecisionTableRowsRequest body) {
    return PostBusinessrulesDecisiontableVersionRowsBulkUpdateRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withBody(body)

            .build();
  }

  /**
   * Bulk update decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return BulkUpdateDecisionTableRowsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkUpdateDecisionTableRowsResponse postBusinessrulesDecisiontableVersionRowsBulkUpdate(PostBusinessrulesDecisiontableVersionRowsBulkUpdateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkUpdateDecisionTableRowsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkUpdateDecisionTableRowsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk update decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkUpdateDecisionTableRowsResponse> postBusinessrulesDecisiontableVersionRowsBulkUpdate(ApiRequest<BulkUpdateDecisionTableRowsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkUpdateDecisionTableRowsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkUpdateDecisionTableRowsResponse> response = (ApiResponse<BulkUpdateDecisionTableRowsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BulkUpdateDecisionTableRowsResponse> response = (ApiResponse<BulkUpdateDecisionTableRowsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Search for decision table rows
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Search decision table rows request (required)
   * @param pageNumber Page number of the entities to return. Defaults to 1. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. Defaults to 25. (optional)
   * @return DecisionTableRowListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableRowListing postBusinessrulesDecisiontableVersionRowsSearch(String tableId, Integer tableVersion, SearchDecisionTableRowsRequest body, String pageNumber, String pageSize) throws IOException, ApiException {
    return  postBusinessrulesDecisiontableVersionRowsSearch(createPostBusinessrulesDecisiontableVersionRowsSearchRequest(tableId, tableVersion, body, pageNumber, pageSize));
  }

  /**
   * Search for decision table rows
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param body Search decision table rows request (required)
   * @param pageNumber Page number of the entities to return. Defaults to 1. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. Defaults to 25. (optional)
   * @return DecisionTableRowListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableRowListing> postBusinessrulesDecisiontableVersionRowsSearchWithHttpInfo(String tableId, Integer tableVersion, SearchDecisionTableRowsRequest body, String pageNumber, String pageSize) throws IOException {
    return postBusinessrulesDecisiontableVersionRowsSearch(createPostBusinessrulesDecisiontableVersionRowsSearchRequest(tableId, tableVersion, body, pageNumber, pageSize).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableVersionRowsSearchRequest createPostBusinessrulesDecisiontableVersionRowsSearchRequest(String tableId, Integer tableVersion, SearchDecisionTableRowsRequest body, String pageNumber, String pageSize) {
    return PostBusinessrulesDecisiontableVersionRowsSearchRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withBody(body)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Search for decision table rows
   * 
   * @param request The request object
   * @return DecisionTableRowListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableRowListing postBusinessrulesDecisiontableVersionRowsSearch(PostBusinessrulesDecisiontableVersionRowsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableRowListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableRowListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search for decision table rows
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableRowListing> postBusinessrulesDecisiontableVersionRowsSearch(ApiRequest<SearchDecisionTableRowsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableRowListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableRowListing> response = (ApiResponse<DecisionTableRowListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableRowListing> response = (ApiResponse<DecisionTableRowListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the Business Rules Schema to the latest version for a given decision table version
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion postBusinessrulesDecisiontableVersionSync(String tableId, Integer tableVersion) throws IOException, ApiException {
    return  postBusinessrulesDecisiontableVersionSync(createPostBusinessrulesDecisiontableVersionSyncRequest(tableId, tableVersion));
  }

  /**
   * Update the Business Rules Schema to the latest version for a given decision table version
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @return DecisionTableVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> postBusinessrulesDecisiontableVersionSyncWithHttpInfo(String tableId, Integer tableVersion) throws IOException {
    return postBusinessrulesDecisiontableVersionSync(createPostBusinessrulesDecisiontableVersionSyncRequest(tableId, tableVersion).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableVersionSyncRequest createPostBusinessrulesDecisiontableVersionSyncRequest(String tableId, Integer tableVersion) {
    return PostBusinessrulesDecisiontableVersionSyncRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .build();
  }

  /**
   * Update the Business Rules Schema to the latest version for a given decision table version
   * 
   * @param request The request object
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion postBusinessrulesDecisiontableVersionSync(PostBusinessrulesDecisiontableVersionSyncRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the Business Rules Schema to the latest version for a given decision table version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> postBusinessrulesDecisiontableVersionSync(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new decision table version. When sourceVersion is not provided, the draft is created from the published version.
   * 
   * @param tableId Table ID (required)
   * @param body Decision Table Version (optional)
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion postBusinessrulesDecisiontableVersions(String tableId, CreateDecisionTableVersionRequest body) throws IOException, ApiException {
    return  postBusinessrulesDecisiontableVersions(createPostBusinessrulesDecisiontableVersionsRequest(tableId, body));
  }

  /**
   * Create a new decision table version. When sourceVersion is not provided, the draft is created from the published version.
   * 
   * @param tableId Table ID (required)
   * @param body Decision Table Version (optional)
   * @return DecisionTableVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> postBusinessrulesDecisiontableVersionsWithHttpInfo(String tableId, CreateDecisionTableVersionRequest body) throws IOException {
    return postBusinessrulesDecisiontableVersions(createPostBusinessrulesDecisiontableVersionsRequest(tableId, body).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableVersionsRequest createPostBusinessrulesDecisiontableVersionsRequest(String tableId, CreateDecisionTableVersionRequest body) {
    return PostBusinessrulesDecisiontableVersionsRequest.builder()
            .withTableId(tableId)

            .withBody(body)

            .build();
  }

  /**
   * Create a new decision table version. When sourceVersion is not provided, the draft is created from the published version.
   * 
   * @param request The request object
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion postBusinessrulesDecisiontableVersions(PostBusinessrulesDecisiontableVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new decision table version. When sourceVersion is not provided, the draft is created from the published version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> postBusinessrulesDecisiontableVersions(ApiRequest<CreateDecisionTableVersionRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a decision table
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param body Decision Table (required)
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion postBusinessrulesDecisiontables(CreateDecisionTableRequest body) throws IOException, ApiException {
    return  postBusinessrulesDecisiontables(createPostBusinessrulesDecisiontablesRequest(body));
  }

  /**
   * Create a decision table
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param body Decision Table (required)
   * @return DecisionTableVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> postBusinessrulesDecisiontablesWithHttpInfo(CreateDecisionTableRequest body) throws IOException {
    return postBusinessrulesDecisiontables(createPostBusinessrulesDecisiontablesRequest(body).withHttpInfo());
  }

  private PostBusinessrulesDecisiontablesRequest createPostBusinessrulesDecisiontablesRequest(CreateDecisionTableRequest body) {
    return PostBusinessrulesDecisiontablesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a decision table
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion postBusinessrulesDecisiontables(PostBusinessrulesDecisiontablesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a decision table
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> postBusinessrulesDecisiontables(ApiRequest<CreateDecisionTableRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a schema
   * 
   * @param body Business Rules Schema Create Request (required)
   * @return BusinessRulesDataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessRulesDataSchema postBusinessrulesSchemas(BusinessRulesSchemaCreateRequest body) throws IOException, ApiException {
    return  postBusinessrulesSchemas(createPostBusinessrulesSchemasRequest(body));
  }

  /**
   * Create a schema
   * 
   * @param body Business Rules Schema Create Request (required)
   * @return BusinessRulesDataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessRulesDataSchema> postBusinessrulesSchemasWithHttpInfo(BusinessRulesSchemaCreateRequest body) throws IOException {
    return postBusinessrulesSchemas(createPostBusinessrulesSchemasRequest(body).withHttpInfo());
  }

  private PostBusinessrulesSchemasRequest createPostBusinessrulesSchemasRequest(BusinessRulesSchemaCreateRequest body) {
    return PostBusinessrulesSchemasRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a schema
   * 
   * @param request The request object
   * @return BusinessRulesDataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessRulesDataSchema postBusinessrulesSchemas(PostBusinessrulesSchemasRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessRulesDataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessRulesDataSchema>() {});
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
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessRulesDataSchema> postBusinessrulesSchemas(ApiRequest<BusinessRulesSchemaCreateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessRulesDataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessRulesDataSchema> response = (ApiResponse<BusinessRulesDataSchema>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessRulesDataSchema> response = (ApiResponse<BusinessRulesDataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Publish a decision table version
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion putBusinessrulesDecisiontableVersionPublish(String tableId, Integer tableVersion) throws IOException, ApiException {
    return  putBusinessrulesDecisiontableVersionPublish(createPutBusinessrulesDecisiontableVersionPublishRequest(tableId, tableVersion));
  }

  /**
   * Publish a decision table version
   * 
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @return DecisionTableVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> putBusinessrulesDecisiontableVersionPublishWithHttpInfo(String tableId, Integer tableVersion) throws IOException {
    return putBusinessrulesDecisiontableVersionPublish(createPutBusinessrulesDecisiontableVersionPublishRequest(tableId, tableVersion).withHttpInfo());
  }

  private PutBusinessrulesDecisiontableVersionPublishRequest createPutBusinessrulesDecisiontableVersionPublishRequest(String tableId, Integer tableVersion) {
    return PutBusinessrulesDecisiontableVersionPublishRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .build();
  }

  /**
   * Publish a decision table version
   * 
   * @param request The request object
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion putBusinessrulesDecisiontableVersionPublish(PutBusinessrulesDecisiontableVersionPublishRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish a decision table version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> putBusinessrulesDecisiontableVersionPublish(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Full update a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param rowId Row ID (required)
   * @param body Full update decision table row request (required)
   * @return DecisionTableRow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableRow putBusinessrulesDecisiontableVersionRow(String tableId, Integer tableVersion, String rowId, PutDecisionTableRowRequest body) throws IOException, ApiException {
    return  putBusinessrulesDecisiontableVersionRow(createPutBusinessrulesDecisiontableVersionRowRequest(tableId, tableVersion, rowId, body));
  }

  /**
   * Full update a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param rowId Row ID (required)
   * @param body Full update decision table row request (required)
   * @return DecisionTableRow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableRow> putBusinessrulesDecisiontableVersionRowWithHttpInfo(String tableId, Integer tableVersion, String rowId, PutDecisionTableRowRequest body) throws IOException {
    return putBusinessrulesDecisiontableVersionRow(createPutBusinessrulesDecisiontableVersionRowRequest(tableId, tableVersion, rowId, body).withHttpInfo());
  }

  private PutBusinessrulesDecisiontableVersionRowRequest createPutBusinessrulesDecisiontableVersionRowRequest(String tableId, Integer tableVersion, String rowId, PutDecisionTableRowRequest body) {
    return PutBusinessrulesDecisiontableVersionRowRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withRowId(rowId)

            .withBody(body)

            .build();
  }

  /**
   * Full update a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return DecisionTableRow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableRow putBusinessrulesDecisiontableVersionRow(PutBusinessrulesDecisiontableVersionRowRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DecisionTableRow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DecisionTableRow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Full update a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableRow> putBusinessrulesDecisiontableVersionRow(ApiRequest<PutDecisionTableRowRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DecisionTableRow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableRow> response = (ApiResponse<DecisionTableRow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DecisionTableRow> response = (ApiResponse<DecisionTableRow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a schema
   * 
   * @param schemaId Schema ID (required)
   * @param body Business Rules Schema Update Request (required)
   * @return BusinessRulesDataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessRulesDataSchema putBusinessrulesSchema(String schemaId, BusinessRulesSchemaUpdateRequest body) throws IOException, ApiException {
    return  putBusinessrulesSchema(createPutBusinessrulesSchemaRequest(schemaId, body));
  }

  /**
   * Update a schema
   * 
   * @param schemaId Schema ID (required)
   * @param body Business Rules Schema Update Request (required)
   * @return BusinessRulesDataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessRulesDataSchema> putBusinessrulesSchemaWithHttpInfo(String schemaId, BusinessRulesSchemaUpdateRequest body) throws IOException {
    return putBusinessrulesSchema(createPutBusinessrulesSchemaRequest(schemaId, body).withHttpInfo());
  }

  private PutBusinessrulesSchemaRequest createPutBusinessrulesSchemaRequest(String schemaId, BusinessRulesSchemaUpdateRequest body) {
    return PutBusinessrulesSchemaRequest.builder()
            .withSchemaId(schemaId)

            .withBody(body)

            .build();
  }

  /**
   * Update a schema
   * 
   * @param request The request object
   * @return BusinessRulesDataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessRulesDataSchema putBusinessrulesSchema(PutBusinessrulesSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessRulesDataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessRulesDataSchema>() {});
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
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessRulesDataSchema> putBusinessrulesSchema(ApiRequest<BusinessRulesSchemaUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessRulesDataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessRulesDataSchema> response = (ApiResponse<BusinessRulesDataSchema>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessRulesDataSchema> response = (ApiResponse<BusinessRulesDataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
