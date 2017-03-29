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
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersAdfs() throws ApiException {
    return deleteIdentityprovidersAdfsWithHttpInfo().getBody();
  }

  /**
   * Delete ADFS Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersAdfsWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/adfs".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Delete ADFS Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersAdfs(DeleteIdentityprovidersAdfsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Delete ADFS Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersAdfs(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Delete Customer Interaction Center (CIC) Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersCic() throws ApiException {
    return deleteIdentityprovidersCicWithHttpInfo().getBody();
  }

  /**
   * Delete Customer Interaction Center (CIC) Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersCicWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/cic".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Delete Customer Interaction Center (CIC) Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersCic(DeleteIdentityprovidersCicRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Delete Customer Interaction Center (CIC) Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersCic(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Delete G Suite Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersGsuite() throws ApiException {
    return deleteIdentityprovidersGsuiteWithHttpInfo().getBody();
  }

  /**
   * Delete G Suite Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersGsuiteWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/gsuite".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Delete G Suite Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersGsuite(DeleteIdentityprovidersGsuiteRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Delete G Suite Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersGsuite(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Delete IdentityNow Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersIdentitynow() throws ApiException {
    return deleteIdentityprovidersIdentitynowWithHttpInfo().getBody();
  }

  /**
   * Delete IdentityNow Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersIdentitynowWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/identitynow".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Delete IdentityNow Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersIdentitynow(DeleteIdentityprovidersIdentitynowRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Delete IdentityNow Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersIdentitynow(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Delete Okta Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersOkta() throws ApiException {
    return deleteIdentityprovidersOktaWithHttpInfo().getBody();
  }

  /**
   * Delete Okta Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersOktaWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/okta".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Delete Okta Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersOkta(DeleteIdentityprovidersOktaRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Delete Okta Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersOkta(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Delete OneLogin Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersOnelogin() throws ApiException {
    return deleteIdentityprovidersOneloginWithHttpInfo().getBody();
  }

  /**
   * Delete OneLogin Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersOneloginWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/onelogin".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Delete OneLogin Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersOnelogin(DeleteIdentityprovidersOneloginRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Delete OneLogin Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersOnelogin(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Delete Ping Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersPing() throws ApiException {
    return deleteIdentityprovidersPingWithHttpInfo().getBody();
  }

  /**
   * Delete Ping Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersPingWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/ping".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Delete Ping Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersPing(DeleteIdentityprovidersPingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Delete Ping Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersPing(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Delete PureCloud Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersPurecloud() throws ApiException {
    return deleteIdentityprovidersPurecloudWithHttpInfo().getBody();
  }

  /**
   * Delete PureCloud Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersPurecloudWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/purecloud".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Delete PureCloud Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersPurecloud(DeleteIdentityprovidersPurecloudRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Delete PureCloud Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersPurecloud(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Delete Salesforce Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersSalesforce() throws ApiException {
    return deleteIdentityprovidersSalesforceWithHttpInfo().getBody();
  }

  /**
   * Delete Salesforce Identity Provider
   * 
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersSalesforceWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/salesforce".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Delete Salesforce Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty deleteIdentityprovidersSalesforce(DeleteIdentityprovidersSalesforceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Delete Salesforce Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteIdentityprovidersSalesforce(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * The list of identity providers
   * 
   * @return OAuthProviderEntityListing
   * @throws ApiException if fails to make API call
   */
  public OAuthProviderEntityListing getIdentityproviders() throws ApiException {
    return getIdentityprovidersWithHttpInfo().getBody();
  }

  /**
   * The list of identity providers
   * 
   * @return OAuthProviderEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProviderEntityListing> getIdentityprovidersWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthProviderEntityListing>() {});
  }

  /**
   * The list of identity providers
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthProviderEntityListing getIdentityproviders(GetIdentityprovidersRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthProviderEntityListing>() {});
  }

  /**
   * The list of identity providers
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProviderEntityListing> getIdentityproviders(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OAuthProviderEntityListing>invokeAPIVerbose(request, new TypeReference<OAuthProviderEntityListing>() {});
  }

  /**
   * Get ADFS Identity Provider
   * 
   * @return ADFS
   * @throws ApiException if fails to make API call
   */
  public ADFS getIdentityprovidersAdfs() throws ApiException {
    return getIdentityprovidersAdfsWithHttpInfo().getBody();
  }

  /**
   * Get ADFS Identity Provider
   * 
   * @return ADFS
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ADFS> getIdentityprovidersAdfsWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/adfs".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ADFS>() {});
  }

  /**
   * Get ADFS Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ADFS getIdentityprovidersAdfs(GetIdentityprovidersAdfsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ADFS>() {});
  }

  /**
   * Get ADFS Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ADFS> getIdentityprovidersAdfs(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<ADFS>invokeAPIVerbose(request, new TypeReference<ADFS>() {});
  }

  /**
   * Get Customer Interaction Center (CIC) Identity Provider
   * 
   * @return CustomerInteractionCenter
   * @throws ApiException if fails to make API call
   */
  public CustomerInteractionCenter getIdentityprovidersCic() throws ApiException {
    return getIdentityprovidersCicWithHttpInfo().getBody();
  }

  /**
   * Get Customer Interaction Center (CIC) Identity Provider
   * 
   * @return CustomerInteractionCenter
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomerInteractionCenter> getIdentityprovidersCicWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/cic".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CustomerInteractionCenter>() {});
  }

  /**
   * Get Customer Interaction Center (CIC) Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CustomerInteractionCenter getIdentityprovidersCic(GetIdentityprovidersCicRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CustomerInteractionCenter>() {});
  }

  /**
   * Get Customer Interaction Center (CIC) Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomerInteractionCenter> getIdentityprovidersCic(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<CustomerInteractionCenter>invokeAPIVerbose(request, new TypeReference<CustomerInteractionCenter>() {});
  }

  /**
   * Get G Suite Identity Provider
   * 
   * @return GSuite
   * @throws ApiException if fails to make API call
   */
  public GSuite getIdentityprovidersGsuite() throws ApiException {
    return getIdentityprovidersGsuiteWithHttpInfo().getBody();
  }

  /**
   * Get G Suite Identity Provider
   * 
   * @return GSuite
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GSuite> getIdentityprovidersGsuiteWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/gsuite".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<GSuite>() {});
  }

  /**
   * Get G Suite Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public GSuite getIdentityprovidersGsuite(GetIdentityprovidersGsuiteRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<GSuite>() {});
  }

  /**
   * Get G Suite Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GSuite> getIdentityprovidersGsuite(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<GSuite>invokeAPIVerbose(request, new TypeReference<GSuite>() {});
  }

  /**
   * Get IdentityNow Provider
   * 
   * @return IdentityNow
   * @throws ApiException if fails to make API call
   */
  public IdentityNow getIdentityprovidersIdentitynow() throws ApiException {
    return getIdentityprovidersIdentitynowWithHttpInfo().getBody();
  }

  /**
   * Get IdentityNow Provider
   * 
   * @return IdentityNow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdentityNow> getIdentityprovidersIdentitynowWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/identitynow".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<IdentityNow>() {});
  }

  /**
   * Get IdentityNow Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public IdentityNow getIdentityprovidersIdentitynow(GetIdentityprovidersIdentitynowRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<IdentityNow>() {});
  }

  /**
   * Get IdentityNow Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdentityNow> getIdentityprovidersIdentitynow(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<IdentityNow>invokeAPIVerbose(request, new TypeReference<IdentityNow>() {});
  }

  /**
   * Get Okta Identity Provider
   * 
   * @return Okta
   * @throws ApiException if fails to make API call
   */
  public Okta getIdentityprovidersOkta() throws ApiException {
    return getIdentityprovidersOktaWithHttpInfo().getBody();
  }

  /**
   * Get Okta Identity Provider
   * 
   * @return Okta
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Okta> getIdentityprovidersOktaWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/okta".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Okta>() {});
  }

  /**
   * Get Okta Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Okta getIdentityprovidersOkta(GetIdentityprovidersOktaRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Okta>() {});
  }

  /**
   * Get Okta Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Okta> getIdentityprovidersOkta(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Okta>invokeAPIVerbose(request, new TypeReference<Okta>() {});
  }

  /**
   * Get OneLogin Identity Provider
   * 
   * @return OneLogin
   * @throws ApiException if fails to make API call
   */
  public OneLogin getIdentityprovidersOnelogin() throws ApiException {
    return getIdentityprovidersOneloginWithHttpInfo().getBody();
  }

  /**
   * Get OneLogin Identity Provider
   * 
   * @return OneLogin
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OneLogin> getIdentityprovidersOneloginWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/onelogin".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OneLogin>() {});
  }

  /**
   * Get OneLogin Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OneLogin getIdentityprovidersOnelogin(GetIdentityprovidersOneloginRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OneLogin>() {});
  }

  /**
   * Get OneLogin Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OneLogin> getIdentityprovidersOnelogin(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OneLogin>invokeAPIVerbose(request, new TypeReference<OneLogin>() {});
  }

  /**
   * Get Ping Identity Provider
   * 
   * @return PingIdentity
   * @throws ApiException if fails to make API call
   */
  public PingIdentity getIdentityprovidersPing() throws ApiException {
    return getIdentityprovidersPingWithHttpInfo().getBody();
  }

  /**
   * Get Ping Identity Provider
   * 
   * @return PingIdentity
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PingIdentity> getIdentityprovidersPingWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/ping".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PingIdentity>() {});
  }

  /**
   * Get Ping Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PingIdentity getIdentityprovidersPing(GetIdentityprovidersPingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PingIdentity>() {});
  }

  /**
   * Get Ping Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PingIdentity> getIdentityprovidersPing(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<PingIdentity>invokeAPIVerbose(request, new TypeReference<PingIdentity>() {});
  }

  /**
   * Get PureCloud Identity Provider
   * 
   * @return PureCloud
   * @throws ApiException if fails to make API call
   */
  public PureCloud getIdentityprovidersPurecloud() throws ApiException {
    return getIdentityprovidersPurecloudWithHttpInfo().getBody();
  }

  /**
   * Get PureCloud Identity Provider
   * 
   * @return PureCloud
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PureCloud> getIdentityprovidersPurecloudWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/purecloud".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PureCloud>() {});
  }

  /**
   * Get PureCloud Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PureCloud getIdentityprovidersPurecloud(GetIdentityprovidersPurecloudRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PureCloud>() {});
  }

  /**
   * Get PureCloud Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PureCloud> getIdentityprovidersPurecloud(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<PureCloud>invokeAPIVerbose(request, new TypeReference<PureCloud>() {});
  }

  /**
   * Get Salesforce Identity Provider
   * 
   * @return Salesforce
   * @throws ApiException if fails to make API call
   */
  public Salesforce getIdentityprovidersSalesforce() throws ApiException {
    return getIdentityprovidersSalesforceWithHttpInfo().getBody();
  }

  /**
   * Get Salesforce Identity Provider
   * 
   * @return Salesforce
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Salesforce> getIdentityprovidersSalesforceWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/salesforce".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Salesforce>() {});
  }

  /**
   * Get Salesforce Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Salesforce getIdentityprovidersSalesforce(GetIdentityprovidersSalesforceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Salesforce>() {});
  }

  /**
   * Get Salesforce Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Salesforce> getIdentityprovidersSalesforce(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Salesforce>invokeAPIVerbose(request, new TypeReference<Salesforce>() {});
  }

  /**
   * Update/Create ADFS Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersAdfs(ADFS body) throws ApiException {
    return putIdentityprovidersAdfsWithHttpInfo(body).getBody();
  }

  /**
   * Update/Create ADFS Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersAdfsWithHttpInfo(ADFS body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putIdentityprovidersAdfs");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/adfs".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create ADFS Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersAdfs(PutIdentityprovidersAdfsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create ADFS Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersAdfs(ApiRequest<ADFS> request) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerbose(request, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create Customer Interaction Center (CIC) Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersCic(CustomerInteractionCenter body) throws ApiException {
    return putIdentityprovidersCicWithHttpInfo(body).getBody();
  }

  /**
   * Update/Create Customer Interaction Center (CIC) Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersCicWithHttpInfo(CustomerInteractionCenter body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putIdentityprovidersCic");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/cic".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create Customer Interaction Center (CIC) Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersCic(PutIdentityprovidersCicRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create Customer Interaction Center (CIC) Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersCic(ApiRequest<CustomerInteractionCenter> request) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerbose(request, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create G Suite Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersGsuite(GSuite body) throws ApiException {
    return putIdentityprovidersGsuiteWithHttpInfo(body).getBody();
  }

  /**
   * Update/Create G Suite Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersGsuiteWithHttpInfo(GSuite body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putIdentityprovidersGsuite");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/gsuite".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create G Suite Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersGsuite(PutIdentityprovidersGsuiteRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create G Suite Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersGsuite(ApiRequest<GSuite> request) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerbose(request, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create IdentityNow Provider
   * 
   * @param body Provider (required)
   * @return IdentityNow
   * @throws ApiException if fails to make API call
   */
  public IdentityNow putIdentityprovidersIdentitynow(IdentityNow body) throws ApiException {
    return putIdentityprovidersIdentitynowWithHttpInfo(body).getBody();
  }

  /**
   * Update/Create IdentityNow Provider
   * 
   * @param body Provider (required)
   * @return IdentityNow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdentityNow> putIdentityprovidersIdentitynowWithHttpInfo(IdentityNow body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putIdentityprovidersIdentitynow");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/identitynow".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<IdentityNow>() {});
  }

  /**
   * Update/Create IdentityNow Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public IdentityNow putIdentityprovidersIdentitynow(PutIdentityprovidersIdentitynowRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<IdentityNow>() {});
  }

  /**
   * Update/Create IdentityNow Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdentityNow> putIdentityprovidersIdentitynow(ApiRequest<IdentityNow> request) throws ApiException {
    return pcapiClient.<IdentityNow>invokeAPIVerbose(request, new TypeReference<IdentityNow>() {});
  }

  /**
   * Update/Create Okta Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersOkta(Okta body) throws ApiException {
    return putIdentityprovidersOktaWithHttpInfo(body).getBody();
  }

  /**
   * Update/Create Okta Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersOktaWithHttpInfo(Okta body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putIdentityprovidersOkta");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/okta".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create Okta Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersOkta(PutIdentityprovidersOktaRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create Okta Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersOkta(ApiRequest<Okta> request) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerbose(request, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create OneLogin Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersOnelogin(OneLogin body) throws ApiException {
    return putIdentityprovidersOneloginWithHttpInfo(body).getBody();
  }

  /**
   * Update/Create OneLogin Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersOneloginWithHttpInfo(OneLogin body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putIdentityprovidersOnelogin");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/onelogin".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create OneLogin Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersOnelogin(PutIdentityprovidersOneloginRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create OneLogin Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersOnelogin(ApiRequest<OneLogin> request) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerbose(request, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create Ping Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersPing(PingIdentity body) throws ApiException {
    return putIdentityprovidersPingWithHttpInfo(body).getBody();
  }

  /**
   * Update/Create Ping Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersPingWithHttpInfo(PingIdentity body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putIdentityprovidersPing");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/ping".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create Ping Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersPing(PutIdentityprovidersPingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create Ping Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersPing(ApiRequest<PingIdentity> request) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerbose(request, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create PureCloud Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersPurecloud(PureCloud body) throws ApiException {
    return putIdentityprovidersPurecloudWithHttpInfo(body).getBody();
  }

  /**
   * Update/Create PureCloud Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersPurecloudWithHttpInfo(PureCloud body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putIdentityprovidersPurecloud");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/purecloud".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create PureCloud Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersPurecloud(PutIdentityprovidersPurecloudRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create PureCloud Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersPurecloud(ApiRequest<PureCloud> request) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerbose(request, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create Salesforce Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersSalesforce(Salesforce body) throws ApiException {
    return putIdentityprovidersSalesforceWithHttpInfo(body).getBody();
  }

  /**
   * Update/Create Salesforce Identity Provider
   * 
   * @param body Provider (required)
   * @return OAuthProvider
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersSalesforceWithHttpInfo(Salesforce body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putIdentityprovidersSalesforce");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/identityproviders/salesforce".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create Salesforce Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthProvider putIdentityprovidersSalesforce(PutIdentityprovidersSalesforceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthProvider>() {});
  }

  /**
   * Update/Create Salesforce Identity Provider
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthProvider> putIdentityprovidersSalesforce(ApiRequest<Salesforce> request) throws ApiException {
    return pcapiClient.<OAuthProvider>invokeAPIVerbose(request, new TypeReference<OAuthProvider>() {});
  }

}
