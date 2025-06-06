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

public class PutAuthorizationPolicyRequest {

	private String policyId;
	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public PutAuthorizationPolicyRequest withPolicyId(String policyId) {
	    this.setPolicyId(policyId);
	    return this;
	} 

	private AuthorizationPolicy body;
	public AuthorizationPolicy getBody() {
		return this.body;
	}

	public void setBody(AuthorizationPolicy body) {
		this.body = body;
	}

	public PutAuthorizationPolicyRequest withBody(AuthorizationPolicy body) {
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

    public PutAuthorizationPolicyRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<AuthorizationPolicy> withHttpInfo() {
        
        // verify the required parameter 'policyId' is set
        if (this.policyId == null) {
            throw new IllegalStateException("Missing the required parameter 'policyId' when building request for PutAuthorizationPolicyRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAuthorizationPolicyRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/authorization/policies/{policyId}")
                .withPathParameter("policyId", policyId)
        
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


	public static Builder builder(String policyId, AuthorizationPolicy body) {
	    return new Builder()
	            .withRequiredParams(policyId, body);
	}


	public static class Builder {
		private final PutAuthorizationPolicyRequest request;

		private Builder() {
			request = new PutAuthorizationPolicyRequest();
		}


		public Builder withPolicyId(String policyId) {
			request.setPolicyId(policyId);
			return this;
		}

		public Builder withBody(AuthorizationPolicy body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String policyId, AuthorizationPolicy body) {
			request.setPolicyId(policyId);
			request.setBody(body);

			return this;
		}


		public PutAuthorizationPolicyRequest build() {
            
            // verify the required parameter 'policyId' is set
            if (request.policyId == null) {
                throw new IllegalStateException("Missing the required parameter 'policyId' when building request for PutAuthorizationPolicyRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAuthorizationPolicyRequest.");
            }
            
			return request;
		}
	}
}
