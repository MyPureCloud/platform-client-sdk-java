package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;

import com.mypurecloud.sdk.v2.AsyncApiCallback;
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
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> deleteExternalcontactsContactAsync(DeleteExternalcontactsContactRequest request, final AsyncApiCallback<Empty> callback) {
    try {
      final SettableFuture<Empty> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> deleteExternalcontactsContactAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      final SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a note for an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> deleteExternalcontactsContactNoteAsync(DeleteExternalcontactsContactNoteRequest request, final AsyncApiCallback<Empty> callback) {
    try {
      final SettableFuture<Empty> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a note for an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> deleteExternalcontactsContactNoteAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      final SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteExternalcontactsContactsSchemaAsync(DeleteExternalcontactsContactsSchemaRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteExternalcontactsContactsSchemaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an External Source. WARNING: Any records that reference this External Source will not be automatically cleaned up. Those records will still be editable, but their External IDs may not be fully viewable.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> deleteExternalcontactsExternalsourceAsync(DeleteExternalcontactsExternalsourceRequest request, final AsyncApiCallback<Empty> callback) {
    try {
      final SettableFuture<Empty> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an External Source. WARNING: Any records that reference this External Source will not be automatically cleaned up. Those records will still be editable, but their External IDs may not be fully viewable.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> deleteExternalcontactsExternalsourceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      final SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete settings for CSV import
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteExternalcontactsImportCsvSettingAsync(DeleteExternalcontactsImportCsvSettingRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete settings for CSV import
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteExternalcontactsImportCsvSettingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteExternalcontactsImportSettingAsync(DeleteExternalcontactsImportSettingRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteExternalcontactsImportSettingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> deleteExternalcontactsOrganizationAsync(DeleteExternalcontactsOrganizationRequest request, final AsyncApiCallback<Empty> callback) {
    try {
      final SettableFuture<Empty> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> deleteExternalcontactsOrganizationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      final SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a note for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> deleteExternalcontactsOrganizationNoteAsync(DeleteExternalcontactsOrganizationNoteRequest request, final AsyncApiCallback<Empty> callback) {
    try {
      final SettableFuture<Empty> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a note for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> deleteExternalcontactsOrganizationNoteAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      final SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Unlink the Trustor for this External Organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteExternalcontactsOrganizationTrustorAsync(DeleteExternalcontactsOrganizationTrustorRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Unlink the Trustor for this External Organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteExternalcontactsOrganizationTrustorAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a relationship
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> deleteExternalcontactsRelationshipAsync(DeleteExternalcontactsRelationshipRequest request, final AsyncApiCallback<Empty> callback) {
    try {
      final SettableFuture<Empty> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a relationship
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> deleteExternalcontactsRelationshipAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      final SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalContact> getExternalcontactsContactAsync(GetExternalcontactsContactRequest request, final AsyncApiCallback<ExternalContact> callback) {
    try {
      final SettableFuture<ExternalContact> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalContact>> getExternalcontactsContactAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List the identifiers for a contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactIdentifierListing> getExternalcontactsContactIdentifiersAsync(GetExternalcontactsContactIdentifiersRequest request, final AsyncApiCallback<ContactIdentifierListing> callback) {
    try {
      final SettableFuture<ContactIdentifierListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactIdentifierListing>() {}, new AsyncApiCallback<ApiResponse<ContactIdentifierListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactIdentifierListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List the identifiers for a contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactIdentifierListing>> getExternalcontactsContactIdentifiersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactIdentifierListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactIdentifierListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactIdentifierListing>() {}, new AsyncApiCallback<ApiResponse<ContactIdentifierListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactIdentifierListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactIdentifierListing> response = (ApiResponse<ContactIdentifierListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactIdentifierListing> response = (ApiResponse<ContactIdentifierListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve segment assignments by external contact ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SegmentAssignmentListing> getExternalcontactsContactJourneySegmentsAsync(GetExternalcontactsContactJourneySegmentsRequest request, final AsyncApiCallback<SegmentAssignmentListing> callback) {
    try {
      final SettableFuture<SegmentAssignmentListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SegmentAssignmentListing>() {}, new AsyncApiCallback<ApiResponse<SegmentAssignmentListing>>() {
        @Override
        public void onCompleted(ApiResponse<SegmentAssignmentListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve segment assignments by external contact ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SegmentAssignmentListing>> getExternalcontactsContactJourneySegmentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SegmentAssignmentListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SegmentAssignmentListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SegmentAssignmentListing>() {}, new AsyncApiCallback<ApiResponse<SegmentAssignmentListing>>() {
        @Override
        public void onCompleted(ApiResponse<SegmentAssignmentListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SegmentAssignmentListing> response = (ApiResponse<SegmentAssignmentListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SegmentAssignmentListing> response = (ApiResponse<SegmentAssignmentListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all sessions for a given external contact.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SessionListing> getExternalcontactsContactJourneySessionsAsync(GetExternalcontactsContactJourneySessionsRequest request, final AsyncApiCallback<SessionListing> callback) {
    try {
      final SettableFuture<SessionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SessionListing>() {}, new AsyncApiCallback<ApiResponse<SessionListing>>() {
        @Override
        public void onCompleted(ApiResponse<SessionListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all sessions for a given external contact.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SessionListing>> getExternalcontactsContactJourneySessionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SessionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SessionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SessionListing>() {}, new AsyncApiCallback<ApiResponse<SessionListing>>() {
        @Override
        public void onCompleted(ApiResponse<SessionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SessionListing> response = (ApiResponse<SessionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SessionListing> response = (ApiResponse<SessionListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a note for an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Note> getExternalcontactsContactNoteAsync(GetExternalcontactsContactNoteRequest request, final AsyncApiCallback<Note> callback) {
    try {
      final SettableFuture<Note> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Note>() {}, new AsyncApiCallback<ApiResponse<Note>>() {
        @Override
        public void onCompleted(ApiResponse<Note> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a note for an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Note>> getExternalcontactsContactNoteAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Note>> callback) {
    try {
      final SettableFuture<ApiResponse<Note>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Note>() {}, new AsyncApiCallback<ApiResponse<Note>>() {
        @Override
        public void onCompleted(ApiResponse<Note> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List notes for an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NoteListing> getExternalcontactsContactNotesAsync(GetExternalcontactsContactNotesRequest request, final AsyncApiCallback<NoteListing> callback) {
    try {
      final SettableFuture<NoteListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NoteListing>() {}, new AsyncApiCallback<ApiResponse<NoteListing>>() {
        @Override
        public void onCompleted(ApiResponse<NoteListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List notes for an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NoteListing>> getExternalcontactsContactNotesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NoteListing>> callback) {
    try {
      final SettableFuture<ApiResponse<NoteListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NoteListing>() {}, new AsyncApiCallback<ApiResponse<NoteListing>>() {
        @Override
        public void onCompleted(ApiResponse<NoteListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NoteListing> response = (ApiResponse<NoteListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NoteListing> response = (ApiResponse<NoteListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch an unresolved external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalContact> getExternalcontactsContactUnresolvedAsync(GetExternalcontactsContactUnresolvedRequest request, final AsyncApiCallback<ExternalContact> callback) {
    try {
      final SettableFuture<ExternalContact> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch an unresolved external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalContact>> getExternalcontactsContactUnresolvedAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search for external contacts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListing> getExternalcontactsContactsAsync(GetExternalcontactsContactsRequest request, final AsyncApiCallback<ContactListing> callback) {
    try {
      final SettableFuture<ContactListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListing>() {}, new AsyncApiCallback<ApiResponse<ContactListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search for external contacts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListing>> getExternalcontactsContactsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListing>() {}, new AsyncApiCallback<ApiResponse<ContactListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListing> response = (ApiResponse<ContactListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListing> response = (ApiResponse<ContactListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get export for exportId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactsExport> getExternalcontactsContactsExportAsync(GetExternalcontactsContactsExportRequest request, final AsyncApiCallback<ContactsExport> callback) {
    try {
      final SettableFuture<ContactsExport> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactsExport>() {}, new AsyncApiCallback<ApiResponse<ContactsExport>>() {
        @Override
        public void onCompleted(ApiResponse<ContactsExport> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get export for exportId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactsExport>> getExternalcontactsContactsExportAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactsExport>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactsExport>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactsExport>() {}, new AsyncApiCallback<ApiResponse<ContactsExport>>() {
        @Override
        public void onCompleted(ApiResponse<ContactsExport> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactsExport> response = (ApiResponse<ContactsExport>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactsExport> response = (ApiResponse<ContactsExport>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List exports for organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExportListing> getExternalcontactsContactsExportsAsync(GetExternalcontactsContactsExportsRequest request, final AsyncApiCallback<ExportListing> callback) {
    try {
      final SettableFuture<ExportListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExportListing>() {}, new AsyncApiCallback<ApiResponse<ExportListing>>() {
        @Override
        public void onCompleted(ApiResponse<ExportListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List exports for organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExportListing>> getExternalcontactsContactsExportsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExportListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ExportListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExportListing>() {}, new AsyncApiCallback<ApiResponse<ExportListing>>() {
        @Override
        public void onCompleted(ApiResponse<ExportListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExportListing> response = (ApiResponse<ExportListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExportListing> response = (ApiResponse<ExportListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> getExternalcontactsContactsSchemaAsync(GetExternalcontactsContactsSchemaRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> getExternalcontactsContactsSchemaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a specific version of a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> getExternalcontactsContactsSchemaVersionAsync(GetExternalcontactsContactsSchemaVersionRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a specific version of a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> getExternalcontactsContactsSchemaVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all versions of an external contact's schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchemaListing> getExternalcontactsContactsSchemaVersionsAsync(GetExternalcontactsContactsSchemaVersionsRequest request, final AsyncApiCallback<DataSchemaListing> callback) {
    try {
      final SettableFuture<DataSchemaListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchemaListing>() {}, new AsyncApiCallback<ApiResponse<DataSchemaListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchemaListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all versions of an external contact's schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchemaListing>> getExternalcontactsContactsSchemaVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataSchemaListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchemaListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchemaListing>() {}, new AsyncApiCallback<ApiResponse<DataSchemaListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchemaListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of schemas.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchemaListing> getExternalcontactsContactsSchemasAsync(GetExternalcontactsContactsSchemasRequest request, final AsyncApiCallback<DataSchemaListing> callback) {
    try {
      final SettableFuture<DataSchemaListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchemaListing>() {}, new AsyncApiCallback<ApiResponse<DataSchemaListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchemaListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of schemas.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchemaListing>> getExternalcontactsContactsSchemasAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataSchemaListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchemaListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchemaListing>() {}, new AsyncApiCallback<ApiResponse<DataSchemaListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchemaListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a specific named core type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Coretype> getExternalcontactsContactsSchemasCoretypeAsync(GetExternalcontactsContactsSchemasCoretypeRequest request, final AsyncApiCallback<Coretype> callback) {
    try {
      final SettableFuture<Coretype> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Coretype>() {}, new AsyncApiCallback<ApiResponse<Coretype>>() {
        @Override
        public void onCompleted(ApiResponse<Coretype> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a specific named core type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Coretype>> getExternalcontactsContactsSchemasCoretypeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Coretype>> callback) {
    try {
      final SettableFuture<ApiResponse<Coretype>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Coretype>() {}, new AsyncApiCallback<ApiResponse<Coretype>>() {
        @Override
        public void onCompleted(ApiResponse<Coretype> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoretypeListing> getExternalcontactsContactsSchemasCoretypesAsync(GetExternalcontactsContactsSchemasCoretypesRequest request, final AsyncApiCallback<CoretypeListing> callback) {
    try {
      final SettableFuture<CoretypeListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoretypeListing>() {}, new AsyncApiCallback<ApiResponse<CoretypeListing>>() {
        @Override
        public void onCompleted(ApiResponse<CoretypeListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoretypeListing>> getExternalcontactsContactsSchemasCoretypesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoretypeListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CoretypeListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoretypeListing>() {}, new AsyncApiCallback<ApiResponse<CoretypeListing>>() {
        @Override
        public void onCompleted(ApiResponse<CoretypeListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SchemaQuantityLimits> getExternalcontactsContactsSchemasLimitsAsync(GetExternalcontactsContactsSchemasLimitsRequest request, final AsyncApiCallback<SchemaQuantityLimits> callback) {
    try {
      final SettableFuture<SchemaQuantityLimits> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SchemaQuantityLimits>() {}, new AsyncApiCallback<ApiResponse<SchemaQuantityLimits>>() {
        @Override
        public void onCompleted(ApiResponse<SchemaQuantityLimits> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SchemaQuantityLimits>> getExternalcontactsContactsSchemasLimitsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SchemaQuantityLimits>> callback) {
    try {
      final SettableFuture<ApiResponse<SchemaQuantityLimits>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SchemaQuantityLimits>() {}, new AsyncApiCallback<ApiResponse<SchemaQuantityLimits>>() {
        @Override
        public void onCompleted(ApiResponse<SchemaQuantityLimits> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SchemaQuantityLimits> response = (ApiResponse<SchemaQuantityLimits>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SchemaQuantityLimits> response = (ApiResponse<SchemaQuantityLimits>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch an External Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalSource> getExternalcontactsExternalsourceAsync(GetExternalcontactsExternalsourceRequest request, final AsyncApiCallback<ExternalSource> callback) {
    try {
      final SettableFuture<ExternalSource> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalSource>() {}, new AsyncApiCallback<ApiResponse<ExternalSource>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalSource> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch an External Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalSource>> getExternalcontactsExternalsourceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExternalSource>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalSource>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalSource>() {}, new AsyncApiCallback<ApiResponse<ExternalSource>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalSource> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalSource> response = (ApiResponse<ExternalSource>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalSource> response = (ApiResponse<ExternalSource>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a list of External Sources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CursorExternalSourceListing> getExternalcontactsExternalsourcesAsync(GetExternalcontactsExternalsourcesRequest request, final AsyncApiCallback<CursorExternalSourceListing> callback) {
    try {
      final SettableFuture<CursorExternalSourceListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CursorExternalSourceListing>() {}, new AsyncApiCallback<ApiResponse<CursorExternalSourceListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorExternalSourceListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a list of External Sources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CursorExternalSourceListing>> getExternalcontactsExternalsourcesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CursorExternalSourceListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CursorExternalSourceListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CursorExternalSourceListing>() {}, new AsyncApiCallback<ApiResponse<CursorExternalSourceListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorExternalSourceListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorExternalSourceListing> response = (ApiResponse<CursorExternalSourceListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorExternalSourceListing> response = (ApiResponse<CursorExternalSourceListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get settings for CSV import
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CsvSettings> getExternalcontactsImportCsvSettingAsync(GetExternalcontactsImportCsvSettingRequest request, final AsyncApiCallback<CsvSettings> callback) {
    try {
      final SettableFuture<CsvSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CsvSettings>() {}, new AsyncApiCallback<ApiResponse<CsvSettings>>() {
        @Override
        public void onCompleted(ApiResponse<CsvSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get settings for CSV import
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CsvSettings>> getExternalcontactsImportCsvSettingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CsvSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<CsvSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CsvSettings>() {}, new AsyncApiCallback<ApiResponse<CsvSettings>>() {
        @Override
        public void onCompleted(ApiResponse<CsvSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvSettings> response = (ApiResponse<CsvSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvSettings> response = (ApiResponse<CsvSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all settings for organization filtered by externalSettingsId if provided
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Listing> getExternalcontactsImportCsvSettingsAsync(GetExternalcontactsImportCsvSettingsRequest request, final AsyncApiCallback<Listing> callback) {
    try {
      final SettableFuture<Listing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Listing>() {}, new AsyncApiCallback<ApiResponse<Listing>>() {
        @Override
        public void onCompleted(ApiResponse<Listing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all settings for organization filtered by externalSettingsId if provided
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Listing>> getExternalcontactsImportCsvSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Listing>> callback) {
    try {
      final SettableFuture<ApiResponse<Listing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Listing>() {}, new AsyncApiCallback<ApiResponse<Listing>>() {
        @Override
        public void onCompleted(ApiResponse<Listing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Listing> response = (ApiResponse<Listing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Listing> response = (ApiResponse<Listing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get details for CSV upload
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CsvUploadDetailsResponse> getExternalcontactsImportCsvUploadDetailsAsync(GetExternalcontactsImportCsvUploadDetailsRequest request, final AsyncApiCallback<CsvUploadDetailsResponse> callback) {
    try {
      final SettableFuture<CsvUploadDetailsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CsvUploadDetailsResponse>() {}, new AsyncApiCallback<ApiResponse<CsvUploadDetailsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CsvUploadDetailsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get details for CSV upload
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CsvUploadDetailsResponse>> getExternalcontactsImportCsvUploadDetailsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CsvUploadDetailsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CsvUploadDetailsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CsvUploadDetailsResponse>() {}, new AsyncApiCallback<ApiResponse<CsvUploadDetailsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CsvUploadDetailsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvUploadDetailsResponse> response = (ApiResponse<CsvUploadDetailsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvUploadDetailsResponse> response = (ApiResponse<CsvUploadDetailsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get preview for CSV upload
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CsvUploadPreviewResponse> getExternalcontactsImportCsvUploadPreviewAsync(GetExternalcontactsImportCsvUploadPreviewRequest request, final AsyncApiCallback<CsvUploadPreviewResponse> callback) {
    try {
      final SettableFuture<CsvUploadPreviewResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CsvUploadPreviewResponse>() {}, new AsyncApiCallback<ApiResponse<CsvUploadPreviewResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CsvUploadPreviewResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get preview for CSV upload
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CsvUploadPreviewResponse>> getExternalcontactsImportCsvUploadPreviewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CsvUploadPreviewResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CsvUploadPreviewResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CsvUploadPreviewResponse>() {}, new AsyncApiCallback<ApiResponse<CsvUploadPreviewResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CsvUploadPreviewResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvUploadPreviewResponse> response = (ApiResponse<CsvUploadPreviewResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvUploadPreviewResponse> response = (ApiResponse<CsvUploadPreviewResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get job based on id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactImportJobResponse> getExternalcontactsImportJobAsync(GetExternalcontactsImportJobRequest request, final AsyncApiCallback<ContactImportJobResponse> callback) {
    try {
      final SettableFuture<ContactImportJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactImportJobResponse>() {}, new AsyncApiCallback<ApiResponse<ContactImportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get job based on id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactImportJobResponse>> getExternalcontactsImportJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactImportJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactImportJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactImportJobResponse>() {}, new AsyncApiCallback<ApiResponse<ContactImportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportJobResponse> response = (ApiResponse<ContactImportJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportJobResponse> response = (ApiResponse<ContactImportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List jobs for organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactImportJobEntityListing> getExternalcontactsImportJobsAsync(GetExternalcontactsImportJobsRequest request, final AsyncApiCallback<ContactImportJobEntityListing> callback) {
    try {
      final SettableFuture<ContactImportJobEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactImportJobEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactImportJobEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportJobEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List jobs for organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactImportJobEntityListing>> getExternalcontactsImportJobsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactImportJobEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactImportJobEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactImportJobEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactImportJobEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportJobEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportJobEntityListing> response = (ApiResponse<ContactImportJobEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportJobEntityListing> response = (ApiResponse<ContactImportJobEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get setting based on id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactImportSettings> getExternalcontactsImportSettingAsync(GetExternalcontactsImportSettingRequest request, final AsyncApiCallback<ContactImportSettings> callback) {
    try {
      final SettableFuture<ContactImportSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactImportSettings>() {}, new AsyncApiCallback<ApiResponse<ContactImportSettings>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get setting based on id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactImportSettings>> getExternalcontactsImportSettingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactImportSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactImportSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactImportSettings>() {}, new AsyncApiCallback<ApiResponse<ContactImportSettings>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportSettings> response = (ApiResponse<ContactImportSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportSettings> response = (ApiResponse<ContactImportSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List settings for organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactImportSettingsEntityListing> getExternalcontactsImportSettingsAsync(GetExternalcontactsImportSettingsRequest request, final AsyncApiCallback<ContactImportSettingsEntityListing> callback) {
    try {
      final SettableFuture<ContactImportSettingsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactImportSettingsEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactImportSettingsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportSettingsEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List settings for organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactImportSettingsEntityListing>> getExternalcontactsImportSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactImportSettingsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactImportSettingsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactImportSettingsEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactImportSettingsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportSettingsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportSettingsEntityListing> response = (ApiResponse<ContactImportSettingsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportSettingsEntityListing> response = (ApiResponse<ContactImportSettingsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalOrganization> getExternalcontactsOrganizationAsync(GetExternalcontactsOrganizationRequest request, final AsyncApiCallback<ExternalOrganization> callback) {
    try {
      final SettableFuture<ExternalOrganization> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganization>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganization> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalOrganization>> getExternalcontactsOrganizationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExternalOrganization>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalOrganization>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalOrganization>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganization>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search for external contacts in an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListing> getExternalcontactsOrganizationContactsAsync(GetExternalcontactsOrganizationContactsRequest request, final AsyncApiCallback<ContactListing> callback) {
    try {
      final SettableFuture<ContactListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListing>() {}, new AsyncApiCallback<ApiResponse<ContactListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search for external contacts in an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListing>> getExternalcontactsOrganizationContactsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListing>() {}, new AsyncApiCallback<ApiResponse<ContactListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListing> response = (ApiResponse<ContactListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListing> response = (ApiResponse<ContactListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List the identifiers for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalOrganizationIdentifierListing> getExternalcontactsOrganizationIdentifiersAsync(GetExternalcontactsOrganizationIdentifiersRequest request, final AsyncApiCallback<ExternalOrganizationIdentifierListing> callback) {
    try {
      final SettableFuture<ExternalOrganizationIdentifierListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalOrganizationIdentifierListing>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganizationIdentifierListing>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganizationIdentifierListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List the identifiers for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalOrganizationIdentifierListing>> getExternalcontactsOrganizationIdentifiersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExternalOrganizationIdentifierListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalOrganizationIdentifierListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalOrganizationIdentifierListing>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganizationIdentifierListing>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganizationIdentifierListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganizationIdentifierListing> response = (ApiResponse<ExternalOrganizationIdentifierListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganizationIdentifierListing> response = (ApiResponse<ExternalOrganizationIdentifierListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a note for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Note> getExternalcontactsOrganizationNoteAsync(GetExternalcontactsOrganizationNoteRequest request, final AsyncApiCallback<Note> callback) {
    try {
      final SettableFuture<Note> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Note>() {}, new AsyncApiCallback<ApiResponse<Note>>() {
        @Override
        public void onCompleted(ApiResponse<Note> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a note for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Note>> getExternalcontactsOrganizationNoteAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Note>> callback) {
    try {
      final SettableFuture<ApiResponse<Note>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Note>() {}, new AsyncApiCallback<ApiResponse<Note>>() {
        @Override
        public void onCompleted(ApiResponse<Note> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List notes for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NoteListing> getExternalcontactsOrganizationNotesAsync(GetExternalcontactsOrganizationNotesRequest request, final AsyncApiCallback<NoteListing> callback) {
    try {
      final SettableFuture<NoteListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NoteListing>() {}, new AsyncApiCallback<ApiResponse<NoteListing>>() {
        @Override
        public void onCompleted(ApiResponse<NoteListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List notes for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NoteListing>> getExternalcontactsOrganizationNotesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NoteListing>> callback) {
    try {
      final SettableFuture<ApiResponse<NoteListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NoteListing>() {}, new AsyncApiCallback<ApiResponse<NoteListing>>() {
        @Override
        public void onCompleted(ApiResponse<NoteListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NoteListing> response = (ApiResponse<NoteListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NoteListing> response = (ApiResponse<NoteListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a relationship for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RelationshipListing> getExternalcontactsOrganizationRelationshipsAsync(GetExternalcontactsOrganizationRelationshipsRequest request, final AsyncApiCallback<RelationshipListing> callback) {
    try {
      final SettableFuture<RelationshipListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RelationshipListing>() {}, new AsyncApiCallback<ApiResponse<RelationshipListing>>() {
        @Override
        public void onCompleted(ApiResponse<RelationshipListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a relationship for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RelationshipListing>> getExternalcontactsOrganizationRelationshipsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<RelationshipListing>> callback) {
    try {
      final SettableFuture<ApiResponse<RelationshipListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RelationshipListing>() {}, new AsyncApiCallback<ApiResponse<RelationshipListing>>() {
        @Override
        public void onCompleted(ApiResponse<RelationshipListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RelationshipListing> response = (ApiResponse<RelationshipListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RelationshipListing> response = (ApiResponse<RelationshipListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search for external organizations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalOrganizationListing> getExternalcontactsOrganizationsAsync(GetExternalcontactsOrganizationsRequest request, final AsyncApiCallback<ExternalOrganizationListing> callback) {
    try {
      final SettableFuture<ExternalOrganizationListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalOrganizationListing>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganizationListing>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganizationListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search for external organizations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalOrganizationListing>> getExternalcontactsOrganizationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExternalOrganizationListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalOrganizationListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalOrganizationListing>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganizationListing>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganizationListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganizationListing> response = (ApiResponse<ExternalOrganizationListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganizationListing> response = (ApiResponse<ExternalOrganizationListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> getExternalcontactsOrganizationsSchemaAsync(GetExternalcontactsOrganizationsSchemaRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> getExternalcontactsOrganizationsSchemaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a specific version of a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> getExternalcontactsOrganizationsSchemaVersionAsync(GetExternalcontactsOrganizationsSchemaVersionRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a specific version of a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> getExternalcontactsOrganizationsSchemaVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all versions of an external organization's schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchemaListing> getExternalcontactsOrganizationsSchemaVersionsAsync(GetExternalcontactsOrganizationsSchemaVersionsRequest request, final AsyncApiCallback<DataSchemaListing> callback) {
    try {
      final SettableFuture<DataSchemaListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchemaListing>() {}, new AsyncApiCallback<ApiResponse<DataSchemaListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchemaListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all versions of an external organization's schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchemaListing>> getExternalcontactsOrganizationsSchemaVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataSchemaListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchemaListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchemaListing>() {}, new AsyncApiCallback<ApiResponse<DataSchemaListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchemaListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of schemas.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchemaListing> getExternalcontactsOrganizationsSchemasAsync(GetExternalcontactsOrganizationsSchemasRequest request, final AsyncApiCallback<DataSchemaListing> callback) {
    try {
      final SettableFuture<DataSchemaListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchemaListing>() {}, new AsyncApiCallback<ApiResponse<DataSchemaListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchemaListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of schemas.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchemaListing>> getExternalcontactsOrganizationsSchemasAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataSchemaListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchemaListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchemaListing>() {}, new AsyncApiCallback<ApiResponse<DataSchemaListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchemaListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a specific named core type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Coretype> getExternalcontactsOrganizationsSchemasCoretypeAsync(GetExternalcontactsOrganizationsSchemasCoretypeRequest request, final AsyncApiCallback<Coretype> callback) {
    try {
      final SettableFuture<Coretype> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Coretype>() {}, new AsyncApiCallback<ApiResponse<Coretype>>() {
        @Override
        public void onCompleted(ApiResponse<Coretype> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a specific named core type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Coretype>> getExternalcontactsOrganizationsSchemasCoretypeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Coretype>> callback) {
    try {
      final SettableFuture<ApiResponse<Coretype>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Coretype>() {}, new AsyncApiCallback<ApiResponse<Coretype>>() {
        @Override
        public void onCompleted(ApiResponse<Coretype> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoretypeListing> getExternalcontactsOrganizationsSchemasCoretypesAsync(GetExternalcontactsOrganizationsSchemasCoretypesRequest request, final AsyncApiCallback<CoretypeListing> callback) {
    try {
      final SettableFuture<CoretypeListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoretypeListing>() {}, new AsyncApiCallback<ApiResponse<CoretypeListing>>() {
        @Override
        public void onCompleted(ApiResponse<CoretypeListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoretypeListing>> getExternalcontactsOrganizationsSchemasCoretypesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoretypeListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CoretypeListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoretypeListing>() {}, new AsyncApiCallback<ApiResponse<CoretypeListing>>() {
        @Override
        public void onCompleted(ApiResponse<CoretypeListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SchemaQuantityLimits> getExternalcontactsOrganizationsSchemasLimitsAsync(GetExternalcontactsOrganizationsSchemasLimitsRequest request, final AsyncApiCallback<SchemaQuantityLimits> callback) {
    try {
      final SettableFuture<SchemaQuantityLimits> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SchemaQuantityLimits>() {}, new AsyncApiCallback<ApiResponse<SchemaQuantityLimits>>() {
        @Override
        public void onCompleted(ApiResponse<SchemaQuantityLimits> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SchemaQuantityLimits>> getExternalcontactsOrganizationsSchemasLimitsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SchemaQuantityLimits>> callback) {
    try {
      final SettableFuture<ApiResponse<SchemaQuantityLimits>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SchemaQuantityLimits>() {}, new AsyncApiCallback<ApiResponse<SchemaQuantityLimits>>() {
        @Override
        public void onCompleted(ApiResponse<SchemaQuantityLimits> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SchemaQuantityLimits> response = (ApiResponse<SchemaQuantityLimits>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SchemaQuantityLimits> response = (ApiResponse<SchemaQuantityLimits>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a relationship
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Relationship> getExternalcontactsRelationshipAsync(GetExternalcontactsRelationshipRequest request, final AsyncApiCallback<Relationship> callback) {
    try {
      final SettableFuture<Relationship> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Relationship>() {}, new AsyncApiCallback<ApiResponse<Relationship>>() {
        @Override
        public void onCompleted(ApiResponse<Relationship> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a relationship
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Relationship>> getExternalcontactsRelationshipAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Relationship>> callback) {
    try {
      final SettableFuture<ApiResponse<Relationship>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Relationship>() {}, new AsyncApiCallback<ApiResponse<Relationship>>() {
        @Override
        public void onCompleted(ApiResponse<Relationship> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Relationship> response = (ApiResponse<Relationship>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Relationship> response = (ApiResponse<Relationship>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Look up contacts based on an attribute. Maximum of 25 values returned.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReverseWhitepagesLookupResult> getExternalcontactsReversewhitepageslookupAsync(GetExternalcontactsReversewhitepageslookupRequest request, final AsyncApiCallback<ReverseWhitepagesLookupResult> callback) {
    try {
      final SettableFuture<ReverseWhitepagesLookupResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReverseWhitepagesLookupResult>() {}, new AsyncApiCallback<ApiResponse<ReverseWhitepagesLookupResult>>() {
        @Override
        public void onCompleted(ApiResponse<ReverseWhitepagesLookupResult> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Look up contacts based on an attribute. Maximum of 25 values returned.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReverseWhitepagesLookupResult>> getExternalcontactsReversewhitepageslookupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ReverseWhitepagesLookupResult>> callback) {
    try {
      final SettableFuture<ApiResponse<ReverseWhitepagesLookupResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReverseWhitepagesLookupResult>() {}, new AsyncApiCallback<ApiResponse<ReverseWhitepagesLookupResult>>() {
        @Override
        public void onCompleted(ApiResponse<ReverseWhitepagesLookupResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReverseWhitepagesLookupResult> response = (ApiResponse<ReverseWhitepagesLookupResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReverseWhitepagesLookupResult> response = (ApiResponse<ReverseWhitepagesLookupResult>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for external contacts using paging
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CursorContactListing> getExternalcontactsScanContactsAsync(GetExternalcontactsScanContactsRequest request, final AsyncApiCallback<CursorContactListing> callback) {
    try {
      final SettableFuture<CursorContactListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CursorContactListing>() {}, new AsyncApiCallback<ApiResponse<CursorContactListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorContactListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for external contacts using paging
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CursorContactListing>> getExternalcontactsScanContactsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CursorContactListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CursorContactListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CursorContactListing>() {}, new AsyncApiCallback<ApiResponse<CursorContactListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorContactListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorContactListing> response = (ApiResponse<CursorContactListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorContactListing> response = (ApiResponse<CursorContactListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for external contacts using paging
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CursorContactListing> getExternalcontactsScanContactsDivisionviewsAllAsync(GetExternalcontactsScanContactsDivisionviewsAllRequest request, final AsyncApiCallback<CursorContactListing> callback) {
    try {
      final SettableFuture<CursorContactListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CursorContactListing>() {}, new AsyncApiCallback<ApiResponse<CursorContactListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorContactListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for external contacts using paging
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CursorContactListing>> getExternalcontactsScanContactsDivisionviewsAllAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CursorContactListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CursorContactListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CursorContactListing>() {}, new AsyncApiCallback<ApiResponse<CursorContactListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorContactListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorContactListing> response = (ApiResponse<CursorContactListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorContactListing> response = (ApiResponse<CursorContactListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for notes using paging
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CursorNoteListing> getExternalcontactsScanNotesAsync(GetExternalcontactsScanNotesRequest request, final AsyncApiCallback<CursorNoteListing> callback) {
    try {
      final SettableFuture<CursorNoteListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CursorNoteListing>() {}, new AsyncApiCallback<ApiResponse<CursorNoteListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorNoteListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for notes using paging
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CursorNoteListing>> getExternalcontactsScanNotesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CursorNoteListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CursorNoteListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CursorNoteListing>() {}, new AsyncApiCallback<ApiResponse<CursorNoteListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorNoteListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorNoteListing> response = (ApiResponse<CursorNoteListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorNoteListing> response = (ApiResponse<CursorNoteListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for notes using paging
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CursorNoteListing> getExternalcontactsScanNotesDivisionviewsAllAsync(GetExternalcontactsScanNotesDivisionviewsAllRequest request, final AsyncApiCallback<CursorNoteListing> callback) {
    try {
      final SettableFuture<CursorNoteListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CursorNoteListing>() {}, new AsyncApiCallback<ApiResponse<CursorNoteListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorNoteListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for notes using paging
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CursorNoteListing>> getExternalcontactsScanNotesDivisionviewsAllAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CursorNoteListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CursorNoteListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CursorNoteListing>() {}, new AsyncApiCallback<ApiResponse<CursorNoteListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorNoteListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorNoteListing> response = (ApiResponse<CursorNoteListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorNoteListing> response = (ApiResponse<CursorNoteListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for external organizations using paging
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CursorOrganizationListing> getExternalcontactsScanOrganizationsAsync(GetExternalcontactsScanOrganizationsRequest request, final AsyncApiCallback<CursorOrganizationListing> callback) {
    try {
      final SettableFuture<CursorOrganizationListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CursorOrganizationListing>() {}, new AsyncApiCallback<ApiResponse<CursorOrganizationListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorOrganizationListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for external organizations using paging
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CursorOrganizationListing>> getExternalcontactsScanOrganizationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CursorOrganizationListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CursorOrganizationListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CursorOrganizationListing>() {}, new AsyncApiCallback<ApiResponse<CursorOrganizationListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorOrganizationListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorOrganizationListing> response = (ApiResponse<CursorOrganizationListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorOrganizationListing> response = (ApiResponse<CursorOrganizationListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for external organizations using paging
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CursorOrganizationListing> getExternalcontactsScanOrganizationsDivisionviewsAllAsync(GetExternalcontactsScanOrganizationsDivisionviewsAllRequest request, final AsyncApiCallback<CursorOrganizationListing> callback) {
    try {
      final SettableFuture<CursorOrganizationListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CursorOrganizationListing>() {}, new AsyncApiCallback<ApiResponse<CursorOrganizationListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorOrganizationListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for external organizations using paging
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CursorOrganizationListing>> getExternalcontactsScanOrganizationsDivisionviewsAllAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CursorOrganizationListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CursorOrganizationListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CursorOrganizationListing>() {}, new AsyncApiCallback<ApiResponse<CursorOrganizationListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorOrganizationListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorOrganizationListing> response = (ApiResponse<CursorOrganizationListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorOrganizationListing> response = (ApiResponse<CursorOrganizationListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for relationships
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CursorRelationshipListing> getExternalcontactsScanRelationshipsAsync(GetExternalcontactsScanRelationshipsRequest request, final AsyncApiCallback<CursorRelationshipListing> callback) {
    try {
      final SettableFuture<CursorRelationshipListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CursorRelationshipListing>() {}, new AsyncApiCallback<ApiResponse<CursorRelationshipListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorRelationshipListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for relationships
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CursorRelationshipListing>> getExternalcontactsScanRelationshipsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CursorRelationshipListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CursorRelationshipListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CursorRelationshipListing>() {}, new AsyncApiCallback<ApiResponse<CursorRelationshipListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorRelationshipListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorRelationshipListing> response = (ApiResponse<CursorRelationshipListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorRelationshipListing> response = (ApiResponse<CursorRelationshipListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for relationships
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CursorRelationshipListing> getExternalcontactsScanRelationshipsDivisionviewsAllAsync(GetExternalcontactsScanRelationshipsDivisionviewsAllRequest request, final AsyncApiCallback<CursorRelationshipListing> callback) {
    try {
      final SettableFuture<CursorRelationshipListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CursorRelationshipListing>() {}, new AsyncApiCallback<ApiResponse<CursorRelationshipListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorRelationshipListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Scan for relationships
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CursorRelationshipListing>> getExternalcontactsScanRelationshipsDivisionviewsAllAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CursorRelationshipListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CursorRelationshipListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CursorRelationshipListing>() {}, new AsyncApiCallback<ApiResponse<CursorRelationshipListing>>() {
        @Override
        public void onCompleted(ApiResponse<CursorRelationshipListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorRelationshipListing> response = (ApiResponse<CursorRelationshipListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CursorRelationshipListing> response = (ApiResponse<CursorRelationshipListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Claim or release identifiers for a contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactIdentifier> patchExternalcontactsContactIdentifiersAsync(PatchExternalcontactsContactIdentifiersRequest request, final AsyncApiCallback<ContactIdentifier> callback) {
    try {
      final SettableFuture<ContactIdentifier> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactIdentifier>() {}, new AsyncApiCallback<ApiResponse<ContactIdentifier>>() {
        @Override
        public void onCompleted(ApiResponse<ContactIdentifier> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Claim or release identifiers for a contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactIdentifier>> patchExternalcontactsContactIdentifiersAsync(ApiRequest<IdentifierClaimRequest> request, final AsyncApiCallback<ApiResponse<ContactIdentifier>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactIdentifier>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactIdentifier>() {}, new AsyncApiCallback<ApiResponse<ContactIdentifier>>() {
        @Override
        public void onCompleted(ApiResponse<ContactIdentifier> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactIdentifier> response = (ApiResponse<ContactIdentifier>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactIdentifier> response = (ApiResponse<ContactIdentifier>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Claim or release identifiers for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalOrganizationIdentifier> patchExternalcontactsOrganizationIdentifiersAsync(PatchExternalcontactsOrganizationIdentifiersRequest request, final AsyncApiCallback<ExternalOrganizationIdentifier> callback) {
    try {
      final SettableFuture<ExternalOrganizationIdentifier> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalOrganizationIdentifier>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganizationIdentifier>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganizationIdentifier> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Claim or release identifiers for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalOrganizationIdentifier>> patchExternalcontactsOrganizationIdentifiersAsync(ApiRequest<ExternalOrganizationIdentifierClaimRequest> request, final AsyncApiCallback<ApiResponse<ExternalOrganizationIdentifier>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalOrganizationIdentifier>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalOrganizationIdentifier>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganizationIdentifier>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganizationIdentifier> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganizationIdentifier> response = (ApiResponse<ExternalOrganizationIdentifier>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganizationIdentifier> response = (ApiResponse<ExternalOrganizationIdentifier>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch contacts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkFetchContactsResponse> postExternalcontactsBulkContactsAsync(PostExternalcontactsBulkContactsRequest request, final AsyncApiCallback<BulkFetchContactsResponse> callback) {
    try {
      final SettableFuture<BulkFetchContactsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkFetchContactsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchContactsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchContactsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch contacts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkFetchContactsResponse>> postExternalcontactsBulkContactsAsync(ApiRequest<BulkIdsRequest> request, final AsyncApiCallback<ApiResponse<BulkFetchContactsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkFetchContactsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkFetchContactsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchContactsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchContactsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchContactsResponse> response = (ApiResponse<BulkFetchContactsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchContactsResponse> response = (ApiResponse<BulkFetchContactsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk add contacts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkContactsResponse> postExternalcontactsBulkContactsAddAsync(PostExternalcontactsBulkContactsAddRequest request, final AsyncApiCallback<BulkContactsResponse> callback) {
    try {
      final SettableFuture<BulkContactsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkContactsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkContactsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkContactsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk add contacts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkContactsResponse>> postExternalcontactsBulkContactsAddAsync(ApiRequest<BulkContactsRequest> request, final AsyncApiCallback<ApiResponse<BulkContactsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkContactsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkContactsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkContactsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkContactsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkContactsResponse> response = (ApiResponse<BulkContactsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkContactsResponse> response = (ApiResponse<BulkContactsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch contacts across divisions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkFetchContactsResponse> postExternalcontactsBulkContactsDivisionviewsAsync(PostExternalcontactsBulkContactsDivisionviewsRequest request, final AsyncApiCallback<BulkFetchContactsResponse> callback) {
    try {
      final SettableFuture<BulkFetchContactsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkFetchContactsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchContactsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchContactsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch contacts across divisions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkFetchContactsResponse>> postExternalcontactsBulkContactsDivisionviewsAsync(ApiRequest<BulkIdsRequest> request, final AsyncApiCallback<ApiResponse<BulkFetchContactsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkFetchContactsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkFetchContactsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchContactsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchContactsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchContactsResponse> response = (ApiResponse<BulkFetchContactsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchContactsResponse> response = (ApiResponse<BulkFetchContactsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk Enrich Contacts - Run up to 10 Enrich operations per request
   * See the API endpoint /externalcontacts/contacts/enrich for docs on individual Enrich operations.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkContactsEnrichResponse> postExternalcontactsBulkContactsEnrichAsync(PostExternalcontactsBulkContactsEnrichRequest request, final AsyncApiCallback<BulkContactsEnrichResponse> callback) {
    try {
      final SettableFuture<BulkContactsEnrichResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkContactsEnrichResponse>() {}, new AsyncApiCallback<ApiResponse<BulkContactsEnrichResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkContactsEnrichResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk Enrich Contacts - Run up to 10 Enrich operations per request
   * See the API endpoint /externalcontacts/contacts/enrich for docs on individual Enrich operations.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkContactsEnrichResponse>> postExternalcontactsBulkContactsEnrichAsync(ApiRequest<BulkContactsEnrichRequest> request, final AsyncApiCallback<ApiResponse<BulkContactsEnrichResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkContactsEnrichResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkContactsEnrichResponse>() {}, new AsyncApiCallback<ApiResponse<BulkContactsEnrichResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkContactsEnrichResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkContactsEnrichResponse> response = (ApiResponse<BulkContactsEnrichResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkContactsEnrichResponse> response = (ApiResponse<BulkContactsEnrichResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk remove contacts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkDeleteResponse> postExternalcontactsBulkContactsRemoveAsync(PostExternalcontactsBulkContactsRemoveRequest request, final AsyncApiCallback<BulkDeleteResponse> callback) {
    try {
      final SettableFuture<BulkDeleteResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkDeleteResponse>() {}, new AsyncApiCallback<ApiResponse<BulkDeleteResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkDeleteResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk remove contacts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkDeleteResponse>> postExternalcontactsBulkContactsRemoveAsync(ApiRequest<BulkIdsRequest> request, final AsyncApiCallback<ApiResponse<BulkDeleteResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkDeleteResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkDeleteResponse>() {}, new AsyncApiCallback<ApiResponse<BulkDeleteResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkDeleteResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch unresolved ancestor contacts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkFetchContactsResponse> postExternalcontactsBulkContactsUnresolvedAsync(PostExternalcontactsBulkContactsUnresolvedRequest request, final AsyncApiCallback<BulkFetchContactsResponse> callback) {
    try {
      final SettableFuture<BulkFetchContactsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkFetchContactsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchContactsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchContactsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch unresolved ancestor contacts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkFetchContactsResponse>> postExternalcontactsBulkContactsUnresolvedAsync(ApiRequest<BulkIdsRequest> request, final AsyncApiCallback<ApiResponse<BulkFetchContactsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkFetchContactsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkFetchContactsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchContactsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchContactsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchContactsResponse> response = (ApiResponse<BulkFetchContactsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchContactsResponse> response = (ApiResponse<BulkFetchContactsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk update contacts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkContactsResponse> postExternalcontactsBulkContactsUpdateAsync(PostExternalcontactsBulkContactsUpdateRequest request, final AsyncApiCallback<BulkContactsResponse> callback) {
    try {
      final SettableFuture<BulkContactsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkContactsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkContactsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkContactsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk update contacts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkContactsResponse>> postExternalcontactsBulkContactsUpdateAsync(ApiRequest<BulkContactsRequest> request, final AsyncApiCallback<ApiResponse<BulkContactsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkContactsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkContactsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkContactsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkContactsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkContactsResponse> response = (ApiResponse<BulkContactsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkContactsResponse> response = (ApiResponse<BulkContactsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch notes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkFetchNotesResponse> postExternalcontactsBulkNotesAsync(PostExternalcontactsBulkNotesRequest request, final AsyncApiCallback<BulkFetchNotesResponse> callback) {
    try {
      final SettableFuture<BulkFetchNotesResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkFetchNotesResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchNotesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchNotesResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch notes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkFetchNotesResponse>> postExternalcontactsBulkNotesAsync(ApiRequest<BulkIdsRequest> request, final AsyncApiCallback<ApiResponse<BulkFetchNotesResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkFetchNotesResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkFetchNotesResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchNotesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchNotesResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchNotesResponse> response = (ApiResponse<BulkFetchNotesResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchNotesResponse> response = (ApiResponse<BulkFetchNotesResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk add notes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkNotesResponse> postExternalcontactsBulkNotesAddAsync(PostExternalcontactsBulkNotesAddRequest request, final AsyncApiCallback<BulkNotesResponse> callback) {
    try {
      final SettableFuture<BulkNotesResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkNotesResponse>() {}, new AsyncApiCallback<ApiResponse<BulkNotesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkNotesResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk add notes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkNotesResponse>> postExternalcontactsBulkNotesAddAsync(ApiRequest<BulkNotesRequest> request, final AsyncApiCallback<ApiResponse<BulkNotesResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkNotesResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkNotesResponse>() {}, new AsyncApiCallback<ApiResponse<BulkNotesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkNotesResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkNotesResponse> response = (ApiResponse<BulkNotesResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkNotesResponse> response = (ApiResponse<BulkNotesResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk remove notes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkDeleteResponse> postExternalcontactsBulkNotesRemoveAsync(PostExternalcontactsBulkNotesRemoveRequest request, final AsyncApiCallback<BulkDeleteResponse> callback) {
    try {
      final SettableFuture<BulkDeleteResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkDeleteResponse>() {}, new AsyncApiCallback<ApiResponse<BulkDeleteResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkDeleteResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk remove notes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkDeleteResponse>> postExternalcontactsBulkNotesRemoveAsync(ApiRequest<BulkIdsRequest> request, final AsyncApiCallback<ApiResponse<BulkDeleteResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkDeleteResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkDeleteResponse>() {}, new AsyncApiCallback<ApiResponse<BulkDeleteResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkDeleteResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk update notes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkNotesResponse> postExternalcontactsBulkNotesUpdateAsync(PostExternalcontactsBulkNotesUpdateRequest request, final AsyncApiCallback<BulkNotesResponse> callback) {
    try {
      final SettableFuture<BulkNotesResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkNotesResponse>() {}, new AsyncApiCallback<ApiResponse<BulkNotesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkNotesResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk update notes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkNotesResponse>> postExternalcontactsBulkNotesUpdateAsync(ApiRequest<BulkNotesRequest> request, final AsyncApiCallback<ApiResponse<BulkNotesResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkNotesResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkNotesResponse>() {}, new AsyncApiCallback<ApiResponse<BulkNotesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkNotesResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkNotesResponse> response = (ApiResponse<BulkNotesResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkNotesResponse> response = (ApiResponse<BulkNotesResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch organizations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkFetchOrganizationsResponse> postExternalcontactsBulkOrganizationsAsync(PostExternalcontactsBulkOrganizationsRequest request, final AsyncApiCallback<BulkFetchOrganizationsResponse> callback) {
    try {
      final SettableFuture<BulkFetchOrganizationsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkFetchOrganizationsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchOrganizationsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchOrganizationsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch organizations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkFetchOrganizationsResponse>> postExternalcontactsBulkOrganizationsAsync(ApiRequest<BulkIdsRequest> request, final AsyncApiCallback<ApiResponse<BulkFetchOrganizationsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkFetchOrganizationsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkFetchOrganizationsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchOrganizationsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchOrganizationsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchOrganizationsResponse> response = (ApiResponse<BulkFetchOrganizationsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchOrganizationsResponse> response = (ApiResponse<BulkFetchOrganizationsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk add organizations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkOrganizationsResponse> postExternalcontactsBulkOrganizationsAddAsync(PostExternalcontactsBulkOrganizationsAddRequest request, final AsyncApiCallback<BulkOrganizationsResponse> callback) {
    try {
      final SettableFuture<BulkOrganizationsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkOrganizationsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkOrganizationsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkOrganizationsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk add organizations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkOrganizationsResponse>> postExternalcontactsBulkOrganizationsAddAsync(ApiRequest<BulkOrganizationsRequest> request, final AsyncApiCallback<ApiResponse<BulkOrganizationsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkOrganizationsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkOrganizationsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkOrganizationsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkOrganizationsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkOrganizationsResponse> response = (ApiResponse<BulkOrganizationsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkOrganizationsResponse> response = (ApiResponse<BulkOrganizationsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch organizations across divisions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkFetchOrganizationsResponse> postExternalcontactsBulkOrganizationsDivisionviewsAsync(PostExternalcontactsBulkOrganizationsDivisionviewsRequest request, final AsyncApiCallback<BulkFetchOrganizationsResponse> callback) {
    try {
      final SettableFuture<BulkFetchOrganizationsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkFetchOrganizationsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchOrganizationsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchOrganizationsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch organizations across divisions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkFetchOrganizationsResponse>> postExternalcontactsBulkOrganizationsDivisionviewsAsync(ApiRequest<BulkIdsRequest> request, final AsyncApiCallback<ApiResponse<BulkFetchOrganizationsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkFetchOrganizationsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkFetchOrganizationsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchOrganizationsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchOrganizationsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchOrganizationsResponse> response = (ApiResponse<BulkFetchOrganizationsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchOrganizationsResponse> response = (ApiResponse<BulkFetchOrganizationsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk enrich external organizations - Run up to 10 Enrich operations per request
   * See the API endpoint /externalcontacts/organizations/enrich for docs on individual Enrich operations.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkOrganizationsEnrichResponse> postExternalcontactsBulkOrganizationsEnrichAsync(PostExternalcontactsBulkOrganizationsEnrichRequest request, final AsyncApiCallback<BulkOrganizationsEnrichResponse> callback) {
    try {
      final SettableFuture<BulkOrganizationsEnrichResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkOrganizationsEnrichResponse>() {}, new AsyncApiCallback<ApiResponse<BulkOrganizationsEnrichResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkOrganizationsEnrichResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk enrich external organizations - Run up to 10 Enrich operations per request
   * See the API endpoint /externalcontacts/organizations/enrich for docs on individual Enrich operations.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkOrganizationsEnrichResponse>> postExternalcontactsBulkOrganizationsEnrichAsync(ApiRequest<BulkOrganizationsEnrichRequest> request, final AsyncApiCallback<ApiResponse<BulkOrganizationsEnrichResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkOrganizationsEnrichResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkOrganizationsEnrichResponse>() {}, new AsyncApiCallback<ApiResponse<BulkOrganizationsEnrichResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkOrganizationsEnrichResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkOrganizationsEnrichResponse> response = (ApiResponse<BulkOrganizationsEnrichResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkOrganizationsEnrichResponse> response = (ApiResponse<BulkOrganizationsEnrichResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk remove organizations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkDeleteResponse> postExternalcontactsBulkOrganizationsRemoveAsync(PostExternalcontactsBulkOrganizationsRemoveRequest request, final AsyncApiCallback<BulkDeleteResponse> callback) {
    try {
      final SettableFuture<BulkDeleteResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkDeleteResponse>() {}, new AsyncApiCallback<ApiResponse<BulkDeleteResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkDeleteResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk remove organizations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkDeleteResponse>> postExternalcontactsBulkOrganizationsRemoveAsync(ApiRequest<BulkIdsRequest> request, final AsyncApiCallback<ApiResponse<BulkDeleteResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkDeleteResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkDeleteResponse>() {}, new AsyncApiCallback<ApiResponse<BulkDeleteResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkDeleteResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk update organizations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkOrganizationsResponse> postExternalcontactsBulkOrganizationsUpdateAsync(PostExternalcontactsBulkOrganizationsUpdateRequest request, final AsyncApiCallback<BulkOrganizationsResponse> callback) {
    try {
      final SettableFuture<BulkOrganizationsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkOrganizationsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkOrganizationsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkOrganizationsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk update organizations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkOrganizationsResponse>> postExternalcontactsBulkOrganizationsUpdateAsync(ApiRequest<BulkOrganizationsRequest> request, final AsyncApiCallback<ApiResponse<BulkOrganizationsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkOrganizationsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkOrganizationsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkOrganizationsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkOrganizationsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkOrganizationsResponse> response = (ApiResponse<BulkOrganizationsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkOrganizationsResponse> response = (ApiResponse<BulkOrganizationsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch relationships
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkFetchRelationshipsResponse> postExternalcontactsBulkRelationshipsAsync(PostExternalcontactsBulkRelationshipsRequest request, final AsyncApiCallback<BulkFetchRelationshipsResponse> callback) {
    try {
      final SettableFuture<BulkFetchRelationshipsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkFetchRelationshipsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchRelationshipsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchRelationshipsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk fetch relationships
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkFetchRelationshipsResponse>> postExternalcontactsBulkRelationshipsAsync(ApiRequest<BulkIdsRequest> request, final AsyncApiCallback<ApiResponse<BulkFetchRelationshipsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkFetchRelationshipsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkFetchRelationshipsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkFetchRelationshipsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkFetchRelationshipsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchRelationshipsResponse> response = (ApiResponse<BulkFetchRelationshipsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkFetchRelationshipsResponse> response = (ApiResponse<BulkFetchRelationshipsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk add relationships
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkRelationshipsResponse> postExternalcontactsBulkRelationshipsAddAsync(PostExternalcontactsBulkRelationshipsAddRequest request, final AsyncApiCallback<BulkRelationshipsResponse> callback) {
    try {
      final SettableFuture<BulkRelationshipsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkRelationshipsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkRelationshipsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkRelationshipsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk add relationships
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkRelationshipsResponse>> postExternalcontactsBulkRelationshipsAddAsync(ApiRequest<BulkRelationshipsRequest> request, final AsyncApiCallback<ApiResponse<BulkRelationshipsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkRelationshipsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkRelationshipsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkRelationshipsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkRelationshipsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkRelationshipsResponse> response = (ApiResponse<BulkRelationshipsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkRelationshipsResponse> response = (ApiResponse<BulkRelationshipsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk remove relationships
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkDeleteResponse> postExternalcontactsBulkRelationshipsRemoveAsync(PostExternalcontactsBulkRelationshipsRemoveRequest request, final AsyncApiCallback<BulkDeleteResponse> callback) {
    try {
      final SettableFuture<BulkDeleteResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkDeleteResponse>() {}, new AsyncApiCallback<ApiResponse<BulkDeleteResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkDeleteResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk remove relationships
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkDeleteResponse>> postExternalcontactsBulkRelationshipsRemoveAsync(ApiRequest<BulkIdsRequest> request, final AsyncApiCallback<ApiResponse<BulkDeleteResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkDeleteResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkDeleteResponse>() {}, new AsyncApiCallback<ApiResponse<BulkDeleteResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkDeleteResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkDeleteResponse> response = (ApiResponse<BulkDeleteResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk update relationships
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkRelationshipsResponse> postExternalcontactsBulkRelationshipsUpdateAsync(PostExternalcontactsBulkRelationshipsUpdateRequest request, final AsyncApiCallback<BulkRelationshipsResponse> callback) {
    try {
      final SettableFuture<BulkRelationshipsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkRelationshipsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkRelationshipsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkRelationshipsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk update relationships
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkRelationshipsResponse>> postExternalcontactsBulkRelationshipsUpdateAsync(ApiRequest<BulkRelationshipsRequest> request, final AsyncApiCallback<ApiResponse<BulkRelationshipsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkRelationshipsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkRelationshipsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkRelationshipsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkRelationshipsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkRelationshipsResponse> response = (ApiResponse<BulkRelationshipsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkRelationshipsResponse> response = (ApiResponse<BulkRelationshipsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Assign/Unassign up to 10 segments to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment. Any unprocessed segment assignments are returned in the body for the client to retry, in the event of a partial success.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UpdateSegmentAssignmentResponse> postExternalcontactsContactJourneySegmentsAsync(PostExternalcontactsContactJourneySegmentsRequest request, final AsyncApiCallback<UpdateSegmentAssignmentResponse> callback) {
    try {
      final SettableFuture<UpdateSegmentAssignmentResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UpdateSegmentAssignmentResponse>() {}, new AsyncApiCallback<ApiResponse<UpdateSegmentAssignmentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UpdateSegmentAssignmentResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Assign/Unassign up to 10 segments to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment. Any unprocessed segment assignments are returned in the body for the client to retry, in the event of a partial success.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UpdateSegmentAssignmentResponse>> postExternalcontactsContactJourneySegmentsAsync(ApiRequest<UpdateSegmentAssignmentRequest> request, final AsyncApiCallback<ApiResponse<UpdateSegmentAssignmentResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UpdateSegmentAssignmentResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UpdateSegmentAssignmentResponse>() {}, new AsyncApiCallback<ApiResponse<UpdateSegmentAssignmentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UpdateSegmentAssignmentResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UpdateSegmentAssignmentResponse> response = (ApiResponse<UpdateSegmentAssignmentResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UpdateSegmentAssignmentResponse> response = (ApiResponse<UpdateSegmentAssignmentResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a note for an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Note> postExternalcontactsContactNotesAsync(PostExternalcontactsContactNotesRequest request, final AsyncApiCallback<Note> callback) {
    try {
      final SettableFuture<Note> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Note>() {}, new AsyncApiCallback<ApiResponse<Note>>() {
        @Override
        public void onCompleted(ApiResponse<Note> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a note for an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Note>> postExternalcontactsContactNotesAsync(ApiRequest<Note> request, final AsyncApiCallback<ApiResponse<Note>> callback) {
    try {
      final SettableFuture<ApiResponse<Note>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Note>() {}, new AsyncApiCallback<ApiResponse<Note>>() {
        @Override
        public void onCompleted(ApiResponse<Note> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Promote an observed contact (ephemeral or identified) to a curated contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalContact> postExternalcontactsContactPromotionAsync(PostExternalcontactsContactPromotionRequest request, final AsyncApiCallback<ExternalContact> callback) {
    try {
      final SettableFuture<ExternalContact> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Promote an observed contact (ephemeral or identified) to a curated contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalContact>> postExternalcontactsContactPromotionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalContact> postExternalcontactsContactsAsync(PostExternalcontactsContactsRequest request, final AsyncApiCallback<ExternalContact> callback) {
    try {
      final SettableFuture<ExternalContact> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalContact>> postExternalcontactsContactsAsync(ApiRequest<ExternalContact> request, final AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Modify or create an External Contact, with powerful behaviors for finding and combining data with pre-existing Contacts.
   * You may also submit multiple Enrich operations in one request via the Bulk Enrich API at /externalcontacts/bulk/contacts. A 201 response status indicates that a new Contact was created, whereas a 200 status indicates that a Contact was updated or a merge occurred.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalContact> postExternalcontactsContactsEnrichAsync(PostExternalcontactsContactsEnrichRequest request, final AsyncApiCallback<ExternalContact> callback) {
    try {
      final SettableFuture<ExternalContact> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Modify or create an External Contact, with powerful behaviors for finding and combining data with pre-existing Contacts.
   * You may also submit multiple Enrich operations in one request via the Bulk Enrich API at /externalcontacts/bulk/contacts. A 201 response status indicates that a new Contact was created, whereas a 200 status indicates that a Contact was updated or a merge occurred.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalContact>> postExternalcontactsContactsEnrichAsync(ApiRequest<ContactEnrichRequest> request, final AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create bulk export
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactsExport> postExternalcontactsContactsExportsAsync(PostExternalcontactsContactsExportsRequest request, final AsyncApiCallback<ContactsExport> callback) {
    try {
      final SettableFuture<ContactsExport> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactsExport>() {}, new AsyncApiCallback<ApiResponse<ContactsExport>>() {
        @Override
        public void onCompleted(ApiResponse<ContactsExport> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create bulk export
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactsExport>> postExternalcontactsContactsExportsAsync(ApiRequest<ContactsExport> request, final AsyncApiCallback<ApiResponse<ContactsExport>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactsExport>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactsExport>() {}, new AsyncApiCallback<ApiResponse<ContactsExport>>() {
        @Override
        public void onCompleted(ApiResponse<ContactsExport> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactsExport> response = (ApiResponse<ContactsExport>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactsExport> response = (ApiResponse<ContactsExport>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Merge up to 25 contacts into a new contact record
   * Merge operation may fail if the resulting mergeset exceeds our default limit of 52. The valueOverride field lets you override any of the Contact fields post-merge. If any Contact field is left null in `valueOverride`, it will be taken from the most recently-modified contact in the merge set. Exception for *phone/*email fields: Conflicting data will be moved to any other available phone/email fields in the merged contact.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalContact> postExternalcontactsContactsMergeAsync(PostExternalcontactsContactsMergeRequest request, final AsyncApiCallback<ExternalContact> callback) {
    try {
      final SettableFuture<ExternalContact> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Merge up to 25 contacts into a new contact record
   * Merge operation may fail if the resulting mergeset exceeds our default limit of 52. The valueOverride field lets you override any of the Contact fields post-merge. If any Contact field is left null in `valueOverride`, it will be taken from the most recently-modified contact in the merge set. Exception for *phone/*email fields: Conflicting data will be moved to any other available phone/email fields in the merged contact.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalContact>> postExternalcontactsContactsMergeAsync(ApiRequest<MergeContactsRequest> request, final AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> postExternalcontactsContactsSchemasAsync(PostExternalcontactsContactsSchemasRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> postExternalcontactsContactsSchemasAsync(ApiRequest<DataSchema> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an External Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalSource> postExternalcontactsExternalsourcesAsync(PostExternalcontactsExternalsourcesRequest request, final AsyncApiCallback<ExternalSource> callback) {
    try {
      final SettableFuture<ExternalSource> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalSource>() {}, new AsyncApiCallback<ApiResponse<ExternalSource>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalSource> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an External Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalSource>> postExternalcontactsExternalsourcesAsync(ApiRequest<ExternalSource> request, final AsyncApiCallback<ApiResponse<ExternalSource>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalSource>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalSource>() {}, new AsyncApiCallback<ApiResponse<ExternalSource>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalSource> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalSource> response = (ApiResponse<ExternalSource>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalSource> response = (ApiResponse<ExternalSource>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a contact using an identifier type and value.
   * NOTE: Deprecated. Please use /api/v2/externalcontacts/identifierlookup/contacts as an alternative endpoint instead. Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ExternalContact> postExternalcontactsIdentifierlookupAsync(PostExternalcontactsIdentifierlookupRequest request, final AsyncApiCallback<ExternalContact> callback) {
    try {
      final SettableFuture<ExternalContact> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a contact using an identifier type and value.
   * NOTE: Deprecated. Please use /api/v2/externalcontacts/identifierlookup/contacts as an alternative endpoint instead. Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<ExternalContact>> postExternalcontactsIdentifierlookupAsync(ApiRequest<ContactIdentifier> request, final AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a contact using an identifier type and value.
   * Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalContact> postExternalcontactsIdentifierlookupContactsAsync(PostExternalcontactsIdentifierlookupContactsRequest request, final AsyncApiCallback<ExternalContact> callback) {
    try {
      final SettableFuture<ExternalContact> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a contact using an identifier type and value.
   * Phone number identifier values must be provided with the country code and a leading '+' symbol. Example: \"+1 704 298 4733\"
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalContact>> postExternalcontactsIdentifierlookupContactsAsync(ApiRequest<ContactIdentifier> request, final AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch an external organization using an identifier type and value.
   * This endpoint will only accept ExternalId type identifiers.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalOrganization> postExternalcontactsIdentifierlookupOrganizationsAsync(PostExternalcontactsIdentifierlookupOrganizationsRequest request, final AsyncApiCallback<ExternalOrganization> callback) {
    try {
      final SettableFuture<ExternalOrganization> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganization>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganization> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch an external organization using an identifier type and value.
   * This endpoint will only accept ExternalId type identifiers.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalOrganization>> postExternalcontactsIdentifierlookupOrganizationsAsync(ApiRequest<ExternalOrganizationIdentifier> request, final AsyncApiCallback<ApiResponse<ExternalOrganization>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalOrganization>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalOrganization>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganization>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create CSV import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CsvJobResponse> postExternalcontactsImportCsvJobsAsync(PostExternalcontactsImportCsvJobsRequest request, final AsyncApiCallback<CsvJobResponse> callback) {
    try {
      final SettableFuture<CsvJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CsvJobResponse>() {}, new AsyncApiCallback<ApiResponse<CsvJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CsvJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create CSV import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CsvJobResponse>> postExternalcontactsImportCsvJobsAsync(ApiRequest<CsvJobRequest> request, final AsyncApiCallback<ApiResponse<CsvJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CsvJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CsvJobResponse>() {}, new AsyncApiCallback<ApiResponse<CsvJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CsvJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvJobResponse> response = (ApiResponse<CsvJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvJobResponse> response = (ApiResponse<CsvJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create settings for CSV import
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CsvSettings> postExternalcontactsImportCsvSettingsAsync(PostExternalcontactsImportCsvSettingsRequest request, final AsyncApiCallback<CsvSettings> callback) {
    try {
      final SettableFuture<CsvSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CsvSettings>() {}, new AsyncApiCallback<ApiResponse<CsvSettings>>() {
        @Override
        public void onCompleted(ApiResponse<CsvSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create settings for CSV import
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CsvSettings>> postExternalcontactsImportCsvSettingsAsync(ApiRequest<CsvSettings> request, final AsyncApiCallback<ApiResponse<CsvSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<CsvSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CsvSettings>() {}, new AsyncApiCallback<ApiResponse<CsvSettings>>() {
        @Override
        public void onCompleted(ApiResponse<CsvSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvSettings> response = (ApiResponse<CsvSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvSettings> response = (ApiResponse<CsvSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get url for CSV upload
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CsvUploadResponse> postExternalcontactsImportCsvUploadsAsync(PostExternalcontactsImportCsvUploadsRequest request, final AsyncApiCallback<CsvUploadResponse> callback) {
    try {
      final SettableFuture<CsvUploadResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CsvUploadResponse>() {}, new AsyncApiCallback<ApiResponse<CsvUploadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CsvUploadResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get url for CSV upload
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CsvUploadResponse>> postExternalcontactsImportCsvUploadsAsync(ApiRequest<CsvUploadRequest> request, final AsyncApiCallback<ApiResponse<CsvUploadResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CsvUploadResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CsvUploadResponse>() {}, new AsyncApiCallback<ApiResponse<CsvUploadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CsvUploadResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvUploadResponse> response = (ApiResponse<CsvUploadResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvUploadResponse> response = (ApiResponse<CsvUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactImportJobResponse> postExternalcontactsImportJobsAsync(PostExternalcontactsImportJobsRequest request, final AsyncApiCallback<ContactImportJobResponse> callback) {
    try {
      final SettableFuture<ContactImportJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactImportJobResponse>() {}, new AsyncApiCallback<ApiResponse<ContactImportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactImportJobResponse>> postExternalcontactsImportJobsAsync(ApiRequest<ContactImportJobRequest> request, final AsyncApiCallback<ApiResponse<ContactImportJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactImportJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactImportJobResponse>() {}, new AsyncApiCallback<ApiResponse<ContactImportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportJobResponse> response = (ApiResponse<ContactImportJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportJobResponse> response = (ApiResponse<ContactImportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactImportSettings> postExternalcontactsImportSettingsAsync(PostExternalcontactsImportSettingsRequest request, final AsyncApiCallback<ContactImportSettings> callback) {
    try {
      final SettableFuture<ContactImportSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactImportSettings>() {}, new AsyncApiCallback<ApiResponse<ContactImportSettings>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactImportSettings>> postExternalcontactsImportSettingsAsync(ApiRequest<ContactImportSettings> request, final AsyncApiCallback<ApiResponse<ContactImportSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactImportSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactImportSettings>() {}, new AsyncApiCallback<ApiResponse<ContactImportSettings>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportSettings> response = (ApiResponse<ContactImportSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportSettings> response = (ApiResponse<ContactImportSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Merge two contacts into a new contact record
   * Two curated contacts cannot be merged. Refer to the Contact Merging article on the Developer Center for details. Deprecated: This API has been superseded by a new merge API. You are encouraged to instead use /api/v2/externalcontacts/contacts/merge, which supports merging up to 25 Contacts of any type, and overriding specific fields in the resulting Contact.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ExternalContact> postExternalcontactsMergeContactsAsync(PostExternalcontactsMergeContactsRequest request, final AsyncApiCallback<ExternalContact> callback) {
    try {
      final SettableFuture<ExternalContact> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Merge two contacts into a new contact record
   * Two curated contacts cannot be merged. Refer to the Contact Merging article on the Developer Center for details. Deprecated: This API has been superseded by a new merge API. You are encouraged to instead use /api/v2/externalcontacts/contacts/merge, which supports merging up to 25 Contacts of any type, and overriding specific fields in the resulting Contact.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<ExternalContact>> postExternalcontactsMergeContactsAsync(ApiRequest<MergeRequest> request, final AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a note for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Note> postExternalcontactsOrganizationNotesAsync(PostExternalcontactsOrganizationNotesRequest request, final AsyncApiCallback<Note> callback) {
    try {
      final SettableFuture<Note> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Note>() {}, new AsyncApiCallback<ApiResponse<Note>>() {
        @Override
        public void onCompleted(ApiResponse<Note> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a note for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Note>> postExternalcontactsOrganizationNotesAsync(ApiRequest<Note> request, final AsyncApiCallback<ApiResponse<Note>> callback) {
    try {
      final SettableFuture<ApiResponse<Note>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Note>() {}, new AsyncApiCallback<ApiResponse<Note>>() {
        @Override
        public void onCompleted(ApiResponse<Note> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalOrganization> postExternalcontactsOrganizationsAsync(PostExternalcontactsOrganizationsRequest request, final AsyncApiCallback<ExternalOrganization> callback) {
    try {
      final SettableFuture<ExternalOrganization> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganization>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganization> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalOrganization>> postExternalcontactsOrganizationsAsync(ApiRequest<ExternalOrganization> request, final AsyncApiCallback<ApiResponse<ExternalOrganization>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalOrganization>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalOrganization>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganization>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Modify or create an External Org, with powerful behaviors for finding and combining data with pre-existing External Orgs.
   * You may also submit multiple Enrich operations in one request via the Bulk Enrich API at /externalcontacts/bulk/organizations. A 201 response status indicates that a new External Organization was created, whereas a 200 status indicates that an External Organization was updated
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalOrganization> postExternalcontactsOrganizationsEnrichAsync(PostExternalcontactsOrganizationsEnrichRequest request, final AsyncApiCallback<ExternalOrganization> callback) {
    try {
      final SettableFuture<ExternalOrganization> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganization>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganization> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Modify or create an External Org, with powerful behaviors for finding and combining data with pre-existing External Orgs.
   * You may also submit multiple Enrich operations in one request via the Bulk Enrich API at /externalcontacts/bulk/organizations. A 201 response status indicates that a new External Organization was created, whereas a 200 status indicates that an External Organization was updated
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalOrganization>> postExternalcontactsOrganizationsEnrichAsync(ApiRequest<ExternalOrganizationEnrichRequest> request, final AsyncApiCallback<ApiResponse<ExternalOrganization>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalOrganization>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalOrganization>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganization>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> postExternalcontactsOrganizationsSchemasAsync(PostExternalcontactsOrganizationsSchemasRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> postExternalcontactsOrganizationsSchemasAsync(ApiRequest<DataSchema> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a relationship
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Relationship> postExternalcontactsRelationshipsAsync(PostExternalcontactsRelationshipsRequest request, final AsyncApiCallback<Relationship> callback) {
    try {
      final SettableFuture<Relationship> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Relationship>() {}, new AsyncApiCallback<ApiResponse<Relationship>>() {
        @Override
        public void onCompleted(ApiResponse<Relationship> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a relationship
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Relationship>> postExternalcontactsRelationshipsAsync(ApiRequest<Relationship> request, final AsyncApiCallback<ApiResponse<Relationship>> callback) {
    try {
      final SettableFuture<ApiResponse<Relationship>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Relationship>() {}, new AsyncApiCallback<ApiResponse<Relationship>>() {
        @Override
        public void onCompleted(ApiResponse<Relationship> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Relationship> response = (ApiResponse<Relationship>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Relationship> response = (ApiResponse<Relationship>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalContact> putExternalcontactsContactAsync(PutExternalcontactsContactRequest request, final AsyncApiCallback<ExternalContact> callback) {
    try {
      final SettableFuture<ExternalContact> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalContact>> putExternalcontactsContactAsync(ApiRequest<ExternalContact> request, final AsyncApiCallback<ApiResponse<ExternalContact>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalContact>() {}, new AsyncApiCallback<ApiResponse<ExternalContact>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContact> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContact> response = (ApiResponse<ExternalContact>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a note for an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Note> putExternalcontactsContactNoteAsync(PutExternalcontactsContactNoteRequest request, final AsyncApiCallback<Note> callback) {
    try {
      final SettableFuture<Note> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Note>() {}, new AsyncApiCallback<ApiResponse<Note>>() {
        @Override
        public void onCompleted(ApiResponse<Note> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a note for an external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Note>> putExternalcontactsContactNoteAsync(ApiRequest<Note> request, final AsyncApiCallback<ApiResponse<Note>> callback) {
    try {
      final SettableFuture<ApiResponse<Note>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Note>() {}, new AsyncApiCallback<ApiResponse<Note>>() {
        @Override
        public void onCompleted(ApiResponse<Note> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> putExternalcontactsContactsSchemaAsync(PutExternalcontactsContactsSchemaRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> putExternalcontactsContactsSchemaAsync(ApiRequest<DataSchema> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Associate/disassociate an external contact with a conversation
   * To associate, supply a value for the externalContactId.  To disassociate, do not include the property at all.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> putExternalcontactsConversationAsync(PutExternalcontactsConversationRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Associate/disassociate an external contact with a conversation
   * To associate, supply a value for the externalContactId.  To disassociate, do not include the property at all.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> putExternalcontactsConversationAsync(ApiRequest<ConversationAssociation> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an External Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalSource> putExternalcontactsExternalsourceAsync(PutExternalcontactsExternalsourceRequest request, final AsyncApiCallback<ExternalSource> callback) {
    try {
      final SettableFuture<ExternalSource> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalSource>() {}, new AsyncApiCallback<ApiResponse<ExternalSource>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalSource> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an External Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalSource>> putExternalcontactsExternalsourceAsync(ApiRequest<ExternalSource> request, final AsyncApiCallback<ApiResponse<ExternalSource>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalSource>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalSource>() {}, new AsyncApiCallback<ApiResponse<ExternalSource>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalSource> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalSource> response = (ApiResponse<ExternalSource>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalSource> response = (ApiResponse<ExternalSource>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update settings for CSV import
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CsvSettings> putExternalcontactsImportCsvSettingAsync(PutExternalcontactsImportCsvSettingRequest request, final AsyncApiCallback<CsvSettings> callback) {
    try {
      final SettableFuture<CsvSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CsvSettings>() {}, new AsyncApiCallback<ApiResponse<CsvSettings>>() {
        @Override
        public void onCompleted(ApiResponse<CsvSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update settings for CSV import
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CsvSettings>> putExternalcontactsImportCsvSettingAsync(ApiRequest<CsvSettings> request, final AsyncApiCallback<ApiResponse<CsvSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<CsvSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CsvSettings>() {}, new AsyncApiCallback<ApiResponse<CsvSettings>>() {
        @Override
        public void onCompleted(ApiResponse<CsvSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvSettings> response = (ApiResponse<CsvSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CsvSettings> response = (ApiResponse<CsvSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Job's workflow status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactImportJobStatusUpdateResponse> putExternalcontactsImportJobAsync(PutExternalcontactsImportJobRequest request, final AsyncApiCallback<ContactImportJobStatusUpdateResponse> callback) {
    try {
      final SettableFuture<ContactImportJobStatusUpdateResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactImportJobStatusUpdateResponse>() {}, new AsyncApiCallback<ApiResponse<ContactImportJobStatusUpdateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportJobStatusUpdateResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Job's workflow status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactImportJobStatusUpdateResponse>> putExternalcontactsImportJobAsync(ApiRequest<ContactImportJobStatusUpdateRequest> request, final AsyncApiCallback<ApiResponse<ContactImportJobStatusUpdateResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactImportJobStatusUpdateResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactImportJobStatusUpdateResponse>() {}, new AsyncApiCallback<ApiResponse<ContactImportJobStatusUpdateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportJobStatusUpdateResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportJobStatusUpdateResponse> response = (ApiResponse<ContactImportJobStatusUpdateResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportJobStatusUpdateResponse> response = (ApiResponse<ContactImportJobStatusUpdateResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactImportSettings> putExternalcontactsImportSettingAsync(PutExternalcontactsImportSettingRequest request, final AsyncApiCallback<ContactImportSettings> callback) {
    try {
      final SettableFuture<ContactImportSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactImportSettings>() {}, new AsyncApiCallback<ApiResponse<ContactImportSettings>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactImportSettings>> putExternalcontactsImportSettingAsync(ApiRequest<ContactImportSettings> request, final AsyncApiCallback<ApiResponse<ContactImportSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactImportSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactImportSettings>() {}, new AsyncApiCallback<ApiResponse<ContactImportSettings>>() {
        @Override
        public void onCompleted(ApiResponse<ContactImportSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportSettings> response = (ApiResponse<ContactImportSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactImportSettings> response = (ApiResponse<ContactImportSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalOrganization> putExternalcontactsOrganizationAsync(PutExternalcontactsOrganizationRequest request, final AsyncApiCallback<ExternalOrganization> callback) {
    try {
      final SettableFuture<ExternalOrganization> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalOrganization>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganization>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganization> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalOrganization>> putExternalcontactsOrganizationAsync(ApiRequest<ExternalOrganization> request, final AsyncApiCallback<ApiResponse<ExternalOrganization>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalOrganization>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalOrganization>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganization>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganization> response = (ApiResponse<ExternalOrganization>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a note for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Note> putExternalcontactsOrganizationNoteAsync(PutExternalcontactsOrganizationNoteRequest request, final AsyncApiCallback<Note> callback) {
    try {
      final SettableFuture<Note> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Note>() {}, new AsyncApiCallback<ApiResponse<Note>>() {
        @Override
        public void onCompleted(ApiResponse<Note> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a note for an external organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Note>> putExternalcontactsOrganizationNoteAsync(ApiRequest<Note> request, final AsyncApiCallback<ApiResponse<Note>> callback) {
    try {
      final SettableFuture<ApiResponse<Note>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Note>() {}, new AsyncApiCallback<ApiResponse<Note>>() {
        @Override
        public void onCompleted(ApiResponse<Note> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Note> response = (ApiResponse<Note>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Links a Trustor with an External Organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalOrganizationTrustorLink> putExternalcontactsOrganizationTrustorTrustorIdAsync(PutExternalcontactsOrganizationTrustorTrustorIdRequest request, final AsyncApiCallback<ExternalOrganizationTrustorLink> callback) {
    try {
      final SettableFuture<ExternalOrganizationTrustorLink> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalOrganizationTrustorLink>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganizationTrustorLink>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganizationTrustorLink> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Links a Trustor with an External Organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalOrganizationTrustorLink>> putExternalcontactsOrganizationTrustorTrustorIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExternalOrganizationTrustorLink>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalOrganizationTrustorLink>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalOrganizationTrustorLink>() {}, new AsyncApiCallback<ApiResponse<ExternalOrganizationTrustorLink>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalOrganizationTrustorLink> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganizationTrustorLink> response = (ApiResponse<ExternalOrganizationTrustorLink>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalOrganizationTrustorLink> response = (ApiResponse<ExternalOrganizationTrustorLink>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> putExternalcontactsOrganizationsSchemaAsync(PutExternalcontactsOrganizationsSchemaRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> putExternalcontactsOrganizationsSchemaAsync(ApiRequest<DataSchema> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a relationship
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Relationship> putExternalcontactsRelationshipAsync(PutExternalcontactsRelationshipRequest request, final AsyncApiCallback<Relationship> callback) {
    try {
      final SettableFuture<Relationship> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Relationship>() {}, new AsyncApiCallback<ApiResponse<Relationship>>() {
        @Override
        public void onCompleted(ApiResponse<Relationship> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a relationship
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Relationship>> putExternalcontactsRelationshipAsync(ApiRequest<Relationship> request, final AsyncApiCallback<ApiResponse<Relationship>> callback) {
    try {
      final SettableFuture<ApiResponse<Relationship>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Relationship>() {}, new AsyncApiCallback<ApiResponse<Relationship>>() {
        @Override
        public void onCompleted(ApiResponse<Relationship> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Relationship> response = (ApiResponse<Relationship>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Relationship> response = (ApiResponse<Relationship>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }


  private <T> void notifySuccess(SettableFuture<T> future, AsyncApiCallback<T> callback, T result) {
    if (callback != null) {
      try {
        callback.onCompleted(result);
        future.set(result);
      }
      catch (Throwable exception) {
        future.setException(exception);
      }
    }
    else {
      future.set(result);
    }
  }

  private <T> void notifyFailure(SettableFuture<T> future, AsyncApiCallback<T> callback, Throwable exception) {
    if (callback != null) {
      try {
        callback.onFailed(exception);
        future.setException(exception);
      }
      catch (Throwable callbackException) {
        future.setException(callbackException);
      }
    }
    else {
      future.setException(exception);
    }
  }
}
