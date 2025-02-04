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

import com.mypurecloud.sdk.v2.model.Action;
import com.mypurecloud.sdk.v2.model.ActionCertificateListing;
import com.mypurecloud.sdk.v2.model.ActionEntityListing;
import com.mypurecloud.sdk.v2.model.AsyncJob;
import com.mypurecloud.sdk.v2.model.AudioConnectorIntegration;
import com.mypurecloud.sdk.v2.model.AudioConnectorIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.BotConnectorBot;
import com.mypurecloud.sdk.v2.model.BotConnectorBotSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.BotConnectorBotVersionSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.BotExecutionConfiguration;
import com.mypurecloud.sdk.v2.model.BotList;
import com.mypurecloud.sdk.v2.model.CategoryEntityListing;
import com.mypurecloud.sdk.v2.model.ClientAppEntityListing;
import com.mypurecloud.sdk.v2.model.CreateIntegrationRequest;
import com.mypurecloud.sdk.v2.model.Credential;
import com.mypurecloud.sdk.v2.model.CredentialInfo;
import com.mypurecloud.sdk.v2.model.CredentialInfoListing;
import com.mypurecloud.sdk.v2.model.CredentialTypeListing;
import com.mypurecloud.sdk.v2.model.DialogflowAgent;
import com.mypurecloud.sdk.v2.model.DialogflowAgentSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.DialogflowCXAgent;
import com.mypurecloud.sdk.v2.model.DialogflowCXAgentSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.DraftValidationResult;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Function;
import com.mypurecloud.sdk.v2.model.FunctionConfig;
import com.mypurecloud.sdk.v2.model.FunctionRuntime;
import com.mypurecloud.sdk.v2.model.FunctionUploadRequest;
import com.mypurecloud.sdk.v2.model.FunctionUploadResponse;
import com.mypurecloud.sdk.v2.model.Integration;
import com.mypurecloud.sdk.v2.model.IntegrationConfiguration;
import com.mypurecloud.sdk.v2.model.IntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.IntegrationType;
import com.mypurecloud.sdk.v2.model.IntegrationTypeEntityListing;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.LexBotAlias;
import com.mypurecloud.sdk.v2.model.LexBotAliasEntityListing;
import com.mypurecloud.sdk.v2.model.LexBotEntityListing;
import com.mypurecloud.sdk.v2.model.LexV2BotAlias;
import com.mypurecloud.sdk.v2.model.LexV2BotAliasEntityListing;
import com.mypurecloud.sdk.v2.model.LexV2BotEntityListing;
import com.mypurecloud.sdk.v2.model.NuanceBot;
import com.mypurecloud.sdk.v2.model.NuanceBotEntityListing;
import com.mypurecloud.sdk.v2.model.NuanceBotLaunchSettings;
import com.mypurecloud.sdk.v2.model.PostActionInput;
import com.mypurecloud.sdk.v2.model.PublishDraftInput;
import com.mypurecloud.sdk.v2.model.SttEngineEntity;
import com.mypurecloud.sdk.v2.model.SttEngineEntityListing;
import com.mypurecloud.sdk.v2.model.TestExecutionResult;
import com.mypurecloud.sdk.v2.model.TrustedCertificates;
import com.mypurecloud.sdk.v2.model.TtsEngineEntity;
import com.mypurecloud.sdk.v2.model.TtsEngineEntityListing;
import com.mypurecloud.sdk.v2.model.TtsSettings;
import com.mypurecloud.sdk.v2.model.TtsVoiceEntity;
import com.mypurecloud.sdk.v2.model.TtsVoiceEntityListing;
import com.mypurecloud.sdk.v2.model.UCIntegrationListing;
import com.mypurecloud.sdk.v2.model.UCThirdPartyPresence;
import com.mypurecloud.sdk.v2.model.UnifiedCommunicationsIntegration;
import com.mypurecloud.sdk.v2.model.UnifiedCommunicationsIntegrationListing;
import com.mypurecloud.sdk.v2.model.UpdateActionInput;
import com.mypurecloud.sdk.v2.model.UpdateDraftInput;
import com.mypurecloud.sdk.v2.model.UserAppEntityListing;


import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationsActionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationsCredentialRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationConfigCurrentRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftFunctionRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftValidationRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionFunctionRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionsCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionsCertificatesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionsCertificatesTruststoreRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionsDraftsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionsFunctionsRuntimesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsBotconnectorIntegrationIdBotRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsBotconnectorIntegrationIdBotVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsBotconnectorIntegrationIdBotsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsBotconnectorIntegrationIdBotsSummariesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsClientappsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsClientappsUnifiedcommunicationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsCredentialRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsCredentialsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsCredentialsTypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechAudioconnectorRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechAudioconnectorIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechDialogflowAgentRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechDialogflowAgentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechDialogflowcxAgentRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechDialogflowcxAgentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechLexBotAliasRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechLexBotBotIdAliasesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechLexBotsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechLexv2BotAliasRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechLexv2BotBotIdAliasesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechLexv2BotsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechNuanceNuanceIntegrationIdBotJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechNuanceNuanceIntegrationIdBotJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechNuanceNuanceIntegrationIdBotsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechSttEngineRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechSttEnginesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechTtsEngineRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechTtsEngineVoiceRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechTtsEngineVoicesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechTtsEnginesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsSpeechTtsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsTypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsTypeConfigschemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsTypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsUnifiedcommunicationsClientappRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsUnifiedcommunicationsClientappsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsUserappsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntegrationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntegrationsActionRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftFunctionUploadRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftTestRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionExecuteRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionTestRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionsDraftsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsCredentialsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchValidateRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationConfigCurrentRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationsActionDraftFunctionRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationsBotconnectorIntegrationIdBotsRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationsCredentialRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationsSpeechTtsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationsUnifiedcommunicationThirdpartypresencesRequest;

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
   * Get draft function settings for Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FunctionConfig> getIntegrationsActionDraftFunctionAsync(GetIntegrationsActionDraftFunctionRequest request, final AsyncApiCallback<FunctionConfig> callback) {
    try {
      final SettableFuture<FunctionConfig> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FunctionConfig>() {}, new AsyncApiCallback<ApiResponse<FunctionConfig>>() {
        @Override
        public void onCompleted(ApiResponse<FunctionConfig> response) {
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
   * Get draft function settings for Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FunctionConfig>> getIntegrationsActionDraftFunctionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FunctionConfig>> callback) {
    try {
      final SettableFuture<ApiResponse<FunctionConfig>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FunctionConfig>() {}, new AsyncApiCallback<ApiResponse<FunctionConfig>>() {
        @Override
        public void onCompleted(ApiResponse<FunctionConfig> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FunctionConfig> response = (ApiResponse<FunctionConfig>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FunctionConfig> response = (ApiResponse<FunctionConfig>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get published function settings for Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FunctionConfig> getIntegrationsActionFunctionAsync(GetIntegrationsActionFunctionRequest request, final AsyncApiCallback<FunctionConfig> callback) {
    try {
      final SettableFuture<FunctionConfig> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FunctionConfig>() {}, new AsyncApiCallback<ApiResponse<FunctionConfig>>() {
        @Override
        public void onCompleted(ApiResponse<FunctionConfig> response) {
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
   * Get published function settings for Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FunctionConfig>> getIntegrationsActionFunctionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FunctionConfig>> callback) {
    try {
      final SettableFuture<ApiResponse<FunctionConfig>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FunctionConfig>() {}, new AsyncApiCallback<ApiResponse<FunctionConfig>>() {
        @Override
        public void onCompleted(ApiResponse<FunctionConfig> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FunctionConfig> response = (ApiResponse<FunctionConfig>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FunctionConfig> response = (ApiResponse<FunctionConfig>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieves the available mTLS client certificates in use. This endpoint will return inconsistent results while a certificate rotation is in progress.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionCertificateListing> getIntegrationsActionsCertificatesAsync(GetIntegrationsActionsCertificatesRequest request, final AsyncApiCallback<ActionCertificateListing> callback) {
    try {
      final SettableFuture<ActionCertificateListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionCertificateListing>() {}, new AsyncApiCallback<ApiResponse<ActionCertificateListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionCertificateListing> response) {
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
   * Retrieves the available mTLS client certificates in use. This endpoint will return inconsistent results while a certificate rotation is in progress.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionCertificateListing>> getIntegrationsActionsCertificatesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActionCertificateListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionCertificateListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionCertificateListing>() {}, new AsyncApiCallback<ApiResponse<ActionCertificateListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionCertificateListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionCertificateListing> response = (ApiResponse<ActionCertificateListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionCertificateListing> response = (ApiResponse<ActionCertificateListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieves basic info about trusted root CA certificates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TrustedCertificates> getIntegrationsActionsCertificatesTruststoreAsync(GetIntegrationsActionsCertificatesTruststoreRequest request, final AsyncApiCallback<TrustedCertificates> callback) {
    try {
      final SettableFuture<TrustedCertificates> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TrustedCertificates>() {}, new AsyncApiCallback<ApiResponse<TrustedCertificates>>() {
        @Override
        public void onCompleted(ApiResponse<TrustedCertificates> response) {
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
   * Retrieves basic info about trusted root CA certificates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TrustedCertificates>> getIntegrationsActionsCertificatesTruststoreAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TrustedCertificates>> callback) {
    try {
      final SettableFuture<ApiResponse<TrustedCertificates>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TrustedCertificates>() {}, new AsyncApiCallback<ApiResponse<TrustedCertificates>>() {
        @Override
        public void onCompleted(ApiResponse<TrustedCertificates> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TrustedCertificates> response = (ApiResponse<TrustedCertificates>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TrustedCertificates> response = (ApiResponse<TrustedCertificates>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get action function settings for Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<FunctionRuntime>> getIntegrationsActionsFunctionsRuntimesAsync(GetIntegrationsActionsFunctionsRuntimesRequest request, final AsyncApiCallback<List<FunctionRuntime>> callback) {
    try {
      final SettableFuture<List<FunctionRuntime>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<FunctionRuntime>>() {}, new AsyncApiCallback<ApiResponse<List<FunctionRuntime>>>() {
        @Override
        public void onCompleted(ApiResponse<List<FunctionRuntime>> response) {
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
   * Get action function settings for Action
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<FunctionRuntime>>> getIntegrationsActionsFunctionsRuntimesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<FunctionRuntime>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<FunctionRuntime>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<FunctionRuntime>>() {}, new AsyncApiCallback<ApiResponse<List<FunctionRuntime>>>() {
        @Override
        public void onCompleted(ApiResponse<List<FunctionRuntime>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<FunctionRuntime>> response = (ApiResponse<List<FunctionRuntime>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<FunctionRuntime>> response = (ApiResponse<List<FunctionRuntime>>)(ApiResponse<?>)(new ApiException(exception));
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
   * UC integration client application configuration.
   * Deprecated: Please use GET /integrations/unifiedcommunications/clientapps instead. This endpoint returns basic UI configuration data for all Unified Communications integrations client applications enabled for the current organization.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<UCIntegrationListing> getIntegrationsClientappsUnifiedcommunicationsAsync(GetIntegrationsClientappsUnifiedcommunicationsRequest request, final AsyncApiCallback<UCIntegrationListing> callback) {
    try {
      final SettableFuture<UCIntegrationListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UCIntegrationListing>() {}, new AsyncApiCallback<ApiResponse<UCIntegrationListing>>() {
        @Override
        public void onCompleted(ApiResponse<UCIntegrationListing> response) {
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
   * UC integration client application configuration.
   * Deprecated: Please use GET /integrations/unifiedcommunications/clientapps instead. This endpoint returns basic UI configuration data for all Unified Communications integrations client applications enabled for the current organization.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<UCIntegrationListing>> getIntegrationsClientappsUnifiedcommunicationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UCIntegrationListing>> callback) {
    try {
      final SettableFuture<ApiResponse<UCIntegrationListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UCIntegrationListing>() {}, new AsyncApiCallback<ApiResponse<UCIntegrationListing>>() {
        @Override
        public void onCompleted(ApiResponse<UCIntegrationListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UCIntegrationListing> response = (ApiResponse<UCIntegrationListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UCIntegrationListing> response = (ApiResponse<UCIntegrationListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of Audio Connector integrations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AudioConnectorIntegrationEntityListing> getIntegrationsSpeechAudioconnectorAsync(GetIntegrationsSpeechAudioconnectorRequest request, final AsyncApiCallback<AudioConnectorIntegrationEntityListing> callback) {
    try {
      final SettableFuture<AudioConnectorIntegrationEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AudioConnectorIntegrationEntityListing>() {}, new AsyncApiCallback<ApiResponse<AudioConnectorIntegrationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AudioConnectorIntegrationEntityListing> response) {
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
   * Get a list of Audio Connector integrations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AudioConnectorIntegrationEntityListing>> getIntegrationsSpeechAudioconnectorAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AudioConnectorIntegrationEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AudioConnectorIntegrationEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AudioConnectorIntegrationEntityListing>() {}, new AsyncApiCallback<ApiResponse<AudioConnectorIntegrationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AudioConnectorIntegrationEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AudioConnectorIntegrationEntityListing> response = (ApiResponse<AudioConnectorIntegrationEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AudioConnectorIntegrationEntityListing> response = (ApiResponse<AudioConnectorIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an Audio Connector integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AudioConnectorIntegration> getIntegrationsSpeechAudioconnectorIntegrationIdAsync(GetIntegrationsSpeechAudioconnectorIntegrationIdRequest request, final AsyncApiCallback<AudioConnectorIntegration> callback) {
    try {
      final SettableFuture<AudioConnectorIntegration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AudioConnectorIntegration>() {}, new AsyncApiCallback<ApiResponse<AudioConnectorIntegration>>() {
        @Override
        public void onCompleted(ApiResponse<AudioConnectorIntegration> response) {
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
   * Get an Audio Connector integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AudioConnectorIntegration>> getIntegrationsSpeechAudioconnectorIntegrationIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AudioConnectorIntegration>> callback) {
    try {
      final SettableFuture<ApiResponse<AudioConnectorIntegration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AudioConnectorIntegration>() {}, new AsyncApiCallback<ApiResponse<AudioConnectorIntegration>>() {
        @Override
        public void onCompleted(ApiResponse<AudioConnectorIntegration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AudioConnectorIntegration> response = (ApiResponse<AudioConnectorIntegration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AudioConnectorIntegration> response = (ApiResponse<AudioConnectorIntegration>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of Dialogflow agents in the customers' Google accounts
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
   * Get a list of Dialogflow agents in the customers' Google accounts
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
   * Get details about a Dialogflow CX agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DialogflowCXAgent> getIntegrationsSpeechDialogflowcxAgentAsync(GetIntegrationsSpeechDialogflowcxAgentRequest request, final AsyncApiCallback<DialogflowCXAgent> callback) {
    try {
      final SettableFuture<DialogflowCXAgent> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DialogflowCXAgent>() {}, new AsyncApiCallback<ApiResponse<DialogflowCXAgent>>() {
        @Override
        public void onCompleted(ApiResponse<DialogflowCXAgent> response) {
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
   * Get details about a Dialogflow CX agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DialogflowCXAgent>> getIntegrationsSpeechDialogflowcxAgentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DialogflowCXAgent>> callback) {
    try {
      final SettableFuture<ApiResponse<DialogflowCXAgent>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DialogflowCXAgent>() {}, new AsyncApiCallback<ApiResponse<DialogflowCXAgent>>() {
        @Override
        public void onCompleted(ApiResponse<DialogflowCXAgent> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DialogflowCXAgent> response = (ApiResponse<DialogflowCXAgent>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DialogflowCXAgent> response = (ApiResponse<DialogflowCXAgent>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of Dialogflow CX agents in the customers' Google accounts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DialogflowCXAgentSummaryEntityListing> getIntegrationsSpeechDialogflowcxAgentsAsync(GetIntegrationsSpeechDialogflowcxAgentsRequest request, final AsyncApiCallback<DialogflowCXAgentSummaryEntityListing> callback) {
    try {
      final SettableFuture<DialogflowCXAgentSummaryEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DialogflowCXAgentSummaryEntityListing>() {}, new AsyncApiCallback<ApiResponse<DialogflowCXAgentSummaryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DialogflowCXAgentSummaryEntityListing> response) {
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
   * Get a list of Dialogflow CX agents in the customers' Google accounts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DialogflowCXAgentSummaryEntityListing>> getIntegrationsSpeechDialogflowcxAgentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DialogflowCXAgentSummaryEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DialogflowCXAgentSummaryEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DialogflowCXAgentSummaryEntityListing>() {}, new AsyncApiCallback<ApiResponse<DialogflowCXAgentSummaryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DialogflowCXAgentSummaryEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DialogflowCXAgentSummaryEntityListing> response = (ApiResponse<DialogflowCXAgentSummaryEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DialogflowCXAgentSummaryEntityListing> response = (ApiResponse<DialogflowCXAgentSummaryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of aliases for a bot in the customer's AWS accounts
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
   * Get a list of aliases for a bot in the customer's AWS accounts
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
   * Get a list of Lex bots in the customers' AWS accounts
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
   * Get a list of Lex bots in the customers' AWS accounts
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
   * Get details about a Lex V2 bot alias
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LexV2BotAlias> getIntegrationsSpeechLexv2BotAliasAsync(GetIntegrationsSpeechLexv2BotAliasRequest request, final AsyncApiCallback<LexV2BotAlias> callback) {
    try {
      final SettableFuture<LexV2BotAlias> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LexV2BotAlias>() {}, new AsyncApiCallback<ApiResponse<LexV2BotAlias>>() {
        @Override
        public void onCompleted(ApiResponse<LexV2BotAlias> response) {
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
   * Get details about a Lex V2 bot alias
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LexV2BotAlias>> getIntegrationsSpeechLexv2BotAliasAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LexV2BotAlias>> callback) {
    try {
      final SettableFuture<ApiResponse<LexV2BotAlias>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LexV2BotAlias>() {}, new AsyncApiCallback<ApiResponse<LexV2BotAlias>>() {
        @Override
        public void onCompleted(ApiResponse<LexV2BotAlias> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LexV2BotAlias> response = (ApiResponse<LexV2BotAlias>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LexV2BotAlias> response = (ApiResponse<LexV2BotAlias>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of aliases for a Lex V2 bot
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LexV2BotAliasEntityListing> getIntegrationsSpeechLexv2BotBotIdAliasesAsync(GetIntegrationsSpeechLexv2BotBotIdAliasesRequest request, final AsyncApiCallback<LexV2BotAliasEntityListing> callback) {
    try {
      final SettableFuture<LexV2BotAliasEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LexV2BotAliasEntityListing>() {}, new AsyncApiCallback<ApiResponse<LexV2BotAliasEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LexV2BotAliasEntityListing> response) {
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
   * Get a list of aliases for a Lex V2 bot
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LexV2BotAliasEntityListing>> getIntegrationsSpeechLexv2BotBotIdAliasesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LexV2BotAliasEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<LexV2BotAliasEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LexV2BotAliasEntityListing>() {}, new AsyncApiCallback<ApiResponse<LexV2BotAliasEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LexV2BotAliasEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LexV2BotAliasEntityListing> response = (ApiResponse<LexV2BotAliasEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LexV2BotAliasEntityListing> response = (ApiResponse<LexV2BotAliasEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of Lex V2 bots
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LexV2BotEntityListing> getIntegrationsSpeechLexv2BotsAsync(GetIntegrationsSpeechLexv2BotsRequest request, final AsyncApiCallback<LexV2BotEntityListing> callback) {
    try {
      final SettableFuture<LexV2BotEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LexV2BotEntityListing>() {}, new AsyncApiCallback<ApiResponse<LexV2BotEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LexV2BotEntityListing> response) {
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
   * Get a list of Lex V2 bots
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LexV2BotEntityListing>> getIntegrationsSpeechLexv2BotsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LexV2BotEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<LexV2BotEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LexV2BotEntityListing>() {}, new AsyncApiCallback<ApiResponse<LexV2BotEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LexV2BotEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LexV2BotEntityListing> response = (ApiResponse<LexV2BotEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LexV2BotEntityListing> response = (ApiResponse<LexV2BotEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a Nuance bot in the specified Integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NuanceBot> getIntegrationsSpeechNuanceNuanceIntegrationIdBotAsync(GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest request, final AsyncApiCallback<NuanceBot> callback) {
    try {
      final SettableFuture<NuanceBot> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NuanceBot>() {}, new AsyncApiCallback<ApiResponse<NuanceBot>>() {
        @Override
        public void onCompleted(ApiResponse<NuanceBot> response) {
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
   * Get a Nuance bot in the specified Integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NuanceBot>> getIntegrationsSpeechNuanceNuanceIntegrationIdBotAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NuanceBot>> callback) {
    try {
      final SettableFuture<ApiResponse<NuanceBot>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NuanceBot>() {}, new AsyncApiCallback<ApiResponse<NuanceBot>>() {
        @Override
        public void onCompleted(ApiResponse<NuanceBot> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NuanceBot> response = (ApiResponse<NuanceBot>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NuanceBot> response = (ApiResponse<NuanceBot>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the status of an asynchronous Nuance bot GET job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncJob> getIntegrationsSpeechNuanceNuanceIntegrationIdBotJobAsync(GetIntegrationsSpeechNuanceNuanceIntegrationIdBotJobRequest request, final AsyncApiCallback<AsyncJob> callback) {
    try {
      final SettableFuture<AsyncJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncJob>() {}, new AsyncApiCallback<ApiResponse<AsyncJob>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncJob> response) {
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
   * Get the status of an asynchronous Nuance bot GET job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncJob>> getIntegrationsSpeechNuanceNuanceIntegrationIdBotJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AsyncJob>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncJob>() {}, new AsyncApiCallback<ApiResponse<AsyncJob>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncJob> response = (ApiResponse<AsyncJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncJob> response = (ApiResponse<AsyncJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the result of an asynchronous Nuance bot GET job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NuanceBot> getIntegrationsSpeechNuanceNuanceIntegrationIdBotJobResultsAsync(GetIntegrationsSpeechNuanceNuanceIntegrationIdBotJobResultsRequest request, final AsyncApiCallback<NuanceBot> callback) {
    try {
      final SettableFuture<NuanceBot> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NuanceBot>() {}, new AsyncApiCallback<ApiResponse<NuanceBot>>() {
        @Override
        public void onCompleted(ApiResponse<NuanceBot> response) {
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
   * Get the result of an asynchronous Nuance bot GET job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NuanceBot>> getIntegrationsSpeechNuanceNuanceIntegrationIdBotJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NuanceBot>> callback) {
    try {
      final SettableFuture<ApiResponse<NuanceBot>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NuanceBot>() {}, new AsyncApiCallback<ApiResponse<NuanceBot>>() {
        @Override
        public void onCompleted(ApiResponse<NuanceBot> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NuanceBot> response = (ApiResponse<NuanceBot>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NuanceBot> response = (ApiResponse<NuanceBot>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of Nuance bots available in the specified Integration
   * If the 'onlyRegisteredBots' param is set, the returned data will only include the Nuance bots which have configured client secrets within the Integration,  otherwise all of the Nuance bots available to the Integration's configured discovery credentials are returned.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NuanceBotEntityListing> getIntegrationsSpeechNuanceNuanceIntegrationIdBotsAsync(GetIntegrationsSpeechNuanceNuanceIntegrationIdBotsRequest request, final AsyncApiCallback<NuanceBotEntityListing> callback) {
    try {
      final SettableFuture<NuanceBotEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NuanceBotEntityListing>() {}, new AsyncApiCallback<ApiResponse<NuanceBotEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<NuanceBotEntityListing> response) {
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
   * Get a list of Nuance bots available in the specified Integration
   * If the 'onlyRegisteredBots' param is set, the returned data will only include the Nuance bots which have configured client secrets within the Integration,  otherwise all of the Nuance bots available to the Integration's configured discovery credentials are returned.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NuanceBotEntityListing>> getIntegrationsSpeechNuanceNuanceIntegrationIdBotsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NuanceBotEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<NuanceBotEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NuanceBotEntityListing>() {}, new AsyncApiCallback<ApiResponse<NuanceBotEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<NuanceBotEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NuanceBotEntityListing> response = (ApiResponse<NuanceBotEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NuanceBotEntityListing> response = (ApiResponse<NuanceBotEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the status of an asynchronous Nuance bots GET job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncJob> getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobAsync(GetIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobRequest request, final AsyncApiCallback<AsyncJob> callback) {
    try {
      final SettableFuture<AsyncJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncJob>() {}, new AsyncApiCallback<ApiResponse<AsyncJob>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncJob> response) {
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
   * Get the status of an asynchronous Nuance bots GET job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncJob>> getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AsyncJob>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncJob>() {}, new AsyncApiCallback<ApiResponse<AsyncJob>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncJob> response = (ApiResponse<AsyncJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncJob> response = (ApiResponse<AsyncJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the result of an asynchronous Nuance bots GET job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NuanceBotEntityListing> getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobResultsAsync(GetIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobResultsRequest request, final AsyncApiCallback<NuanceBotEntityListing> callback) {
    try {
      final SettableFuture<NuanceBotEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NuanceBotEntityListing>() {}, new AsyncApiCallback<ApiResponse<NuanceBotEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<NuanceBotEntityListing> response) {
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
   * Get the result of an asynchronous Nuance bots GET job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NuanceBotEntityListing>> getIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NuanceBotEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<NuanceBotEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NuanceBotEntityListing>() {}, new AsyncApiCallback<ApiResponse<NuanceBotEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<NuanceBotEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NuanceBotEntityListing> response = (ApiResponse<NuanceBotEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NuanceBotEntityListing> response = (ApiResponse<NuanceBotEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get details about a STT engine
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SttEngineEntity> getIntegrationsSpeechSttEngineAsync(GetIntegrationsSpeechSttEngineRequest request, final AsyncApiCallback<SttEngineEntity> callback) {
    try {
      final SettableFuture<SttEngineEntity> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SttEngineEntity>() {}, new AsyncApiCallback<ApiResponse<SttEngineEntity>>() {
        @Override
        public void onCompleted(ApiResponse<SttEngineEntity> response) {
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
   * Get details about a STT engine
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SttEngineEntity>> getIntegrationsSpeechSttEngineAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SttEngineEntity>> callback) {
    try {
      final SettableFuture<ApiResponse<SttEngineEntity>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SttEngineEntity>() {}, new AsyncApiCallback<ApiResponse<SttEngineEntity>>() {
        @Override
        public void onCompleted(ApiResponse<SttEngineEntity> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SttEngineEntity> response = (ApiResponse<SttEngineEntity>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SttEngineEntity> response = (ApiResponse<SttEngineEntity>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of STT engines enabled for org
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SttEngineEntityListing> getIntegrationsSpeechSttEnginesAsync(GetIntegrationsSpeechSttEnginesRequest request, final AsyncApiCallback<SttEngineEntityListing> callback) {
    try {
      final SettableFuture<SttEngineEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SttEngineEntityListing>() {}, new AsyncApiCallback<ApiResponse<SttEngineEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SttEngineEntityListing> response) {
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
   * Get a list of STT engines enabled for org
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SttEngineEntityListing>> getIntegrationsSpeechSttEnginesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SttEngineEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SttEngineEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SttEngineEntityListing>() {}, new AsyncApiCallback<ApiResponse<SttEngineEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SttEngineEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SttEngineEntityListing> response = (ApiResponse<SttEngineEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SttEngineEntityListing> response = (ApiResponse<SttEngineEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * UC integration client application configuration.
   * This endpoint returns basic UI configuration data for the specified Unified Communications integration client application.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UnifiedCommunicationsIntegration> getIntegrationsUnifiedcommunicationsClientappAsync(GetIntegrationsUnifiedcommunicationsClientappRequest request, final AsyncApiCallback<UnifiedCommunicationsIntegration> callback) {
    try {
      final SettableFuture<UnifiedCommunicationsIntegration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UnifiedCommunicationsIntegration>() {}, new AsyncApiCallback<ApiResponse<UnifiedCommunicationsIntegration>>() {
        @Override
        public void onCompleted(ApiResponse<UnifiedCommunicationsIntegration> response) {
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
   * UC integration client application configuration.
   * This endpoint returns basic UI configuration data for the specified Unified Communications integration client application.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UnifiedCommunicationsIntegration>> getIntegrationsUnifiedcommunicationsClientappAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UnifiedCommunicationsIntegration>> callback) {
    try {
      final SettableFuture<ApiResponse<UnifiedCommunicationsIntegration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UnifiedCommunicationsIntegration>() {}, new AsyncApiCallback<ApiResponse<UnifiedCommunicationsIntegration>>() {
        @Override
        public void onCompleted(ApiResponse<UnifiedCommunicationsIntegration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UnifiedCommunicationsIntegration> response = (ApiResponse<UnifiedCommunicationsIntegration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UnifiedCommunicationsIntegration> response = (ApiResponse<UnifiedCommunicationsIntegration>)(ApiResponse<?>)(new ApiException(exception));
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
   * List UC integration client application configurations.
   * This endpoint returns basic UI configuration data for all Unified Communications integrations client applications enabled.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UnifiedCommunicationsIntegrationListing> getIntegrationsUnifiedcommunicationsClientappsAsync(GetIntegrationsUnifiedcommunicationsClientappsRequest request, final AsyncApiCallback<UnifiedCommunicationsIntegrationListing> callback) {
    try {
      final SettableFuture<UnifiedCommunicationsIntegrationListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UnifiedCommunicationsIntegrationListing>() {}, new AsyncApiCallback<ApiResponse<UnifiedCommunicationsIntegrationListing>>() {
        @Override
        public void onCompleted(ApiResponse<UnifiedCommunicationsIntegrationListing> response) {
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
   * List UC integration client application configurations.
   * This endpoint returns basic UI configuration data for all Unified Communications integrations client applications enabled.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UnifiedCommunicationsIntegrationListing>> getIntegrationsUnifiedcommunicationsClientappsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UnifiedCommunicationsIntegrationListing>> callback) {
    try {
      final SettableFuture<ApiResponse<UnifiedCommunicationsIntegrationListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UnifiedCommunicationsIntegrationListing>() {}, new AsyncApiCallback<ApiResponse<UnifiedCommunicationsIntegrationListing>>() {
        @Override
        public void onCompleted(ApiResponse<UnifiedCommunicationsIntegrationListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UnifiedCommunicationsIntegrationListing> response = (ApiResponse<UnifiedCommunicationsIntegrationListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UnifiedCommunicationsIntegrationListing> response = (ApiResponse<UnifiedCommunicationsIntegrationListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create upload presigned URL for draft function package file.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FunctionUploadResponse> postIntegrationsActionDraftFunctionUploadAsync(PostIntegrationsActionDraftFunctionUploadRequest request, final AsyncApiCallback<FunctionUploadResponse> callback) {
    try {
      final SettableFuture<FunctionUploadResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FunctionUploadResponse>() {}, new AsyncApiCallback<ApiResponse<FunctionUploadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FunctionUploadResponse> response) {
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
   * Create upload presigned URL for draft function package file.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FunctionUploadResponse>> postIntegrationsActionDraftFunctionUploadAsync(ApiRequest<FunctionUploadRequest> request, final AsyncApiCallback<ApiResponse<FunctionUploadResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FunctionUploadResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FunctionUploadResponse>() {}, new AsyncApiCallback<ApiResponse<FunctionUploadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FunctionUploadResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FunctionUploadResponse> response = (ApiResponse<FunctionUploadResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FunctionUploadResponse> response = (ApiResponse<FunctionUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new Action. Not supported for 'Function Integration' actions. Function integrations must be created as drafts to allow managing of uploading required ZIP function package before they may be used as a published action.
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
   * Create a new Action. Not supported for 'Function Integration' actions. Function integrations must be created as drafts to allow managing of uploading required ZIP function package before they may be used as a published action.
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
   * Get a Nuance bot in the specified Integration asynchronously
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncJob> postIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsAsync(PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest request, final AsyncApiCallback<AsyncJob> callback) {
    try {
      final SettableFuture<AsyncJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncJob>() {}, new AsyncApiCallback<ApiResponse<AsyncJob>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncJob> response) {
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
   * Get a Nuance bot in the specified Integration asynchronously
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncJob>> postIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsAsync(ApiRequest<String> request, final AsyncApiCallback<ApiResponse<AsyncJob>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncJob>() {}, new AsyncApiCallback<ApiResponse<AsyncJob>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncJob> response = (ApiResponse<AsyncJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncJob> response = (ApiResponse<AsyncJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of Nuance bots in the specified Integration asynchronously
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncJob> postIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobsAsync(PostIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobsRequest request, final AsyncApiCallback<AsyncJob> callback) {
    try {
      final SettableFuture<AsyncJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncJob>() {}, new AsyncApiCallback<ApiResponse<AsyncJob>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncJob> response) {
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
   * Get a list of Nuance bots in the specified Integration asynchronously
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncJob>> postIntegrationsSpeechNuanceNuanceIntegrationIdBotsJobsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AsyncJob>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncJob>() {}, new AsyncApiCallback<ApiResponse<AsyncJob>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncJob> response = (ApiResponse<AsyncJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncJob> response = (ApiResponse<AsyncJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Try out a single credential for a Nuance bot to know if the secret is correct
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchValidateAsync(PostIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchValidateRequest request, final AsyncApiCallback<Void> callback) {
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
   * Try out a single credential for a Nuance bot to know if the secret is correct
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchValidateAsync(ApiRequest<BotExecutionConfiguration> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Update draft function settings.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FunctionConfig> putIntegrationsActionDraftFunctionAsync(PutIntegrationsActionDraftFunctionRequest request, final AsyncApiCallback<FunctionConfig> callback) {
    try {
      final SettableFuture<FunctionConfig> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FunctionConfig>() {}, new AsyncApiCallback<ApiResponse<FunctionConfig>>() {
        @Override
        public void onCompleted(ApiResponse<FunctionConfig> response) {
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
   * Update draft function settings.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FunctionConfig>> putIntegrationsActionDraftFunctionAsync(ApiRequest<Function> request, final AsyncApiCallback<ApiResponse<FunctionConfig>> callback) {
    try {
      final SettableFuture<ApiResponse<FunctionConfig>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FunctionConfig>() {}, new AsyncApiCallback<ApiResponse<FunctionConfig>>() {
        @Override
        public void onCompleted(ApiResponse<FunctionConfig> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FunctionConfig> response = (ApiResponse<FunctionConfig>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FunctionConfig> response = (ApiResponse<FunctionConfig>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the Nuance bot list for the specific bots made available to Genesys Cloud in the specified Integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> putIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchSettingsAsync(PutIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchSettingsRequest request, final AsyncApiCallback<Void> callback) {
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
   * Update the Nuance bot list for the specific bots made available to Genesys Cloud in the specified Integration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> putIntegrationsSpeechNuanceNuanceIntegrationIdBotsLaunchSettingsAsync(ApiRequest<NuanceBotLaunchSettings> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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

  /**
   * Bulk integration presence ingestion
   * This endpoint accepts bulk presence updates from a 3rd-party presence integration and maps the 3rd-party user to a Genesys Cloud user via the matching email address. The 3rd-party presence value will be mapped to a Genesys Cloud organization presence definition value.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> putIntegrationsUnifiedcommunicationThirdpartypresencesAsync(PutIntegrationsUnifiedcommunicationThirdpartypresencesRequest request, final AsyncApiCallback<String> callback) {
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
   * Bulk integration presence ingestion
   * This endpoint accepts bulk presence updates from a 3rd-party presence integration and maps the 3rd-party user to a Genesys Cloud user via the matching email address. The 3rd-party presence value will be mapped to a Genesys Cloud organization presence definition value.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> putIntegrationsUnifiedcommunicationThirdpartypresencesAsync(ApiRequest<List<UCThirdPartyPresence>> request, final AsyncApiCallback<ApiResponse<String>> callback) {
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
