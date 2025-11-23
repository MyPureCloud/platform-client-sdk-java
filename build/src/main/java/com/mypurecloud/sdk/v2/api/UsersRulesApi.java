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
import com.mypurecloud.sdk.v2.model.UsersRulesCreateRuleRequest;
import com.mypurecloud.sdk.v2.model.UsersRulesDependent;
import com.mypurecloud.sdk.v2.model.UsersRulesDependentList;
import com.mypurecloud.sdk.v2.model.UsersRulesQueryResponse;
import com.mypurecloud.sdk.v2.model.UsersRulesQueryRuleRequest;
import com.mypurecloud.sdk.v2.model.UsersRulesRule;
import com.mypurecloud.sdk.v2.model.UsersRulesRuleList;
import com.mypurecloud.sdk.v2.model.UsersRulesRuleSettings;
import com.mypurecloud.sdk.v2.model.UsersRulesUpdateRuleRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteUsersRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersRuleDependentTypeIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersRuleDependentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersRulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersRulesSettingRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUsersRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersRulesQueryRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersRulesApi {
  private final ApiClient pcapiClient;

  public UsersRulesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersRulesApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete an existing users rule
   * 
   * deleteUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param ruleId The id of the rule (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUsersRule(String ruleId) throws IOException, ApiException {
     deleteUsersRule(createDeleteUsersRuleRequest(ruleId));
  }

  /**
   * Delete an existing users rule
   * 
   * deleteUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param ruleId The id of the rule (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUsersRuleWithHttpInfo(String ruleId) throws IOException {
    return deleteUsersRule(createDeleteUsersRuleRequest(ruleId).withHttpInfo());
  }

  private DeleteUsersRuleRequest createDeleteUsersRuleRequest(String ruleId) {
    return DeleteUsersRuleRequest.builder()
            .withRuleId(ruleId)

            .build();
  }

  /**
   * Delete an existing users rule
   * 
   * deleteUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUsersRule(DeleteUsersRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an existing users rule
   * 
   * deleteUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUsersRule(ApiRequest<Void> request) throws IOException {
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
   * Get a users rule
   * 
   * getUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param ruleId The ID of the rule to retrieve (required)
   * @return UsersRulesRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesRule getUsersRule(String ruleId) throws IOException, ApiException {
    return  getUsersRule(createGetUsersRuleRequest(ruleId));
  }

  /**
   * Get a users rule
   * 
   * getUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param ruleId The ID of the rule to retrieve (required)
   * @return UsersRulesRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesRule> getUsersRuleWithHttpInfo(String ruleId) throws IOException {
    return getUsersRule(createGetUsersRuleRequest(ruleId).withHttpInfo());
  }

  private GetUsersRuleRequest createGetUsersRuleRequest(String ruleId) {
    return GetUsersRuleRequest.builder()
            .withRuleId(ruleId)

            .build();
  }

  /**
   * Get a users rule
   * 
   * getUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UsersRulesRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesRule getUsersRule(GetUsersRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersRulesRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersRulesRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a users rule
   * 
   * getUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesRule> getUsersRule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersRulesRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesRule> response = (ApiResponse<UsersRulesRule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesRule> response = (ApiResponse<UsersRulesRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get dependent of a users rule
   * 
   * getUsersRuleDependentTypeId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param ruleId The ID of the rule for which to retrieve dependents (required)
   * @param ruleType The type of the dependent (required)
   * @param typeId The type ID of the dependent (required)
   * @return UsersRulesDependent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesDependent getUsersRuleDependentTypeId(String ruleId, String ruleType, String typeId) throws IOException, ApiException {
    return  getUsersRuleDependentTypeId(createGetUsersRuleDependentTypeIdRequest(ruleId, ruleType, typeId));
  }

  /**
   * Get dependent of a users rule
   * 
   * getUsersRuleDependentTypeId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param ruleId The ID of the rule for which to retrieve dependents (required)
   * @param ruleType The type of the dependent (required)
   * @param typeId The type ID of the dependent (required)
   * @return UsersRulesDependent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesDependent> getUsersRuleDependentTypeIdWithHttpInfo(String ruleId, String ruleType, String typeId) throws IOException {
    return getUsersRuleDependentTypeId(createGetUsersRuleDependentTypeIdRequest(ruleId, ruleType, typeId).withHttpInfo());
  }

  private GetUsersRuleDependentTypeIdRequest createGetUsersRuleDependentTypeIdRequest(String ruleId, String ruleType, String typeId) {
    return GetUsersRuleDependentTypeIdRequest.builder()
            .withRuleId(ruleId)

            .withRuleType(ruleType)

            .withTypeId(typeId)

            .build();
  }

  /**
   * Get dependent of a users rule
   * 
   * getUsersRuleDependentTypeId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UsersRulesDependent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesDependent getUsersRuleDependentTypeId(GetUsersRuleDependentTypeIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersRulesDependent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersRulesDependent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get dependent of a users rule
   * 
   * getUsersRuleDependentTypeId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesDependent> getUsersRuleDependentTypeId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersRulesDependent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesDependent> response = (ApiResponse<UsersRulesDependent>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesDependent> response = (ApiResponse<UsersRulesDependent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get dependents for a users rule
   * 
   * getUsersRuleDependents is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param ruleId The ID of the rule for which to retrieve dependents (required)
   * @param pageSize Number of results per page (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order for dependents (by last run date, then created date) (optional, default to descending)
   * @return UsersRulesDependentList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesDependentList getUsersRuleDependents(String ruleId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return  getUsersRuleDependents(createGetUsersRuleDependentsRequest(ruleId, pageSize, pageNumber, sortOrder));
  }

  /**
   * Get dependents for a users rule
   * 
   * getUsersRuleDependents is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param ruleId The ID of the rule for which to retrieve dependents (required)
   * @param pageSize Number of results per page (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order for dependents (by last run date, then created date) (optional, default to descending)
   * @return UsersRulesDependentList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesDependentList> getUsersRuleDependentsWithHttpInfo(String ruleId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException {
    return getUsersRuleDependents(createGetUsersRuleDependentsRequest(ruleId, pageSize, pageNumber, sortOrder).withHttpInfo());
  }

  private GetUsersRuleDependentsRequest createGetUsersRuleDependentsRequest(String ruleId, Integer pageSize, Integer pageNumber, String sortOrder) {
    return GetUsersRuleDependentsRequest.builder()
            .withRuleId(ruleId)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get dependents for a users rule
   * 
   * getUsersRuleDependents is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UsersRulesDependentList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesDependentList getUsersRuleDependents(GetUsersRuleDependentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersRulesDependentList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersRulesDependentList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get dependents for a users rule
   * 
   * getUsersRuleDependents is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesDependentList> getUsersRuleDependents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersRulesDependentList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesDependentList> response = (ApiResponse<UsersRulesDependentList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesDependentList> response = (ApiResponse<UsersRulesDependentList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of users rules
   * 
   * getUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param types The types of the rule (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Number of results per page (optional, default to 25)
   * @param expand Fields to expand in response (optional)
   * @param searchTerm a search term for finding a rule by name (optional)
   * @param sortOrder sort rules by name, ascending, descending (optional, default to ascending)
   * @return UsersRulesRuleList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesRuleList getUsersRules(List<String> types, Integer pageNumber, Integer pageSize, List<String> expand, String searchTerm, String sortOrder) throws IOException, ApiException {
    return  getUsersRules(createGetUsersRulesRequest(types, pageNumber, pageSize, expand, searchTerm, sortOrder));
  }

  /**
   * Get the list of users rules
   * 
   * getUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param types The types of the rule (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Number of results per page (optional, default to 25)
   * @param expand Fields to expand in response (optional)
   * @param searchTerm a search term for finding a rule by name (optional)
   * @param sortOrder sort rules by name, ascending, descending (optional, default to ascending)
   * @return UsersRulesRuleList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesRuleList> getUsersRulesWithHttpInfo(List<String> types, Integer pageNumber, Integer pageSize, List<String> expand, String searchTerm, String sortOrder) throws IOException {
    return getUsersRules(createGetUsersRulesRequest(types, pageNumber, pageSize, expand, searchTerm, sortOrder).withHttpInfo());
  }

  private GetUsersRulesRequest createGetUsersRulesRequest(List<String> types, Integer pageNumber, Integer pageSize, List<String> expand, String searchTerm, String sortOrder) {
    return GetUsersRulesRequest.builder()
            .withTypes(types)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withExpand(expand)

            .withSearchTerm(searchTerm)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get the list of users rules
   * 
   * getUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UsersRulesRuleList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesRuleList getUsersRules(GetUsersRulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersRulesRuleList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersRulesRuleList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of users rules
   * 
   * getUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesRuleList> getUsersRules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersRulesRuleList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesRuleList> response = (ApiResponse<UsersRulesRuleList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesRuleList> response = (ApiResponse<UsersRulesRuleList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the settings for a specific users rule type
   * 
   * getUsersRulesSetting is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param ruleType The type of the rule (required)
   * @return UsersRulesRuleSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesRuleSettings getUsersRulesSetting(String ruleType) throws IOException, ApiException {
    return  getUsersRulesSetting(createGetUsersRulesSettingRequest(ruleType));
  }

  /**
   * Get the settings for a specific users rule type
   * 
   * getUsersRulesSetting is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param ruleType The type of the rule (required)
   * @return UsersRulesRuleSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesRuleSettings> getUsersRulesSettingWithHttpInfo(String ruleType) throws IOException {
    return getUsersRulesSetting(createGetUsersRulesSettingRequest(ruleType).withHttpInfo());
  }

  private GetUsersRulesSettingRequest createGetUsersRulesSettingRequest(String ruleType) {
    return GetUsersRulesSettingRequest.builder()
            .withRuleType(ruleType)

            .build();
  }

  /**
   * Get the settings for a specific users rule type
   * 
   * getUsersRulesSetting is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UsersRulesRuleSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesRuleSettings getUsersRulesSetting(GetUsersRulesSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersRulesRuleSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersRulesRuleSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the settings for a specific users rule type
   * 
   * getUsersRulesSetting is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesRuleSettings> getUsersRulesSetting(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersRulesRuleSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesRuleSettings> response = (ApiResponse<UsersRulesRuleSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesRuleSettings> response = (ApiResponse<UsersRulesRuleSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an existing users rule
   * This will update an existing users rule with the specified fields.
   * patchUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param ruleId The ID of the rule to update (required)
   * @param body updateRuleRequest (required)
   * @return UsersRulesRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesRule patchUsersRule(String ruleId, UsersRulesUpdateRuleRequest body) throws IOException, ApiException {
    return  patchUsersRule(createPatchUsersRuleRequest(ruleId, body));
  }

  /**
   * Update an existing users rule
   * This will update an existing users rule with the specified fields.
   * patchUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param ruleId The ID of the rule to update (required)
   * @param body updateRuleRequest (required)
   * @return UsersRulesRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesRule> patchUsersRuleWithHttpInfo(String ruleId, UsersRulesUpdateRuleRequest body) throws IOException {
    return patchUsersRule(createPatchUsersRuleRequest(ruleId, body).withHttpInfo());
  }

  private PatchUsersRuleRequest createPatchUsersRuleRequest(String ruleId, UsersRulesUpdateRuleRequest body) {
    return PatchUsersRuleRequest.builder()
            .withRuleId(ruleId)

            .withBody(body)

            .build();
  }

  /**
   * Update an existing users rule
   * This will update an existing users rule with the specified fields.
   * patchUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UsersRulesRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesRule patchUsersRule(PatchUsersRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersRulesRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersRulesRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an existing users rule
   * This will update an existing users rule with the specified fields.
   * patchUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesRule> patchUsersRule(ApiRequest<UsersRulesUpdateRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersRulesRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesRule> response = (ApiResponse<UsersRulesRule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesRule> response = (ApiResponse<UsersRulesRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new rule
   * This will create a new rule with the specified fields.
   * postUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body usersRulesCreateRuleRequest (required)
   * @return UsersRulesRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesRule postUsersRules(UsersRulesCreateRuleRequest body) throws IOException, ApiException {
    return  postUsersRules(createPostUsersRulesRequest(body));
  }

  /**
   * Create a new rule
   * This will create a new rule with the specified fields.
   * postUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body usersRulesCreateRuleRequest (required)
   * @return UsersRulesRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesRule> postUsersRulesWithHttpInfo(UsersRulesCreateRuleRequest body) throws IOException {
    return postUsersRules(createPostUsersRulesRequest(body).withHttpInfo());
  }

  private PostUsersRulesRequest createPostUsersRulesRequest(UsersRulesCreateRuleRequest body) {
    return PostUsersRulesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new rule
   * This will create a new rule with the specified fields.
   * postUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UsersRulesRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesRule postUsersRules(PostUsersRulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersRulesRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersRulesRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new rule
   * This will create a new rule with the specified fields.
   * postUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesRule> postUsersRules(ApiRequest<UsersRulesCreateRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersRulesRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesRule> response = (ApiResponse<UsersRulesRule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesRule> response = (ApiResponse<UsersRulesRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query the result of a users rule
   * This will query the result of a rule.
   * postUsersRulesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body usersRulesQueryRuleRequest (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Number of results per page (optional, default to 25)
   * @return UsersRulesQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesQueryResponse postUsersRulesQuery(UsersRulesQueryRuleRequest body, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  postUsersRulesQuery(createPostUsersRulesQueryRequest(body, pageNumber, pageSize));
  }

  /**
   * Query the result of a users rule
   * This will query the result of a rule.
   * postUsersRulesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body usersRulesQueryRuleRequest (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Number of results per page (optional, default to 25)
   * @return UsersRulesQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesQueryResponse> postUsersRulesQueryWithHttpInfo(UsersRulesQueryRuleRequest body, Integer pageNumber, Integer pageSize) throws IOException {
    return postUsersRulesQuery(createPostUsersRulesQueryRequest(body, pageNumber, pageSize).withHttpInfo());
  }

  private PostUsersRulesQueryRequest createPostUsersRulesQueryRequest(UsersRulesQueryRuleRequest body, Integer pageNumber, Integer pageSize) {
    return PostUsersRulesQueryRequest.builder()
            .withBody(body)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Query the result of a users rule
   * This will query the result of a rule.
   * postUsersRulesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UsersRulesQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersRulesQueryResponse postUsersRulesQuery(PostUsersRulesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersRulesQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersRulesQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query the result of a users rule
   * This will query the result of a rule.
   * postUsersRulesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersRulesQueryResponse> postUsersRulesQuery(ApiRequest<UsersRulesQueryRuleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersRulesQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesQueryResponse> response = (ApiResponse<UsersRulesQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UsersRulesQueryResponse> response = (ApiResponse<UsersRulesQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
