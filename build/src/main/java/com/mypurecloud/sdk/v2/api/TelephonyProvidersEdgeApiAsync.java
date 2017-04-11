package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;

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
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesPhysicalinterfacesRequest;
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
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgeAsync(DeleteTelephonyProvidersEdgeRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an edge logical interface
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteTelephonyProvidersEdgeLogicalinterfaceAsync(DeleteTelephonyProvidersEdgeLogicalinterfaceRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an edge logical interface
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteTelephonyProvidersEdgeLogicalinterfaceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Cancels any in-progress update for this edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgeSoftwareupdateAsync(DeleteTelephonyProvidersEdgeSoftwareupdateRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Cancels any in-progress update for this edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgeSoftwareupdateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a certificate authority.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgesCertificateauthorityAsync(DeleteTelephonyProvidersEdgesCertificateauthorityRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a certificate authority.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesCertificateauthorityAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a DID Pool by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgesDidpoolAsync(DeleteTelephonyProvidersEdgesDidpoolRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a DID Pool by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesDidpoolAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an edge group.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgesEdgegroupAsync(DeleteTelephonyProvidersEdgesEdgegroupRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an edge group.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesEdgegroupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete endpoint
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgesEndpointAsync(DeleteTelephonyProvidersEdgesEndpointRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete endpoint
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesEndpointAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an extension pool by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgesExtensionpoolAsync(DeleteTelephonyProvidersEdgesExtensionpoolRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an extension pool by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesExtensionpoolAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Outbound Route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgesOutboundrouteAsync(DeleteTelephonyProvidersEdgesOutboundrouteRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Outbound Route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesOutboundrouteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Phone by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgesPhoneAsync(DeleteTelephonyProvidersEdgesPhoneRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Phone by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesPhoneAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Phone Base Settings by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgesPhonebasesettingAsync(DeleteTelephonyProvidersEdgesPhonebasesettingRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Phone Base Settings by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesPhonebasesettingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Site by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgesSiteAsync(DeleteTelephonyProvidersEdgesSiteRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Site by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesSiteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Outbound Route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgesSiteOutboundrouteAsync(DeleteTelephonyProvidersEdgesSiteOutboundrouteRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Outbound Route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesSiteOutboundrouteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Trunk Base Settings object by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteTelephonyProvidersEdgesTrunkbasesettingAsync(DeleteTelephonyProvidersEdgesTrunkbasesettingRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Trunk Base Settings object by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteTelephonyProvidersEdgesTrunkbasesettingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Lists available schema categories (Deprecated)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SchemaCategoryEntityListing> getConfigurationSchemasEdgesVnextAsync(GetConfigurationSchemasEdgesVnextRequest request, AsyncApiCallback<SchemaCategoryEntityListing> callback) {
    try {
      SettableFuture<SchemaCategoryEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SchemaCategoryEntityListing>() {}, new AsyncApiCallback<ApiResponse<SchemaCategoryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SchemaCategoryEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Lists available schema categories (Deprecated)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SchemaCategoryEntityListing>> getConfigurationSchemasEdgesVnextAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SchemaCategoryEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<SchemaCategoryEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SchemaCategoryEntityListing>() {}, new AsyncApiCallback<ApiResponse<SchemaCategoryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SchemaCategoryEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SchemaCategoryEntityListing> response = (ApiResponse<SchemaCategoryEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SchemaCategoryEntityListing> response = (ApiResponse<SchemaCategoryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SchemaReferenceEntityListing> getConfigurationSchemasEdgesVnextSchemaCategoryAsync(GetConfigurationSchemasEdgesVnextSchemaCategoryRequest request, AsyncApiCallback<SchemaReferenceEntityListing> callback) {
    try {
      SettableFuture<SchemaReferenceEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SchemaReferenceEntityListing>() {}, new AsyncApiCallback<ApiResponse<SchemaReferenceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SchemaReferenceEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SchemaReferenceEntityListing>> getConfigurationSchemasEdgesVnextSchemaCategoryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SchemaReferenceEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<SchemaReferenceEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SchemaReferenceEntityListing>() {}, new AsyncApiCallback<ApiResponse<SchemaReferenceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SchemaReferenceEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SchemaReferenceEntityListing> response = (ApiResponse<SchemaReferenceEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SchemaReferenceEntityListing> response = (ApiResponse<SchemaReferenceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SchemaReferenceEntityListing> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeAsync(GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeRequest request, AsyncApiCallback<SchemaReferenceEntityListing> callback) {
    try {
      SettableFuture<SchemaReferenceEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SchemaReferenceEntityListing>() {}, new AsyncApiCallback<ApiResponse<SchemaReferenceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SchemaReferenceEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List schemas of a specific category (Deprecated)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SchemaReferenceEntityListing>> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SchemaReferenceEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<SchemaReferenceEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SchemaReferenceEntityListing>() {}, new AsyncApiCallback<ApiResponse<SchemaReferenceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SchemaReferenceEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SchemaReferenceEntityListing> response = (ApiResponse<SchemaReferenceEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SchemaReferenceEntityListing> response = (ApiResponse<SchemaReferenceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a json schema (Deprecated)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Organization> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdAsync(GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdRequest request, AsyncApiCallback<Organization> callback) {
    try {
      SettableFuture<Organization> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Organization>() {}, new AsyncApiCallback<ApiResponse<Organization>>() {
        @Override
        public void onCompleted(ApiResponse<Organization> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a json schema (Deprecated)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Organization>> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Organization>> callback) {
    try {
      SettableFuture<ApiResponse<Organization>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Organization>() {}, new AsyncApiCallback<ApiResponse<Organization>>() {
        @Override
        public void onCompleted(ApiResponse<Organization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get metadata for a schema (Deprecated)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Organization> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdAsync(GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest request, AsyncApiCallback<Organization> callback) {
    try {
      SettableFuture<Organization> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Organization>() {}, new AsyncApiCallback<ApiResponse<Organization>>() {
        @Override
        public void onCompleted(ApiResponse<Organization> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get metadata for a schema (Deprecated)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Organization>> getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Organization>> callback) {
    try {
      SettableFuture<ApiResponse<Organization>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Organization>() {}, new AsyncApiCallback<ApiResponse<Organization>>() {
        @Override
        public void onCompleted(ApiResponse<Organization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Edge> getTelephonyProvidersEdgeAsync(GetTelephonyProvidersEdgeRequest request, AsyncApiCallback<Edge> callback) {
    try {
      SettableFuture<Edge> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Edge>() {}, new AsyncApiCallback<ApiResponse<Edge>>() {
        @Override
        public void onCompleted(ApiResponse<Edge> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Edge>> getTelephonyProvidersEdgeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Edge>> callback) {
    try {
      SettableFuture<ApiResponse<Edge>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Edge>() {}, new AsyncApiCallback<ApiResponse<Edge>>() {
        @Override
        public void onCompleted(ApiResponse<Edge> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Edge> response = (ApiResponse<Edge>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Edge> response = (ApiResponse<Edge>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get line
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeLine> getTelephonyProvidersEdgeLineAsync(GetTelephonyProvidersEdgeLineRequest request, AsyncApiCallback<EdgeLine> callback) {
    try {
      SettableFuture<EdgeLine> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeLine>() {}, new AsyncApiCallback<ApiResponse<EdgeLine>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeLine> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get line
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeLine>> getTelephonyProvidersEdgeLineAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeLine>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeLine>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeLine>() {}, new AsyncApiCallback<ApiResponse<EdgeLine>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeLine> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeLine> response = (ApiResponse<EdgeLine>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeLine> response = (ApiResponse<EdgeLine>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of lines.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeLineEntityListing> getTelephonyProvidersEdgeLinesAsync(GetTelephonyProvidersEdgeLinesRequest request, AsyncApiCallback<EdgeLineEntityListing> callback) {
    try {
      SettableFuture<EdgeLineEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeLineEntityListing>() {}, new AsyncApiCallback<ApiResponse<EdgeLineEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeLineEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of lines.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeLineEntityListing>> getTelephonyProvidersEdgeLinesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeLineEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeLineEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeLineEntityListing>() {}, new AsyncApiCallback<ApiResponse<EdgeLineEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeLineEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeLineEntityListing> response = (ApiResponse<EdgeLineEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeLineEntityListing> response = (ApiResponse<EdgeLineEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an edge logical interface
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainLogicalInterface> getTelephonyProvidersEdgeLogicalinterfaceAsync(GetTelephonyProvidersEdgeLogicalinterfaceRequest request, AsyncApiCallback<DomainLogicalInterface> callback) {
    try {
      SettableFuture<DomainLogicalInterface> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainLogicalInterface>() {}, new AsyncApiCallback<ApiResponse<DomainLogicalInterface>>() {
        @Override
        public void onCompleted(ApiResponse<DomainLogicalInterface> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an edge logical interface
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainLogicalInterface>> getTelephonyProvidersEdgeLogicalinterfaceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainLogicalInterface>> callback) {
    try {
      SettableFuture<ApiResponse<DomainLogicalInterface>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainLogicalInterface>() {}, new AsyncApiCallback<ApiResponse<DomainLogicalInterface>>() {
        @Override
        public void onCompleted(ApiResponse<DomainLogicalInterface> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainLogicalInterface> response = (ApiResponse<DomainLogicalInterface>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainLogicalInterface> response = (ApiResponse<DomainLogicalInterface>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LogicalInterfaceEntityListing> getTelephonyProvidersEdgeLogicalinterfacesAsync(GetTelephonyProvidersEdgeLogicalinterfacesRequest request, AsyncApiCallback<LogicalInterfaceEntityListing> callback) {
    try {
      SettableFuture<LogicalInterfaceEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LogicalInterfaceEntityListing>() {}, new AsyncApiCallback<ApiResponse<LogicalInterfaceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LogicalInterfaceEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get edge logical interfaces.
   * Retrieve a list of all configured logical interfaces from a specific edge.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LogicalInterfaceEntityListing>> getTelephonyProvidersEdgeLogicalinterfacesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LogicalInterfaceEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<LogicalInterfaceEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LogicalInterfaceEntityListing>() {}, new AsyncApiCallback<ApiResponse<LogicalInterfaceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LogicalInterfaceEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LogicalInterfaceEntityListing> response = (ApiResponse<LogicalInterfaceEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LogicalInterfaceEntityListing> response = (ApiResponse<LogicalInterfaceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an Edge logs job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeLogsJob> getTelephonyProvidersEdgeLogsJobAsync(GetTelephonyProvidersEdgeLogsJobRequest request, AsyncApiCallback<EdgeLogsJob> callback) {
    try {
      SettableFuture<EdgeLogsJob> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeLogsJob>() {}, new AsyncApiCallback<ApiResponse<EdgeLogsJob>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeLogsJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an Edge logs job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeLogsJob>> getTelephonyProvidersEdgeLogsJobAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeLogsJob>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeLogsJob>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeLogsJob>() {}, new AsyncApiCallback<ApiResponse<EdgeLogsJob>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeLogsJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeLogsJob> response = (ApiResponse<EdgeLogsJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeLogsJob> response = (ApiResponse<EdgeLogsJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainPhysicalInterface> getTelephonyProvidersEdgePhysicalinterfaceAsync(GetTelephonyProvidersEdgePhysicalinterfaceRequest request, AsyncApiCallback<DomainPhysicalInterface> callback) {
    try {
      SettableFuture<DomainPhysicalInterface> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainPhysicalInterface>() {}, new AsyncApiCallback<ApiResponse<DomainPhysicalInterface>>() {
        @Override
        public void onCompleted(ApiResponse<DomainPhysicalInterface> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get edge physical interface.
   * Retrieve a physical interface from a specific edge.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainPhysicalInterface>> getTelephonyProvidersEdgePhysicalinterfaceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainPhysicalInterface>> callback) {
    try {
      SettableFuture<ApiResponse<DomainPhysicalInterface>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainPhysicalInterface>() {}, new AsyncApiCallback<ApiResponse<DomainPhysicalInterface>>() {
        @Override
        public void onCompleted(ApiResponse<DomainPhysicalInterface> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainPhysicalInterface> response = (ApiResponse<DomainPhysicalInterface>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainPhysicalInterface> response = (ApiResponse<DomainPhysicalInterface>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PhysicalInterfaceEntityListing> getTelephonyProvidersEdgePhysicalinterfacesAsync(GetTelephonyProvidersEdgePhysicalinterfacesRequest request, AsyncApiCallback<PhysicalInterfaceEntityListing> callback) {
    try {
      SettableFuture<PhysicalInterfaceEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PhysicalInterfaceEntityListing>() {}, new AsyncApiCallback<ApiResponse<PhysicalInterfaceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PhysicalInterfaceEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a list of all configured physical interfaces from a specific edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PhysicalInterfaceEntityListing>> getTelephonyProvidersEdgePhysicalinterfacesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PhysicalInterfaceEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<PhysicalInterfaceEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PhysicalInterfaceEntityListing>() {}, new AsyncApiCallback<ApiResponse<PhysicalInterfaceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PhysicalInterfaceEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PhysicalInterfaceEntityListing> response = (ApiResponse<PhysicalInterfaceEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PhysicalInterfaceEntityListing> response = (ApiResponse<PhysicalInterfaceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VmPairingInfo> getTelephonyProvidersEdgeSetuppackageAsync(GetTelephonyProvidersEdgeSetuppackageRequest request, AsyncApiCallback<VmPairingInfo> callback) {
    try {
      SettableFuture<VmPairingInfo> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VmPairingInfo>() {}, new AsyncApiCallback<ApiResponse<VmPairingInfo>>() {
        @Override
        public void onCompleted(ApiResponse<VmPairingInfo> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VmPairingInfo>> getTelephonyProvidersEdgeSetuppackageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VmPairingInfo>> callback) {
    try {
      SettableFuture<ApiResponse<VmPairingInfo>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VmPairingInfo>() {}, new AsyncApiCallback<ApiResponse<VmPairingInfo>>() {
        @Override
        public void onCompleted(ApiResponse<VmPairingInfo> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VmPairingInfo> response = (ApiResponse<VmPairingInfo>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VmPairingInfo> response = (ApiResponse<VmPairingInfo>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets software update status information about any edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainEdgeSoftwareUpdateDto> getTelephonyProvidersEdgeSoftwareupdateAsync(GetTelephonyProvidersEdgeSoftwareupdateRequest request, AsyncApiCallback<DomainEdgeSoftwareUpdateDto> callback) {
    try {
      SettableFuture<DomainEdgeSoftwareUpdateDto> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainEdgeSoftwareUpdateDto>() {}, new AsyncApiCallback<ApiResponse<DomainEdgeSoftwareUpdateDto>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEdgeSoftwareUpdateDto> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets software update status information about any edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainEdgeSoftwareUpdateDto>> getTelephonyProvidersEdgeSoftwareupdateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainEdgeSoftwareUpdateDto>> callback) {
    try {
      SettableFuture<ApiResponse<DomainEdgeSoftwareUpdateDto>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainEdgeSoftwareUpdateDto>() {}, new AsyncApiCallback<ApiResponse<DomainEdgeSoftwareUpdateDto>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEdgeSoftwareUpdateDto> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEdgeSoftwareUpdateDto> response = (ApiResponse<DomainEdgeSoftwareUpdateDto>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEdgeSoftwareUpdateDto> response = (ApiResponse<DomainEdgeSoftwareUpdateDto>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets all the available software versions for this edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainEdgeSoftwareVersionDtoEntityListing> getTelephonyProvidersEdgeSoftwareversionsAsync(GetTelephonyProvidersEdgeSoftwareversionsRequest request, AsyncApiCallback<DomainEdgeSoftwareVersionDtoEntityListing> callback) {
    try {
      SettableFuture<DomainEdgeSoftwareVersionDtoEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainEdgeSoftwareVersionDtoEntityListing>() {}, new AsyncApiCallback<ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets all the available software versions for this edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing>> getTelephonyProvidersEdgeSoftwareversionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainEdgeSoftwareVersionDtoEntityListing>() {}, new AsyncApiCallback<ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing> response = (ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing> response = (ApiResponse<DomainEdgeSoftwareVersionDtoEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of edges.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeEntityListing> getTelephonyProvidersEdgesAsync(GetTelephonyProvidersEdgesRequest request, AsyncApiCallback<EdgeEntityListing> callback) {
    try {
      SettableFuture<EdgeEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeEntityListing>() {}, new AsyncApiCallback<ApiResponse<EdgeEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of edges.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeEntityListing>> getTelephonyProvidersEdgesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeEntityListing>() {}, new AsyncApiCallback<ApiResponse<EdgeEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeEntityListing> response = (ApiResponse<EdgeEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeEntityListing> response = (ApiResponse<EdgeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of available languages.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AvailableLanguageList> getTelephonyProvidersEdgesAvailablelanguagesAsync(GetTelephonyProvidersEdgesAvailablelanguagesRequest request, AsyncApiCallback<AvailableLanguageList> callback) {
    try {
      SettableFuture<AvailableLanguageList> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AvailableLanguageList>() {}, new AsyncApiCallback<ApiResponse<AvailableLanguageList>>() {
        @Override
        public void onCompleted(ApiResponse<AvailableLanguageList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of available languages.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AvailableLanguageList>> getTelephonyProvidersEdgesAvailablelanguagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<AvailableLanguageList>> callback) {
    try {
      SettableFuture<ApiResponse<AvailableLanguageList>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AvailableLanguageList>() {}, new AsyncApiCallback<ApiResponse<AvailableLanguageList>>() {
        @Override
        public void onCompleted(ApiResponse<AvailableLanguageList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AvailableLanguageList> response = (ApiResponse<AvailableLanguageList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AvailableLanguageList> response = (ApiResponse<AvailableLanguageList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of certificate authorities.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CertificateAuthorityEntityListing> getTelephonyProvidersEdgesCertificateauthoritiesAsync(GetTelephonyProvidersEdgesCertificateauthoritiesRequest request, AsyncApiCallback<CertificateAuthorityEntityListing> callback) {
    try {
      SettableFuture<CertificateAuthorityEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CertificateAuthorityEntityListing>() {}, new AsyncApiCallback<ApiResponse<CertificateAuthorityEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CertificateAuthorityEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of certificate authorities.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CertificateAuthorityEntityListing>> getTelephonyProvidersEdgesCertificateauthoritiesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CertificateAuthorityEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<CertificateAuthorityEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CertificateAuthorityEntityListing>() {}, new AsyncApiCallback<ApiResponse<CertificateAuthorityEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CertificateAuthorityEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CertificateAuthorityEntityListing> response = (ApiResponse<CertificateAuthorityEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CertificateAuthorityEntityListing> response = (ApiResponse<CertificateAuthorityEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a certificate authority.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainCertificateAuthority> getTelephonyProvidersEdgesCertificateauthorityAsync(GetTelephonyProvidersEdgesCertificateauthorityRequest request, AsyncApiCallback<DomainCertificateAuthority> callback) {
    try {
      SettableFuture<DomainCertificateAuthority> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainCertificateAuthority>() {}, new AsyncApiCallback<ApiResponse<DomainCertificateAuthority>>() {
        @Override
        public void onCompleted(ApiResponse<DomainCertificateAuthority> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a certificate authority.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainCertificateAuthority>> getTelephonyProvidersEdgesCertificateauthorityAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainCertificateAuthority>> callback) {
    try {
      SettableFuture<ApiResponse<DomainCertificateAuthority>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainCertificateAuthority>() {}, new AsyncApiCallback<ApiResponse<DomainCertificateAuthority>>() {
        @Override
        public void onCompleted(ApiResponse<DomainCertificateAuthority> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainCertificateAuthority> response = (ApiResponse<DomainCertificateAuthority>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainCertificateAuthority> response = (ApiResponse<DomainCertificateAuthority>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a DID by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DID> getTelephonyProvidersEdgesDidAsync(GetTelephonyProvidersEdgesDidRequest request, AsyncApiCallback<DID> callback) {
    try {
      SettableFuture<DID> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DID>() {}, new AsyncApiCallback<ApiResponse<DID>>() {
        @Override
        public void onCompleted(ApiResponse<DID> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a DID by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DID>> getTelephonyProvidersEdgesDidAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DID>> callback) {
    try {
      SettableFuture<ApiResponse<DID>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DID>() {}, new AsyncApiCallback<ApiResponse<DID>>() {
        @Override
        public void onCompleted(ApiResponse<DID> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DID> response = (ApiResponse<DID>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DID> response = (ApiResponse<DID>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a DID Pool by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DIDPool> getTelephonyProvidersEdgesDidpoolAsync(GetTelephonyProvidersEdgesDidpoolRequest request, AsyncApiCallback<DIDPool> callback) {
    try {
      SettableFuture<DIDPool> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DIDPool>() {}, new AsyncApiCallback<ApiResponse<DIDPool>>() {
        @Override
        public void onCompleted(ApiResponse<DIDPool> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a DID Pool by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DIDPool>> getTelephonyProvidersEdgesDidpoolAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DIDPool>> callback) {
    try {
      SettableFuture<ApiResponse<DIDPool>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DIDPool>() {}, new AsyncApiCallback<ApiResponse<DIDPool>>() {
        @Override
        public void onCompleted(ApiResponse<DIDPool> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DIDPool> response = (ApiResponse<DIDPool>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DIDPool> response = (ApiResponse<DIDPool>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a listing of DID Pools
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DIDPoolEntityListing> getTelephonyProvidersEdgesDidpoolsAsync(GetTelephonyProvidersEdgesDidpoolsRequest request, AsyncApiCallback<DIDPoolEntityListing> callback) {
    try {
      SettableFuture<DIDPoolEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DIDPoolEntityListing>() {}, new AsyncApiCallback<ApiResponse<DIDPoolEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DIDPoolEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a listing of DID Pools
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DIDPoolEntityListing>> getTelephonyProvidersEdgesDidpoolsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DIDPoolEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<DIDPoolEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DIDPoolEntityListing>() {}, new AsyncApiCallback<ApiResponse<DIDPoolEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DIDPoolEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DIDPoolEntityListing> response = (ApiResponse<DIDPoolEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DIDPoolEntityListing> response = (ApiResponse<DIDPoolEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a listing of DIDs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DIDEntityListing> getTelephonyProvidersEdgesDidsAsync(GetTelephonyProvidersEdgesDidsRequest request, AsyncApiCallback<DIDEntityListing> callback) {
    try {
      SettableFuture<DIDEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DIDEntityListing>() {}, new AsyncApiCallback<ApiResponse<DIDEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DIDEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a listing of DIDs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DIDEntityListing>> getTelephonyProvidersEdgesDidsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DIDEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<DIDEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DIDEntityListing>() {}, new AsyncApiCallback<ApiResponse<DIDEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DIDEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DIDEntityListing> response = (ApiResponse<DIDEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DIDEntityListing> response = (ApiResponse<DIDEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get edge group.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeGroup> getTelephonyProvidersEdgesEdgegroupAsync(GetTelephonyProvidersEdgesEdgegroupRequest request, AsyncApiCallback<EdgeGroup> callback) {
    try {
      SettableFuture<EdgeGroup> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeGroup>() {}, new AsyncApiCallback<ApiResponse<EdgeGroup>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeGroup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get edge group.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeGroup>> getTelephonyProvidersEdgesEdgegroupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeGroup>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeGroup>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeGroup>() {}, new AsyncApiCallback<ApiResponse<EdgeGroup>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeGroup> response = (ApiResponse<EdgeGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeGroup> response = (ApiResponse<EdgeGroup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets the edge trunk base associated with the edge group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeTrunkBase> getTelephonyProvidersEdgesEdgegroupEdgetrunkbasisAsync(GetTelephonyProvidersEdgesEdgegroupEdgetrunkbasisRequest request, AsyncApiCallback<EdgeTrunkBase> callback) {
    try {
      SettableFuture<EdgeTrunkBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeTrunkBase>() {}, new AsyncApiCallback<ApiResponse<EdgeTrunkBase>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeTrunkBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets the edge trunk base associated with the edge group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeTrunkBase>> getTelephonyProvidersEdgesEdgegroupEdgetrunkbasisAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeTrunkBase>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeTrunkBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeTrunkBase>() {}, new AsyncApiCallback<ApiResponse<EdgeTrunkBase>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeTrunkBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeTrunkBase> response = (ApiResponse<EdgeTrunkBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeTrunkBase> response = (ApiResponse<EdgeTrunkBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of edge groups.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeGroupEntityListing> getTelephonyProvidersEdgesEdgegroupsAsync(GetTelephonyProvidersEdgesEdgegroupsRequest request, AsyncApiCallback<EdgeGroupEntityListing> callback) {
    try {
      SettableFuture<EdgeGroupEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeGroupEntityListing>() {}, new AsyncApiCallback<ApiResponse<EdgeGroupEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeGroupEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of edge groups.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeGroupEntityListing>> getTelephonyProvidersEdgesEdgegroupsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeGroupEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeGroupEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeGroupEntityListing>() {}, new AsyncApiCallback<ApiResponse<EdgeGroupEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeGroupEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeGroupEntityListing> response = (ApiResponse<EdgeGroupEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeGroupEntityListing> response = (ApiResponse<EdgeGroupEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeVersionReport> getTelephonyProvidersEdgesEdgeversionreportAsync(GetTelephonyProvidersEdgesEdgeversionreportRequest request, AsyncApiCallback<EdgeVersionReport> callback) {
    try {
      SettableFuture<EdgeVersionReport> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeVersionReport>() {}, new AsyncApiCallback<ApiResponse<EdgeVersionReport>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeVersionReport> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the edge version report.
   * The report will not have consistent data about the edge version(s) until all edges have been reset.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeVersionReport>> getTelephonyProvidersEdgesEdgeversionreportAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EdgeVersionReport>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeVersionReport>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeVersionReport>() {}, new AsyncApiCallback<ApiResponse<EdgeVersionReport>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeVersionReport> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeVersionReport> response = (ApiResponse<EdgeVersionReport>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeVersionReport> response = (ApiResponse<EdgeVersionReport>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get endpoint
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Endpoint> getTelephonyProvidersEdgesEndpointAsync(GetTelephonyProvidersEdgesEndpointRequest request, AsyncApiCallback<Endpoint> callback) {
    try {
      SettableFuture<Endpoint> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Endpoint>() {}, new AsyncApiCallback<ApiResponse<Endpoint>>() {
        @Override
        public void onCompleted(ApiResponse<Endpoint> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get endpoint
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Endpoint>> getTelephonyProvidersEdgesEndpointAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Endpoint>> callback) {
    try {
      SettableFuture<ApiResponse<Endpoint>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Endpoint>() {}, new AsyncApiCallback<ApiResponse<Endpoint>>() {
        @Override
        public void onCompleted(ApiResponse<Endpoint> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Endpoint> response = (ApiResponse<Endpoint>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Endpoint> response = (ApiResponse<Endpoint>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get endpoints
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EndpointEntityListing> getTelephonyProvidersEdgesEndpointsAsync(GetTelephonyProvidersEdgesEndpointsRequest request, AsyncApiCallback<EndpointEntityListing> callback) {
    try {
      SettableFuture<EndpointEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EndpointEntityListing>() {}, new AsyncApiCallback<ApiResponse<EndpointEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EndpointEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get endpoints
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EndpointEntityListing>> getTelephonyProvidersEdgesEndpointsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EndpointEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<EndpointEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EndpointEntityListing>() {}, new AsyncApiCallback<ApiResponse<EndpointEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EndpointEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EndpointEntityListing> response = (ApiResponse<EndpointEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EndpointEntityListing> response = (ApiResponse<EndpointEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an extension by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Extension> getTelephonyProvidersEdgesExtensionAsync(GetTelephonyProvidersEdgesExtensionRequest request, AsyncApiCallback<Extension> callback) {
    try {
      SettableFuture<Extension> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Extension>() {}, new AsyncApiCallback<ApiResponse<Extension>>() {
        @Override
        public void onCompleted(ApiResponse<Extension> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an extension by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Extension>> getTelephonyProvidersEdgesExtensionAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Extension>> callback) {
    try {
      SettableFuture<ApiResponse<Extension>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Extension>() {}, new AsyncApiCallback<ApiResponse<Extension>>() {
        @Override
        public void onCompleted(ApiResponse<Extension> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Extension> response = (ApiResponse<Extension>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Extension> response = (ApiResponse<Extension>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an extension pool by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExtensionPool> getTelephonyProvidersEdgesExtensionpoolAsync(GetTelephonyProvidersEdgesExtensionpoolRequest request, AsyncApiCallback<ExtensionPool> callback) {
    try {
      SettableFuture<ExtensionPool> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExtensionPool>() {}, new AsyncApiCallback<ApiResponse<ExtensionPool>>() {
        @Override
        public void onCompleted(ApiResponse<ExtensionPool> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an extension pool by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExtensionPool>> getTelephonyProvidersEdgesExtensionpoolAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ExtensionPool>> callback) {
    try {
      SettableFuture<ApiResponse<ExtensionPool>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExtensionPool>() {}, new AsyncApiCallback<ApiResponse<ExtensionPool>>() {
        @Override
        public void onCompleted(ApiResponse<ExtensionPool> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExtensionPool> response = (ApiResponse<ExtensionPool>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExtensionPool> response = (ApiResponse<ExtensionPool>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a listing of extension pools
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExtensionPoolEntityListing> getTelephonyProvidersEdgesExtensionpoolsAsync(GetTelephonyProvidersEdgesExtensionpoolsRequest request, AsyncApiCallback<ExtensionPoolEntityListing> callback) {
    try {
      SettableFuture<ExtensionPoolEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExtensionPoolEntityListing>() {}, new AsyncApiCallback<ApiResponse<ExtensionPoolEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ExtensionPoolEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a listing of extension pools
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExtensionPoolEntityListing>> getTelephonyProvidersEdgesExtensionpoolsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ExtensionPoolEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<ExtensionPoolEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExtensionPoolEntityListing>() {}, new AsyncApiCallback<ApiResponse<ExtensionPoolEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ExtensionPoolEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExtensionPoolEntityListing> response = (ApiResponse<ExtensionPoolEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExtensionPoolEntityListing> response = (ApiResponse<ExtensionPoolEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a listing of extensions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExtensionEntityListing> getTelephonyProvidersEdgesExtensionsAsync(GetTelephonyProvidersEdgesExtensionsRequest request, AsyncApiCallback<ExtensionEntityListing> callback) {
    try {
      SettableFuture<ExtensionEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExtensionEntityListing>() {}, new AsyncApiCallback<ApiResponse<ExtensionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ExtensionEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a listing of extensions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExtensionEntityListing>> getTelephonyProvidersEdgesExtensionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ExtensionEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<ExtensionEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExtensionEntityListing>() {}, new AsyncApiCallback<ApiResponse<ExtensionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ExtensionEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExtensionEntityListing> response = (ApiResponse<ExtensionEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExtensionEntityListing> response = (ApiResponse<ExtensionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Line by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Line> getTelephonyProvidersEdgesLineAsync(GetTelephonyProvidersEdgesLineRequest request, AsyncApiCallback<Line> callback) {
    try {
      SettableFuture<Line> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Line>() {}, new AsyncApiCallback<ApiResponse<Line>>() {
        @Override
        public void onCompleted(ApiResponse<Line> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Line by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Line>> getTelephonyProvidersEdgesLineAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Line>> callback) {
    try {
      SettableFuture<ApiResponse<Line>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Line>() {}, new AsyncApiCallback<ApiResponse<Line>>() {
        @Override
        public void onCompleted(ApiResponse<Line> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Line> response = (ApiResponse<Line>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Line> response = (ApiResponse<Line>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a line base settings object by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LineBase> getTelephonyProvidersEdgesLinebasesettingAsync(GetTelephonyProvidersEdgesLinebasesettingRequest request, AsyncApiCallback<LineBase> callback) {
    try {
      SettableFuture<LineBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LineBase>() {}, new AsyncApiCallback<ApiResponse<LineBase>>() {
        @Override
        public void onCompleted(ApiResponse<LineBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a line base settings object by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LineBase>> getTelephonyProvidersEdgesLinebasesettingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LineBase>> callback) {
    try {
      SettableFuture<ApiResponse<LineBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LineBase>() {}, new AsyncApiCallback<ApiResponse<LineBase>>() {
        @Override
        public void onCompleted(ApiResponse<LineBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LineBase> response = (ApiResponse<LineBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LineBase> response = (ApiResponse<LineBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a listing of line base settings objects
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LineBaseEntityListing> getTelephonyProvidersEdgesLinebasesettingsAsync(GetTelephonyProvidersEdgesLinebasesettingsRequest request, AsyncApiCallback<LineBaseEntityListing> callback) {
    try {
      SettableFuture<LineBaseEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LineBaseEntityListing>() {}, new AsyncApiCallback<ApiResponse<LineBaseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LineBaseEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a listing of line base settings objects
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LineBaseEntityListing>> getTelephonyProvidersEdgesLinebasesettingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LineBaseEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<LineBaseEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LineBaseEntityListing>() {}, new AsyncApiCallback<ApiResponse<LineBaseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LineBaseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LineBaseEntityListing> response = (ApiResponse<LineBaseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LineBaseEntityListing> response = (ApiResponse<LineBaseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of Lines
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LineEntityListing> getTelephonyProvidersEdgesLinesAsync(GetTelephonyProvidersEdgesLinesRequest request, AsyncApiCallback<LineEntityListing> callback) {
    try {
      SettableFuture<LineEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LineEntityListing>() {}, new AsyncApiCallback<ApiResponse<LineEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LineEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of Lines
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LineEntityListing>> getTelephonyProvidersEdgesLinesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LineEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<LineEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LineEntityListing>() {}, new AsyncApiCallback<ApiResponse<LineEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LineEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LineEntityListing> response = (ApiResponse<LineEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LineEntityListing> response = (ApiResponse<LineEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Line> getTelephonyProvidersEdgesLinesTemplateAsync(GetTelephonyProvidersEdgesLinesTemplateRequest request, AsyncApiCallback<Line> callback) {
    try {
      SettableFuture<Line> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Line>() {}, new AsyncApiCallback<ApiResponse<Line>>() {
        @Override
        public void onCompleted(ApiResponse<Line> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Line>> getTelephonyProvidersEdgesLinesTemplateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Line>> callback) {
    try {
      SettableFuture<ApiResponse<Line>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Line>() {}, new AsyncApiCallback<ApiResponse<Line>>() {
        @Override
        public void onCompleted(ApiResponse<Line> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Line> response = (ApiResponse<Line>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Line> response = (ApiResponse<Line>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get edge logical interfaces.
   * Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LogicalInterfaceEntityListing> getTelephonyProvidersEdgesLogicalinterfacesAsync(GetTelephonyProvidersEdgesLogicalinterfacesRequest request, AsyncApiCallback<LogicalInterfaceEntityListing> callback) {
    try {
      SettableFuture<LogicalInterfaceEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LogicalInterfaceEntityListing>() {}, new AsyncApiCallback<ApiResponse<LogicalInterfaceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LogicalInterfaceEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get edge logical interfaces.
   * Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LogicalInterfaceEntityListing>> getTelephonyProvidersEdgesLogicalinterfacesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LogicalInterfaceEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<LogicalInterfaceEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LogicalInterfaceEntityListing>() {}, new AsyncApiCallback<ApiResponse<LogicalInterfaceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LogicalInterfaceEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LogicalInterfaceEntityListing> response = (ApiResponse<LogicalInterfaceEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LogicalInterfaceEntityListing> response = (ApiResponse<LogicalInterfaceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get outbound route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutboundRoute> getTelephonyProvidersEdgesOutboundrouteAsync(GetTelephonyProvidersEdgesOutboundrouteRequest request, AsyncApiCallback<OutboundRoute> callback) {
    try {
      SettableFuture<OutboundRoute> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutboundRoute>() {}, new AsyncApiCallback<ApiResponse<OutboundRoute>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRoute> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get outbound route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutboundRoute>> getTelephonyProvidersEdgesOutboundrouteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OutboundRoute>> callback) {
    try {
      SettableFuture<ApiResponse<OutboundRoute>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutboundRoute>() {}, new AsyncApiCallback<ApiResponse<OutboundRoute>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRoute> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRoute> response = (ApiResponse<OutboundRoute>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRoute> response = (ApiResponse<OutboundRoute>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get outbound routes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutboundRouteEntityListing> getTelephonyProvidersEdgesOutboundroutesAsync(GetTelephonyProvidersEdgesOutboundroutesRequest request, AsyncApiCallback<OutboundRouteEntityListing> callback) {
    try {
      SettableFuture<OutboundRouteEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutboundRouteEntityListing>() {}, new AsyncApiCallback<ApiResponse<OutboundRouteEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRouteEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get outbound routes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutboundRouteEntityListing>> getTelephonyProvidersEdgesOutboundroutesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OutboundRouteEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<OutboundRouteEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutboundRouteEntityListing>() {}, new AsyncApiCallback<ApiResponse<OutboundRouteEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRouteEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRouteEntityListing> response = (ApiResponse<OutboundRouteEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRouteEntityListing> response = (ApiResponse<OutboundRouteEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Phone by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Phone> getTelephonyProvidersEdgesPhoneAsync(GetTelephonyProvidersEdgesPhoneRequest request, AsyncApiCallback<Phone> callback) {
    try {
      SettableFuture<Phone> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Phone>() {}, new AsyncApiCallback<ApiResponse<Phone>>() {
        @Override
        public void onCompleted(ApiResponse<Phone> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Phone by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Phone>> getTelephonyProvidersEdgesPhoneAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Phone>> callback) {
    try {
      SettableFuture<ApiResponse<Phone>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Phone>() {}, new AsyncApiCallback<ApiResponse<Phone>>() {
        @Override
        public void onCompleted(ApiResponse<Phone> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PhoneBase> getTelephonyProvidersEdgesPhonebasesettingAsync(GetTelephonyProvidersEdgesPhonebasesettingRequest request, AsyncApiCallback<PhoneBase> callback) {
    try {
      SettableFuture<PhoneBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PhoneBase>() {}, new AsyncApiCallback<ApiResponse<PhoneBase>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Phone Base Settings object by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PhoneBase>> getTelephonyProvidersEdgesPhonebasesettingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PhoneBase>> callback) {
    try {
      SettableFuture<ApiResponse<PhoneBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PhoneBase>() {}, new AsyncApiCallback<ApiResponse<PhoneBase>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PhoneBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettingsAsync(GetTelephonyProvidersEdgesPhonebasesettingsRequest request, AsyncApiCallback<PhoneBaseEntityListing> callback) {
    try {
      SettableFuture<PhoneBaseEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PhoneBaseEntityListing>() {}, new AsyncApiCallback<ApiResponse<PhoneBaseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneBaseEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of Phone Base Settings objects
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PhoneBaseEntityListing>> getTelephonyProvidersEdgesPhonebasesettingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PhoneBaseEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<PhoneBaseEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PhoneBaseEntityListing>() {}, new AsyncApiCallback<ApiResponse<PhoneBaseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneBaseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneBaseEntityListing> response = (ApiResponse<PhoneBaseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneBaseEntityListing> response = (ApiResponse<PhoneBaseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PhoneMetaBaseEntityListing> getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesAsync(GetTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesRequest request, AsyncApiCallback<PhoneMetaBaseEntityListing> callback) {
    try {
      SettableFuture<PhoneMetaBaseEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PhoneMetaBaseEntityListing>() {}, new AsyncApiCallback<ApiResponse<PhoneMetaBaseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneMetaBaseEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of available makes and models to create a new Phone Base Settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PhoneMetaBaseEntityListing>> getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabasesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PhoneMetaBaseEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<PhoneMetaBaseEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PhoneMetaBaseEntityListing>() {}, new AsyncApiCallback<ApiResponse<PhoneMetaBaseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneMetaBaseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneMetaBaseEntityListing> response = (ApiResponse<PhoneMetaBaseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneMetaBaseEntityListing> response = (ApiResponse<PhoneMetaBaseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PhoneBase> getTelephonyProvidersEdgesPhonebasesettingsTemplateAsync(GetTelephonyProvidersEdgesPhonebasesettingsTemplateRequest request, AsyncApiCallback<PhoneBase> callback) {
    try {
      SettableFuture<PhoneBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PhoneBase>() {}, new AsyncApiCallback<ApiResponse<PhoneBase>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PhoneBase>> getTelephonyProvidersEdgesPhonebasesettingsTemplateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PhoneBase>> callback) {
    try {
      SettableFuture<ApiResponse<PhoneBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PhoneBase>() {}, new AsyncApiCallback<ApiResponse<PhoneBase>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of Phone Instances
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PhoneEntityListing> getTelephonyProvidersEdgesPhonesAsync(GetTelephonyProvidersEdgesPhonesRequest request, AsyncApiCallback<PhoneEntityListing> callback) {
    try {
      SettableFuture<PhoneEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PhoneEntityListing>() {}, new AsyncApiCallback<ApiResponse<PhoneEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of Phone Instances
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PhoneEntityListing>> getTelephonyProvidersEdgesPhonesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PhoneEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<PhoneEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PhoneEntityListing>() {}, new AsyncApiCallback<ApiResponse<PhoneEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneEntityListing> response = (ApiResponse<PhoneEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneEntityListing> response = (ApiResponse<PhoneEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Phone> getTelephonyProvidersEdgesPhonesTemplateAsync(GetTelephonyProvidersEdgesPhonesTemplateRequest request, AsyncApiCallback<Phone> callback) {
    try {
      SettableFuture<Phone> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Phone>() {}, new AsyncApiCallback<ApiResponse<Phone>>() {
        @Override
        public void onCompleted(ApiResponse<Phone> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Phone>> getTelephonyProvidersEdgesPhonesTemplateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Phone>> callback) {
    try {
      SettableFuture<ApiResponse<Phone>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Phone>() {}, new AsyncApiCallback<ApiResponse<Phone>>() {
        @Override
        public void onCompleted(ApiResponse<Phone> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get physical interfaces for edges.
   * Retrieves a list of all configured physical interfaces for a list of edges. Only 100 edges can be requested at a time.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<DomainPhysicalInterface>> getTelephonyProvidersEdgesPhysicalinterfacesAsync(GetTelephonyProvidersEdgesPhysicalinterfacesRequest request, AsyncApiCallback<List<DomainPhysicalInterface>> callback) {
    try {
      SettableFuture<List<DomainPhysicalInterface>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<DomainPhysicalInterface>>() {}, new AsyncApiCallback<ApiResponse<List<DomainPhysicalInterface>>>() {
        @Override
        public void onCompleted(ApiResponse<List<DomainPhysicalInterface>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get physical interfaces for edges.
   * Retrieves a list of all configured physical interfaces for a list of edges. Only 100 edges can be requested at a time.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<DomainPhysicalInterface>>> getTelephonyProvidersEdgesPhysicalinterfacesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<DomainPhysicalInterface>>> callback) {
    try {
      SettableFuture<ApiResponse<List<DomainPhysicalInterface>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<DomainPhysicalInterface>>() {}, new AsyncApiCallback<ApiResponse<List<DomainPhysicalInterface>>>() {
        @Override
        public void onCompleted(ApiResponse<List<DomainPhysicalInterface>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<DomainPhysicalInterface>> response = (ApiResponse<List<DomainPhysicalInterface>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<DomainPhysicalInterface>> response = (ApiResponse<List<DomainPhysicalInterface>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Site by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Site> getTelephonyProvidersEdgesSiteAsync(GetTelephonyProvidersEdgesSiteRequest request, AsyncApiCallback<Site> callback) {
    try {
      SettableFuture<Site> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Site>() {}, new AsyncApiCallback<ApiResponse<Site>>() {
        @Override
        public void onCompleted(ApiResponse<Site> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Site by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Site>> getTelephonyProvidersEdgesSiteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Site>> callback) {
    try {
      SettableFuture<ApiResponse<Site>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Site>() {}, new AsyncApiCallback<ApiResponse<Site>>() {
        @Override
        public void onCompleted(ApiResponse<Site> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Site> response = (ApiResponse<Site>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Site> response = (ApiResponse<Site>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Number Plan by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NumberPlan> getTelephonyProvidersEdgesSiteNumberplanAsync(GetTelephonyProvidersEdgesSiteNumberplanRequest request, AsyncApiCallback<NumberPlan> callback) {
    try {
      SettableFuture<NumberPlan> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NumberPlan>() {}, new AsyncApiCallback<ApiResponse<NumberPlan>>() {
        @Override
        public void onCompleted(ApiResponse<NumberPlan> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Number Plan by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NumberPlan>> getTelephonyProvidersEdgesSiteNumberplanAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<NumberPlan>> callback) {
    try {
      SettableFuture<ApiResponse<NumberPlan>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NumberPlan>() {}, new AsyncApiCallback<ApiResponse<NumberPlan>>() {
        @Override
        public void onCompleted(ApiResponse<NumberPlan> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NumberPlan> response = (ApiResponse<NumberPlan>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NumberPlan> response = (ApiResponse<NumberPlan>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Number Plans for this Site.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<NumberPlan>> getTelephonyProvidersEdgesSiteNumberplansAsync(GetTelephonyProvidersEdgesSiteNumberplansRequest request, AsyncApiCallback<List<NumberPlan>> callback) {
    try {
      SettableFuture<List<NumberPlan>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<NumberPlan>>() {}, new AsyncApiCallback<ApiResponse<List<NumberPlan>>>() {
        @Override
        public void onCompleted(ApiResponse<List<NumberPlan>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Number Plans for this Site.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<NumberPlan>>> getTelephonyProvidersEdgesSiteNumberplansAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<NumberPlan>>> callback) {
    try {
      SettableFuture<ApiResponse<List<NumberPlan>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<NumberPlan>>() {}, new AsyncApiCallback<ApiResponse<List<NumberPlan>>>() {
        @Override
        public void onCompleted(ApiResponse<List<NumberPlan>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<NumberPlan>> response = (ApiResponse<List<NumberPlan>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<NumberPlan>> response = (ApiResponse<List<NumberPlan>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of Classifications for this Site
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<String>> getTelephonyProvidersEdgesSiteNumberplansClassificationsAsync(GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest request, AsyncApiCallback<List<String>> callback) {
    try {
      SettableFuture<List<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of Classifications for this Site
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<String>>> getTelephonyProvidersEdgesSiteNumberplansClassificationsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<String>>> callback) {
    try {
      SettableFuture<ApiResponse<List<String>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an outbound route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutboundRouteBase> getTelephonyProvidersEdgesSiteOutboundrouteAsync(GetTelephonyProvidersEdgesSiteOutboundrouteRequest request, AsyncApiCallback<OutboundRouteBase> callback) {
    try {
      SettableFuture<OutboundRouteBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutboundRouteBase>() {}, new AsyncApiCallback<ApiResponse<OutboundRouteBase>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRouteBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an outbound route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutboundRouteBase>> getTelephonyProvidersEdgesSiteOutboundrouteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OutboundRouteBase>> callback) {
    try {
      SettableFuture<ApiResponse<OutboundRouteBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutboundRouteBase>() {}, new AsyncApiCallback<ApiResponse<OutboundRouteBase>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRouteBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRouteBase> response = (ApiResponse<OutboundRouteBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRouteBase> response = (ApiResponse<OutboundRouteBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get outbound routes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutboundRouteBaseEntityListing> getTelephonyProvidersEdgesSiteOutboundroutesAsync(GetTelephonyProvidersEdgesSiteOutboundroutesRequest request, AsyncApiCallback<OutboundRouteBaseEntityListing> callback) {
    try {
      SettableFuture<OutboundRouteBaseEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutboundRouteBaseEntityListing>() {}, new AsyncApiCallback<ApiResponse<OutboundRouteBaseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRouteBaseEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get outbound routes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutboundRouteBaseEntityListing>> getTelephonyProvidersEdgesSiteOutboundroutesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OutboundRouteBaseEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<OutboundRouteBaseEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutboundRouteBaseEntityListing>() {}, new AsyncApiCallback<ApiResponse<OutboundRouteBaseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRouteBaseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRouteBaseEntityListing> response = (ApiResponse<OutboundRouteBaseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRouteBaseEntityListing> response = (ApiResponse<OutboundRouteBaseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Sites.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SiteEntityListing> getTelephonyProvidersEdgesSitesAsync(GetTelephonyProvidersEdgesSitesRequest request, AsyncApiCallback<SiteEntityListing> callback) {
    try {
      SettableFuture<SiteEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SiteEntityListing>() {}, new AsyncApiCallback<ApiResponse<SiteEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SiteEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Sites.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SiteEntityListing>> getTelephonyProvidersEdgesSitesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SiteEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<SiteEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SiteEntityListing>() {}, new AsyncApiCallback<ApiResponse<SiteEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SiteEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SiteEntityListing> response = (ApiResponse<SiteEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SiteEntityListing> response = (ApiResponse<SiteEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeZoneEntityListing> getTelephonyProvidersEdgesTimezonesAsync(GetTelephonyProvidersEdgesTimezonesRequest request, AsyncApiCallback<TimeZoneEntityListing> callback) {
    try {
      SettableFuture<TimeZoneEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeZoneEntityListing>() {}, new AsyncApiCallback<ApiResponse<TimeZoneEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TimeZoneEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of Edge-compatible time zones
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeZoneEntityListing>> getTelephonyProvidersEdgesTimezonesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TimeZoneEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<TimeZoneEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeZoneEntityListing>() {}, new AsyncApiCallback<ApiResponse<TimeZoneEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TimeZoneEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeZoneEntityListing> response = (ApiResponse<TimeZoneEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeZoneEntityListing> response = (ApiResponse<TimeZoneEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Trunk by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Trunk> getTelephonyProvidersEdgesTrunkAsync(GetTelephonyProvidersEdgesTrunkRequest request, AsyncApiCallback<Trunk> callback) {
    try {
      SettableFuture<Trunk> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Trunk>() {}, new AsyncApiCallback<ApiResponse<Trunk>>() {
        @Override
        public void onCompleted(ApiResponse<Trunk> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Trunk by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Trunk>> getTelephonyProvidersEdgesTrunkAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Trunk>> callback) {
    try {
      SettableFuture<ApiResponse<Trunk>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Trunk>() {}, new AsyncApiCallback<ApiResponse<Trunk>>() {
        @Override
        public void onCompleted(ApiResponse<Trunk> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Trunk> response = (ApiResponse<Trunk>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Trunk> response = (ApiResponse<Trunk>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Trunk Base Settings object by ID
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettingAsync(GetTelephonyProvidersEdgesTrunkbasesettingRequest request, AsyncApiCallback<TrunkBase> callback) {
    try {
      SettableFuture<TrunkBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TrunkBase>() {}, new AsyncApiCallback<ApiResponse<TrunkBase>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Trunk Base Settings object by ID
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TrunkBase>> getTelephonyProvidersEdgesTrunkbasesettingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TrunkBase>> callback) {
    try {
      SettableFuture<ApiResponse<TrunkBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TrunkBase>() {}, new AsyncApiCallback<ApiResponse<TrunkBase>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Trunk Base Settings listing
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TrunkBaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettingsAsync(GetTelephonyProvidersEdgesTrunkbasesettingsRequest request, AsyncApiCallback<TrunkBaseEntityListing> callback) {
    try {
      SettableFuture<TrunkBaseEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TrunkBaseEntityListing>() {}, new AsyncApiCallback<ApiResponse<TrunkBaseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkBaseEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Trunk Base Settings listing
   * Managed properties will not be returned unless the user is assigned the managed:all:all permission.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TrunkBaseEntityListing>> getTelephonyProvidersEdgesTrunkbasesettingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TrunkBaseEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<TrunkBaseEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TrunkBaseEntityListing>() {}, new AsyncApiCallback<ApiResponse<TrunkBaseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkBaseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkBaseEntityListing> response = (ApiResponse<TrunkBaseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkBaseEntityListing> response = (ApiResponse<TrunkBaseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TrunkMetabaseEntityListing> getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesAsync(GetTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesRequest request, AsyncApiCallback<TrunkMetabaseEntityListing> callback) {
    try {
      SettableFuture<TrunkMetabaseEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TrunkMetabaseEntityListing>() {}, new AsyncApiCallback<ApiResponse<TrunkMetabaseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkMetabaseEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of available makes and models to create a new Trunk Base Settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TrunkMetabaseEntityListing>> getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabasesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TrunkMetabaseEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<TrunkMetabaseEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TrunkMetabaseEntityListing>() {}, new AsyncApiCallback<ApiResponse<TrunkMetabaseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkMetabaseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkMetabaseEntityListing> response = (ApiResponse<TrunkMetabaseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkMetabaseEntityListing> response = (ApiResponse<TrunkMetabaseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TrunkBase> getTelephonyProvidersEdgesTrunkbasesettingsTemplateAsync(GetTelephonyProvidersEdgesTrunkbasesettingsTemplateRequest request, AsyncApiCallback<TrunkBase> callback) {
    try {
      SettableFuture<TrunkBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TrunkBase>() {}, new AsyncApiCallback<ApiResponse<TrunkBase>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TrunkBase>> getTelephonyProvidersEdgesTrunkbasesettingsTemplateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TrunkBase>> callback) {
    try {
      SettableFuture<ApiResponse<TrunkBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TrunkBase>() {}, new AsyncApiCallback<ApiResponse<TrunkBase>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of available trunks.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TrunkEntityListing> getTelephonyProvidersEdgesTrunksAsync(GetTelephonyProvidersEdgesTrunksRequest request, AsyncApiCallback<TrunkEntityListing> callback) {
    try {
      SettableFuture<TrunkEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TrunkEntityListing>() {}, new AsyncApiCallback<ApiResponse<TrunkEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of available trunks.
   * Trunks are created by assigning trunk base settings to an Edge or Edge Group.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TrunkEntityListing>> getTelephonyProvidersEdgesTrunksAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TrunkEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<TrunkEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TrunkEntityListing>() {}, new AsyncApiCallback<ApiResponse<TrunkEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkEntityListing> response = (ApiResponse<TrunkEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkEntityListing> response = (ApiResponse<TrunkEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TrunkRecordingEnabledCount> getTelephonyProvidersEdgesTrunkswithrecordingAsync(GetTelephonyProvidersEdgesTrunkswithrecordingRequest request, AsyncApiCallback<TrunkRecordingEnabledCount> callback) {
    try {
      SettableFuture<TrunkRecordingEnabledCount> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TrunkRecordingEnabledCount>() {}, new AsyncApiCallback<ApiResponse<TrunkRecordingEnabledCount>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkRecordingEnabledCount> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Counts of trunks that have recording disabled or enabled
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TrunkRecordingEnabledCount>> getTelephonyProvidersEdgesTrunkswithrecordingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TrunkRecordingEnabledCount>> callback) {
    try {
      SettableFuture<ApiResponse<TrunkRecordingEnabledCount>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TrunkRecordingEnabledCount>() {}, new AsyncApiCallback<ApiResponse<TrunkRecordingEnabledCount>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkRecordingEnabledCount> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkRecordingEnabledCount> response = (ApiResponse<TrunkRecordingEnabledCount>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkRecordingEnabledCount> response = (ApiResponse<TrunkRecordingEnabledCount>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an edge logical interface.
   * Create
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainLogicalInterface> postTelephonyProvidersEdgeLogicalinterfacesAsync(PostTelephonyProvidersEdgeLogicalinterfacesRequest request, AsyncApiCallback<DomainLogicalInterface> callback) {
    try {
      SettableFuture<DomainLogicalInterface> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainLogicalInterface>() {}, new AsyncApiCallback<ApiResponse<DomainLogicalInterface>>() {
        @Override
        public void onCompleted(ApiResponse<DomainLogicalInterface> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an edge logical interface.
   * Create
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainLogicalInterface>> postTelephonyProvidersEdgeLogicalinterfacesAsync(ApiRequest<DomainLogicalInterface> request, AsyncApiCallback<ApiResponse<DomainLogicalInterface>> callback) {
    try {
      SettableFuture<ApiResponse<DomainLogicalInterface>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainLogicalInterface>() {}, new AsyncApiCallback<ApiResponse<DomainLogicalInterface>>() {
        @Override
        public void onCompleted(ApiResponse<DomainLogicalInterface> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainLogicalInterface> response = (ApiResponse<DomainLogicalInterface>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainLogicalInterface> response = (ApiResponse<DomainLogicalInterface>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postTelephonyProvidersEdgeLogsJobUploadAsync(PostTelephonyProvidersEdgeLogsJobUploadRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Request that the specified fileIds be uploaded from the Edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postTelephonyProvidersEdgeLogsJobUploadAsync(ApiRequest<EdgeLogsJobUploadRequest> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeLogsJobResponse> postTelephonyProvidersEdgeLogsJobsAsync(PostTelephonyProvidersEdgeLogsJobsRequest request, AsyncApiCallback<EdgeLogsJobResponse> callback) {
    try {
      SettableFuture<EdgeLogsJobResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeLogsJobResponse>() {}, new AsyncApiCallback<ApiResponse<EdgeLogsJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeLogsJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a job to upload a list of Edge logs.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeLogsJobResponse>> postTelephonyProvidersEdgeLogsJobsAsync(ApiRequest<EdgeLogsJobRequest> request, AsyncApiCallback<ApiResponse<EdgeLogsJobResponse>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeLogsJobResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeLogsJobResponse>() {}, new AsyncApiCallback<ApiResponse<EdgeLogsJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeLogsJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeLogsJobResponse> response = (ApiResponse<EdgeLogsJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeLogsJobResponse> response = (ApiResponse<EdgeLogsJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reboot an Edge
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> postTelephonyProvidersEdgeRebootAsync(PostTelephonyProvidersEdgeRebootRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reboot an Edge
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> postTelephonyProvidersEdgeRebootAsync(ApiRequest<EdgeRebootParameters> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Starts a software update for this edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainEdgeSoftwareUpdateDto> postTelephonyProvidersEdgeSoftwareupdateAsync(PostTelephonyProvidersEdgeSoftwareupdateRequest request, AsyncApiCallback<DomainEdgeSoftwareUpdateDto> callback) {
    try {
      SettableFuture<DomainEdgeSoftwareUpdateDto> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainEdgeSoftwareUpdateDto>() {}, new AsyncApiCallback<ApiResponse<DomainEdgeSoftwareUpdateDto>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEdgeSoftwareUpdateDto> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Starts a software update for this edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainEdgeSoftwareUpdateDto>> postTelephonyProvidersEdgeSoftwareupdateAsync(ApiRequest<DomainEdgeSoftwareUpdateDto> request, AsyncApiCallback<ApiResponse<DomainEdgeSoftwareUpdateDto>> callback) {
    try {
      SettableFuture<ApiResponse<DomainEdgeSoftwareUpdateDto>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainEdgeSoftwareUpdateDto>() {}, new AsyncApiCallback<ApiResponse<DomainEdgeSoftwareUpdateDto>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEdgeSoftwareUpdateDto> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEdgeSoftwareUpdateDto> response = (ApiResponse<DomainEdgeSoftwareUpdateDto>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEdgeSoftwareUpdateDto> response = (ApiResponse<DomainEdgeSoftwareUpdateDto>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Take an Edge in or out of service
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> postTelephonyProvidersEdgeStatuscodeAsync(PostTelephonyProvidersEdgeStatuscodeRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Take an Edge in or out of service
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> postTelephonyProvidersEdgeStatuscodeAsync(ApiRequest<EdgeServiceStateRequest> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Unpair an Edge
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> postTelephonyProvidersEdgeUnpairAsync(PostTelephonyProvidersEdgeUnpairRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Unpair an Edge
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> postTelephonyProvidersEdgeUnpairAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Edge> postTelephonyProvidersEdgesAsync(PostTelephonyProvidersEdgesRequest request, AsyncApiCallback<Edge> callback) {
    try {
      SettableFuture<Edge> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Edge>() {}, new AsyncApiCallback<ApiResponse<Edge>>() {
        @Override
        public void onCompleted(ApiResponse<Edge> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Edge>> postTelephonyProvidersEdgesAsync(ApiRequest<Edge> request, AsyncApiCallback<ApiResponse<Edge>> callback) {
    try {
      SettableFuture<ApiResponse<Edge>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Edge>() {}, new AsyncApiCallback<ApiResponse<Edge>>() {
        @Override
        public void onCompleted(ApiResponse<Edge> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Edge> response = (ApiResponse<Edge>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Edge> response = (ApiResponse<Edge>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Validates a street address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ValidateAddressResponse> postTelephonyProvidersEdgesAddressvalidationAsync(PostTelephonyProvidersEdgesAddressvalidationRequest request, AsyncApiCallback<ValidateAddressResponse> callback) {
    try {
      SettableFuture<ValidateAddressResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ValidateAddressResponse>() {}, new AsyncApiCallback<ApiResponse<ValidateAddressResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ValidateAddressResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Validates a street address
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ValidateAddressResponse>> postTelephonyProvidersEdgesAddressvalidationAsync(ApiRequest<ValidateAddressRequest> request, AsyncApiCallback<ApiResponse<ValidateAddressResponse>> callback) {
    try {
      SettableFuture<ApiResponse<ValidateAddressResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ValidateAddressResponse>() {}, new AsyncApiCallback<ApiResponse<ValidateAddressResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ValidateAddressResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ValidateAddressResponse> response = (ApiResponse<ValidateAddressResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ValidateAddressResponse> response = (ApiResponse<ValidateAddressResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a certificate authority.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainCertificateAuthority> postTelephonyProvidersEdgesCertificateauthoritiesAsync(PostTelephonyProvidersEdgesCertificateauthoritiesRequest request, AsyncApiCallback<DomainCertificateAuthority> callback) {
    try {
      SettableFuture<DomainCertificateAuthority> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainCertificateAuthority>() {}, new AsyncApiCallback<ApiResponse<DomainCertificateAuthority>>() {
        @Override
        public void onCompleted(ApiResponse<DomainCertificateAuthority> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a certificate authority.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainCertificateAuthority>> postTelephonyProvidersEdgesCertificateauthoritiesAsync(ApiRequest<DomainCertificateAuthority> request, AsyncApiCallback<ApiResponse<DomainCertificateAuthority>> callback) {
    try {
      SettableFuture<ApiResponse<DomainCertificateAuthority>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainCertificateAuthority>() {}, new AsyncApiCallback<ApiResponse<DomainCertificateAuthority>>() {
        @Override
        public void onCompleted(ApiResponse<DomainCertificateAuthority> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainCertificateAuthority> response = (ApiResponse<DomainCertificateAuthority>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainCertificateAuthority> response = (ApiResponse<DomainCertificateAuthority>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new DID pool
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DIDPool> postTelephonyProvidersEdgesDidpoolsAsync(PostTelephonyProvidersEdgesDidpoolsRequest request, AsyncApiCallback<DIDPool> callback) {
    try {
      SettableFuture<DIDPool> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DIDPool>() {}, new AsyncApiCallback<ApiResponse<DIDPool>>() {
        @Override
        public void onCompleted(ApiResponse<DIDPool> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new DID pool
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DIDPool>> postTelephonyProvidersEdgesDidpoolsAsync(ApiRequest<DIDPool> request, AsyncApiCallback<ApiResponse<DIDPool>> callback) {
    try {
      SettableFuture<ApiResponse<DIDPool>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DIDPool>() {}, new AsyncApiCallback<ApiResponse<DIDPool>>() {
        @Override
        public void onCompleted(ApiResponse<DIDPool> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DIDPool> response = (ApiResponse<DIDPool>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DIDPool> response = (ApiResponse<DIDPool>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an edge group.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeGroup> postTelephonyProvidersEdgesEdgegroupsAsync(PostTelephonyProvidersEdgesEdgegroupsRequest request, AsyncApiCallback<EdgeGroup> callback) {
    try {
      SettableFuture<EdgeGroup> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeGroup>() {}, new AsyncApiCallback<ApiResponse<EdgeGroup>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeGroup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an edge group.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeGroup>> postTelephonyProvidersEdgesEdgegroupsAsync(ApiRequest<EdgeGroup> request, AsyncApiCallback<ApiResponse<EdgeGroup>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeGroup>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeGroup>() {}, new AsyncApiCallback<ApiResponse<EdgeGroup>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeGroup> response = (ApiResponse<EdgeGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeGroup> response = (ApiResponse<EdgeGroup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create endpoint
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Endpoint> postTelephonyProvidersEdgesEndpointsAsync(PostTelephonyProvidersEdgesEndpointsRequest request, AsyncApiCallback<Endpoint> callback) {
    try {
      SettableFuture<Endpoint> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Endpoint>() {}, new AsyncApiCallback<ApiResponse<Endpoint>>() {
        @Override
        public void onCompleted(ApiResponse<Endpoint> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create endpoint
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Endpoint>> postTelephonyProvidersEdgesEndpointsAsync(ApiRequest<Endpoint> request, AsyncApiCallback<ApiResponse<Endpoint>> callback) {
    try {
      SettableFuture<ApiResponse<Endpoint>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Endpoint>() {}, new AsyncApiCallback<ApiResponse<Endpoint>>() {
        @Override
        public void onCompleted(ApiResponse<Endpoint> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Endpoint> response = (ApiResponse<Endpoint>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Endpoint> response = (ApiResponse<Endpoint>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new extension pool
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExtensionPool> postTelephonyProvidersEdgesExtensionpoolsAsync(PostTelephonyProvidersEdgesExtensionpoolsRequest request, AsyncApiCallback<ExtensionPool> callback) {
    try {
      SettableFuture<ExtensionPool> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExtensionPool>() {}, new AsyncApiCallback<ApiResponse<ExtensionPool>>() {
        @Override
        public void onCompleted(ApiResponse<ExtensionPool> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new extension pool
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExtensionPool>> postTelephonyProvidersEdgesExtensionpoolsAsync(ApiRequest<ExtensionPool> request, AsyncApiCallback<ApiResponse<ExtensionPool>> callback) {
    try {
      SettableFuture<ApiResponse<ExtensionPool>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExtensionPool>() {}, new AsyncApiCallback<ApiResponse<ExtensionPool>>() {
        @Override
        public void onCompleted(ApiResponse<ExtensionPool> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExtensionPool> response = (ApiResponse<ExtensionPool>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExtensionPool> response = (ApiResponse<ExtensionPool>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create outbound rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutboundRoute> postTelephonyProvidersEdgesOutboundroutesAsync(PostTelephonyProvidersEdgesOutboundroutesRequest request, AsyncApiCallback<OutboundRoute> callback) {
    try {
      SettableFuture<OutboundRoute> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutboundRoute>() {}, new AsyncApiCallback<ApiResponse<OutboundRoute>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRoute> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create outbound rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutboundRoute>> postTelephonyProvidersEdgesOutboundroutesAsync(ApiRequest<OutboundRoute> request, AsyncApiCallback<ApiResponse<OutboundRoute>> callback) {
    try {
      SettableFuture<ApiResponse<OutboundRoute>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutboundRoute>() {}, new AsyncApiCallback<ApiResponse<OutboundRoute>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRoute> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRoute> response = (ApiResponse<OutboundRoute>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRoute> response = (ApiResponse<OutboundRoute>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reboot a Phone
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postTelephonyProvidersEdgesPhoneRebootAsync(PostTelephonyProvidersEdgesPhoneRebootRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reboot a Phone
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postTelephonyProvidersEdgesPhoneRebootAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new Phone Base Settings object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PhoneBase> postTelephonyProvidersEdgesPhonebasesettingsAsync(PostTelephonyProvidersEdgesPhonebasesettingsRequest request, AsyncApiCallback<PhoneBase> callback) {
    try {
      SettableFuture<PhoneBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PhoneBase>() {}, new AsyncApiCallback<ApiResponse<PhoneBase>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new Phone Base Settings object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PhoneBase>> postTelephonyProvidersEdgesPhonebasesettingsAsync(ApiRequest<PhoneBase> request, AsyncApiCallback<ApiResponse<PhoneBase>> callback) {
    try {
      SettableFuture<ApiResponse<PhoneBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PhoneBase>() {}, new AsyncApiCallback<ApiResponse<PhoneBase>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new Phone
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Phone> postTelephonyProvidersEdgesPhonesAsync(PostTelephonyProvidersEdgesPhonesRequest request, AsyncApiCallback<Phone> callback) {
    try {
      SettableFuture<Phone> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Phone>() {}, new AsyncApiCallback<ApiResponse<Phone>>() {
        @Override
        public void onCompleted(ApiResponse<Phone> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new Phone
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Phone>> postTelephonyProvidersEdgesPhonesAsync(ApiRequest<Phone> request, AsyncApiCallback<ApiResponse<Phone>> callback) {
    try {
      SettableFuture<ApiResponse<Phone>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Phone>() {}, new AsyncApiCallback<ApiResponse<Phone>>() {
        @Override
        public void onCompleted(ApiResponse<Phone> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reboot Multiple Phones
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postTelephonyProvidersEdgesPhonesRebootAsync(PostTelephonyProvidersEdgesPhonesRebootRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reboot Multiple Phones
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postTelephonyProvidersEdgesPhonesRebootAsync(ApiRequest<PhonesReboot> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create outbound route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutboundRouteBase> postTelephonyProvidersEdgesSiteOutboundroutesAsync(PostTelephonyProvidersEdgesSiteOutboundroutesRequest request, AsyncApiCallback<OutboundRouteBase> callback) {
    try {
      SettableFuture<OutboundRouteBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutboundRouteBase>() {}, new AsyncApiCallback<ApiResponse<OutboundRouteBase>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRouteBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create outbound route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutboundRouteBase>> postTelephonyProvidersEdgesSiteOutboundroutesAsync(ApiRequest<OutboundRouteBase> request, AsyncApiCallback<ApiResponse<OutboundRouteBase>> callback) {
    try {
      SettableFuture<ApiResponse<OutboundRouteBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutboundRouteBase>() {}, new AsyncApiCallback<ApiResponse<OutboundRouteBase>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRouteBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRouteBase> response = (ApiResponse<OutboundRouteBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRouteBase> response = (ApiResponse<OutboundRouteBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Triggers the rebalance operation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postTelephonyProvidersEdgesSiteRebalanceAsync(PostTelephonyProvidersEdgesSiteRebalanceRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Triggers the rebalance operation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postTelephonyProvidersEdgesSiteRebalanceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Site.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Site> postTelephonyProvidersEdgesSitesAsync(PostTelephonyProvidersEdgesSitesRequest request, AsyncApiCallback<Site> callback) {
    try {
      SettableFuture<Site> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Site>() {}, new AsyncApiCallback<ApiResponse<Site>>() {
        @Override
        public void onCompleted(ApiResponse<Site> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Site.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Site>> postTelephonyProvidersEdgesSitesAsync(ApiRequest<Site> request, AsyncApiCallback<ApiResponse<Site>> callback) {
    try {
      SettableFuture<ApiResponse<Site>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Site>() {}, new AsyncApiCallback<ApiResponse<Site>>() {
        @Override
        public void onCompleted(ApiResponse<Site> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Site> response = (ApiResponse<Site>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Site> response = (ApiResponse<Site>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Trunk Base Settings object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TrunkBase> postTelephonyProvidersEdgesTrunkbasesettingsAsync(PostTelephonyProvidersEdgesTrunkbasesettingsRequest request, AsyncApiCallback<TrunkBase> callback) {
    try {
      SettableFuture<TrunkBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TrunkBase>() {}, new AsyncApiCallback<ApiResponse<TrunkBase>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Trunk Base Settings object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TrunkBase>> postTelephonyProvidersEdgesTrunkbasesettingsAsync(ApiRequest<TrunkBase> request, AsyncApiCallback<ApiResponse<TrunkBase>> callback) {
    try {
      SettableFuture<ApiResponse<TrunkBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TrunkBase>() {}, new AsyncApiCallback<ApiResponse<TrunkBase>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Edge> putTelephonyProvidersEdgeAsync(PutTelephonyProvidersEdgeRequest request, AsyncApiCallback<Edge> callback) {
    try {
      SettableFuture<Edge> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Edge>() {}, new AsyncApiCallback<ApiResponse<Edge>>() {
        @Override
        public void onCompleted(ApiResponse<Edge> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a edge.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Edge>> putTelephonyProvidersEdgeAsync(ApiRequest<Edge> request, AsyncApiCallback<ApiResponse<Edge>> callback) {
    try {
      SettableFuture<ApiResponse<Edge>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Edge>() {}, new AsyncApiCallback<ApiResponse<Edge>>() {
        @Override
        public void onCompleted(ApiResponse<Edge> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Edge> response = (ApiResponse<Edge>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Edge> response = (ApiResponse<Edge>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a line.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeLine> putTelephonyProvidersEdgeLineAsync(PutTelephonyProvidersEdgeLineRequest request, AsyncApiCallback<EdgeLine> callback) {
    try {
      SettableFuture<EdgeLine> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeLine>() {}, new AsyncApiCallback<ApiResponse<EdgeLine>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeLine> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a line.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeLine>> putTelephonyProvidersEdgeLineAsync(ApiRequest<EdgeLine> request, AsyncApiCallback<ApiResponse<EdgeLine>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeLine>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeLine>() {}, new AsyncApiCallback<ApiResponse<EdgeLine>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeLine> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeLine> response = (ApiResponse<EdgeLine>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeLine> response = (ApiResponse<EdgeLine>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an edge logical interface.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainLogicalInterface> putTelephonyProvidersEdgeLogicalinterfaceAsync(PutTelephonyProvidersEdgeLogicalinterfaceRequest request, AsyncApiCallback<DomainLogicalInterface> callback) {
    try {
      SettableFuture<DomainLogicalInterface> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainLogicalInterface>() {}, new AsyncApiCallback<ApiResponse<DomainLogicalInterface>>() {
        @Override
        public void onCompleted(ApiResponse<DomainLogicalInterface> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an edge logical interface.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainLogicalInterface>> putTelephonyProvidersEdgeLogicalinterfaceAsync(ApiRequest<DomainLogicalInterface> request, AsyncApiCallback<ApiResponse<DomainLogicalInterface>> callback) {
    try {
      SettableFuture<ApiResponse<DomainLogicalInterface>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainLogicalInterface>() {}, new AsyncApiCallback<ApiResponse<DomainLogicalInterface>>() {
        @Override
        public void onCompleted(ApiResponse<DomainLogicalInterface> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainLogicalInterface> response = (ApiResponse<DomainLogicalInterface>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainLogicalInterface> response = (ApiResponse<DomainLogicalInterface>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a certificate authority.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainCertificateAuthority> putTelephonyProvidersEdgesCertificateauthorityAsync(PutTelephonyProvidersEdgesCertificateauthorityRequest request, AsyncApiCallback<DomainCertificateAuthority> callback) {
    try {
      SettableFuture<DomainCertificateAuthority> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainCertificateAuthority>() {}, new AsyncApiCallback<ApiResponse<DomainCertificateAuthority>>() {
        @Override
        public void onCompleted(ApiResponse<DomainCertificateAuthority> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a certificate authority.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainCertificateAuthority>> putTelephonyProvidersEdgesCertificateauthorityAsync(ApiRequest<DomainCertificateAuthority> request, AsyncApiCallback<ApiResponse<DomainCertificateAuthority>> callback) {
    try {
      SettableFuture<ApiResponse<DomainCertificateAuthority>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainCertificateAuthority>() {}, new AsyncApiCallback<ApiResponse<DomainCertificateAuthority>>() {
        @Override
        public void onCompleted(ApiResponse<DomainCertificateAuthority> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainCertificateAuthority> response = (ApiResponse<DomainCertificateAuthority>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainCertificateAuthority> response = (ApiResponse<DomainCertificateAuthority>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a DID by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DID> putTelephonyProvidersEdgesDidAsync(PutTelephonyProvidersEdgesDidRequest request, AsyncApiCallback<DID> callback) {
    try {
      SettableFuture<DID> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DID>() {}, new AsyncApiCallback<ApiResponse<DID>>() {
        @Override
        public void onCompleted(ApiResponse<DID> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a DID by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DID>> putTelephonyProvidersEdgesDidAsync(ApiRequest<DID> request, AsyncApiCallback<ApiResponse<DID>> callback) {
    try {
      SettableFuture<ApiResponse<DID>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DID>() {}, new AsyncApiCallback<ApiResponse<DID>>() {
        @Override
        public void onCompleted(ApiResponse<DID> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DID> response = (ApiResponse<DID>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DID> response = (ApiResponse<DID>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a DID Pool by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DIDPool> putTelephonyProvidersEdgesDidpoolAsync(PutTelephonyProvidersEdgesDidpoolRequest request, AsyncApiCallback<DIDPool> callback) {
    try {
      SettableFuture<DIDPool> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DIDPool>() {}, new AsyncApiCallback<ApiResponse<DIDPool>>() {
        @Override
        public void onCompleted(ApiResponse<DIDPool> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a DID Pool by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DIDPool>> putTelephonyProvidersEdgesDidpoolAsync(ApiRequest<DIDPool> request, AsyncApiCallback<ApiResponse<DIDPool>> callback) {
    try {
      SettableFuture<ApiResponse<DIDPool>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DIDPool>() {}, new AsyncApiCallback<ApiResponse<DIDPool>>() {
        @Override
        public void onCompleted(ApiResponse<DIDPool> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DIDPool> response = (ApiResponse<DIDPool>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DIDPool> response = (ApiResponse<DIDPool>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an edge group.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeGroup> putTelephonyProvidersEdgesEdgegroupAsync(PutTelephonyProvidersEdgesEdgegroupRequest request, AsyncApiCallback<EdgeGroup> callback) {
    try {
      SettableFuture<EdgeGroup> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeGroup>() {}, new AsyncApiCallback<ApiResponse<EdgeGroup>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeGroup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an edge group.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeGroup>> putTelephonyProvidersEdgesEdgegroupAsync(ApiRequest<EdgeGroup> request, AsyncApiCallback<ApiResponse<EdgeGroup>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeGroup>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeGroup>() {}, new AsyncApiCallback<ApiResponse<EdgeGroup>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeGroup> response = (ApiResponse<EdgeGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeGroup> response = (ApiResponse<EdgeGroup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the edge trunk base associated with the edge group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EdgeTrunkBase> putTelephonyProvidersEdgesEdgegroupEdgetrunkbasisAsync(PutTelephonyProvidersEdgesEdgegroupEdgetrunkbasisRequest request, AsyncApiCallback<EdgeTrunkBase> callback) {
    try {
      SettableFuture<EdgeTrunkBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EdgeTrunkBase>() {}, new AsyncApiCallback<ApiResponse<EdgeTrunkBase>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeTrunkBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the edge trunk base associated with the edge group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EdgeTrunkBase>> putTelephonyProvidersEdgesEdgegroupEdgetrunkbasisAsync(ApiRequest<EdgeTrunkBase> request, AsyncApiCallback<ApiResponse<EdgeTrunkBase>> callback) {
    try {
      SettableFuture<ApiResponse<EdgeTrunkBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EdgeTrunkBase>() {}, new AsyncApiCallback<ApiResponse<EdgeTrunkBase>>() {
        @Override
        public void onCompleted(ApiResponse<EdgeTrunkBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeTrunkBase> response = (ApiResponse<EdgeTrunkBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EdgeTrunkBase> response = (ApiResponse<EdgeTrunkBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update endpoint
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Endpoint> putTelephonyProvidersEdgesEndpointAsync(PutTelephonyProvidersEdgesEndpointRequest request, AsyncApiCallback<Endpoint> callback) {
    try {
      SettableFuture<Endpoint> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Endpoint>() {}, new AsyncApiCallback<ApiResponse<Endpoint>>() {
        @Override
        public void onCompleted(ApiResponse<Endpoint> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update endpoint
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Endpoint>> putTelephonyProvidersEdgesEndpointAsync(ApiRequest<Endpoint> request, AsyncApiCallback<ApiResponse<Endpoint>> callback) {
    try {
      SettableFuture<ApiResponse<Endpoint>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Endpoint>() {}, new AsyncApiCallback<ApiResponse<Endpoint>>() {
        @Override
        public void onCompleted(ApiResponse<Endpoint> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Endpoint> response = (ApiResponse<Endpoint>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Endpoint> response = (ApiResponse<Endpoint>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an extension by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Extension> putTelephonyProvidersEdgesExtensionAsync(PutTelephonyProvidersEdgesExtensionRequest request, AsyncApiCallback<Extension> callback) {
    try {
      SettableFuture<Extension> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Extension>() {}, new AsyncApiCallback<ApiResponse<Extension>>() {
        @Override
        public void onCompleted(ApiResponse<Extension> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an extension by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Extension>> putTelephonyProvidersEdgesExtensionAsync(ApiRequest<Extension> request, AsyncApiCallback<ApiResponse<Extension>> callback) {
    try {
      SettableFuture<ApiResponse<Extension>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Extension>() {}, new AsyncApiCallback<ApiResponse<Extension>>() {
        @Override
        public void onCompleted(ApiResponse<Extension> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Extension> response = (ApiResponse<Extension>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Extension> response = (ApiResponse<Extension>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an extension pool by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExtensionPool> putTelephonyProvidersEdgesExtensionpoolAsync(PutTelephonyProvidersEdgesExtensionpoolRequest request, AsyncApiCallback<ExtensionPool> callback) {
    try {
      SettableFuture<ExtensionPool> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExtensionPool>() {}, new AsyncApiCallback<ApiResponse<ExtensionPool>>() {
        @Override
        public void onCompleted(ApiResponse<ExtensionPool> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an extension pool by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExtensionPool>> putTelephonyProvidersEdgesExtensionpoolAsync(ApiRequest<ExtensionPool> request, AsyncApiCallback<ApiResponse<ExtensionPool>> callback) {
    try {
      SettableFuture<ApiResponse<ExtensionPool>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExtensionPool>() {}, new AsyncApiCallback<ApiResponse<ExtensionPool>>() {
        @Override
        public void onCompleted(ApiResponse<ExtensionPool> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExtensionPool> response = (ApiResponse<ExtensionPool>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExtensionPool> response = (ApiResponse<ExtensionPool>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update outbound route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutboundRoute> putTelephonyProvidersEdgesOutboundrouteAsync(PutTelephonyProvidersEdgesOutboundrouteRequest request, AsyncApiCallback<OutboundRoute> callback) {
    try {
      SettableFuture<OutboundRoute> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutboundRoute>() {}, new AsyncApiCallback<ApiResponse<OutboundRoute>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRoute> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update outbound route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutboundRoute>> putTelephonyProvidersEdgesOutboundrouteAsync(ApiRequest<OutboundRoute> request, AsyncApiCallback<ApiResponse<OutboundRoute>> callback) {
    try {
      SettableFuture<ApiResponse<OutboundRoute>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutboundRoute>() {}, new AsyncApiCallback<ApiResponse<OutboundRoute>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRoute> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRoute> response = (ApiResponse<OutboundRoute>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRoute> response = (ApiResponse<OutboundRoute>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Phone by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Phone> putTelephonyProvidersEdgesPhoneAsync(PutTelephonyProvidersEdgesPhoneRequest request, AsyncApiCallback<Phone> callback) {
    try {
      SettableFuture<Phone> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Phone>() {}, new AsyncApiCallback<ApiResponse<Phone>>() {
        @Override
        public void onCompleted(ApiResponse<Phone> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Phone by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Phone>> putTelephonyProvidersEdgesPhoneAsync(ApiRequest<Phone> request, AsyncApiCallback<ApiResponse<Phone>> callback) {
    try {
      SettableFuture<ApiResponse<Phone>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Phone>() {}, new AsyncApiCallback<ApiResponse<Phone>>() {
        @Override
        public void onCompleted(ApiResponse<Phone> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Phone> response = (ApiResponse<Phone>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Phone Base Settings by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PhoneBase> putTelephonyProvidersEdgesPhonebasesettingAsync(PutTelephonyProvidersEdgesPhonebasesettingRequest request, AsyncApiCallback<PhoneBase> callback) {
    try {
      SettableFuture<PhoneBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PhoneBase>() {}, new AsyncApiCallback<ApiResponse<PhoneBase>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Phone Base Settings by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PhoneBase>> putTelephonyProvidersEdgesPhonebasesettingAsync(ApiRequest<PhoneBase> request, AsyncApiCallback<ApiResponse<PhoneBase>> callback) {
    try {
      SettableFuture<ApiResponse<PhoneBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PhoneBase>() {}, new AsyncApiCallback<ApiResponse<PhoneBase>>() {
        @Override
        public void onCompleted(ApiResponse<PhoneBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PhoneBase> response = (ApiResponse<PhoneBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Site by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Site> putTelephonyProvidersEdgesSiteAsync(PutTelephonyProvidersEdgesSiteRequest request, AsyncApiCallback<Site> callback) {
    try {
      SettableFuture<Site> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Site>() {}, new AsyncApiCallback<ApiResponse<Site>>() {
        @Override
        public void onCompleted(ApiResponse<Site> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Site by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Site>> putTelephonyProvidersEdgesSiteAsync(ApiRequest<Site> request, AsyncApiCallback<ApiResponse<Site>> callback) {
    try {
      SettableFuture<ApiResponse<Site>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Site>() {}, new AsyncApiCallback<ApiResponse<Site>>() {
        @Override
        public void onCompleted(ApiResponse<Site> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Site> response = (ApiResponse<Site>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Site> response = (ApiResponse<Site>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the list of Number Plans.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<NumberPlan>> putTelephonyProvidersEdgesSiteNumberplansAsync(PutTelephonyProvidersEdgesSiteNumberplansRequest request, AsyncApiCallback<List<NumberPlan>> callback) {
    try {
      SettableFuture<List<NumberPlan>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<NumberPlan>>() {}, new AsyncApiCallback<ApiResponse<List<NumberPlan>>>() {
        @Override
        public void onCompleted(ApiResponse<List<NumberPlan>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the list of Number Plans.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<NumberPlan>>> putTelephonyProvidersEdgesSiteNumberplansAsync(ApiRequest<List<NumberPlan>> request, AsyncApiCallback<ApiResponse<List<NumberPlan>>> callback) {
    try {
      SettableFuture<ApiResponse<List<NumberPlan>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<NumberPlan>>() {}, new AsyncApiCallback<ApiResponse<List<NumberPlan>>>() {
        @Override
        public void onCompleted(ApiResponse<List<NumberPlan>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<NumberPlan>> response = (ApiResponse<List<NumberPlan>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<NumberPlan>> response = (ApiResponse<List<NumberPlan>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update outbound route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutboundRouteBase> putTelephonyProvidersEdgesSiteOutboundrouteAsync(PutTelephonyProvidersEdgesSiteOutboundrouteRequest request, AsyncApiCallback<OutboundRouteBase> callback) {
    try {
      SettableFuture<OutboundRouteBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutboundRouteBase>() {}, new AsyncApiCallback<ApiResponse<OutboundRouteBase>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRouteBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update outbound route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutboundRouteBase>> putTelephonyProvidersEdgesSiteOutboundrouteAsync(ApiRequest<OutboundRouteBase> request, AsyncApiCallback<ApiResponse<OutboundRouteBase>> callback) {
    try {
      SettableFuture<ApiResponse<OutboundRouteBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutboundRouteBase>() {}, new AsyncApiCallback<ApiResponse<OutboundRouteBase>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundRouteBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRouteBase> response = (ApiResponse<OutboundRouteBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundRouteBase> response = (ApiResponse<OutboundRouteBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TrunkBase> putTelephonyProvidersEdgesTrunkbasesettingAsync(PutTelephonyProvidersEdgesTrunkbasesettingRequest request, AsyncApiCallback<TrunkBase> callback) {
    try {
      SettableFuture<TrunkBase> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TrunkBase>() {}, new AsyncApiCallback<ApiResponse<TrunkBase>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkBase> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Trunk Base Settings object by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TrunkBase>> putTelephonyProvidersEdgesTrunkbasesettingAsync(ApiRequest<TrunkBase> request, AsyncApiCallback<ApiResponse<TrunkBase>> callback) {
    try {
      SettableFuture<ApiResponse<TrunkBase>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TrunkBase>() {}, new AsyncApiCallback<ApiResponse<TrunkBase>>() {
        @Override
        public void onCompleted(ApiResponse<TrunkBase> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TrunkBase> response = (ApiResponse<TrunkBase>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }


  private <T> void notifySuccess(SettableFuture<T> future, AsyncApiCallback<T> callback, T result) {
    if (callback != null) {
      try {
        callback.onCompleted(result);
        future.set(result);
      }
      catch (Throwable exception) {
        future.setException(exception);
      }
    }
    else {
      future.set(result);
    }
  }

  private <T> void notifyFailure(SettableFuture<T> future, AsyncApiCallback<T> callback, Throwable exception) {
    if (callback != null) {
      try {
        callback.onFailed(exception);
        future.setException(exception);
      }
      catch (Throwable callbackException) {
        future.setException(callbackException);
      }
    }
    else {
      future.setException(exception);
    }
  }
}
