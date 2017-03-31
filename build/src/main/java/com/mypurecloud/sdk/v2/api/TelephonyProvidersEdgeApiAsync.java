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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class TelephonyProvidersEdgeApiAsync {
  private final ApiClient pcapiClient;

  public TelephonyProvidersEdgeApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public TelephonyProvidersEdgeApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgeAsync(DeleteTelephonyProvidersEdgeRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete an edge logical interface
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteTelephonyProvidersEdgeLogicalinterfaceAsync(DeleteTelephonyProvidersEdgeLogicalinterfaceRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete an edge logical interface
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteTelephonyProvidersEdgeLogicalinterfaceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Cancels any in-progress update for this edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgeSoftwareupdateAsync(DeleteTelephonyProvidersEdgeSoftwareupdateRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Cancels any in-progress update for this edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgeSoftwareupdateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgesCertificateauthorityAsync(DeleteTelephonyProvidersEdgesCertificateauthorityRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesCertificateauthorityAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a DID Pool by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgesDidpoolAsync(DeleteTelephonyProvidersEdgesDidpoolRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a DID Pool by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesDidpoolAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete an edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgesEdgegroupAsync(DeleteTelephonyProvidersEdgesEdgegroupRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete an edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesEdgegroupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgesEndpointAsync(DeleteTelephonyProvidersEdgesEndpointRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesEndpointAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete an extension pool by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgesExtensionpoolAsync(DeleteTelephonyProvidersEdgesExtensionpoolRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete an extension pool by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesExtensionpoolAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete Outbound Route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgesOutboundrouteAsync(DeleteTelephonyProvidersEdgesOutboundrouteRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete Outbound Route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesOutboundrouteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a Phone by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgesPhoneAsync(DeleteTelephonyProvidersEdgesPhoneRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a Phone by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesPhoneAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a Phone Base Settings by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgesPhonebasesettingAsync(DeleteTelephonyProvidersEdgesPhonebasesettingRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a Phone Base Settings by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesPhonebasesettingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a Site by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgesSiteAsync(DeleteTelephonyProvidersEdgesSiteRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a Site by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesSiteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete Outbound Route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgesSiteOutboundrouteAsync(DeleteTelephonyProvidersEdgesSiteOutboundrouteRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete Outbound Route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesSiteOutboundrouteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a Trunk Base Settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteTelephonyProvidersEdgesTrunkbasesettingAsync(DeleteTelephonyProvidersEdgesTrunkbasesettingRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a Trunk Base Settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesTrunkbasesettingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Lists available schema categories (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SchemaCategoryEntityListing> getConfigurationSchemasEdgesVnextAsync(GetConfigurationSchemasEdgesVnextRequest request, AsyncApiCallback<SchemaCategoryEntityListing> callback) {
    return pcapiClient.<SchemaCategoryEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SchemaCategoryEntityListing>() {}, callback);
  }

  /**
   * Lists available schema categories (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SchemaCategoryEntityListing>> getConfigurationSchemasEdgesVnextAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SchemaCategoryEntityListing>> callback) {
    return pcapiClient.<SchemaCategoryEntityListing>invokeAPIVerboseAsync(request, new TypeReference<SchemaCategoryEntityListing>() {}, callback);
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SchemaReferenceEntityListing> getConfigurationSchemasEdgesVnextSchemaCategoryAsync(GetConfigurationSchemasEdgesVnextSchemaCategoryRequest request, AsyncApiCallback<SchemaReferenceEntityListing> callback) {
    return pcapiClient.<SchemaReferenceEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SchemaReferenceEntityListing>() {}, callback);
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SchemaReferenceEntityListing>> getConfigurationSchemasEdgesVnextSchemaCategoryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SchemaReferenceEntityListing>> callback) {
    return pcapiClient.<SchemaReferenceEntityListing>invokeAPIVerboseAsync(request, new TypeReference<SchemaReferenceEntityListing>() {}, callback);
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SchemaReferenceEntityListing> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeAsync(GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeRequest request, AsyncApiCallback<SchemaReferenceEntityListing> callback) {
    return pcapiClient.<SchemaReferenceEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SchemaReferenceEntityListing>() {}, callback);
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SchemaReferenceEntityListing>> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SchemaReferenceEntityListing>> callback) {
    return pcapiClient.<SchemaReferenceEntityListing>invokeAPIVerboseAsync(request, new TypeReference<SchemaReferenceEntityListing>() {}, callback);
  }

  /**
   * Get a json schema (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Organization> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdAsync(GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdRequest request, AsyncApiCallback<Organization> callback) {
    return pcapiClient.<Organization>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Organization>() {}, callback);
  }

  /**
   * Get a json schema (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Organization>> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Organization>> callback) {
    return pcapiClient.<Organization>invokeAPIVerboseAsync(request, new TypeReference<Organization>() {}, callback);
  }

  /**
   * Get metadata for a schema (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Organization> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdAsync(GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest request, AsyncApiCallback<Organization> callback) {
    return pcapiClient.<Organization>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Organization>() {}, callback);
  }

  /**
   * Get metadata for a schema (Deprecated)
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Organization>> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Organization>> callback) {
    return pcapiClient.<Organization>invokeAPIVerboseAsync(request, new TypeReference<Organization>() {}, callback);
  }

  /**
   * Get edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Edge> getTelephonyProvidersEdgeAsync(GetTelephonyProvidersEdgeRequest request, AsyncApiCallback<Edge> callback) {
    return pcapiClient.<Edge>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Edge>() {}, callback);
  }

  /**
   * Get edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Edge>> getTelephonyProvidersEdgeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Edge>> callback) {
    return pcapiClient.<Edge>invokeAPIVerboseAsync(request, new TypeReference<Edge>() {}, callback);
  }

  /**
   * Get line
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeLine> getTelephonyProvidersEdgeLineAsync(GetTelephonyProvidersEdgeLineRequest request, AsyncApiCallback<EdgeLine> callback) {
    return pcapiClient.<EdgeLine>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeLine>() {}, callback);
  }

  /**
   * Get line
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeLine>> getTelephonyProvidersEdgeLineAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeLine>> callback) {
    return pcapiClient.<EdgeLine>invokeAPIVerboseAsync(request, new TypeReference<EdgeLine>() {}, callback);
  }

  /**
   * Get the list of lines.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeLineEntityListing> getTelephonyProvidersEdgeLinesAsync(GetTelephonyProvidersEdgeLinesRequest request, AsyncApiCallback<EdgeLineEntityListing> callback) {
    return pcapiClient.<EdgeLineEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeLineEntityListing>() {}, callback);
  }

  /**
   * Get the list of lines.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeLineEntityListing>> getTelephonyProvidersEdgeLinesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeLineEntityListing>> callback) {
    return pcapiClient.<EdgeLineEntityListing>invokeAPIVerboseAsync(request, new TypeReference<EdgeLineEntityListing>() {}, callback);
  }

  /**
   * Get an edge logical interface
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainLogicalInterface> getTelephonyProvidersEdgeLogicalinterfaceAsync(GetTelephonyProvidersEdgeLogicalinterfaceRequest request, AsyncApiCallback<DomainLogicalInterface> callback) {
    return pcapiClient.<DomainLogicalInterface>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainLogicalInterface>() {}, callback);
  }

  /**
   * Get an edge logical interface
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainLogicalInterface>> getTelephonyProvidersEdgeLogicalinterfaceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainLogicalInterface>> callback) {
    return pcapiClient.<DomainLogicalInterface>invokeAPIVerboseAsync(request, new TypeReference<DomainLogicalInterface>() {}, callback);
  }

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LogicalInterfaceEntityListing> getTelephonyProvidersEdgeLogicalinterfacesAsync(GetTelephonyProvidersEdgeLogicalinterfacesRequest request, AsyncApiCallback<LogicalInterfaceEntityListing> callback) {
    return pcapiClient.<LogicalInterfaceEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LogicalInterfaceEntityListing>() {}, callback);
  }

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LogicalInterfaceEntityListing>> getTelephonyProvidersEdgeLogicalinterfacesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LogicalInterfaceEntityListing>> callback) {
    return pcapiClient.<LogicalInterfaceEntityListing>invokeAPIVerboseAsync(request, new TypeReference<LogicalInterfaceEntityListing>() {}, callback);
  }

  /**
   * Get an Edge logs job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeLogsJob> getTelephonyProvidersEdgeLogsJobAsync(GetTelephonyProvidersEdgeLogsJobRequest request, AsyncApiCallback<EdgeLogsJob> callback) {
    return pcapiClient.<EdgeLogsJob>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeLogsJob>() {}, callback);
  }

  /**
   * Get an Edge logs job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeLogsJob>> getTelephonyProvidersEdgeLogsJobAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeLogsJob>> callback) {
    return pcapiClient.<EdgeLogsJob>invokeAPIVerboseAsync(request, new TypeReference<EdgeLogsJob>() {}, callback);
  }

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainPhysicalInterface> getTelephonyProvidersEdgePhysicalinterfaceAsync(GetTelephonyProvidersEdgePhysicalinterfaceRequest request, AsyncApiCallback<DomainPhysicalInterface> callback) {
    return pcapiClient.<DomainPhysicalInterface>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainPhysicalInterface>() {}, callback);
  }

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainPhysicalInterface>> getTelephonyProvidersEdgePhysicalinterfaceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainPhysicalInterface>> callback) {
    return pcapiClient.<DomainPhysicalInterface>invokeAPIVerboseAsync(request, new TypeReference<DomainPhysicalInterface>() {}, callback);
  }

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PhysicalInterfaceEntityListing> getTelephonyProvidersEdgePhysicalinterfacesAsync(GetTelephonyProvidersEdgePhysicalinterfacesRequest request, AsyncApiCallback<PhysicalInterfaceEntityListing> callback) {
    return pcapiClient.<PhysicalInterfaceEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PhysicalInterfaceEntityListing>() {}, callback);
  }

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PhysicalInterfaceEntityListing>> getTelephonyProvidersEdgePhysicalinterfacesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PhysicalInterfaceEntityListing>> callback) {
    return pcapiClient.<PhysicalInterfaceEntityListing>invokeAPIVerboseAsync(request, new TypeReference<PhysicalInterfaceEntityListing>() {}, callback);
  }

  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VmPairingInfo> getTelephonyProvidersEdgeSetuppackageAsync(GetTelephonyProvidersEdgeSetuppackageRequest request, AsyncApiCallback<VmPairingInfo> callback) {
    return pcapiClient.<VmPairingInfo>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VmPairingInfo>() {}, callback);
  }

  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VmPairingInfo>> getTelephonyProvidersEdgeSetuppackageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VmPairingInfo>> callback) {
    return pcapiClient.<VmPairingInfo>invokeAPIVerboseAsync(request, new TypeReference<VmPairingInfo>() {}, callback);
  }

  /**
   * Gets software update status information about any edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainEdgeSoftwareUpdateDto> getTelephonyProvidersEdgeSoftwareupdateAsync(GetTelephonyProvidersEdgeSoftwareupdateRequest request, AsyncApiCallback<DomainEdgeSoftwareUpdateDto> callback) {
    return pcapiClient.<DomainEdgeSoftwareUpdateDto>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainEdgeSoftwareUpdateDto>() {}, callback);
  }

  /**
   * Gets software update status information about any edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainEdgeSoftwareUpdateDto>> getTelephonyProvidersEdgeSoftwareupdateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainEdgeSoftwareUpdateDto>> callback) {
    return pcapiClient.<DomainEdgeSoftwareUpdateDto>invokeAPIVerboseAsync(request, new TypeReference<DomainEdgeSoftwareUpdateDto>() {}, callback);
  }

  /**
   * Gets all the available software versions for this edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainEdgeSoftwareVersionDtoEntityListing> getTelephonyProvidersEdgeSoftwareversionsAsync(GetTelephonyProvidersEdgeSoftwareversionsRequest request, AsyncApiCallback<DomainEdgeSoftwareVersionDtoEntityListing> callback) {
    return pcapiClient.<DomainEdgeSoftwareVersionDtoEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainEdgeSoftwareVersionDtoEntityListing>() {}, callback);
  }

  /**
   * Gets all the available software versions for this edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing>> getTelephonyProvidersEdgeSoftwareversionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing>> callback) {
    return pcapiClient.<DomainEdgeSoftwareVersionDtoEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DomainEdgeSoftwareVersionDtoEntityListing>() {}, callback);
  }

  /**
   * Get the list of edges.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeEntityListing> getTelephonyProvidersEdgesAsync(GetTelephonyProvidersEdgesRequest request, AsyncApiCallback<EdgeEntityListing> callback) {
    return pcapiClient.<EdgeEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeEntityListing>() {}, callback);
  }

  /**
   * Get the list of edges.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeEntityListing>> getTelephonyProvidersEdgesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeEntityListing>> callback) {
    return pcapiClient.<EdgeEntityListing>invokeAPIVerboseAsync(request, new TypeReference<EdgeEntityListing>() {}, callback);
  }

  /**
   * Get the list of available languages.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AvailableLanguageList> getTelephonyProvidersEdgesAvailablelanguagesAsync(GetTelephonyProvidersEdgesAvailablelanguagesRequest request, AsyncApiCallback<AvailableLanguageList> callback) {
    return pcapiClient.<AvailableLanguageList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AvailableLanguageList>() {}, callback);
  }

  /**
   * Get the list of available languages.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AvailableLanguageList>> getTelephonyProvidersEdgesAvailablelanguagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<AvailableLanguageList>> callback) {
    return pcapiClient.<AvailableLanguageList>invokeAPIVerboseAsync(request, new TypeReference<AvailableLanguageList>() {}, callback);
  }

  /**
   * Get the list of certificate authorities.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CertificateAuthorityEntityListing> getTelephonyProvidersEdgesCertificateauthoritiesAsync(GetTelephonyProvidersEdgesCertificateauthoritiesRequest request, AsyncApiCallback<CertificateAuthorityEntityListing> callback) {
    return pcapiClient.<CertificateAuthorityEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CertificateAuthorityEntityListing>() {}, callback);
  }

  /**
   * Get the list of certificate authorities.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CertificateAuthorityEntityListing>> getTelephonyProvidersEdgesCertificateauthoritiesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CertificateAuthorityEntityListing>> callback) {
    return pcapiClient.<CertificateAuthorityEntityListing>invokeAPIVerboseAsync(request, new TypeReference<CertificateAuthorityEntityListing>() {}, callback);
  }

  /**
   * Get a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainCertificateAuthority> getTelephonyProvidersEdgesCertificateauthorityAsync(GetTelephonyProvidersEdgesCertificateauthorityRequest request, AsyncApiCallback<DomainCertificateAuthority> callback) {
    return pcapiClient.<DomainCertificateAuthority>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainCertificateAuthority>() {}, callback);
  }

  /**
   * Get a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainCertificateAuthority>> getTelephonyProvidersEdgesCertificateauthorityAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainCertificateAuthority>> callback) {
    return pcapiClient.<DomainCertificateAuthority>invokeAPIVerboseAsync(request, new TypeReference<DomainCertificateAuthority>() {}, callback);
  }

  /**
   * Get a DID by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DID> getTelephonyProvidersEdgesDidAsync(GetTelephonyProvidersEdgesDidRequest request, AsyncApiCallback<DID> callback) {
    return pcapiClient.<DID>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DID>() {}, callback);
  }

  /**
   * Get a DID by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DID>> getTelephonyProvidersEdgesDidAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DID>> callback) {
    return pcapiClient.<DID>invokeAPIVerboseAsync(request, new TypeReference<DID>() {}, callback);
  }

  /**
   * Get a DID Pool by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DIDPool> getTelephonyProvidersEdgesDidpoolAsync(GetTelephonyProvidersEdgesDidpoolRequest request, AsyncApiCallback<DIDPool> callback) {
    return pcapiClient.<DIDPool>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DIDPool>() {}, callback);
  }

  /**
   * Get a DID Pool by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DIDPool>> getTelephonyProvidersEdgesDidpoolAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DIDPool>> callback) {
    return pcapiClient.<DIDPool>invokeAPIVerboseAsync(request, new TypeReference<DIDPool>() {}, callback);
  }

  /**
   * Get a listing of DID Pools
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DIDPoolEntityListing> getTelephonyProvidersEdgesDidpoolsAsync(GetTelephonyProvidersEdgesDidpoolsRequest request, AsyncApiCallback<DIDPoolEntityListing> callback) {
    return pcapiClient.<DIDPoolEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DIDPoolEntityListing>() {}, callback);
  }

  /**
   * Get a listing of DID Pools
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DIDPoolEntityListing>> getTelephonyProvidersEdgesDidpoolsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DIDPoolEntityListing>> callback) {
    return pcapiClient.<DIDPoolEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DIDPoolEntityListing>() {}, callback);
  }

  /**
   * Get a listing of DIDs
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DIDEntityListing> getTelephonyProvidersEdgesDidsAsync(GetTelephonyProvidersEdgesDidsRequest request, AsyncApiCallback<DIDEntityListing> callback) {
    return pcapiClient.<DIDEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DIDEntityListing>() {}, callback);
  }

  /**
   * Get a listing of DIDs
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DIDEntityListing>> getTelephonyProvidersEdgesDidsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DIDEntityListing>> callback) {
    return pcapiClient.<DIDEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DIDEntityListing>() {}, callback);
  }

  /**
   * Get edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeGroup> getTelephonyProvidersEdgesEdgegroupAsync(GetTelephonyProvidersEdgesEdgegroupRequest request, AsyncApiCallback<EdgeGroup> callback) {
    return pcapiClient.<EdgeGroup>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeGroup>() {}, callback);
  }

  /**
   * Get edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeGroup>> getTelephonyProvidersEdgesEdgegroupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeGroup>> callback) {
    return pcapiClient.<EdgeGroup>invokeAPIVerboseAsync(request, new TypeReference<EdgeGroup>() {}, callback);
  }

  /**
   * Gets the edge trunk base associated with the edge group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeTrunkBase> getTelephonyProvidersEdgesEdgegroupEdgetrunkbasisAsync(GetTelephonyProvidersEdgesEdgegroupEdgetrunkbasisRequest request, AsyncApiCallback<EdgeTrunkBase> callback) {
    return pcapiClient.<EdgeTrunkBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeTrunkBase>() {}, callback);
  }

  /**
   * Gets the edge trunk base associated with the edge group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeTrunkBase>> getTelephonyProvidersEdgesEdgegroupEdgetrunkbasisAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeTrunkBase>> callback) {
    return pcapiClient.<EdgeTrunkBase>invokeAPIVerboseAsync(request, new TypeReference<EdgeTrunkBase>() {}, callback);
  }

  /**
   * Get the list of edge groups.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeGroupEntityListing> getTelephonyProvidersEdgesEdgegroupsAsync(GetTelephonyProvidersEdgesEdgegroupsRequest request, AsyncApiCallback<EdgeGroupEntityListing> callback) {
    return pcapiClient.<EdgeGroupEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeGroupEntityListing>() {}, callback);
  }

  /**
   * Get the list of edge groups.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeGroupEntityListing>> getTelephonyProvidersEdgesEdgegroupsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeGroupEntityListing>> callback) {
    return pcapiClient.<EdgeGroupEntityListing>invokeAPIVerboseAsync(request, new TypeReference<EdgeGroupEntityListing>() {}, callback);
  }

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeVersionReport> getTelephonyProvidersEdgesEdgeversionreportAsync(GetTelephonyProvidersEdgesEdgeversionreportRequest request, AsyncApiCallback<EdgeVersionReport> callback) {
    return pcapiClient.<EdgeVersionReport>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeVersionReport>() {}, callback);
  }

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeVersionReport>> getTelephonyProvidersEdgesEdgeversionreportAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeVersionReport>> callback) {
    return pcapiClient.<EdgeVersionReport>invokeAPIVerboseAsync(request, new TypeReference<EdgeVersionReport>() {}, callback);
  }

  /**
   * Get endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Endpoint> getTelephonyProvidersEdgesEndpointAsync(GetTelephonyProvidersEdgesEndpointRequest request, AsyncApiCallback<Endpoint> callback) {
    return pcapiClient.<Endpoint>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Endpoint>() {}, callback);
  }

  /**
   * Get endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Endpoint>> getTelephonyProvidersEdgesEndpointAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Endpoint>> callback) {
    return pcapiClient.<Endpoint>invokeAPIVerboseAsync(request, new TypeReference<Endpoint>() {}, callback);
  }

  /**
   * Get endpoints
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EndpointEntityListing> getTelephonyProvidersEdgesEndpointsAsync(GetTelephonyProvidersEdgesEndpointsRequest request, AsyncApiCallback<EndpointEntityListing> callback) {
    return pcapiClient.<EndpointEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EndpointEntityListing>() {}, callback);
  }

  /**
   * Get endpoints
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EndpointEntityListing>> getTelephonyProvidersEdgesEndpointsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EndpointEntityListing>> callback) {
    return pcapiClient.<EndpointEntityListing>invokeAPIVerboseAsync(request, new TypeReference<EndpointEntityListing>() {}, callback);
  }

  /**
   * Get an extension by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Extension> getTelephonyProvidersEdgesExtensionAsync(GetTelephonyProvidersEdgesExtensionRequest request, AsyncApiCallback<Extension> callback) {
    return pcapiClient.<Extension>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Extension>() {}, callback);
  }

  /**
   * Get an extension by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Extension>> getTelephonyProvidersEdgesExtensionAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Extension>> callback) {
    return pcapiClient.<Extension>invokeAPIVerboseAsync(request, new TypeReference<Extension>() {}, callback);
  }

  /**
   * Get an extension pool by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExtensionPool> getTelephonyProvidersEdgesExtensionpoolAsync(GetTelephonyProvidersEdgesExtensionpoolRequest request, AsyncApiCallback<ExtensionPool> callback) {
    return pcapiClient.<ExtensionPool>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExtensionPool>() {}, callback);
  }

  /**
   * Get an extension pool by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExtensionPool>> getTelephonyProvidersEdgesExtensionpoolAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ExtensionPool>> callback) {
    return pcapiClient.<ExtensionPool>invokeAPIVerboseAsync(request, new TypeReference<ExtensionPool>() {}, callback);
  }

  /**
   * Get a listing of extension pools
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExtensionPoolEntityListing> getTelephonyProvidersEdgesExtensionpoolsAsync(GetTelephonyProvidersEdgesExtensionpoolsRequest request, AsyncApiCallback<ExtensionPoolEntityListing> callback) {
    return pcapiClient.<ExtensionPoolEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExtensionPoolEntityListing>() {}, callback);
  }

  /**
   * Get a listing of extension pools
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExtensionPoolEntityListing>> getTelephonyProvidersEdgesExtensionpoolsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ExtensionPoolEntityListing>> callback) {
    return pcapiClient.<ExtensionPoolEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ExtensionPoolEntityListing>() {}, callback);
  }

  /**
   * Get a listing of extensions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExtensionEntityListing> getTelephonyProvidersEdgesExtensionsAsync(GetTelephonyProvidersEdgesExtensionsRequest request, AsyncApiCallback<ExtensionEntityListing> callback) {
    return pcapiClient.<ExtensionEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExtensionEntityListing>() {}, callback);
  }

  /**
   * Get a listing of extensions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExtensionEntityListing>> getTelephonyProvidersEdgesExtensionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ExtensionEntityListing>> callback) {
    return pcapiClient.<ExtensionEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ExtensionEntityListing>() {}, callback);
  }

  /**
   * Get a Line by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Line> getTelephonyProvidersEdgesLineAsync(GetTelephonyProvidersEdgesLineRequest request, AsyncApiCallback<Line> callback) {
    return pcapiClient.<Line>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Line>() {}, callback);
  }

  /**
   * Get a Line by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Line>> getTelephonyProvidersEdgesLineAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Line>> callback) {
    return pcapiClient.<Line>invokeAPIVerboseAsync(request, new TypeReference<Line>() {}, callback);
  }

  /**
   * Get a line base settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LineBase> getTelephonyProvidersEdgesLinebasesettingAsync(GetTelephonyProvidersEdgesLinebasesettingRequest request, AsyncApiCallback<LineBase> callback) {
    return pcapiClient.<LineBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LineBase>() {}, callback);
  }

  /**
   * Get a line base settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LineBase>> getTelephonyProvidersEdgesLinebasesettingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LineBase>> callback) {
    return pcapiClient.<LineBase>invokeAPIVerboseAsync(request, new TypeReference<LineBase>() {}, callback);
  }

  /**
   * Get a listing of line base settings objects
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LineBaseEntityListing> getTelephonyProvidersEdgesLinebasesettingsAsync(GetTelephonyProvidersEdgesLinebasesettingsRequest request, AsyncApiCallback<LineBaseEntityListing> callback) {
    return pcapiClient.<LineBaseEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LineBaseEntityListing>() {}, callback);
  }

  /**
   * Get a listing of line base settings objects
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LineBaseEntityListing>> getTelephonyProvidersEdgesLinebasesettingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LineBaseEntityListing>> callback) {
    return pcapiClient.<LineBaseEntityListing>invokeAPIVerboseAsync(request, new TypeReference<LineBaseEntityListing>() {}, callback);
  }

  /**
   * Get a list of Lines
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LineEntityListing> getTelephonyProvidersEdgesLinesAsync(GetTelephonyProvidersEdgesLinesRequest request, AsyncApiCallback<LineEntityListing> callback) {
    return pcapiClient.<LineEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LineEntityListing>() {}, callback);
  }

  /**
   * Get a list of Lines
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LineEntityListing>> getTelephonyProvidersEdgesLinesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LineEntityListing>> callback) {
    return pcapiClient.<LineEntityListing>invokeAPIVerboseAsync(request, new TypeReference<LineEntityListing>() {}, callback);
  }

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Line> getTelephonyProvidersEdgesLinesTemplateAsync(GetTelephonyProvidersEdgesLinesTemplateRequest request, AsyncApiCallback<Line> callback) {
    return pcapiClient.<Line>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Line>() {}, callback);
  }

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Line>> getTelephonyProvidersEdgesLinesTemplateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Line>> callback) {
    return pcapiClient.<Line>invokeAPIVerboseAsync(request, new TypeReference<Line>() {}, callback);
  }

  /**
   * Get edge logical interfaces.
   * Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LogicalInterfaceEntityListing> getTelephonyProvidersEdgesLogicalinterfacesAsync(GetTelephonyProvidersEdgesLogicalinterfacesRequest request, AsyncApiCallback<LogicalInterfaceEntityListing> callback) {
    return pcapiClient.<LogicalInterfaceEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LogicalInterfaceEntityListing>() {}, callback);
  }

  /**
   * Get edge logical interfaces.
   * Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LogicalInterfaceEntityListing>> getTelephonyProvidersEdgesLogicalinterfacesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LogicalInterfaceEntityListing>> callback) {
    return pcapiClient.<LogicalInterfaceEntityListing>invokeAPIVerboseAsync(request, new TypeReference<LogicalInterfaceEntityListing>() {}, callback);
  }

  /**
   * Get outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OutboundRoute> getTelephonyProvidersEdgesOutboundrouteAsync(GetTelephonyProvidersEdgesOutboundrouteRequest request, AsyncApiCallback<OutboundRoute> callback) {
    return pcapiClient.<OutboundRoute>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OutboundRoute>() {}, callback);
  }

  /**
   * Get outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OutboundRoute>> getTelephonyProvidersEdgesOutboundrouteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OutboundRoute>> callback) {
    return pcapiClient.<OutboundRoute>invokeAPIVerboseAsync(request, new TypeReference<OutboundRoute>() {}, callback);
  }

  /**
   * Get outbound routes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OutboundRouteEntityListing> getTelephonyProvidersEdgesOutboundroutesAsync(GetTelephonyProvidersEdgesOutboundroutesRequest request, AsyncApiCallback<OutboundRouteEntityListing> callback) {
    return pcapiClient.<OutboundRouteEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OutboundRouteEntityListing>() {}, callback);
  }

  /**
   * Get outbound routes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OutboundRouteEntityListing>> getTelephonyProvidersEdgesOutboundroutesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OutboundRouteEntityListing>> callback) {
    return pcapiClient.<OutboundRouteEntityListing>invokeAPIVerboseAsync(request, new TypeReference<OutboundRouteEntityListing>() {}, callback);
  }

  /**
   * Get a Phone by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Phone> getTelephonyProvidersEdgesPhoneAsync(GetTelephonyProvidersEdgesPhoneRequest request, AsyncApiCallback<Phone> callback) {
    return pcapiClient.<Phone>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Phone>() {}, callback);
  }

  /**
   * Get a Phone by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Phone>> getTelephonyProvidersEdgesPhoneAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Phone>> callback) {
    return pcapiClient.<Phone>invokeAPIVerboseAsync(request, new TypeReference<Phone>() {}, callback);
  }

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PhoneBase> getTelephonyProvidersEdgesPhonebasesettingAsync(GetTelephonyProvidersEdgesPhonebasesettingRequest request, AsyncApiCallback<PhoneBase> callback) {
    return pcapiClient.<PhoneBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PhoneBase>() {}, callback);
  }

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PhoneBase>> getTelephonyProvidersEdgesPhonebasesettingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PhoneBase>> callback) {
    return pcapiClient.<PhoneBase>invokeAPIVerboseAsync(request, new TypeReference<PhoneBase>() {}, callback);
  }

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PhoneBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettingsAsync(GetTelephonyProvidersEdgesPhonebasesettingsRequest request, AsyncApiCallback<PhoneBaseEntityListing> callback) {
    return pcapiClient.<PhoneBaseEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PhoneBaseEntityListing>() {}, callback);
  }

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PhoneBaseEntityListing>> getTelephonyProvidersEdgesPhonebasesettingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PhoneBaseEntityListing>> callback) {
    return pcapiClient.<PhoneBaseEntityListing>invokeAPIVerboseAsync(request, new TypeReference<PhoneBaseEntityListing>() {}, callback);
  }

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PhoneMetaBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesAsync(GetTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesRequest request, AsyncApiCallback<PhoneMetaBaseEntityListing> callback) {
    return pcapiClient.<PhoneMetaBaseEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PhoneMetaBaseEntityListing>() {}, callback);
  }

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PhoneMetaBaseEntityListing>> getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PhoneMetaBaseEntityListing>> callback) {
    return pcapiClient.<PhoneMetaBaseEntityListing>invokeAPIVerboseAsync(request, new TypeReference<PhoneMetaBaseEntityListing>() {}, callback);
  }

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PhoneBase> getTelephonyProvidersEdgesPhonebasesettingsTemplateAsync(GetTelephonyProvidersEdgesPhonebasesettingsTemplateRequest request, AsyncApiCallback<PhoneBase> callback) {
    return pcapiClient.<PhoneBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PhoneBase>() {}, callback);
  }

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PhoneBase>> getTelephonyProvidersEdgesPhonebasesettingsTemplateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PhoneBase>> callback) {
    return pcapiClient.<PhoneBase>invokeAPIVerboseAsync(request, new TypeReference<PhoneBase>() {}, callback);
  }

  /**
   * Get a list of Phone Instances
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PhoneEntityListing> getTelephonyProvidersEdgesPhonesAsync(GetTelephonyProvidersEdgesPhonesRequest request, AsyncApiCallback<PhoneEntityListing> callback) {
    return pcapiClient.<PhoneEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PhoneEntityListing>() {}, callback);
  }

  /**
   * Get a list of Phone Instances
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PhoneEntityListing>> getTelephonyProvidersEdgesPhonesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PhoneEntityListing>> callback) {
    return pcapiClient.<PhoneEntityListing>invokeAPIVerboseAsync(request, new TypeReference<PhoneEntityListing>() {}, callback);
  }

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Phone> getTelephonyProvidersEdgesPhonesTemplateAsync(GetTelephonyProvidersEdgesPhonesTemplateRequest request, AsyncApiCallback<Phone> callback) {
    return pcapiClient.<Phone>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Phone>() {}, callback);
  }

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Phone>> getTelephonyProvidersEdgesPhonesTemplateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Phone>> callback) {
    return pcapiClient.<Phone>invokeAPIVerboseAsync(request, new TypeReference<Phone>() {}, callback);
  }

  /**
   * Get a Site by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Site> getTelephonyProvidersEdgesSiteAsync(GetTelephonyProvidersEdgesSiteRequest request, AsyncApiCallback<Site> callback) {
    return pcapiClient.<Site>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Site>() {}, callback);
  }

  /**
   * Get a Site by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Site>> getTelephonyProvidersEdgesSiteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Site>> callback) {
    return pcapiClient.<Site>invokeAPIVerboseAsync(request, new TypeReference<Site>() {}, callback);
  }

  /**
   * Get a Number Plan by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<NumberPlan> getTelephonyProvidersEdgesSiteNumberplanAsync(GetTelephonyProvidersEdgesSiteNumberplanRequest request, AsyncApiCallback<NumberPlan> callback) {
    return pcapiClient.<NumberPlan>invokeAPIAsync(request.withHttpInfo(), new TypeReference<NumberPlan>() {}, callback);
  }

  /**
   * Get a Number Plan by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<NumberPlan>> getTelephonyProvidersEdgesSiteNumberplanAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<NumberPlan>> callback) {
    return pcapiClient.<NumberPlan>invokeAPIVerboseAsync(request, new TypeReference<NumberPlan>() {}, callback);
  }

  /**
   * Get the list of Number Plans for this Site.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<NumberPlan>> getTelephonyProvidersEdgesSiteNumberplansAsync(GetTelephonyProvidersEdgesSiteNumberplansRequest request, AsyncApiCallback<List<NumberPlan>> callback) {
    return pcapiClient.<List<NumberPlan>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<NumberPlan>>() {}, callback);
  }

  /**
   * Get the list of Number Plans for this Site.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<NumberPlan>>> getTelephonyProvidersEdgesSiteNumberplansAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<NumberPlan>>> callback) {
    return pcapiClient.<List<NumberPlan>>invokeAPIVerboseAsync(request, new TypeReference<List<NumberPlan>>() {}, callback);
  }

  /**
   * Get a list of Classifications for this Site
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<String>> getTelephonyProvidersEdgesSiteNumberplansClassificationsAsync(GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest request, AsyncApiCallback<List<String>> callback) {
    return pcapiClient.<List<String>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Get a list of Classifications for this Site
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<String>>> getTelephonyProvidersEdgesSiteNumberplansClassificationsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<String>>> callback) {
    return pcapiClient.<List<String>>invokeAPIVerboseAsync(request, new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Get an outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OutboundRouteBase> getTelephonyProvidersEdgesSiteOutboundrouteAsync(GetTelephonyProvidersEdgesSiteOutboundrouteRequest request, AsyncApiCallback<OutboundRouteBase> callback) {
    return pcapiClient.<OutboundRouteBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OutboundRouteBase>() {}, callback);
  }

  /**
   * Get an outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OutboundRouteBase>> getTelephonyProvidersEdgesSiteOutboundrouteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OutboundRouteBase>> callback) {
    return pcapiClient.<OutboundRouteBase>invokeAPIVerboseAsync(request, new TypeReference<OutboundRouteBase>() {}, callback);
  }

  /**
   * Get outbound routes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OutboundRouteBaseEntityListing> getTelephonyProvidersEdgesSiteOutboundroutesAsync(GetTelephonyProvidersEdgesSiteOutboundroutesRequest request, AsyncApiCallback<OutboundRouteBaseEntityListing> callback) {
    return pcapiClient.<OutboundRouteBaseEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OutboundRouteBaseEntityListing>() {}, callback);
  }

  /**
   * Get outbound routes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OutboundRouteBaseEntityListing>> getTelephonyProvidersEdgesSiteOutboundroutesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OutboundRouteBaseEntityListing>> callback) {
    return pcapiClient.<OutboundRouteBaseEntityListing>invokeAPIVerboseAsync(request, new TypeReference<OutboundRouteBaseEntityListing>() {}, callback);
  }

  /**
   * Get the list of Sites.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SiteEntityListing> getTelephonyProvidersEdgesSitesAsync(GetTelephonyProvidersEdgesSitesRequest request, AsyncApiCallback<SiteEntityListing> callback) {
    return pcapiClient.<SiteEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SiteEntityListing>() {}, callback);
  }

  /**
   * Get the list of Sites.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SiteEntityListing>> getTelephonyProvidersEdgesSitesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SiteEntityListing>> callback) {
    return pcapiClient.<SiteEntityListing>invokeAPIVerboseAsync(request, new TypeReference<SiteEntityListing>() {}, callback);
  }

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TimeZoneEntityListing> getTelephonyProvidersEdgesTimezonesAsync(GetTelephonyProvidersEdgesTimezonesRequest request, AsyncApiCallback<TimeZoneEntityListing> callback) {
    return pcapiClient.<TimeZoneEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TimeZoneEntityListing>() {}, callback);
  }

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TimeZoneEntityListing>> getTelephonyProvidersEdgesTimezonesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TimeZoneEntityListing>> callback) {
    return pcapiClient.<TimeZoneEntityListing>invokeAPIVerboseAsync(request, new TypeReference<TimeZoneEntityListing>() {}, callback);
  }

  /**
   * Get a Trunk by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Trunk> getTelephonyProvidersEdgesTrunkAsync(GetTelephonyProvidersEdgesTrunkRequest request, AsyncApiCallback<Trunk> callback) {
    return pcapiClient.<Trunk>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Trunk>() {}, callback);
  }

  /**
   * Get a Trunk by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Trunk>> getTelephonyProvidersEdgesTrunkAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Trunk>> callback) {
    return pcapiClient.<Trunk>invokeAPIVerboseAsync(request, new TypeReference<Trunk>() {}, callback);
  }

  /**
   * Get a Trunk Base Settings object by ID
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettingAsync(GetTelephonyProvidersEdgesTrunkbasesettingRequest request, AsyncApiCallback<TrunkBase> callback) {
    return pcapiClient.<TrunkBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TrunkBase>() {}, callback);
  }

  /**
   * Get a Trunk Base Settings object by ID
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TrunkBase>> getTelephonyProvidersEdgesTrunkbasesettingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TrunkBase>> callback) {
    return pcapiClient.<TrunkBase>invokeAPIVerboseAsync(request, new TypeReference<TrunkBase>() {}, callback);
  }

  /**
   * Get Trunk Base Settings listing
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TrunkBaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettingsAsync(GetTelephonyProvidersEdgesTrunkbasesettingsRequest request, AsyncApiCallback<TrunkBaseEntityListing> callback) {
    return pcapiClient.<TrunkBaseEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TrunkBaseEntityListing>() {}, callback);
  }

  /**
   * Get Trunk Base Settings listing
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TrunkBaseEntityListing>> getTelephonyProvidersEdgesTrunkbasesettingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TrunkBaseEntityListing>> callback) {
    return pcapiClient.<TrunkBaseEntityListing>invokeAPIVerboseAsync(request, new TypeReference<TrunkBaseEntityListing>() {}, callback);
  }

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TrunkMetabaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesAsync(GetTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesRequest request, AsyncApiCallback<TrunkMetabaseEntityListing> callback) {
    return pcapiClient.<TrunkMetabaseEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TrunkMetabaseEntityListing>() {}, callback);
  }

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TrunkMetabaseEntityListing>> getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TrunkMetabaseEntityListing>> callback) {
    return pcapiClient.<TrunkMetabaseEntityListing>invokeAPIVerboseAsync(request, new TypeReference<TrunkMetabaseEntityListing>() {}, callback);
  }

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettingsTemplateAsync(GetTelephonyProvidersEdgesTrunkbasesettingsTemplateRequest request, AsyncApiCallback<TrunkBase> callback) {
    return pcapiClient.<TrunkBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TrunkBase>() {}, callback);
  }

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TrunkBase>> getTelephonyProvidersEdgesTrunkbasesettingsTemplateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TrunkBase>> callback) {
    return pcapiClient.<TrunkBase>invokeAPIVerboseAsync(request, new TypeReference<TrunkBase>() {}, callback);
  }

  /**
   * Get the list of available trunks.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TrunkEntityListing> getTelephonyProvidersEdgesTrunksAsync(GetTelephonyProvidersEdgesTrunksRequest request, AsyncApiCallback<TrunkEntityListing> callback) {
    return pcapiClient.<TrunkEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TrunkEntityListing>() {}, callback);
  }

  /**
   * Get the list of available trunks.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TrunkEntityListing>> getTelephonyProvidersEdgesTrunksAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TrunkEntityListing>> callback) {
    return pcapiClient.<TrunkEntityListing>invokeAPIVerboseAsync(request, new TypeReference<TrunkEntityListing>() {}, callback);
  }

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TrunkRecordingEnabledCount> getTelephonyProvidersEdgesTrunkswithrecordingAsync(GetTelephonyProvidersEdgesTrunkswithrecordingRequest request, AsyncApiCallback<TrunkRecordingEnabledCount> callback) {
    return pcapiClient.<TrunkRecordingEnabledCount>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TrunkRecordingEnabledCount>() {}, callback);
  }

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TrunkRecordingEnabledCount>> getTelephonyProvidersEdgesTrunkswithrecordingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TrunkRecordingEnabledCount>> callback) {
    return pcapiClient.<TrunkRecordingEnabledCount>invokeAPIVerboseAsync(request, new TypeReference<TrunkRecordingEnabledCount>() {}, callback);
  }

  /**
   * Create an edge logical interface.
   * Create
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainLogicalInterface> postTelephonyProvidersEdgeLogicalinterfacesAsync(PostTelephonyProvidersEdgeLogicalinterfacesRequest request, AsyncApiCallback<DomainLogicalInterface> callback) {
    return pcapiClient.<DomainLogicalInterface>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainLogicalInterface>() {}, callback);
  }

  /**
   * Create an edge logical interface.
   * Create
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainLogicalInterface>> postTelephonyProvidersEdgeLogicalinterfacesAsync(ApiRequest<DomainLogicalInterface> request, AsyncApiCallback<ApiResponse<DomainLogicalInterface>> callback) {
    return pcapiClient.<DomainLogicalInterface>invokeAPIVerboseAsync(request, new TypeReference<DomainLogicalInterface>() {}, callback);
  }

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postTelephonyProvidersEdgeLogsJobUploadAsync(PostTelephonyProvidersEdgeLogsJobUploadRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postTelephonyProvidersEdgeLogsJobUploadAsync(ApiRequest<EdgeLogsJobUploadRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeLogsJobResponse> postTelephonyProvidersEdgeLogsJobsAsync(PostTelephonyProvidersEdgeLogsJobsRequest request, AsyncApiCallback<EdgeLogsJobResponse> callback) {
    return pcapiClient.<EdgeLogsJobResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeLogsJobResponse>() {}, callback);
  }

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeLogsJobResponse>> postTelephonyProvidersEdgeLogsJobsAsync(ApiRequest<EdgeLogsJobRequest> request, AsyncApiCallback<ApiResponse<EdgeLogsJobResponse>> callback) {
    return pcapiClient.<EdgeLogsJobResponse>invokeAPIVerboseAsync(request, new TypeReference<EdgeLogsJobResponse>() {}, callback);
  }

  /**
   * Reboot an Edge
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> postTelephonyProvidersEdgeRebootAsync(PostTelephonyProvidersEdgeRebootRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Reboot an Edge
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> postTelephonyProvidersEdgeRebootAsync(ApiRequest<EdgeRebootParameters> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Starts a software update for this edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainEdgeSoftwareUpdateDto> postTelephonyProvidersEdgeSoftwareupdateAsync(PostTelephonyProvidersEdgeSoftwareupdateRequest request, AsyncApiCallback<DomainEdgeSoftwareUpdateDto> callback) {
    return pcapiClient.<DomainEdgeSoftwareUpdateDto>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainEdgeSoftwareUpdateDto>() {}, callback);
  }

  /**
   * Starts a software update for this edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainEdgeSoftwareUpdateDto>> postTelephonyProvidersEdgeSoftwareupdateAsync(ApiRequest<DomainEdgeSoftwareUpdateDto> request, AsyncApiCallback<ApiResponse<DomainEdgeSoftwareUpdateDto>> callback) {
    return pcapiClient.<DomainEdgeSoftwareUpdateDto>invokeAPIVerboseAsync(request, new TypeReference<DomainEdgeSoftwareUpdateDto>() {}, callback);
  }

  /**
   * Take an Edge in or out of service
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> postTelephonyProvidersEdgeStatuscodeAsync(PostTelephonyProvidersEdgeStatuscodeRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Take an Edge in or out of service
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> postTelephonyProvidersEdgeStatuscodeAsync(ApiRequest<EdgeServiceStateRequest> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Unpair an Edge
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> postTelephonyProvidersEdgeUnpairAsync(PostTelephonyProvidersEdgeUnpairRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Unpair an Edge
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> postTelephonyProvidersEdgeUnpairAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Create an edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Edge> postTelephonyProvidersEdgesAsync(PostTelephonyProvidersEdgesRequest request, AsyncApiCallback<Edge> callback) {
    return pcapiClient.<Edge>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Edge>() {}, callback);
  }

  /**
   * Create an edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Edge>> postTelephonyProvidersEdgesAsync(ApiRequest<Edge> request, AsyncApiCallback<ApiResponse<Edge>> callback) {
    return pcapiClient.<Edge>invokeAPIVerboseAsync(request, new TypeReference<Edge>() {}, callback);
  }

  /**
   * Validates a street address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ValidateAddressResponse> postTelephonyProvidersEdgesAddressvalidationAsync(PostTelephonyProvidersEdgesAddressvalidationRequest request, AsyncApiCallback<ValidateAddressResponse> callback) {
    return pcapiClient.<ValidateAddressResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ValidateAddressResponse>() {}, callback);
  }

  /**
   * Validates a street address
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ValidateAddressResponse>> postTelephonyProvidersEdgesAddressvalidationAsync(ApiRequest<ValidateAddressRequest> request, AsyncApiCallback<ApiResponse<ValidateAddressResponse>> callback) {
    return pcapiClient.<ValidateAddressResponse>invokeAPIVerboseAsync(request, new TypeReference<ValidateAddressResponse>() {}, callback);
  }

  /**
   * Create a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainCertificateAuthority> postTelephonyProvidersEdgesCertificateauthoritiesAsync(PostTelephonyProvidersEdgesCertificateauthoritiesRequest request, AsyncApiCallback<DomainCertificateAuthority> callback) {
    return pcapiClient.<DomainCertificateAuthority>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainCertificateAuthority>() {}, callback);
  }

  /**
   * Create a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainCertificateAuthority>> postTelephonyProvidersEdgesCertificateauthoritiesAsync(ApiRequest<DomainCertificateAuthority> request, AsyncApiCallback<ApiResponse<DomainCertificateAuthority>> callback) {
    return pcapiClient.<DomainCertificateAuthority>invokeAPIVerboseAsync(request, new TypeReference<DomainCertificateAuthority>() {}, callback);
  }

  /**
   * Create a new DID pool
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DIDPool> postTelephonyProvidersEdgesDidpoolsAsync(PostTelephonyProvidersEdgesDidpoolsRequest request, AsyncApiCallback<DIDPool> callback) {
    return pcapiClient.<DIDPool>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DIDPool>() {}, callback);
  }

  /**
   * Create a new DID pool
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DIDPool>> postTelephonyProvidersEdgesDidpoolsAsync(ApiRequest<DIDPool> request, AsyncApiCallback<ApiResponse<DIDPool>> callback) {
    return pcapiClient.<DIDPool>invokeAPIVerboseAsync(request, new TypeReference<DIDPool>() {}, callback);
  }

  /**
   * Create an edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeGroup> postTelephonyProvidersEdgesEdgegroupsAsync(PostTelephonyProvidersEdgesEdgegroupsRequest request, AsyncApiCallback<EdgeGroup> callback) {
    return pcapiClient.<EdgeGroup>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeGroup>() {}, callback);
  }

  /**
   * Create an edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeGroup>> postTelephonyProvidersEdgesEdgegroupsAsync(ApiRequest<EdgeGroup> request, AsyncApiCallback<ApiResponse<EdgeGroup>> callback) {
    return pcapiClient.<EdgeGroup>invokeAPIVerboseAsync(request, new TypeReference<EdgeGroup>() {}, callback);
  }

  /**
   * Create endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Endpoint> postTelephonyProvidersEdgesEndpointsAsync(PostTelephonyProvidersEdgesEndpointsRequest request, AsyncApiCallback<Endpoint> callback) {
    return pcapiClient.<Endpoint>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Endpoint>() {}, callback);
  }

  /**
   * Create endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Endpoint>> postTelephonyProvidersEdgesEndpointsAsync(ApiRequest<Endpoint> request, AsyncApiCallback<ApiResponse<Endpoint>> callback) {
    return pcapiClient.<Endpoint>invokeAPIVerboseAsync(request, new TypeReference<Endpoint>() {}, callback);
  }

  /**
   * Create a new extension pool
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExtensionPool> postTelephonyProvidersEdgesExtensionpoolsAsync(PostTelephonyProvidersEdgesExtensionpoolsRequest request, AsyncApiCallback<ExtensionPool> callback) {
    return pcapiClient.<ExtensionPool>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExtensionPool>() {}, callback);
  }

  /**
   * Create a new extension pool
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExtensionPool>> postTelephonyProvidersEdgesExtensionpoolsAsync(ApiRequest<ExtensionPool> request, AsyncApiCallback<ApiResponse<ExtensionPool>> callback) {
    return pcapiClient.<ExtensionPool>invokeAPIVerboseAsync(request, new TypeReference<ExtensionPool>() {}, callback);
  }

  /**
   * Create outbound rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OutboundRoute> postTelephonyProvidersEdgesOutboundroutesAsync(PostTelephonyProvidersEdgesOutboundroutesRequest request, AsyncApiCallback<OutboundRoute> callback) {
    return pcapiClient.<OutboundRoute>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OutboundRoute>() {}, callback);
  }

  /**
   * Create outbound rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OutboundRoute>> postTelephonyProvidersEdgesOutboundroutesAsync(ApiRequest<OutboundRoute> request, AsyncApiCallback<ApiResponse<OutboundRoute>> callback) {
    return pcapiClient.<OutboundRoute>invokeAPIVerboseAsync(request, new TypeReference<OutboundRoute>() {}, callback);
  }

  /**
   * Reboot a Phone
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postTelephonyProvidersEdgesPhoneRebootAsync(PostTelephonyProvidersEdgesPhoneRebootRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Reboot a Phone
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postTelephonyProvidersEdgesPhoneRebootAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Create a new Phone Base Settings object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PhoneBase> postTelephonyProvidersEdgesPhonebasesettingsAsync(PostTelephonyProvidersEdgesPhonebasesettingsRequest request, AsyncApiCallback<PhoneBase> callback) {
    return pcapiClient.<PhoneBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PhoneBase>() {}, callback);
  }

  /**
   * Create a new Phone Base Settings object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PhoneBase>> postTelephonyProvidersEdgesPhonebasesettingsAsync(ApiRequest<PhoneBase> request, AsyncApiCallback<ApiResponse<PhoneBase>> callback) {
    return pcapiClient.<PhoneBase>invokeAPIVerboseAsync(request, new TypeReference<PhoneBase>() {}, callback);
  }

  /**
   * Create a new Phone
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Phone> postTelephonyProvidersEdgesPhonesAsync(PostTelephonyProvidersEdgesPhonesRequest request, AsyncApiCallback<Phone> callback) {
    return pcapiClient.<Phone>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Phone>() {}, callback);
  }

  /**
   * Create a new Phone
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Phone>> postTelephonyProvidersEdgesPhonesAsync(ApiRequest<Phone> request, AsyncApiCallback<ApiResponse<Phone>> callback) {
    return pcapiClient.<Phone>invokeAPIVerboseAsync(request, new TypeReference<Phone>() {}, callback);
  }

  /**
   * Reboot Multiple Phones
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postTelephonyProvidersEdgesPhonesRebootAsync(PostTelephonyProvidersEdgesPhonesRebootRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Reboot Multiple Phones
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postTelephonyProvidersEdgesPhonesRebootAsync(ApiRequest<PhonesReboot> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Create outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OutboundRouteBase> postTelephonyProvidersEdgesSiteOutboundroutesAsync(PostTelephonyProvidersEdgesSiteOutboundroutesRequest request, AsyncApiCallback<OutboundRouteBase> callback) {
    return pcapiClient.<OutboundRouteBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OutboundRouteBase>() {}, callback);
  }

  /**
   * Create outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OutboundRouteBase>> postTelephonyProvidersEdgesSiteOutboundroutesAsync(ApiRequest<OutboundRouteBase> request, AsyncApiCallback<ApiResponse<OutboundRouteBase>> callback) {
    return pcapiClient.<OutboundRouteBase>invokeAPIVerboseAsync(request, new TypeReference<OutboundRouteBase>() {}, callback);
  }

  /**
   * Triggers the rebalance operation.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postTelephonyProvidersEdgesSiteRebalanceAsync(PostTelephonyProvidersEdgesSiteRebalanceRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Triggers the rebalance operation.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postTelephonyProvidersEdgesSiteRebalanceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Create a Site.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Site> postTelephonyProvidersEdgesSitesAsync(PostTelephonyProvidersEdgesSitesRequest request, AsyncApiCallback<Site> callback) {
    return pcapiClient.<Site>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Site>() {}, callback);
  }

  /**
   * Create a Site.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Site>> postTelephonyProvidersEdgesSitesAsync(ApiRequest<Site> request, AsyncApiCallback<ApiResponse<Site>> callback) {
    return pcapiClient.<Site>invokeAPIVerboseAsync(request, new TypeReference<Site>() {}, callback);
  }

  /**
   * Create a Trunk Base Settings object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TrunkBase> postTelephonyProvidersEdgesTrunkbasesettingsAsync(PostTelephonyProvidersEdgesTrunkbasesettingsRequest request, AsyncApiCallback<TrunkBase> callback) {
    return pcapiClient.<TrunkBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TrunkBase>() {}, callback);
  }

  /**
   * Create a Trunk Base Settings object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TrunkBase>> postTelephonyProvidersEdgesTrunkbasesettingsAsync(ApiRequest<TrunkBase> request, AsyncApiCallback<ApiResponse<TrunkBase>> callback) {
    return pcapiClient.<TrunkBase>invokeAPIVerboseAsync(request, new TypeReference<TrunkBase>() {}, callback);
  }

  /**
   * Update a edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Edge> putTelephonyProvidersEdgeAsync(PutTelephonyProvidersEdgeRequest request, AsyncApiCallback<Edge> callback) {
    return pcapiClient.<Edge>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Edge>() {}, callback);
  }

  /**
   * Update a edge.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Edge>> putTelephonyProvidersEdgeAsync(ApiRequest<Edge> request, AsyncApiCallback<ApiResponse<Edge>> callback) {
    return pcapiClient.<Edge>invokeAPIVerboseAsync(request, new TypeReference<Edge>() {}, callback);
  }

  /**
   * Update a line.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeLine> putTelephonyProvidersEdgeLineAsync(PutTelephonyProvidersEdgeLineRequest request, AsyncApiCallback<EdgeLine> callback) {
    return pcapiClient.<EdgeLine>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeLine>() {}, callback);
  }

  /**
   * Update a line.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeLine>> putTelephonyProvidersEdgeLineAsync(ApiRequest<EdgeLine> request, AsyncApiCallback<ApiResponse<EdgeLine>> callback) {
    return pcapiClient.<EdgeLine>invokeAPIVerboseAsync(request, new TypeReference<EdgeLine>() {}, callback);
  }

  /**
   * Update an edge logical interface.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainLogicalInterface> putTelephonyProvidersEdgeLogicalinterfaceAsync(PutTelephonyProvidersEdgeLogicalinterfaceRequest request, AsyncApiCallback<DomainLogicalInterface> callback) {
    return pcapiClient.<DomainLogicalInterface>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainLogicalInterface>() {}, callback);
  }

  /**
   * Update an edge logical interface.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainLogicalInterface>> putTelephonyProvidersEdgeLogicalinterfaceAsync(ApiRequest<DomainLogicalInterface> request, AsyncApiCallback<ApiResponse<DomainLogicalInterface>> callback) {
    return pcapiClient.<DomainLogicalInterface>invokeAPIVerboseAsync(request, new TypeReference<DomainLogicalInterface>() {}, callback);
  }

  /**
   * Update a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainCertificateAuthority> putTelephonyProvidersEdgesCertificateauthorityAsync(PutTelephonyProvidersEdgesCertificateauthorityRequest request, AsyncApiCallback<DomainCertificateAuthority> callback) {
    return pcapiClient.<DomainCertificateAuthority>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainCertificateAuthority>() {}, callback);
  }

  /**
   * Update a certificate authority.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainCertificateAuthority>> putTelephonyProvidersEdgesCertificateauthorityAsync(ApiRequest<DomainCertificateAuthority> request, AsyncApiCallback<ApiResponse<DomainCertificateAuthority>> callback) {
    return pcapiClient.<DomainCertificateAuthority>invokeAPIVerboseAsync(request, new TypeReference<DomainCertificateAuthority>() {}, callback);
  }

  /**
   * Update a DID by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DID> putTelephonyProvidersEdgesDidAsync(PutTelephonyProvidersEdgesDidRequest request, AsyncApiCallback<DID> callback) {
    return pcapiClient.<DID>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DID>() {}, callback);
  }

  /**
   * Update a DID by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DID>> putTelephonyProvidersEdgesDidAsync(ApiRequest<DID> request, AsyncApiCallback<ApiResponse<DID>> callback) {
    return pcapiClient.<DID>invokeAPIVerboseAsync(request, new TypeReference<DID>() {}, callback);
  }

  /**
   * Update a DID Pool by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DIDPool> putTelephonyProvidersEdgesDidpoolAsync(PutTelephonyProvidersEdgesDidpoolRequest request, AsyncApiCallback<DIDPool> callback) {
    return pcapiClient.<DIDPool>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DIDPool>() {}, callback);
  }

  /**
   * Update a DID Pool by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DIDPool>> putTelephonyProvidersEdgesDidpoolAsync(ApiRequest<DIDPool> request, AsyncApiCallback<ApiResponse<DIDPool>> callback) {
    return pcapiClient.<DIDPool>invokeAPIVerboseAsync(request, new TypeReference<DIDPool>() {}, callback);
  }

  /**
   * Update an edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeGroup> putTelephonyProvidersEdgesEdgegroupAsync(PutTelephonyProvidersEdgesEdgegroupRequest request, AsyncApiCallback<EdgeGroup> callback) {
    return pcapiClient.<EdgeGroup>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeGroup>() {}, callback);
  }

  /**
   * Update an edge group.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeGroup>> putTelephonyProvidersEdgesEdgegroupAsync(ApiRequest<EdgeGroup> request, AsyncApiCallback<ApiResponse<EdgeGroup>> callback) {
    return pcapiClient.<EdgeGroup>invokeAPIVerboseAsync(request, new TypeReference<EdgeGroup>() {}, callback);
  }

  /**
   * Update the edge trunk base associated with the edge group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EdgeTrunkBase> putTelephonyProvidersEdgesEdgegroupEdgetrunkbasisAsync(PutTelephonyProvidersEdgesEdgegroupEdgetrunkbasisRequest request, AsyncApiCallback<EdgeTrunkBase> callback) {
    return pcapiClient.<EdgeTrunkBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EdgeTrunkBase>() {}, callback);
  }

  /**
   * Update the edge trunk base associated with the edge group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EdgeTrunkBase>> putTelephonyProvidersEdgesEdgegroupEdgetrunkbasisAsync(ApiRequest<EdgeTrunkBase> request, AsyncApiCallback<ApiResponse<EdgeTrunkBase>> callback) {
    return pcapiClient.<EdgeTrunkBase>invokeAPIVerboseAsync(request, new TypeReference<EdgeTrunkBase>() {}, callback);
  }

  /**
   * Update endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Endpoint> putTelephonyProvidersEdgesEndpointAsync(PutTelephonyProvidersEdgesEndpointRequest request, AsyncApiCallback<Endpoint> callback) {
    return pcapiClient.<Endpoint>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Endpoint>() {}, callback);
  }

  /**
   * Update endpoint
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Endpoint>> putTelephonyProvidersEdgesEndpointAsync(ApiRequest<Endpoint> request, AsyncApiCallback<ApiResponse<Endpoint>> callback) {
    return pcapiClient.<Endpoint>invokeAPIVerboseAsync(request, new TypeReference<Endpoint>() {}, callback);
  }

  /**
   * Update an extension by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Extension> putTelephonyProvidersEdgesExtensionAsync(PutTelephonyProvidersEdgesExtensionRequest request, AsyncApiCallback<Extension> callback) {
    return pcapiClient.<Extension>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Extension>() {}, callback);
  }

  /**
   * Update an extension by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Extension>> putTelephonyProvidersEdgesExtensionAsync(ApiRequest<Extension> request, AsyncApiCallback<ApiResponse<Extension>> callback) {
    return pcapiClient.<Extension>invokeAPIVerboseAsync(request, new TypeReference<Extension>() {}, callback);
  }

  /**
   * Update an extension pool by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExtensionPool> putTelephonyProvidersEdgesExtensionpoolAsync(PutTelephonyProvidersEdgesExtensionpoolRequest request, AsyncApiCallback<ExtensionPool> callback) {
    return pcapiClient.<ExtensionPool>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExtensionPool>() {}, callback);
  }

  /**
   * Update an extension pool by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExtensionPool>> putTelephonyProvidersEdgesExtensionpoolAsync(ApiRequest<ExtensionPool> request, AsyncApiCallback<ApiResponse<ExtensionPool>> callback) {
    return pcapiClient.<ExtensionPool>invokeAPIVerboseAsync(request, new TypeReference<ExtensionPool>() {}, callback);
  }

  /**
   * Update outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OutboundRoute> putTelephonyProvidersEdgesOutboundrouteAsync(PutTelephonyProvidersEdgesOutboundrouteRequest request, AsyncApiCallback<OutboundRoute> callback) {
    return pcapiClient.<OutboundRoute>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OutboundRoute>() {}, callback);
  }

  /**
   * Update outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OutboundRoute>> putTelephonyProvidersEdgesOutboundrouteAsync(ApiRequest<OutboundRoute> request, AsyncApiCallback<ApiResponse<OutboundRoute>> callback) {
    return pcapiClient.<OutboundRoute>invokeAPIVerboseAsync(request, new TypeReference<OutboundRoute>() {}, callback);
  }

  /**
   * Update a Phone by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Phone> putTelephonyProvidersEdgesPhoneAsync(PutTelephonyProvidersEdgesPhoneRequest request, AsyncApiCallback<Phone> callback) {
    return pcapiClient.<Phone>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Phone>() {}, callback);
  }

  /**
   * Update a Phone by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Phone>> putTelephonyProvidersEdgesPhoneAsync(ApiRequest<Phone> request, AsyncApiCallback<ApiResponse<Phone>> callback) {
    return pcapiClient.<Phone>invokeAPIVerboseAsync(request, new TypeReference<Phone>() {}, callback);
  }

  /**
   * Update a Phone Base Settings by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PhoneBase> putTelephonyProvidersEdgesPhonebasesettingAsync(PutTelephonyProvidersEdgesPhonebasesettingRequest request, AsyncApiCallback<PhoneBase> callback) {
    return pcapiClient.<PhoneBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PhoneBase>() {}, callback);
  }

  /**
   * Update a Phone Base Settings by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PhoneBase>> putTelephonyProvidersEdgesPhonebasesettingAsync(ApiRequest<PhoneBase> request, AsyncApiCallback<ApiResponse<PhoneBase>> callback) {
    return pcapiClient.<PhoneBase>invokeAPIVerboseAsync(request, new TypeReference<PhoneBase>() {}, callback);
  }

  /**
   * Update a Site by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Site> putTelephonyProvidersEdgesSiteAsync(PutTelephonyProvidersEdgesSiteRequest request, AsyncApiCallback<Site> callback) {
    return pcapiClient.<Site>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Site>() {}, callback);
  }

  /**
   * Update a Site by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Site>> putTelephonyProvidersEdgesSiteAsync(ApiRequest<Site> request, AsyncApiCallback<ApiResponse<Site>> callback) {
    return pcapiClient.<Site>invokeAPIVerboseAsync(request, new TypeReference<Site>() {}, callback);
  }

  /**
   * Update the list of Number Plans.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<NumberPlan>> putTelephonyProvidersEdgesSiteNumberplansAsync(PutTelephonyProvidersEdgesSiteNumberplansRequest request, AsyncApiCallback<List<NumberPlan>> callback) {
    return pcapiClient.<List<NumberPlan>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<NumberPlan>>() {}, callback);
  }

  /**
   * Update the list of Number Plans.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<NumberPlan>>> putTelephonyProvidersEdgesSiteNumberplansAsync(ApiRequest<List<NumberPlan>> request, AsyncApiCallback<ApiResponse<List<NumberPlan>>> callback) {
    return pcapiClient.<List<NumberPlan>>invokeAPIVerboseAsync(request, new TypeReference<List<NumberPlan>>() {}, callback);
  }

  /**
   * Update outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OutboundRouteBase> putTelephonyProvidersEdgesSiteOutboundrouteAsync(PutTelephonyProvidersEdgesSiteOutboundrouteRequest request, AsyncApiCallback<OutboundRouteBase> callback) {
    return pcapiClient.<OutboundRouteBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OutboundRouteBase>() {}, callback);
  }

  /**
   * Update outbound route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OutboundRouteBase>> putTelephonyProvidersEdgesSiteOutboundrouteAsync(ApiRequest<OutboundRouteBase> request, AsyncApiCallback<ApiResponse<OutboundRouteBase>> callback) {
    return pcapiClient.<OutboundRouteBase>invokeAPIVerboseAsync(request, new TypeReference<OutboundRouteBase>() {}, callback);
  }

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TrunkBase> putTelephonyProvidersEdgesTrunkbasesettingAsync(PutTelephonyProvidersEdgesTrunkbasesettingRequest request, AsyncApiCallback<TrunkBase> callback) {
    return pcapiClient.<TrunkBase>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TrunkBase>() {}, callback);
  }

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TrunkBase>> putTelephonyProvidersEdgesTrunkbasesettingAsync(ApiRequest<TrunkBase> request, AsyncApiCallback<ApiResponse<TrunkBase>> callback) {
    return pcapiClient.<TrunkBase>invokeAPIVerboseAsync(request, new TypeReference<TrunkBase>() {}, callback);
  }

}
