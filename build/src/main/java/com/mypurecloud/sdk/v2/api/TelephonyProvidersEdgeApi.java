package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AlertablePresences;
import com.mypurecloud.sdk.v2.model.CertificateAuthorityEntityListing;
import com.mypurecloud.sdk.v2.model.DID;
import com.mypurecloud.sdk.v2.model.DIDEntityListing;
import com.mypurecloud.sdk.v2.model.DIDNumberEntityListing;
import com.mypurecloud.sdk.v2.model.DIDPool;
import com.mypurecloud.sdk.v2.model.DIDPoolEntityListing;
import com.mypurecloud.sdk.v2.model.DisableSiteConnectionsRequest;
import com.mypurecloud.sdk.v2.model.DomainCertificateAuthority;
import com.mypurecloud.sdk.v2.model.DomainEdgeSoftwareUpdateDto;
import com.mypurecloud.sdk.v2.model.DomainEdgeSoftwareVersionDtoEntityListing;
import com.mypurecloud.sdk.v2.model.DomainLogicalInterface;
import com.mypurecloud.sdk.v2.model.DomainPhysicalInterface;
import com.mypurecloud.sdk.v2.model.Edge;
import com.mypurecloud.sdk.v2.model.EdgeEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeGroup;
import com.mypurecloud.sdk.v2.model.EdgeGroupEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeLogsJob;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobRequest;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobResponse;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobUploadRequest;
import com.mypurecloud.sdk.v2.model.EdgeMetrics;
import com.mypurecloud.sdk.v2.model.EdgeNetworkDiagnostic;
import com.mypurecloud.sdk.v2.model.EdgeNetworkDiagnosticRequest;
import com.mypurecloud.sdk.v2.model.EdgeNetworkDiagnosticResponse;
import com.mypurecloud.sdk.v2.model.EdgeRebootParameters;
import com.mypurecloud.sdk.v2.model.EdgeServiceStateRequest;
import com.mypurecloud.sdk.v2.model.EdgeTrunkBase;
import com.mypurecloud.sdk.v2.model.EdgeVersionReport;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExpiredEdgeListing;
import com.mypurecloud.sdk.v2.model.Extension;
import com.mypurecloud.sdk.v2.model.ExtensionEntityListing;
import com.mypurecloud.sdk.v2.model.ExtensionPool;
import com.mypurecloud.sdk.v2.model.ExtensionPoolDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.ExtensionPoolEntityListing;
import com.mypurecloud.sdk.v2.model.Line;
import com.mypurecloud.sdk.v2.model.LineBase;
import com.mypurecloud.sdk.v2.model.LineBaseEntityListing;
import com.mypurecloud.sdk.v2.model.LineEntityListing;
import com.mypurecloud.sdk.v2.model.LogicalInterfaceEntityListing;
import com.mypurecloud.sdk.v2.model.MediaStatistics;
import com.mypurecloud.sdk.v2.model.MediaStatisticsListing;
import com.mypurecloud.sdk.v2.model.MediaStatisticsPostRequest;
import com.mypurecloud.sdk.v2.model.NumberPlan;
import com.mypurecloud.sdk.v2.model.OutboundRouteBase;
import com.mypurecloud.sdk.v2.model.OutboundRouteBaseEntityListing;
import com.mypurecloud.sdk.v2.model.OutboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.Phone;
import com.mypurecloud.sdk.v2.model.PhoneBase;
import com.mypurecloud.sdk.v2.model.PhoneBaseEntityListing;
import com.mypurecloud.sdk.v2.model.PhoneEntityListing;
import com.mypurecloud.sdk.v2.model.PhoneMetaBaseEntityListing;
import com.mypurecloud.sdk.v2.model.PhonesReboot;
import com.mypurecloud.sdk.v2.model.PhysicalInterfaceEntityListing;
import com.mypurecloud.sdk.v2.model.Site;
import com.mypurecloud.sdk.v2.model.SiteConnections;
import com.mypurecloud.sdk.v2.model.SiteEntityListing;
import com.mypurecloud.sdk.v2.model.SiteSearchRequest;
import com.mypurecloud.sdk.v2.model.SitesSearchResponse;
import com.mypurecloud.sdk.v2.model.TimeZoneEntityListing;
import com.mypurecloud.sdk.v2.model.Trunk;
import com.mypurecloud.sdk.v2.model.TrunkBase;
import com.mypurecloud.sdk.v2.model.TrunkBaseEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkMetabaseEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkMetrics;
import com.mypurecloud.sdk.v2.model.TrunkRecordingEnabledCount;
import com.mypurecloud.sdk.v2.model.ValidateAddressRequest;
import com.mypurecloud.sdk.v2.model.ValidateAddressResponse;
import com.mypurecloud.sdk.v2.model.VmPairingInfo;


import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgeLogicalinterfaceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgeSoftwareupdateRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesAlertablepresencesRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesCertificateauthorityRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesDidpoolRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesEdgegroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesExtensionpoolRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesPhoneRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesPhonebasesettingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesSiteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesSiteOutboundrouteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyProvidersEdgesTrunkbasesettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeDiagnosticNslookupRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeDiagnosticPingRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeDiagnosticRouteRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeDiagnosticTracepathRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeLogicalinterfaceRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeLogicalinterfacesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeLogsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeMetricsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgePhysicalinterfaceRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgePhysicalinterfacesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeSetuppackageRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeSoftwareupdateRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeSoftwareversionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgeTrunksRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesAlertablepresencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesCertificateauthoritiesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesCertificateauthorityRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesDidRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesDidpoolRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesDidpoolsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesDidpoolsDidsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesDidsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesEdgegroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesEdgegroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesEdgeversionreportRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesExpiredRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesExtensionRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesExtensionpoolRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesExtensionpoolsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesExtensionpoolsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesExtensionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesLineRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesLinebasesettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesLinebasesettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesLinesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesLinesTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesLogicalinterfacesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesMediastatisticsConversationRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesMediastatisticsConversationCommunicationRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesMetricsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesOutboundroutesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhoneRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhonebasesettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhonebasesettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhonebasesettingsTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhonesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhonesTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhysicalinterfacesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteNumberplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteNumberplansRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteOutboundrouteRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteOutboundroutesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSiteSiteconnectionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSitesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSitesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTimezonesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkMetricsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkbasesettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkbasesettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkbasesettingsTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunksRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunksMetricsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesTrunkswithrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTelephonyProvidersEdgesSiteSiteconnectionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgeDiagnosticNslookupRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgeDiagnosticPingRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgeDiagnosticRouteRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgeDiagnosticTracepathRequest;
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
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesExtensionpoolsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresourceRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesPhoneRebootRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesPhonebasesettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesPhonesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesPhonesRebootRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesSiteOutboundroutesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesSitesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesSitesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesTrunkbasesettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgeRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgeLogicalinterfaceRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesAlertablepresencesRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesCertificateauthorityRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesDidpoolRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesEdgegroupRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesExtensionpoolRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesPhoneRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesPhonebasesettingRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesSiteRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesSiteNumberplansRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesSiteOutboundrouteRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesSiteSiteconnectionsRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyProvidersEdgesTrunkbasesettingRequest;

import java.io.IOException;
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdge(String edgeId) throws IOException, ApiException {
     deleteTelephonyProvidersEdge(createDeleteTelephonyProvidersEdgeRequest(edgeId));
  }

  /**
   * Delete a edge.
   * 
   * @param edgeId Edge ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgeWithHttpInfo(String edgeId) throws IOException {
    return deleteTelephonyProvidersEdge(createDeleteTelephonyProvidersEdgeRequest(edgeId).withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgeRequest createDeleteTelephonyProvidersEdgeRequest(String edgeId) {
    return DeleteTelephonyProvidersEdgeRequest.builder()
            .withEdgeId(edgeId)

            .build();
  }

  /**
   * Delete a edge.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdge(DeleteTelephonyProvidersEdgeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a edge.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdge(ApiRequest<Void> request) throws IOException {
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
   * Delete an edge logical interface
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgeLogicalinterface(String edgeId, String interfaceId) throws IOException, ApiException {
     deleteTelephonyProvidersEdgeLogicalinterface(createDeleteTelephonyProvidersEdgeLogicalinterfaceRequest(edgeId, interfaceId));
  }

  /**
   * Delete an edge logical interface
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgeLogicalinterfaceWithHttpInfo(String edgeId, String interfaceId) throws IOException {
    return deleteTelephonyProvidersEdgeLogicalinterface(createDeleteTelephonyProvidersEdgeLogicalinterfaceRequest(edgeId, interfaceId).withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgeLogicalinterfaceRequest createDeleteTelephonyProvidersEdgeLogicalinterfaceRequest(String edgeId, String interfaceId) {
    return DeleteTelephonyProvidersEdgeLogicalinterfaceRequest.builder()
            .withEdgeId(edgeId)

            .withInterfaceId(interfaceId)

            .build();
  }

  /**
   * Delete an edge logical interface
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgeLogicalinterface(DeleteTelephonyProvidersEdgeLogicalinterfaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an edge logical interface
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgeLogicalinterface(ApiRequest<Void> request) throws IOException {
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
   * Cancels any in-progress update for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgeSoftwareupdate(String edgeId) throws IOException, ApiException {
     deleteTelephonyProvidersEdgeSoftwareupdate(createDeleteTelephonyProvidersEdgeSoftwareupdateRequest(edgeId));
  }

  /**
   * Cancels any in-progress update for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgeSoftwareupdateWithHttpInfo(String edgeId) throws IOException {
    return deleteTelephonyProvidersEdgeSoftwareupdate(createDeleteTelephonyProvidersEdgeSoftwareupdateRequest(edgeId).withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgeSoftwareupdateRequest createDeleteTelephonyProvidersEdgeSoftwareupdateRequest(String edgeId) {
    return DeleteTelephonyProvidersEdgeSoftwareupdateRequest.builder()
            .withEdgeId(edgeId)

            .build();
  }

  /**
   * Cancels any in-progress update for this edge.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgeSoftwareupdate(DeleteTelephonyProvidersEdgeSoftwareupdateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Cancels any in-progress update for this edge.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgeSoftwareupdate(ApiRequest<Void> request) throws IOException {
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
   * Deletes alertable presences overrides.
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesAlertablepresences() throws IOException, ApiException {
     deleteTelephonyProvidersEdgesAlertablepresences(createDeleteTelephonyProvidersEdgesAlertablepresencesRequest());
  }

  /**
   * Deletes alertable presences overrides.
   * 
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesAlertablepresencesWithHttpInfo() throws IOException {
    return deleteTelephonyProvidersEdgesAlertablepresences(createDeleteTelephonyProvidersEdgesAlertablepresencesRequest().withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgesAlertablepresencesRequest createDeleteTelephonyProvidersEdgesAlertablepresencesRequest() {
    return DeleteTelephonyProvidersEdgesAlertablepresencesRequest.builder()
            .build();
  }

  /**
   * Deletes alertable presences overrides.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesAlertablepresences(DeleteTelephonyProvidersEdgesAlertablepresencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes alertable presences overrides.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesAlertablepresences(ApiRequest<Void> request) throws IOException {
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
   * Delete a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesCertificateauthority(String certificateId) throws IOException, ApiException {
     deleteTelephonyProvidersEdgesCertificateauthority(createDeleteTelephonyProvidersEdgesCertificateauthorityRequest(certificateId));
  }

  /**
   * Delete a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesCertificateauthorityWithHttpInfo(String certificateId) throws IOException {
    return deleteTelephonyProvidersEdgesCertificateauthority(createDeleteTelephonyProvidersEdgesCertificateauthorityRequest(certificateId).withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgesCertificateauthorityRequest createDeleteTelephonyProvidersEdgesCertificateauthorityRequest(String certificateId) {
    return DeleteTelephonyProvidersEdgesCertificateauthorityRequest.builder()
            .withCertificateId(certificateId)

            .build();
  }

  /**
   * Delete a certificate authority.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesCertificateauthority(DeleteTelephonyProvidersEdgesCertificateauthorityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a certificate authority.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesCertificateauthority(ApiRequest<Void> request) throws IOException {
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
   * Delete a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesDidpool(String didPoolId) throws IOException, ApiException {
     deleteTelephonyProvidersEdgesDidpool(createDeleteTelephonyProvidersEdgesDidpoolRequest(didPoolId));
  }

  /**
   * Delete a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesDidpoolWithHttpInfo(String didPoolId) throws IOException {
    return deleteTelephonyProvidersEdgesDidpool(createDeleteTelephonyProvidersEdgesDidpoolRequest(didPoolId).withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgesDidpoolRequest createDeleteTelephonyProvidersEdgesDidpoolRequest(String didPoolId) {
    return DeleteTelephonyProvidersEdgesDidpoolRequest.builder()
            .withDidPoolId(didPoolId)

            .build();
  }

  /**
   * Delete a DID Pool by ID.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesDidpool(DeleteTelephonyProvidersEdgesDidpoolRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a DID Pool by ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesDidpool(ApiRequest<Void> request) throws IOException {
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
   * Delete an edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesEdgegroup(String edgeGroupId) throws IOException, ApiException {
     deleteTelephonyProvidersEdgesEdgegroup(createDeleteTelephonyProvidersEdgesEdgegroupRequest(edgeGroupId));
  }

  /**
   * Delete an edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesEdgegroupWithHttpInfo(String edgeGroupId) throws IOException {
    return deleteTelephonyProvidersEdgesEdgegroup(createDeleteTelephonyProvidersEdgesEdgegroupRequest(edgeGroupId).withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgesEdgegroupRequest createDeleteTelephonyProvidersEdgesEdgegroupRequest(String edgeGroupId) {
    return DeleteTelephonyProvidersEdgesEdgegroupRequest.builder()
            .withEdgeGroupId(edgeGroupId)

            .build();
  }

  /**
   * Delete an edge group.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesEdgegroup(DeleteTelephonyProvidersEdgesEdgegroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an edge group.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesEdgegroup(ApiRequest<Void> request) throws IOException {
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
   * Delete an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesExtensionpool(String extensionPoolId) throws IOException, ApiException {
     deleteTelephonyProvidersEdgesExtensionpool(createDeleteTelephonyProvidersEdgesExtensionpoolRequest(extensionPoolId));
  }

  /**
   * Delete an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesExtensionpoolWithHttpInfo(String extensionPoolId) throws IOException {
    return deleteTelephonyProvidersEdgesExtensionpool(createDeleteTelephonyProvidersEdgesExtensionpoolRequest(extensionPoolId).withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgesExtensionpoolRequest createDeleteTelephonyProvidersEdgesExtensionpoolRequest(String extensionPoolId) {
    return DeleteTelephonyProvidersEdgesExtensionpoolRequest.builder()
            .withExtensionPoolId(extensionPoolId)

            .build();
  }

  /**
   * Delete an extension pool by ID
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesExtensionpool(DeleteTelephonyProvidersEdgesExtensionpoolRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an extension pool by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesExtensionpool(ApiRequest<Void> request) throws IOException {
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
   * Delete a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesPhone(String phoneId) throws IOException, ApiException {
     deleteTelephonyProvidersEdgesPhone(createDeleteTelephonyProvidersEdgesPhoneRequest(phoneId));
  }

  /**
   * Delete a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesPhoneWithHttpInfo(String phoneId) throws IOException {
    return deleteTelephonyProvidersEdgesPhone(createDeleteTelephonyProvidersEdgesPhoneRequest(phoneId).withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgesPhoneRequest createDeleteTelephonyProvidersEdgesPhoneRequest(String phoneId) {
    return DeleteTelephonyProvidersEdgesPhoneRequest.builder()
            .withPhoneId(phoneId)

            .build();
  }

  /**
   * Delete a Phone by ID
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesPhone(DeleteTelephonyProvidersEdgesPhoneRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Phone by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesPhone(ApiRequest<Void> request) throws IOException {
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
   * Delete a Phone Base Settings by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesPhonebasesetting(String phoneBaseId) throws IOException, ApiException {
     deleteTelephonyProvidersEdgesPhonebasesetting(createDeleteTelephonyProvidersEdgesPhonebasesettingRequest(phoneBaseId));
  }

  /**
   * Delete a Phone Base Settings by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesPhonebasesettingWithHttpInfo(String phoneBaseId) throws IOException {
    return deleteTelephonyProvidersEdgesPhonebasesetting(createDeleteTelephonyProvidersEdgesPhonebasesettingRequest(phoneBaseId).withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgesPhonebasesettingRequest createDeleteTelephonyProvidersEdgesPhonebasesettingRequest(String phoneBaseId) {
    return DeleteTelephonyProvidersEdgesPhonebasesettingRequest.builder()
            .withPhoneBaseId(phoneBaseId)

            .build();
  }

  /**
   * Delete a Phone Base Settings by ID
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesPhonebasesetting(DeleteTelephonyProvidersEdgesPhonebasesettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Phone Base Settings by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesPhonebasesetting(ApiRequest<Void> request) throws IOException {
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
   * Delete a Site by ID
   * 
   * @param siteId Site ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesSite(String siteId) throws IOException, ApiException {
     deleteTelephonyProvidersEdgesSite(createDeleteTelephonyProvidersEdgesSiteRequest(siteId));
  }

  /**
   * Delete a Site by ID
   * 
   * @param siteId Site ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesSiteWithHttpInfo(String siteId) throws IOException {
    return deleteTelephonyProvidersEdgesSite(createDeleteTelephonyProvidersEdgesSiteRequest(siteId).withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgesSiteRequest createDeleteTelephonyProvidersEdgesSiteRequest(String siteId) {
    return DeleteTelephonyProvidersEdgesSiteRequest.builder()
            .withSiteId(siteId)

            .build();
  }

  /**
   * Delete a Site by ID
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesSite(DeleteTelephonyProvidersEdgesSiteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Site by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesSite(ApiRequest<Void> request) throws IOException {
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
   * Delete Outbound Route
   * 
   * @param siteId Site ID (required)
   * @param outboundRouteId Outbound route ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesSiteOutboundroute(String siteId, String outboundRouteId) throws IOException, ApiException {
     deleteTelephonyProvidersEdgesSiteOutboundroute(createDeleteTelephonyProvidersEdgesSiteOutboundrouteRequest(siteId, outboundRouteId));
  }

  /**
   * Delete Outbound Route
   * 
   * @param siteId Site ID (required)
   * @param outboundRouteId Outbound route ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesSiteOutboundrouteWithHttpInfo(String siteId, String outboundRouteId) throws IOException {
    return deleteTelephonyProvidersEdgesSiteOutboundroute(createDeleteTelephonyProvidersEdgesSiteOutboundrouteRequest(siteId, outboundRouteId).withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgesSiteOutboundrouteRequest createDeleteTelephonyProvidersEdgesSiteOutboundrouteRequest(String siteId, String outboundRouteId) {
    return DeleteTelephonyProvidersEdgesSiteOutboundrouteRequest.builder()
            .withSiteId(siteId)

            .withOutboundRouteId(outboundRouteId)

            .build();
  }

  /**
   * Delete Outbound Route
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesSiteOutboundroute(DeleteTelephonyProvidersEdgesSiteOutboundrouteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Outbound Route
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesSiteOutboundroute(ApiRequest<Void> request) throws IOException {
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
   * Delete a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesTrunkbasesetting(String trunkBaseSettingsId) throws IOException, ApiException {
     deleteTelephonyProvidersEdgesTrunkbasesetting(createDeleteTelephonyProvidersEdgesTrunkbasesettingRequest(trunkBaseSettingsId));
  }

  /**
   * Delete a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesTrunkbasesettingWithHttpInfo(String trunkBaseSettingsId) throws IOException {
    return deleteTelephonyProvidersEdgesTrunkbasesetting(createDeleteTelephonyProvidersEdgesTrunkbasesettingRequest(trunkBaseSettingsId).withHttpInfo());
  }

  private DeleteTelephonyProvidersEdgesTrunkbasesettingRequest createDeleteTelephonyProvidersEdgesTrunkbasesettingRequest(String trunkBaseSettingsId) {
    return DeleteTelephonyProvidersEdgesTrunkbasesettingRequest.builder()
            .withTrunkBaseSettingsId(trunkBaseSettingsId)

            .build();
  }

  /**
   * Delete a Trunk Base Settings object by ID
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyProvidersEdgesTrunkbasesetting(DeleteTelephonyProvidersEdgesTrunkbasesettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Trunk Base Settings object by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyProvidersEdgesTrunkbasesetting(ApiRequest<Void> request) throws IOException {
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
   * Get edge.
   * 
   * @param edgeId Edge ID (required)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @return Edge
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Edge getTelephonyProvidersEdge(String edgeId, List<String> expand) throws IOException, ApiException {
    return  getTelephonyProvidersEdge(createGetTelephonyProvidersEdgeRequest(edgeId, expand));
  }

  /**
   * Get edge.
   * 
   * @param edgeId Edge ID (required)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @return Edge
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Edge> getTelephonyProvidersEdgeWithHttpInfo(String edgeId, List<String> expand) throws IOException {
    return getTelephonyProvidersEdge(createGetTelephonyProvidersEdgeRequest(edgeId, expand).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeRequest createGetTelephonyProvidersEdgeRequest(String edgeId, List<String> expand) {
    return GetTelephonyProvidersEdgeRequest.builder()
            .withEdgeId(edgeId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get edge.
   * 
   * @param request The request object
   * @return Edge
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Edge getTelephonyProvidersEdge(GetTelephonyProvidersEdgeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Edge> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Edge>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get edge.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Edge> getTelephonyProvidersEdge(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Edge>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Edge> response = (ApiResponse<Edge>)(ApiResponse<?>)exception;
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
      ApiResponse<Edge> response = (ApiResponse<Edge>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @return EdgeNetworkDiagnosticResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnosticResponse getTelephonyProvidersEdgeDiagnosticNslookup(String edgeId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgeDiagnosticNslookup(createGetTelephonyProvidersEdgeDiagnosticNslookupRequest(edgeId));
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @return EdgeNetworkDiagnosticResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnosticResponse> getTelephonyProvidersEdgeDiagnosticNslookupWithHttpInfo(String edgeId) throws IOException {
    return getTelephonyProvidersEdgeDiagnosticNslookup(createGetTelephonyProvidersEdgeDiagnosticNslookupRequest(edgeId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeDiagnosticNslookupRequest createGetTelephonyProvidersEdgeDiagnosticNslookupRequest(String edgeId) {
    return GetTelephonyProvidersEdgeDiagnosticNslookupRequest.builder()
            .withEdgeId(edgeId)

            .build();
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return EdgeNetworkDiagnosticResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnosticResponse getTelephonyProvidersEdgeDiagnosticNslookup(GetTelephonyProvidersEdgeDiagnosticNslookupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeNetworkDiagnosticResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeNetworkDiagnosticResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnosticResponse> getTelephonyProvidersEdgeDiagnosticNslookup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeNetworkDiagnosticResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeNetworkDiagnosticResponse> response = (ApiResponse<EdgeNetworkDiagnosticResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeNetworkDiagnosticResponse> response = (ApiResponse<EdgeNetworkDiagnosticResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @return EdgeNetworkDiagnosticResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnosticResponse getTelephonyProvidersEdgeDiagnosticPing(String edgeId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgeDiagnosticPing(createGetTelephonyProvidersEdgeDiagnosticPingRequest(edgeId));
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @return EdgeNetworkDiagnosticResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnosticResponse> getTelephonyProvidersEdgeDiagnosticPingWithHttpInfo(String edgeId) throws IOException {
    return getTelephonyProvidersEdgeDiagnosticPing(createGetTelephonyProvidersEdgeDiagnosticPingRequest(edgeId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeDiagnosticPingRequest createGetTelephonyProvidersEdgeDiagnosticPingRequest(String edgeId) {
    return GetTelephonyProvidersEdgeDiagnosticPingRequest.builder()
            .withEdgeId(edgeId)

            .build();
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return EdgeNetworkDiagnosticResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnosticResponse getTelephonyProvidersEdgeDiagnosticPing(GetTelephonyProvidersEdgeDiagnosticPingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeNetworkDiagnosticResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeNetworkDiagnosticResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnosticResponse> getTelephonyProvidersEdgeDiagnosticPing(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeNetworkDiagnosticResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeNetworkDiagnosticResponse> response = (ApiResponse<EdgeNetworkDiagnosticResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeNetworkDiagnosticResponse> response = (ApiResponse<EdgeNetworkDiagnosticResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @return EdgeNetworkDiagnosticResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnosticResponse getTelephonyProvidersEdgeDiagnosticRoute(String edgeId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgeDiagnosticRoute(createGetTelephonyProvidersEdgeDiagnosticRouteRequest(edgeId));
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @return EdgeNetworkDiagnosticResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnosticResponse> getTelephonyProvidersEdgeDiagnosticRouteWithHttpInfo(String edgeId) throws IOException {
    return getTelephonyProvidersEdgeDiagnosticRoute(createGetTelephonyProvidersEdgeDiagnosticRouteRequest(edgeId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeDiagnosticRouteRequest createGetTelephonyProvidersEdgeDiagnosticRouteRequest(String edgeId) {
    return GetTelephonyProvidersEdgeDiagnosticRouteRequest.builder()
            .withEdgeId(edgeId)

            .build();
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return EdgeNetworkDiagnosticResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnosticResponse getTelephonyProvidersEdgeDiagnosticRoute(GetTelephonyProvidersEdgeDiagnosticRouteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeNetworkDiagnosticResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeNetworkDiagnosticResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnosticResponse> getTelephonyProvidersEdgeDiagnosticRoute(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeNetworkDiagnosticResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeNetworkDiagnosticResponse> response = (ApiResponse<EdgeNetworkDiagnosticResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeNetworkDiagnosticResponse> response = (ApiResponse<EdgeNetworkDiagnosticResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @return EdgeNetworkDiagnosticResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnosticResponse getTelephonyProvidersEdgeDiagnosticTracepath(String edgeId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgeDiagnosticTracepath(createGetTelephonyProvidersEdgeDiagnosticTracepathRequest(edgeId));
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @return EdgeNetworkDiagnosticResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnosticResponse> getTelephonyProvidersEdgeDiagnosticTracepathWithHttpInfo(String edgeId) throws IOException {
    return getTelephonyProvidersEdgeDiagnosticTracepath(createGetTelephonyProvidersEdgeDiagnosticTracepathRequest(edgeId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeDiagnosticTracepathRequest createGetTelephonyProvidersEdgeDiagnosticTracepathRequest(String edgeId) {
    return GetTelephonyProvidersEdgeDiagnosticTracepathRequest.builder()
            .withEdgeId(edgeId)

            .build();
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return EdgeNetworkDiagnosticResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnosticResponse getTelephonyProvidersEdgeDiagnosticTracepath(GetTelephonyProvidersEdgeDiagnosticTracepathRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeNetworkDiagnosticResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeNetworkDiagnosticResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnosticResponse> getTelephonyProvidersEdgeDiagnosticTracepath(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeNetworkDiagnosticResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeNetworkDiagnosticResponse> response = (ApiResponse<EdgeNetworkDiagnosticResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeNetworkDiagnosticResponse> response = (ApiResponse<EdgeNetworkDiagnosticResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an edge logical interface
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @param expand Field to expand in the response (optional)
   * @return DomainLogicalInterface
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainLogicalInterface getTelephonyProvidersEdgeLogicalinterface(String edgeId, String interfaceId, List<String> expand) throws IOException, ApiException {
    return  getTelephonyProvidersEdgeLogicalinterface(createGetTelephonyProvidersEdgeLogicalinterfaceRequest(edgeId, interfaceId, expand));
  }

  /**
   * Get an edge logical interface
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @param expand Field to expand in the response (optional)
   * @return DomainLogicalInterface
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainLogicalInterface> getTelephonyProvidersEdgeLogicalinterfaceWithHttpInfo(String edgeId, String interfaceId, List<String> expand) throws IOException {
    return getTelephonyProvidersEdgeLogicalinterface(createGetTelephonyProvidersEdgeLogicalinterfaceRequest(edgeId, interfaceId, expand).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeLogicalinterfaceRequest createGetTelephonyProvidersEdgeLogicalinterfaceRequest(String edgeId, String interfaceId, List<String> expand) {
    return GetTelephonyProvidersEdgeLogicalinterfaceRequest.builder()
            .withEdgeId(edgeId)

            .withInterfaceId(interfaceId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get an edge logical interface
   * 
   * @param request The request object
   * @return DomainLogicalInterface
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainLogicalInterface getTelephonyProvidersEdgeLogicalinterface(GetTelephonyProvidersEdgeLogicalinterfaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainLogicalInterface> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainLogicalInterface>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an edge logical interface
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainLogicalInterface> getTelephonyProvidersEdgeLogicalinterface(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainLogicalInterface>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainLogicalInterface> response = (ApiResponse<DomainLogicalInterface>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainLogicalInterface> response = (ApiResponse<DomainLogicalInterface>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @param edgeId Edge ID (required)
   * @param expand Field to expand in the response (optional)
   * @return LogicalInterfaceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogicalInterfaceEntityListing getTelephonyProvidersEdgeLogicalinterfaces(String edgeId, List<String> expand) throws IOException, ApiException {
    return  getTelephonyProvidersEdgeLogicalinterfaces(createGetTelephonyProvidersEdgeLogicalinterfacesRequest(edgeId, expand));
  }

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @param edgeId Edge ID (required)
   * @param expand Field to expand in the response (optional)
   * @return LogicalInterfaceEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogicalInterfaceEntityListing> getTelephonyProvidersEdgeLogicalinterfacesWithHttpInfo(String edgeId, List<String> expand) throws IOException {
    return getTelephonyProvidersEdgeLogicalinterfaces(createGetTelephonyProvidersEdgeLogicalinterfacesRequest(edgeId, expand).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeLogicalinterfacesRequest createGetTelephonyProvidersEdgeLogicalinterfacesRequest(String edgeId, List<String> expand) {
    return GetTelephonyProvidersEdgeLogicalinterfacesRequest.builder()
            .withEdgeId(edgeId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @param request The request object
   * @return LogicalInterfaceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogicalInterfaceEntityListing getTelephonyProvidersEdgeLogicalinterfaces(GetTelephonyProvidersEdgeLogicalinterfacesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LogicalInterfaceEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LogicalInterfaceEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogicalInterfaceEntityListing> getTelephonyProvidersEdgeLogicalinterfaces(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LogicalInterfaceEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LogicalInterfaceEntityListing> response = (ApiResponse<LogicalInterfaceEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LogicalInterfaceEntityListing> response = (ApiResponse<LogicalInterfaceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an Edge logs job.
   * 
   * @param edgeId Edge ID (required)
   * @param jobId Job ID (required)
   * @return EdgeLogsJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeLogsJob getTelephonyProvidersEdgeLogsJob(String edgeId, String jobId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgeLogsJob(createGetTelephonyProvidersEdgeLogsJobRequest(edgeId, jobId));
  }

  /**
   * Get an Edge logs job.
   * 
   * @param edgeId Edge ID (required)
   * @param jobId Job ID (required)
   * @return EdgeLogsJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeLogsJob> getTelephonyProvidersEdgeLogsJobWithHttpInfo(String edgeId, String jobId) throws IOException {
    return getTelephonyProvidersEdgeLogsJob(createGetTelephonyProvidersEdgeLogsJobRequest(edgeId, jobId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeLogsJobRequest createGetTelephonyProvidersEdgeLogsJobRequest(String edgeId, String jobId) {
    return GetTelephonyProvidersEdgeLogsJobRequest.builder()
            .withEdgeId(edgeId)

            .withJobId(jobId)

            .build();
  }

  /**
   * Get an Edge logs job.
   * 
   * @param request The request object
   * @return EdgeLogsJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeLogsJob getTelephonyProvidersEdgeLogsJob(GetTelephonyProvidersEdgeLogsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeLogsJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeLogsJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an Edge logs job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeLogsJob> getTelephonyProvidersEdgeLogsJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeLogsJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeLogsJob> response = (ApiResponse<EdgeLogsJob>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeLogsJob> response = (ApiResponse<EdgeLogsJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the edge metrics.
   * 
   * @param edgeId Edge Id (required)
   * @return EdgeMetrics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeMetrics getTelephonyProvidersEdgeMetrics(String edgeId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgeMetrics(createGetTelephonyProvidersEdgeMetricsRequest(edgeId));
  }

  /**
   * Get the edge metrics.
   * 
   * @param edgeId Edge Id (required)
   * @return EdgeMetrics
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeMetrics> getTelephonyProvidersEdgeMetricsWithHttpInfo(String edgeId) throws IOException {
    return getTelephonyProvidersEdgeMetrics(createGetTelephonyProvidersEdgeMetricsRequest(edgeId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeMetricsRequest createGetTelephonyProvidersEdgeMetricsRequest(String edgeId) {
    return GetTelephonyProvidersEdgeMetricsRequest.builder()
            .withEdgeId(edgeId)

            .build();
  }

  /**
   * Get the edge metrics.
   * 
   * @param request The request object
   * @return EdgeMetrics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeMetrics getTelephonyProvidersEdgeMetrics(GetTelephonyProvidersEdgeMetricsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeMetrics> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeMetrics>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the edge metrics.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeMetrics> getTelephonyProvidersEdgeMetrics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeMetrics>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeMetrics> response = (ApiResponse<EdgeMetrics>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeMetrics> response = (ApiResponse<EdgeMetrics>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @return DomainPhysicalInterface
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainPhysicalInterface getTelephonyProvidersEdgePhysicalinterface(String edgeId, String interfaceId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgePhysicalinterface(createGetTelephonyProvidersEdgePhysicalinterfaceRequest(edgeId, interfaceId));
  }

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @return DomainPhysicalInterface
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainPhysicalInterface> getTelephonyProvidersEdgePhysicalinterfaceWithHttpInfo(String edgeId, String interfaceId) throws IOException {
    return getTelephonyProvidersEdgePhysicalinterface(createGetTelephonyProvidersEdgePhysicalinterfaceRequest(edgeId, interfaceId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgePhysicalinterfaceRequest createGetTelephonyProvidersEdgePhysicalinterfaceRequest(String edgeId, String interfaceId) {
    return GetTelephonyProvidersEdgePhysicalinterfaceRequest.builder()
            .withEdgeId(edgeId)

            .withInterfaceId(interfaceId)

            .build();
  }

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @param request The request object
   * @return DomainPhysicalInterface
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainPhysicalInterface getTelephonyProvidersEdgePhysicalinterface(GetTelephonyProvidersEdgePhysicalinterfaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainPhysicalInterface> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainPhysicalInterface>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainPhysicalInterface> getTelephonyProvidersEdgePhysicalinterface(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainPhysicalInterface>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainPhysicalInterface> response = (ApiResponse<DomainPhysicalInterface>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainPhysicalInterface> response = (ApiResponse<DomainPhysicalInterface>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @param edgeId Edge ID (required)
   * @return PhysicalInterfaceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhysicalInterfaceEntityListing getTelephonyProvidersEdgePhysicalinterfaces(String edgeId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgePhysicalinterfaces(createGetTelephonyProvidersEdgePhysicalinterfacesRequest(edgeId));
  }

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @param edgeId Edge ID (required)
   * @return PhysicalInterfaceEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhysicalInterfaceEntityListing> getTelephonyProvidersEdgePhysicalinterfacesWithHttpInfo(String edgeId) throws IOException {
    return getTelephonyProvidersEdgePhysicalinterfaces(createGetTelephonyProvidersEdgePhysicalinterfacesRequest(edgeId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgePhysicalinterfacesRequest createGetTelephonyProvidersEdgePhysicalinterfacesRequest(String edgeId) {
    return GetTelephonyProvidersEdgePhysicalinterfacesRequest.builder()
            .withEdgeId(edgeId)

            .build();
  }

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @param request The request object
   * @return PhysicalInterfaceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhysicalInterfaceEntityListing getTelephonyProvidersEdgePhysicalinterfaces(GetTelephonyProvidersEdgePhysicalinterfacesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PhysicalInterfaceEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PhysicalInterfaceEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhysicalInterfaceEntityListing> getTelephonyProvidersEdgePhysicalinterfaces(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PhysicalInterfaceEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PhysicalInterfaceEntityListing> response = (ApiResponse<PhysicalInterfaceEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<PhysicalInterfaceEntityListing> response = (ApiResponse<PhysicalInterfaceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @param edgeId Edge ID (required)
   * @return VmPairingInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VmPairingInfo getTelephonyProvidersEdgeSetuppackage(String edgeId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgeSetuppackage(createGetTelephonyProvidersEdgeSetuppackageRequest(edgeId));
  }

  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @param edgeId Edge ID (required)
   * @return VmPairingInfo
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VmPairingInfo> getTelephonyProvidersEdgeSetuppackageWithHttpInfo(String edgeId) throws IOException {
    return getTelephonyProvidersEdgeSetuppackage(createGetTelephonyProvidersEdgeSetuppackageRequest(edgeId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeSetuppackageRequest createGetTelephonyProvidersEdgeSetuppackageRequest(String edgeId) {
    return GetTelephonyProvidersEdgeSetuppackageRequest.builder()
            .withEdgeId(edgeId)

            .build();
  }

  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @param request The request object
   * @return VmPairingInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VmPairingInfo getTelephonyProvidersEdgeSetuppackage(GetTelephonyProvidersEdgeSetuppackageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VmPairingInfo> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VmPairingInfo>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VmPairingInfo> getTelephonyProvidersEdgeSetuppackage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VmPairingInfo>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VmPairingInfo> response = (ApiResponse<VmPairingInfo>)(ApiResponse<?>)exception;
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
      ApiResponse<VmPairingInfo> response = (ApiResponse<VmPairingInfo>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets software update status information about any edge.
   * 
   * @param edgeId Edge ID (required)
   * @return DomainEdgeSoftwareUpdateDto
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEdgeSoftwareUpdateDto getTelephonyProvidersEdgeSoftwareupdate(String edgeId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgeSoftwareupdate(createGetTelephonyProvidersEdgeSoftwareupdateRequest(edgeId));
  }

  /**
   * Gets software update status information about any edge.
   * 
   * @param edgeId Edge ID (required)
   * @return DomainEdgeSoftwareUpdateDto
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEdgeSoftwareUpdateDto> getTelephonyProvidersEdgeSoftwareupdateWithHttpInfo(String edgeId) throws IOException {
    return getTelephonyProvidersEdgeSoftwareupdate(createGetTelephonyProvidersEdgeSoftwareupdateRequest(edgeId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeSoftwareupdateRequest createGetTelephonyProvidersEdgeSoftwareupdateRequest(String edgeId) {
    return GetTelephonyProvidersEdgeSoftwareupdateRequest.builder()
            .withEdgeId(edgeId)

            .build();
  }

  /**
   * Gets software update status information about any edge.
   * 
   * @param request The request object
   * @return DomainEdgeSoftwareUpdateDto
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEdgeSoftwareUpdateDto getTelephonyProvidersEdgeSoftwareupdate(GetTelephonyProvidersEdgeSoftwareupdateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainEdgeSoftwareUpdateDto> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainEdgeSoftwareUpdateDto>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets software update status information about any edge.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEdgeSoftwareUpdateDto> getTelephonyProvidersEdgeSoftwareupdate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainEdgeSoftwareUpdateDto>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainEdgeSoftwareUpdateDto> response = (ApiResponse<DomainEdgeSoftwareUpdateDto>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainEdgeSoftwareUpdateDto> response = (ApiResponse<DomainEdgeSoftwareUpdateDto>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets all the available software versions for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @return DomainEdgeSoftwareVersionDtoEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEdgeSoftwareVersionDtoEntityListing getTelephonyProvidersEdgeSoftwareversions(String edgeId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgeSoftwareversions(createGetTelephonyProvidersEdgeSoftwareversionsRequest(edgeId));
  }

  /**
   * Gets all the available software versions for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @return DomainEdgeSoftwareVersionDtoEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing> getTelephonyProvidersEdgeSoftwareversionsWithHttpInfo(String edgeId) throws IOException {
    return getTelephonyProvidersEdgeSoftwareversions(createGetTelephonyProvidersEdgeSoftwareversionsRequest(edgeId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeSoftwareversionsRequest createGetTelephonyProvidersEdgeSoftwareversionsRequest(String edgeId) {
    return GetTelephonyProvidersEdgeSoftwareversionsRequest.builder()
            .withEdgeId(edgeId)

            .build();
  }

  /**
   * Gets all the available software versions for this edge.
   * 
   * @param request The request object
   * @return DomainEdgeSoftwareVersionDtoEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEdgeSoftwareVersionDtoEntityListing getTelephonyProvidersEdgeSoftwareversions(GetTelephonyProvidersEdgeSoftwareversionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainEdgeSoftwareVersionDtoEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets all the available software versions for this edge.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing> getTelephonyProvidersEdgeSoftwareversions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainEdgeSoftwareVersionDtoEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing> response = (ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing> response = (ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of available trunks for the given Edge.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @param edgeId Edge ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param trunkBaseId Filter by Trunk Base Ids (optional)
   * @param trunkType Filter by a Trunk type (optional)
   * @return TrunkEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkEntityListing getTelephonyProvidersEdgeTrunks(String edgeId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String trunkBaseId, String trunkType) throws IOException, ApiException {
    return  getTelephonyProvidersEdgeTrunks(createGetTelephonyProvidersEdgeTrunksRequest(edgeId, pageNumber, pageSize, sortBy, sortOrder, trunkBaseId, trunkType));
  }

  /**
   * Get the list of available trunks for the given Edge.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @param edgeId Edge ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param trunkBaseId Filter by Trunk Base Ids (optional)
   * @param trunkType Filter by a Trunk type (optional)
   * @return TrunkEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkEntityListing> getTelephonyProvidersEdgeTrunksWithHttpInfo(String edgeId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String trunkBaseId, String trunkType) throws IOException {
    return getTelephonyProvidersEdgeTrunks(createGetTelephonyProvidersEdgeTrunksRequest(edgeId, pageNumber, pageSize, sortBy, sortOrder, trunkBaseId, trunkType).withHttpInfo());
  }

  private GetTelephonyProvidersEdgeTrunksRequest createGetTelephonyProvidersEdgeTrunksRequest(String edgeId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String trunkBaseId, String trunkType) {
    return GetTelephonyProvidersEdgeTrunksRequest.builder()
            .withEdgeId(edgeId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withTrunkBaseId(trunkBaseId)

            .withTrunkType(trunkType)

            .build();
  }

  /**
   * Get the list of available trunks for the given Edge.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @param request The request object
   * @return TrunkEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkEntityListing getTelephonyProvidersEdgeTrunks(GetTelephonyProvidersEdgeTrunksRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrunkEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrunkEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of available trunks for the given Edge.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkEntityListing> getTelephonyProvidersEdgeTrunks(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrunkEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrunkEntityListing> response = (ApiResponse<TrunkEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TrunkEntityListing> response = (ApiResponse<TrunkEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * @param showCloudMedia True to show the cloud media devices in the result. (optional, default to true)
   * @return EdgeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeEntityListing getTelephonyProvidersEdges(Integer pageSize, Integer pageNumber, String name, String siteId, String edgeGroupId, String sortBy, Boolean managed, Boolean showCloudMedia) throws IOException, ApiException {
    return  getTelephonyProvidersEdges(createGetTelephonyProvidersEdgesRequest(pageSize, pageNumber, name, siteId, edgeGroupId, sortBy, managed, showCloudMedia));
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
   * @param showCloudMedia True to show the cloud media devices in the result. (optional, default to true)
   * @return EdgeEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeEntityListing> getTelephonyProvidersEdgesWithHttpInfo(Integer pageSize, Integer pageNumber, String name, String siteId, String edgeGroupId, String sortBy, Boolean managed, Boolean showCloudMedia) throws IOException {
    return getTelephonyProvidersEdges(createGetTelephonyProvidersEdgesRequest(pageSize, pageNumber, name, siteId, edgeGroupId, sortBy, managed, showCloudMedia).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesRequest createGetTelephonyProvidersEdgesRequest(Integer pageSize, Integer pageNumber, String name, String siteId, String edgeGroupId, String sortBy, Boolean managed, Boolean showCloudMedia) {
    return GetTelephonyProvidersEdgesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withName(name)

            .withSiteId(siteId)

            .withEdgeGroupId(edgeGroupId)

            .withSortBy(sortBy)

            .withManaged(managed)

            .withShowCloudMedia(showCloudMedia)

            .build();
  }

  /**
   * Get the list of edges.
   * 
   * @param request The request object
   * @return EdgeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeEntityListing getTelephonyProvidersEdges(GetTelephonyProvidersEdgesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of edges.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeEntityListing> getTelephonyProvidersEdges(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeEntityListing> response = (ApiResponse<EdgeEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeEntityListing> response = (ApiResponse<EdgeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list alertable presences. The 'type' query parameter can be used to If there are any overrides, this is the list of overrides; if there are no overrides, it is the default list.
   * 
   * @param type  (optional)
   * @return AlertablePresences
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlertablePresences getTelephonyProvidersEdgesAlertablepresences(String type) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesAlertablepresences(createGetTelephonyProvidersEdgesAlertablepresencesRequest(type));
  }

  /**
   * Get the list alertable presences. The 'type' query parameter can be used to If there are any overrides, this is the list of overrides; if there are no overrides, it is the default list.
   * 
   * @param type  (optional)
   * @return AlertablePresences
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlertablePresences> getTelephonyProvidersEdgesAlertablepresencesWithHttpInfo(String type) throws IOException {
    return getTelephonyProvidersEdgesAlertablepresences(createGetTelephonyProvidersEdgesAlertablepresencesRequest(type).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesAlertablepresencesRequest createGetTelephonyProvidersEdgesAlertablepresencesRequest(String type) {
    return GetTelephonyProvidersEdgesAlertablepresencesRequest.builder()
            .withType(type)

            .build();
  }

  /**
   * Get the list alertable presences. The 'type' query parameter can be used to If there are any overrides, this is the list of overrides; if there are no overrides, it is the default list.
   * 
   * @param request The request object
   * @return AlertablePresences
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlertablePresences getTelephonyProvidersEdgesAlertablepresences(GetTelephonyProvidersEdgesAlertablepresencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlertablePresences> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlertablePresences>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list alertable presences. The 'type' query parameter can be used to If there are any overrides, this is the list of overrides; if there are no overrides, it is the default list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlertablePresences> getTelephonyProvidersEdgesAlertablepresences(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlertablePresences>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlertablePresences> response = (ApiResponse<AlertablePresences>)(ApiResponse<?>)exception;
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
      ApiResponse<AlertablePresences> response = (ApiResponse<AlertablePresences>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of certificate authorities.
   * 
   * @return CertificateAuthorityEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CertificateAuthorityEntityListing getTelephonyProvidersEdgesCertificateauthorities() throws IOException, ApiException {
    return  getTelephonyProvidersEdgesCertificateauthorities(createGetTelephonyProvidersEdgesCertificateauthoritiesRequest());
  }

  /**
   * Get the list of certificate authorities.
   * 
   * @return CertificateAuthorityEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CertificateAuthorityEntityListing> getTelephonyProvidersEdgesCertificateauthoritiesWithHttpInfo() throws IOException {
    return getTelephonyProvidersEdgesCertificateauthorities(createGetTelephonyProvidersEdgesCertificateauthoritiesRequest().withHttpInfo());
  }

  private GetTelephonyProvidersEdgesCertificateauthoritiesRequest createGetTelephonyProvidersEdgesCertificateauthoritiesRequest() {
    return GetTelephonyProvidersEdgesCertificateauthoritiesRequest.builder()
            .build();
  }

  /**
   * Get the list of certificate authorities.
   * 
   * @param request The request object
   * @return CertificateAuthorityEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CertificateAuthorityEntityListing getTelephonyProvidersEdgesCertificateauthorities(GetTelephonyProvidersEdgesCertificateauthoritiesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CertificateAuthorityEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CertificateAuthorityEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of certificate authorities.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CertificateAuthorityEntityListing> getTelephonyProvidersEdgesCertificateauthorities(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CertificateAuthorityEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CertificateAuthorityEntityListing> response = (ApiResponse<CertificateAuthorityEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CertificateAuthorityEntityListing> response = (ApiResponse<CertificateAuthorityEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @return DomainCertificateAuthority
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainCertificateAuthority getTelephonyProvidersEdgesCertificateauthority(String certificateId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesCertificateauthority(createGetTelephonyProvidersEdgesCertificateauthorityRequest(certificateId));
  }

  /**
   * Get a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @return DomainCertificateAuthority
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainCertificateAuthority> getTelephonyProvidersEdgesCertificateauthorityWithHttpInfo(String certificateId) throws IOException {
    return getTelephonyProvidersEdgesCertificateauthority(createGetTelephonyProvidersEdgesCertificateauthorityRequest(certificateId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesCertificateauthorityRequest createGetTelephonyProvidersEdgesCertificateauthorityRequest(String certificateId) {
    return GetTelephonyProvidersEdgesCertificateauthorityRequest.builder()
            .withCertificateId(certificateId)

            .build();
  }

  /**
   * Get a certificate authority.
   * 
   * @param request The request object
   * @return DomainCertificateAuthority
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainCertificateAuthority getTelephonyProvidersEdgesCertificateauthority(GetTelephonyProvidersEdgesCertificateauthorityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainCertificateAuthority> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainCertificateAuthority>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a certificate authority.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainCertificateAuthority> getTelephonyProvidersEdgesCertificateauthority(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainCertificateAuthority>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainCertificateAuthority> response = (ApiResponse<DomainCertificateAuthority>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainCertificateAuthority> response = (ApiResponse<DomainCertificateAuthority>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a DID by ID.
   * 
   * @param didId DID ID (required)
   * @return DID
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DID getTelephonyProvidersEdgesDid(String didId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesDid(createGetTelephonyProvidersEdgesDidRequest(didId));
  }

  /**
   * Get a DID by ID.
   * 
   * @param didId DID ID (required)
   * @return DID
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DID> getTelephonyProvidersEdgesDidWithHttpInfo(String didId) throws IOException {
    return getTelephonyProvidersEdgesDid(createGetTelephonyProvidersEdgesDidRequest(didId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesDidRequest createGetTelephonyProvidersEdgesDidRequest(String didId) {
    return GetTelephonyProvidersEdgesDidRequest.builder()
            .withDidId(didId)

            .build();
  }

  /**
   * Get a DID by ID.
   * 
   * @param request The request object
   * @return DID
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DID getTelephonyProvidersEdgesDid(GetTelephonyProvidersEdgesDidRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DID> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DID>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a DID by ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DID> getTelephonyProvidersEdgesDid(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DID>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DID> response = (ApiResponse<DID>)(ApiResponse<?>)exception;
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
      ApiResponse<DID> response = (ApiResponse<DID>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @return DIDPool
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DIDPool getTelephonyProvidersEdgesDidpool(String didPoolId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesDidpool(createGetTelephonyProvidersEdgesDidpoolRequest(didPoolId));
  }

  /**
   * Get a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @return DIDPool
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DIDPool> getTelephonyProvidersEdgesDidpoolWithHttpInfo(String didPoolId) throws IOException {
    return getTelephonyProvidersEdgesDidpool(createGetTelephonyProvidersEdgesDidpoolRequest(didPoolId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesDidpoolRequest createGetTelephonyProvidersEdgesDidpoolRequest(String didPoolId) {
    return GetTelephonyProvidersEdgesDidpoolRequest.builder()
            .withDidPoolId(didPoolId)

            .build();
  }

  /**
   * Get a DID Pool by ID.
   * 
   * @param request The request object
   * @return DIDPool
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DIDPool getTelephonyProvidersEdgesDidpool(GetTelephonyProvidersEdgesDidpoolRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DIDPool> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DIDPool>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a DID Pool by ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DIDPool> getTelephonyProvidersEdgesDidpool(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DIDPool>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DIDPool> response = (ApiResponse<DIDPool>)(ApiResponse<?>)exception;
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
      ApiResponse<DIDPool> response = (ApiResponse<DIDPool>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a listing of DID Pools
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @param id Filter by a specific list of ID's (optional)
   * @return DIDPoolEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DIDPoolEntityListing getTelephonyProvidersEdgesDidpools(Integer pageSize, Integer pageNumber, String sortBy, List<String> id) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesDidpools(createGetTelephonyProvidersEdgesDidpoolsRequest(pageSize, pageNumber, sortBy, id));
  }

  /**
   * Get a listing of DID Pools
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @param id Filter by a specific list of ID's (optional)
   * @return DIDPoolEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DIDPoolEntityListing> getTelephonyProvidersEdgesDidpoolsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> id) throws IOException {
    return getTelephonyProvidersEdgesDidpools(createGetTelephonyProvidersEdgesDidpoolsRequest(pageSize, pageNumber, sortBy, id).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesDidpoolsRequest createGetTelephonyProvidersEdgesDidpoolsRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> id) {
    return GetTelephonyProvidersEdgesDidpoolsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withId(id)

            .build();
  }

  /**
   * Get a listing of DID Pools
   * 
   * @param request The request object
   * @return DIDPoolEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DIDPoolEntityListing getTelephonyProvidersEdgesDidpools(GetTelephonyProvidersEdgesDidpoolsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DIDPoolEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DIDPoolEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a listing of DID Pools
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DIDPoolEntityListing> getTelephonyProvidersEdgesDidpools(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DIDPoolEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DIDPoolEntityListing> response = (ApiResponse<DIDPoolEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DIDPoolEntityListing> response = (ApiResponse<DIDPoolEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a listing of unassigned and/or assigned numbers in a set of DID Pools.
   * 
   * @param type The type of numbers to return. (required)
   * @param id Filter by a specific list of DID Pools.  If this is not provided, numbers from all DID Pools will be returned. (optional)
   * @param numberMatch A number to filter the results by. (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to ascending)
   * @return DIDNumberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DIDNumberEntityListing getTelephonyProvidersEdgesDidpoolsDids(String type, List<String> id, String numberMatch, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesDidpoolsDids(createGetTelephonyProvidersEdgesDidpoolsDidsRequest(type, id, numberMatch, pageSize, pageNumber, sortOrder));
  }

  /**
   * Get a listing of unassigned and/or assigned numbers in a set of DID Pools.
   * 
   * @param type The type of numbers to return. (required)
   * @param id Filter by a specific list of DID Pools.  If this is not provided, numbers from all DID Pools will be returned. (optional)
   * @param numberMatch A number to filter the results by. (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to ascending)
   * @return DIDNumberEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DIDNumberEntityListing> getTelephonyProvidersEdgesDidpoolsDidsWithHttpInfo(String type, List<String> id, String numberMatch, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException {
    return getTelephonyProvidersEdgesDidpoolsDids(createGetTelephonyProvidersEdgesDidpoolsDidsRequest(type, id, numberMatch, pageSize, pageNumber, sortOrder).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesDidpoolsDidsRequest createGetTelephonyProvidersEdgesDidpoolsDidsRequest(String type, List<String> id, String numberMatch, Integer pageSize, Integer pageNumber, String sortOrder) {
    return GetTelephonyProvidersEdgesDidpoolsDidsRequest.builder()
            .withType(type)

            .withId(id)

            .withNumberMatch(numberMatch)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get a listing of unassigned and/or assigned numbers in a set of DID Pools.
   * 
   * @param request The request object
   * @return DIDNumberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DIDNumberEntityListing getTelephonyProvidersEdgesDidpoolsDids(GetTelephonyProvidersEdgesDidpoolsDidsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DIDNumberEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DIDNumberEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a listing of unassigned and/or assigned numbers in a set of DID Pools.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DIDNumberEntityListing> getTelephonyProvidersEdgesDidpoolsDids(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DIDNumberEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DIDNumberEntityListing> response = (ApiResponse<DIDNumberEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DIDNumberEntityListing> response = (ApiResponse<DIDNumberEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a listing of DIDs
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param phoneNumber Filter by phoneNumber (optional)
   * @param ownerId Filter by the owner of a phone number (optional)
   * @param didPoolId Filter by the DID Pool assignment (optional)
   * @param id Filter by a specific list of ID's (optional)
   * @return DIDEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DIDEntityListing getTelephonyProvidersEdgesDids(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String phoneNumber, String ownerId, String didPoolId, List<String> id) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesDids(createGetTelephonyProvidersEdgesDidsRequest(pageSize, pageNumber, sortBy, sortOrder, phoneNumber, ownerId, didPoolId, id));
  }

  /**
   * Get a listing of DIDs
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to number)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param phoneNumber Filter by phoneNumber (optional)
   * @param ownerId Filter by the owner of a phone number (optional)
   * @param didPoolId Filter by the DID Pool assignment (optional)
   * @param id Filter by a specific list of ID's (optional)
   * @return DIDEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DIDEntityListing> getTelephonyProvidersEdgesDidsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String phoneNumber, String ownerId, String didPoolId, List<String> id) throws IOException {
    return getTelephonyProvidersEdgesDids(createGetTelephonyProvidersEdgesDidsRequest(pageSize, pageNumber, sortBy, sortOrder, phoneNumber, ownerId, didPoolId, id).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesDidsRequest createGetTelephonyProvidersEdgesDidsRequest(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String phoneNumber, String ownerId, String didPoolId, List<String> id) {
    return GetTelephonyProvidersEdgesDidsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withPhoneNumber(phoneNumber)

            .withOwnerId(ownerId)

            .withDidPoolId(didPoolId)

            .withId(id)

            .build();
  }

  /**
   * Get a listing of DIDs
   * 
   * @param request The request object
   * @return DIDEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DIDEntityListing getTelephonyProvidersEdgesDids(GetTelephonyProvidersEdgesDidsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DIDEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DIDEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a listing of DIDs
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DIDEntityListing> getTelephonyProvidersEdgesDids(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DIDEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DIDEntityListing> response = (ApiResponse<DIDEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DIDEntityListing> response = (ApiResponse<DIDEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @param expand Fields to expand in the response (optional)
   * @return EdgeGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeGroup getTelephonyProvidersEdgesEdgegroup(String edgeGroupId, List<String> expand) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesEdgegroup(createGetTelephonyProvidersEdgesEdgegroupRequest(edgeGroupId, expand));
  }

  /**
   * Get edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @param expand Fields to expand in the response (optional)
   * @return EdgeGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeGroup> getTelephonyProvidersEdgesEdgegroupWithHttpInfo(String edgeGroupId, List<String> expand) throws IOException {
    return getTelephonyProvidersEdgesEdgegroup(createGetTelephonyProvidersEdgesEdgegroupRequest(edgeGroupId, expand).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesEdgegroupRequest createGetTelephonyProvidersEdgesEdgegroupRequest(String edgeGroupId, List<String> expand) {
    return GetTelephonyProvidersEdgesEdgegroupRequest.builder()
            .withEdgeGroupId(edgeGroupId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get edge group.
   * 
   * @param request The request object
   * @return EdgeGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeGroup getTelephonyProvidersEdgesEdgegroup(GetTelephonyProvidersEdgesEdgegroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get edge group.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeGroup> getTelephonyProvidersEdgesEdgegroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeGroup> response = (ApiResponse<EdgeGroup>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeGroup> response = (ApiResponse<EdgeGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets the edge trunk base associated with the edge group
   * 
   * @param edgegroupId Edge Group ID (required)
   * @param edgetrunkbaseId Edge Trunk Base ID (required)
   * @return EdgeTrunkBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeTrunkBase getTelephonyProvidersEdgesEdgegroupEdgetrunkbase(String edgegroupId, String edgetrunkbaseId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesEdgegroupEdgetrunkbase(createGetTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest(edgegroupId, edgetrunkbaseId));
  }

  /**
   * Gets the edge trunk base associated with the edge group
   * 
   * @param edgegroupId Edge Group ID (required)
   * @param edgetrunkbaseId Edge Trunk Base ID (required)
   * @return EdgeTrunkBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeTrunkBase> getTelephonyProvidersEdgesEdgegroupEdgetrunkbaseWithHttpInfo(String edgegroupId, String edgetrunkbaseId) throws IOException {
    return getTelephonyProvidersEdgesEdgegroupEdgetrunkbase(createGetTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest(edgegroupId, edgetrunkbaseId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest createGetTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest(String edgegroupId, String edgetrunkbaseId) {
    return GetTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest.builder()
            .withEdgegroupId(edgegroupId)

            .withEdgetrunkbaseId(edgetrunkbaseId)

            .build();
  }

  /**
   * Gets the edge trunk base associated with the edge group
   * 
   * @param request The request object
   * @return EdgeTrunkBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeTrunkBase getTelephonyProvidersEdgesEdgegroupEdgetrunkbase(GetTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeTrunkBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeTrunkBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets the edge trunk base associated with the edge group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeTrunkBase> getTelephonyProvidersEdgesEdgegroupEdgetrunkbase(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeTrunkBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeTrunkBase> response = (ApiResponse<EdgeTrunkBase>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeTrunkBase> response = (ApiResponse<EdgeTrunkBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeGroupEntityListing getTelephonyProvidersEdgesEdgegroups(Integer pageSize, Integer pageNumber, String name, String sortBy, Boolean managed) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesEdgegroups(createGetTelephonyProvidersEdgesEdgegroupsRequest(pageSize, pageNumber, name, sortBy, managed));
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
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeGroupEntityListing> getTelephonyProvidersEdgesEdgegroupsWithHttpInfo(Integer pageSize, Integer pageNumber, String name, String sortBy, Boolean managed) throws IOException {
    return getTelephonyProvidersEdgesEdgegroups(createGetTelephonyProvidersEdgesEdgegroupsRequest(pageSize, pageNumber, name, sortBy, managed).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesEdgegroupsRequest createGetTelephonyProvidersEdgesEdgegroupsRequest(Integer pageSize, Integer pageNumber, String name, String sortBy, Boolean managed) {
    return GetTelephonyProvidersEdgesEdgegroupsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withName(name)

            .withSortBy(sortBy)

            .withManaged(managed)

            .build();
  }

  /**
   * Get the list of edge groups.
   * 
   * @param request The request object
   * @return EdgeGroupEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeGroupEntityListing getTelephonyProvidersEdgesEdgegroups(GetTelephonyProvidersEdgesEdgegroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeGroupEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeGroupEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of edge groups.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeGroupEntityListing> getTelephonyProvidersEdgesEdgegroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeGroupEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeGroupEntityListing> response = (ApiResponse<EdgeGroupEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeGroupEntityListing> response = (ApiResponse<EdgeGroupEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @return EdgeVersionReport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeVersionReport getTelephonyProvidersEdgesEdgeversionreport() throws IOException, ApiException {
    return  getTelephonyProvidersEdgesEdgeversionreport(createGetTelephonyProvidersEdgesEdgeversionreportRequest());
  }

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @return EdgeVersionReport
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeVersionReport> getTelephonyProvidersEdgesEdgeversionreportWithHttpInfo() throws IOException {
    return getTelephonyProvidersEdgesEdgeversionreport(createGetTelephonyProvidersEdgesEdgeversionreportRequest().withHttpInfo());
  }

  private GetTelephonyProvidersEdgesEdgeversionreportRequest createGetTelephonyProvidersEdgesEdgeversionreportRequest() {
    return GetTelephonyProvidersEdgesEdgeversionreportRequest.builder()
            .build();
  }

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @param request The request object
   * @return EdgeVersionReport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeVersionReport getTelephonyProvidersEdgesEdgeversionreport(GetTelephonyProvidersEdgesEdgeversionreportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeVersionReport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeVersionReport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeVersionReport> getTelephonyProvidersEdgesEdgeversionreport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeVersionReport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeVersionReport> response = (ApiResponse<EdgeVersionReport>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeVersionReport> response = (ApiResponse<EdgeVersionReport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * List of edges more than 4 edge versions behind the latest software.
   * 
   * @return ExpiredEdgeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExpiredEdgeListing getTelephonyProvidersEdgesExpired() throws IOException, ApiException {
    return  getTelephonyProvidersEdgesExpired(createGetTelephonyProvidersEdgesExpiredRequest());
  }

  /**
   * List of edges more than 4 edge versions behind the latest software.
   * 
   * @return ExpiredEdgeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExpiredEdgeListing> getTelephonyProvidersEdgesExpiredWithHttpInfo() throws IOException {
    return getTelephonyProvidersEdgesExpired(createGetTelephonyProvidersEdgesExpiredRequest().withHttpInfo());
  }

  private GetTelephonyProvidersEdgesExpiredRequest createGetTelephonyProvidersEdgesExpiredRequest() {
    return GetTelephonyProvidersEdgesExpiredRequest.builder()
            .build();
  }

  /**
   * List of edges more than 4 edge versions behind the latest software.
   * 
   * @param request The request object
   * @return ExpiredEdgeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExpiredEdgeListing getTelephonyProvidersEdgesExpired(GetTelephonyProvidersEdgesExpiredRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExpiredEdgeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExpiredEdgeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List of edges more than 4 edge versions behind the latest software.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExpiredEdgeListing> getTelephonyProvidersEdgesExpired(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExpiredEdgeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExpiredEdgeListing> response = (ApiResponse<ExpiredEdgeListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ExpiredEdgeListing> response = (ApiResponse<ExpiredEdgeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an extension by ID.
   * 
   * @param extensionId Extension ID (required)
   * @return Extension
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Extension getTelephonyProvidersEdgesExtension(String extensionId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesExtension(createGetTelephonyProvidersEdgesExtensionRequest(extensionId));
  }

  /**
   * Get an extension by ID.
   * 
   * @param extensionId Extension ID (required)
   * @return Extension
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Extension> getTelephonyProvidersEdgesExtensionWithHttpInfo(String extensionId) throws IOException {
    return getTelephonyProvidersEdgesExtension(createGetTelephonyProvidersEdgesExtensionRequest(extensionId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesExtensionRequest createGetTelephonyProvidersEdgesExtensionRequest(String extensionId) {
    return GetTelephonyProvidersEdgesExtensionRequest.builder()
            .withExtensionId(extensionId)

            .build();
  }

  /**
   * Get an extension by ID.
   * 
   * @param request The request object
   * @return Extension
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Extension getTelephonyProvidersEdgesExtension(GetTelephonyProvidersEdgesExtensionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Extension> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Extension>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an extension by ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Extension> getTelephonyProvidersEdgesExtension(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Extension>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Extension> response = (ApiResponse<Extension>)(ApiResponse<?>)exception;
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
      ApiResponse<Extension> response = (ApiResponse<Extension>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @return ExtensionPool
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExtensionPool getTelephonyProvidersEdgesExtensionpool(String extensionPoolId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesExtensionpool(createGetTelephonyProvidersEdgesExtensionpoolRequest(extensionPoolId));
  }

  /**
   * Get an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @return ExtensionPool
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExtensionPool> getTelephonyProvidersEdgesExtensionpoolWithHttpInfo(String extensionPoolId) throws IOException {
    return getTelephonyProvidersEdgesExtensionpool(createGetTelephonyProvidersEdgesExtensionpoolRequest(extensionPoolId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesExtensionpoolRequest createGetTelephonyProvidersEdgesExtensionpoolRequest(String extensionPoolId) {
    return GetTelephonyProvidersEdgesExtensionpoolRequest.builder()
            .withExtensionPoolId(extensionPoolId)

            .build();
  }

  /**
   * Get an extension pool by ID
   * 
   * @param request The request object
   * @return ExtensionPool
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExtensionPool getTelephonyProvidersEdgesExtensionpool(GetTelephonyProvidersEdgesExtensionpoolRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExtensionPool> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExtensionPool>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an extension pool by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExtensionPool> getTelephonyProvidersEdgesExtensionpool(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExtensionPool>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExtensionPool> response = (ApiResponse<ExtensionPool>)(ApiResponse<?>)exception;
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
      ApiResponse<ExtensionPool> response = (ApiResponse<ExtensionPool>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a listing of extension pools
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional)
   * @param number Deprecated, filtering by number not supported (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return ExtensionPoolEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExtensionPoolEntityListing getTelephonyProvidersEdgesExtensionpools(Integer pageSize, Integer pageNumber, String sortBy, String number, List<String> divisionId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesExtensionpools(createGetTelephonyProvidersEdgesExtensionpoolsRequest(pageSize, pageNumber, sortBy, number, divisionId));
  }

  /**
   * Get a listing of extension pools
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional)
   * @param number Deprecated, filtering by number not supported (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return ExtensionPoolEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExtensionPoolEntityListing> getTelephonyProvidersEdgesExtensionpoolsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String number, List<String> divisionId) throws IOException {
    return getTelephonyProvidersEdgesExtensionpools(createGetTelephonyProvidersEdgesExtensionpoolsRequest(pageSize, pageNumber, sortBy, number, divisionId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesExtensionpoolsRequest createGetTelephonyProvidersEdgesExtensionpoolsRequest(Integer pageSize, Integer pageNumber, String sortBy, String number, List<String> divisionId) {
    return GetTelephonyProvidersEdgesExtensionpoolsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withNumber(number)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a listing of extension pools
   * 
   * @param request The request object
   * @return ExtensionPoolEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExtensionPoolEntityListing getTelephonyProvidersEdgesExtensionpools(GetTelephonyProvidersEdgesExtensionpoolsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExtensionPoolEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExtensionPoolEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a listing of extension pools
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExtensionPoolEntityListing> getTelephonyProvidersEdgesExtensionpools(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExtensionPoolEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExtensionPoolEntityListing> response = (ApiResponse<ExtensionPoolEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ExtensionPoolEntityListing> response = (ApiResponse<ExtensionPoolEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of basic extension pool objects filterable by query parameters.
   * This returns extension pools consisting of name and division. If one or more IDs are specified, the search will fetch extension pools that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param id ID of the Extension Pools to filter by. (optional)
   * @param name Name of the Extension Pools to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return ExtensionPoolDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExtensionPoolDivisionViewEntityListing getTelephonyProvidersEdgesExtensionpoolsDivisionviews(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesExtensionpoolsDivisionviews(createGetTelephonyProvidersEdgesExtensionpoolsDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId));
  }

  /**
   * Get a pageable list of basic extension pool objects filterable by query parameters.
   * This returns extension pools consisting of name and division. If one or more IDs are specified, the search will fetch extension pools that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param id ID of the Extension Pools to filter by. (optional)
   * @param name Name of the Extension Pools to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return ExtensionPoolDivisionViewEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExtensionPoolDivisionViewEntityListing> getTelephonyProvidersEdgesExtensionpoolsDivisionviewsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException {
    return getTelephonyProvidersEdgesExtensionpoolsDivisionviews(createGetTelephonyProvidersEdgesExtensionpoolsDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesExtensionpoolsDivisionviewsRequest createGetTelephonyProvidersEdgesExtensionpoolsDivisionviewsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) {
    return GetTelephonyProvidersEdgesExtensionpoolsDivisionviewsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withId(id)

            .withName(name)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a pageable list of basic extension pool objects filterable by query parameters.
   * This returns extension pools consisting of name and division. If one or more IDs are specified, the search will fetch extension pools that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request The request object
   * @return ExtensionPoolDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExtensionPoolDivisionViewEntityListing getTelephonyProvidersEdgesExtensionpoolsDivisionviews(GetTelephonyProvidersEdgesExtensionpoolsDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExtensionPoolDivisionViewEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExtensionPoolDivisionViewEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of basic extension pool objects filterable by query parameters.
   * This returns extension pools consisting of name and division. If one or more IDs are specified, the search will fetch extension pools that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExtensionPoolDivisionViewEntityListing> getTelephonyProvidersEdgesExtensionpoolsDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExtensionPoolDivisionViewEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExtensionPoolDivisionViewEntityListing> response = (ApiResponse<ExtensionPoolDivisionViewEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ExtensionPoolDivisionViewEntityListing> response = (ApiResponse<ExtensionPoolDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExtensionEntityListing getTelephonyProvidersEdgesExtensions(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String number) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesExtensions(createGetTelephonyProvidersEdgesExtensionsRequest(pageSize, pageNumber, sortBy, sortOrder, number));
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
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExtensionEntityListing> getTelephonyProvidersEdgesExtensionsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String number) throws IOException {
    return getTelephonyProvidersEdgesExtensions(createGetTelephonyProvidersEdgesExtensionsRequest(pageSize, pageNumber, sortBy, sortOrder, number).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesExtensionsRequest createGetTelephonyProvidersEdgesExtensionsRequest(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String number) {
    return GetTelephonyProvidersEdgesExtensionsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withNumber(number)

            .build();
  }

  /**
   * Get a listing of extensions
   * 
   * @param request The request object
   * @return ExtensionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExtensionEntityListing getTelephonyProvidersEdgesExtensions(GetTelephonyProvidersEdgesExtensionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExtensionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExtensionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a listing of extensions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExtensionEntityListing> getTelephonyProvidersEdgesExtensions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExtensionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExtensionEntityListing> response = (ApiResponse<ExtensionEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ExtensionEntityListing> response = (ApiResponse<ExtensionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Line by ID
   * 
   * @param lineId Line ID (required)
   * @return Line
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Line getTelephonyProvidersEdgesLine(String lineId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesLine(createGetTelephonyProvidersEdgesLineRequest(lineId));
  }

  /**
   * Get a Line by ID
   * 
   * @param lineId Line ID (required)
   * @return Line
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Line> getTelephonyProvidersEdgesLineWithHttpInfo(String lineId) throws IOException {
    return getTelephonyProvidersEdgesLine(createGetTelephonyProvidersEdgesLineRequest(lineId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesLineRequest createGetTelephonyProvidersEdgesLineRequest(String lineId) {
    return GetTelephonyProvidersEdgesLineRequest.builder()
            .withLineId(lineId)

            .build();
  }

  /**
   * Get a Line by ID
   * 
   * @param request The request object
   * @return Line
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Line getTelephonyProvidersEdgesLine(GetTelephonyProvidersEdgesLineRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Line> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Line>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Line by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Line> getTelephonyProvidersEdgesLine(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Line>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Line> response = (ApiResponse<Line>)(ApiResponse<?>)exception;
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
      ApiResponse<Line> response = (ApiResponse<Line>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a line base settings object by ID
   * 
   * @param lineBaseId Line base ID (required)
   * @return LineBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineBase getTelephonyProvidersEdgesLinebasesetting(String lineBaseId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesLinebasesetting(createGetTelephonyProvidersEdgesLinebasesettingRequest(lineBaseId));
  }

  /**
   * Get a line base settings object by ID
   * 
   * @param lineBaseId Line base ID (required)
   * @return LineBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineBase> getTelephonyProvidersEdgesLinebasesettingWithHttpInfo(String lineBaseId) throws IOException {
    return getTelephonyProvidersEdgesLinebasesetting(createGetTelephonyProvidersEdgesLinebasesettingRequest(lineBaseId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesLinebasesettingRequest createGetTelephonyProvidersEdgesLinebasesettingRequest(String lineBaseId) {
    return GetTelephonyProvidersEdgesLinebasesettingRequest.builder()
            .withLineBaseId(lineBaseId)

            .build();
  }

  /**
   * Get a line base settings object by ID
   * 
   * @param request The request object
   * @return LineBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineBase getTelephonyProvidersEdgesLinebasesetting(GetTelephonyProvidersEdgesLinebasesettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a line base settings object by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineBase> getTelephonyProvidersEdgesLinebasesetting(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineBase> response = (ApiResponse<LineBase>)(ApiResponse<?>)exception;
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
      ApiResponse<LineBase> response = (ApiResponse<LineBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a listing of line base settings objects
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @return LineBaseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineBaseEntityListing getTelephonyProvidersEdgesLinebasesettings(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> expand) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesLinebasesettings(createGetTelephonyProvidersEdgesLinebasesettingsRequest(pageNumber, pageSize, sortBy, sortOrder, expand));
  }

  /**
   * Get a listing of line base settings objects
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @return LineBaseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineBaseEntityListing> getTelephonyProvidersEdgesLinebasesettingsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> expand) throws IOException {
    return getTelephonyProvidersEdgesLinebasesettings(createGetTelephonyProvidersEdgesLinebasesettingsRequest(pageNumber, pageSize, sortBy, sortOrder, expand).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesLinebasesettingsRequest createGetTelephonyProvidersEdgesLinebasesettingsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> expand) {
    return GetTelephonyProvidersEdgesLinebasesettingsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withExpand(expand)

            .build();
  }

  /**
   * Get a listing of line base settings objects
   * 
   * @param request The request object
   * @return LineBaseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineBaseEntityListing getTelephonyProvidersEdgesLinebasesettings(GetTelephonyProvidersEdgesLinebasesettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineBaseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineBaseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a listing of line base settings objects
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineBaseEntityListing> getTelephonyProvidersEdgesLinebasesettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineBaseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineBaseEntityListing> response = (ApiResponse<LineBaseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LineBaseEntityListing> response = (ApiResponse<LineBaseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Lines
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param expand Fields to expand in the response, comma-separated. The edgeGroup value is deprecated. (optional)
   * @return LineEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineEntityListing getTelephonyProvidersEdgesLines(Integer pageSize, Integer pageNumber, String name, String sortBy, List<String> expand) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesLines(createGetTelephonyProvidersEdgesLinesRequest(pageSize, pageNumber, name, sortBy, expand));
  }

  /**
   * Get a list of Lines
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param expand Fields to expand in the response, comma-separated. The edgeGroup value is deprecated. (optional)
   * @return LineEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineEntityListing> getTelephonyProvidersEdgesLinesWithHttpInfo(Integer pageSize, Integer pageNumber, String name, String sortBy, List<String> expand) throws IOException {
    return getTelephonyProvidersEdgesLines(createGetTelephonyProvidersEdgesLinesRequest(pageSize, pageNumber, name, sortBy, expand).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesLinesRequest createGetTelephonyProvidersEdgesLinesRequest(Integer pageSize, Integer pageNumber, String name, String sortBy, List<String> expand) {
    return GetTelephonyProvidersEdgesLinesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withName(name)

            .withSortBy(sortBy)

            .withExpand(expand)

            .build();
  }

  /**
   * Get a list of Lines
   * 
   * @param request The request object
   * @return LineEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineEntityListing getTelephonyProvidersEdgesLines(GetTelephonyProvidersEdgesLinesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Lines
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineEntityListing> getTelephonyProvidersEdgesLines(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineEntityListing> response = (ApiResponse<LineEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LineEntityListing> response = (ApiResponse<LineEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @param lineBaseSettingsId The id of a Line Base Settings object upon which to base this Line (required)
   * @return Line
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Line getTelephonyProvidersEdgesLinesTemplate(String lineBaseSettingsId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesLinesTemplate(createGetTelephonyProvidersEdgesLinesTemplateRequest(lineBaseSettingsId));
  }

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @param lineBaseSettingsId The id of a Line Base Settings object upon which to base this Line (required)
   * @return Line
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Line> getTelephonyProvidersEdgesLinesTemplateWithHttpInfo(String lineBaseSettingsId) throws IOException {
    return getTelephonyProvidersEdgesLinesTemplate(createGetTelephonyProvidersEdgesLinesTemplateRequest(lineBaseSettingsId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesLinesTemplateRequest createGetTelephonyProvidersEdgesLinesTemplateRequest(String lineBaseSettingsId) {
    return GetTelephonyProvidersEdgesLinesTemplateRequest.builder()
            .withLineBaseSettingsId(lineBaseSettingsId)

            .build();
  }

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @param request The request object
   * @return Line
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Line getTelephonyProvidersEdgesLinesTemplate(GetTelephonyProvidersEdgesLinesTemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Line> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Line>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Line> getTelephonyProvidersEdgesLinesTemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Line>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Line> response = (ApiResponse<Line>)(ApiResponse<?>)exception;
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
      ApiResponse<Line> response = (ApiResponse<Line>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get edge logical interfaces.
   * Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.
   * @param edgeIds Comma separated list of Edge Id's (required)
   * @param expand Field to expand in the response (optional)
   * @return LogicalInterfaceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogicalInterfaceEntityListing getTelephonyProvidersEdgesLogicalinterfaces(String edgeIds, List<String> expand) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesLogicalinterfaces(createGetTelephonyProvidersEdgesLogicalinterfacesRequest(edgeIds, expand));
  }

  /**
   * Get edge logical interfaces.
   * Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.
   * @param edgeIds Comma separated list of Edge Id's (required)
   * @param expand Field to expand in the response (optional)
   * @return LogicalInterfaceEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogicalInterfaceEntityListing> getTelephonyProvidersEdgesLogicalinterfacesWithHttpInfo(String edgeIds, List<String> expand) throws IOException {
    return getTelephonyProvidersEdgesLogicalinterfaces(createGetTelephonyProvidersEdgesLogicalinterfacesRequest(edgeIds, expand).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesLogicalinterfacesRequest createGetTelephonyProvidersEdgesLogicalinterfacesRequest(String edgeIds, List<String> expand) {
    return GetTelephonyProvidersEdgesLogicalinterfacesRequest.builder()
            .withEdgeIds(edgeIds)

            .withExpand(expand)

            .build();
  }

  /**
   * Get edge logical interfaces.
   * Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.
   * @param request The request object
   * @return LogicalInterfaceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogicalInterfaceEntityListing getTelephonyProvidersEdgesLogicalinterfaces(GetTelephonyProvidersEdgesLogicalinterfacesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LogicalInterfaceEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LogicalInterfaceEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get edge logical interfaces.
   * Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogicalInterfaceEntityListing> getTelephonyProvidersEdgesLogicalinterfaces(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LogicalInterfaceEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LogicalInterfaceEntityListing> response = (ApiResponse<LogicalInterfaceEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LogicalInterfaceEntityListing> response = (ApiResponse<LogicalInterfaceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get media endpoint statistics events.
   * 
   * getTelephonyProvidersEdgesMediastatisticsConversation is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param conversationId Identifier of the conversation (required)
   * @return MediaStatisticsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MediaStatisticsListing getTelephonyProvidersEdgesMediastatisticsConversation(String conversationId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesMediastatisticsConversation(createGetTelephonyProvidersEdgesMediastatisticsConversationRequest(conversationId));
  }

  /**
   * Get media endpoint statistics events.
   * 
   * getTelephonyProvidersEdgesMediastatisticsConversation is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param conversationId Identifier of the conversation (required)
   * @return MediaStatisticsListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MediaStatisticsListing> getTelephonyProvidersEdgesMediastatisticsConversationWithHttpInfo(String conversationId) throws IOException {
    return getTelephonyProvidersEdgesMediastatisticsConversation(createGetTelephonyProvidersEdgesMediastatisticsConversationRequest(conversationId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesMediastatisticsConversationRequest createGetTelephonyProvidersEdgesMediastatisticsConversationRequest(String conversationId) {
    return GetTelephonyProvidersEdgesMediastatisticsConversationRequest.builder()
            .withConversationId(conversationId)

            .build();
  }

  /**
   * Get media endpoint statistics events.
   * 
   * getTelephonyProvidersEdgesMediastatisticsConversation is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return MediaStatisticsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MediaStatisticsListing getTelephonyProvidersEdgesMediastatisticsConversation(GetTelephonyProvidersEdgesMediastatisticsConversationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MediaStatisticsListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MediaStatisticsListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get media endpoint statistics events.
   * 
   * getTelephonyProvidersEdgesMediastatisticsConversation is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MediaStatisticsListing> getTelephonyProvidersEdgesMediastatisticsConversation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MediaStatisticsListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MediaStatisticsListing> response = (ApiResponse<MediaStatisticsListing>)(ApiResponse<?>)exception;
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
      ApiResponse<MediaStatisticsListing> response = (ApiResponse<MediaStatisticsListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get media endpoint statistics event.
   * 
   * getTelephonyProvidersEdgesMediastatisticsConversationCommunication is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param conversationId Identifier of the conversation (required)
   * @param communicationId Identifier of the media session (required)
   * @return MediaStatistics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MediaStatistics getTelephonyProvidersEdgesMediastatisticsConversationCommunication(String conversationId, String communicationId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesMediastatisticsConversationCommunication(createGetTelephonyProvidersEdgesMediastatisticsConversationCommunicationRequest(conversationId, communicationId));
  }

  /**
   * Get media endpoint statistics event.
   * 
   * getTelephonyProvidersEdgesMediastatisticsConversationCommunication is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param conversationId Identifier of the conversation (required)
   * @param communicationId Identifier of the media session (required)
   * @return MediaStatistics
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MediaStatistics> getTelephonyProvidersEdgesMediastatisticsConversationCommunicationWithHttpInfo(String conversationId, String communicationId) throws IOException {
    return getTelephonyProvidersEdgesMediastatisticsConversationCommunication(createGetTelephonyProvidersEdgesMediastatisticsConversationCommunicationRequest(conversationId, communicationId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesMediastatisticsConversationCommunicationRequest createGetTelephonyProvidersEdgesMediastatisticsConversationCommunicationRequest(String conversationId, String communicationId) {
    return GetTelephonyProvidersEdgesMediastatisticsConversationCommunicationRequest.builder()
            .withConversationId(conversationId)

            .withCommunicationId(communicationId)

            .build();
  }

  /**
   * Get media endpoint statistics event.
   * 
   * getTelephonyProvidersEdgesMediastatisticsConversationCommunication is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return MediaStatistics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MediaStatistics getTelephonyProvidersEdgesMediastatisticsConversationCommunication(GetTelephonyProvidersEdgesMediastatisticsConversationCommunicationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MediaStatistics> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MediaStatistics>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get media endpoint statistics event.
   * 
   * getTelephonyProvidersEdgesMediastatisticsConversationCommunication is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MediaStatistics> getTelephonyProvidersEdgesMediastatisticsConversationCommunication(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MediaStatistics>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MediaStatistics> response = (ApiResponse<MediaStatistics>)(ApiResponse<?>)exception;
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
      ApiResponse<MediaStatistics> response = (ApiResponse<MediaStatistics>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the metrics for a list of edges.
   * 
   * @param edgeIds Comma separated list of Edge Id's. Maximum of 100 edge ids allowed. (required)
   * @return List<EdgeMetrics>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<EdgeMetrics> getTelephonyProvidersEdgesMetrics(String edgeIds) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesMetrics(createGetTelephonyProvidersEdgesMetricsRequest(edgeIds));
  }

  /**
   * Get the metrics for a list of edges.
   * 
   * @param edgeIds Comma separated list of Edge Id's. Maximum of 100 edge ids allowed. (required)
   * @return List<EdgeMetrics>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<EdgeMetrics>> getTelephonyProvidersEdgesMetricsWithHttpInfo(String edgeIds) throws IOException {
    return getTelephonyProvidersEdgesMetrics(createGetTelephonyProvidersEdgesMetricsRequest(edgeIds).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesMetricsRequest createGetTelephonyProvidersEdgesMetricsRequest(String edgeIds) {
    return GetTelephonyProvidersEdgesMetricsRequest.builder()
            .withEdgeIds(edgeIds)

            .build();
  }

  /**
   * Get the metrics for a list of edges.
   * 
   * @param request The request object
   * @return List<EdgeMetrics>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<EdgeMetrics> getTelephonyProvidersEdgesMetrics(GetTelephonyProvidersEdgesMetricsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<EdgeMetrics>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<EdgeMetrics>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the metrics for a list of edges.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<EdgeMetrics>> getTelephonyProvidersEdgesMetrics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<EdgeMetrics>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<EdgeMetrics>> response = (ApiResponse<List<EdgeMetrics>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<EdgeMetrics>> response = (ApiResponse<List<EdgeMetrics>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get outbound routes
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param siteId Filter by site.id (optional)
   * @param externalTrunkBasesIds Filter by externalTrunkBases.ids (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return OutboundRouteEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundRouteEntityListing getTelephonyProvidersEdgesOutboundroutes(Integer pageSize, Integer pageNumber, String name, String siteId, String externalTrunkBasesIds, String sortBy) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesOutboundroutes(createGetTelephonyProvidersEdgesOutboundroutesRequest(pageSize, pageNumber, name, siteId, externalTrunkBasesIds, sortBy));
  }

  /**
   * Get outbound routes
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param siteId Filter by site.id (optional)
   * @param externalTrunkBasesIds Filter by externalTrunkBases.ids (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return OutboundRouteEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundRouteEntityListing> getTelephonyProvidersEdgesOutboundroutesWithHttpInfo(Integer pageSize, Integer pageNumber, String name, String siteId, String externalTrunkBasesIds, String sortBy) throws IOException {
    return getTelephonyProvidersEdgesOutboundroutes(createGetTelephonyProvidersEdgesOutboundroutesRequest(pageSize, pageNumber, name, siteId, externalTrunkBasesIds, sortBy).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesOutboundroutesRequest createGetTelephonyProvidersEdgesOutboundroutesRequest(Integer pageSize, Integer pageNumber, String name, String siteId, String externalTrunkBasesIds, String sortBy) {
    return GetTelephonyProvidersEdgesOutboundroutesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withName(name)

            .withSiteId(siteId)

            .withExternalTrunkBasesIds(externalTrunkBasesIds)

            .withSortBy(sortBy)

            .build();
  }

  /**
   * Get outbound routes
   * 
   * @param request The request object
   * @return OutboundRouteEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundRouteEntityListing getTelephonyProvidersEdgesOutboundroutes(GetTelephonyProvidersEdgesOutboundroutesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutboundRouteEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutboundRouteEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get outbound routes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundRouteEntityListing> getTelephonyProvidersEdgesOutboundroutes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutboundRouteEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutboundRouteEntityListing> response = (ApiResponse<OutboundRouteEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OutboundRouteEntityListing> response = (ApiResponse<OutboundRouteEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @return Phone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Phone getTelephonyProvidersEdgesPhone(String phoneId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesPhone(createGetTelephonyProvidersEdgesPhoneRequest(phoneId));
  }

  /**
   * Get a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @return Phone
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Phone> getTelephonyProvidersEdgesPhoneWithHttpInfo(String phoneId) throws IOException {
    return getTelephonyProvidersEdgesPhone(createGetTelephonyProvidersEdgesPhoneRequest(phoneId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesPhoneRequest createGetTelephonyProvidersEdgesPhoneRequest(String phoneId) {
    return GetTelephonyProvidersEdgesPhoneRequest.builder()
            .withPhoneId(phoneId)

            .build();
  }

  /**
   * Get a Phone by ID
   * 
   * @param request The request object
   * @return Phone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Phone getTelephonyProvidersEdgesPhone(GetTelephonyProvidersEdgesPhoneRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Phone> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Phone>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Phone by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Phone> getTelephonyProvidersEdgesPhone(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Phone>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)exception;
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
      ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @return PhoneBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneBase getTelephonyProvidersEdgesPhonebasesetting(String phoneBaseId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesPhonebasesetting(createGetTelephonyProvidersEdgesPhonebasesettingRequest(phoneBaseId));
  }

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @return PhoneBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneBase> getTelephonyProvidersEdgesPhonebasesettingWithHttpInfo(String phoneBaseId) throws IOException {
    return getTelephonyProvidersEdgesPhonebasesetting(createGetTelephonyProvidersEdgesPhonebasesettingRequest(phoneBaseId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesPhonebasesettingRequest createGetTelephonyProvidersEdgesPhonebasesettingRequest(String phoneBaseId) {
    return GetTelephonyProvidersEdgesPhonebasesettingRequest.builder()
            .withPhoneBaseId(phoneBaseId)

            .build();
  }

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @param request The request object
   * @return PhoneBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneBase getTelephonyProvidersEdgesPhonebasesetting(GetTelephonyProvidersEdgesPhonebasesettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PhoneBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PhoneBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneBase> getTelephonyProvidersEdgesPhonebasesetting(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PhoneBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)exception;
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
      ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @param name Name (optional)
   * @return PhoneBaseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneBaseEntityListing getTelephonyProvidersEdgesPhonebasesettings(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, List<String> expand, String name) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesPhonebasesettings(createGetTelephonyProvidersEdgesPhonebasesettingsRequest(pageSize, pageNumber, sortBy, sortOrder, expand, name));
  }

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Value by which to sort (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @param name Name (optional)
   * @return PhoneBaseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettingsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, List<String> expand, String name) throws IOException {
    return getTelephonyProvidersEdgesPhonebasesettings(createGetTelephonyProvidersEdgesPhonebasesettingsRequest(pageSize, pageNumber, sortBy, sortOrder, expand, name).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesPhonebasesettingsRequest createGetTelephonyProvidersEdgesPhonebasesettingsRequest(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, List<String> expand, String name) {
    return GetTelephonyProvidersEdgesPhonebasesettingsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withExpand(expand)

            .withName(name)

            .build();
  }

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @param request The request object
   * @return PhoneBaseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneBaseEntityListing getTelephonyProvidersEdgesPhonebasesettings(GetTelephonyProvidersEdgesPhonebasesettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PhoneBaseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PhoneBaseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PhoneBaseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PhoneBaseEntityListing> response = (ApiResponse<PhoneBaseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<PhoneBaseEntityListing> response = (ApiResponse<PhoneBaseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return PhoneMetaBaseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneMetaBaseEntityListing getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases(createGetTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return PhoneMetaBaseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneMetaBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases(createGetTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesRequest createGetTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesRequest(Integer pageSize, Integer pageNumber) {
    return GetTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @param request The request object
   * @return PhoneMetaBaseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneMetaBaseEntityListing getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases(GetTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PhoneMetaBaseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PhoneMetaBaseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneMetaBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PhoneMetaBaseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PhoneMetaBaseEntityListing> response = (ApiResponse<PhoneMetaBaseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<PhoneMetaBaseEntityListing> response = (ApiResponse<PhoneMetaBaseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @param phoneMetabaseId The id of a metabase object upon which to base this Phone Base Settings (required)
   * @return PhoneBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneBase getTelephonyProvidersEdgesPhonebasesettingsTemplate(String phoneMetabaseId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesPhonebasesettingsTemplate(createGetTelephonyProvidersEdgesPhonebasesettingsTemplateRequest(phoneMetabaseId));
  }

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @param phoneMetabaseId The id of a metabase object upon which to base this Phone Base Settings (required)
   * @return PhoneBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneBase> getTelephonyProvidersEdgesPhonebasesettingsTemplateWithHttpInfo(String phoneMetabaseId) throws IOException {
    return getTelephonyProvidersEdgesPhonebasesettingsTemplate(createGetTelephonyProvidersEdgesPhonebasesettingsTemplateRequest(phoneMetabaseId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesPhonebasesettingsTemplateRequest createGetTelephonyProvidersEdgesPhonebasesettingsTemplateRequest(String phoneMetabaseId) {
    return GetTelephonyProvidersEdgesPhonebasesettingsTemplateRequest.builder()
            .withPhoneMetabaseId(phoneMetabaseId)

            .build();
  }

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @param request The request object
   * @return PhoneBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneBase getTelephonyProvidersEdgesPhonebasesettingsTemplate(GetTelephonyProvidersEdgesPhonebasesettingsTemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PhoneBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PhoneBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneBase> getTelephonyProvidersEdgesPhonebasesettingsTemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PhoneBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)exception;
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
      ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Phone Instances. A maximum of 10,000 results is returned when filtering the results or sorting by a field other than the ID. Sorting by only the ID has no result limit. Each filter supports a wildcard, *, as a value to search for partial values.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy The field to sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param siteId Filter by site.id (optional)
   * @param webRtcUserId Filter by webRtcUser.id (optional)
   * @param phoneBaseSettingsId Filter by phoneBaseSettings.id (optional)
   * @param linesLoggedInUserId Filter by lines.loggedInUser.id (optional)
   * @param linesDefaultForUserId Filter by lines.defaultForUser.id (optional)
   * @param phoneHardwareId Filter by phone_hardwareId (optional)
   * @param linesId Filter by lines.id (optional)
   * @param linesName Filter by lines.name (optional)
   * @param name Name of the Phone to filter by, comma-separated (optional)
   * @param statusOperationalStatus The primary status to filter by (optional)
   * @param secondaryStatusOperationalStatus The secondary status to filter by (optional)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @param fields Fields and properties to get, comma-separated (optional)
   * @return PhoneEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneEntityListing getTelephonyProvidersEdgesPhones(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String siteId, String webRtcUserId, String phoneBaseSettingsId, String linesLoggedInUserId, String linesDefaultForUserId, String phoneHardwareId, String linesId, String linesName, String name, String statusOperationalStatus, String secondaryStatusOperationalStatus, List<String> expand, List<String> fields) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesPhones(createGetTelephonyProvidersEdgesPhonesRequest(pageNumber, pageSize, sortBy, sortOrder, siteId, webRtcUserId, phoneBaseSettingsId, linesLoggedInUserId, linesDefaultForUserId, phoneHardwareId, linesId, linesName, name, statusOperationalStatus, secondaryStatusOperationalStatus, expand, fields));
  }

  /**
   * Get a list of Phone Instances. A maximum of 10,000 results is returned when filtering the results or sorting by a field other than the ID. Sorting by only the ID has no result limit. Each filter supports a wildcard, *, as a value to search for partial values.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy The field to sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param siteId Filter by site.id (optional)
   * @param webRtcUserId Filter by webRtcUser.id (optional)
   * @param phoneBaseSettingsId Filter by phoneBaseSettings.id (optional)
   * @param linesLoggedInUserId Filter by lines.loggedInUser.id (optional)
   * @param linesDefaultForUserId Filter by lines.defaultForUser.id (optional)
   * @param phoneHardwareId Filter by phone_hardwareId (optional)
   * @param linesId Filter by lines.id (optional)
   * @param linesName Filter by lines.name (optional)
   * @param name Name of the Phone to filter by, comma-separated (optional)
   * @param statusOperationalStatus The primary status to filter by (optional)
   * @param secondaryStatusOperationalStatus The secondary status to filter by (optional)
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @param fields Fields and properties to get, comma-separated (optional)
   * @return PhoneEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneEntityListing> getTelephonyProvidersEdgesPhonesWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String siteId, String webRtcUserId, String phoneBaseSettingsId, String linesLoggedInUserId, String linesDefaultForUserId, String phoneHardwareId, String linesId, String linesName, String name, String statusOperationalStatus, String secondaryStatusOperationalStatus, List<String> expand, List<String> fields) throws IOException {
    return getTelephonyProvidersEdgesPhones(createGetTelephonyProvidersEdgesPhonesRequest(pageNumber, pageSize, sortBy, sortOrder, siteId, webRtcUserId, phoneBaseSettingsId, linesLoggedInUserId, linesDefaultForUserId, phoneHardwareId, linesId, linesName, name, statusOperationalStatus, secondaryStatusOperationalStatus, expand, fields).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesPhonesRequest createGetTelephonyProvidersEdgesPhonesRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String siteId, String webRtcUserId, String phoneBaseSettingsId, String linesLoggedInUserId, String linesDefaultForUserId, String phoneHardwareId, String linesId, String linesName, String name, String statusOperationalStatus, String secondaryStatusOperationalStatus, List<String> expand, List<String> fields) {
    return GetTelephonyProvidersEdgesPhonesRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withSiteId(siteId)

            .withWebRtcUserId(webRtcUserId)

            .withPhoneBaseSettingsId(phoneBaseSettingsId)

            .withLinesLoggedInUserId(linesLoggedInUserId)

            .withLinesDefaultForUserId(linesDefaultForUserId)

            .withPhoneHardwareId(phoneHardwareId)

            .withLinesId(linesId)

            .withLinesName(linesName)

            .withName(name)

            .withStatusOperationalStatus(statusOperationalStatus)

            .withSecondaryStatusOperationalStatus(secondaryStatusOperationalStatus)

            .withExpand(expand)

            .withFields(fields)

            .build();
  }

  /**
   * Get a list of Phone Instances. A maximum of 10,000 results is returned when filtering the results or sorting by a field other than the ID. Sorting by only the ID has no result limit. Each filter supports a wildcard, *, as a value to search for partial values.
   * 
   * @param request The request object
   * @return PhoneEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneEntityListing getTelephonyProvidersEdgesPhones(GetTelephonyProvidersEdgesPhonesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PhoneEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PhoneEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Phone Instances. A maximum of 10,000 results is returned when filtering the results or sorting by a field other than the ID. Sorting by only the ID has no result limit. Each filter supports a wildcard, *, as a value to search for partial values.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneEntityListing> getTelephonyProvidersEdgesPhones(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PhoneEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PhoneEntityListing> response = (ApiResponse<PhoneEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<PhoneEntityListing> response = (ApiResponse<PhoneEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @param phoneBaseSettingsId The id of a Phone Base Settings object upon which to base this Phone (required)
   * @return Phone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Phone getTelephonyProvidersEdgesPhonesTemplate(String phoneBaseSettingsId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesPhonesTemplate(createGetTelephonyProvidersEdgesPhonesTemplateRequest(phoneBaseSettingsId));
  }

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @param phoneBaseSettingsId The id of a Phone Base Settings object upon which to base this Phone (required)
   * @return Phone
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Phone> getTelephonyProvidersEdgesPhonesTemplateWithHttpInfo(String phoneBaseSettingsId) throws IOException {
    return getTelephonyProvidersEdgesPhonesTemplate(createGetTelephonyProvidersEdgesPhonesTemplateRequest(phoneBaseSettingsId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesPhonesTemplateRequest createGetTelephonyProvidersEdgesPhonesTemplateRequest(String phoneBaseSettingsId) {
    return GetTelephonyProvidersEdgesPhonesTemplateRequest.builder()
            .withPhoneBaseSettingsId(phoneBaseSettingsId)

            .build();
  }

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @param request The request object
   * @return Phone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Phone getTelephonyProvidersEdgesPhonesTemplate(GetTelephonyProvidersEdgesPhonesTemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Phone> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Phone>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Phone> getTelephonyProvidersEdgesPhonesTemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Phone>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)exception;
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
      ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get physical interfaces for edges.
   * Retrieves a list of all configured physical interfaces for a list of edges. Only 100 edges can be requested at a time.
   * @param edgeIds Comma separated list of Edge Id's (required)
   * @return PhysicalInterfaceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhysicalInterfaceEntityListing getTelephonyProvidersEdgesPhysicalinterfaces(String edgeIds) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesPhysicalinterfaces(createGetTelephonyProvidersEdgesPhysicalinterfacesRequest(edgeIds));
  }

  /**
   * Get physical interfaces for edges.
   * Retrieves a list of all configured physical interfaces for a list of edges. Only 100 edges can be requested at a time.
   * @param edgeIds Comma separated list of Edge Id's (required)
   * @return PhysicalInterfaceEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhysicalInterfaceEntityListing> getTelephonyProvidersEdgesPhysicalinterfacesWithHttpInfo(String edgeIds) throws IOException {
    return getTelephonyProvidersEdgesPhysicalinterfaces(createGetTelephonyProvidersEdgesPhysicalinterfacesRequest(edgeIds).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesPhysicalinterfacesRequest createGetTelephonyProvidersEdgesPhysicalinterfacesRequest(String edgeIds) {
    return GetTelephonyProvidersEdgesPhysicalinterfacesRequest.builder()
            .withEdgeIds(edgeIds)

            .build();
  }

  /**
   * Get physical interfaces for edges.
   * Retrieves a list of all configured physical interfaces for a list of edges. Only 100 edges can be requested at a time.
   * @param request The request object
   * @return PhysicalInterfaceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhysicalInterfaceEntityListing getTelephonyProvidersEdgesPhysicalinterfaces(GetTelephonyProvidersEdgesPhysicalinterfacesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PhysicalInterfaceEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PhysicalInterfaceEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get physical interfaces for edges.
   * Retrieves a list of all configured physical interfaces for a list of edges. Only 100 edges can be requested at a time.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhysicalInterfaceEntityListing> getTelephonyProvidersEdgesPhysicalinterfaces(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PhysicalInterfaceEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PhysicalInterfaceEntityListing> response = (ApiResponse<PhysicalInterfaceEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<PhysicalInterfaceEntityListing> response = (ApiResponse<PhysicalInterfaceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Site by ID.
   * 
   * @param siteId Site ID (required)
   * @return Site
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Site getTelephonyProvidersEdgesSite(String siteId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesSite(createGetTelephonyProvidersEdgesSiteRequest(siteId));
  }

  /**
   * Get a Site by ID.
   * 
   * @param siteId Site ID (required)
   * @return Site
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Site> getTelephonyProvidersEdgesSiteWithHttpInfo(String siteId) throws IOException {
    return getTelephonyProvidersEdgesSite(createGetTelephonyProvidersEdgesSiteRequest(siteId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesSiteRequest createGetTelephonyProvidersEdgesSiteRequest(String siteId) {
    return GetTelephonyProvidersEdgesSiteRequest.builder()
            .withSiteId(siteId)

            .build();
  }

  /**
   * Get a Site by ID.
   * 
   * @param request The request object
   * @return Site
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Site getTelephonyProvidersEdgesSite(GetTelephonyProvidersEdgesSiteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Site> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Site>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Site by ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Site> getTelephonyProvidersEdgesSite(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Site>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Site> response = (ApiResponse<Site>)(ApiResponse<?>)exception;
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
      ApiResponse<Site> response = (ApiResponse<Site>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Number Plan by ID.
   * 
   * @param siteId Site ID (required)
   * @param numberPlanId Number Plan ID (required)
   * @return NumberPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NumberPlan getTelephonyProvidersEdgesSiteNumberplan(String siteId, String numberPlanId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesSiteNumberplan(createGetTelephonyProvidersEdgesSiteNumberplanRequest(siteId, numberPlanId));
  }

  /**
   * Get a Number Plan by ID.
   * 
   * @param siteId Site ID (required)
   * @param numberPlanId Number Plan ID (required)
   * @return NumberPlan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NumberPlan> getTelephonyProvidersEdgesSiteNumberplanWithHttpInfo(String siteId, String numberPlanId) throws IOException {
    return getTelephonyProvidersEdgesSiteNumberplan(createGetTelephonyProvidersEdgesSiteNumberplanRequest(siteId, numberPlanId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesSiteNumberplanRequest createGetTelephonyProvidersEdgesSiteNumberplanRequest(String siteId, String numberPlanId) {
    return GetTelephonyProvidersEdgesSiteNumberplanRequest.builder()
            .withSiteId(siteId)

            .withNumberPlanId(numberPlanId)

            .build();
  }

  /**
   * Get a Number Plan by ID.
   * 
   * @param request The request object
   * @return NumberPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NumberPlan getTelephonyProvidersEdgesSiteNumberplan(GetTelephonyProvidersEdgesSiteNumberplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NumberPlan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NumberPlan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Number Plan by ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NumberPlan> getTelephonyProvidersEdgesSiteNumberplan(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NumberPlan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NumberPlan> response = (ApiResponse<NumberPlan>)(ApiResponse<?>)exception;
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
      ApiResponse<NumberPlan> response = (ApiResponse<NumberPlan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of Number Plans for this Site. Only fetches the first 200 records.
   * 
   * @param siteId Site ID (required)
   * @return List<NumberPlan>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<NumberPlan> getTelephonyProvidersEdgesSiteNumberplans(String siteId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesSiteNumberplans(createGetTelephonyProvidersEdgesSiteNumberplansRequest(siteId));
  }

  /**
   * Get the list of Number Plans for this Site. Only fetches the first 200 records.
   * 
   * @param siteId Site ID (required)
   * @return List<NumberPlan>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<NumberPlan>> getTelephonyProvidersEdgesSiteNumberplansWithHttpInfo(String siteId) throws IOException {
    return getTelephonyProvidersEdgesSiteNumberplans(createGetTelephonyProvidersEdgesSiteNumberplansRequest(siteId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesSiteNumberplansRequest createGetTelephonyProvidersEdgesSiteNumberplansRequest(String siteId) {
    return GetTelephonyProvidersEdgesSiteNumberplansRequest.builder()
            .withSiteId(siteId)

            .build();
  }

  /**
   * Get the list of Number Plans for this Site. Only fetches the first 200 records.
   * 
   * @param request The request object
   * @return List<NumberPlan>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<NumberPlan> getTelephonyProvidersEdgesSiteNumberplans(GetTelephonyProvidersEdgesSiteNumberplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<NumberPlan>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<NumberPlan>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of Number Plans for this Site. Only fetches the first 200 records.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<NumberPlan>> getTelephonyProvidersEdgesSiteNumberplans(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<NumberPlan>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<NumberPlan>> response = (ApiResponse<List<NumberPlan>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<NumberPlan>> response = (ApiResponse<List<NumberPlan>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Classifications for this Site
   * 
   * @param siteId Site ID (required)
   * @param classification Classification (optional)
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getTelephonyProvidersEdgesSiteNumberplansClassifications(String siteId, String classification) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesSiteNumberplansClassifications(createGetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest(siteId, classification));
  }

  /**
   * Get a list of Classifications for this Site
   * 
   * @param siteId Site ID (required)
   * @param classification Classification (optional)
   * @return List<String>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getTelephonyProvidersEdgesSiteNumberplansClassificationsWithHttpInfo(String siteId, String classification) throws IOException {
    return getTelephonyProvidersEdgesSiteNumberplansClassifications(createGetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest(siteId, classification).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest createGetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest(String siteId, String classification) {
    return GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest.builder()
            .withSiteId(siteId)

            .withClassification(classification)

            .build();
  }

  /**
   * Get a list of Classifications for this Site
   * 
   * @param request The request object
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getTelephonyProvidersEdgesSiteNumberplansClassifications(GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<String>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<String>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Classifications for this Site
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getTelephonyProvidersEdgesSiteNumberplansClassifications(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<String>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an outbound route
   * 
   * @param siteId Site ID (required)
   * @param outboundRouteId Outbound route ID (required)
   * @return OutboundRouteBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundRouteBase getTelephonyProvidersEdgesSiteOutboundroute(String siteId, String outboundRouteId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesSiteOutboundroute(createGetTelephonyProvidersEdgesSiteOutboundrouteRequest(siteId, outboundRouteId));
  }

  /**
   * Get an outbound route
   * 
   * @param siteId Site ID (required)
   * @param outboundRouteId Outbound route ID (required)
   * @return OutboundRouteBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundRouteBase> getTelephonyProvidersEdgesSiteOutboundrouteWithHttpInfo(String siteId, String outboundRouteId) throws IOException {
    return getTelephonyProvidersEdgesSiteOutboundroute(createGetTelephonyProvidersEdgesSiteOutboundrouteRequest(siteId, outboundRouteId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesSiteOutboundrouteRequest createGetTelephonyProvidersEdgesSiteOutboundrouteRequest(String siteId, String outboundRouteId) {
    return GetTelephonyProvidersEdgesSiteOutboundrouteRequest.builder()
            .withSiteId(siteId)

            .withOutboundRouteId(outboundRouteId)

            .build();
  }

  /**
   * Get an outbound route
   * 
   * @param request The request object
   * @return OutboundRouteBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundRouteBase getTelephonyProvidersEdgesSiteOutboundroute(GetTelephonyProvidersEdgesSiteOutboundrouteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutboundRouteBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutboundRouteBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an outbound route
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundRouteBase> getTelephonyProvidersEdgesSiteOutboundroute(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutboundRouteBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutboundRouteBase> response = (ApiResponse<OutboundRouteBase>)(ApiResponse<?>)exception;
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
      ApiResponse<OutboundRouteBase> response = (ApiResponse<OutboundRouteBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get outbound routes
   * 
   * @param siteId Site ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param externalTrunkBasesIds externalTrunkBases.ids (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return OutboundRouteBaseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundRouteBaseEntityListing getTelephonyProvidersEdgesSiteOutboundroutes(String siteId, Integer pageSize, Integer pageNumber, String name, String externalTrunkBasesIds, String sortBy) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesSiteOutboundroutes(createGetTelephonyProvidersEdgesSiteOutboundroutesRequest(siteId, pageSize, pageNumber, name, externalTrunkBasesIds, sortBy));
  }

  /**
   * Get outbound routes
   * 
   * @param siteId Site ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @param externalTrunkBasesIds externalTrunkBases.ids (optional)
   * @param sortBy Sort by (optional, default to name)
   * @return OutboundRouteBaseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundRouteBaseEntityListing> getTelephonyProvidersEdgesSiteOutboundroutesWithHttpInfo(String siteId, Integer pageSize, Integer pageNumber, String name, String externalTrunkBasesIds, String sortBy) throws IOException {
    return getTelephonyProvidersEdgesSiteOutboundroutes(createGetTelephonyProvidersEdgesSiteOutboundroutesRequest(siteId, pageSize, pageNumber, name, externalTrunkBasesIds, sortBy).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesSiteOutboundroutesRequest createGetTelephonyProvidersEdgesSiteOutboundroutesRequest(String siteId, Integer pageSize, Integer pageNumber, String name, String externalTrunkBasesIds, String sortBy) {
    return GetTelephonyProvidersEdgesSiteOutboundroutesRequest.builder()
            .withSiteId(siteId)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withName(name)

            .withExternalTrunkBasesIds(externalTrunkBasesIds)

            .withSortBy(sortBy)

            .build();
  }

  /**
   * Get outbound routes
   * 
   * @param request The request object
   * @return OutboundRouteBaseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundRouteBaseEntityListing getTelephonyProvidersEdgesSiteOutboundroutes(GetTelephonyProvidersEdgesSiteOutboundroutesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutboundRouteBaseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutboundRouteBaseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get outbound routes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundRouteBaseEntityListing> getTelephonyProvidersEdgesSiteOutboundroutes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutboundRouteBaseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutboundRouteBaseEntityListing> response = (ApiResponse<OutboundRouteBaseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OutboundRouteBaseEntityListing> response = (ApiResponse<OutboundRouteBaseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get site connections for a site.
   * 
   * @param siteId Site ID (required)
   * @return SiteConnections
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SiteConnections getTelephonyProvidersEdgesSiteSiteconnections(String siteId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesSiteSiteconnections(createGetTelephonyProvidersEdgesSiteSiteconnectionsRequest(siteId));
  }

  /**
   * Get site connections for a site.
   * 
   * @param siteId Site ID (required)
   * @return SiteConnections
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SiteConnections> getTelephonyProvidersEdgesSiteSiteconnectionsWithHttpInfo(String siteId) throws IOException {
    return getTelephonyProvidersEdgesSiteSiteconnections(createGetTelephonyProvidersEdgesSiteSiteconnectionsRequest(siteId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesSiteSiteconnectionsRequest createGetTelephonyProvidersEdgesSiteSiteconnectionsRequest(String siteId) {
    return GetTelephonyProvidersEdgesSiteSiteconnectionsRequest.builder()
            .withSiteId(siteId)

            .build();
  }

  /**
   * Get site connections for a site.
   * 
   * @param request The request object
   * @return SiteConnections
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SiteConnections getTelephonyProvidersEdgesSiteSiteconnections(GetTelephonyProvidersEdgesSiteSiteconnectionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SiteConnections> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SiteConnections>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get site connections for a site.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SiteConnections> getTelephonyProvidersEdgesSiteSiteconnections(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SiteConnections>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SiteConnections> response = (ApiResponse<SiteConnections>)(ApiResponse<?>)exception;
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
      ApiResponse<SiteConnections> response = (ApiResponse<SiteConnections>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @return SiteEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SiteEntityListing getTelephonyProvidersEdgesSites(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, String locationId, Boolean managed, List<String> expand) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesSites(createGetTelephonyProvidersEdgesSitesRequest(pageSize, pageNumber, sortBy, sortOrder, name, locationId, managed, expand));
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
   * @param expand Fields to expand in the response, comma-separated (optional)
   * @return SiteEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SiteEntityListing> getTelephonyProvidersEdgesSitesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, String locationId, Boolean managed, List<String> expand) throws IOException {
    return getTelephonyProvidersEdgesSites(createGetTelephonyProvidersEdgesSitesRequest(pageSize, pageNumber, sortBy, sortOrder, name, locationId, managed, expand).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesSitesRequest createGetTelephonyProvidersEdgesSitesRequest(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, String locationId, Boolean managed, List<String> expand) {
    return GetTelephonyProvidersEdgesSitesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withName(name)

            .withLocationId(locationId)

            .withManaged(managed)

            .withExpand(expand)

            .build();
  }

  /**
   * Get the list of Sites.
   * 
   * @param request The request object
   * @return SiteEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SiteEntityListing getTelephonyProvidersEdgesSites(GetTelephonyProvidersEdgesSitesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SiteEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SiteEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of Sites.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SiteEntityListing> getTelephonyProvidersEdgesSites(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SiteEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SiteEntityListing> response = (ApiResponse<SiteEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SiteEntityListing> response = (ApiResponse<SiteEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Search sites using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return SitesSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SitesSearchResponse getTelephonyProvidersEdgesSitesSearch(String q64, List<String> expand) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesSitesSearch(createGetTelephonyProvidersEdgesSitesSearchRequest(q64, expand));
  }

  /**
   * Search sites using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return SitesSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SitesSearchResponse> getTelephonyProvidersEdgesSitesSearchWithHttpInfo(String q64, List<String> expand) throws IOException {
    return getTelephonyProvidersEdgesSitesSearch(createGetTelephonyProvidersEdgesSitesSearchRequest(q64, expand).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesSitesSearchRequest createGetTelephonyProvidersEdgesSitesSearchRequest(String q64, List<String> expand) {
    return GetTelephonyProvidersEdgesSitesSearchRequest.builder()
            .withQ64(q64)

            .withExpand(expand)

            .build();
  }

  /**
   * Search sites using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return SitesSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SitesSearchResponse getTelephonyProvidersEdgesSitesSearch(GetTelephonyProvidersEdgesSitesSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SitesSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SitesSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search sites using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SitesSearchResponse> getTelephonyProvidersEdgesSitesSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SitesSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SitesSearchResponse> response = (ApiResponse<SitesSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SitesSearchResponse> response = (ApiResponse<SitesSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @param pageSize Page size (optional, default to 1000)
   * @param pageNumber Page number (optional, default to 1)
   * @return TimeZoneEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeZoneEntityListing getTelephonyProvidersEdgesTimezones(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesTimezones(createGetTelephonyProvidersEdgesTimezonesRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @param pageSize Page size (optional, default to 1000)
   * @param pageNumber Page number (optional, default to 1)
   * @return TimeZoneEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeZoneEntityListing> getTelephonyProvidersEdgesTimezonesWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getTelephonyProvidersEdgesTimezones(createGetTelephonyProvidersEdgesTimezonesRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesTimezonesRequest createGetTelephonyProvidersEdgesTimezonesRequest(Integer pageSize, Integer pageNumber) {
    return GetTelephonyProvidersEdgesTimezonesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @param request The request object
   * @return TimeZoneEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeZoneEntityListing getTelephonyProvidersEdgesTimezones(GetTelephonyProvidersEdgesTimezonesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeZoneEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeZoneEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeZoneEntityListing> getTelephonyProvidersEdgesTimezones(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeZoneEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeZoneEntityListing> response = (ApiResponse<TimeZoneEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TimeZoneEntityListing> response = (ApiResponse<TimeZoneEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Trunk by ID
   * 
   * @param trunkId Trunk ID (required)
   * @return Trunk
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trunk getTelephonyProvidersEdgesTrunk(String trunkId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesTrunk(createGetTelephonyProvidersEdgesTrunkRequest(trunkId));
  }

  /**
   * Get a Trunk by ID
   * 
   * @param trunkId Trunk ID (required)
   * @return Trunk
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trunk> getTelephonyProvidersEdgesTrunkWithHttpInfo(String trunkId) throws IOException {
    return getTelephonyProvidersEdgesTrunk(createGetTelephonyProvidersEdgesTrunkRequest(trunkId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesTrunkRequest createGetTelephonyProvidersEdgesTrunkRequest(String trunkId) {
    return GetTelephonyProvidersEdgesTrunkRequest.builder()
            .withTrunkId(trunkId)

            .build();
  }

  /**
   * Get a Trunk by ID
   * 
   * @param request The request object
   * @return Trunk
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trunk getTelephonyProvidersEdgesTrunk(GetTelephonyProvidersEdgesTrunkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Trunk> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Trunk>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Trunk by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trunk> getTelephonyProvidersEdgesTrunk(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Trunk>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Trunk> response = (ApiResponse<Trunk>)(ApiResponse<?>)exception;
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
      ApiResponse<Trunk> response = (ApiResponse<Trunk>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the trunk metrics.
   * 
   * @param trunkId Trunk Id (required)
   * @return TrunkMetrics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkMetrics getTelephonyProvidersEdgesTrunkMetrics(String trunkId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesTrunkMetrics(createGetTelephonyProvidersEdgesTrunkMetricsRequest(trunkId));
  }

  /**
   * Get the trunk metrics.
   * 
   * @param trunkId Trunk Id (required)
   * @return TrunkMetrics
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkMetrics> getTelephonyProvidersEdgesTrunkMetricsWithHttpInfo(String trunkId) throws IOException {
    return getTelephonyProvidersEdgesTrunkMetrics(createGetTelephonyProvidersEdgesTrunkMetricsRequest(trunkId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesTrunkMetricsRequest createGetTelephonyProvidersEdgesTrunkMetricsRequest(String trunkId) {
    return GetTelephonyProvidersEdgesTrunkMetricsRequest.builder()
            .withTrunkId(trunkId)

            .build();
  }

  /**
   * Get the trunk metrics.
   * 
   * @param request The request object
   * @return TrunkMetrics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkMetrics getTelephonyProvidersEdgesTrunkMetrics(GetTelephonyProvidersEdgesTrunkMetricsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrunkMetrics> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrunkMetrics>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the trunk metrics.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkMetrics> getTelephonyProvidersEdgesTrunkMetrics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrunkMetrics>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrunkMetrics> response = (ApiResponse<TrunkMetrics>)(ApiResponse<?>)exception;
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
      ApiResponse<TrunkMetrics> response = (ApiResponse<TrunkMetrics>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Trunk Base Settings object by ID
   * Managed properties will not be returned unless the user is assigned the internal:trunk:edit permission.
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @param ignoreHidden Set this to true to not receive trunk properties that are meant to be hidden or for internal system usage only. (optional)
   * @return TrunkBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkBase getTelephonyProvidersEdgesTrunkbasesetting(String trunkBaseSettingsId, Boolean ignoreHidden) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesTrunkbasesetting(createGetTelephonyProvidersEdgesTrunkbasesettingRequest(trunkBaseSettingsId, ignoreHidden));
  }

  /**
   * Get a Trunk Base Settings object by ID
   * Managed properties will not be returned unless the user is assigned the internal:trunk:edit permission.
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @param ignoreHidden Set this to true to not receive trunk properties that are meant to be hidden or for internal system usage only. (optional)
   * @return TrunkBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettingWithHttpInfo(String trunkBaseSettingsId, Boolean ignoreHidden) throws IOException {
    return getTelephonyProvidersEdgesTrunkbasesetting(createGetTelephonyProvidersEdgesTrunkbasesettingRequest(trunkBaseSettingsId, ignoreHidden).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesTrunkbasesettingRequest createGetTelephonyProvidersEdgesTrunkbasesettingRequest(String trunkBaseSettingsId, Boolean ignoreHidden) {
    return GetTelephonyProvidersEdgesTrunkbasesettingRequest.builder()
            .withTrunkBaseSettingsId(trunkBaseSettingsId)

            .withIgnoreHidden(ignoreHidden)

            .build();
  }

  /**
   * Get a Trunk Base Settings object by ID
   * Managed properties will not be returned unless the user is assigned the internal:trunk:edit permission.
   * @param request The request object
   * @return TrunkBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkBase getTelephonyProvidersEdgesTrunkbasesetting(GetTelephonyProvidersEdgesTrunkbasesettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrunkBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrunkBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Trunk Base Settings object by ID
   * Managed properties will not be returned unless the user is assigned the internal:trunk:edit permission.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkBase> getTelephonyProvidersEdgesTrunkbasesetting(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrunkBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)exception;
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
      ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Trunk Base Settings listing
   * Managed properties will not be returned unless the user is assigned the internal:trunk:edit permission.
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkBaseEntityListing getTelephonyProvidersEdgesTrunkbasesettings(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, Boolean recordingEnabled, Boolean ignoreHidden, Boolean managed, List<String> expand, String name) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesTrunkbasesettings(createGetTelephonyProvidersEdgesTrunkbasesettingsRequest(pageNumber, pageSize, sortBy, sortOrder, recordingEnabled, ignoreHidden, managed, expand, name));
  }

  /**
   * Get Trunk Base Settings listing
   * Managed properties will not be returned unless the user is assigned the internal:trunk:edit permission.
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
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkBaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettingsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, Boolean recordingEnabled, Boolean ignoreHidden, Boolean managed, List<String> expand, String name) throws IOException {
    return getTelephonyProvidersEdgesTrunkbasesettings(createGetTelephonyProvidersEdgesTrunkbasesettingsRequest(pageNumber, pageSize, sortBy, sortOrder, recordingEnabled, ignoreHidden, managed, expand, name).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesTrunkbasesettingsRequest createGetTelephonyProvidersEdgesTrunkbasesettingsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, Boolean recordingEnabled, Boolean ignoreHidden, Boolean managed, List<String> expand, String name) {
    return GetTelephonyProvidersEdgesTrunkbasesettingsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withRecordingEnabled(recordingEnabled)

            .withIgnoreHidden(ignoreHidden)

            .withManaged(managed)

            .withExpand(expand)

            .withName(name)

            .build();
  }

  /**
   * Get Trunk Base Settings listing
   * Managed properties will not be returned unless the user is assigned the internal:trunk:edit permission.
   * @param request The request object
   * @return TrunkBaseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkBaseEntityListing getTelephonyProvidersEdgesTrunkbasesettings(GetTelephonyProvidersEdgesTrunkbasesettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrunkBaseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrunkBaseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Trunk Base Settings listing
   * Managed properties will not be returned unless the user is assigned the internal:trunk:edit permission.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkBaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrunkBaseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrunkBaseEntityListing> response = (ApiResponse<TrunkBaseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TrunkBaseEntityListing> response = (ApiResponse<TrunkBaseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @param type  (optional)
   * @param pageSize  (optional, default to 25)
   * @param pageNumber  (optional, default to 1)
   * @return TrunkMetabaseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkMetabaseEntityListing getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases(String type, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases(createGetTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesRequest(type, pageSize, pageNumber));
  }

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @param type  (optional)
   * @param pageSize  (optional, default to 25)
   * @param pageNumber  (optional, default to 1)
   * @return TrunkMetabaseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkMetabaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesWithHttpInfo(String type, Integer pageSize, Integer pageNumber) throws IOException {
    return getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases(createGetTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesRequest(type, pageSize, pageNumber).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesRequest createGetTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesRequest(String type, Integer pageSize, Integer pageNumber) {
    return GetTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesRequest.builder()
            .withType(type)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @param request The request object
   * @return TrunkMetabaseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkMetabaseEntityListing getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases(GetTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrunkMetabaseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrunkMetabaseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkMetabaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrunkMetabaseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrunkMetabaseEntityListing> response = (ApiResponse<TrunkMetabaseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TrunkMetabaseEntityListing> response = (ApiResponse<TrunkMetabaseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @param trunkMetabaseId The id of a metabase object upon which to base this Trunk Base Settings (required)
   * @return TrunkBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkBase getTelephonyProvidersEdgesTrunkbasesettingsTemplate(String trunkMetabaseId) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesTrunkbasesettingsTemplate(createGetTelephonyProvidersEdgesTrunkbasesettingsTemplateRequest(trunkMetabaseId));
  }

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @param trunkMetabaseId The id of a metabase object upon which to base this Trunk Base Settings (required)
   * @return TrunkBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettingsTemplateWithHttpInfo(String trunkMetabaseId) throws IOException {
    return getTelephonyProvidersEdgesTrunkbasesettingsTemplate(createGetTelephonyProvidersEdgesTrunkbasesettingsTemplateRequest(trunkMetabaseId).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesTrunkbasesettingsTemplateRequest createGetTelephonyProvidersEdgesTrunkbasesettingsTemplateRequest(String trunkMetabaseId) {
    return GetTelephonyProvidersEdgesTrunkbasesettingsTemplateRequest.builder()
            .withTrunkMetabaseId(trunkMetabaseId)

            .build();
  }

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @param request The request object
   * @return TrunkBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkBase getTelephonyProvidersEdgesTrunkbasesettingsTemplate(GetTelephonyProvidersEdgesTrunkbasesettingsTemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrunkBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrunkBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettingsTemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrunkBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)exception;
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
      ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkEntityListing getTelephonyProvidersEdgesTrunks(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String edgeId, String trunkBaseId, String trunkType) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesTrunks(createGetTelephonyProvidersEdgesTrunksRequest(pageNumber, pageSize, sortBy, sortOrder, edgeId, trunkBaseId, trunkType));
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
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkEntityListing> getTelephonyProvidersEdgesTrunksWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String edgeId, String trunkBaseId, String trunkType) throws IOException {
    return getTelephonyProvidersEdgesTrunks(createGetTelephonyProvidersEdgesTrunksRequest(pageNumber, pageSize, sortBy, sortOrder, edgeId, trunkBaseId, trunkType).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesTrunksRequest createGetTelephonyProvidersEdgesTrunksRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String edgeId, String trunkBaseId, String trunkType) {
    return GetTelephonyProvidersEdgesTrunksRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withEdgeId(edgeId)

            .withTrunkBaseId(trunkBaseId)

            .withTrunkType(trunkType)

            .build();
  }

  /**
   * Get the list of available trunks.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @param request The request object
   * @return TrunkEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkEntityListing getTelephonyProvidersEdgesTrunks(GetTelephonyProvidersEdgesTrunksRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrunkEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrunkEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of available trunks.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkEntityListing> getTelephonyProvidersEdgesTrunks(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrunkEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrunkEntityListing> response = (ApiResponse<TrunkEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TrunkEntityListing> response = (ApiResponse<TrunkEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the metrics for a list of trunks.
   * 
   * @param trunkIds Comma separated list of Trunk Id's (required)
   * @return List<TrunkMetrics>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<TrunkMetrics> getTelephonyProvidersEdgesTrunksMetrics(String trunkIds) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesTrunksMetrics(createGetTelephonyProvidersEdgesTrunksMetricsRequest(trunkIds));
  }

  /**
   * Get the metrics for a list of trunks.
   * 
   * @param trunkIds Comma separated list of Trunk Id's (required)
   * @return List<TrunkMetrics>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<TrunkMetrics>> getTelephonyProvidersEdgesTrunksMetricsWithHttpInfo(String trunkIds) throws IOException {
    return getTelephonyProvidersEdgesTrunksMetrics(createGetTelephonyProvidersEdgesTrunksMetricsRequest(trunkIds).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesTrunksMetricsRequest createGetTelephonyProvidersEdgesTrunksMetricsRequest(String trunkIds) {
    return GetTelephonyProvidersEdgesTrunksMetricsRequest.builder()
            .withTrunkIds(trunkIds)

            .build();
  }

  /**
   * Get the metrics for a list of trunks.
   * 
   * @param request The request object
   * @return List<TrunkMetrics>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<TrunkMetrics> getTelephonyProvidersEdgesTrunksMetrics(GetTelephonyProvidersEdgesTrunksMetricsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<TrunkMetrics>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<TrunkMetrics>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the metrics for a list of trunks.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<TrunkMetrics>> getTelephonyProvidersEdgesTrunksMetrics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<TrunkMetrics>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<TrunkMetrics>> response = (ApiResponse<List<TrunkMetrics>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<TrunkMetrics>> response = (ApiResponse<List<TrunkMetrics>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @param trunkType The type of this trunk base. (optional)
   * @return TrunkRecordingEnabledCount
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkRecordingEnabledCount getTelephonyProvidersEdgesTrunkswithrecording(String trunkType) throws IOException, ApiException {
    return  getTelephonyProvidersEdgesTrunkswithrecording(createGetTelephonyProvidersEdgesTrunkswithrecordingRequest(trunkType));
  }

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @param trunkType The type of this trunk base. (optional)
   * @return TrunkRecordingEnabledCount
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkRecordingEnabledCount> getTelephonyProvidersEdgesTrunkswithrecordingWithHttpInfo(String trunkType) throws IOException {
    return getTelephonyProvidersEdgesTrunkswithrecording(createGetTelephonyProvidersEdgesTrunkswithrecordingRequest(trunkType).withHttpInfo());
  }

  private GetTelephonyProvidersEdgesTrunkswithrecordingRequest createGetTelephonyProvidersEdgesTrunkswithrecordingRequest(String trunkType) {
    return GetTelephonyProvidersEdgesTrunkswithrecordingRequest.builder()
            .withTrunkType(trunkType)

            .build();
  }

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @param request The request object
   * @return TrunkRecordingEnabledCount
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkRecordingEnabledCount getTelephonyProvidersEdgesTrunkswithrecording(GetTelephonyProvidersEdgesTrunkswithrecordingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrunkRecordingEnabledCount> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrunkRecordingEnabledCount>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkRecordingEnabledCount> getTelephonyProvidersEdgesTrunkswithrecording(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrunkRecordingEnabledCount>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrunkRecordingEnabledCount> response = (ApiResponse<TrunkRecordingEnabledCount>)(ApiResponse<?>)exception;
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
      ApiResponse<TrunkRecordingEnabledCount> response = (ApiResponse<TrunkRecordingEnabledCount>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Disable site connections for a site.
   * 
   * @param siteId Site ID (required)
   * @param body Site (required)
   * @return SiteConnections
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SiteConnections patchTelephonyProvidersEdgesSiteSiteconnections(String siteId, DisableSiteConnectionsRequest body) throws IOException, ApiException {
    return  patchTelephonyProvidersEdgesSiteSiteconnections(createPatchTelephonyProvidersEdgesSiteSiteconnectionsRequest(siteId, body));
  }

  /**
   * Disable site connections for a site.
   * 
   * @param siteId Site ID (required)
   * @param body Site (required)
   * @return SiteConnections
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SiteConnections> patchTelephonyProvidersEdgesSiteSiteconnectionsWithHttpInfo(String siteId, DisableSiteConnectionsRequest body) throws IOException {
    return patchTelephonyProvidersEdgesSiteSiteconnections(createPatchTelephonyProvidersEdgesSiteSiteconnectionsRequest(siteId, body).withHttpInfo());
  }

  private PatchTelephonyProvidersEdgesSiteSiteconnectionsRequest createPatchTelephonyProvidersEdgesSiteSiteconnectionsRequest(String siteId, DisableSiteConnectionsRequest body) {
    return PatchTelephonyProvidersEdgesSiteSiteconnectionsRequest.builder()
            .withSiteId(siteId)

            .withBody(body)

            .build();
  }

  /**
   * Disable site connections for a site.
   * 
   * @param request The request object
   * @return SiteConnections
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SiteConnections patchTelephonyProvidersEdgesSiteSiteconnections(PatchTelephonyProvidersEdgesSiteSiteconnectionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SiteConnections> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SiteConnections>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Disable site connections for a site.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SiteConnections> patchTelephonyProvidersEdgesSiteSiteconnections(ApiRequest<DisableSiteConnectionsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SiteConnections>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SiteConnections> response = (ApiResponse<SiteConnections>)(ApiResponse<?>)exception;
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
      ApiResponse<SiteConnections> response = (ApiResponse<SiteConnections>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Nslookup request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @param body request payload to get network diagnostic (required)
   * @return EdgeNetworkDiagnostic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnostic postTelephonyProvidersEdgeDiagnosticNslookup(String edgeId, EdgeNetworkDiagnosticRequest body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgeDiagnosticNslookup(createPostTelephonyProvidersEdgeDiagnosticNslookupRequest(edgeId, body));
  }

  /**
   * Nslookup request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @param body request payload to get network diagnostic (required)
   * @return EdgeNetworkDiagnostic
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnostic> postTelephonyProvidersEdgeDiagnosticNslookupWithHttpInfo(String edgeId, EdgeNetworkDiagnosticRequest body) throws IOException {
    return postTelephonyProvidersEdgeDiagnosticNslookup(createPostTelephonyProvidersEdgeDiagnosticNslookupRequest(edgeId, body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgeDiagnosticNslookupRequest createPostTelephonyProvidersEdgeDiagnosticNslookupRequest(String edgeId, EdgeNetworkDiagnosticRequest body) {
    return PostTelephonyProvidersEdgeDiagnosticNslookupRequest.builder()
            .withEdgeId(edgeId)

            .withBody(body)

            .build();
  }

  /**
   * Nslookup request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return EdgeNetworkDiagnostic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnostic postTelephonyProvidersEdgeDiagnosticNslookup(PostTelephonyProvidersEdgeDiagnosticNslookupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeNetworkDiagnostic> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeNetworkDiagnostic>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Nslookup request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnostic> postTelephonyProvidersEdgeDiagnosticNslookup(ApiRequest<EdgeNetworkDiagnosticRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeNetworkDiagnostic>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeNetworkDiagnostic> response = (ApiResponse<EdgeNetworkDiagnostic>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeNetworkDiagnostic> response = (ApiResponse<EdgeNetworkDiagnostic>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Ping Request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @param body request payload to get network diagnostic (required)
   * @return EdgeNetworkDiagnostic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnostic postTelephonyProvidersEdgeDiagnosticPing(String edgeId, EdgeNetworkDiagnosticRequest body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgeDiagnosticPing(createPostTelephonyProvidersEdgeDiagnosticPingRequest(edgeId, body));
  }

  /**
   * Ping Request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @param body request payload to get network diagnostic (required)
   * @return EdgeNetworkDiagnostic
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnostic> postTelephonyProvidersEdgeDiagnosticPingWithHttpInfo(String edgeId, EdgeNetworkDiagnosticRequest body) throws IOException {
    return postTelephonyProvidersEdgeDiagnosticPing(createPostTelephonyProvidersEdgeDiagnosticPingRequest(edgeId, body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgeDiagnosticPingRequest createPostTelephonyProvidersEdgeDiagnosticPingRequest(String edgeId, EdgeNetworkDiagnosticRequest body) {
    return PostTelephonyProvidersEdgeDiagnosticPingRequest.builder()
            .withEdgeId(edgeId)

            .withBody(body)

            .build();
  }

  /**
   * Ping Request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return EdgeNetworkDiagnostic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnostic postTelephonyProvidersEdgeDiagnosticPing(PostTelephonyProvidersEdgeDiagnosticPingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeNetworkDiagnostic> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeNetworkDiagnostic>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Ping Request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnostic> postTelephonyProvidersEdgeDiagnosticPing(ApiRequest<EdgeNetworkDiagnosticRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeNetworkDiagnostic>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeNetworkDiagnostic> response = (ApiResponse<EdgeNetworkDiagnostic>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeNetworkDiagnostic> response = (ApiResponse<EdgeNetworkDiagnostic>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Route request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @param body request payload to get network diagnostic (required)
   * @return EdgeNetworkDiagnostic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnostic postTelephonyProvidersEdgeDiagnosticRoute(String edgeId, EdgeNetworkDiagnosticRequest body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgeDiagnosticRoute(createPostTelephonyProvidersEdgeDiagnosticRouteRequest(edgeId, body));
  }

  /**
   * Route request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @param body request payload to get network diagnostic (required)
   * @return EdgeNetworkDiagnostic
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnostic> postTelephonyProvidersEdgeDiagnosticRouteWithHttpInfo(String edgeId, EdgeNetworkDiagnosticRequest body) throws IOException {
    return postTelephonyProvidersEdgeDiagnosticRoute(createPostTelephonyProvidersEdgeDiagnosticRouteRequest(edgeId, body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgeDiagnosticRouteRequest createPostTelephonyProvidersEdgeDiagnosticRouteRequest(String edgeId, EdgeNetworkDiagnosticRequest body) {
    return PostTelephonyProvidersEdgeDiagnosticRouteRequest.builder()
            .withEdgeId(edgeId)

            .withBody(body)

            .build();
  }

  /**
   * Route request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return EdgeNetworkDiagnostic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnostic postTelephonyProvidersEdgeDiagnosticRoute(PostTelephonyProvidersEdgeDiagnosticRouteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeNetworkDiagnostic> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeNetworkDiagnostic>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Route request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnostic> postTelephonyProvidersEdgeDiagnosticRoute(ApiRequest<EdgeNetworkDiagnosticRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeNetworkDiagnostic>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeNetworkDiagnostic> response = (ApiResponse<EdgeNetworkDiagnostic>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeNetworkDiagnostic> response = (ApiResponse<EdgeNetworkDiagnostic>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Tracepath request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @param body request payload to get network diagnostic (required)
   * @return EdgeNetworkDiagnostic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnostic postTelephonyProvidersEdgeDiagnosticTracepath(String edgeId, EdgeNetworkDiagnosticRequest body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgeDiagnosticTracepath(createPostTelephonyProvidersEdgeDiagnosticTracepathRequest(edgeId, body));
  }

  /**
   * Tracepath request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param edgeId Edge Id (required)
   * @param body request payload to get network diagnostic (required)
   * @return EdgeNetworkDiagnostic
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnostic> postTelephonyProvidersEdgeDiagnosticTracepathWithHttpInfo(String edgeId, EdgeNetworkDiagnosticRequest body) throws IOException {
    return postTelephonyProvidersEdgeDiagnosticTracepath(createPostTelephonyProvidersEdgeDiagnosticTracepathRequest(edgeId, body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgeDiagnosticTracepathRequest createPostTelephonyProvidersEdgeDiagnosticTracepathRequest(String edgeId, EdgeNetworkDiagnosticRequest body) {
    return PostTelephonyProvidersEdgeDiagnosticTracepathRequest.builder()
            .withEdgeId(edgeId)

            .withBody(body)

            .build();
  }

  /**
   * Tracepath request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return EdgeNetworkDiagnostic
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeNetworkDiagnostic postTelephonyProvidersEdgeDiagnosticTracepath(PostTelephonyProvidersEdgeDiagnosticTracepathRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeNetworkDiagnostic> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeNetworkDiagnostic>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Tracepath request command to collect networking-related information from an Edge for a target IP or host.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeNetworkDiagnostic> postTelephonyProvidersEdgeDiagnosticTracepath(ApiRequest<EdgeNetworkDiagnosticRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeNetworkDiagnostic>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeNetworkDiagnostic> response = (ApiResponse<EdgeNetworkDiagnostic>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeNetworkDiagnostic> response = (ApiResponse<EdgeNetworkDiagnostic>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an edge logical interface.
   * Create
   * @param edgeId Edge ID (required)
   * @param body Logical interface (required)
   * @return DomainLogicalInterface
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainLogicalInterface postTelephonyProvidersEdgeLogicalinterfaces(String edgeId, DomainLogicalInterface body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgeLogicalinterfaces(createPostTelephonyProvidersEdgeLogicalinterfacesRequest(edgeId, body));
  }

  /**
   * Create an edge logical interface.
   * Create
   * @param edgeId Edge ID (required)
   * @param body Logical interface (required)
   * @return DomainLogicalInterface
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainLogicalInterface> postTelephonyProvidersEdgeLogicalinterfacesWithHttpInfo(String edgeId, DomainLogicalInterface body) throws IOException {
    return postTelephonyProvidersEdgeLogicalinterfaces(createPostTelephonyProvidersEdgeLogicalinterfacesRequest(edgeId, body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgeLogicalinterfacesRequest createPostTelephonyProvidersEdgeLogicalinterfacesRequest(String edgeId, DomainLogicalInterface body) {
    return PostTelephonyProvidersEdgeLogicalinterfacesRequest.builder()
            .withEdgeId(edgeId)

            .withBody(body)

            .build();
  }

  /**
   * Create an edge logical interface.
   * Create
   * @param request The request object
   * @return DomainLogicalInterface
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainLogicalInterface postTelephonyProvidersEdgeLogicalinterfaces(PostTelephonyProvidersEdgeLogicalinterfacesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainLogicalInterface> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainLogicalInterface>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an edge logical interface.
   * Create
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainLogicalInterface> postTelephonyProvidersEdgeLogicalinterfaces(ApiRequest<DomainLogicalInterface> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainLogicalInterface>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainLogicalInterface> response = (ApiResponse<DomainLogicalInterface>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainLogicalInterface> response = (ApiResponse<DomainLogicalInterface>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @param edgeId Edge ID (required)
   * @param jobId Job ID (required)
   * @param body Log upload request (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postTelephonyProvidersEdgeLogsJobUpload(String edgeId, String jobId, EdgeLogsJobUploadRequest body) throws IOException, ApiException {
     postTelephonyProvidersEdgeLogsJobUpload(createPostTelephonyProvidersEdgeLogsJobUploadRequest(edgeId, jobId, body));
  }

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @param edgeId Edge ID (required)
   * @param jobId Job ID (required)
   * @param body Log upload request (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postTelephonyProvidersEdgeLogsJobUploadWithHttpInfo(String edgeId, String jobId, EdgeLogsJobUploadRequest body) throws IOException {
    return postTelephonyProvidersEdgeLogsJobUpload(createPostTelephonyProvidersEdgeLogsJobUploadRequest(edgeId, jobId, body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgeLogsJobUploadRequest createPostTelephonyProvidersEdgeLogsJobUploadRequest(String edgeId, String jobId, EdgeLogsJobUploadRequest body) {
    return PostTelephonyProvidersEdgeLogsJobUploadRequest.builder()
            .withEdgeId(edgeId)

            .withJobId(jobId)

            .withBody(body)

            .build();
  }

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postTelephonyProvidersEdgeLogsJobUpload(PostTelephonyProvidersEdgeLogsJobUploadRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postTelephonyProvidersEdgeLogsJobUpload(ApiRequest<EdgeLogsJobUploadRequest> request) throws IOException {
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
   * Create a job to upload a list of Edge logs.
   * 
   * @param edgeId Edge ID (required)
   * @param body EdgeLogsJobRequest (required)
   * @return EdgeLogsJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeLogsJobResponse postTelephonyProvidersEdgeLogsJobs(String edgeId, EdgeLogsJobRequest body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgeLogsJobs(createPostTelephonyProvidersEdgeLogsJobsRequest(edgeId, body));
  }

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @param edgeId Edge ID (required)
   * @param body EdgeLogsJobRequest (required)
   * @return EdgeLogsJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeLogsJobResponse> postTelephonyProvidersEdgeLogsJobsWithHttpInfo(String edgeId, EdgeLogsJobRequest body) throws IOException {
    return postTelephonyProvidersEdgeLogsJobs(createPostTelephonyProvidersEdgeLogsJobsRequest(edgeId, body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgeLogsJobsRequest createPostTelephonyProvidersEdgeLogsJobsRequest(String edgeId, EdgeLogsJobRequest body) {
    return PostTelephonyProvidersEdgeLogsJobsRequest.builder()
            .withEdgeId(edgeId)

            .withBody(body)

            .build();
  }

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @param request The request object
   * @return EdgeLogsJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeLogsJobResponse postTelephonyProvidersEdgeLogsJobs(PostTelephonyProvidersEdgeLogsJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeLogsJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeLogsJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeLogsJobResponse> postTelephonyProvidersEdgeLogsJobs(ApiRequest<EdgeLogsJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeLogsJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeLogsJobResponse> response = (ApiResponse<EdgeLogsJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeLogsJobResponse> response = (ApiResponse<EdgeLogsJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Reboot an Edge
   * 
   * @param edgeId Edge ID (required)
   * @param body Parameters for the edge reboot (optional)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String postTelephonyProvidersEdgeReboot(String edgeId, EdgeRebootParameters body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgeReboot(createPostTelephonyProvidersEdgeRebootRequest(edgeId, body));
  }

  /**
   * Reboot an Edge
   * 
   * @param edgeId Edge ID (required)
   * @param body Parameters for the edge reboot (optional)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> postTelephonyProvidersEdgeRebootWithHttpInfo(String edgeId, EdgeRebootParameters body) throws IOException {
    return postTelephonyProvidersEdgeReboot(createPostTelephonyProvidersEdgeRebootRequest(edgeId, body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgeRebootRequest createPostTelephonyProvidersEdgeRebootRequest(String edgeId, EdgeRebootParameters body) {
    return PostTelephonyProvidersEdgeRebootRequest.builder()
            .withEdgeId(edgeId)

            .withBody(body)

            .build();
  }

  /**
   * Reboot an Edge
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String postTelephonyProvidersEdgeReboot(PostTelephonyProvidersEdgeRebootRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Reboot an Edge
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> postTelephonyProvidersEdgeReboot(ApiRequest<EdgeRebootParameters> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
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
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Starts a software update for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @param body Software update request (required)
   * @return DomainEdgeSoftwareUpdateDto
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEdgeSoftwareUpdateDto postTelephonyProvidersEdgeSoftwareupdate(String edgeId, DomainEdgeSoftwareUpdateDto body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgeSoftwareupdate(createPostTelephonyProvidersEdgeSoftwareupdateRequest(edgeId, body));
  }

  /**
   * Starts a software update for this edge.
   * 
   * @param edgeId Edge ID (required)
   * @param body Software update request (required)
   * @return DomainEdgeSoftwareUpdateDto
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEdgeSoftwareUpdateDto> postTelephonyProvidersEdgeSoftwareupdateWithHttpInfo(String edgeId, DomainEdgeSoftwareUpdateDto body) throws IOException {
    return postTelephonyProvidersEdgeSoftwareupdate(createPostTelephonyProvidersEdgeSoftwareupdateRequest(edgeId, body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgeSoftwareupdateRequest createPostTelephonyProvidersEdgeSoftwareupdateRequest(String edgeId, DomainEdgeSoftwareUpdateDto body) {
    return PostTelephonyProvidersEdgeSoftwareupdateRequest.builder()
            .withEdgeId(edgeId)

            .withBody(body)

            .build();
  }

  /**
   * Starts a software update for this edge.
   * 
   * @param request The request object
   * @return DomainEdgeSoftwareUpdateDto
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEdgeSoftwareUpdateDto postTelephonyProvidersEdgeSoftwareupdate(PostTelephonyProvidersEdgeSoftwareupdateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainEdgeSoftwareUpdateDto> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainEdgeSoftwareUpdateDto>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Starts a software update for this edge.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEdgeSoftwareUpdateDto> postTelephonyProvidersEdgeSoftwareupdate(ApiRequest<DomainEdgeSoftwareUpdateDto> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainEdgeSoftwareUpdateDto>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainEdgeSoftwareUpdateDto> response = (ApiResponse<DomainEdgeSoftwareUpdateDto>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainEdgeSoftwareUpdateDto> response = (ApiResponse<DomainEdgeSoftwareUpdateDto>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Take an Edge in or out of service
   * 
   * @param edgeId Edge ID (required)
   * @param body Edge Service State (optional)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String postTelephonyProvidersEdgeStatuscode(String edgeId, EdgeServiceStateRequest body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgeStatuscode(createPostTelephonyProvidersEdgeStatuscodeRequest(edgeId, body));
  }

  /**
   * Take an Edge in or out of service
   * 
   * @param edgeId Edge ID (required)
   * @param body Edge Service State (optional)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> postTelephonyProvidersEdgeStatuscodeWithHttpInfo(String edgeId, EdgeServiceStateRequest body) throws IOException {
    return postTelephonyProvidersEdgeStatuscode(createPostTelephonyProvidersEdgeStatuscodeRequest(edgeId, body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgeStatuscodeRequest createPostTelephonyProvidersEdgeStatuscodeRequest(String edgeId, EdgeServiceStateRequest body) {
    return PostTelephonyProvidersEdgeStatuscodeRequest.builder()
            .withEdgeId(edgeId)

            .withBody(body)

            .build();
  }

  /**
   * Take an Edge in or out of service
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String postTelephonyProvidersEdgeStatuscode(PostTelephonyProvidersEdgeStatuscodeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Take an Edge in or out of service
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> postTelephonyProvidersEdgeStatuscode(ApiRequest<EdgeServiceStateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
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
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Unpair an Edge
   * 
   * @param edgeId Edge Id (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String postTelephonyProvidersEdgeUnpair(String edgeId) throws IOException, ApiException {
    return  postTelephonyProvidersEdgeUnpair(createPostTelephonyProvidersEdgeUnpairRequest(edgeId));
  }

  /**
   * Unpair an Edge
   * 
   * @param edgeId Edge Id (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> postTelephonyProvidersEdgeUnpairWithHttpInfo(String edgeId) throws IOException {
    return postTelephonyProvidersEdgeUnpair(createPostTelephonyProvidersEdgeUnpairRequest(edgeId).withHttpInfo());
  }

  private PostTelephonyProvidersEdgeUnpairRequest createPostTelephonyProvidersEdgeUnpairRequest(String edgeId) {
    return PostTelephonyProvidersEdgeUnpairRequest.builder()
            .withEdgeId(edgeId)

            .build();
  }

  /**
   * Unpair an Edge
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String postTelephonyProvidersEdgeUnpair(PostTelephonyProvidersEdgeUnpairRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Unpair an Edge
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> postTelephonyProvidersEdgeUnpair(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
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
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an edge.
   * 
   * @param body Edge (required)
   * @return Edge
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Edge postTelephonyProvidersEdges(Edge body) throws IOException, ApiException {
    return  postTelephonyProvidersEdges(createPostTelephonyProvidersEdgesRequest(body));
  }

  /**
   * Create an edge.
   * 
   * @param body Edge (required)
   * @return Edge
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Edge> postTelephonyProvidersEdgesWithHttpInfo(Edge body) throws IOException {
    return postTelephonyProvidersEdges(createPostTelephonyProvidersEdgesRequest(body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesRequest createPostTelephonyProvidersEdgesRequest(Edge body) {
    return PostTelephonyProvidersEdgesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create an edge.
   * 
   * @param request The request object
   * @return Edge
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Edge postTelephonyProvidersEdges(PostTelephonyProvidersEdgesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Edge> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Edge>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an edge.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Edge> postTelephonyProvidersEdges(ApiRequest<Edge> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Edge>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Edge> response = (ApiResponse<Edge>)(ApiResponse<?>)exception;
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
      ApiResponse<Edge> response = (ApiResponse<Edge>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Validates a street address
   * 
   * @param body Address (required)
   * @return ValidateAddressResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ValidateAddressResponse postTelephonyProvidersEdgesAddressvalidation(ValidateAddressRequest body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgesAddressvalidation(createPostTelephonyProvidersEdgesAddressvalidationRequest(body));
  }

  /**
   * Validates a street address
   * 
   * @param body Address (required)
   * @return ValidateAddressResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ValidateAddressResponse> postTelephonyProvidersEdgesAddressvalidationWithHttpInfo(ValidateAddressRequest body) throws IOException {
    return postTelephonyProvidersEdgesAddressvalidation(createPostTelephonyProvidersEdgesAddressvalidationRequest(body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesAddressvalidationRequest createPostTelephonyProvidersEdgesAddressvalidationRequest(ValidateAddressRequest body) {
    return PostTelephonyProvidersEdgesAddressvalidationRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Validates a street address
   * 
   * @param request The request object
   * @return ValidateAddressResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ValidateAddressResponse postTelephonyProvidersEdgesAddressvalidation(PostTelephonyProvidersEdgesAddressvalidationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ValidateAddressResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ValidateAddressResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Validates a street address
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ValidateAddressResponse> postTelephonyProvidersEdgesAddressvalidation(ApiRequest<ValidateAddressRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ValidateAddressResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ValidateAddressResponse> response = (ApiResponse<ValidateAddressResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ValidateAddressResponse> response = (ApiResponse<ValidateAddressResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a certificate authority.
   * 
   * @param body CertificateAuthority (required)
   * @return DomainCertificateAuthority
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainCertificateAuthority postTelephonyProvidersEdgesCertificateauthorities(DomainCertificateAuthority body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgesCertificateauthorities(createPostTelephonyProvidersEdgesCertificateauthoritiesRequest(body));
  }

  /**
   * Create a certificate authority.
   * 
   * @param body CertificateAuthority (required)
   * @return DomainCertificateAuthority
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainCertificateAuthority> postTelephonyProvidersEdgesCertificateauthoritiesWithHttpInfo(DomainCertificateAuthority body) throws IOException {
    return postTelephonyProvidersEdgesCertificateauthorities(createPostTelephonyProvidersEdgesCertificateauthoritiesRequest(body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesCertificateauthoritiesRequest createPostTelephonyProvidersEdgesCertificateauthoritiesRequest(DomainCertificateAuthority body) {
    return PostTelephonyProvidersEdgesCertificateauthoritiesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a certificate authority.
   * 
   * @param request The request object
   * @return DomainCertificateAuthority
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainCertificateAuthority postTelephonyProvidersEdgesCertificateauthorities(PostTelephonyProvidersEdgesCertificateauthoritiesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainCertificateAuthority> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainCertificateAuthority>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a certificate authority.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainCertificateAuthority> postTelephonyProvidersEdgesCertificateauthorities(ApiRequest<DomainCertificateAuthority> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainCertificateAuthority>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainCertificateAuthority> response = (ApiResponse<DomainCertificateAuthority>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainCertificateAuthority> response = (ApiResponse<DomainCertificateAuthority>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new DID pool
   * 
   * @param body DID pool (required)
   * @return DIDPool
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DIDPool postTelephonyProvidersEdgesDidpools(DIDPool body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgesDidpools(createPostTelephonyProvidersEdgesDidpoolsRequest(body));
  }

  /**
   * Create a new DID pool
   * 
   * @param body DID pool (required)
   * @return DIDPool
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DIDPool> postTelephonyProvidersEdgesDidpoolsWithHttpInfo(DIDPool body) throws IOException {
    return postTelephonyProvidersEdgesDidpools(createPostTelephonyProvidersEdgesDidpoolsRequest(body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesDidpoolsRequest createPostTelephonyProvidersEdgesDidpoolsRequest(DIDPool body) {
    return PostTelephonyProvidersEdgesDidpoolsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new DID pool
   * 
   * @param request The request object
   * @return DIDPool
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DIDPool postTelephonyProvidersEdgesDidpools(PostTelephonyProvidersEdgesDidpoolsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DIDPool> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DIDPool>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new DID pool
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DIDPool> postTelephonyProvidersEdgesDidpools(ApiRequest<DIDPool> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DIDPool>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DIDPool> response = (ApiResponse<DIDPool>)(ApiResponse<?>)exception;
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
      ApiResponse<DIDPool> response = (ApiResponse<DIDPool>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an edge group.
   * 
   * @param body EdgeGroup (required)
   * @return EdgeGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeGroup postTelephonyProvidersEdgesEdgegroups(EdgeGroup body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgesEdgegroups(createPostTelephonyProvidersEdgesEdgegroupsRequest(body));
  }

  /**
   * Create an edge group.
   * 
   * @param body EdgeGroup (required)
   * @return EdgeGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeGroup> postTelephonyProvidersEdgesEdgegroupsWithHttpInfo(EdgeGroup body) throws IOException {
    return postTelephonyProvidersEdgesEdgegroups(createPostTelephonyProvidersEdgesEdgegroupsRequest(body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesEdgegroupsRequest createPostTelephonyProvidersEdgesEdgegroupsRequest(EdgeGroup body) {
    return PostTelephonyProvidersEdgesEdgegroupsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create an edge group.
   * 
   * @param request The request object
   * @return EdgeGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeGroup postTelephonyProvidersEdgesEdgegroups(PostTelephonyProvidersEdgesEdgegroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an edge group.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeGroup> postTelephonyProvidersEdgesEdgegroups(ApiRequest<EdgeGroup> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeGroup> response = (ApiResponse<EdgeGroup>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeGroup> response = (ApiResponse<EdgeGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new extension pool
   * 
   * @param body ExtensionPool (required)
   * @return ExtensionPool
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExtensionPool postTelephonyProvidersEdgesExtensionpools(ExtensionPool body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgesExtensionpools(createPostTelephonyProvidersEdgesExtensionpoolsRequest(body));
  }

  /**
   * Create a new extension pool
   * 
   * @param body ExtensionPool (required)
   * @return ExtensionPool
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExtensionPool> postTelephonyProvidersEdgesExtensionpoolsWithHttpInfo(ExtensionPool body) throws IOException {
    return postTelephonyProvidersEdgesExtensionpools(createPostTelephonyProvidersEdgesExtensionpoolsRequest(body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesExtensionpoolsRequest createPostTelephonyProvidersEdgesExtensionpoolsRequest(ExtensionPool body) {
    return PostTelephonyProvidersEdgesExtensionpoolsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new extension pool
   * 
   * @param request The request object
   * @return ExtensionPool
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExtensionPool postTelephonyProvidersEdgesExtensionpools(PostTelephonyProvidersEdgesExtensionpoolsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExtensionPool> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExtensionPool>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new extension pool
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExtensionPool> postTelephonyProvidersEdgesExtensionpools(ApiRequest<ExtensionPool> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExtensionPool>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExtensionPool> response = (ApiResponse<ExtensionPool>)(ApiResponse<?>)exception;
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
      ApiResponse<ExtensionPool> response = (ApiResponse<ExtensionPool>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Post media endpoint statistics event.
   * 
   * postTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresource is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param conversationId Identifier of the conversation (required)
   * @param communicationId Identifier of the media session (required)
   * @param mediaResourceId Identifier of the media resource of the endpoint (required)
   * @param body MediaStatisticsPostRequest (required)
   * @return MediaStatistics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MediaStatistics postTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresource(String conversationId, String communicationId, String mediaResourceId, MediaStatisticsPostRequest body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresource(createPostTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresourceRequest(conversationId, communicationId, mediaResourceId, body));
  }

  /**
   * Post media endpoint statistics event.
   * 
   * postTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresource is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param conversationId Identifier of the conversation (required)
   * @param communicationId Identifier of the media session (required)
   * @param mediaResourceId Identifier of the media resource of the endpoint (required)
   * @param body MediaStatisticsPostRequest (required)
   * @return MediaStatistics
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MediaStatistics> postTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresourceWithHttpInfo(String conversationId, String communicationId, String mediaResourceId, MediaStatisticsPostRequest body) throws IOException {
    return postTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresource(createPostTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresourceRequest(conversationId, communicationId, mediaResourceId, body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresourceRequest createPostTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresourceRequest(String conversationId, String communicationId, String mediaResourceId, MediaStatisticsPostRequest body) {
    return PostTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresourceRequest.builder()
            .withConversationId(conversationId)

            .withCommunicationId(communicationId)

            .withMediaResourceId(mediaResourceId)

            .withBody(body)

            .build();
  }

  /**
   * Post media endpoint statistics event.
   * 
   * postTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresource is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return MediaStatistics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MediaStatistics postTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresource(PostTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MediaStatistics> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MediaStatistics>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Post media endpoint statistics event.
   * 
   * postTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresource is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MediaStatistics> postTelephonyProvidersEdgesMediastatisticsConversationCommunicationMediaresource(ApiRequest<MediaStatisticsPostRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MediaStatistics>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MediaStatistics> response = (ApiResponse<MediaStatistics>)(ApiResponse<?>)exception;
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
      ApiResponse<MediaStatistics> response = (ApiResponse<MediaStatistics>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Reboot a Phone
   * 
   * @param phoneId Phone Id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postTelephonyProvidersEdgesPhoneReboot(String phoneId) throws IOException, ApiException {
     postTelephonyProvidersEdgesPhoneReboot(createPostTelephonyProvidersEdgesPhoneRebootRequest(phoneId));
  }

  /**
   * Reboot a Phone
   * 
   * @param phoneId Phone Id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postTelephonyProvidersEdgesPhoneRebootWithHttpInfo(String phoneId) throws IOException {
    return postTelephonyProvidersEdgesPhoneReboot(createPostTelephonyProvidersEdgesPhoneRebootRequest(phoneId).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesPhoneRebootRequest createPostTelephonyProvidersEdgesPhoneRebootRequest(String phoneId) {
    return PostTelephonyProvidersEdgesPhoneRebootRequest.builder()
            .withPhoneId(phoneId)

            .build();
  }

  /**
   * Reboot a Phone
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postTelephonyProvidersEdgesPhoneReboot(PostTelephonyProvidersEdgesPhoneRebootRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Reboot a Phone
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postTelephonyProvidersEdgesPhoneReboot(ApiRequest<Void> request) throws IOException {
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
   * Create a new Phone Base Settings object
   * 
   * @param body Phone base settings (required)
   * @return PhoneBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneBase postTelephonyProvidersEdgesPhonebasesettings(PhoneBase body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgesPhonebasesettings(createPostTelephonyProvidersEdgesPhonebasesettingsRequest(body));
  }

  /**
   * Create a new Phone Base Settings object
   * 
   * @param body Phone base settings (required)
   * @return PhoneBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneBase> postTelephonyProvidersEdgesPhonebasesettingsWithHttpInfo(PhoneBase body) throws IOException {
    return postTelephonyProvidersEdgesPhonebasesettings(createPostTelephonyProvidersEdgesPhonebasesettingsRequest(body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesPhonebasesettingsRequest createPostTelephonyProvidersEdgesPhonebasesettingsRequest(PhoneBase body) {
    return PostTelephonyProvidersEdgesPhonebasesettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new Phone Base Settings object
   * 
   * @param request The request object
   * @return PhoneBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneBase postTelephonyProvidersEdgesPhonebasesettings(PostTelephonyProvidersEdgesPhonebasesettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PhoneBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PhoneBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new Phone Base Settings object
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneBase> postTelephonyProvidersEdgesPhonebasesettings(ApiRequest<PhoneBase> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PhoneBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)exception;
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
      ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new Phone
   * 
   * @param body Phone (required)
   * @return Phone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Phone postTelephonyProvidersEdgesPhones(Phone body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgesPhones(createPostTelephonyProvidersEdgesPhonesRequest(body));
  }

  /**
   * Create a new Phone
   * 
   * @param body Phone (required)
   * @return Phone
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Phone> postTelephonyProvidersEdgesPhonesWithHttpInfo(Phone body) throws IOException {
    return postTelephonyProvidersEdgesPhones(createPostTelephonyProvidersEdgesPhonesRequest(body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesPhonesRequest createPostTelephonyProvidersEdgesPhonesRequest(Phone body) {
    return PostTelephonyProvidersEdgesPhonesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new Phone
   * 
   * @param request The request object
   * @return Phone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Phone postTelephonyProvidersEdgesPhones(PostTelephonyProvidersEdgesPhonesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Phone> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Phone>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new Phone
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Phone> postTelephonyProvidersEdgesPhones(ApiRequest<Phone> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Phone>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)exception;
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
      ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Reboot Multiple Phones
   * 
   * @param body Phones (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postTelephonyProvidersEdgesPhonesReboot(PhonesReboot body) throws IOException, ApiException {
     postTelephonyProvidersEdgesPhonesReboot(createPostTelephonyProvidersEdgesPhonesRebootRequest(body));
  }

  /**
   * Reboot Multiple Phones
   * 
   * @param body Phones (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postTelephonyProvidersEdgesPhonesRebootWithHttpInfo(PhonesReboot body) throws IOException {
    return postTelephonyProvidersEdgesPhonesReboot(createPostTelephonyProvidersEdgesPhonesRebootRequest(body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesPhonesRebootRequest createPostTelephonyProvidersEdgesPhonesRebootRequest(PhonesReboot body) {
    return PostTelephonyProvidersEdgesPhonesRebootRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Reboot Multiple Phones
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postTelephonyProvidersEdgesPhonesReboot(PostTelephonyProvidersEdgesPhonesRebootRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Reboot Multiple Phones
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postTelephonyProvidersEdgesPhonesReboot(ApiRequest<PhonesReboot> request) throws IOException {
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
   * Create outbound route
   * 
   * @param siteId Site ID (required)
   * @param body OutboundRoute (required)
   * @return OutboundRouteBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundRouteBase postTelephonyProvidersEdgesSiteOutboundroutes(String siteId, OutboundRouteBase body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgesSiteOutboundroutes(createPostTelephonyProvidersEdgesSiteOutboundroutesRequest(siteId, body));
  }

  /**
   * Create outbound route
   * 
   * @param siteId Site ID (required)
   * @param body OutboundRoute (required)
   * @return OutboundRouteBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundRouteBase> postTelephonyProvidersEdgesSiteOutboundroutesWithHttpInfo(String siteId, OutboundRouteBase body) throws IOException {
    return postTelephonyProvidersEdgesSiteOutboundroutes(createPostTelephonyProvidersEdgesSiteOutboundroutesRequest(siteId, body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesSiteOutboundroutesRequest createPostTelephonyProvidersEdgesSiteOutboundroutesRequest(String siteId, OutboundRouteBase body) {
    return PostTelephonyProvidersEdgesSiteOutboundroutesRequest.builder()
            .withSiteId(siteId)

            .withBody(body)

            .build();
  }

  /**
   * Create outbound route
   * 
   * @param request The request object
   * @return OutboundRouteBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundRouteBase postTelephonyProvidersEdgesSiteOutboundroutes(PostTelephonyProvidersEdgesSiteOutboundroutesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutboundRouteBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutboundRouteBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create outbound route
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundRouteBase> postTelephonyProvidersEdgesSiteOutboundroutes(ApiRequest<OutboundRouteBase> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutboundRouteBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutboundRouteBase> response = (ApiResponse<OutboundRouteBase>)(ApiResponse<?>)exception;
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
      ApiResponse<OutboundRouteBase> response = (ApiResponse<OutboundRouteBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Site.
   * 
   * @param body Site (required)
   * @return Site
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Site postTelephonyProvidersEdgesSites(Site body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgesSites(createPostTelephonyProvidersEdgesSitesRequest(body));
  }

  /**
   * Create a Site.
   * 
   * @param body Site (required)
   * @return Site
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Site> postTelephonyProvidersEdgesSitesWithHttpInfo(Site body) throws IOException {
    return postTelephonyProvidersEdgesSites(createPostTelephonyProvidersEdgesSitesRequest(body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesSitesRequest createPostTelephonyProvidersEdgesSitesRequest(Site body) {
    return PostTelephonyProvidersEdgesSitesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a Site.
   * 
   * @param request The request object
   * @return Site
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Site postTelephonyProvidersEdgesSites(PostTelephonyProvidersEdgesSitesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Site> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Site>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Site.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Site> postTelephonyProvidersEdgesSites(ApiRequest<Site> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Site>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Site> response = (ApiResponse<Site>)(ApiResponse<?>)exception;
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
      ApiResponse<Site> response = (ApiResponse<Site>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Search sites
   * 
   * @param body Search request options (required)
   * @return SitesSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SitesSearchResponse postTelephonyProvidersEdgesSitesSearch(SiteSearchRequest body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgesSitesSearch(createPostTelephonyProvidersEdgesSitesSearchRequest(body));
  }

  /**
   * Search sites
   * 
   * @param body Search request options (required)
   * @return SitesSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SitesSearchResponse> postTelephonyProvidersEdgesSitesSearchWithHttpInfo(SiteSearchRequest body) throws IOException {
    return postTelephonyProvidersEdgesSitesSearch(createPostTelephonyProvidersEdgesSitesSearchRequest(body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesSitesSearchRequest createPostTelephonyProvidersEdgesSitesSearchRequest(SiteSearchRequest body) {
    return PostTelephonyProvidersEdgesSitesSearchRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Search sites
   * 
   * @param request The request object
   * @return SitesSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SitesSearchResponse postTelephonyProvidersEdgesSitesSearch(PostTelephonyProvidersEdgesSitesSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SitesSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SitesSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search sites
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SitesSearchResponse> postTelephonyProvidersEdgesSitesSearch(ApiRequest<SiteSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SitesSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SitesSearchResponse> response = (ApiResponse<SitesSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SitesSearchResponse> response = (ApiResponse<SitesSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Trunk Base Settings object
   * 
   * @param body Trunk base settings (required)
   * @return TrunkBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkBase postTelephonyProvidersEdgesTrunkbasesettings(TrunkBase body) throws IOException, ApiException {
    return  postTelephonyProvidersEdgesTrunkbasesettings(createPostTelephonyProvidersEdgesTrunkbasesettingsRequest(body));
  }

  /**
   * Create a Trunk Base Settings object
   * 
   * @param body Trunk base settings (required)
   * @return TrunkBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkBase> postTelephonyProvidersEdgesTrunkbasesettingsWithHttpInfo(TrunkBase body) throws IOException {
    return postTelephonyProvidersEdgesTrunkbasesettings(createPostTelephonyProvidersEdgesTrunkbasesettingsRequest(body).withHttpInfo());
  }

  private PostTelephonyProvidersEdgesTrunkbasesettingsRequest createPostTelephonyProvidersEdgesTrunkbasesettingsRequest(TrunkBase body) {
    return PostTelephonyProvidersEdgesTrunkbasesettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a Trunk Base Settings object
   * 
   * @param request The request object
   * @return TrunkBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkBase postTelephonyProvidersEdgesTrunkbasesettings(PostTelephonyProvidersEdgesTrunkbasesettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrunkBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrunkBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Trunk Base Settings object
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkBase> postTelephonyProvidersEdgesTrunkbasesettings(ApiRequest<TrunkBase> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrunkBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)exception;
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
      ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a edge.
   * 
   * @param edgeId Edge ID (required)
   * @param body Edge (required)
   * @return Edge
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Edge putTelephonyProvidersEdge(String edgeId, Edge body) throws IOException, ApiException {
    return  putTelephonyProvidersEdge(createPutTelephonyProvidersEdgeRequest(edgeId, body));
  }

  /**
   * Update a edge.
   * 
   * @param edgeId Edge ID (required)
   * @param body Edge (required)
   * @return Edge
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Edge> putTelephonyProvidersEdgeWithHttpInfo(String edgeId, Edge body) throws IOException {
    return putTelephonyProvidersEdge(createPutTelephonyProvidersEdgeRequest(edgeId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgeRequest createPutTelephonyProvidersEdgeRequest(String edgeId, Edge body) {
    return PutTelephonyProvidersEdgeRequest.builder()
            .withEdgeId(edgeId)

            .withBody(body)

            .build();
  }

  /**
   * Update a edge.
   * 
   * @param request The request object
   * @return Edge
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Edge putTelephonyProvidersEdge(PutTelephonyProvidersEdgeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Edge> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Edge>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a edge.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Edge> putTelephonyProvidersEdge(ApiRequest<Edge> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Edge>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Edge> response = (ApiResponse<Edge>)(ApiResponse<?>)exception;
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
      ApiResponse<Edge> response = (ApiResponse<Edge>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an edge logical interface.
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @param body Logical interface (required)
   * @return DomainLogicalInterface
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainLogicalInterface putTelephonyProvidersEdgeLogicalinterface(String edgeId, String interfaceId, DomainLogicalInterface body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgeLogicalinterface(createPutTelephonyProvidersEdgeLogicalinterfaceRequest(edgeId, interfaceId, body));
  }

  /**
   * Update an edge logical interface.
   * 
   * @param edgeId Edge ID (required)
   * @param interfaceId Interface ID (required)
   * @param body Logical interface (required)
   * @return DomainLogicalInterface
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainLogicalInterface> putTelephonyProvidersEdgeLogicalinterfaceWithHttpInfo(String edgeId, String interfaceId, DomainLogicalInterface body) throws IOException {
    return putTelephonyProvidersEdgeLogicalinterface(createPutTelephonyProvidersEdgeLogicalinterfaceRequest(edgeId, interfaceId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgeLogicalinterfaceRequest createPutTelephonyProvidersEdgeLogicalinterfaceRequest(String edgeId, String interfaceId, DomainLogicalInterface body) {
    return PutTelephonyProvidersEdgeLogicalinterfaceRequest.builder()
            .withEdgeId(edgeId)

            .withInterfaceId(interfaceId)

            .withBody(body)

            .build();
  }

  /**
   * Update an edge logical interface.
   * 
   * @param request The request object
   * @return DomainLogicalInterface
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainLogicalInterface putTelephonyProvidersEdgeLogicalinterface(PutTelephonyProvidersEdgeLogicalinterfaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainLogicalInterface> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainLogicalInterface>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an edge logical interface.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainLogicalInterface> putTelephonyProvidersEdgeLogicalinterface(ApiRequest<DomainLogicalInterface> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainLogicalInterface>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainLogicalInterface> response = (ApiResponse<DomainLogicalInterface>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainLogicalInterface> response = (ApiResponse<DomainLogicalInterface>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates or updates alertable presences overrides.
   * 
   * @param body Alertable Presences Overrides (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putTelephonyProvidersEdgesAlertablepresences(AlertablePresences body) throws IOException, ApiException {
     putTelephonyProvidersEdgesAlertablepresences(createPutTelephonyProvidersEdgesAlertablepresencesRequest(body));
  }

  /**
   * Creates or updates alertable presences overrides.
   * 
   * @param body Alertable Presences Overrides (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putTelephonyProvidersEdgesAlertablepresencesWithHttpInfo(AlertablePresences body) throws IOException {
    return putTelephonyProvidersEdgesAlertablepresences(createPutTelephonyProvidersEdgesAlertablepresencesRequest(body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesAlertablepresencesRequest createPutTelephonyProvidersEdgesAlertablepresencesRequest(AlertablePresences body) {
    return PutTelephonyProvidersEdgesAlertablepresencesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Creates or updates alertable presences overrides.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putTelephonyProvidersEdgesAlertablepresences(PutTelephonyProvidersEdgesAlertablepresencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Creates or updates alertable presences overrides.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putTelephonyProvidersEdgesAlertablepresences(ApiRequest<AlertablePresences> request) throws IOException {
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
   * Update a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @param body Certificate authority (required)
   * @return DomainCertificateAuthority
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainCertificateAuthority putTelephonyProvidersEdgesCertificateauthority(String certificateId, DomainCertificateAuthority body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgesCertificateauthority(createPutTelephonyProvidersEdgesCertificateauthorityRequest(certificateId, body));
  }

  /**
   * Update a certificate authority.
   * 
   * @param certificateId Certificate ID (required)
   * @param body Certificate authority (required)
   * @return DomainCertificateAuthority
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainCertificateAuthority> putTelephonyProvidersEdgesCertificateauthorityWithHttpInfo(String certificateId, DomainCertificateAuthority body) throws IOException {
    return putTelephonyProvidersEdgesCertificateauthority(createPutTelephonyProvidersEdgesCertificateauthorityRequest(certificateId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesCertificateauthorityRequest createPutTelephonyProvidersEdgesCertificateauthorityRequest(String certificateId, DomainCertificateAuthority body) {
    return PutTelephonyProvidersEdgesCertificateauthorityRequest.builder()
            .withCertificateId(certificateId)

            .withBody(body)

            .build();
  }

  /**
   * Update a certificate authority.
   * 
   * @param request The request object
   * @return DomainCertificateAuthority
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainCertificateAuthority putTelephonyProvidersEdgesCertificateauthority(PutTelephonyProvidersEdgesCertificateauthorityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainCertificateAuthority> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainCertificateAuthority>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a certificate authority.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainCertificateAuthority> putTelephonyProvidersEdgesCertificateauthority(ApiRequest<DomainCertificateAuthority> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainCertificateAuthority>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainCertificateAuthority> response = (ApiResponse<DomainCertificateAuthority>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainCertificateAuthority> response = (ApiResponse<DomainCertificateAuthority>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @param body DID pool (required)
   * @return DIDPool
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DIDPool putTelephonyProvidersEdgesDidpool(String didPoolId, DIDPool body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgesDidpool(createPutTelephonyProvidersEdgesDidpoolRequest(didPoolId, body));
  }

  /**
   * Update a DID Pool by ID.
   * 
   * @param didPoolId DID pool ID (required)
   * @param body DID pool (required)
   * @return DIDPool
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DIDPool> putTelephonyProvidersEdgesDidpoolWithHttpInfo(String didPoolId, DIDPool body) throws IOException {
    return putTelephonyProvidersEdgesDidpool(createPutTelephonyProvidersEdgesDidpoolRequest(didPoolId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesDidpoolRequest createPutTelephonyProvidersEdgesDidpoolRequest(String didPoolId, DIDPool body) {
    return PutTelephonyProvidersEdgesDidpoolRequest.builder()
            .withDidPoolId(didPoolId)

            .withBody(body)

            .build();
  }

  /**
   * Update a DID Pool by ID.
   * 
   * @param request The request object
   * @return DIDPool
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DIDPool putTelephonyProvidersEdgesDidpool(PutTelephonyProvidersEdgesDidpoolRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DIDPool> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DIDPool>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a DID Pool by ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DIDPool> putTelephonyProvidersEdgesDidpool(ApiRequest<DIDPool> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DIDPool>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DIDPool> response = (ApiResponse<DIDPool>)(ApiResponse<?>)exception;
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
      ApiResponse<DIDPool> response = (ApiResponse<DIDPool>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @param body EdgeGroup (required)
   * @return EdgeGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeGroup putTelephonyProvidersEdgesEdgegroup(String edgeGroupId, EdgeGroup body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgesEdgegroup(createPutTelephonyProvidersEdgesEdgegroupRequest(edgeGroupId, body));
  }

  /**
   * Update an edge group.
   * 
   * @param edgeGroupId Edge group ID (required)
   * @param body EdgeGroup (required)
   * @return EdgeGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeGroup> putTelephonyProvidersEdgesEdgegroupWithHttpInfo(String edgeGroupId, EdgeGroup body) throws IOException {
    return putTelephonyProvidersEdgesEdgegroup(createPutTelephonyProvidersEdgesEdgegroupRequest(edgeGroupId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesEdgegroupRequest createPutTelephonyProvidersEdgesEdgegroupRequest(String edgeGroupId, EdgeGroup body) {
    return PutTelephonyProvidersEdgesEdgegroupRequest.builder()
            .withEdgeGroupId(edgeGroupId)

            .withBody(body)

            .build();
  }

  /**
   * Update an edge group.
   * 
   * @param request The request object
   * @return EdgeGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeGroup putTelephonyProvidersEdgesEdgegroup(PutTelephonyProvidersEdgesEdgegroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an edge group.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeGroup> putTelephonyProvidersEdgesEdgegroup(ApiRequest<EdgeGroup> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeGroup> response = (ApiResponse<EdgeGroup>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeGroup> response = (ApiResponse<EdgeGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the edge trunk base associated with the edge group
   * 
   * @param edgegroupId Edge Group ID (required)
   * @param edgetrunkbaseId Edge Trunk Base ID (required)
   * @param body EdgeTrunkBase (required)
   * @return EdgeTrunkBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeTrunkBase putTelephonyProvidersEdgesEdgegroupEdgetrunkbase(String edgegroupId, String edgetrunkbaseId, EdgeTrunkBase body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgesEdgegroupEdgetrunkbase(createPutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest(edgegroupId, edgetrunkbaseId, body));
  }

  /**
   * Update the edge trunk base associated with the edge group
   * 
   * @param edgegroupId Edge Group ID (required)
   * @param edgetrunkbaseId Edge Trunk Base ID (required)
   * @param body EdgeTrunkBase (required)
   * @return EdgeTrunkBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeTrunkBase> putTelephonyProvidersEdgesEdgegroupEdgetrunkbaseWithHttpInfo(String edgegroupId, String edgetrunkbaseId, EdgeTrunkBase body) throws IOException {
    return putTelephonyProvidersEdgesEdgegroupEdgetrunkbase(createPutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest(edgegroupId, edgetrunkbaseId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest createPutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest(String edgegroupId, String edgetrunkbaseId, EdgeTrunkBase body) {
    return PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest.builder()
            .withEdgegroupId(edgegroupId)

            .withEdgetrunkbaseId(edgetrunkbaseId)

            .withBody(body)

            .build();
  }

  /**
   * Update the edge trunk base associated with the edge group
   * 
   * @param request The request object
   * @return EdgeTrunkBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EdgeTrunkBase putTelephonyProvidersEdgesEdgegroupEdgetrunkbase(PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EdgeTrunkBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EdgeTrunkBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the edge trunk base associated with the edge group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EdgeTrunkBase> putTelephonyProvidersEdgesEdgegroupEdgetrunkbase(ApiRequest<EdgeTrunkBase> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EdgeTrunkBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EdgeTrunkBase> response = (ApiResponse<EdgeTrunkBase>)(ApiResponse<?>)exception;
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
      ApiResponse<EdgeTrunkBase> response = (ApiResponse<EdgeTrunkBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @param body ExtensionPool (required)
   * @return ExtensionPool
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExtensionPool putTelephonyProvidersEdgesExtensionpool(String extensionPoolId, ExtensionPool body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgesExtensionpool(createPutTelephonyProvidersEdgesExtensionpoolRequest(extensionPoolId, body));
  }

  /**
   * Update an extension pool by ID
   * 
   * @param extensionPoolId Extension pool ID (required)
   * @param body ExtensionPool (required)
   * @return ExtensionPool
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExtensionPool> putTelephonyProvidersEdgesExtensionpoolWithHttpInfo(String extensionPoolId, ExtensionPool body) throws IOException {
    return putTelephonyProvidersEdgesExtensionpool(createPutTelephonyProvidersEdgesExtensionpoolRequest(extensionPoolId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesExtensionpoolRequest createPutTelephonyProvidersEdgesExtensionpoolRequest(String extensionPoolId, ExtensionPool body) {
    return PutTelephonyProvidersEdgesExtensionpoolRequest.builder()
            .withExtensionPoolId(extensionPoolId)

            .withBody(body)

            .build();
  }

  /**
   * Update an extension pool by ID
   * 
   * @param request The request object
   * @return ExtensionPool
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExtensionPool putTelephonyProvidersEdgesExtensionpool(PutTelephonyProvidersEdgesExtensionpoolRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExtensionPool> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExtensionPool>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an extension pool by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExtensionPool> putTelephonyProvidersEdgesExtensionpool(ApiRequest<ExtensionPool> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExtensionPool>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExtensionPool> response = (ApiResponse<ExtensionPool>)(ApiResponse<?>)exception;
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
      ApiResponse<ExtensionPool> response = (ApiResponse<ExtensionPool>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @param body Phone (required)
   * @return Phone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Phone putTelephonyProvidersEdgesPhone(String phoneId, Phone body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgesPhone(createPutTelephonyProvidersEdgesPhoneRequest(phoneId, body));
  }

  /**
   * Update a Phone by ID
   * 
   * @param phoneId Phone ID (required)
   * @param body Phone (required)
   * @return Phone
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Phone> putTelephonyProvidersEdgesPhoneWithHttpInfo(String phoneId, Phone body) throws IOException {
    return putTelephonyProvidersEdgesPhone(createPutTelephonyProvidersEdgesPhoneRequest(phoneId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesPhoneRequest createPutTelephonyProvidersEdgesPhoneRequest(String phoneId, Phone body) {
    return PutTelephonyProvidersEdgesPhoneRequest.builder()
            .withPhoneId(phoneId)

            .withBody(body)

            .build();
  }

  /**
   * Update a Phone by ID
   * 
   * @param request The request object
   * @return Phone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Phone putTelephonyProvidersEdgesPhone(PutTelephonyProvidersEdgesPhoneRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Phone> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Phone>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Phone by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Phone> putTelephonyProvidersEdgesPhone(ApiRequest<Phone> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Phone>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)exception;
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
      ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a Phone Base Settings by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @param body Phone base settings (required)
   * @return PhoneBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneBase putTelephonyProvidersEdgesPhonebasesetting(String phoneBaseId, PhoneBase body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgesPhonebasesetting(createPutTelephonyProvidersEdgesPhonebasesettingRequest(phoneBaseId, body));
  }

  /**
   * Update a Phone Base Settings by ID
   * 
   * @param phoneBaseId Phone base ID (required)
   * @param body Phone base settings (required)
   * @return PhoneBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneBase> putTelephonyProvidersEdgesPhonebasesettingWithHttpInfo(String phoneBaseId, PhoneBase body) throws IOException {
    return putTelephonyProvidersEdgesPhonebasesetting(createPutTelephonyProvidersEdgesPhonebasesettingRequest(phoneBaseId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesPhonebasesettingRequest createPutTelephonyProvidersEdgesPhonebasesettingRequest(String phoneBaseId, PhoneBase body) {
    return PutTelephonyProvidersEdgesPhonebasesettingRequest.builder()
            .withPhoneBaseId(phoneBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Update a Phone Base Settings by ID
   * 
   * @param request The request object
   * @return PhoneBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PhoneBase putTelephonyProvidersEdgesPhonebasesetting(PutTelephonyProvidersEdgesPhonebasesettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PhoneBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PhoneBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Phone Base Settings by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PhoneBase> putTelephonyProvidersEdgesPhonebasesetting(ApiRequest<PhoneBase> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PhoneBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)exception;
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
      ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a Site by ID.
   * 
   * @param siteId Site ID (required)
   * @param body Site (required)
   * @return Site
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Site putTelephonyProvidersEdgesSite(String siteId, Site body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgesSite(createPutTelephonyProvidersEdgesSiteRequest(siteId, body));
  }

  /**
   * Update a Site by ID.
   * 
   * @param siteId Site ID (required)
   * @param body Site (required)
   * @return Site
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Site> putTelephonyProvidersEdgesSiteWithHttpInfo(String siteId, Site body) throws IOException {
    return putTelephonyProvidersEdgesSite(createPutTelephonyProvidersEdgesSiteRequest(siteId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesSiteRequest createPutTelephonyProvidersEdgesSiteRequest(String siteId, Site body) {
    return PutTelephonyProvidersEdgesSiteRequest.builder()
            .withSiteId(siteId)

            .withBody(body)

            .build();
  }

  /**
   * Update a Site by ID.
   * 
   * @param request The request object
   * @return Site
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Site putTelephonyProvidersEdgesSite(PutTelephonyProvidersEdgesSiteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Site> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Site>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Site by ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Site> putTelephonyProvidersEdgesSite(ApiRequest<Site> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Site>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Site> response = (ApiResponse<Site>)(ApiResponse<?>)exception;
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
      ApiResponse<Site> response = (ApiResponse<Site>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the list of Number Plans. A user can update maximum 200 number plans at a time.
   * 
   * @param siteId Site ID (required)
   * @param body List of number plans (required)
   * @return List<NumberPlan>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<NumberPlan> putTelephonyProvidersEdgesSiteNumberplans(String siteId, List<NumberPlan> body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgesSiteNumberplans(createPutTelephonyProvidersEdgesSiteNumberplansRequest(siteId, body));
  }

  /**
   * Update the list of Number Plans. A user can update maximum 200 number plans at a time.
   * 
   * @param siteId Site ID (required)
   * @param body List of number plans (required)
   * @return List<NumberPlan>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<NumberPlan>> putTelephonyProvidersEdgesSiteNumberplansWithHttpInfo(String siteId, List<NumberPlan> body) throws IOException {
    return putTelephonyProvidersEdgesSiteNumberplans(createPutTelephonyProvidersEdgesSiteNumberplansRequest(siteId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesSiteNumberplansRequest createPutTelephonyProvidersEdgesSiteNumberplansRequest(String siteId, List<NumberPlan> body) {
    return PutTelephonyProvidersEdgesSiteNumberplansRequest.builder()
            .withSiteId(siteId)

            .withBody(body)

            .build();
  }

  /**
   * Update the list of Number Plans. A user can update maximum 200 number plans at a time.
   * 
   * @param request The request object
   * @return List<NumberPlan>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<NumberPlan> putTelephonyProvidersEdgesSiteNumberplans(PutTelephonyProvidersEdgesSiteNumberplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<NumberPlan>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<NumberPlan>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the list of Number Plans. A user can update maximum 200 number plans at a time.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<NumberPlan>> putTelephonyProvidersEdgesSiteNumberplans(ApiRequest<List<NumberPlan>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<NumberPlan>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<NumberPlan>> response = (ApiResponse<List<NumberPlan>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<NumberPlan>> response = (ApiResponse<List<NumberPlan>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update outbound route
   * 
   * @param siteId Site ID (required)
   * @param outboundRouteId Outbound route ID (required)
   * @param body OutboundRoute (required)
   * @return OutboundRouteBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundRouteBase putTelephonyProvidersEdgesSiteOutboundroute(String siteId, String outboundRouteId, OutboundRouteBase body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgesSiteOutboundroute(createPutTelephonyProvidersEdgesSiteOutboundrouteRequest(siteId, outboundRouteId, body));
  }

  /**
   * Update outbound route
   * 
   * @param siteId Site ID (required)
   * @param outboundRouteId Outbound route ID (required)
   * @param body OutboundRoute (required)
   * @return OutboundRouteBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundRouteBase> putTelephonyProvidersEdgesSiteOutboundrouteWithHttpInfo(String siteId, String outboundRouteId, OutboundRouteBase body) throws IOException {
    return putTelephonyProvidersEdgesSiteOutboundroute(createPutTelephonyProvidersEdgesSiteOutboundrouteRequest(siteId, outboundRouteId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesSiteOutboundrouteRequest createPutTelephonyProvidersEdgesSiteOutboundrouteRequest(String siteId, String outboundRouteId, OutboundRouteBase body) {
    return PutTelephonyProvidersEdgesSiteOutboundrouteRequest.builder()
            .withSiteId(siteId)

            .withOutboundRouteId(outboundRouteId)

            .withBody(body)

            .build();
  }

  /**
   * Update outbound route
   * 
   * @param request The request object
   * @return OutboundRouteBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundRouteBase putTelephonyProvidersEdgesSiteOutboundroute(PutTelephonyProvidersEdgesSiteOutboundrouteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutboundRouteBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutboundRouteBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update outbound route
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundRouteBase> putTelephonyProvidersEdgesSiteOutboundroute(ApiRequest<OutboundRouteBase> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutboundRouteBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutboundRouteBase> response = (ApiResponse<OutboundRouteBase>)(ApiResponse<?>)exception;
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
      ApiResponse<OutboundRouteBase> response = (ApiResponse<OutboundRouteBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update site connections for a site.
   * 
   * @param siteId Site ID (required)
   * @param body Site (required)
   * @return SiteConnections
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SiteConnections putTelephonyProvidersEdgesSiteSiteconnections(String siteId, SiteConnections body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgesSiteSiteconnections(createPutTelephonyProvidersEdgesSiteSiteconnectionsRequest(siteId, body));
  }

  /**
   * Update site connections for a site.
   * 
   * @param siteId Site ID (required)
   * @param body Site (required)
   * @return SiteConnections
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SiteConnections> putTelephonyProvidersEdgesSiteSiteconnectionsWithHttpInfo(String siteId, SiteConnections body) throws IOException {
    return putTelephonyProvidersEdgesSiteSiteconnections(createPutTelephonyProvidersEdgesSiteSiteconnectionsRequest(siteId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesSiteSiteconnectionsRequest createPutTelephonyProvidersEdgesSiteSiteconnectionsRequest(String siteId, SiteConnections body) {
    return PutTelephonyProvidersEdgesSiteSiteconnectionsRequest.builder()
            .withSiteId(siteId)

            .withBody(body)

            .build();
  }

  /**
   * Update site connections for a site.
   * 
   * @param request The request object
   * @return SiteConnections
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SiteConnections putTelephonyProvidersEdgesSiteSiteconnections(PutTelephonyProvidersEdgesSiteSiteconnectionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SiteConnections> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SiteConnections>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update site connections for a site.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SiteConnections> putTelephonyProvidersEdgesSiteSiteconnections(ApiRequest<SiteConnections> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SiteConnections>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SiteConnections> response = (ApiResponse<SiteConnections>)(ApiResponse<?>)exception;
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
      ApiResponse<SiteConnections> response = (ApiResponse<SiteConnections>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @param body Trunk base settings (required)
   * @return TrunkBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkBase putTelephonyProvidersEdgesTrunkbasesetting(String trunkBaseSettingsId, TrunkBase body) throws IOException, ApiException {
    return  putTelephonyProvidersEdgesTrunkbasesetting(createPutTelephonyProvidersEdgesTrunkbasesettingRequest(trunkBaseSettingsId, body));
  }

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @param trunkBaseSettingsId Trunk Base ID (required)
   * @param body Trunk base settings (required)
   * @return TrunkBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkBase> putTelephonyProvidersEdgesTrunkbasesettingWithHttpInfo(String trunkBaseSettingsId, TrunkBase body) throws IOException {
    return putTelephonyProvidersEdgesTrunkbasesetting(createPutTelephonyProvidersEdgesTrunkbasesettingRequest(trunkBaseSettingsId, body).withHttpInfo());
  }

  private PutTelephonyProvidersEdgesTrunkbasesettingRequest createPutTelephonyProvidersEdgesTrunkbasesettingRequest(String trunkBaseSettingsId, TrunkBase body) {
    return PutTelephonyProvidersEdgesTrunkbasesettingRequest.builder()
            .withTrunkBaseSettingsId(trunkBaseSettingsId)

            .withBody(body)

            .build();
  }

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @param request The request object
   * @return TrunkBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrunkBase putTelephonyProvidersEdgesTrunkbasesetting(PutTelephonyProvidersEdgesTrunkbasesettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrunkBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrunkBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrunkBase> putTelephonyProvidersEdgesTrunkbasesetting(ApiRequest<TrunkBase> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrunkBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)exception;
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
      ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
