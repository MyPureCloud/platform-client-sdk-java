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

import com.mypurecloud.sdk.v2.model.ClonedUser;
import com.mypurecloud.sdk.v2.model.ClonedUserEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;
import com.mypurecloud.sdk.v2.model.TrustCreate;
import com.mypurecloud.sdk.v2.model.TrustEntityListing;
import com.mypurecloud.sdk.v2.model.TrustGroup;
import com.mypurecloud.sdk.v2.model.TrustGroupEntityListing;
import com.mypurecloud.sdk.v2.model.TrustMemberCreate;
import com.mypurecloud.sdk.v2.model.TrustRequest;
import com.mypurecloud.sdk.v2.model.TrustRequestCreate;
import com.mypurecloud.sdk.v2.model.TrustUpdate;
import com.mypurecloud.sdk.v2.model.TrustUser;
import com.mypurecloud.sdk.v2.model.TrustUserEntityListing;
import com.mypurecloud.sdk.v2.model.Trustee;
import com.mypurecloud.sdk.v2.model.TrusteeAuditQueryRequest;
import com.mypurecloud.sdk.v2.model.TrusteeReferenceList;
import com.mypurecloud.sdk.v2.model.Trustor;
import com.mypurecloud.sdk.v2.model.TrustorAuditQueryRequest;
import com.mypurecloud.sdk.v2.model.TrustorEntityListing;
import com.mypurecloud.sdk.v2.model.UserAuthorization;

public class DeleteOrgauthorizationTrustorGroupRequest {

	private String trustorOrgId;
	public String getTrustorOrgId() {
		return this.trustorOrgId;
	}

	public void setTrustorOrgId(String trustorOrgId) {
		this.trustorOrgId = trustorOrgId;
	}

	public DeleteOrgauthorizationTrustorGroupRequest withTrustorOrgId(String trustorOrgId) {
	    this.setTrustorOrgId(trustorOrgId);
	    return this;
	} 

	private String trustorGroupId;
	public String getTrustorGroupId() {
		return this.trustorGroupId;
	}

	public void setTrustorGroupId(String trustorGroupId) {
		this.trustorGroupId = trustorGroupId;
	}

	public DeleteOrgauthorizationTrustorGroupRequest withTrustorGroupId(String trustorGroupId) {
	    this.setTrustorGroupId(trustorGroupId);
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

    public DeleteOrgauthorizationTrustorGroupRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'trustorOrgId' is set
        if (this.trustorOrgId == null) {
            throw new IllegalStateException("Missing the required parameter 'trustorOrgId' when building request for DeleteOrgauthorizationTrustorGroupRequest.");
        }
        
        // verify the required parameter 'trustorGroupId' is set
        if (this.trustorGroupId == null) {
            throw new IllegalStateException("Missing the required parameter 'trustorGroupId' when building request for DeleteOrgauthorizationTrustorGroupRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/orgauthorization/trustors/{trustorOrgId}/groups/{trustorGroupId}")
                .withPathParameter("trustorOrgId", trustorOrgId)
        
                .withPathParameter("trustorGroupId", trustorGroupId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String trustorOrgId, String trustorGroupId) {
	    return new Builder()
	            .withRequiredParams(trustorOrgId, trustorGroupId);
	}


	public static class Builder {
		private final DeleteOrgauthorizationTrustorGroupRequest request;

		private Builder() {
			request = new DeleteOrgauthorizationTrustorGroupRequest();
		}


		public Builder withTrustorOrgId(String trustorOrgId) {
			request.setTrustorOrgId(trustorOrgId);
			return this;
		}

		public Builder withTrustorGroupId(String trustorGroupId) {
			request.setTrustorGroupId(trustorGroupId);
			return this;
		}



		public Builder withRequiredParams(String trustorOrgId, String trustorGroupId) {
			request.setTrustorOrgId(trustorOrgId);
			request.setTrustorGroupId(trustorGroupId);

			return this;
		}


		public DeleteOrgauthorizationTrustorGroupRequest build() {
            
            // verify the required parameter 'trustorOrgId' is set
            if (request.trustorOrgId == null) {
                throw new IllegalStateException("Missing the required parameter 'trustorOrgId' when building request for DeleteOrgauthorizationTrustorGroupRequest.");
            }
            
            // verify the required parameter 'trustorGroupId' is set
            if (request.trustorGroupId == null) {
                throw new IllegalStateException("Missing the required parameter 'trustorGroupId' when building request for DeleteOrgauthorizationTrustorGroupRequest.");
            }
            
			return request;
		}
	}
}
