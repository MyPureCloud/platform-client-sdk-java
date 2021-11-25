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
import com.mypurecloud.sdk.v2.model.TrustRequest;
import com.mypurecloud.sdk.v2.model.Trustee;
import com.mypurecloud.sdk.v2.model.ClonedUserEntityListing;
import com.mypurecloud.sdk.v2.model.TrustUser;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.TrustUserEntityListing;
import com.mypurecloud.sdk.v2.model.TrustEntityListing;
import com.mypurecloud.sdk.v2.model.Trustor;
import com.mypurecloud.sdk.v2.model.ClonedUser;
import com.mypurecloud.sdk.v2.model.TrustorEntityListing;
import com.mypurecloud.sdk.v2.model.TrustRequestCreate;
import com.mypurecloud.sdk.v2.model.TrustMemberCreate;
import com.mypurecloud.sdk.v2.model.TrustCreate;
import com.mypurecloud.sdk.v2.model.AuditQueryResponse;
import com.mypurecloud.sdk.v2.model.TrusteeAuditQueryRequest;
import com.mypurecloud.sdk.v2.model.TrustorAuditQueryRequest;
import com.mypurecloud.sdk.v2.model.TrustUpdate;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;

public class GetOrgauthorizationPairingRequest {
    
	private String pairingId;
	public String getPairingId() {
		return this.pairingId;
	}

	public void setPairingId(String pairingId) {
		this.pairingId = pairingId;
	}

	public GetOrgauthorizationPairingRequest withPairingId(String pairingId) {
	    this.setPairingId(pairingId);
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

    public GetOrgauthorizationPairingRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'pairingId' is set
        if (this.pairingId == null) {
            throw new IllegalStateException("Missing the required parameter 'pairingId' when building request for GetOrgauthorizationPairingRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/orgauthorization/pairings/{pairingId}")
                .withPathParameter("pairingId", pairingId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String pairingId) {
	    return new Builder()
	            .withRequiredParams(pairingId);
	}
	

	public static class Builder {
		private final GetOrgauthorizationPairingRequest request;

		private Builder() {
			request = new GetOrgauthorizationPairingRequest();
		}

		
		public Builder withPairingId(String pairingId) {
			request.setPairingId(pairingId);
			return this;
		}
		

		
		public Builder withRequiredParams(String pairingId) {
			request.setPairingId(pairingId);
			
			return this;
		}
		

		public GetOrgauthorizationPairingRequest build() {
            
            // verify the required parameter 'pairingId' is set
            if (request.pairingId == null) {
                throw new IllegalStateException("Missing the required parameter 'pairingId' when building request for GetOrgauthorizationPairingRequest.");
            }
            
			return request;
		}
	}
}
