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
import com.mypurecloud.sdk.v2.model.AvailableTopicEntityListing;
import com.mypurecloud.sdk.v2.model.ChannelTopicEntityListing;
import com.mypurecloud.sdk.v2.model.ChannelEntityListing;
import com.mypurecloud.sdk.v2.model.ChannelTopic;
import com.mypurecloud.sdk.v2.model.Channel;


import com.mypurecloud.sdk.v2.api.request.DeleteNotificationsChannelSubscriptionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetNotificationsAvailabletopicsRequest;
import com.mypurecloud.sdk.v2.api.request.GetNotificationsChannelSubscriptionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetNotificationsChannelsRequest;
import com.mypurecloud.sdk.v2.api.request.PostNotificationsChannelSubscriptionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostNotificationsChannelsRequest;
import com.mypurecloud.sdk.v2.api.request.PutNotificationsChannelSubscriptionsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class NotificationsApiAsync {
  private final ApiClient pcapiClient;

  public NotificationsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public NotificationsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Remove all subscriptions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteNotificationsChannelSubscriptionsAsync(DeleteNotificationsChannelSubscriptionsRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Remove all subscriptions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteNotificationsChannelSubscriptionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Get available notification topics.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AvailableTopicEntityListing> getNotificationsAvailabletopicsAsync(GetNotificationsAvailabletopicsRequest request, AsyncApiCallback<AvailableTopicEntityListing> callback) {
    return pcapiClient.<AvailableTopicEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AvailableTopicEntityListing>() {}, callback);
  }

  /**
   * Get available notification topics.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AvailableTopicEntityListing>> getNotificationsAvailabletopicsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<AvailableTopicEntityListing>> callback) {
    return pcapiClient.<AvailableTopicEntityListing>invokeAPIVerboseAsync(request, new TypeReference<AvailableTopicEntityListing>() {}, callback);
  }

  /**
   * The list of all subscriptions for this channel
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ChannelTopicEntityListing> getNotificationsChannelSubscriptionsAsync(GetNotificationsChannelSubscriptionsRequest request, AsyncApiCallback<ChannelTopicEntityListing> callback) {
    return pcapiClient.<ChannelTopicEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ChannelTopicEntityListing>() {}, callback);
  }

  /**
   * The list of all subscriptions for this channel
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ChannelTopicEntityListing>> getNotificationsChannelSubscriptionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ChannelTopicEntityListing>> callback) {
    return pcapiClient.<ChannelTopicEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ChannelTopicEntityListing>() {}, callback);
  }

  /**
   * The list of existing channels
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ChannelEntityListing> getNotificationsChannelsAsync(GetNotificationsChannelsRequest request, AsyncApiCallback<ChannelEntityListing> callback) {
    return pcapiClient.<ChannelEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ChannelEntityListing>() {}, callback);
  }

  /**
   * The list of existing channels
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ChannelEntityListing>> getNotificationsChannelsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ChannelEntityListing>> callback) {
    return pcapiClient.<ChannelEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ChannelEntityListing>() {}, callback);
  }

  /**
   * Add a list of subscriptions to the existing list of subscriptions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ChannelTopicEntityListing> postNotificationsChannelSubscriptionsAsync(PostNotificationsChannelSubscriptionsRequest request, AsyncApiCallback<ChannelTopicEntityListing> callback) {
    return pcapiClient.<ChannelTopicEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ChannelTopicEntityListing>() {}, callback);
  }

  /**
   * Add a list of subscriptions to the existing list of subscriptions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ChannelTopicEntityListing>> postNotificationsChannelSubscriptionsAsync(ApiRequest<List<ChannelTopic>> request, AsyncApiCallback<ApiResponse<ChannelTopicEntityListing>> callback) {
    return pcapiClient.<ChannelTopicEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ChannelTopicEntityListing>() {}, callback);
  }

  /**
   * Create a new channel
   * There is a limit of 10 channels. Creating an 11th channel will remove the channel with oldest last used date.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Channel> postNotificationsChannelsAsync(PostNotificationsChannelsRequest request, AsyncApiCallback<Channel> callback) {
    return pcapiClient.<Channel>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Channel>() {}, callback);
  }

  /**
   * Create a new channel
   * There is a limit of 10 channels. Creating an 11th channel will remove the channel with oldest last used date.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Channel>> postNotificationsChannelsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Channel>> callback) {
    return pcapiClient.<Channel>invokeAPIVerboseAsync(request, new TypeReference<Channel>() {}, callback);
  }

  /**
   * Replace the current list of subscriptions with a new list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ChannelTopicEntityListing> putNotificationsChannelSubscriptionsAsync(PutNotificationsChannelSubscriptionsRequest request, AsyncApiCallback<ChannelTopicEntityListing> callback) {
    return pcapiClient.<ChannelTopicEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ChannelTopicEntityListing>() {}, callback);
  }

  /**
   * Replace the current list of subscriptions with a new list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ChannelTopicEntityListing>> putNotificationsChannelSubscriptionsAsync(ApiRequest<List<ChannelTopic>> request, AsyncApiCallback<ApiResponse<ChannelTopicEntityListing>> callback) {
    return pcapiClient.<ChannelTopicEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ChannelTopicEntityListing>() {}, callback);
  }

}
