package com.mypurecloud.sdk.v2.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiRequestBuilder;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

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

public class GetTelephonyProvidersEdgeSoftwareversionsRequest {

	private String edgeId;
	public String getEdgeId() {
		return this.edgeId;
	}

	public void setEdgeId(String edgeId) {
		this.edgeId = edgeId;
	}

	public GetTelephonyProvidersEdgeSoftwareversionsRequest withEdgeId(String edgeId) {
	    this.setEdgeId(edgeId);
	    return this;
	} 

	private final Map<String, String> customHeaders = new HashMap<>();
    public Map<String, String> getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders.clear();
        this.customHeaders.putAll(customHeaders);
    }

    public void addCustomHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    public GetTelephonyProvidersEdgeSoftwareversionsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'edgeId' is set
        if (this.edgeId == null) {
            throw new IllegalStateException("Missing the required parameter 'edgeId' when building request for GetTelephonyProvidersEdgeSoftwareversionsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/telephony/providers/edges/{edgeId}/softwareversions")
                .withPathParameter("edgeId", edgeId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String edgeId) {
	    return new Builder()
	            .withRequiredParams(edgeId);
	}


	public static class Builder {
		private final GetTelephonyProvidersEdgeSoftwareversionsRequest request;

		private Builder() {
			request = new GetTelephonyProvidersEdgeSoftwareversionsRequest();
		}


		public Builder withEdgeId(String edgeId) {
			request.setEdgeId(edgeId);
			return this;
		}



		public Builder withRequiredParams(String edgeId) {
			request.setEdgeId(edgeId);

			return this;
		}


		public GetTelephonyProvidersEdgeSoftwareversionsRequest build() {
            
            // verify the required parameter 'edgeId' is set
            if (request.edgeId == null) {
                throw new IllegalStateException("Missing the required parameter 'edgeId' when building request for GetTelephonyProvidersEdgeSoftwareversionsRequest.");
            }
            
			return request;
		}
	}
}
