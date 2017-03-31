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
import com.mypurecloud.sdk.v2.model.OrphanRecording;
import com.mypurecloud.sdk.v2.model.Recording;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.OrphanRecordingListing;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfigurationListing;
import com.mypurecloud.sdk.v2.model.PolicyEntityListing;
import com.mypurecloud.sdk.v2.model.Policy;
import com.mypurecloud.sdk.v2.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.v2.model.KeyRotationSchedule;
import com.mypurecloud.sdk.v2.model.RecordingSettings;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionListing;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionRequest;
import com.mypurecloud.sdk.v2.model.LocalEncryptionKeyRequest;
import com.mypurecloud.sdk.v2.model.EncryptionKey;
import com.mypurecloud.sdk.v2.model.PolicyCreate;
import com.mypurecloud.sdk.v2.model.OrphanUpdateRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteConversationRecordingAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOrphanrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingAnnotationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrphanrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrphanrecordingMediaRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrphanrecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingLocalkeysSettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingLocalkeysSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingRecordingkeysRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingRecordingkeysRotationscheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingsScreensessionsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRecordingsScreensessionRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationRecordingAnnotationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingLocalkeysRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingLocalkeysSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingRecordingkeysRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationRecordingRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationRecordingAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrphanrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingLocalkeysSettingRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingRecordingkeysRotationscheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingSettingsRequest;

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
   * @throws ApiException if fails to make API call
   */
  public void deleteConversationRecordingAnnotation(String conversationId, String recordingId, String annotationId) throws IOException, ApiException {
    deleteConversationRecordingAnnotationWithHttpInfo(conversationId, recordingId, annotationId);
  }

  /**
   * Delete annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteConversationRecordingAnnotationWithHttpInfo(String conversationId, String recordingId, String annotationId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'conversationId' when calling deleteConversationRecordingAnnotation");
    }
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'recordingId' when calling deleteConversationRecordingAnnotation");
    }
    
    // verify the required parameter 'annotationId' is set
    if (annotationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'annotationId' when calling deleteConversationRecordingAnnotation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "recordingId" + "\\}", pcapiClient.escapeString(recordingId.toString()))
      .replaceAll("\\{" + "annotationId" + "\\}", pcapiClient.escapeString(annotationId.toString()));

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
   * Delete annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteConversationRecordingAnnotation(DeleteConversationRecordingAnnotationRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteConversationRecordingAnnotation(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Deletes a single orphan recording
   * 
   * @param orphanId Orphan ID (required)
   * @return OrphanRecording
   * @throws ApiException if fails to make API call
   */
  public OrphanRecording deleteOrphanrecording(String orphanId) throws IOException, ApiException {
    return deleteOrphanrecordingWithHttpInfo(orphanId).getBody();
  }

  /**
   * Deletes a single orphan recording
   * 
   * @param orphanId Orphan ID (required)
   * @return OrphanRecording
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrphanRecording> deleteOrphanrecordingWithHttpInfo(String orphanId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'orphanId' is set
    if (orphanId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'orphanId' when calling deleteOrphanrecording");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/orphanrecordings/{orphanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orphanId" + "\\}", pcapiClient.escapeString(orphanId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OrphanRecording>() {});
  }

  /**
   * Deletes a single orphan recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OrphanRecording deleteOrphanrecording(DeleteOrphanrecordingRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OrphanRecording>() {});
  }

  /**
   * Deletes a single orphan recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrphanRecording> deleteOrphanrecording(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<OrphanRecording>invokeAPIVerbose(request, new TypeReference<OrphanRecording>() {});
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param ids  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteRecordingMediaretentionpolicies(String ids) throws IOException, ApiException {
    return deleteRecordingMediaretentionpoliciesWithHttpInfo(ids).getBody();
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param ids  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRecordingMediaretentionpoliciesWithHttpInfo(String ids) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new IllegalArgumentException("Missing the required parameter 'ids' when calling deleteRecordingMediaretentionpolicies");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/mediaretentionpolicies".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "ids", ids));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<String>() {});
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteRecordingMediaretentionpolicies(DeleteRecordingMediaretentionpoliciesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRecordingMediaretentionpolicies(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteRecordingMediaretentionpolicy(String policyId) throws IOException, ApiException {
    return deleteRecordingMediaretentionpolicyWithHttpInfo(policyId).getBody();
  }

  /**
   * Delete a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRecordingMediaretentionpolicyWithHttpInfo(String policyId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'policyId' when calling deleteRecordingMediaretentionpolicy");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/mediaretentionpolicies/{policyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "policyId" + "\\}", pcapiClient.escapeString(policyId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<String>() {});
  }

  /**
   * Delete a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteRecordingMediaretentionpolicy(DeleteRecordingMediaretentionpolicyRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRecordingMediaretentionpolicy(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Gets a specific recording.
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @param download requesting a download format of the recording (optional, default to false)
   * @param fileName the name of the downloaded fileName (optional)
   * @return Recording
   * @throws ApiException if fails to make API call
   */
  public Recording getConversationRecording(String conversationId, String recordingId, String formatId, Boolean download, String fileName) throws IOException, ApiException {
    return getConversationRecordingWithHttpInfo(conversationId, recordingId, formatId, download, fileName).getBody();
  }

  /**
   * Gets a specific recording.
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @param download requesting a download format of the recording (optional, default to false)
   * @param fileName the name of the downloaded fileName (optional)
   * @return Recording
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recording> getConversationRecordingWithHttpInfo(String conversationId, String recordingId, String formatId, Boolean download, String fileName) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'conversationId' when calling getConversationRecording");
    }
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'recordingId' when calling getConversationRecording");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/recordings/{recordingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "recordingId" + "\\}", pcapiClient.escapeString(recordingId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "formatId", formatId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "download", download));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "fileName", fileName));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Recording>() {});
  }

  /**
   * Gets a specific recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Recording getConversationRecording(GetConversationRecordingRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Recording>() {});
  }

  /**
   * Gets a specific recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recording> getConversationRecording(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Recording>invokeAPIVerbose(request, new TypeReference<Recording>() {});
  }

  /**
   * Get annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @return Annotation
   * @throws ApiException if fails to make API call
   */
  public Annotation getConversationRecordingAnnotation(String conversationId, String recordingId, String annotationId) throws IOException, ApiException {
    return getConversationRecordingAnnotationWithHttpInfo(conversationId, recordingId, annotationId).getBody();
  }

  /**
   * Get annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @return Annotation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Annotation> getConversationRecordingAnnotationWithHttpInfo(String conversationId, String recordingId, String annotationId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'conversationId' when calling getConversationRecordingAnnotation");
    }
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'recordingId' when calling getConversationRecordingAnnotation");
    }
    
    // verify the required parameter 'annotationId' is set
    if (annotationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'annotationId' when calling getConversationRecordingAnnotation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "recordingId" + "\\}", pcapiClient.escapeString(recordingId.toString()))
      .replaceAll("\\{" + "annotationId" + "\\}", pcapiClient.escapeString(annotationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Annotation>() {});
  }

  /**
   * Get annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Annotation getConversationRecordingAnnotation(GetConversationRecordingAnnotationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Annotation>() {});
  }

  /**
   * Get annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Annotation> getConversationRecordingAnnotation(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Annotation>invokeAPIVerbose(request, new TypeReference<Annotation>() {});
  }

  /**
   * Get annotations for recording
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @return List<Annotation>
   * @throws ApiException if fails to make API call
   */
  public List<Annotation> getConversationRecordingAnnotations(String conversationId, String recordingId) throws IOException, ApiException {
    return getConversationRecordingAnnotationsWithHttpInfo(conversationId, recordingId).getBody();
  }

  /**
   * Get annotations for recording
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @return List<Annotation>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Annotation>> getConversationRecordingAnnotationsWithHttpInfo(String conversationId, String recordingId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'conversationId' when calling getConversationRecordingAnnotations");
    }
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'recordingId' when calling getConversationRecordingAnnotations");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "recordingId" + "\\}", pcapiClient.escapeString(recordingId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<Annotation>>() {});
  }

  /**
   * Get annotations for recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<Annotation> getConversationRecordingAnnotations(GetConversationRecordingAnnotationsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<Annotation>>() {});
  }

  /**
   * Get annotations for recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Annotation>> getConversationRecordingAnnotations(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<List<Annotation>>invokeAPIVerbose(request, new TypeReference<List<Annotation>>() {});
  }

  /**
   * Get all of a Conversation&#39;s Recordings.
   * 
   * @param conversationId Conversation ID (required)
   * @param maxWaitMs The maximum number of milliseconds to wait for the recording to be ready. Must be a positive value. (optional, default to 5000)
   * @param formatId The desired media format (optional, default to WEBM)
   * @return List<Recording>
   * @throws ApiException if fails to make API call
   */
  public List<Recording> getConversationRecordings(String conversationId, Integer maxWaitMs, String formatId) throws IOException, ApiException {
    return getConversationRecordingsWithHttpInfo(conversationId, maxWaitMs, formatId).getBody();
  }

  /**
   * Get all of a Conversation&#39;s Recordings.
   * 
   * @param conversationId Conversation ID (required)
   * @param maxWaitMs The maximum number of milliseconds to wait for the recording to be ready. Must be a positive value. (optional, default to 5000)
   * @param formatId The desired media format (optional, default to WEBM)
   * @return List<Recording>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Recording>> getConversationRecordingsWithHttpInfo(String conversationId, Integer maxWaitMs, String formatId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'conversationId' when calling getConversationRecordings");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/recordings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "maxWaitMs", maxWaitMs));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "formatId", formatId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<Recording>>() {});
  }

  /**
   * Get all of a Conversation&#39;s Recordings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<Recording> getConversationRecordings(GetConversationRecordingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<Recording>>() {});
  }

  /**
   * Get all of a Conversation&#39;s Recordings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Recording>> getConversationRecordings(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<List<Recording>>invokeAPIVerbose(request, new TypeReference<List<Recording>>() {});
  }

  /**
   * Gets a single orphan recording
   * 
   * @param orphanId Orphan ID (required)
   * @return OrphanRecording
   * @throws ApiException if fails to make API call
   */
  public OrphanRecording getOrphanrecording(String orphanId) throws IOException, ApiException {
    return getOrphanrecordingWithHttpInfo(orphanId).getBody();
  }

  /**
   * Gets a single orphan recording
   * 
   * @param orphanId Orphan ID (required)
   * @return OrphanRecording
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrphanRecording> getOrphanrecordingWithHttpInfo(String orphanId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'orphanId' is set
    if (orphanId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'orphanId' when calling getOrphanrecording");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/orphanrecordings/{orphanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orphanId" + "\\}", pcapiClient.escapeString(orphanId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OrphanRecording>() {});
  }

  /**
   * Gets a single orphan recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OrphanRecording getOrphanrecording(GetOrphanrecordingRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OrphanRecording>() {});
  }

  /**
   * Gets a single orphan recording
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrphanRecording> getOrphanrecording(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<OrphanRecording>invokeAPIVerbose(request, new TypeReference<OrphanRecording>() {});
  }

  /**
   * Gets the media of a single orphan recording
   * A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.
   * @param orphanId Orphan ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @param download requesting a download format of the recording (optional, default to false)
   * @param fileName the name of the downloaded fileName (optional)
   * @return Recording
   * @throws ApiException if fails to make API call
   */
  public Recording getOrphanrecordingMedia(String orphanId, String formatId, Boolean download, String fileName) throws IOException, ApiException {
    return getOrphanrecordingMediaWithHttpInfo(orphanId, formatId, download, fileName).getBody();
  }

  /**
   * Gets the media of a single orphan recording
   * A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.
   * @param orphanId Orphan ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @param download requesting a download format of the recording (optional, default to false)
   * @param fileName the name of the downloaded fileName (optional)
   * @return Recording
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recording> getOrphanrecordingMediaWithHttpInfo(String orphanId, String formatId, Boolean download, String fileName) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'orphanId' is set
    if (orphanId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'orphanId' when calling getOrphanrecordingMedia");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/orphanrecordings/{orphanId}/media".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orphanId" + "\\}", pcapiClient.escapeString(orphanId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "formatId", formatId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "download", download));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "fileName", fileName));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Recording>() {});
  }

  /**
   * Gets the media of a single orphan recording
   * A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Recording getOrphanrecordingMedia(GetOrphanrecordingMediaRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Recording>() {});
  }

  /**
   * Gets the media of a single orphan recording
   * A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recording> getOrphanrecordingMedia(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Recording>invokeAPIVerbose(request, new TypeReference<Recording>() {});
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
   * @return OrphanRecordingListing
   * @throws ApiException if fails to make API call
   */
  public OrphanRecordingListing getOrphanrecordings(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, Boolean hasConversation) throws IOException, ApiException {
    return getOrphanrecordingsWithHttpInfo(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, hasConversation).getBody();
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
   * @return OrphanRecordingListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrphanRecordingListing> getOrphanrecordingsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, Boolean hasConversation) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/orphanrecordings".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nextPage", nextPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "previousPage", previousPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "hasConversation", hasConversation));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OrphanRecordingListing>() {});
  }

  /**
   * Gets all orphan recordings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OrphanRecordingListing getOrphanrecordings(GetOrphanrecordingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OrphanRecordingListing>() {});
  }

  /**
   * Gets all orphan recordings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrphanRecordingListing> getOrphanrecordings(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<OrphanRecordingListing>invokeAPIVerbose(request, new TypeReference<OrphanRecordingListing>() {});
  }

  /**
   * Get the local encryption settings
   * 
   * @param settingsId Settings Id (required)
   * @return LocalEncryptionConfiguration
   * @throws ApiException if fails to make API call
   */
  public LocalEncryptionConfiguration getRecordingLocalkeysSetting(String settingsId) throws IOException, ApiException {
    return getRecordingLocalkeysSettingWithHttpInfo(settingsId).getBody();
  }

  /**
   * Get the local encryption settings
   * 
   * @param settingsId Settings Id (required)
   * @return LocalEncryptionConfiguration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalEncryptionConfiguration> getRecordingLocalkeysSettingWithHttpInfo(String settingsId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'settingsId' is set
    if (settingsId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'settingsId' when calling getRecordingLocalkeysSetting");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/localkeys/settings/{settingsId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "settingsId" + "\\}", pcapiClient.escapeString(settingsId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LocalEncryptionConfiguration>() {});
  }

  /**
   * Get the local encryption settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LocalEncryptionConfiguration getRecordingLocalkeysSetting(GetRecordingLocalkeysSettingRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LocalEncryptionConfiguration>() {});
  }

  /**
   * Get the local encryption settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalEncryptionConfiguration> getRecordingLocalkeysSetting(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<LocalEncryptionConfiguration>invokeAPIVerbose(request, new TypeReference<LocalEncryptionConfiguration>() {});
  }

  /**
   * gets a list local key settings data
   * 
   * @return LocalEncryptionConfigurationListing
   * @throws ApiException if fails to make API call
   */
  public LocalEncryptionConfigurationListing getRecordingLocalkeysSettings() throws IOException, ApiException {
    return getRecordingLocalkeysSettingsWithHttpInfo().getBody();
  }

  /**
   * gets a list local key settings data
   * 
   * @return LocalEncryptionConfigurationListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalEncryptionConfigurationListing> getRecordingLocalkeysSettingsWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/localkeys/settings".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LocalEncryptionConfigurationListing>() {});
  }

  /**
   * gets a list local key settings data
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LocalEncryptionConfigurationListing getRecordingLocalkeysSettings(GetRecordingLocalkeysSettingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LocalEncryptionConfigurationListing>() {});
  }

  /**
   * gets a list local key settings data
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalEncryptionConfigurationListing> getRecordingLocalkeysSettings(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<LocalEncryptionConfigurationListing>invokeAPIVerbose(request, new TypeReference<LocalEncryptionConfigurationListing>() {});
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary&#x3D;true to this endpoint
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name the policy name - used for filtering results in searches. (optional)
   * @param enabled checks to see if policy is enabled - use enabled &#x3D; true or enabled &#x3D; false (optional)
   * @param summary provides a less verbose response of policy lists. (optional, default to false)
   * @param hasErrors provides a way to fetch all policies with errors or policies that do not have errors (optional)
   * @return PolicyEntityListing
   * @throws ApiException if fails to make API call
   */
  public PolicyEntityListing getRecordingMediaretentionpolicies(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String name, Boolean enabled, Boolean summary, Boolean hasErrors) throws IOException, ApiException {
    return getRecordingMediaretentionpoliciesWithHttpInfo(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors).getBody();
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary&#x3D;true to this endpoint
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name the policy name - used for filtering results in searches. (optional)
   * @param enabled checks to see if policy is enabled - use enabled &#x3D; true or enabled &#x3D; false (optional)
   * @param summary provides a less verbose response of policy lists. (optional, default to false)
   * @param hasErrors provides a way to fetch all policies with errors or policies that do not have errors (optional)
   * @return PolicyEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PolicyEntityListing> getRecordingMediaretentionpoliciesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String name, Boolean enabled, Boolean summary, Boolean hasErrors) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/mediaretentionpolicies".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nextPage", nextPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "previousPage", previousPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "enabled", enabled));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "summary", summary));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "hasErrors", hasErrors));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PolicyEntityListing>() {});
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary&#x3D;true to this endpoint
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PolicyEntityListing getRecordingMediaretentionpolicies(GetRecordingMediaretentionpoliciesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PolicyEntityListing>() {});
  }

  /**
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary&#x3D;true to this endpoint
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PolicyEntityListing> getRecordingMediaretentionpolicies(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<PolicyEntityListing>invokeAPIVerbose(request, new TypeReference<PolicyEntityListing>() {});
  }

  /**
   * Get a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @return Policy
   * @throws ApiException if fails to make API call
   */
  public Policy getRecordingMediaretentionpolicy(String policyId) throws IOException, ApiException {
    return getRecordingMediaretentionpolicyWithHttpInfo(policyId).getBody();
  }

  /**
   * Get a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @return Policy
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Policy> getRecordingMediaretentionpolicyWithHttpInfo(String policyId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'policyId' when calling getRecordingMediaretentionpolicy");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/mediaretentionpolicies/{policyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "policyId" + "\\}", pcapiClient.escapeString(policyId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Policy>() {});
  }

  /**
   * Get a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Policy getRecordingMediaretentionpolicy(GetRecordingMediaretentionpolicyRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Policy>() {});
  }

  /**
   * Get a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Policy> getRecordingMediaretentionpolicy(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Policy>invokeAPIVerbose(request, new TypeReference<Policy>() {});
  }

  /**
   * Get encryption key list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return EncryptionKeyEntityListing
   * @throws ApiException if fails to make API call
   */
  public EncryptionKeyEntityListing getRecordingRecordingkeys(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return getRecordingRecordingkeysWithHttpInfo(pageSize, pageNumber).getBody();
  }

  /**
   * Get encryption key list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return EncryptionKeyEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EncryptionKeyEntityListing> getRecordingRecordingkeysWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/recordingkeys".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EncryptionKeyEntityListing>() {});
  }

  /**
   * Get encryption key list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EncryptionKeyEntityListing getRecordingRecordingkeys(GetRecordingRecordingkeysRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EncryptionKeyEntityListing>() {});
  }

  /**
   * Get encryption key list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EncryptionKeyEntityListing> getRecordingRecordingkeys(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<EncryptionKeyEntityListing>invokeAPIVerbose(request, new TypeReference<EncryptionKeyEntityListing>() {});
  }

  /**
   * Get key rotation schedule
   * 
   * @return KeyRotationSchedule
   * @throws ApiException if fails to make API call
   */
  public KeyRotationSchedule getRecordingRecordingkeysRotationschedule() throws IOException, ApiException {
    return getRecordingRecordingkeysRotationscheduleWithHttpInfo().getBody();
  }

  /**
   * Get key rotation schedule
   * 
   * @return KeyRotationSchedule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeyRotationSchedule> getRecordingRecordingkeysRotationscheduleWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/recordingkeys/rotationschedule".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<KeyRotationSchedule>() {});
  }

  /**
   * Get key rotation schedule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public KeyRotationSchedule getRecordingRecordingkeysRotationschedule(GetRecordingRecordingkeysRotationscheduleRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<KeyRotationSchedule>() {});
  }

  /**
   * Get key rotation schedule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeyRotationSchedule> getRecordingRecordingkeysRotationschedule(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<KeyRotationSchedule>invokeAPIVerbose(request, new TypeReference<KeyRotationSchedule>() {});
  }

  /**
   * Get the Recording Settings for the Organization
   * 
   * @param createDefault If no settings are found, a new one is created with default values (optional, default to false)
   * @return RecordingSettings
   * @throws ApiException if fails to make API call
   */
  public RecordingSettings getRecordingSettings(Boolean createDefault) throws IOException, ApiException {
    return getRecordingSettingsWithHttpInfo(createDefault).getBody();
  }

  /**
   * Get the Recording Settings for the Organization
   * 
   * @param createDefault If no settings are found, a new one is created with default values (optional, default to false)
   * @return RecordingSettings
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RecordingSettings> getRecordingSettingsWithHttpInfo(Boolean createDefault) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/settings".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "createDefault", createDefault));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RecordingSettings>() {});
  }

  /**
   * Get the Recording Settings for the Organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RecordingSettings getRecordingSettings(GetRecordingSettingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RecordingSettings>() {});
  }

  /**
   * Get the Recording Settings for the Organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RecordingSettings> getRecordingSettings(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<RecordingSettings>invokeAPIVerbose(request, new TypeReference<RecordingSettings>() {});
  }

  /**
   * Retrieves a paged listing of screen recording sessions
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return ScreenRecordingSessionListing
   * @throws ApiException if fails to make API call
   */
  public ScreenRecordingSessionListing getRecordingsScreensessions(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return getRecordingsScreensessionsWithHttpInfo(pageSize, pageNumber).getBody();
  }

  /**
   * Retrieves a paged listing of screen recording sessions
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return ScreenRecordingSessionListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ScreenRecordingSessionListing> getRecordingsScreensessionsWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recordings/screensessions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ScreenRecordingSessionListing>() {});
  }

  /**
   * Retrieves a paged listing of screen recording sessions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ScreenRecordingSessionListing getRecordingsScreensessions(GetRecordingsScreensessionsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ScreenRecordingSessionListing>() {});
  }

  /**
   * Retrieves a paged listing of screen recording sessions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ScreenRecordingSessionListing> getRecordingsScreensessions(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ScreenRecordingSessionListing>invokeAPIVerbose(request, new TypeReference<ScreenRecordingSessionListing>() {});
  }

  /**
   * Patch a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @param body Policy (required)
   * @return Policy
   * @throws ApiException if fails to make API call
   */
  public Policy patchRecordingMediaretentionpolicy(String policyId, Policy body) throws IOException, ApiException {
    return patchRecordingMediaretentionpolicyWithHttpInfo(policyId, body).getBody();
  }

  /**
   * Patch a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @param body Policy (required)
   * @return Policy
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Policy> patchRecordingMediaretentionpolicyWithHttpInfo(String policyId, Policy body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'policyId' when calling patchRecordingMediaretentionpolicy");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling patchRecordingMediaretentionpolicy");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/mediaretentionpolicies/{policyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "policyId" + "\\}", pcapiClient.escapeString(policyId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Policy>() {});
  }

  /**
   * Patch a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Policy patchRecordingMediaretentionpolicy(PatchRecordingMediaretentionpolicyRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Policy>() {});
  }

  /**
   * Patch a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Policy> patchRecordingMediaretentionpolicy(ApiRequest<Policy> request) throws IOException, ApiException {
    return pcapiClient.<Policy>invokeAPIVerbose(request, new TypeReference<Policy>() {});
  }

  /**
   * Update a screen recording session
   * 
   * @param recordingSessionId Screen recording session ID (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void patchRecordingsScreensession(String recordingSessionId, ScreenRecordingSessionRequest body) throws IOException, ApiException {
    patchRecordingsScreensessionWithHttpInfo(recordingSessionId, body);
  }

  /**
   * Update a screen recording session
   * 
   * @param recordingSessionId Screen recording session ID (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchRecordingsScreensessionWithHttpInfo(String recordingSessionId, ScreenRecordingSessionRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'recordingSessionId' is set
    if (recordingSessionId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'recordingSessionId' when calling patchRecordingsScreensession");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recordings/screensessions/{recordingSessionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "recordingSessionId" + "\\}", pcapiClient.escapeString(recordingSessionId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Update a screen recording session
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchRecordingsScreensession(PatchRecordingsScreensessionRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Update a screen recording session
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchRecordingsScreensession(ApiRequest<ScreenRecordingSessionRequest> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Create annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param body annotation (required)
   * @return Annotation
   * @throws ApiException if fails to make API call
   */
  public Annotation postConversationRecordingAnnotations(String conversationId, String recordingId, Annotation body) throws IOException, ApiException {
    return postConversationRecordingAnnotationsWithHttpInfo(conversationId, recordingId, body).getBody();
  }

  /**
   * Create annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param body annotation (required)
   * @return Annotation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Annotation> postConversationRecordingAnnotationsWithHttpInfo(String conversationId, String recordingId, Annotation body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'conversationId' when calling postConversationRecordingAnnotations");
    }
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'recordingId' when calling postConversationRecordingAnnotations");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postConversationRecordingAnnotations");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "recordingId" + "\\}", pcapiClient.escapeString(recordingId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Annotation>() {});
  }

  /**
   * Create annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Annotation postConversationRecordingAnnotations(PostConversationRecordingAnnotationsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Annotation>() {});
  }

  /**
   * Create annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Annotation> postConversationRecordingAnnotations(ApiRequest<Annotation> request) throws IOException, ApiException {
    return pcapiClient.<Annotation>invokeAPIVerbose(request, new TypeReference<Annotation>() {});
  }

  /**
   * create a local recording key
   * 
   * @param body Local Encryption body (required)
   * @return EncryptionKey
   * @throws ApiException if fails to make API call
   */
  public EncryptionKey postRecordingLocalkeys(LocalEncryptionKeyRequest body) throws IOException, ApiException {
    return postRecordingLocalkeysWithHttpInfo(body).getBody();
  }

  /**
   * create a local recording key
   * 
   * @param body Local Encryption body (required)
   * @return EncryptionKey
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EncryptionKey> postRecordingLocalkeysWithHttpInfo(LocalEncryptionKeyRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postRecordingLocalkeys");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/localkeys".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EncryptionKey>() {});
  }

  /**
   * create a local recording key
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EncryptionKey postRecordingLocalkeys(PostRecordingLocalkeysRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EncryptionKey>() {});
  }

  /**
   * create a local recording key
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EncryptionKey> postRecordingLocalkeys(ApiRequest<LocalEncryptionKeyRequest> request) throws IOException, ApiException {
    return pcapiClient.<EncryptionKey>invokeAPIVerbose(request, new TypeReference<EncryptionKey>() {});
  }

  /**
   * create settings for local key creation
   * 
   * @param body Local Encryption Configuration (required)
   * @return LocalEncryptionConfiguration
   * @throws ApiException if fails to make API call
   */
  public LocalEncryptionConfiguration postRecordingLocalkeysSettings(LocalEncryptionConfiguration body) throws IOException, ApiException {
    return postRecordingLocalkeysSettingsWithHttpInfo(body).getBody();
  }

  /**
   * create settings for local key creation
   * 
   * @param body Local Encryption Configuration (required)
   * @return LocalEncryptionConfiguration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalEncryptionConfiguration> postRecordingLocalkeysSettingsWithHttpInfo(LocalEncryptionConfiguration body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postRecordingLocalkeysSettings");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/localkeys/settings".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LocalEncryptionConfiguration>() {});
  }

  /**
   * create settings for local key creation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LocalEncryptionConfiguration postRecordingLocalkeysSettings(PostRecordingLocalkeysSettingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LocalEncryptionConfiguration>() {});
  }

  /**
   * create settings for local key creation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalEncryptionConfiguration> postRecordingLocalkeysSettings(ApiRequest<LocalEncryptionConfiguration> request) throws IOException, ApiException {
    return pcapiClient.<LocalEncryptionConfiguration>invokeAPIVerbose(request, new TypeReference<LocalEncryptionConfiguration>() {});
  }

  /**
   * Create media retention policy
   * 
   * @param body Policy (required)
   * @return Policy
   * @throws ApiException if fails to make API call
   */
  public Policy postRecordingMediaretentionpolicies(PolicyCreate body) throws IOException, ApiException {
    return postRecordingMediaretentionpoliciesWithHttpInfo(body).getBody();
  }

  /**
   * Create media retention policy
   * 
   * @param body Policy (required)
   * @return Policy
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Policy> postRecordingMediaretentionpoliciesWithHttpInfo(PolicyCreate body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postRecordingMediaretentionpolicies");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/mediaretentionpolicies".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Policy>() {});
  }

  /**
   * Create media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Policy postRecordingMediaretentionpolicies(PostRecordingMediaretentionpoliciesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Policy>() {});
  }

  /**
   * Create media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Policy> postRecordingMediaretentionpolicies(ApiRequest<PolicyCreate> request) throws IOException, ApiException {
    return pcapiClient.<Policy>invokeAPIVerbose(request, new TypeReference<Policy>() {});
  }

  /**
   * Create encryption key
   * 
   * @return EncryptionKey
   * @throws ApiException if fails to make API call
   */
  public EncryptionKey postRecordingRecordingkeys() throws IOException, ApiException {
    return postRecordingRecordingkeysWithHttpInfo().getBody();
  }

  /**
   * Create encryption key
   * 
   * @return EncryptionKey
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EncryptionKey> postRecordingRecordingkeysWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/recordingkeys".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EncryptionKey>() {});
  }

  /**
   * Create encryption key
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EncryptionKey postRecordingRecordingkeys(PostRecordingRecordingkeysRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EncryptionKey>() {});
  }

  /**
   * Create encryption key
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EncryptionKey> postRecordingRecordingkeys(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<EncryptionKey>invokeAPIVerbose(request, new TypeReference<EncryptionKey>() {});
  }

  /**
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param body recording (required)
   * @return Recording
   * @throws ApiException if fails to make API call
   */
  public Recording putConversationRecording(String conversationId, String recordingId, Recording body) throws IOException, ApiException {
    return putConversationRecordingWithHttpInfo(conversationId, recordingId, body).getBody();
  }

  /**
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param body recording (required)
   * @return Recording
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recording> putConversationRecordingWithHttpInfo(String conversationId, String recordingId, Recording body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'conversationId' when calling putConversationRecording");
    }
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'recordingId' when calling putConversationRecording");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putConversationRecording");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/recordings/{recordingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "recordingId" + "\\}", pcapiClient.escapeString(recordingId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Recording>() {});
  }

  /**
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Recording putConversationRecording(PutConversationRecordingRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Recording>() {});
  }

  /**
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recording> putConversationRecording(ApiRequest<Recording> request) throws IOException, ApiException {
    return pcapiClient.<Recording>invokeAPIVerbose(request, new TypeReference<Recording>() {});
  }

  /**
   * Update annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @param body annotation (required)
   * @return Annotation
   * @throws ApiException if fails to make API call
   */
  public Annotation putConversationRecordingAnnotation(String conversationId, String recordingId, String annotationId, Annotation body) throws IOException, ApiException {
    return putConversationRecordingAnnotationWithHttpInfo(conversationId, recordingId, annotationId, body).getBody();
  }

  /**
   * Update annotation
   * 
   * @param conversationId Conversation ID (required)
   * @param recordingId Recording ID (required)
   * @param annotationId Annotation ID (required)
   * @param body annotation (required)
   * @return Annotation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Annotation> putConversationRecordingAnnotationWithHttpInfo(String conversationId, String recordingId, String annotationId, Annotation body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'conversationId' when calling putConversationRecordingAnnotation");
    }
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'recordingId' when calling putConversationRecordingAnnotation");
    }
    
    // verify the required parameter 'annotationId' is set
    if (annotationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'annotationId' when calling putConversationRecordingAnnotation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putConversationRecordingAnnotation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()))
      .replaceAll("\\{" + "recordingId" + "\\}", pcapiClient.escapeString(recordingId.toString()))
      .replaceAll("\\{" + "annotationId" + "\\}", pcapiClient.escapeString(annotationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Annotation>() {});
  }

  /**
   * Update annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Annotation putConversationRecordingAnnotation(PutConversationRecordingAnnotationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Annotation>() {});
  }

  /**
   * Update annotation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Annotation> putConversationRecordingAnnotation(ApiRequest<Annotation> request) throws IOException, ApiException {
    return pcapiClient.<Annotation>invokeAPIVerbose(request, new TypeReference<Annotation>() {});
  }

  /**
   * Updates an orphan recording to a regular recording with retention values
   * If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.
   * @param orphanId Orphan ID (required)
   * @param body  (optional)
   * @return Recording
   * @throws ApiException if fails to make API call
   */
  public Recording putOrphanrecording(String orphanId, OrphanUpdateRequest body) throws IOException, ApiException {
    return putOrphanrecordingWithHttpInfo(orphanId, body).getBody();
  }

  /**
   * Updates an orphan recording to a regular recording with retention values
   * If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.
   * @param orphanId Orphan ID (required)
   * @param body  (optional)
   * @return Recording
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recording> putOrphanrecordingWithHttpInfo(String orphanId, OrphanUpdateRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'orphanId' is set
    if (orphanId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'orphanId' when calling putOrphanrecording");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/orphanrecordings/{orphanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "orphanId" + "\\}", pcapiClient.escapeString(orphanId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Recording>() {});
  }

  /**
   * Updates an orphan recording to a regular recording with retention values
   * If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Recording putOrphanrecording(PutOrphanrecordingRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Recording>() {});
  }

  /**
   * Updates an orphan recording to a regular recording with retention values
   * If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Recording> putOrphanrecording(ApiRequest<OrphanUpdateRequest> request) throws IOException, ApiException {
    return pcapiClient.<Recording>invokeAPIVerbose(request, new TypeReference<Recording>() {});
  }

  /**
   * Update the local encryption settings
   * 
   * @param settingsId Settings Id (required)
   * @param body Local Encryption metadata (required)
   * @return LocalEncryptionConfiguration
   * @throws ApiException if fails to make API call
   */
  public LocalEncryptionConfiguration putRecordingLocalkeysSetting(String settingsId, LocalEncryptionConfiguration body) throws IOException, ApiException {
    return putRecordingLocalkeysSettingWithHttpInfo(settingsId, body).getBody();
  }

  /**
   * Update the local encryption settings
   * 
   * @param settingsId Settings Id (required)
   * @param body Local Encryption metadata (required)
   * @return LocalEncryptionConfiguration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalEncryptionConfiguration> putRecordingLocalkeysSettingWithHttpInfo(String settingsId, LocalEncryptionConfiguration body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'settingsId' is set
    if (settingsId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'settingsId' when calling putRecordingLocalkeysSetting");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putRecordingLocalkeysSetting");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/localkeys/settings/{settingsId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "settingsId" + "\\}", pcapiClient.escapeString(settingsId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LocalEncryptionConfiguration>() {});
  }

  /**
   * Update the local encryption settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LocalEncryptionConfiguration putRecordingLocalkeysSetting(PutRecordingLocalkeysSettingRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LocalEncryptionConfiguration>() {});
  }

  /**
   * Update the local encryption settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocalEncryptionConfiguration> putRecordingLocalkeysSetting(ApiRequest<LocalEncryptionConfiguration> request) throws IOException, ApiException {
    return pcapiClient.<LocalEncryptionConfiguration>invokeAPIVerbose(request, new TypeReference<LocalEncryptionConfiguration>() {});
  }

  /**
   * Update a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @param body Policy (required)
   * @return Policy
   * @throws ApiException if fails to make API call
   */
  public Policy putRecordingMediaretentionpolicy(String policyId, Policy body) throws IOException, ApiException {
    return putRecordingMediaretentionpolicyWithHttpInfo(policyId, body).getBody();
  }

  /**
   * Update a media retention policy
   * 
   * @param policyId Policy ID (required)
   * @param body Policy (required)
   * @return Policy
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Policy> putRecordingMediaretentionpolicyWithHttpInfo(String policyId, Policy body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'policyId' is set
    if (policyId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'policyId' when calling putRecordingMediaretentionpolicy");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putRecordingMediaretentionpolicy");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/mediaretentionpolicies/{policyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "policyId" + "\\}", pcapiClient.escapeString(policyId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Policy>() {});
  }

  /**
   * Update a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Policy putRecordingMediaretentionpolicy(PutRecordingMediaretentionpolicyRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Policy>() {});
  }

  /**
   * Update a media retention policy
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Policy> putRecordingMediaretentionpolicy(ApiRequest<Policy> request) throws IOException, ApiException {
    return pcapiClient.<Policy>invokeAPIVerbose(request, new TypeReference<Policy>() {});
  }

  /**
   * Update key rotation schedule
   * 
   * @param body KeyRotationSchedule (required)
   * @return KeyRotationSchedule
   * @throws ApiException if fails to make API call
   */
  public KeyRotationSchedule putRecordingRecordingkeysRotationschedule(KeyRotationSchedule body) throws IOException, ApiException {
    return putRecordingRecordingkeysRotationscheduleWithHttpInfo(body).getBody();
  }

  /**
   * Update key rotation schedule
   * 
   * @param body KeyRotationSchedule (required)
   * @return KeyRotationSchedule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeyRotationSchedule> putRecordingRecordingkeysRotationscheduleWithHttpInfo(KeyRotationSchedule body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putRecordingRecordingkeysRotationschedule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/recordingkeys/rotationschedule".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<KeyRotationSchedule>() {});
  }

  /**
   * Update key rotation schedule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public KeyRotationSchedule putRecordingRecordingkeysRotationschedule(PutRecordingRecordingkeysRotationscheduleRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<KeyRotationSchedule>() {});
  }

  /**
   * Update key rotation schedule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<KeyRotationSchedule> putRecordingRecordingkeysRotationschedule(ApiRequest<KeyRotationSchedule> request) throws IOException, ApiException {
    return pcapiClient.<KeyRotationSchedule>invokeAPIVerbose(request, new TypeReference<KeyRotationSchedule>() {});
  }

  /**
   * Update the Recording Settings for the Organization
   * 
   * @param body Recording settings (required)
   * @return RecordingSettings
   * @throws ApiException if fails to make API call
   */
  public RecordingSettings putRecordingSettings(RecordingSettings body) throws IOException, ApiException {
    return putRecordingSettingsWithHttpInfo(body).getBody();
  }

  /**
   * Update the Recording Settings for the Organization
   * 
   * @param body Recording settings (required)
   * @return RecordingSettings
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RecordingSettings> putRecordingSettingsWithHttpInfo(RecordingSettings body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putRecordingSettings");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/recording/settings".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RecordingSettings>() {});
  }

  /**
   * Update the Recording Settings for the Organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RecordingSettings putRecordingSettings(PutRecordingSettingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RecordingSettings>() {});
  }

  /**
   * Update the Recording Settings for the Organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RecordingSettings> putRecordingSettings(ApiRequest<RecordingSettings> request) throws IOException, ApiException {
    return pcapiClient.<RecordingSettings>invokeAPIVerbose(request, new TypeReference<RecordingSettings>() {});
  }

}
