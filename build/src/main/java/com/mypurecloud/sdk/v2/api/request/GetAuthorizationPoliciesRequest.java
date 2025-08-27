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

import com.mypurecloud.sdk.v2.model.AuthorizationPolicy;
import com.mypurecloud.sdk.v2.model.AuthorizationPolicyEntityListing;
import com.mypurecloud.sdk.v2.model.AuthorizationSettings;
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.AuthzDivisionCursorListing;
import com.mypurecloud.sdk.v2.model.AuthzDivisionEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzDivisionGrantEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzSubject;
import com.mypurecloud.sdk.v2.model.DivsPermittedEntityListing;
import com.mypurecloud.sdk.v2.model.DomainOrgRoleDifference;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRole;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleCreate;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleUpdate;
import com.mypurecloud.sdk.v2.model.DomainPermissionEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OrganizationProductEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationRoleEntityListing;
import com.mypurecloud.sdk.v2.model.PolicyAttributeSet;
import com.mypurecloud.sdk.v2.model.PolicyTestPayload;
import com.mypurecloud.sdk.v2.model.PolicyTestResult;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;
import com.mypurecloud.sdk.v2.model.RoleSettings;
import com.mypurecloud.sdk.v2.model.SubjectDivisionGrantsEntityListing;
import com.mypurecloud.sdk.v2.model.SubjectDivisions;
import com.mypurecloud.sdk.v2.model.TargetAttributes;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.UserReferenceEntityListing;
import com.mypurecloud.sdk.v2.model.ValidationErrorListing;

public class GetAuthorizationPoliciesRequest {

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetAuthorizationPoliciesRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetAuthorizationPoliciesRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
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

    public GetAuthorizationPoliciesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/authorization/policies")

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        
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
		private final GetAuthorizationPoliciesRequest request;

		private Builder() {
			request = new GetAuthorizationPoliciesRequest();
		}


		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}




		public GetAuthorizationPoliciesRequest build() {
            
			return request;
		}
	}
}
