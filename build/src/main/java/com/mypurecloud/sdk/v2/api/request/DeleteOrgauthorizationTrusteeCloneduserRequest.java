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

public class DeleteOrgauthorizationTrusteeCloneduserRequest {
    
	private String trusteeOrgId;
	public String getTrusteeOrgId() {
		return this.trusteeOrgId;
	}

	public void setTrusteeOrgId(String trusteeOrgId) {
		this.trusteeOrgId = trusteeOrgId;
	}

	public DeleteOrgauthorizationTrusteeCloneduserRequest withTrusteeOrgId(String trusteeOrgId) {
	    this.setTrusteeOrgId(trusteeOrgId);
	    return this;
	} 
	
	private String trusteeUserId;
	public String getTrusteeUserId() {
		return this.trusteeUserId;
	}

	public void setTrusteeUserId(String trusteeUserId) {
		this.trusteeUserId = trusteeUserId;
	}

	public DeleteOrgauthorizationTrusteeCloneduserRequest withTrusteeUserId(String trusteeUserId) {
	    this.setTrusteeUserId(trusteeUserId);
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

    public DeleteOrgauthorizationTrusteeCloneduserRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'trusteeOrgId' is set
        if (this.trusteeOrgId == null) {
            throw new IllegalStateException("Missing the required parameter 'trusteeOrgId' when building request for DeleteOrgauthorizationTrusteeCloneduserRequest.");
        }
        
        // verify the required parameter 'trusteeUserId' is set
        if (this.trusteeUserId == null) {
            throw new IllegalStateException("Missing the required parameter 'trusteeUserId' when building request for DeleteOrgauthorizationTrusteeCloneduserRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/orgauthorization/trustees/{trusteeOrgId}/clonedusers/{trusteeUserId}")
                .withPathParameter("trusteeOrgId", trusteeOrgId)
        
                .withPathParameter("trusteeUserId", trusteeUserId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String trusteeOrgId, String trusteeUserId) {
	    return new Builder()
	            .withRequiredParams(trusteeOrgId, trusteeUserId);
	}
	

	public static class Builder {
		private final DeleteOrgauthorizationTrusteeCloneduserRequest request;

		private Builder() {
			request = new DeleteOrgauthorizationTrusteeCloneduserRequest();
		}

		
		public Builder withTrusteeOrgId(String trusteeOrgId) {
			request.setTrusteeOrgId(trusteeOrgId);
			return this;
		}
		
		public Builder withTrusteeUserId(String trusteeUserId) {
			request.setTrusteeUserId(trusteeUserId);
			return this;
		}
		

		
		public Builder withRequiredParams(String trusteeOrgId, String trusteeUserId) {
			request.setTrusteeOrgId(trusteeOrgId);
						request.setTrusteeUserId(trusteeUserId);
			
			return this;
		}
		

		public DeleteOrgauthorizationTrusteeCloneduserRequest build() {
            
            // verify the required parameter 'trusteeOrgId' is set
            if (request.trusteeOrgId == null) {
                throw new IllegalStateException("Missing the required parameter 'trusteeOrgId' when building request for DeleteOrgauthorizationTrusteeCloneduserRequest.");
            }
            
            // verify the required parameter 'trusteeUserId' is set
            if (request.trusteeUserId == null) {
                throw new IllegalStateException("Missing the required parameter 'trusteeUserId' when building request for DeleteOrgauthorizationTrusteeCloneduserRequest.");
            }
            
			return request;
		}
	}
}
