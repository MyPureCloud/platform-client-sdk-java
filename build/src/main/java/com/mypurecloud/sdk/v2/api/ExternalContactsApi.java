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
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalcontactsContact(String contactId) throws IOException, ApiException {
    deleteExternalcontactsContactWithHttpInfo(contactId);
  }

  /**
   * Delete an external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteExternalcontactsContactWithHttpInfo(String contactId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactId' when calling deleteExternalcontactsContact");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/contacts/{contactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactId" + "\\}", pcapiClient.escapeString(contactId.toString()));

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
   * Delete an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalcontactsContact(DeleteExternalcontactsContactRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteExternalcontactsContact(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param noteId Note Id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalcontactsContactNote(String contactId, String noteId) throws IOException, ApiException {
    deleteExternalcontactsContactNoteWithHttpInfo(contactId, noteId);
  }

  /**
   * Delete a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param noteId Note Id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteExternalcontactsContactNoteWithHttpInfo(String contactId, String noteId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactId' when calling deleteExternalcontactsContactNote");
    }
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'noteId' when calling deleteExternalcontactsContactNote");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/contacts/{contactId}/notes/{noteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactId" + "\\}", pcapiClient.escapeString(contactId.toString()))
      .replaceAll("\\{" + "noteId" + "\\}", pcapiClient.escapeString(noteId.toString()));

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
   * Delete a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalcontactsContactNote(DeleteExternalcontactsContactNoteRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteExternalcontactsContactNote(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalcontactsOrganization(String externalOrganizationId) throws IOException, ApiException {
    deleteExternalcontactsOrganizationWithHttpInfo(externalOrganizationId);
  }

  /**
   * Delete an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteExternalcontactsOrganizationWithHttpInfo(String externalOrganizationId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'externalOrganizationId' is set
    if (externalOrganizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'externalOrganizationId' when calling deleteExternalcontactsOrganization");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/organizations/{externalOrganizationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalOrganizationId" + "\\}", pcapiClient.escapeString(externalOrganizationId.toString()));

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
   * Delete an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalcontactsOrganization(DeleteExternalcontactsOrganizationRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteExternalcontactsOrganization(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param noteId Note Id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalcontactsOrganizationNote(String externalOrganizationId, String noteId) throws IOException, ApiException {
    deleteExternalcontactsOrganizationNoteWithHttpInfo(externalOrganizationId, noteId);
  }

  /**
   * Delete a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param noteId Note Id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteExternalcontactsOrganizationNoteWithHttpInfo(String externalOrganizationId, String noteId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'externalOrganizationId' is set
    if (externalOrganizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'externalOrganizationId' when calling deleteExternalcontactsOrganizationNote");
    }
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'noteId' when calling deleteExternalcontactsOrganizationNote");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalOrganizationId" + "\\}", pcapiClient.escapeString(externalOrganizationId.toString()))
      .replaceAll("\\{" + "noteId" + "\\}", pcapiClient.escapeString(noteId.toString()));

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
   * Delete a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalcontactsOrganizationNote(DeleteExternalcontactsOrganizationNoteRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteExternalcontactsOrganizationNote(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete a relationship
   * 
   * @param relationshipId Relationship Id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalcontactsRelationship(String relationshipId) throws IOException, ApiException {
    deleteExternalcontactsRelationshipWithHttpInfo(relationshipId);
  }

  /**
   * Delete a relationship
   * 
   * @param relationshipId Relationship Id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteExternalcontactsRelationshipWithHttpInfo(String relationshipId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'relationshipId' is set
    if (relationshipId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'relationshipId' when calling deleteExternalcontactsRelationship");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/relationships/{relationshipId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "relationshipId" + "\\}", pcapiClient.escapeString(relationshipId.toString()));

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
   * Delete a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteExternalcontactsRelationship(DeleteExternalcontactsRelationshipRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteExternalcontactsRelationship(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Fetch an external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @param expand which fields, if any, to expand (externalOrganization,externalDataSources) (optional)
   * @return ExternalContact
   * @throws ApiException if fails to make API call
   */
  public ExternalContact getExternalcontactsContact(String contactId, List<String> expand) throws IOException, ApiException {
    return getExternalcontactsContactWithHttpInfo(contactId, expand).getBody();
  }

  /**
   * Fetch an external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @param expand which fields, if any, to expand (externalOrganization,externalDataSources) (optional)
   * @return ExternalContact
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalContact> getExternalcontactsContactWithHttpInfo(String contactId, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactId' when calling getExternalcontactsContact");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/contacts/{contactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactId" + "\\}", pcapiClient.escapeString(contactId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExternalContact>() {});
  }

  /**
   * Fetch an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExternalContact getExternalcontactsContact(GetExternalcontactsContactRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExternalContact>() {});
  }

  /**
   * Fetch an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalContact> getExternalcontactsContact(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ExternalContact>invokeAPIVerbose(request, new TypeReference<ExternalContact>() {});
  }

  /**
   * Fetch a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param noteId Note Id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return Note
   * @throws ApiException if fails to make API call
   */
  public Note getExternalcontactsContactNote(String contactId, String noteId, List<String> expand) throws IOException, ApiException {
    return getExternalcontactsContactNoteWithHttpInfo(contactId, noteId, expand).getBody();
  }

  /**
   * Fetch a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param noteId Note Id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return Note
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Note> getExternalcontactsContactNoteWithHttpInfo(String contactId, String noteId, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactId' when calling getExternalcontactsContactNote");
    }
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'noteId' when calling getExternalcontactsContactNote");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/contacts/{contactId}/notes/{noteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactId" + "\\}", pcapiClient.escapeString(contactId.toString()))
      .replaceAll("\\{" + "noteId" + "\\}", pcapiClient.escapeString(noteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Note>() {});
  }

  /**
   * Fetch a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Note getExternalcontactsContactNote(GetExternalcontactsContactNoteRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Note>() {});
  }

  /**
   * Fetch a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Note> getExternalcontactsContactNote(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Note>invokeAPIVerbose(request, new TypeReference<Note>() {});
  }

  /**
   * List notes for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param pageSize Page size (optional, default to 20)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return NoteListing
   * @throws ApiException if fails to make API call
   */
  public NoteListing getExternalcontactsContactNotes(String contactId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException, ApiException {
    return getExternalcontactsContactNotesWithHttpInfo(contactId, pageSize, pageNumber, sortOrder, expand).getBody();
  }

  /**
   * List notes for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param pageSize Page size (optional, default to 20)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return NoteListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NoteListing> getExternalcontactsContactNotesWithHttpInfo(String contactId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactId' when calling getExternalcontactsContactNotes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/contacts/{contactId}/notes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactId" + "\\}", pcapiClient.escapeString(contactId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<NoteListing>() {});
  }

  /**
   * List notes for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public NoteListing getExternalcontactsContactNotes(GetExternalcontactsContactNotesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<NoteListing>() {});
  }

  /**
   * List notes for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NoteListing> getExternalcontactsContactNotes(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<NoteListing>invokeAPIVerbose(request, new TypeReference<NoteListing>() {});
  }

  /**
   * Search for external contacts
   * 
   * @param pageSize Page size (optional, default to 20)
   * @param pageNumber Page number (optional, default to 1)
   * @param q User supplied search keywords (no special syntax is currently supported) (optional)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return ContactListing
   * @throws ApiException if fails to make API call
   */
  public ContactListing getExternalcontactsContacts(Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand) throws IOException, ApiException {
    return getExternalcontactsContactsWithHttpInfo(pageSize, pageNumber, q, sortOrder, expand).getBody();
  }

  /**
   * Search for external contacts
   * 
   * @param pageSize Page size (optional, default to 20)
   * @param pageNumber Page number (optional, default to 1)
   * @param q User supplied search keywords (no special syntax is currently supported) (optional)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return ContactListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactListing> getExternalcontactsContactsWithHttpInfo(Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/contacts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q", q));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ContactListing>() {});
  }

  /**
   * Search for external contacts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ContactListing getExternalcontactsContacts(GetExternalcontactsContactsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ContactListing>() {});
  }

  /**
   * Search for external contacts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactListing> getExternalcontactsContacts(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ContactListing>invokeAPIVerbose(request, new TypeReference<ContactListing>() {});
  }

  /**
   * Fetch an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param expand which fields, if any, to expand (externalDataSources) (optional)
   * @return ExternalOrganization
   * @throws ApiException if fails to make API call
   */
  public ExternalOrganization getExternalcontactsOrganization(String externalOrganizationId, List<String> expand) throws IOException, ApiException {
    return getExternalcontactsOrganizationWithHttpInfo(externalOrganizationId, expand).getBody();
  }

  /**
   * Fetch an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param expand which fields, if any, to expand (externalDataSources) (optional)
   * @return ExternalOrganization
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalOrganization> getExternalcontactsOrganizationWithHttpInfo(String externalOrganizationId, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'externalOrganizationId' is set
    if (externalOrganizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'externalOrganizationId' when calling getExternalcontactsOrganization");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/organizations/{externalOrganizationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalOrganizationId" + "\\}", pcapiClient.escapeString(externalOrganizationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExternalOrganization>() {});
  }

  /**
   * Fetch an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExternalOrganization getExternalcontactsOrganization(GetExternalcontactsOrganizationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {});
  }

  /**
   * Fetch an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalOrganization> getExternalcontactsOrganization(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ExternalOrganization>invokeAPIVerbose(request, new TypeReference<ExternalOrganization>() {});
  }

  /**
   * Search for external contacts in an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param pageSize Page size (optional, default to 20)
   * @param pageNumber Page number (optional, default to 1)
   * @param q User supplied search keywords (no special syntax is currently supported) (optional)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (externalOrganization) (optional)
   * @return ContactListing
   * @throws ApiException if fails to make API call
   */
  public ContactListing getExternalcontactsOrganizationContacts(String externalOrganizationId, Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand) throws IOException, ApiException {
    return getExternalcontactsOrganizationContactsWithHttpInfo(externalOrganizationId, pageSize, pageNumber, q, sortOrder, expand).getBody();
  }

  /**
   * Search for external contacts in an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param pageSize Page size (optional, default to 20)
   * @param pageNumber Page number (optional, default to 1)
   * @param q User supplied search keywords (no special syntax is currently supported) (optional)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (externalOrganization) (optional)
   * @return ContactListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactListing> getExternalcontactsOrganizationContactsWithHttpInfo(String externalOrganizationId, Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'externalOrganizationId' is set
    if (externalOrganizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'externalOrganizationId' when calling getExternalcontactsOrganizationContacts");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/organizations/{externalOrganizationId}/contacts".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalOrganizationId" + "\\}", pcapiClient.escapeString(externalOrganizationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q", q));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ContactListing>() {});
  }

  /**
   * Search for external contacts in an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ContactListing getExternalcontactsOrganizationContacts(GetExternalcontactsOrganizationContactsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ContactListing>() {});
  }

  /**
   * Search for external contacts in an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactListing> getExternalcontactsOrganizationContacts(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ContactListing>invokeAPIVerbose(request, new TypeReference<ContactListing>() {});
  }

  /**
   * Fetch a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param noteId Note Id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return Note
   * @throws ApiException if fails to make API call
   */
  public Note getExternalcontactsOrganizationNote(String externalOrganizationId, String noteId, List<String> expand) throws IOException, ApiException {
    return getExternalcontactsOrganizationNoteWithHttpInfo(externalOrganizationId, noteId, expand).getBody();
  }

  /**
   * Fetch a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param noteId Note Id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return Note
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Note> getExternalcontactsOrganizationNoteWithHttpInfo(String externalOrganizationId, String noteId, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'externalOrganizationId' is set
    if (externalOrganizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'externalOrganizationId' when calling getExternalcontactsOrganizationNote");
    }
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'noteId' when calling getExternalcontactsOrganizationNote");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalOrganizationId" + "\\}", pcapiClient.escapeString(externalOrganizationId.toString()))
      .replaceAll("\\{" + "noteId" + "\\}", pcapiClient.escapeString(noteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Note>() {});
  }

  /**
   * Fetch a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Note getExternalcontactsOrganizationNote(GetExternalcontactsOrganizationNoteRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Note>() {});
  }

  /**
   * Fetch a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Note> getExternalcontactsOrganizationNote(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Note>invokeAPIVerbose(request, new TypeReference<Note>() {});
  }

  /**
   * List notes for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param pageSize Page size (optional, default to 20)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return NoteListing
   * @throws ApiException if fails to make API call
   */
  public NoteListing getExternalcontactsOrganizationNotes(String externalOrganizationId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException, ApiException {
    return getExternalcontactsOrganizationNotesWithHttpInfo(externalOrganizationId, pageSize, pageNumber, sortOrder, expand).getBody();
  }

  /**
   * List notes for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param pageSize Page size (optional, default to 20)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return NoteListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NoteListing> getExternalcontactsOrganizationNotesWithHttpInfo(String externalOrganizationId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'externalOrganizationId' is set
    if (externalOrganizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'externalOrganizationId' when calling getExternalcontactsOrganizationNotes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/organizations/{externalOrganizationId}/notes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalOrganizationId" + "\\}", pcapiClient.escapeString(externalOrganizationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<NoteListing>() {});
  }

  /**
   * List notes for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public NoteListing getExternalcontactsOrganizationNotes(GetExternalcontactsOrganizationNotesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<NoteListing>() {});
  }

  /**
   * List notes for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NoteListing> getExternalcontactsOrganizationNotes(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<NoteListing>invokeAPIVerbose(request, new TypeReference<NoteListing>() {});
  }

  /**
   * Fetch a relationship for an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param pageSize Page size (optional, default to 20)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand which fields, if any, to expand (optional)
   * @param sortOrder Sort order (optional)
   * @return RelationshipListing
   * @throws ApiException if fails to make API call
   */
  public RelationshipListing getExternalcontactsOrganizationRelationships(String externalOrganizationId, Integer pageSize, Integer pageNumber, String expand, String sortOrder) throws IOException, ApiException {
    return getExternalcontactsOrganizationRelationshipsWithHttpInfo(externalOrganizationId, pageSize, pageNumber, expand, sortOrder).getBody();
  }

  /**
   * Fetch a relationship for an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param pageSize Page size (optional, default to 20)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand which fields, if any, to expand (optional)
   * @param sortOrder Sort order (optional)
   * @return RelationshipListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RelationshipListing> getExternalcontactsOrganizationRelationshipsWithHttpInfo(String externalOrganizationId, Integer pageSize, Integer pageNumber, String expand, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'externalOrganizationId' is set
    if (externalOrganizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'externalOrganizationId' when calling getExternalcontactsOrganizationRelationships");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/organizations/{externalOrganizationId}/relationships".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalOrganizationId" + "\\}", pcapiClient.escapeString(externalOrganizationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RelationshipListing>() {});
  }

  /**
   * Fetch a relationship for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RelationshipListing getExternalcontactsOrganizationRelationships(GetExternalcontactsOrganizationRelationshipsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RelationshipListing>() {});
  }

  /**
   * Fetch a relationship for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RelationshipListing> getExternalcontactsOrganizationRelationships(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<RelationshipListing>invokeAPIVerbose(request, new TypeReference<RelationshipListing>() {});
  }

  /**
   * Search for external organizations
   * 
   * @param pageSize Page size (optional, default to 20)
   * @param pageNumber Page number (optional, default to 1)
   * @param q Search query (optional)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return ExternalOrganizationListing
   * @throws ApiException if fails to make API call
   */
  public ExternalOrganizationListing getExternalcontactsOrganizations(Integer pageSize, Integer pageNumber, String q, String sortOrder, String expand) throws IOException, ApiException {
    return getExternalcontactsOrganizationsWithHttpInfo(pageSize, pageNumber, q, sortOrder, expand).getBody();
  }

  /**
   * Search for external organizations
   * 
   * @param pageSize Page size (optional, default to 20)
   * @param pageNumber Page number (optional, default to 1)
   * @param q Search query (optional)
   * @param sortOrder Sort order (optional)
   * @param expand which fields, if any, to expand (optional)
   * @return ExternalOrganizationListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalOrganizationListing> getExternalcontactsOrganizationsWithHttpInfo(Integer pageSize, Integer pageNumber, String q, String sortOrder, String expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/organizations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q", q));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExternalOrganizationListing>() {});
  }

  /**
   * Search for external organizations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExternalOrganizationListing getExternalcontactsOrganizations(GetExternalcontactsOrganizationsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExternalOrganizationListing>() {});
  }

  /**
   * Search for external organizations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalOrganizationListing> getExternalcontactsOrganizations(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ExternalOrganizationListing>invokeAPIVerbose(request, new TypeReference<ExternalOrganizationListing>() {});
  }

  /**
   * Fetch a relationship
   * 
   * @param relationshipId Relationship Id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return Relationship
   * @throws ApiException if fails to make API call
   */
  public Relationship getExternalcontactsRelationship(String relationshipId, String expand) throws IOException, ApiException {
    return getExternalcontactsRelationshipWithHttpInfo(relationshipId, expand).getBody();
  }

  /**
   * Fetch a relationship
   * 
   * @param relationshipId Relationship Id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return Relationship
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Relationship> getExternalcontactsRelationshipWithHttpInfo(String relationshipId, String expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'relationshipId' is set
    if (relationshipId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'relationshipId' when calling getExternalcontactsRelationship");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/relationships/{relationshipId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "relationshipId" + "\\}", pcapiClient.escapeString(relationshipId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Relationship>() {});
  }

  /**
   * Fetch a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Relationship getExternalcontactsRelationship(GetExternalcontactsRelationshipRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Relationship>() {});
  }

  /**
   * Fetch a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Relationship> getExternalcontactsRelationship(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Relationship>invokeAPIVerbose(request, new TypeReference<Relationship>() {});
  }

  /**
   * Lookup contacts and externalOrganizations based on an attribute
   * 
   * @param lookupVal User supplied value to lookup contacts/externalOrganizations (supports email addresses, e164 phone numbers, Twitter screen names) (required)
   * @param expand which field, if any, to expand (optional)
   * @return ReverseWhitepagesLookupResult
   * @throws ApiException if fails to make API call
   */
  public ReverseWhitepagesLookupResult getExternalcontactsReversewhitepageslookup(String lookupVal, List<String> expand) throws IOException, ApiException {
    return getExternalcontactsReversewhitepageslookupWithHttpInfo(lookupVal, expand).getBody();
  }

  /**
   * Lookup contacts and externalOrganizations based on an attribute
   * 
   * @param lookupVal User supplied value to lookup contacts/externalOrganizations (supports email addresses, e164 phone numbers, Twitter screen names) (required)
   * @param expand which field, if any, to expand (optional)
   * @return ReverseWhitepagesLookupResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReverseWhitepagesLookupResult> getExternalcontactsReversewhitepageslookupWithHttpInfo(String lookupVal, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'lookupVal' is set
    if (lookupVal == null) {
      throw new IllegalArgumentException("Missing the required parameter 'lookupVal' when calling getExternalcontactsReversewhitepageslookup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/reversewhitepageslookup".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "lookupVal", lookupVal));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ReverseWhitepagesLookupResult>() {});
  }

  /**
   * Lookup contacts and externalOrganizations based on an attribute
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ReverseWhitepagesLookupResult getExternalcontactsReversewhitepageslookup(GetExternalcontactsReversewhitepageslookupRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ReverseWhitepagesLookupResult>() {});
  }

  /**
   * Lookup contacts and externalOrganizations based on an attribute
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReverseWhitepagesLookupResult> getExternalcontactsReversewhitepageslookup(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ReverseWhitepagesLookupResult>invokeAPIVerbose(request, new TypeReference<ReverseWhitepagesLookupResult>() {});
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @param contactId ExternalContact ID (required)
   * @param body ConversationAssociation (optional)
   * @throws ApiException if fails to make API call
   */
  public void postExternalcontactsContactAssociateconversation(String contactId, ConversationAssociation body) throws IOException, ApiException {
    postExternalcontactsContactAssociateconversationWithHttpInfo(contactId, body);
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @param contactId ExternalContact ID (required)
   * @param body ConversationAssociation (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postExternalcontactsContactAssociateconversationWithHttpInfo(String contactId, ConversationAssociation body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactId' when calling postExternalcontactsContactAssociateconversation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/contacts/{contactId}/associateconversation".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactId" + "\\}", pcapiClient.escapeString(contactId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postExternalcontactsContactAssociateconversation(PostExternalcontactsContactAssociateconversationRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postExternalcontactsContactAssociateconversation(ApiRequest<ConversationAssociation> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Create a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param body ExternalContact (optional)
   * @return Note
   * @throws ApiException if fails to make API call
   */
  public Note postExternalcontactsContactNotes(String contactId, Note body) throws IOException, ApiException {
    return postExternalcontactsContactNotesWithHttpInfo(contactId, body).getBody();
  }

  /**
   * Create a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param body ExternalContact (optional)
   * @return Note
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Note> postExternalcontactsContactNotesWithHttpInfo(String contactId, Note body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactId' when calling postExternalcontactsContactNotes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/contacts/{contactId}/notes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactId" + "\\}", pcapiClient.escapeString(contactId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Note>() {});
  }

  /**
   * Create a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Note postExternalcontactsContactNotes(PostExternalcontactsContactNotesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Note>() {});
  }

  /**
   * Create a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Note> postExternalcontactsContactNotes(ApiRequest<Note> request) throws IOException, ApiException {
    return pcapiClient.<Note>invokeAPIVerbose(request, new TypeReference<Note>() {});
  }

  /**
   * Create an external contact
   * 
   * @param body ExternalContact (optional)
   * @return ExternalContact
   * @throws ApiException if fails to make API call
   */
  public ExternalContact postExternalcontactsContacts(ExternalContact body) throws IOException, ApiException {
    return postExternalcontactsContactsWithHttpInfo(body).getBody();
  }

  /**
   * Create an external contact
   * 
   * @param body ExternalContact (optional)
   * @return ExternalContact
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalContact> postExternalcontactsContactsWithHttpInfo(ExternalContact body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/contacts".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExternalContact>() {});
  }

  /**
   * Create an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExternalContact postExternalcontactsContacts(PostExternalcontactsContactsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExternalContact>() {});
  }

  /**
   * Create an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalContact> postExternalcontactsContacts(ApiRequest<ExternalContact> request) throws IOException, ApiException {
    return pcapiClient.<ExternalContact>invokeAPIVerbose(request, new TypeReference<ExternalContact>() {});
  }

  /**
   * Create a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param body ExternalContact (optional)
   * @return Note
   * @throws ApiException if fails to make API call
   */
  public Note postExternalcontactsOrganizationNotes(String externalOrganizationId, Note body) throws IOException, ApiException {
    return postExternalcontactsOrganizationNotesWithHttpInfo(externalOrganizationId, body).getBody();
  }

  /**
   * Create a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param body ExternalContact (optional)
   * @return Note
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Note> postExternalcontactsOrganizationNotesWithHttpInfo(String externalOrganizationId, Note body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'externalOrganizationId' is set
    if (externalOrganizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'externalOrganizationId' when calling postExternalcontactsOrganizationNotes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/organizations/{externalOrganizationId}/notes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalOrganizationId" + "\\}", pcapiClient.escapeString(externalOrganizationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Note>() {});
  }

  /**
   * Create a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Note postExternalcontactsOrganizationNotes(PostExternalcontactsOrganizationNotesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Note>() {});
  }

  /**
   * Create a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Note> postExternalcontactsOrganizationNotes(ApiRequest<Note> request) throws IOException, ApiException {
    return pcapiClient.<Note>invokeAPIVerbose(request, new TypeReference<Note>() {});
  }

  /**
   * Create an external organization
   * 
   * @param body ExternalOrganization (optional)
   * @return ExternalOrganization
   * @throws ApiException if fails to make API call
   */
  public ExternalOrganization postExternalcontactsOrganizations(ExternalOrganization body) throws IOException, ApiException {
    return postExternalcontactsOrganizationsWithHttpInfo(body).getBody();
  }

  /**
   * Create an external organization
   * 
   * @param body ExternalOrganization (optional)
   * @return ExternalOrganization
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalOrganization> postExternalcontactsOrganizationsWithHttpInfo(ExternalOrganization body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/organizations".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExternalOrganization>() {});
  }

  /**
   * Create an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExternalOrganization postExternalcontactsOrganizations(PostExternalcontactsOrganizationsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {});
  }

  /**
   * Create an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalOrganization> postExternalcontactsOrganizations(ApiRequest<ExternalOrganization> request) throws IOException, ApiException {
    return pcapiClient.<ExternalOrganization>invokeAPIVerbose(request, new TypeReference<ExternalOrganization>() {});
  }

  /**
   * Create a relationship
   * 
   * @param body Relationship (optional)
   * @return Relationship
   * @throws ApiException if fails to make API call
   */
  public Relationship postExternalcontactsRelationships(Relationship body) throws IOException, ApiException {
    return postExternalcontactsRelationshipsWithHttpInfo(body).getBody();
  }

  /**
   * Create a relationship
   * 
   * @param body Relationship (optional)
   * @return Relationship
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Relationship> postExternalcontactsRelationshipsWithHttpInfo(Relationship body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/relationships".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Relationship>() {});
  }

  /**
   * Create a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Relationship postExternalcontactsRelationships(PostExternalcontactsRelationshipsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Relationship>() {});
  }

  /**
   * Create a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Relationship> postExternalcontactsRelationships(ApiRequest<Relationship> request) throws IOException, ApiException {
    return pcapiClient.<Relationship>invokeAPIVerbose(request, new TypeReference<Relationship>() {});
  }

  /**
   * Update an external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @param body ExternalContact (optional)
   * @return ExternalContact
   * @throws ApiException if fails to make API call
   */
  public ExternalContact putExternalcontactsContact(String contactId, ExternalContact body) throws IOException, ApiException {
    return putExternalcontactsContactWithHttpInfo(contactId, body).getBody();
  }

  /**
   * Update an external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @param body ExternalContact (optional)
   * @return ExternalContact
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalContact> putExternalcontactsContactWithHttpInfo(String contactId, ExternalContact body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactId' when calling putExternalcontactsContact");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/contacts/{contactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactId" + "\\}", pcapiClient.escapeString(contactId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExternalContact>() {});
  }

  /**
   * Update an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExternalContact putExternalcontactsContact(PutExternalcontactsContactRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExternalContact>() {});
  }

  /**
   * Update an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalContact> putExternalcontactsContact(ApiRequest<ExternalContact> request) throws IOException, ApiException {
    return pcapiClient.<ExternalContact>invokeAPIVerbose(request, new TypeReference<ExternalContact>() {});
  }

  /**
   * Update a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param noteId Note Id (required)
   * @param body Note (optional)
   * @return Note
   * @throws ApiException if fails to make API call
   */
  public Note putExternalcontactsContactNote(String contactId, String noteId, Note body) throws IOException, ApiException {
    return putExternalcontactsContactNoteWithHttpInfo(contactId, noteId, body).getBody();
  }

  /**
   * Update a note for an external contact
   * 
   * @param contactId ExternalContact Id (required)
   * @param noteId Note Id (required)
   * @param body Note (optional)
   * @return Note
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Note> putExternalcontactsContactNoteWithHttpInfo(String contactId, String noteId, Note body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactId' when calling putExternalcontactsContactNote");
    }
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'noteId' when calling putExternalcontactsContactNote");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/contacts/{contactId}/notes/{noteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactId" + "\\}", pcapiClient.escapeString(contactId.toString()))
      .replaceAll("\\{" + "noteId" + "\\}", pcapiClient.escapeString(noteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Note>() {});
  }

  /**
   * Update a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Note putExternalcontactsContactNote(PutExternalcontactsContactNoteRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Note>() {});
  }

  /**
   * Update a note for an external contact
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Note> putExternalcontactsContactNote(ApiRequest<Note> request) throws IOException, ApiException {
    return pcapiClient.<Note>invokeAPIVerbose(request, new TypeReference<Note>() {});
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @param conversationId Conversation ID (required)
   * @param body ConversationAssociation (optional)
   * @throws ApiException if fails to make API call
   */
  public void putExternalcontactsConversation(String conversationId, ConversationAssociation body) throws IOException, ApiException {
    putExternalcontactsConversationWithHttpInfo(conversationId, body);
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @param conversationId Conversation ID (required)
   * @param body ConversationAssociation (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putExternalcontactsConversationWithHttpInfo(String conversationId, ConversationAssociation body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'conversationId' when calling putExternalcontactsConversation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/conversations/{conversationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void putExternalcontactsConversation(PutExternalcontactsConversationRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Associate an external contact with a conversation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putExternalcontactsConversation(ApiRequest<ConversationAssociation> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Update an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param body ExternalOrganization (optional)
   * @return ExternalOrganization
   * @throws ApiException if fails to make API call
   */
  public ExternalOrganization putExternalcontactsOrganization(String externalOrganizationId, ExternalOrganization body) throws IOException, ApiException {
    return putExternalcontactsOrganizationWithHttpInfo(externalOrganizationId, body).getBody();
  }

  /**
   * Update an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param body ExternalOrganization (optional)
   * @return ExternalOrganization
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalOrganization> putExternalcontactsOrganizationWithHttpInfo(String externalOrganizationId, ExternalOrganization body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'externalOrganizationId' is set
    if (externalOrganizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'externalOrganizationId' when calling putExternalcontactsOrganization");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/organizations/{externalOrganizationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalOrganizationId" + "\\}", pcapiClient.escapeString(externalOrganizationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExternalOrganization>() {});
  }

  /**
   * Update an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExternalOrganization putExternalcontactsOrganization(PutExternalcontactsOrganizationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {});
  }

  /**
   * Update an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExternalOrganization> putExternalcontactsOrganization(ApiRequest<ExternalOrganization> request) throws IOException, ApiException {
    return pcapiClient.<ExternalOrganization>invokeAPIVerbose(request, new TypeReference<ExternalOrganization>() {});
  }

  /**
   * Update a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param noteId Note Id (required)
   * @param body Note (optional)
   * @return Note
   * @throws ApiException if fails to make API call
   */
  public Note putExternalcontactsOrganizationNote(String externalOrganizationId, String noteId, Note body) throws IOException, ApiException {
    return putExternalcontactsOrganizationNoteWithHttpInfo(externalOrganizationId, noteId, body).getBody();
  }

  /**
   * Update a note for an external organization
   * 
   * @param externalOrganizationId External Organization Id (required)
   * @param noteId Note Id (required)
   * @param body Note (optional)
   * @return Note
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Note> putExternalcontactsOrganizationNoteWithHttpInfo(String externalOrganizationId, String noteId, Note body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'externalOrganizationId' is set
    if (externalOrganizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'externalOrganizationId' when calling putExternalcontactsOrganizationNote");
    }
    
    // verify the required parameter 'noteId' is set
    if (noteId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'noteId' when calling putExternalcontactsOrganizationNote");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "externalOrganizationId" + "\\}", pcapiClient.escapeString(externalOrganizationId.toString()))
      .replaceAll("\\{" + "noteId" + "\\}", pcapiClient.escapeString(noteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Note>() {});
  }

  /**
   * Update a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Note putExternalcontactsOrganizationNote(PutExternalcontactsOrganizationNoteRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Note>() {});
  }

  /**
   * Update a note for an external organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Note> putExternalcontactsOrganizationNote(ApiRequest<Note> request) throws IOException, ApiException {
    return pcapiClient.<Note>invokeAPIVerbose(request, new TypeReference<Note>() {});
  }

  /**
   * Update a relationship
   * 
   * @param relationshipId Relationship Id (required)
   * @param body Relationship (optional)
   * @return Relationship
   * @throws ApiException if fails to make API call
   */
  public Relationship putExternalcontactsRelationship(String relationshipId, Relationship body) throws IOException, ApiException {
    return putExternalcontactsRelationshipWithHttpInfo(relationshipId, body).getBody();
  }

  /**
   * Update a relationship
   * 
   * @param relationshipId Relationship Id (required)
   * @param body Relationship (optional)
   * @return Relationship
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Relationship> putExternalcontactsRelationshipWithHttpInfo(String relationshipId, Relationship body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'relationshipId' is set
    if (relationshipId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'relationshipId' when calling putExternalcontactsRelationship");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/externalcontacts/relationships/{relationshipId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "relationshipId" + "\\}", pcapiClient.escapeString(relationshipId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Relationship>() {});
  }

  /**
   * Update a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Relationship putExternalcontactsRelationship(PutExternalcontactsRelationshipRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Relationship>() {});
  }

  /**
   * Update a relationship
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Relationship> putExternalcontactsRelationship(ApiRequest<Relationship> request) throws IOException, ApiException {
    return pcapiClient.<Relationship>invokeAPIVerbose(request, new TypeReference<Relationship>() {});
  }

}
