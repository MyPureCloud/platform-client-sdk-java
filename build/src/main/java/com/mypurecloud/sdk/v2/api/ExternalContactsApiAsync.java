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
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.Note;
import com.mypurecloud.sdk.v2.model.NoteListing;
import com.mypurecloud.sdk.v2.model.ContactListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;


import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsContactRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsContactNoteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsOrganizationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsOrganizationNoteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsRelationshipRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactNoteRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactNotesRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationContactsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationNoteRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationNotesRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationRelationshipsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsRelationshipRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsReversewhitepageslookupRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactAssociateconversationRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactNotesRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsOrganizationNotesRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsOrganizationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsRelationshipsRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsContactRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsContactNoteRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsConversationRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsOrganizationRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsOrganizationNoteRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsRelationshipRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class ExternalContactsApiAsync {
  private final ApiClient pcapiClient;

  public ExternalContactsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public ExternalContactsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteExternalcontactsContactAsync(DeleteExternalcontactsContactRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteExternalcontactsContactAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteExternalcontactsContactNoteAsync(DeleteExternalcontactsContactNoteRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteExternalcontactsContactNoteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteExternalcontactsOrganizationAsync(DeleteExternalcontactsOrganizationRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteExternalcontactsOrganizationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteExternalcontactsOrganizationNoteAsync(DeleteExternalcontactsOrganizationNoteRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteExternalcontactsOrganizationNoteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteExternalcontactsRelationshipAsync(DeleteExternalcontactsRelationshipRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteExternalcontactsRelationshipAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Fetch an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExternalContact> getExternalcontactsContactAsync(GetExternalcontactsContactRequest request, AsyncApiCallback<ExternalContact> callback) {
    return pcapiClient.<ExternalContact>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, callback);
  }

  /**
   * Fetch an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExternalContact>> getExternalcontactsContactAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    return pcapiClient.<ExternalContact>invokeAPIVerboseAsync(request, new TypeReference<ExternalContact>() {}, callback);
  }

  /**
   * Fetch a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Note> getExternalcontactsContactNoteAsync(GetExternalcontactsContactNoteRequest request, AsyncApiCallback<Note> callback) {
    return pcapiClient.<Note>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Note>() {}, callback);
  }

  /**
   * Fetch a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Note>> getExternalcontactsContactNoteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Note>> callback) {
    return pcapiClient.<Note>invokeAPIVerboseAsync(request, new TypeReference<Note>() {}, callback);
  }

  /**
   * List notes for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<NoteListing> getExternalcontactsContactNotesAsync(GetExternalcontactsContactNotesRequest request, AsyncApiCallback<NoteListing> callback) {
    return pcapiClient.<NoteListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<NoteListing>() {}, callback);
  }

  /**
   * List notes for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<NoteListing>> getExternalcontactsContactNotesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<NoteListing>> callback) {
    return pcapiClient.<NoteListing>invokeAPIVerboseAsync(request, new TypeReference<NoteListing>() {}, callback);
  }

  /**
   * Search for external contacts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ContactListing> getExternalcontactsContactsAsync(GetExternalcontactsContactsRequest request, AsyncApiCallback<ContactListing> callback) {
    return pcapiClient.<ContactListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ContactListing>() {}, callback);
  }

  /**
   * Search for external contacts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ContactListing>> getExternalcontactsContactsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ContactListing>> callback) {
    return pcapiClient.<ContactListing>invokeAPIVerboseAsync(request, new TypeReference<ContactListing>() {}, callback);
  }

  /**
   * Fetch an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExternalOrganization> getExternalcontactsOrganizationAsync(GetExternalcontactsOrganizationRequest request, AsyncApiCallback<ExternalOrganization> callback) {
    return pcapiClient.<ExternalOrganization>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {}, callback);
  }

  /**
   * Fetch an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExternalOrganization>> getExternalcontactsOrganizationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ExternalOrganization>> callback) {
    return pcapiClient.<ExternalOrganization>invokeAPIVerboseAsync(request, new TypeReference<ExternalOrganization>() {}, callback);
  }

  /**
   * Search for external contacts in an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ContactListing> getExternalcontactsOrganizationContactsAsync(GetExternalcontactsOrganizationContactsRequest request, AsyncApiCallback<ContactListing> callback) {
    return pcapiClient.<ContactListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ContactListing>() {}, callback);
  }

  /**
   * Search for external contacts in an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ContactListing>> getExternalcontactsOrganizationContactsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ContactListing>> callback) {
    return pcapiClient.<ContactListing>invokeAPIVerboseAsync(request, new TypeReference<ContactListing>() {}, callback);
  }

  /**
   * Fetch a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Note> getExternalcontactsOrganizationNoteAsync(GetExternalcontactsOrganizationNoteRequest request, AsyncApiCallback<Note> callback) {
    return pcapiClient.<Note>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Note>() {}, callback);
  }

  /**
   * Fetch a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Note>> getExternalcontactsOrganizationNoteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Note>> callback) {
    return pcapiClient.<Note>invokeAPIVerboseAsync(request, new TypeReference<Note>() {}, callback);
  }

  /**
   * List notes for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<NoteListing> getExternalcontactsOrganizationNotesAsync(GetExternalcontactsOrganizationNotesRequest request, AsyncApiCallback<NoteListing> callback) {
    return pcapiClient.<NoteListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<NoteListing>() {}, callback);
  }

  /**
   * List notes for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<NoteListing>> getExternalcontactsOrganizationNotesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<NoteListing>> callback) {
    return pcapiClient.<NoteListing>invokeAPIVerboseAsync(request, new TypeReference<NoteListing>() {}, callback);
  }

  /**
   * Fetch a relationship for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RelationshipListing> getExternalcontactsOrganizationRelationshipsAsync(GetExternalcontactsOrganizationRelationshipsRequest request, AsyncApiCallback<RelationshipListing> callback) {
    return pcapiClient.<RelationshipListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RelationshipListing>() {}, callback);
  }

  /**
   * Fetch a relationship for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RelationshipListing>> getExternalcontactsOrganizationRelationshipsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RelationshipListing>> callback) {
    return pcapiClient.<RelationshipListing>invokeAPIVerboseAsync(request, new TypeReference<RelationshipListing>() {}, callback);
  }

  /**
   * Search for external organizations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExternalOrganizationListing> getExternalcontactsOrganizationsAsync(GetExternalcontactsOrganizationsRequest request, AsyncApiCallback<ExternalOrganizationListing> callback) {
    return pcapiClient.<ExternalOrganizationListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExternalOrganizationListing>() {}, callback);
  }

  /**
   * Search for external organizations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExternalOrganizationListing>> getExternalcontactsOrganizationsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ExternalOrganizationListing>> callback) {
    return pcapiClient.<ExternalOrganizationListing>invokeAPIVerboseAsync(request, new TypeReference<ExternalOrganizationListing>() {}, callback);
  }

  /**
   * Fetch a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Relationship> getExternalcontactsRelationshipAsync(GetExternalcontactsRelationshipRequest request, AsyncApiCallback<Relationship> callback) {
    return pcapiClient.<Relationship>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Relationship>() {}, callback);
  }

  /**
   * Fetch a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Relationship>> getExternalcontactsRelationshipAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Relationship>> callback) {
    return pcapiClient.<Relationship>invokeAPIVerboseAsync(request, new TypeReference<Relationship>() {}, callback);
  }

  /**
   * Lookup contacts and externalOrganizations based on an attribute
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ReverseWhitepagesLookupResult> getExternalcontactsReversewhitepageslookupAsync(GetExternalcontactsReversewhitepageslookupRequest request, AsyncApiCallback<ReverseWhitepagesLookupResult> callback) {
    return pcapiClient.<ReverseWhitepagesLookupResult>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ReverseWhitepagesLookupResult>() {}, callback);
  }

  /**
   * Lookup contacts and externalOrganizations based on an attribute
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ReverseWhitepagesLookupResult>> getExternalcontactsReversewhitepageslookupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReverseWhitepagesLookupResult>> callback) {
    return pcapiClient.<ReverseWhitepagesLookupResult>invokeAPIVerboseAsync(request, new TypeReference<ReverseWhitepagesLookupResult>() {}, callback);
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postExternalcontactsContactAssociateconversationAsync(PostExternalcontactsContactAssociateconversationRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postExternalcontactsContactAssociateconversationAsync(ApiRequest<ConversationAssociation> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Create a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Note> postExternalcontactsContactNotesAsync(PostExternalcontactsContactNotesRequest request, AsyncApiCallback<Note> callback) {
    return pcapiClient.<Note>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Note>() {}, callback);
  }

  /**
   * Create a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Note>> postExternalcontactsContactNotesAsync(ApiRequest<Note> request, AsyncApiCallback<ApiResponse<Note>> callback) {
    return pcapiClient.<Note>invokeAPIVerboseAsync(request, new TypeReference<Note>() {}, callback);
  }

  /**
   * Create an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExternalContact> postExternalcontactsContactsAsync(PostExternalcontactsContactsRequest request, AsyncApiCallback<ExternalContact> callback) {
    return pcapiClient.<ExternalContact>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, callback);
  }

  /**
   * Create an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExternalContact>> postExternalcontactsContactsAsync(ApiRequest<ExternalContact> request, AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    return pcapiClient.<ExternalContact>invokeAPIVerboseAsync(request, new TypeReference<ExternalContact>() {}, callback);
  }

  /**
   * Create a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Note> postExternalcontactsOrganizationNotesAsync(PostExternalcontactsOrganizationNotesRequest request, AsyncApiCallback<Note> callback) {
    return pcapiClient.<Note>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Note>() {}, callback);
  }

  /**
   * Create a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Note>> postExternalcontactsOrganizationNotesAsync(ApiRequest<Note> request, AsyncApiCallback<ApiResponse<Note>> callback) {
    return pcapiClient.<Note>invokeAPIVerboseAsync(request, new TypeReference<Note>() {}, callback);
  }

  /**
   * Create an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExternalOrganization> postExternalcontactsOrganizationsAsync(PostExternalcontactsOrganizationsRequest request, AsyncApiCallback<ExternalOrganization> callback) {
    return pcapiClient.<ExternalOrganization>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {}, callback);
  }

  /**
   * Create an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExternalOrganization>> postExternalcontactsOrganizationsAsync(ApiRequest<ExternalOrganization> request, AsyncApiCallback<ApiResponse<ExternalOrganization>> callback) {
    return pcapiClient.<ExternalOrganization>invokeAPIVerboseAsync(request, new TypeReference<ExternalOrganization>() {}, callback);
  }

  /**
   * Create a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Relationship> postExternalcontactsRelationshipsAsync(PostExternalcontactsRelationshipsRequest request, AsyncApiCallback<Relationship> callback) {
    return pcapiClient.<Relationship>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Relationship>() {}, callback);
  }

  /**
   * Create a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Relationship>> postExternalcontactsRelationshipsAsync(ApiRequest<Relationship> request, AsyncApiCallback<ApiResponse<Relationship>> callback) {
    return pcapiClient.<Relationship>invokeAPIVerboseAsync(request, new TypeReference<Relationship>() {}, callback);
  }

  /**
   * Update an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExternalContact> putExternalcontactsContactAsync(PutExternalcontactsContactRequest request, AsyncApiCallback<ExternalContact> callback) {
    return pcapiClient.<ExternalContact>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, callback);
  }

  /**
   * Update an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExternalContact>> putExternalcontactsContactAsync(ApiRequest<ExternalContact> request, AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    return pcapiClient.<ExternalContact>invokeAPIVerboseAsync(request, new TypeReference<ExternalContact>() {}, callback);
  }

  /**
   * Update a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Note> putExternalcontactsContactNoteAsync(PutExternalcontactsContactNoteRequest request, AsyncApiCallback<Note> callback) {
    return pcapiClient.<Note>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Note>() {}, callback);
  }

  /**
   * Update a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Note>> putExternalcontactsContactNoteAsync(ApiRequest<Note> request, AsyncApiCallback<ApiResponse<Note>> callback) {
    return pcapiClient.<Note>invokeAPIVerboseAsync(request, new TypeReference<Note>() {}, callback);
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> putExternalcontactsConversationAsync(PutExternalcontactsConversationRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> putExternalcontactsConversationAsync(ApiRequest<ConversationAssociation> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Update an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExternalOrganization> putExternalcontactsOrganizationAsync(PutExternalcontactsOrganizationRequest request, AsyncApiCallback<ExternalOrganization> callback) {
    return pcapiClient.<ExternalOrganization>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {}, callback);
  }

  /**
   * Update an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExternalOrganization>> putExternalcontactsOrganizationAsync(ApiRequest<ExternalOrganization> request, AsyncApiCallback<ApiResponse<ExternalOrganization>> callback) {
    return pcapiClient.<ExternalOrganization>invokeAPIVerboseAsync(request, new TypeReference<ExternalOrganization>() {}, callback);
  }

  /**
   * Update a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Note> putExternalcontactsOrganizationNoteAsync(PutExternalcontactsOrganizationNoteRequest request, AsyncApiCallback<Note> callback) {
    return pcapiClient.<Note>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Note>() {}, callback);
  }

  /**
   * Update a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Note>> putExternalcontactsOrganizationNoteAsync(ApiRequest<Note> request, AsyncApiCallback<ApiResponse<Note>> callback) {
    return pcapiClient.<Note>invokeAPIVerboseAsync(request, new TypeReference<Note>() {}, callback);
  }

  /**
   * Update a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Relationship> putExternalcontactsRelationshipAsync(PutExternalcontactsRelationshipRequest request, AsyncApiCallback<Relationship> callback) {
    return pcapiClient.<Relationship>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Relationship>() {}, callback);
  }

  /**
   * Update a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Relationship>> putExternalcontactsRelationshipAsync(ApiRequest<Relationship> request, AsyncApiCallback<ApiResponse<Relationship>> callback) {
    return pcapiClient.<Relationship>invokeAPIVerboseAsync(request, new TypeReference<Relationship>() {}, callback);
  }

}
