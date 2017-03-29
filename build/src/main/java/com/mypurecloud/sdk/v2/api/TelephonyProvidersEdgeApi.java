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
import com.mypurecloud.sdk.v2.model.SchemaCategoryEntityListing;
import com.mypurecloud.sdk.v2.model.SchemaReferenceEntityListing;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.Edge;
import com.mypurecloud.sdk.v2.model.EdgeLine;
import com.mypurecloud.sdk.v2.model.EdgeLineEntityListing;
import com.mypurecloud.sdk.v2.model.DomainLogicalInterface;
import com.mypurecloud.sdk.v2.model.LogicalInterfaceEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeLogsJob;
import com.mypurecloud.sdk.v2.model.DomainPhysicalInterface;
import com.mypurecloud.sdk.v2.model.PhysicalInterfaceEntityListing;
import com.mypurecloud.sdk.v2.model.VmPairingInfo;
import com.mypurecloud.sdk.v2.model.DomainEdgeSoftwareUpdateDto;
import com.mypurecloud.sdk.v2.model.DomainEdgeSoftwareVersionDtoEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeEntityListing;
import com.mypurecloud.sdk.v2.model.AvailableLanguageList;
import com.mypurecloud.sdk.v2.model.CertificateAuthorityEntityListing;
import com.mypurecloud.sdk.v2.model.DomainCertificateAuthority;
import com.mypurecloud.sdk.v2.model.DID;
import com.mypurecloud.sdk.v2.model.DIDPool;
import com.mypurecloud.sdk.v2.model.DIDPoolEntityListing;
import com.mypurecloud.sdk.v2.model.DIDEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeGroup;
import com.mypurecloud.sdk.v2.model.EdgeTrunkBase;
import com.mypurecloud.sdk.v2.model.EdgeGroupEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeVersionReport;
import com.mypurecloud.sdk.v2.model.Endpoint;
import com.mypurecloud.sdk.v2.model.EndpointEntityListing;
import com.mypurecloud.sdk.v2.model.Extension;
import com.mypurecloud.sdk.v2.model.ExtensionPool;
import com.mypurecloud.sdk.v2.model.ExtensionPoolEntityListing;
import com.mypurecloud.sdk.v2.model.ExtensionEntityListing;
import com.mypurecloud.sdk.v2.model.Line;
import com.mypurecloud.sdk.v2.model.LineBase;
import com.mypurecloud.sdk.v2.model.LineBaseEntityListing;
import com.mypurecloud.sdk.v2.model.LineEntityListing;
import com.mypurecloud.sdk.v2.model.OutboundRoute;
import com.mypurecloud.sdk.v2.model.OutboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.Phone;
import com.mypurecloud.sdk.v2.model.PhoneBase;
import com.mypurecloud.sdk.v2.model.PhoneBaseEntityListing;
import com.mypurecloud.sdk.v2.model.PhoneMetaBaseEntityListing;
import com.mypurecloud.sdk.v2.model.PhoneEntityListing;
import com.mypurecloud.sdk.v2.model.Site;
import com.mypurecloud.sdk.v2.model.NumberPlan;
import com.mypurecloud.sdk.v2.model.OutboundRouteBase;
import com.mypurecloud.sdk.v2.model.OutboundRouteBaseEntityListing;
import com.mypurecloud.sdk.v2.model.SiteEntityListing;
import com.mypurecloud.sdk.v2.model.TimeZoneEntityListing;
import com.mypurecloud.sdk.v2.model.Trunk;
import com.mypurecloud.sdk.v2.model.TrunkBase;
import com.mypurecloud.sdk.v2.model.TrunkBaseEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkMetabaseEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkRecordingEnabledCount;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobUploadRequest;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobRequest;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobResponse;
import com.mypurecloud.sdk.v2.model.EdgeRebootParameters;
import com.mypurecloud.sdk.v2.model.EdgeServiceStateRequest;
import com.mypurecloud.sdk.v2.model.ValidateAddressResponse;
import com.mypurecloud.sdk.v2.model.ValidateAddressRequest;
import com.mypurecloud.sdk.v2.model.PhonesReboot;


import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgeLogicalinterfaceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgeSoftwareupdateRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesCertificateauthorityRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesDidpoolRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesEdgegroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesEndpointRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesExtensionpoolRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesOutboundrouteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesPhoneRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesPhonebasesettingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesSiteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesSiteOutboundrouteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesTrunkbasesettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetConfigurationSchemasEdgesVnextRequest;
import com.mypurecloud.sdk.v2.api.request.GetConfigurationSchemasEdgesVnextSchemaCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeLineRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeLinesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeLogicalinterfaceRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeLogicalinterfacesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeLogsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgePhysicalinterfaceRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgePhysicalinterfacesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeSetuppackageRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeSoftwareupdateRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeSoftwareversionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesAvailablelanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesCertificateauthoritiesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesCertificateauthorityRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesDidRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesDidpoolRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesDidpoolsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesDidsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesEdgegroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesEdgegroupEdgetrunkbasisRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesEdgegroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesEdgeversionreportRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesEndpointRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesEndpointsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesExtensionRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesExtensionpoolRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesExtensionpoolsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesExtensionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesLineRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesLinebasesettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesLinebasesettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesLinesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesLinesTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesLogicalinterfacesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesOutboundrouteRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesOutboundroutesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhoneRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhonebasesettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhonebasesettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhonebasesettingsTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhonesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhonesTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteNumberplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteNumberplansRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteOutboundrouteRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteOutboundroutesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSitesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTimezonesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkbasesettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkbasesettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkbasesettingsTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunksRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkswithrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgeLogicalinterfacesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgeLogsJobUploadRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgeLogsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgeRebootRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgeSoftwareupdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgeStatuscodeRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgeUnpairRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesAddressvalidationRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesCertificateauthoritiesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesDidpoolsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesEdgegroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesEndpointsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesExtensionpoolsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesOutboundroutesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesPhoneRebootRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesPhonebasesettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesPhonesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesPhonesRebootRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesSiteOutboundroutesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesSiteRebalanceRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesSitesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesTrunkbasesettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgeRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgeLineRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgeLogicalinterfaceRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesCertificateauthorityRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesDidRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesDidpoolRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesEdgegroupRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesEdgegroupEdgetrunkbasisRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesEndpointRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesExtensionRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesExtensionpoolRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesOutboundrouteRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesPhoneRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesPhonebasesettingRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesSiteRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesSiteNumberplansRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesSiteOutboundrouteRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesTrunkbasesettingRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TelephonyProvidersEdgeApi {
  private final ApiClient pcapiClient;

  public TelephonyProvidersEdgeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TelephonyProvidersEdgeApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a edge.
   * 
   * @param edgeId Edge ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdge(String edgeId) throws ApiException {
    return deleteTelephonyProvidersEdgeWithHttpInfo(edgeId).getBody();
  }

  /**
   * Delete a edge.
   * 
   * @param edgeId Edge ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgeWithHttpInfo(String edgeId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling deleteTelephonyProvidersEdge");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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
   * Delete a edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdge(DeleteTelephonyProvidersEdgeRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdge(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete an edge logical interface
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTelephonyProvidersEdgeLogicalinterface(String edgeId, String interfaceId) throws ApiException {
    deleteTelephonyProvidersEdgeLogicalinterfaceWithHttpInfo(edgeId, interfaceId);
  }

  /**
   * Delete an edge logical interface
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgeLogicalinterfaceWithHttpInfo(String edgeId, String interfaceId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling deleteTelephonyProvidersEdgeLogicalinterface");
    }
    
    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'interfaceId' when calling deleteTelephonyProvidersEdgeLogicalinterface");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()))
      .replaceAll("\\{" + "interfaceId" + "\\}", pcapiClient.escapeString(interfaceId.toString()));

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
   * Delete an edge logical interface
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteTelephonyProvidersEdgeLogicalinterface(DeleteTelephonyProvidersEdgeLogicalinterfaceRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete an edge logical interface
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgeLogicalinterface(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Cancels any in-progress update for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgeSoftwareupdate(String edgeId) throws ApiException {
    return deleteTelephonyProvidersEdgeSoftwareupdateWithHttpInfo(edgeId).getBody();
  }

  /**
   * Cancels any in-progress update for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgeSoftwareupdateWithHttpInfo(String edgeId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling deleteTelephonyProvidersEdgeSoftwareupdate");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/softwareupdate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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
   * Cancels any in-progress update for this edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgeSoftwareupdate(DeleteTelephonyProvidersEdgeSoftwareupdateRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Cancels any in-progress update for this edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgeSoftwareupdate(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesCertificateauthority(String certificateId) throws ApiException {
    return deleteTelephonyProvidersEdgesCertificateauthorityWithHttpInfo(certificateId).getBody();
  }

  /**
   * Delete a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesCertificateauthorityWithHttpInfo(String certificateId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'certificateId' is set
    if (certificateId == null) {
      throw new ApiException(400, "Missing the required parameter 'certificateId' when calling deleteTelephonyProvidersEdgesCertificateauthority");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/certificateauthorities/{certificateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "certificateId" + "\\}", pcapiClient.escapeString(certificateId.toString()));

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
   * Delete a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesCertificateauthority(DeleteTelephonyProvidersEdgesCertificateauthorityRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesCertificateauthority(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesDidpool(String didPoolId) throws ApiException {
    return deleteTelephonyProvidersEdgesDidpoolWithHttpInfo(didPoolId).getBody();
  }

  /**
   * Delete a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesDidpoolWithHttpInfo(String didPoolId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'didPoolId' is set
    if (didPoolId == null) {
      throw new ApiException(400, "Missing the required parameter 'didPoolId' when calling deleteTelephonyProvidersEdgesDidpool");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/didpools/{didPoolId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "didPoolId" + "\\}", pcapiClient.escapeString(didPoolId.toString()));

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
   * Delete a DID Pool by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesDidpool(DeleteTelephonyProvidersEdgesDidpoolRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a DID Pool by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesDidpool(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete an edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesEdgegroup(String edgeGroupId) throws ApiException {
    return deleteTelephonyProvidersEdgesEdgegroupWithHttpInfo(edgeGroupId).getBody();
  }

  /**
   * Delete an edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesEdgegroupWithHttpInfo(String edgeGroupId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeGroupId' is set
    if (edgeGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeGroupId' when calling deleteTelephonyProvidersEdgesEdgegroup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/edgegroups/{edgeGroupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeGroupId" + "\\}", pcapiClient.escapeString(edgeGroupId.toString()));

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
   * Delete an edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesEdgegroup(DeleteTelephonyProvidersEdgesEdgegroupRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete an edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesEdgegroup(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete endpoint
   * 
   * @param endpointId Endpoint ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesEndpoint(String endpointId) throws ApiException {
    return deleteTelephonyProvidersEdgesEndpointWithHttpInfo(endpointId).getBody();
  }

  /**
   * Delete endpoint
   * 
   * @param endpointId Endpoint ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesEndpointWithHttpInfo(String endpointId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling deleteTelephonyProvidersEdgesEndpoint");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/endpoints/{endpointId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "endpointId" + "\\}", pcapiClient.escapeString(endpointId.toString()));

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
   * Delete endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesEndpoint(DeleteTelephonyProvidersEdgesEndpointRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesEndpoint(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesExtensionpool(String extensionPoolId) throws ApiException {
    return deleteTelephonyProvidersEdgesExtensionpoolWithHttpInfo(extensionPoolId).getBody();
  }

  /**
   * Delete an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesExtensionpoolWithHttpInfo(String extensionPoolId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'extensionPoolId' is set
    if (extensionPoolId == null) {
      throw new ApiException(400, "Missing the required parameter 'extensionPoolId' when calling deleteTelephonyProvidersEdgesExtensionpool");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/extensionpools/{extensionPoolId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "extensionPoolId" + "\\}", pcapiClient.escapeString(extensionPoolId.toString()));

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
   * Delete an extension pool by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesExtensionpool(DeleteTelephonyProvidersEdgesExtensionpoolRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete an extension pool by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesExtensionpool(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete Outbound Route
   * 
   * @param outboundRouteId Outbound route ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesOutboundroute(String outboundRouteId) throws ApiException {
    return deleteTelephonyProvidersEdgesOutboundrouteWithHttpInfo(outboundRouteId).getBody();
  }

  /**
   * Delete Outbound Route
   * 
   * @param outboundRouteId Outbound route ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesOutboundrouteWithHttpInfo(String outboundRouteId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'outboundRouteId' is set
    if (outboundRouteId == null) {
      throw new ApiException(400, "Missing the required parameter 'outboundRouteId' when calling deleteTelephonyProvidersEdgesOutboundroute");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "outboundRouteId" + "\\}", pcapiClient.escapeString(outboundRouteId.toString()));

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
   * Delete Outbound Route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesOutboundroute(DeleteTelephonyProvidersEdgesOutboundrouteRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete Outbound Route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesOutboundroute(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesPhone(String phoneId) throws ApiException {
    return deleteTelephonyProvidersEdgesPhoneWithHttpInfo(phoneId).getBody();
  }

  /**
   * Delete a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesPhoneWithHttpInfo(String phoneId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'phoneId' is set
    if (phoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneId' when calling deleteTelephonyProvidersEdgesPhone");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phones/{phoneId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "phoneId" + "\\}", pcapiClient.escapeString(phoneId.toString()));

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
   * Delete a Phone by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesPhone(DeleteTelephonyProvidersEdgesPhoneRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a Phone by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesPhone(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a Phone Base Settings by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesPhonebasesetting(String phoneBaseId) throws ApiException {
    return deleteTelephonyProvidersEdgesPhonebasesettingWithHttpInfo(phoneBaseId).getBody();
  }

  /**
   * Delete a Phone Base Settings by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesPhonebasesettingWithHttpInfo(String phoneBaseId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'phoneBaseId' is set
    if (phoneBaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneBaseId' when calling deleteTelephonyProvidersEdgesPhonebasesetting");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "phoneBaseId" + "\\}", pcapiClient.escapeString(phoneBaseId.toString()));

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
   * Delete a Phone Base Settings by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesPhonebasesetting(DeleteTelephonyProvidersEdgesPhonebasesettingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a Phone Base Settings by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesPhonebasesetting(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a Site by ID
   * 
   * @param siteId Site ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesSite(String siteId) throws ApiException {
    return deleteTelephonyProvidersEdgesSiteWithHttpInfo(siteId).getBody();
  }

  /**
   * Delete a Site by ID
   * 
   * @param siteId Site ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesSiteWithHttpInfo(String siteId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling deleteTelephonyProvidersEdgesSite");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()));

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
   * Delete a Site by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesSite(DeleteTelephonyProvidersEdgesSiteRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a Site by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesSite(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete Outbound Route
   * 
   * @param siteId Site ID (required)
   * @param outboundRouteId Outbound route ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesSiteOutboundroute(String siteId, String outboundRouteId) throws ApiException {
    return deleteTelephonyProvidersEdgesSiteOutboundrouteWithHttpInfo(siteId, outboundRouteId).getBody();
  }

  /**
   * Delete Outbound Route
   * 
   * @param siteId Site ID (required)
   * @param outboundRouteId Outbound route ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesSiteOutboundrouteWithHttpInfo(String siteId, String outboundRouteId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling deleteTelephonyProvidersEdgesSiteOutboundroute");
    }
    
    // verify the required parameter 'outboundRouteId' is set
    if (outboundRouteId == null) {
      throw new ApiException(400, "Missing the required parameter 'outboundRouteId' when calling deleteTelephonyProvidersEdgesSiteOutboundroute");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes/{outboundRouteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()))
      .replaceAll("\\{" + "outboundRouteId" + "\\}", pcapiClient.escapeString(outboundRouteId.toString()));

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
   * Delete Outbound Route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesSiteOutboundroute(DeleteTelephonyProvidersEdgesSiteOutboundrouteRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete Outbound Route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesSiteOutboundroute(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesTrunkbasesetting(String trunkBaseSettingsId) throws ApiException {
    return deleteTelephonyProvidersEdgesTrunkbasesettingWithHttpInfo(trunkBaseSettingsId).getBody();
  }

  /**
   * Delete a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesTrunkbasesettingWithHttpInfo(String trunkBaseSettingsId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'trunkBaseSettingsId' is set
    if (trunkBaseSettingsId == null) {
      throw new ApiException(400, "Missing the required parameter 'trunkBaseSettingsId' when calling deleteTelephonyProvidersEdgesTrunkbasesetting");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trunkBaseSettingsId" + "\\}", pcapiClient.escapeString(trunkBaseSettingsId.toString()));

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
   * Delete a Trunk Base Settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTelephonyProvidersEdgesTrunkbasesetting(DeleteTelephonyProvidersEdgesTrunkbasesettingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a Trunk Base Settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTelephonyProvidersEdgesTrunkbasesetting(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Lists available schema categories (Deprecated)
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SchemaCategoryEntityListing
   * @throws ApiException if fails to make API call
   */
  public SchemaCategoryEntityListing getConfigurationSchemasEdgesVnext(Integer pageSize, Integer pageNumber) throws ApiException {
    return getConfigurationSchemasEdgesVnextWithHttpInfo(pageSize, pageNumber).getBody();
  }

  /**
   * Lists available schema categories (Deprecated)
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SchemaCategoryEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SchemaCategoryEntityListing> getConfigurationSchemasEdgesVnextWithHttpInfo(Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/configuration/schemas/edges/vnext".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SchemaCategoryEntityListing>() {});
  }

  /**
   * Lists available schema categories (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SchemaCategoryEntityListing getConfigurationSchemasEdgesVnext(GetConfigurationSchemasEdgesVnextRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SchemaCategoryEntityListing>() {});
  }

  /**
   * Lists available schema categories (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SchemaCategoryEntityListing> getConfigurationSchemasEdgesVnext(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<SchemaCategoryEntityListing>invokeAPIVerbose(request, new TypeReference<SchemaCategoryEntityListing>() {});
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @param schemaCategory Schema category (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SchemaReferenceEntityListing
   * @throws ApiException if fails to make API call
   */
  public SchemaReferenceEntityListing getConfigurationSchemasEdgesVnextSchemaCategory(String schemaCategory, Integer pageSize, Integer pageNumber) throws ApiException {
    return getConfigurationSchemasEdgesVnextSchemaCategoryWithHttpInfo(schemaCategory, pageSize, pageNumber).getBody();
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @param schemaCategory Schema category (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SchemaReferenceEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SchemaReferenceEntityListing> getConfigurationSchemasEdgesVnextSchemaCategoryWithHttpInfo(String schemaCategory, Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'schemaCategory' is set
    if (schemaCategory == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaCategory' when calling getConfigurationSchemasEdgesVnextSchemaCategory");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/configuration/schemas/edges/vnext/{schemaCategory}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "schemaCategory" + "\\}", pcapiClient.escapeString(schemaCategory.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SchemaReferenceEntityListing>() {});
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SchemaReferenceEntityListing getConfigurationSchemasEdgesVnextSchemaCategory(GetConfigurationSchemasEdgesVnextSchemaCategoryRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SchemaReferenceEntityListing>() {});
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SchemaReferenceEntityListing> getConfigurationSchemasEdgesVnextSchemaCategory(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<SchemaReferenceEntityListing>invokeAPIVerbose(request, new TypeReference<SchemaReferenceEntityListing>() {});
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @param schemaCategory Schema category (required)
   * @param schemaType Schema type (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SchemaReferenceEntityListing
   * @throws ApiException if fails to make API call
   */
  public SchemaReferenceEntityListing getConfigurationSchemasEdgesVnextSchemaCategorySchemaType(String schemaCategory, String schemaType, Integer pageSize, Integer pageNumber) throws ApiException {
    return getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeWithHttpInfo(schemaCategory, schemaType, pageSize, pageNumber).getBody();
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @param schemaCategory Schema category (required)
   * @param schemaType Schema type (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SchemaReferenceEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SchemaReferenceEntityListing> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeWithHttpInfo(String schemaCategory, String schemaType, Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'schemaCategory' is set
    if (schemaCategory == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaCategory' when calling getConfigurationSchemasEdgesVnextSchemaCategorySchemaType");
    }
    
    // verify the required parameter 'schemaType' is set
    if (schemaType == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaType' when calling getConfigurationSchemasEdgesVnextSchemaCategorySchemaType");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "schemaCategory" + "\\}", pcapiClient.escapeString(schemaCategory.toString()))
      .replaceAll("\\{" + "schemaType" + "\\}", pcapiClient.escapeString(schemaType.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SchemaReferenceEntityListing>() {});
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SchemaReferenceEntityListing getConfigurationSchemasEdgesVnextSchemaCategorySchemaType(GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SchemaReferenceEntityListing>() {});
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SchemaReferenceEntityListing> getConfigurationSchemasEdgesVnextSchemaCategorySchemaType(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<SchemaReferenceEntityListing>invokeAPIVerbose(request, new TypeReference<SchemaReferenceEntityListing>() {});
  }

  /**
   * Get a json schema (Deprecated)
   * 
   * @param schemaCategory Schema category (required)
   * @param schemaType Schema type (required)
   * @param schemaId Schema ID (required)
   * @return Organization
   * @throws ApiException if fails to make API call
   */
  public Organization getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId(String schemaCategory, String schemaType, String schemaId) throws ApiException {
    return getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdWithHttpInfo(schemaCategory, schemaType, schemaId).getBody();
  }

  /**
   * Get a json schema (Deprecated)
   * 
   * @param schemaCategory Schema category (required)
   * @param schemaType Schema type (required)
   * @param schemaId Schema ID (required)
   * @return Organization
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Organization> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdWithHttpInfo(String schemaCategory, String schemaType, String schemaId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'schemaCategory' is set
    if (schemaCategory == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaCategory' when calling getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId");
    }
    
    // verify the required parameter 'schemaType' is set
    if (schemaType == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaType' when calling getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId");
    }
    
    // verify the required parameter 'schemaId' is set
    if (schemaId == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaId' when calling getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}/{schemaId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "schemaCategory" + "\\}", pcapiClient.escapeString(schemaCategory.toString()))
      .replaceAll("\\{" + "schemaType" + "\\}", pcapiClient.escapeString(schemaType.toString()))
      .replaceAll("\\{" + "schemaId" + "\\}", pcapiClient.escapeString(schemaId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Organization>() {});
  }

  /**
   * Get a json schema (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Organization getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId(GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Organization>() {});
  }

  /**
   * Get a json schema (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Organization> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Organization>invokeAPIVerbose(request, new TypeReference<Organization>() {});
  }

  /**
   * Get metadata for a schema (Deprecated)
   * 
   * @param schemaCategory Schema category (required)
   * @param schemaType Schema type (required)
   * @param schemaId Schema ID (required)
   * @param extensionType extension (required)
   * @param metadataId Metadata ID (required)
   * @param type Type (optional)
   * @return Organization
   * @throws ApiException if fails to make API call
   */
  public Organization getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId(String schemaCategory, String schemaType, String schemaId, String extensionType, String metadataId, String type) throws ApiException {
    return getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdWithHttpInfo(schemaCategory, schemaType, schemaId, extensionType, metadataId, type).getBody();
  }

  /**
   * Get metadata for a schema (Deprecated)
   * 
   * @param schemaCategory Schema category (required)
   * @param schemaType Schema type (required)
   * @param schemaId Schema ID (required)
   * @param extensionType extension (required)
   * @param metadataId Metadata ID (required)
   * @param type Type (optional)
   * @return Organization
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Organization> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdWithHttpInfo(String schemaCategory, String schemaType, String schemaId, String extensionType, String metadataId, String type) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'schemaCategory' is set
    if (schemaCategory == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaCategory' when calling getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId");
    }
    
    // verify the required parameter 'schemaType' is set
    if (schemaType == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaType' when calling getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId");
    }
    
    // verify the required parameter 'schemaId' is set
    if (schemaId == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaId' when calling getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId");
    }
    
    // verify the required parameter 'extensionType' is set
    if (extensionType == null) {
      throw new ApiException(400, "Missing the required parameter 'extensionType' when calling getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId");
    }
    
    // verify the required parameter 'metadataId' is set
    if (metadataId == null) {
      throw new ApiException(400, "Missing the required parameter 'metadataId' when calling getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}/{schemaId}/{extensionType}/{metadataId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "schemaCategory" + "\\}", pcapiClient.escapeString(schemaCategory.toString()))
      .replaceAll("\\{" + "schemaType" + "\\}", pcapiClient.escapeString(schemaType.toString()))
      .replaceAll("\\{" + "schemaId" + "\\}", pcapiClient.escapeString(schemaId.toString()))
      .replaceAll("\\{" + "extensionType" + "\\}", pcapiClient.escapeString(extensionType.toString()))
      .replaceAll("\\{" + "metadataId" + "\\}", pcapiClient.escapeString(metadataId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "type", type));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Organization>() {});
  }

  /**
   * Get metadata for a schema (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Organization getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId(GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Organization>() {});
  }

  /**
   * Get metadata for a schema (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Organization> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Organization>invokeAPIVerbose(request, new TypeReference<Organization>() {});
  }

  /**
   * Get edge.
   * 
   * @param edgeId Edge ID (required)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @return Edge
   * @throws ApiException if fails to make API call
   */
  public Edge getTelephonyProvidersEdge(String edgeId, List<String> expand) throws ApiException {
    return getTelephonyProvidersEdgeWithHttpInfo(edgeId, expand).getBody();
  }

  /**
   * Get edge.
   * 
   * @param edgeId Edge ID (required)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @return Edge
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Edge> getTelephonyProvidersEdgeWithHttpInfo(String edgeId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling getTelephonyProvidersEdge");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Edge>() {});
  }

  /**
   * Get edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Edge getTelephonyProvidersEdge(GetTelephonyProvidersEdgeRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Edge>() {});
  }

  /**
   * Get edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Edge> getTelephonyProvidersEdge(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Edge>invokeAPIVerbose(request, new TypeReference<Edge>() {});
  }

  /**
   * Get line
   * 
   * @param edgeId Edge ID (required)
   * @param lineId Line ID (required)
   * @return EdgeLine
   * @throws ApiException if fails to make API call
   */
  public EdgeLine getTelephonyProvidersEdgeLine(String edgeId, String lineId) throws ApiException {
    return getTelephonyProvidersEdgeLineWithHttpInfo(edgeId, lineId).getBody();
  }

  /**
   * Get line
   * 
   * @param edgeId Edge ID (required)
   * @param lineId Line ID (required)
   * @return EdgeLine
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeLine> getTelephonyProvidersEdgeLineWithHttpInfo(String edgeId, String lineId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling getTelephonyProvidersEdgeLine");
    }
    
    // verify the required parameter 'lineId' is set
    if (lineId == null) {
      throw new ApiException(400, "Missing the required parameter 'lineId' when calling getTelephonyProvidersEdgeLine");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/lines/{lineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()))
      .replaceAll("\\{" + "lineId" + "\\}", pcapiClient.escapeString(lineId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeLine>() {});
  }

  /**
   * Get line
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeLine getTelephonyProvidersEdgeLine(GetTelephonyProvidersEdgeLineRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeLine>() {});
  }

  /**
   * Get line
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeLine> getTelephonyProvidersEdgeLine(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EdgeLine>invokeAPIVerbose(request, new TypeReference<EdgeLine>() {});
  }

  /**
   * Get the list of lines.
   * 
   * @param edgeId Edge ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return EdgeLineEntityListing
   * @throws ApiException if fails to make API call
   */
  public EdgeLineEntityListing getTelephonyProvidersEdgeLines(String edgeId, Integer pageSize, Integer pageNumber) throws ApiException {
    return getTelephonyProvidersEdgeLinesWithHttpInfo(edgeId, pageSize, pageNumber).getBody();
  }

  /**
   * Get the list of lines.
   * 
   * @param edgeId Edge ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return EdgeLineEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeLineEntityListing> getTelephonyProvidersEdgeLinesWithHttpInfo(String edgeId, Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling getTelephonyProvidersEdgeLines");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/lines".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeLineEntityListing>() {});
  }

  /**
   * Get the list of lines.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeLineEntityListing getTelephonyProvidersEdgeLines(GetTelephonyProvidersEdgeLinesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeLineEntityListing>() {});
  }

  /**
   * Get the list of lines.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeLineEntityListing> getTelephonyProvidersEdgeLines(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EdgeLineEntityListing>invokeAPIVerbose(request, new TypeReference<EdgeLineEntityListing>() {});
  }

  /**
   * Get an edge logical interface
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @param expand Field to expand in the response (optional)
   * @return DomainLogicalInterface
   * @throws ApiException if fails to make API call
   */
  public DomainLogicalInterface getTelephonyProvidersEdgeLogicalinterface(String edgeId, String interfaceId, List<String> expand) throws ApiException {
    return getTelephonyProvidersEdgeLogicalinterfaceWithHttpInfo(edgeId, interfaceId, expand).getBody();
  }

  /**
   * Get an edge logical interface
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @param expand Field to expand in the response (optional)
   * @return DomainLogicalInterface
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainLogicalInterface> getTelephonyProvidersEdgeLogicalinterfaceWithHttpInfo(String edgeId, String interfaceId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling getTelephonyProvidersEdgeLogicalinterface");
    }
    
    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'interfaceId' when calling getTelephonyProvidersEdgeLogicalinterface");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()))
      .replaceAll("\\{" + "interfaceId" + "\\}", pcapiClient.escapeString(interfaceId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainLogicalInterface>() {});
  }

  /**
   * Get an edge logical interface
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainLogicalInterface getTelephonyProvidersEdgeLogicalinterface(GetTelephonyProvidersEdgeLogicalinterfaceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainLogicalInterface>() {});
  }

  /**
   * Get an edge logical interface
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainLogicalInterface> getTelephonyProvidersEdgeLogicalinterface(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DomainLogicalInterface>invokeAPIVerbose(request, new TypeReference<DomainLogicalInterface>() {});
  }

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @param edgeId Edge ID (required)
   * @param expand Field to expand in the response (optional)
   * @return LogicalInterfaceEntityListing
   * @throws ApiException if fails to make API call
   */
  public LogicalInterfaceEntityListing getTelephonyProvidersEdgeLogicalinterfaces(String edgeId, List<String> expand) throws ApiException {
    return getTelephonyProvidersEdgeLogicalinterfacesWithHttpInfo(edgeId, expand).getBody();
  }

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @param edgeId Edge ID (required)
   * @param expand Field to expand in the response (optional)
   * @return LogicalInterfaceEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogicalInterfaceEntityListing> getTelephonyProvidersEdgeLogicalinterfacesWithHttpInfo(String edgeId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling getTelephonyProvidersEdgeLogicalinterfaces");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LogicalInterfaceEntityListing>() {});
  }

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LogicalInterfaceEntityListing getTelephonyProvidersEdgeLogicalinterfaces(GetTelephonyProvidersEdgeLogicalinterfacesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LogicalInterfaceEntityListing>() {});
  }

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogicalInterfaceEntityListing> getTelephonyProvidersEdgeLogicalinterfaces(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<LogicalInterfaceEntityListing>invokeAPIVerbose(request, new TypeReference<LogicalInterfaceEntityListing>() {});
  }

  /**
   * Get an Edge logs job.
   * 
   * @param edgeId Edge ID (required)
   * @param jobId Job ID (required)
   * @return EdgeLogsJob
   * @throws ApiException if fails to make API call
   */
  public EdgeLogsJob getTelephonyProvidersEdgeLogsJob(String edgeId, String jobId) throws ApiException {
    return getTelephonyProvidersEdgeLogsJobWithHttpInfo(edgeId, jobId).getBody();
  }

  /**
   * Get an Edge logs job.
   * 
   * @param edgeId Edge ID (required)
   * @param jobId Job ID (required)
   * @return EdgeLogsJob
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeLogsJob> getTelephonyProvidersEdgeLogsJobWithHttpInfo(String edgeId, String jobId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling getTelephonyProvidersEdgeLogsJob");
    }
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getTelephonyProvidersEdgeLogsJob");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/logs/jobs/{jobId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()))
      .replaceAll("\\{" + "jobId" + "\\}", pcapiClient.escapeString(jobId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeLogsJob>() {});
  }

  /**
   * Get an Edge logs job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeLogsJob getTelephonyProvidersEdgeLogsJob(GetTelephonyProvidersEdgeLogsJobRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeLogsJob>() {});
  }

  /**
   * Get an Edge logs job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeLogsJob> getTelephonyProvidersEdgeLogsJob(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EdgeLogsJob>invokeAPIVerbose(request, new TypeReference<EdgeLogsJob>() {});
  }

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @return DomainPhysicalInterface
   * @throws ApiException if fails to make API call
   */
  public DomainPhysicalInterface getTelephonyProvidersEdgePhysicalinterface(String edgeId, String interfaceId) throws ApiException {
    return getTelephonyProvidersEdgePhysicalinterfaceWithHttpInfo(edgeId, interfaceId).getBody();
  }

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @return DomainPhysicalInterface
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainPhysicalInterface> getTelephonyProvidersEdgePhysicalinterfaceWithHttpInfo(String edgeId, String interfaceId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling getTelephonyProvidersEdgePhysicalinterface");
    }
    
    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'interfaceId' when calling getTelephonyProvidersEdgePhysicalinterface");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/physicalinterfaces/{interfaceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()))
      .replaceAll("\\{" + "interfaceId" + "\\}", pcapiClient.escapeString(interfaceId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainPhysicalInterface>() {});
  }

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainPhysicalInterface getTelephonyProvidersEdgePhysicalinterface(GetTelephonyProvidersEdgePhysicalinterfaceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainPhysicalInterface>() {});
  }

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainPhysicalInterface> getTelephonyProvidersEdgePhysicalinterface(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DomainPhysicalInterface>invokeAPIVerbose(request, new TypeReference<DomainPhysicalInterface>() {});
  }

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @param edgeId Edge ID (required)
   * @return PhysicalInterfaceEntityListing
   * @throws ApiException if fails to make API call
   */
  public PhysicalInterfaceEntityListing getTelephonyProvidersEdgePhysicalinterfaces(String edgeId) throws ApiException {
    return getTelephonyProvidersEdgePhysicalinterfacesWithHttpInfo(edgeId).getBody();
  }

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @param edgeId Edge ID (required)
   * @return PhysicalInterfaceEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhysicalInterfaceEntityListing> getTelephonyProvidersEdgePhysicalinterfacesWithHttpInfo(String edgeId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling getTelephonyProvidersEdgePhysicalinterfaces");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/physicalinterfaces".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PhysicalInterfaceEntityListing>() {});
  }

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PhysicalInterfaceEntityListing getTelephonyProvidersEdgePhysicalinterfaces(GetTelephonyProvidersEdgePhysicalinterfacesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PhysicalInterfaceEntityListing>() {});
  }

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhysicalInterfaceEntityListing> getTelephonyProvidersEdgePhysicalinterfaces(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<PhysicalInterfaceEntityListing>invokeAPIVerbose(request, new TypeReference<PhysicalInterfaceEntityListing>() {});
  }

  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @param edgeId Edge ID (required)
   * @return VmPairingInfo
   * @throws ApiException if fails to make API call
   */
  public VmPairingInfo getTelephonyProvidersEdgeSetuppackage(String edgeId) throws ApiException {
    return getTelephonyProvidersEdgeSetuppackageWithHttpInfo(edgeId).getBody();
  }

  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @param edgeId Edge ID (required)
   * @return VmPairingInfo
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VmPairingInfo> getTelephonyProvidersEdgeSetuppackageWithHttpInfo(String edgeId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling getTelephonyProvidersEdgeSetuppackage");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/setuppackage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VmPairingInfo>() {});
  }

  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VmPairingInfo getTelephonyProvidersEdgeSetuppackage(GetTelephonyProvidersEdgeSetuppackageRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VmPairingInfo>() {});
  }

  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VmPairingInfo> getTelephonyProvidersEdgeSetuppackage(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<VmPairingInfo>invokeAPIVerbose(request, new TypeReference<VmPairingInfo>() {});
  }

  /**
   * Gets software update status information about any edge.
   * 
   * @param edgeId Edge ID (required)
   * @return DomainEdgeSoftwareUpdateDto
   * @throws ApiException if fails to make API call
   */
  public DomainEdgeSoftwareUpdateDto getTelephonyProvidersEdgeSoftwareupdate(String edgeId) throws ApiException {
    return getTelephonyProvidersEdgeSoftwareupdateWithHttpInfo(edgeId).getBody();
  }

  /**
   * Gets software update status information about any edge.
   * 
   * @param edgeId Edge ID (required)
   * @return DomainEdgeSoftwareUpdateDto
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainEdgeSoftwareUpdateDto> getTelephonyProvidersEdgeSoftwareupdateWithHttpInfo(String edgeId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling getTelephonyProvidersEdgeSoftwareupdate");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/softwareupdate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainEdgeSoftwareUpdateDto>() {});
  }

  /**
   * Gets software update status information about any edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainEdgeSoftwareUpdateDto getTelephonyProvidersEdgeSoftwareupdate(GetTelephonyProvidersEdgeSoftwareupdateRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainEdgeSoftwareUpdateDto>() {});
  }

  /**
   * Gets software update status information about any edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainEdgeSoftwareUpdateDto> getTelephonyProvidersEdgeSoftwareupdate(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DomainEdgeSoftwareUpdateDto>invokeAPIVerbose(request, new TypeReference<DomainEdgeSoftwareUpdateDto>() {});
  }

  /**
   * Gets all the available software versions for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @return DomainEdgeSoftwareVersionDtoEntityListing
   * @throws ApiException if fails to make API call
   */
  public DomainEdgeSoftwareVersionDtoEntityListing getTelephonyProvidersEdgeSoftwareversions(String edgeId) throws ApiException {
    return getTelephonyProvidersEdgeSoftwareversionsWithHttpInfo(edgeId).getBody();
  }

  /**
   * Gets all the available software versions for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @return DomainEdgeSoftwareVersionDtoEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing> getTelephonyProvidersEdgeSoftwareversionsWithHttpInfo(String edgeId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling getTelephonyProvidersEdgeSoftwareversions");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/softwareversions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainEdgeSoftwareVersionDtoEntityListing>() {});
  }

  /**
   * Gets all the available software versions for this edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainEdgeSoftwareVersionDtoEntityListing getTelephonyProvidersEdgeSoftwareversions(GetTelephonyProvidersEdgeSoftwareversionsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainEdgeSoftwareVersionDtoEntityListing>() {});
  }

  /**
   * Gets all the available software versions for this edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing> getTelephonyProvidersEdgeSoftwareversions(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DomainEdgeSoftwareVersionDtoEntityListing>invokeAPIVerbose(request, new TypeReference<DomainEdgeSoftwareVersionDtoEntityListing>() {});
  }

  /**
   * Get the list of edges.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param siteId Filter by site.id (optional)
   * @param edgeGroupId Filter by edgeGroup.id (optional)
   * @param sortBy Sort by (optional, default to name)
   * @param managed Filter by managed (optional)
   * @return EdgeEntityListing
   * @throws ApiException if fails to make API call
   */
  public EdgeEntityListing getTelephonyProvidersEdges(Integer pageSize, Integer pageNumber, String name, String siteId, String edgeGroupId, String sortBy, Boolean managed) throws ApiException {
    return getTelephonyProvidersEdgesWithHttpInfo(pageSize, pageNumber, name, siteId, edgeGroupId, sortBy, managed).getBody();
  }

  /**
   * Get the list of edges.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param siteId Filter by site.id (optional)
   * @param edgeGroupId Filter by edgeGroup.id (optional)
   * @param sortBy Sort by (optional, default to name)
   * @param managed Filter by managed (optional)
   * @return EdgeEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeEntityListing> getTelephonyProvidersEdgesWithHttpInfo(Integer pageSize, Integer pageNumber, String name, String siteId, String edgeGroupId, String sortBy, Boolean managed) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "site.id", siteId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "edgeGroup.id", edgeGroupId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "managed", managed));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeEntityListing>() {});
  }

  /**
   * Get the list of edges.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeEntityListing getTelephonyProvidersEdges(GetTelephonyProvidersEdgesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeEntityListing>() {});
  }

  /**
   * Get the list of edges.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeEntityListing> getTelephonyProvidersEdges(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EdgeEntityListing>invokeAPIVerbose(request, new TypeReference<EdgeEntityListing>() {});
  }

  /**
   * Get the list of available languages.
   * 
   * @return AvailableLanguageList
   * @throws ApiException if fails to make API call
   */
  public AvailableLanguageList getTelephonyProvidersEdgesAvailablelanguages() throws ApiException {
    return getTelephonyProvidersEdgesAvailablelanguagesWithHttpInfo().getBody();
  }

  /**
   * Get the list of available languages.
   * 
   * @return AvailableLanguageList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AvailableLanguageList> getTelephonyProvidersEdgesAvailablelanguagesWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/availablelanguages".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AvailableLanguageList>() {});
  }

  /**
   * Get the list of available languages.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AvailableLanguageList getTelephonyProvidersEdgesAvailablelanguages(GetTelephonyProvidersEdgesAvailablelanguagesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AvailableLanguageList>() {});
  }

  /**
   * Get the list of available languages.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AvailableLanguageList> getTelephonyProvidersEdgesAvailablelanguages(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<AvailableLanguageList>invokeAPIVerbose(request, new TypeReference<AvailableLanguageList>() {});
  }

  /**
   * Get the list of certificate authorities.
   * 
   * @return CertificateAuthorityEntityListing
   * @throws ApiException if fails to make API call
   */
  public CertificateAuthorityEntityListing getTelephonyProvidersEdgesCertificateauthorities() throws ApiException {
    return getTelephonyProvidersEdgesCertificateauthoritiesWithHttpInfo().getBody();
  }

  /**
   * Get the list of certificate authorities.
   * 
   * @return CertificateAuthorityEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CertificateAuthorityEntityListing> getTelephonyProvidersEdgesCertificateauthoritiesWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/certificateauthorities".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CertificateAuthorityEntityListing>() {});
  }

  /**
   * Get the list of certificate authorities.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CertificateAuthorityEntityListing getTelephonyProvidersEdgesCertificateauthorities(GetTelephonyProvidersEdgesCertificateauthoritiesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CertificateAuthorityEntityListing>() {});
  }

  /**
   * Get the list of certificate authorities.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CertificateAuthorityEntityListing> getTelephonyProvidersEdgesCertificateauthorities(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<CertificateAuthorityEntityListing>invokeAPIVerbose(request, new TypeReference<CertificateAuthorityEntityListing>() {});
  }

  /**
   * Get a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @return DomainCertificateAuthority
   * @throws ApiException if fails to make API call
   */
  public DomainCertificateAuthority getTelephonyProvidersEdgesCertificateauthority(String certificateId) throws ApiException {
    return getTelephonyProvidersEdgesCertificateauthorityWithHttpInfo(certificateId).getBody();
  }

  /**
   * Get a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @return DomainCertificateAuthority
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainCertificateAuthority> getTelephonyProvidersEdgesCertificateauthorityWithHttpInfo(String certificateId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'certificateId' is set
    if (certificateId == null) {
      throw new ApiException(400, "Missing the required parameter 'certificateId' when calling getTelephonyProvidersEdgesCertificateauthority");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/certificateauthorities/{certificateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "certificateId" + "\\}", pcapiClient.escapeString(certificateId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainCertificateAuthority>() {});
  }

  /**
   * Get a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainCertificateAuthority getTelephonyProvidersEdgesCertificateauthority(GetTelephonyProvidersEdgesCertificateauthorityRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainCertificateAuthority>() {});
  }

  /**
   * Get a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainCertificateAuthority> getTelephonyProvidersEdgesCertificateauthority(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DomainCertificateAuthority>invokeAPIVerbose(request, new TypeReference<DomainCertificateAuthority>() {});
  }

  /**
   * Get a DID by ID.
   * 
   * @param didId DID ID (required)
   * @return DID
   * @throws ApiException if fails to make API call
   */
  public DID getTelephonyProvidersEdgesDid(String didId) throws ApiException {
    return getTelephonyProvidersEdgesDidWithHttpInfo(didId).getBody();
  }

  /**
   * Get a DID by ID.
   * 
   * @param didId DID ID (required)
   * @return DID
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DID> getTelephonyProvidersEdgesDidWithHttpInfo(String didId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'didId' is set
    if (didId == null) {
      throw new ApiException(400, "Missing the required parameter 'didId' when calling getTelephonyProvidersEdgesDid");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/dids/{didId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "didId" + "\\}", pcapiClient.escapeString(didId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DID>() {});
  }

  /**
   * Get a DID by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DID getTelephonyProvidersEdgesDid(GetTelephonyProvidersEdgesDidRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DID>() {});
  }

  /**
   * Get a DID by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DID> getTelephonyProvidersEdgesDid(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DID>invokeAPIVerbose(request, new TypeReference<DID>() {});
  }

  /**
   * Get a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @return DIDPool
   * @throws ApiException if fails to make API call
   */
  public DIDPool getTelephonyProvidersEdgesDidpool(String didPoolId) throws ApiException {
    return getTelephonyProvidersEdgesDidpoolWithHttpInfo(didPoolId).getBody();
  }

  /**
   * Get a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @return DIDPool
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DIDPool> getTelephonyProvidersEdgesDidpoolWithHttpInfo(String didPoolId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'didPoolId' is set
    if (didPoolId == null) {
      throw new ApiException(400, "Missing the required parameter 'didPoolId' when calling getTelephonyProvidersEdgesDidpool");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/didpools/{didPoolId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "didPoolId" + "\\}", pcapiClient.escapeString(didPoolId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DIDPool>() {});
  }

  /**
   * Get a DID Pool by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DIDPool getTelephonyProvidersEdgesDidpool(GetTelephonyProvidersEdgesDidpoolRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DIDPool>() {});
  }

  /**
   * Get a DID Pool by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DIDPool> getTelephonyProvidersEdgesDidpool(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DIDPool>invokeAPIVerbose(request, new TypeReference<DIDPool>() {});
  }

  /**
   * Get a listing of DID Pools
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @return DIDPoolEntityListing
   * @throws ApiException if fails to make API call
   */
  public DIDPoolEntityListing getTelephonyProvidersEdgesDidpools(Integer pageSize, Integer pageNumber, String sortBy) throws ApiException {
    return getTelephonyProvidersEdgesDidpoolsWithHttpInfo(pageSize, pageNumber, sortBy).getBody();
  }

  /**
   * Get a listing of DID Pools
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @return DIDPoolEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DIDPoolEntityListing> getTelephonyProvidersEdgesDidpoolsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/didpools".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DIDPoolEntityListing>() {});
  }

  /**
   * Get a listing of DID Pools
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DIDPoolEntityListing getTelephonyProvidersEdgesDidpools(GetTelephonyProvidersEdgesDidpoolsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DIDPoolEntityListing>() {});
  }

  /**
   * Get a listing of DID Pools
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DIDPoolEntityListing> getTelephonyProvidersEdgesDidpools(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DIDPoolEntityListing>invokeAPIVerbose(request, new TypeReference<DIDPoolEntityListing>() {});
  }

  /**
   * Get a listing of DIDs
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param phoneNumber Filter by phoneNumber (optional)
   * @return DIDEntityListing
   * @throws ApiException if fails to make API call
   */
  public DIDEntityListing getTelephonyProvidersEdgesDids(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String phoneNumber) throws ApiException {
    return getTelephonyProvidersEdgesDidsWithHttpInfo(pageSize, pageNumber, sortBy, sortOrder, phoneNumber).getBody();
  }

  /**
   * Get a listing of DIDs
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param phoneNumber Filter by phoneNumber (optional)
   * @return DIDEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DIDEntityListing> getTelephonyProvidersEdgesDidsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String phoneNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/dids".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "phoneNumber", phoneNumber));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DIDEntityListing>() {});
  }

  /**
   * Get a listing of DIDs
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DIDEntityListing getTelephonyProvidersEdgesDids(GetTelephonyProvidersEdgesDidsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DIDEntityListing>() {});
  }

  /**
   * Get a listing of DIDs
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DIDEntityListing> getTelephonyProvidersEdgesDids(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DIDEntityListing>invokeAPIVerbose(request, new TypeReference<DIDEntityListing>() {});
  }

  /**
   * Get edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @param expand Fields to expand in the response (optional)
   * @return EdgeGroup
   * @throws ApiException if fails to make API call
   */
  public EdgeGroup getTelephonyProvidersEdgesEdgegroup(String edgeGroupId, List<String> expand) throws ApiException {
    return getTelephonyProvidersEdgesEdgegroupWithHttpInfo(edgeGroupId, expand).getBody();
  }

  /**
   * Get edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @param expand Fields to expand in the response (optional)
   * @return EdgeGroup
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeGroup> getTelephonyProvidersEdgesEdgegroupWithHttpInfo(String edgeGroupId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeGroupId' is set
    if (edgeGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeGroupId' when calling getTelephonyProvidersEdgesEdgegroup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/edgegroups/{edgeGroupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeGroupId" + "\\}", pcapiClient.escapeString(edgeGroupId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeGroup>() {});
  }

  /**
   * Get edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeGroup getTelephonyProvidersEdgesEdgegroup(GetTelephonyProvidersEdgesEdgegroupRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeGroup>() {});
  }

  /**
   * Get edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeGroup> getTelephonyProvidersEdgesEdgegroup(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EdgeGroup>invokeAPIVerbose(request, new TypeReference<EdgeGroup>() {});
  }

  /**
   * Gets the edge trunk base associated with the edge group
   * 
   * @param edgegroupId Edge Group ID (required)
   * @param edgetrunkbaseId Edge Trunk Base ID (required)
   * @return EdgeTrunkBase
   * @throws ApiException if fails to make API call
   */
  public EdgeTrunkBase getTelephonyProvidersEdgesEdgegroupEdgetrunkbasis(String edgegroupId, String edgetrunkbaseId) throws ApiException {
    return getTelephonyProvidersEdgesEdgegroupEdgetrunkbasisWithHttpInfo(edgegroupId, edgetrunkbaseId).getBody();
  }

  /**
   * Gets the edge trunk base associated with the edge group
   * 
   * @param edgegroupId Edge Group ID (required)
   * @param edgetrunkbaseId Edge Trunk Base ID (required)
   * @return EdgeTrunkBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeTrunkBase> getTelephonyProvidersEdgesEdgegroupEdgetrunkbasisWithHttpInfo(String edgegroupId, String edgetrunkbaseId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgegroupId' is set
    if (edgegroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgegroupId' when calling getTelephonyProvidersEdgesEdgegroupEdgetrunkbasis");
    }
    
    // verify the required parameter 'edgetrunkbaseId' is set
    if (edgetrunkbaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgetrunkbaseId' when calling getTelephonyProvidersEdgesEdgegroupEdgetrunkbasis");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/edgegroups/{edgegroupId}/edgetrunkbases/{edgetrunkbaseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgegroupId" + "\\}", pcapiClient.escapeString(edgegroupId.toString()))
      .replaceAll("\\{" + "edgetrunkbaseId" + "\\}", pcapiClient.escapeString(edgetrunkbaseId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeTrunkBase>() {});
  }

  /**
   * Gets the edge trunk base associated with the edge group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeTrunkBase getTelephonyProvidersEdgesEdgegroupEdgetrunkbasis(GetTelephonyProvidersEdgesEdgegroupEdgetrunkbasisRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeTrunkBase>() {});
  }

  /**
   * Gets the edge trunk base associated with the edge group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeTrunkBase> getTelephonyProvidersEdgesEdgegroupEdgetrunkbasis(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EdgeTrunkBase>invokeAPIVerbose(request, new TypeReference<EdgeTrunkBase>() {});
  }

  /**
   * Get the list of edge groups.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Sort by (optional, default to name)
   * @param managed Filter by managed (optional)
   * @return EdgeGroupEntityListing
   * @throws ApiException if fails to make API call
   */
  public EdgeGroupEntityListing getTelephonyProvidersEdgesEdgegroups(Integer pageSize, Integer pageNumber, String name, String sortBy, Boolean managed) throws ApiException {
    return getTelephonyProvidersEdgesEdgegroupsWithHttpInfo(pageSize, pageNumber, name, sortBy, managed).getBody();
  }

  /**
   * Get the list of edge groups.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Sort by (optional, default to name)
   * @param managed Filter by managed (optional)
   * @return EdgeGroupEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeGroupEntityListing> getTelephonyProvidersEdgesEdgegroupsWithHttpInfo(Integer pageSize, Integer pageNumber, String name, String sortBy, Boolean managed) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/edgegroups".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "managed", managed));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeGroupEntityListing>() {});
  }

  /**
   * Get the list of edge groups.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeGroupEntityListing getTelephonyProvidersEdgesEdgegroups(GetTelephonyProvidersEdgesEdgegroupsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeGroupEntityListing>() {});
  }

  /**
   * Get the list of edge groups.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeGroupEntityListing> getTelephonyProvidersEdgesEdgegroups(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EdgeGroupEntityListing>invokeAPIVerbose(request, new TypeReference<EdgeGroupEntityListing>() {});
  }

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @return EdgeVersionReport
   * @throws ApiException if fails to make API call
   */
  public EdgeVersionReport getTelephonyProvidersEdgesEdgeversionreport() throws ApiException {
    return getTelephonyProvidersEdgesEdgeversionreportWithHttpInfo().getBody();
  }

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @return EdgeVersionReport
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeVersionReport> getTelephonyProvidersEdgesEdgeversionreportWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/edgeversionreport".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeVersionReport>() {});
  }

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeVersionReport getTelephonyProvidersEdgesEdgeversionreport(GetTelephonyProvidersEdgesEdgeversionreportRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeVersionReport>() {});
  }

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeVersionReport> getTelephonyProvidersEdgesEdgeversionreport(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EdgeVersionReport>invokeAPIVerbose(request, new TypeReference<EdgeVersionReport>() {});
  }

  /**
   * Get endpoint
   * 
   * @param endpointId Endpoint ID (required)
   * @return Endpoint
   * @throws ApiException if fails to make API call
   */
  public Endpoint getTelephonyProvidersEdgesEndpoint(String endpointId) throws ApiException {
    return getTelephonyProvidersEdgesEndpointWithHttpInfo(endpointId).getBody();
  }

  /**
   * Get endpoint
   * 
   * @param endpointId Endpoint ID (required)
   * @return Endpoint
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Endpoint> getTelephonyProvidersEdgesEndpointWithHttpInfo(String endpointId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling getTelephonyProvidersEdgesEndpoint");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/endpoints/{endpointId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "endpointId" + "\\}", pcapiClient.escapeString(endpointId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Endpoint>() {});
  }

  /**
   * Get endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Endpoint getTelephonyProvidersEdgesEndpoint(GetTelephonyProvidersEdgesEndpointRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Endpoint>() {});
  }

  /**
   * Get endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Endpoint> getTelephonyProvidersEdgesEndpoint(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Endpoint>invokeAPIVerbose(request, new TypeReference<Endpoint>() {});
  }

  /**
   * Get endpoints
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return EndpointEntityListing
   * @throws ApiException if fails to make API call
   */
  public EndpointEntityListing getTelephonyProvidersEdgesEndpoints(Integer pageSize, Integer pageNumber, String name, String sortBy) throws ApiException {
    return getTelephonyProvidersEdgesEndpointsWithHttpInfo(pageSize, pageNumber, name, sortBy).getBody();
  }

  /**
   * Get endpoints
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return EndpointEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointEntityListing> getTelephonyProvidersEdgesEndpointsWithHttpInfo(Integer pageSize, Integer pageNumber, String name, String sortBy) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/endpoints".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EndpointEntityListing>() {});
  }

  /**
   * Get endpoints
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EndpointEntityListing getTelephonyProvidersEdgesEndpoints(GetTelephonyProvidersEdgesEndpointsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EndpointEntityListing>() {});
  }

  /**
   * Get endpoints
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointEntityListing> getTelephonyProvidersEdgesEndpoints(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<EndpointEntityListing>invokeAPIVerbose(request, new TypeReference<EndpointEntityListing>() {});
  }

  /**
   * Get an extension by ID.
   * 
   * @param extensionId Extension ID (required)
   * @return Extension
   * @throws ApiException if fails to make API call
   */
  public Extension getTelephonyProvidersEdgesExtension(String extensionId) throws ApiException {
    return getTelephonyProvidersEdgesExtensionWithHttpInfo(extensionId).getBody();
  }

  /**
   * Get an extension by ID.
   * 
   * @param extensionId Extension ID (required)
   * @return Extension
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Extension> getTelephonyProvidersEdgesExtensionWithHttpInfo(String extensionId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'extensionId' is set
    if (extensionId == null) {
      throw new ApiException(400, "Missing the required parameter 'extensionId' when calling getTelephonyProvidersEdgesExtension");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/extensions/{extensionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "extensionId" + "\\}", pcapiClient.escapeString(extensionId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Extension>() {});
  }

  /**
   * Get an extension by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Extension getTelephonyProvidersEdgesExtension(GetTelephonyProvidersEdgesExtensionRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Extension>() {});
  }

  /**
   * Get an extension by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Extension> getTelephonyProvidersEdgesExtension(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Extension>invokeAPIVerbose(request, new TypeReference<Extension>() {});
  }

  /**
   * Get an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @return ExtensionPool
   * @throws ApiException if fails to make API call
   */
  public ExtensionPool getTelephonyProvidersEdgesExtensionpool(String extensionPoolId) throws ApiException {
    return getTelephonyProvidersEdgesExtensionpoolWithHttpInfo(extensionPoolId).getBody();
  }

  /**
   * Get an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @return ExtensionPool
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExtensionPool> getTelephonyProvidersEdgesExtensionpoolWithHttpInfo(String extensionPoolId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'extensionPoolId' is set
    if (extensionPoolId == null) {
      throw new ApiException(400, "Missing the required parameter 'extensionPoolId' when calling getTelephonyProvidersEdgesExtensionpool");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/extensionpools/{extensionPoolId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "extensionPoolId" + "\\}", pcapiClient.escapeString(extensionPoolId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExtensionPool>() {});
  }

  /**
   * Get an extension pool by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExtensionPool getTelephonyProvidersEdgesExtensionpool(GetTelephonyProvidersEdgesExtensionpoolRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExtensionPool>() {});
  }

  /**
   * Get an extension pool by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExtensionPool> getTelephonyProvidersEdgesExtensionpool(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<ExtensionPool>invokeAPIVerbose(request, new TypeReference<ExtensionPool>() {});
  }

  /**
   * Get a listing of extension pools
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to startNumber)
   * @param number Number (optional)
   * @return ExtensionPoolEntityListing
   * @throws ApiException if fails to make API call
   */
  public ExtensionPoolEntityListing getTelephonyProvidersEdgesExtensionpools(Integer pageSize, Integer pageNumber, String sortBy, String number) throws ApiException {
    return getTelephonyProvidersEdgesExtensionpoolsWithHttpInfo(pageSize, pageNumber, sortBy, number).getBody();
  }

  /**
   * Get a listing of extension pools
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to startNumber)
   * @param number Number (optional)
   * @return ExtensionPoolEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExtensionPoolEntityListing> getTelephonyProvidersEdgesExtensionpoolsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String number) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/extensionpools".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "number", number));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExtensionPoolEntityListing>() {});
  }

  /**
   * Get a listing of extension pools
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExtensionPoolEntityListing getTelephonyProvidersEdgesExtensionpools(GetTelephonyProvidersEdgesExtensionpoolsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExtensionPoolEntityListing>() {});
  }

  /**
   * Get a listing of extension pools
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExtensionPoolEntityListing> getTelephonyProvidersEdgesExtensionpools(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<ExtensionPoolEntityListing>invokeAPIVerbose(request, new TypeReference<ExtensionPoolEntityListing>() {});
  }

  /**
   * Get a listing of extensions
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param number Filter by number (optional)
   * @return ExtensionEntityListing
   * @throws ApiException if fails to make API call
   */
  public ExtensionEntityListing getTelephonyProvidersEdgesExtensions(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String number) throws ApiException {
    return getTelephonyProvidersEdgesExtensionsWithHttpInfo(pageSize, pageNumber, sortBy, sortOrder, number).getBody();
  }

  /**
   * Get a listing of extensions
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param number Filter by number (optional)
   * @return ExtensionEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExtensionEntityListing> getTelephonyProvidersEdgesExtensionsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String number) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/extensions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "number", number));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExtensionEntityListing>() {});
  }

  /**
   * Get a listing of extensions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExtensionEntityListing getTelephonyProvidersEdgesExtensions(GetTelephonyProvidersEdgesExtensionsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExtensionEntityListing>() {});
  }

  /**
   * Get a listing of extensions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExtensionEntityListing> getTelephonyProvidersEdgesExtensions(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<ExtensionEntityListing>invokeAPIVerbose(request, new TypeReference<ExtensionEntityListing>() {});
  }

  /**
   * Get a Line by ID
   * 
   * @param lineId Line ID (required)
   * @return Line
   * @throws ApiException if fails to make API call
   */
  public Line getTelephonyProvidersEdgesLine(String lineId) throws ApiException {
    return getTelephonyProvidersEdgesLineWithHttpInfo(lineId).getBody();
  }

  /**
   * Get a Line by ID
   * 
   * @param lineId Line ID (required)
   * @return Line
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Line> getTelephonyProvidersEdgesLineWithHttpInfo(String lineId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'lineId' is set
    if (lineId == null) {
      throw new ApiException(400, "Missing the required parameter 'lineId' when calling getTelephonyProvidersEdgesLine");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/lines/{lineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "lineId" + "\\}", pcapiClient.escapeString(lineId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Line>() {});
  }

  /**
   * Get a Line by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Line getTelephonyProvidersEdgesLine(GetTelephonyProvidersEdgesLineRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Line>() {});
  }

  /**
   * Get a Line by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Line> getTelephonyProvidersEdgesLine(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Line>invokeAPIVerbose(request, new TypeReference<Line>() {});
  }

  /**
   * Get a line base settings object by ID
   * 
   * @param lineBaseId Line base ID (required)
   * @return LineBase
   * @throws ApiException if fails to make API call
   */
  public LineBase getTelephonyProvidersEdgesLinebasesetting(String lineBaseId) throws ApiException {
    return getTelephonyProvidersEdgesLinebasesettingWithHttpInfo(lineBaseId).getBody();
  }

  /**
   * Get a line base settings object by ID
   * 
   * @param lineBaseId Line base ID (required)
   * @return LineBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LineBase> getTelephonyProvidersEdgesLinebasesettingWithHttpInfo(String lineBaseId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'lineBaseId' is set
    if (lineBaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'lineBaseId' when calling getTelephonyProvidersEdgesLinebasesetting");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/linebasesettings/{lineBaseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "lineBaseId" + "\\}", pcapiClient.escapeString(lineBaseId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LineBase>() {});
  }

  /**
   * Get a line base settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LineBase getTelephonyProvidersEdgesLinebasesetting(GetTelephonyProvidersEdgesLinebasesettingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LineBase>() {});
  }

  /**
   * Get a line base settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LineBase> getTelephonyProvidersEdgesLinebasesetting(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<LineBase>invokeAPIVerbose(request, new TypeReference<LineBase>() {});
  }

  /**
   * Get a listing of line base settings objects
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @return LineBaseEntityListing
   * @throws ApiException if fails to make API call
   */
  public LineBaseEntityListing getTelephonyProvidersEdgesLinebasesettings(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder) throws ApiException {
    return getTelephonyProvidersEdgesLinebasesettingsWithHttpInfo(pageNumber, pageSize, sortBy, sortOrder).getBody();
  }

  /**
   * Get a listing of line base settings objects
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @return LineBaseEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LineBaseEntityListing> getTelephonyProvidersEdgesLinebasesettingsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/linebasesettings".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LineBaseEntityListing>() {});
  }

  /**
   * Get a listing of line base settings objects
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LineBaseEntityListing getTelephonyProvidersEdgesLinebasesettings(GetTelephonyProvidersEdgesLinebasesettingsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LineBaseEntityListing>() {});
  }

  /**
   * Get a listing of line base settings objects
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LineBaseEntityListing> getTelephonyProvidersEdgesLinebasesettings(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<LineBaseEntityListing>invokeAPIVerbose(request, new TypeReference<LineBaseEntityListing>() {});
  }

  /**
   * Get a list of Lines
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @return LineEntityListing
   * @throws ApiException if fails to make API call
   */
  public LineEntityListing getTelephonyProvidersEdgesLines(Integer pageSize, Integer pageNumber, String name, String sortBy, List<String> expand) throws ApiException {
    return getTelephonyProvidersEdgesLinesWithHttpInfo(pageSize, pageNumber, name, sortBy, expand).getBody();
  }

  /**
   * Get a list of Lines
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @return LineEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LineEntityListing> getTelephonyProvidersEdgesLinesWithHttpInfo(Integer pageSize, Integer pageNumber, String name, String sortBy, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/lines".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LineEntityListing>() {});
  }

  /**
   * Get a list of Lines
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LineEntityListing getTelephonyProvidersEdgesLines(GetTelephonyProvidersEdgesLinesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LineEntityListing>() {});
  }

  /**
   * Get a list of Lines
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LineEntityListing> getTelephonyProvidersEdgesLines(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<LineEntityListing>invokeAPIVerbose(request, new TypeReference<LineEntityListing>() {});
  }

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @param lineBaseSettingsId The id of a Line Base Settings object upon which to base this Line (required)
   * @return Line
   * @throws ApiException if fails to make API call
   */
  public Line getTelephonyProvidersEdgesLinesTemplate(String lineBaseSettingsId) throws ApiException {
    return getTelephonyProvidersEdgesLinesTemplateWithHttpInfo(lineBaseSettingsId).getBody();
  }

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @param lineBaseSettingsId The id of a Line Base Settings object upon which to base this Line (required)
   * @return Line
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Line> getTelephonyProvidersEdgesLinesTemplateWithHttpInfo(String lineBaseSettingsId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'lineBaseSettingsId' is set
    if (lineBaseSettingsId == null) {
      throw new ApiException(400, "Missing the required parameter 'lineBaseSettingsId' when calling getTelephonyProvidersEdgesLinesTemplate");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/lines/template".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "lineBaseSettingsId", lineBaseSettingsId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Line>() {});
  }

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Line getTelephonyProvidersEdgesLinesTemplate(GetTelephonyProvidersEdgesLinesTemplateRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Line>() {});
  }

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Line> getTelephonyProvidersEdgesLinesTemplate(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Line>invokeAPIVerbose(request, new TypeReference<Line>() {});
  }

  /**
   * Get edge logical interfaces.
   * Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.
   * @param edgeIds Comma separated list of Edge Id&#39;s (required)
   * @param expand Field to expand in the response (optional)
   * @return LogicalInterfaceEntityListing
   * @throws ApiException if fails to make API call
   */
  public LogicalInterfaceEntityListing getTelephonyProvidersEdgesLogicalinterfaces(String edgeIds, List<String> expand) throws ApiException {
    return getTelephonyProvidersEdgesLogicalinterfacesWithHttpInfo(edgeIds, expand).getBody();
  }

  /**
   * Get edge logical interfaces.
   * Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.
   * @param edgeIds Comma separated list of Edge Id&#39;s (required)
   * @param expand Field to expand in the response (optional)
   * @return LogicalInterfaceEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogicalInterfaceEntityListing> getTelephonyProvidersEdgesLogicalinterfacesWithHttpInfo(String edgeIds, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeIds' is set
    if (edgeIds == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeIds' when calling getTelephonyProvidersEdgesLogicalinterfaces");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/logicalinterfaces".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "edgeIds", edgeIds));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LogicalInterfaceEntityListing>() {});
  }

  /**
   * Get edge logical interfaces.
   * Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LogicalInterfaceEntityListing getTelephonyProvidersEdgesLogicalinterfaces(GetTelephonyProvidersEdgesLogicalinterfacesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LogicalInterfaceEntityListing>() {});
  }

  /**
   * Get edge logical interfaces.
   * Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogicalInterfaceEntityListing> getTelephonyProvidersEdgesLogicalinterfaces(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<LogicalInterfaceEntityListing>invokeAPIVerbose(request, new TypeReference<LogicalInterfaceEntityListing>() {});
  }

  /**
   * Get outbound route
   * 
   * @param outboundRouteId Outbound route ID (required)
   * @return OutboundRoute
   * @throws ApiException if fails to make API call
   */
  public OutboundRoute getTelephonyProvidersEdgesOutboundroute(String outboundRouteId) throws ApiException {
    return getTelephonyProvidersEdgesOutboundrouteWithHttpInfo(outboundRouteId).getBody();
  }

  /**
   * Get outbound route
   * 
   * @param outboundRouteId Outbound route ID (required)
   * @return OutboundRoute
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRoute> getTelephonyProvidersEdgesOutboundrouteWithHttpInfo(String outboundRouteId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'outboundRouteId' is set
    if (outboundRouteId == null) {
      throw new ApiException(400, "Missing the required parameter 'outboundRouteId' when calling getTelephonyProvidersEdgesOutboundroute");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "outboundRouteId" + "\\}", pcapiClient.escapeString(outboundRouteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OutboundRoute>() {});
  }

  /**
   * Get outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OutboundRoute getTelephonyProvidersEdgesOutboundroute(GetTelephonyProvidersEdgesOutboundrouteRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OutboundRoute>() {});
  }

  /**
   * Get outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRoute> getTelephonyProvidersEdgesOutboundroute(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OutboundRoute>invokeAPIVerbose(request, new TypeReference<OutboundRoute>() {});
  }

  /**
   * Get outbound routes
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param siteId Filter by site.id (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return OutboundRouteEntityListing
   * @throws ApiException if fails to make API call
   */
  public OutboundRouteEntityListing getTelephonyProvidersEdgesOutboundroutes(Integer pageSize, Integer pageNumber, String name, String siteId, String sortBy) throws ApiException {
    return getTelephonyProvidersEdgesOutboundroutesWithHttpInfo(pageSize, pageNumber, name, siteId, sortBy).getBody();
  }

  /**
   * Get outbound routes
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param siteId Filter by site.id (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return OutboundRouteEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRouteEntityListing> getTelephonyProvidersEdgesOutboundroutesWithHttpInfo(Integer pageSize, Integer pageNumber, String name, String siteId, String sortBy) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/outboundroutes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "site.id", siteId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OutboundRouteEntityListing>() {});
  }

  /**
   * Get outbound routes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OutboundRouteEntityListing getTelephonyProvidersEdgesOutboundroutes(GetTelephonyProvidersEdgesOutboundroutesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OutboundRouteEntityListing>() {});
  }

  /**
   * Get outbound routes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRouteEntityListing> getTelephonyProvidersEdgesOutboundroutes(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OutboundRouteEntityListing>invokeAPIVerbose(request, new TypeReference<OutboundRouteEntityListing>() {});
  }

  /**
   * Get a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @return Phone
   * @throws ApiException if fails to make API call
   */
  public Phone getTelephonyProvidersEdgesPhone(String phoneId) throws ApiException {
    return getTelephonyProvidersEdgesPhoneWithHttpInfo(phoneId).getBody();
  }

  /**
   * Get a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @return Phone
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Phone> getTelephonyProvidersEdgesPhoneWithHttpInfo(String phoneId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'phoneId' is set
    if (phoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneId' when calling getTelephonyProvidersEdgesPhone");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phones/{phoneId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "phoneId" + "\\}", pcapiClient.escapeString(phoneId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Phone>() {});
  }

  /**
   * Get a Phone by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Phone getTelephonyProvidersEdgesPhone(GetTelephonyProvidersEdgesPhoneRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Phone>() {});
  }

  /**
   * Get a Phone by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Phone> getTelephonyProvidersEdgesPhone(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Phone>invokeAPIVerbose(request, new TypeReference<Phone>() {});
  }

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @return PhoneBase
   * @throws ApiException if fails to make API call
   */
  public PhoneBase getTelephonyProvidersEdgesPhonebasesetting(String phoneBaseId) throws ApiException {
    return getTelephonyProvidersEdgesPhonebasesettingWithHttpInfo(phoneBaseId).getBody();
  }

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @return PhoneBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneBase> getTelephonyProvidersEdgesPhonebasesettingWithHttpInfo(String phoneBaseId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'phoneBaseId' is set
    if (phoneBaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneBaseId' when calling getTelephonyProvidersEdgesPhonebasesetting");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "phoneBaseId" + "\\}", pcapiClient.escapeString(phoneBaseId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PhoneBase>() {});
  }

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PhoneBase getTelephonyProvidersEdgesPhonebasesetting(GetTelephonyProvidersEdgesPhonebasesettingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PhoneBase>() {});
  }

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneBase> getTelephonyProvidersEdgesPhonebasesetting(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<PhoneBase>invokeAPIVerbose(request, new TypeReference<PhoneBase>() {});
  }

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param name Name (optional)
   * @return PhoneBaseEntityListing
   * @throws ApiException if fails to make API call
   */
  public PhoneBaseEntityListing getTelephonyProvidersEdgesPhonebasesettings(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name) throws ApiException {
    return getTelephonyProvidersEdgesPhonebasesettingsWithHttpInfo(pageSize, pageNumber, sortBy, sortOrder, name).getBody();
  }

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param name Name (optional)
   * @return PhoneBaseEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettingsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phonebasesettings".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PhoneBaseEntityListing>() {});
  }

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PhoneBaseEntityListing getTelephonyProvidersEdgesPhonebasesettings(GetTelephonyProvidersEdgesPhonebasesettingsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PhoneBaseEntityListing>() {});
  }

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettings(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<PhoneBaseEntityListing>invokeAPIVerbose(request, new TypeReference<PhoneBaseEntityListing>() {});
  }

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return PhoneMetaBaseEntityListing
   * @throws ApiException if fails to make API call
   */
  public PhoneMetaBaseEntityListing getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases(Integer pageSize, Integer pageNumber) throws ApiException {
    return getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesWithHttpInfo(pageSize, pageNumber).getBody();
  }

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return PhoneMetaBaseEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneMetaBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesWithHttpInfo(Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phonebasesettings/availablemetabases".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PhoneMetaBaseEntityListing>() {});
  }

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PhoneMetaBaseEntityListing getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases(GetTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PhoneMetaBaseEntityListing>() {});
  }

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneMetaBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<PhoneMetaBaseEntityListing>invokeAPIVerbose(request, new TypeReference<PhoneMetaBaseEntityListing>() {});
  }

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @param phoneMetabaseId The id of a metabase object upon which to base this Phone Base Settings (required)
   * @return PhoneBase
   * @throws ApiException if fails to make API call
   */
  public PhoneBase getTelephonyProvidersEdgesPhonebasesettingsTemplate(String phoneMetabaseId) throws ApiException {
    return getTelephonyProvidersEdgesPhonebasesettingsTemplateWithHttpInfo(phoneMetabaseId).getBody();
  }

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @param phoneMetabaseId The id of a metabase object upon which to base this Phone Base Settings (required)
   * @return PhoneBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneBase> getTelephonyProvidersEdgesPhonebasesettingsTemplateWithHttpInfo(String phoneMetabaseId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'phoneMetabaseId' is set
    if (phoneMetabaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneMetabaseId' when calling getTelephonyProvidersEdgesPhonebasesettingsTemplate");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phonebasesettings/template".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "phoneMetabaseId", phoneMetabaseId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PhoneBase>() {});
  }

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PhoneBase getTelephonyProvidersEdgesPhonebasesettingsTemplate(GetTelephonyProvidersEdgesPhonebasesettingsTemplateRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PhoneBase>() {});
  }

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneBase> getTelephonyProvidersEdgesPhonebasesettingsTemplate(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<PhoneBase>invokeAPIVerbose(request, new TypeReference<PhoneBase>() {});
  }

  /**
   * Get a list of Phone Instances
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param siteId Filter by site.id (optional)
   * @param webRtcUserId Filter by webRtcUser.id (optional)
   * @param phoneBaseSettingsId Filter by phoneBaseSettings.id (optional)
   * @param linesLoggedInUserId Filter by lines.loggedInUser.id (optional)
   * @param linesDefaultForUserId Filter by lines.defaultForUser.id (optional)
   * @param phoneHardwareId Filter by phone_hardwareId (optional)
   * @param linesId Filter by lines.id (optional)
   * @param linesName Filter by lines.name (optional)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @param fields Fields and properties to get, comma-separated (optional)
   * @return PhoneEntityListing
   * @throws ApiException if fails to make API call
   */
  public PhoneEntityListing getTelephonyProvidersEdgesPhones(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String siteId, String webRtcUserId, String phoneBaseSettingsId, String linesLoggedInUserId, String linesDefaultForUserId, String phoneHardwareId, String linesId, String linesName, List<String> expand, List<String> fields) throws ApiException {
    return getTelephonyProvidersEdgesPhonesWithHttpInfo(pageNumber, pageSize, sortBy, sortOrder, siteId, webRtcUserId, phoneBaseSettingsId, linesLoggedInUserId, linesDefaultForUserId, phoneHardwareId, linesId, linesName, expand, fields).getBody();
  }

  /**
   * Get a list of Phone Instances
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param siteId Filter by site.id (optional)
   * @param webRtcUserId Filter by webRtcUser.id (optional)
   * @param phoneBaseSettingsId Filter by phoneBaseSettings.id (optional)
   * @param linesLoggedInUserId Filter by lines.loggedInUser.id (optional)
   * @param linesDefaultForUserId Filter by lines.defaultForUser.id (optional)
   * @param phoneHardwareId Filter by phone_hardwareId (optional)
   * @param linesId Filter by lines.id (optional)
   * @param linesName Filter by lines.name (optional)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @param fields Fields and properties to get, comma-separated (optional)
   * @return PhoneEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneEntityListing> getTelephonyProvidersEdgesPhonesWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String siteId, String webRtcUserId, String phoneBaseSettingsId, String linesLoggedInUserId, String linesDefaultForUserId, String phoneHardwareId, String linesId, String linesName, List<String> expand, List<String> fields) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "site.id", siteId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "webRtcUser.id", webRtcUserId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "phoneBaseSettings.id", phoneBaseSettingsId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "lines.loggedInUser.id", linesLoggedInUserId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "lines.defaultForUser.id", linesDefaultForUserId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "phone_hardwareId", phoneHardwareId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "lines.id", linesId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "lines.name", linesName));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "fields", fields));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PhoneEntityListing>() {});
  }

  /**
   * Get a list of Phone Instances
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PhoneEntityListing getTelephonyProvidersEdgesPhones(GetTelephonyProvidersEdgesPhonesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PhoneEntityListing>() {});
  }

  /**
   * Get a list of Phone Instances
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneEntityListing> getTelephonyProvidersEdgesPhones(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<PhoneEntityListing>invokeAPIVerbose(request, new TypeReference<PhoneEntityListing>() {});
  }

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @param phoneBaseSettingsId The id of a Phone Base Settings object upon which to base this Phone (required)
   * @return Phone
   * @throws ApiException if fails to make API call
   */
  public Phone getTelephonyProvidersEdgesPhonesTemplate(String phoneBaseSettingsId) throws ApiException {
    return getTelephonyProvidersEdgesPhonesTemplateWithHttpInfo(phoneBaseSettingsId).getBody();
  }

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @param phoneBaseSettingsId The id of a Phone Base Settings object upon which to base this Phone (required)
   * @return Phone
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Phone> getTelephonyProvidersEdgesPhonesTemplateWithHttpInfo(String phoneBaseSettingsId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'phoneBaseSettingsId' is set
    if (phoneBaseSettingsId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneBaseSettingsId' when calling getTelephonyProvidersEdgesPhonesTemplate");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phones/template".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "phoneBaseSettingsId", phoneBaseSettingsId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Phone>() {});
  }

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Phone getTelephonyProvidersEdgesPhonesTemplate(GetTelephonyProvidersEdgesPhonesTemplateRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Phone>() {});
  }

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Phone> getTelephonyProvidersEdgesPhonesTemplate(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Phone>invokeAPIVerbose(request, new TypeReference<Phone>() {});
  }

  /**
   * Get a Site by ID.
   * 
   * @param siteId Site ID (required)
   * @return Site
   * @throws ApiException if fails to make API call
   */
  public Site getTelephonyProvidersEdgesSite(String siteId) throws ApiException {
    return getTelephonyProvidersEdgesSiteWithHttpInfo(siteId).getBody();
  }

  /**
   * Get a Site by ID.
   * 
   * @param siteId Site ID (required)
   * @return Site
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Site> getTelephonyProvidersEdgesSiteWithHttpInfo(String siteId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling getTelephonyProvidersEdgesSite");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Site>() {});
  }

  /**
   * Get a Site by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Site getTelephonyProvidersEdgesSite(GetTelephonyProvidersEdgesSiteRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Site>() {});
  }

  /**
   * Get a Site by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Site> getTelephonyProvidersEdgesSite(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Site>invokeAPIVerbose(request, new TypeReference<Site>() {});
  }

  /**
   * Get a Number Plan by ID.
   * 
   * @param siteId Site ID (required)
   * @param numberPlanId Number Plan ID (required)
   * @return NumberPlan
   * @throws ApiException if fails to make API call
   */
  public NumberPlan getTelephonyProvidersEdgesSiteNumberplan(String siteId, String numberPlanId) throws ApiException {
    return getTelephonyProvidersEdgesSiteNumberplanWithHttpInfo(siteId, numberPlanId).getBody();
  }

  /**
   * Get a Number Plan by ID.
   * 
   * @param siteId Site ID (required)
   * @param numberPlanId Number Plan ID (required)
   * @return NumberPlan
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NumberPlan> getTelephonyProvidersEdgesSiteNumberplanWithHttpInfo(String siteId, String numberPlanId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling getTelephonyProvidersEdgesSiteNumberplan");
    }
    
    // verify the required parameter 'numberPlanId' is set
    if (numberPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'numberPlanId' when calling getTelephonyProvidersEdgesSiteNumberplan");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}/numberplans/{numberPlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()))
      .replaceAll("\\{" + "numberPlanId" + "\\}", pcapiClient.escapeString(numberPlanId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<NumberPlan>() {});
  }

  /**
   * Get a Number Plan by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public NumberPlan getTelephonyProvidersEdgesSiteNumberplan(GetTelephonyProvidersEdgesSiteNumberplanRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<NumberPlan>() {});
  }

  /**
   * Get a Number Plan by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NumberPlan> getTelephonyProvidersEdgesSiteNumberplan(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<NumberPlan>invokeAPIVerbose(request, new TypeReference<NumberPlan>() {});
  }

  /**
   * Get the list of Number Plans for this Site.
   * 
   * @param siteId Site ID (required)
   * @return List<NumberPlan>
   * @throws ApiException if fails to make API call
   */
  public List<NumberPlan> getTelephonyProvidersEdgesSiteNumberplans(String siteId) throws ApiException {
    return getTelephonyProvidersEdgesSiteNumberplansWithHttpInfo(siteId).getBody();
  }

  /**
   * Get the list of Number Plans for this Site.
   * 
   * @param siteId Site ID (required)
   * @return List<NumberPlan>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<NumberPlan>> getTelephonyProvidersEdgesSiteNumberplansWithHttpInfo(String siteId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling getTelephonyProvidersEdgesSiteNumberplans");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}/numberplans".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<NumberPlan>>() {});
  }

  /**
   * Get the list of Number Plans for this Site.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<NumberPlan> getTelephonyProvidersEdgesSiteNumberplans(GetTelephonyProvidersEdgesSiteNumberplansRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<NumberPlan>>() {});
  }

  /**
   * Get the list of Number Plans for this Site.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<NumberPlan>> getTelephonyProvidersEdgesSiteNumberplans(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<NumberPlan>>invokeAPIVerbose(request, new TypeReference<List<NumberPlan>>() {});
  }

  /**
   * Get a list of Classifications for this Site
   * 
   * @param siteId Site ID (required)
   * @param classification Classification (optional)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getTelephonyProvidersEdgesSiteNumberplansClassifications(String siteId, String classification) throws ApiException {
    return getTelephonyProvidersEdgesSiteNumberplansClassificationsWithHttpInfo(siteId, classification).getBody();
  }

  /**
   * Get a list of Classifications for this Site
   * 
   * @param siteId Site ID (required)
   * @param classification Classification (optional)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> getTelephonyProvidersEdgesSiteNumberplansClassificationsWithHttpInfo(String siteId, String classification) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling getTelephonyProvidersEdgesSiteNumberplansClassifications");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}/numberplans/classifications".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "classification", classification));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<String>>() {});
  }

  /**
   * Get a list of Classifications for this Site
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<String> getTelephonyProvidersEdgesSiteNumberplansClassifications(GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<String>>() {});
  }

  /**
   * Get a list of Classifications for this Site
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> getTelephonyProvidersEdgesSiteNumberplansClassifications(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIVerbose(request, new TypeReference<List<String>>() {});
  }

  /**
   * Get an outbound route
   * 
   * @param siteId Site ID (required)
   * @param outboundRouteId Outbound route ID (required)
   * @return OutboundRouteBase
   * @throws ApiException if fails to make API call
   */
  public OutboundRouteBase getTelephonyProvidersEdgesSiteOutboundroute(String siteId, String outboundRouteId) throws ApiException {
    return getTelephonyProvidersEdgesSiteOutboundrouteWithHttpInfo(siteId, outboundRouteId).getBody();
  }

  /**
   * Get an outbound route
   * 
   * @param siteId Site ID (required)
   * @param outboundRouteId Outbound route ID (required)
   * @return OutboundRouteBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRouteBase> getTelephonyProvidersEdgesSiteOutboundrouteWithHttpInfo(String siteId, String outboundRouteId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling getTelephonyProvidersEdgesSiteOutboundroute");
    }
    
    // verify the required parameter 'outboundRouteId' is set
    if (outboundRouteId == null) {
      throw new ApiException(400, "Missing the required parameter 'outboundRouteId' when calling getTelephonyProvidersEdgesSiteOutboundroute");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes/{outboundRouteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()))
      .replaceAll("\\{" + "outboundRouteId" + "\\}", pcapiClient.escapeString(outboundRouteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OutboundRouteBase>() {});
  }

  /**
   * Get an outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OutboundRouteBase getTelephonyProvidersEdgesSiteOutboundroute(GetTelephonyProvidersEdgesSiteOutboundrouteRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OutboundRouteBase>() {});
  }

  /**
   * Get an outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRouteBase> getTelephonyProvidersEdgesSiteOutboundroute(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OutboundRouteBase>invokeAPIVerbose(request, new TypeReference<OutboundRouteBase>() {});
  }

  /**
   * Get outbound routes
   * 
   * @param siteId Site ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return OutboundRouteBaseEntityListing
   * @throws ApiException if fails to make API call
   */
  public OutboundRouteBaseEntityListing getTelephonyProvidersEdgesSiteOutboundroutes(String siteId, Integer pageSize, Integer pageNumber, String name, String sortBy) throws ApiException {
    return getTelephonyProvidersEdgesSiteOutboundroutesWithHttpInfo(siteId, pageSize, pageNumber, name, sortBy).getBody();
  }

  /**
   * Get outbound routes
   * 
   * @param siteId Site ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return OutboundRouteBaseEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRouteBaseEntityListing> getTelephonyProvidersEdgesSiteOutboundroutesWithHttpInfo(String siteId, Integer pageSize, Integer pageNumber, String name, String sortBy) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling getTelephonyProvidersEdgesSiteOutboundroutes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OutboundRouteBaseEntityListing>() {});
  }

  /**
   * Get outbound routes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OutboundRouteBaseEntityListing getTelephonyProvidersEdgesSiteOutboundroutes(GetTelephonyProvidersEdgesSiteOutboundroutesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OutboundRouteBaseEntityListing>() {});
  }

  /**
   * Get outbound routes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRouteBaseEntityListing> getTelephonyProvidersEdgesSiteOutboundroutes(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OutboundRouteBaseEntityListing>invokeAPIVerbose(request, new TypeReference<OutboundRouteBaseEntityListing>() {});
  }

  /**
   * Get the list of Sites.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param name Name (optional)
   * @param locationId Location Id (optional)
   * @param managed Filter by managed (optional)
   * @return SiteEntityListing
   * @throws ApiException if fails to make API call
   */
  public SiteEntityListing getTelephonyProvidersEdgesSites(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, String locationId, Boolean managed) throws ApiException {
    return getTelephonyProvidersEdgesSitesWithHttpInfo(pageSize, pageNumber, sortBy, sortOrder, name, locationId, managed).getBody();
  }

  /**
   * Get the list of Sites.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param name Name (optional)
   * @param locationId Location Id (optional)
   * @param managed Filter by managed (optional)
   * @return SiteEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SiteEntityListing> getTelephonyProvidersEdgesSitesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, String locationId, Boolean managed) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "location.id", locationId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "managed", managed));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SiteEntityListing>() {});
  }

  /**
   * Get the list of Sites.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SiteEntityListing getTelephonyProvidersEdgesSites(GetTelephonyProvidersEdgesSitesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SiteEntityListing>() {});
  }

  /**
   * Get the list of Sites.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SiteEntityListing> getTelephonyProvidersEdgesSites(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<SiteEntityListing>invokeAPIVerbose(request, new TypeReference<SiteEntityListing>() {});
  }

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @param pageSize Page size (optional, default to 1000)
   * @param pageNumber Page number (optional, default to 1)
   * @return TimeZoneEntityListing
   * @throws ApiException if fails to make API call
   */
  public TimeZoneEntityListing getTelephonyProvidersEdgesTimezones(Integer pageSize, Integer pageNumber) throws ApiException {
    return getTelephonyProvidersEdgesTimezonesWithHttpInfo(pageSize, pageNumber).getBody();
  }

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @param pageSize Page size (optional, default to 1000)
   * @param pageNumber Page number (optional, default to 1)
   * @return TimeZoneEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TimeZoneEntityListing> getTelephonyProvidersEdgesTimezonesWithHttpInfo(Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/timezones".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TimeZoneEntityListing>() {});
  }

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TimeZoneEntityListing getTelephonyProvidersEdgesTimezones(GetTelephonyProvidersEdgesTimezonesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TimeZoneEntityListing>() {});
  }

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TimeZoneEntityListing> getTelephonyProvidersEdgesTimezones(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<TimeZoneEntityListing>invokeAPIVerbose(request, new TypeReference<TimeZoneEntityListing>() {});
  }

  /**
   * Get a Trunk by ID
   * 
   * @param trunkId Trunk ID (required)
   * @return Trunk
   * @throws ApiException if fails to make API call
   */
  public Trunk getTelephonyProvidersEdgesTrunk(String trunkId) throws ApiException {
    return getTelephonyProvidersEdgesTrunkWithHttpInfo(trunkId).getBody();
  }

  /**
   * Get a Trunk by ID
   * 
   * @param trunkId Trunk ID (required)
   * @return Trunk
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Trunk> getTelephonyProvidersEdgesTrunkWithHttpInfo(String trunkId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'trunkId' is set
    if (trunkId == null) {
      throw new ApiException(400, "Missing the required parameter 'trunkId' when calling getTelephonyProvidersEdgesTrunk");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/trunks/{trunkId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trunkId" + "\\}", pcapiClient.escapeString(trunkId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Trunk>() {});
  }

  /**
   * Get a Trunk by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Trunk getTelephonyProvidersEdgesTrunk(GetTelephonyProvidersEdgesTrunkRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Trunk>() {});
  }

  /**
   * Get a Trunk by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Trunk> getTelephonyProvidersEdgesTrunk(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Trunk>invokeAPIVerbose(request, new TypeReference<Trunk>() {});
  }

  /**
   * Get a Trunk Base Settings object by ID
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @param ignoreHidden Set this to true to not receive trunk properties that are meant to be hidden or for internal system usage only. (optional)
   * @return TrunkBase
   * @throws ApiException if fails to make API call
   */
  public TrunkBase getTelephonyProvidersEdgesTrunkbasesetting(String trunkBaseSettingsId, Boolean ignoreHidden) throws ApiException {
    return getTelephonyProvidersEdgesTrunkbasesettingWithHttpInfo(trunkBaseSettingsId, ignoreHidden).getBody();
  }

  /**
   * Get a Trunk Base Settings object by ID
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @param ignoreHidden Set this to true to not receive trunk properties that are meant to be hidden or for internal system usage only. (optional)
   * @return TrunkBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettingWithHttpInfo(String trunkBaseSettingsId, Boolean ignoreHidden) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'trunkBaseSettingsId' is set
    if (trunkBaseSettingsId == null) {
      throw new ApiException(400, "Missing the required parameter 'trunkBaseSettingsId' when calling getTelephonyProvidersEdgesTrunkbasesetting");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trunkBaseSettingsId" + "\\}", pcapiClient.escapeString(trunkBaseSettingsId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "ignoreHidden", ignoreHidden));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TrunkBase>() {});
  }

  /**
   * Get a Trunk Base Settings object by ID
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TrunkBase getTelephonyProvidersEdgesTrunkbasesetting(GetTelephonyProvidersEdgesTrunkbasesettingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TrunkBase>() {});
  }

  /**
   * Get a Trunk Base Settings object by ID
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkBase> getTelephonyProvidersEdgesTrunkbasesetting(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<TrunkBase>invokeAPIVerbose(request, new TypeReference<TrunkBase>() {});
  }

  /**
   * Get Trunk Base Settings listing
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param recordingEnabled Filter trunks by recording enabled (optional)
   * @param ignoreHidden Set this to true to not receive trunk properties that are meant to be hidden or for internal system usage only. (optional)
   * @param managed Filter by managed (optional)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @param name Name of the TrunkBase to filter by (optional)
   * @return TrunkBaseEntityListing
   * @throws ApiException if fails to make API call
   */
  public TrunkBaseEntityListing getTelephonyProvidersEdgesTrunkbasesettings(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, Boolean recordingEnabled, Boolean ignoreHidden, Boolean managed, List<String> expand, String name) throws ApiException {
    return getTelephonyProvidersEdgesTrunkbasesettingsWithHttpInfo(pageNumber, pageSize, sortBy, sortOrder, recordingEnabled, ignoreHidden, managed, expand, name).getBody();
  }

  /**
   * Get Trunk Base Settings listing
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param recordingEnabled Filter trunks by recording enabled (optional)
   * @param ignoreHidden Set this to true to not receive trunk properties that are meant to be hidden or for internal system usage only. (optional)
   * @param managed Filter by managed (optional)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @param name Name of the TrunkBase to filter by (optional)
   * @return TrunkBaseEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkBaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettingsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, Boolean recordingEnabled, Boolean ignoreHidden, Boolean managed, List<String> expand, String name) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/trunkbasesettings".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "recordingEnabled", recordingEnabled));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "ignoreHidden", ignoreHidden));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "managed", managed));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TrunkBaseEntityListing>() {});
  }

  /**
   * Get Trunk Base Settings listing
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TrunkBaseEntityListing getTelephonyProvidersEdgesTrunkbasesettings(GetTelephonyProvidersEdgesTrunkbasesettingsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TrunkBaseEntityListing>() {});
  }

  /**
   * Get Trunk Base Settings listing
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkBaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettings(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<TrunkBaseEntityListing>invokeAPIVerbose(request, new TypeReference<TrunkBaseEntityListing>() {});
  }

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @param type  (optional)
   * @param pageSize  (optional, default to 25)
   * @param pageNumber  (optional, default to 1)
   * @return TrunkMetabaseEntityListing
   * @throws ApiException if fails to make API call
   */
  public TrunkMetabaseEntityListing getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases(String type, Integer pageSize, Integer pageNumber) throws ApiException {
    return getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesWithHttpInfo(type, pageSize, pageNumber).getBody();
  }

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @param type  (optional)
   * @param pageSize  (optional, default to 25)
   * @param pageNumber  (optional, default to 1)
   * @return TrunkMetabaseEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkMetabaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesWithHttpInfo(String type, Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/trunkbasesettings/availablemetabases".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "type", type));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TrunkMetabaseEntityListing>() {});
  }

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TrunkMetabaseEntityListing getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases(GetTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TrunkMetabaseEntityListing>() {});
  }

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkMetabaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<TrunkMetabaseEntityListing>invokeAPIVerbose(request, new TypeReference<TrunkMetabaseEntityListing>() {});
  }

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @param trunkMetabaseId The id of a metabase object upon which to base this Trunk Base Settings (required)
   * @return TrunkBase
   * @throws ApiException if fails to make API call
   */
  public TrunkBase getTelephonyProvidersEdgesTrunkbasesettingsTemplate(String trunkMetabaseId) throws ApiException {
    return getTelephonyProvidersEdgesTrunkbasesettingsTemplateWithHttpInfo(trunkMetabaseId).getBody();
  }

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @param trunkMetabaseId The id of a metabase object upon which to base this Trunk Base Settings (required)
   * @return TrunkBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettingsTemplateWithHttpInfo(String trunkMetabaseId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'trunkMetabaseId' is set
    if (trunkMetabaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'trunkMetabaseId' when calling getTelephonyProvidersEdgesTrunkbasesettingsTemplate");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/trunkbasesettings/template".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "trunkMetabaseId", trunkMetabaseId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TrunkBase>() {});
  }

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TrunkBase getTelephonyProvidersEdgesTrunkbasesettingsTemplate(GetTelephonyProvidersEdgesTrunkbasesettingsTemplateRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TrunkBase>() {});
  }

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettingsTemplate(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<TrunkBase>invokeAPIVerbose(request, new TypeReference<TrunkBase>() {});
  }

  /**
   * Get the list of available trunks.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param edgeId Filter by Edge Ids (optional)
   * @param trunkBaseId Filter by Trunk Base Ids (optional)
   * @param trunkType Filter by a Trunk type (optional)
   * @return TrunkEntityListing
   * @throws ApiException if fails to make API call
   */
  public TrunkEntityListing getTelephonyProvidersEdgesTrunks(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String edgeId, String trunkBaseId, String trunkType) throws ApiException {
    return getTelephonyProvidersEdgesTrunksWithHttpInfo(pageNumber, pageSize, sortBy, sortOrder, edgeId, trunkBaseId, trunkType).getBody();
  }

  /**
   * Get the list of available trunks.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param edgeId Filter by Edge Ids (optional)
   * @param trunkBaseId Filter by Trunk Base Ids (optional)
   * @param trunkType Filter by a Trunk type (optional)
   * @return TrunkEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkEntityListing> getTelephonyProvidersEdgesTrunksWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String edgeId, String trunkBaseId, String trunkType) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/trunks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "edge.id", edgeId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "trunkBase.id", trunkBaseId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "trunkType", trunkType));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TrunkEntityListing>() {});
  }

  /**
   * Get the list of available trunks.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TrunkEntityListing getTelephonyProvidersEdgesTrunks(GetTelephonyProvidersEdgesTrunksRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TrunkEntityListing>() {});
  }

  /**
   * Get the list of available trunks.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkEntityListing> getTelephonyProvidersEdgesTrunks(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<TrunkEntityListing>invokeAPIVerbose(request, new TypeReference<TrunkEntityListing>() {});
  }

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @param trunkType The type of this trunk base. (optional)
   * @return TrunkRecordingEnabledCount
   * @throws ApiException if fails to make API call
   */
  public TrunkRecordingEnabledCount getTelephonyProvidersEdgesTrunkswithrecording(String trunkType) throws ApiException {
    return getTelephonyProvidersEdgesTrunkswithrecordingWithHttpInfo(trunkType).getBody();
  }

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @param trunkType The type of this trunk base. (optional)
   * @return TrunkRecordingEnabledCount
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkRecordingEnabledCount> getTelephonyProvidersEdgesTrunkswithrecordingWithHttpInfo(String trunkType) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/trunkswithrecording".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "trunkType", trunkType));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TrunkRecordingEnabledCount>() {});
  }

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TrunkRecordingEnabledCount getTelephonyProvidersEdgesTrunkswithrecording(GetTelephonyProvidersEdgesTrunkswithrecordingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TrunkRecordingEnabledCount>() {});
  }

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkRecordingEnabledCount> getTelephonyProvidersEdgesTrunkswithrecording(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<TrunkRecordingEnabledCount>invokeAPIVerbose(request, new TypeReference<TrunkRecordingEnabledCount>() {});
  }

  /**
   * Create an edge logical interface.
   * Create
   * @param edgeId Edge ID (required)
   * @param body Logical interface (required)
   * @return DomainLogicalInterface
   * @throws ApiException if fails to make API call
   */
  public DomainLogicalInterface postTelephonyProvidersEdgeLogicalinterfaces(String edgeId, DomainLogicalInterface body) throws ApiException {
    return postTelephonyProvidersEdgeLogicalinterfacesWithHttpInfo(edgeId, body).getBody();
  }

  /**
   * Create an edge logical interface.
   * Create
   * @param edgeId Edge ID (required)
   * @param body Logical interface (required)
   * @return DomainLogicalInterface
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainLogicalInterface> postTelephonyProvidersEdgeLogicalinterfacesWithHttpInfo(String edgeId, DomainLogicalInterface body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling postTelephonyProvidersEdgeLogicalinterfaces");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgeLogicalinterfaces");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainLogicalInterface>() {});
  }

  /**
   * Create an edge logical interface.
   * Create
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainLogicalInterface postTelephonyProvidersEdgeLogicalinterfaces(PostTelephonyProvidersEdgeLogicalinterfacesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainLogicalInterface>() {});
  }

  /**
   * Create an edge logical interface.
   * Create
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainLogicalInterface> postTelephonyProvidersEdgeLogicalinterfaces(ApiRequest<DomainLogicalInterface> request) throws ApiException {
    return pcapiClient.<DomainLogicalInterface>invokeAPIVerbose(request, new TypeReference<DomainLogicalInterface>() {});
  }

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @param edgeId Edge ID (required)
   * @param jobId Job ID (required)
   * @param body Log upload request (required)
   * @throws ApiException if fails to make API call
   */
  public void postTelephonyProvidersEdgeLogsJobUpload(String edgeId, String jobId, EdgeLogsJobUploadRequest body) throws ApiException {
    postTelephonyProvidersEdgeLogsJobUploadWithHttpInfo(edgeId, jobId, body);
  }

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @param edgeId Edge ID (required)
   * @param jobId Job ID (required)
   * @param body Log upload request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postTelephonyProvidersEdgeLogsJobUploadWithHttpInfo(String edgeId, String jobId, EdgeLogsJobUploadRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling postTelephonyProvidersEdgeLogsJobUpload");
    }
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling postTelephonyProvidersEdgeLogsJobUpload");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgeLogsJobUpload");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/logs/jobs/{jobId}/upload".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()))
      .replaceAll("\\{" + "jobId" + "\\}", pcapiClient.escapeString(jobId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postTelephonyProvidersEdgeLogsJobUpload(PostTelephonyProvidersEdgeLogsJobUploadRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postTelephonyProvidersEdgeLogsJobUpload(ApiRequest<EdgeLogsJobUploadRequest> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @param edgeId Edge ID (required)
   * @param body EdgeLogsJobRequest (required)
   * @return EdgeLogsJobResponse
   * @throws ApiException if fails to make API call
   */
  public EdgeLogsJobResponse postTelephonyProvidersEdgeLogsJobs(String edgeId, EdgeLogsJobRequest body) throws ApiException {
    return postTelephonyProvidersEdgeLogsJobsWithHttpInfo(edgeId, body).getBody();
  }

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @param edgeId Edge ID (required)
   * @param body EdgeLogsJobRequest (required)
   * @return EdgeLogsJobResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeLogsJobResponse> postTelephonyProvidersEdgeLogsJobsWithHttpInfo(String edgeId, EdgeLogsJobRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling postTelephonyProvidersEdgeLogsJobs");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgeLogsJobs");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/logs/jobs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeLogsJobResponse>() {});
  }

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeLogsJobResponse postTelephonyProvidersEdgeLogsJobs(PostTelephonyProvidersEdgeLogsJobsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeLogsJobResponse>() {});
  }

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeLogsJobResponse> postTelephonyProvidersEdgeLogsJobs(ApiRequest<EdgeLogsJobRequest> request) throws ApiException {
    return pcapiClient.<EdgeLogsJobResponse>invokeAPIVerbose(request, new TypeReference<EdgeLogsJobResponse>() {});
  }

  /**
   * Reboot an Edge
   * 
   * @param edgeId Edge ID (required)
   * @param body Parameters for the edge reboot (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String postTelephonyProvidersEdgeReboot(String edgeId, EdgeRebootParameters body) throws ApiException {
    return postTelephonyProvidersEdgeRebootWithHttpInfo(edgeId, body).getBody();
  }

  /**
   * Reboot an Edge
   * 
   * @param edgeId Edge ID (required)
   * @param body Parameters for the edge reboot (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> postTelephonyProvidersEdgeRebootWithHttpInfo(String edgeId, EdgeRebootParameters body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling postTelephonyProvidersEdgeReboot");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/reboot".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<String>() {});
  }

  /**
   * Reboot an Edge
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String postTelephonyProvidersEdgeReboot(PostTelephonyProvidersEdgeRebootRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Reboot an Edge
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> postTelephonyProvidersEdgeReboot(ApiRequest<EdgeRebootParameters> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Starts a software update for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @param body Software update request (required)
   * @return DomainEdgeSoftwareUpdateDto
   * @throws ApiException if fails to make API call
   */
  public DomainEdgeSoftwareUpdateDto postTelephonyProvidersEdgeSoftwareupdate(String edgeId, DomainEdgeSoftwareUpdateDto body) throws ApiException {
    return postTelephonyProvidersEdgeSoftwareupdateWithHttpInfo(edgeId, body).getBody();
  }

  /**
   * Starts a software update for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @param body Software update request (required)
   * @return DomainEdgeSoftwareUpdateDto
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainEdgeSoftwareUpdateDto> postTelephonyProvidersEdgeSoftwareupdateWithHttpInfo(String edgeId, DomainEdgeSoftwareUpdateDto body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling postTelephonyProvidersEdgeSoftwareupdate");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgeSoftwareupdate");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/softwareupdate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainEdgeSoftwareUpdateDto>() {});
  }

  /**
   * Starts a software update for this edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainEdgeSoftwareUpdateDto postTelephonyProvidersEdgeSoftwareupdate(PostTelephonyProvidersEdgeSoftwareupdateRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainEdgeSoftwareUpdateDto>() {});
  }

  /**
   * Starts a software update for this edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainEdgeSoftwareUpdateDto> postTelephonyProvidersEdgeSoftwareupdate(ApiRequest<DomainEdgeSoftwareUpdateDto> request) throws ApiException {
    return pcapiClient.<DomainEdgeSoftwareUpdateDto>invokeAPIVerbose(request, new TypeReference<DomainEdgeSoftwareUpdateDto>() {});
  }

  /**
   * Take an Edge in or out of service
   * 
   * @param edgeId Edge ID (required)
   * @param body Edge Service State (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String postTelephonyProvidersEdgeStatuscode(String edgeId, EdgeServiceStateRequest body) throws ApiException {
    return postTelephonyProvidersEdgeStatuscodeWithHttpInfo(edgeId, body).getBody();
  }

  /**
   * Take an Edge in or out of service
   * 
   * @param edgeId Edge ID (required)
   * @param body Edge Service State (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> postTelephonyProvidersEdgeStatuscodeWithHttpInfo(String edgeId, EdgeServiceStateRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling postTelephonyProvidersEdgeStatuscode");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/statuscode".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<String>() {});
  }

  /**
   * Take an Edge in or out of service
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String postTelephonyProvidersEdgeStatuscode(PostTelephonyProvidersEdgeStatuscodeRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Take an Edge in or out of service
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> postTelephonyProvidersEdgeStatuscode(ApiRequest<EdgeServiceStateRequest> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Unpair an Edge
   * 
   * @param edgeId Edge Id (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String postTelephonyProvidersEdgeUnpair(String edgeId) throws ApiException {
    return postTelephonyProvidersEdgeUnpairWithHttpInfo(edgeId).getBody();
  }

  /**
   * Unpair an Edge
   * 
   * @param edgeId Edge Id (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> postTelephonyProvidersEdgeUnpairWithHttpInfo(String edgeId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling postTelephonyProvidersEdgeUnpair");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/unpair".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<String>() {});
  }

  /**
   * Unpair an Edge
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String postTelephonyProvidersEdgeUnpair(PostTelephonyProvidersEdgeUnpairRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Unpair an Edge
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> postTelephonyProvidersEdgeUnpair(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Create an edge.
   * 
   * @param body Edge (required)
   * @return Edge
   * @throws ApiException if fails to make API call
   */
  public Edge postTelephonyProvidersEdges(Edge body) throws ApiException {
    return postTelephonyProvidersEdgesWithHttpInfo(body).getBody();
  }

  /**
   * Create an edge.
   * 
   * @param body Edge (required)
   * @return Edge
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Edge> postTelephonyProvidersEdgesWithHttpInfo(Edge body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdges");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Edge>() {});
  }

  /**
   * Create an edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Edge postTelephonyProvidersEdges(PostTelephonyProvidersEdgesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Edge>() {});
  }

  /**
   * Create an edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Edge> postTelephonyProvidersEdges(ApiRequest<Edge> request) throws ApiException {
    return pcapiClient.<Edge>invokeAPIVerbose(request, new TypeReference<Edge>() {});
  }

  /**
   * Validates a street address
   * 
   * @param body Address (required)
   * @return ValidateAddressResponse
   * @throws ApiException if fails to make API call
   */
  public ValidateAddressResponse postTelephonyProvidersEdgesAddressvalidation(ValidateAddressRequest body) throws ApiException {
    return postTelephonyProvidersEdgesAddressvalidationWithHttpInfo(body).getBody();
  }

  /**
   * Validates a street address
   * 
   * @param body Address (required)
   * @return ValidateAddressResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ValidateAddressResponse> postTelephonyProvidersEdgesAddressvalidationWithHttpInfo(ValidateAddressRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesAddressvalidation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/addressvalidation".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ValidateAddressResponse>() {});
  }

  /**
   * Validates a street address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ValidateAddressResponse postTelephonyProvidersEdgesAddressvalidation(PostTelephonyProvidersEdgesAddressvalidationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ValidateAddressResponse>() {});
  }

  /**
   * Validates a street address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ValidateAddressResponse> postTelephonyProvidersEdgesAddressvalidation(ApiRequest<ValidateAddressRequest> request) throws ApiException {
    return pcapiClient.<ValidateAddressResponse>invokeAPIVerbose(request, new TypeReference<ValidateAddressResponse>() {});
  }

  /**
   * Create a certificate authority.
   * 
   * @param body CertificateAuthority (required)
   * @return DomainCertificateAuthority
   * @throws ApiException if fails to make API call
   */
  public DomainCertificateAuthority postTelephonyProvidersEdgesCertificateauthorities(DomainCertificateAuthority body) throws ApiException {
    return postTelephonyProvidersEdgesCertificateauthoritiesWithHttpInfo(body).getBody();
  }

  /**
   * Create a certificate authority.
   * 
   * @param body CertificateAuthority (required)
   * @return DomainCertificateAuthority
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainCertificateAuthority> postTelephonyProvidersEdgesCertificateauthoritiesWithHttpInfo(DomainCertificateAuthority body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesCertificateauthorities");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/certificateauthorities".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainCertificateAuthority>() {});
  }

  /**
   * Create a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainCertificateAuthority postTelephonyProvidersEdgesCertificateauthorities(PostTelephonyProvidersEdgesCertificateauthoritiesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainCertificateAuthority>() {});
  }

  /**
   * Create a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainCertificateAuthority> postTelephonyProvidersEdgesCertificateauthorities(ApiRequest<DomainCertificateAuthority> request) throws ApiException {
    return pcapiClient.<DomainCertificateAuthority>invokeAPIVerbose(request, new TypeReference<DomainCertificateAuthority>() {});
  }

  /**
   * Create a new DID pool
   * 
   * @param body DID pool (required)
   * @return DIDPool
   * @throws ApiException if fails to make API call
   */
  public DIDPool postTelephonyProvidersEdgesDidpools(DIDPool body) throws ApiException {
    return postTelephonyProvidersEdgesDidpoolsWithHttpInfo(body).getBody();
  }

  /**
   * Create a new DID pool
   * 
   * @param body DID pool (required)
   * @return DIDPool
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DIDPool> postTelephonyProvidersEdgesDidpoolsWithHttpInfo(DIDPool body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesDidpools");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/didpools".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DIDPool>() {});
  }

  /**
   * Create a new DID pool
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DIDPool postTelephonyProvidersEdgesDidpools(PostTelephonyProvidersEdgesDidpoolsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DIDPool>() {});
  }

  /**
   * Create a new DID pool
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DIDPool> postTelephonyProvidersEdgesDidpools(ApiRequest<DIDPool> request) throws ApiException {
    return pcapiClient.<DIDPool>invokeAPIVerbose(request, new TypeReference<DIDPool>() {});
  }

  /**
   * Create an edge group.
   * 
   * @param body EdgeGroup (required)
   * @return EdgeGroup
   * @throws ApiException if fails to make API call
   */
  public EdgeGroup postTelephonyProvidersEdgesEdgegroups(EdgeGroup body) throws ApiException {
    return postTelephonyProvidersEdgesEdgegroupsWithHttpInfo(body).getBody();
  }

  /**
   * Create an edge group.
   * 
   * @param body EdgeGroup (required)
   * @return EdgeGroup
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeGroup> postTelephonyProvidersEdgesEdgegroupsWithHttpInfo(EdgeGroup body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesEdgegroups");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/edgegroups".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeGroup>() {});
  }

  /**
   * Create an edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeGroup postTelephonyProvidersEdgesEdgegroups(PostTelephonyProvidersEdgesEdgegroupsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeGroup>() {});
  }

  /**
   * Create an edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeGroup> postTelephonyProvidersEdgesEdgegroups(ApiRequest<EdgeGroup> request) throws ApiException {
    return pcapiClient.<EdgeGroup>invokeAPIVerbose(request, new TypeReference<EdgeGroup>() {});
  }

  /**
   * Create endpoint
   * 
   * @param body EndpointTemplate (required)
   * @return Endpoint
   * @throws ApiException if fails to make API call
   */
  public Endpoint postTelephonyProvidersEdgesEndpoints(Endpoint body) throws ApiException {
    return postTelephonyProvidersEdgesEndpointsWithHttpInfo(body).getBody();
  }

  /**
   * Create endpoint
   * 
   * @param body EndpointTemplate (required)
   * @return Endpoint
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Endpoint> postTelephonyProvidersEdgesEndpointsWithHttpInfo(Endpoint body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesEndpoints");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/endpoints".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Endpoint>() {});
  }

  /**
   * Create endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Endpoint postTelephonyProvidersEdgesEndpoints(PostTelephonyProvidersEdgesEndpointsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Endpoint>() {});
  }

  /**
   * Create endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Endpoint> postTelephonyProvidersEdgesEndpoints(ApiRequest<Endpoint> request) throws ApiException {
    return pcapiClient.<Endpoint>invokeAPIVerbose(request, new TypeReference<Endpoint>() {});
  }

  /**
   * Create a new extension pool
   * 
   * @param body ExtensionPool (required)
   * @return ExtensionPool
   * @throws ApiException if fails to make API call
   */
  public ExtensionPool postTelephonyProvidersEdgesExtensionpools(ExtensionPool body) throws ApiException {
    return postTelephonyProvidersEdgesExtensionpoolsWithHttpInfo(body).getBody();
  }

  /**
   * Create a new extension pool
   * 
   * @param body ExtensionPool (required)
   * @return ExtensionPool
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExtensionPool> postTelephonyProvidersEdgesExtensionpoolsWithHttpInfo(ExtensionPool body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesExtensionpools");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/extensionpools".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExtensionPool>() {});
  }

  /**
   * Create a new extension pool
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExtensionPool postTelephonyProvidersEdgesExtensionpools(PostTelephonyProvidersEdgesExtensionpoolsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExtensionPool>() {});
  }

  /**
   * Create a new extension pool
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExtensionPool> postTelephonyProvidersEdgesExtensionpools(ApiRequest<ExtensionPool> request) throws ApiException {
    return pcapiClient.<ExtensionPool>invokeAPIVerbose(request, new TypeReference<ExtensionPool>() {});
  }

  /**
   * Create outbound rule
   * 
   * @param body OutboundRoute (required)
   * @return OutboundRoute
   * @throws ApiException if fails to make API call
   */
  public OutboundRoute postTelephonyProvidersEdgesOutboundroutes(OutboundRoute body) throws ApiException {
    return postTelephonyProvidersEdgesOutboundroutesWithHttpInfo(body).getBody();
  }

  /**
   * Create outbound rule
   * 
   * @param body OutboundRoute (required)
   * @return OutboundRoute
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRoute> postTelephonyProvidersEdgesOutboundroutesWithHttpInfo(OutboundRoute body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesOutboundroutes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/outboundroutes".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OutboundRoute>() {});
  }

  /**
   * Create outbound rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OutboundRoute postTelephonyProvidersEdgesOutboundroutes(PostTelephonyProvidersEdgesOutboundroutesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OutboundRoute>() {});
  }

  /**
   * Create outbound rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRoute> postTelephonyProvidersEdgesOutboundroutes(ApiRequest<OutboundRoute> request) throws ApiException {
    return pcapiClient.<OutboundRoute>invokeAPIVerbose(request, new TypeReference<OutboundRoute>() {});
  }

  /**
   * Reboot a Phone
   * 
   * @param phoneId Phone Id (required)
   * @throws ApiException if fails to make API call
   */
  public void postTelephonyProvidersEdgesPhoneReboot(String phoneId) throws ApiException {
    postTelephonyProvidersEdgesPhoneRebootWithHttpInfo(phoneId);
  }

  /**
   * Reboot a Phone
   * 
   * @param phoneId Phone Id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postTelephonyProvidersEdgesPhoneRebootWithHttpInfo(String phoneId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'phoneId' is set
    if (phoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneId' when calling postTelephonyProvidersEdgesPhoneReboot");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phones/{phoneId}/reboot".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "phoneId" + "\\}", pcapiClient.escapeString(phoneId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Reboot a Phone
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postTelephonyProvidersEdgesPhoneReboot(PostTelephonyProvidersEdgesPhoneRebootRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Reboot a Phone
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postTelephonyProvidersEdgesPhoneReboot(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Create a new Phone Base Settings object
   * 
   * @param body Phone base settings (required)
   * @return PhoneBase
   * @throws ApiException if fails to make API call
   */
  public PhoneBase postTelephonyProvidersEdgesPhonebasesettings(PhoneBase body) throws ApiException {
    return postTelephonyProvidersEdgesPhonebasesettingsWithHttpInfo(body).getBody();
  }

  /**
   * Create a new Phone Base Settings object
   * 
   * @param body Phone base settings (required)
   * @return PhoneBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneBase> postTelephonyProvidersEdgesPhonebasesettingsWithHttpInfo(PhoneBase body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesPhonebasesettings");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phonebasesettings".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PhoneBase>() {});
  }

  /**
   * Create a new Phone Base Settings object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PhoneBase postTelephonyProvidersEdgesPhonebasesettings(PostTelephonyProvidersEdgesPhonebasesettingsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PhoneBase>() {});
  }

  /**
   * Create a new Phone Base Settings object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneBase> postTelephonyProvidersEdgesPhonebasesettings(ApiRequest<PhoneBase> request) throws ApiException {
    return pcapiClient.<PhoneBase>invokeAPIVerbose(request, new TypeReference<PhoneBase>() {});
  }

  /**
   * Create a new Phone
   * 
   * @param body Phone (required)
   * @return Phone
   * @throws ApiException if fails to make API call
   */
  public Phone postTelephonyProvidersEdgesPhones(Phone body) throws ApiException {
    return postTelephonyProvidersEdgesPhonesWithHttpInfo(body).getBody();
  }

  /**
   * Create a new Phone
   * 
   * @param body Phone (required)
   * @return Phone
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Phone> postTelephonyProvidersEdgesPhonesWithHttpInfo(Phone body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesPhones");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phones".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Phone>() {});
  }

  /**
   * Create a new Phone
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Phone postTelephonyProvidersEdgesPhones(PostTelephonyProvidersEdgesPhonesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Phone>() {});
  }

  /**
   * Create a new Phone
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Phone> postTelephonyProvidersEdgesPhones(ApiRequest<Phone> request) throws ApiException {
    return pcapiClient.<Phone>invokeAPIVerbose(request, new TypeReference<Phone>() {});
  }

  /**
   * Reboot Multiple Phones
   * 
   * @param body Phones (required)
   * @throws ApiException if fails to make API call
   */
  public void postTelephonyProvidersEdgesPhonesReboot(PhonesReboot body) throws ApiException {
    postTelephonyProvidersEdgesPhonesRebootWithHttpInfo(body);
  }

  /**
   * Reboot Multiple Phones
   * 
   * @param body Phones (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postTelephonyProvidersEdgesPhonesRebootWithHttpInfo(PhonesReboot body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesPhonesReboot");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phones/reboot".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Reboot Multiple Phones
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postTelephonyProvidersEdgesPhonesReboot(PostTelephonyProvidersEdgesPhonesRebootRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Reboot Multiple Phones
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postTelephonyProvidersEdgesPhonesReboot(ApiRequest<PhonesReboot> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Create outbound route
   * 
   * @param siteId Site ID (required)
   * @param body OutboundRoute (required)
   * @return OutboundRouteBase
   * @throws ApiException if fails to make API call
   */
  public OutboundRouteBase postTelephonyProvidersEdgesSiteOutboundroutes(String siteId, OutboundRouteBase body) throws ApiException {
    return postTelephonyProvidersEdgesSiteOutboundroutesWithHttpInfo(siteId, body).getBody();
  }

  /**
   * Create outbound route
   * 
   * @param siteId Site ID (required)
   * @param body OutboundRoute (required)
   * @return OutboundRouteBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRouteBase> postTelephonyProvidersEdgesSiteOutboundroutesWithHttpInfo(String siteId, OutboundRouteBase body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling postTelephonyProvidersEdgesSiteOutboundroutes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesSiteOutboundroutes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OutboundRouteBase>() {});
  }

  /**
   * Create outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OutboundRouteBase postTelephonyProvidersEdgesSiteOutboundroutes(PostTelephonyProvidersEdgesSiteOutboundroutesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OutboundRouteBase>() {});
  }

  /**
   * Create outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRouteBase> postTelephonyProvidersEdgesSiteOutboundroutes(ApiRequest<OutboundRouteBase> request) throws ApiException {
    return pcapiClient.<OutboundRouteBase>invokeAPIVerbose(request, new TypeReference<OutboundRouteBase>() {});
  }

  /**
   * Triggers the rebalance operation.
   * 
   * @param siteId Site ID (required)
   * @throws ApiException if fails to make API call
   */
  public void postTelephonyProvidersEdgesSiteRebalance(String siteId) throws ApiException {
    postTelephonyProvidersEdgesSiteRebalanceWithHttpInfo(siteId);
  }

  /**
   * Triggers the rebalance operation.
   * 
   * @param siteId Site ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postTelephonyProvidersEdgesSiteRebalanceWithHttpInfo(String siteId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling postTelephonyProvidersEdgesSiteRebalance");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}/rebalance".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Triggers the rebalance operation.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postTelephonyProvidersEdgesSiteRebalance(PostTelephonyProvidersEdgesSiteRebalanceRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Triggers the rebalance operation.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postTelephonyProvidersEdgesSiteRebalance(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Create a Site.
   * 
   * @param body Site (required)
   * @return Site
   * @throws ApiException if fails to make API call
   */
  public Site postTelephonyProvidersEdgesSites(Site body) throws ApiException {
    return postTelephonyProvidersEdgesSitesWithHttpInfo(body).getBody();
  }

  /**
   * Create a Site.
   * 
   * @param body Site (required)
   * @return Site
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Site> postTelephonyProvidersEdgesSitesWithHttpInfo(Site body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesSites");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Site>() {});
  }

  /**
   * Create a Site.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Site postTelephonyProvidersEdgesSites(PostTelephonyProvidersEdgesSitesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Site>() {});
  }

  /**
   * Create a Site.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Site> postTelephonyProvidersEdgesSites(ApiRequest<Site> request) throws ApiException {
    return pcapiClient.<Site>invokeAPIVerbose(request, new TypeReference<Site>() {});
  }

  /**
   * Create a Trunk Base Settings object
   * 
   * @param body Trunk base settings (required)
   * @return TrunkBase
   * @throws ApiException if fails to make API call
   */
  public TrunkBase postTelephonyProvidersEdgesTrunkbasesettings(TrunkBase body) throws ApiException {
    return postTelephonyProvidersEdgesTrunkbasesettingsWithHttpInfo(body).getBody();
  }

  /**
   * Create a Trunk Base Settings object
   * 
   * @param body Trunk base settings (required)
   * @return TrunkBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkBase> postTelephonyProvidersEdgesTrunkbasesettingsWithHttpInfo(TrunkBase body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postTelephonyProvidersEdgesTrunkbasesettings");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/trunkbasesettings".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TrunkBase>() {});
  }

  /**
   * Create a Trunk Base Settings object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TrunkBase postTelephonyProvidersEdgesTrunkbasesettings(PostTelephonyProvidersEdgesTrunkbasesettingsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TrunkBase>() {});
  }

  /**
   * Create a Trunk Base Settings object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkBase> postTelephonyProvidersEdgesTrunkbasesettings(ApiRequest<TrunkBase> request) throws ApiException {
    return pcapiClient.<TrunkBase>invokeAPIVerbose(request, new TypeReference<TrunkBase>() {});
  }

  /**
   * Update a edge.
   * 
   * @param edgeId Edge ID (required)
   * @param body Edge (required)
   * @return Edge
   * @throws ApiException if fails to make API call
   */
  public Edge putTelephonyProvidersEdge(String edgeId, Edge body) throws ApiException {
    return putTelephonyProvidersEdgeWithHttpInfo(edgeId, body).getBody();
  }

  /**
   * Update a edge.
   * 
   * @param edgeId Edge ID (required)
   * @param body Edge (required)
   * @return Edge
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Edge> putTelephonyProvidersEdgeWithHttpInfo(String edgeId, Edge body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling putTelephonyProvidersEdge");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdge");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Edge>() {});
  }

  /**
   * Update a edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Edge putTelephonyProvidersEdge(PutTelephonyProvidersEdgeRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Edge>() {});
  }

  /**
   * Update a edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Edge> putTelephonyProvidersEdge(ApiRequest<Edge> request) throws ApiException {
    return pcapiClient.<Edge>invokeAPIVerbose(request, new TypeReference<Edge>() {});
  }

  /**
   * Update a line.
   * 
   * @param edgeId Edge ID (required)
   * @param lineId Line ID (required)
   * @param body Line (required)
   * @return EdgeLine
   * @throws ApiException if fails to make API call
   */
  public EdgeLine putTelephonyProvidersEdgeLine(String edgeId, String lineId, EdgeLine body) throws ApiException {
    return putTelephonyProvidersEdgeLineWithHttpInfo(edgeId, lineId, body).getBody();
  }

  /**
   * Update a line.
   * 
   * @param edgeId Edge ID (required)
   * @param lineId Line ID (required)
   * @param body Line (required)
   * @return EdgeLine
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeLine> putTelephonyProvidersEdgeLineWithHttpInfo(String edgeId, String lineId, EdgeLine body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling putTelephonyProvidersEdgeLine");
    }
    
    // verify the required parameter 'lineId' is set
    if (lineId == null) {
      throw new ApiException(400, "Missing the required parameter 'lineId' when calling putTelephonyProvidersEdgeLine");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgeLine");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/lines/{lineId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()))
      .replaceAll("\\{" + "lineId" + "\\}", pcapiClient.escapeString(lineId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeLine>() {});
  }

  /**
   * Update a line.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeLine putTelephonyProvidersEdgeLine(PutTelephonyProvidersEdgeLineRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeLine>() {});
  }

  /**
   * Update a line.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeLine> putTelephonyProvidersEdgeLine(ApiRequest<EdgeLine> request) throws ApiException {
    return pcapiClient.<EdgeLine>invokeAPIVerbose(request, new TypeReference<EdgeLine>() {});
  }

  /**
   * Update an edge logical interface.
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @param body Logical interface (required)
   * @return DomainLogicalInterface
   * @throws ApiException if fails to make API call
   */
  public DomainLogicalInterface putTelephonyProvidersEdgeLogicalinterface(String edgeId, String interfaceId, DomainLogicalInterface body) throws ApiException {
    return putTelephonyProvidersEdgeLogicalinterfaceWithHttpInfo(edgeId, interfaceId, body).getBody();
  }

  /**
   * Update an edge logical interface.
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @param body Logical interface (required)
   * @return DomainLogicalInterface
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainLogicalInterface> putTelephonyProvidersEdgeLogicalinterfaceWithHttpInfo(String edgeId, String interfaceId, DomainLogicalInterface body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'edgeId' is set
    if (edgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeId' when calling putTelephonyProvidersEdgeLogicalinterface");
    }
    
    // verify the required parameter 'interfaceId' is set
    if (interfaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'interfaceId' when calling putTelephonyProvidersEdgeLogicalinterface");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgeLogicalinterface");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeId" + "\\}", pcapiClient.escapeString(edgeId.toString()))
      .replaceAll("\\{" + "interfaceId" + "\\}", pcapiClient.escapeString(interfaceId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainLogicalInterface>() {});
  }

  /**
   * Update an edge logical interface.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainLogicalInterface putTelephonyProvidersEdgeLogicalinterface(PutTelephonyProvidersEdgeLogicalinterfaceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainLogicalInterface>() {});
  }

  /**
   * Update an edge logical interface.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainLogicalInterface> putTelephonyProvidersEdgeLogicalinterface(ApiRequest<DomainLogicalInterface> request) throws ApiException {
    return pcapiClient.<DomainLogicalInterface>invokeAPIVerbose(request, new TypeReference<DomainLogicalInterface>() {});
  }

  /**
   * Update a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @param body Certificate authority (required)
   * @return DomainCertificateAuthority
   * @throws ApiException if fails to make API call
   */
  public DomainCertificateAuthority putTelephonyProvidersEdgesCertificateauthority(String certificateId, DomainCertificateAuthority body) throws ApiException {
    return putTelephonyProvidersEdgesCertificateauthorityWithHttpInfo(certificateId, body).getBody();
  }

  /**
   * Update a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @param body Certificate authority (required)
   * @return DomainCertificateAuthority
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainCertificateAuthority> putTelephonyProvidersEdgesCertificateauthorityWithHttpInfo(String certificateId, DomainCertificateAuthority body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'certificateId' is set
    if (certificateId == null) {
      throw new ApiException(400, "Missing the required parameter 'certificateId' when calling putTelephonyProvidersEdgesCertificateauthority");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesCertificateauthority");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/certificateauthorities/{certificateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "certificateId" + "\\}", pcapiClient.escapeString(certificateId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainCertificateAuthority>() {});
  }

  /**
   * Update a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainCertificateAuthority putTelephonyProvidersEdgesCertificateauthority(PutTelephonyProvidersEdgesCertificateauthorityRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainCertificateAuthority>() {});
  }

  /**
   * Update a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainCertificateAuthority> putTelephonyProvidersEdgesCertificateauthority(ApiRequest<DomainCertificateAuthority> request) throws ApiException {
    return pcapiClient.<DomainCertificateAuthority>invokeAPIVerbose(request, new TypeReference<DomainCertificateAuthority>() {});
  }

  /**
   * Update a DID by ID.
   * 
   * @param didId DID ID (required)
   * @param body DID (required)
   * @return DID
   * @throws ApiException if fails to make API call
   */
  public DID putTelephonyProvidersEdgesDid(String didId, DID body) throws ApiException {
    return putTelephonyProvidersEdgesDidWithHttpInfo(didId, body).getBody();
  }

  /**
   * Update a DID by ID.
   * 
   * @param didId DID ID (required)
   * @param body DID (required)
   * @return DID
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DID> putTelephonyProvidersEdgesDidWithHttpInfo(String didId, DID body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'didId' is set
    if (didId == null) {
      throw new ApiException(400, "Missing the required parameter 'didId' when calling putTelephonyProvidersEdgesDid");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesDid");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/dids/{didId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "didId" + "\\}", pcapiClient.escapeString(didId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DID>() {});
  }

  /**
   * Update a DID by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DID putTelephonyProvidersEdgesDid(PutTelephonyProvidersEdgesDidRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DID>() {});
  }

  /**
   * Update a DID by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DID> putTelephonyProvidersEdgesDid(ApiRequest<DID> request) throws ApiException {
    return pcapiClient.<DID>invokeAPIVerbose(request, new TypeReference<DID>() {});
  }

  /**
   * Update a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @param body DID pool (required)
   * @return DIDPool
   * @throws ApiException if fails to make API call
   */
  public DIDPool putTelephonyProvidersEdgesDidpool(String didPoolId, DIDPool body) throws ApiException {
    return putTelephonyProvidersEdgesDidpoolWithHttpInfo(didPoolId, body).getBody();
  }

  /**
   * Update a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @param body DID pool (required)
   * @return DIDPool
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DIDPool> putTelephonyProvidersEdgesDidpoolWithHttpInfo(String didPoolId, DIDPool body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'didPoolId' is set
    if (didPoolId == null) {
      throw new ApiException(400, "Missing the required parameter 'didPoolId' when calling putTelephonyProvidersEdgesDidpool");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesDidpool");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/didpools/{didPoolId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "didPoolId" + "\\}", pcapiClient.escapeString(didPoolId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DIDPool>() {});
  }

  /**
   * Update a DID Pool by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DIDPool putTelephonyProvidersEdgesDidpool(PutTelephonyProvidersEdgesDidpoolRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DIDPool>() {});
  }

  /**
   * Update a DID Pool by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DIDPool> putTelephonyProvidersEdgesDidpool(ApiRequest<DIDPool> request) throws ApiException {
    return pcapiClient.<DIDPool>invokeAPIVerbose(request, new TypeReference<DIDPool>() {});
  }

  /**
   * Update an edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @param body EdgeGroup (required)
   * @return EdgeGroup
   * @throws ApiException if fails to make API call
   */
  public EdgeGroup putTelephonyProvidersEdgesEdgegroup(String edgeGroupId, EdgeGroup body) throws ApiException {
    return putTelephonyProvidersEdgesEdgegroupWithHttpInfo(edgeGroupId, body).getBody();
  }

  /**
   * Update an edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @param body EdgeGroup (required)
   * @return EdgeGroup
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeGroup> putTelephonyProvidersEdgesEdgegroupWithHttpInfo(String edgeGroupId, EdgeGroup body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'edgeGroupId' is set
    if (edgeGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgeGroupId' when calling putTelephonyProvidersEdgesEdgegroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesEdgegroup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/edgegroups/{edgeGroupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgeGroupId" + "\\}", pcapiClient.escapeString(edgeGroupId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeGroup>() {});
  }

  /**
   * Update an edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeGroup putTelephonyProvidersEdgesEdgegroup(PutTelephonyProvidersEdgesEdgegroupRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeGroup>() {});
  }

  /**
   * Update an edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeGroup> putTelephonyProvidersEdgesEdgegroup(ApiRequest<EdgeGroup> request) throws ApiException {
    return pcapiClient.<EdgeGroup>invokeAPIVerbose(request, new TypeReference<EdgeGroup>() {});
  }

  /**
   * Update the edge trunk base associated with the edge group
   * 
   * @param edgegroupId Edge Group ID (required)
   * @param edgetrunkbaseId Edge Trunk Base ID (required)
   * @param body EdgeTrunkBase (required)
   * @return EdgeTrunkBase
   * @throws ApiException if fails to make API call
   */
  public EdgeTrunkBase putTelephonyProvidersEdgesEdgegroupEdgetrunkbasis(String edgegroupId, String edgetrunkbaseId, EdgeTrunkBase body) throws ApiException {
    return putTelephonyProvidersEdgesEdgegroupEdgetrunkbasisWithHttpInfo(edgegroupId, edgetrunkbaseId, body).getBody();
  }

  /**
   * Update the edge trunk base associated with the edge group
   * 
   * @param edgegroupId Edge Group ID (required)
   * @param edgetrunkbaseId Edge Trunk Base ID (required)
   * @param body EdgeTrunkBase (required)
   * @return EdgeTrunkBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeTrunkBase> putTelephonyProvidersEdgesEdgegroupEdgetrunkbasisWithHttpInfo(String edgegroupId, String edgetrunkbaseId, EdgeTrunkBase body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'edgegroupId' is set
    if (edgegroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgegroupId' when calling putTelephonyProvidersEdgesEdgegroupEdgetrunkbasis");
    }
    
    // verify the required parameter 'edgetrunkbaseId' is set
    if (edgetrunkbaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'edgetrunkbaseId' when calling putTelephonyProvidersEdgesEdgegroupEdgetrunkbasis");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesEdgegroupEdgetrunkbasis");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/edgegroups/{edgegroupId}/edgetrunkbases/{edgetrunkbaseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "edgegroupId" + "\\}", pcapiClient.escapeString(edgegroupId.toString()))
      .replaceAll("\\{" + "edgetrunkbaseId" + "\\}", pcapiClient.escapeString(edgetrunkbaseId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EdgeTrunkBase>() {});
  }

  /**
   * Update the edge trunk base associated with the edge group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EdgeTrunkBase putTelephonyProvidersEdgesEdgegroupEdgetrunkbasis(PutTelephonyProvidersEdgesEdgegroupEdgetrunkbasisRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EdgeTrunkBase>() {});
  }

  /**
   * Update the edge trunk base associated with the edge group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EdgeTrunkBase> putTelephonyProvidersEdgesEdgegroupEdgetrunkbasis(ApiRequest<EdgeTrunkBase> request) throws ApiException {
    return pcapiClient.<EdgeTrunkBase>invokeAPIVerbose(request, new TypeReference<EdgeTrunkBase>() {});
  }

  /**
   * Update endpoint
   * 
   * @param endpointId Endpoint ID (required)
   * @param body EndpointTemplate (required)
   * @return Endpoint
   * @throws ApiException if fails to make API call
   */
  public Endpoint putTelephonyProvidersEdgesEndpoint(String endpointId, Endpoint body) throws ApiException {
    return putTelephonyProvidersEdgesEndpointWithHttpInfo(endpointId, body).getBody();
  }

  /**
   * Update endpoint
   * 
   * @param endpointId Endpoint ID (required)
   * @param body EndpointTemplate (required)
   * @return Endpoint
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Endpoint> putTelephonyProvidersEdgesEndpointWithHttpInfo(String endpointId, Endpoint body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling putTelephonyProvidersEdgesEndpoint");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesEndpoint");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/endpoints/{endpointId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "endpointId" + "\\}", pcapiClient.escapeString(endpointId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Endpoint>() {});
  }

  /**
   * Update endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Endpoint putTelephonyProvidersEdgesEndpoint(PutTelephonyProvidersEdgesEndpointRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Endpoint>() {});
  }

  /**
   * Update endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Endpoint> putTelephonyProvidersEdgesEndpoint(ApiRequest<Endpoint> request) throws ApiException {
    return pcapiClient.<Endpoint>invokeAPIVerbose(request, new TypeReference<Endpoint>() {});
  }

  /**
   * Update an extension by ID.
   * 
   * @param extensionId Extension ID (required)
   * @param body Extension (required)
   * @return Extension
   * @throws ApiException if fails to make API call
   */
  public Extension putTelephonyProvidersEdgesExtension(String extensionId, Extension body) throws ApiException {
    return putTelephonyProvidersEdgesExtensionWithHttpInfo(extensionId, body).getBody();
  }

  /**
   * Update an extension by ID.
   * 
   * @param extensionId Extension ID (required)
   * @param body Extension (required)
   * @return Extension
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Extension> putTelephonyProvidersEdgesExtensionWithHttpInfo(String extensionId, Extension body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'extensionId' is set
    if (extensionId == null) {
      throw new ApiException(400, "Missing the required parameter 'extensionId' when calling putTelephonyProvidersEdgesExtension");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesExtension");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/extensions/{extensionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "extensionId" + "\\}", pcapiClient.escapeString(extensionId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Extension>() {});
  }

  /**
   * Update an extension by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Extension putTelephonyProvidersEdgesExtension(PutTelephonyProvidersEdgesExtensionRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Extension>() {});
  }

  /**
   * Update an extension by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Extension> putTelephonyProvidersEdgesExtension(ApiRequest<Extension> request) throws ApiException {
    return pcapiClient.<Extension>invokeAPIVerbose(request, new TypeReference<Extension>() {});
  }

  /**
   * Update an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @param body ExtensionPool (required)
   * @return ExtensionPool
   * @throws ApiException if fails to make API call
   */
  public ExtensionPool putTelephonyProvidersEdgesExtensionpool(String extensionPoolId, ExtensionPool body) throws ApiException {
    return putTelephonyProvidersEdgesExtensionpoolWithHttpInfo(extensionPoolId, body).getBody();
  }

  /**
   * Update an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @param body ExtensionPool (required)
   * @return ExtensionPool
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExtensionPool> putTelephonyProvidersEdgesExtensionpoolWithHttpInfo(String extensionPoolId, ExtensionPool body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'extensionPoolId' is set
    if (extensionPoolId == null) {
      throw new ApiException(400, "Missing the required parameter 'extensionPoolId' when calling putTelephonyProvidersEdgesExtensionpool");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesExtensionpool");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/extensionpools/{extensionPoolId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "extensionPoolId" + "\\}", pcapiClient.escapeString(extensionPoolId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExtensionPool>() {});
  }

  /**
   * Update an extension pool by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExtensionPool putTelephonyProvidersEdgesExtensionpool(PutTelephonyProvidersEdgesExtensionpoolRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExtensionPool>() {});
  }

  /**
   * Update an extension pool by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExtensionPool> putTelephonyProvidersEdgesExtensionpool(ApiRequest<ExtensionPool> request) throws ApiException {
    return pcapiClient.<ExtensionPool>invokeAPIVerbose(request, new TypeReference<ExtensionPool>() {});
  }

  /**
   * Update outbound route
   * 
   * @param outboundRouteId Outbound route ID (required)
   * @param body OutboundRoute (required)
   * @return OutboundRoute
   * @throws ApiException if fails to make API call
   */
  public OutboundRoute putTelephonyProvidersEdgesOutboundroute(String outboundRouteId, OutboundRoute body) throws ApiException {
    return putTelephonyProvidersEdgesOutboundrouteWithHttpInfo(outboundRouteId, body).getBody();
  }

  /**
   * Update outbound route
   * 
   * @param outboundRouteId Outbound route ID (required)
   * @param body OutboundRoute (required)
   * @return OutboundRoute
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRoute> putTelephonyProvidersEdgesOutboundrouteWithHttpInfo(String outboundRouteId, OutboundRoute body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'outboundRouteId' is set
    if (outboundRouteId == null) {
      throw new ApiException(400, "Missing the required parameter 'outboundRouteId' when calling putTelephonyProvidersEdgesOutboundroute");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesOutboundroute");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "outboundRouteId" + "\\}", pcapiClient.escapeString(outboundRouteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OutboundRoute>() {});
  }

  /**
   * Update outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OutboundRoute putTelephonyProvidersEdgesOutboundroute(PutTelephonyProvidersEdgesOutboundrouteRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OutboundRoute>() {});
  }

  /**
   * Update outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRoute> putTelephonyProvidersEdgesOutboundroute(ApiRequest<OutboundRoute> request) throws ApiException {
    return pcapiClient.<OutboundRoute>invokeAPIVerbose(request, new TypeReference<OutboundRoute>() {});
  }

  /**
   * Update a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @param body Phone (required)
   * @return Phone
   * @throws ApiException if fails to make API call
   */
  public Phone putTelephonyProvidersEdgesPhone(String phoneId, Phone body) throws ApiException {
    return putTelephonyProvidersEdgesPhoneWithHttpInfo(phoneId, body).getBody();
  }

  /**
   * Update a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @param body Phone (required)
   * @return Phone
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Phone> putTelephonyProvidersEdgesPhoneWithHttpInfo(String phoneId, Phone body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'phoneId' is set
    if (phoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneId' when calling putTelephonyProvidersEdgesPhone");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesPhone");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phones/{phoneId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "phoneId" + "\\}", pcapiClient.escapeString(phoneId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Phone>() {});
  }

  /**
   * Update a Phone by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Phone putTelephonyProvidersEdgesPhone(PutTelephonyProvidersEdgesPhoneRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Phone>() {});
  }

  /**
   * Update a Phone by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Phone> putTelephonyProvidersEdgesPhone(ApiRequest<Phone> request) throws ApiException {
    return pcapiClient.<Phone>invokeAPIVerbose(request, new TypeReference<Phone>() {});
  }

  /**
   * Update a Phone Base Settings by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @param body Phone base settings (required)
   * @return PhoneBase
   * @throws ApiException if fails to make API call
   */
  public PhoneBase putTelephonyProvidersEdgesPhonebasesetting(String phoneBaseId, PhoneBase body) throws ApiException {
    return putTelephonyProvidersEdgesPhonebasesettingWithHttpInfo(phoneBaseId, body).getBody();
  }

  /**
   * Update a Phone Base Settings by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @param body Phone base settings (required)
   * @return PhoneBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneBase> putTelephonyProvidersEdgesPhonebasesettingWithHttpInfo(String phoneBaseId, PhoneBase body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'phoneBaseId' is set
    if (phoneBaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneBaseId' when calling putTelephonyProvidersEdgesPhonebasesetting");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesPhonebasesetting");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "phoneBaseId" + "\\}", pcapiClient.escapeString(phoneBaseId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PhoneBase>() {});
  }

  /**
   * Update a Phone Base Settings by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PhoneBase putTelephonyProvidersEdgesPhonebasesetting(PutTelephonyProvidersEdgesPhonebasesettingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PhoneBase>() {});
  }

  /**
   * Update a Phone Base Settings by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PhoneBase> putTelephonyProvidersEdgesPhonebasesetting(ApiRequest<PhoneBase> request) throws ApiException {
    return pcapiClient.<PhoneBase>invokeAPIVerbose(request, new TypeReference<PhoneBase>() {});
  }

  /**
   * Update a Site by ID.
   * 
   * @param siteId Site ID (required)
   * @param body Site (required)
   * @return Site
   * @throws ApiException if fails to make API call
   */
  public Site putTelephonyProvidersEdgesSite(String siteId, Site body) throws ApiException {
    return putTelephonyProvidersEdgesSiteWithHttpInfo(siteId, body).getBody();
  }

  /**
   * Update a Site by ID.
   * 
   * @param siteId Site ID (required)
   * @param body Site (required)
   * @return Site
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Site> putTelephonyProvidersEdgesSiteWithHttpInfo(String siteId, Site body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling putTelephonyProvidersEdgesSite");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesSite");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Site>() {});
  }

  /**
   * Update a Site by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Site putTelephonyProvidersEdgesSite(PutTelephonyProvidersEdgesSiteRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Site>() {});
  }

  /**
   * Update a Site by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Site> putTelephonyProvidersEdgesSite(ApiRequest<Site> request) throws ApiException {
    return pcapiClient.<Site>invokeAPIVerbose(request, new TypeReference<Site>() {});
  }

  /**
   * Update the list of Number Plans.
   * 
   * @param siteId Site ID (required)
   * @param body List of number plans (required)
   * @return List<NumberPlan>
   * @throws ApiException if fails to make API call
   */
  public List<NumberPlan> putTelephonyProvidersEdgesSiteNumberplans(String siteId, List<NumberPlan> body) throws ApiException {
    return putTelephonyProvidersEdgesSiteNumberplansWithHttpInfo(siteId, body).getBody();
  }

  /**
   * Update the list of Number Plans.
   * 
   * @param siteId Site ID (required)
   * @param body List of number plans (required)
   * @return List<NumberPlan>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<NumberPlan>> putTelephonyProvidersEdgesSiteNumberplansWithHttpInfo(String siteId, List<NumberPlan> body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling putTelephonyProvidersEdgesSiteNumberplans");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesSiteNumberplans");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}/numberplans".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<NumberPlan>>() {});
  }

  /**
   * Update the list of Number Plans.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<NumberPlan> putTelephonyProvidersEdgesSiteNumberplans(PutTelephonyProvidersEdgesSiteNumberplansRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<NumberPlan>>() {});
  }

  /**
   * Update the list of Number Plans.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<NumberPlan>> putTelephonyProvidersEdgesSiteNumberplans(ApiRequest<List<NumberPlan>> request) throws ApiException {
    return pcapiClient.<List<NumberPlan>>invokeAPIVerbose(request, new TypeReference<List<NumberPlan>>() {});
  }

  /**
   * Update outbound route
   * 
   * @param siteId Site ID (required)
   * @param outboundRouteId Outbound route ID (required)
   * @param body OutboundRoute (required)
   * @return OutboundRouteBase
   * @throws ApiException if fails to make API call
   */
  public OutboundRouteBase putTelephonyProvidersEdgesSiteOutboundroute(String siteId, String outboundRouteId, OutboundRouteBase body) throws ApiException {
    return putTelephonyProvidersEdgesSiteOutboundrouteWithHttpInfo(siteId, outboundRouteId, body).getBody();
  }

  /**
   * Update outbound route
   * 
   * @param siteId Site ID (required)
   * @param outboundRouteId Outbound route ID (required)
   * @param body OutboundRoute (required)
   * @return OutboundRouteBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRouteBase> putTelephonyProvidersEdgesSiteOutboundrouteWithHttpInfo(String siteId, String outboundRouteId, OutboundRouteBase body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'siteId' is set
    if (siteId == null) {
      throw new ApiException(400, "Missing the required parameter 'siteId' when calling putTelephonyProvidersEdgesSiteOutboundroute");
    }
    
    // verify the required parameter 'outboundRouteId' is set
    if (outboundRouteId == null) {
      throw new ApiException(400, "Missing the required parameter 'outboundRouteId' when calling putTelephonyProvidersEdgesSiteOutboundroute");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesSiteOutboundroute");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes/{outboundRouteId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "siteId" + "\\}", pcapiClient.escapeString(siteId.toString()))
      .replaceAll("\\{" + "outboundRouteId" + "\\}", pcapiClient.escapeString(outboundRouteId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OutboundRouteBase>() {});
  }

  /**
   * Update outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OutboundRouteBase putTelephonyProvidersEdgesSiteOutboundroute(PutTelephonyProvidersEdgesSiteOutboundrouteRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OutboundRouteBase>() {});
  }

  /**
   * Update outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutboundRouteBase> putTelephonyProvidersEdgesSiteOutboundroute(ApiRequest<OutboundRouteBase> request) throws ApiException {
    return pcapiClient.<OutboundRouteBase>invokeAPIVerbose(request, new TypeReference<OutboundRouteBase>() {});
  }

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @param body Trunk base settings (required)
   * @return TrunkBase
   * @throws ApiException if fails to make API call
   */
  public TrunkBase putTelephonyProvidersEdgesTrunkbasesetting(String trunkBaseSettingsId, TrunkBase body) throws ApiException {
    return putTelephonyProvidersEdgesTrunkbasesettingWithHttpInfo(trunkBaseSettingsId, body).getBody();
  }

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @param body Trunk base settings (required)
   * @return TrunkBase
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkBase> putTelephonyProvidersEdgesTrunkbasesettingWithHttpInfo(String trunkBaseSettingsId, TrunkBase body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'trunkBaseSettingsId' is set
    if (trunkBaseSettingsId == null) {
      throw new ApiException(400, "Missing the required parameter 'trunkBaseSettingsId' when calling putTelephonyProvidersEdgesTrunkbasesetting");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putTelephonyProvidersEdgesTrunkbasesetting");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trunkBaseSettingsId" + "\\}", pcapiClient.escapeString(trunkBaseSettingsId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TrunkBase>() {});
  }

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TrunkBase putTelephonyProvidersEdgesTrunkbasesetting(PutTelephonyProvidersEdgesTrunkbasesettingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TrunkBase>() {});
  }

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TrunkBase> putTelephonyProvidersEdgesTrunkbasesetting(ApiRequest<TrunkBase> request) throws ApiException {
    return pcapiClient.<TrunkBase>invokeAPIVerbose(request, new TypeReference<TrunkBase>() {});
  }

}
