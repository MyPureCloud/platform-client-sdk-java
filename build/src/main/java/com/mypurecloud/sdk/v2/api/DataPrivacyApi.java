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
import com.mypurecloud.sdk.v2.model.ErrorInfo;
import com.mypurecloud.sdk.v2.model.MaskingRule;
import com.mypurecloud.sdk.v2.model.MaskingRuleListing;
import com.mypurecloud.sdk.v2.model.MaskingRuleValidateRequest;
import com.mypurecloud.sdk.v2.model.MaskingRuleValidateResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteDataprivacyMaskingruleRequest;
import com.mypurecloud.sdk.v2.api.request.GetDataprivacyMaskingruleRequest;
import com.mypurecloud.sdk.v2.api.request.GetDataprivacyMaskingrulesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchDataprivacyMaskingruleRequest;
import com.mypurecloud.sdk.v2.api.request.PostDataprivacyMaskingrulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostDataprivacyMaskingrulesValidateRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataPrivacyApi {
  private final ApiClient pcapiClient;

  public DataPrivacyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataPrivacyApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a masking rule.
   * 
   * @param ruleId ruleId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteDataprivacyMaskingrule(String ruleId) throws IOException, ApiException {
     deleteDataprivacyMaskingrule(createDeleteDataprivacyMaskingruleRequest(ruleId));
  }

  /**
   * Delete a masking rule.
   * 
   * @param ruleId ruleId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteDataprivacyMaskingruleWithHttpInfo(String ruleId) throws IOException {
    return deleteDataprivacyMaskingrule(createDeleteDataprivacyMaskingruleRequest(ruleId).withHttpInfo());
  }

  private DeleteDataprivacyMaskingruleRequest createDeleteDataprivacyMaskingruleRequest(String ruleId) {
    return DeleteDataprivacyMaskingruleRequest.builder()
            .withRuleId(ruleId)

            .build();
  }

  /**
   * Delete a masking rule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteDataprivacyMaskingrule(DeleteDataprivacyMaskingruleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a masking rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteDataprivacyMaskingrule(ApiRequest<Void> request) throws IOException {
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
   * Fetch details about a masking rule.
   * 
   * @param ruleId ruleId (required)
   * @return MaskingRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MaskingRule getDataprivacyMaskingrule(String ruleId) throws IOException, ApiException {
    return  getDataprivacyMaskingrule(createGetDataprivacyMaskingruleRequest(ruleId));
  }

  /**
   * Fetch details about a masking rule.
   * 
   * @param ruleId ruleId (required)
   * @return MaskingRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MaskingRule> getDataprivacyMaskingruleWithHttpInfo(String ruleId) throws IOException {
    return getDataprivacyMaskingrule(createGetDataprivacyMaskingruleRequest(ruleId).withHttpInfo());
  }

  private GetDataprivacyMaskingruleRequest createGetDataprivacyMaskingruleRequest(String ruleId) {
    return GetDataprivacyMaskingruleRequest.builder()
            .withRuleId(ruleId)

            .build();
  }

  /**
   * Fetch details about a masking rule.
   * 
   * @param request The request object
   * @return MaskingRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MaskingRule getDataprivacyMaskingrule(GetDataprivacyMaskingruleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MaskingRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MaskingRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch details about a masking rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MaskingRule> getDataprivacyMaskingrule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MaskingRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MaskingRule> response = (ApiResponse<MaskingRule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MaskingRule> response = (ApiResponse<MaskingRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve the list of masking rules.
   * 
   * @return MaskingRuleListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MaskingRuleListing getDataprivacyMaskingrules() throws IOException, ApiException {
    return  getDataprivacyMaskingrules(createGetDataprivacyMaskingrulesRequest());
  }

  /**
   * Retrieve the list of masking rules.
   * 
   * @return MaskingRuleListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MaskingRuleListing> getDataprivacyMaskingrulesWithHttpInfo() throws IOException {
    return getDataprivacyMaskingrules(createGetDataprivacyMaskingrulesRequest().withHttpInfo());
  }

  private GetDataprivacyMaskingrulesRequest createGetDataprivacyMaskingrulesRequest() {
    return GetDataprivacyMaskingrulesRequest.builder()
            .build();
  }

  /**
   * Retrieve the list of masking rules.
   * 
   * @param request The request object
   * @return MaskingRuleListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MaskingRuleListing getDataprivacyMaskingrules(GetDataprivacyMaskingrulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MaskingRuleListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MaskingRuleListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve the list of masking rules.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MaskingRuleListing> getDataprivacyMaskingrules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MaskingRuleListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MaskingRuleListing> response = (ApiResponse<MaskingRuleListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MaskingRuleListing> response = (ApiResponse<MaskingRuleListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update information about a masking rule.
   * 
   * @param ruleId ruleId (required)
   * @param body  (optional)
   * @return MaskingRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MaskingRule patchDataprivacyMaskingrule(String ruleId, MaskingRule body) throws IOException, ApiException {
    return  patchDataprivacyMaskingrule(createPatchDataprivacyMaskingruleRequest(ruleId, body));
  }

  /**
   * Update information about a masking rule.
   * 
   * @param ruleId ruleId (required)
   * @param body  (optional)
   * @return MaskingRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MaskingRule> patchDataprivacyMaskingruleWithHttpInfo(String ruleId, MaskingRule body) throws IOException {
    return patchDataprivacyMaskingrule(createPatchDataprivacyMaskingruleRequest(ruleId, body).withHttpInfo());
  }

  private PatchDataprivacyMaskingruleRequest createPatchDataprivacyMaskingruleRequest(String ruleId, MaskingRule body) {
    return PatchDataprivacyMaskingruleRequest.builder()
            .withRuleId(ruleId)

            .withBody(body)

            .build();
  }

  /**
   * Update information about a masking rule.
   * 
   * @param request The request object
   * @return MaskingRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MaskingRule patchDataprivacyMaskingrule(PatchDataprivacyMaskingruleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MaskingRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MaskingRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update information about a masking rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MaskingRule> patchDataprivacyMaskingrule(ApiRequest<MaskingRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MaskingRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MaskingRule> response = (ApiResponse<MaskingRule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MaskingRule> response = (ApiResponse<MaskingRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new masking rule resource.
   * 
   * @param body Details for creating masking rule resource (required)
   * @return MaskingRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MaskingRule postDataprivacyMaskingrules(MaskingRule body) throws IOException, ApiException {
    return  postDataprivacyMaskingrules(createPostDataprivacyMaskingrulesRequest(body));
  }

  /**
   * Create a new masking rule resource.
   * 
   * @param body Details for creating masking rule resource (required)
   * @return MaskingRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MaskingRule> postDataprivacyMaskingrulesWithHttpInfo(MaskingRule body) throws IOException {
    return postDataprivacyMaskingrules(createPostDataprivacyMaskingrulesRequest(body).withHttpInfo());
  }

  private PostDataprivacyMaskingrulesRequest createPostDataprivacyMaskingrulesRequest(MaskingRule body) {
    return PostDataprivacyMaskingrulesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new masking rule resource.
   * 
   * @param request The request object
   * @return MaskingRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MaskingRule postDataprivacyMaskingrules(PostDataprivacyMaskingrulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MaskingRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MaskingRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new masking rule resource.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MaskingRule> postDataprivacyMaskingrules(ApiRequest<MaskingRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MaskingRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MaskingRule> response = (ApiResponse<MaskingRule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MaskingRule> response = (ApiResponse<MaskingRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Validate masking before creating.
   * 
   * @param body Text to be masked (required)
   * @return MaskingRuleValidateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MaskingRuleValidateResponse postDataprivacyMaskingrulesValidate(MaskingRuleValidateRequest body) throws IOException, ApiException {
    return  postDataprivacyMaskingrulesValidate(createPostDataprivacyMaskingrulesValidateRequest(body));
  }

  /**
   * Validate masking before creating.
   * 
   * @param body Text to be masked (required)
   * @return MaskingRuleValidateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MaskingRuleValidateResponse> postDataprivacyMaskingrulesValidateWithHttpInfo(MaskingRuleValidateRequest body) throws IOException {
    return postDataprivacyMaskingrulesValidate(createPostDataprivacyMaskingrulesValidateRequest(body).withHttpInfo());
  }

  private PostDataprivacyMaskingrulesValidateRequest createPostDataprivacyMaskingrulesValidateRequest(MaskingRuleValidateRequest body) {
    return PostDataprivacyMaskingrulesValidateRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Validate masking before creating.
   * 
   * @param request The request object
   * @return MaskingRuleValidateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MaskingRuleValidateResponse postDataprivacyMaskingrulesValidate(PostDataprivacyMaskingrulesValidateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MaskingRuleValidateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MaskingRuleValidateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Validate masking before creating.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MaskingRuleValidateResponse> postDataprivacyMaskingrulesValidate(ApiRequest<MaskingRuleValidateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MaskingRuleValidateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MaskingRuleValidateResponse> response = (ApiResponse<MaskingRuleValidateResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MaskingRuleValidateResponse> response = (ApiResponse<MaskingRuleValidateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
