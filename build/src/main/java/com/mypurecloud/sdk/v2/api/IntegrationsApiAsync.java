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

import com.mypurecloud.sdk.v2.model.Integration;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IntegrationConfiguration;
import com.mypurecloud.sdk.v2.model.IntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.Action;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.DraftValidationResult;
import com.mypurecloud.sdk.v2.model.ActionEntityListing;
import com.mypurecloud.sdk.v2.model.CategoryEntityListing;
import com.mypurecloud.sdk.v2.model.BotConnectorBot;
import com.mypurecloud.sdk.v2.model.BotConnectorBotVersionSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.BotList;
import com.mypurecloud.sdk.v2.model.BotConnectorBotSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.ClientAppEntityListing;
import com.mypurecloud.sdk.v2.model.Credential;
import com.mypurecloud.sdk.v2.model.CredentialInfoListing;
import com.mypurecloud.sdk.v2.model.CredentialTypeListing;
import com.mypurecloud.sdk.v2.model.IntegrationEventEntityListing;
import com.mypurecloud.sdk.v2.model.IntegrationEvent;
import com.mypurecloud.sdk.v2.model.DialogflowAgent;
import com.mypurecloud.sdk.v2.model.DialogflowAgentSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.LexBotAlias;
import com.mypurecloud.sdk.v2.model.LexBotAliasEntityListing;
import com.mypurecloud.sdk.v2.model.LexBotEntityListing;
import com.mypurecloud.sdk.v2.model.TtsEngineEntity;
import com.mypurecloud.sdk.v2.model.TtsVoiceEntity;
import com.mypurecloud.sdk.v2.model.TtsVoiceEntityListing;
import com.mypurecloud.sdk.v2.model.TtsEngineEntityListing;
import com.mypurecloud.sdk.v2.model.TtsSettings;
import com.mypurecloud.sdk.v2.model.IntegrationType;
import com.mypurecloud.sdk.v2.model.IntegrationTypeEntityListing;
import com.mypurecloud.sdk.v2.model.UserAppEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateActionInput;
import com.mypurecloud.sdk.v2.model.UpdateDraftInput;
import com.mypurecloud.sdk.v2.model.CreateIntegrationRequest;
import com.mypurecloud.sdk.v2.model.PublishDraftInput;
import com.mypurecloud.sdk.v2.model.TestExecutionResult;
import com.mypurecloud.sdk.v2.model.PostActionInput;
import com.mypurecloud.sdk.v2.model.CredentialInfo;
import com.mypurecloud.sdk.v2.model.UserActionCategoryEntityListing;
import com.mypurecloud.sdk.v2.model.VendorConnectionRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationsActionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationsCredentialRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationConfigCurrentRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsRequest;
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
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsBotconnectorIntegrationIdBotRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsBotconnectorIntegrationIdBotVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsBotconnectorIntegrationIdBotsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsBotconnectorIntegrationIdBotsSummariesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsClientappsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsCredentialRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsCredentialsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsCredentialsTypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsEventlogRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsEventlogEventIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechDialogflowAgentRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechDialogflowAgentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechLexBotAliasRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechLexBotBotIdAliasesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechLexBotsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechTtsEngineRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechTtsEngineVoiceRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechTtsEngineVoicesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechTtsEnginesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechTtsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsTypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsTypeConfigschemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsTypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsUserappsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntegrationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntegrationsActionRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftTestRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionExecuteRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionTestRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionsDraftsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsCredentialsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsWorkforcemanagementVendorconnectionRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationConfigCurrentRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationsBotconnectorIntegrationIdBotsRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationsCredentialRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationsSpeechTtsSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class IntegrationsApiAsync {
  private final ApiClient pcapiClient;

  public IntegrationsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public IntegrationsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete integration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Integration> deleteIntegrationAsync(DeleteIntegrationRequest request, final AsyncApiCallback<Integration> callback) {
    try {
      final SettableFuture<Integration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Integration>() {}, new AsyncApiCallback<ApiResponse<Integration>>() {
        @Override
        public void onCompleted(ApiResponse<Integration> response) {
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
   * Delete integration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Integration>> deleteIntegrationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Integration>> callback) {
    try {
      final SettableFuture<ApiResponse<Integration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Integration>() {}, new AsyncApiCallback<ApiResponse<Integration>>() {
        @Override
        public void onCompleted(ApiResponse<Integration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)(new ApiException(exception));
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
   * Delete an Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteIntegrationsActionAsync(DeleteIntegrationsActionRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete an Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteIntegrationsActionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a Draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteIntegrationsActionDraftAsync(DeleteIntegrationsActionDraftRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a Draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteIntegrationsActionDraftAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a set of credentials
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteIntegrationsCredentialAsync(DeleteIntegrationsCredentialRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a set of credentials
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteIntegrationsCredentialAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get integration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Integration> getIntegrationAsync(GetIntegrationRequest request, final AsyncApiCallback<Integration> callback) {
    try {
      final SettableFuture<Integration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Integration>() {}, new AsyncApiCallback<ApiResponse<Integration>>() {
        @Override
        public void onCompleted(ApiResponse<Integration> response) {
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
   * Get integration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Integration>> getIntegrationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Integration>> callback) {
    try {
      final SettableFuture<ApiResponse<Integration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Integration>() {}, new AsyncApiCallback<ApiResponse<Integration>>() {
        @Override
        public void onCompleted(ApiResponse<Integration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get integration configuration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntegrationConfiguration> getIntegrationConfigCurrentAsync(GetIntegrationConfigCurrentRequest request, final AsyncApiCallback<IntegrationConfiguration> callback) {
    try {
      final SettableFuture<IntegrationConfiguration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntegrationConfiguration>() {}, new AsyncApiCallback<ApiResponse<IntegrationConfiguration>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationConfiguration> response) {
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
   * Get integration configuration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntegrationConfiguration>> getIntegrationConfigCurrentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IntegrationConfiguration>> callback) {
    try {
      final SettableFuture<ApiResponse<IntegrationConfiguration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntegrationConfiguration>() {}, new AsyncApiCallback<ApiResponse<IntegrationConfiguration>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationConfiguration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationConfiguration> response = (ApiResponse<IntegrationConfiguration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationConfiguration> response = (ApiResponse<IntegrationConfiguration>)(ApiResponse<?>)(new ApiException(exception));
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
   * List integrations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntegrationEntityListing> getIntegrationsAsync(GetIntegrationsRequest request, final AsyncApiCallback<IntegrationEntityListing> callback) {
    try {
      final SettableFuture<IntegrationEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntegrationEntityListing>() {}, new AsyncApiCallback<ApiResponse<IntegrationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationEntityListing> response) {
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
   * List integrations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntegrationEntityListing>> getIntegrationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IntegrationEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<IntegrationEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntegrationEntityListing>() {}, new AsyncApiCallback<ApiResponse<IntegrationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationEntityListing> response = (ApiResponse<IntegrationEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationEntityListing> response = (ApiResponse<IntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieves a single Action matching id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Action> getIntegrationsActionAsync(GetIntegrationsActionRequest request, final AsyncApiCallback<Action> callback) {
    try {
      final SettableFuture<Action> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
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
   * Retrieves a single Action matching id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Action>> getIntegrationsActionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Action>> callback) {
    try {
      final SettableFuture<ApiResponse<Action>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve a Draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Action> getIntegrationsActionDraftAsync(GetIntegrationsActionDraftRequest request, final AsyncApiCallback<Action> callback) {
    try {
      final SettableFuture<Action> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
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
   * Retrieve a Draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Action>> getIntegrationsActionDraftAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Action>> callback) {
    try {
      final SettableFuture<ApiResponse<Action>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve schema for a Draft based on filename.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JsonSchemaDocument> getIntegrationsActionDraftSchemaAsync(GetIntegrationsActionDraftSchemaRequest request, final AsyncApiCallback<JsonSchemaDocument> callback) {
    try {
      final SettableFuture<JsonSchemaDocument> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JsonSchemaDocument>() {}, new AsyncApiCallback<ApiResponse<JsonSchemaDocument>>() {
        @Override
        public void onCompleted(ApiResponse<JsonSchemaDocument> response) {
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
   * Retrieve schema for a Draft based on filename.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JsonSchemaDocument>> getIntegrationsActionDraftSchemaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<JsonSchemaDocument>> callback) {
    try {
      final SettableFuture<ApiResponse<JsonSchemaDocument>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JsonSchemaDocument>() {}, new AsyncApiCallback<ApiResponse<JsonSchemaDocument>>() {
        @Override
        public void onCompleted(ApiResponse<JsonSchemaDocument> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve templates for a Draft based on filename.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> getIntegrationsActionDraftTemplateAsync(GetIntegrationsActionDraftTemplateRequest request, final AsyncApiCallback<String> callback) {
    try {
      final SettableFuture<String> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
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
   * Retrieve templates for a Draft based on filename.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> getIntegrationsActionDraftTemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      final SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
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
   * Validate current Draft configuration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DraftValidationResult> getIntegrationsActionDraftValidationAsync(GetIntegrationsActionDraftValidationRequest request, final AsyncApiCallback<DraftValidationResult> callback) {
    try {
      final SettableFuture<DraftValidationResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DraftValidationResult>() {}, new AsyncApiCallback<ApiResponse<DraftValidationResult>>() {
        @Override
        public void onCompleted(ApiResponse<DraftValidationResult> response) {
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
   * Validate current Draft configuration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DraftValidationResult>> getIntegrationsActionDraftValidationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DraftValidationResult>> callback) {
    try {
      final SettableFuture<ApiResponse<DraftValidationResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DraftValidationResult>() {}, new AsyncApiCallback<ApiResponse<DraftValidationResult>>() {
        @Override
        public void onCompleted(ApiResponse<DraftValidationResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DraftValidationResult> response = (ApiResponse<DraftValidationResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DraftValidationResult> response = (ApiResponse<DraftValidationResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve schema for an action based on filename.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JsonSchemaDocument> getIntegrationsActionSchemaAsync(GetIntegrationsActionSchemaRequest request, final AsyncApiCallback<JsonSchemaDocument> callback) {
    try {
      final SettableFuture<JsonSchemaDocument> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JsonSchemaDocument>() {}, new AsyncApiCallback<ApiResponse<JsonSchemaDocument>>() {
        @Override
        public void onCompleted(ApiResponse<JsonSchemaDocument> response) {
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
   * Retrieve schema for an action based on filename.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JsonSchemaDocument>> getIntegrationsActionSchemaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<JsonSchemaDocument>> callback) {
    try {
      final SettableFuture<ApiResponse<JsonSchemaDocument>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JsonSchemaDocument>() {}, new AsyncApiCallback<ApiResponse<JsonSchemaDocument>>() {
        @Override
        public void onCompleted(ApiResponse<JsonSchemaDocument> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve text of templates for an action based on filename.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> getIntegrationsActionTemplateAsync(GetIntegrationsActionTemplateRequest request, final AsyncApiCallback<String> callback) {
    try {
      final SettableFuture<String> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
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
   * Retrieve text of templates for an action based on filename.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> getIntegrationsActionTemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      final SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieves all actions associated with filters passed in via query param.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionEntityListing> getIntegrationsActionsAsync(GetIntegrationsActionsRequest request, final AsyncApiCallback<ActionEntityListing> callback) {
    try {
      final SettableFuture<ActionEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionEntityListing>() {}, new AsyncApiCallback<ApiResponse<ActionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionEntityListing> response) {
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
   * Retrieves all actions associated with filters passed in via query param.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionEntityListing>> getIntegrationsActionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActionEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionEntityListing>() {}, new AsyncApiCallback<ApiResponse<ActionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionEntityListing> response = (ApiResponse<ActionEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionEntityListing> response = (ApiResponse<ActionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieves all categories of available Actions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CategoryEntityListing> getIntegrationsActionsCategoriesAsync(GetIntegrationsActionsCategoriesRequest request, final AsyncApiCallback<CategoryEntityListing> callback) {
    try {
      final SettableFuture<CategoryEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CategoryEntityListing>() {}, new AsyncApiCallback<ApiResponse<CategoryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryEntityListing> response) {
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
   * Retrieves all categories of available Actions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CategoryEntityListing>> getIntegrationsActionsCategoriesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CategoryEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CategoryEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CategoryEntityListing>() {}, new AsyncApiCallback<ApiResponse<CategoryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CategoryEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryEntityListing> response = (ApiResponse<CategoryEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoryEntityListing> response = (ApiResponse<CategoryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieves all action drafts associated with the filters passed in via query param.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionEntityListing> getIntegrationsActionsDraftsAsync(GetIntegrationsActionsDraftsRequest request, final AsyncApiCallback<ActionEntityListing> callback) {
    try {
      final SettableFuture<ActionEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionEntityListing>() {}, new AsyncApiCallback<ApiResponse<ActionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionEntityListing> response) {
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
   * Retrieves all action drafts associated with the filters passed in via query param.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionEntityListing>> getIntegrationsActionsDraftsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActionEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionEntityListing>() {}, new AsyncApiCallback<ApiResponse<ActionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionEntityListing> response = (ApiResponse<ActionEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionEntityListing> response = (ApiResponse<ActionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a specific botConnector bot, plus versions, for this integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BotConnectorBot> getIntegrationsBotconnectorIntegrationIdBotAsync(GetIntegrationsBotconnectorIntegrationIdBotRequest request, final AsyncApiCallback<BotConnectorBot> callback) {
    try {
      final SettableFuture<BotConnectorBot> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BotConnectorBot>() {}, new AsyncApiCallback<ApiResponse<BotConnectorBot>>() {
        @Override
        public void onCompleted(ApiResponse<BotConnectorBot> response) {
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
   * Get a specific botConnector bot, plus versions, for this integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BotConnectorBot>> getIntegrationsBotconnectorIntegrationIdBotAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BotConnectorBot>> callback) {
    try {
      final SettableFuture<ApiResponse<BotConnectorBot>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BotConnectorBot>() {}, new AsyncApiCallback<ApiResponse<BotConnectorBot>>() {
        @Override
        public void onCompleted(ApiResponse<BotConnectorBot> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BotConnectorBot> response = (ApiResponse<BotConnectorBot>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BotConnectorBot> response = (ApiResponse<BotConnectorBot>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of bot versions for a bot
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BotConnectorBotVersionSummaryEntityListing> getIntegrationsBotconnectorIntegrationIdBotVersionsAsync(GetIntegrationsBotconnectorIntegrationIdBotVersionsRequest request, final AsyncApiCallback<BotConnectorBotVersionSummaryEntityListing> callback) {
    try {
      final SettableFuture<BotConnectorBotVersionSummaryEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BotConnectorBotVersionSummaryEntityListing>() {}, new AsyncApiCallback<ApiResponse<BotConnectorBotVersionSummaryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<BotConnectorBotVersionSummaryEntityListing> response) {
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
   * Get a list of bot versions for a bot
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BotConnectorBotVersionSummaryEntityListing>> getIntegrationsBotconnectorIntegrationIdBotVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BotConnectorBotVersionSummaryEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BotConnectorBotVersionSummaryEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BotConnectorBotVersionSummaryEntityListing>() {}, new AsyncApiCallback<ApiResponse<BotConnectorBotVersionSummaryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<BotConnectorBotVersionSummaryEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BotConnectorBotVersionSummaryEntityListing> response = (ApiResponse<BotConnectorBotVersionSummaryEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BotConnectorBotVersionSummaryEntityListing> response = (ApiResponse<BotConnectorBotVersionSummaryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of botConnector bots for this integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BotList> getIntegrationsBotconnectorIntegrationIdBotsAsync(GetIntegrationsBotconnectorIntegrationIdBotsRequest request, final AsyncApiCallback<BotList> callback) {
    try {
      final SettableFuture<BotList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BotList>() {}, new AsyncApiCallback<ApiResponse<BotList>>() {
        @Override
        public void onCompleted(ApiResponse<BotList> response) {
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
   * Get a list of botConnector bots for this integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BotList>> getIntegrationsBotconnectorIntegrationIdBotsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BotList>> callback) {
    try {
      final SettableFuture<ApiResponse<BotList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BotList>() {}, new AsyncApiCallback<ApiResponse<BotList>>() {
        @Override
        public void onCompleted(ApiResponse<BotList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BotList> response = (ApiResponse<BotList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BotList> response = (ApiResponse<BotList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a summary list of botConnector bots for this integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BotConnectorBotSummaryEntityListing> getIntegrationsBotconnectorIntegrationIdBotsSummariesAsync(GetIntegrationsBotconnectorIntegrationIdBotsSummariesRequest request, final AsyncApiCallback<BotConnectorBotSummaryEntityListing> callback) {
    try {
      final SettableFuture<BotConnectorBotSummaryEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BotConnectorBotSummaryEntityListing>() {}, new AsyncApiCallback<ApiResponse<BotConnectorBotSummaryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<BotConnectorBotSummaryEntityListing> response) {
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
   * Get a summary list of botConnector bots for this integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BotConnectorBotSummaryEntityListing>> getIntegrationsBotconnectorIntegrationIdBotsSummariesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BotConnectorBotSummaryEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BotConnectorBotSummaryEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BotConnectorBotSummaryEntityListing>() {}, new AsyncApiCallback<ApiResponse<BotConnectorBotSummaryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<BotConnectorBotSummaryEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BotConnectorBotSummaryEntityListing> response = (ApiResponse<BotConnectorBotSummaryEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BotConnectorBotSummaryEntityListing> response = (ApiResponse<BotConnectorBotSummaryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * List permitted client app integrations for the logged in user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ClientAppEntityListing> getIntegrationsClientappsAsync(GetIntegrationsClientappsRequest request, final AsyncApiCallback<ClientAppEntityListing> callback) {
    try {
      final SettableFuture<ClientAppEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ClientAppEntityListing>() {}, new AsyncApiCallback<ApiResponse<ClientAppEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ClientAppEntityListing> response) {
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
   * List permitted client app integrations for the logged in user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ClientAppEntityListing>> getIntegrationsClientappsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ClientAppEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ClientAppEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ClientAppEntityListing>() {}, new AsyncApiCallback<ApiResponse<ClientAppEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ClientAppEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ClientAppEntityListing> response = (ApiResponse<ClientAppEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ClientAppEntityListing> response = (ApiResponse<ClientAppEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a single credential with sensitive fields redacted
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Credential> getIntegrationsCredentialAsync(GetIntegrationsCredentialRequest request, final AsyncApiCallback<Credential> callback) {
    try {
      final SettableFuture<Credential> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Credential>() {}, new AsyncApiCallback<ApiResponse<Credential>>() {
        @Override
        public void onCompleted(ApiResponse<Credential> response) {
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
   * Get a single credential with sensitive fields redacted
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Credential>> getIntegrationsCredentialAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Credential>> callback) {
    try {
      final SettableFuture<ApiResponse<Credential>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Credential>() {}, new AsyncApiCallback<ApiResponse<Credential>>() {
        @Override
        public void onCompleted(ApiResponse<Credential> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Credential> response = (ApiResponse<Credential>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Credential> response = (ApiResponse<Credential>)(ApiResponse<?>)(new ApiException(exception));
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
   * List multiple sets of credentials
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CredentialInfoListing> getIntegrationsCredentialsAsync(GetIntegrationsCredentialsRequest request, final AsyncApiCallback<CredentialInfoListing> callback) {
    try {
      final SettableFuture<CredentialInfoListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CredentialInfoListing>() {}, new AsyncApiCallback<ApiResponse<CredentialInfoListing>>() {
        @Override
        public void onCompleted(ApiResponse<CredentialInfoListing> response) {
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
   * List multiple sets of credentials
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CredentialInfoListing>> getIntegrationsCredentialsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CredentialInfoListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CredentialInfoListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CredentialInfoListing>() {}, new AsyncApiCallback<ApiResponse<CredentialInfoListing>>() {
        @Override
        public void onCompleted(ApiResponse<CredentialInfoListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CredentialInfoListing> response = (ApiResponse<CredentialInfoListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CredentialInfoListing> response = (ApiResponse<CredentialInfoListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * List all credential types
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CredentialTypeListing> getIntegrationsCredentialsTypesAsync(GetIntegrationsCredentialsTypesRequest request, final AsyncApiCallback<CredentialTypeListing> callback) {
    try {
      final SettableFuture<CredentialTypeListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CredentialTypeListing>() {}, new AsyncApiCallback<ApiResponse<CredentialTypeListing>>() {
        @Override
        public void onCompleted(ApiResponse<CredentialTypeListing> response) {
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
   * List all credential types
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CredentialTypeListing>> getIntegrationsCredentialsTypesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CredentialTypeListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CredentialTypeListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CredentialTypeListing>() {}, new AsyncApiCallback<ApiResponse<CredentialTypeListing>>() {
        @Override
        public void onCompleted(ApiResponse<CredentialTypeListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CredentialTypeListing> response = (ApiResponse<CredentialTypeListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CredentialTypeListing> response = (ApiResponse<CredentialTypeListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * List all events
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntegrationEventEntityListing> getIntegrationsEventlogAsync(GetIntegrationsEventlogRequest request, final AsyncApiCallback<IntegrationEventEntityListing> callback) {
    try {
      final SettableFuture<IntegrationEventEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntegrationEventEntityListing>() {}, new AsyncApiCallback<ApiResponse<IntegrationEventEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationEventEntityListing> response) {
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
   * List all events
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntegrationEventEntityListing>> getIntegrationsEventlogAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IntegrationEventEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<IntegrationEventEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntegrationEventEntityListing>() {}, new AsyncApiCallback<ApiResponse<IntegrationEventEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationEventEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationEventEntityListing> response = (ApiResponse<IntegrationEventEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationEventEntityListing> response = (ApiResponse<IntegrationEventEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a single event
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntegrationEvent> getIntegrationsEventlogEventIdAsync(GetIntegrationsEventlogEventIdRequest request, final AsyncApiCallback<IntegrationEvent> callback) {
    try {
      final SettableFuture<IntegrationEvent> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntegrationEvent>() {}, new AsyncApiCallback<ApiResponse<IntegrationEvent>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationEvent> response) {
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
   * Get a single event
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntegrationEvent>> getIntegrationsEventlogEventIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IntegrationEvent>> callback) {
    try {
      final SettableFuture<ApiResponse<IntegrationEvent>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntegrationEvent>() {}, new AsyncApiCallback<ApiResponse<IntegrationEvent>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationEvent> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationEvent> response = (ApiResponse<IntegrationEvent>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationEvent> response = (ApiResponse<IntegrationEvent>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get details about a Dialogflow agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DialogflowAgent> getIntegrationsSpeechDialogflowAgentAsync(GetIntegrationsSpeechDialogflowAgentRequest request, final AsyncApiCallback<DialogflowAgent> callback) {
    try {
      final SettableFuture<DialogflowAgent> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DialogflowAgent>() {}, new AsyncApiCallback<ApiResponse<DialogflowAgent>>() {
        @Override
        public void onCompleted(ApiResponse<DialogflowAgent> response) {
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
   * Get details about a Dialogflow agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DialogflowAgent>> getIntegrationsSpeechDialogflowAgentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DialogflowAgent>> callback) {
    try {
      final SettableFuture<ApiResponse<DialogflowAgent>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DialogflowAgent>() {}, new AsyncApiCallback<ApiResponse<DialogflowAgent>>() {
        @Override
        public void onCompleted(ApiResponse<DialogflowAgent> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DialogflowAgent> response = (ApiResponse<DialogflowAgent>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DialogflowAgent> response = (ApiResponse<DialogflowAgent>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of Dialogflow agents in the customers&#39; Google accounts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DialogflowAgentSummaryEntityListing> getIntegrationsSpeechDialogflowAgentsAsync(GetIntegrationsSpeechDialogflowAgentsRequest request, final AsyncApiCallback<DialogflowAgentSummaryEntityListing> callback) {
    try {
      final SettableFuture<DialogflowAgentSummaryEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DialogflowAgentSummaryEntityListing>() {}, new AsyncApiCallback<ApiResponse<DialogflowAgentSummaryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DialogflowAgentSummaryEntityListing> response) {
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
   * Get a list of Dialogflow agents in the customers&#39; Google accounts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DialogflowAgentSummaryEntityListing>> getIntegrationsSpeechDialogflowAgentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DialogflowAgentSummaryEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DialogflowAgentSummaryEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DialogflowAgentSummaryEntityListing>() {}, new AsyncApiCallback<ApiResponse<DialogflowAgentSummaryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DialogflowAgentSummaryEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DialogflowAgentSummaryEntityListing> response = (ApiResponse<DialogflowAgentSummaryEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DialogflowAgentSummaryEntityListing> response = (ApiResponse<DialogflowAgentSummaryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get details about a Lex bot alias
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LexBotAlias> getIntegrationsSpeechLexBotAliasAsync(GetIntegrationsSpeechLexBotAliasRequest request, final AsyncApiCallback<LexBotAlias> callback) {
    try {
      final SettableFuture<LexBotAlias> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LexBotAlias>() {}, new AsyncApiCallback<ApiResponse<LexBotAlias>>() {
        @Override
        public void onCompleted(ApiResponse<LexBotAlias> response) {
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
   * Get details about a Lex bot alias
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LexBotAlias>> getIntegrationsSpeechLexBotAliasAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LexBotAlias>> callback) {
    try {
      final SettableFuture<ApiResponse<LexBotAlias>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LexBotAlias>() {}, new AsyncApiCallback<ApiResponse<LexBotAlias>>() {
        @Override
        public void onCompleted(ApiResponse<LexBotAlias> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LexBotAlias> response = (ApiResponse<LexBotAlias>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LexBotAlias> response = (ApiResponse<LexBotAlias>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of aliases for a bot in the customer&#39;s AWS accounts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LexBotAliasEntityListing> getIntegrationsSpeechLexBotBotIdAliasesAsync(GetIntegrationsSpeechLexBotBotIdAliasesRequest request, final AsyncApiCallback<LexBotAliasEntityListing> callback) {
    try {
      final SettableFuture<LexBotAliasEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LexBotAliasEntityListing>() {}, new AsyncApiCallback<ApiResponse<LexBotAliasEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LexBotAliasEntityListing> response) {
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
   * Get a list of aliases for a bot in the customer&#39;s AWS accounts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LexBotAliasEntityListing>> getIntegrationsSpeechLexBotBotIdAliasesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LexBotAliasEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<LexBotAliasEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LexBotAliasEntityListing>() {}, new AsyncApiCallback<ApiResponse<LexBotAliasEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LexBotAliasEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LexBotAliasEntityListing> response = (ApiResponse<LexBotAliasEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LexBotAliasEntityListing> response = (ApiResponse<LexBotAliasEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of Lex bots in the customers&#39; AWS accounts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LexBotEntityListing> getIntegrationsSpeechLexBotsAsync(GetIntegrationsSpeechLexBotsRequest request, final AsyncApiCallback<LexBotEntityListing> callback) {
    try {
      final SettableFuture<LexBotEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LexBotEntityListing>() {}, new AsyncApiCallback<ApiResponse<LexBotEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LexBotEntityListing> response) {
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
   * Get a list of Lex bots in the customers&#39; AWS accounts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LexBotEntityListing>> getIntegrationsSpeechLexBotsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LexBotEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<LexBotEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LexBotEntityListing>() {}, new AsyncApiCallback<ApiResponse<LexBotEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LexBotEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LexBotEntityListing> response = (ApiResponse<LexBotEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LexBotEntityListing> response = (ApiResponse<LexBotEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get details about a TTS engine
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TtsEngineEntity> getIntegrationsSpeechTtsEngineAsync(GetIntegrationsSpeechTtsEngineRequest request, final AsyncApiCallback<TtsEngineEntity> callback) {
    try {
      final SettableFuture<TtsEngineEntity> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TtsEngineEntity>() {}, new AsyncApiCallback<ApiResponse<TtsEngineEntity>>() {
        @Override
        public void onCompleted(ApiResponse<TtsEngineEntity> response) {
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
   * Get details about a TTS engine
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TtsEngineEntity>> getIntegrationsSpeechTtsEngineAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TtsEngineEntity>> callback) {
    try {
      final SettableFuture<ApiResponse<TtsEngineEntity>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TtsEngineEntity>() {}, new AsyncApiCallback<ApiResponse<TtsEngineEntity>>() {
        @Override
        public void onCompleted(ApiResponse<TtsEngineEntity> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TtsEngineEntity> response = (ApiResponse<TtsEngineEntity>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TtsEngineEntity> response = (ApiResponse<TtsEngineEntity>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get details about a specific voice for a TTS engine
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TtsVoiceEntity> getIntegrationsSpeechTtsEngineVoiceAsync(GetIntegrationsSpeechTtsEngineVoiceRequest request, final AsyncApiCallback<TtsVoiceEntity> callback) {
    try {
      final SettableFuture<TtsVoiceEntity> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TtsVoiceEntity>() {}, new AsyncApiCallback<ApiResponse<TtsVoiceEntity>>() {
        @Override
        public void onCompleted(ApiResponse<TtsVoiceEntity> response) {
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
   * Get details about a specific voice for a TTS engine
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TtsVoiceEntity>> getIntegrationsSpeechTtsEngineVoiceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TtsVoiceEntity>> callback) {
    try {
      final SettableFuture<ApiResponse<TtsVoiceEntity>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TtsVoiceEntity>() {}, new AsyncApiCallback<ApiResponse<TtsVoiceEntity>>() {
        @Override
        public void onCompleted(ApiResponse<TtsVoiceEntity> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TtsVoiceEntity> response = (ApiResponse<TtsVoiceEntity>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TtsVoiceEntity> response = (ApiResponse<TtsVoiceEntity>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of voices for a TTS engine
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TtsVoiceEntityListing> getIntegrationsSpeechTtsEngineVoicesAsync(GetIntegrationsSpeechTtsEngineVoicesRequest request, final AsyncApiCallback<TtsVoiceEntityListing> callback) {
    try {
      final SettableFuture<TtsVoiceEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TtsVoiceEntityListing>() {}, new AsyncApiCallback<ApiResponse<TtsVoiceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TtsVoiceEntityListing> response) {
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
   * Get a list of voices for a TTS engine
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TtsVoiceEntityListing>> getIntegrationsSpeechTtsEngineVoicesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TtsVoiceEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<TtsVoiceEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TtsVoiceEntityListing>() {}, new AsyncApiCallback<ApiResponse<TtsVoiceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TtsVoiceEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TtsVoiceEntityListing> response = (ApiResponse<TtsVoiceEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TtsVoiceEntityListing> response = (ApiResponse<TtsVoiceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of TTS engines enabled for org
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TtsEngineEntityListing> getIntegrationsSpeechTtsEnginesAsync(GetIntegrationsSpeechTtsEnginesRequest request, final AsyncApiCallback<TtsEngineEntityListing> callback) {
    try {
      final SettableFuture<TtsEngineEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TtsEngineEntityListing>() {}, new AsyncApiCallback<ApiResponse<TtsEngineEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TtsEngineEntityListing> response) {
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
   * Get a list of TTS engines enabled for org
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TtsEngineEntityListing>> getIntegrationsSpeechTtsEnginesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TtsEngineEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<TtsEngineEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TtsEngineEntityListing>() {}, new AsyncApiCallback<ApiResponse<TtsEngineEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TtsEngineEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TtsEngineEntityListing> response = (ApiResponse<TtsEngineEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TtsEngineEntityListing> response = (ApiResponse<TtsEngineEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get TTS settings for an org
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TtsSettings> getIntegrationsSpeechTtsSettingsAsync(GetIntegrationsSpeechTtsSettingsRequest request, final AsyncApiCallback<TtsSettings> callback) {
    try {
      final SettableFuture<TtsSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TtsSettings>() {}, new AsyncApiCallback<ApiResponse<TtsSettings>>() {
        @Override
        public void onCompleted(ApiResponse<TtsSettings> response) {
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
   * Get TTS settings for an org
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TtsSettings>> getIntegrationsSpeechTtsSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TtsSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<TtsSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TtsSettings>() {}, new AsyncApiCallback<ApiResponse<TtsSettings>>() {
        @Override
        public void onCompleted(ApiResponse<TtsSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TtsSettings> response = (ApiResponse<TtsSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TtsSettings> response = (ApiResponse<TtsSettings>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get integration type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntegrationType> getIntegrationsTypeAsync(GetIntegrationsTypeRequest request, final AsyncApiCallback<IntegrationType> callback) {
    try {
      final SettableFuture<IntegrationType> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntegrationType>() {}, new AsyncApiCallback<ApiResponse<IntegrationType>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationType> response) {
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
   * Get integration type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntegrationType>> getIntegrationsTypeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IntegrationType>> callback) {
    try {
      final SettableFuture<ApiResponse<IntegrationType>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntegrationType>() {}, new AsyncApiCallback<ApiResponse<IntegrationType>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationType> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationType> response = (ApiResponse<IntegrationType>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationType> response = (ApiResponse<IntegrationType>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get properties config schema for an integration type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JsonSchemaDocument> getIntegrationsTypeConfigschemaAsync(GetIntegrationsTypeConfigschemaRequest request, final AsyncApiCallback<JsonSchemaDocument> callback) {
    try {
      final SettableFuture<JsonSchemaDocument> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JsonSchemaDocument>() {}, new AsyncApiCallback<ApiResponse<JsonSchemaDocument>>() {
        @Override
        public void onCompleted(ApiResponse<JsonSchemaDocument> response) {
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
   * Get properties config schema for an integration type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JsonSchemaDocument>> getIntegrationsTypeConfigschemaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<JsonSchemaDocument>> callback) {
    try {
      final SettableFuture<ApiResponse<JsonSchemaDocument>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JsonSchemaDocument>() {}, new AsyncApiCallback<ApiResponse<JsonSchemaDocument>>() {
        @Override
        public void onCompleted(ApiResponse<JsonSchemaDocument> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)(new ApiException(exception));
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
   * List integration types
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntegrationTypeEntityListing> getIntegrationsTypesAsync(GetIntegrationsTypesRequest request, final AsyncApiCallback<IntegrationTypeEntityListing> callback) {
    try {
      final SettableFuture<IntegrationTypeEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntegrationTypeEntityListing>() {}, new AsyncApiCallback<ApiResponse<IntegrationTypeEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationTypeEntityListing> response) {
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
   * List integration types
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntegrationTypeEntityListing>> getIntegrationsTypesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IntegrationTypeEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<IntegrationTypeEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntegrationTypeEntityListing>() {}, new AsyncApiCallback<ApiResponse<IntegrationTypeEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationTypeEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationTypeEntityListing> response = (ApiResponse<IntegrationTypeEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationTypeEntityListing> response = (ApiResponse<IntegrationTypeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * List permitted user app integrations for the logged in user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserAppEntityListing> getIntegrationsUserappsAsync(GetIntegrationsUserappsRequest request, final AsyncApiCallback<UserAppEntityListing> callback) {
    try {
      final SettableFuture<UserAppEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserAppEntityListing>() {}, new AsyncApiCallback<ApiResponse<UserAppEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UserAppEntityListing> response) {
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
   * List permitted user app integrations for the logged in user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserAppEntityListing>> getIntegrationsUserappsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UserAppEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<UserAppEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserAppEntityListing>() {}, new AsyncApiCallback<ApiResponse<UserAppEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UserAppEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserAppEntityListing> response = (ApiResponse<UserAppEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserAppEntityListing> response = (ApiResponse<UserAppEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update an integration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Integration> patchIntegrationAsync(PatchIntegrationRequest request, final AsyncApiCallback<Integration> callback) {
    try {
      final SettableFuture<Integration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Integration>() {}, new AsyncApiCallback<ApiResponse<Integration>>() {
        @Override
        public void onCompleted(ApiResponse<Integration> response) {
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
   * Update an integration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Integration>> patchIntegrationAsync(ApiRequest<Integration> request, final AsyncApiCallback<ApiResponse<Integration>> callback) {
    try {
      final SettableFuture<ApiResponse<Integration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Integration>() {}, new AsyncApiCallback<ApiResponse<Integration>>() {
        @Override
        public void onCompleted(ApiResponse<Integration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)(new ApiException(exception));
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
   * Patch an Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Action> patchIntegrationsActionAsync(PatchIntegrationsActionRequest request, final AsyncApiCallback<Action> callback) {
    try {
      final SettableFuture<Action> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
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
   * Patch an Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Action>> patchIntegrationsActionAsync(ApiRequest<UpdateActionInput> request, final AsyncApiCallback<ApiResponse<Action>> callback) {
    try {
      final SettableFuture<ApiResponse<Action>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update an existing Draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Action> patchIntegrationsActionDraftAsync(PatchIntegrationsActionDraftRequest request, final AsyncApiCallback<Action> callback) {
    try {
      final SettableFuture<Action> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
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
   * Update an existing Draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Action>> patchIntegrationsActionDraftAsync(ApiRequest<UpdateDraftInput> request, final AsyncApiCallback<ApiResponse<Action>> callback) {
    try {
      final SettableFuture<ApiResponse<Action>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create an integration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Integration> postIntegrationsAsync(PostIntegrationsRequest request, final AsyncApiCallback<Integration> callback) {
    try {
      final SettableFuture<Integration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Integration>() {}, new AsyncApiCallback<ApiResponse<Integration>>() {
        @Override
        public void onCompleted(ApiResponse<Integration> response) {
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
   * Create an integration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Integration>> postIntegrationsAsync(ApiRequest<CreateIntegrationRequest> request, final AsyncApiCallback<ApiResponse<Integration>> callback) {
    try {
      final SettableFuture<ApiResponse<Integration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Integration>() {}, new AsyncApiCallback<ApiResponse<Integration>>() {
        @Override
        public void onCompleted(ApiResponse<Integration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new Draft from existing Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Action> postIntegrationsActionDraftAsync(PostIntegrationsActionDraftRequest request, final AsyncApiCallback<Action> callback) {
    try {
      final SettableFuture<Action> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
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
   * Create a new Draft from existing Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Action>> postIntegrationsActionDraftAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Action>> callback) {
    try {
      final SettableFuture<ApiResponse<Action>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
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
   * Publish a Draft and make it the active Action configuration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Action> postIntegrationsActionDraftPublishAsync(PostIntegrationsActionDraftPublishRequest request, final AsyncApiCallback<Action> callback) {
    try {
      final SettableFuture<Action> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
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
   * Publish a Draft and make it the active Action configuration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Action>> postIntegrationsActionDraftPublishAsync(ApiRequest<PublishDraftInput> request, final AsyncApiCallback<ApiResponse<Action>> callback) {
    try {
      final SettableFuture<ApiResponse<Action>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
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
   * Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TestExecutionResult> postIntegrationsActionDraftTestAsync(PostIntegrationsActionDraftTestRequest request, final AsyncApiCallback<TestExecutionResult> callback) {
    try {
      final SettableFuture<TestExecutionResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TestExecutionResult>() {}, new AsyncApiCallback<ApiResponse<TestExecutionResult>>() {
        @Override
        public void onCompleted(ApiResponse<TestExecutionResult> response) {
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
   * Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TestExecutionResult>> postIntegrationsActionDraftTestAsync(ApiRequest<Object> request, final AsyncApiCallback<ApiResponse<TestExecutionResult>> callback) {
    try {
      final SettableFuture<ApiResponse<TestExecutionResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TestExecutionResult>() {}, new AsyncApiCallback<ApiResponse<TestExecutionResult>>() {
        @Override
        public void onCompleted(ApiResponse<TestExecutionResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TestExecutionResult> response = (ApiResponse<TestExecutionResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TestExecutionResult> response = (ApiResponse<TestExecutionResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Object> postIntegrationsActionExecuteAsync(PostIntegrationsActionExecuteRequest request, final AsyncApiCallback<Object> callback) {
    try {
      final SettableFuture<Object> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Object>() {}, new AsyncApiCallback<ApiResponse<Object>>() {
        @Override
        public void onCompleted(ApiResponse<Object> response) {
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
   * Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Object>> postIntegrationsActionExecuteAsync(ApiRequest<Object> request, final AsyncApiCallback<ApiResponse<Object>> callback) {
    try {
      final SettableFuture<ApiResponse<Object>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Object>() {}, new AsyncApiCallback<ApiResponse<Object>>() {
        @Override
        public void onCompleted(ApiResponse<Object> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)(new ApiException(exception));
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
   * Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TestExecutionResult> postIntegrationsActionTestAsync(PostIntegrationsActionTestRequest request, final AsyncApiCallback<TestExecutionResult> callback) {
    try {
      final SettableFuture<TestExecutionResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TestExecutionResult>() {}, new AsyncApiCallback<ApiResponse<TestExecutionResult>>() {
        @Override
        public void onCompleted(ApiResponse<TestExecutionResult> response) {
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
   * Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TestExecutionResult>> postIntegrationsActionTestAsync(ApiRequest<Object> request, final AsyncApiCallback<ApiResponse<TestExecutionResult>> callback) {
    try {
      final SettableFuture<ApiResponse<TestExecutionResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TestExecutionResult>() {}, new AsyncApiCallback<ApiResponse<TestExecutionResult>>() {
        @Override
        public void onCompleted(ApiResponse<TestExecutionResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TestExecutionResult> response = (ApiResponse<TestExecutionResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TestExecutionResult> response = (ApiResponse<TestExecutionResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Action> postIntegrationsActionsAsync(PostIntegrationsActionsRequest request, final AsyncApiCallback<Action> callback) {
    try {
      final SettableFuture<Action> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
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
   * Create a new Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Action>> postIntegrationsActionsAsync(ApiRequest<PostActionInput> request, final AsyncApiCallback<ApiResponse<Action>> callback) {
    try {
      final SettableFuture<ApiResponse<Action>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new Draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Action> postIntegrationsActionsDraftsAsync(PostIntegrationsActionsDraftsRequest request, final AsyncApiCallback<Action> callback) {
    try {
      final SettableFuture<Action> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
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
   * Create a new Draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Action>> postIntegrationsActionsDraftsAsync(ApiRequest<PostActionInput> request, final AsyncApiCallback<ApiResponse<Action>> callback) {
    try {
      final SettableFuture<ApiResponse<Action>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Action>() {}, new AsyncApiCallback<ApiResponse<Action>>() {
        @Override
        public void onCompleted(ApiResponse<Action> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a set of credentials
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CredentialInfo> postIntegrationsCredentialsAsync(PostIntegrationsCredentialsRequest request, final AsyncApiCallback<CredentialInfo> callback) {
    try {
      final SettableFuture<CredentialInfo> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CredentialInfo>() {}, new AsyncApiCallback<ApiResponse<CredentialInfo>>() {
        @Override
        public void onCompleted(ApiResponse<CredentialInfo> response) {
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
   * Create a set of credentials
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CredentialInfo>> postIntegrationsCredentialsAsync(ApiRequest<Credential> request, final AsyncApiCallback<ApiResponse<CredentialInfo>> callback) {
    try {
      final SettableFuture<ApiResponse<CredentialInfo>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CredentialInfo>() {}, new AsyncApiCallback<ApiResponse<CredentialInfo>>() {
        @Override
        public void onCompleted(ApiResponse<CredentialInfo> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CredentialInfo> response = (ApiResponse<CredentialInfo>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CredentialInfo> response = (ApiResponse<CredentialInfo>)(ApiResponse<?>)(new ApiException(exception));
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
   * Add a vendor connection
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserActionCategoryEntityListing> postIntegrationsWorkforcemanagementVendorconnectionAsync(PostIntegrationsWorkforcemanagementVendorconnectionRequest request, final AsyncApiCallback<UserActionCategoryEntityListing> callback) {
    try {
      final SettableFuture<UserActionCategoryEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserActionCategoryEntityListing>() {}, new AsyncApiCallback<ApiResponse<UserActionCategoryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UserActionCategoryEntityListing> response) {
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
   * Add a vendor connection
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserActionCategoryEntityListing>> postIntegrationsWorkforcemanagementVendorconnectionAsync(ApiRequest<VendorConnectionRequest> request, final AsyncApiCallback<ApiResponse<UserActionCategoryEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<UserActionCategoryEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserActionCategoryEntityListing>() {}, new AsyncApiCallback<ApiResponse<UserActionCategoryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UserActionCategoryEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserActionCategoryEntityListing> response = (ApiResponse<UserActionCategoryEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserActionCategoryEntityListing> response = (ApiResponse<UserActionCategoryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update integration configuration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntegrationConfiguration> putIntegrationConfigCurrentAsync(PutIntegrationConfigCurrentRequest request, final AsyncApiCallback<IntegrationConfiguration> callback) {
    try {
      final SettableFuture<IntegrationConfiguration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntegrationConfiguration>() {}, new AsyncApiCallback<ApiResponse<IntegrationConfiguration>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationConfiguration> response) {
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
   * Update integration configuration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntegrationConfiguration>> putIntegrationConfigCurrentAsync(ApiRequest<IntegrationConfiguration> request, final AsyncApiCallback<ApiResponse<IntegrationConfiguration>> callback) {
    try {
      final SettableFuture<ApiResponse<IntegrationConfiguration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntegrationConfiguration>() {}, new AsyncApiCallback<ApiResponse<IntegrationConfiguration>>() {
        @Override
        public void onCompleted(ApiResponse<IntegrationConfiguration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationConfiguration> response = (ApiResponse<IntegrationConfiguration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntegrationConfiguration> response = (ApiResponse<IntegrationConfiguration>)(ApiResponse<?>)(new ApiException(exception));
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
   * Set a list of botConnector bots plus versions for this integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> putIntegrationsBotconnectorIntegrationIdBotsAsync(PutIntegrationsBotconnectorIntegrationIdBotsRequest request, final AsyncApiCallback<Void> callback) {
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
   * Set a list of botConnector bots plus versions for this integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> putIntegrationsBotconnectorIntegrationIdBotsAsync(ApiRequest<BotList> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Update a set of credentials
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CredentialInfo> putIntegrationsCredentialAsync(PutIntegrationsCredentialRequest request, final AsyncApiCallback<CredentialInfo> callback) {
    try {
      final SettableFuture<CredentialInfo> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CredentialInfo>() {}, new AsyncApiCallback<ApiResponse<CredentialInfo>>() {
        @Override
        public void onCompleted(ApiResponse<CredentialInfo> response) {
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
   * Update a set of credentials
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CredentialInfo>> putIntegrationsCredentialAsync(ApiRequest<Credential> request, final AsyncApiCallback<ApiResponse<CredentialInfo>> callback) {
    try {
      final SettableFuture<ApiResponse<CredentialInfo>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CredentialInfo>() {}, new AsyncApiCallback<ApiResponse<CredentialInfo>>() {
        @Override
        public void onCompleted(ApiResponse<CredentialInfo> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CredentialInfo> response = (ApiResponse<CredentialInfo>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CredentialInfo> response = (ApiResponse<CredentialInfo>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update TTS settings for an org
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TtsSettings> putIntegrationsSpeechTtsSettingsAsync(PutIntegrationsSpeechTtsSettingsRequest request, final AsyncApiCallback<TtsSettings> callback) {
    try {
      final SettableFuture<TtsSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TtsSettings>() {}, new AsyncApiCallback<ApiResponse<TtsSettings>>() {
        @Override
        public void onCompleted(ApiResponse<TtsSettings> response) {
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
   * Update TTS settings for an org
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TtsSettings>> putIntegrationsSpeechTtsSettingsAsync(ApiRequest<TtsSettings> request, final AsyncApiCallback<ApiResponse<TtsSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<TtsSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TtsSettings>() {}, new AsyncApiCallback<ApiResponse<TtsSettings>>() {
        @Override
        public void onCompleted(ApiResponse<TtsSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TtsSettings> response = (ApiResponse<TtsSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TtsSettings> response = (ApiResponse<TtsSettings>)(ApiResponse<?>)(new ApiException(exception));
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
