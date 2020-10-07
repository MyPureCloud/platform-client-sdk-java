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

public class PutAuthorizationRoleRequest {
    
	private String roleId;
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public PutAuthorizationRoleRequest withRoleId(String roleId) {
	    this.setRoleId(roleId);
	    return this;
	} 
	
	private DomainOrganizationRoleUpdate body;
	public DomainOrganizationRoleUpdate getBody() {
		return this.body;
	}

	public void setBody(DomainOrganizationRoleUpdate body) {
		this.body = body;
	}

	public PutAuthorizationRoleRequest withBody(DomainOrganizationRoleUpdate body) {
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

    public PutAuthorizationRoleRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<DomainOrganizationRoleUpdate> withHttpInfo() {
        
        // verify the required parameter 'roleId' is set
        if (this.roleId == null) {
            throw new IllegalStateException("Missing the required parameter 'roleId' when building request for PutAuthorizationRoleRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAuthorizationRoleRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/authorization/roles/{roleId}")
                .withPathParameter("roleId", roleId)
        
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

	
	public static Builder builder(String roleId, DomainOrganizationRoleUpdate body) {
	    return new Builder()
	            .withRequiredParams(roleId, body);
	}
	

	public static class Builder {
		private final PutAuthorizationRoleRequest request;

		private Builder() {
			request = new PutAuthorizationRoleRequest();
		}

		
		public Builder withRoleId(String roleId) {
			request.setRoleId(roleId);
			return this;
		}
		
		public Builder withBody(DomainOrganizationRoleUpdate body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String roleId, DomainOrganizationRoleUpdate body) {
			request.setRoleId(roleId);
						request.setBody(body);
			
			return this;
		}
		

		public PutAuthorizationRoleRequest build() {
            
            // verify the required parameter 'roleId' is set
            if (request.roleId == null) {
                throw new IllegalStateException("Missing the required parameter 'roleId' when building request for PutAuthorizationRoleRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAuthorizationRoleRequest.");
            }
            
			return request;
		}
	}
}
