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
   * @throws ApiException if fails to make API call
   */
  public void deleteNotificationsChannelSubscriptions(String channelId) throws IOException, ApiException {
    deleteNotificationsChannelSubscriptionsWithHttpInfo(channelId);
  }

  /**
   * Remove all subscriptions
   * 
   * @param channelId Channel ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteNotificationsChannelSubscriptionsWithHttpInfo(String channelId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'channelId' is set
    if (channelId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'channelId' when calling deleteNotificationsChannelSubscriptions");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/notifications/channels/{channelId}/subscriptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "channelId" + "\\}", pcapiClient.escapeString(channelId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Remove all subscriptions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteNotificationsChannelSubscriptions(DeleteNotificationsChannelSubscriptionsRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Remove all subscriptions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteNotificationsChannelSubscriptions(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Get available notification topics.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return AvailableTopicEntityListing
   * @throws ApiException if fails to make API call
   */
  public AvailableTopicEntityListing getNotificationsAvailabletopics(List<String> expand) throws IOException, ApiException {
    return getNotificationsAvailabletopicsWithHttpInfo(expand).getBody();
  }

  /**
   * Get available notification topics.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return AvailableTopicEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AvailableTopicEntityListing> getNotificationsAvailabletopicsWithHttpInfo(List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/notifications/availabletopics".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AvailableTopicEntityListing>() {});
  }

  /**
   * Get available notification topics.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AvailableTopicEntityListing getNotificationsAvailabletopics(GetNotificationsAvailabletopicsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AvailableTopicEntityListing>() {});
  }

  /**
   * Get available notification topics.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AvailableTopicEntityListing> getNotificationsAvailabletopics(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<AvailableTopicEntityListing>invokeAPIVerbose(request, new TypeReference<AvailableTopicEntityListing>() {});
  }

  /**
   * The list of all subscriptions for this channel
   * 
   * @param channelId Channel ID (required)
   * @return ChannelTopicEntityListing
   * @throws ApiException if fails to make API call
   */
  public ChannelTopicEntityListing getNotificationsChannelSubscriptions(String channelId) throws IOException, ApiException {
    return getNotificationsChannelSubscriptionsWithHttpInfo(channelId).getBody();
  }

  /**
   * The list of all subscriptions for this channel
   * 
   * @param channelId Channel ID (required)
   * @return ChannelTopicEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChannelTopicEntityListing> getNotificationsChannelSubscriptionsWithHttpInfo(String channelId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'channelId' is set
    if (channelId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'channelId' when calling getNotificationsChannelSubscriptions");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/notifications/channels/{channelId}/subscriptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "channelId" + "\\}", pcapiClient.escapeString(channelId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ChannelTopicEntityListing>() {});
  }

  /**
   * The list of all subscriptions for this channel
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ChannelTopicEntityListing getNotificationsChannelSubscriptions(GetNotificationsChannelSubscriptionsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ChannelTopicEntityListing>() {});
  }

  /**
   * The list of all subscriptions for this channel
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChannelTopicEntityListing> getNotificationsChannelSubscriptions(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ChannelTopicEntityListing>invokeAPIVerbose(request, new TypeReference<ChannelTopicEntityListing>() {});
  }

  /**
   * The list of existing channels
   * 
   * @return ChannelEntityListing
   * @throws ApiException if fails to make API call
   */
  public ChannelEntityListing getNotificationsChannels() throws IOException, ApiException {
    return getNotificationsChannelsWithHttpInfo().getBody();
  }

  /**
   * The list of existing channels
   * 
   * @return ChannelEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChannelEntityListing> getNotificationsChannelsWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/notifications/channels".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ChannelEntityListing>() {});
  }

  /**
   * The list of existing channels
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ChannelEntityListing getNotificationsChannels(GetNotificationsChannelsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ChannelEntityListing>() {});
  }

  /**
   * The list of existing channels
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChannelEntityListing> getNotificationsChannels(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ChannelEntityListing>invokeAPIVerbose(request, new TypeReference<ChannelEntityListing>() {});
  }

  /**
   * Add a list of subscriptions to the existing list of subscriptions
   * 
   * @param channelId Channel ID (required)
   * @param body Body (required)
   * @return ChannelTopicEntityListing
   * @throws ApiException if fails to make API call
   */
  public ChannelTopicEntityListing postNotificationsChannelSubscriptions(String channelId, List<ChannelTopic> body) throws IOException, ApiException {
    return postNotificationsChannelSubscriptionsWithHttpInfo(channelId, body).getBody();
  }

  /**
   * Add a list of subscriptions to the existing list of subscriptions
   * 
   * @param channelId Channel ID (required)
   * @param body Body (required)
   * @return ChannelTopicEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChannelTopicEntityListing> postNotificationsChannelSubscriptionsWithHttpInfo(String channelId, List<ChannelTopic> body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'channelId' is set
    if (channelId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'channelId' when calling postNotificationsChannelSubscriptions");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postNotificationsChannelSubscriptions");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/notifications/channels/{channelId}/subscriptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "channelId" + "\\}", pcapiClient.escapeString(channelId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ChannelTopicEntityListing>() {});
  }

  /**
   * Add a list of subscriptions to the existing list of subscriptions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ChannelTopicEntityListing postNotificationsChannelSubscriptions(PostNotificationsChannelSubscriptionsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ChannelTopicEntityListing>() {});
  }

  /**
   * Add a list of subscriptions to the existing list of subscriptions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChannelTopicEntityListing> postNotificationsChannelSubscriptions(ApiRequest<List<ChannelTopic>> request) throws IOException, ApiException {
    return pcapiClient.<ChannelTopicEntityListing>invokeAPIVerbose(request, new TypeReference<ChannelTopicEntityListing>() {});
  }

  /**
   * Create a new channel
   * There is a limit of 10 channels. Creating an 11th channel will remove the channel with oldest last used date.
   * @return Channel
   * @throws ApiException if fails to make API call
   */
  public Channel postNotificationsChannels() throws IOException, ApiException {
    return postNotificationsChannelsWithHttpInfo().getBody();
  }

  /**
   * Create a new channel
   * There is a limit of 10 channels. Creating an 11th channel will remove the channel with oldest last used date.
   * @return Channel
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Channel> postNotificationsChannelsWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/notifications/channels".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Channel>() {});
  }

  /**
   * Create a new channel
   * There is a limit of 10 channels. Creating an 11th channel will remove the channel with oldest last used date.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Channel postNotificationsChannels(PostNotificationsChannelsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Channel>() {});
  }

  /**
   * Create a new channel
   * There is a limit of 10 channels. Creating an 11th channel will remove the channel with oldest last used date.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Channel> postNotificationsChannels(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Channel>invokeAPIVerbose(request, new TypeReference<Channel>() {});
  }

  /**
   * Replace the current list of subscriptions with a new list.
   * 
   * @param channelId Channel ID (required)
   * @param body Body (required)
   * @return ChannelTopicEntityListing
   * @throws ApiException if fails to make API call
   */
  public ChannelTopicEntityListing putNotificationsChannelSubscriptions(String channelId, List<ChannelTopic> body) throws IOException, ApiException {
    return putNotificationsChannelSubscriptionsWithHttpInfo(channelId, body).getBody();
  }

  /**
   * Replace the current list of subscriptions with a new list.
   * 
   * @param channelId Channel ID (required)
   * @param body Body (required)
   * @return ChannelTopicEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChannelTopicEntityListing> putNotificationsChannelSubscriptionsWithHttpInfo(String channelId, List<ChannelTopic> body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'channelId' is set
    if (channelId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'channelId' when calling putNotificationsChannelSubscriptions");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putNotificationsChannelSubscriptions");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/notifications/channels/{channelId}/subscriptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "channelId" + "\\}", pcapiClient.escapeString(channelId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ChannelTopicEntityListing>() {});
  }

  /**
   * Replace the current list of subscriptions with a new list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ChannelTopicEntityListing putNotificationsChannelSubscriptions(PutNotificationsChannelSubscriptionsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ChannelTopicEntityListing>() {});
  }

  /**
   * Replace the current list of subscriptions with a new list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ChannelTopicEntityListing> putNotificationsChannelSubscriptions(ApiRequest<List<ChannelTopic>> request) throws IOException, ApiException {
    return pcapiClient.<ChannelTopicEntityListing>invokeAPIVerbose(request, new TypeReference<ChannelTopicEntityListing>() {});
  }

}
