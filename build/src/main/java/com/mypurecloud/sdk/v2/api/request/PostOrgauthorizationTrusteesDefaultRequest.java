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

public class PostOrgauthorizationTrusteesDefaultRequest {
    
	private Boolean assignDefaultRole;
	public Boolean getAssignDefaultRole() {
		return this.assignDefaultRole;
	}

	public void setAssignDefaultRole(Boolean assignDefaultRole) {
		this.assignDefaultRole = assignDefaultRole;
	}

	public PostOrgauthorizationTrusteesDefaultRequest withAssignDefaultRole(Boolean assignDefaultRole) {
	    this.setAssignDefaultRole(assignDefaultRole);
	    return this;
	} 
	
	private Boolean autoExpire;
	public Boolean getAutoExpire() {
		return this.autoExpire;
	}

	public void setAutoExpire(Boolean autoExpire) {
		this.autoExpire = autoExpire;
	}

	public PostOrgauthorizationTrusteesDefaultRequest withAutoExpire(Boolean autoExpire) {
	    this.setAutoExpire(autoExpire);
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

    public PostOrgauthorizationTrusteesDefaultRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("POST", "/api/v2/orgauthorization/trustees/default")
                .withQueryParameters("assignDefaultRole", "", assignDefaultRole)
        
                .withQueryParameters("autoExpire", "", autoExpire)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	

	public static class Builder {
		private final PostOrgauthorizationTrusteesDefaultRequest request;

		private Builder() {
			request = new PostOrgauthorizationTrusteesDefaultRequest();
		}

		
		public Builder withAssignDefaultRole(Boolean assignDefaultRole) {
			request.setAssignDefaultRole(assignDefaultRole);
			return this;
		}
		
		public Builder withAutoExpire(Boolean autoExpire) {
			request.setAutoExpire(autoExpire);
			return this;
		}
		

		

		public PostOrgauthorizationTrusteesDefaultRequest build() {
            
			return request;
		}
	}
}
