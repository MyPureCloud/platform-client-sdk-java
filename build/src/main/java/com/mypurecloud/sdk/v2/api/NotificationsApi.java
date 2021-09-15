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
import com.mypurecloud.sdk.v2.model.AvailableTopicEntityListing;
import com.mypurecloud.sdk.v2.model.ChannelTopicEntityListing;
import com.mypurecloud.sdk.v2.model.ChannelEntityListing;
import com.mypurecloud.sdk.v2.model.ChannelTopic;
import com.mypurecloud.sdk.v2.model.Channel;


import com.mypurecloud.sdk.v2.api.request.DeleteNotificationsChannelSubscriptionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetNotificationsAvailabletopicsRequest;
import com.mypurecloud.sdk.v2.api.request.GetNotificationsChannelSubscriptionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetNotificationsChannelsRequest;
import com.mypurecloud.sdk.v2.api.request.HeadNotificationsChannelRequest;
import com.mypurecloud.sdk.v2.api.request.PostNotificationsChannelSubscriptionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostNotificationsChannelsRequest;
import com.mypurecloud.sdk.v2.api.request.PutNotificationsChannelSubscriptionsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class NotificationsApi {
  private final ApiClient pcapiClient;

  public NotificationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotificationsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Remove all subscriptions
   * 
   * @param channelId Channel ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteNotificationsChannelSubscriptions(String channelId) throws IOException, ApiException {
     deleteNotificationsChannelSubscriptions(createDeleteNotificationsChannelSubscriptionsRequest(channelId));
  }

  /**
   * Remove all subscriptions
   * 
   * @param channelId Channel ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteNotificationsChannelSubscriptionsWithHttpInfo(String channelId) throws IOException {
    return deleteNotificationsChannelSubscriptions(createDeleteNotificationsChannelSubscriptionsRequest(channelId).withHttpInfo());
  }

  private DeleteNotificationsChannelSubscriptionsRequest createDeleteNotificationsChannelSubscriptionsRequest(String channelId) {
    return DeleteNotificationsChannelSubscriptionsRequest.builder()
            .withChannelId(channelId)
    
            .build();
  }

  /**
   * Remove all subscriptions
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteNotificationsChannelSubscriptions(DeleteNotificationsChannelSubscriptionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove all subscriptions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteNotificationsChannelSubscriptions(ApiRequest<Void> request) throws IOException {
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
   * Get available notification topics.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @param includePreview Whether or not to include Preview topics (optional, default to true)
   * @return AvailableTopicEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AvailableTopicEntityListing getNotificationsAvailabletopics(List<String> expand, Boolean includePreview) throws IOException, ApiException {
    return  getNotificationsAvailabletopics(createGetNotificationsAvailabletopicsRequest(expand, includePreview));
  }

  /**
   * Get available notification topics.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @param includePreview Whether or not to include Preview topics (optional, default to true)
   * @return AvailableTopicEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AvailableTopicEntityListing> getNotificationsAvailabletopicsWithHttpInfo(List<String> expand, Boolean includePreview) throws IOException {
    return getNotificationsAvailabletopics(createGetNotificationsAvailabletopicsRequest(expand, includePreview).withHttpInfo());
  }

  private GetNotificationsAvailabletopicsRequest createGetNotificationsAvailabletopicsRequest(List<String> expand, Boolean includePreview) {
    return GetNotificationsAvailabletopicsRequest.builder()
            .withExpand(expand)
    
            .withIncludePreview(includePreview)
    
            .build();
  }

  /**
   * Get available notification topics.
   * 
   * @param request The request object
   * @return AvailableTopicEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AvailableTopicEntityListing getNotificationsAvailabletopics(GetNotificationsAvailabletopicsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AvailableTopicEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AvailableTopicEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get available notification topics.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AvailableTopicEntityListing> getNotificationsAvailabletopics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AvailableTopicEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AvailableTopicEntityListing> response = (ApiResponse<AvailableTopicEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AvailableTopicEntityListing> response = (ApiResponse<AvailableTopicEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * The list of all subscriptions for this channel
   * 
   * @param channelId Channel ID (required)
   * @return ChannelTopicEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChannelTopicEntityListing getNotificationsChannelSubscriptions(String channelId) throws IOException, ApiException {
    return  getNotificationsChannelSubscriptions(createGetNotificationsChannelSubscriptionsRequest(channelId));
  }

  /**
   * The list of all subscriptions for this channel
   * 
   * @param channelId Channel ID (required)
   * @return ChannelTopicEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChannelTopicEntityListing> getNotificationsChannelSubscriptionsWithHttpInfo(String channelId) throws IOException {
    return getNotificationsChannelSubscriptions(createGetNotificationsChannelSubscriptionsRequest(channelId).withHttpInfo());
  }

  private GetNotificationsChannelSubscriptionsRequest createGetNotificationsChannelSubscriptionsRequest(String channelId) {
    return GetNotificationsChannelSubscriptionsRequest.builder()
            .withChannelId(channelId)
    
            .build();
  }

  /**
   * The list of all subscriptions for this channel
   * 
   * @param request The request object
   * @return ChannelTopicEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChannelTopicEntityListing getNotificationsChannelSubscriptions(GetNotificationsChannelSubscriptionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChannelTopicEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChannelTopicEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The list of all subscriptions for this channel
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChannelTopicEntityListing> getNotificationsChannelSubscriptions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChannelTopicEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChannelTopicEntityListing> response = (ApiResponse<ChannelTopicEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ChannelTopicEntityListing> response = (ApiResponse<ChannelTopicEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * The list of existing channels
   * 
   * @param includechannels Show user&#39;s channels for this specific token or across all tokens for this user and app.  Channel Ids for other access tokens will not be shown, but will be presented to show their existence. (optional, default to token)
   * @return ChannelEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChannelEntityListing getNotificationsChannels(String includechannels) throws IOException, ApiException {
    return  getNotificationsChannels(createGetNotificationsChannelsRequest(includechannels));
  }

  /**
   * The list of existing channels
   * 
   * @param includechannels Show user&#39;s channels for this specific token or across all tokens for this user and app.  Channel Ids for other access tokens will not be shown, but will be presented to show their existence. (optional, default to token)
   * @return ChannelEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChannelEntityListing> getNotificationsChannelsWithHttpInfo(String includechannels) throws IOException {
    return getNotificationsChannels(createGetNotificationsChannelsRequest(includechannels).withHttpInfo());
  }

  private GetNotificationsChannelsRequest createGetNotificationsChannelsRequest(String includechannels) {
    return GetNotificationsChannelsRequest.builder()
            .withIncludechannels(includechannels)
    
            .build();
  }

  /**
   * The list of existing channels
   * 
   * @param request The request object
   * @return ChannelEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChannelEntityListing getNotificationsChannels(GetNotificationsChannelsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChannelEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChannelEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The list of existing channels
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChannelEntityListing> getNotificationsChannels(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChannelEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChannelEntityListing> response = (ApiResponse<ChannelEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ChannelEntityListing> response = (ApiResponse<ChannelEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Verify a channel still exists and is valid
   * Returns a 200 OK if channel exists, and a 404 Not Found if it doesn&#39;t
   * @param channelId Channel ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void headNotificationsChannel(String channelId) throws IOException, ApiException {
     headNotificationsChannel(createHeadNotificationsChannelRequest(channelId));
  }

  /**
   * Verify a channel still exists and is valid
   * Returns a 200 OK if channel exists, and a 404 Not Found if it doesn&#39;t
   * @param channelId Channel ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> headNotificationsChannelWithHttpInfo(String channelId) throws IOException {
    return headNotificationsChannel(createHeadNotificationsChannelRequest(channelId).withHttpInfo());
  }

  private HeadNotificationsChannelRequest createHeadNotificationsChannelRequest(String channelId) {
    return HeadNotificationsChannelRequest.builder()
            .withChannelId(channelId)
    
            .build();
  }

  /**
   * Verify a channel still exists and is valid
   * Returns a 200 OK if channel exists, and a 404 Not Found if it doesn&#39;t
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void headNotificationsChannel(HeadNotificationsChannelRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Verify a channel still exists and is valid
   * Returns a 200 OK if channel exists, and a 404 Not Found if it doesn&#39;t
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> headNotificationsChannel(ApiRequest<Void> request) throws IOException {
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
   * Add a list of subscriptions to the existing list of subscriptions
   * 
   * @param channelId Channel ID (required)
   * @param body Body (required)
   * @return ChannelTopicEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChannelTopicEntityListing postNotificationsChannelSubscriptions(String channelId, List<ChannelTopic> body) throws IOException, ApiException {
    return  postNotificationsChannelSubscriptions(createPostNotificationsChannelSubscriptionsRequest(channelId, body));
  }

  /**
   * Add a list of subscriptions to the existing list of subscriptions
   * 
   * @param channelId Channel ID (required)
   * @param body Body (required)
   * @return ChannelTopicEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChannelTopicEntityListing> postNotificationsChannelSubscriptionsWithHttpInfo(String channelId, List<ChannelTopic> body) throws IOException {
    return postNotificationsChannelSubscriptions(createPostNotificationsChannelSubscriptionsRequest(channelId, body).withHttpInfo());
  }

  private PostNotificationsChannelSubscriptionsRequest createPostNotificationsChannelSubscriptionsRequest(String channelId, List<ChannelTopic> body) {
    return PostNotificationsChannelSubscriptionsRequest.builder()
            .withChannelId(channelId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add a list of subscriptions to the existing list of subscriptions
   * 
   * @param request The request object
   * @return ChannelTopicEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChannelTopicEntityListing postNotificationsChannelSubscriptions(PostNotificationsChannelSubscriptionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChannelTopicEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChannelTopicEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a list of subscriptions to the existing list of subscriptions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChannelTopicEntityListing> postNotificationsChannelSubscriptions(ApiRequest<List<ChannelTopic>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChannelTopicEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChannelTopicEntityListing> response = (ApiResponse<ChannelTopicEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ChannelTopicEntityListing> response = (ApiResponse<ChannelTopicEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new channel
   * There is a limit of 20 channels per user/app combination. Creating a 21st channel will remove the channel with oldest last used date. Channels without an active connection will be removed first.
   * @return Channel
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Channel postNotificationsChannels() throws IOException, ApiException {
    return  postNotificationsChannels(createPostNotificationsChannelsRequest());
  }

  /**
   * Create a new channel
   * There is a limit of 20 channels per user/app combination. Creating a 21st channel will remove the channel with oldest last used date. Channels without an active connection will be removed first.
   * @return Channel
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Channel> postNotificationsChannelsWithHttpInfo() throws IOException {
    return postNotificationsChannels(createPostNotificationsChannelsRequest().withHttpInfo());
  }

  private PostNotificationsChannelsRequest createPostNotificationsChannelsRequest() {
    return PostNotificationsChannelsRequest.builder()
            .build();
  }

  /**
   * Create a new channel
   * There is a limit of 20 channels per user/app combination. Creating a 21st channel will remove the channel with oldest last used date. Channels without an active connection will be removed first.
   * @param request The request object
   * @return Channel
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Channel postNotificationsChannels(PostNotificationsChannelsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Channel> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Channel>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new channel
   * There is a limit of 20 channels per user/app combination. Creating a 21st channel will remove the channel with oldest last used date. Channels without an active connection will be removed first.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Channel> postNotificationsChannels(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Channel>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Channel> response = (ApiResponse<Channel>)(ApiResponse<?>)exception;
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
      ApiResponse<Channel> response = (ApiResponse<Channel>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Replace the current list of subscriptions with a new list.
   * 
   * @param channelId Channel ID (required)
   * @param body Body (required)
   * @return ChannelTopicEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChannelTopicEntityListing putNotificationsChannelSubscriptions(String channelId, List<ChannelTopic> body) throws IOException, ApiException {
    return  putNotificationsChannelSubscriptions(createPutNotificationsChannelSubscriptionsRequest(channelId, body));
  }

  /**
   * Replace the current list of subscriptions with a new list.
   * 
   * @param channelId Channel ID (required)
   * @param body Body (required)
   * @return ChannelTopicEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChannelTopicEntityListing> putNotificationsChannelSubscriptionsWithHttpInfo(String channelId, List<ChannelTopic> body) throws IOException {
    return putNotificationsChannelSubscriptions(createPutNotificationsChannelSubscriptionsRequest(channelId, body).withHttpInfo());
  }

  private PutNotificationsChannelSubscriptionsRequest createPutNotificationsChannelSubscriptionsRequest(String channelId, List<ChannelTopic> body) {
    return PutNotificationsChannelSubscriptionsRequest.builder()
            .withChannelId(channelId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Replace the current list of subscriptions with a new list.
   * 
   * @param request The request object
   * @return ChannelTopicEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ChannelTopicEntityListing putNotificationsChannelSubscriptions(PutNotificationsChannelSubscriptionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ChannelTopicEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ChannelTopicEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Replace the current list of subscriptions with a new list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ChannelTopicEntityListing> putNotificationsChannelSubscriptions(ApiRequest<List<ChannelTopic>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ChannelTopicEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ChannelTopicEntityListing> response = (ApiResponse<ChannelTopicEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ChannelTopicEntityListing> response = (ApiResponse<ChannelTopicEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
