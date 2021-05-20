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
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.CursorContactListing;
import com.mypurecloud.sdk.v2.model.CursorNoteListing;
import com.mypurecloud.sdk.v2.model.CursorOrganizationListing;
import com.mypurecloud.sdk.v2.model.CursorRelationshipListing;
import com.mypurecloud.sdk.v2.model.BulkFetchContactsResponse;
import com.mypurecloud.sdk.v2.model.BulkIdsRequest;
import com.mypurecloud.sdk.v2.model.BulkContactsResponse;
import com.mypurecloud.sdk.v2.model.BulkContactsRequest;
import com.mypurecloud.sdk.v2.model.BulkDeleteResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchNotesResponse;
import com.mypurecloud.sdk.v2.model.BulkNotesResponse;
import com.mypurecloud.sdk.v2.model.BulkNotesRequest;
import com.mypurecloud.sdk.v2.model.BulkFetchOrganizationsResponse;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsRequest;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchRelationshipsResponse;
import com.mypurecloud.sdk.v2.model.BulkRelationshipsRequest;
import com.mypurecloud.sdk.v2.model.BulkRelationshipsResponse;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationTrustorLink;


import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsContactRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsContactNoteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsContactsSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsOrganizationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsOrganizationNoteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsOrganizationTrustorRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsRelationshipRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactNoteRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactNotesRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsSchemaVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsSchemaVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationContactsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationNoteRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationNotesRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationRelationshipsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsSchemaVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsSchemaVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsRelationshipRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsReversewhitepageslookupRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsScanContactsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsScanNotesRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsScanOrganizationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsScanRelationshipsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkContactsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkContactsAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkContactsRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkContactsUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkNotesRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkNotesAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkNotesRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkNotesUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkOrganizationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkOrganizationsAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkOrganizationsRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkOrganizationsUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkRelationshipsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkRelationshipsAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkRelationshipsRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkRelationshipsUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactNotesRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactsSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsOrganizationNotesRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsOrganizationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsOrganizationsSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsRelationshipsRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsContactRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsContactNoteRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsContactsSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsConversationRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsOrganizationRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsOrganizationNoteRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsOrganizationTrustorTrustorIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsOrganizationsSchemaRequest;
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
   * Delete a schema
   * 
   * @param schemaId Schema ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteExternalcontactsContactsSchema(String schemaId) throws IOException, ApiException {
     deleteExternalcontactsContactsSchema(createDeleteExternalcontactsContactsSchemaRequest(schemaId));
  }

  /**
   * Delete a schema
   * 
   * @param schemaId Schema ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteExternalcontactsContactsSchemaWithHttpInfo(String schemaId) throws IOException {
    return deleteExternalcontactsContactsSchema(createDeleteExternalcontactsContactsSchemaRequest(schemaId).withHttpInfo());
  }

  private DeleteExternalcontactsContactsSchemaRequest createDeleteExternalcontactsContactsSchemaRequest(String schemaId) {
    return DeleteExternalcontactsContactsSchemaRequest.builder()
            .withSchemaId(schemaId)
    
            .build();
  }

  /**
   * Delete a schema
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteExternalcontactsContactsSchema(DeleteExternalcontactsContactsSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteExternalcontactsContactsSchema(ApiRequest<Void> request) throws IOException {
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
   * Get a schema
   * 
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getExternalcontactsContactsSchema(String schemaId) throws IOException, ApiException {
    return  getExternalcontactsContactsSchema(createGetExternalcontactsContactsSchemaRequest(schemaId));
  }

  /**
   * Get a schema
   * 
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getExternalcontactsContactsSchemaWithHttpInfo(String schemaId) throws IOException {
    return getExternalcontactsContactsSchema(createGetExternalcontactsContactsSchemaRequest(schemaId).withHttpInfo());
  }

  private GetExternalcontactsContactsSchemaRequest createGetExternalcontactsContactsSchemaRequest(String schemaId) {
    return GetExternalcontactsContactsSchemaRequest.builder()
            .withSchemaId(schemaId)
    
            .build();
  }

  /**
   * Get a schema
   * 
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getExternalcontactsContactsSchema(GetExternalcontactsContactsSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getExternalcontactsContactsSchema(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
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
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a specific version of a schema
   * 
   * @param schemaId Schema ID (required)
   * @param versionId Schema version (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getExternalcontactsContactsSchemaVersion(String schemaId, String versionId) throws IOException, ApiException {
    return  getExternalcontactsContactsSchemaVersion(createGetExternalcontactsContactsSchemaVersionRequest(schemaId, versionId));
  }

  /**
   * Get a specific version of a schema
   * 
   * @param schemaId Schema ID (required)
   * @param versionId Schema version (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getExternalcontactsContactsSchemaVersionWithHttpInfo(String schemaId, String versionId) throws IOException {
    return getExternalcontactsContactsSchemaVersion(createGetExternalcontactsContactsSchemaVersionRequest(schemaId, versionId).withHttpInfo());
  }

  private GetExternalcontactsContactsSchemaVersionRequest createGetExternalcontactsContactsSchemaVersionRequest(String schemaId, String versionId) {
    return GetExternalcontactsContactsSchemaVersionRequest.builder()
            .withSchemaId(schemaId)
    
            .withVersionId(versionId)
    
            .build();
  }

  /**
   * Get a specific version of a schema
   * 
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getExternalcontactsContactsSchemaVersion(GetExternalcontactsContactsSchemaVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a specific version of a schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getExternalcontactsContactsSchemaVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
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
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all versions of an external contact&#39;s schema
   * 
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getExternalcontactsContactsSchemaVersions(String schemaId) throws IOException, ApiException {
    return  getExternalcontactsContactsSchemaVersions(createGetExternalcontactsContactsSchemaVersionsRequest(schemaId));
  }

  /**
   * Get all versions of an external contact&#39;s schema
   * 
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getExternalcontactsContactsSchemaVersionsWithHttpInfo(String schemaId) throws IOException {
    return getExternalcontactsContactsSchemaVersions(createGetExternalcontactsContactsSchemaVersionsRequest(schemaId).withHttpInfo());
  }

  private GetExternalcontactsContactsSchemaVersionsRequest createGetExternalcontactsContactsSchemaVersionsRequest(String schemaId) {
    return GetExternalcontactsContactsSchemaVersionsRequest.builder()
            .withSchemaId(schemaId)
    
            .build();
  }

  /**
   * Get all versions of an external contact&#39;s schema
   * 
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getExternalcontactsContactsSchemaVersions(GetExternalcontactsContactsSchemaVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all versions of an external contact&#39;s schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getExternalcontactsContactsSchemaVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
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
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of schemas.
   * 
   * @return DataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchemaListing getExternalcontactsContactsSchemas() throws IOException, ApiException {
    return  getExternalcontactsContactsSchemas(createGetExternalcontactsContactsSchemasRequest());
  }

  /**
   * Get a list of schemas.
   * 
   * @return DataSchemaListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchemaListing> getExternalcontactsContactsSchemasWithHttpInfo() throws IOException {
    return getExternalcontactsContactsSchemas(createGetExternalcontactsContactsSchemasRequest().withHttpInfo());
  }

  private GetExternalcontactsContactsSchemasRequest createGetExternalcontactsContactsSchemasRequest() {
    return GetExternalcontactsContactsSchemasRequest.builder()
            .build();
  }

  /**
   * Get a list of schemas.
   * 
   * @param request The request object
   * @return DataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchemaListing getExternalcontactsContactsSchemas(GetExternalcontactsContactsSchemasRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchemaListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchemaListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of schemas.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchemaListing> getExternalcontactsContactsSchemas(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchemaListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a schema
   * 
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getExternalcontactsOrganizationsSchema(String schemaId) throws IOException, ApiException {
    return  getExternalcontactsOrganizationsSchema(createGetExternalcontactsOrganizationsSchemaRequest(schemaId));
  }

  /**
   * Get a schema
   * 
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getExternalcontactsOrganizationsSchemaWithHttpInfo(String schemaId) throws IOException {
    return getExternalcontactsOrganizationsSchema(createGetExternalcontactsOrganizationsSchemaRequest(schemaId).withHttpInfo());
  }

  private GetExternalcontactsOrganizationsSchemaRequest createGetExternalcontactsOrganizationsSchemaRequest(String schemaId) {
    return GetExternalcontactsOrganizationsSchemaRequest.builder()
            .withSchemaId(schemaId)
    
            .build();
  }

  /**
   * Get a schema
   * 
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getExternalcontactsOrganizationsSchema(GetExternalcontactsOrganizationsSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getExternalcontactsOrganizationsSchema(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
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
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a specific version of a schema
   * 
   * @param schemaId Schema ID (required)
   * @param versionId Schema version (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getExternalcontactsOrganizationsSchemaVersion(String schemaId, String versionId) throws IOException, ApiException {
    return  getExternalcontactsOrganizationsSchemaVersion(createGetExternalcontactsOrganizationsSchemaVersionRequest(schemaId, versionId));
  }

  /**
   * Get a specific version of a schema
   * 
   * @param schemaId Schema ID (required)
   * @param versionId Schema version (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getExternalcontactsOrganizationsSchemaVersionWithHttpInfo(String schemaId, String versionId) throws IOException {
    return getExternalcontactsOrganizationsSchemaVersion(createGetExternalcontactsOrganizationsSchemaVersionRequest(schemaId, versionId).withHttpInfo());
  }

  private GetExternalcontactsOrganizationsSchemaVersionRequest createGetExternalcontactsOrganizationsSchemaVersionRequest(String schemaId, String versionId) {
    return GetExternalcontactsOrganizationsSchemaVersionRequest.builder()
            .withSchemaId(schemaId)
    
            .withVersionId(versionId)
    
            .build();
  }

  /**
   * Get a specific version of a schema
   * 
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getExternalcontactsOrganizationsSchemaVersion(GetExternalcontactsOrganizationsSchemaVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a specific version of a schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getExternalcontactsOrganizationsSchemaVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
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
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all versions of an external organization&#39;s schema
   * 
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getExternalcontactsOrganizationsSchemaVersions(String schemaId) throws IOException, ApiException {
    return  getExternalcontactsOrganizationsSchemaVersions(createGetExternalcontactsOrganizationsSchemaVersionsRequest(schemaId));
  }

  /**
   * Get all versions of an external organization&#39;s schema
   * 
   * @param schemaId Schema ID (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getExternalcontactsOrganizationsSchemaVersionsWithHttpInfo(String schemaId) throws IOException {
    return getExternalcontactsOrganizationsSchemaVersions(createGetExternalcontactsOrganizationsSchemaVersionsRequest(schemaId).withHttpInfo());
  }

  private GetExternalcontactsOrganizationsSchemaVersionsRequest createGetExternalcontactsOrganizationsSchemaVersionsRequest(String schemaId) {
    return GetExternalcontactsOrganizationsSchemaVersionsRequest.builder()
            .withSchemaId(schemaId)
    
            .build();
  }

  /**
   * Get all versions of an external organization&#39;s schema
   * 
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema getExternalcontactsOrganizationsSchemaVersions(GetExternalcontactsOrganizationsSchemaVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all versions of an external organization&#39;s schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> getExternalcontactsOrganizationsSchemaVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
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
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of schemas.
   * 
   * @return DataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchemaListing getExternalcontactsOrganizationsSchemas() throws IOException, ApiException {
    return  getExternalcontactsOrganizationsSchemas(createGetExternalcontactsOrganizationsSchemasRequest());
  }

  /**
   * Get a list of schemas.
   * 
   * @return DataSchemaListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchemaListing> getExternalcontactsOrganizationsSchemasWithHttpInfo() throws IOException {
    return getExternalcontactsOrganizationsSchemas(createGetExternalcontactsOrganizationsSchemasRequest().withHttpInfo());
  }

  private GetExternalcontactsOrganizationsSchemasRequest createGetExternalcontactsOrganizationsSchemasRequest() {
    return GetExternalcontactsOrganizationsSchemasRequest.builder()
            .build();
  }

  /**
   * Get a list of schemas.
   * 
   * @param request The request object
   * @return DataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchemaListing getExternalcontactsOrganizationsSchemas(GetExternalcontactsOrganizationsSchemasRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchemaListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchemaListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of schemas.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchemaListing> getExternalcontactsOrganizationsSchemas(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchemaListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Scan for external contacts using paging
   * 
   * @param limit The number of contacts per page; must be between 10 and 200, default is 100) (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorContactListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorContactListing getExternalcontactsScanContacts(Integer limit, String cursor) throws IOException, ApiException {
    return  getExternalcontactsScanContacts(createGetExternalcontactsScanContactsRequest(limit, cursor));
  }

  /**
   * Scan for external contacts using paging
   * 
   * @param limit The number of contacts per page; must be between 10 and 200, default is 100) (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorContactListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorContactListing> getExternalcontactsScanContactsWithHttpInfo(Integer limit, String cursor) throws IOException {
    return getExternalcontactsScanContacts(createGetExternalcontactsScanContactsRequest(limit, cursor).withHttpInfo());
  }

  private GetExternalcontactsScanContactsRequest createGetExternalcontactsScanContactsRequest(Integer limit, String cursor) {
    return GetExternalcontactsScanContactsRequest.builder()
            .withLimit(limit)
    
            .withCursor(cursor)
    
            .build();
  }

  /**
   * Scan for external contacts using paging
   * 
   * @param request The request object
   * @return CursorContactListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorContactListing getExternalcontactsScanContacts(GetExternalcontactsScanContactsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CursorContactListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CursorContactListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Scan for external contacts using paging
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorContactListing> getExternalcontactsScanContacts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CursorContactListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CursorContactListing> response = (ApiResponse<CursorContactListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CursorContactListing> response = (ApiResponse<CursorContactListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Scan for notes using paging
   * 
   * @param limit The number of notes per page; must be between 10 and 200, default is 100) (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorNoteListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorNoteListing getExternalcontactsScanNotes(Integer limit, String cursor) throws IOException, ApiException {
    return  getExternalcontactsScanNotes(createGetExternalcontactsScanNotesRequest(limit, cursor));
  }

  /**
   * Scan for notes using paging
   * 
   * @param limit The number of notes per page; must be between 10 and 200, default is 100) (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorNoteListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorNoteListing> getExternalcontactsScanNotesWithHttpInfo(Integer limit, String cursor) throws IOException {
    return getExternalcontactsScanNotes(createGetExternalcontactsScanNotesRequest(limit, cursor).withHttpInfo());
  }

  private GetExternalcontactsScanNotesRequest createGetExternalcontactsScanNotesRequest(Integer limit, String cursor) {
    return GetExternalcontactsScanNotesRequest.builder()
            .withLimit(limit)
    
            .withCursor(cursor)
    
            .build();
  }

  /**
   * Scan for notes using paging
   * 
   * @param request The request object
   * @return CursorNoteListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorNoteListing getExternalcontactsScanNotes(GetExternalcontactsScanNotesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CursorNoteListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CursorNoteListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Scan for notes using paging
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorNoteListing> getExternalcontactsScanNotes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CursorNoteListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CursorNoteListing> response = (ApiResponse<CursorNoteListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CursorNoteListing> response = (ApiResponse<CursorNoteListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Scan for external organizations using paging
   * 
   * @param limit The number of organizations per page; must be between 10 and 200, default is 100) (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorOrganizationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorOrganizationListing getExternalcontactsScanOrganizations(Integer limit, String cursor) throws IOException, ApiException {
    return  getExternalcontactsScanOrganizations(createGetExternalcontactsScanOrganizationsRequest(limit, cursor));
  }

  /**
   * Scan for external organizations using paging
   * 
   * @param limit The number of organizations per page; must be between 10 and 200, default is 100) (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorOrganizationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorOrganizationListing> getExternalcontactsScanOrganizationsWithHttpInfo(Integer limit, String cursor) throws IOException {
    return getExternalcontactsScanOrganizations(createGetExternalcontactsScanOrganizationsRequest(limit, cursor).withHttpInfo());
  }

  private GetExternalcontactsScanOrganizationsRequest createGetExternalcontactsScanOrganizationsRequest(Integer limit, String cursor) {
    return GetExternalcontactsScanOrganizationsRequest.builder()
            .withLimit(limit)
    
            .withCursor(cursor)
    
            .build();
  }

  /**
   * Scan for external organizations using paging
   * 
   * @param request The request object
   * @return CursorOrganizationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorOrganizationListing getExternalcontactsScanOrganizations(GetExternalcontactsScanOrganizationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CursorOrganizationListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CursorOrganizationListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Scan for external organizations using paging
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorOrganizationListing> getExternalcontactsScanOrganizations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CursorOrganizationListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CursorOrganizationListing> response = (ApiResponse<CursorOrganizationListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CursorOrganizationListing> response = (ApiResponse<CursorOrganizationListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Scan for relationships
   * 
   * @param limit The number of relationships per page; must be between 10 and 200, default is 100) (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorRelationshipListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorRelationshipListing getExternalcontactsScanRelationships(Integer limit, String cursor) throws IOException, ApiException {
    return  getExternalcontactsScanRelationships(createGetExternalcontactsScanRelationshipsRequest(limit, cursor));
  }

  /**
   * Scan for relationships
   * 
   * @param limit The number of relationships per page; must be between 10 and 200, default is 100) (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorRelationshipListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorRelationshipListing> getExternalcontactsScanRelationshipsWithHttpInfo(Integer limit, String cursor) throws IOException {
    return getExternalcontactsScanRelationships(createGetExternalcontactsScanRelationshipsRequest(limit, cursor).withHttpInfo());
  }

  private GetExternalcontactsScanRelationshipsRequest createGetExternalcontactsScanRelationshipsRequest(Integer limit, String cursor) {
    return GetExternalcontactsScanRelationshipsRequest.builder()
            .withLimit(limit)
    
            .withCursor(cursor)
    
            .build();
  }

  /**
   * Scan for relationships
   * 
   * @param request The request object
   * @return CursorRelationshipListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorRelationshipListing getExternalcontactsScanRelationships(GetExternalcontactsScanRelationshipsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CursorRelationshipListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CursorRelationshipListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Scan for relationships
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorRelationshipListing> getExternalcontactsScanRelationships(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CursorRelationshipListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CursorRelationshipListing> response = (ApiResponse<CursorRelationshipListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CursorRelationshipListing> response = (ApiResponse<CursorRelationshipListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk fetch contacts
   * 
   * @param body Contact ids (required)
   * @return BulkFetchContactsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchContactsResponse postExternalcontactsBulkContacts(BulkIdsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkContacts(createPostExternalcontactsBulkContactsRequest(body));
  }

  /**
   * Bulk fetch contacts
   * 
   * @param body Contact ids (required)
   * @return BulkFetchContactsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchContactsResponse> postExternalcontactsBulkContactsWithHttpInfo(BulkIdsRequest body) throws IOException {
    return postExternalcontactsBulkContacts(createPostExternalcontactsBulkContactsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkContactsRequest createPostExternalcontactsBulkContactsRequest(BulkIdsRequest body) {
    return PostExternalcontactsBulkContactsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk fetch contacts
   * 
   * @param request The request object
   * @return BulkFetchContactsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchContactsResponse postExternalcontactsBulkContacts(PostExternalcontactsBulkContactsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkFetchContactsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkFetchContactsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk fetch contacts
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchContactsResponse> postExternalcontactsBulkContacts(ApiRequest<BulkIdsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkFetchContactsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkFetchContactsResponse> response = (ApiResponse<BulkFetchContactsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkFetchContactsResponse> response = (ApiResponse<BulkFetchContactsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk add contacts
   * 
   * @param body Contacts (required)
   * @return BulkContactsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkContactsResponse postExternalcontactsBulkContactsAdd(BulkContactsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkContactsAdd(createPostExternalcontactsBulkContactsAddRequest(body));
  }

  /**
   * Bulk add contacts
   * 
   * @param body Contacts (required)
   * @return BulkContactsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkContactsResponse> postExternalcontactsBulkContactsAddWithHttpInfo(BulkContactsRequest body) throws IOException {
    return postExternalcontactsBulkContactsAdd(createPostExternalcontactsBulkContactsAddRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkContactsAddRequest createPostExternalcontactsBulkContactsAddRequest(BulkContactsRequest body) {
    return PostExternalcontactsBulkContactsAddRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk add contacts
   * 
   * @param request The request object
   * @return BulkContactsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkContactsResponse postExternalcontactsBulkContactsAdd(PostExternalcontactsBulkContactsAddRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkContactsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkContactsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk add contacts
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkContactsResponse> postExternalcontactsBulkContactsAdd(ApiRequest<BulkContactsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkContactsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkContactsResponse> response = (ApiResponse<BulkContactsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkContactsResponse> response = (ApiResponse<BulkContactsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk remove contacts
   * 
   * @param body Contact ids (required)
   * @return BulkDeleteResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkDeleteResponse postExternalcontactsBulkContactsRemove(BulkIdsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkContactsRemove(createPostExternalcontactsBulkContactsRemoveRequest(body));
  }

  /**
   * Bulk remove contacts
   * 
   * @param body Contact ids (required)
   * @return BulkDeleteResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkDeleteResponse> postExternalcontactsBulkContactsRemoveWithHttpInfo(BulkIdsRequest body) throws IOException {
    return postExternalcontactsBulkContactsRemove(createPostExternalcontactsBulkContactsRemoveRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkContactsRemoveRequest createPostExternalcontactsBulkContactsRemoveRequest(BulkIdsRequest body) {
    return PostExternalcontactsBulkContactsRemoveRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk remove contacts
   * 
   * @param request The request object
   * @return BulkDeleteResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkDeleteResponse postExternalcontactsBulkContactsRemove(PostExternalcontactsBulkContactsRemoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkDeleteResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkDeleteResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk remove contacts
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkDeleteResponse> postExternalcontactsBulkContactsRemove(ApiRequest<BulkIdsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkDeleteResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk update contacts
   * 
   * @param body Contacts (required)
   * @return BulkContactsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkContactsResponse postExternalcontactsBulkContactsUpdate(BulkContactsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkContactsUpdate(createPostExternalcontactsBulkContactsUpdateRequest(body));
  }

  /**
   * Bulk update contacts
   * 
   * @param body Contacts (required)
   * @return BulkContactsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkContactsResponse> postExternalcontactsBulkContactsUpdateWithHttpInfo(BulkContactsRequest body) throws IOException {
    return postExternalcontactsBulkContactsUpdate(createPostExternalcontactsBulkContactsUpdateRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkContactsUpdateRequest createPostExternalcontactsBulkContactsUpdateRequest(BulkContactsRequest body) {
    return PostExternalcontactsBulkContactsUpdateRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk update contacts
   * 
   * @param request The request object
   * @return BulkContactsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkContactsResponse postExternalcontactsBulkContactsUpdate(PostExternalcontactsBulkContactsUpdateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkContactsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkContactsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk update contacts
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkContactsResponse> postExternalcontactsBulkContactsUpdate(ApiRequest<BulkContactsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkContactsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkContactsResponse> response = (ApiResponse<BulkContactsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkContactsResponse> response = (ApiResponse<BulkContactsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk fetch notes
   * 
   * @param body Note ids (required)
   * @return BulkFetchNotesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchNotesResponse postExternalcontactsBulkNotes(BulkIdsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkNotes(createPostExternalcontactsBulkNotesRequest(body));
  }

  /**
   * Bulk fetch notes
   * 
   * @param body Note ids (required)
   * @return BulkFetchNotesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchNotesResponse> postExternalcontactsBulkNotesWithHttpInfo(BulkIdsRequest body) throws IOException {
    return postExternalcontactsBulkNotes(createPostExternalcontactsBulkNotesRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkNotesRequest createPostExternalcontactsBulkNotesRequest(BulkIdsRequest body) {
    return PostExternalcontactsBulkNotesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk fetch notes
   * 
   * @param request The request object
   * @return BulkFetchNotesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchNotesResponse postExternalcontactsBulkNotes(PostExternalcontactsBulkNotesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkFetchNotesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkFetchNotesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk fetch notes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchNotesResponse> postExternalcontactsBulkNotes(ApiRequest<BulkIdsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkFetchNotesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkFetchNotesResponse> response = (ApiResponse<BulkFetchNotesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkFetchNotesResponse> response = (ApiResponse<BulkFetchNotesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk add notes
   * 
   * @param body Notes (required)
   * @return BulkNotesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkNotesResponse postExternalcontactsBulkNotesAdd(BulkNotesRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkNotesAdd(createPostExternalcontactsBulkNotesAddRequest(body));
  }

  /**
   * Bulk add notes
   * 
   * @param body Notes (required)
   * @return BulkNotesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkNotesResponse> postExternalcontactsBulkNotesAddWithHttpInfo(BulkNotesRequest body) throws IOException {
    return postExternalcontactsBulkNotesAdd(createPostExternalcontactsBulkNotesAddRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkNotesAddRequest createPostExternalcontactsBulkNotesAddRequest(BulkNotesRequest body) {
    return PostExternalcontactsBulkNotesAddRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk add notes
   * 
   * @param request The request object
   * @return BulkNotesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkNotesResponse postExternalcontactsBulkNotesAdd(PostExternalcontactsBulkNotesAddRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkNotesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkNotesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk add notes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkNotesResponse> postExternalcontactsBulkNotesAdd(ApiRequest<BulkNotesRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkNotesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkNotesResponse> response = (ApiResponse<BulkNotesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkNotesResponse> response = (ApiResponse<BulkNotesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk remove notes
   * 
   * @param body Note ids (required)
   * @return BulkDeleteResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkDeleteResponse postExternalcontactsBulkNotesRemove(BulkIdsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkNotesRemove(createPostExternalcontactsBulkNotesRemoveRequest(body));
  }

  /**
   * Bulk remove notes
   * 
   * @param body Note ids (required)
   * @return BulkDeleteResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkDeleteResponse> postExternalcontactsBulkNotesRemoveWithHttpInfo(BulkIdsRequest body) throws IOException {
    return postExternalcontactsBulkNotesRemove(createPostExternalcontactsBulkNotesRemoveRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkNotesRemoveRequest createPostExternalcontactsBulkNotesRemoveRequest(BulkIdsRequest body) {
    return PostExternalcontactsBulkNotesRemoveRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk remove notes
   * 
   * @param request The request object
   * @return BulkDeleteResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkDeleteResponse postExternalcontactsBulkNotesRemove(PostExternalcontactsBulkNotesRemoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkDeleteResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkDeleteResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk remove notes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkDeleteResponse> postExternalcontactsBulkNotesRemove(ApiRequest<BulkIdsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkDeleteResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk update notes
   * 
   * @param body Notes (required)
   * @return BulkNotesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkNotesResponse postExternalcontactsBulkNotesUpdate(BulkNotesRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkNotesUpdate(createPostExternalcontactsBulkNotesUpdateRequest(body));
  }

  /**
   * Bulk update notes
   * 
   * @param body Notes (required)
   * @return BulkNotesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkNotesResponse> postExternalcontactsBulkNotesUpdateWithHttpInfo(BulkNotesRequest body) throws IOException {
    return postExternalcontactsBulkNotesUpdate(createPostExternalcontactsBulkNotesUpdateRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkNotesUpdateRequest createPostExternalcontactsBulkNotesUpdateRequest(BulkNotesRequest body) {
    return PostExternalcontactsBulkNotesUpdateRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk update notes
   * 
   * @param request The request object
   * @return BulkNotesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkNotesResponse postExternalcontactsBulkNotesUpdate(PostExternalcontactsBulkNotesUpdateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkNotesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkNotesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk update notes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkNotesResponse> postExternalcontactsBulkNotesUpdate(ApiRequest<BulkNotesRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkNotesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkNotesResponse> response = (ApiResponse<BulkNotesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkNotesResponse> response = (ApiResponse<BulkNotesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk fetch organizations
   * 
   * @param body Organizations ids (required)
   * @return BulkFetchOrganizationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchOrganizationsResponse postExternalcontactsBulkOrganizations(BulkIdsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkOrganizations(createPostExternalcontactsBulkOrganizationsRequest(body));
  }

  /**
   * Bulk fetch organizations
   * 
   * @param body Organizations ids (required)
   * @return BulkFetchOrganizationsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchOrganizationsResponse> postExternalcontactsBulkOrganizationsWithHttpInfo(BulkIdsRequest body) throws IOException {
    return postExternalcontactsBulkOrganizations(createPostExternalcontactsBulkOrganizationsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkOrganizationsRequest createPostExternalcontactsBulkOrganizationsRequest(BulkIdsRequest body) {
    return PostExternalcontactsBulkOrganizationsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk fetch organizations
   * 
   * @param request The request object
   * @return BulkFetchOrganizationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchOrganizationsResponse postExternalcontactsBulkOrganizations(PostExternalcontactsBulkOrganizationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkFetchOrganizationsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkFetchOrganizationsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk fetch organizations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchOrganizationsResponse> postExternalcontactsBulkOrganizations(ApiRequest<BulkIdsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkFetchOrganizationsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkFetchOrganizationsResponse> response = (ApiResponse<BulkFetchOrganizationsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkFetchOrganizationsResponse> response = (ApiResponse<BulkFetchOrganizationsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk add organizations
   * 
   * @param body Organizations (required)
   * @return BulkOrganizationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkOrganizationsResponse postExternalcontactsBulkOrganizationsAdd(BulkOrganizationsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkOrganizationsAdd(createPostExternalcontactsBulkOrganizationsAddRequest(body));
  }

  /**
   * Bulk add organizations
   * 
   * @param body Organizations (required)
   * @return BulkOrganizationsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkOrganizationsResponse> postExternalcontactsBulkOrganizationsAddWithHttpInfo(BulkOrganizationsRequest body) throws IOException {
    return postExternalcontactsBulkOrganizationsAdd(createPostExternalcontactsBulkOrganizationsAddRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkOrganizationsAddRequest createPostExternalcontactsBulkOrganizationsAddRequest(BulkOrganizationsRequest body) {
    return PostExternalcontactsBulkOrganizationsAddRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk add organizations
   * 
   * @param request The request object
   * @return BulkOrganizationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkOrganizationsResponse postExternalcontactsBulkOrganizationsAdd(PostExternalcontactsBulkOrganizationsAddRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkOrganizationsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkOrganizationsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk add organizations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkOrganizationsResponse> postExternalcontactsBulkOrganizationsAdd(ApiRequest<BulkOrganizationsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkOrganizationsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkOrganizationsResponse> response = (ApiResponse<BulkOrganizationsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkOrganizationsResponse> response = (ApiResponse<BulkOrganizationsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk remove organizations
   * 
   * @param body Organization ids (required)
   * @return BulkDeleteResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkDeleteResponse postExternalcontactsBulkOrganizationsRemove(BulkIdsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkOrganizationsRemove(createPostExternalcontactsBulkOrganizationsRemoveRequest(body));
  }

  /**
   * Bulk remove organizations
   * 
   * @param body Organization ids (required)
   * @return BulkDeleteResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkDeleteResponse> postExternalcontactsBulkOrganizationsRemoveWithHttpInfo(BulkIdsRequest body) throws IOException {
    return postExternalcontactsBulkOrganizationsRemove(createPostExternalcontactsBulkOrganizationsRemoveRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkOrganizationsRemoveRequest createPostExternalcontactsBulkOrganizationsRemoveRequest(BulkIdsRequest body) {
    return PostExternalcontactsBulkOrganizationsRemoveRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk remove organizations
   * 
   * @param request The request object
   * @return BulkDeleteResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkDeleteResponse postExternalcontactsBulkOrganizationsRemove(PostExternalcontactsBulkOrganizationsRemoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkDeleteResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkDeleteResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk remove organizations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkDeleteResponse> postExternalcontactsBulkOrganizationsRemove(ApiRequest<BulkIdsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkDeleteResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk update organizations
   * 
   * @param body Organizations (required)
   * @return BulkOrganizationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkOrganizationsResponse postExternalcontactsBulkOrganizationsUpdate(BulkOrganizationsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkOrganizationsUpdate(createPostExternalcontactsBulkOrganizationsUpdateRequest(body));
  }

  /**
   * Bulk update organizations
   * 
   * @param body Organizations (required)
   * @return BulkOrganizationsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkOrganizationsResponse> postExternalcontactsBulkOrganizationsUpdateWithHttpInfo(BulkOrganizationsRequest body) throws IOException {
    return postExternalcontactsBulkOrganizationsUpdate(createPostExternalcontactsBulkOrganizationsUpdateRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkOrganizationsUpdateRequest createPostExternalcontactsBulkOrganizationsUpdateRequest(BulkOrganizationsRequest body) {
    return PostExternalcontactsBulkOrganizationsUpdateRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk update organizations
   * 
   * @param request The request object
   * @return BulkOrganizationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkOrganizationsResponse postExternalcontactsBulkOrganizationsUpdate(PostExternalcontactsBulkOrganizationsUpdateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkOrganizationsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkOrganizationsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk update organizations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkOrganizationsResponse> postExternalcontactsBulkOrganizationsUpdate(ApiRequest<BulkOrganizationsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkOrganizationsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkOrganizationsResponse> response = (ApiResponse<BulkOrganizationsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkOrganizationsResponse> response = (ApiResponse<BulkOrganizationsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk fetch relationships
   * 
   * @param body Relationships ids (required)
   * @return BulkFetchRelationshipsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchRelationshipsResponse postExternalcontactsBulkRelationships(BulkIdsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkRelationships(createPostExternalcontactsBulkRelationshipsRequest(body));
  }

  /**
   * Bulk fetch relationships
   * 
   * @param body Relationships ids (required)
   * @return BulkFetchRelationshipsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchRelationshipsResponse> postExternalcontactsBulkRelationshipsWithHttpInfo(BulkIdsRequest body) throws IOException {
    return postExternalcontactsBulkRelationships(createPostExternalcontactsBulkRelationshipsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkRelationshipsRequest createPostExternalcontactsBulkRelationshipsRequest(BulkIdsRequest body) {
    return PostExternalcontactsBulkRelationshipsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk fetch relationships
   * 
   * @param request The request object
   * @return BulkFetchRelationshipsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchRelationshipsResponse postExternalcontactsBulkRelationships(PostExternalcontactsBulkRelationshipsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkFetchRelationshipsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkFetchRelationshipsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk fetch relationships
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchRelationshipsResponse> postExternalcontactsBulkRelationships(ApiRequest<BulkIdsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkFetchRelationshipsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkFetchRelationshipsResponse> response = (ApiResponse<BulkFetchRelationshipsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkFetchRelationshipsResponse> response = (ApiResponse<BulkFetchRelationshipsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk add relationships
   * 
   * @param body Relationships (required)
   * @return BulkRelationshipsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkRelationshipsResponse postExternalcontactsBulkRelationshipsAdd(BulkRelationshipsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkRelationshipsAdd(createPostExternalcontactsBulkRelationshipsAddRequest(body));
  }

  /**
   * Bulk add relationships
   * 
   * @param body Relationships (required)
   * @return BulkRelationshipsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkRelationshipsResponse> postExternalcontactsBulkRelationshipsAddWithHttpInfo(BulkRelationshipsRequest body) throws IOException {
    return postExternalcontactsBulkRelationshipsAdd(createPostExternalcontactsBulkRelationshipsAddRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkRelationshipsAddRequest createPostExternalcontactsBulkRelationshipsAddRequest(BulkRelationshipsRequest body) {
    return PostExternalcontactsBulkRelationshipsAddRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk add relationships
   * 
   * @param request The request object
   * @return BulkRelationshipsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkRelationshipsResponse postExternalcontactsBulkRelationshipsAdd(PostExternalcontactsBulkRelationshipsAddRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkRelationshipsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkRelationshipsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk add relationships
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkRelationshipsResponse> postExternalcontactsBulkRelationshipsAdd(ApiRequest<BulkRelationshipsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkRelationshipsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkRelationshipsResponse> response = (ApiResponse<BulkRelationshipsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkRelationshipsResponse> response = (ApiResponse<BulkRelationshipsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk remove relationships
   * 
   * @param body Relationships ids (required)
   * @return BulkDeleteResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkDeleteResponse postExternalcontactsBulkRelationshipsRemove(BulkIdsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkRelationshipsRemove(createPostExternalcontactsBulkRelationshipsRemoveRequest(body));
  }

  /**
   * Bulk remove relationships
   * 
   * @param body Relationships ids (required)
   * @return BulkDeleteResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkDeleteResponse> postExternalcontactsBulkRelationshipsRemoveWithHttpInfo(BulkIdsRequest body) throws IOException {
    return postExternalcontactsBulkRelationshipsRemove(createPostExternalcontactsBulkRelationshipsRemoveRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkRelationshipsRemoveRequest createPostExternalcontactsBulkRelationshipsRemoveRequest(BulkIdsRequest body) {
    return PostExternalcontactsBulkRelationshipsRemoveRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk remove relationships
   * 
   * @param request The request object
   * @return BulkDeleteResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkDeleteResponse postExternalcontactsBulkRelationshipsRemove(PostExternalcontactsBulkRelationshipsRemoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkDeleteResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkDeleteResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk remove relationships
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkDeleteResponse> postExternalcontactsBulkRelationshipsRemove(ApiRequest<BulkIdsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkDeleteResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk update relationships
   * 
   * @param body Relationships (required)
   * @return BulkRelationshipsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkRelationshipsResponse postExternalcontactsBulkRelationshipsUpdate(BulkRelationshipsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkRelationshipsUpdate(createPostExternalcontactsBulkRelationshipsUpdateRequest(body));
  }

  /**
   * Bulk update relationships
   * 
   * @param body Relationships (required)
   * @return BulkRelationshipsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkRelationshipsResponse> postExternalcontactsBulkRelationshipsUpdateWithHttpInfo(BulkRelationshipsRequest body) throws IOException {
    return postExternalcontactsBulkRelationshipsUpdate(createPostExternalcontactsBulkRelationshipsUpdateRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkRelationshipsUpdateRequest createPostExternalcontactsBulkRelationshipsUpdateRequest(BulkRelationshipsRequest body) {
    return PostExternalcontactsBulkRelationshipsUpdateRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk update relationships
   * 
   * @param request The request object
   * @return BulkRelationshipsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkRelationshipsResponse postExternalcontactsBulkRelationshipsUpdate(PostExternalcontactsBulkRelationshipsUpdateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkRelationshipsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkRelationshipsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk update relationships
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkRelationshipsResponse> postExternalcontactsBulkRelationshipsUpdate(ApiRequest<BulkRelationshipsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkRelationshipsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkRelationshipsResponse> response = (ApiResponse<BulkRelationshipsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkRelationshipsResponse> response = (ApiResponse<BulkRelationshipsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a schema
   * 
   * @param body Schema (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema postExternalcontactsContactsSchemas(DataSchema body) throws IOException, ApiException {
    return  postExternalcontactsContactsSchemas(createPostExternalcontactsContactsSchemasRequest(body));
  }

  /**
   * Create a schema
   * 
   * @param body Schema (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> postExternalcontactsContactsSchemasWithHttpInfo(DataSchema body) throws IOException {
    return postExternalcontactsContactsSchemas(createPostExternalcontactsContactsSchemasRequest(body).withHttpInfo());
  }

  private PostExternalcontactsContactsSchemasRequest createPostExternalcontactsContactsSchemasRequest(DataSchema body) {
    return PostExternalcontactsContactsSchemasRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a schema
   * 
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema postExternalcontactsContactsSchemas(PostExternalcontactsContactsSchemasRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> postExternalcontactsContactsSchemas(ApiRequest<DataSchema> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
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
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a schema
   * 
   * @param body Schema (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema postExternalcontactsOrganizationsSchemas(DataSchema body) throws IOException, ApiException {
    return  postExternalcontactsOrganizationsSchemas(createPostExternalcontactsOrganizationsSchemasRequest(body));
  }

  /**
   * Create a schema
   * 
   * @param body Schema (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> postExternalcontactsOrganizationsSchemasWithHttpInfo(DataSchema body) throws IOException {
    return postExternalcontactsOrganizationsSchemas(createPostExternalcontactsOrganizationsSchemasRequest(body).withHttpInfo());
  }

  private PostExternalcontactsOrganizationsSchemasRequest createPostExternalcontactsOrganizationsSchemasRequest(DataSchema body) {
    return PostExternalcontactsOrganizationsSchemasRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a schema
   * 
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema postExternalcontactsOrganizationsSchemas(PostExternalcontactsOrganizationsSchemasRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> postExternalcontactsOrganizationsSchemas(ApiRequest<DataSchema> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
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
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a schema
   * 
   * @param schemaId Schema ID (required)
   * @param body Data Schema (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema putExternalcontactsContactsSchema(String schemaId, DataSchema body) throws IOException, ApiException {
    return  putExternalcontactsContactsSchema(createPutExternalcontactsContactsSchemaRequest(schemaId, body));
  }

  /**
   * Update a schema
   * 
   * @param schemaId Schema ID (required)
   * @param body Data Schema (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> putExternalcontactsContactsSchemaWithHttpInfo(String schemaId, DataSchema body) throws IOException {
    return putExternalcontactsContactsSchema(createPutExternalcontactsContactsSchemaRequest(schemaId, body).withHttpInfo());
  }

  private PutExternalcontactsContactsSchemaRequest createPutExternalcontactsContactsSchemaRequest(String schemaId, DataSchema body) {
    return PutExternalcontactsContactsSchemaRequest.builder()
            .withSchemaId(schemaId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a schema
   * 
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema putExternalcontactsContactsSchema(PutExternalcontactsContactsSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> putExternalcontactsContactsSchema(ApiRequest<DataSchema> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
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
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Associate/disassociate an external contact with a conversation
   * To associate, supply a value for the externalContactId.  To disassociate, do not include the property at all.
   * @param body ConversationAssociation (required)
   * @param conversationId Conversation ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putExternalcontactsConversation(ConversationAssociation body, String conversationId) throws IOException, ApiException {
     putExternalcontactsConversation(createPutExternalcontactsConversationRequest(body, conversationId));
  }

  /**
   * Associate/disassociate an external contact with a conversation
   * To associate, supply a value for the externalContactId.  To disassociate, do not include the property at all.
   * @param body ConversationAssociation (required)
   * @param conversationId Conversation ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putExternalcontactsConversationWithHttpInfo(ConversationAssociation body, String conversationId) throws IOException {
    return putExternalcontactsConversation(createPutExternalcontactsConversationRequest(body, conversationId).withHttpInfo());
  }

  private PutExternalcontactsConversationRequest createPutExternalcontactsConversationRequest(ConversationAssociation body, String conversationId) {
    return PutExternalcontactsConversationRequest.builder()
            .withBody(body)
    
            .withConversationId(conversationId)
    
            .build();
  }

  /**
   * Associate/disassociate an external contact with a conversation
   * To associate, supply a value for the externalContactId.  To disassociate, do not include the property at all.
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
   * Associate/disassociate an external contact with a conversation
   * To associate, supply a value for the externalContactId.  To disassociate, do not include the property at all.
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
   * @return ExternalOrganizationTrustorLink
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganizationTrustorLink putExternalcontactsOrganizationTrustorTrustorId(String externalOrganizationId, String trustorId) throws IOException, ApiException {
    return  putExternalcontactsOrganizationTrustorTrustorId(createPutExternalcontactsOrganizationTrustorTrustorIdRequest(externalOrganizationId, trustorId));
  }

  /**
   * Links a Trustor with an External Organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param trustorId Trustor ID (required)
   * @return ExternalOrganizationTrustorLink
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganizationTrustorLink> putExternalcontactsOrganizationTrustorTrustorIdWithHttpInfo(String externalOrganizationId, String trustorId) throws IOException {
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
   * @return ExternalOrganizationTrustorLink
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganizationTrustorLink putExternalcontactsOrganizationTrustorTrustorId(PutExternalcontactsOrganizationTrustorTrustorIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalOrganizationTrustorLink> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalOrganizationTrustorLink>() {});
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
  public ApiResponse<ExternalOrganizationTrustorLink> putExternalcontactsOrganizationTrustorTrustorId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalOrganizationTrustorLink>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalOrganizationTrustorLink> response = (ApiResponse<ExternalOrganizationTrustorLink>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalOrganizationTrustorLink> response = (ApiResponse<ExternalOrganizationTrustorLink>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a schema
   * 
   * @param schemaId Schema ID (required)
   * @param body Data Schema (required)
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema putExternalcontactsOrganizationsSchema(String schemaId, DataSchema body) throws IOException, ApiException {
    return  putExternalcontactsOrganizationsSchema(createPutExternalcontactsOrganizationsSchemaRequest(schemaId, body));
  }

  /**
   * Update a schema
   * 
   * @param schemaId Schema ID (required)
   * @param body Data Schema (required)
   * @return DataSchema
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> putExternalcontactsOrganizationsSchemaWithHttpInfo(String schemaId, DataSchema body) throws IOException {
    return putExternalcontactsOrganizationsSchema(createPutExternalcontactsOrganizationsSchemaRequest(schemaId, body).withHttpInfo());
  }

  private PutExternalcontactsOrganizationsSchemaRequest createPutExternalcontactsOrganizationsSchemaRequest(String schemaId, DataSchema body) {
    return PutExternalcontactsOrganizationsSchemaRequest.builder()
            .withSchemaId(schemaId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a schema
   * 
   * @param request The request object
   * @return DataSchema
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchema putExternalcontactsOrganizationsSchema(PutExternalcontactsOrganizationsSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataSchema> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataSchema>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchema> putExternalcontactsOrganizationsSchema(ApiRequest<DataSchema> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataSchema>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
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
      ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
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
