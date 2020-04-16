package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.Empty;
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
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsOrganizationTrustorRequest;
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
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsOrganizationTrustorTrustorIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsRelationshipRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ExternalContactsApi {
  private final ApiClient pcapiClient;

  public ExternalContactsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExternalContactsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete an external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteExternalcontactsContact(String contactId) throws IOException, ApiException {
    return  deleteExternalcontactsContact(createDeleteExternalcontactsContactRequest(contactId));
  }

  /**
   * Delete an external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteExternalcontactsContactWithHttpInfo(String contactId) throws IOException {
    return deleteExternalcontactsContact(createDeleteExternalcontactsContactRequest(contactId).withHttpInfo());
  }

  private DeleteExternalcontactsContactRequest createDeleteExternalcontactsContactRequest(String contactId) {
    return DeleteExternalcontactsContactRequest.builder()
            .withContactId(contactId)
    
            .build();
  }

  /**
   * Delete an external contact
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteExternalcontactsContact(DeleteExternalcontactsContactRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Empty> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Empty>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete an external contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteExternalcontactsContact(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Empty>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
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
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param noteId Note Id (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteExternalcontactsContactNote(String contactId, String noteId) throws IOException, ApiException {
    return  deleteExternalcontactsContactNote(createDeleteExternalcontactsContactNoteRequest(contactId, noteId));
  }

  /**
   * Delete a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param noteId Note Id (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteExternalcontactsContactNoteWithHttpInfo(String contactId, String noteId) throws IOException {
    return deleteExternalcontactsContactNote(createDeleteExternalcontactsContactNoteRequest(contactId, noteId).withHttpInfo());
  }

  private DeleteExternalcontactsContactNoteRequest createDeleteExternalcontactsContactNoteRequest(String contactId, String noteId) {
    return DeleteExternalcontactsContactNoteRequest.builder()
            .withContactId(contactId)
    
            .withNoteId(noteId)
    
            .build();
  }

  /**
   * Delete a note for an external contact
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteExternalcontactsContactNote(DeleteExternalcontactsContactNoteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Empty> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Empty>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete a note for an external contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteExternalcontactsContactNote(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Empty>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
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
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteExternalcontactsOrganization(String externalOrganizationId) throws IOException, ApiException {
    return  deleteExternalcontactsOrganization(createDeleteExternalcontactsOrganizationRequest(externalOrganizationId));
  }

  /**
   * Delete an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteExternalcontactsOrganizationWithHttpInfo(String externalOrganizationId) throws IOException {
    return deleteExternalcontactsOrganization(createDeleteExternalcontactsOrganizationRequest(externalOrganizationId).withHttpInfo());
  }

  private DeleteExternalcontactsOrganizationRequest createDeleteExternalcontactsOrganizationRequest(String externalOrganizationId) {
    return DeleteExternalcontactsOrganizationRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)
    
            .build();
  }

  /**
   * Delete an external organization
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteExternalcontactsOrganization(DeleteExternalcontactsOrganizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Empty> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Empty>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteExternalcontactsOrganization(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Empty>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
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
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param noteId Note Id (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteExternalcontactsOrganizationNote(String externalOrganizationId, String noteId) throws IOException, ApiException {
    return  deleteExternalcontactsOrganizationNote(createDeleteExternalcontactsOrganizationNoteRequest(externalOrganizationId, noteId));
  }

  /**
   * Delete a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param noteId Note Id (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteExternalcontactsOrganizationNoteWithHttpInfo(String externalOrganizationId, String noteId) throws IOException {
    return deleteExternalcontactsOrganizationNote(createDeleteExternalcontactsOrganizationNoteRequest(externalOrganizationId, noteId).withHttpInfo());
  }

  private DeleteExternalcontactsOrganizationNoteRequest createDeleteExternalcontactsOrganizationNoteRequest(String externalOrganizationId, String noteId) {
    return DeleteExternalcontactsOrganizationNoteRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)
    
            .withNoteId(noteId)
    
            .build();
  }

  /**
   * Delete a note for an external organization
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteExternalcontactsOrganizationNote(DeleteExternalcontactsOrganizationNoteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Empty> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Empty>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete a note for an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteExternalcontactsOrganizationNote(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Empty>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
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
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Unlink the Trustor for this External Organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteExternalcontactsOrganizationTrustor(String externalOrganizationId) throws IOException, ApiException {
     deleteExternalcontactsOrganizationTrustor(createDeleteExternalcontactsOrganizationTrustorRequest(externalOrganizationId));
  }

  /**
   * Unlink the Trustor for this External Organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteExternalcontactsOrganizationTrustorWithHttpInfo(String externalOrganizationId) throws IOException {
    return deleteExternalcontactsOrganizationTrustor(createDeleteExternalcontactsOrganizationTrustorRequest(externalOrganizationId).withHttpInfo());
  }

  private DeleteExternalcontactsOrganizationTrustorRequest createDeleteExternalcontactsOrganizationTrustorRequest(String externalOrganizationId) {
    return DeleteExternalcontactsOrganizationTrustorRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)
    
            .build();
  }

  /**
   * Unlink the Trustor for this External Organization
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteExternalcontactsOrganizationTrustor(DeleteExternalcontactsOrganizationTrustorRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Unlink the Trustor for this External Organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteExternalcontactsOrganizationTrustor(ApiRequest<Void> request) throws IOException {
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
   * Delete a relationship
   * 
   * @param relationshipId Relationship Id (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteExternalcontactsRelationship(String relationshipId) throws IOException, ApiException {
    return  deleteExternalcontactsRelationship(createDeleteExternalcontactsRelationshipRequest(relationshipId));
  }

  /**
   * Delete a relationship
   * 
   * @param relationshipId Relationship Id (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteExternalcontactsRelationshipWithHttpInfo(String relationshipId) throws IOException {
    return deleteExternalcontactsRelationship(createDeleteExternalcontactsRelationshipRequest(relationshipId).withHttpInfo());
  }

  private DeleteExternalcontactsRelationshipRequest createDeleteExternalcontactsRelationshipRequest(String relationshipId) {
    return DeleteExternalcontactsRelationshipRequest.builder()
            .withRelationshipId(relationshipId)
    
            .build();
  }

  /**
   * Delete a relationship
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteExternalcontactsRelationship(DeleteExternalcontactsRelationshipRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Empty> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Empty>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete a relationship
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteExternalcontactsRelationship(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Empty>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
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
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Fetch an external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @param expand which fields, if any, to expand (externalOrganization,externalDataSources) (optional)
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact getExternalcontactsContact(String contactId, List<String> expand) throws IOException, ApiException {
    return  getExternalcontactsContact(createGetExternalcontactsContactRequest(contactId, expand));
  }

  /**
   * Fetch an external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @param expand which fields, if any, to expand (externalOrganization,externalDataSources) (optional)
   * @return ExternalContact
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> getExternalcontactsContactWithHttpInfo(String contactId, List<String> expand) throws IOException {
    return getExternalcontactsContact(createGetExternalcontactsContactRequest(contactId, expand).withHttpInfo());
  }

  private GetExternalcontactsContactRequest createGetExternalcontactsContactRequest(String contactId, List<String> expand) {
    return GetExternalcontactsContactRequest.builder()
            .withContactId(contactId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Fetch an external contact
   * 
   * @param request The request object
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact getExternalcontactsContact(GetExternalcontactsContactRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalContact> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalContact>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch an external contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> getExternalcontactsContact(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalContact>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Fetch a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param noteId Note Id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return Note
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Note getExternalcontactsContactNote(String contactId, String noteId, List<String> expand) throws IOException, ApiException {
    return  getExternalcontactsContactNote(createGetExternalcontactsContactNoteRequest(contactId, noteId, expand));
  }

  /**
   * Fetch a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param noteId Note Id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return Note
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Note> getExternalcontactsContactNoteWithHttpInfo(String contactId, String noteId, List<String> expand) throws IOException {
    return getExternalcontactsContactNote(createGetExternalcontactsContactNoteRequest(contactId, noteId, expand).withHttpInfo());
  }

  private GetExternalcontactsContactNoteRequest createGetExternalcontactsContactNoteRequest(String contactId, String noteId, List<String> expand) {
    return GetExternalcontactsContactNoteRequest.builder()
            .withContactId(contactId)
    
            .withNoteId(noteId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Fetch a note for an external contact
   * 
   * @param request The request object
   * @return Note
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Note getExternalcontactsContactNote(GetExternalcontactsContactNoteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Note> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Note>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a note for an external contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Note> getExternalcontactsContactNote(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Note>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)exception;
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
      ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List notes for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return NoteListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NoteListing getExternalcontactsContactNotes(String contactId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException, ApiException {
    return  getExternalcontactsContactNotes(createGetExternalcontactsContactNotesRequest(contactId, pageSize, pageNumber, sortOrder, expand));
  }

  /**
   * List notes for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return NoteListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NoteListing> getExternalcontactsContactNotesWithHttpInfo(String contactId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException {
    return getExternalcontactsContactNotes(createGetExternalcontactsContactNotesRequest(contactId, pageSize, pageNumber, sortOrder, expand).withHttpInfo());
  }

  private GetExternalcontactsContactNotesRequest createGetExternalcontactsContactNotesRequest(String contactId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) {
    return GetExternalcontactsContactNotesRequest.builder()
            .withContactId(contactId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * List notes for an external contact
   * 
   * @param request The request object
   * @return NoteListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NoteListing getExternalcontactsContactNotes(GetExternalcontactsContactNotesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NoteListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NoteListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List notes for an external contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NoteListing> getExternalcontactsContactNotes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NoteListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NoteListing> response = (ApiResponse<NoteListing>)(ApiResponse<?>)exception;
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
      ApiResponse<NoteListing> response = (ApiResponse<NoteListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search for external contacts
   * 
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 1)
   * @param q User supplied search keywords (no special syntax is currently supported) (optional)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return ContactListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListing getExternalcontactsContacts(Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand) throws IOException, ApiException {
    return  getExternalcontactsContacts(createGetExternalcontactsContactsRequest(pageSize, pageNumber, q, sortOrder, expand));
  }

  /**
   * Search for external contacts
   * 
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 1)
   * @param q User supplied search keywords (no special syntax is currently supported) (optional)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return ContactListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListing> getExternalcontactsContactsWithHttpInfo(Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand) throws IOException {
    return getExternalcontactsContacts(createGetExternalcontactsContactsRequest(pageSize, pageNumber, q, sortOrder, expand).withHttpInfo());
  }

  private GetExternalcontactsContactsRequest createGetExternalcontactsContactsRequest(Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand) {
    return GetExternalcontactsContactsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withQ(q)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Search for external contacts
   * 
   * @param request The request object
   * @return ContactListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListing getExternalcontactsContacts(GetExternalcontactsContactsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search for external contacts
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListing> getExternalcontactsContacts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListing> response = (ApiResponse<ContactListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactListing> response = (ApiResponse<ContactListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Fetch an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param expand which fields, if any, to expand (externalDataSources) (optional)
   * @param includeTrustors (true or false) whether or not to include trustor information embedded in the externalOrganization (optional)
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization getExternalcontactsOrganization(String externalOrganizationId, String expand, Boolean includeTrustors) throws IOException, ApiException {
    return  getExternalcontactsOrganization(createGetExternalcontactsOrganizationRequest(externalOrganizationId, expand, includeTrustors));
  }

  /**
   * Fetch an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param expand which fields, if any, to expand (externalDataSources) (optional)
   * @param includeTrustors (true or false) whether or not to include trustor information embedded in the externalOrganization (optional)
   * @return ExternalOrganization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> getExternalcontactsOrganizationWithHttpInfo(String externalOrganizationId, String expand, Boolean includeTrustors) throws IOException {
    return getExternalcontactsOrganization(createGetExternalcontactsOrganizationRequest(externalOrganizationId, expand, includeTrustors).withHttpInfo());
  }

  private GetExternalcontactsOrganizationRequest createGetExternalcontactsOrganizationRequest(String externalOrganizationId, String expand, Boolean includeTrustors) {
    return GetExternalcontactsOrganizationRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)
    
            .withExpand(expand)
    
            .withIncludeTrustors(includeTrustors)
    
            .build();
  }

  /**
   * Fetch an external organization
   * 
   * @param request The request object
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization getExternalcontactsOrganization(GetExternalcontactsOrganizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalOrganization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> getExternalcontactsOrganization(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalOrganization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search for external contacts in an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 1)
   * @param q User supplied search keywords (no special syntax is currently supported) (optional)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return ContactListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListing getExternalcontactsOrganizationContacts(String externalOrganizationId, Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand) throws IOException, ApiException {
    return  getExternalcontactsOrganizationContacts(createGetExternalcontactsOrganizationContactsRequest(externalOrganizationId, pageSize, pageNumber, q, sortOrder, expand));
  }

  /**
   * Search for external contacts in an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 1)
   * @param q User supplied search keywords (no special syntax is currently supported) (optional)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return ContactListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListing> getExternalcontactsOrganizationContactsWithHttpInfo(String externalOrganizationId, Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand) throws IOException {
    return getExternalcontactsOrganizationContacts(createGetExternalcontactsOrganizationContactsRequest(externalOrganizationId, pageSize, pageNumber, q, sortOrder, expand).withHttpInfo());
  }

  private GetExternalcontactsOrganizationContactsRequest createGetExternalcontactsOrganizationContactsRequest(String externalOrganizationId, Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand) {
    return GetExternalcontactsOrganizationContactsRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withQ(q)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Search for external contacts in an external organization
   * 
   * @param request The request object
   * @return ContactListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListing getExternalcontactsOrganizationContacts(GetExternalcontactsOrganizationContactsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search for external contacts in an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListing> getExternalcontactsOrganizationContacts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListing> response = (ApiResponse<ContactListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactListing> response = (ApiResponse<ContactListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Fetch a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param noteId Note Id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return Note
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Note getExternalcontactsOrganizationNote(String externalOrganizationId, String noteId, List<String> expand) throws IOException, ApiException {
    return  getExternalcontactsOrganizationNote(createGetExternalcontactsOrganizationNoteRequest(externalOrganizationId, noteId, expand));
  }

  /**
   * Fetch a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param noteId Note Id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return Note
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Note> getExternalcontactsOrganizationNoteWithHttpInfo(String externalOrganizationId, String noteId, List<String> expand) throws IOException {
    return getExternalcontactsOrganizationNote(createGetExternalcontactsOrganizationNoteRequest(externalOrganizationId, noteId, expand).withHttpInfo());
  }

  private GetExternalcontactsOrganizationNoteRequest createGetExternalcontactsOrganizationNoteRequest(String externalOrganizationId, String noteId, List<String> expand) {
    return GetExternalcontactsOrganizationNoteRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)
    
            .withNoteId(noteId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Fetch a note for an external organization
   * 
   * @param request The request object
   * @return Note
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Note getExternalcontactsOrganizationNote(GetExternalcontactsOrganizationNoteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Note> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Note>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a note for an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Note> getExternalcontactsOrganizationNote(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Note>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)exception;
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
      ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List notes for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return NoteListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NoteListing getExternalcontactsOrganizationNotes(String externalOrganizationId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException, ApiException {
    return  getExternalcontactsOrganizationNotes(createGetExternalcontactsOrganizationNotesRequest(externalOrganizationId, pageSize, pageNumber, sortOrder, expand));
  }

  /**
   * List notes for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return NoteListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NoteListing> getExternalcontactsOrganizationNotesWithHttpInfo(String externalOrganizationId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException {
    return getExternalcontactsOrganizationNotes(createGetExternalcontactsOrganizationNotesRequest(externalOrganizationId, pageSize, pageNumber, sortOrder, expand).withHttpInfo());
  }

  private GetExternalcontactsOrganizationNotesRequest createGetExternalcontactsOrganizationNotesRequest(String externalOrganizationId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) {
    return GetExternalcontactsOrganizationNotesRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * List notes for an external organization
   * 
   * @param request The request object
   * @return NoteListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NoteListing getExternalcontactsOrganizationNotes(GetExternalcontactsOrganizationNotesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NoteListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NoteListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List notes for an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NoteListing> getExternalcontactsOrganizationNotes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NoteListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NoteListing> response = (ApiResponse<NoteListing>)(ApiResponse<?>)exception;
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
      ApiResponse<NoteListing> response = (ApiResponse<NoteListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Fetch a relationship for an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 1)
   * @param expand which fields, if any, to expand (optional)
   * @param sortOrder Sort order (optional)
   * @return RelationshipListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RelationshipListing getExternalcontactsOrganizationRelationships(String externalOrganizationId, Integer pageSize, Integer pageNumber, String expand, String sortOrder) throws IOException, ApiException {
    return  getExternalcontactsOrganizationRelationships(createGetExternalcontactsOrganizationRelationshipsRequest(externalOrganizationId, pageSize, pageNumber, expand, sortOrder));
  }

  /**
   * Fetch a relationship for an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 1)
   * @param expand which fields, if any, to expand (optional)
   * @param sortOrder Sort order (optional)
   * @return RelationshipListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RelationshipListing> getExternalcontactsOrganizationRelationshipsWithHttpInfo(String externalOrganizationId, Integer pageSize, Integer pageNumber, String expand, String sortOrder) throws IOException {
    return getExternalcontactsOrganizationRelationships(createGetExternalcontactsOrganizationRelationshipsRequest(externalOrganizationId, pageSize, pageNumber, expand, sortOrder).withHttpInfo());
  }

  private GetExternalcontactsOrganizationRelationshipsRequest createGetExternalcontactsOrganizationRelationshipsRequest(String externalOrganizationId, Integer pageSize, Integer pageNumber, String expand, String sortOrder) {
    return GetExternalcontactsOrganizationRelationshipsRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExpand(expand)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Fetch a relationship for an external organization
   * 
   * @param request The request object
   * @return RelationshipListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RelationshipListing getExternalcontactsOrganizationRelationships(GetExternalcontactsOrganizationRelationshipsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RelationshipListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RelationshipListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a relationship for an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RelationshipListing> getExternalcontactsOrganizationRelationships(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RelationshipListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RelationshipListing> response = (ApiResponse<RelationshipListing>)(ApiResponse<?>)exception;
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
      ApiResponse<RelationshipListing> response = (ApiResponse<RelationshipListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search for external organizations
   * 
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 1)
   * @param q Search query (optional)
   * @param trustorId Search for external organizations by trustorIds (limit 25). If supplied, the &#39;q&#39; parameters is ignored. Items are returned in the order requested (optional)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @param includeTrustors (true or false) whether or not to include trustor information embedded in the externalOrganization (optional)
   * @return ExternalOrganizationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganizationListing getExternalcontactsOrganizations(Integer pageSize, Integer pageNumber, String q, List<String> trustorId, String sortOrder, List<String> expand, Boolean includeTrustors) throws IOException, ApiException {
    return  getExternalcontactsOrganizations(createGetExternalcontactsOrganizationsRequest(pageSize, pageNumber, q, trustorId, sortOrder, expand, includeTrustors));
  }

  /**
   * Search for external organizations
   * 
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be &lt;= 1,000) (optional, default to 1)
   * @param q Search query (optional)
   * @param trustorId Search for external organizations by trustorIds (limit 25). If supplied, the &#39;q&#39; parameters is ignored. Items are returned in the order requested (optional)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @param includeTrustors (true or false) whether or not to include trustor information embedded in the externalOrganization (optional)
   * @return ExternalOrganizationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganizationListing> getExternalcontactsOrganizationsWithHttpInfo(Integer pageSize, Integer pageNumber, String q, List<String> trustorId, String sortOrder, List<String> expand, Boolean includeTrustors) throws IOException {
    return getExternalcontactsOrganizations(createGetExternalcontactsOrganizationsRequest(pageSize, pageNumber, q, trustorId, sortOrder, expand, includeTrustors).withHttpInfo());
  }

  private GetExternalcontactsOrganizationsRequest createGetExternalcontactsOrganizationsRequest(Integer pageSize, Integer pageNumber, String q, List<String> trustorId, String sortOrder, List<String> expand, Boolean includeTrustors) {
    return GetExternalcontactsOrganizationsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withQ(q)
    
            .withTrustorId(trustorId)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .withIncludeTrustors(includeTrustors)
    
            .build();
  }

  /**
   * Search for external organizations
   * 
   * @param request The request object
   * @return ExternalOrganizationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganizationListing getExternalcontactsOrganizations(GetExternalcontactsOrganizationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalOrganizationListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalOrganizationListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search for external organizations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganizationListing> getExternalcontactsOrganizations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalOrganizationListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalOrganizationListing> response = (ApiResponse<ExternalOrganizationListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalOrganizationListing> response = (ApiResponse<ExternalOrganizationListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Fetch a relationship
   * 
   * @param relationshipId Relationship Id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return Relationship
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Relationship getExternalcontactsRelationship(String relationshipId, String expand) throws IOException, ApiException {
    return  getExternalcontactsRelationship(createGetExternalcontactsRelationshipRequest(relationshipId, expand));
  }

  /**
   * Fetch a relationship
   * 
   * @param relationshipId Relationship Id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return Relationship
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Relationship> getExternalcontactsRelationshipWithHttpInfo(String relationshipId, String expand) throws IOException {
    return getExternalcontactsRelationship(createGetExternalcontactsRelationshipRequest(relationshipId, expand).withHttpInfo());
  }

  private GetExternalcontactsRelationshipRequest createGetExternalcontactsRelationshipRequest(String relationshipId, String expand) {
    return GetExternalcontactsRelationshipRequest.builder()
            .withRelationshipId(relationshipId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Fetch a relationship
   * 
   * @param request The request object
   * @return Relationship
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Relationship getExternalcontactsRelationship(GetExternalcontactsRelationshipRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Relationship> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Relationship>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a relationship
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Relationship> getExternalcontactsRelationship(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Relationship>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Relationship> response = (ApiResponse<Relationship>)(ApiResponse<?>)exception;
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
      ApiResponse<Relationship> response = (ApiResponse<Relationship>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Look up contacts and externalOrganizations based on an attribute. Maximum of 25 values returned.
   * 
   * @param lookupVal User supplied value to lookup contacts/externalOrganizations (supports email addresses, e164 phone numbers, Twitter screen names) (required)
   * @param expand which field, if any, to expand (optional)
   * @return ReverseWhitepagesLookupResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReverseWhitepagesLookupResult getExternalcontactsReversewhitepageslookup(String lookupVal, List<String> expand) throws IOException, ApiException {
    return  getExternalcontactsReversewhitepageslookup(createGetExternalcontactsReversewhitepageslookupRequest(lookupVal, expand));
  }

  /**
   * Look up contacts and externalOrganizations based on an attribute. Maximum of 25 values returned.
   * 
   * @param lookupVal User supplied value to lookup contacts/externalOrganizations (supports email addresses, e164 phone numbers, Twitter screen names) (required)
   * @param expand which field, if any, to expand (optional)
   * @return ReverseWhitepagesLookupResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReverseWhitepagesLookupResult> getExternalcontactsReversewhitepageslookupWithHttpInfo(String lookupVal, List<String> expand) throws IOException {
    return getExternalcontactsReversewhitepageslookup(createGetExternalcontactsReversewhitepageslookupRequest(lookupVal, expand).withHttpInfo());
  }

  private GetExternalcontactsReversewhitepageslookupRequest createGetExternalcontactsReversewhitepageslookupRequest(String lookupVal, List<String> expand) {
    return GetExternalcontactsReversewhitepageslookupRequest.builder()
            .withLookupVal(lookupVal)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Look up contacts and externalOrganizations based on an attribute. Maximum of 25 values returned.
   * 
   * @param request The request object
   * @return ReverseWhitepagesLookupResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReverseWhitepagesLookupResult getExternalcontactsReversewhitepageslookup(GetExternalcontactsReversewhitepageslookupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReverseWhitepagesLookupResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReverseWhitepagesLookupResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Look up contacts and externalOrganizations based on an attribute. Maximum of 25 values returned.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReverseWhitepagesLookupResult> getExternalcontactsReversewhitepageslookup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReverseWhitepagesLookupResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReverseWhitepagesLookupResult> response = (ApiResponse<ReverseWhitepagesLookupResult>)(ApiResponse<?>)exception;
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
      ApiResponse<ReverseWhitepagesLookupResult> response = (ApiResponse<ReverseWhitepagesLookupResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param body ExternalContact (required)
   * @return Note
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Note postExternalcontactsContactNotes(String contactId, Note body) throws IOException, ApiException {
    return  postExternalcontactsContactNotes(createPostExternalcontactsContactNotesRequest(contactId, body));
  }

  /**
   * Create a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param body ExternalContact (required)
   * @return Note
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Note> postExternalcontactsContactNotesWithHttpInfo(String contactId, Note body) throws IOException {
    return postExternalcontactsContactNotes(createPostExternalcontactsContactNotesRequest(contactId, body).withHttpInfo());
  }

  private PostExternalcontactsContactNotesRequest createPostExternalcontactsContactNotesRequest(String contactId, Note body) {
    return PostExternalcontactsContactNotesRequest.builder()
            .withContactId(contactId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a note for an external contact
   * 
   * @param request The request object
   * @return Note
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Note postExternalcontactsContactNotes(PostExternalcontactsContactNotesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Note> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Note>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a note for an external contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Note> postExternalcontactsContactNotes(ApiRequest<Note> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Note>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)exception;
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
      ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an external contact
   * 
   * @param body ExternalContact (required)
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact postExternalcontactsContacts(ExternalContact body) throws IOException, ApiException {
    return  postExternalcontactsContacts(createPostExternalcontactsContactsRequest(body));
  }

  /**
   * Create an external contact
   * 
   * @param body ExternalContact (required)
   * @return ExternalContact
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> postExternalcontactsContactsWithHttpInfo(ExternalContact body) throws IOException {
    return postExternalcontactsContacts(createPostExternalcontactsContactsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsContactsRequest createPostExternalcontactsContactsRequest(ExternalContact body) {
    return PostExternalcontactsContactsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create an external contact
   * 
   * @param request The request object
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact postExternalcontactsContacts(PostExternalcontactsContactsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalContact> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalContact>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an external contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> postExternalcontactsContacts(ApiRequest<ExternalContact> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalContact>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param body ExternalContact (required)
   * @return Note
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Note postExternalcontactsOrganizationNotes(String externalOrganizationId, Note body) throws IOException, ApiException {
    return  postExternalcontactsOrganizationNotes(createPostExternalcontactsOrganizationNotesRequest(externalOrganizationId, body));
  }

  /**
   * Create a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param body ExternalContact (required)
   * @return Note
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Note> postExternalcontactsOrganizationNotesWithHttpInfo(String externalOrganizationId, Note body) throws IOException {
    return postExternalcontactsOrganizationNotes(createPostExternalcontactsOrganizationNotesRequest(externalOrganizationId, body).withHttpInfo());
  }

  private PostExternalcontactsOrganizationNotesRequest createPostExternalcontactsOrganizationNotesRequest(String externalOrganizationId, Note body) {
    return PostExternalcontactsOrganizationNotesRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a note for an external organization
   * 
   * @param request The request object
   * @return Note
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Note postExternalcontactsOrganizationNotes(PostExternalcontactsOrganizationNotesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Note> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Note>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a note for an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Note> postExternalcontactsOrganizationNotes(ApiRequest<Note> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Note>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)exception;
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
      ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an external organization
   * 
   * @param body ExternalOrganization (required)
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization postExternalcontactsOrganizations(ExternalOrganization body) throws IOException, ApiException {
    return  postExternalcontactsOrganizations(createPostExternalcontactsOrganizationsRequest(body));
  }

  /**
   * Create an external organization
   * 
   * @param body ExternalOrganization (required)
   * @return ExternalOrganization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> postExternalcontactsOrganizationsWithHttpInfo(ExternalOrganization body) throws IOException {
    return postExternalcontactsOrganizations(createPostExternalcontactsOrganizationsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsOrganizationsRequest createPostExternalcontactsOrganizationsRequest(ExternalOrganization body) {
    return PostExternalcontactsOrganizationsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create an external organization
   * 
   * @param request The request object
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization postExternalcontactsOrganizations(PostExternalcontactsOrganizationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalOrganization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> postExternalcontactsOrganizations(ApiRequest<ExternalOrganization> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalOrganization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a relationship
   * 
   * @param body Relationship (required)
   * @return Relationship
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Relationship postExternalcontactsRelationships(Relationship body) throws IOException, ApiException {
    return  postExternalcontactsRelationships(createPostExternalcontactsRelationshipsRequest(body));
  }

  /**
   * Create a relationship
   * 
   * @param body Relationship (required)
   * @return Relationship
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Relationship> postExternalcontactsRelationshipsWithHttpInfo(Relationship body) throws IOException {
    return postExternalcontactsRelationships(createPostExternalcontactsRelationshipsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsRelationshipsRequest createPostExternalcontactsRelationshipsRequest(Relationship body) {
    return PostExternalcontactsRelationshipsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a relationship
   * 
   * @param request The request object
   * @return Relationship
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Relationship postExternalcontactsRelationships(PostExternalcontactsRelationshipsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Relationship> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Relationship>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a relationship
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Relationship> postExternalcontactsRelationships(ApiRequest<Relationship> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Relationship>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Relationship> response = (ApiResponse<Relationship>)(ApiResponse<?>)exception;
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
      ApiResponse<Relationship> response = (ApiResponse<Relationship>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @param body ExternalContact (required)
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact putExternalcontactsContact(String contactId, ExternalContact body) throws IOException, ApiException {
    return  putExternalcontactsContact(createPutExternalcontactsContactRequest(contactId, body));
  }

  /**
   * Update an external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @param body ExternalContact (required)
   * @return ExternalContact
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> putExternalcontactsContactWithHttpInfo(String contactId, ExternalContact body) throws IOException {
    return putExternalcontactsContact(createPutExternalcontactsContactRequest(contactId, body).withHttpInfo());
  }

  private PutExternalcontactsContactRequest createPutExternalcontactsContactRequest(String contactId, ExternalContact body) {
    return PutExternalcontactsContactRequest.builder()
            .withContactId(contactId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an external contact
   * 
   * @param request The request object
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact putExternalcontactsContact(PutExternalcontactsContactRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalContact> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalContact>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an external contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> putExternalcontactsContact(ApiRequest<ExternalContact> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalContact>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param noteId Note Id (required)
   * @param body Note (required)
   * @return Note
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Note putExternalcontactsContactNote(String contactId, String noteId, Note body) throws IOException, ApiException {
    return  putExternalcontactsContactNote(createPutExternalcontactsContactNoteRequest(contactId, noteId, body));
  }

  /**
   * Update a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param noteId Note Id (required)
   * @param body Note (required)
   * @return Note
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Note> putExternalcontactsContactNoteWithHttpInfo(String contactId, String noteId, Note body) throws IOException {
    return putExternalcontactsContactNote(createPutExternalcontactsContactNoteRequest(contactId, noteId, body).withHttpInfo());
  }

  private PutExternalcontactsContactNoteRequest createPutExternalcontactsContactNoteRequest(String contactId, String noteId, Note body) {
    return PutExternalcontactsContactNoteRequest.builder()
            .withContactId(contactId)
    
            .withNoteId(noteId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a note for an external contact
   * 
   * @param request The request object
   * @return Note
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Note putExternalcontactsContactNote(PutExternalcontactsContactNoteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Note> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Note>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a note for an external contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Note> putExternalcontactsContactNote(ApiRequest<Note> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Note>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)exception;
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
      ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Associate an external contact with a conversation
   * 
   * @param conversationId Conversation ID (required)
   * @param body ConversationAssociation (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putExternalcontactsConversation(String conversationId, ConversationAssociation body) throws IOException, ApiException {
     putExternalcontactsConversation(createPutExternalcontactsConversationRequest(conversationId, body));
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @param conversationId Conversation ID (required)
   * @param body ConversationAssociation (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putExternalcontactsConversationWithHttpInfo(String conversationId, ConversationAssociation body) throws IOException {
    return putExternalcontactsConversation(createPutExternalcontactsConversationRequest(conversationId, body).withHttpInfo());
  }

  private PutExternalcontactsConversationRequest createPutExternalcontactsConversationRequest(String conversationId, ConversationAssociation body) {
    return PutExternalcontactsConversationRequest.builder()
            .withConversationId(conversationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putExternalcontactsConversation(PutExternalcontactsConversationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putExternalcontactsConversation(ApiRequest<ConversationAssociation> request) throws IOException {
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
   * Update an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param body ExternalOrganization (required)
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization putExternalcontactsOrganization(String externalOrganizationId, ExternalOrganization body) throws IOException, ApiException {
    return  putExternalcontactsOrganization(createPutExternalcontactsOrganizationRequest(externalOrganizationId, body));
  }

  /**
   * Update an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param body ExternalOrganization (required)
   * @return ExternalOrganization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> putExternalcontactsOrganizationWithHttpInfo(String externalOrganizationId, ExternalOrganization body) throws IOException {
    return putExternalcontactsOrganization(createPutExternalcontactsOrganizationRequest(externalOrganizationId, body).withHttpInfo());
  }

  private PutExternalcontactsOrganizationRequest createPutExternalcontactsOrganizationRequest(String externalOrganizationId, ExternalOrganization body) {
    return PutExternalcontactsOrganizationRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an external organization
   * 
   * @param request The request object
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization putExternalcontactsOrganization(PutExternalcontactsOrganizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalOrganization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> putExternalcontactsOrganization(ApiRequest<ExternalOrganization> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalOrganization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param noteId Note Id (required)
   * @param body Note (required)
   * @return Note
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Note putExternalcontactsOrganizationNote(String externalOrganizationId, String noteId, Note body) throws IOException, ApiException {
    return  putExternalcontactsOrganizationNote(createPutExternalcontactsOrganizationNoteRequest(externalOrganizationId, noteId, body));
  }

  /**
   * Update a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param noteId Note Id (required)
   * @param body Note (required)
   * @return Note
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Note> putExternalcontactsOrganizationNoteWithHttpInfo(String externalOrganizationId, String noteId, Note body) throws IOException {
    return putExternalcontactsOrganizationNote(createPutExternalcontactsOrganizationNoteRequest(externalOrganizationId, noteId, body).withHttpInfo());
  }

  private PutExternalcontactsOrganizationNoteRequest createPutExternalcontactsOrganizationNoteRequest(String externalOrganizationId, String noteId, Note body) {
    return PutExternalcontactsOrganizationNoteRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)
    
            .withNoteId(noteId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a note for an external organization
   * 
   * @param request The request object
   * @return Note
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Note putExternalcontactsOrganizationNote(PutExternalcontactsOrganizationNoteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Note> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Note>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a note for an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Note> putExternalcontactsOrganizationNote(ApiRequest<Note> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Note>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)exception;
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
      ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Links a Trustor with an External Organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param trustorId Trustor ID (required)
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization putExternalcontactsOrganizationTrustorTrustorId(String externalOrganizationId, String trustorId) throws IOException, ApiException {
    return  putExternalcontactsOrganizationTrustorTrustorId(createPutExternalcontactsOrganizationTrustorTrustorIdRequest(externalOrganizationId, trustorId));
  }

  /**
   * Links a Trustor with an External Organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param trustorId Trustor ID (required)
   * @return ExternalOrganization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> putExternalcontactsOrganizationTrustorTrustorIdWithHttpInfo(String externalOrganizationId, String trustorId) throws IOException {
    return putExternalcontactsOrganizationTrustorTrustorId(createPutExternalcontactsOrganizationTrustorTrustorIdRequest(externalOrganizationId, trustorId).withHttpInfo());
  }

  private PutExternalcontactsOrganizationTrustorTrustorIdRequest createPutExternalcontactsOrganizationTrustorTrustorIdRequest(String externalOrganizationId, String trustorId) {
    return PutExternalcontactsOrganizationTrustorTrustorIdRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)
    
            .withTrustorId(trustorId)
    
            .build();
  }

  /**
   * Links a Trustor with an External Organization
   * 
   * @param request The request object
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization putExternalcontactsOrganizationTrustorTrustorId(PutExternalcontactsOrganizationTrustorTrustorIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalOrganization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Links a Trustor with an External Organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> putExternalcontactsOrganizationTrustorTrustorId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalOrganization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a relationship
   * 
   * @param relationshipId Relationship Id (required)
   * @param body Relationship (required)
   * @return Relationship
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Relationship putExternalcontactsRelationship(String relationshipId, Relationship body) throws IOException, ApiException {
    return  putExternalcontactsRelationship(createPutExternalcontactsRelationshipRequest(relationshipId, body));
  }

  /**
   * Update a relationship
   * 
   * @param relationshipId Relationship Id (required)
   * @param body Relationship (required)
   * @return Relationship
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Relationship> putExternalcontactsRelationshipWithHttpInfo(String relationshipId, Relationship body) throws IOException {
    return putExternalcontactsRelationship(createPutExternalcontactsRelationshipRequest(relationshipId, body).withHttpInfo());
  }

  private PutExternalcontactsRelationshipRequest createPutExternalcontactsRelationshipRequest(String relationshipId, Relationship body) {
    return PutExternalcontactsRelationshipRequest.builder()
            .withRelationshipId(relationshipId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a relationship
   * 
   * @param request The request object
   * @return Relationship
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Relationship putExternalcontactsRelationship(PutExternalcontactsRelationshipRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Relationship> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Relationship>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a relationship
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Relationship> putExternalcontactsRelationship(ApiRequest<Relationship> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Relationship>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Relationship> response = (ApiResponse<Relationship>)(ApiResponse<?>)exception;
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
      ApiResponse<Relationship> response = (ApiResponse<Relationship>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
