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
import com.mypurecloud.sdk.v2.model.Team;
import com.mypurecloud.sdk.v2.model.TeamEntityListing;
import com.mypurecloud.sdk.v2.model.TeamSearchRequest;
import com.mypurecloud.sdk.v2.model.TeamsSearchResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteTeamRequest;
import com.mypurecloud.sdk.v2.api.request.GetTeamRequest;
import com.mypurecloud.sdk.v2.api.request.GetTeamsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTeamRequest;
import com.mypurecloud.sdk.v2.api.request.PostTeamsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTeamsSearchRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamsApi {
  private final ApiClient pcapiClient;

  public TeamsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TeamsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete team
   * 
   * @param teamId Team ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTeam(String teamId) throws IOException, ApiException {
     deleteTeam(createDeleteTeamRequest(teamId));
  }

  /**
   * Delete team
   * 
   * @param teamId Team ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTeamWithHttpInfo(String teamId) throws IOException {
    return deleteTeam(createDeleteTeamRequest(teamId).withHttpInfo());
  }

  private DeleteTeamRequest createDeleteTeamRequest(String teamId) {
    return DeleteTeamRequest.builder()
            .withTeamId(teamId)

            .build();
  }

  /**
   * Delete team
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTeam(DeleteTeamRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete team
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTeam(ApiRequest<Void> request) throws IOException {
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
   * Get team
   * 
   * @param teamId Team ID (required)
   * @return Team
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Team getTeam(String teamId) throws IOException, ApiException {
    return  getTeam(createGetTeamRequest(teamId));
  }

  /**
   * Get team
   * 
   * @param teamId Team ID (required)
   * @return Team
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Team> getTeamWithHttpInfo(String teamId) throws IOException {
    return getTeam(createGetTeamRequest(teamId).withHttpInfo());
  }

  private GetTeamRequest createGetTeamRequest(String teamId) {
    return GetTeamRequest.builder()
            .withTeamId(teamId)

            .build();
  }

  /**
   * Get team
   * 
   * @param request The request object
   * @return Team
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Team getTeam(GetTeamRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Team> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Team>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get team
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Team> getTeam(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Team>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Team> response = (ApiResponse<Team>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Team> response = (ApiResponse<Team>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Team listing
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param name Return only teams whose names start with this value (case-insensitive matching) (optional)
   * @param after The cursor that points to the next item in the complete list of teams (optional)
   * @param before The cursor that points to the previous item in the complete list of teams (optional)
   * @param expand Expand the name on each user (optional)
   * @return TeamEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TeamEntityListing getTeams(Integer pageSize, String name, String after, String before, String expand) throws IOException, ApiException {
    return  getTeams(createGetTeamsRequest(pageSize, name, after, before, expand));
  }

  /**
   * Get Team listing
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param name Return only teams whose names start with this value (case-insensitive matching) (optional)
   * @param after The cursor that points to the next item in the complete list of teams (optional)
   * @param before The cursor that points to the previous item in the complete list of teams (optional)
   * @param expand Expand the name on each user (optional)
   * @return TeamEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TeamEntityListing> getTeamsWithHttpInfo(Integer pageSize, String name, String after, String before, String expand) throws IOException {
    return getTeams(createGetTeamsRequest(pageSize, name, after, before, expand).withHttpInfo());
  }

  private GetTeamsRequest createGetTeamsRequest(Integer pageSize, String name, String after, String before, String expand) {
    return GetTeamsRequest.builder()
            .withPageSize(pageSize)

            .withName(name)

            .withAfter(after)

            .withBefore(before)

            .withExpand(expand)

            .build();
  }

  /**
   * Get Team listing
   * 
   * @param request The request object
   * @return TeamEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TeamEntityListing getTeams(GetTeamsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TeamEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TeamEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Team listing
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TeamEntityListing> getTeams(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TeamEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TeamEntityListing> response = (ApiResponse<TeamEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TeamEntityListing> response = (ApiResponse<TeamEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update team
   * 
   * @param teamId Team ID (required)
   * @param body Team (required)
   * @return Team
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Team patchTeam(String teamId, Team body) throws IOException, ApiException {
    return  patchTeam(createPatchTeamRequest(teamId, body));
  }

  /**
   * Update team
   * 
   * @param teamId Team ID (required)
   * @param body Team (required)
   * @return Team
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Team> patchTeamWithHttpInfo(String teamId, Team body) throws IOException {
    return patchTeam(createPatchTeamRequest(teamId, body).withHttpInfo());
  }

  private PatchTeamRequest createPatchTeamRequest(String teamId, Team body) {
    return PatchTeamRequest.builder()
            .withTeamId(teamId)

            .withBody(body)

            .build();
  }

  /**
   * Update team
   * 
   * @param request The request object
   * @return Team
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Team patchTeam(PatchTeamRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Team> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Team>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update team
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Team> patchTeam(ApiRequest<Team> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Team>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Team> response = (ApiResponse<Team>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Team> response = (ApiResponse<Team>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a team
   * 
   * @param body Team (required)
   * @return Team
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Team postTeams(Team body) throws IOException, ApiException {
    return  postTeams(createPostTeamsRequest(body));
  }

  /**
   * Create a team
   * 
   * @param body Team (required)
   * @return Team
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Team> postTeamsWithHttpInfo(Team body) throws IOException {
    return postTeams(createPostTeamsRequest(body).withHttpInfo());
  }

  private PostTeamsRequest createPostTeamsRequest(Team body) {
    return PostTeamsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a team
   * 
   * @param request The request object
   * @return Team
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Team postTeams(PostTeamsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Team> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Team>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a team
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Team> postTeams(ApiRequest<Team> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Team>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Team> response = (ApiResponse<Team>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Team> response = (ApiResponse<Team>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @return TeamsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TeamsSearchResponse postTeamsSearch(TeamSearchRequest body) throws IOException, ApiException {
    return  postTeamsSearch(createPostTeamsSearchRequest(body));
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @return TeamsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TeamsSearchResponse> postTeamsSearchWithHttpInfo(TeamSearchRequest body) throws IOException {
    return postTeamsSearch(createPostTeamsSearchRequest(body).withHttpInfo());
  }

  private PostTeamsSearchRequest createPostTeamsSearchRequest(TeamSearchRequest body) {
    return PostTeamsSearchRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return TeamsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TeamsSearchResponse postTeamsSearch(PostTeamsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TeamsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TeamsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TeamsSearchResponse> postTeamsSearch(ApiRequest<TeamSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TeamsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TeamsSearchResponse> response = (ApiResponse<TeamsSearchResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TeamsSearchResponse> response = (ApiResponse<TeamsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
