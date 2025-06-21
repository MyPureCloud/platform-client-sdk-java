package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.CopyDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CoretypeListing;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.DecisionTable;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionRequest;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionResponse;
import com.mypurecloud.sdk.v2.model.DecisionTableListing;
import com.mypurecloud.sdk.v2.model.DecisionTableRow;
import com.mypurecloud.sdk.v2.model.DecisionTableRowListing;
import com.mypurecloud.sdk.v2.model.DecisionTableVersion;
import com.mypurecloud.sdk.v2.model.DecisionTableVersionListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.PutDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.SearchDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableVersionRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableVersionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableVersionRowRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableRequest;
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
import com.mypurecloud.sdk.v2.api.request.PatchBusinessrulesDecisiontableVersionRequest;
import com.mypurecloud.sdk.v2.api.request.PatchBusinessrulesDecisiontableVersionRowRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableExecuteRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionExecuteRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionRowsRequest;
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
   * deleteBusinessrulesDecisiontable is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteBusinessrulesDecisiontable is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteBusinessrulesDecisiontable is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteBusinessrulesDecisiontable is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Delete a decision table version
   * 
   * deleteBusinessrulesDecisiontableVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteBusinessrulesDecisiontableVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteBusinessrulesDecisiontableVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteBusinessrulesDecisiontableVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * deleteBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * deleteBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * deleteBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * deleteBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteBusinessrulesSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteBusinessrulesSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteBusinessrulesSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteBusinessrulesSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontable is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontable is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontable is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontable is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Get a decision table version
   * 
   * getBusinessrulesDecisiontableVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersionRows is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersionRows is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersionRows is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersionRows is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param tableId Table ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @param divisionIds One or more comma separated divisions to filters decision tables by. If nothing is provided, the decision tables associated with the list of divisions that the user has access to will be returned. (optional)
   * @return DecisionTableVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersionListing getBusinessrulesDecisiontableVersions(String tableId, String after, String pageSize, List<String> divisionIds) throws IOException, ApiException {
    return  getBusinessrulesDecisiontableVersions(createGetBusinessrulesDecisiontableVersionsRequest(tableId, after, pageSize, divisionIds));
  }

  /**
   * Get a list of decision table versions
   * 
   * getBusinessrulesDecisiontableVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param tableId Table ID (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @param divisionIds One or more comma separated divisions to filters decision tables by. If nothing is provided, the decision tables associated with the list of divisions that the user has access to will be returned. (optional)
   * @return DecisionTableVersionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersionListing> getBusinessrulesDecisiontableVersionsWithHttpInfo(String tableId, String after, String pageSize, List<String> divisionIds) throws IOException {
    return getBusinessrulesDecisiontableVersions(createGetBusinessrulesDecisiontableVersionsRequest(tableId, after, pageSize, divisionIds).withHttpInfo());
  }

  private GetBusinessrulesDecisiontableVersionsRequest createGetBusinessrulesDecisiontableVersionsRequest(String tableId, String after, String pageSize, List<String> divisionIds) {
    return GetBusinessrulesDecisiontableVersionsRequest.builder()
            .withTableId(tableId)

            .withAfter(after)

            .withPageSize(pageSize)

            .withDivisionIds(divisionIds)

            .build();
  }

  /**
   * Get a list of decision table versions
   * 
   * getBusinessrulesDecisiontableVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontableVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontables is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @param divisionIds One or more comma separated divisions to filters decision tables by. If nothing is provided, the decision tables associated with the list of divisions that the user has access to will be returned. (optional)
   * @return DecisionTableListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableListing getBusinessrulesDecisiontables(String after, String pageSize, List<String> divisionIds) throws IOException, ApiException {
    return  getBusinessrulesDecisiontables(createGetBusinessrulesDecisiontablesRequest(after, pageSize, divisionIds));
  }

  /**
   * Get a list of decision tables.
   * 
   * getBusinessrulesDecisiontables is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional)
   * @param divisionIds One or more comma separated divisions to filters decision tables by. If nothing is provided, the decision tables associated with the list of divisions that the user has access to will be returned. (optional)
   * @return DecisionTableListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableListing> getBusinessrulesDecisiontablesWithHttpInfo(String after, String pageSize, List<String> divisionIds) throws IOException {
    return getBusinessrulesDecisiontables(createGetBusinessrulesDecisiontablesRequest(after, pageSize, divisionIds).withHttpInfo());
  }

  private GetBusinessrulesDecisiontablesRequest createGetBusinessrulesDecisiontablesRequest(String after, String pageSize, List<String> divisionIds) {
    return GetBusinessrulesDecisiontablesRequest.builder()
            .withAfter(after)

            .withPageSize(pageSize)

            .withDivisionIds(divisionIds)

            .build();
  }

  /**
   * Get a list of decision tables.
   * 
   * getBusinessrulesDecisiontables is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontables is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontablesSearch is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontablesSearch is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontablesSearch is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesDecisiontablesSearch is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getBusinessrulesSchema(String schemaId) throws IOException, ApiException {
    return  getBusinessrulesSchema(createGetBusinessrulesSchemaRequest(schemaId));
  }

  /**
   * Get a schema
   * 
   * getBusinessrulesSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getBusinessrulesSchemaWithHttpInfo(String schemaId) throws IOException {
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
   * getBusinessrulesSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getBusinessrulesSchema(GetBusinessrulesSchemaRequest request) throws IOException, ApiException {
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
   * getBusinessrulesSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getBusinessrulesSchema(ApiRequest<Void> request) throws IOException {
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
   * getBusinessrulesSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @return DataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchemaListing getBusinessrulesSchemas() throws IOException, ApiException {
    return  getBusinessrulesSchemas(createGetBusinessrulesSchemasRequest());
  }

  /**
   * Get a list of schemas.
   * 
   * getBusinessrulesSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @return DataSchemaListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchemaListing> getBusinessrulesSchemasWithHttpInfo() throws IOException {
    return getBusinessrulesSchemas(createGetBusinessrulesSchemasRequest().withHttpInfo());
  }

  private GetBusinessrulesSchemasRequest createGetBusinessrulesSchemasRequest() {
    return GetBusinessrulesSchemasRequest.builder()
            .build();
  }

  /**
   * Get a list of schemas.
   * 
   * getBusinessrulesSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return DataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchemaListing getBusinessrulesSchemas(GetBusinessrulesSchemasRequest request) throws IOException, ApiException {
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
   * getBusinessrulesSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchemaListing> getBusinessrulesSchemas(ApiRequest<Void> request) throws IOException {
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
   * Get a specific named core type.
   * 
   * getBusinessrulesSchemasCoretype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesSchemasCoretype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesSchemasCoretype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesSchemasCoretype is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesSchemasCoretypes is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesSchemasCoretypes is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesSchemasCoretypes is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getBusinessrulesSchemasCoretypes is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * patchBusinessrulesDecisiontable is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * patchBusinessrulesDecisiontable is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * patchBusinessrulesDecisiontable is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * patchBusinessrulesDecisiontable is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Update a decision table version
   * 
   * patchBusinessrulesDecisiontableVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchBusinessrulesDecisiontableVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchBusinessrulesDecisiontableVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchBusinessrulesDecisiontableVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Partially update a decision table row. Will be deprecated, we should use PUT request.
   * 
   * patchBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param rowId Row ID (required)
   * @param body Partially update decision table row request (required)
   * @return DecisionTableRow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public DecisionTableRow patchBusinessrulesDecisiontableVersionRow(String tableId, Integer tableVersion, String rowId, UpdateDecisionTableRowRequest body) throws IOException, ApiException {
    return  patchBusinessrulesDecisiontableVersionRow(createPatchBusinessrulesDecisiontableVersionRowRequest(tableId, tableVersion, rowId, body));
  }

  /**
   * Partially update a decision table row. Will be deprecated, we should use PUT request.
   * 
   * patchBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param tableId Table ID (required)
   * @param tableVersion Table Version (required)
   * @param rowId Row ID (required)
   * @param body Partially update decision table row request (required)
   * @return DecisionTableRow
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<DecisionTableRow> patchBusinessrulesDecisiontableVersionRowWithHttpInfo(String tableId, Integer tableVersion, String rowId, UpdateDecisionTableRowRequest body) throws IOException {
    return patchBusinessrulesDecisiontableVersionRow(createPatchBusinessrulesDecisiontableVersionRowRequest(tableId, tableVersion, rowId, body).withHttpInfo());
  }

  private PatchBusinessrulesDecisiontableVersionRowRequest createPatchBusinessrulesDecisiontableVersionRowRequest(String tableId, Integer tableVersion, String rowId, UpdateDecisionTableRowRequest body) {
    return PatchBusinessrulesDecisiontableVersionRowRequest.builder()
            .withTableId(tableId)

            .withTableVersion(tableVersion)

            .withRowId(rowId)

            .withBody(body)

            .build();
  }

  /**
   * Partially update a decision table row. Will be deprecated, we should use PUT request.
   * 
   * patchBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return DecisionTableRow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public DecisionTableRow patchBusinessrulesDecisiontableVersionRow(PatchBusinessrulesDecisiontableVersionRowRequest request) throws IOException, ApiException {
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
   * Partially update a decision table row. Will be deprecated, we should use PUT request.
   * 
   * patchBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<DecisionTableRow> patchBusinessrulesDecisiontableVersionRow(ApiRequest<UpdateDecisionTableRowRequest> request) throws IOException {
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
   * Execute a published decision table
   * 
   * postBusinessrulesDecisiontableExecute is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontableExecute is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontableExecute is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontableExecute is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Copy a decision table version
   * 
   * postBusinessrulesDecisiontableVersionCopy is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postBusinessrulesDecisiontableVersionCopy is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postBusinessrulesDecisiontableVersionCopy is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postBusinessrulesDecisiontableVersionCopy is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontableVersionExecute is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontableVersionExecute is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontableVersionExecute is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontableVersionExecute is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontableVersionRows is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontableVersionRows is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontableVersionRows is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontableVersionRows is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Search for decision table rows
   * 
   * postBusinessrulesDecisiontableVersionRowsSearch is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postBusinessrulesDecisiontableVersionRowsSearch is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postBusinessrulesDecisiontableVersionRowsSearch is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postBusinessrulesDecisiontableVersionRowsSearch is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postBusinessrulesDecisiontableVersionSync is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postBusinessrulesDecisiontableVersionSync is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postBusinessrulesDecisiontableVersionSync is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postBusinessrulesDecisiontableVersionSync is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Create a new decision table version
   * 
   * postBusinessrulesDecisiontableVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param tableId Table ID (required)
   * @return DecisionTableVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DecisionTableVersion postBusinessrulesDecisiontableVersions(String tableId) throws IOException, ApiException {
    return  postBusinessrulesDecisiontableVersions(createPostBusinessrulesDecisiontableVersionsRequest(tableId));
  }

  /**
   * Create a new decision table version
   * 
   * postBusinessrulesDecisiontableVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param tableId Table ID (required)
   * @return DecisionTableVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> postBusinessrulesDecisiontableVersionsWithHttpInfo(String tableId) throws IOException {
    return postBusinessrulesDecisiontableVersions(createPostBusinessrulesDecisiontableVersionsRequest(tableId).withHttpInfo());
  }

  private PostBusinessrulesDecisiontableVersionsRequest createPostBusinessrulesDecisiontableVersionsRequest(String tableId) {
    return PostBusinessrulesDecisiontableVersionsRequest.builder()
            .withTableId(tableId)

            .build();
  }

  /**
   * Create a new decision table version
   * 
   * postBusinessrulesDecisiontableVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Create a new decision table version
   * 
   * postBusinessrulesDecisiontableVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DecisionTableVersion> postBusinessrulesDecisiontableVersions(ApiRequest<Void> request) throws IOException {
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
   * 
   * postBusinessrulesDecisiontables is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontables is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontables is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * postBusinessrulesDecisiontables is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postBusinessrulesSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body Schema (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema postBusinessrulesSchemas(DataSchema body) throws IOException, ApiException {
    return  postBusinessrulesSchemas(createPostBusinessrulesSchemasRequest(body));
  }

  /**
   * Create a schema
   * 
   * postBusinessrulesSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body Schema (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> postBusinessrulesSchemasWithHttpInfo(DataSchema body) throws IOException {
    return postBusinessrulesSchemas(createPostBusinessrulesSchemasRequest(body).withHttpInfo());
  }

  private PostBusinessrulesSchemasRequest createPostBusinessrulesSchemasRequest(DataSchema body) {
    return PostBusinessrulesSchemasRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a schema
   * 
   * postBusinessrulesSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema postBusinessrulesSchemas(PostBusinessrulesSchemasRequest request) throws IOException, ApiException {
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
   * postBusinessrulesSchemas is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> postBusinessrulesSchemas(ApiRequest<DataSchema> request) throws IOException {
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
   * Publish a decision table version
   * 
   * putBusinessrulesDecisiontableVersionPublish is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * putBusinessrulesDecisiontableVersionPublish is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * putBusinessrulesDecisiontableVersionPublish is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * putBusinessrulesDecisiontableVersionPublish is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * putBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * putBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * putBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * 
   * putBusinessrulesDecisiontableVersionRow is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * putBusinessrulesSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @param body Data Schema (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema putBusinessrulesSchema(String schemaId, DataSchema body) throws IOException, ApiException {
    return  putBusinessrulesSchema(createPutBusinessrulesSchemaRequest(schemaId, body));
  }

  /**
   * Update a schema
   * 
   * putBusinessrulesSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param schemaId Schema ID (required)
   * @param body Data Schema (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> putBusinessrulesSchemaWithHttpInfo(String schemaId, DataSchema body) throws IOException {
    return putBusinessrulesSchema(createPutBusinessrulesSchemaRequest(schemaId, body).withHttpInfo());
  }

  private PutBusinessrulesSchemaRequest createPutBusinessrulesSchemaRequest(String schemaId, DataSchema body) {
    return PutBusinessrulesSchemaRequest.builder()
            .withSchemaId(schemaId)

            .withBody(body)

            .build();
  }

  /**
   * Update a schema
   * 
   * putBusinessrulesSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema putBusinessrulesSchema(PutBusinessrulesSchemaRequest request) throws IOException, ApiException {
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
   * putBusinessrulesSchema is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> putBusinessrulesSchema(ApiRequest<DataSchema> request) throws IOException {
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
