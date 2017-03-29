package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.AsyncApiCallback;
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
import com.mypurecloud.sdk.v2.model.GSuite;
import com.mypurecloud.sdk.v2.model.IdentityNow;
import com.mypurecloud.sdk.v2.model.Okta;
import com.mypurecloud.sdk.v2.model.OneLogin;
import com.mypurecloud.sdk.v2.model.PingIdentity;
import com.mypurecloud.sdk.v2.model.PureCloud;
import com.mypurecloud.sdk.v2.model.Salesforce;
import com.mypurecloud.sdk.v2.model.OAuthProvider;


import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersAdfsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersCicRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersGsuiteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersIdentitynowRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersOktaRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersOneloginRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersPingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIdentityprovidersSalesforceRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersAdfsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersCicRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersGsuiteRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersIdentitynowRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersOktaRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersOneloginRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersPingRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.GetIdentityprovidersSalesforceRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersAdfsRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersCicRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersGsuiteRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersIdentitynowRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersOktaRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersOneloginRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersPingRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.PutIdentityprovidersSalesforceRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class IdentityProviderApiAsync {
  private final ApiClient pcapiClient;

  public IdentityProviderApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public IdentityProviderApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete ADFS Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> deleteIdentityprovidersAdfsAsync(DeleteIdentityprovidersAdfsRequest request, AsyncApiCallback<Empty> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete ADFS Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> deleteIdentityprovidersAdfsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Empty>> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete Customer Interaction Center (CIC) Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> deleteIdentityprovidersCicAsync(DeleteIdentityprovidersCicRequest request, AsyncApiCallback<Empty> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete Customer Interaction Center (CIC) Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> deleteIdentityprovidersCicAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Empty>> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete G Suite Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> deleteIdentityprovidersGsuiteAsync(DeleteIdentityprovidersGsuiteRequest request, AsyncApiCallback<Empty> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete G Suite Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> deleteIdentityprovidersGsuiteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Empty>> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete IdentityNow Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> deleteIdentityprovidersIdentitynowAsync(DeleteIdentityprovidersIdentitynowRequest request, AsyncApiCallback<Empty> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete IdentityNow Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> deleteIdentityprovidersIdentitynowAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Empty>> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete Okta Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> deleteIdentityprovidersOktaAsync(DeleteIdentityprovidersOktaRequest request, AsyncApiCallback<Empty> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete Okta Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> deleteIdentityprovidersOktaAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Empty>> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete OneLogin Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> deleteIdentityprovidersOneloginAsync(DeleteIdentityprovidersOneloginRequest request, AsyncApiCallback<Empty> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete OneLogin Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> deleteIdentityprovidersOneloginAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Empty>> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete Ping Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> deleteIdentityprovidersPingAsync(DeleteIdentityprovidersPingRequest request, AsyncApiCallback<Empty> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete Ping Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> deleteIdentityprovidersPingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Empty>> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete PureCloud Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> deleteIdentityprovidersPurecloudAsync(DeleteIdentityprovidersPurecloudRequest request, AsyncApiCallback<Empty> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete PureCloud Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> deleteIdentityprovidersPurecloudAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Empty>> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete Salesforce Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> deleteIdentityprovidersSalesforceAsync(DeleteIdentityprovidersSalesforceRequest request, AsyncApiCallback<Empty> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete Salesforce Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> deleteIdentityprovidersSalesforceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Empty>> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * The list of identity providers
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthProviderEntityListing> getIdentityprovidersAsync(GetIdentityprovidersRequest request, AsyncApiCallback<OAuthProviderEntityListing> callback) throws ApiException {
    return pcapiClient.<OAuthProviderEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthProviderEntityListing>() {}, callback);
  }

  /**
   * The list of identity providers
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthProviderEntityListing>> getIdentityprovidersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OAuthProviderEntityListing>> callback) throws ApiException {
    return pcapiClient.<OAuthProviderEntityListing>invokeAPIVerboseAsync(request, new TypeReference<OAuthProviderEntityListing>() {}, callback);
  }

  /**
   * Get ADFS Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ADFS> getIdentityprovidersAdfsAsync(GetIdentityprovidersAdfsRequest request, AsyncApiCallback<ADFS> callback) throws ApiException {
    return pcapiClient.<ADFS>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ADFS>() {}, callback);
  }

  /**
   * Get ADFS Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ADFS>> getIdentityprovidersAdfsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ADFS>> callback) throws ApiException {
    return pcapiClient.<ADFS>invokeAPIVerboseAsync(request, new TypeReference<ADFS>() {}, callback);
  }

  /**
   * Get Customer Interaction Center (CIC) Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CustomerInteractionCenter> getIdentityprovidersCicAsync(GetIdentityprovidersCicRequest request, AsyncApiCallback<CustomerInteractionCenter> callback) throws ApiException {
    return pcapiClient.<CustomerInteractionCenter>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CustomerInteractionCenter>() {}, callback);
  }

  /**
   * Get Customer Interaction Center (CIC) Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CustomerInteractionCenter>> getIdentityprovidersCicAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CustomerInteractionCenter>> callback) throws ApiException {
    return pcapiClient.<CustomerInteractionCenter>invokeAPIVerboseAsync(request, new TypeReference<CustomerInteractionCenter>() {}, callback);
  }

  /**
   * Get G Suite Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<GSuite> getIdentityprovidersGsuiteAsync(GetIdentityprovidersGsuiteRequest request, AsyncApiCallback<GSuite> callback) throws ApiException {
    return pcapiClient.<GSuite>invokeAPIAsync(request.withHttpInfo(), new TypeReference<GSuite>() {}, callback);
  }

  /**
   * Get G Suite Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<GSuite>> getIdentityprovidersGsuiteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<GSuite>> callback) throws ApiException {
    return pcapiClient.<GSuite>invokeAPIVerboseAsync(request, new TypeReference<GSuite>() {}, callback);
  }

  /**
   * Get IdentityNow Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<IdentityNow> getIdentityprovidersIdentitynowAsync(GetIdentityprovidersIdentitynowRequest request, AsyncApiCallback<IdentityNow> callback) throws ApiException {
    return pcapiClient.<IdentityNow>invokeAPIAsync(request.withHttpInfo(), new TypeReference<IdentityNow>() {}, callback);
  }

  /**
   * Get IdentityNow Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<IdentityNow>> getIdentityprovidersIdentitynowAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<IdentityNow>> callback) throws ApiException {
    return pcapiClient.<IdentityNow>invokeAPIVerboseAsync(request, new TypeReference<IdentityNow>() {}, callback);
  }

  /**
   * Get Okta Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Okta> getIdentityprovidersOktaAsync(GetIdentityprovidersOktaRequest request, AsyncApiCallback<Okta> callback) throws ApiException {
    return pcapiClient.<Okta>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Okta>() {}, callback);
  }

  /**
   * Get Okta Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Okta>> getIdentityprovidersOktaAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Okta>> callback) throws ApiException {
    return pcapiClient.<Okta>invokeAPIVerboseAsync(request, new TypeReference<Okta>() {}, callback);
  }

  /**
   * Get OneLogin Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OneLogin> getIdentityprovidersOneloginAsync(GetIdentityprovidersOneloginRequest request, AsyncApiCallback<OneLogin> callback) throws ApiException {
    return pcapiClient.<OneLogin>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OneLogin>() {}, callback);
  }

  /**
   * Get OneLogin Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OneLogin>> getIdentityprovidersOneloginAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OneLogin>> callback) throws ApiException {
    return pcapiClient.<OneLogin>invokeAPIVerboseAsync(request, new TypeReference<OneLogin>() {}, callback);
  }

  /**
   * Get Ping Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PingIdentity> getIdentityprovidersPingAsync(GetIdentityprovidersPingRequest request, AsyncApiCallback<PingIdentity> callback) throws ApiException {
    return pcapiClient.<PingIdentity>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PingIdentity>() {}, callback);
  }

  /**
   * Get Ping Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PingIdentity>> getIdentityprovidersPingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PingIdentity>> callback) throws ApiException {
    return pcapiClient.<PingIdentity>invokeAPIVerboseAsync(request, new TypeReference<PingIdentity>() {}, callback);
  }

  /**
   * Get PureCloud Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PureCloud> getIdentityprovidersPurecloudAsync(GetIdentityprovidersPurecloudRequest request, AsyncApiCallback<PureCloud> callback) throws ApiException {
    return pcapiClient.<PureCloud>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PureCloud>() {}, callback);
  }

  /**
   * Get PureCloud Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PureCloud>> getIdentityprovidersPurecloudAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PureCloud>> callback) throws ApiException {
    return pcapiClient.<PureCloud>invokeAPIVerboseAsync(request, new TypeReference<PureCloud>() {}, callback);
  }

  /**
   * Get Salesforce Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Salesforce> getIdentityprovidersSalesforceAsync(GetIdentityprovidersSalesforceRequest request, AsyncApiCallback<Salesforce> callback) throws ApiException {
    return pcapiClient.<Salesforce>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Salesforce>() {}, callback);
  }

  /**
   * Get Salesforce Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Salesforce>> getIdentityprovidersSalesforceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Salesforce>> callback) throws ApiException {
    return pcapiClient.<Salesforce>invokeAPIVerboseAsync(request, new TypeReference<Salesforce>() {}, callback);
  }

  /**
   * Update/Create ADFS Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthProvider> putIdentityprovidersAdfsAsync(PutIdentityprovidersAdfsRequest request, AsyncApiCallback<OAuthProvider> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create ADFS Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthProvider>> putIdentityprovidersAdfsAsync(ApiRequest<ADFS> request, AsyncApiCallback<ApiResponse<OAuthProvider>> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerboseAsync(request, new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create Customer Interaction Center (CIC) Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthProvider> putIdentityprovidersCicAsync(PutIdentityprovidersCicRequest request, AsyncApiCallback<OAuthProvider> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create Customer Interaction Center (CIC) Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthProvider>> putIdentityprovidersCicAsync(ApiRequest<CustomerInteractionCenter> request, AsyncApiCallback<ApiResponse<OAuthProvider>> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerboseAsync(request, new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create G Suite Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthProvider> putIdentityprovidersGsuiteAsync(PutIdentityprovidersGsuiteRequest request, AsyncApiCallback<OAuthProvider> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create G Suite Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthProvider>> putIdentityprovidersGsuiteAsync(ApiRequest<GSuite> request, AsyncApiCallback<ApiResponse<OAuthProvider>> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerboseAsync(request, new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create IdentityNow Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<IdentityNow> putIdentityprovidersIdentitynowAsync(PutIdentityprovidersIdentitynowRequest request, AsyncApiCallback<IdentityNow> callback) throws ApiException {
    return pcapiClient.<IdentityNow>invokeAPIAsync(request.withHttpInfo(), new TypeReference<IdentityNow>() {}, callback);
  }

  /**
   * Update/Create IdentityNow Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<IdentityNow>> putIdentityprovidersIdentitynowAsync(ApiRequest<IdentityNow> request, AsyncApiCallback<ApiResponse<IdentityNow>> callback) throws ApiException {
    return pcapiClient.<IdentityNow>invokeAPIVerboseAsync(request, new TypeReference<IdentityNow>() {}, callback);
  }

  /**
   * Update/Create Okta Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthProvider> putIdentityprovidersOktaAsync(PutIdentityprovidersOktaRequest request, AsyncApiCallback<OAuthProvider> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create Okta Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthProvider>> putIdentityprovidersOktaAsync(ApiRequest<Okta> request, AsyncApiCallback<ApiResponse<OAuthProvider>> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerboseAsync(request, new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create OneLogin Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthProvider> putIdentityprovidersOneloginAsync(PutIdentityprovidersOneloginRequest request, AsyncApiCallback<OAuthProvider> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create OneLogin Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthProvider>> putIdentityprovidersOneloginAsync(ApiRequest<OneLogin> request, AsyncApiCallback<ApiResponse<OAuthProvider>> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerboseAsync(request, new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create Ping Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthProvider> putIdentityprovidersPingAsync(PutIdentityprovidersPingRequest request, AsyncApiCallback<OAuthProvider> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create Ping Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthProvider>> putIdentityprovidersPingAsync(ApiRequest<PingIdentity> request, AsyncApiCallback<ApiResponse<OAuthProvider>> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerboseAsync(request, new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create PureCloud Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthProvider> putIdentityprovidersPurecloudAsync(PutIdentityprovidersPurecloudRequest request, AsyncApiCallback<OAuthProvider> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create PureCloud Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthProvider>> putIdentityprovidersPurecloudAsync(ApiRequest<PureCloud> request, AsyncApiCallback<ApiResponse<OAuthProvider>> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerboseAsync(request, new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create Salesforce Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthProvider> putIdentityprovidersSalesforceAsync(PutIdentityprovidersSalesforceRequest request, AsyncApiCallback<OAuthProvider> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthProvider>() {}, callback);
  }

  /**
   * Update/Create Salesforce Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthProvider>> putIdentityprovidersSalesforceAsync(ApiRequest<Salesforce> request, AsyncApiCallback<ApiResponse<OAuthProvider>> callback) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerboseAsync(request, new TypeReference<OAuthProvider>() {}, callback);
  }

}
