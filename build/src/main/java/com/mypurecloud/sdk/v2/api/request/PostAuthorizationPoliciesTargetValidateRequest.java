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
import com.mypurecloud.sdk.v2.model.AuthzDivisionEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzDivisionGrantEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzSubject;
import com.mypurecloud.sdk.v2.model.DivsPermittedEntityListing;
import com.mypurecloud.sdk.v2.model.DomainOrgRoleDifference;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRole;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleCreate;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleUpdate;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OrganizationProductEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationRoleEntityListing;
import com.mypurecloud.sdk.v2.model.PermissionCollectionEntityListing;
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

public class PostAuthorizationPoliciesTargetValidateRequest {

	private String targetName;
	public String getTargetName() {
		return this.targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public PostAuthorizationPoliciesTargetValidateRequest withTargetName(String targetName) {
	    this.setTargetName(targetName);
	    return this;
	} 

	private AuthorizationPolicy body;
	public AuthorizationPolicy getBody() {
		return this.body;
	}

	public void setBody(AuthorizationPolicy body) {
		this.body = body;
	}

	public PostAuthorizationPoliciesTargetValidateRequest withBody(AuthorizationPolicy body) {
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

    public PostAuthorizationPoliciesTargetValidateRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<AuthorizationPolicy> withHttpInfo() {
        
        // verify the required parameter 'targetName' is set
        if (this.targetName == null) {
            throw new IllegalStateException("Missing the required parameter 'targetName' when building request for PostAuthorizationPoliciesTargetValidateRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAuthorizationPoliciesTargetValidateRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/authorization/policies/targets/{targetName}/validate")
                .withPathParameter("targetName", targetName)
        
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


	public static Builder builder(String targetName, AuthorizationPolicy body) {
	    return new Builder()
	            .withRequiredParams(targetName, body);
	}


	public static class Builder {
		private final PostAuthorizationPoliciesTargetValidateRequest request;

		private Builder() {
			request = new PostAuthorizationPoliciesTargetValidateRequest();
		}


		public Builder withTargetName(String targetName) {
			request.setTargetName(targetName);
			return this;
		}

		public Builder withBody(AuthorizationPolicy body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String targetName, AuthorizationPolicy body) {
			request.setTargetName(targetName);
			request.setBody(body);

			return this;
		}


		public PostAuthorizationPoliciesTargetValidateRequest build() {
            
            // verify the required parameter 'targetName' is set
            if (request.targetName == null) {
                throw new IllegalStateException("Missing the required parameter 'targetName' when building request for PostAuthorizationPoliciesTargetValidateRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAuthorizationPoliciesTargetValidateRequest.");
            }
            
			return request;
		}
	}
}
