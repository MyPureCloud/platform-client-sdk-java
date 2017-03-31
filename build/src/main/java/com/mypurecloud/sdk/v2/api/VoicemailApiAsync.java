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
import com.mypurecloud.sdk.v2.model.VoicemailMailboxInfo;
import com.mypurecloud.sdk.v2.model.VoicemailMessageEntityListing;
import com.mypurecloud.sdk.v2.model.VoicemailGroupPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailUserPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailMediaInfo;
import com.mypurecloud.sdk.v2.model.VoicemailOrganizationPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;
import com.mypurecloud.sdk.v2.model.CopyVoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteVoicemailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteVoicemailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailGroupMailboxRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailGroupMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailGroupPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMailboxRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMeMailboxRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMeMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMePolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMessageMediaRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailUserpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailGroupPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailMePolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailUserpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PostVoicemailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostVoicemailSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PutVoicemailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.PutVoicemailPolicyRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class VoicemailApiAsync {
  private final ApiClient pcapiClient;

  public VoicemailApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public VoicemailApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a message.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteVoicemailMessageAsync(DeleteVoicemailMessageRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a message.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteVoicemailMessageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete all voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteVoicemailMessagesAsync(DeleteVoicemailMessagesRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete all voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteVoicemailMessagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Get the group&#39;s mailbox information
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailMailboxInfo> getVoicemailGroupMailboxAsync(GetVoicemailGroupMailboxRequest request, AsyncApiCallback<VoicemailMailboxInfo> callback) {
    return pcapiClient.<VoicemailMailboxInfo>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailMailboxInfo>() {}, callback);
  }

  /**
   * Get the group&#39;s mailbox information
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailMailboxInfo>> getVoicemailGroupMailboxAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailMailboxInfo>> callback) {
    return pcapiClient.<VoicemailMailboxInfo>invokeAPIVerboseAsync(request, new TypeReference<VoicemailMailboxInfo>() {}, callback);
  }

  /**
   * List voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailMessageEntityListing> getVoicemailGroupMessagesAsync(GetVoicemailGroupMessagesRequest request, AsyncApiCallback<VoicemailMessageEntityListing> callback) {
    return pcapiClient.<VoicemailMessageEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {}, callback);
  }

  /**
   * List voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailMessageEntityListing>> getVoicemailGroupMessagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>> callback) {
    return pcapiClient.<VoicemailMessageEntityListing>invokeAPIVerboseAsync(request, new TypeReference<VoicemailMessageEntityListing>() {}, callback);
  }

  /**
   * Get a group&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailGroupPolicy> getVoicemailGroupPolicyAsync(GetVoicemailGroupPolicyRequest request, AsyncApiCallback<VoicemailGroupPolicy> callback) {
    return pcapiClient.<VoicemailGroupPolicy>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailGroupPolicy>() {}, callback);
  }

  /**
   * Get a group&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailGroupPolicy>> getVoicemailGroupPolicyAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailGroupPolicy>> callback) {
    return pcapiClient.<VoicemailGroupPolicy>invokeAPIVerboseAsync(request, new TypeReference<VoicemailGroupPolicy>() {}, callback);
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailMailboxInfo> getVoicemailMailboxAsync(GetVoicemailMailboxRequest request, AsyncApiCallback<VoicemailMailboxInfo> callback) {
    return pcapiClient.<VoicemailMailboxInfo>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailMailboxInfo>() {}, callback);
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailMailboxInfo>> getVoicemailMailboxAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailMailboxInfo>> callback) {
    return pcapiClient.<VoicemailMailboxInfo>invokeAPIVerboseAsync(request, new TypeReference<VoicemailMailboxInfo>() {}, callback);
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailMailboxInfo> getVoicemailMeMailboxAsync(GetVoicemailMeMailboxRequest request, AsyncApiCallback<VoicemailMailboxInfo> callback) {
    return pcapiClient.<VoicemailMailboxInfo>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailMailboxInfo>() {}, callback);
  }

  /**
   * Get the current user&#39;s mailbox information
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailMailboxInfo>> getVoicemailMeMailboxAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailMailboxInfo>> callback) {
    return pcapiClient.<VoicemailMailboxInfo>invokeAPIVerboseAsync(request, new TypeReference<VoicemailMailboxInfo>() {}, callback);
  }

  /**
   * List voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailMessageEntityListing> getVoicemailMeMessagesAsync(GetVoicemailMeMessagesRequest request, AsyncApiCallback<VoicemailMessageEntityListing> callback) {
    return pcapiClient.<VoicemailMessageEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {}, callback);
  }

  /**
   * List voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailMessageEntityListing>> getVoicemailMeMessagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>> callback) {
    return pcapiClient.<VoicemailMessageEntityListing>invokeAPIVerboseAsync(request, new TypeReference<VoicemailMessageEntityListing>() {}, callback);
  }

  /**
   * Get the current user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailUserPolicy> getVoicemailMePolicyAsync(GetVoicemailMePolicyRequest request, AsyncApiCallback<VoicemailUserPolicy> callback) {
    return pcapiClient.<VoicemailUserPolicy>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {}, callback);
  }

  /**
   * Get the current user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailUserPolicy>> getVoicemailMePolicyAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailUserPolicy>> callback) {
    return pcapiClient.<VoicemailUserPolicy>invokeAPIVerboseAsync(request, new TypeReference<VoicemailUserPolicy>() {}, callback);
  }

  /**
   * Get message.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailMessage> getVoicemailMessageAsync(GetVoicemailMessageRequest request, AsyncApiCallback<VoicemailMessage> callback) {
    return pcapiClient.<VoicemailMessage>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {}, callback);
  }

  /**
   * Get message.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailMessage>> getVoicemailMessageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailMessage>> callback) {
    return pcapiClient.<VoicemailMessage>invokeAPIVerboseAsync(request, new TypeReference<VoicemailMessage>() {}, callback);
  }

  /**
   * Get media playback URI for this message
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailMediaInfo> getVoicemailMessageMediaAsync(GetVoicemailMessageMediaRequest request, AsyncApiCallback<VoicemailMediaInfo> callback) {
    return pcapiClient.<VoicemailMediaInfo>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailMediaInfo>() {}, callback);
  }

  /**
   * Get media playback URI for this message
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailMediaInfo>> getVoicemailMessageMediaAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailMediaInfo>> callback) {
    return pcapiClient.<VoicemailMediaInfo>invokeAPIVerboseAsync(request, new TypeReference<VoicemailMediaInfo>() {}, callback);
  }

  /**
   * List voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailMessageEntityListing> getVoicemailMessagesAsync(GetVoicemailMessagesRequest request, AsyncApiCallback<VoicemailMessageEntityListing> callback) {
    return pcapiClient.<VoicemailMessageEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {}, callback);
  }

  /**
   * List voicemail messages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailMessageEntityListing>> getVoicemailMessagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>> callback) {
    return pcapiClient.<VoicemailMessageEntityListing>invokeAPIVerboseAsync(request, new TypeReference<VoicemailMessageEntityListing>() {}, callback);
  }

  /**
   * Get a policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailOrganizationPolicy> getVoicemailPolicyAsync(GetVoicemailPolicyRequest request, AsyncApiCallback<VoicemailOrganizationPolicy> callback) {
    return pcapiClient.<VoicemailOrganizationPolicy>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailOrganizationPolicy>() {}, callback);
  }

  /**
   * Get a policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailOrganizationPolicy>> getVoicemailPolicyAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailOrganizationPolicy>> callback) {
    return pcapiClient.<VoicemailOrganizationPolicy>invokeAPIVerboseAsync(request, new TypeReference<VoicemailOrganizationPolicy>() {}, callback);
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailsSearchResponse> getVoicemailSearchAsync(GetVoicemailSearchRequest request, AsyncApiCallback<VoicemailsSearchResponse> callback) {
    return pcapiClient.<VoicemailsSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {}, callback);
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailsSearchResponse>> getVoicemailSearchAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailsSearchResponse>> callback) {
    return pcapiClient.<VoicemailsSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<VoicemailsSearchResponse>() {}, callback);
  }

  /**
   * Get a user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailUserPolicy> getVoicemailUserpolicyAsync(GetVoicemailUserpolicyRequest request, AsyncApiCallback<VoicemailUserPolicy> callback) {
    return pcapiClient.<VoicemailUserPolicy>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {}, callback);
  }

  /**
   * Get a user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailUserPolicy>> getVoicemailUserpolicyAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailUserPolicy>> callback) {
    return pcapiClient.<VoicemailUserPolicy>invokeAPIVerboseAsync(request, new TypeReference<VoicemailUserPolicy>() {}, callback);
  }

  /**
   * Update a group&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailGroupPolicy> patchVoicemailGroupPolicyAsync(PatchVoicemailGroupPolicyRequest request, AsyncApiCallback<VoicemailGroupPolicy> callback) {
    return pcapiClient.<VoicemailGroupPolicy>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailGroupPolicy>() {}, callback);
  }

  /**
   * Update a group&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailGroupPolicy>> patchVoicemailGroupPolicyAsync(ApiRequest<VoicemailGroupPolicy> request, AsyncApiCallback<ApiResponse<VoicemailGroupPolicy>> callback) {
    return pcapiClient.<VoicemailGroupPolicy>invokeAPIVerboseAsync(request, new TypeReference<VoicemailGroupPolicy>() {}, callback);
  }

  /**
   * Update the current user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailUserPolicy> patchVoicemailMePolicyAsync(PatchVoicemailMePolicyRequest request, AsyncApiCallback<VoicemailUserPolicy> callback) {
    return pcapiClient.<VoicemailUserPolicy>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {}, callback);
  }

  /**
   * Update the current user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailUserPolicy>> patchVoicemailMePolicyAsync(ApiRequest<VoicemailUserPolicy> request, AsyncApiCallback<ApiResponse<VoicemailUserPolicy>> callback) {
    return pcapiClient.<VoicemailUserPolicy>invokeAPIVerboseAsync(request, new TypeReference<VoicemailUserPolicy>() {}, callback);
  }

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailUserPolicy> patchVoicemailUserpolicyAsync(PatchVoicemailUserpolicyRequest request, AsyncApiCallback<VoicemailUserPolicy> callback) {
    return pcapiClient.<VoicemailUserPolicy>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {}, callback);
  }

  /**
   * Update a user&#39;s voicemail policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailUserPolicy>> patchVoicemailUserpolicyAsync(ApiRequest<VoicemailUserPolicy> request, AsyncApiCallback<ApiResponse<VoicemailUserPolicy>> callback) {
    return pcapiClient.<VoicemailUserPolicy>invokeAPIVerboseAsync(request, new TypeReference<VoicemailUserPolicy>() {}, callback);
  }

  /**
   * Copy a voicemail message to a user or group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailMessage> postVoicemailMessagesAsync(PostVoicemailMessagesRequest request, AsyncApiCallback<VoicemailMessage> callback) {
    return pcapiClient.<VoicemailMessage>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {}, callback);
  }

  /**
   * Copy a voicemail message to a user or group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailMessage>> postVoicemailMessagesAsync(ApiRequest<CopyVoicemailMessage> request, AsyncApiCallback<ApiResponse<VoicemailMessage>> callback) {
    return pcapiClient.<VoicemailMessage>invokeAPIVerboseAsync(request, new TypeReference<VoicemailMessage>() {}, callback);
  }

  /**
   * Search voicemails
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailsSearchResponse> postVoicemailSearchAsync(PostVoicemailSearchRequest request, AsyncApiCallback<VoicemailsSearchResponse> callback) {
    return pcapiClient.<VoicemailsSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {}, callback);
  }

  /**
   * Search voicemails
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailsSearchResponse>> postVoicemailSearchAsync(ApiRequest<VoicemailSearchRequest> request, AsyncApiCallback<ApiResponse<VoicemailsSearchResponse>> callback) {
    return pcapiClient.<VoicemailsSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<VoicemailsSearchResponse>() {}, callback);
  }

  /**
   * Update a message.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailMessage> putVoicemailMessageAsync(PutVoicemailMessageRequest request, AsyncApiCallback<VoicemailMessage> callback) {
    return pcapiClient.<VoicemailMessage>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {}, callback);
  }

  /**
   * Update a message.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailMessage>> putVoicemailMessageAsync(ApiRequest<VoicemailMessage> request, AsyncApiCallback<ApiResponse<VoicemailMessage>> callback) {
    return pcapiClient.<VoicemailMessage>invokeAPIVerboseAsync(request, new TypeReference<VoicemailMessage>() {}, callback);
  }

  /**
   * Update a policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailOrganizationPolicy> putVoicemailPolicyAsync(PutVoicemailPolicyRequest request, AsyncApiCallback<VoicemailOrganizationPolicy> callback) {
    return pcapiClient.<VoicemailOrganizationPolicy>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailOrganizationPolicy>() {}, callback);
  }

  /**
   * Update a policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailOrganizationPolicy>> putVoicemailPolicyAsync(ApiRequest<VoicemailOrganizationPolicy> request, AsyncApiCallback<ApiResponse<VoicemailOrganizationPolicy>> callback) {
    return pcapiClient.<VoicemailOrganizationPolicy>invokeAPIVerboseAsync(request, new TypeReference<VoicemailOrganizationPolicy>() {}, callback);
  }

}
