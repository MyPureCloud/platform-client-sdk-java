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
import com.mypurecloud.sdk.v2.model.OrphanRecording;
import com.mypurecloud.sdk.v2.model.Recording;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.OrphanRecordingListing;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfigurationListing;
import com.mypurecloud.sdk.v2.model.PolicyEntityListing;
import com.mypurecloud.sdk.v2.model.Policy;
import com.mypurecloud.sdk.v2.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.v2.model.KeyRotationSchedule;
import com.mypurecloud.sdk.v2.model.RecordingSettings;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionListing;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionRequest;
import com.mypurecloud.sdk.v2.model.LocalEncryptionKeyRequest;
import com.mypurecloud.sdk.v2.model.EncryptionKey;
import com.mypurecloud.sdk.v2.model.PolicyCreate;
import com.mypurecloud.sdk.v2.model.OrphanUpdateRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteConversationRecordingAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOrphanrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingAnnotationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrphanrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrphanrecordingMediaRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrphanrecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingLocalkeysSettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingLocalkeysSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingRecordingkeysRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingRecordingkeysRotationscheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingsScreensessionsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRecordingsScreensessionRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationRecordingAnnotationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingLocalkeysRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingLocalkeysSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingRecordingkeysRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationRecordingRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationRecordingAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrphanrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingLocalkeysSettingRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingRecordingkeysRotationscheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingSettingsRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class RecordingApiAsync {
  private final ApiClient pcapiClient;

  public RecordingApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public RecordingApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteConversationRecordingAnnotationAsync(DeleteConversationRecordingAnnotationRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteConversationRecordingAnnotationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Deletes a single orphan recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OrphanRecording> deleteOrphanrecordingAsync(DeleteOrphanrecordingRequest request, AsyncApiCallback<OrphanRecording> callback) throws ApiException {
    return pcapiClient.<OrphanRecording>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OrphanRecording>() {}, callback);
  }

  /**
   * Deletes a single orphan recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OrphanRecording>> deleteOrphanrecordingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OrphanRecording>> callback) throws ApiException {
    return pcapiClient.<OrphanRecording>invokeAPIVerboseAsync(request, new TypeReference<OrphanRecording>() {}, callback);
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteRecordingMediaretentionpoliciesAsync(DeleteRecordingMediaretentionpoliciesRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteRecordingMediaretentionpoliciesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteRecordingMediaretentionpolicyAsync(DeleteRecordingMediaretentionpolicyRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteRecordingMediaretentionpolicyAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Gets a specific recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Recording> getConversationRecordingAsync(GetConversationRecordingRequest request, AsyncApiCallback<Recording> callback) throws ApiException {
    return pcapiClient.<Recording>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Recording>() {}, callback);
  }

  /**
   * Gets a specific recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Recording>> getConversationRecordingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Recording>> callback) throws ApiException {
    return pcapiClient.<Recording>invokeAPIVerboseAsync(request, new TypeReference<Recording>() {}, callback);
  }

  /**
   * Get annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Annotation> getConversationRecordingAnnotationAsync(GetConversationRecordingAnnotationRequest request, AsyncApiCallback<Annotation> callback) throws ApiException {
    return pcapiClient.<Annotation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Annotation>() {}, callback);
  }

  /**
   * Get annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Annotation>> getConversationRecordingAnnotationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Annotation>> callback) throws ApiException {
    return pcapiClient.<Annotation>invokeAPIVerboseAsync(request, new TypeReference<Annotation>() {}, callback);
  }

  /**
   * Get annotations for recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<Annotation>> getConversationRecordingAnnotationsAsync(GetConversationRecordingAnnotationsRequest request, AsyncApiCallback<List<Annotation>> callback) throws ApiException {
    return pcapiClient.<List<Annotation>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<Annotation>>() {}, callback);
  }

  /**
   * Get annotations for recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<Annotation>>> getConversationRecordingAnnotationsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<Annotation>>> callback) throws ApiException {
    return pcapiClient.<List<Annotation>>invokeAPIVerboseAsync(request, new TypeReference<List<Annotation>>() {}, callback);
  }

  /**
   * Get all of a Conversation&#39;s Recordings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<Recording>> getConversationRecordingsAsync(GetConversationRecordingsRequest request, AsyncApiCallback<List<Recording>> callback) throws ApiException {
    return pcapiClient.<List<Recording>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<Recording>>() {}, callback);
  }

  /**
   * Get all of a Conversation&#39;s Recordings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<Recording>>> getConversationRecordingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<Recording>>> callback) throws ApiException {
    return pcapiClient.<List<Recording>>invokeAPIVerboseAsync(request, new TypeReference<List<Recording>>() {}, callback);
  }

  /**
   * Gets a single orphan recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OrphanRecording> getOrphanrecordingAsync(GetOrphanrecordingRequest request, AsyncApiCallback<OrphanRecording> callback) throws ApiException {
    return pcapiClient.<OrphanRecording>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OrphanRecording>() {}, callback);
  }

  /**
   * Gets a single orphan recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OrphanRecording>> getOrphanrecordingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OrphanRecording>> callback) throws ApiException {
    return pcapiClient.<OrphanRecording>invokeAPIVerboseAsync(request, new TypeReference<OrphanRecording>() {}, callback);
  }

  /**
   * Gets the media of a single orphan recording
   * A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Recording> getOrphanrecordingMediaAsync(GetOrphanrecordingMediaRequest request, AsyncApiCallback<Recording> callback) throws ApiException {
    return pcapiClient.<Recording>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Recording>() {}, callback);
  }

  /**
   * Gets the media of a single orphan recording
   * A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Recording>> getOrphanrecordingMediaAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Recording>> callback) throws ApiException {
    return pcapiClient.<Recording>invokeAPIVerboseAsync(request, new TypeReference<Recording>() {}, callback);
  }

  /**
   * Gets all orphan recordings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OrphanRecordingListing> getOrphanrecordingsAsync(GetOrphanrecordingsRequest request, AsyncApiCallback<OrphanRecordingListing> callback) throws ApiException {
    return pcapiClient.<OrphanRecordingListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OrphanRecordingListing>() {}, callback);
  }

  /**
   * Gets all orphan recordings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OrphanRecordingListing>> getOrphanrecordingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OrphanRecordingListing>> callback) throws ApiException {
    return pcapiClient.<OrphanRecordingListing>invokeAPIVerboseAsync(request, new TypeReference<OrphanRecordingListing>() {}, callback);
  }

  /**
   * Get the local encryption settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LocalEncryptionConfiguration> getRecordingLocalkeysSettingAsync(GetRecordingLocalkeysSettingRequest request, AsyncApiCallback<LocalEncryptionConfiguration> callback) throws ApiException {
    return pcapiClient.<LocalEncryptionConfiguration>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LocalEncryptionConfiguration>() {}, callback);
  }

  /**
   * Get the local encryption settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LocalEncryptionConfiguration>> getRecordingLocalkeysSettingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LocalEncryptionConfiguration>> callback) throws ApiException {
    return pcapiClient.<LocalEncryptionConfiguration>invokeAPIVerboseAsync(request, new TypeReference<LocalEncryptionConfiguration>() {}, callback);
  }

  /**
   * gets a list local key settings data
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LocalEncryptionConfigurationListing> getRecordingLocalkeysSettingsAsync(GetRecordingLocalkeysSettingsRequest request, AsyncApiCallback<LocalEncryptionConfigurationListing> callback) throws ApiException {
    return pcapiClient.<LocalEncryptionConfigurationListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LocalEncryptionConfigurationListing>() {}, callback);
  }

  /**
   * gets a list local key settings data
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LocalEncryptionConfigurationListing>> getRecordingLocalkeysSettingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LocalEncryptionConfigurationListing>> callback) throws ApiException {
    return pcapiClient.<LocalEncryptionConfigurationListing>invokeAPIVerboseAsync(request, new TypeReference<LocalEncryptionConfigurationListing>() {}, callback);
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary&#x3D;true to this endpoint
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PolicyEntityListing> getRecordingMediaretentionpoliciesAsync(GetRecordingMediaretentionpoliciesRequest request, AsyncApiCallback<PolicyEntityListing> callback) throws ApiException {
    return pcapiClient.<PolicyEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PolicyEntityListing>() {}, callback);
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary&#x3D;true to this endpoint
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PolicyEntityListing>> getRecordingMediaretentionpoliciesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PolicyEntityListing>> callback) throws ApiException {
    return pcapiClient.<PolicyEntityListing>invokeAPIVerboseAsync(request, new TypeReference<PolicyEntityListing>() {}, callback);
  }

  /**
   * Get a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Policy> getRecordingMediaretentionpolicyAsync(GetRecordingMediaretentionpolicyRequest request, AsyncApiCallback<Policy> callback) throws ApiException {
    return pcapiClient.<Policy>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Policy>() {}, callback);
  }

  /**
   * Get a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Policy>> getRecordingMediaretentionpolicyAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Policy>> callback) throws ApiException {
    return pcapiClient.<Policy>invokeAPIVerboseAsync(request, new TypeReference<Policy>() {}, callback);
  }

  /**
   * Get encryption key list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EncryptionKeyEntityListing> getRecordingRecordingkeysAsync(GetRecordingRecordingkeysRequest request, AsyncApiCallback<EncryptionKeyEntityListing> callback) throws ApiException {
    return pcapiClient.<EncryptionKeyEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EncryptionKeyEntityListing>() {}, callback);
  }

  /**
   * Get encryption key list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EncryptionKeyEntityListing>> getRecordingRecordingkeysAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EncryptionKeyEntityListing>> callback) throws ApiException {
    return pcapiClient.<EncryptionKeyEntityListing>invokeAPIVerboseAsync(request, new TypeReference<EncryptionKeyEntityListing>() {}, callback);
  }

  /**
   * Get key rotation schedule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<KeyRotationSchedule> getRecordingRecordingkeysRotationscheduleAsync(GetRecordingRecordingkeysRotationscheduleRequest request, AsyncApiCallback<KeyRotationSchedule> callback) throws ApiException {
    return pcapiClient.<KeyRotationSchedule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<KeyRotationSchedule>() {}, callback);
  }

  /**
   * Get key rotation schedule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<KeyRotationSchedule>> getRecordingRecordingkeysRotationscheduleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<KeyRotationSchedule>> callback) throws ApiException {
    return pcapiClient.<KeyRotationSchedule>invokeAPIVerboseAsync(request, new TypeReference<KeyRotationSchedule>() {}, callback);
  }

  /**
   * Get the Recording Settings for the Organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RecordingSettings> getRecordingSettingsAsync(GetRecordingSettingsRequest request, AsyncApiCallback<RecordingSettings> callback) throws ApiException {
    return pcapiClient.<RecordingSettings>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RecordingSettings>() {}, callback);
  }

  /**
   * Get the Recording Settings for the Organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RecordingSettings>> getRecordingSettingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RecordingSettings>> callback) throws ApiException {
    return pcapiClient.<RecordingSettings>invokeAPIVerboseAsync(request, new TypeReference<RecordingSettings>() {}, callback);
  }

  /**
   * Retrieves a paged listing of screen recording sessions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ScreenRecordingSessionListing> getRecordingsScreensessionsAsync(GetRecordingsScreensessionsRequest request, AsyncApiCallback<ScreenRecordingSessionListing> callback) throws ApiException {
    return pcapiClient.<ScreenRecordingSessionListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ScreenRecordingSessionListing>() {}, callback);
  }

  /**
   * Retrieves a paged listing of screen recording sessions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ScreenRecordingSessionListing>> getRecordingsScreensessionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ScreenRecordingSessionListing>> callback) throws ApiException {
    return pcapiClient.<ScreenRecordingSessionListing>invokeAPIVerboseAsync(request, new TypeReference<ScreenRecordingSessionListing>() {}, callback);
  }

  /**
   * Patch a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Policy> patchRecordingMediaretentionpolicyAsync(PatchRecordingMediaretentionpolicyRequest request, AsyncApiCallback<Policy> callback) throws ApiException {
    return pcapiClient.<Policy>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Policy>() {}, callback);
  }

  /**
   * Patch a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Policy>> patchRecordingMediaretentionpolicyAsync(ApiRequest<Policy> request, AsyncApiCallback<ApiResponse<Policy>> callback) throws ApiException {
    return pcapiClient.<Policy>invokeAPIVerboseAsync(request, new TypeReference<Policy>() {}, callback);
  }

  /**
   * Update a screen recording session
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchRecordingsScreensessionAsync(PatchRecordingsScreensessionRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Update a screen recording session
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchRecordingsScreensessionAsync(ApiRequest<ScreenRecordingSessionRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Create annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Annotation> postConversationRecordingAnnotationsAsync(PostConversationRecordingAnnotationsRequest request, AsyncApiCallback<Annotation> callback) throws ApiException {
    return pcapiClient.<Annotation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Annotation>() {}, callback);
  }

  /**
   * Create annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Annotation>> postConversationRecordingAnnotationsAsync(ApiRequest<Annotation> request, AsyncApiCallback<ApiResponse<Annotation>> callback) throws ApiException {
    return pcapiClient.<Annotation>invokeAPIVerboseAsync(request, new TypeReference<Annotation>() {}, callback);
  }

  /**
   * create a local recording key
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EncryptionKey> postRecordingLocalkeysAsync(PostRecordingLocalkeysRequest request, AsyncApiCallback<EncryptionKey> callback) throws ApiException {
    return pcapiClient.<EncryptionKey>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EncryptionKey>() {}, callback);
  }

  /**
   * create a local recording key
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EncryptionKey>> postRecordingLocalkeysAsync(ApiRequest<LocalEncryptionKeyRequest> request, AsyncApiCallback<ApiResponse<EncryptionKey>> callback) throws ApiException {
    return pcapiClient.<EncryptionKey>invokeAPIVerboseAsync(request, new TypeReference<EncryptionKey>() {}, callback);
  }

  /**
   * create settings for local key creation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LocalEncryptionConfiguration> postRecordingLocalkeysSettingsAsync(PostRecordingLocalkeysSettingsRequest request, AsyncApiCallback<LocalEncryptionConfiguration> callback) throws ApiException {
    return pcapiClient.<LocalEncryptionConfiguration>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LocalEncryptionConfiguration>() {}, callback);
  }

  /**
   * create settings for local key creation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LocalEncryptionConfiguration>> postRecordingLocalkeysSettingsAsync(ApiRequest<LocalEncryptionConfiguration> request, AsyncApiCallback<ApiResponse<LocalEncryptionConfiguration>> callback) throws ApiException {
    return pcapiClient.<LocalEncryptionConfiguration>invokeAPIVerboseAsync(request, new TypeReference<LocalEncryptionConfiguration>() {}, callback);
  }

  /**
   * Create media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Policy> postRecordingMediaretentionpoliciesAsync(PostRecordingMediaretentionpoliciesRequest request, AsyncApiCallback<Policy> callback) throws ApiException {
    return pcapiClient.<Policy>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Policy>() {}, callback);
  }

  /**
   * Create media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Policy>> postRecordingMediaretentionpoliciesAsync(ApiRequest<PolicyCreate> request, AsyncApiCallback<ApiResponse<Policy>> callback) throws ApiException {
    return pcapiClient.<Policy>invokeAPIVerboseAsync(request, new TypeReference<Policy>() {}, callback);
  }

  /**
   * Create encryption key
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EncryptionKey> postRecordingRecordingkeysAsync(PostRecordingRecordingkeysRequest request, AsyncApiCallback<EncryptionKey> callback) throws ApiException {
    return pcapiClient.<EncryptionKey>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EncryptionKey>() {}, callback);
  }

  /**
   * Create encryption key
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EncryptionKey>> postRecordingRecordingkeysAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EncryptionKey>> callback) throws ApiException {
    return pcapiClient.<EncryptionKey>invokeAPIVerboseAsync(request, new TypeReference<EncryptionKey>() {}, callback);
  }

  /**
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Recording> putConversationRecordingAsync(PutConversationRecordingRequest request, AsyncApiCallback<Recording> callback) throws ApiException {
    return pcapiClient.<Recording>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Recording>() {}, callback);
  }

  /**
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Recording>> putConversationRecordingAsync(ApiRequest<Recording> request, AsyncApiCallback<ApiResponse<Recording>> callback) throws ApiException {
    return pcapiClient.<Recording>invokeAPIVerboseAsync(request, new TypeReference<Recording>() {}, callback);
  }

  /**
   * Update annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Annotation> putConversationRecordingAnnotationAsync(PutConversationRecordingAnnotationRequest request, AsyncApiCallback<Annotation> callback) throws ApiException {
    return pcapiClient.<Annotation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Annotation>() {}, callback);
  }

  /**
   * Update annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Annotation>> putConversationRecordingAnnotationAsync(ApiRequest<Annotation> request, AsyncApiCallback<ApiResponse<Annotation>> callback) throws ApiException {
    return pcapiClient.<Annotation>invokeAPIVerboseAsync(request, new TypeReference<Annotation>() {}, callback);
  }

  /**
   * Updates an orphan recording to a regular recording with retention values
   * If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Recording> putOrphanrecordingAsync(PutOrphanrecordingRequest request, AsyncApiCallback<Recording> callback) throws ApiException {
    return pcapiClient.<Recording>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Recording>() {}, callback);
  }

  /**
   * Updates an orphan recording to a regular recording with retention values
   * If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Recording>> putOrphanrecordingAsync(ApiRequest<OrphanUpdateRequest> request, AsyncApiCallback<ApiResponse<Recording>> callback) throws ApiException {
    return pcapiClient.<Recording>invokeAPIVerboseAsync(request, new TypeReference<Recording>() {}, callback);
  }

  /**
   * Update the local encryption settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LocalEncryptionConfiguration> putRecordingLocalkeysSettingAsync(PutRecordingLocalkeysSettingRequest request, AsyncApiCallback<LocalEncryptionConfiguration> callback) throws ApiException {
    return pcapiClient.<LocalEncryptionConfiguration>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LocalEncryptionConfiguration>() {}, callback);
  }

  /**
   * Update the local encryption settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LocalEncryptionConfiguration>> putRecordingLocalkeysSettingAsync(ApiRequest<LocalEncryptionConfiguration> request, AsyncApiCallback<ApiResponse<LocalEncryptionConfiguration>> callback) throws ApiException {
    return pcapiClient.<LocalEncryptionConfiguration>invokeAPIVerboseAsync(request, new TypeReference<LocalEncryptionConfiguration>() {}, callback);
  }

  /**
   * Update a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Policy> putRecordingMediaretentionpolicyAsync(PutRecordingMediaretentionpolicyRequest request, AsyncApiCallback<Policy> callback) throws ApiException {
    return pcapiClient.<Policy>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Policy>() {}, callback);
  }

  /**
   * Update a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Policy>> putRecordingMediaretentionpolicyAsync(ApiRequest<Policy> request, AsyncApiCallback<ApiResponse<Policy>> callback) throws ApiException {
    return pcapiClient.<Policy>invokeAPIVerboseAsync(request, new TypeReference<Policy>() {}, callback);
  }

  /**
   * Update key rotation schedule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<KeyRotationSchedule> putRecordingRecordingkeysRotationscheduleAsync(PutRecordingRecordingkeysRotationscheduleRequest request, AsyncApiCallback<KeyRotationSchedule> callback) throws ApiException {
    return pcapiClient.<KeyRotationSchedule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<KeyRotationSchedule>() {}, callback);
  }

  /**
   * Update key rotation schedule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<KeyRotationSchedule>> putRecordingRecordingkeysRotationscheduleAsync(ApiRequest<KeyRotationSchedule> request, AsyncApiCallback<ApiResponse<KeyRotationSchedule>> callback) throws ApiException {
    return pcapiClient.<KeyRotationSchedule>invokeAPIVerboseAsync(request, new TypeReference<KeyRotationSchedule>() {}, callback);
  }

  /**
   * Update the Recording Settings for the Organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RecordingSettings> putRecordingSettingsAsync(PutRecordingSettingsRequest request, AsyncApiCallback<RecordingSettings> callback) throws ApiException {
    return pcapiClient.<RecordingSettings>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RecordingSettings>() {}, callback);
  }

  /**
   * Update the Recording Settings for the Organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RecordingSettings>> putRecordingSettingsAsync(ApiRequest<RecordingSettings> request, AsyncApiCallback<ApiResponse<RecordingSettings>> callback) throws ApiException {
    return pcapiClient.<RecordingSettings>invokeAPIVerboseAsync(request, new TypeReference<RecordingSettings>() {}, callback);
  }

}
