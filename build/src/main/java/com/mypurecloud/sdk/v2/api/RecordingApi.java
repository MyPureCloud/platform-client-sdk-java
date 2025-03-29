package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AcknowledgeScreenRecordingRequest;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobStatusResult;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmission;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmissionResult;
import com.mypurecloud.sdk.v2.model.ConversationDeletionProtectionQuery;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicy;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyCreate;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyUpdate;
import com.mypurecloud.sdk.v2.model.EncryptionKey;
import com.mypurecloud.sdk.v2.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExecuteRecordingJobsQuery;
import com.mypurecloud.sdk.v2.model.FailedRecordingEntityListing;
import com.mypurecloud.sdk.v2.model.KeyRotationSchedule;
import com.mypurecloud.sdk.v2.model.LocalEncryptionKeyRequest;
import com.mypurecloud.sdk.v2.model.OrphanRecording;
import com.mypurecloud.sdk.v2.model.OrphanRecordingListing;
import com.mypurecloud.sdk.v2.model.OrphanUpdateRequest;
import com.mypurecloud.sdk.v2.model.Policy;
import com.mypurecloud.sdk.v2.model.PolicyCreate;
import com.mypurecloud.sdk.v2.model.PolicyEntityListing;
import com.mypurecloud.sdk.v2.model.PolicyUpdate;
import com.mypurecloud.sdk.v2.model.Recording;
import com.mypurecloud.sdk.v2.model.RecordingEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.RecordingEncryptionConfigurationListing;
import com.mypurecloud.sdk.v2.model.RecordingJob;
import com.mypurecloud.sdk.v2.model.RecordingJobEntityListing;
import com.mypurecloud.sdk.v2.model.RecordingJobsQuery;
import com.mypurecloud.sdk.v2.model.RecordingMetadata;
import com.mypurecloud.sdk.v2.model.RecordingRetentionCursorEntityListing;
import com.mypurecloud.sdk.v2.model.RecordingSettings;
import com.mypurecloud.sdk.v2.model.RecordingUploadReport;
import com.mypurecloud.sdk.v2.model.RecordingUploadReportRequest;
import com.mypurecloud.sdk.v2.model.ScreenRecordingActiveSessions;
import com.mypurecloud.sdk.v2.model.ScreenRecordingMetaDataRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteConversationRecordingAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOrphanrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingCrossplatformMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingCrossplatformMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingJobRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingAnnotationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingmetadataRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingmetadataRecordingIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrphanrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrphanrecordingMediaRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrphanrecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingBatchrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingCrossplatformMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingCrossplatformMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingJobFailedrecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingKeyconfigurationRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingKeyconfigurationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingRecordingkeysRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingRecordingkeysRotationscheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingUploadsReportRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingsRetentionQueryRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingsScreensessionsDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRecordingCrossplatformMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationRecordingAnnotationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingBatchrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingCrossplatformMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingKeyconfigurationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingKeyconfigurationsValidateRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingLocalkeysRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingRecordingkeysRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingUploadsReportsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingsDeletionprotectionRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingsScreensessionsAcknowledgeRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingsScreensessionsMetadataRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationRecordingRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationRecordingAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrphanrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingCrossplatformMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingJobRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingKeyconfigurationRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingRecordingkeysRotationscheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingsDeletionprotectionRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecordingApi {
  private final ApiClient pcapiClient;

  public RecordingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RecordingApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationRecordingAnnotation(String conversationId, String recordingId, String annotationId) throws IOException, ApiException {
     deleteConversationRecordingAnnotation(createDeleteConversationRecordingAnnotationRequest(conversationId, recordingId, annotationId));
  }

  /**
   * Delete annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationRecordingAnnotationWithHttpInfo(String conversationId, String recordingId, String annotationId) throws IOException {
    return deleteConversationRecordingAnnotation(createDeleteConversationRecordingAnnotationRequest(conversationId, recordingId, annotationId).withHttpInfo());
  }

  private DeleteConversationRecordingAnnotationRequest createDeleteConversationRecordingAnnotationRequest(String conversationId, String recordingId, String annotationId) {
    return DeleteConversationRecordingAnnotationRequest.builder()
            .withConversationId(conversationId)

            .withRecordingId(recordingId)

            .withAnnotationId(annotationId)

            .build();
  }

  /**
   * Delete annotation
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationRecordingAnnotation(DeleteConversationRecordingAnnotationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete annotation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationRecordingAnnotation(ApiRequest<Void> request) throws IOException {
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
   * Deletes a single orphan recording
   * 
   * @param orphanId Orphan ID (required)
   * @return OrphanRecording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrphanRecording deleteOrphanrecording(String orphanId) throws IOException, ApiException {
    return  deleteOrphanrecording(createDeleteOrphanrecordingRequest(orphanId));
  }

  /**
   * Deletes a single orphan recording
   * 
   * @param orphanId Orphan ID (required)
   * @return OrphanRecording
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrphanRecording> deleteOrphanrecordingWithHttpInfo(String orphanId) throws IOException {
    return deleteOrphanrecording(createDeleteOrphanrecordingRequest(orphanId).withHttpInfo());
  }

  private DeleteOrphanrecordingRequest createDeleteOrphanrecordingRequest(String orphanId) {
    return DeleteOrphanrecordingRequest.builder()
            .withOrphanId(orphanId)

            .build();
  }

  /**
   * Deletes a single orphan recording
   * 
   * @param request The request object
   * @return OrphanRecording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrphanRecording deleteOrphanrecording(DeleteOrphanrecordingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrphanRecording> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrphanRecording>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Deletes a single orphan recording
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrphanRecording> deleteOrphanrecording(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrphanRecording>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrphanRecording> response = (ApiResponse<OrphanRecording>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OrphanRecording> response = (ApiResponse<OrphanRecording>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param ids  (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRecordingCrossplatformMediaretentionpolicies(String ids) throws IOException, ApiException {
     deleteRecordingCrossplatformMediaretentionpolicies(createDeleteRecordingCrossplatformMediaretentionpoliciesRequest(ids));
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param ids  (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRecordingCrossplatformMediaretentionpoliciesWithHttpInfo(String ids) throws IOException {
    return deleteRecordingCrossplatformMediaretentionpolicies(createDeleteRecordingCrossplatformMediaretentionpoliciesRequest(ids).withHttpInfo());
  }

  private DeleteRecordingCrossplatformMediaretentionpoliciesRequest createDeleteRecordingCrossplatformMediaretentionpoliciesRequest(String ids) {
    return DeleteRecordingCrossplatformMediaretentionpoliciesRequest.builder()
            .withIds(ids)

            .build();
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRecordingCrossplatformMediaretentionpolicies(DeleteRecordingCrossplatformMediaretentionpoliciesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRecordingCrossplatformMediaretentionpolicies(ApiRequest<Void> request) throws IOException {
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
   * Delete a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRecordingCrossplatformMediaretentionpolicy(String policyId) throws IOException, ApiException {
     deleteRecordingCrossplatformMediaretentionpolicy(createDeleteRecordingCrossplatformMediaretentionpolicyRequest(policyId));
  }

  /**
   * Delete a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRecordingCrossplatformMediaretentionpolicyWithHttpInfo(String policyId) throws IOException {
    return deleteRecordingCrossplatformMediaretentionpolicy(createDeleteRecordingCrossplatformMediaretentionpolicyRequest(policyId).withHttpInfo());
  }

  private DeleteRecordingCrossplatformMediaretentionpolicyRequest createDeleteRecordingCrossplatformMediaretentionpolicyRequest(String policyId) {
    return DeleteRecordingCrossplatformMediaretentionpolicyRequest.builder()
            .withPolicyId(policyId)

            .build();
  }

  /**
   * Delete a media retention policy
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRecordingCrossplatformMediaretentionpolicy(DeleteRecordingCrossplatformMediaretentionpolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a media retention policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRecordingCrossplatformMediaretentionpolicy(ApiRequest<Void> request) throws IOException {
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
   * Delete the recording bulk job
   * 
   * @param jobId jobId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRecordingJob(String jobId) throws IOException, ApiException {
     deleteRecordingJob(createDeleteRecordingJobRequest(jobId));
  }

  /**
   * Delete the recording bulk job
   * 
   * @param jobId jobId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRecordingJobWithHttpInfo(String jobId) throws IOException {
    return deleteRecordingJob(createDeleteRecordingJobRequest(jobId).withHttpInfo());
  }

  private DeleteRecordingJobRequest createDeleteRecordingJobRequest(String jobId) {
    return DeleteRecordingJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Delete the recording bulk job
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRecordingJob(DeleteRecordingJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete the recording bulk job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRecordingJob(ApiRequest<Void> request) throws IOException {
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
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param ids  (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRecordingMediaretentionpolicies(String ids) throws IOException, ApiException {
     deleteRecordingMediaretentionpolicies(createDeleteRecordingMediaretentionpoliciesRequest(ids));
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param ids  (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRecordingMediaretentionpoliciesWithHttpInfo(String ids) throws IOException {
    return deleteRecordingMediaretentionpolicies(createDeleteRecordingMediaretentionpoliciesRequest(ids).withHttpInfo());
  }

  private DeleteRecordingMediaretentionpoliciesRequest createDeleteRecordingMediaretentionpoliciesRequest(String ids) {
    return DeleteRecordingMediaretentionpoliciesRequest.builder()
            .withIds(ids)

            .build();
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRecordingMediaretentionpolicies(DeleteRecordingMediaretentionpoliciesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRecordingMediaretentionpolicies(ApiRequest<Void> request) throws IOException {
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
   * Delete a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRecordingMediaretentionpolicy(String policyId) throws IOException, ApiException {
     deleteRecordingMediaretentionpolicy(createDeleteRecordingMediaretentionpolicyRequest(policyId));
  }

  /**
   * Delete a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRecordingMediaretentionpolicyWithHttpInfo(String policyId) throws IOException {
    return deleteRecordingMediaretentionpolicy(createDeleteRecordingMediaretentionpolicyRequest(policyId).withHttpInfo());
  }

  private DeleteRecordingMediaretentionpolicyRequest createDeleteRecordingMediaretentionpolicyRequest(String policyId) {
    return DeleteRecordingMediaretentionpolicyRequest.builder()
            .withPolicyId(policyId)

            .build();
  }

  /**
   * Delete a media retention policy
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRecordingMediaretentionpolicy(DeleteRecordingMediaretentionpolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a media retention policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRecordingMediaretentionpolicy(ApiRequest<Void> request) throws IOException {
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
   * Gets a specific recording.
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param formatId The desired media format. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3,NONE (optional, default to WEBM)
   * @param emailFormatId The desired media format when downloading an email recording. Valid values:EML,NONE (optional, default to EML)
   * @param chatFormatId The desired media format when downloading a chat recording. Valid values:ZIP,NONE  (optional, default to ZIP)
   * @param messageFormatId The desired media format when downloading a message recording. Valid values:ZIP,NONE (optional, default to ZIP)
   * @param download requesting a download format of the recording. Valid values:true,false (optional, default to false)
   * @param fileName the name of the downloaded fileName (optional)
   * @param locale The locale for the requested file when downloading or for redacting sensitive information in requested files, as an ISO 639-1 code (optional)
   * @param mediaFormats All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3 (optional)
   * @return Recording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recording getConversationRecording(String conversationId, String recordingId, String formatId, String emailFormatId, String chatFormatId, String messageFormatId, Boolean download, String fileName, String locale, List<String> mediaFormats) throws IOException, ApiException {
    return  getConversationRecording(createGetConversationRecordingRequest(conversationId, recordingId, formatId, emailFormatId, chatFormatId, messageFormatId, download, fileName, locale, mediaFormats));
  }

  /**
   * Gets a specific recording.
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param formatId The desired media format. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3,NONE (optional, default to WEBM)
   * @param emailFormatId The desired media format when downloading an email recording. Valid values:EML,NONE (optional, default to EML)
   * @param chatFormatId The desired media format when downloading a chat recording. Valid values:ZIP,NONE  (optional, default to ZIP)
   * @param messageFormatId The desired media format when downloading a message recording. Valid values:ZIP,NONE (optional, default to ZIP)
   * @param download requesting a download format of the recording. Valid values:true,false (optional, default to false)
   * @param fileName the name of the downloaded fileName (optional)
   * @param locale The locale for the requested file when downloading or for redacting sensitive information in requested files, as an ISO 639-1 code (optional)
   * @param mediaFormats All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3 (optional)
   * @return Recording
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recording> getConversationRecordingWithHttpInfo(String conversationId, String recordingId, String formatId, String emailFormatId, String chatFormatId, String messageFormatId, Boolean download, String fileName, String locale, List<String> mediaFormats) throws IOException {
    return getConversationRecording(createGetConversationRecordingRequest(conversationId, recordingId, formatId, emailFormatId, chatFormatId, messageFormatId, download, fileName, locale, mediaFormats).withHttpInfo());
  }

  private GetConversationRecordingRequest createGetConversationRecordingRequest(String conversationId, String recordingId, String formatId, String emailFormatId, String chatFormatId, String messageFormatId, Boolean download, String fileName, String locale, List<String> mediaFormats) {
    return GetConversationRecordingRequest.builder()
            .withConversationId(conversationId)

            .withRecordingId(recordingId)

            .withFormatId(formatId)

            .withEmailFormatId(emailFormatId)

            .withChatFormatId(chatFormatId)

            .withMessageFormatId(messageFormatId)

            .withDownload(download)

            .withFileName(fileName)

            .withLocale(locale)

            .withMediaFormats(mediaFormats)

            .build();
  }

  /**
   * Gets a specific recording.
   * 
   * @param request The request object
   * @return Recording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recording getConversationRecording(GetConversationRecordingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Recording> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Recording>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a specific recording.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recording> getConversationRecording(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Recording>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @return Annotation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Annotation getConversationRecordingAnnotation(String conversationId, String recordingId, String annotationId) throws IOException, ApiException {
    return  getConversationRecordingAnnotation(createGetConversationRecordingAnnotationRequest(conversationId, recordingId, annotationId));
  }

  /**
   * Get annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @return Annotation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Annotation> getConversationRecordingAnnotationWithHttpInfo(String conversationId, String recordingId, String annotationId) throws IOException {
    return getConversationRecordingAnnotation(createGetConversationRecordingAnnotationRequest(conversationId, recordingId, annotationId).withHttpInfo());
  }

  private GetConversationRecordingAnnotationRequest createGetConversationRecordingAnnotationRequest(String conversationId, String recordingId, String annotationId) {
    return GetConversationRecordingAnnotationRequest.builder()
            .withConversationId(conversationId)

            .withRecordingId(recordingId)

            .withAnnotationId(annotationId)

            .build();
  }

  /**
   * Get annotation
   * 
   * @param request The request object
   * @return Annotation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Annotation getConversationRecordingAnnotation(GetConversationRecordingAnnotationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Annotation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Annotation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get annotation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Annotation> getConversationRecordingAnnotation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Annotation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Annotation> response = (ApiResponse<Annotation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Annotation> response = (ApiResponse<Annotation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get annotations for recording
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @return List<Annotation>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Annotation> getConversationRecordingAnnotations(String conversationId, String recordingId) throws IOException, ApiException {
    return  getConversationRecordingAnnotations(createGetConversationRecordingAnnotationsRequest(conversationId, recordingId));
  }

  /**
   * Get annotations for recording
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @return List<Annotation>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Annotation>> getConversationRecordingAnnotationsWithHttpInfo(String conversationId, String recordingId) throws IOException {
    return getConversationRecordingAnnotations(createGetConversationRecordingAnnotationsRequest(conversationId, recordingId).withHttpInfo());
  }

  private GetConversationRecordingAnnotationsRequest createGetConversationRecordingAnnotationsRequest(String conversationId, String recordingId) {
    return GetConversationRecordingAnnotationsRequest.builder()
            .withConversationId(conversationId)

            .withRecordingId(recordingId)

            .build();
  }

  /**
   * Get annotations for recording
   * 
   * @param request The request object
   * @return List<Annotation>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Annotation> getConversationRecordingAnnotations(GetConversationRecordingAnnotationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<Annotation>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<Annotation>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get annotations for recording
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Annotation>> getConversationRecordingAnnotations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<Annotation>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<Annotation>> response = (ApiResponse<List<Annotation>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<Annotation>> response = (ApiResponse<List<Annotation>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get recording metadata for a conversation. Does not return playable media nor system annotations. Bookmark annotations will be excluded if either recording:recording:view or recording:annotation:view permission is missing.
   * 
   * @param conversationId Conversation ID (required)
   * @return List<RecordingMetadata>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<RecordingMetadata> getConversationRecordingmetadata(String conversationId) throws IOException, ApiException {
    return  getConversationRecordingmetadata(createGetConversationRecordingmetadataRequest(conversationId));
  }

  /**
   * Get recording metadata for a conversation. Does not return playable media nor system annotations. Bookmark annotations will be excluded if either recording:recording:view or recording:annotation:view permission is missing.
   * 
   * @param conversationId Conversation ID (required)
   * @return List<RecordingMetadata>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<RecordingMetadata>> getConversationRecordingmetadataWithHttpInfo(String conversationId) throws IOException {
    return getConversationRecordingmetadata(createGetConversationRecordingmetadataRequest(conversationId).withHttpInfo());
  }

  private GetConversationRecordingmetadataRequest createGetConversationRecordingmetadataRequest(String conversationId) {
    return GetConversationRecordingmetadataRequest.builder()
            .withConversationId(conversationId)

            .build();
  }

  /**
   * Get recording metadata for a conversation. Does not return playable media nor system annotations. Bookmark annotations will be excluded if either recording:recording:view or recording:annotation:view permission is missing.
   * 
   * @param request The request object
   * @return List<RecordingMetadata>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<RecordingMetadata> getConversationRecordingmetadata(GetConversationRecordingmetadataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<RecordingMetadata>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<RecordingMetadata>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get recording metadata for a conversation. Does not return playable media nor system annotations. Bookmark annotations will be excluded if either recording:recording:view or recording:annotation:view permission is missing.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<RecordingMetadata>> getConversationRecordingmetadata(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<RecordingMetadata>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<RecordingMetadata>> response = (ApiResponse<List<RecordingMetadata>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<RecordingMetadata>> response = (ApiResponse<List<RecordingMetadata>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get metadata for a specific recording. Does not return playable media.
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @return RecordingMetadata
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingMetadata getConversationRecordingmetadataRecordingId(String conversationId, String recordingId) throws IOException, ApiException {
    return  getConversationRecordingmetadataRecordingId(createGetConversationRecordingmetadataRecordingIdRequest(conversationId, recordingId));
  }

  /**
   * Get metadata for a specific recording. Does not return playable media.
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @return RecordingMetadata
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingMetadata> getConversationRecordingmetadataRecordingIdWithHttpInfo(String conversationId, String recordingId) throws IOException {
    return getConversationRecordingmetadataRecordingId(createGetConversationRecordingmetadataRecordingIdRequest(conversationId, recordingId).withHttpInfo());
  }

  private GetConversationRecordingmetadataRecordingIdRequest createGetConversationRecordingmetadataRecordingIdRequest(String conversationId, String recordingId) {
    return GetConversationRecordingmetadataRecordingIdRequest.builder()
            .withConversationId(conversationId)

            .withRecordingId(recordingId)

            .build();
  }

  /**
   * Get metadata for a specific recording. Does not return playable media.
   * 
   * @param request The request object
   * @return RecordingMetadata
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingMetadata getConversationRecordingmetadataRecordingId(GetConversationRecordingmetadataRecordingIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingMetadata> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingMetadata>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get metadata for a specific recording. Does not return playable media.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingMetadata> getConversationRecordingmetadataRecordingId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingMetadata>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingMetadata> response = (ApiResponse<RecordingMetadata>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingMetadata> response = (ApiResponse<RecordingMetadata>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all of a Conversation's Recordings.
   * 
   * @param conversationId Conversation ID (required)
   * @param maxWaitMs The maximum number of milliseconds to wait for the recording to be ready. Must be a positive value. (optional, default to 5000)
   * @param formatId The desired media format. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3,NONE. (optional, default to WEBM)
   * @param mediaFormats All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3. (optional)
   * @param locale The locale used for redacting sensitive information in requested files, as an ISO 639-1 code (optional)
   * @param includePauseAnnotationsForScreenRecordings Include applicable Secure Pause annotations from all audio recordings to all screen recordings (optional, default to false)
   * @return List<Recording>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Recording> getConversationRecordings(String conversationId, Integer maxWaitMs, String formatId, List<String> mediaFormats, String locale, Boolean includePauseAnnotationsForScreenRecordings) throws IOException, ApiException {
    return  getConversationRecordings(createGetConversationRecordingsRequest(conversationId, maxWaitMs, formatId, mediaFormats, locale, includePauseAnnotationsForScreenRecordings));
  }

  /**
   * Get all of a Conversation's Recordings.
   * 
   * @param conversationId Conversation ID (required)
   * @param maxWaitMs The maximum number of milliseconds to wait for the recording to be ready. Must be a positive value. (optional, default to 5000)
   * @param formatId The desired media format. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3,NONE. (optional, default to WEBM)
   * @param mediaFormats All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3. (optional)
   * @param locale The locale used for redacting sensitive information in requested files, as an ISO 639-1 code (optional)
   * @param includePauseAnnotationsForScreenRecordings Include applicable Secure Pause annotations from all audio recordings to all screen recordings (optional, default to false)
   * @return List<Recording>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Recording>> getConversationRecordingsWithHttpInfo(String conversationId, Integer maxWaitMs, String formatId, List<String> mediaFormats, String locale, Boolean includePauseAnnotationsForScreenRecordings) throws IOException {
    return getConversationRecordings(createGetConversationRecordingsRequest(conversationId, maxWaitMs, formatId, mediaFormats, locale, includePauseAnnotationsForScreenRecordings).withHttpInfo());
  }

  private GetConversationRecordingsRequest createGetConversationRecordingsRequest(String conversationId, Integer maxWaitMs, String formatId, List<String> mediaFormats, String locale, Boolean includePauseAnnotationsForScreenRecordings) {
    return GetConversationRecordingsRequest.builder()
            .withConversationId(conversationId)

            .withMaxWaitMs(maxWaitMs)

            .withFormatId(formatId)

            .withMediaFormats(mediaFormats)

            .withLocale(locale)

            .withIncludePauseAnnotationsForScreenRecordings(includePauseAnnotationsForScreenRecordings)

            .build();
  }

  /**
   * Get all of a Conversation's Recordings.
   * 
   * @param request The request object
   * @return List<Recording>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Recording> getConversationRecordings(GetConversationRecordingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<Recording>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<Recording>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all of a Conversation's Recordings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Recording>> getConversationRecordings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<Recording>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<Recording>> response = (ApiResponse<List<Recording>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<Recording>> response = (ApiResponse<List<Recording>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets a single orphan recording
   * 
   * @param orphanId Orphan ID (required)
   * @return OrphanRecording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrphanRecording getOrphanrecording(String orphanId) throws IOException, ApiException {
    return  getOrphanrecording(createGetOrphanrecordingRequest(orphanId));
  }

  /**
   * Gets a single orphan recording
   * 
   * @param orphanId Orphan ID (required)
   * @return OrphanRecording
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrphanRecording> getOrphanrecordingWithHttpInfo(String orphanId) throws IOException {
    return getOrphanrecording(createGetOrphanrecordingRequest(orphanId).withHttpInfo());
  }

  private GetOrphanrecordingRequest createGetOrphanrecordingRequest(String orphanId) {
    return GetOrphanrecordingRequest.builder()
            .withOrphanId(orphanId)

            .build();
  }

  /**
   * Gets a single orphan recording
   * 
   * @param request The request object
   * @return OrphanRecording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrphanRecording getOrphanrecording(GetOrphanrecordingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrphanRecording> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrphanRecording>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a single orphan recording
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrphanRecording> getOrphanrecording(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrphanRecording>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrphanRecording> response = (ApiResponse<OrphanRecording>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OrphanRecording> response = (ApiResponse<OrphanRecording>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets the media of a single orphan recording
   * A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.
   * @param orphanId Orphan ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @param emailFormatId The desired media format when downloading an email recording. (optional, default to EML)
   * @param chatFormatId The desired media format when downloading a chat recording. (optional, default to ZIP)
   * @param messageFormatId The desired media format when downloading a message recording. (optional, default to ZIP)
   * @param download requesting a download format of the recording (optional, default to false)
   * @param fileName the name of the downloaded fileName (optional)
   * @param locale The locale for the requested file when downloading, as an ISO 639-1 code (optional)
   * @param mediaFormats All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3 (optional)
   * @return Recording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recording getOrphanrecordingMedia(String orphanId, String formatId, String emailFormatId, String chatFormatId, String messageFormatId, Boolean download, String fileName, String locale, List<String> mediaFormats) throws IOException, ApiException {
    return  getOrphanrecordingMedia(createGetOrphanrecordingMediaRequest(orphanId, formatId, emailFormatId, chatFormatId, messageFormatId, download, fileName, locale, mediaFormats));
  }

  /**
   * Gets the media of a single orphan recording
   * A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.
   * @param orphanId Orphan ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @param emailFormatId The desired media format when downloading an email recording. (optional, default to EML)
   * @param chatFormatId The desired media format when downloading a chat recording. (optional, default to ZIP)
   * @param messageFormatId The desired media format when downloading a message recording. (optional, default to ZIP)
   * @param download requesting a download format of the recording (optional, default to false)
   * @param fileName the name of the downloaded fileName (optional)
   * @param locale The locale for the requested file when downloading, as an ISO 639-1 code (optional)
   * @param mediaFormats All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3 (optional)
   * @return Recording
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recording> getOrphanrecordingMediaWithHttpInfo(String orphanId, String formatId, String emailFormatId, String chatFormatId, String messageFormatId, Boolean download, String fileName, String locale, List<String> mediaFormats) throws IOException {
    return getOrphanrecordingMedia(createGetOrphanrecordingMediaRequest(orphanId, formatId, emailFormatId, chatFormatId, messageFormatId, download, fileName, locale, mediaFormats).withHttpInfo());
  }

  private GetOrphanrecordingMediaRequest createGetOrphanrecordingMediaRequest(String orphanId, String formatId, String emailFormatId, String chatFormatId, String messageFormatId, Boolean download, String fileName, String locale, List<String> mediaFormats) {
    return GetOrphanrecordingMediaRequest.builder()
            .withOrphanId(orphanId)

            .withFormatId(formatId)

            .withEmailFormatId(emailFormatId)

            .withChatFormatId(chatFormatId)

            .withMessageFormatId(messageFormatId)

            .withDownload(download)

            .withFileName(fileName)

            .withLocale(locale)

            .withMediaFormats(mediaFormats)

            .build();
  }

  /**
   * Gets the media of a single orphan recording
   * A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.
   * @param request The request object
   * @return Recording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recording getOrphanrecordingMedia(GetOrphanrecordingMediaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Recording> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Recording>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets the media of a single orphan recording
   * A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recording> getOrphanrecordingMedia(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Recording>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets all orphan recordings
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param hasConversation Filter resulting orphans by whether the conversation is known. False returns all orphans for the organization. (optional, default to false)
   * @param media Filter resulting orphans based on their media type (optional)
   * @return OrphanRecordingListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrphanRecordingListing getOrphanrecordings(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Boolean hasConversation, String media) throws IOException, ApiException {
    return  getOrphanrecordings(createGetOrphanrecordingsRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, hasConversation, media));
  }

  /**
   * Gets all orphan recordings
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param hasConversation Filter resulting orphans by whether the conversation is known. False returns all orphans for the organization. (optional, default to false)
   * @param media Filter resulting orphans based on their media type (optional)
   * @return OrphanRecordingListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrphanRecordingListing> getOrphanrecordingsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Boolean hasConversation, String media) throws IOException {
    return getOrphanrecordings(createGetOrphanrecordingsRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, hasConversation, media).withHttpInfo());
  }

  private GetOrphanrecordingsRequest createGetOrphanrecordingsRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Boolean hasConversation, String media) {
    return GetOrphanrecordingsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withHasConversation(hasConversation)

            .withMedia(media)

            .build();
  }

  /**
   * Gets all orphan recordings
   * 
   * @param request The request object
   * @return OrphanRecordingListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrphanRecordingListing getOrphanrecordings(GetOrphanrecordingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrphanRecordingListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrphanRecordingListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets all orphan recordings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrphanRecordingListing> getOrphanrecordings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrphanRecordingListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrphanRecordingListing> response = (ApiResponse<OrphanRecordingListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OrphanRecordingListing> response = (ApiResponse<OrphanRecordingListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the status and results for a batch request job, only the user that submitted the job may retrieve results. Each result may contain either a URL to a recording or an error; additionally, a recording could be associated with multiple results.
   * 
   * @param jobId jobId (required)
   * @return BatchDownloadJobStatusResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BatchDownloadJobStatusResult getRecordingBatchrequest(String jobId) throws IOException, ApiException {
    return  getRecordingBatchrequest(createGetRecordingBatchrequestRequest(jobId));
  }

  /**
   * Get the status and results for a batch request job, only the user that submitted the job may retrieve results. Each result may contain either a URL to a recording or an error; additionally, a recording could be associated with multiple results.
   * 
   * @param jobId jobId (required)
   * @return BatchDownloadJobStatusResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BatchDownloadJobStatusResult> getRecordingBatchrequestWithHttpInfo(String jobId) throws IOException {
    return getRecordingBatchrequest(createGetRecordingBatchrequestRequest(jobId).withHttpInfo());
  }

  private GetRecordingBatchrequestRequest createGetRecordingBatchrequestRequest(String jobId) {
    return GetRecordingBatchrequestRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get the status and results for a batch request job, only the user that submitted the job may retrieve results. Each result may contain either a URL to a recording or an error; additionally, a recording could be associated with multiple results.
   * 
   * @param request The request object
   * @return BatchDownloadJobStatusResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BatchDownloadJobStatusResult getRecordingBatchrequest(GetRecordingBatchrequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BatchDownloadJobStatusResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BatchDownloadJobStatusResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the status and results for a batch request job, only the user that submitted the job may retrieve results. Each result may contain either a URL to a recording or an error; additionally, a recording could be associated with multiple results.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BatchDownloadJobStatusResult> getRecordingBatchrequest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BatchDownloadJobStatusResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BatchDownloadJobStatusResult> response = (ApiResponse<BatchDownloadJobStatusResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BatchDownloadJobStatusResult> response = (ApiResponse<BatchDownloadJobStatusResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary=true to this endpoint
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name the policy name - used for filtering results in searches. (optional)
   * @param enabled checks to see if policy is enabled - use enabled = true or enabled = false (optional)
   * @param summary provides a less verbose response of policy lists. (optional, default to false)
   * @param hasErrors provides a way to fetch all policies with errors or policies that do not have errors (optional)
   * @param deleteDaysThreshold provides a way to fetch all policies with any actions having deleteDays exceeding the provided value (optional)
   * @return PolicyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PolicyEntityListing getRecordingCrossplatformMediaretentionpolicies(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String name, Boolean enabled, Boolean summary, Boolean hasErrors, Integer deleteDaysThreshold) throws IOException, ApiException {
    return  getRecordingCrossplatformMediaretentionpolicies(createGetRecordingCrossplatformMediaretentionpoliciesRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors, deleteDaysThreshold));
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary=true to this endpoint
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name the policy name - used for filtering results in searches. (optional)
   * @param enabled checks to see if policy is enabled - use enabled = true or enabled = false (optional)
   * @param summary provides a less verbose response of policy lists. (optional, default to false)
   * @param hasErrors provides a way to fetch all policies with errors or policies that do not have errors (optional)
   * @param deleteDaysThreshold provides a way to fetch all policies with any actions having deleteDays exceeding the provided value (optional)
   * @return PolicyEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PolicyEntityListing> getRecordingCrossplatformMediaretentionpoliciesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String name, Boolean enabled, Boolean summary, Boolean hasErrors, Integer deleteDaysThreshold) throws IOException {
    return getRecordingCrossplatformMediaretentionpolicies(createGetRecordingCrossplatformMediaretentionpoliciesRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors, deleteDaysThreshold).withHttpInfo());
  }

  private GetRecordingCrossplatformMediaretentionpoliciesRequest createGetRecordingCrossplatformMediaretentionpoliciesRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String name, Boolean enabled, Boolean summary, Boolean hasErrors, Integer deleteDaysThreshold) {
    return GetRecordingCrossplatformMediaretentionpoliciesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withName(name)

            .withEnabled(enabled)

            .withSummary(summary)

            .withHasErrors(hasErrors)

            .withDeleteDaysThreshold(deleteDaysThreshold)

            .build();
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary=true to this endpoint
   * @param request The request object
   * @return PolicyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PolicyEntityListing getRecordingCrossplatformMediaretentionpolicies(GetRecordingCrossplatformMediaretentionpoliciesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PolicyEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PolicyEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary=true to this endpoint
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PolicyEntityListing> getRecordingCrossplatformMediaretentionpolicies(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PolicyEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PolicyEntityListing> response = (ApiResponse<PolicyEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PolicyEntityListing> response = (ApiResponse<PolicyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @return CrossPlatformPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CrossPlatformPolicy getRecordingCrossplatformMediaretentionpolicy(String policyId) throws IOException, ApiException {
    return  getRecordingCrossplatformMediaretentionpolicy(createGetRecordingCrossplatformMediaretentionpolicyRequest(policyId));
  }

  /**
   * Get a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @return CrossPlatformPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CrossPlatformPolicy> getRecordingCrossplatformMediaretentionpolicyWithHttpInfo(String policyId) throws IOException {
    return getRecordingCrossplatformMediaretentionpolicy(createGetRecordingCrossplatformMediaretentionpolicyRequest(policyId).withHttpInfo());
  }

  private GetRecordingCrossplatformMediaretentionpolicyRequest createGetRecordingCrossplatformMediaretentionpolicyRequest(String policyId) {
    return GetRecordingCrossplatformMediaretentionpolicyRequest.builder()
            .withPolicyId(policyId)

            .build();
  }

  /**
   * Get a media retention policy
   * 
   * @param request The request object
   * @return CrossPlatformPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CrossPlatformPolicy getRecordingCrossplatformMediaretentionpolicy(GetRecordingCrossplatformMediaretentionpolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CrossPlatformPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CrossPlatformPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a media retention policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CrossPlatformPolicy> getRecordingCrossplatformMediaretentionpolicy(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CrossPlatformPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the status of the job associated with the job id.
   * 
   * @param jobId jobId (required)
   * @return RecordingJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingJob getRecordingJob(String jobId) throws IOException, ApiException {
    return  getRecordingJob(createGetRecordingJobRequest(jobId));
  }

  /**
   * Get the status of the job associated with the job id.
   * 
   * @param jobId jobId (required)
   * @return RecordingJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingJob> getRecordingJobWithHttpInfo(String jobId) throws IOException {
    return getRecordingJob(createGetRecordingJobRequest(jobId).withHttpInfo());
  }

  private GetRecordingJobRequest createGetRecordingJobRequest(String jobId) {
    return GetRecordingJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get the status of the job associated with the job id.
   * 
   * @param request The request object
   * @return RecordingJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingJob getRecordingJob(GetRecordingJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the status of the job associated with the job id.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingJob> getRecordingJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingJob> response = (ApiResponse<RecordingJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingJob> response = (ApiResponse<RecordingJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get IDs of recordings that the bulk job failed for
   * 
   * @param jobId jobId (required)
   * @param pageSize Page size. Maximum is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param includeTotal If false, cursor will be used to locate the page instead of pageNumber. (optional)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @return FailedRecordingEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FailedRecordingEntityListing getRecordingJobFailedrecordings(String jobId, Integer pageSize, Integer pageNumber, Boolean includeTotal, String cursor) throws IOException, ApiException {
    return  getRecordingJobFailedrecordings(createGetRecordingJobFailedrecordingsRequest(jobId, pageSize, pageNumber, includeTotal, cursor));
  }

  /**
   * Get IDs of recordings that the bulk job failed for
   * 
   * @param jobId jobId (required)
   * @param pageSize Page size. Maximum is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param includeTotal If false, cursor will be used to locate the page instead of pageNumber. (optional)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @return FailedRecordingEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FailedRecordingEntityListing> getRecordingJobFailedrecordingsWithHttpInfo(String jobId, Integer pageSize, Integer pageNumber, Boolean includeTotal, String cursor) throws IOException {
    return getRecordingJobFailedrecordings(createGetRecordingJobFailedrecordingsRequest(jobId, pageSize, pageNumber, includeTotal, cursor).withHttpInfo());
  }

  private GetRecordingJobFailedrecordingsRequest createGetRecordingJobFailedrecordingsRequest(String jobId, Integer pageSize, Integer pageNumber, Boolean includeTotal, String cursor) {
    return GetRecordingJobFailedrecordingsRequest.builder()
            .withJobId(jobId)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withIncludeTotal(includeTotal)

            .withCursor(cursor)

            .build();
  }

  /**
   * Get IDs of recordings that the bulk job failed for
   * 
   * @param request The request object
   * @return FailedRecordingEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FailedRecordingEntityListing getRecordingJobFailedrecordings(GetRecordingJobFailedrecordingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FailedRecordingEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FailedRecordingEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get IDs of recordings that the bulk job failed for
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FailedRecordingEntityListing> getRecordingJobFailedrecordings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FailedRecordingEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FailedRecordingEntityListing> response = (ApiResponse<FailedRecordingEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FailedRecordingEntityListing> response = (ApiResponse<FailedRecordingEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the status of all jobs within the user's organization
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to userId)
   * @param state Filter by state (optional)
   * @param showOnlyMyJobs Show only my jobs (optional)
   * @param jobType Job Type (Can be left empty for both) (optional)
   * @param includeTotal If false, cursor will be used to locate the page instead of pageNumber. (optional)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @return RecordingJobEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingJobEntityListing getRecordingJobs(Integer pageSize, Integer pageNumber, String sortBy, String state, Boolean showOnlyMyJobs, String jobType, Boolean includeTotal, String cursor) throws IOException, ApiException {
    return  getRecordingJobs(createGetRecordingJobsRequest(pageSize, pageNumber, sortBy, state, showOnlyMyJobs, jobType, includeTotal, cursor));
  }

  /**
   * Get the status of all jobs within the user's organization
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to userId)
   * @param state Filter by state (optional)
   * @param showOnlyMyJobs Show only my jobs (optional)
   * @param jobType Job Type (Can be left empty for both) (optional)
   * @param includeTotal If false, cursor will be used to locate the page instead of pageNumber. (optional)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @return RecordingJobEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingJobEntityListing> getRecordingJobsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String state, Boolean showOnlyMyJobs, String jobType, Boolean includeTotal, String cursor) throws IOException {
    return getRecordingJobs(createGetRecordingJobsRequest(pageSize, pageNumber, sortBy, state, showOnlyMyJobs, jobType, includeTotal, cursor).withHttpInfo());
  }

  private GetRecordingJobsRequest createGetRecordingJobsRequest(Integer pageSize, Integer pageNumber, String sortBy, String state, Boolean showOnlyMyJobs, String jobType, Boolean includeTotal, String cursor) {
    return GetRecordingJobsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withState(state)

            .withShowOnlyMyJobs(showOnlyMyJobs)

            .withJobType(jobType)

            .withIncludeTotal(includeTotal)

            .withCursor(cursor)

            .build();
  }

  /**
   * Get the status of all jobs within the user's organization
   * 
   * @param request The request object
   * @return RecordingJobEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingJobEntityListing getRecordingJobs(GetRecordingJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingJobEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingJobEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the status of all jobs within the user's organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingJobEntityListing> getRecordingJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingJobEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingJobEntityListing> response = (ApiResponse<RecordingJobEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingJobEntityListing> response = (ApiResponse<RecordingJobEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the encryption key configurations
   * 
   * @param keyConfigurationId Key Configurations Id (required)
   * @return RecordingEncryptionConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingEncryptionConfiguration getRecordingKeyconfiguration(String keyConfigurationId) throws IOException, ApiException {
    return  getRecordingKeyconfiguration(createGetRecordingKeyconfigurationRequest(keyConfigurationId));
  }

  /**
   * Get the encryption key configurations
   * 
   * @param keyConfigurationId Key Configurations Id (required)
   * @return RecordingEncryptionConfiguration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingEncryptionConfiguration> getRecordingKeyconfigurationWithHttpInfo(String keyConfigurationId) throws IOException {
    return getRecordingKeyconfiguration(createGetRecordingKeyconfigurationRequest(keyConfigurationId).withHttpInfo());
  }

  private GetRecordingKeyconfigurationRequest createGetRecordingKeyconfigurationRequest(String keyConfigurationId) {
    return GetRecordingKeyconfigurationRequest.builder()
            .withKeyConfigurationId(keyConfigurationId)

            .build();
  }

  /**
   * Get the encryption key configurations
   * 
   * @param request The request object
   * @return RecordingEncryptionConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingEncryptionConfiguration getRecordingKeyconfiguration(GetRecordingKeyconfigurationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingEncryptionConfiguration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingEncryptionConfiguration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the encryption key configurations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingEncryptionConfiguration> getRecordingKeyconfiguration(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingEncryptionConfiguration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingEncryptionConfiguration> response = (ApiResponse<RecordingEncryptionConfiguration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingEncryptionConfiguration> response = (ApiResponse<RecordingEncryptionConfiguration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of key configurations data
   * 
   * @return RecordingEncryptionConfigurationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingEncryptionConfigurationListing getRecordingKeyconfigurations() throws IOException, ApiException {
    return  getRecordingKeyconfigurations(createGetRecordingKeyconfigurationsRequest());
  }

  /**
   * Get a list of key configurations data
   * 
   * @return RecordingEncryptionConfigurationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingEncryptionConfigurationListing> getRecordingKeyconfigurationsWithHttpInfo() throws IOException {
    return getRecordingKeyconfigurations(createGetRecordingKeyconfigurationsRequest().withHttpInfo());
  }

  private GetRecordingKeyconfigurationsRequest createGetRecordingKeyconfigurationsRequest() {
    return GetRecordingKeyconfigurationsRequest.builder()
            .build();
  }

  /**
   * Get a list of key configurations data
   * 
   * @param request The request object
   * @return RecordingEncryptionConfigurationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingEncryptionConfigurationListing getRecordingKeyconfigurations(GetRecordingKeyconfigurationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingEncryptionConfigurationListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingEncryptionConfigurationListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of key configurations data
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingEncryptionConfigurationListing> getRecordingKeyconfigurations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingEncryptionConfigurationListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingEncryptionConfigurationListing> response = (ApiResponse<RecordingEncryptionConfigurationListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingEncryptionConfigurationListing> response = (ApiResponse<RecordingEncryptionConfigurationListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary=true to this endpoint
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name the policy name - used for filtering results in searches. (optional)
   * @param enabled checks to see if policy is enabled - use enabled = true or enabled = false (optional)
   * @param summary provides a less verbose response of policy lists. (optional, default to false)
   * @param hasErrors provides a way to fetch all policies with errors or policies that do not have errors (optional)
   * @param deleteDaysThreshold provides a way to fetch all policies with any actions having deleteDays exceeding the provided value (optional)
   * @return PolicyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PolicyEntityListing getRecordingMediaretentionpolicies(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String name, Boolean enabled, Boolean summary, Boolean hasErrors, Integer deleteDaysThreshold) throws IOException, ApiException {
    return  getRecordingMediaretentionpolicies(createGetRecordingMediaretentionpoliciesRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors, deleteDaysThreshold));
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary=true to this endpoint
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name the policy name - used for filtering results in searches. (optional)
   * @param enabled checks to see if policy is enabled - use enabled = true or enabled = false (optional)
   * @param summary provides a less verbose response of policy lists. (optional, default to false)
   * @param hasErrors provides a way to fetch all policies with errors or policies that do not have errors (optional)
   * @param deleteDaysThreshold provides a way to fetch all policies with any actions having deleteDays exceeding the provided value (optional)
   * @return PolicyEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PolicyEntityListing> getRecordingMediaretentionpoliciesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String name, Boolean enabled, Boolean summary, Boolean hasErrors, Integer deleteDaysThreshold) throws IOException {
    return getRecordingMediaretentionpolicies(createGetRecordingMediaretentionpoliciesRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors, deleteDaysThreshold).withHttpInfo());
  }

  private GetRecordingMediaretentionpoliciesRequest createGetRecordingMediaretentionpoliciesRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String name, Boolean enabled, Boolean summary, Boolean hasErrors, Integer deleteDaysThreshold) {
    return GetRecordingMediaretentionpoliciesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withName(name)

            .withEnabled(enabled)

            .withSummary(summary)

            .withHasErrors(hasErrors)

            .withDeleteDaysThreshold(deleteDaysThreshold)

            .build();
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary=true to this endpoint
   * @param request The request object
   * @return PolicyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PolicyEntityListing getRecordingMediaretentionpolicies(GetRecordingMediaretentionpoliciesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PolicyEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PolicyEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary=true to this endpoint
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PolicyEntityListing> getRecordingMediaretentionpolicies(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PolicyEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PolicyEntityListing> response = (ApiResponse<PolicyEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PolicyEntityListing> response = (ApiResponse<PolicyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @return Policy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Policy getRecordingMediaretentionpolicy(String policyId) throws IOException, ApiException {
    return  getRecordingMediaretentionpolicy(createGetRecordingMediaretentionpolicyRequest(policyId));
  }

  /**
   * Get a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @return Policy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Policy> getRecordingMediaretentionpolicyWithHttpInfo(String policyId) throws IOException {
    return getRecordingMediaretentionpolicy(createGetRecordingMediaretentionpolicyRequest(policyId).withHttpInfo());
  }

  private GetRecordingMediaretentionpolicyRequest createGetRecordingMediaretentionpolicyRequest(String policyId) {
    return GetRecordingMediaretentionpolicyRequest.builder()
            .withPolicyId(policyId)

            .build();
  }

  /**
   * Get a media retention policy
   * 
   * @param request The request object
   * @return Policy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Policy getRecordingMediaretentionpolicy(GetRecordingMediaretentionpolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Policy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Policy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a media retention policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Policy> getRecordingMediaretentionpolicy(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Policy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get encryption key list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return EncryptionKeyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EncryptionKeyEntityListing getRecordingRecordingkeys(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getRecordingRecordingkeys(createGetRecordingRecordingkeysRequest(pageSize, pageNumber));
  }

  /**
   * Get encryption key list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return EncryptionKeyEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EncryptionKeyEntityListing> getRecordingRecordingkeysWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getRecordingRecordingkeys(createGetRecordingRecordingkeysRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetRecordingRecordingkeysRequest createGetRecordingRecordingkeysRequest(Integer pageSize, Integer pageNumber) {
    return GetRecordingRecordingkeysRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Get encryption key list
   * 
   * @param request The request object
   * @return EncryptionKeyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EncryptionKeyEntityListing getRecordingRecordingkeys(GetRecordingRecordingkeysRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EncryptionKeyEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EncryptionKeyEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get encryption key list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EncryptionKeyEntityListing> getRecordingRecordingkeys(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EncryptionKeyEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EncryptionKeyEntityListing> response = (ApiResponse<EncryptionKeyEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EncryptionKeyEntityListing> response = (ApiResponse<EncryptionKeyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get key rotation schedule
   * 
   * @return KeyRotationSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeyRotationSchedule getRecordingRecordingkeysRotationschedule() throws IOException, ApiException {
    return  getRecordingRecordingkeysRotationschedule(createGetRecordingRecordingkeysRotationscheduleRequest());
  }

  /**
   * Get key rotation schedule
   * 
   * @return KeyRotationSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeyRotationSchedule> getRecordingRecordingkeysRotationscheduleWithHttpInfo() throws IOException {
    return getRecordingRecordingkeysRotationschedule(createGetRecordingRecordingkeysRotationscheduleRequest().withHttpInfo());
  }

  private GetRecordingRecordingkeysRotationscheduleRequest createGetRecordingRecordingkeysRotationscheduleRequest() {
    return GetRecordingRecordingkeysRotationscheduleRequest.builder()
            .build();
  }

  /**
   * Get key rotation schedule
   * 
   * @param request The request object
   * @return KeyRotationSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeyRotationSchedule getRecordingRecordingkeysRotationschedule(GetRecordingRecordingkeysRotationscheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KeyRotationSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KeyRotationSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get key rotation schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeyRotationSchedule> getRecordingRecordingkeysRotationschedule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KeyRotationSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KeyRotationSchedule> response = (ApiResponse<KeyRotationSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KeyRotationSchedule> response = (ApiResponse<KeyRotationSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the Recording Settings for the Organization
   * 
   * @param createDefault If no settings are found, a new one is created with default values (optional, default to false)
   * @return RecordingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingSettings getRecordingSettings(Boolean createDefault) throws IOException, ApiException {
    return  getRecordingSettings(createGetRecordingSettingsRequest(createDefault));
  }

  /**
   * Get the Recording Settings for the Organization
   * 
   * @param createDefault If no settings are found, a new one is created with default values (optional, default to false)
   * @return RecordingSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingSettings> getRecordingSettingsWithHttpInfo(Boolean createDefault) throws IOException {
    return getRecordingSettings(createGetRecordingSettingsRequest(createDefault).withHttpInfo());
  }

  private GetRecordingSettingsRequest createGetRecordingSettingsRequest(Boolean createDefault) {
    return GetRecordingSettingsRequest.builder()
            .withCreateDefault(createDefault)

            .build();
  }

  /**
   * Get the Recording Settings for the Organization
   * 
   * @param request The request object
   * @return RecordingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingSettings getRecordingSettings(GetRecordingSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the Recording Settings for the Organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingSettings> getRecordingSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingSettings> response = (ApiResponse<RecordingSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingSettings> response = (ApiResponse<RecordingSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the status of a recording upload status report
   * 
   * @param reportId reportId (required)
   * @return RecordingUploadReport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingUploadReport getRecordingUploadsReport(String reportId) throws IOException, ApiException {
    return  getRecordingUploadsReport(createGetRecordingUploadsReportRequest(reportId));
  }

  /**
   * Get the status of a recording upload status report
   * 
   * @param reportId reportId (required)
   * @return RecordingUploadReport
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingUploadReport> getRecordingUploadsReportWithHttpInfo(String reportId) throws IOException {
    return getRecordingUploadsReport(createGetRecordingUploadsReportRequest(reportId).withHttpInfo());
  }

  private GetRecordingUploadsReportRequest createGetRecordingUploadsReportRequest(String reportId) {
    return GetRecordingUploadsReportRequest.builder()
            .withReportId(reportId)

            .build();
  }

  /**
   * Get the status of a recording upload status report
   * 
   * @param request The request object
   * @return RecordingUploadReport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingUploadReport getRecordingUploadsReport(GetRecordingUploadsReportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingUploadReport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingUploadReport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the status of a recording upload status report
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingUploadReport> getRecordingUploadsReport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingUploadReport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingUploadReport> response = (ApiResponse<RecordingUploadReport>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingUploadReport> response = (ApiResponse<RecordingUploadReport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for recording retention data
   * 
   * @param retentionThresholdDays Fetch retention data for recordings retained for more days than the provided value. (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize Page size. Maximum is 500. (optional, default to 25)
   * @return RecordingRetentionCursorEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingRetentionCursorEntityListing getRecordingsRetentionQuery(Integer retentionThresholdDays, String cursor, Integer pageSize) throws IOException, ApiException {
    return  getRecordingsRetentionQuery(createGetRecordingsRetentionQueryRequest(retentionThresholdDays, cursor, pageSize));
  }

  /**
   * Query for recording retention data
   * 
   * @param retentionThresholdDays Fetch retention data for recordings retained for more days than the provided value. (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize Page size. Maximum is 500. (optional, default to 25)
   * @return RecordingRetentionCursorEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingRetentionCursorEntityListing> getRecordingsRetentionQueryWithHttpInfo(Integer retentionThresholdDays, String cursor, Integer pageSize) throws IOException {
    return getRecordingsRetentionQuery(createGetRecordingsRetentionQueryRequest(retentionThresholdDays, cursor, pageSize).withHttpInfo());
  }

  private GetRecordingsRetentionQueryRequest createGetRecordingsRetentionQueryRequest(Integer retentionThresholdDays, String cursor, Integer pageSize) {
    return GetRecordingsRetentionQueryRequest.builder()
            .withRetentionThresholdDays(retentionThresholdDays)

            .withCursor(cursor)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Query for recording retention data
   * 
   * @param request The request object
   * @return RecordingRetentionCursorEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingRetentionCursorEntityListing getRecordingsRetentionQuery(GetRecordingsRetentionQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingRetentionCursorEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingRetentionCursorEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for recording retention data
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingRetentionCursorEntityListing> getRecordingsRetentionQuery(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingRetentionCursorEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingRetentionCursorEntityListing> response = (ApiResponse<RecordingRetentionCursorEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingRetentionCursorEntityListing> response = (ApiResponse<RecordingRetentionCursorEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieves an object containing the total number of concurrent active screen recordings
   * 
   * @return ScreenRecordingActiveSessions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenRecordingActiveSessions getRecordingsScreensessionsDetails() throws IOException, ApiException {
    return  getRecordingsScreensessionsDetails(createGetRecordingsScreensessionsDetailsRequest());
  }

  /**
   * Retrieves an object containing the total number of concurrent active screen recordings
   * 
   * @return ScreenRecordingActiveSessions
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenRecordingActiveSessions> getRecordingsScreensessionsDetailsWithHttpInfo() throws IOException {
    return getRecordingsScreensessionsDetails(createGetRecordingsScreensessionsDetailsRequest().withHttpInfo());
  }

  private GetRecordingsScreensessionsDetailsRequest createGetRecordingsScreensessionsDetailsRequest() {
    return GetRecordingsScreensessionsDetailsRequest.builder()
            .build();
  }

  /**
   * Retrieves an object containing the total number of concurrent active screen recordings
   * 
   * @param request The request object
   * @return ScreenRecordingActiveSessions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScreenRecordingActiveSessions getRecordingsScreensessionsDetails(GetRecordingsScreensessionsDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScreenRecordingActiveSessions> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScreenRecordingActiveSessions>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves an object containing the total number of concurrent active screen recordings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScreenRecordingActiveSessions> getRecordingsScreensessionsDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScreenRecordingActiveSessions>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenRecordingActiveSessions> response = (ApiResponse<ScreenRecordingActiveSessions>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScreenRecordingActiveSessions> response = (ApiResponse<ScreenRecordingActiveSessions>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Patch a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @param body Policy (required)
   * @return CrossPlatformPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CrossPlatformPolicy patchRecordingCrossplatformMediaretentionpolicy(String policyId, CrossPlatformPolicyUpdate body) throws IOException, ApiException {
    return  patchRecordingCrossplatformMediaretentionpolicy(createPatchRecordingCrossplatformMediaretentionpolicyRequest(policyId, body));
  }

  /**
   * Patch a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @param body Policy (required)
   * @return CrossPlatformPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CrossPlatformPolicy> patchRecordingCrossplatformMediaretentionpolicyWithHttpInfo(String policyId, CrossPlatformPolicyUpdate body) throws IOException {
    return patchRecordingCrossplatformMediaretentionpolicy(createPatchRecordingCrossplatformMediaretentionpolicyRequest(policyId, body).withHttpInfo());
  }

  private PatchRecordingCrossplatformMediaretentionpolicyRequest createPatchRecordingCrossplatformMediaretentionpolicyRequest(String policyId, CrossPlatformPolicyUpdate body) {
    return PatchRecordingCrossplatformMediaretentionpolicyRequest.builder()
            .withPolicyId(policyId)

            .withBody(body)

            .build();
  }

  /**
   * Patch a media retention policy
   * 
   * @param request The request object
   * @return CrossPlatformPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CrossPlatformPolicy patchRecordingCrossplatformMediaretentionpolicy(PatchRecordingCrossplatformMediaretentionpolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CrossPlatformPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CrossPlatformPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch a media retention policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CrossPlatformPolicy> patchRecordingCrossplatformMediaretentionpolicy(ApiRequest<CrossPlatformPolicyUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CrossPlatformPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Patch a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @param body Policy (required)
   * @return Policy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Policy patchRecordingMediaretentionpolicy(String policyId, PolicyUpdate body) throws IOException, ApiException {
    return  patchRecordingMediaretentionpolicy(createPatchRecordingMediaretentionpolicyRequest(policyId, body));
  }

  /**
   * Patch a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @param body Policy (required)
   * @return Policy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Policy> patchRecordingMediaretentionpolicyWithHttpInfo(String policyId, PolicyUpdate body) throws IOException {
    return patchRecordingMediaretentionpolicy(createPatchRecordingMediaretentionpolicyRequest(policyId, body).withHttpInfo());
  }

  private PatchRecordingMediaretentionpolicyRequest createPatchRecordingMediaretentionpolicyRequest(String policyId, PolicyUpdate body) {
    return PatchRecordingMediaretentionpolicyRequest.builder()
            .withPolicyId(policyId)

            .withBody(body)

            .build();
  }

  /**
   * Patch a media retention policy
   * 
   * @param request The request object
   * @return Policy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Policy patchRecordingMediaretentionpolicy(PatchRecordingMediaretentionpolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Policy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Policy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch a media retention policy
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Policy> patchRecordingMediaretentionpolicy(ApiRequest<PolicyUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Policy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param body annotation (required)
   * @return Annotation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Annotation postConversationRecordingAnnotations(String conversationId, String recordingId, Annotation body) throws IOException, ApiException {
    return  postConversationRecordingAnnotations(createPostConversationRecordingAnnotationsRequest(conversationId, recordingId, body));
  }

  /**
   * Create annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param body annotation (required)
   * @return Annotation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Annotation> postConversationRecordingAnnotationsWithHttpInfo(String conversationId, String recordingId, Annotation body) throws IOException {
    return postConversationRecordingAnnotations(createPostConversationRecordingAnnotationsRequest(conversationId, recordingId, body).withHttpInfo());
  }

  private PostConversationRecordingAnnotationsRequest createPostConversationRecordingAnnotationsRequest(String conversationId, String recordingId, Annotation body) {
    return PostConversationRecordingAnnotationsRequest.builder()
            .withConversationId(conversationId)

            .withRecordingId(recordingId)

            .withBody(body)

            .build();
  }

  /**
   * Create annotation
   * 
   * @param request The request object
   * @return Annotation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Annotation postConversationRecordingAnnotations(PostConversationRecordingAnnotationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Annotation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Annotation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create annotation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Annotation> postConversationRecordingAnnotations(ApiRequest<Annotation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Annotation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Annotation> response = (ApiResponse<Annotation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Annotation> response = (ApiResponse<Annotation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Submit a batch download request for recordings. Recordings in response will be in their original format/codec - configured in the Trunk configuration.
   * 
   * @param body Job submission criteria (required)
   * @return BatchDownloadJobSubmissionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BatchDownloadJobSubmissionResult postRecordingBatchrequests(BatchDownloadJobSubmission body) throws IOException, ApiException {
    return  postRecordingBatchrequests(createPostRecordingBatchrequestsRequest(body));
  }

  /**
   * Submit a batch download request for recordings. Recordings in response will be in their original format/codec - configured in the Trunk configuration.
   * 
   * @param body Job submission criteria (required)
   * @return BatchDownloadJobSubmissionResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BatchDownloadJobSubmissionResult> postRecordingBatchrequestsWithHttpInfo(BatchDownloadJobSubmission body) throws IOException {
    return postRecordingBatchrequests(createPostRecordingBatchrequestsRequest(body).withHttpInfo());
  }

  private PostRecordingBatchrequestsRequest createPostRecordingBatchrequestsRequest(BatchDownloadJobSubmission body) {
    return PostRecordingBatchrequestsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Submit a batch download request for recordings. Recordings in response will be in their original format/codec - configured in the Trunk configuration.
   * 
   * @param request The request object
   * @return BatchDownloadJobSubmissionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BatchDownloadJobSubmissionResult postRecordingBatchrequests(PostRecordingBatchrequestsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BatchDownloadJobSubmissionResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BatchDownloadJobSubmissionResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Submit a batch download request for recordings. Recordings in response will be in their original format/codec - configured in the Trunk configuration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BatchDownloadJobSubmissionResult> postRecordingBatchrequests(ApiRequest<BatchDownloadJobSubmission> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BatchDownloadJobSubmissionResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BatchDownloadJobSubmissionResult> response = (ApiResponse<BatchDownloadJobSubmissionResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BatchDownloadJobSubmissionResult> response = (ApiResponse<BatchDownloadJobSubmissionResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create media retention policy
   * Policy does not work retroactively
   * @param body Policy (required)
   * @return CrossPlatformPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CrossPlatformPolicy postRecordingCrossplatformMediaretentionpolicies(CrossPlatformPolicyCreate body) throws IOException, ApiException {
    return  postRecordingCrossplatformMediaretentionpolicies(createPostRecordingCrossplatformMediaretentionpoliciesRequest(body));
  }

  /**
   * Create media retention policy
   * Policy does not work retroactively
   * @param body Policy (required)
   * @return CrossPlatformPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CrossPlatformPolicy> postRecordingCrossplatformMediaretentionpoliciesWithHttpInfo(CrossPlatformPolicyCreate body) throws IOException {
    return postRecordingCrossplatformMediaretentionpolicies(createPostRecordingCrossplatformMediaretentionpoliciesRequest(body).withHttpInfo());
  }

  private PostRecordingCrossplatformMediaretentionpoliciesRequest createPostRecordingCrossplatformMediaretentionpoliciesRequest(CrossPlatformPolicyCreate body) {
    return PostRecordingCrossplatformMediaretentionpoliciesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create media retention policy
   * Policy does not work retroactively
   * @param request The request object
   * @return CrossPlatformPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CrossPlatformPolicy postRecordingCrossplatformMediaretentionpolicies(PostRecordingCrossplatformMediaretentionpoliciesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CrossPlatformPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CrossPlatformPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create media retention policy
   * Policy does not work retroactively
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CrossPlatformPolicy> postRecordingCrossplatformMediaretentionpolicies(ApiRequest<CrossPlatformPolicyCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CrossPlatformPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a recording bulk job.
   * Each organization can run up to a maximum of two concurrent jobs that are either in pending or processing state. Furthermore, the recording:recording:viewSensitiveData permission is required to access recordings with PCI DSS and/or PII data when redaction is enabled for their organization. If the requester does not have that permission and includeRecordingsWithSensitiveData is set to true, then their request will be rejected.
   * @param body query (required)
   * @return RecordingJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingJob postRecordingJobs(RecordingJobsQuery body) throws IOException, ApiException {
    return  postRecordingJobs(createPostRecordingJobsRequest(body));
  }

  /**
   * Create a recording bulk job.
   * Each organization can run up to a maximum of two concurrent jobs that are either in pending or processing state. Furthermore, the recording:recording:viewSensitiveData permission is required to access recordings with PCI DSS and/or PII data when redaction is enabled for their organization. If the requester does not have that permission and includeRecordingsWithSensitiveData is set to true, then their request will be rejected.
   * @param body query (required)
   * @return RecordingJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingJob> postRecordingJobsWithHttpInfo(RecordingJobsQuery body) throws IOException {
    return postRecordingJobs(createPostRecordingJobsRequest(body).withHttpInfo());
  }

  private PostRecordingJobsRequest createPostRecordingJobsRequest(RecordingJobsQuery body) {
    return PostRecordingJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a recording bulk job.
   * Each organization can run up to a maximum of two concurrent jobs that are either in pending or processing state. Furthermore, the recording:recording:viewSensitiveData permission is required to access recordings with PCI DSS and/or PII data when redaction is enabled for their organization. If the requester does not have that permission and includeRecordingsWithSensitiveData is set to true, then their request will be rejected.
   * @param request The request object
   * @return RecordingJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingJob postRecordingJobs(PostRecordingJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a recording bulk job.
   * Each organization can run up to a maximum of two concurrent jobs that are either in pending or processing state. Furthermore, the recording:recording:viewSensitiveData permission is required to access recordings with PCI DSS and/or PII data when redaction is enabled for their organization. If the requester does not have that permission and includeRecordingsWithSensitiveData is set to true, then their request will be rejected.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingJob> postRecordingJobs(ApiRequest<RecordingJobsQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingJob> response = (ApiResponse<RecordingJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingJob> response = (ApiResponse<RecordingJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Setup configurations for encryption key creation
   * 
   * @param body Encryption Configuration (required)
   * @return RecordingEncryptionConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingEncryptionConfiguration postRecordingKeyconfigurations(RecordingEncryptionConfiguration body) throws IOException, ApiException {
    return  postRecordingKeyconfigurations(createPostRecordingKeyconfigurationsRequest(body));
  }

  /**
   * Setup configurations for encryption key creation
   * 
   * @param body Encryption Configuration (required)
   * @return RecordingEncryptionConfiguration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingEncryptionConfiguration> postRecordingKeyconfigurationsWithHttpInfo(RecordingEncryptionConfiguration body) throws IOException {
    return postRecordingKeyconfigurations(createPostRecordingKeyconfigurationsRequest(body).withHttpInfo());
  }

  private PostRecordingKeyconfigurationsRequest createPostRecordingKeyconfigurationsRequest(RecordingEncryptionConfiguration body) {
    return PostRecordingKeyconfigurationsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Setup configurations for encryption key creation
   * 
   * @param request The request object
   * @return RecordingEncryptionConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingEncryptionConfiguration postRecordingKeyconfigurations(PostRecordingKeyconfigurationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingEncryptionConfiguration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingEncryptionConfiguration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Setup configurations for encryption key creation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingEncryptionConfiguration> postRecordingKeyconfigurations(ApiRequest<RecordingEncryptionConfiguration> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingEncryptionConfiguration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingEncryptionConfiguration> response = (ApiResponse<RecordingEncryptionConfiguration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingEncryptionConfiguration> response = (ApiResponse<RecordingEncryptionConfiguration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Validate encryption key configurations without saving it
   * 
   * @param body Encryption Configuration (required)
   * @return RecordingEncryptionConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingEncryptionConfiguration postRecordingKeyconfigurationsValidate(RecordingEncryptionConfiguration body) throws IOException, ApiException {
    return  postRecordingKeyconfigurationsValidate(createPostRecordingKeyconfigurationsValidateRequest(body));
  }

  /**
   * Validate encryption key configurations without saving it
   * 
   * @param body Encryption Configuration (required)
   * @return RecordingEncryptionConfiguration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingEncryptionConfiguration> postRecordingKeyconfigurationsValidateWithHttpInfo(RecordingEncryptionConfiguration body) throws IOException {
    return postRecordingKeyconfigurationsValidate(createPostRecordingKeyconfigurationsValidateRequest(body).withHttpInfo());
  }

  private PostRecordingKeyconfigurationsValidateRequest createPostRecordingKeyconfigurationsValidateRequest(RecordingEncryptionConfiguration body) {
    return PostRecordingKeyconfigurationsValidateRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Validate encryption key configurations without saving it
   * 
   * @param request The request object
   * @return RecordingEncryptionConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingEncryptionConfiguration postRecordingKeyconfigurationsValidate(PostRecordingKeyconfigurationsValidateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingEncryptionConfiguration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingEncryptionConfiguration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Validate encryption key configurations without saving it
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingEncryptionConfiguration> postRecordingKeyconfigurationsValidate(ApiRequest<RecordingEncryptionConfiguration> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingEncryptionConfiguration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingEncryptionConfiguration> response = (ApiResponse<RecordingEncryptionConfiguration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingEncryptionConfiguration> response = (ApiResponse<RecordingEncryptionConfiguration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * create a local key management recording key
   * 
   * @param body Local Encryption body (required)
   * @return EncryptionKey
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EncryptionKey postRecordingLocalkeys(LocalEncryptionKeyRequest body) throws IOException, ApiException {
    return  postRecordingLocalkeys(createPostRecordingLocalkeysRequest(body));
  }

  /**
   * create a local key management recording key
   * 
   * @param body Local Encryption body (required)
   * @return EncryptionKey
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EncryptionKey> postRecordingLocalkeysWithHttpInfo(LocalEncryptionKeyRequest body) throws IOException {
    return postRecordingLocalkeys(createPostRecordingLocalkeysRequest(body).withHttpInfo());
  }

  private PostRecordingLocalkeysRequest createPostRecordingLocalkeysRequest(LocalEncryptionKeyRequest body) {
    return PostRecordingLocalkeysRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * create a local key management recording key
   * 
   * @param request The request object
   * @return EncryptionKey
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EncryptionKey postRecordingLocalkeys(PostRecordingLocalkeysRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EncryptionKey> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EncryptionKey>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * create a local key management recording key
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EncryptionKey> postRecordingLocalkeys(ApiRequest<LocalEncryptionKeyRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EncryptionKey>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EncryptionKey> response = (ApiResponse<EncryptionKey>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EncryptionKey> response = (ApiResponse<EncryptionKey>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create media retention policy
   * Policy does not work retroactively
   * @param body Policy (required)
   * @return Policy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Policy postRecordingMediaretentionpolicies(PolicyCreate body) throws IOException, ApiException {
    return  postRecordingMediaretentionpolicies(createPostRecordingMediaretentionpoliciesRequest(body));
  }

  /**
   * Create media retention policy
   * Policy does not work retroactively
   * @param body Policy (required)
   * @return Policy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Policy> postRecordingMediaretentionpoliciesWithHttpInfo(PolicyCreate body) throws IOException {
    return postRecordingMediaretentionpolicies(createPostRecordingMediaretentionpoliciesRequest(body).withHttpInfo());
  }

  private PostRecordingMediaretentionpoliciesRequest createPostRecordingMediaretentionpoliciesRequest(PolicyCreate body) {
    return PostRecordingMediaretentionpoliciesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create media retention policy
   * Policy does not work retroactively
   * @param request The request object
   * @return Policy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Policy postRecordingMediaretentionpolicies(PostRecordingMediaretentionpoliciesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Policy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Policy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create media retention policy
   * Policy does not work retroactively
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Policy> postRecordingMediaretentionpolicies(ApiRequest<PolicyCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Policy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create encryption key
   * 
   * @return EncryptionKey
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EncryptionKey postRecordingRecordingkeys() throws IOException, ApiException {
    return  postRecordingRecordingkeys(createPostRecordingRecordingkeysRequest());
  }

  /**
   * Create encryption key
   * 
   * @return EncryptionKey
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EncryptionKey> postRecordingRecordingkeysWithHttpInfo() throws IOException {
    return postRecordingRecordingkeys(createPostRecordingRecordingkeysRequest().withHttpInfo());
  }

  private PostRecordingRecordingkeysRequest createPostRecordingRecordingkeysRequest() {
    return PostRecordingRecordingkeysRequest.builder()
            .build();
  }

  /**
   * Create encryption key
   * 
   * @param request The request object
   * @return EncryptionKey
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EncryptionKey postRecordingRecordingkeys(PostRecordingRecordingkeysRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EncryptionKey> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EncryptionKey>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create encryption key
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EncryptionKey> postRecordingRecordingkeys(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EncryptionKey>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EncryptionKey> response = (ApiResponse<EncryptionKey>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EncryptionKey> response = (ApiResponse<EncryptionKey>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a recording upload status report
   * 
   * @param body Report parameters (required)
   * @return RecordingUploadReport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingUploadReport postRecordingUploadsReports(RecordingUploadReportRequest body) throws IOException, ApiException {
    return  postRecordingUploadsReports(createPostRecordingUploadsReportsRequest(body));
  }

  /**
   * Creates a recording upload status report
   * 
   * @param body Report parameters (required)
   * @return RecordingUploadReport
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingUploadReport> postRecordingUploadsReportsWithHttpInfo(RecordingUploadReportRequest body) throws IOException {
    return postRecordingUploadsReports(createPostRecordingUploadsReportsRequest(body).withHttpInfo());
  }

  private PostRecordingUploadsReportsRequest createPostRecordingUploadsReportsRequest(RecordingUploadReportRequest body) {
    return PostRecordingUploadsReportsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Creates a recording upload status report
   * 
   * @param request The request object
   * @return RecordingUploadReport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingUploadReport postRecordingUploadsReports(PostRecordingUploadsReportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingUploadReport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingUploadReport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a recording upload status report
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingUploadReport> postRecordingUploadsReports(ApiRequest<RecordingUploadReportRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingUploadReport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingUploadReport> response = (ApiResponse<RecordingUploadReport>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingUploadReport> response = (ApiResponse<RecordingUploadReport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of conversations with protected recordings
   * 
   * @param body conversationIds (required)
   * @return List<AddressableEntityRef>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<AddressableEntityRef> postRecordingsDeletionprotection(ConversationDeletionProtectionQuery body) throws IOException, ApiException {
    return  postRecordingsDeletionprotection(createPostRecordingsDeletionprotectionRequest(body));
  }

  /**
   * Get a list of conversations with protected recordings
   * 
   * @param body conversationIds (required)
   * @return List<AddressableEntityRef>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<AddressableEntityRef>> postRecordingsDeletionprotectionWithHttpInfo(ConversationDeletionProtectionQuery body) throws IOException {
    return postRecordingsDeletionprotection(createPostRecordingsDeletionprotectionRequest(body).withHttpInfo());
  }

  private PostRecordingsDeletionprotectionRequest createPostRecordingsDeletionprotectionRequest(ConversationDeletionProtectionQuery body) {
    return PostRecordingsDeletionprotectionRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Get a list of conversations with protected recordings
   * 
   * @param request The request object
   * @return List<AddressableEntityRef>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<AddressableEntityRef> postRecordingsDeletionprotection(PostRecordingsDeletionprotectionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<AddressableEntityRef>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<AddressableEntityRef>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of conversations with protected recordings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<AddressableEntityRef>> postRecordingsDeletionprotection(ApiRequest<ConversationDeletionProtectionQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<AddressableEntityRef>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<AddressableEntityRef>> response = (ApiResponse<List<AddressableEntityRef>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<AddressableEntityRef>> response = (ApiResponse<List<AddressableEntityRef>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Acknowledge a screen recording.
   * 
   * @param body AcknowledgeScreenRecordingRequest (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postRecordingsScreensessionsAcknowledge(AcknowledgeScreenRecordingRequest body) throws IOException, ApiException {
     postRecordingsScreensessionsAcknowledge(createPostRecordingsScreensessionsAcknowledgeRequest(body));
  }

  /**
   * Acknowledge a screen recording.
   * 
   * @param body AcknowledgeScreenRecordingRequest (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postRecordingsScreensessionsAcknowledgeWithHttpInfo(AcknowledgeScreenRecordingRequest body) throws IOException {
    return postRecordingsScreensessionsAcknowledge(createPostRecordingsScreensessionsAcknowledgeRequest(body).withHttpInfo());
  }

  private PostRecordingsScreensessionsAcknowledgeRequest createPostRecordingsScreensessionsAcknowledgeRequest(AcknowledgeScreenRecordingRequest body) {
    return PostRecordingsScreensessionsAcknowledgeRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Acknowledge a screen recording.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postRecordingsScreensessionsAcknowledge(PostRecordingsScreensessionsAcknowledgeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Acknowledge a screen recording.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postRecordingsScreensessionsAcknowledge(ApiRequest<AcknowledgeScreenRecordingRequest> request) throws IOException {
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
   * Provide meta-data a screen recording.
   * 
   * @param body ScreenRecordingMetaDataRequest (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postRecordingsScreensessionsMetadata(ScreenRecordingMetaDataRequest body) throws IOException, ApiException {
     postRecordingsScreensessionsMetadata(createPostRecordingsScreensessionsMetadataRequest(body));
  }

  /**
   * Provide meta-data a screen recording.
   * 
   * @param body ScreenRecordingMetaDataRequest (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postRecordingsScreensessionsMetadataWithHttpInfo(ScreenRecordingMetaDataRequest body) throws IOException {
    return postRecordingsScreensessionsMetadata(createPostRecordingsScreensessionsMetadataRequest(body).withHttpInfo());
  }

  private PostRecordingsScreensessionsMetadataRequest createPostRecordingsScreensessionsMetadataRequest(ScreenRecordingMetaDataRequest body) {
    return PostRecordingsScreensessionsMetadataRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Provide meta-data a screen recording.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postRecordingsScreensessionsMetadata(PostRecordingsScreensessionsMetadataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Provide meta-data a screen recording.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postRecordingsScreensessionsMetadata(ApiRequest<ScreenRecordingMetaDataRequest> request) throws IOException {
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
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. The recording:recording:view permission is required for the recording, as well as either the recording:recording:editRetention or recording:screenRecording:editRetention permissions depending on the type of recording.
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param body recording (required)
   * @param clearExport Whether to clear the pending export for the recording (optional)
   * @return Recording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recording putConversationRecording(String conversationId, String recordingId, Recording body, Boolean clearExport) throws IOException, ApiException {
    return  putConversationRecording(createPutConversationRecordingRequest(conversationId, recordingId, body, clearExport));
  }

  /**
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. The recording:recording:view permission is required for the recording, as well as either the recording:recording:editRetention or recording:screenRecording:editRetention permissions depending on the type of recording.
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param body recording (required)
   * @param clearExport Whether to clear the pending export for the recording (optional)
   * @return Recording
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recording> putConversationRecordingWithHttpInfo(String conversationId, String recordingId, Recording body, Boolean clearExport) throws IOException {
    return putConversationRecording(createPutConversationRecordingRequest(conversationId, recordingId, body, clearExport).withHttpInfo());
  }

  private PutConversationRecordingRequest createPutConversationRecordingRequest(String conversationId, String recordingId, Recording body, Boolean clearExport) {
    return PutConversationRecordingRequest.builder()
            .withConversationId(conversationId)

            .withRecordingId(recordingId)

            .withBody(body)

            .withClearExport(clearExport)

            .build();
  }

  /**
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. The recording:recording:view permission is required for the recording, as well as either the recording:recording:editRetention or recording:screenRecording:editRetention permissions depending on the type of recording.
   * @param request The request object
   * @return Recording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recording putConversationRecording(PutConversationRecordingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Recording> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Recording>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. The recording:recording:view permission is required for the recording, as well as either the recording:recording:editRetention or recording:screenRecording:editRetention permissions depending on the type of recording.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recording> putConversationRecording(ApiRequest<Recording> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Recording>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @param body annotation (required)
   * @return Annotation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Annotation putConversationRecordingAnnotation(String conversationId, String recordingId, String annotationId, Annotation body) throws IOException, ApiException {
    return  putConversationRecordingAnnotation(createPutConversationRecordingAnnotationRequest(conversationId, recordingId, annotationId, body));
  }

  /**
   * Update annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @param body annotation (required)
   * @return Annotation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Annotation> putConversationRecordingAnnotationWithHttpInfo(String conversationId, String recordingId, String annotationId, Annotation body) throws IOException {
    return putConversationRecordingAnnotation(createPutConversationRecordingAnnotationRequest(conversationId, recordingId, annotationId, body).withHttpInfo());
  }

  private PutConversationRecordingAnnotationRequest createPutConversationRecordingAnnotationRequest(String conversationId, String recordingId, String annotationId, Annotation body) {
    return PutConversationRecordingAnnotationRequest.builder()
            .withConversationId(conversationId)

            .withRecordingId(recordingId)

            .withAnnotationId(annotationId)

            .withBody(body)

            .build();
  }

  /**
   * Update annotation
   * 
   * @param request The request object
   * @return Annotation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Annotation putConversationRecordingAnnotation(PutConversationRecordingAnnotationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Annotation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Annotation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update annotation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Annotation> putConversationRecordingAnnotation(ApiRequest<Annotation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Annotation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Annotation> response = (ApiResponse<Annotation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Annotation> response = (ApiResponse<Annotation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates an orphan recording to a regular recording with retention values
   * If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.
   * @param orphanId Orphan ID (required)
   * @param body  (optional)
   * @return Recording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recording putOrphanrecording(String orphanId, OrphanUpdateRequest body) throws IOException, ApiException {
    return  putOrphanrecording(createPutOrphanrecordingRequest(orphanId, body));
  }

  /**
   * Updates an orphan recording to a regular recording with retention values
   * If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.
   * @param orphanId Orphan ID (required)
   * @param body  (optional)
   * @return Recording
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recording> putOrphanrecordingWithHttpInfo(String orphanId, OrphanUpdateRequest body) throws IOException {
    return putOrphanrecording(createPutOrphanrecordingRequest(orphanId, body).withHttpInfo());
  }

  private PutOrphanrecordingRequest createPutOrphanrecordingRequest(String orphanId, OrphanUpdateRequest body) {
    return PutOrphanrecordingRequest.builder()
            .withOrphanId(orphanId)

            .withBody(body)

            .build();
  }

  /**
   * Updates an orphan recording to a regular recording with retention values
   * If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.
   * @param request The request object
   * @return Recording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recording putOrphanrecording(PutOrphanrecordingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Recording> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Recording>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates an orphan recording to a regular recording with retention values
   * If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recording> putOrphanrecording(ApiRequest<OrphanUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Recording>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a media retention policy
   * Policy does not work retroactively
   * @param policyId Policy ID (required)
   * @param body Policy (required)
   * @return CrossPlatformPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CrossPlatformPolicy putRecordingCrossplatformMediaretentionpolicy(String policyId, CrossPlatformPolicy body) throws IOException, ApiException {
    return  putRecordingCrossplatformMediaretentionpolicy(createPutRecordingCrossplatformMediaretentionpolicyRequest(policyId, body));
  }

  /**
   * Update a media retention policy
   * Policy does not work retroactively
   * @param policyId Policy ID (required)
   * @param body Policy (required)
   * @return CrossPlatformPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CrossPlatformPolicy> putRecordingCrossplatformMediaretentionpolicyWithHttpInfo(String policyId, CrossPlatformPolicy body) throws IOException {
    return putRecordingCrossplatformMediaretentionpolicy(createPutRecordingCrossplatformMediaretentionpolicyRequest(policyId, body).withHttpInfo());
  }

  private PutRecordingCrossplatformMediaretentionpolicyRequest createPutRecordingCrossplatformMediaretentionpolicyRequest(String policyId, CrossPlatformPolicy body) {
    return PutRecordingCrossplatformMediaretentionpolicyRequest.builder()
            .withPolicyId(policyId)

            .withBody(body)

            .build();
  }

  /**
   * Update a media retention policy
   * Policy does not work retroactively
   * @param request The request object
   * @return CrossPlatformPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CrossPlatformPolicy putRecordingCrossplatformMediaretentionpolicy(PutRecordingCrossplatformMediaretentionpolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CrossPlatformPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CrossPlatformPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a media retention policy
   * Policy does not work retroactively
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CrossPlatformPolicy> putRecordingCrossplatformMediaretentionpolicy(ApiRequest<CrossPlatformPolicy> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CrossPlatformPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Execute the recording bulk job.
   * A job must be executed by the same user whom originally created the job.  In addition, the user must have permission to update the recording's retention.
   * @param jobId jobId (required)
   * @param body query (required)
   * @return RecordingJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingJob putRecordingJob(String jobId, ExecuteRecordingJobsQuery body) throws IOException, ApiException {
    return  putRecordingJob(createPutRecordingJobRequest(jobId, body));
  }

  /**
   * Execute the recording bulk job.
   * A job must be executed by the same user whom originally created the job.  In addition, the user must have permission to update the recording's retention.
   * @param jobId jobId (required)
   * @param body query (required)
   * @return RecordingJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingJob> putRecordingJobWithHttpInfo(String jobId, ExecuteRecordingJobsQuery body) throws IOException {
    return putRecordingJob(createPutRecordingJobRequest(jobId, body).withHttpInfo());
  }

  private PutRecordingJobRequest createPutRecordingJobRequest(String jobId, ExecuteRecordingJobsQuery body) {
    return PutRecordingJobRequest.builder()
            .withJobId(jobId)

            .withBody(body)

            .build();
  }

  /**
   * Execute the recording bulk job.
   * A job must be executed by the same user whom originally created the job.  In addition, the user must have permission to update the recording's retention.
   * @param request The request object
   * @return RecordingJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingJob putRecordingJob(PutRecordingJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Execute the recording bulk job.
   * A job must be executed by the same user whom originally created the job.  In addition, the user must have permission to update the recording's retention.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingJob> putRecordingJob(ApiRequest<ExecuteRecordingJobsQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingJob> response = (ApiResponse<RecordingJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingJob> response = (ApiResponse<RecordingJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the encryption key configurations
   * 
   * @param keyConfigurationId Key Configurations Id (required)
   * @param body Encryption key configuration metadata (required)
   * @return RecordingEncryptionConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingEncryptionConfiguration putRecordingKeyconfiguration(String keyConfigurationId, RecordingEncryptionConfiguration body) throws IOException, ApiException {
    return  putRecordingKeyconfiguration(createPutRecordingKeyconfigurationRequest(keyConfigurationId, body));
  }

  /**
   * Update the encryption key configurations
   * 
   * @param keyConfigurationId Key Configurations Id (required)
   * @param body Encryption key configuration metadata (required)
   * @return RecordingEncryptionConfiguration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingEncryptionConfiguration> putRecordingKeyconfigurationWithHttpInfo(String keyConfigurationId, RecordingEncryptionConfiguration body) throws IOException {
    return putRecordingKeyconfiguration(createPutRecordingKeyconfigurationRequest(keyConfigurationId, body).withHttpInfo());
  }

  private PutRecordingKeyconfigurationRequest createPutRecordingKeyconfigurationRequest(String keyConfigurationId, RecordingEncryptionConfiguration body) {
    return PutRecordingKeyconfigurationRequest.builder()
            .withKeyConfigurationId(keyConfigurationId)

            .withBody(body)

            .build();
  }

  /**
   * Update the encryption key configurations
   * 
   * @param request The request object
   * @return RecordingEncryptionConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingEncryptionConfiguration putRecordingKeyconfiguration(PutRecordingKeyconfigurationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingEncryptionConfiguration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingEncryptionConfiguration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the encryption key configurations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingEncryptionConfiguration> putRecordingKeyconfiguration(ApiRequest<RecordingEncryptionConfiguration> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingEncryptionConfiguration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingEncryptionConfiguration> response = (ApiResponse<RecordingEncryptionConfiguration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingEncryptionConfiguration> response = (ApiResponse<RecordingEncryptionConfiguration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a media retention policy
   * Policy does not work retroactively
   * @param policyId Policy ID (required)
   * @param body Policy (required)
   * @return Policy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Policy putRecordingMediaretentionpolicy(String policyId, Policy body) throws IOException, ApiException {
    return  putRecordingMediaretentionpolicy(createPutRecordingMediaretentionpolicyRequest(policyId, body));
  }

  /**
   * Update a media retention policy
   * Policy does not work retroactively
   * @param policyId Policy ID (required)
   * @param body Policy (required)
   * @return Policy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Policy> putRecordingMediaretentionpolicyWithHttpInfo(String policyId, Policy body) throws IOException {
    return putRecordingMediaretentionpolicy(createPutRecordingMediaretentionpolicyRequest(policyId, body).withHttpInfo());
  }

  private PutRecordingMediaretentionpolicyRequest createPutRecordingMediaretentionpolicyRequest(String policyId, Policy body) {
    return PutRecordingMediaretentionpolicyRequest.builder()
            .withPolicyId(policyId)

            .withBody(body)

            .build();
  }

  /**
   * Update a media retention policy
   * Policy does not work retroactively
   * @param request The request object
   * @return Policy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Policy putRecordingMediaretentionpolicy(PutRecordingMediaretentionpolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Policy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Policy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a media retention policy
   * Policy does not work retroactively
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Policy> putRecordingMediaretentionpolicy(ApiRequest<Policy> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Policy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update key rotation schedule
   * 
   * @param body KeyRotationSchedule (required)
   * @return KeyRotationSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeyRotationSchedule putRecordingRecordingkeysRotationschedule(KeyRotationSchedule body) throws IOException, ApiException {
    return  putRecordingRecordingkeysRotationschedule(createPutRecordingRecordingkeysRotationscheduleRequest(body));
  }

  /**
   * Update key rotation schedule
   * 
   * @param body KeyRotationSchedule (required)
   * @return KeyRotationSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeyRotationSchedule> putRecordingRecordingkeysRotationscheduleWithHttpInfo(KeyRotationSchedule body) throws IOException {
    return putRecordingRecordingkeysRotationschedule(createPutRecordingRecordingkeysRotationscheduleRequest(body).withHttpInfo());
  }

  private PutRecordingRecordingkeysRotationscheduleRequest createPutRecordingRecordingkeysRotationscheduleRequest(KeyRotationSchedule body) {
    return PutRecordingRecordingkeysRotationscheduleRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update key rotation schedule
   * 
   * @param request The request object
   * @return KeyRotationSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeyRotationSchedule putRecordingRecordingkeysRotationschedule(PutRecordingRecordingkeysRotationscheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KeyRotationSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KeyRotationSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update key rotation schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeyRotationSchedule> putRecordingRecordingkeysRotationschedule(ApiRequest<KeyRotationSchedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KeyRotationSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KeyRotationSchedule> response = (ApiResponse<KeyRotationSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KeyRotationSchedule> response = (ApiResponse<KeyRotationSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the Recording Settings for the Organization
   * 
   * @param body Recording settings (required)
   * @return RecordingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingSettings putRecordingSettings(RecordingSettings body) throws IOException, ApiException {
    return  putRecordingSettings(createPutRecordingSettingsRequest(body));
  }

  /**
   * Update the Recording Settings for the Organization
   * 
   * @param body Recording settings (required)
   * @return RecordingSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingSettings> putRecordingSettingsWithHttpInfo(RecordingSettings body) throws IOException {
    return putRecordingSettings(createPutRecordingSettingsRequest(body).withHttpInfo());
  }

  private PutRecordingSettingsRequest createPutRecordingSettingsRequest(RecordingSettings body) {
    return PutRecordingSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update the Recording Settings for the Organization
   * 
   * @param request The request object
   * @return RecordingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecordingSettings putRecordingSettings(PutRecordingSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecordingSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecordingSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the Recording Settings for the Organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecordingSettings> putRecordingSettings(ApiRequest<RecordingSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecordingSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingSettings> response = (ApiResponse<RecordingSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RecordingSettings> response = (ApiResponse<RecordingSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Apply or revoke recording protection for conversations
   * 
   * @param protect Check for apply, uncheck for revoke (each action requires the respective permission) (optional, default to true)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putRecordingsDeletionprotection(Boolean protect, ConversationDeletionProtectionQuery body) throws IOException, ApiException {
     putRecordingsDeletionprotection(createPutRecordingsDeletionprotectionRequest(protect, body));
  }

  /**
   * Apply or revoke recording protection for conversations
   * 
   * @param protect Check for apply, uncheck for revoke (each action requires the respective permission) (optional, default to true)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putRecordingsDeletionprotectionWithHttpInfo(Boolean protect, ConversationDeletionProtectionQuery body) throws IOException {
    return putRecordingsDeletionprotection(createPutRecordingsDeletionprotectionRequest(protect, body).withHttpInfo());
  }

  private PutRecordingsDeletionprotectionRequest createPutRecordingsDeletionprotectionRequest(Boolean protect, ConversationDeletionProtectionQuery body) {
    return PutRecordingsDeletionprotectionRequest.builder()
            .withProtect(protect)

            .withBody(body)

            .build();
  }

  /**
   * Apply or revoke recording protection for conversations
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putRecordingsDeletionprotection(PutRecordingsDeletionprotectionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Apply or revoke recording protection for conversations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putRecordingsDeletionprotection(ApiRequest<ConversationDeletionProtectionQuery> request) throws IOException {
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

}
