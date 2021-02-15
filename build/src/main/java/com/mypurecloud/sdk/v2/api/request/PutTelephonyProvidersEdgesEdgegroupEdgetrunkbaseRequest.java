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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.SchemaCategoryEntityListing;
import com.mypurecloud.sdk.v2.model.SchemaReferenceEntityListing;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.Edge;
import com.mypurecloud.sdk.v2.model.EdgeNetworkDiagnosticResponse;
import com.mypurecloud.sdk.v2.model.EdgeLine;
import com.mypurecloud.sdk.v2.model.EdgeLineEntityListing;
import com.mypurecloud.sdk.v2.model.DomainLogicalInterface;
import com.mypurecloud.sdk.v2.model.LogicalInterfaceEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeLogsJob;
import com.mypurecloud.sdk.v2.model.EdgeMetrics;
import com.mypurecloud.sdk.v2.model.DomainPhysicalInterface;
import com.mypurecloud.sdk.v2.model.PhysicalInterfaceEntityListing;
import com.mypurecloud.sdk.v2.model.VmPairingInfo;
import com.mypurecloud.sdk.v2.model.DomainEdgeSoftwareUpdateDto;
import com.mypurecloud.sdk.v2.model.DomainEdgeSoftwareVersionDtoEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeEntityListing;
import com.mypurecloud.sdk.v2.model.AvailableLanguageList;
import com.mypurecloud.sdk.v2.model.CertificateAuthorityEntityListing;
import com.mypurecloud.sdk.v2.model.DomainCertificateAuthority;
import com.mypurecloud.sdk.v2.model.DID;
import com.mypurecloud.sdk.v2.model.DIDPool;
import com.mypurecloud.sdk.v2.model.DIDPoolEntityListing;
import com.mypurecloud.sdk.v2.model.DIDNumberEntityListing;
import com.mypurecloud.sdk.v2.model.DIDEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeGroup;
import com.mypurecloud.sdk.v2.model.EdgeTrunkBase;
import com.mypurecloud.sdk.v2.model.EdgeGroupEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeVersionReport;
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
import com.mypurecloud.sdk.v2.model.TrunkMetrics;
import com.mypurecloud.sdk.v2.model.TrunkBase;
import com.mypurecloud.sdk.v2.model.TrunkBaseEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkMetabaseEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkRecordingEnabledCount;
import com.mypurecloud.sdk.v2.model.EdgeNetworkDiagnostic;
import com.mypurecloud.sdk.v2.model.EdgeNetworkDiagnosticRequest;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobUploadRequest;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobRequest;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobResponse;
import com.mypurecloud.sdk.v2.model.EdgeRebootParameters;
import com.mypurecloud.sdk.v2.model.EdgeServiceStateRequest;
import com.mypurecloud.sdk.v2.model.ValidateAddressResponse;
import com.mypurecloud.sdk.v2.model.ValidateAddressRequest;
import com.mypurecloud.sdk.v2.model.PhonesReboot;

public class PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest {
    
	private String edgegroupId;
	public String getEdgegroupId() {
		return this.edgegroupId;
	}

	public void setEdgegroupId(String edgegroupId) {
		this.edgegroupId = edgegroupId;
	}

	public PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest withEdgegroupId(String edgegroupId) {
	    this.setEdgegroupId(edgegroupId);
	    return this;
	} 
	
	private String edgetrunkbaseId;
	public String getEdgetrunkbaseId() {
		return this.edgetrunkbaseId;
	}

	public void setEdgetrunkbaseId(String edgetrunkbaseId) {
		this.edgetrunkbaseId = edgetrunkbaseId;
	}

	public PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest withEdgetrunkbaseId(String edgetrunkbaseId) {
	    this.setEdgetrunkbaseId(edgetrunkbaseId);
	    return this;
	} 
	
	private EdgeTrunkBase body;
	public EdgeTrunkBase getBody() {
		return this.body;
	}

	public void setBody(EdgeTrunkBase body) {
		this.body = body;
	}

	public PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest withBody(EdgeTrunkBase body) {
	    this.setBody(body);
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

    public PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<EdgeTrunkBase> withHttpInfo() {
        
        // verify the required parameter 'edgegroupId' is set
        if (this.edgegroupId == null) {
            throw new IllegalStateException("Missing the required parameter 'edgegroupId' when building request for PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest.");
        }
        
        // verify the required parameter 'edgetrunkbaseId' is set
        if (this.edgetrunkbaseId == null) {
            throw new IllegalStateException("Missing the required parameter 'edgetrunkbaseId' when building request for PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/telephony/providers/edges/edgegroups/{edgegroupId}/edgetrunkbases/{edgetrunkbaseId}")
                .withPathParameter("edgegroupId", edgegroupId)
        
                .withPathParameter("edgetrunkbaseId", edgetrunkbaseId)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String edgegroupId, String edgetrunkbaseId, EdgeTrunkBase body) {
	    return new Builder()
	            .withRequiredParams(edgegroupId, edgetrunkbaseId, body);
	}
	

	public static class Builder {
		private final PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest request;

		private Builder() {
			request = new PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest();
		}

		
		public Builder withEdgegroupId(String edgegroupId) {
			request.setEdgegroupId(edgegroupId);
			return this;
		}
		
		public Builder withEdgetrunkbaseId(String edgetrunkbaseId) {
			request.setEdgetrunkbaseId(edgetrunkbaseId);
			return this;
		}
		
		public Builder withBody(EdgeTrunkBase body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String edgegroupId, String edgetrunkbaseId, EdgeTrunkBase body) {
			request.setEdgegroupId(edgegroupId);
						request.setEdgetrunkbaseId(edgetrunkbaseId);
						request.setBody(body);
			
			return this;
		}
		

		public PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest build() {
            
            // verify the required parameter 'edgegroupId' is set
            if (request.edgegroupId == null) {
                throw new IllegalStateException("Missing the required parameter 'edgegroupId' when building request for PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest.");
            }
            
            // verify the required parameter 'edgetrunkbaseId' is set
            if (request.edgetrunkbaseId == null) {
                throw new IllegalStateException("Missing the required parameter 'edgetrunkbaseId' when building request for PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutTelephonyProvidersEdgesEdgegroupEdgetrunkbaseRequest.");
            }
            
			return request;
		}
	}
}
