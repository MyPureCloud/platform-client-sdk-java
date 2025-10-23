package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.DataIngestionRuleResponseEntityListing;
import com.mypurecloud.sdk.v2.model.DataIngestionRuleStatusPatchRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EscalationRuleRequest;
import com.mypurecloud.sdk.v2.model.EscalationRuleResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ManualEscalationRequest;
import com.mypurecloud.sdk.v2.model.ManualEscalationResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.OpenSocialMediaNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenSocialMediaReactionsRequest;
import com.mypurecloud.sdk.v2.model.OpenSocialNormalizedMessageEntityListing;
import com.mypurecloud.sdk.v2.model.OpenSocialReactionsNormalizedEventEntityListing;
import com.mypurecloud.sdk.v2.model.SocialEscalationResponseEntityListing;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncDetailQuery;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncDetailQueryResponse;
import com.mypurecloud.sdk.v2.model.SocialTopicPatchRequest;
import com.mypurecloud.sdk.v2.model.SocialTopicRequest;
import com.mypurecloud.sdk.v2.model.SocialTopicResponse;
import com.mypurecloud.sdk.v2.model.SocialTopicResponseEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterDataHistoricalTweetRequest;
import com.mypurecloud.sdk.v2.model.TwitterDataHistoricalTweetResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleVersionResponseEntityListing;


import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaEscalationruleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaMessageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaAnalyticsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaAnalyticsAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaAnalyticsMessagesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaAnalyticsMessagesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaEscalationruleRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaEscalationrulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesOpenOpenIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicDataingestionrulesOpenOpenIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaAnalyticsAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaAnalyticsMessagesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaEscalationrulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaEscalationsMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesFacebookRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesInstagramRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesOpenRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesTwitterRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTwitterHistoricalTweetsRequest;
import com.mypurecloud.sdk.v2.api.request.PutSocialmediaEscalationruleRequest;
import com.mypurecloud.sdk.v2.api.request.PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutSocialmediaTopicDataingestionrulesOpenOpenIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocialMediaApi {
  private final ApiClient pcapiClient;

  public SocialMediaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SocialMediaApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete an escalation rule.
   * 
   * @param escalationRuleId escalationRuleId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaEscalationrule(String escalationRuleId) throws IOException, ApiException {
     deleteSocialmediaEscalationrule(createDeleteSocialmediaEscalationruleRequest(escalationRuleId));
  }

  /**
   * Delete an escalation rule.
   * 
   * @param escalationRuleId escalationRuleId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaEscalationruleWithHttpInfo(String escalationRuleId) throws IOException {
    return deleteSocialmediaEscalationrule(createDeleteSocialmediaEscalationruleRequest(escalationRuleId).withHttpInfo());
  }

  private DeleteSocialmediaEscalationruleRequest createDeleteSocialmediaEscalationruleRequest(String escalationRuleId) {
    return DeleteSocialmediaEscalationruleRequest.builder()
            .withEscalationRuleId(escalationRuleId)

            .build();
  }

  /**
   * Delete an escalation rule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaEscalationrule(DeleteSocialmediaEscalationruleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an escalation rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaEscalationrule(ApiRequest<Void> request) throws IOException {
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
   * Delete a social media message.
   * 
   * deleteSocialmediaMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param messageId messageId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaMessage(String messageId) throws IOException, ApiException {
     deleteSocialmediaMessage(createDeleteSocialmediaMessageRequest(messageId));
  }

  /**
   * Delete a social media message.
   * 
   * deleteSocialmediaMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param messageId messageId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaMessageWithHttpInfo(String messageId) throws IOException {
    return deleteSocialmediaMessage(createDeleteSocialmediaMessageRequest(messageId).withHttpInfo());
  }

  private DeleteSocialmediaMessageRequest createDeleteSocialmediaMessageRequest(String messageId) {
    return DeleteSocialmediaMessageRequest.builder()
            .withMessageId(messageId)

            .build();
  }

  /**
   * Delete a social media message.
   * 
   * deleteSocialmediaMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaMessage(DeleteSocialmediaMessageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a social media message.
   * 
   * deleteSocialmediaMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaMessage(ApiRequest<Void> request) throws IOException {
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
   * Delete a social topic.
   * 
   * @param topicId topicId (required)
   * @param hardDelete Determines whether a Social topic should be soft-deleted or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaTopic(String topicId, Boolean hardDelete) throws IOException, ApiException {
     deleteSocialmediaTopic(createDeleteSocialmediaTopicRequest(topicId, hardDelete));
  }

  /**
   * Delete a social topic.
   * 
   * @param topicId topicId (required)
   * @param hardDelete Determines whether a Social topic should be soft-deleted or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaTopicWithHttpInfo(String topicId, Boolean hardDelete) throws IOException {
    return deleteSocialmediaTopic(createDeleteSocialmediaTopicRequest(topicId, hardDelete).withHttpInfo());
  }

  private DeleteSocialmediaTopicRequest createDeleteSocialmediaTopicRequest(String topicId, Boolean hardDelete) {
    return DeleteSocialmediaTopicRequest.builder()
            .withTopicId(topicId)

            .withHardDelete(hardDelete)

            .build();
  }

  /**
   * Delete a social topic.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaTopic(DeleteSocialmediaTopicRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a social topic.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaTopic(ApiRequest<Void> request) throws IOException {
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
   * Delete a Facebook data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param facebookIngestionRuleId facebookIngestionRuleId (required)
   * @param hardDelete Determines whether a Facebook data ingestion rule should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(String topicId, String facebookIngestionRuleId, Boolean hardDelete) throws IOException, ApiException {
     deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(createDeleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest(topicId, facebookIngestionRuleId, hardDelete));
  }

  /**
   * Delete a Facebook data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param facebookIngestionRuleId facebookIngestionRuleId (required)
   * @param hardDelete Determines whether a Facebook data ingestion rule should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdWithHttpInfo(String topicId, String facebookIngestionRuleId, Boolean hardDelete) throws IOException {
    return deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(createDeleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest(topicId, facebookIngestionRuleId, hardDelete).withHttpInfo());
  }

  private DeleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest createDeleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest(String topicId, String facebookIngestionRuleId, Boolean hardDelete) {
    return DeleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest.builder()
            .withTopicId(topicId)

            .withFacebookIngestionRuleId(facebookIngestionRuleId)

            .withHardDelete(hardDelete)

            .build();
  }

  /**
   * Delete a Facebook data ingestion rule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(DeleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Facebook data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(ApiRequest<Void> request) throws IOException {
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
   * Delete a Instagram data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param instagramIngestionRuleId instagramIngestionRuleId (required)
   * @param hardDelete Determines whether a Instagram data ingestion rule should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(String topicId, String instagramIngestionRuleId, Boolean hardDelete) throws IOException, ApiException {
     deleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(createDeleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest(topicId, instagramIngestionRuleId, hardDelete));
  }

  /**
   * Delete a Instagram data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param instagramIngestionRuleId instagramIngestionRuleId (required)
   * @param hardDelete Determines whether a Instagram data ingestion rule should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdWithHttpInfo(String topicId, String instagramIngestionRuleId, Boolean hardDelete) throws IOException {
    return deleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(createDeleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest(topicId, instagramIngestionRuleId, hardDelete).withHttpInfo());
  }

  private DeleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest createDeleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest(String topicId, String instagramIngestionRuleId, Boolean hardDelete) {
    return DeleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest.builder()
            .withTopicId(topicId)

            .withInstagramIngestionRuleId(instagramIngestionRuleId)

            .withHardDelete(hardDelete)

            .build();
  }

  /**
   * Delete a Instagram data ingestion rule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(DeleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Instagram data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(ApiRequest<Void> request) throws IOException {
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
   * Delete a open data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param openId openId (required)
   * @param hardDelete Determines whether a open data ingestion rule should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaTopicDataingestionrulesOpenOpenId(String topicId, String openId, Boolean hardDelete) throws IOException, ApiException {
     deleteSocialmediaTopicDataingestionrulesOpenOpenId(createDeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest(topicId, openId, hardDelete));
  }

  /**
   * Delete a open data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param openId openId (required)
   * @param hardDelete Determines whether a open data ingestion rule should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaTopicDataingestionrulesOpenOpenIdWithHttpInfo(String topicId, String openId, Boolean hardDelete) throws IOException {
    return deleteSocialmediaTopicDataingestionrulesOpenOpenId(createDeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest(topicId, openId, hardDelete).withHttpInfo());
  }

  private DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest createDeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest(String topicId, String openId, Boolean hardDelete) {
    return DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest.builder()
            .withTopicId(topicId)

            .withOpenId(openId)

            .withHardDelete(hardDelete)

            .build();
  }

  /**
   * Delete a open data ingestion rule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaTopicDataingestionrulesOpenOpenId(DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a open data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaTopicDataingestionrulesOpenOpenId(ApiRequest<Void> request) throws IOException {
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
   * Delete a X (formally Twitter) data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param twitterIngestionRuleId twitterIngestionRuleId (required)
   * @param hardDelete Determines whether a X (formally Twitter) data ingestion rule should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(String topicId, String twitterIngestionRuleId, Boolean hardDelete) throws IOException, ApiException {
     deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(createDeleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest(topicId, twitterIngestionRuleId, hardDelete));
  }

  /**
   * Delete a X (formally Twitter) data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param twitterIngestionRuleId twitterIngestionRuleId (required)
   * @param hardDelete Determines whether a X (formally Twitter) data ingestion rule should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdWithHttpInfo(String topicId, String twitterIngestionRuleId, Boolean hardDelete) throws IOException {
    return deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(createDeleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest(topicId, twitterIngestionRuleId, hardDelete).withHttpInfo());
  }

  private DeleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest createDeleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest(String topicId, String twitterIngestionRuleId, Boolean hardDelete) {
    return DeleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest.builder()
            .withTopicId(topicId)

            .withTwitterIngestionRuleId(twitterIngestionRuleId)

            .withHardDelete(hardDelete)

            .build();
  }

  /**
   * Delete a X (formally Twitter) data ingestion rule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(DeleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a X (formally Twitter) data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(ApiRequest<Void> request) throws IOException {
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
   * Get status for async query for social media aggregates
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getSocialmediaAnalyticsAggregatesJob(String jobId) throws IOException, ApiException {
    return  getSocialmediaAnalyticsAggregatesJob(createGetSocialmediaAnalyticsAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for social media aggregates
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getSocialmediaAnalyticsAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getSocialmediaAnalyticsAggregatesJob(createGetSocialmediaAnalyticsAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetSocialmediaAnalyticsAggregatesJobRequest createGetSocialmediaAnalyticsAggregatesJobRequest(String jobId) {
    return GetSocialmediaAnalyticsAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for social media aggregates
   * 
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getSocialmediaAnalyticsAggregatesJob(GetSocialmediaAnalyticsAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for social media aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getSocialmediaAnalyticsAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async social media query
   * 
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return SocialMediaAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialMediaAsyncAggregateQueryResponse getSocialmediaAnalyticsAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getSocialmediaAnalyticsAggregatesJobResults(createGetSocialmediaAnalyticsAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async social media query
   * 
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return SocialMediaAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialMediaAsyncAggregateQueryResponse> getSocialmediaAnalyticsAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getSocialmediaAnalyticsAggregatesJobResults(createGetSocialmediaAnalyticsAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetSocialmediaAnalyticsAggregatesJobResultsRequest createGetSocialmediaAnalyticsAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetSocialmediaAnalyticsAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async social media query
   * 
   * @param request The request object
   * @return SocialMediaAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialMediaAsyncAggregateQueryResponse getSocialmediaAnalyticsAggregatesJobResults(GetSocialmediaAnalyticsAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SocialMediaAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SocialMediaAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async social media query
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialMediaAsyncAggregateQueryResponse> getSocialmediaAnalyticsAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SocialMediaAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SocialMediaAsyncAggregateQueryResponse> response = (ApiResponse<SocialMediaAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SocialMediaAsyncAggregateQueryResponse> response = (ApiResponse<SocialMediaAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for social media messages job
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getSocialmediaAnalyticsMessagesJob(String jobId) throws IOException, ApiException {
    return  getSocialmediaAnalyticsMessagesJob(createGetSocialmediaAnalyticsMessagesJobRequest(jobId));
  }

  /**
   * Get status for async query for social media messages job
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getSocialmediaAnalyticsMessagesJobWithHttpInfo(String jobId) throws IOException {
    return getSocialmediaAnalyticsMessagesJob(createGetSocialmediaAnalyticsMessagesJobRequest(jobId).withHttpInfo());
  }

  private GetSocialmediaAnalyticsMessagesJobRequest createGetSocialmediaAnalyticsMessagesJobRequest(String jobId) {
    return GetSocialmediaAnalyticsMessagesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for social media messages job
   * 
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getSocialmediaAnalyticsMessagesJob(GetSocialmediaAnalyticsMessagesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for social media messages job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getSocialmediaAnalyticsMessagesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async social media messages query
   * 
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return SocialMediaAsyncDetailQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialMediaAsyncDetailQueryResponse getSocialmediaAnalyticsMessagesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getSocialmediaAnalyticsMessagesJobResults(createGetSocialmediaAnalyticsMessagesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async social media messages query
   * 
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return SocialMediaAsyncDetailQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialMediaAsyncDetailQueryResponse> getSocialmediaAnalyticsMessagesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getSocialmediaAnalyticsMessagesJobResults(createGetSocialmediaAnalyticsMessagesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetSocialmediaAnalyticsMessagesJobResultsRequest createGetSocialmediaAnalyticsMessagesJobResultsRequest(String jobId, String cursor) {
    return GetSocialmediaAnalyticsMessagesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async social media messages query
   * 
   * @param request The request object
   * @return SocialMediaAsyncDetailQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialMediaAsyncDetailQueryResponse getSocialmediaAnalyticsMessagesJobResults(GetSocialmediaAnalyticsMessagesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SocialMediaAsyncDetailQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SocialMediaAsyncDetailQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async social media messages query
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialMediaAsyncDetailQueryResponse> getSocialmediaAnalyticsMessagesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SocialMediaAsyncDetailQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SocialMediaAsyncDetailQueryResponse> response = (ApiResponse<SocialMediaAsyncDetailQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SocialMediaAsyncDetailQueryResponse> response = (ApiResponse<SocialMediaAsyncDetailQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a single escalation rule.
   * 
   * @param escalationRuleId escalationRuleId (required)
   * @param expand which fields, if any, to expand (optional)
   * @return EscalationRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EscalationRuleResponse getSocialmediaEscalationrule(String escalationRuleId, String expand) throws IOException, ApiException {
    return  getSocialmediaEscalationrule(createGetSocialmediaEscalationruleRequest(escalationRuleId, expand));
  }

  /**
   * Get a single escalation rule.
   * 
   * @param escalationRuleId escalationRuleId (required)
   * @param expand which fields, if any, to expand (optional)
   * @return EscalationRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EscalationRuleResponse> getSocialmediaEscalationruleWithHttpInfo(String escalationRuleId, String expand) throws IOException {
    return getSocialmediaEscalationrule(createGetSocialmediaEscalationruleRequest(escalationRuleId, expand).withHttpInfo());
  }

  private GetSocialmediaEscalationruleRequest createGetSocialmediaEscalationruleRequest(String escalationRuleId, String expand) {
    return GetSocialmediaEscalationruleRequest.builder()
            .withEscalationRuleId(escalationRuleId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get a single escalation rule.
   * 
   * @param request The request object
   * @return EscalationRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EscalationRuleResponse getSocialmediaEscalationrule(GetSocialmediaEscalationruleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EscalationRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EscalationRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single escalation rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EscalationRuleResponse> getSocialmediaEscalationrule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EscalationRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EscalationRuleResponse> response = (ApiResponse<EscalationRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<EscalationRuleResponse> response = (ApiResponse<EscalationRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve all escalation rules for a division.
   * 
   * @param divisionId One division ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return SocialEscalationResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialEscalationResponseEntityListing getSocialmediaEscalationrules(String divisionId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getSocialmediaEscalationrules(createGetSocialmediaEscalationrulesRequest(divisionId, pageNumber, pageSize));
  }

  /**
   * Retrieve all escalation rules for a division.
   * 
   * @param divisionId One division ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return SocialEscalationResponseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialEscalationResponseEntityListing> getSocialmediaEscalationrulesWithHttpInfo(String divisionId, Integer pageNumber, Integer pageSize) throws IOException {
    return getSocialmediaEscalationrules(createGetSocialmediaEscalationrulesRequest(divisionId, pageNumber, pageSize).withHttpInfo());
  }

  private GetSocialmediaEscalationrulesRequest createGetSocialmediaEscalationrulesRequest(String divisionId, Integer pageNumber, Integer pageSize) {
    return GetSocialmediaEscalationrulesRequest.builder()
            .withDivisionId(divisionId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Retrieve all escalation rules for a division.
   * 
   * @param request The request object
   * @return SocialEscalationResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialEscalationResponseEntityListing getSocialmediaEscalationrules(GetSocialmediaEscalationrulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SocialEscalationResponseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SocialEscalationResponseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all escalation rules for a division.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialEscalationResponseEntityListing> getSocialmediaEscalationrules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SocialEscalationResponseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SocialEscalationResponseEntityListing> response = (ApiResponse<SocialEscalationResponseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SocialEscalationResponseEntityListing> response = (ApiResponse<SocialEscalationResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a single social topic.
   * 
   * @param topicId topicId (required)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return SocialTopicResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialTopicResponse getSocialmediaTopic(String topicId, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopic(createGetSocialmediaTopicRequest(topicId, includeDeleted));
  }

  /**
   * Get a single social topic.
   * 
   * @param topicId topicId (required)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return SocialTopicResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialTopicResponse> getSocialmediaTopicWithHttpInfo(String topicId, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopic(createGetSocialmediaTopicRequest(topicId, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicRequest createGetSocialmediaTopicRequest(String topicId, Boolean includeDeleted) {
    return GetSocialmediaTopicRequest.builder()
            .withTopicId(topicId)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get a single social topic.
   * 
   * @param request The request object
   * @return SocialTopicResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialTopicResponse getSocialmediaTopic(GetSocialmediaTopicRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SocialTopicResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SocialTopicResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single social topic.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialTopicResponse> getSocialmediaTopic(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SocialTopicResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SocialTopicResponse> response = (ApiResponse<SocialTopicResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SocialTopicResponse> response = (ApiResponse<SocialTopicResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve all social topic data ingestion rules with pagination.
   * 
   * @param topicId topicId (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return DataIngestionRuleResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataIngestionRuleResponseEntityListing getSocialmediaTopicDataingestionrules(String topicId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrules(createGetSocialmediaTopicDataingestionrulesRequest(topicId, pageNumber, pageSize, includeDeleted));
  }

  /**
   * Retrieve all social topic data ingestion rules with pagination.
   * 
   * @param topicId topicId (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return DataIngestionRuleResponseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataIngestionRuleResponseEntityListing> getSocialmediaTopicDataingestionrulesWithHttpInfo(String topicId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrules(createGetSocialmediaTopicDataingestionrulesRequest(topicId, pageNumber, pageSize, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesRequest createGetSocialmediaTopicDataingestionrulesRequest(String topicId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesRequest.builder()
            .withTopicId(topicId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Retrieve all social topic data ingestion rules with pagination.
   * 
   * @param request The request object
   * @return DataIngestionRuleResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataIngestionRuleResponseEntityListing getSocialmediaTopicDataingestionrules(GetSocialmediaTopicDataingestionrulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataIngestionRuleResponseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataIngestionRuleResponseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all social topic data ingestion rules with pagination.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataIngestionRuleResponseEntityListing> getSocialmediaTopicDataingestionrules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataIngestionRuleResponseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataIngestionRuleResponseEntityListing> response = (ApiResponse<DataIngestionRuleResponseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DataIngestionRuleResponseEntityListing> response = (ApiResponse<DataIngestionRuleResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a single Facebook data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param facebookIngestionRuleId facebookIngestionRuleId (required)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return FacebookDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookDataIngestionRuleResponse getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(String topicId, String facebookIngestionRuleId, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(createGetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest(topicId, facebookIngestionRuleId, includeDeleted));
  }

  /**
   * Get a single Facebook data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param facebookIngestionRuleId facebookIngestionRuleId (required)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return FacebookDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookDataIngestionRuleResponse> getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdWithHttpInfo(String topicId, String facebookIngestionRuleId, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(createGetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest(topicId, facebookIngestionRuleId, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest createGetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest(String topicId, String facebookIngestionRuleId, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest.builder()
            .withTopicId(topicId)

            .withFacebookIngestionRuleId(facebookIngestionRuleId)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get a single Facebook data ingestion rule.
   * 
   * @param request The request object
   * @return FacebookDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookDataIngestionRuleResponse getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single Facebook data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookDataIngestionRuleResponse> getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a single Facebook data ingestion rule version.
   * 
   * @param topicId topicId (required)
   * @param facebookIngestionRuleId facebookIngestionRuleId (required)
   * @param dataIngestionRuleVersion version (required)
   * @param includeDeleted Determines whether to include soft-deleted item in the result. (optional)
   * @return FacebookDataIngestionRuleVersionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookDataIngestionRuleVersionResponse getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion(String topicId, String facebookIngestionRuleId, String dataIngestionRuleVersion, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion(createGetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionRequest(topicId, facebookIngestionRuleId, dataIngestionRuleVersion, includeDeleted));
  }

  /**
   * Get a single Facebook data ingestion rule version.
   * 
   * @param topicId topicId (required)
   * @param facebookIngestionRuleId facebookIngestionRuleId (required)
   * @param dataIngestionRuleVersion version (required)
   * @param includeDeleted Determines whether to include soft-deleted item in the result. (optional)
   * @return FacebookDataIngestionRuleVersionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookDataIngestionRuleVersionResponse> getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionWithHttpInfo(String topicId, String facebookIngestionRuleId, String dataIngestionRuleVersion, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion(createGetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionRequest(topicId, facebookIngestionRuleId, dataIngestionRuleVersion, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionRequest createGetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionRequest(String topicId, String facebookIngestionRuleId, String dataIngestionRuleVersion, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionRequest.builder()
            .withTopicId(topicId)

            .withFacebookIngestionRuleId(facebookIngestionRuleId)

            .withDataIngestionRuleVersion(dataIngestionRuleVersion)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get a single Facebook data ingestion rule version.
   * 
   * @param request The request object
   * @return FacebookDataIngestionRuleVersionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookDataIngestionRuleVersionResponse getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion(GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookDataIngestionRuleVersionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookDataIngestionRuleVersionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single Facebook data ingestion rule version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookDataIngestionRuleVersionResponse> getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookDataIngestionRuleVersionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookDataIngestionRuleVersionResponse> response = (ApiResponse<FacebookDataIngestionRuleVersionResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<FacebookDataIngestionRuleVersionResponse> response = (ApiResponse<FacebookDataIngestionRuleVersionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the Facebook data ingestion rule versions.
   * 
   * @param topicId topicId (required)
   * @param facebookIngestionRuleId facebookIngestionRuleId (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return FacebookDataIngestionRuleVersionResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookDataIngestionRuleVersionResponseEntityListing getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions(String topicId, String facebookIngestionRuleId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions(createGetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsRequest(topicId, facebookIngestionRuleId, pageNumber, pageSize, includeDeleted));
  }

  /**
   * Get the Facebook data ingestion rule versions.
   * 
   * @param topicId topicId (required)
   * @param facebookIngestionRuleId facebookIngestionRuleId (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return FacebookDataIngestionRuleVersionResponseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing> getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsWithHttpInfo(String topicId, String facebookIngestionRuleId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions(createGetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsRequest(topicId, facebookIngestionRuleId, pageNumber, pageSize, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsRequest createGetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsRequest(String topicId, String facebookIngestionRuleId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsRequest.builder()
            .withTopicId(topicId)

            .withFacebookIngestionRuleId(facebookIngestionRuleId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get the Facebook data ingestion rule versions.
   * 
   * @param request The request object
   * @return FacebookDataIngestionRuleVersionResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookDataIngestionRuleVersionResponseEntityListing getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions(GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookDataIngestionRuleVersionResponseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the Facebook data ingestion rule versions.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing> getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookDataIngestionRuleVersionResponseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a single Instagram data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param instagramIngestionRuleId instagramIngestionRuleId (required)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return InstagramDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InstagramDataIngestionRuleResponse getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(String topicId, String instagramIngestionRuleId, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(createGetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest(topicId, instagramIngestionRuleId, includeDeleted));
  }

  /**
   * Get a single Instagram data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param instagramIngestionRuleId instagramIngestionRuleId (required)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return InstagramDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InstagramDataIngestionRuleResponse> getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdWithHttpInfo(String topicId, String instagramIngestionRuleId, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(createGetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest(topicId, instagramIngestionRuleId, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest createGetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest(String topicId, String instagramIngestionRuleId, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest.builder()
            .withTopicId(topicId)

            .withInstagramIngestionRuleId(instagramIngestionRuleId)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get a single Instagram data ingestion rule.
   * 
   * @param request The request object
   * @return InstagramDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InstagramDataIngestionRuleResponse getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InstagramDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InstagramDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single Instagram data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InstagramDataIngestionRuleResponse> getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InstagramDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a single Instagram data ingestion rule version.
   * 
   * @param topicId topicId (required)
   * @param instagramIngestionRuleId instagramIngestionRuleId (required)
   * @param dataIngestionRuleVersion version (required)
   * @param includeDeleted Determines whether to include soft-deleted item in the result. (optional)
   * @return InstagramDataIngestionRuleVersionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InstagramDataIngestionRuleVersionResponse getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersion(String topicId, String instagramIngestionRuleId, String dataIngestionRuleVersion, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersion(createGetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest(topicId, instagramIngestionRuleId, dataIngestionRuleVersion, includeDeleted));
  }

  /**
   * Get a single Instagram data ingestion rule version.
   * 
   * @param topicId topicId (required)
   * @param instagramIngestionRuleId instagramIngestionRuleId (required)
   * @param dataIngestionRuleVersion version (required)
   * @param includeDeleted Determines whether to include soft-deleted item in the result. (optional)
   * @return InstagramDataIngestionRuleVersionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InstagramDataIngestionRuleVersionResponse> getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionWithHttpInfo(String topicId, String instagramIngestionRuleId, String dataIngestionRuleVersion, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersion(createGetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest(topicId, instagramIngestionRuleId, dataIngestionRuleVersion, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest createGetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest(String topicId, String instagramIngestionRuleId, String dataIngestionRuleVersion, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest.builder()
            .withTopicId(topicId)

            .withInstagramIngestionRuleId(instagramIngestionRuleId)

            .withDataIngestionRuleVersion(dataIngestionRuleVersion)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get a single Instagram data ingestion rule version.
   * 
   * @param request The request object
   * @return InstagramDataIngestionRuleVersionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InstagramDataIngestionRuleVersionResponse getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersion(GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InstagramDataIngestionRuleVersionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InstagramDataIngestionRuleVersionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single Instagram data ingestion rule version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InstagramDataIngestionRuleVersionResponse> getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InstagramDataIngestionRuleVersionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InstagramDataIngestionRuleVersionResponse> response = (ApiResponse<InstagramDataIngestionRuleVersionResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<InstagramDataIngestionRuleVersionResponse> response = (ApiResponse<InstagramDataIngestionRuleVersionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the Instagram data ingestion rule versions.
   * 
   * @param topicId topicId (required)
   * @param instagramIngestionRuleId instagramIngestionRuleId (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return InstagramDataIngestionRuleVersionResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InstagramDataIngestionRuleVersionResponseEntityListing getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersions(String topicId, String instagramIngestionRuleId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersions(createGetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionsRequest(topicId, instagramIngestionRuleId, pageNumber, pageSize, includeDeleted));
  }

  /**
   * Get the Instagram data ingestion rule versions.
   * 
   * @param topicId topicId (required)
   * @param instagramIngestionRuleId instagramIngestionRuleId (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return InstagramDataIngestionRuleVersionResponseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing> getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionsWithHttpInfo(String topicId, String instagramIngestionRuleId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersions(createGetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionsRequest(topicId, instagramIngestionRuleId, pageNumber, pageSize, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionsRequest createGetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionsRequest(String topicId, String instagramIngestionRuleId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionsRequest.builder()
            .withTopicId(topicId)

            .withInstagramIngestionRuleId(instagramIngestionRuleId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get the Instagram data ingestion rule versions.
   * 
   * @param request The request object
   * @return InstagramDataIngestionRuleVersionResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InstagramDataIngestionRuleVersionResponseEntityListing getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersions(GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InstagramDataIngestionRuleVersionResponseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the Instagram data ingestion rule versions.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing> getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InstagramDataIngestionRuleVersionResponseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a single open data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param openId openId (required)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return OpenDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenDataIngestionRuleResponse getSocialmediaTopicDataingestionrulesOpenOpenId(String topicId, String openId, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrulesOpenOpenId(createGetSocialmediaTopicDataingestionrulesOpenOpenIdRequest(topicId, openId, includeDeleted));
  }

  /**
   * Get a single open data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param openId openId (required)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return OpenDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenDataIngestionRuleResponse> getSocialmediaTopicDataingestionrulesOpenOpenIdWithHttpInfo(String topicId, String openId, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrulesOpenOpenId(createGetSocialmediaTopicDataingestionrulesOpenOpenIdRequest(topicId, openId, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesOpenOpenIdRequest createGetSocialmediaTopicDataingestionrulesOpenOpenIdRequest(String topicId, String openId, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesOpenOpenIdRequest.builder()
            .withTopicId(topicId)

            .withOpenId(openId)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get a single open data ingestion rule.
   * 
   * @param request The request object
   * @return OpenDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenDataIngestionRuleResponse getSocialmediaTopicDataingestionrulesOpenOpenId(GetSocialmediaTopicDataingestionrulesOpenOpenIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single open data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenDataIngestionRuleResponse> getSocialmediaTopicDataingestionrulesOpenOpenId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a single Open data ingestion rule version.
   * 
   * @param topicId topicId (required)
   * @param openId openId (required)
   * @param dataIngestionRuleVersion version (required)
   * @param includeDeleted Determines whether to include soft-deleted item in the result. (optional)
   * @return OpenDataIngestionRuleVersionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenDataIngestionRuleVersionResponse getSocialmediaTopicDataingestionrulesOpenOpenIdVersion(String topicId, String openId, String dataIngestionRuleVersion, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrulesOpenOpenIdVersion(createGetSocialmediaTopicDataingestionrulesOpenOpenIdVersionRequest(topicId, openId, dataIngestionRuleVersion, includeDeleted));
  }

  /**
   * Get a single Open data ingestion rule version.
   * 
   * @param topicId topicId (required)
   * @param openId openId (required)
   * @param dataIngestionRuleVersion version (required)
   * @param includeDeleted Determines whether to include soft-deleted item in the result. (optional)
   * @return OpenDataIngestionRuleVersionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenDataIngestionRuleVersionResponse> getSocialmediaTopicDataingestionrulesOpenOpenIdVersionWithHttpInfo(String topicId, String openId, String dataIngestionRuleVersion, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrulesOpenOpenIdVersion(createGetSocialmediaTopicDataingestionrulesOpenOpenIdVersionRequest(topicId, openId, dataIngestionRuleVersion, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionRequest createGetSocialmediaTopicDataingestionrulesOpenOpenIdVersionRequest(String topicId, String openId, String dataIngestionRuleVersion, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionRequest.builder()
            .withTopicId(topicId)

            .withOpenId(openId)

            .withDataIngestionRuleVersion(dataIngestionRuleVersion)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get a single Open data ingestion rule version.
   * 
   * @param request The request object
   * @return OpenDataIngestionRuleVersionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenDataIngestionRuleVersionResponse getSocialmediaTopicDataingestionrulesOpenOpenIdVersion(GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenDataIngestionRuleVersionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenDataIngestionRuleVersionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single Open data ingestion rule version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenDataIngestionRuleVersionResponse> getSocialmediaTopicDataingestionrulesOpenOpenIdVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenDataIngestionRuleVersionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenDataIngestionRuleVersionResponse> response = (ApiResponse<OpenDataIngestionRuleVersionResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<OpenDataIngestionRuleVersionResponse> response = (ApiResponse<OpenDataIngestionRuleVersionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the Open data ingestion rule versions.
   * 
   * @param topicId topicId (required)
   * @param openId openId (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return OpenDataIngestionRuleVersionResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenDataIngestionRuleVersionResponseEntityListing getSocialmediaTopicDataingestionrulesOpenOpenIdVersions(String topicId, String openId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrulesOpenOpenIdVersions(createGetSocialmediaTopicDataingestionrulesOpenOpenIdVersionsRequest(topicId, openId, pageNumber, pageSize, includeDeleted));
  }

  /**
   * Get the Open data ingestion rule versions.
   * 
   * @param topicId topicId (required)
   * @param openId openId (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return OpenDataIngestionRuleVersionResponseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing> getSocialmediaTopicDataingestionrulesOpenOpenIdVersionsWithHttpInfo(String topicId, String openId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrulesOpenOpenIdVersions(createGetSocialmediaTopicDataingestionrulesOpenOpenIdVersionsRequest(topicId, openId, pageNumber, pageSize, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionsRequest createGetSocialmediaTopicDataingestionrulesOpenOpenIdVersionsRequest(String topicId, String openId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionsRequest.builder()
            .withTopicId(topicId)

            .withOpenId(openId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get the Open data ingestion rule versions.
   * 
   * @param request The request object
   * @return OpenDataIngestionRuleVersionResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenDataIngestionRuleVersionResponseEntityListing getSocialmediaTopicDataingestionrulesOpenOpenIdVersions(GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenDataIngestionRuleVersionResponseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the Open data ingestion rule versions.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing> getSocialmediaTopicDataingestionrulesOpenOpenIdVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenDataIngestionRuleVersionResponseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a single X (formally Twitter) data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param twitterIngestionRuleId twitterIngestionRuleId (required)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return TwitterDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataIngestionRuleResponse getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(String topicId, String twitterIngestionRuleId, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(createGetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest(topicId, twitterIngestionRuleId, includeDeleted));
  }

  /**
   * Get a single X (formally Twitter) data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param twitterIngestionRuleId twitterIngestionRuleId (required)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return TwitterDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataIngestionRuleResponse> getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdWithHttpInfo(String topicId, String twitterIngestionRuleId, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(createGetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest(topicId, twitterIngestionRuleId, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest createGetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest(String topicId, String twitterIngestionRuleId, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest.builder()
            .withTopicId(topicId)

            .withTwitterIngestionRuleId(twitterIngestionRuleId)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get a single X (formally Twitter) data ingestion rule.
   * 
   * @param request The request object
   * @return TwitterDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataIngestionRuleResponse getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single X (formally Twitter) data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataIngestionRuleResponse> getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a single X (formally Twitter) data ingestion rule version.
   * 
   * @param topicId topicId (required)
   * @param twitterIngestionRuleId twitterIngestionRuleId (required)
   * @param dataIngestionRuleVersion version (required)
   * @param includeDeleted Determines whether to include soft-deleted item in the result. (optional)
   * @return TwitterDataIngestionRuleVersionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataIngestionRuleVersionResponse getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion(String topicId, String twitterIngestionRuleId, String dataIngestionRuleVersion, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion(createGetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionRequest(topicId, twitterIngestionRuleId, dataIngestionRuleVersion, includeDeleted));
  }

  /**
   * Get a single X (formally Twitter) data ingestion rule version.
   * 
   * @param topicId topicId (required)
   * @param twitterIngestionRuleId twitterIngestionRuleId (required)
   * @param dataIngestionRuleVersion version (required)
   * @param includeDeleted Determines whether to include soft-deleted item in the result. (optional)
   * @return TwitterDataIngestionRuleVersionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataIngestionRuleVersionResponse> getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionWithHttpInfo(String topicId, String twitterIngestionRuleId, String dataIngestionRuleVersion, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion(createGetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionRequest(topicId, twitterIngestionRuleId, dataIngestionRuleVersion, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionRequest createGetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionRequest(String topicId, String twitterIngestionRuleId, String dataIngestionRuleVersion, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionRequest.builder()
            .withTopicId(topicId)

            .withTwitterIngestionRuleId(twitterIngestionRuleId)

            .withDataIngestionRuleVersion(dataIngestionRuleVersion)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get a single X (formally Twitter) data ingestion rule version.
   * 
   * @param request The request object
   * @return TwitterDataIngestionRuleVersionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataIngestionRuleVersionResponse getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion(GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterDataIngestionRuleVersionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterDataIngestionRuleVersionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single X (formally Twitter) data ingestion rule version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataIngestionRuleVersionResponse> getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterDataIngestionRuleVersionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterDataIngestionRuleVersionResponse> response = (ApiResponse<TwitterDataIngestionRuleVersionResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterDataIngestionRuleVersionResponse> response = (ApiResponse<TwitterDataIngestionRuleVersionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the Open data ingestion rule versions.
   * 
   * @param topicId topicId (required)
   * @param twitterIngestionRuleId twitterIngestionRuleId (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return TwitterDataIngestionRuleVersionResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataIngestionRuleVersionResponseEntityListing getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions(String topicId, String twitterIngestionRuleId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions(createGetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsRequest(topicId, twitterIngestionRuleId, pageNumber, pageSize, includeDeleted));
  }

  /**
   * Get the Open data ingestion rule versions.
   * 
   * @param topicId topicId (required)
   * @param twitterIngestionRuleId twitterIngestionRuleId (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return TwitterDataIngestionRuleVersionResponseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing> getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsWithHttpInfo(String topicId, String twitterIngestionRuleId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions(createGetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsRequest(topicId, twitterIngestionRuleId, pageNumber, pageSize, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsRequest createGetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsRequest(String topicId, String twitterIngestionRuleId, Integer pageNumber, Integer pageSize, Boolean includeDeleted) {
    return GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsRequest.builder()
            .withTopicId(topicId)

            .withTwitterIngestionRuleId(twitterIngestionRuleId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Get the Open data ingestion rule versions.
   * 
   * @param request The request object
   * @return TwitterDataIngestionRuleVersionResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataIngestionRuleVersionResponseEntityListing getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions(GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterDataIngestionRuleVersionResponseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the Open data ingestion rule versions.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing> getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterDataIngestionRuleVersionResponseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve all social topics.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param divisionIds One or more division IDs. If nothing is provided, the social topics associated withthe list of divisions that the user has access to will be returned. (optional)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return SocialTopicResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialTopicResponseEntityListing getSocialmediaTopics(Integer pageNumber, Integer pageSize, List<String> divisionIds, Boolean includeDeleted) throws IOException, ApiException {
    return  getSocialmediaTopics(createGetSocialmediaTopicsRequest(pageNumber, pageSize, divisionIds, includeDeleted));
  }

  /**
   * Retrieve all social topics.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param divisionIds One or more division IDs. If nothing is provided, the social topics associated withthe list of divisions that the user has access to will be returned. (optional)
   * @param includeDeleted Determines whether to include soft-deleted items in the result. (optional)
   * @return SocialTopicResponseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialTopicResponseEntityListing> getSocialmediaTopicsWithHttpInfo(Integer pageNumber, Integer pageSize, List<String> divisionIds, Boolean includeDeleted) throws IOException {
    return getSocialmediaTopics(createGetSocialmediaTopicsRequest(pageNumber, pageSize, divisionIds, includeDeleted).withHttpInfo());
  }

  private GetSocialmediaTopicsRequest createGetSocialmediaTopicsRequest(Integer pageNumber, Integer pageSize, List<String> divisionIds, Boolean includeDeleted) {
    return GetSocialmediaTopicsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withDivisionIds(divisionIds)

            .withIncludeDeleted(includeDeleted)

            .build();
  }

  /**
   * Retrieve all social topics.
   * 
   * @param request The request object
   * @return SocialTopicResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialTopicResponseEntityListing getSocialmediaTopics(GetSocialmediaTopicsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SocialTopicResponseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SocialTopicResponseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all social topics.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialTopicResponseEntityListing> getSocialmediaTopics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SocialTopicResponseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SocialTopicResponseEntityListing> response = (ApiResponse<SocialTopicResponseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SocialTopicResponseEntityListing> response = (ApiResponse<SocialTopicResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a social topic.
   * 
   * @param topicId topicId (required)
   * @param body  (optional)
   * @return SocialTopicResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialTopicResponse patchSocialmediaTopic(String topicId, SocialTopicPatchRequest body) throws IOException, ApiException {
    return  patchSocialmediaTopic(createPatchSocialmediaTopicRequest(topicId, body));
  }

  /**
   * Update a social topic.
   * 
   * @param topicId topicId (required)
   * @param body  (optional)
   * @return SocialTopicResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialTopicResponse> patchSocialmediaTopicWithHttpInfo(String topicId, SocialTopicPatchRequest body) throws IOException {
    return patchSocialmediaTopic(createPatchSocialmediaTopicRequest(topicId, body).withHttpInfo());
  }

  private PatchSocialmediaTopicRequest createPatchSocialmediaTopicRequest(String topicId, SocialTopicPatchRequest body) {
    return PatchSocialmediaTopicRequest.builder()
            .withTopicId(topicId)

            .withBody(body)

            .build();
  }

  /**
   * Update a social topic.
   * 
   * @param request The request object
   * @return SocialTopicResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialTopicResponse patchSocialmediaTopic(PatchSocialmediaTopicRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SocialTopicResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SocialTopicResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a social topic.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialTopicResponse> patchSocialmediaTopic(ApiRequest<SocialTopicPatchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SocialTopicResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SocialTopicResponse> response = (ApiResponse<SocialTopicResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SocialTopicResponse> response = (ApiResponse<SocialTopicResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the status of a Facebook data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param facebookIngestionRuleId facebookIngestionRuleId (required)
   * @param body  (optional)
   * @return FacebookDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookDataIngestionRuleResponse patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(String topicId, String facebookIngestionRuleId, DataIngestionRuleStatusPatchRequest body) throws IOException, ApiException {
    return  patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(createPatchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest(topicId, facebookIngestionRuleId, body));
  }

  /**
   * Update the status of a Facebook data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param facebookIngestionRuleId facebookIngestionRuleId (required)
   * @param body  (optional)
   * @return FacebookDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookDataIngestionRuleResponse> patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdWithHttpInfo(String topicId, String facebookIngestionRuleId, DataIngestionRuleStatusPatchRequest body) throws IOException {
    return patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(createPatchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest(topicId, facebookIngestionRuleId, body).withHttpInfo());
  }

  private PatchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest createPatchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest(String topicId, String facebookIngestionRuleId, DataIngestionRuleStatusPatchRequest body) {
    return PatchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest.builder()
            .withTopicId(topicId)

            .withFacebookIngestionRuleId(facebookIngestionRuleId)

            .withBody(body)

            .build();
  }

  /**
   * Update the status of a Facebook data ingestion rule.
   * 
   * @param request The request object
   * @return FacebookDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookDataIngestionRuleResponse patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(PatchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the status of a Facebook data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookDataIngestionRuleResponse> patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(ApiRequest<DataIngestionRuleStatusPatchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the status of a Instagram data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param instagramIngestionRuleId instagramIngestionRuleId (required)
   * @param body  (optional)
   * @return InstagramDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InstagramDataIngestionRuleResponse patchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(String topicId, String instagramIngestionRuleId, DataIngestionRuleStatusPatchRequest body) throws IOException, ApiException {
    return  patchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(createPatchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest(topicId, instagramIngestionRuleId, body));
  }

  /**
   * Update the status of a Instagram data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param instagramIngestionRuleId instagramIngestionRuleId (required)
   * @param body  (optional)
   * @return InstagramDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InstagramDataIngestionRuleResponse> patchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdWithHttpInfo(String topicId, String instagramIngestionRuleId, DataIngestionRuleStatusPatchRequest body) throws IOException {
    return patchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(createPatchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest(topicId, instagramIngestionRuleId, body).withHttpInfo());
  }

  private PatchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest createPatchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest(String topicId, String instagramIngestionRuleId, DataIngestionRuleStatusPatchRequest body) {
    return PatchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest.builder()
            .withTopicId(topicId)

            .withInstagramIngestionRuleId(instagramIngestionRuleId)

            .withBody(body)

            .build();
  }

  /**
   * Update the status of a Instagram data ingestion rule.
   * 
   * @param request The request object
   * @return InstagramDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InstagramDataIngestionRuleResponse patchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(PatchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InstagramDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InstagramDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the status of a Instagram data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InstagramDataIngestionRuleResponse> patchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(ApiRequest<DataIngestionRuleStatusPatchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InstagramDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the status of a open data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param openId openId (required)
   * @param body  (optional)
   * @return OpenDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenDataIngestionRuleResponse patchSocialmediaTopicDataingestionrulesOpenOpenId(String topicId, String openId, DataIngestionRuleStatusPatchRequest body) throws IOException, ApiException {
    return  patchSocialmediaTopicDataingestionrulesOpenOpenId(createPatchSocialmediaTopicDataingestionrulesOpenOpenIdRequest(topicId, openId, body));
  }

  /**
   * Update the status of a open data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param openId openId (required)
   * @param body  (optional)
   * @return OpenDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenDataIngestionRuleResponse> patchSocialmediaTopicDataingestionrulesOpenOpenIdWithHttpInfo(String topicId, String openId, DataIngestionRuleStatusPatchRequest body) throws IOException {
    return patchSocialmediaTopicDataingestionrulesOpenOpenId(createPatchSocialmediaTopicDataingestionrulesOpenOpenIdRequest(topicId, openId, body).withHttpInfo());
  }

  private PatchSocialmediaTopicDataingestionrulesOpenOpenIdRequest createPatchSocialmediaTopicDataingestionrulesOpenOpenIdRequest(String topicId, String openId, DataIngestionRuleStatusPatchRequest body) {
    return PatchSocialmediaTopicDataingestionrulesOpenOpenIdRequest.builder()
            .withTopicId(topicId)

            .withOpenId(openId)

            .withBody(body)

            .build();
  }

  /**
   * Update the status of a open data ingestion rule.
   * 
   * @param request The request object
   * @return OpenDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenDataIngestionRuleResponse patchSocialmediaTopicDataingestionrulesOpenOpenId(PatchSocialmediaTopicDataingestionrulesOpenOpenIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the status of a open data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenDataIngestionRuleResponse> patchSocialmediaTopicDataingestionrulesOpenOpenId(ApiRequest<DataIngestionRuleStatusPatchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the status of a X (formally Twitter) data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param twitterIngestionRuleId twitterIngestionRuleId (required)
   * @param body  (optional)
   * @return TwitterDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataIngestionRuleResponse patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(String topicId, String twitterIngestionRuleId, DataIngestionRuleStatusPatchRequest body) throws IOException, ApiException {
    return  patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(createPatchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest(topicId, twitterIngestionRuleId, body));
  }

  /**
   * Update the status of a X (formally Twitter) data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param twitterIngestionRuleId twitterIngestionRuleId (required)
   * @param body  (optional)
   * @return TwitterDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataIngestionRuleResponse> patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdWithHttpInfo(String topicId, String twitterIngestionRuleId, DataIngestionRuleStatusPatchRequest body) throws IOException {
    return patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(createPatchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest(topicId, twitterIngestionRuleId, body).withHttpInfo());
  }

  private PatchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest createPatchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest(String topicId, String twitterIngestionRuleId, DataIngestionRuleStatusPatchRequest body) {
    return PatchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest.builder()
            .withTopicId(topicId)

            .withTwitterIngestionRuleId(twitterIngestionRuleId)

            .withBody(body)

            .build();
  }

  /**
   * Update the status of a X (formally Twitter) data ingestion rule.
   * 
   * @param request The request object
   * @return TwitterDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataIngestionRuleResponse patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(PatchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the status of a X (formally Twitter) data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataIngestionRuleResponse> patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(ApiRequest<DataIngestionRuleStatusPatchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for social media aggregates asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postSocialmediaAnalyticsAggregatesJobs(SocialMediaAsyncAggregationQuery body) throws IOException, ApiException {
    return  postSocialmediaAnalyticsAggregatesJobs(createPostSocialmediaAnalyticsAggregatesJobsRequest(body));
  }

  /**
   * Query for social media aggregates asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postSocialmediaAnalyticsAggregatesJobsWithHttpInfo(SocialMediaAsyncAggregationQuery body) throws IOException {
    return postSocialmediaAnalyticsAggregatesJobs(createPostSocialmediaAnalyticsAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostSocialmediaAnalyticsAggregatesJobsRequest createPostSocialmediaAnalyticsAggregatesJobsRequest(SocialMediaAsyncAggregationQuery body) {
    return PostSocialmediaAnalyticsAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for social media aggregates asynchronously
   * 
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postSocialmediaAnalyticsAggregatesJobs(PostSocialmediaAnalyticsAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for social media aggregates asynchronously
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postSocialmediaAnalyticsAggregatesJobs(ApiRequest<SocialMediaAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for social media messages asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postSocialmediaAnalyticsMessagesJobs(SocialMediaAsyncDetailQuery body) throws IOException, ApiException {
    return  postSocialmediaAnalyticsMessagesJobs(createPostSocialmediaAnalyticsMessagesJobsRequest(body));
  }

  /**
   * Query for social media messages asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postSocialmediaAnalyticsMessagesJobsWithHttpInfo(SocialMediaAsyncDetailQuery body) throws IOException {
    return postSocialmediaAnalyticsMessagesJobs(createPostSocialmediaAnalyticsMessagesJobsRequest(body).withHttpInfo());
  }

  private PostSocialmediaAnalyticsMessagesJobsRequest createPostSocialmediaAnalyticsMessagesJobsRequest(SocialMediaAsyncDetailQuery body) {
    return PostSocialmediaAnalyticsMessagesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for social media messages asynchronously
   * 
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postSocialmediaAnalyticsMessagesJobs(PostSocialmediaAnalyticsMessagesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for social media messages asynchronously
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postSocialmediaAnalyticsMessagesJobs(ApiRequest<SocialMediaAsyncDetailQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an escalation rule.
   * 
   * @param body  (optional)
   * @return EscalationRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EscalationRuleResponse postSocialmediaEscalationrules(EscalationRuleRequest body) throws IOException, ApiException {
    return  postSocialmediaEscalationrules(createPostSocialmediaEscalationrulesRequest(body));
  }

  /**
   * Create an escalation rule.
   * 
   * @param body  (optional)
   * @return EscalationRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EscalationRuleResponse> postSocialmediaEscalationrulesWithHttpInfo(EscalationRuleRequest body) throws IOException {
    return postSocialmediaEscalationrules(createPostSocialmediaEscalationrulesRequest(body).withHttpInfo());
  }

  private PostSocialmediaEscalationrulesRequest createPostSocialmediaEscalationrulesRequest(EscalationRuleRequest body) {
    return PostSocialmediaEscalationrulesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create an escalation rule.
   * 
   * @param request The request object
   * @return EscalationRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EscalationRuleResponse postSocialmediaEscalationrules(PostSocialmediaEscalationrulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EscalationRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EscalationRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an escalation rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EscalationRuleResponse> postSocialmediaEscalationrules(ApiRequest<EscalationRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EscalationRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EscalationRuleResponse> response = (ApiResponse<EscalationRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<EscalationRuleResponse> response = (ApiResponse<EscalationRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Escalate message to a conversation manually
   * 
   * @param divisionId One division ID (required)
   * @param body  (optional)
   * @return ManualEscalationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManualEscalationResponse postSocialmediaEscalationsMessages(String divisionId, ManualEscalationRequest body) throws IOException, ApiException {
    return  postSocialmediaEscalationsMessages(createPostSocialmediaEscalationsMessagesRequest(divisionId, body));
  }

  /**
   * Escalate message to a conversation manually
   * 
   * @param divisionId One division ID (required)
   * @param body  (optional)
   * @return ManualEscalationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManualEscalationResponse> postSocialmediaEscalationsMessagesWithHttpInfo(String divisionId, ManualEscalationRequest body) throws IOException {
    return postSocialmediaEscalationsMessages(createPostSocialmediaEscalationsMessagesRequest(divisionId, body).withHttpInfo());
  }

  private PostSocialmediaEscalationsMessagesRequest createPostSocialmediaEscalationsMessagesRequest(String divisionId, ManualEscalationRequest body) {
    return PostSocialmediaEscalationsMessagesRequest.builder()
            .withDivisionId(divisionId)

            .withBody(body)

            .build();
  }

  /**
   * Escalate message to a conversation manually
   * 
   * @param request The request object
   * @return ManualEscalationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManualEscalationResponse postSocialmediaEscalationsMessages(PostSocialmediaEscalationsMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ManualEscalationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ManualEscalationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Escalate message to a conversation manually
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManualEscalationResponse> postSocialmediaEscalationsMessages(ApiRequest<ManualEscalationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ManualEscalationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ManualEscalationResponse> response = (ApiResponse<ManualEscalationResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ManualEscalationResponse> response = (ApiResponse<ManualEscalationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an Facebook data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param body  (optional)
   * @return FacebookDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookDataIngestionRuleResponse postSocialmediaTopicDataingestionrulesFacebook(String topicId, FacebookDataIngestionRuleRequest body) throws IOException, ApiException {
    return  postSocialmediaTopicDataingestionrulesFacebook(createPostSocialmediaTopicDataingestionrulesFacebookRequest(topicId, body));
  }

  /**
   * Create an Facebook data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param body  (optional)
   * @return FacebookDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookDataIngestionRuleResponse> postSocialmediaTopicDataingestionrulesFacebookWithHttpInfo(String topicId, FacebookDataIngestionRuleRequest body) throws IOException {
    return postSocialmediaTopicDataingestionrulesFacebook(createPostSocialmediaTopicDataingestionrulesFacebookRequest(topicId, body).withHttpInfo());
  }

  private PostSocialmediaTopicDataingestionrulesFacebookRequest createPostSocialmediaTopicDataingestionrulesFacebookRequest(String topicId, FacebookDataIngestionRuleRequest body) {
    return PostSocialmediaTopicDataingestionrulesFacebookRequest.builder()
            .withTopicId(topicId)

            .withBody(body)

            .build();
  }

  /**
   * Create an Facebook data ingestion rule.
   * 
   * @param request The request object
   * @return FacebookDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookDataIngestionRuleResponse postSocialmediaTopicDataingestionrulesFacebook(PostSocialmediaTopicDataingestionrulesFacebookRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an Facebook data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookDataIngestionRuleResponse> postSocialmediaTopicDataingestionrulesFacebook(ApiRequest<FacebookDataIngestionRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an Instagram data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param body  (optional)
   * @return InstagramDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InstagramDataIngestionRuleResponse postSocialmediaTopicDataingestionrulesInstagram(String topicId, InstagramDataIngestionRuleRequest body) throws IOException, ApiException {
    return  postSocialmediaTopicDataingestionrulesInstagram(createPostSocialmediaTopicDataingestionrulesInstagramRequest(topicId, body));
  }

  /**
   * Create an Instagram data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param body  (optional)
   * @return InstagramDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InstagramDataIngestionRuleResponse> postSocialmediaTopicDataingestionrulesInstagramWithHttpInfo(String topicId, InstagramDataIngestionRuleRequest body) throws IOException {
    return postSocialmediaTopicDataingestionrulesInstagram(createPostSocialmediaTopicDataingestionrulesInstagramRequest(topicId, body).withHttpInfo());
  }

  private PostSocialmediaTopicDataingestionrulesInstagramRequest createPostSocialmediaTopicDataingestionrulesInstagramRequest(String topicId, InstagramDataIngestionRuleRequest body) {
    return PostSocialmediaTopicDataingestionrulesInstagramRequest.builder()
            .withTopicId(topicId)

            .withBody(body)

            .build();
  }

  /**
   * Create an Instagram data ingestion rule.
   * 
   * @param request The request object
   * @return InstagramDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InstagramDataIngestionRuleResponse postSocialmediaTopicDataingestionrulesInstagram(PostSocialmediaTopicDataingestionrulesInstagramRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InstagramDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InstagramDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an Instagram data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InstagramDataIngestionRuleResponse> postSocialmediaTopicDataingestionrulesInstagram(ApiRequest<InstagramDataIngestionRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InstagramDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an open data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param body  (optional)
   * @return OpenDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenDataIngestionRuleResponse postSocialmediaTopicDataingestionrulesOpen(String topicId, OpenDataIngestionRuleRequest body) throws IOException, ApiException {
    return  postSocialmediaTopicDataingestionrulesOpen(createPostSocialmediaTopicDataingestionrulesOpenRequest(topicId, body));
  }

  /**
   * Create an open data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param body  (optional)
   * @return OpenDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenDataIngestionRuleResponse> postSocialmediaTopicDataingestionrulesOpenWithHttpInfo(String topicId, OpenDataIngestionRuleRequest body) throws IOException {
    return postSocialmediaTopicDataingestionrulesOpen(createPostSocialmediaTopicDataingestionrulesOpenRequest(topicId, body).withHttpInfo());
  }

  private PostSocialmediaTopicDataingestionrulesOpenRequest createPostSocialmediaTopicDataingestionrulesOpenRequest(String topicId, OpenDataIngestionRuleRequest body) {
    return PostSocialmediaTopicDataingestionrulesOpenRequest.builder()
            .withTopicId(topicId)

            .withBody(body)

            .build();
  }

  /**
   * Create an open data ingestion rule.
   * 
   * @param request The request object
   * @return OpenDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenDataIngestionRuleResponse postSocialmediaTopicDataingestionrulesOpen(PostSocialmediaTopicDataingestionrulesOpenRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an open data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenDataIngestionRuleResponse> postSocialmediaTopicDataingestionrulesOpen(ApiRequest<OpenDataIngestionRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Ingest a list of Open Social Messages
   * Ingest a list of open social messages to an ingestion rule on a topic. This endpoint will ingest and enrich these messages.  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least social scope.
   * @param topicId Topic ID (required)
   * @param ruleId Data Ingestion Rule ID (required)
   * @param body NormalizedMessage (required)
   * @return OpenSocialNormalizedMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenSocialNormalizedMessageEntityListing postSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulk(String topicId, String ruleId, List<OpenSocialMediaNormalizedMessage> body) throws IOException, ApiException {
    return  postSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulk(createPostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest(topicId, ruleId, body));
  }

  /**
   * Ingest a list of Open Social Messages
   * Ingest a list of open social messages to an ingestion rule on a topic. This endpoint will ingest and enrich these messages.  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least social scope.
   * @param topicId Topic ID (required)
   * @param ruleId Data Ingestion Rule ID (required)
   * @param body NormalizedMessage (required)
   * @return OpenSocialNormalizedMessageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenSocialNormalizedMessageEntityListing> postSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkWithHttpInfo(String topicId, String ruleId, List<OpenSocialMediaNormalizedMessage> body) throws IOException {
    return postSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulk(createPostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest(topicId, ruleId, body).withHttpInfo());
  }

  private PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest createPostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest(String topicId, String ruleId, List<OpenSocialMediaNormalizedMessage> body) {
    return PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest.builder()
            .withTopicId(topicId)

            .withRuleId(ruleId)

            .withBody(body)

            .build();
  }

  /**
   * Ingest a list of Open Social Messages
   * Ingest a list of open social messages to an ingestion rule on a topic. This endpoint will ingest and enrich these messages.  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least social scope.
   * @param request The request object
   * @return OpenSocialNormalizedMessageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenSocialNormalizedMessageEntityListing postSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulk(PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenSocialNormalizedMessageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenSocialNormalizedMessageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Ingest a list of Open Social Messages
   * Ingest a list of open social messages to an ingestion rule on a topic. This endpoint will ingest and enrich these messages.  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least social scope.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenSocialNormalizedMessageEntityListing> postSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulk(ApiRequest<List<OpenSocialMediaNormalizedMessage>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenSocialNormalizedMessageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenSocialNormalizedMessageEntityListing> response = (ApiResponse<OpenSocialNormalizedMessageEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OpenSocialNormalizedMessageEntityListing> response = (ApiResponse<OpenSocialNormalizedMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Ingest a list of Open Social Reactions
   * Ingest a list of open social reactions to an ingestion rule on a topic. This endpoint will ingest these reactions.  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least social scope.
   * @param topicId Topic ID (required)
   * @param ruleId Data Ingestion Rule ID (required)
   * @param body NormalizedEvent (required)
   * @return OpenSocialReactionsNormalizedEventEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenSocialReactionsNormalizedEventEntityListing postSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulk(String topicId, String ruleId, OpenSocialMediaReactionsRequest body) throws IOException, ApiException {
    return  postSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulk(createPostSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulkRequest(topicId, ruleId, body));
  }

  /**
   * Ingest a list of Open Social Reactions
   * Ingest a list of open social reactions to an ingestion rule on a topic. This endpoint will ingest these reactions.  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least social scope.
   * @param topicId Topic ID (required)
   * @param ruleId Data Ingestion Rule ID (required)
   * @param body NormalizedEvent (required)
   * @return OpenSocialReactionsNormalizedEventEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenSocialReactionsNormalizedEventEntityListing> postSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulkWithHttpInfo(String topicId, String ruleId, OpenSocialMediaReactionsRequest body) throws IOException {
    return postSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulk(createPostSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulkRequest(topicId, ruleId, body).withHttpInfo());
  }

  private PostSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulkRequest createPostSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulkRequest(String topicId, String ruleId, OpenSocialMediaReactionsRequest body) {
    return PostSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulkRequest.builder()
            .withTopicId(topicId)

            .withRuleId(ruleId)

            .withBody(body)

            .build();
  }

  /**
   * Ingest a list of Open Social Reactions
   * Ingest a list of open social reactions to an ingestion rule on a topic. This endpoint will ingest these reactions.  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least social scope.
   * @param request The request object
   * @return OpenSocialReactionsNormalizedEventEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenSocialReactionsNormalizedEventEntityListing postSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulk(PostSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenSocialReactionsNormalizedEventEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenSocialReactionsNormalizedEventEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Ingest a list of Open Social Reactions
   * Ingest a list of open social reactions to an ingestion rule on a topic. This endpoint will ingest these reactions.  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least social scope.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenSocialReactionsNormalizedEventEntityListing> postSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulk(ApiRequest<OpenSocialMediaReactionsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenSocialReactionsNormalizedEventEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenSocialReactionsNormalizedEventEntityListing> response = (ApiResponse<OpenSocialReactionsNormalizedEventEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OpenSocialReactionsNormalizedEventEntityListing> response = (ApiResponse<OpenSocialReactionsNormalizedEventEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an twitter data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param body  (optional)
   * @return TwitterDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataIngestionRuleResponse postSocialmediaTopicDataingestionrulesTwitter(String topicId, TwitterDataIngestionRuleRequest body) throws IOException, ApiException {
    return  postSocialmediaTopicDataingestionrulesTwitter(createPostSocialmediaTopicDataingestionrulesTwitterRequest(topicId, body));
  }

  /**
   * Create an twitter data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param body  (optional)
   * @return TwitterDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataIngestionRuleResponse> postSocialmediaTopicDataingestionrulesTwitterWithHttpInfo(String topicId, TwitterDataIngestionRuleRequest body) throws IOException {
    return postSocialmediaTopicDataingestionrulesTwitter(createPostSocialmediaTopicDataingestionrulesTwitterRequest(topicId, body).withHttpInfo());
  }

  private PostSocialmediaTopicDataingestionrulesTwitterRequest createPostSocialmediaTopicDataingestionrulesTwitterRequest(String topicId, TwitterDataIngestionRuleRequest body) {
    return PostSocialmediaTopicDataingestionrulesTwitterRequest.builder()
            .withTopicId(topicId)

            .withBody(body)

            .build();
  }

  /**
   * Create an twitter data ingestion rule.
   * 
   * @param request The request object
   * @return TwitterDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataIngestionRuleResponse postSocialmediaTopicDataingestionrulesTwitter(PostSocialmediaTopicDataingestionrulesTwitterRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an twitter data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataIngestionRuleResponse> postSocialmediaTopicDataingestionrulesTwitter(ApiRequest<TwitterDataIngestionRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a social topic.
   * 
   * @param body  (optional)
   * @return SocialTopicResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialTopicResponse postSocialmediaTopics(SocialTopicRequest body) throws IOException, ApiException {
    return  postSocialmediaTopics(createPostSocialmediaTopicsRequest(body));
  }

  /**
   * Create a social topic.
   * 
   * @param body  (optional)
   * @return SocialTopicResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialTopicResponse> postSocialmediaTopicsWithHttpInfo(SocialTopicRequest body) throws IOException {
    return postSocialmediaTopics(createPostSocialmediaTopicsRequest(body).withHttpInfo());
  }

  private PostSocialmediaTopicsRequest createPostSocialmediaTopicsRequest(SocialTopicRequest body) {
    return PostSocialmediaTopicsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a social topic.
   * 
   * @param request The request object
   * @return SocialTopicResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SocialTopicResponse postSocialmediaTopics(PostSocialmediaTopicsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SocialTopicResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SocialTopicResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a social topic.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SocialTopicResponse> postSocialmediaTopics(ApiRequest<SocialTopicRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SocialTopicResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SocialTopicResponse> response = (ApiResponse<SocialTopicResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SocialTopicResponse> response = (ApiResponse<SocialTopicResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieves historical tweet count for search terms, optional countries list and the current limit and usage for the organization.
   * 
   * @param body TwitterDataHistoricalTweetRequest (required)
   * @return TwitterDataHistoricalTweetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataHistoricalTweetResponse postSocialmediaTwitterHistoricalTweets(TwitterDataHistoricalTweetRequest body) throws IOException, ApiException {
    return  postSocialmediaTwitterHistoricalTweets(createPostSocialmediaTwitterHistoricalTweetsRequest(body));
  }

  /**
   * Retrieves historical tweet count for search terms, optional countries list and the current limit and usage for the organization.
   * 
   * @param body TwitterDataHistoricalTweetRequest (required)
   * @return TwitterDataHistoricalTweetResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataHistoricalTweetResponse> postSocialmediaTwitterHistoricalTweetsWithHttpInfo(TwitterDataHistoricalTweetRequest body) throws IOException {
    return postSocialmediaTwitterHistoricalTweets(createPostSocialmediaTwitterHistoricalTweetsRequest(body).withHttpInfo());
  }

  private PostSocialmediaTwitterHistoricalTweetsRequest createPostSocialmediaTwitterHistoricalTweetsRequest(TwitterDataHistoricalTweetRequest body) {
    return PostSocialmediaTwitterHistoricalTweetsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Retrieves historical tweet count for search terms, optional countries list and the current limit and usage for the organization.
   * 
   * @param request The request object
   * @return TwitterDataHistoricalTweetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataHistoricalTweetResponse postSocialmediaTwitterHistoricalTweets(PostSocialmediaTwitterHistoricalTweetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterDataHistoricalTweetResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterDataHistoricalTweetResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves historical tweet count for search terms, optional countries list and the current limit and usage for the organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataHistoricalTweetResponse> postSocialmediaTwitterHistoricalTweets(ApiRequest<TwitterDataHistoricalTweetRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterDataHistoricalTweetResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterDataHistoricalTweetResponse> response = (ApiResponse<TwitterDataHistoricalTweetResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterDataHistoricalTweetResponse> response = (ApiResponse<TwitterDataHistoricalTweetResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the escalation rule.
   * 
   * @param escalationRuleId escalationRuleId (required)
   * @param body  (optional)
   * @return EscalationRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EscalationRuleResponse putSocialmediaEscalationrule(String escalationRuleId, EscalationRuleRequest body) throws IOException, ApiException {
    return  putSocialmediaEscalationrule(createPutSocialmediaEscalationruleRequest(escalationRuleId, body));
  }

  /**
   * Update the escalation rule.
   * 
   * @param escalationRuleId escalationRuleId (required)
   * @param body  (optional)
   * @return EscalationRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EscalationRuleResponse> putSocialmediaEscalationruleWithHttpInfo(String escalationRuleId, EscalationRuleRequest body) throws IOException {
    return putSocialmediaEscalationrule(createPutSocialmediaEscalationruleRequest(escalationRuleId, body).withHttpInfo());
  }

  private PutSocialmediaEscalationruleRequest createPutSocialmediaEscalationruleRequest(String escalationRuleId, EscalationRuleRequest body) {
    return PutSocialmediaEscalationruleRequest.builder()
            .withEscalationRuleId(escalationRuleId)

            .withBody(body)

            .build();
  }

  /**
   * Update the escalation rule.
   * 
   * @param request The request object
   * @return EscalationRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EscalationRuleResponse putSocialmediaEscalationrule(PutSocialmediaEscalationruleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EscalationRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EscalationRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the escalation rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EscalationRuleResponse> putSocialmediaEscalationrule(ApiRequest<EscalationRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EscalationRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EscalationRuleResponse> response = (ApiResponse<EscalationRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<EscalationRuleResponse> response = (ApiResponse<EscalationRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the Facebook data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param facebookIngestionRuleId facebookIngestionRuleId (required)
   * @param body  (optional)
   * @return FacebookDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookDataIngestionRuleResponse putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(String topicId, String facebookIngestionRuleId, FacebookDataIngestionRuleRequest body) throws IOException, ApiException {
    return  putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(createPutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest(topicId, facebookIngestionRuleId, body));
  }

  /**
   * Update the Facebook data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param facebookIngestionRuleId facebookIngestionRuleId (required)
   * @param body  (optional)
   * @return FacebookDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookDataIngestionRuleResponse> putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdWithHttpInfo(String topicId, String facebookIngestionRuleId, FacebookDataIngestionRuleRequest body) throws IOException {
    return putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(createPutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest(topicId, facebookIngestionRuleId, body).withHttpInfo());
  }

  private PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest createPutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest(String topicId, String facebookIngestionRuleId, FacebookDataIngestionRuleRequest body) {
    return PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest.builder()
            .withTopicId(topicId)

            .withFacebookIngestionRuleId(facebookIngestionRuleId)

            .withBody(body)

            .build();
  }

  /**
   * Update the Facebook data ingestion rule.
   * 
   * @param request The request object
   * @return FacebookDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookDataIngestionRuleResponse putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the Facebook data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookDataIngestionRuleResponse> putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId(ApiRequest<FacebookDataIngestionRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the Instagram data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param instagramIngestionRuleId instagramIngestionRuleId (required)
   * @param body  (optional)
   * @return InstagramDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InstagramDataIngestionRuleResponse putSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(String topicId, String instagramIngestionRuleId, InstagramDataIngestionRuleRequest body) throws IOException, ApiException {
    return  putSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(createPutSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest(topicId, instagramIngestionRuleId, body));
  }

  /**
   * Update the Instagram data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param instagramIngestionRuleId instagramIngestionRuleId (required)
   * @param body  (optional)
   * @return InstagramDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InstagramDataIngestionRuleResponse> putSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdWithHttpInfo(String topicId, String instagramIngestionRuleId, InstagramDataIngestionRuleRequest body) throws IOException {
    return putSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(createPutSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest(topicId, instagramIngestionRuleId, body).withHttpInfo());
  }

  private PutSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest createPutSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest(String topicId, String instagramIngestionRuleId, InstagramDataIngestionRuleRequest body) {
    return PutSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest.builder()
            .withTopicId(topicId)

            .withInstagramIngestionRuleId(instagramIngestionRuleId)

            .withBody(body)

            .build();
  }

  /**
   * Update the Instagram data ingestion rule.
   * 
   * @param request The request object
   * @return InstagramDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InstagramDataIngestionRuleResponse putSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(PutSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InstagramDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InstagramDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the Instagram data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InstagramDataIngestionRuleResponse> putSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleId(ApiRequest<InstagramDataIngestionRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InstagramDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the open data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param openId openId (required)
   * @param body  (optional)
   * @return OpenDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenDataIngestionRuleResponse putSocialmediaTopicDataingestionrulesOpenOpenId(String topicId, String openId, OpenDataIngestionRuleRequest body) throws IOException, ApiException {
    return  putSocialmediaTopicDataingestionrulesOpenOpenId(createPutSocialmediaTopicDataingestionrulesOpenOpenIdRequest(topicId, openId, body));
  }

  /**
   * Update the open data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param openId openId (required)
   * @param body  (optional)
   * @return OpenDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenDataIngestionRuleResponse> putSocialmediaTopicDataingestionrulesOpenOpenIdWithHttpInfo(String topicId, String openId, OpenDataIngestionRuleRequest body) throws IOException {
    return putSocialmediaTopicDataingestionrulesOpenOpenId(createPutSocialmediaTopicDataingestionrulesOpenOpenIdRequest(topicId, openId, body).withHttpInfo());
  }

  private PutSocialmediaTopicDataingestionrulesOpenOpenIdRequest createPutSocialmediaTopicDataingestionrulesOpenOpenIdRequest(String topicId, String openId, OpenDataIngestionRuleRequest body) {
    return PutSocialmediaTopicDataingestionrulesOpenOpenIdRequest.builder()
            .withTopicId(topicId)

            .withOpenId(openId)

            .withBody(body)

            .build();
  }

  /**
   * Update the open data ingestion rule.
   * 
   * @param request The request object
   * @return OpenDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OpenDataIngestionRuleResponse putSocialmediaTopicDataingestionrulesOpenOpenId(PutSocialmediaTopicDataingestionrulesOpenOpenIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OpenDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OpenDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the open data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OpenDataIngestionRuleResponse> putSocialmediaTopicDataingestionrulesOpenOpenId(ApiRequest<OpenDataIngestionRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OpenDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the X (formally Twitter) data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param twitterIngestionRuleId twitterIngestionRuleId (required)
   * @param body  (optional)
   * @return TwitterDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataIngestionRuleResponse putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(String topicId, String twitterIngestionRuleId, TwitterDataIngestionRuleRequest body) throws IOException, ApiException {
    return  putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(createPutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest(topicId, twitterIngestionRuleId, body));
  }

  /**
   * Update the X (formally Twitter) data ingestion rule.
   * 
   * @param topicId topicId (required)
   * @param twitterIngestionRuleId twitterIngestionRuleId (required)
   * @param body  (optional)
   * @return TwitterDataIngestionRuleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataIngestionRuleResponse> putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdWithHttpInfo(String topicId, String twitterIngestionRuleId, TwitterDataIngestionRuleRequest body) throws IOException {
    return putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(createPutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest(topicId, twitterIngestionRuleId, body).withHttpInfo());
  }

  private PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest createPutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest(String topicId, String twitterIngestionRuleId, TwitterDataIngestionRuleRequest body) {
    return PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest.builder()
            .withTopicId(topicId)

            .withTwitterIngestionRuleId(twitterIngestionRuleId)

            .withBody(body)

            .build();
  }

  /**
   * Update the X (formally Twitter) data ingestion rule.
   * 
   * @param request The request object
   * @return TwitterDataIngestionRuleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterDataIngestionRuleResponse putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterDataIngestionRuleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterDataIngestionRuleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the X (formally Twitter) data ingestion rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterDataIngestionRuleResponse> putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId(ApiRequest<TwitterDataIngestionRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterDataIngestionRuleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
