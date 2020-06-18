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
import com.mypurecloud.sdk.v2.model.OAuthProviderEntityListing;
import com.mypurecloud.sdk.v2.model.ADFS;
import com.mypurecloud.sdk.v2.model.CustomerInteractionCenter;
import com.mypurecloud.sdk.v2.model.GenericSAML;
import com.mypurecloud.sdk.v2.model.GSuite;
import com.mypurecloud.sdk.v2.model.IdentityNow;
import com.mypurecloud.sdk.v2.model.Okta;
import com.mypurecloud.sdk.v2.model.OneLogin;
import com.mypurecloud.sdk.v2.model.PingIdentity;
import com.mypurecloud.sdk.v2.model.PureCloud;
import com.mypurecloud.sdk.v2.model.PureEngage;
import com.mypurecloud.sdk.v2.model.Salesforce;
import com.mypurecloud.sdk.v2.model.OAuthProvider;


import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersAdfsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersCicRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersGenericRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersGsuiteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersIdentitynowRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersOktaRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersOneloginRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersPingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersPureengageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersSalesforceRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersAdfsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersCicRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersGenericRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersGsuiteRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersIdentitynowRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersOktaRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersOneloginRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersPingRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersPureengageRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersSalesforceRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersAdfsRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersCicRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersGenericRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersGsuiteRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersIdentitynowRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersOktaRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersOneloginRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersPingRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersPureengageRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersSalesforceRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IdentityProviderApi {
  private final ApiClient pcapiClient;

  public IdentityProviderApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IdentityProviderApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete ADFS Identity Provider
   * 
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersAdfs() throws IOException, ApiException {
    return  deleteIdentityprovidersAdfs(createDeleteIdentityprovidersAdfsRequest());
  }

  /**
   * Delete ADFS Identity Provider
   * 
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersAdfsWithHttpInfo() throws IOException {
    return deleteIdentityprovidersAdfs(createDeleteIdentityprovidersAdfsRequest().withHttpInfo());
  }

  private DeleteIdentityprovidersAdfsRequest createDeleteIdentityprovidersAdfsRequest() {
    return DeleteIdentityprovidersAdfsRequest.builder()
            .build();
  }

  /**
   * Delete ADFS Identity Provider
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersAdfs(DeleteIdentityprovidersAdfsRequest request) throws IOException, ApiException {
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
   * Delete ADFS Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersAdfs(ApiRequest<Void> request) throws IOException {
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
   * Delete Customer Interaction Center (CIC) Identity Provider
   * 
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersCic() throws IOException, ApiException {
    return  deleteIdentityprovidersCic(createDeleteIdentityprovidersCicRequest());
  }

  /**
   * Delete Customer Interaction Center (CIC) Identity Provider
   * 
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersCicWithHttpInfo() throws IOException {
    return deleteIdentityprovidersCic(createDeleteIdentityprovidersCicRequest().withHttpInfo());
  }

  private DeleteIdentityprovidersCicRequest createDeleteIdentityprovidersCicRequest() {
    return DeleteIdentityprovidersCicRequest.builder()
            .build();
  }

  /**
   * Delete Customer Interaction Center (CIC) Identity Provider
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersCic(DeleteIdentityprovidersCicRequest request) throws IOException, ApiException {
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
   * Delete Customer Interaction Center (CIC) Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersCic(ApiRequest<Void> request) throws IOException {
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
   * Delete Generic SAML Identity Provider
   * 
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersGeneric() throws IOException, ApiException {
    return  deleteIdentityprovidersGeneric(createDeleteIdentityprovidersGenericRequest());
  }

  /**
   * Delete Generic SAML Identity Provider
   * 
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersGenericWithHttpInfo() throws IOException {
    return deleteIdentityprovidersGeneric(createDeleteIdentityprovidersGenericRequest().withHttpInfo());
  }

  private DeleteIdentityprovidersGenericRequest createDeleteIdentityprovidersGenericRequest() {
    return DeleteIdentityprovidersGenericRequest.builder()
            .build();
  }

  /**
   * Delete Generic SAML Identity Provider
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersGeneric(DeleteIdentityprovidersGenericRequest request) throws IOException, ApiException {
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
   * Delete Generic SAML Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersGeneric(ApiRequest<Void> request) throws IOException {
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
   * Delete G Suite Identity Provider
   * 
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersGsuite() throws IOException, ApiException {
    return  deleteIdentityprovidersGsuite(createDeleteIdentityprovidersGsuiteRequest());
  }

  /**
   * Delete G Suite Identity Provider
   * 
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersGsuiteWithHttpInfo() throws IOException {
    return deleteIdentityprovidersGsuite(createDeleteIdentityprovidersGsuiteRequest().withHttpInfo());
  }

  private DeleteIdentityprovidersGsuiteRequest createDeleteIdentityprovidersGsuiteRequest() {
    return DeleteIdentityprovidersGsuiteRequest.builder()
            .build();
  }

  /**
   * Delete G Suite Identity Provider
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersGsuite(DeleteIdentityprovidersGsuiteRequest request) throws IOException, ApiException {
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
   * Delete G Suite Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersGsuite(ApiRequest<Void> request) throws IOException {
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
   * Delete IdentityNow Provider
   * 
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersIdentitynow() throws IOException, ApiException {
    return  deleteIdentityprovidersIdentitynow(createDeleteIdentityprovidersIdentitynowRequest());
  }

  /**
   * Delete IdentityNow Provider
   * 
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersIdentitynowWithHttpInfo() throws IOException {
    return deleteIdentityprovidersIdentitynow(createDeleteIdentityprovidersIdentitynowRequest().withHttpInfo());
  }

  private DeleteIdentityprovidersIdentitynowRequest createDeleteIdentityprovidersIdentitynowRequest() {
    return DeleteIdentityprovidersIdentitynowRequest.builder()
            .build();
  }

  /**
   * Delete IdentityNow Provider
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersIdentitynow(DeleteIdentityprovidersIdentitynowRequest request) throws IOException, ApiException {
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
   * Delete IdentityNow Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersIdentitynow(ApiRequest<Void> request) throws IOException {
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
   * Delete Okta Identity Provider
   * 
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersOkta() throws IOException, ApiException {
    return  deleteIdentityprovidersOkta(createDeleteIdentityprovidersOktaRequest());
  }

  /**
   * Delete Okta Identity Provider
   * 
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersOktaWithHttpInfo() throws IOException {
    return deleteIdentityprovidersOkta(createDeleteIdentityprovidersOktaRequest().withHttpInfo());
  }

  private DeleteIdentityprovidersOktaRequest createDeleteIdentityprovidersOktaRequest() {
    return DeleteIdentityprovidersOktaRequest.builder()
            .build();
  }

  /**
   * Delete Okta Identity Provider
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersOkta(DeleteIdentityprovidersOktaRequest request) throws IOException, ApiException {
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
   * Delete Okta Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersOkta(ApiRequest<Void> request) throws IOException {
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
   * Delete OneLogin Identity Provider
   * 
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersOnelogin() throws IOException, ApiException {
    return  deleteIdentityprovidersOnelogin(createDeleteIdentityprovidersOneloginRequest());
  }

  /**
   * Delete OneLogin Identity Provider
   * 
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersOneloginWithHttpInfo() throws IOException {
    return deleteIdentityprovidersOnelogin(createDeleteIdentityprovidersOneloginRequest().withHttpInfo());
  }

  private DeleteIdentityprovidersOneloginRequest createDeleteIdentityprovidersOneloginRequest() {
    return DeleteIdentityprovidersOneloginRequest.builder()
            .build();
  }

  /**
   * Delete OneLogin Identity Provider
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersOnelogin(DeleteIdentityprovidersOneloginRequest request) throws IOException, ApiException {
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
   * Delete OneLogin Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersOnelogin(ApiRequest<Void> request) throws IOException {
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
   * Delete Ping Identity Provider
   * 
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersPing() throws IOException, ApiException {
    return  deleteIdentityprovidersPing(createDeleteIdentityprovidersPingRequest());
  }

  /**
   * Delete Ping Identity Provider
   * 
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersPingWithHttpInfo() throws IOException {
    return deleteIdentityprovidersPing(createDeleteIdentityprovidersPingRequest().withHttpInfo());
  }

  private DeleteIdentityprovidersPingRequest createDeleteIdentityprovidersPingRequest() {
    return DeleteIdentityprovidersPingRequest.builder()
            .build();
  }

  /**
   * Delete Ping Identity Provider
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersPing(DeleteIdentityprovidersPingRequest request) throws IOException, ApiException {
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
   * Delete Ping Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersPing(ApiRequest<Void> request) throws IOException {
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
   * Delete PureCloud Identity Provider
   * 
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersPurecloud() throws IOException, ApiException {
    return  deleteIdentityprovidersPurecloud(createDeleteIdentityprovidersPurecloudRequest());
  }

  /**
   * Delete PureCloud Identity Provider
   * 
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersPurecloudWithHttpInfo() throws IOException {
    return deleteIdentityprovidersPurecloud(createDeleteIdentityprovidersPurecloudRequest().withHttpInfo());
  }

  private DeleteIdentityprovidersPurecloudRequest createDeleteIdentityprovidersPurecloudRequest() {
    return DeleteIdentityprovidersPurecloudRequest.builder()
            .build();
  }

  /**
   * Delete PureCloud Identity Provider
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersPurecloud(DeleteIdentityprovidersPurecloudRequest request) throws IOException, ApiException {
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
   * Delete PureCloud Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersPurecloud(ApiRequest<Void> request) throws IOException {
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
   * Delete PureEngage Identity Provider
   * 
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersPureengage() throws IOException, ApiException {
    return  deleteIdentityprovidersPureengage(createDeleteIdentityprovidersPureengageRequest());
  }

  /**
   * Delete PureEngage Identity Provider
   * 
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersPureengageWithHttpInfo() throws IOException {
    return deleteIdentityprovidersPureengage(createDeleteIdentityprovidersPureengageRequest().withHttpInfo());
  }

  private DeleteIdentityprovidersPureengageRequest createDeleteIdentityprovidersPureengageRequest() {
    return DeleteIdentityprovidersPureengageRequest.builder()
            .build();
  }

  /**
   * Delete PureEngage Identity Provider
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersPureengage(DeleteIdentityprovidersPureengageRequest request) throws IOException, ApiException {
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
   * Delete PureEngage Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersPureengage(ApiRequest<Void> request) throws IOException {
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
   * Delete Salesforce Identity Provider
   * 
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersSalesforce() throws IOException, ApiException {
    return  deleteIdentityprovidersSalesforce(createDeleteIdentityprovidersSalesforceRequest());
  }

  /**
   * Delete Salesforce Identity Provider
   * 
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersSalesforceWithHttpInfo() throws IOException {
    return deleteIdentityprovidersSalesforce(createDeleteIdentityprovidersSalesforceRequest().withHttpInfo());
  }

  private DeleteIdentityprovidersSalesforceRequest createDeleteIdentityprovidersSalesforceRequest() {
    return DeleteIdentityprovidersSalesforceRequest.builder()
            .build();
  }

  /**
   * Delete Salesforce Identity Provider
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteIdentityprovidersSalesforce(DeleteIdentityprovidersSalesforceRequest request) throws IOException, ApiException {
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
   * Delete Salesforce Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteIdentityprovidersSalesforce(ApiRequest<Void> request) throws IOException {
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
   * The list of identity providers
   * 
   * @return OAuthProviderEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProviderEntityListing getIdentityproviders() throws IOException, ApiException {
    return  getIdentityproviders(createGetIdentityprovidersRequest());
  }

  /**
   * The list of identity providers
   * 
   * @return OAuthProviderEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProviderEntityListing> getIdentityprovidersWithHttpInfo() throws IOException {
    return getIdentityproviders(createGetIdentityprovidersRequest().withHttpInfo());
  }

  private GetIdentityprovidersRequest createGetIdentityprovidersRequest() {
    return GetIdentityprovidersRequest.builder()
            .build();
  }

  /**
   * The list of identity providers
   * 
   * @param request The request object
   * @return OAuthProviderEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProviderEntityListing getIdentityproviders(GetIdentityprovidersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthProviderEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthProviderEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The list of identity providers
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProviderEntityListing> getIdentityproviders(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthProviderEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProviderEntityListing> response = (ApiResponse<OAuthProviderEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProviderEntityListing> response = (ApiResponse<OAuthProviderEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get ADFS Identity Provider
   * 
   * @return ADFS
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ADFS getIdentityprovidersAdfs() throws IOException, ApiException {
    return  getIdentityprovidersAdfs(createGetIdentityprovidersAdfsRequest());
  }

  /**
   * Get ADFS Identity Provider
   * 
   * @return ADFS
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ADFS> getIdentityprovidersAdfsWithHttpInfo() throws IOException {
    return getIdentityprovidersAdfs(createGetIdentityprovidersAdfsRequest().withHttpInfo());
  }

  private GetIdentityprovidersAdfsRequest createGetIdentityprovidersAdfsRequest() {
    return GetIdentityprovidersAdfsRequest.builder()
            .build();
  }

  /**
   * Get ADFS Identity Provider
   * 
   * @param request The request object
   * @return ADFS
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ADFS getIdentityprovidersAdfs(GetIdentityprovidersAdfsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ADFS> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ADFS>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get ADFS Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ADFS> getIdentityprovidersAdfs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ADFS>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ADFS> response = (ApiResponse<ADFS>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ADFS> response = (ApiResponse<ADFS>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Customer Interaction Center (CIC) Identity Provider
   * 
   * @return CustomerInteractionCenter
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerInteractionCenter getIdentityprovidersCic() throws IOException, ApiException {
    return  getIdentityprovidersCic(createGetIdentityprovidersCicRequest());
  }

  /**
   * Get Customer Interaction Center (CIC) Identity Provider
   * 
   * @return CustomerInteractionCenter
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerInteractionCenter> getIdentityprovidersCicWithHttpInfo() throws IOException {
    return getIdentityprovidersCic(createGetIdentityprovidersCicRequest().withHttpInfo());
  }

  private GetIdentityprovidersCicRequest createGetIdentityprovidersCicRequest() {
    return GetIdentityprovidersCicRequest.builder()
            .build();
  }

  /**
   * Get Customer Interaction Center (CIC) Identity Provider
   * 
   * @param request The request object
   * @return CustomerInteractionCenter
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CustomerInteractionCenter getIdentityprovidersCic(GetIdentityprovidersCicRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CustomerInteractionCenter> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CustomerInteractionCenter>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Customer Interaction Center (CIC) Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CustomerInteractionCenter> getIdentityprovidersCic(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CustomerInteractionCenter>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CustomerInteractionCenter> response = (ApiResponse<CustomerInteractionCenter>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CustomerInteractionCenter> response = (ApiResponse<CustomerInteractionCenter>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Generic SAML Identity Provider
   * 
   * @return GenericSAML
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GenericSAML getIdentityprovidersGeneric() throws IOException, ApiException {
    return  getIdentityprovidersGeneric(createGetIdentityprovidersGenericRequest());
  }

  /**
   * Get Generic SAML Identity Provider
   * 
   * @return GenericSAML
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GenericSAML> getIdentityprovidersGenericWithHttpInfo() throws IOException {
    return getIdentityprovidersGeneric(createGetIdentityprovidersGenericRequest().withHttpInfo());
  }

  private GetIdentityprovidersGenericRequest createGetIdentityprovidersGenericRequest() {
    return GetIdentityprovidersGenericRequest.builder()
            .build();
  }

  /**
   * Get Generic SAML Identity Provider
   * 
   * @param request The request object
   * @return GenericSAML
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GenericSAML getIdentityprovidersGeneric(GetIdentityprovidersGenericRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GenericSAML> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GenericSAML>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Generic SAML Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GenericSAML> getIdentityprovidersGeneric(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GenericSAML>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GenericSAML> response = (ApiResponse<GenericSAML>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GenericSAML> response = (ApiResponse<GenericSAML>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get G Suite Identity Provider
   * 
   * @return GSuite
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GSuite getIdentityprovidersGsuite() throws IOException, ApiException {
    return  getIdentityprovidersGsuite(createGetIdentityprovidersGsuiteRequest());
  }

  /**
   * Get G Suite Identity Provider
   * 
   * @return GSuite
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GSuite> getIdentityprovidersGsuiteWithHttpInfo() throws IOException {
    return getIdentityprovidersGsuite(createGetIdentityprovidersGsuiteRequest().withHttpInfo());
  }

  private GetIdentityprovidersGsuiteRequest createGetIdentityprovidersGsuiteRequest() {
    return GetIdentityprovidersGsuiteRequest.builder()
            .build();
  }

  /**
   * Get G Suite Identity Provider
   * 
   * @param request The request object
   * @return GSuite
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GSuite getIdentityprovidersGsuite(GetIdentityprovidersGsuiteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GSuite> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GSuite>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get G Suite Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GSuite> getIdentityprovidersGsuite(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GSuite>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GSuite> response = (ApiResponse<GSuite>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GSuite> response = (ApiResponse<GSuite>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get IdentityNow Provider
   * 
   * @return IdentityNow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityNow getIdentityprovidersIdentitynow() throws IOException, ApiException {
    return  getIdentityprovidersIdentitynow(createGetIdentityprovidersIdentitynowRequest());
  }

  /**
   * Get IdentityNow Provider
   * 
   * @return IdentityNow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityNow> getIdentityprovidersIdentitynowWithHttpInfo() throws IOException {
    return getIdentityprovidersIdentitynow(createGetIdentityprovidersIdentitynowRequest().withHttpInfo());
  }

  private GetIdentityprovidersIdentitynowRequest createGetIdentityprovidersIdentitynowRequest() {
    return GetIdentityprovidersIdentitynowRequest.builder()
            .build();
  }

  /**
   * Get IdentityNow Provider
   * 
   * @param request The request object
   * @return IdentityNow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityNow getIdentityprovidersIdentitynow(GetIdentityprovidersIdentitynowRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IdentityNow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IdentityNow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get IdentityNow Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityNow> getIdentityprovidersIdentitynow(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IdentityNow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IdentityNow> response = (ApiResponse<IdentityNow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IdentityNow> response = (ApiResponse<IdentityNow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Okta Identity Provider
   * 
   * @return Okta
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Okta getIdentityprovidersOkta() throws IOException, ApiException {
    return  getIdentityprovidersOkta(createGetIdentityprovidersOktaRequest());
  }

  /**
   * Get Okta Identity Provider
   * 
   * @return Okta
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Okta> getIdentityprovidersOktaWithHttpInfo() throws IOException {
    return getIdentityprovidersOkta(createGetIdentityprovidersOktaRequest().withHttpInfo());
  }

  private GetIdentityprovidersOktaRequest createGetIdentityprovidersOktaRequest() {
    return GetIdentityprovidersOktaRequest.builder()
            .build();
  }

  /**
   * Get Okta Identity Provider
   * 
   * @param request The request object
   * @return Okta
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Okta getIdentityprovidersOkta(GetIdentityprovidersOktaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Okta> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Okta>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Okta Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Okta> getIdentityprovidersOkta(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Okta>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Okta> response = (ApiResponse<Okta>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Okta> response = (ApiResponse<Okta>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get OneLogin Identity Provider
   * 
   * @return OneLogin
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OneLogin getIdentityprovidersOnelogin() throws IOException, ApiException {
    return  getIdentityprovidersOnelogin(createGetIdentityprovidersOneloginRequest());
  }

  /**
   * Get OneLogin Identity Provider
   * 
   * @return OneLogin
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OneLogin> getIdentityprovidersOneloginWithHttpInfo() throws IOException {
    return getIdentityprovidersOnelogin(createGetIdentityprovidersOneloginRequest().withHttpInfo());
  }

  private GetIdentityprovidersOneloginRequest createGetIdentityprovidersOneloginRequest() {
    return GetIdentityprovidersOneloginRequest.builder()
            .build();
  }

  /**
   * Get OneLogin Identity Provider
   * 
   * @param request The request object
   * @return OneLogin
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OneLogin getIdentityprovidersOnelogin(GetIdentityprovidersOneloginRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OneLogin> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OneLogin>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get OneLogin Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OneLogin> getIdentityprovidersOnelogin(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OneLogin>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OneLogin> response = (ApiResponse<OneLogin>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OneLogin> response = (ApiResponse<OneLogin>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Ping Identity Provider
   * 
   * @return PingIdentity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PingIdentity getIdentityprovidersPing() throws IOException, ApiException {
    return  getIdentityprovidersPing(createGetIdentityprovidersPingRequest());
  }

  /**
   * Get Ping Identity Provider
   * 
   * @return PingIdentity
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PingIdentity> getIdentityprovidersPingWithHttpInfo() throws IOException {
    return getIdentityprovidersPing(createGetIdentityprovidersPingRequest().withHttpInfo());
  }

  private GetIdentityprovidersPingRequest createGetIdentityprovidersPingRequest() {
    return GetIdentityprovidersPingRequest.builder()
            .build();
  }

  /**
   * Get Ping Identity Provider
   * 
   * @param request The request object
   * @return PingIdentity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PingIdentity getIdentityprovidersPing(GetIdentityprovidersPingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PingIdentity> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PingIdentity>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Ping Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PingIdentity> getIdentityprovidersPing(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PingIdentity>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PingIdentity> response = (ApiResponse<PingIdentity>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PingIdentity> response = (ApiResponse<PingIdentity>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get PureCloud Identity Provider
   * 
   * @return PureCloud
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PureCloud getIdentityprovidersPurecloud() throws IOException, ApiException {
    return  getIdentityprovidersPurecloud(createGetIdentityprovidersPurecloudRequest());
  }

  /**
   * Get PureCloud Identity Provider
   * 
   * @return PureCloud
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PureCloud> getIdentityprovidersPurecloudWithHttpInfo() throws IOException {
    return getIdentityprovidersPurecloud(createGetIdentityprovidersPurecloudRequest().withHttpInfo());
  }

  private GetIdentityprovidersPurecloudRequest createGetIdentityprovidersPurecloudRequest() {
    return GetIdentityprovidersPurecloudRequest.builder()
            .build();
  }

  /**
   * Get PureCloud Identity Provider
   * 
   * @param request The request object
   * @return PureCloud
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PureCloud getIdentityprovidersPurecloud(GetIdentityprovidersPurecloudRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PureCloud> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PureCloud>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get PureCloud Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PureCloud> getIdentityprovidersPurecloud(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PureCloud>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PureCloud> response = (ApiResponse<PureCloud>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PureCloud> response = (ApiResponse<PureCloud>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get PureEngage Identity Provider
   * 
   * @return PureEngage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PureEngage getIdentityprovidersPureengage() throws IOException, ApiException {
    return  getIdentityprovidersPureengage(createGetIdentityprovidersPureengageRequest());
  }

  /**
   * Get PureEngage Identity Provider
   * 
   * @return PureEngage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PureEngage> getIdentityprovidersPureengageWithHttpInfo() throws IOException {
    return getIdentityprovidersPureengage(createGetIdentityprovidersPureengageRequest().withHttpInfo());
  }

  private GetIdentityprovidersPureengageRequest createGetIdentityprovidersPureengageRequest() {
    return GetIdentityprovidersPureengageRequest.builder()
            .build();
  }

  /**
   * Get PureEngage Identity Provider
   * 
   * @param request The request object
   * @return PureEngage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PureEngage getIdentityprovidersPureengage(GetIdentityprovidersPureengageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PureEngage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PureEngage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get PureEngage Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PureEngage> getIdentityprovidersPureengage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PureEngage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PureEngage> response = (ApiResponse<PureEngage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PureEngage> response = (ApiResponse<PureEngage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Salesforce Identity Provider
   * 
   * @return Salesforce
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Salesforce getIdentityprovidersSalesforce() throws IOException, ApiException {
    return  getIdentityprovidersSalesforce(createGetIdentityprovidersSalesforceRequest());
  }

  /**
   * Get Salesforce Identity Provider
   * 
   * @return Salesforce
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Salesforce> getIdentityprovidersSalesforceWithHttpInfo() throws IOException {
    return getIdentityprovidersSalesforce(createGetIdentityprovidersSalesforceRequest().withHttpInfo());
  }

  private GetIdentityprovidersSalesforceRequest createGetIdentityprovidersSalesforceRequest() {
    return GetIdentityprovidersSalesforceRequest.builder()
            .build();
  }

  /**
   * Get Salesforce Identity Provider
   * 
   * @param request The request object
   * @return Salesforce
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Salesforce getIdentityprovidersSalesforce(GetIdentityprovidersSalesforceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Salesforce> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Salesforce>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Salesforce Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Salesforce> getIdentityprovidersSalesforce(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Salesforce>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Salesforce> response = (ApiResponse<Salesforce>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Salesforce> response = (ApiResponse<Salesforce>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update/Create ADFS Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersAdfs(ADFS body) throws IOException, ApiException {
    return  putIdentityprovidersAdfs(createPutIdentityprovidersAdfsRequest(body));
  }

  /**
   * Update/Create ADFS Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersAdfsWithHttpInfo(ADFS body) throws IOException {
    return putIdentityprovidersAdfs(createPutIdentityprovidersAdfsRequest(body).withHttpInfo());
  }

  private PutIdentityprovidersAdfsRequest createPutIdentityprovidersAdfsRequest(ADFS body) {
    return PutIdentityprovidersAdfsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update/Create ADFS Identity Provider
   * 
   * @param request The request object
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersAdfs(PutIdentityprovidersAdfsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthProvider> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update/Create ADFS Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersAdfs(ApiRequest<ADFS> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthProvider>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update/Create Customer Interaction Center (CIC) Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersCic(CustomerInteractionCenter body) throws IOException, ApiException {
    return  putIdentityprovidersCic(createPutIdentityprovidersCicRequest(body));
  }

  /**
   * Update/Create Customer Interaction Center (CIC) Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersCicWithHttpInfo(CustomerInteractionCenter body) throws IOException {
    return putIdentityprovidersCic(createPutIdentityprovidersCicRequest(body).withHttpInfo());
  }

  private PutIdentityprovidersCicRequest createPutIdentityprovidersCicRequest(CustomerInteractionCenter body) {
    return PutIdentityprovidersCicRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update/Create Customer Interaction Center (CIC) Identity Provider
   * 
   * @param request The request object
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersCic(PutIdentityprovidersCicRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthProvider> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update/Create Customer Interaction Center (CIC) Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersCic(ApiRequest<CustomerInteractionCenter> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthProvider>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update/Create Generic SAML Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersGeneric(GenericSAML body) throws IOException, ApiException {
    return  putIdentityprovidersGeneric(createPutIdentityprovidersGenericRequest(body));
  }

  /**
   * Update/Create Generic SAML Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersGenericWithHttpInfo(GenericSAML body) throws IOException {
    return putIdentityprovidersGeneric(createPutIdentityprovidersGenericRequest(body).withHttpInfo());
  }

  private PutIdentityprovidersGenericRequest createPutIdentityprovidersGenericRequest(GenericSAML body) {
    return PutIdentityprovidersGenericRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update/Create Generic SAML Identity Provider
   * 
   * @param request The request object
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersGeneric(PutIdentityprovidersGenericRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthProvider> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update/Create Generic SAML Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersGeneric(ApiRequest<GenericSAML> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthProvider>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update/Create G Suite Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersGsuite(GSuite body) throws IOException, ApiException {
    return  putIdentityprovidersGsuite(createPutIdentityprovidersGsuiteRequest(body));
  }

  /**
   * Update/Create G Suite Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersGsuiteWithHttpInfo(GSuite body) throws IOException {
    return putIdentityprovidersGsuite(createPutIdentityprovidersGsuiteRequest(body).withHttpInfo());
  }

  private PutIdentityprovidersGsuiteRequest createPutIdentityprovidersGsuiteRequest(GSuite body) {
    return PutIdentityprovidersGsuiteRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update/Create G Suite Identity Provider
   * 
   * @param request The request object
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersGsuite(PutIdentityprovidersGsuiteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthProvider> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update/Create G Suite Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersGsuite(ApiRequest<GSuite> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthProvider>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update/Create IdentityNow Provider
   * 
   * @param body Provider (required)
   * @return IdentityNow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityNow putIdentityprovidersIdentitynow(IdentityNow body) throws IOException, ApiException {
    return  putIdentityprovidersIdentitynow(createPutIdentityprovidersIdentitynowRequest(body));
  }

  /**
   * Update/Create IdentityNow Provider
   * 
   * @param body Provider (required)
   * @return IdentityNow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityNow> putIdentityprovidersIdentitynowWithHttpInfo(IdentityNow body) throws IOException {
    return putIdentityprovidersIdentitynow(createPutIdentityprovidersIdentitynowRequest(body).withHttpInfo());
  }

  private PutIdentityprovidersIdentitynowRequest createPutIdentityprovidersIdentitynowRequest(IdentityNow body) {
    return PutIdentityprovidersIdentitynowRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update/Create IdentityNow Provider
   * 
   * @param request The request object
   * @return IdentityNow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityNow putIdentityprovidersIdentitynow(PutIdentityprovidersIdentitynowRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IdentityNow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IdentityNow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update/Create IdentityNow Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityNow> putIdentityprovidersIdentitynow(ApiRequest<IdentityNow> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IdentityNow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IdentityNow> response = (ApiResponse<IdentityNow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IdentityNow> response = (ApiResponse<IdentityNow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update/Create Okta Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersOkta(Okta body) throws IOException, ApiException {
    return  putIdentityprovidersOkta(createPutIdentityprovidersOktaRequest(body));
  }

  /**
   * Update/Create Okta Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersOktaWithHttpInfo(Okta body) throws IOException {
    return putIdentityprovidersOkta(createPutIdentityprovidersOktaRequest(body).withHttpInfo());
  }

  private PutIdentityprovidersOktaRequest createPutIdentityprovidersOktaRequest(Okta body) {
    return PutIdentityprovidersOktaRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update/Create Okta Identity Provider
   * 
   * @param request The request object
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersOkta(PutIdentityprovidersOktaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthProvider> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update/Create Okta Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersOkta(ApiRequest<Okta> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthProvider>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update/Create OneLogin Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersOnelogin(OneLogin body) throws IOException, ApiException {
    return  putIdentityprovidersOnelogin(createPutIdentityprovidersOneloginRequest(body));
  }

  /**
   * Update/Create OneLogin Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersOneloginWithHttpInfo(OneLogin body) throws IOException {
    return putIdentityprovidersOnelogin(createPutIdentityprovidersOneloginRequest(body).withHttpInfo());
  }

  private PutIdentityprovidersOneloginRequest createPutIdentityprovidersOneloginRequest(OneLogin body) {
    return PutIdentityprovidersOneloginRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update/Create OneLogin Identity Provider
   * 
   * @param request The request object
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersOnelogin(PutIdentityprovidersOneloginRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthProvider> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update/Create OneLogin Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersOnelogin(ApiRequest<OneLogin> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthProvider>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update/Create Ping Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersPing(PingIdentity body) throws IOException, ApiException {
    return  putIdentityprovidersPing(createPutIdentityprovidersPingRequest(body));
  }

  /**
   * Update/Create Ping Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersPingWithHttpInfo(PingIdentity body) throws IOException {
    return putIdentityprovidersPing(createPutIdentityprovidersPingRequest(body).withHttpInfo());
  }

  private PutIdentityprovidersPingRequest createPutIdentityprovidersPingRequest(PingIdentity body) {
    return PutIdentityprovidersPingRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update/Create Ping Identity Provider
   * 
   * @param request The request object
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersPing(PutIdentityprovidersPingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthProvider> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update/Create Ping Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersPing(ApiRequest<PingIdentity> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthProvider>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update/Create PureCloud Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersPurecloud(PureCloud body) throws IOException, ApiException {
    return  putIdentityprovidersPurecloud(createPutIdentityprovidersPurecloudRequest(body));
  }

  /**
   * Update/Create PureCloud Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersPurecloudWithHttpInfo(PureCloud body) throws IOException {
    return putIdentityprovidersPurecloud(createPutIdentityprovidersPurecloudRequest(body).withHttpInfo());
  }

  private PutIdentityprovidersPurecloudRequest createPutIdentityprovidersPurecloudRequest(PureCloud body) {
    return PutIdentityprovidersPurecloudRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update/Create PureCloud Identity Provider
   * 
   * @param request The request object
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersPurecloud(PutIdentityprovidersPurecloudRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthProvider> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update/Create PureCloud Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersPurecloud(ApiRequest<PureCloud> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthProvider>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update/Create PureEngage Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersPureengage(PureEngage body) throws IOException, ApiException {
    return  putIdentityprovidersPureengage(createPutIdentityprovidersPureengageRequest(body));
  }

  /**
   * Update/Create PureEngage Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersPureengageWithHttpInfo(PureEngage body) throws IOException {
    return putIdentityprovidersPureengage(createPutIdentityprovidersPureengageRequest(body).withHttpInfo());
  }

  private PutIdentityprovidersPureengageRequest createPutIdentityprovidersPureengageRequest(PureEngage body) {
    return PutIdentityprovidersPureengageRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update/Create PureEngage Identity Provider
   * 
   * @param request The request object
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersPureengage(PutIdentityprovidersPureengageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthProvider> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update/Create PureEngage Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersPureengage(ApiRequest<PureEngage> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthProvider>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update/Create Salesforce Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersSalesforce(Salesforce body) throws IOException, ApiException {
    return  putIdentityprovidersSalesforce(createPutIdentityprovidersSalesforceRequest(body));
  }

  /**
   * Update/Create Salesforce Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersSalesforceWithHttpInfo(Salesforce body) throws IOException {
    return putIdentityprovidersSalesforce(createPutIdentityprovidersSalesforceRequest(body).withHttpInfo());
  }

  private PutIdentityprovidersSalesforceRequest createPutIdentityprovidersSalesforceRequest(Salesforce body) {
    return PutIdentityprovidersSalesforceRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update/Create Salesforce Identity Provider
   * 
   * @param request The request object
   * @return OAuthProvider
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthProvider putIdentityprovidersSalesforce(PutIdentityprovidersSalesforceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthProvider> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update/Create Salesforce Identity Provider
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersSalesforce(ApiRequest<Salesforce> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthProvider>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthProvider> response = (ApiResponse<OAuthProvider>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
