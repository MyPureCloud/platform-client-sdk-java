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
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.AuthzDivisionGrantEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzDivisionEntityListing;
import com.mypurecloud.sdk.v2.model.DivsPermittedEntityListing;
import com.mypurecloud.sdk.v2.model.PermissionCollectionEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationProductEntityListing;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRole;
import com.mypurecloud.sdk.v2.model.DomainOrgRoleDifference;
import com.mypurecloud.sdk.v2.model.SubjectDivisionGrantsEntityListing;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationRoleEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzSubject;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.SubjectDivisions;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleCreate;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleUpdate;

public class PostAuthorizationRoleRequest {
    
	private String roleId;
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public PostAuthorizationRoleRequest withRoleId(String roleId) {
	    this.setRoleId(roleId);
	    return this;
	} 
	
	private SubjectDivisions body;
	public SubjectDivisions getBody() {
		return this.body;
	}

	public void setBody(SubjectDivisions body) {
		this.body = body;
	}

	public PostAuthorizationRoleRequest withBody(SubjectDivisions body) {
	    this.setBody(body);
	    return this;
	} 
	
	private String subjectType;
	public String getSubjectType() {
		return this.subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public PostAuthorizationRoleRequest withSubjectType(String subjectType) {
	    this.setSubjectType(subjectType);
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

    public PostAuthorizationRoleRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<SubjectDivisions> withHttpInfo() {
        
        // verify the required parameter 'roleId' is set
        if (this.roleId == null) {
            throw new IllegalStateException("Missing the required parameter 'roleId' when building request for PostAuthorizationRoleRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAuthorizationRoleRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/authorization/roles/{roleId}")
                .withPathParameter("roleId", roleId)
        
                .withQueryParameters("subjectType", "", subjectType)
        
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

	
	public static Builder builder(String roleId, SubjectDivisions body) {
	    return new Builder()
	            .withRequiredParams(roleId, body);
	}
	

	public static class Builder {
		private final PostAuthorizationRoleRequest request;

		private Builder() {
			request = new PostAuthorizationRoleRequest();
		}

		
		public Builder withRoleId(String roleId) {
			request.setRoleId(roleId);
			return this;
		}
		
		public Builder withBody(SubjectDivisions body) {
			request.setBody(body);
			return this;
		}
		
		public Builder withSubjectType(String subjectType) {
			request.setSubjectType(subjectType);
			return this;
		}
		

		
		public Builder withRequiredParams(String roleId, SubjectDivisions body) {
			request.setRoleId(roleId);
						request.setBody(body);
			
			return this;
		}
		

		public PostAuthorizationRoleRequest build() {
            
            // verify the required parameter 'roleId' is set
            if (request.roleId == null) {
                throw new IllegalStateException("Missing the required parameter 'roleId' when building request for PostAuthorizationRoleRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAuthorizationRoleRequest.");
            }
            
			return request;
		}
	}
}
