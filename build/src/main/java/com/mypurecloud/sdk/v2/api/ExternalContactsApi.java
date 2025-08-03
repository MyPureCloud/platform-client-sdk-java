package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.BulkContactsEnrichRequest;
import com.mypurecloud.sdk.v2.model.BulkContactsEnrichResponse;
import com.mypurecloud.sdk.v2.model.BulkContactsRequest;
import com.mypurecloud.sdk.v2.model.BulkContactsResponse;
import com.mypurecloud.sdk.v2.model.BulkDeleteResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchContactsResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchNotesResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchOrganizationsResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchRelationshipsResponse;
import com.mypurecloud.sdk.v2.model.BulkIdsRequest;
import com.mypurecloud.sdk.v2.model.BulkNotesRequest;
import com.mypurecloud.sdk.v2.model.BulkNotesResponse;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsEnrichRequest;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsEnrichResponse;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsRequest;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsResponse;
import com.mypurecloud.sdk.v2.model.BulkRelationshipsRequest;
import com.mypurecloud.sdk.v2.model.BulkRelationshipsResponse;
import com.mypurecloud.sdk.v2.model.ContactEnrichRequest;
import com.mypurecloud.sdk.v2.model.ContactIdentifier;
import com.mypurecloud.sdk.v2.model.ContactIdentifierListing;
import com.mypurecloud.sdk.v2.model.ContactImportJobEntityListing;
import com.mypurecloud.sdk.v2.model.ContactImportJobRequest;
import com.mypurecloud.sdk.v2.model.ContactImportJobResponse;
import com.mypurecloud.sdk.v2.model.ContactImportJobStatusUpdateRequest;
import com.mypurecloud.sdk.v2.model.ContactImportJobStatusUpdateResponse;
import com.mypurecloud.sdk.v2.model.ContactImportSettings;
import com.mypurecloud.sdk.v2.model.ContactImportSettingsEntityListing;
import com.mypurecloud.sdk.v2.model.ContactListing;
import com.mypurecloud.sdk.v2.model.ContactsExport;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CoretypeListing;
import com.mypurecloud.sdk.v2.model.CsvJobRequest;
import com.mypurecloud.sdk.v2.model.CsvJobResponse;
import com.mypurecloud.sdk.v2.model.CsvSettings;
import com.mypurecloud.sdk.v2.model.CsvUploadDetailsResponse;
import com.mypurecloud.sdk.v2.model.CsvUploadPreviewResponse;
import com.mypurecloud.sdk.v2.model.CsvUploadRequest;
import com.mypurecloud.sdk.v2.model.CsvUploadResponse;
import com.mypurecloud.sdk.v2.model.CursorContactListing;
import com.mypurecloud.sdk.v2.model.CursorExternalSourceListing;
import com.mypurecloud.sdk.v2.model.CursorNoteListing;
import com.mypurecloud.sdk.v2.model.CursorOrganizationListing;
import com.mypurecloud.sdk.v2.model.CursorRelationshipListing;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ErrorInfo;
import com.mypurecloud.sdk.v2.model.ExportListing;
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationEnrichRequest;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationIdentifier;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationIdentifierClaimRequest;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationIdentifierListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationTrustorLink;
import com.mypurecloud.sdk.v2.model.ExternalSource;
import com.mypurecloud.sdk.v2.model.IdentifierClaimRequest;
import com.mypurecloud.sdk.v2.model.Listing;
import com.mypurecloud.sdk.v2.model.MergeContactsRequest;
import com.mypurecloud.sdk.v2.model.MergeRequest;
import com.mypurecloud.sdk.v2.model.Note;
import com.mypurecloud.sdk.v2.model.NoteListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.SchemaQuantityLimits;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentListing;
import com.mypurecloud.sdk.v2.model.SessionListing;
import com.mypurecloud.sdk.v2.model.UpdateSegmentAssignmentRequest;
import com.mypurecloud.sdk.v2.model.UpdateSegmentAssignmentResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsContactRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsContactNoteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsContactsSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsExternalsourceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsImportCsvSettingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsImportSettingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsOrganizationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsOrganizationNoteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsOrganizationTrustorRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsRelationshipRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactIdentifiersRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactJourneySegmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactJourneySessionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactNoteRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactNotesRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactUnresolvedRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsExportRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsExportsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsSchemaVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsSchemaVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsSchemasCoretypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsSchemasCoretypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactsSchemasLimitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsExternalsourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsExternalsourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsImportCsvSettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsImportCsvSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsImportCsvUploadDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsImportCsvUploadPreviewRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsImportJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsImportJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsImportSettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsImportSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationContactsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationIdentifiersRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationNoteRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationNotesRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationRelationshipsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsSchemaVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsSchemaVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsSchemasCoretypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsSchemasCoretypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsOrganizationsSchemasLimitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsRelationshipRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsReversewhitepageslookupRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsScanContactsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsScanContactsDivisionviewsAllRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsScanNotesRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsScanNotesDivisionviewsAllRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsScanOrganizationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsScanOrganizationsDivisionviewsAllRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsScanRelationshipsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsScanRelationshipsDivisionviewsAllRequest;
import com.mypurecloud.sdk.v2.api.request.PatchExternalcontactsContactIdentifiersRequest;
import com.mypurecloud.sdk.v2.api.request.PatchExternalcontactsOrganizationIdentifiersRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkContactsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkContactsAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkContactsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkContactsEnrichRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkContactsRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkContactsUnresolvedRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkContactsUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkNotesRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkNotesAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkNotesRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkNotesUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkOrganizationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkOrganizationsAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkOrganizationsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkOrganizationsEnrichRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkOrganizationsRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkOrganizationsUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkRelationshipsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkRelationshipsAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkRelationshipsRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsBulkRelationshipsUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactJourneySegmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactNotesRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactPromotionRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactsEnrichRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactsExportsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactsMergeRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsContactsSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsExternalsourcesRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsIdentifierlookupRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsIdentifierlookupContactsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsIdentifierlookupOrganizationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsImportCsvJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsImportCsvSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsImportCsvUploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsImportJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsImportSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsMergeContactsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsOrganizationNotesRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsOrganizationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsOrganizationsEnrichRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsOrganizationsSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.PostExternalcontactsRelationshipsRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsContactRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsContactNoteRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsContactsSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsConversationRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsExternalsourceRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsImportCsvSettingRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsImportJobRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsImportSettingRequest;
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
   * Delete an External Source. WARNING: Any records that reference this External Source will not be automatically cleaned up. Those records will still be editable, but their External IDs may not be fully viewable.
   * 
   * @param externalSourceId External Source ID (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteExternalcontactsExternalsource(String externalSourceId) throws IOException, ApiException {
    return  deleteExternalcontactsExternalsource(createDeleteExternalcontactsExternalsourceRequest(externalSourceId));
  }

  /**
   * Delete an External Source. WARNING: Any records that reference this External Source will not be automatically cleaned up. Those records will still be editable, but their External IDs may not be fully viewable.
   * 
   * @param externalSourceId External Source ID (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteExternalcontactsExternalsourceWithHttpInfo(String externalSourceId) throws IOException {
    return deleteExternalcontactsExternalsource(createDeleteExternalcontactsExternalsourceRequest(externalSourceId).withHttpInfo());
  }

  private DeleteExternalcontactsExternalsourceRequest createDeleteExternalcontactsExternalsourceRequest(String externalSourceId) {
    return DeleteExternalcontactsExternalsourceRequest.builder()
            .withExternalSourceId(externalSourceId)

            .build();
  }

  /**
   * Delete an External Source. WARNING: Any records that reference this External Source will not be automatically cleaned up. Those records will still be editable, but their External IDs may not be fully viewable.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteExternalcontactsExternalsource(DeleteExternalcontactsExternalsourceRequest request) throws IOException, ApiException {
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
   * Delete an External Source. WARNING: Any records that reference this External Source will not be automatically cleaned up. Those records will still be editable, but their External IDs may not be fully viewable.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteExternalcontactsExternalsource(ApiRequest<Void> request) throws IOException {
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
   * Delete settings for CSV import
   * 
   * @param settingsId Settings id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteExternalcontactsImportCsvSetting(String settingsId) throws IOException, ApiException {
     deleteExternalcontactsImportCsvSetting(createDeleteExternalcontactsImportCsvSettingRequest(settingsId));
  }

  /**
   * Delete settings for CSV import
   * 
   * @param settingsId Settings id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteExternalcontactsImportCsvSettingWithHttpInfo(String settingsId) throws IOException {
    return deleteExternalcontactsImportCsvSetting(createDeleteExternalcontactsImportCsvSettingRequest(settingsId).withHttpInfo());
  }

  private DeleteExternalcontactsImportCsvSettingRequest createDeleteExternalcontactsImportCsvSettingRequest(String settingsId) {
    return DeleteExternalcontactsImportCsvSettingRequest.builder()
            .withSettingsId(settingsId)

            .build();
  }

  /**
   * Delete settings for CSV import
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteExternalcontactsImportCsvSetting(DeleteExternalcontactsImportCsvSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete settings for CSV import
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteExternalcontactsImportCsvSetting(ApiRequest<Void> request) throws IOException {
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
   * Delete Settings
   * 
   * @param settingsId Settings id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteExternalcontactsImportSetting(String settingsId) throws IOException, ApiException {
     deleteExternalcontactsImportSetting(createDeleteExternalcontactsImportSettingRequest(settingsId));
  }

  /**
   * Delete Settings
   * 
   * @param settingsId Settings id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteExternalcontactsImportSettingWithHttpInfo(String settingsId) throws IOException {
    return deleteExternalcontactsImportSetting(createDeleteExternalcontactsImportSettingRequest(settingsId).withHttpInfo());
  }

  private DeleteExternalcontactsImportSettingRequest createDeleteExternalcontactsImportSettingRequest(String settingsId) {
    return DeleteExternalcontactsImportSettingRequest.builder()
            .withSettingsId(settingsId)

            .build();
  }

  /**
   * Delete Settings
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteExternalcontactsImportSetting(DeleteExternalcontactsImportSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteExternalcontactsImportSetting(ApiRequest<Void> request) throws IOException {
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
   * @param expand which fields, if any, to expand (optional)
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
   * @param expand which fields, if any, to expand (optional)
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
   * List the identifiers for a contact
   * 
   * @param contactId ExternalContact ID (required)
   * @return ContactIdentifierListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactIdentifierListing getExternalcontactsContactIdentifiers(String contactId) throws IOException, ApiException {
    return  getExternalcontactsContactIdentifiers(createGetExternalcontactsContactIdentifiersRequest(contactId));
  }

  /**
   * List the identifiers for a contact
   * 
   * @param contactId ExternalContact ID (required)
   * @return ContactIdentifierListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactIdentifierListing> getExternalcontactsContactIdentifiersWithHttpInfo(String contactId) throws IOException {
    return getExternalcontactsContactIdentifiers(createGetExternalcontactsContactIdentifiersRequest(contactId).withHttpInfo());
  }

  private GetExternalcontactsContactIdentifiersRequest createGetExternalcontactsContactIdentifiersRequest(String contactId) {
    return GetExternalcontactsContactIdentifiersRequest.builder()
            .withContactId(contactId)

            .build();
  }

  /**
   * List the identifiers for a contact
   * 
   * @param request The request object
   * @return ContactIdentifierListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactIdentifierListing getExternalcontactsContactIdentifiers(GetExternalcontactsContactIdentifiersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactIdentifierListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactIdentifierListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List the identifiers for a contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactIdentifierListing> getExternalcontactsContactIdentifiers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactIdentifierListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactIdentifierListing> response = (ApiResponse<ContactIdentifierListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactIdentifierListing> response = (ApiResponse<ContactIdentifierListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve segment assignments by external contact ID.
   * 
   * @param contactId ExternalContact ID (required)
   * @param includeMerged Indicates whether to return segment assignments from all external contacts in the merge-set of the given one. (optional)
   * @param limit Number of entities to return. Default of 25, maximum of 500. (optional)
   * @return SegmentAssignmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SegmentAssignmentListing getExternalcontactsContactJourneySegments(String contactId, Boolean includeMerged, Integer limit) throws IOException, ApiException {
    return  getExternalcontactsContactJourneySegments(createGetExternalcontactsContactJourneySegmentsRequest(contactId, includeMerged, limit));
  }

  /**
   * Retrieve segment assignments by external contact ID.
   * 
   * @param contactId ExternalContact ID (required)
   * @param includeMerged Indicates whether to return segment assignments from all external contacts in the merge-set of the given one. (optional)
   * @param limit Number of entities to return. Default of 25, maximum of 500. (optional)
   * @return SegmentAssignmentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SegmentAssignmentListing> getExternalcontactsContactJourneySegmentsWithHttpInfo(String contactId, Boolean includeMerged, Integer limit) throws IOException {
    return getExternalcontactsContactJourneySegments(createGetExternalcontactsContactJourneySegmentsRequest(contactId, includeMerged, limit).withHttpInfo());
  }

  private GetExternalcontactsContactJourneySegmentsRequest createGetExternalcontactsContactJourneySegmentsRequest(String contactId, Boolean includeMerged, Integer limit) {
    return GetExternalcontactsContactJourneySegmentsRequest.builder()
            .withContactId(contactId)

            .withIncludeMerged(includeMerged)

            .withLimit(limit)

            .build();
  }

  /**
   * Retrieve segment assignments by external contact ID.
   * 
   * @param request The request object
   * @return SegmentAssignmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SegmentAssignmentListing getExternalcontactsContactJourneySegments(GetExternalcontactsContactJourneySegmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SegmentAssignmentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SegmentAssignmentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve segment assignments by external contact ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SegmentAssignmentListing> getExternalcontactsContactJourneySegments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SegmentAssignmentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SegmentAssignmentListing> response = (ApiResponse<SegmentAssignmentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SegmentAssignmentListing> response = (ApiResponse<SegmentAssignmentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve all sessions for a given external contact.
   * 
   * @param contactId ExternalContact ID (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param includeMerged Indicates whether to return sessions from all external contacts in the merge-set of the given one. (optional)
   * @return SessionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SessionListing getExternalcontactsContactJourneySessions(String contactId, String pageSize, String after, Boolean includeMerged) throws IOException, ApiException {
    return  getExternalcontactsContactJourneySessions(createGetExternalcontactsContactJourneySessionsRequest(contactId, pageSize, after, includeMerged));
  }

  /**
   * Retrieve all sessions for a given external contact.
   * 
   * @param contactId ExternalContact ID (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param includeMerged Indicates whether to return sessions from all external contacts in the merge-set of the given one. (optional)
   * @return SessionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SessionListing> getExternalcontactsContactJourneySessionsWithHttpInfo(String contactId, String pageSize, String after, Boolean includeMerged) throws IOException {
    return getExternalcontactsContactJourneySessions(createGetExternalcontactsContactJourneySessionsRequest(contactId, pageSize, after, includeMerged).withHttpInfo());
  }

  private GetExternalcontactsContactJourneySessionsRequest createGetExternalcontactsContactJourneySessionsRequest(String contactId, String pageSize, String after, Boolean includeMerged) {
    return GetExternalcontactsContactJourneySessionsRequest.builder()
            .withContactId(contactId)

            .withPageSize(pageSize)

            .withAfter(after)

            .withIncludeMerged(includeMerged)

            .build();
  }

  /**
   * Retrieve all sessions for a given external contact.
   * 
   * @param request The request object
   * @return SessionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SessionListing getExternalcontactsContactJourneySessions(GetExternalcontactsContactJourneySessionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SessionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SessionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all sessions for a given external contact.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SessionListing> getExternalcontactsContactJourneySessions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SessionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SessionListing> response = (ApiResponse<SessionListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SessionListing> response = (ApiResponse<SessionListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 1)
   * @param sortOrder The Note field to sort by. Any of: [createDate]. Direction: [asc, desc].  e.g. \"createDate:asc\", \"createDate:desc\" (optional)
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
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 1)
   * @param sortOrder The Note field to sort by. Any of: [createDate]. Direction: [asc, desc].  e.g. \"createDate:asc\", \"createDate:desc\" (optional)
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
   * Fetch an unresolved external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @param expand which fields, if any, to expand (optional)
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact getExternalcontactsContactUnresolved(String contactId, List<String> expand) throws IOException, ApiException {
    return  getExternalcontactsContactUnresolved(createGetExternalcontactsContactUnresolvedRequest(contactId, expand));
  }

  /**
   * Fetch an unresolved external contact
   * 
   * @param contactId ExternalContact ID (required)
   * @param expand which fields, if any, to expand (optional)
   * @return ExternalContact
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> getExternalcontactsContactUnresolvedWithHttpInfo(String contactId, List<String> expand) throws IOException {
    return getExternalcontactsContactUnresolved(createGetExternalcontactsContactUnresolvedRequest(contactId, expand).withHttpInfo());
  }

  private GetExternalcontactsContactUnresolvedRequest createGetExternalcontactsContactUnresolvedRequest(String contactId, List<String> expand) {
    return GetExternalcontactsContactUnresolvedRequest.builder()
            .withContactId(contactId)

            .withExpand(expand)

            .build();
  }

  /**
   * Fetch an unresolved external contact
   * 
   * @param request The request object
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact getExternalcontactsContactUnresolved(GetExternalcontactsContactUnresolvedRequest request) throws IOException, ApiException {
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
   * Fetch an unresolved external contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> getExternalcontactsContactUnresolved(ApiRequest<Void> request) throws IOException {
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
   * Search for external contacts
   * 
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 1)
   * @param q User supplied search keywords (no special syntax is currently supported) (optional)
   * @param sortOrder The External Contact field to sort by. Any of: [firstName, lastName, middleName, title]. Direction: [asc, desc]. e.g. \"firstName:asc\", \"title:desc\" (optional)
   * @param expand which fields, if any, to expand (optional)
   * @param divisionIds which divisions to search, up to 50 (optional)
   * @return ContactListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListing getExternalcontactsContacts(Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand, List<String> divisionIds) throws IOException, ApiException {
    return  getExternalcontactsContacts(createGetExternalcontactsContactsRequest(pageSize, pageNumber, q, sortOrder, expand, divisionIds));
  }

  /**
   * Search for external contacts
   * 
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 1)
   * @param q User supplied search keywords (no special syntax is currently supported) (optional)
   * @param sortOrder The External Contact field to sort by. Any of: [firstName, lastName, middleName, title]. Direction: [asc, desc]. e.g. \"firstName:asc\", \"title:desc\" (optional)
   * @param expand which fields, if any, to expand (optional)
   * @param divisionIds which divisions to search, up to 50 (optional)
   * @return ContactListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListing> getExternalcontactsContactsWithHttpInfo(Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand, List<String> divisionIds) throws IOException {
    return getExternalcontactsContacts(createGetExternalcontactsContactsRequest(pageSize, pageNumber, q, sortOrder, expand, divisionIds).withHttpInfo());
  }

  private GetExternalcontactsContactsRequest createGetExternalcontactsContactsRequest(Integer pageSize, Integer pageNumber, String q, String sortOrder, List<String> expand, List<String> divisionIds) {
    return GetExternalcontactsContactsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withQ(q)

            .withSortOrder(sortOrder)

            .withExpand(expand)

            .withDivisionIds(divisionIds)

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
   * Get export for exportId
   * 
   * @param exportId Export id (required)
   * @return ContactsExport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactsExport getExternalcontactsContactsExport(String exportId) throws IOException, ApiException {
    return  getExternalcontactsContactsExport(createGetExternalcontactsContactsExportRequest(exportId));
  }

  /**
   * Get export for exportId
   * 
   * @param exportId Export id (required)
   * @return ContactsExport
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactsExport> getExternalcontactsContactsExportWithHttpInfo(String exportId) throws IOException {
    return getExternalcontactsContactsExport(createGetExternalcontactsContactsExportRequest(exportId).withHttpInfo());
  }

  private GetExternalcontactsContactsExportRequest createGetExternalcontactsContactsExportRequest(String exportId) {
    return GetExternalcontactsContactsExportRequest.builder()
            .withExportId(exportId)

            .build();
  }

  /**
   * Get export for exportId
   * 
   * @param request The request object
   * @return ContactsExport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactsExport getExternalcontactsContactsExport(GetExternalcontactsContactsExportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactsExport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactsExport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get export for exportId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactsExport> getExternalcontactsContactsExport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactsExport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactsExport> response = (ApiResponse<ContactsExport>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactsExport> response = (ApiResponse<ContactsExport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * List exports for organization
   * 
   * @param divisionIds Division IDs of entities (optional)
   * @param after The cursor that points to the end of the set of entities (optional)
   * @param pageSize Number of entities to return (optional)
   * @return ExportListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExportListing getExternalcontactsContactsExports(List<String> divisionIds, String after, Integer pageSize) throws IOException, ApiException {
    return  getExternalcontactsContactsExports(createGetExternalcontactsContactsExportsRequest(divisionIds, after, pageSize));
  }

  /**
   * List exports for organization
   * 
   * @param divisionIds Division IDs of entities (optional)
   * @param after The cursor that points to the end of the set of entities (optional)
   * @param pageSize Number of entities to return (optional)
   * @return ExportListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExportListing> getExternalcontactsContactsExportsWithHttpInfo(List<String> divisionIds, String after, Integer pageSize) throws IOException {
    return getExternalcontactsContactsExports(createGetExternalcontactsContactsExportsRequest(divisionIds, after, pageSize).withHttpInfo());
  }

  private GetExternalcontactsContactsExportsRequest createGetExternalcontactsContactsExportsRequest(List<String> divisionIds, String after, Integer pageSize) {
    return GetExternalcontactsContactsExportsRequest.builder()
            .withDivisionIds(divisionIds)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * List exports for organization
   * 
   * @param request The request object
   * @return ExportListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExportListing getExternalcontactsContactsExports(GetExternalcontactsContactsExportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExportListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExportListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List exports for organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExportListing> getExternalcontactsContactsExports(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExportListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExportListing> response = (ApiResponse<ExportListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ExportListing> response = (ApiResponse<ExportListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all versions of an external contact's schema
   * 
   * @param schemaId Schema ID (required)
   * @return DataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchemaListing getExternalcontactsContactsSchemaVersions(String schemaId) throws IOException, ApiException {
    return  getExternalcontactsContactsSchemaVersions(createGetExternalcontactsContactsSchemaVersionsRequest(schemaId));
  }

  /**
   * Get all versions of an external contact's schema
   * 
   * @param schemaId Schema ID (required)
   * @return DataSchemaListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchemaListing> getExternalcontactsContactsSchemaVersionsWithHttpInfo(String schemaId) throws IOException {
    return getExternalcontactsContactsSchemaVersions(createGetExternalcontactsContactsSchemaVersionsRequest(schemaId).withHttpInfo());
  }

  private GetExternalcontactsContactsSchemaVersionsRequest createGetExternalcontactsContactsSchemaVersionsRequest(String schemaId) {
    return GetExternalcontactsContactsSchemaVersionsRequest.builder()
            .withSchemaId(schemaId)

            .build();
  }

  /**
   * Get all versions of an external contact's schema
   * 
   * @param request The request object
   * @return DataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchemaListing getExternalcontactsContactsSchemaVersions(GetExternalcontactsContactsSchemaVersionsRequest request) throws IOException, ApiException {
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
   * Get all versions of an external contact's schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchemaListing> getExternalcontactsContactsSchemaVersions(ApiRequest<Void> request) throws IOException {
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
   * Get a specific named core type.
   * 
   * @param coreTypeName Name of the core type (required)
   * @return Coretype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Coretype getExternalcontactsContactsSchemasCoretype(String coreTypeName) throws IOException, ApiException {
    return  getExternalcontactsContactsSchemasCoretype(createGetExternalcontactsContactsSchemasCoretypeRequest(coreTypeName));
  }

  /**
   * Get a specific named core type.
   * 
   * @param coreTypeName Name of the core type (required)
   * @return Coretype
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Coretype> getExternalcontactsContactsSchemasCoretypeWithHttpInfo(String coreTypeName) throws IOException {
    return getExternalcontactsContactsSchemasCoretype(createGetExternalcontactsContactsSchemasCoretypeRequest(coreTypeName).withHttpInfo());
  }

  private GetExternalcontactsContactsSchemasCoretypeRequest createGetExternalcontactsContactsSchemasCoretypeRequest(String coreTypeName) {
    return GetExternalcontactsContactsSchemasCoretypeRequest.builder()
            .withCoreTypeName(coreTypeName)

            .build();
  }

  /**
   * Get a specific named core type.
   * 
   * @param request The request object
   * @return Coretype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Coretype getExternalcontactsContactsSchemasCoretype(GetExternalcontactsContactsSchemasCoretypeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Coretype> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Coretype>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a specific named core type.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Coretype> getExternalcontactsContactsSchemasCoretype(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Coretype>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)exception;
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
      ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @return CoretypeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoretypeListing getExternalcontactsContactsSchemasCoretypes() throws IOException, ApiException {
    return  getExternalcontactsContactsSchemasCoretypes(createGetExternalcontactsContactsSchemasCoretypesRequest());
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @return CoretypeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoretypeListing> getExternalcontactsContactsSchemasCoretypesWithHttpInfo() throws IOException {
    return getExternalcontactsContactsSchemasCoretypes(createGetExternalcontactsContactsSchemasCoretypesRequest().withHttpInfo());
  }

  private GetExternalcontactsContactsSchemasCoretypesRequest createGetExternalcontactsContactsSchemasCoretypesRequest() {
    return GetExternalcontactsContactsSchemasCoretypesRequest.builder()
            .build();
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @param request The request object
   * @return CoretypeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoretypeListing getExternalcontactsContactsSchemasCoretypes(GetExternalcontactsContactsSchemasCoretypesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoretypeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoretypeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoretypeListing> getExternalcontactsContactsSchemasCoretypes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoretypeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @return SchemaQuantityLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SchemaQuantityLimits getExternalcontactsContactsSchemasLimits() throws IOException, ApiException {
    return  getExternalcontactsContactsSchemasLimits(createGetExternalcontactsContactsSchemasLimitsRequest());
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @return SchemaQuantityLimits
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SchemaQuantityLimits> getExternalcontactsContactsSchemasLimitsWithHttpInfo() throws IOException {
    return getExternalcontactsContactsSchemasLimits(createGetExternalcontactsContactsSchemasLimitsRequest().withHttpInfo());
  }

  private GetExternalcontactsContactsSchemasLimitsRequest createGetExternalcontactsContactsSchemasLimitsRequest() {
    return GetExternalcontactsContactsSchemasLimitsRequest.builder()
            .build();
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @param request The request object
   * @return SchemaQuantityLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SchemaQuantityLimits getExternalcontactsContactsSchemasLimits(GetExternalcontactsContactsSchemasLimitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SchemaQuantityLimits> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SchemaQuantityLimits>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SchemaQuantityLimits> getExternalcontactsContactsSchemasLimits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SchemaQuantityLimits>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SchemaQuantityLimits> response = (ApiResponse<SchemaQuantityLimits>)(ApiResponse<?>)exception;
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
      ApiResponse<SchemaQuantityLimits> response = (ApiResponse<SchemaQuantityLimits>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch an External Source
   * 
   * @param externalSourceId External Source ID (required)
   * @return ExternalSource
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalSource getExternalcontactsExternalsource(String externalSourceId) throws IOException, ApiException {
    return  getExternalcontactsExternalsource(createGetExternalcontactsExternalsourceRequest(externalSourceId));
  }

  /**
   * Fetch an External Source
   * 
   * @param externalSourceId External Source ID (required)
   * @return ExternalSource
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalSource> getExternalcontactsExternalsourceWithHttpInfo(String externalSourceId) throws IOException {
    return getExternalcontactsExternalsource(createGetExternalcontactsExternalsourceRequest(externalSourceId).withHttpInfo());
  }

  private GetExternalcontactsExternalsourceRequest createGetExternalcontactsExternalsourceRequest(String externalSourceId) {
    return GetExternalcontactsExternalsourceRequest.builder()
            .withExternalSourceId(externalSourceId)

            .build();
  }

  /**
   * Fetch an External Source
   * 
   * @param request The request object
   * @return ExternalSource
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalSource getExternalcontactsExternalsource(GetExternalcontactsExternalsourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalSource> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalSource>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch an External Source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalSource> getExternalcontactsExternalsource(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalSource>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalSource> response = (ApiResponse<ExternalSource>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalSource> response = (ApiResponse<ExternalSource>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a list of External Sources
   * 
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @param limit The number of ExternalSources per page; must be between 10 and 200, default is 100 (optional)
   * @param name Filter by external source name. Filtering is prefix filtering and not an exact match (optional)
   * @param active Filter by active status of external source (optional)
   * @return CursorExternalSourceListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorExternalSourceListing getExternalcontactsExternalsources(String cursor, Integer limit, String name, Boolean active) throws IOException, ApiException {
    return  getExternalcontactsExternalsources(createGetExternalcontactsExternalsourcesRequest(cursor, limit, name, active));
  }

  /**
   * Fetch a list of External Sources
   * 
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @param limit The number of ExternalSources per page; must be between 10 and 200, default is 100 (optional)
   * @param name Filter by external source name. Filtering is prefix filtering and not an exact match (optional)
   * @param active Filter by active status of external source (optional)
   * @return CursorExternalSourceListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorExternalSourceListing> getExternalcontactsExternalsourcesWithHttpInfo(String cursor, Integer limit, String name, Boolean active) throws IOException {
    return getExternalcontactsExternalsources(createGetExternalcontactsExternalsourcesRequest(cursor, limit, name, active).withHttpInfo());
  }

  private GetExternalcontactsExternalsourcesRequest createGetExternalcontactsExternalsourcesRequest(String cursor, Integer limit, String name, Boolean active) {
    return GetExternalcontactsExternalsourcesRequest.builder()
            .withCursor(cursor)

            .withLimit(limit)

            .withName(name)

            .withActive(active)

            .build();
  }

  /**
   * Fetch a list of External Sources
   * 
   * @param request The request object
   * @return CursorExternalSourceListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorExternalSourceListing getExternalcontactsExternalsources(GetExternalcontactsExternalsourcesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CursorExternalSourceListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CursorExternalSourceListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a list of External Sources
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorExternalSourceListing> getExternalcontactsExternalsources(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CursorExternalSourceListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CursorExternalSourceListing> response = (ApiResponse<CursorExternalSourceListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CursorExternalSourceListing> response = (ApiResponse<CursorExternalSourceListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get settings for CSV import
   * 
   * @param settingsId Settings id (required)
   * @return CsvSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvSettings getExternalcontactsImportCsvSetting(String settingsId) throws IOException, ApiException {
    return  getExternalcontactsImportCsvSetting(createGetExternalcontactsImportCsvSettingRequest(settingsId));
  }

  /**
   * Get settings for CSV import
   * 
   * @param settingsId Settings id (required)
   * @return CsvSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvSettings> getExternalcontactsImportCsvSettingWithHttpInfo(String settingsId) throws IOException {
    return getExternalcontactsImportCsvSetting(createGetExternalcontactsImportCsvSettingRequest(settingsId).withHttpInfo());
  }

  private GetExternalcontactsImportCsvSettingRequest createGetExternalcontactsImportCsvSettingRequest(String settingsId) {
    return GetExternalcontactsImportCsvSettingRequest.builder()
            .withSettingsId(settingsId)

            .build();
  }

  /**
   * Get settings for CSV import
   * 
   * @param request The request object
   * @return CsvSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvSettings getExternalcontactsImportCsvSetting(GetExternalcontactsImportCsvSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CsvSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CsvSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get settings for CSV import
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvSettings> getExternalcontactsImportCsvSetting(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CsvSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CsvSettings> response = (ApiResponse<CsvSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<CsvSettings> response = (ApiResponse<CsvSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve all settings for organization filtered by externalSettingsId if provided
   * 
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param externalSettingsId External Settings Id to filter the list. (optional)
   * @return Listing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Listing getExternalcontactsImportCsvSettings(String after, String pageSize, String externalSettingsId) throws IOException, ApiException {
    return  getExternalcontactsImportCsvSettings(createGetExternalcontactsImportCsvSettingsRequest(after, pageSize, externalSettingsId));
  }

  /**
   * Retrieve all settings for organization filtered by externalSettingsId if provided
   * 
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param externalSettingsId External Settings Id to filter the list. (optional)
   * @return Listing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Listing> getExternalcontactsImportCsvSettingsWithHttpInfo(String after, String pageSize, String externalSettingsId) throws IOException {
    return getExternalcontactsImportCsvSettings(createGetExternalcontactsImportCsvSettingsRequest(after, pageSize, externalSettingsId).withHttpInfo());
  }

  private GetExternalcontactsImportCsvSettingsRequest createGetExternalcontactsImportCsvSettingsRequest(String after, String pageSize, String externalSettingsId) {
    return GetExternalcontactsImportCsvSettingsRequest.builder()
            .withAfter(after)

            .withPageSize(pageSize)

            .withExternalSettingsId(externalSettingsId)

            .build();
  }

  /**
   * Retrieve all settings for organization filtered by externalSettingsId if provided
   * 
   * @param request The request object
   * @return Listing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Listing getExternalcontactsImportCsvSettings(GetExternalcontactsImportCsvSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Listing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Listing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all settings for organization filtered by externalSettingsId if provided
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Listing> getExternalcontactsImportCsvSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Listing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Listing> response = (ApiResponse<Listing>)(ApiResponse<?>)exception;
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
      ApiResponse<Listing> response = (ApiResponse<Listing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get details for CSV upload
   * 
   * @param uploadId Upload id (required)
   * @return CsvUploadDetailsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvUploadDetailsResponse getExternalcontactsImportCsvUploadDetails(String uploadId) throws IOException, ApiException {
    return  getExternalcontactsImportCsvUploadDetails(createGetExternalcontactsImportCsvUploadDetailsRequest(uploadId));
  }

  /**
   * Get details for CSV upload
   * 
   * @param uploadId Upload id (required)
   * @return CsvUploadDetailsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvUploadDetailsResponse> getExternalcontactsImportCsvUploadDetailsWithHttpInfo(String uploadId) throws IOException {
    return getExternalcontactsImportCsvUploadDetails(createGetExternalcontactsImportCsvUploadDetailsRequest(uploadId).withHttpInfo());
  }

  private GetExternalcontactsImportCsvUploadDetailsRequest createGetExternalcontactsImportCsvUploadDetailsRequest(String uploadId) {
    return GetExternalcontactsImportCsvUploadDetailsRequest.builder()
            .withUploadId(uploadId)

            .build();
  }

  /**
   * Get details for CSV upload
   * 
   * @param request The request object
   * @return CsvUploadDetailsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvUploadDetailsResponse getExternalcontactsImportCsvUploadDetails(GetExternalcontactsImportCsvUploadDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CsvUploadDetailsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CsvUploadDetailsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get details for CSV upload
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvUploadDetailsResponse> getExternalcontactsImportCsvUploadDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CsvUploadDetailsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CsvUploadDetailsResponse> response = (ApiResponse<CsvUploadDetailsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CsvUploadDetailsResponse> response = (ApiResponse<CsvUploadDetailsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get preview for CSV upload
   * 
   * @param uploadId Upload id (required)
   * @return CsvUploadPreviewResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvUploadPreviewResponse getExternalcontactsImportCsvUploadPreview(String uploadId) throws IOException, ApiException {
    return  getExternalcontactsImportCsvUploadPreview(createGetExternalcontactsImportCsvUploadPreviewRequest(uploadId));
  }

  /**
   * Get preview for CSV upload
   * 
   * @param uploadId Upload id (required)
   * @return CsvUploadPreviewResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvUploadPreviewResponse> getExternalcontactsImportCsvUploadPreviewWithHttpInfo(String uploadId) throws IOException {
    return getExternalcontactsImportCsvUploadPreview(createGetExternalcontactsImportCsvUploadPreviewRequest(uploadId).withHttpInfo());
  }

  private GetExternalcontactsImportCsvUploadPreviewRequest createGetExternalcontactsImportCsvUploadPreviewRequest(String uploadId) {
    return GetExternalcontactsImportCsvUploadPreviewRequest.builder()
            .withUploadId(uploadId)

            .build();
  }

  /**
   * Get preview for CSV upload
   * 
   * @param request The request object
   * @return CsvUploadPreviewResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvUploadPreviewResponse getExternalcontactsImportCsvUploadPreview(GetExternalcontactsImportCsvUploadPreviewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CsvUploadPreviewResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CsvUploadPreviewResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get preview for CSV upload
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvUploadPreviewResponse> getExternalcontactsImportCsvUploadPreview(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CsvUploadPreviewResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CsvUploadPreviewResponse> response = (ApiResponse<CsvUploadPreviewResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CsvUploadPreviewResponse> response = (ApiResponse<CsvUploadPreviewResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get job based on id
   * 
   * @param jobId Job id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return ContactImportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportJobResponse getExternalcontactsImportJob(String jobId, List<String> expand) throws IOException, ApiException {
    return  getExternalcontactsImportJob(createGetExternalcontactsImportJobRequest(jobId, expand));
  }

  /**
   * Get job based on id
   * 
   * @param jobId Job id (required)
   * @param expand which fields, if any, to expand (optional)
   * @return ContactImportJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportJobResponse> getExternalcontactsImportJobWithHttpInfo(String jobId, List<String> expand) throws IOException {
    return getExternalcontactsImportJob(createGetExternalcontactsImportJobRequest(jobId, expand).withHttpInfo());
  }

  private GetExternalcontactsImportJobRequest createGetExternalcontactsImportJobRequest(String jobId, List<String> expand) {
    return GetExternalcontactsImportJobRequest.builder()
            .withJobId(jobId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get job based on id
   * 
   * @param request The request object
   * @return ContactImportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportJobResponse getExternalcontactsImportJob(GetExternalcontactsImportJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactImportJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactImportJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get job based on id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportJobResponse> getExternalcontactsImportJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactImportJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactImportJobResponse> response = (ApiResponse<ContactImportJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactImportJobResponse> response = (ApiResponse<ContactImportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * List jobs for organization
   * 
   * @param expand which fields, if any, to expand (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional, default to 25)
   * @param sortOrder Direction of sorting. (optional, default to Ascending)
   * @param jobStatus Search term to filter by jobStatus (optional)
   * @return ContactImportJobEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportJobEntityListing getExternalcontactsImportJobs(List<String> expand, String after, String pageSize, String sortOrder, String jobStatus) throws IOException, ApiException {
    return  getExternalcontactsImportJobs(createGetExternalcontactsImportJobsRequest(expand, after, pageSize, sortOrder, jobStatus));
  }

  /**
   * List jobs for organization
   * 
   * @param expand which fields, if any, to expand (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional, default to 25)
   * @param sortOrder Direction of sorting. (optional, default to Ascending)
   * @param jobStatus Search term to filter by jobStatus (optional)
   * @return ContactImportJobEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportJobEntityListing> getExternalcontactsImportJobsWithHttpInfo(List<String> expand, String after, String pageSize, String sortOrder, String jobStatus) throws IOException {
    return getExternalcontactsImportJobs(createGetExternalcontactsImportJobsRequest(expand, after, pageSize, sortOrder, jobStatus).withHttpInfo());
  }

  private GetExternalcontactsImportJobsRequest createGetExternalcontactsImportJobsRequest(List<String> expand, String after, String pageSize, String sortOrder, String jobStatus) {
    return GetExternalcontactsImportJobsRequest.builder()
            .withExpand(expand)

            .withAfter(after)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .withJobStatus(jobStatus)

            .build();
  }

  /**
   * List jobs for organization
   * 
   * @param request The request object
   * @return ContactImportJobEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportJobEntityListing getExternalcontactsImportJobs(GetExternalcontactsImportJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactImportJobEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactImportJobEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List jobs for organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportJobEntityListing> getExternalcontactsImportJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactImportJobEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactImportJobEntityListing> response = (ApiResponse<ContactImportJobEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactImportJobEntityListing> response = (ApiResponse<ContactImportJobEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get setting based on id
   * 
   * @param settingsId Settings id (required)
   * @return ContactImportSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportSettings getExternalcontactsImportSetting(String settingsId) throws IOException, ApiException {
    return  getExternalcontactsImportSetting(createGetExternalcontactsImportSettingRequest(settingsId));
  }

  /**
   * Get setting based on id
   * 
   * @param settingsId Settings id (required)
   * @return ContactImportSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportSettings> getExternalcontactsImportSettingWithHttpInfo(String settingsId) throws IOException {
    return getExternalcontactsImportSetting(createGetExternalcontactsImportSettingRequest(settingsId).withHttpInfo());
  }

  private GetExternalcontactsImportSettingRequest createGetExternalcontactsImportSettingRequest(String settingsId) {
    return GetExternalcontactsImportSettingRequest.builder()
            .withSettingsId(settingsId)

            .build();
  }

  /**
   * Get setting based on id
   * 
   * @param request The request object
   * @return ContactImportSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportSettings getExternalcontactsImportSetting(GetExternalcontactsImportSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactImportSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactImportSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get setting based on id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportSettings> getExternalcontactsImportSetting(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactImportSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactImportSettings> response = (ApiResponse<ContactImportSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactImportSettings> response = (ApiResponse<ContactImportSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * List settings for organization
   * 
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional, default to 25)
   * @param sortOrder Direction of sorting. (optional, default to Ascending)
   * @param name Search term to filter by settings name (optional)
   * @return ContactImportSettingsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportSettingsEntityListing getExternalcontactsImportSettings(String after, String pageSize, String sortOrder, String name) throws IOException, ApiException {
    return  getExternalcontactsImportSettings(createGetExternalcontactsImportSettingsRequest(after, pageSize, sortOrder, name));
  }

  /**
   * List settings for organization
   * 
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 100. (optional, default to 25)
   * @param sortOrder Direction of sorting. (optional, default to Ascending)
   * @param name Search term to filter by settings name (optional)
   * @return ContactImportSettingsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportSettingsEntityListing> getExternalcontactsImportSettingsWithHttpInfo(String after, String pageSize, String sortOrder, String name) throws IOException {
    return getExternalcontactsImportSettings(createGetExternalcontactsImportSettingsRequest(after, pageSize, sortOrder, name).withHttpInfo());
  }

  private GetExternalcontactsImportSettingsRequest createGetExternalcontactsImportSettingsRequest(String after, String pageSize, String sortOrder, String name) {
    return GetExternalcontactsImportSettingsRequest.builder()
            .withAfter(after)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .withName(name)

            .build();
  }

  /**
   * List settings for organization
   * 
   * @param request The request object
   * @return ContactImportSettingsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportSettingsEntityListing getExternalcontactsImportSettings(GetExternalcontactsImportSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactImportSettingsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactImportSettingsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List settings for organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportSettingsEntityListing> getExternalcontactsImportSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactImportSettingsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactImportSettingsEntityListing> response = (ApiResponse<ContactImportSettingsEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactImportSettingsEntityListing> response = (ApiResponse<ContactImportSettingsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param expand which fields, if any, to expand (optional)
   * @param includeTrustors (true or false) whether or not to include trustor information embedded in the externalOrganization (optional)
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization getExternalcontactsOrganization(String externalOrganizationId, List<String> expand, Boolean includeTrustors) throws IOException, ApiException {
    return  getExternalcontactsOrganization(createGetExternalcontactsOrganizationRequest(externalOrganizationId, expand, includeTrustors));
  }

  /**
   * Fetch an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param expand which fields, if any, to expand (optional)
   * @param includeTrustors (true or false) whether or not to include trustor information embedded in the externalOrganization (optional)
   * @return ExternalOrganization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> getExternalcontactsOrganizationWithHttpInfo(String externalOrganizationId, List<String> expand, Boolean includeTrustors) throws IOException {
    return getExternalcontactsOrganization(createGetExternalcontactsOrganizationRequest(externalOrganizationId, expand, includeTrustors).withHttpInfo());
  }

  private GetExternalcontactsOrganizationRequest createGetExternalcontactsOrganizationRequest(String externalOrganizationId, List<String> expand, Boolean includeTrustors) {
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
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 1)
   * @param q User supplied search keywords (no special syntax is currently supported) (optional)
   * @param sortOrder The External Contact field to sort by. Any of: [firstName, lastName, middleName, title]. Direction: [asc, desc]. e.g. \"firstName:asc\", \"title:desc\" (optional)
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
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 1)
   * @param q User supplied search keywords (no special syntax is currently supported) (optional)
   * @param sortOrder The External Contact field to sort by. Any of: [firstName, lastName, middleName, title]. Direction: [asc, desc]. e.g. \"firstName:asc\", \"title:desc\" (optional)
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
   * List the identifiers for an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @return ExternalOrganizationIdentifierListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganizationIdentifierListing getExternalcontactsOrganizationIdentifiers(String externalOrganizationId) throws IOException, ApiException {
    return  getExternalcontactsOrganizationIdentifiers(createGetExternalcontactsOrganizationIdentifiersRequest(externalOrganizationId));
  }

  /**
   * List the identifiers for an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @return ExternalOrganizationIdentifierListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganizationIdentifierListing> getExternalcontactsOrganizationIdentifiersWithHttpInfo(String externalOrganizationId) throws IOException {
    return getExternalcontactsOrganizationIdentifiers(createGetExternalcontactsOrganizationIdentifiersRequest(externalOrganizationId).withHttpInfo());
  }

  private GetExternalcontactsOrganizationIdentifiersRequest createGetExternalcontactsOrganizationIdentifiersRequest(String externalOrganizationId) {
    return GetExternalcontactsOrganizationIdentifiersRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)

            .build();
  }

  /**
   * List the identifiers for an external organization
   * 
   * @param request The request object
   * @return ExternalOrganizationIdentifierListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganizationIdentifierListing getExternalcontactsOrganizationIdentifiers(GetExternalcontactsOrganizationIdentifiersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalOrganizationIdentifierListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalOrganizationIdentifierListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List the identifiers for an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganizationIdentifierListing> getExternalcontactsOrganizationIdentifiers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalOrganizationIdentifierListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalOrganizationIdentifierListing> response = (ApiResponse<ExternalOrganizationIdentifierListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalOrganizationIdentifierListing> response = (ApiResponse<ExternalOrganizationIdentifierListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 1)
   * @param sortOrder The Note field to sort by. Any of: [createDate]. Direction: [asc, desc]. e.g. \"createDate:asc\", \"createDate:desc\" (optional)
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
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 1)
   * @param sortOrder The Note field to sort by. Any of: [createDate]. Direction: [asc, desc]. e.g. \"createDate:asc\", \"createDate:desc\" (optional)
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
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 1)
   * @param expand which fields, if any, to expand (optional)
   * @param sortOrder The Relationship field to sort by. Any of: [createDate, relationship]. Direction: [asc, desc]. e.g. \"createDate:asc\", \"relationship:desc\" (optional)
   * @return RelationshipListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RelationshipListing getExternalcontactsOrganizationRelationships(String externalOrganizationId, Integer pageSize, Integer pageNumber, List<String> expand, String sortOrder) throws IOException, ApiException {
    return  getExternalcontactsOrganizationRelationships(createGetExternalcontactsOrganizationRelationshipsRequest(externalOrganizationId, pageSize, pageNumber, expand, sortOrder));
  }

  /**
   * Fetch a relationship for an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 1)
   * @param expand which fields, if any, to expand (optional)
   * @param sortOrder The Relationship field to sort by. Any of: [createDate, relationship]. Direction: [asc, desc]. e.g. \"createDate:asc\", \"relationship:desc\" (optional)
   * @return RelationshipListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RelationshipListing> getExternalcontactsOrganizationRelationshipsWithHttpInfo(String externalOrganizationId, Integer pageSize, Integer pageNumber, List<String> expand, String sortOrder) throws IOException {
    return getExternalcontactsOrganizationRelationships(createGetExternalcontactsOrganizationRelationshipsRequest(externalOrganizationId, pageSize, pageNumber, expand, sortOrder).withHttpInfo());
  }

  private GetExternalcontactsOrganizationRelationshipsRequest createGetExternalcontactsOrganizationRelationshipsRequest(String externalOrganizationId, Integer pageSize, Integer pageNumber, List<String> expand, String sortOrder) {
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
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 1)
   * @param q Search query (optional)
   * @param trustorId Search for external organizations by trustorIds (limit 25). If supplied, the 'q' parameters is ignored. Items are returned in the order requested (optional)
   * @param sortOrder The Organization field to sort by. Any of: [companyType, industry, name]. Direction: [asc, desc]. e.g. \"companyType:asc\", \"industry:desc\" (optional)
   * @param expand which fields, if any, to expand (optional)
   * @param includeTrustors (true or false) whether or not to include trustor information embedded in the externalOrganization (optional)
   * @param divisionIds which divisions to search, up to 50 (optional)
   * @return ExternalOrganizationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganizationListing getExternalcontactsOrganizations(Integer pageSize, Integer pageNumber, String q, List<String> trustorId, String sortOrder, List<String> expand, Boolean includeTrustors, List<String> divisionIds) throws IOException, ApiException {
    return  getExternalcontactsOrganizations(createGetExternalcontactsOrganizationsRequest(pageSize, pageNumber, q, trustorId, sortOrder, expand, includeTrustors, divisionIds));
  }

  /**
   * Search for external organizations
   * 
   * @param pageSize Page size (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 20)
   * @param pageNumber Page number (limited to fetching first 1,000 records; pageNumber * pageSize must be <= 1,000) (optional, default to 1)
   * @param q Search query (optional)
   * @param trustorId Search for external organizations by trustorIds (limit 25). If supplied, the 'q' parameters is ignored. Items are returned in the order requested (optional)
   * @param sortOrder The Organization field to sort by. Any of: [companyType, industry, name]. Direction: [asc, desc]. e.g. \"companyType:asc\", \"industry:desc\" (optional)
   * @param expand which fields, if any, to expand (optional)
   * @param includeTrustors (true or false) whether or not to include trustor information embedded in the externalOrganization (optional)
   * @param divisionIds which divisions to search, up to 50 (optional)
   * @return ExternalOrganizationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganizationListing> getExternalcontactsOrganizationsWithHttpInfo(Integer pageSize, Integer pageNumber, String q, List<String> trustorId, String sortOrder, List<String> expand, Boolean includeTrustors, List<String> divisionIds) throws IOException {
    return getExternalcontactsOrganizations(createGetExternalcontactsOrganizationsRequest(pageSize, pageNumber, q, trustorId, sortOrder, expand, includeTrustors, divisionIds).withHttpInfo());
  }

  private GetExternalcontactsOrganizationsRequest createGetExternalcontactsOrganizationsRequest(Integer pageSize, Integer pageNumber, String q, List<String> trustorId, String sortOrder, List<String> expand, Boolean includeTrustors, List<String> divisionIds) {
    return GetExternalcontactsOrganizationsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withQ(q)

            .withTrustorId(trustorId)

            .withSortOrder(sortOrder)

            .withExpand(expand)

            .withIncludeTrustors(includeTrustors)

            .withDivisionIds(divisionIds)

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
   * Get all versions of an external organization's schema
   * 
   * @param schemaId Schema ID (required)
   * @return DataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchemaListing getExternalcontactsOrganizationsSchemaVersions(String schemaId) throws IOException, ApiException {
    return  getExternalcontactsOrganizationsSchemaVersions(createGetExternalcontactsOrganizationsSchemaVersionsRequest(schemaId));
  }

  /**
   * Get all versions of an external organization's schema
   * 
   * @param schemaId Schema ID (required)
   * @return DataSchemaListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchemaListing> getExternalcontactsOrganizationsSchemaVersionsWithHttpInfo(String schemaId) throws IOException {
    return getExternalcontactsOrganizationsSchemaVersions(createGetExternalcontactsOrganizationsSchemaVersionsRequest(schemaId).withHttpInfo());
  }

  private GetExternalcontactsOrganizationsSchemaVersionsRequest createGetExternalcontactsOrganizationsSchemaVersionsRequest(String schemaId) {
    return GetExternalcontactsOrganizationsSchemaVersionsRequest.builder()
            .withSchemaId(schemaId)

            .build();
  }

  /**
   * Get all versions of an external organization's schema
   * 
   * @param request The request object
   * @return DataSchemaListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataSchemaListing getExternalcontactsOrganizationsSchemaVersions(GetExternalcontactsOrganizationsSchemaVersionsRequest request) throws IOException, ApiException {
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
   * Get all versions of an external organization's schema
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataSchemaListing> getExternalcontactsOrganizationsSchemaVersions(ApiRequest<Void> request) throws IOException {
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
   * Get a specific named core type.
   * 
   * @param coreTypeName Name of the core type (required)
   * @return Coretype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Coretype getExternalcontactsOrganizationsSchemasCoretype(String coreTypeName) throws IOException, ApiException {
    return  getExternalcontactsOrganizationsSchemasCoretype(createGetExternalcontactsOrganizationsSchemasCoretypeRequest(coreTypeName));
  }

  /**
   * Get a specific named core type.
   * 
   * @param coreTypeName Name of the core type (required)
   * @return Coretype
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Coretype> getExternalcontactsOrganizationsSchemasCoretypeWithHttpInfo(String coreTypeName) throws IOException {
    return getExternalcontactsOrganizationsSchemasCoretype(createGetExternalcontactsOrganizationsSchemasCoretypeRequest(coreTypeName).withHttpInfo());
  }

  private GetExternalcontactsOrganizationsSchemasCoretypeRequest createGetExternalcontactsOrganizationsSchemasCoretypeRequest(String coreTypeName) {
    return GetExternalcontactsOrganizationsSchemasCoretypeRequest.builder()
            .withCoreTypeName(coreTypeName)

            .build();
  }

  /**
   * Get a specific named core type.
   * 
   * @param request The request object
   * @return Coretype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Coretype getExternalcontactsOrganizationsSchemasCoretype(GetExternalcontactsOrganizationsSchemasCoretypeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Coretype> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Coretype>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a specific named core type.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Coretype> getExternalcontactsOrganizationsSchemasCoretype(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Coretype>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)exception;
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
      ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @return CoretypeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoretypeListing getExternalcontactsOrganizationsSchemasCoretypes() throws IOException, ApiException {
    return  getExternalcontactsOrganizationsSchemasCoretypes(createGetExternalcontactsOrganizationsSchemasCoretypesRequest());
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @return CoretypeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoretypeListing> getExternalcontactsOrganizationsSchemasCoretypesWithHttpInfo() throws IOException {
    return getExternalcontactsOrganizationsSchemasCoretypes(createGetExternalcontactsOrganizationsSchemasCoretypesRequest().withHttpInfo());
  }

  private GetExternalcontactsOrganizationsSchemasCoretypesRequest createGetExternalcontactsOrganizationsSchemasCoretypesRequest() {
    return GetExternalcontactsOrganizationsSchemasCoretypesRequest.builder()
            .build();
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @param request The request object
   * @return CoretypeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoretypeListing getExternalcontactsOrganizationsSchemasCoretypes(GetExternalcontactsOrganizationsSchemasCoretypesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoretypeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoretypeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoretypeListing> getExternalcontactsOrganizationsSchemasCoretypes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoretypeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @return SchemaQuantityLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SchemaQuantityLimits getExternalcontactsOrganizationsSchemasLimits() throws IOException, ApiException {
    return  getExternalcontactsOrganizationsSchemasLimits(createGetExternalcontactsOrganizationsSchemasLimitsRequest());
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @return SchemaQuantityLimits
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SchemaQuantityLimits> getExternalcontactsOrganizationsSchemasLimitsWithHttpInfo() throws IOException {
    return getExternalcontactsOrganizationsSchemasLimits(createGetExternalcontactsOrganizationsSchemasLimitsRequest().withHttpInfo());
  }

  private GetExternalcontactsOrganizationsSchemasLimitsRequest createGetExternalcontactsOrganizationsSchemasLimitsRequest() {
    return GetExternalcontactsOrganizationsSchemasLimitsRequest.builder()
            .build();
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @param request The request object
   * @return SchemaQuantityLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SchemaQuantityLimits getExternalcontactsOrganizationsSchemasLimits(GetExternalcontactsOrganizationsSchemasLimitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SchemaQuantityLimits> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SchemaQuantityLimits>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SchemaQuantityLimits> getExternalcontactsOrganizationsSchemasLimits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SchemaQuantityLimits>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SchemaQuantityLimits> response = (ApiResponse<SchemaQuantityLimits>)(ApiResponse<?>)exception;
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
      ApiResponse<SchemaQuantityLimits> response = (ApiResponse<SchemaQuantityLimits>)(ApiResponse<?>)(new ApiException(exception));
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
  public Relationship getExternalcontactsRelationship(String relationshipId, List<String> expand) throws IOException, ApiException {
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
  public ApiResponse<Relationship> getExternalcontactsRelationshipWithHttpInfo(String relationshipId, List<String> expand) throws IOException {
    return getExternalcontactsRelationship(createGetExternalcontactsRelationshipRequest(relationshipId, expand).withHttpInfo());
  }

  private GetExternalcontactsRelationshipRequest createGetExternalcontactsRelationshipRequest(String relationshipId, List<String> expand) {
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
   * Look up contacts based on an attribute. Maximum of 25 values returned.
   * 
   * @param lookupVal User supplied value to lookup contacts (supports email addresses, e164 phone numbers, Twitter screen names) (required)
   * @param expand which field, if any, to expand (optional)
   * @param divisionId Specifies which division to lookup contacts in, for the given lookup value (optional, default to *)
   * @return ReverseWhitepagesLookupResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReverseWhitepagesLookupResult getExternalcontactsReversewhitepageslookup(String lookupVal, List<String> expand, String divisionId) throws IOException, ApiException {
    return  getExternalcontactsReversewhitepageslookup(createGetExternalcontactsReversewhitepageslookupRequest(lookupVal, expand, divisionId));
  }

  /**
   * Look up contacts based on an attribute. Maximum of 25 values returned.
   * 
   * @param lookupVal User supplied value to lookup contacts (supports email addresses, e164 phone numbers, Twitter screen names) (required)
   * @param expand which field, if any, to expand (optional)
   * @param divisionId Specifies which division to lookup contacts in, for the given lookup value (optional, default to *)
   * @return ReverseWhitepagesLookupResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReverseWhitepagesLookupResult> getExternalcontactsReversewhitepageslookupWithHttpInfo(String lookupVal, List<String> expand, String divisionId) throws IOException {
    return getExternalcontactsReversewhitepageslookup(createGetExternalcontactsReversewhitepageslookupRequest(lookupVal, expand, divisionId).withHttpInfo());
  }

  private GetExternalcontactsReversewhitepageslookupRequest createGetExternalcontactsReversewhitepageslookupRequest(String lookupVal, List<String> expand, String divisionId) {
    return GetExternalcontactsReversewhitepageslookupRequest.builder()
            .withLookupVal(lookupVal)

            .withExpand(expand)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Look up contacts based on an attribute. Maximum of 25 values returned.
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
   * Look up contacts based on an attribute. Maximum of 25 values returned.
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
   * @param limit The number of contacts per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @param divisionId The division to scan over (optional, default to *)
   * @return CursorContactListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorContactListing getExternalcontactsScanContacts(Integer limit, String cursor, String divisionId) throws IOException, ApiException {
    return  getExternalcontactsScanContacts(createGetExternalcontactsScanContactsRequest(limit, cursor, divisionId));
  }

  /**
   * Scan for external contacts using paging
   * 
   * @param limit The number of contacts per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @param divisionId The division to scan over (optional, default to *)
   * @return CursorContactListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorContactListing> getExternalcontactsScanContactsWithHttpInfo(Integer limit, String cursor, String divisionId) throws IOException {
    return getExternalcontactsScanContacts(createGetExternalcontactsScanContactsRequest(limit, cursor, divisionId).withHttpInfo());
  }

  private GetExternalcontactsScanContactsRequest createGetExternalcontactsScanContactsRequest(Integer limit, String cursor, String divisionId) {
    return GetExternalcontactsScanContactsRequest.builder()
            .withLimit(limit)

            .withCursor(cursor)

            .withDivisionId(divisionId)

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
   * Scan for external contacts using paging
   * 
   * @param limit The number of contacts per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorContactListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorContactListing getExternalcontactsScanContactsDivisionviewsAll(Integer limit, String cursor) throws IOException, ApiException {
    return  getExternalcontactsScanContactsDivisionviewsAll(createGetExternalcontactsScanContactsDivisionviewsAllRequest(limit, cursor));
  }

  /**
   * Scan for external contacts using paging
   * 
   * @param limit The number of contacts per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorContactListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorContactListing> getExternalcontactsScanContactsDivisionviewsAllWithHttpInfo(Integer limit, String cursor) throws IOException {
    return getExternalcontactsScanContactsDivisionviewsAll(createGetExternalcontactsScanContactsDivisionviewsAllRequest(limit, cursor).withHttpInfo());
  }

  private GetExternalcontactsScanContactsDivisionviewsAllRequest createGetExternalcontactsScanContactsDivisionviewsAllRequest(Integer limit, String cursor) {
    return GetExternalcontactsScanContactsDivisionviewsAllRequest.builder()
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
  public CursorContactListing getExternalcontactsScanContactsDivisionviewsAll(GetExternalcontactsScanContactsDivisionviewsAllRequest request) throws IOException, ApiException {
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
  public ApiResponse<CursorContactListing> getExternalcontactsScanContactsDivisionviewsAll(ApiRequest<Void> request) throws IOException {
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
   * @param limit The number of notes per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @param divisionId The division to scan over (optional, default to *)
   * @return CursorNoteListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorNoteListing getExternalcontactsScanNotes(Integer limit, String cursor, String divisionId) throws IOException, ApiException {
    return  getExternalcontactsScanNotes(createGetExternalcontactsScanNotesRequest(limit, cursor, divisionId));
  }

  /**
   * Scan for notes using paging
   * 
   * @param limit The number of notes per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @param divisionId The division to scan over (optional, default to *)
   * @return CursorNoteListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorNoteListing> getExternalcontactsScanNotesWithHttpInfo(Integer limit, String cursor, String divisionId) throws IOException {
    return getExternalcontactsScanNotes(createGetExternalcontactsScanNotesRequest(limit, cursor, divisionId).withHttpInfo());
  }

  private GetExternalcontactsScanNotesRequest createGetExternalcontactsScanNotesRequest(Integer limit, String cursor, String divisionId) {
    return GetExternalcontactsScanNotesRequest.builder()
            .withLimit(limit)

            .withCursor(cursor)

            .withDivisionId(divisionId)

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
   * Scan for notes using paging
   * 
   * @param limit The number of notes per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorNoteListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorNoteListing getExternalcontactsScanNotesDivisionviewsAll(Integer limit, String cursor) throws IOException, ApiException {
    return  getExternalcontactsScanNotesDivisionviewsAll(createGetExternalcontactsScanNotesDivisionviewsAllRequest(limit, cursor));
  }

  /**
   * Scan for notes using paging
   * 
   * @param limit The number of notes per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorNoteListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorNoteListing> getExternalcontactsScanNotesDivisionviewsAllWithHttpInfo(Integer limit, String cursor) throws IOException {
    return getExternalcontactsScanNotesDivisionviewsAll(createGetExternalcontactsScanNotesDivisionviewsAllRequest(limit, cursor).withHttpInfo());
  }

  private GetExternalcontactsScanNotesDivisionviewsAllRequest createGetExternalcontactsScanNotesDivisionviewsAllRequest(Integer limit, String cursor) {
    return GetExternalcontactsScanNotesDivisionviewsAllRequest.builder()
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
  public CursorNoteListing getExternalcontactsScanNotesDivisionviewsAll(GetExternalcontactsScanNotesDivisionviewsAllRequest request) throws IOException, ApiException {
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
  public ApiResponse<CursorNoteListing> getExternalcontactsScanNotesDivisionviewsAll(ApiRequest<Void> request) throws IOException {
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
   * @param limit The number of organizations per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @param divisionId The division to scan over (optional, default to *)
   * @return CursorOrganizationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorOrganizationListing getExternalcontactsScanOrganizations(Integer limit, String cursor, String divisionId) throws IOException, ApiException {
    return  getExternalcontactsScanOrganizations(createGetExternalcontactsScanOrganizationsRequest(limit, cursor, divisionId));
  }

  /**
   * Scan for external organizations using paging
   * 
   * @param limit The number of organizations per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @param divisionId The division to scan over (optional, default to *)
   * @return CursorOrganizationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorOrganizationListing> getExternalcontactsScanOrganizationsWithHttpInfo(Integer limit, String cursor, String divisionId) throws IOException {
    return getExternalcontactsScanOrganizations(createGetExternalcontactsScanOrganizationsRequest(limit, cursor, divisionId).withHttpInfo());
  }

  private GetExternalcontactsScanOrganizationsRequest createGetExternalcontactsScanOrganizationsRequest(Integer limit, String cursor, String divisionId) {
    return GetExternalcontactsScanOrganizationsRequest.builder()
            .withLimit(limit)

            .withCursor(cursor)

            .withDivisionId(divisionId)

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
   * Scan for external organizations using paging
   * 
   * @param limit The number of organizations per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorOrganizationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorOrganizationListing getExternalcontactsScanOrganizationsDivisionviewsAll(Integer limit, String cursor) throws IOException, ApiException {
    return  getExternalcontactsScanOrganizationsDivisionviewsAll(createGetExternalcontactsScanOrganizationsDivisionviewsAllRequest(limit, cursor));
  }

  /**
   * Scan for external organizations using paging
   * 
   * @param limit The number of organizations per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorOrganizationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorOrganizationListing> getExternalcontactsScanOrganizationsDivisionviewsAllWithHttpInfo(Integer limit, String cursor) throws IOException {
    return getExternalcontactsScanOrganizationsDivisionviewsAll(createGetExternalcontactsScanOrganizationsDivisionviewsAllRequest(limit, cursor).withHttpInfo());
  }

  private GetExternalcontactsScanOrganizationsDivisionviewsAllRequest createGetExternalcontactsScanOrganizationsDivisionviewsAllRequest(Integer limit, String cursor) {
    return GetExternalcontactsScanOrganizationsDivisionviewsAllRequest.builder()
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
  public CursorOrganizationListing getExternalcontactsScanOrganizationsDivisionviewsAll(GetExternalcontactsScanOrganizationsDivisionviewsAllRequest request) throws IOException, ApiException {
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
  public ApiResponse<CursorOrganizationListing> getExternalcontactsScanOrganizationsDivisionviewsAll(ApiRequest<Void> request) throws IOException {
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
   * @param limit The number of relationships per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @param divisionId The division to scan over (optional, default to *)
   * @return CursorRelationshipListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorRelationshipListing getExternalcontactsScanRelationships(Integer limit, String cursor, String divisionId) throws IOException, ApiException {
    return  getExternalcontactsScanRelationships(createGetExternalcontactsScanRelationshipsRequest(limit, cursor, divisionId));
  }

  /**
   * Scan for relationships
   * 
   * @param limit The number of relationships per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @param divisionId The division to scan over (optional, default to *)
   * @return CursorRelationshipListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorRelationshipListing> getExternalcontactsScanRelationshipsWithHttpInfo(Integer limit, String cursor, String divisionId) throws IOException {
    return getExternalcontactsScanRelationships(createGetExternalcontactsScanRelationshipsRequest(limit, cursor, divisionId).withHttpInfo());
  }

  private GetExternalcontactsScanRelationshipsRequest createGetExternalcontactsScanRelationshipsRequest(Integer limit, String cursor, String divisionId) {
    return GetExternalcontactsScanRelationshipsRequest.builder()
            .withLimit(limit)

            .withCursor(cursor)

            .withDivisionId(divisionId)

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
   * Scan for relationships
   * 
   * @param limit The number of relationships per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorRelationshipListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CursorRelationshipListing getExternalcontactsScanRelationshipsDivisionviewsAll(Integer limit, String cursor) throws IOException, ApiException {
    return  getExternalcontactsScanRelationshipsDivisionviewsAll(createGetExternalcontactsScanRelationshipsDivisionviewsAllRequest(limit, cursor));
  }

  /**
   * Scan for relationships
   * 
   * @param limit The number of relationships per page; must be between 10 and 200, default is 100 (optional)
   * @param cursor Indicates where to resume query results (not required for first page), each page returns a new cursor with a 24h TTL (optional)
   * @return CursorRelationshipListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CursorRelationshipListing> getExternalcontactsScanRelationshipsDivisionviewsAllWithHttpInfo(Integer limit, String cursor) throws IOException {
    return getExternalcontactsScanRelationshipsDivisionviewsAll(createGetExternalcontactsScanRelationshipsDivisionviewsAllRequest(limit, cursor).withHttpInfo());
  }

  private GetExternalcontactsScanRelationshipsDivisionviewsAllRequest createGetExternalcontactsScanRelationshipsDivisionviewsAllRequest(Integer limit, String cursor) {
    return GetExternalcontactsScanRelationshipsDivisionviewsAllRequest.builder()
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
  public CursorRelationshipListing getExternalcontactsScanRelationshipsDivisionviewsAll(GetExternalcontactsScanRelationshipsDivisionviewsAllRequest request) throws IOException, ApiException {
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
  public ApiResponse<CursorRelationshipListing> getExternalcontactsScanRelationshipsDivisionviewsAll(ApiRequest<Void> request) throws IOException {
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
   * Claim or release identifiers for a contact
   * 
   * @param contactId ExternalContact ID (required)
   * @param body ClaimRequest (required)
   * @return ContactIdentifier
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactIdentifier patchExternalcontactsContactIdentifiers(String contactId, IdentifierClaimRequest body) throws IOException, ApiException {
    return  patchExternalcontactsContactIdentifiers(createPatchExternalcontactsContactIdentifiersRequest(contactId, body));
  }

  /**
   * Claim or release identifiers for a contact
   * 
   * @param contactId ExternalContact ID (required)
   * @param body ClaimRequest (required)
   * @return ContactIdentifier
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactIdentifier> patchExternalcontactsContactIdentifiersWithHttpInfo(String contactId, IdentifierClaimRequest body) throws IOException {
    return patchExternalcontactsContactIdentifiers(createPatchExternalcontactsContactIdentifiersRequest(contactId, body).withHttpInfo());
  }

  private PatchExternalcontactsContactIdentifiersRequest createPatchExternalcontactsContactIdentifiersRequest(String contactId, IdentifierClaimRequest body) {
    return PatchExternalcontactsContactIdentifiersRequest.builder()
            .withContactId(contactId)

            .withBody(body)

            .build();
  }

  /**
   * Claim or release identifiers for a contact
   * 
   * @param request The request object
   * @return ContactIdentifier
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactIdentifier patchExternalcontactsContactIdentifiers(PatchExternalcontactsContactIdentifiersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactIdentifier> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactIdentifier>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Claim or release identifiers for a contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactIdentifier> patchExternalcontactsContactIdentifiers(ApiRequest<IdentifierClaimRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactIdentifier>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactIdentifier> response = (ApiResponse<ContactIdentifier>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactIdentifier> response = (ApiResponse<ContactIdentifier>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Claim or release identifiers for an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param body ClaimRequest (required)
   * @return ExternalOrganizationIdentifier
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganizationIdentifier patchExternalcontactsOrganizationIdentifiers(String externalOrganizationId, ExternalOrganizationIdentifierClaimRequest body) throws IOException, ApiException {
    return  patchExternalcontactsOrganizationIdentifiers(createPatchExternalcontactsOrganizationIdentifiersRequest(externalOrganizationId, body));
  }

  /**
   * Claim or release identifiers for an external organization
   * 
   * @param externalOrganizationId External Organization ID (required)
   * @param body ClaimRequest (required)
   * @return ExternalOrganizationIdentifier
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganizationIdentifier> patchExternalcontactsOrganizationIdentifiersWithHttpInfo(String externalOrganizationId, ExternalOrganizationIdentifierClaimRequest body) throws IOException {
    return patchExternalcontactsOrganizationIdentifiers(createPatchExternalcontactsOrganizationIdentifiersRequest(externalOrganizationId, body).withHttpInfo());
  }

  private PatchExternalcontactsOrganizationIdentifiersRequest createPatchExternalcontactsOrganizationIdentifiersRequest(String externalOrganizationId, ExternalOrganizationIdentifierClaimRequest body) {
    return PatchExternalcontactsOrganizationIdentifiersRequest.builder()
            .withExternalOrganizationId(externalOrganizationId)

            .withBody(body)

            .build();
  }

  /**
   * Claim or release identifiers for an external organization
   * 
   * @param request The request object
   * @return ExternalOrganizationIdentifier
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganizationIdentifier patchExternalcontactsOrganizationIdentifiers(PatchExternalcontactsOrganizationIdentifiersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalOrganizationIdentifier> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalOrganizationIdentifier>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Claim or release identifiers for an external organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganizationIdentifier> patchExternalcontactsOrganizationIdentifiers(ApiRequest<ExternalOrganizationIdentifierClaimRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalOrganizationIdentifier>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalOrganizationIdentifier> response = (ApiResponse<ExternalOrganizationIdentifier>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalOrganizationIdentifier> response = (ApiResponse<ExternalOrganizationIdentifier>)(ApiResponse<?>)(new ApiException(exception));
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
   * Bulk fetch contacts across divisions
   * 
   * @param body Contact ids (required)
   * @return BulkFetchContactsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchContactsResponse postExternalcontactsBulkContactsDivisionviews(BulkIdsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkContactsDivisionviews(createPostExternalcontactsBulkContactsDivisionviewsRequest(body));
  }

  /**
   * Bulk fetch contacts across divisions
   * 
   * @param body Contact ids (required)
   * @return BulkFetchContactsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchContactsResponse> postExternalcontactsBulkContactsDivisionviewsWithHttpInfo(BulkIdsRequest body) throws IOException {
    return postExternalcontactsBulkContactsDivisionviews(createPostExternalcontactsBulkContactsDivisionviewsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkContactsDivisionviewsRequest createPostExternalcontactsBulkContactsDivisionviewsRequest(BulkIdsRequest body) {
    return PostExternalcontactsBulkContactsDivisionviewsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Bulk fetch contacts across divisions
   * 
   * @param request The request object
   * @return BulkFetchContactsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchContactsResponse postExternalcontactsBulkContactsDivisionviews(PostExternalcontactsBulkContactsDivisionviewsRequest request) throws IOException, ApiException {
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
   * Bulk fetch contacts across divisions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchContactsResponse> postExternalcontactsBulkContactsDivisionviews(ApiRequest<BulkIdsRequest> request) throws IOException {
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
   * Bulk Enrich Contacts - Run up to 10 Enrich operations per request
   * See the API endpoint /externalcontacts/contacts/enrich for docs on individual Enrich operations.
   * @param body Contact Enrich Requests (required)
   * @param dryRun If true, the request will not make any modifications, but will show you what the end result *would* be. (optional)
   * @return BulkContactsEnrichResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkContactsEnrichResponse postExternalcontactsBulkContactsEnrich(BulkContactsEnrichRequest body, Boolean dryRun) throws IOException, ApiException {
    return  postExternalcontactsBulkContactsEnrich(createPostExternalcontactsBulkContactsEnrichRequest(body, dryRun));
  }

  /**
   * Bulk Enrich Contacts - Run up to 10 Enrich operations per request
   * See the API endpoint /externalcontacts/contacts/enrich for docs on individual Enrich operations.
   * @param body Contact Enrich Requests (required)
   * @param dryRun If true, the request will not make any modifications, but will show you what the end result *would* be. (optional)
   * @return BulkContactsEnrichResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkContactsEnrichResponse> postExternalcontactsBulkContactsEnrichWithHttpInfo(BulkContactsEnrichRequest body, Boolean dryRun) throws IOException {
    return postExternalcontactsBulkContactsEnrich(createPostExternalcontactsBulkContactsEnrichRequest(body, dryRun).withHttpInfo());
  }

  private PostExternalcontactsBulkContactsEnrichRequest createPostExternalcontactsBulkContactsEnrichRequest(BulkContactsEnrichRequest body, Boolean dryRun) {
    return PostExternalcontactsBulkContactsEnrichRequest.builder()
            .withBody(body)

            .withDryRun(dryRun)

            .build();
  }

  /**
   * Bulk Enrich Contacts - Run up to 10 Enrich operations per request
   * See the API endpoint /externalcontacts/contacts/enrich for docs on individual Enrich operations.
   * @param request The request object
   * @return BulkContactsEnrichResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkContactsEnrichResponse postExternalcontactsBulkContactsEnrich(PostExternalcontactsBulkContactsEnrichRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkContactsEnrichResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkContactsEnrichResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk Enrich Contacts - Run up to 10 Enrich operations per request
   * See the API endpoint /externalcontacts/contacts/enrich for docs on individual Enrich operations.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkContactsEnrichResponse> postExternalcontactsBulkContactsEnrich(ApiRequest<BulkContactsEnrichRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkContactsEnrichResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkContactsEnrichResponse> response = (ApiResponse<BulkContactsEnrichResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkContactsEnrichResponse> response = (ApiResponse<BulkContactsEnrichResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Bulk fetch unresolved ancestor contacts
   * 
   * @param body Contact ids (required)
   * @return BulkFetchContactsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchContactsResponse postExternalcontactsBulkContactsUnresolved(BulkIdsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkContactsUnresolved(createPostExternalcontactsBulkContactsUnresolvedRequest(body));
  }

  /**
   * Bulk fetch unresolved ancestor contacts
   * 
   * @param body Contact ids (required)
   * @return BulkFetchContactsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchContactsResponse> postExternalcontactsBulkContactsUnresolvedWithHttpInfo(BulkIdsRequest body) throws IOException {
    return postExternalcontactsBulkContactsUnresolved(createPostExternalcontactsBulkContactsUnresolvedRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkContactsUnresolvedRequest createPostExternalcontactsBulkContactsUnresolvedRequest(BulkIdsRequest body) {
    return PostExternalcontactsBulkContactsUnresolvedRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Bulk fetch unresolved ancestor contacts
   * 
   * @param request The request object
   * @return BulkFetchContactsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchContactsResponse postExternalcontactsBulkContactsUnresolved(PostExternalcontactsBulkContactsUnresolvedRequest request) throws IOException, ApiException {
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
   * Bulk fetch unresolved ancestor contacts
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchContactsResponse> postExternalcontactsBulkContactsUnresolved(ApiRequest<BulkIdsRequest> request) throws IOException {
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
   * Bulk fetch organizations across divisions
   * 
   * @param body Organizations ids (required)
   * @return BulkFetchOrganizationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchOrganizationsResponse postExternalcontactsBulkOrganizationsDivisionviews(BulkIdsRequest body) throws IOException, ApiException {
    return  postExternalcontactsBulkOrganizationsDivisionviews(createPostExternalcontactsBulkOrganizationsDivisionviewsRequest(body));
  }

  /**
   * Bulk fetch organizations across divisions
   * 
   * @param body Organizations ids (required)
   * @return BulkFetchOrganizationsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchOrganizationsResponse> postExternalcontactsBulkOrganizationsDivisionviewsWithHttpInfo(BulkIdsRequest body) throws IOException {
    return postExternalcontactsBulkOrganizationsDivisionviews(createPostExternalcontactsBulkOrganizationsDivisionviewsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsBulkOrganizationsDivisionviewsRequest createPostExternalcontactsBulkOrganizationsDivisionviewsRequest(BulkIdsRequest body) {
    return PostExternalcontactsBulkOrganizationsDivisionviewsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Bulk fetch organizations across divisions
   * 
   * @param request The request object
   * @return BulkFetchOrganizationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkFetchOrganizationsResponse postExternalcontactsBulkOrganizationsDivisionviews(PostExternalcontactsBulkOrganizationsDivisionviewsRequest request) throws IOException, ApiException {
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
   * Bulk fetch organizations across divisions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkFetchOrganizationsResponse> postExternalcontactsBulkOrganizationsDivisionviews(ApiRequest<BulkIdsRequest> request) throws IOException {
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
   * Bulk enrich external organizations - Run up to 10 Enrich operations per request
   * See the API endpoint /externalcontacts/organizations/enrich for docs on individual Enrich operations.
   * @param body External Organization Enrich Requests (required)
   * @param dryRun If true, the request will not make any modifications, but will show you what the end result *would* be. (optional)
   * @return BulkOrganizationsEnrichResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkOrganizationsEnrichResponse postExternalcontactsBulkOrganizationsEnrich(BulkOrganizationsEnrichRequest body, Boolean dryRun) throws IOException, ApiException {
    return  postExternalcontactsBulkOrganizationsEnrich(createPostExternalcontactsBulkOrganizationsEnrichRequest(body, dryRun));
  }

  /**
   * Bulk enrich external organizations - Run up to 10 Enrich operations per request
   * See the API endpoint /externalcontacts/organizations/enrich for docs on individual Enrich operations.
   * @param body External Organization Enrich Requests (required)
   * @param dryRun If true, the request will not make any modifications, but will show you what the end result *would* be. (optional)
   * @return BulkOrganizationsEnrichResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkOrganizationsEnrichResponse> postExternalcontactsBulkOrganizationsEnrichWithHttpInfo(BulkOrganizationsEnrichRequest body, Boolean dryRun) throws IOException {
    return postExternalcontactsBulkOrganizationsEnrich(createPostExternalcontactsBulkOrganizationsEnrichRequest(body, dryRun).withHttpInfo());
  }

  private PostExternalcontactsBulkOrganizationsEnrichRequest createPostExternalcontactsBulkOrganizationsEnrichRequest(BulkOrganizationsEnrichRequest body, Boolean dryRun) {
    return PostExternalcontactsBulkOrganizationsEnrichRequest.builder()
            .withBody(body)

            .withDryRun(dryRun)

            .build();
  }

  /**
   * Bulk enrich external organizations - Run up to 10 Enrich operations per request
   * See the API endpoint /externalcontacts/organizations/enrich for docs on individual Enrich operations.
   * @param request The request object
   * @return BulkOrganizationsEnrichResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkOrganizationsEnrichResponse postExternalcontactsBulkOrganizationsEnrich(PostExternalcontactsBulkOrganizationsEnrichRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkOrganizationsEnrichResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkOrganizationsEnrichResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk enrich external organizations - Run up to 10 Enrich operations per request
   * See the API endpoint /externalcontacts/organizations/enrich for docs on individual Enrich operations.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkOrganizationsEnrichResponse> postExternalcontactsBulkOrganizationsEnrich(ApiRequest<BulkOrganizationsEnrichRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkOrganizationsEnrichResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkOrganizationsEnrichResponse> response = (ApiResponse<BulkOrganizationsEnrichResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkOrganizationsEnrichResponse> response = (ApiResponse<BulkOrganizationsEnrichResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Assign/Unassign up to 10 segments to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment. Any unprocessed segment assignments are returned in the body for the client to retry, in the event of a partial success.
   * 
   * @param contactId ExternalContact ID (required)
   * @param body  (optional)
   * @return UpdateSegmentAssignmentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UpdateSegmentAssignmentResponse postExternalcontactsContactJourneySegments(String contactId, UpdateSegmentAssignmentRequest body) throws IOException, ApiException {
    return  postExternalcontactsContactJourneySegments(createPostExternalcontactsContactJourneySegmentsRequest(contactId, body));
  }

  /**
   * Assign/Unassign up to 10 segments to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment. Any unprocessed segment assignments are returned in the body for the client to retry, in the event of a partial success.
   * 
   * @param contactId ExternalContact ID (required)
   * @param body  (optional)
   * @return UpdateSegmentAssignmentResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UpdateSegmentAssignmentResponse> postExternalcontactsContactJourneySegmentsWithHttpInfo(String contactId, UpdateSegmentAssignmentRequest body) throws IOException {
    return postExternalcontactsContactJourneySegments(createPostExternalcontactsContactJourneySegmentsRequest(contactId, body).withHttpInfo());
  }

  private PostExternalcontactsContactJourneySegmentsRequest createPostExternalcontactsContactJourneySegmentsRequest(String contactId, UpdateSegmentAssignmentRequest body) {
    return PostExternalcontactsContactJourneySegmentsRequest.builder()
            .withContactId(contactId)

            .withBody(body)

            .build();
  }

  /**
   * Assign/Unassign up to 10 segments to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment. Any unprocessed segment assignments are returned in the body for the client to retry, in the event of a partial success.
   * 
   * @param request The request object
   * @return UpdateSegmentAssignmentResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UpdateSegmentAssignmentResponse postExternalcontactsContactJourneySegments(PostExternalcontactsContactJourneySegmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UpdateSegmentAssignmentResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UpdateSegmentAssignmentResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Assign/Unassign up to 10 segments to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment. Any unprocessed segment assignments are returned in the body for the client to retry, in the event of a partial success.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UpdateSegmentAssignmentResponse> postExternalcontactsContactJourneySegments(ApiRequest<UpdateSegmentAssignmentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UpdateSegmentAssignmentResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UpdateSegmentAssignmentResponse> response = (ApiResponse<UpdateSegmentAssignmentResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UpdateSegmentAssignmentResponse> response = (ApiResponse<UpdateSegmentAssignmentResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Promote an observed contact (ephemeral or identified) to a curated contact
   * 
   * @param contactId ExternalContact ID (required)
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact postExternalcontactsContactPromotion(String contactId) throws IOException, ApiException {
    return  postExternalcontactsContactPromotion(createPostExternalcontactsContactPromotionRequest(contactId));
  }

  /**
   * Promote an observed contact (ephemeral or identified) to a curated contact
   * 
   * @param contactId ExternalContact ID (required)
   * @return ExternalContact
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> postExternalcontactsContactPromotionWithHttpInfo(String contactId) throws IOException {
    return postExternalcontactsContactPromotion(createPostExternalcontactsContactPromotionRequest(contactId).withHttpInfo());
  }

  private PostExternalcontactsContactPromotionRequest createPostExternalcontactsContactPromotionRequest(String contactId) {
    return PostExternalcontactsContactPromotionRequest.builder()
            .withContactId(contactId)

            .build();
  }

  /**
   * Promote an observed contact (ephemeral or identified) to a curated contact
   * 
   * @param request The request object
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact postExternalcontactsContactPromotion(PostExternalcontactsContactPromotionRequest request) throws IOException, ApiException {
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
   * Promote an observed contact (ephemeral or identified) to a curated contact
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> postExternalcontactsContactPromotion(ApiRequest<Void> request) throws IOException {
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
   * Modify or create an External Contact, with powerful behaviors for finding and combining data with pre-existing Contacts.
   * You may also submit multiple Enrich operations in one request via the Bulk Enrich API at /externalcontacts/bulk/contacts. A 201 response status indicates that a new Contact was created, whereas a 200 status indicates that a Contact was updated or a merge occurred.
   * @param body ContactEnrichRequest (required)
   * @param dryRun If true, the request will not make any modifications, but will show you what the end result *would* be. (optional)
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact postExternalcontactsContactsEnrich(ContactEnrichRequest body, Boolean dryRun) throws IOException, ApiException {
    return  postExternalcontactsContactsEnrich(createPostExternalcontactsContactsEnrichRequest(body, dryRun));
  }

  /**
   * Modify or create an External Contact, with powerful behaviors for finding and combining data with pre-existing Contacts.
   * You may also submit multiple Enrich operations in one request via the Bulk Enrich API at /externalcontacts/bulk/contacts. A 201 response status indicates that a new Contact was created, whereas a 200 status indicates that a Contact was updated or a merge occurred.
   * @param body ContactEnrichRequest (required)
   * @param dryRun If true, the request will not make any modifications, but will show you what the end result *would* be. (optional)
   * @return ExternalContact
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> postExternalcontactsContactsEnrichWithHttpInfo(ContactEnrichRequest body, Boolean dryRun) throws IOException {
    return postExternalcontactsContactsEnrich(createPostExternalcontactsContactsEnrichRequest(body, dryRun).withHttpInfo());
  }

  private PostExternalcontactsContactsEnrichRequest createPostExternalcontactsContactsEnrichRequest(ContactEnrichRequest body, Boolean dryRun) {
    return PostExternalcontactsContactsEnrichRequest.builder()
            .withBody(body)

            .withDryRun(dryRun)

            .build();
  }

  /**
   * Modify or create an External Contact, with powerful behaviors for finding and combining data with pre-existing Contacts.
   * You may also submit multiple Enrich operations in one request via the Bulk Enrich API at /externalcontacts/bulk/contacts. A 201 response status indicates that a new Contact was created, whereas a 200 status indicates that a Contact was updated or a merge occurred.
   * @param request The request object
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact postExternalcontactsContactsEnrich(PostExternalcontactsContactsEnrichRequest request) throws IOException, ApiException {
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
   * Modify or create an External Contact, with powerful behaviors for finding and combining data with pre-existing Contacts.
   * You may also submit multiple Enrich operations in one request via the Bulk Enrich API at /externalcontacts/bulk/contacts. A 201 response status indicates that a new Contact was created, whereas a 200 status indicates that a Contact was updated or a merge occurred.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> postExternalcontactsContactsEnrich(ApiRequest<ContactEnrichRequest> request) throws IOException {
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
   * Create bulk export
   * 
   * @param body Export (required)
   * @return ContactsExport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactsExport postExternalcontactsContactsExports(ContactsExport body) throws IOException, ApiException {
    return  postExternalcontactsContactsExports(createPostExternalcontactsContactsExportsRequest(body));
  }

  /**
   * Create bulk export
   * 
   * @param body Export (required)
   * @return ContactsExport
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactsExport> postExternalcontactsContactsExportsWithHttpInfo(ContactsExport body) throws IOException {
    return postExternalcontactsContactsExports(createPostExternalcontactsContactsExportsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsContactsExportsRequest createPostExternalcontactsContactsExportsRequest(ContactsExport body) {
    return PostExternalcontactsContactsExportsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create bulk export
   * 
   * @param request The request object
   * @return ContactsExport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactsExport postExternalcontactsContactsExports(PostExternalcontactsContactsExportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactsExport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactsExport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create bulk export
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactsExport> postExternalcontactsContactsExports(ApiRequest<ContactsExport> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactsExport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactsExport> response = (ApiResponse<ContactsExport>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactsExport> response = (ApiResponse<ContactsExport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Merge up to 25 contacts into a new contact record
   * Merge operation may fail if the resulting mergeset exceeds our default limit of 52. The valueOverride field lets you override any of the Contact fields post-merge. If any Contact field is left null in `valueOverride`, it will be taken from the most recently-modified contact in the merge set. Exception for *phone/*email fields: Conflicting data will be moved to any other available phone/email fields in the merged contact.
   * @param body MergeRequest (required)
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact postExternalcontactsContactsMerge(MergeContactsRequest body) throws IOException, ApiException {
    return  postExternalcontactsContactsMerge(createPostExternalcontactsContactsMergeRequest(body));
  }

  /**
   * Merge up to 25 contacts into a new contact record
   * Merge operation may fail if the resulting mergeset exceeds our default limit of 52. The valueOverride field lets you override any of the Contact fields post-merge. If any Contact field is left null in `valueOverride`, it will be taken from the most recently-modified contact in the merge set. Exception for *phone/*email fields: Conflicting data will be moved to any other available phone/email fields in the merged contact.
   * @param body MergeRequest (required)
   * @return ExternalContact
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> postExternalcontactsContactsMergeWithHttpInfo(MergeContactsRequest body) throws IOException {
    return postExternalcontactsContactsMerge(createPostExternalcontactsContactsMergeRequest(body).withHttpInfo());
  }

  private PostExternalcontactsContactsMergeRequest createPostExternalcontactsContactsMergeRequest(MergeContactsRequest body) {
    return PostExternalcontactsContactsMergeRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Merge up to 25 contacts into a new contact record
   * Merge operation may fail if the resulting mergeset exceeds our default limit of 52. The valueOverride field lets you override any of the Contact fields post-merge. If any Contact field is left null in `valueOverride`, it will be taken from the most recently-modified contact in the merge set. Exception for *phone/*email fields: Conflicting data will be moved to any other available phone/email fields in the merged contact.
   * @param request The request object
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact postExternalcontactsContactsMerge(PostExternalcontactsContactsMergeRequest request) throws IOException, ApiException {
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
   * Merge up to 25 contacts into a new contact record
   * Merge operation may fail if the resulting mergeset exceeds our default limit of 52. The valueOverride field lets you override any of the Contact fields post-merge. If any Contact field is left null in `valueOverride`, it will be taken from the most recently-modified contact in the merge set. Exception for *phone/*email fields: Conflicting data will be moved to any other available phone/email fields in the merged contact.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> postExternalcontactsContactsMerge(ApiRequest<MergeContactsRequest> request) throws IOException {
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
   * Create an External Source
   * 
   * @param body External Source (required)
   * @return ExternalSource
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalSource postExternalcontactsExternalsources(ExternalSource body) throws IOException, ApiException {
    return  postExternalcontactsExternalsources(createPostExternalcontactsExternalsourcesRequest(body));
  }

  /**
   * Create an External Source
   * 
   * @param body External Source (required)
   * @return ExternalSource
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalSource> postExternalcontactsExternalsourcesWithHttpInfo(ExternalSource body) throws IOException {
    return postExternalcontactsExternalsources(createPostExternalcontactsExternalsourcesRequest(body).withHttpInfo());
  }

  private PostExternalcontactsExternalsourcesRequest createPostExternalcontactsExternalsourcesRequest(ExternalSource body) {
    return PostExternalcontactsExternalsourcesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create an External Source
   * 
   * @param request The request object
   * @return ExternalSource
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalSource postExternalcontactsExternalsources(PostExternalcontactsExternalsourcesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalSource> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalSource>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an External Source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalSource> postExternalcontactsExternalsources(ApiRequest<ExternalSource> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalSource>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalSource> response = (ApiResponse<ExternalSource>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalSource> response = (ApiResponse<ExternalSource>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a contact using an identifier type and value.
   * NOTE: Deprecated. Please use /api/v2/externalcontacts/identifierlookup/contacts as an alternative endpoint instead. Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"
   * @param identifier  (required)
   * @param expand which field, if any, to expand (optional)
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ExternalContact postExternalcontactsIdentifierlookup(ContactIdentifier identifier, List<String> expand) throws IOException, ApiException {
    return  postExternalcontactsIdentifierlookup(createPostExternalcontactsIdentifierlookupRequest(identifier, expand));
  }

  /**
   * Fetch a contact using an identifier type and value.
   * NOTE: Deprecated. Please use /api/v2/externalcontacts/identifierlookup/contacts as an alternative endpoint instead. Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"
   * @param identifier  (required)
   * @param expand which field, if any, to expand (optional)
   * @return ExternalContact
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<ExternalContact> postExternalcontactsIdentifierlookupWithHttpInfo(ContactIdentifier identifier, List<String> expand) throws IOException {
    return postExternalcontactsIdentifierlookup(createPostExternalcontactsIdentifierlookupRequest(identifier, expand).withHttpInfo());
  }

  private PostExternalcontactsIdentifierlookupRequest createPostExternalcontactsIdentifierlookupRequest(ContactIdentifier identifier, List<String> expand) {
    return PostExternalcontactsIdentifierlookupRequest.builder()
            .withIdentifier(identifier)

            .withExpand(expand)

            .build();
  }

  /**
   * Fetch a contact using an identifier type and value.
   * NOTE: Deprecated. Please use /api/v2/externalcontacts/identifierlookup/contacts as an alternative endpoint instead. Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"
   * @param request The request object
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ExternalContact postExternalcontactsIdentifierlookup(PostExternalcontactsIdentifierlookupRequest request) throws IOException, ApiException {
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
   * Fetch a contact using an identifier type and value.
   * NOTE: Deprecated. Please use /api/v2/externalcontacts/identifierlookup/contacts as an alternative endpoint instead. Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<ExternalContact> postExternalcontactsIdentifierlookup(ApiRequest<ContactIdentifier> request) throws IOException {
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
   * Fetch a contact using an identifier type and value.
   * Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"
   * @param identifier  (required)
   * @param expand which field, if any, to expand (optional)
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact postExternalcontactsIdentifierlookupContacts(ContactIdentifier identifier, List<String> expand) throws IOException, ApiException {
    return  postExternalcontactsIdentifierlookupContacts(createPostExternalcontactsIdentifierlookupContactsRequest(identifier, expand));
  }

  /**
   * Fetch a contact using an identifier type and value.
   * Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"
   * @param identifier  (required)
   * @param expand which field, if any, to expand (optional)
   * @return ExternalContact
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> postExternalcontactsIdentifierlookupContactsWithHttpInfo(ContactIdentifier identifier, List<String> expand) throws IOException {
    return postExternalcontactsIdentifierlookupContacts(createPostExternalcontactsIdentifierlookupContactsRequest(identifier, expand).withHttpInfo());
  }

  private PostExternalcontactsIdentifierlookupContactsRequest createPostExternalcontactsIdentifierlookupContactsRequest(ContactIdentifier identifier, List<String> expand) {
    return PostExternalcontactsIdentifierlookupContactsRequest.builder()
            .withIdentifier(identifier)

            .withExpand(expand)

            .build();
  }

  /**
   * Fetch a contact using an identifier type and value.
   * Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"
   * @param request The request object
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalContact postExternalcontactsIdentifierlookupContacts(PostExternalcontactsIdentifierlookupContactsRequest request) throws IOException, ApiException {
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
   * Fetch a contact using an identifier type and value.
   * Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalContact> postExternalcontactsIdentifierlookupContacts(ApiRequest<ContactIdentifier> request) throws IOException {
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
   * Fetch an external organization using an identifier type and value.
   * This endpoint will only accept ExternalId type identifiers.
   * @param identifier  (required)
   * @param expand which field, if any, to expand (optional)
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization postExternalcontactsIdentifierlookupOrganizations(ExternalOrganizationIdentifier identifier, List<String> expand) throws IOException, ApiException {
    return  postExternalcontactsIdentifierlookupOrganizations(createPostExternalcontactsIdentifierlookupOrganizationsRequest(identifier, expand));
  }

  /**
   * Fetch an external organization using an identifier type and value.
   * This endpoint will only accept ExternalId type identifiers.
   * @param identifier  (required)
   * @param expand which field, if any, to expand (optional)
   * @return ExternalOrganization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> postExternalcontactsIdentifierlookupOrganizationsWithHttpInfo(ExternalOrganizationIdentifier identifier, List<String> expand) throws IOException {
    return postExternalcontactsIdentifierlookupOrganizations(createPostExternalcontactsIdentifierlookupOrganizationsRequest(identifier, expand).withHttpInfo());
  }

  private PostExternalcontactsIdentifierlookupOrganizationsRequest createPostExternalcontactsIdentifierlookupOrganizationsRequest(ExternalOrganizationIdentifier identifier, List<String> expand) {
    return PostExternalcontactsIdentifierlookupOrganizationsRequest.builder()
            .withIdentifier(identifier)

            .withExpand(expand)

            .build();
  }

  /**
   * Fetch an external organization using an identifier type and value.
   * This endpoint will only accept ExternalId type identifiers.
   * @param request The request object
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization postExternalcontactsIdentifierlookupOrganizations(PostExternalcontactsIdentifierlookupOrganizationsRequest request) throws IOException, ApiException {
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
   * Fetch an external organization using an identifier type and value.
   * This endpoint will only accept ExternalId type identifiers.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> postExternalcontactsIdentifierlookupOrganizations(ApiRequest<ExternalOrganizationIdentifier> request) throws IOException {
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
   * Create CSV import job
   * 
   * @param body ImportRequest (required)
   * @return CsvJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvJobResponse postExternalcontactsImportCsvJobs(CsvJobRequest body) throws IOException, ApiException {
    return  postExternalcontactsImportCsvJobs(createPostExternalcontactsImportCsvJobsRequest(body));
  }

  /**
   * Create CSV import job
   * 
   * @param body ImportRequest (required)
   * @return CsvJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvJobResponse> postExternalcontactsImportCsvJobsWithHttpInfo(CsvJobRequest body) throws IOException {
    return postExternalcontactsImportCsvJobs(createPostExternalcontactsImportCsvJobsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsImportCsvJobsRequest createPostExternalcontactsImportCsvJobsRequest(CsvJobRequest body) {
    return PostExternalcontactsImportCsvJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create CSV import job
   * 
   * @param request The request object
   * @return CsvJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvJobResponse postExternalcontactsImportCsvJobs(PostExternalcontactsImportCsvJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CsvJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CsvJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create CSV import job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvJobResponse> postExternalcontactsImportCsvJobs(ApiRequest<CsvJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CsvJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CsvJobResponse> response = (ApiResponse<CsvJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CsvJobResponse> response = (ApiResponse<CsvJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create settings for CSV import
   * 
   * @param body Settings (required)
   * @return CsvSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvSettings postExternalcontactsImportCsvSettings(CsvSettings body) throws IOException, ApiException {
    return  postExternalcontactsImportCsvSettings(createPostExternalcontactsImportCsvSettingsRequest(body));
  }

  /**
   * Create settings for CSV import
   * 
   * @param body Settings (required)
   * @return CsvSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvSettings> postExternalcontactsImportCsvSettingsWithHttpInfo(CsvSettings body) throws IOException {
    return postExternalcontactsImportCsvSettings(createPostExternalcontactsImportCsvSettingsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsImportCsvSettingsRequest createPostExternalcontactsImportCsvSettingsRequest(CsvSettings body) {
    return PostExternalcontactsImportCsvSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create settings for CSV import
   * 
   * @param request The request object
   * @return CsvSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvSettings postExternalcontactsImportCsvSettings(PostExternalcontactsImportCsvSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CsvSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CsvSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create settings for CSV import
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvSettings> postExternalcontactsImportCsvSettings(ApiRequest<CsvSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CsvSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CsvSettings> response = (ApiResponse<CsvSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<CsvSettings> response = (ApiResponse<CsvSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get url for CSV upload
   * 
   * @param body UploadRequest (required)
   * @return CsvUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvUploadResponse postExternalcontactsImportCsvUploads(CsvUploadRequest body) throws IOException, ApiException {
    return  postExternalcontactsImportCsvUploads(createPostExternalcontactsImportCsvUploadsRequest(body));
  }

  /**
   * Get url for CSV upload
   * 
   * @param body UploadRequest (required)
   * @return CsvUploadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvUploadResponse> postExternalcontactsImportCsvUploadsWithHttpInfo(CsvUploadRequest body) throws IOException {
    return postExternalcontactsImportCsvUploads(createPostExternalcontactsImportCsvUploadsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsImportCsvUploadsRequest createPostExternalcontactsImportCsvUploadsRequest(CsvUploadRequest body) {
    return PostExternalcontactsImportCsvUploadsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Get url for CSV upload
   * 
   * @param request The request object
   * @return CsvUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvUploadResponse postExternalcontactsImportCsvUploads(PostExternalcontactsImportCsvUploadsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CsvUploadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CsvUploadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get url for CSV upload
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvUploadResponse> postExternalcontactsImportCsvUploads(ApiRequest<CsvUploadRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CsvUploadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CsvUploadResponse> response = (ApiResponse<CsvUploadResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CsvUploadResponse> response = (ApiResponse<CsvUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new job
   * 
   * @param body Job (required)
   * @return ContactImportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportJobResponse postExternalcontactsImportJobs(ContactImportJobRequest body) throws IOException, ApiException {
    return  postExternalcontactsImportJobs(createPostExternalcontactsImportJobsRequest(body));
  }

  /**
   * Create a new job
   * 
   * @param body Job (required)
   * @return ContactImportJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportJobResponse> postExternalcontactsImportJobsWithHttpInfo(ContactImportJobRequest body) throws IOException {
    return postExternalcontactsImportJobs(createPostExternalcontactsImportJobsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsImportJobsRequest createPostExternalcontactsImportJobsRequest(ContactImportJobRequest body) {
    return PostExternalcontactsImportJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new job
   * 
   * @param request The request object
   * @return ContactImportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportJobResponse postExternalcontactsImportJobs(PostExternalcontactsImportJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactImportJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactImportJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportJobResponse> postExternalcontactsImportJobs(ApiRequest<ContactImportJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactImportJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactImportJobResponse> response = (ApiResponse<ContactImportJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactImportJobResponse> response = (ApiResponse<ContactImportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new settings
   * 
   * @param body Setting (required)
   * @return ContactImportSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportSettings postExternalcontactsImportSettings(ContactImportSettings body) throws IOException, ApiException {
    return  postExternalcontactsImportSettings(createPostExternalcontactsImportSettingsRequest(body));
  }

  /**
   * Create a new settings
   * 
   * @param body Setting (required)
   * @return ContactImportSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportSettings> postExternalcontactsImportSettingsWithHttpInfo(ContactImportSettings body) throws IOException {
    return postExternalcontactsImportSettings(createPostExternalcontactsImportSettingsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsImportSettingsRequest createPostExternalcontactsImportSettingsRequest(ContactImportSettings body) {
    return PostExternalcontactsImportSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new settings
   * 
   * @param request The request object
   * @return ContactImportSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportSettings postExternalcontactsImportSettings(PostExternalcontactsImportSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactImportSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactImportSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportSettings> postExternalcontactsImportSettings(ApiRequest<ContactImportSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactImportSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactImportSettings> response = (ApiResponse<ContactImportSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactImportSettings> response = (ApiResponse<ContactImportSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Merge two contacts into a new contact record
   * Two curated contacts cannot be merged. Refer to the Contact Merging article on the Developer Center for details. Deprecated: This API has been superseded by a new merge API. You are encouraged to instead use /api/v2/externalcontacts/contacts/merge, which supports merging up to 25 Contacts of any type, and overriding specific fields in the resulting Contact.
   * @param body MergeRequest (required)
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ExternalContact postExternalcontactsMergeContacts(MergeRequest body) throws IOException, ApiException {
    return  postExternalcontactsMergeContacts(createPostExternalcontactsMergeContactsRequest(body));
  }

  /**
   * Merge two contacts into a new contact record
   * Two curated contacts cannot be merged. Refer to the Contact Merging article on the Developer Center for details. Deprecated: This API has been superseded by a new merge API. You are encouraged to instead use /api/v2/externalcontacts/contacts/merge, which supports merging up to 25 Contacts of any type, and overriding specific fields in the resulting Contact.
   * @param body MergeRequest (required)
   * @return ExternalContact
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<ExternalContact> postExternalcontactsMergeContactsWithHttpInfo(MergeRequest body) throws IOException {
    return postExternalcontactsMergeContacts(createPostExternalcontactsMergeContactsRequest(body).withHttpInfo());
  }

  private PostExternalcontactsMergeContactsRequest createPostExternalcontactsMergeContactsRequest(MergeRequest body) {
    return PostExternalcontactsMergeContactsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Merge two contacts into a new contact record
   * Two curated contacts cannot be merged. Refer to the Contact Merging article on the Developer Center for details. Deprecated: This API has been superseded by a new merge API. You are encouraged to instead use /api/v2/externalcontacts/contacts/merge, which supports merging up to 25 Contacts of any type, and overriding specific fields in the resulting Contact.
   * @param request The request object
   * @return ExternalContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ExternalContact postExternalcontactsMergeContacts(PostExternalcontactsMergeContactsRequest request) throws IOException, ApiException {
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
   * Merge two contacts into a new contact record
   * Two curated contacts cannot be merged. Refer to the Contact Merging article on the Developer Center for details. Deprecated: This API has been superseded by a new merge API. You are encouraged to instead use /api/v2/externalcontacts/contacts/merge, which supports merging up to 25 Contacts of any type, and overriding specific fields in the resulting Contact.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<ExternalContact> postExternalcontactsMergeContacts(ApiRequest<MergeRequest> request) throws IOException {
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
   * Modify or create an External Org, with powerful behaviors for finding and combining data with pre-existing External Orgs.
   * You may also submit multiple Enrich operations in one request via the Bulk Enrich API at /externalcontacts/bulk/organizations. A 201 response status indicates that a new External Organization was created, whereas a 200 status indicates that an External Organization was updated
   * @param body ExternalOrgEnrichRequest (required)
   * @param dryRun If true, the request will not make any modifications, but will show you what the end result *would* be. (optional)
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization postExternalcontactsOrganizationsEnrich(ExternalOrganizationEnrichRequest body, Boolean dryRun) throws IOException, ApiException {
    return  postExternalcontactsOrganizationsEnrich(createPostExternalcontactsOrganizationsEnrichRequest(body, dryRun));
  }

  /**
   * Modify or create an External Org, with powerful behaviors for finding and combining data with pre-existing External Orgs.
   * You may also submit multiple Enrich operations in one request via the Bulk Enrich API at /externalcontacts/bulk/organizations. A 201 response status indicates that a new External Organization was created, whereas a 200 status indicates that an External Organization was updated
   * @param body ExternalOrgEnrichRequest (required)
   * @param dryRun If true, the request will not make any modifications, but will show you what the end result *would* be. (optional)
   * @return ExternalOrganization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> postExternalcontactsOrganizationsEnrichWithHttpInfo(ExternalOrganizationEnrichRequest body, Boolean dryRun) throws IOException {
    return postExternalcontactsOrganizationsEnrich(createPostExternalcontactsOrganizationsEnrichRequest(body, dryRun).withHttpInfo());
  }

  private PostExternalcontactsOrganizationsEnrichRequest createPostExternalcontactsOrganizationsEnrichRequest(ExternalOrganizationEnrichRequest body, Boolean dryRun) {
    return PostExternalcontactsOrganizationsEnrichRequest.builder()
            .withBody(body)

            .withDryRun(dryRun)

            .build();
  }

  /**
   * Modify or create an External Org, with powerful behaviors for finding and combining data with pre-existing External Orgs.
   * You may also submit multiple Enrich operations in one request via the Bulk Enrich API at /externalcontacts/bulk/organizations. A 201 response status indicates that a new External Organization was created, whereas a 200 status indicates that an External Organization was updated
   * @param request The request object
   * @return ExternalOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalOrganization postExternalcontactsOrganizationsEnrich(PostExternalcontactsOrganizationsEnrichRequest request) throws IOException, ApiException {
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
   * Modify or create an External Org, with powerful behaviors for finding and combining data with pre-existing External Orgs.
   * You may also submit multiple Enrich operations in one request via the Bulk Enrich API at /externalcontacts/bulk/organizations. A 201 response status indicates that a new External Organization was created, whereas a 200 status indicates that an External Organization was updated
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalOrganization> postExternalcontactsOrganizationsEnrich(ApiRequest<ExternalOrganizationEnrichRequest> request) throws IOException {
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
   * @param conversationId Conversation ID (required)
   * @param body ConversationAssociation (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putExternalcontactsConversation(String conversationId, ConversationAssociation body) throws IOException, ApiException {
     putExternalcontactsConversation(createPutExternalcontactsConversationRequest(conversationId, body));
  }

  /**
   * Associate/disassociate an external contact with a conversation
   * To associate, supply a value for the externalContactId.  To disassociate, do not include the property at all.
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
   * Update an External Source
   * 
   * @param externalSourceId External Source ID (required)
   * @param body External Source (required)
   * @return ExternalSource
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalSource putExternalcontactsExternalsource(String externalSourceId, ExternalSource body) throws IOException, ApiException {
    return  putExternalcontactsExternalsource(createPutExternalcontactsExternalsourceRequest(externalSourceId, body));
  }

  /**
   * Update an External Source
   * 
   * @param externalSourceId External Source ID (required)
   * @param body External Source (required)
   * @return ExternalSource
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalSource> putExternalcontactsExternalsourceWithHttpInfo(String externalSourceId, ExternalSource body) throws IOException {
    return putExternalcontactsExternalsource(createPutExternalcontactsExternalsourceRequest(externalSourceId, body).withHttpInfo());
  }

  private PutExternalcontactsExternalsourceRequest createPutExternalcontactsExternalsourceRequest(String externalSourceId, ExternalSource body) {
    return PutExternalcontactsExternalsourceRequest.builder()
            .withExternalSourceId(externalSourceId)

            .withBody(body)

            .build();
  }

  /**
   * Update an External Source
   * 
   * @param request The request object
   * @return ExternalSource
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalSource putExternalcontactsExternalsource(PutExternalcontactsExternalsourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalSource> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalSource>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an External Source
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalSource> putExternalcontactsExternalsource(ApiRequest<ExternalSource> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalSource>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalSource> response = (ApiResponse<ExternalSource>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalSource> response = (ApiResponse<ExternalSource>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update settings for CSV import
   * 
   * @param settingsId Settings id (required)
   * @param body Settings (required)
   * @return CsvSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvSettings putExternalcontactsImportCsvSetting(String settingsId, CsvSettings body) throws IOException, ApiException {
    return  putExternalcontactsImportCsvSetting(createPutExternalcontactsImportCsvSettingRequest(settingsId, body));
  }

  /**
   * Update settings for CSV import
   * 
   * @param settingsId Settings id (required)
   * @param body Settings (required)
   * @return CsvSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvSettings> putExternalcontactsImportCsvSettingWithHttpInfo(String settingsId, CsvSettings body) throws IOException {
    return putExternalcontactsImportCsvSetting(createPutExternalcontactsImportCsvSettingRequest(settingsId, body).withHttpInfo());
  }

  private PutExternalcontactsImportCsvSettingRequest createPutExternalcontactsImportCsvSettingRequest(String settingsId, CsvSettings body) {
    return PutExternalcontactsImportCsvSettingRequest.builder()
            .withSettingsId(settingsId)

            .withBody(body)

            .build();
  }

  /**
   * Update settings for CSV import
   * 
   * @param request The request object
   * @return CsvSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CsvSettings putExternalcontactsImportCsvSetting(PutExternalcontactsImportCsvSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CsvSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CsvSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update settings for CSV import
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CsvSettings> putExternalcontactsImportCsvSetting(ApiRequest<CsvSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CsvSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CsvSettings> response = (ApiResponse<CsvSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<CsvSettings> response = (ApiResponse<CsvSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update Job's workflow status
   * 
   * @param jobId Job id (required)
   * @param body Status of the Job's workflow (required)
   * @return ContactImportJobStatusUpdateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportJobStatusUpdateResponse putExternalcontactsImportJob(String jobId, ContactImportJobStatusUpdateRequest body) throws IOException, ApiException {
    return  putExternalcontactsImportJob(createPutExternalcontactsImportJobRequest(jobId, body));
  }

  /**
   * Update Job's workflow status
   * 
   * @param jobId Job id (required)
   * @param body Status of the Job's workflow (required)
   * @return ContactImportJobStatusUpdateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportJobStatusUpdateResponse> putExternalcontactsImportJobWithHttpInfo(String jobId, ContactImportJobStatusUpdateRequest body) throws IOException {
    return putExternalcontactsImportJob(createPutExternalcontactsImportJobRequest(jobId, body).withHttpInfo());
  }

  private PutExternalcontactsImportJobRequest createPutExternalcontactsImportJobRequest(String jobId, ContactImportJobStatusUpdateRequest body) {
    return PutExternalcontactsImportJobRequest.builder()
            .withJobId(jobId)

            .withBody(body)

            .build();
  }

  /**
   * Update Job's workflow status
   * 
   * @param request The request object
   * @return ContactImportJobStatusUpdateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportJobStatusUpdateResponse putExternalcontactsImportJob(PutExternalcontactsImportJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactImportJobStatusUpdateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactImportJobStatusUpdateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Job's workflow status
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportJobStatusUpdateResponse> putExternalcontactsImportJob(ApiRequest<ContactImportJobStatusUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactImportJobStatusUpdateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactImportJobStatusUpdateResponse> response = (ApiResponse<ContactImportJobStatusUpdateResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactImportJobStatusUpdateResponse> response = (ApiResponse<ContactImportJobStatusUpdateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update settings
   * 
   * @param settingsId Settings id (required)
   * @param body Setting (required)
   * @return ContactImportSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportSettings putExternalcontactsImportSetting(String settingsId, ContactImportSettings body) throws IOException, ApiException {
    return  putExternalcontactsImportSetting(createPutExternalcontactsImportSettingRequest(settingsId, body));
  }

  /**
   * Update settings
   * 
   * @param settingsId Settings id (required)
   * @param body Setting (required)
   * @return ContactImportSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportSettings> putExternalcontactsImportSettingWithHttpInfo(String settingsId, ContactImportSettings body) throws IOException {
    return putExternalcontactsImportSetting(createPutExternalcontactsImportSettingRequest(settingsId, body).withHttpInfo());
  }

  private PutExternalcontactsImportSettingRequest createPutExternalcontactsImportSettingRequest(String settingsId, ContactImportSettings body) {
    return PutExternalcontactsImportSettingRequest.builder()
            .withSettingsId(settingsId)

            .withBody(body)

            .build();
  }

  /**
   * Update settings
   * 
   * @param request The request object
   * @return ContactImportSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactImportSettings putExternalcontactsImportSetting(PutExternalcontactsImportSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactImportSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactImportSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactImportSettings> putExternalcontactsImportSetting(ApiRequest<ContactImportSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactImportSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactImportSettings> response = (ApiResponse<ContactImportSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactImportSettings> response = (ApiResponse<ContactImportSettings>)(ApiResponse<?>)(new ApiException(exception));
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
