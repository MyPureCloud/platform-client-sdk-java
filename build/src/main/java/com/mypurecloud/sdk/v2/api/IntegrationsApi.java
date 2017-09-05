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
import com.mypurecloud.sdk.v2.model.Action;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.DraftValidationResult;
import com.mypurecloud.sdk.v2.model.ActionEntityListing;
import com.mypurecloud.sdk.v2.model.CategoryEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateActionInput;
import com.mypurecloud.sdk.v2.model.UpdateDraftInput;
import com.mypurecloud.sdk.v2.model.PublishDraftInput;
import com.mypurecloud.sdk.v2.model.TestExecutionResult;
import com.mypurecloud.sdk.v2.model.PostActionInput;


import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationsActionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftValidationRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionsCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionsDraftsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntegrationsActionRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftTestRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionExecuteRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionTestRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionsDraftsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IntegrationsApi {
  private final ApiClient pcapiClient;

  public IntegrationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IntegrationsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete an Action
   * 
   * @param actionId actionId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntegrationsAction(String actionId) throws IOException, ApiException {
     deleteIntegrationsAction(createDeleteIntegrationsActionRequest(actionId));
  }

  /**
   * Delete an Action
   * 
   * @param actionId actionId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntegrationsActionWithHttpInfo(String actionId) throws IOException {
    return deleteIntegrationsAction(createDeleteIntegrationsActionRequest(actionId).withHttpInfo());
  }

  private DeleteIntegrationsActionRequest createDeleteIntegrationsActionRequest(String actionId) {
    return DeleteIntegrationsActionRequest.builder()
            .withActionId(actionId)
    
            .build();
  }

  /**
   * Delete an Action
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntegrationsAction(DeleteIntegrationsActionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an Action
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntegrationsAction(ApiRequest<Void> request) throws IOException {
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
   * Delete a Draft
   * 
   * @param actionId actionId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntegrationsActionDraft(String actionId) throws IOException, ApiException {
     deleteIntegrationsActionDraft(createDeleteIntegrationsActionDraftRequest(actionId));
  }

  /**
   * Delete a Draft
   * 
   * @param actionId actionId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntegrationsActionDraftWithHttpInfo(String actionId) throws IOException {
    return deleteIntegrationsActionDraft(createDeleteIntegrationsActionDraftRequest(actionId).withHttpInfo());
  }

  private DeleteIntegrationsActionDraftRequest createDeleteIntegrationsActionDraftRequest(String actionId) {
    return DeleteIntegrationsActionDraftRequest.builder()
            .withActionId(actionId)
    
            .build();
  }

  /**
   * Delete a Draft
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntegrationsActionDraft(DeleteIntegrationsActionDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntegrationsActionDraft(ApiRequest<Void> request) throws IOException {
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
   * Retrieves a single Action matching id.
   * 
   * @param actionId actionId (required)
   * @param expand Indicates fields of the response which should be expanded. (optional)
   * @param includeConfig Show config when available (optional, default to false)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action getIntegrationsAction(String actionId, String expand, Boolean includeConfig) throws IOException, ApiException {
    return  getIntegrationsAction(createGetIntegrationsActionRequest(actionId, expand, includeConfig));
  }

  /**
   * Retrieves a single Action matching id.
   * 
   * @param actionId actionId (required)
   * @param expand Indicates fields of the response which should be expanded. (optional)
   * @param includeConfig Show config when available (optional, default to false)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> getIntegrationsActionWithHttpInfo(String actionId, String expand, Boolean includeConfig) throws IOException {
    return getIntegrationsAction(createGetIntegrationsActionRequest(actionId, expand, includeConfig).withHttpInfo());
  }

  private GetIntegrationsActionRequest createGetIntegrationsActionRequest(String actionId, String expand, Boolean includeConfig) {
    return GetIntegrationsActionRequest.builder()
            .withActionId(actionId)
    
            .withExpand(expand)
    
            .withIncludeConfig(includeConfig)
    
            .build();
  }

  /**
   * Retrieves a single Action matching id.
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action getIntegrationsAction(GetIntegrationsActionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves a single Action matching id.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> getIntegrationsAction(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve a Draft
   * 
   * @param actionId actionId (required)
   * @param expand Indicates fields of the response which should be expanded. (optional)
   * @param includeConfig Show config when available (optional, default to false)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action getIntegrationsActionDraft(String actionId, String expand, Boolean includeConfig) throws IOException, ApiException {
    return  getIntegrationsActionDraft(createGetIntegrationsActionDraftRequest(actionId, expand, includeConfig));
  }

  /**
   * Retrieve a Draft
   * 
   * @param actionId actionId (required)
   * @param expand Indicates fields of the response which should be expanded. (optional)
   * @param includeConfig Show config when available (optional, default to false)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> getIntegrationsActionDraftWithHttpInfo(String actionId, String expand, Boolean includeConfig) throws IOException {
    return getIntegrationsActionDraft(createGetIntegrationsActionDraftRequest(actionId, expand, includeConfig).withHttpInfo());
  }

  private GetIntegrationsActionDraftRequest createGetIntegrationsActionDraftRequest(String actionId, String expand, Boolean includeConfig) {
    return GetIntegrationsActionDraftRequest.builder()
            .withActionId(actionId)
    
            .withExpand(expand)
    
            .withIncludeConfig(includeConfig)
    
            .build();
  }

  /**
   * Retrieve a Draft
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action getIntegrationsActionDraft(GetIntegrationsActionDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a Draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> getIntegrationsActionDraft(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve schema for a Draft based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of schema file to be retrieved for this draft. (required)
   * @return JsonSchemaDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSchemaDocument getIntegrationsActionDraftSchema(String actionId, String fileName) throws IOException, ApiException {
    return  getIntegrationsActionDraftSchema(createGetIntegrationsActionDraftSchemaRequest(actionId, fileName));
  }

  /**
   * Retrieve schema for a Draft based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of schema file to be retrieved for this draft. (required)
   * @return JsonSchemaDocument
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSchemaDocument> getIntegrationsActionDraftSchemaWithHttpInfo(String actionId, String fileName) throws IOException {
    return getIntegrationsActionDraftSchema(createGetIntegrationsActionDraftSchemaRequest(actionId, fileName).withHttpInfo());
  }

  private GetIntegrationsActionDraftSchemaRequest createGetIntegrationsActionDraftSchemaRequest(String actionId, String fileName) {
    return GetIntegrationsActionDraftSchemaRequest.builder()
            .withActionId(actionId)
    
            .withFileName(fileName)
    
            .build();
  }

  /**
   * Retrieve schema for a Draft based on filename.
   * 
   * @param request The request object
   * @return JsonSchemaDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSchemaDocument getIntegrationsActionDraftSchema(GetIntegrationsActionDraftSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonSchemaDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonSchemaDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve schema for a Draft based on filename.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSchemaDocument> getIntegrationsActionDraftSchema(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonSchemaDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve templates for a Draft based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of template file to be retrieved for this action draft. (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String getIntegrationsActionDraftTemplate(String actionId, String fileName) throws IOException, ApiException {
    return  getIntegrationsActionDraftTemplate(createGetIntegrationsActionDraftTemplateRequest(actionId, fileName));
  }

  /**
   * Retrieve templates for a Draft based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of template file to be retrieved for this action draft. (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> getIntegrationsActionDraftTemplateWithHttpInfo(String actionId, String fileName) throws IOException {
    return getIntegrationsActionDraftTemplate(createGetIntegrationsActionDraftTemplateRequest(actionId, fileName).withHttpInfo());
  }

  private GetIntegrationsActionDraftTemplateRequest createGetIntegrationsActionDraftTemplateRequest(String actionId, String fileName) {
    return GetIntegrationsActionDraftTemplateRequest.builder()
            .withActionId(actionId)
    
            .withFileName(fileName)
    
            .build();
  }

  /**
   * Retrieve templates for a Draft based on filename.
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String getIntegrationsActionDraftTemplate(GetIntegrationsActionDraftTemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve templates for a Draft based on filename.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> getIntegrationsActionDraftTemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Validate current Draft configuration.
   * 
   * @param actionId actionId (required)
   * @return DraftValidationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DraftValidationResult getIntegrationsActionDraftValidation(String actionId) throws IOException, ApiException {
    return  getIntegrationsActionDraftValidation(createGetIntegrationsActionDraftValidationRequest(actionId));
  }

  /**
   * Validate current Draft configuration.
   * 
   * @param actionId actionId (required)
   * @return DraftValidationResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DraftValidationResult> getIntegrationsActionDraftValidationWithHttpInfo(String actionId) throws IOException {
    return getIntegrationsActionDraftValidation(createGetIntegrationsActionDraftValidationRequest(actionId).withHttpInfo());
  }

  private GetIntegrationsActionDraftValidationRequest createGetIntegrationsActionDraftValidationRequest(String actionId) {
    return GetIntegrationsActionDraftValidationRequest.builder()
            .withActionId(actionId)
    
            .build();
  }

  /**
   * Validate current Draft configuration.
   * 
   * @param request The request object
   * @return DraftValidationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DraftValidationResult getIntegrationsActionDraftValidation(GetIntegrationsActionDraftValidationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DraftValidationResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DraftValidationResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Validate current Draft configuration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DraftValidationResult> getIntegrationsActionDraftValidation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DraftValidationResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DraftValidationResult> response = (ApiResponse<DraftValidationResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DraftValidationResult> response = (ApiResponse<DraftValidationResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve schema for an action based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of schema file to be retrieved for this action. (required)
   * @return JsonSchemaDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSchemaDocument getIntegrationsActionSchema(String actionId, String fileName) throws IOException, ApiException {
    return  getIntegrationsActionSchema(createGetIntegrationsActionSchemaRequest(actionId, fileName));
  }

  /**
   * Retrieve schema for an action based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of schema file to be retrieved for this action. (required)
   * @return JsonSchemaDocument
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSchemaDocument> getIntegrationsActionSchemaWithHttpInfo(String actionId, String fileName) throws IOException {
    return getIntegrationsActionSchema(createGetIntegrationsActionSchemaRequest(actionId, fileName).withHttpInfo());
  }

  private GetIntegrationsActionSchemaRequest createGetIntegrationsActionSchemaRequest(String actionId, String fileName) {
    return GetIntegrationsActionSchemaRequest.builder()
            .withActionId(actionId)
    
            .withFileName(fileName)
    
            .build();
  }

  /**
   * Retrieve schema for an action based on filename.
   * 
   * @param request The request object
   * @return JsonSchemaDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSchemaDocument getIntegrationsActionSchema(GetIntegrationsActionSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonSchemaDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonSchemaDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve schema for an action based on filename.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSchemaDocument> getIntegrationsActionSchema(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonSchemaDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve text of templates for an action based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of template file to be retrieved for this action. (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String getIntegrationsActionTemplate(String actionId, String fileName) throws IOException, ApiException {
    return  getIntegrationsActionTemplate(createGetIntegrationsActionTemplateRequest(actionId, fileName));
  }

  /**
   * Retrieve text of templates for an action based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of template file to be retrieved for this action. (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> getIntegrationsActionTemplateWithHttpInfo(String actionId, String fileName) throws IOException {
    return getIntegrationsActionTemplate(createGetIntegrationsActionTemplateRequest(actionId, fileName).withHttpInfo());
  }

  private GetIntegrationsActionTemplateRequest createGetIntegrationsActionTemplateRequest(String actionId, String fileName) {
    return GetIntegrationsActionTemplateRequest.builder()
            .withActionId(actionId)
    
            .withFileName(fileName)
    
            .build();
  }

  /**
   * Retrieve text of templates for an action based on filename.
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String getIntegrationsActionTemplate(GetIntegrationsActionTemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve text of templates for an action based on filename.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> getIntegrationsActionTemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieves all actions associated with filters passed in via query param.
   * 
   * @param category Filter by category name (optional)
   * @param secure Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. (optional)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return ActionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionEntityListing getIntegrationsActions(String category, String secure, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) throws IOException, ApiException {
    return  getIntegrationsActions(createGetIntegrationsActionsRequest(category, secure, pageSize, pageNumber, sortBy, expand, nextPage, previousPage));
  }

  /**
   * Retrieves all actions associated with filters passed in via query param.
   * 
   * @param category Filter by category name (optional)
   * @param secure Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. (optional)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return ActionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionEntityListing> getIntegrationsActionsWithHttpInfo(String category, String secure, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) throws IOException {
    return getIntegrationsActions(createGetIntegrationsActionsRequest(category, secure, pageSize, pageNumber, sortBy, expand, nextPage, previousPage).withHttpInfo());
  }

  private GetIntegrationsActionsRequest createGetIntegrationsActionsRequest(String category, String secure, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) {
    return GetIntegrationsActionsRequest.builder()
            .withCategory(category)
    
            .withSecure(secure)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .build();
  }

  /**
   * Retrieves all actions associated with filters passed in via query param.
   * 
   * @param request The request object
   * @return ActionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionEntityListing getIntegrationsActions(GetIntegrationsActionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves all actions associated with filters passed in via query param.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionEntityListing> getIntegrationsActions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionEntityListing> response = (ApiResponse<ActionEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ActionEntityListing> response = (ApiResponse<ActionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieves all categories of available Actions
   * 
   * @param secure Filter to only include/exclude Action categories based on if they are considered secure. True will only include categories with Actions marked secured. False will only include categories of unsecured Actions. (optional)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return CategoryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryEntityListing getIntegrationsActionsCategories(String secure, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) throws IOException, ApiException {
    return  getIntegrationsActionsCategories(createGetIntegrationsActionsCategoriesRequest(secure, pageSize, pageNumber, sortBy, expand, nextPage, previousPage));
  }

  /**
   * Retrieves all categories of available Actions
   * 
   * @param secure Filter to only include/exclude Action categories based on if they are considered secure. True will only include categories with Actions marked secured. False will only include categories of unsecured Actions. (optional)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return CategoryEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryEntityListing> getIntegrationsActionsCategoriesWithHttpInfo(String secure, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) throws IOException {
    return getIntegrationsActionsCategories(createGetIntegrationsActionsCategoriesRequest(secure, pageSize, pageNumber, sortBy, expand, nextPage, previousPage).withHttpInfo());
  }

  private GetIntegrationsActionsCategoriesRequest createGetIntegrationsActionsCategoriesRequest(String secure, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) {
    return GetIntegrationsActionsCategoriesRequest.builder()
            .withSecure(secure)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .build();
  }

  /**
   * Retrieves all categories of available Actions
   * 
   * @param request The request object
   * @return CategoryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryEntityListing getIntegrationsActionsCategories(GetIntegrationsActionsCategoriesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CategoryEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CategoryEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves all categories of available Actions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryEntityListing> getIntegrationsActionsCategories(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CategoryEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryEntityListing> response = (ApiResponse<CategoryEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryEntityListing> response = (ApiResponse<CategoryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieves all action drafts associated with the filters passed in via query param.
   * 
   * @param category Filter by category name (optional)
   * @param secure Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. (optional)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return ActionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionEntityListing getIntegrationsActionsDrafts(String category, String secure, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) throws IOException, ApiException {
    return  getIntegrationsActionsDrafts(createGetIntegrationsActionsDraftsRequest(category, secure, pageSize, pageNumber, sortBy, expand, nextPage, previousPage));
  }

  /**
   * Retrieves all action drafts associated with the filters passed in via query param.
   * 
   * @param category Filter by category name (optional)
   * @param secure Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. (optional)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return ActionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionEntityListing> getIntegrationsActionsDraftsWithHttpInfo(String category, String secure, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) throws IOException {
    return getIntegrationsActionsDrafts(createGetIntegrationsActionsDraftsRequest(category, secure, pageSize, pageNumber, sortBy, expand, nextPage, previousPage).withHttpInfo());
  }

  private GetIntegrationsActionsDraftsRequest createGetIntegrationsActionsDraftsRequest(String category, String secure, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) {
    return GetIntegrationsActionsDraftsRequest.builder()
            .withCategory(category)
    
            .withSecure(secure)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .build();
  }

  /**
   * Retrieves all action drafts associated with the filters passed in via query param.
   * 
   * @param request The request object
   * @return ActionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionEntityListing getIntegrationsActionsDrafts(GetIntegrationsActionsDraftsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves all action drafts associated with the filters passed in via query param.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionEntityListing> getIntegrationsActionsDrafts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionEntityListing> response = (ApiResponse<ActionEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ActionEntityListing> response = (ApiResponse<ActionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch an Action
   * 
   * @param actionId actionId (required)
   * @param body Input used to patch the Action. (required)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action patchIntegrationsAction(String actionId, UpdateActionInput body) throws IOException, ApiException {
    return  patchIntegrationsAction(createPatchIntegrationsActionRequest(actionId, body));
  }

  /**
   * Patch an Action
   * 
   * @param actionId actionId (required)
   * @param body Input used to patch the Action. (required)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> patchIntegrationsActionWithHttpInfo(String actionId, UpdateActionInput body) throws IOException {
    return patchIntegrationsAction(createPatchIntegrationsActionRequest(actionId, body).withHttpInfo());
  }

  private PatchIntegrationsActionRequest createPatchIntegrationsActionRequest(String actionId, UpdateActionInput body) {
    return PatchIntegrationsActionRequest.builder()
            .withActionId(actionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Patch an Action
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action patchIntegrationsAction(PatchIntegrationsActionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch an Action
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> patchIntegrationsAction(ApiRequest<UpdateActionInput> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an existing Draft
   * 
   * @param actionId actionId (required)
   * @param body Input used to patch the Action Draft. (required)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action patchIntegrationsActionDraft(String actionId, UpdateDraftInput body) throws IOException, ApiException {
    return  patchIntegrationsActionDraft(createPatchIntegrationsActionDraftRequest(actionId, body));
  }

  /**
   * Update an existing Draft
   * 
   * @param actionId actionId (required)
   * @param body Input used to patch the Action Draft. (required)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> patchIntegrationsActionDraftWithHttpInfo(String actionId, UpdateDraftInput body) throws IOException {
    return patchIntegrationsActionDraft(createPatchIntegrationsActionDraftRequest(actionId, body).withHttpInfo());
  }

  private PatchIntegrationsActionDraftRequest createPatchIntegrationsActionDraftRequest(String actionId, UpdateDraftInput body) {
    return PatchIntegrationsActionDraftRequest.builder()
            .withActionId(actionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an existing Draft
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action patchIntegrationsActionDraft(PatchIntegrationsActionDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an existing Draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> patchIntegrationsActionDraft(ApiRequest<UpdateDraftInput> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new Draft from existing Action
   * 
   * @param actionId actionId (required)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActionDraft(String actionId) throws IOException, ApiException {
    return  postIntegrationsActionDraft(createPostIntegrationsActionDraftRequest(actionId));
  }

  /**
   * Create a new Draft from existing Action
   * 
   * @param actionId actionId (required)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionDraftWithHttpInfo(String actionId) throws IOException {
    return postIntegrationsActionDraft(createPostIntegrationsActionDraftRequest(actionId).withHttpInfo());
  }

  private PostIntegrationsActionDraftRequest createPostIntegrationsActionDraftRequest(String actionId) {
    return PostIntegrationsActionDraftRequest.builder()
            .withActionId(actionId)
    
            .build();
  }

  /**
   * Create a new Draft from existing Action
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActionDraft(PostIntegrationsActionDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new Draft from existing Action
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionDraft(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Publish a Draft and make it the active Action configuration
   * 
   * @param actionId actionId (required)
   * @param body Input used to patch the Action. (required)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActionDraftPublish(String actionId, PublishDraftInput body) throws IOException, ApiException {
    return  postIntegrationsActionDraftPublish(createPostIntegrationsActionDraftPublishRequest(actionId, body));
  }

  /**
   * Publish a Draft and make it the active Action configuration
   * 
   * @param actionId actionId (required)
   * @param body Input used to patch the Action. (required)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionDraftPublishWithHttpInfo(String actionId, PublishDraftInput body) throws IOException {
    return postIntegrationsActionDraftPublish(createPostIntegrationsActionDraftPublishRequest(actionId, body).withHttpInfo());
  }

  private PostIntegrationsActionDraftPublishRequest createPostIntegrationsActionDraftPublishRequest(String actionId, PublishDraftInput body) {
    return PostIntegrationsActionDraftPublishRequest.builder()
            .withActionId(actionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Publish a Draft and make it the active Action configuration
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActionDraftPublish(PostIntegrationsActionDraftPublishRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish a Draft and make it the active Action configuration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionDraftPublish(ApiRequest<PublishDraftInput> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param actionId actionId (required)
   * @param body Map of parameters used for variable substitution. (required)
   * @return TestExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestExecutionResult postIntegrationsActionDraftTest(String actionId, Object body) throws IOException, ApiException {
    return  postIntegrationsActionDraftTest(createPostIntegrationsActionDraftTestRequest(actionId, body));
  }

  /**
   * Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param actionId actionId (required)
   * @param body Map of parameters used for variable substitution. (required)
   * @return TestExecutionResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestExecutionResult> postIntegrationsActionDraftTestWithHttpInfo(String actionId, Object body) throws IOException {
    return postIntegrationsActionDraftTest(createPostIntegrationsActionDraftTestRequest(actionId, body).withHttpInfo());
  }

  private PostIntegrationsActionDraftTestRequest createPostIntegrationsActionDraftTestRequest(String actionId, Object body) {
    return PostIntegrationsActionDraftTestRequest.builder()
            .withActionId(actionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param request The request object
   * @return TestExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestExecutionResult postIntegrationsActionDraftTest(PostIntegrationsActionDraftTestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TestExecutionResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TestExecutionResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestExecutionResult> postIntegrationsActionDraftTest(ApiRequest<Object> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TestExecutionResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TestExecutionResult> response = (ApiResponse<TestExecutionResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TestExecutionResult> response = (ApiResponse<TestExecutionResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error.
   * 
   * @param actionId actionId (required)
   * @param body Map of parameters used for variable substitution. (required)
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object postIntegrationsActionExecute(String actionId, Object body) throws IOException, ApiException {
    return  postIntegrationsActionExecute(createPostIntegrationsActionExecuteRequest(actionId, body));
  }

  /**
   * Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error.
   * 
   * @param actionId actionId (required)
   * @param body Map of parameters used for variable substitution. (required)
   * @return Object
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> postIntegrationsActionExecuteWithHttpInfo(String actionId, Object body) throws IOException {
    return postIntegrationsActionExecute(createPostIntegrationsActionExecuteRequest(actionId, body).withHttpInfo());
  }

  private PostIntegrationsActionExecuteRequest createPostIntegrationsActionExecuteRequest(String actionId, Object body) {
    return PostIntegrationsActionExecuteRequest.builder()
            .withActionId(actionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error.
   * 
   * @param request The request object
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object postIntegrationsActionExecute(PostIntegrationsActionExecuteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Object> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Object>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> postIntegrationsActionExecute(ApiRequest<Object> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Object>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param actionId actionId (required)
   * @param body Map of parameters used for variable substitution. (required)
   * @return TestExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestExecutionResult postIntegrationsActionTest(String actionId, Object body) throws IOException, ApiException {
    return  postIntegrationsActionTest(createPostIntegrationsActionTestRequest(actionId, body));
  }

  /**
   * Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param actionId actionId (required)
   * @param body Map of parameters used for variable substitution. (required)
   * @return TestExecutionResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestExecutionResult> postIntegrationsActionTestWithHttpInfo(String actionId, Object body) throws IOException {
    return postIntegrationsActionTest(createPostIntegrationsActionTestRequest(actionId, body).withHttpInfo());
  }

  private PostIntegrationsActionTestRequest createPostIntegrationsActionTestRequest(String actionId, Object body) {
    return PostIntegrationsActionTestRequest.builder()
            .withActionId(actionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param request The request object
   * @return TestExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestExecutionResult postIntegrationsActionTest(PostIntegrationsActionTestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TestExecutionResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TestExecutionResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestExecutionResult> postIntegrationsActionTest(ApiRequest<Object> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TestExecutionResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TestExecutionResult> response = (ApiResponse<TestExecutionResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TestExecutionResult> response = (ApiResponse<TestExecutionResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new Action
   * 
   * @param body Input used to create Action. (required)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActions(PostActionInput body) throws IOException, ApiException {
    return  postIntegrationsActions(createPostIntegrationsActionsRequest(body));
  }

  /**
   * Create a new Action
   * 
   * @param body Input used to create Action. (required)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionsWithHttpInfo(PostActionInput body) throws IOException {
    return postIntegrationsActions(createPostIntegrationsActionsRequest(body).withHttpInfo());
  }

  private PostIntegrationsActionsRequest createPostIntegrationsActionsRequest(PostActionInput body) {
    return PostIntegrationsActionsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new Action
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActions(PostIntegrationsActionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new Action
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActions(ApiRequest<PostActionInput> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new Draft
   * 
   * @param body Input used to create Action Draft. (required)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActionsDrafts(PostActionInput body) throws IOException, ApiException {
    return  postIntegrationsActionsDrafts(createPostIntegrationsActionsDraftsRequest(body));
  }

  /**
   * Create a new Draft
   * 
   * @param body Input used to create Action Draft. (required)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionsDraftsWithHttpInfo(PostActionInput body) throws IOException {
    return postIntegrationsActionsDrafts(createPostIntegrationsActionsDraftsRequest(body).withHttpInfo());
  }

  private PostIntegrationsActionsDraftsRequest createPostIntegrationsActionsDraftsRequest(PostActionInput body) {
    return PostIntegrationsActionsDraftsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new Draft
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActionsDrafts(PostIntegrationsActionsDraftsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new Draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionsDrafts(ApiRequest<PostActionInput> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
