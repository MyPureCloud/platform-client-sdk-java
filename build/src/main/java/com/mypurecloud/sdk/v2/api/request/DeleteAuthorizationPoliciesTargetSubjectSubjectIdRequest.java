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

public class DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest {

	private String targetName;
	public String getTargetName() {
		return this.targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest withTargetName(String targetName) {
	    this.setTargetName(targetName);
	    return this;
	} 

	private String subjectId;
	public String getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest withSubjectId(String subjectId) {
	    this.setSubjectId(subjectId);
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

    public DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'targetName' is set
        if (this.targetName == null) {
            throw new IllegalStateException("Missing the required parameter 'targetName' when building request for DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest.");
        }
        
        // verify the required parameter 'subjectId' is set
        if (this.subjectId == null) {
            throw new IllegalStateException("Missing the required parameter 'subjectId' when building request for DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/authorization/policies/targets/{targetName}/subject/{subjectId}")
                .withPathParameter("targetName", targetName)
        
                .withPathParameter("subjectId", subjectId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String targetName, String subjectId) {
	    return new Builder()
	            .withRequiredParams(targetName, subjectId);
	}


	public static class Builder {
		private final DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest request;

		private Builder() {
			request = new DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest();
		}


		public Builder withTargetName(String targetName) {
			request.setTargetName(targetName);
			return this;
		}

		public Builder withSubjectId(String subjectId) {
			request.setSubjectId(subjectId);
			return this;
		}



		public Builder withRequiredParams(String targetName, String subjectId) {
			request.setTargetName(targetName);
			request.setSubjectId(subjectId);

			return this;
		}


		public DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest build() {
            
            // verify the required parameter 'targetName' is set
            if (request.targetName == null) {
                throw new IllegalStateException("Missing the required parameter 'targetName' when building request for DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest.");
            }
            
            // verify the required parameter 'subjectId' is set
            if (request.subjectId == null) {
                throw new IllegalStateException("Missing the required parameter 'subjectId' when building request for DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest.");
            }
            
			return request;
		}
	}
}
