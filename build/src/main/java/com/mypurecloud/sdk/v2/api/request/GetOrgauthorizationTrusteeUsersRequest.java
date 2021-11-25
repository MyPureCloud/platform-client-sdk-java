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

public class GetOrgauthorizationTrusteeUsersRequest {
    
	private String trusteeOrgId;
	public String getTrusteeOrgId() {
		return this.trusteeOrgId;
	}

	public void setTrusteeOrgId(String trusteeOrgId) {
		this.trusteeOrgId = trusteeOrgId;
	}

	public GetOrgauthorizationTrusteeUsersRequest withTrusteeOrgId(String trusteeOrgId) {
	    this.setTrusteeOrgId(trusteeOrgId);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetOrgauthorizationTrusteeUsersRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetOrgauthorizationTrusteeUsersRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
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

    public GetOrgauthorizationTrusteeUsersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'trusteeOrgId' is set
        if (this.trusteeOrgId == null) {
            throw new IllegalStateException("Missing the required parameter 'trusteeOrgId' when building request for GetOrgauthorizationTrusteeUsersRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/orgauthorization/trustees/{trusteeOrgId}/users")
                .withPathParameter("trusteeOrgId", trusteeOrgId)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String trusteeOrgId) {
	    return new Builder()
	            .withRequiredParams(trusteeOrgId);
	}
	

	public static class Builder {
		private final GetOrgauthorizationTrusteeUsersRequest request;

		private Builder() {
			request = new GetOrgauthorizationTrusteeUsersRequest();
		}

		
		public Builder withTrusteeOrgId(String trusteeOrgId) {
			request.setTrusteeOrgId(trusteeOrgId);
			return this;
		}
		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		

		
		public Builder withRequiredParams(String trusteeOrgId) {
			request.setTrusteeOrgId(trusteeOrgId);
			
			return this;
		}
		

		public GetOrgauthorizationTrusteeUsersRequest build() {
            
            // verify the required parameter 'trusteeOrgId' is set
            if (request.trusteeOrgId == null) {
                throw new IllegalStateException("Missing the required parameter 'trusteeOrgId' when building request for GetOrgauthorizationTrusteeUsersRequest.");
            }
            
			return request;
		}
	}
}
