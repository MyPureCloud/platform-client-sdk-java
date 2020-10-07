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

public class PostAuthorizationRoleComparedefaultRightRoleIdRequest {
    
	private String leftRoleId;
	public String getLeftRoleId() {
		return this.leftRoleId;
	}

	public void setLeftRoleId(String leftRoleId) {
		this.leftRoleId = leftRoleId;
	}

	public PostAuthorizationRoleComparedefaultRightRoleIdRequest withLeftRoleId(String leftRoleId) {
	    this.setLeftRoleId(leftRoleId);
	    return this;
	} 
	
	private String rightRoleId;
	public String getRightRoleId() {
		return this.rightRoleId;
	}

	public void setRightRoleId(String rightRoleId) {
		this.rightRoleId = rightRoleId;
	}

	public PostAuthorizationRoleComparedefaultRightRoleIdRequest withRightRoleId(String rightRoleId) {
	    this.setRightRoleId(rightRoleId);
	    return this;
	} 
	
	private DomainOrganizationRole body;
	public DomainOrganizationRole getBody() {
		return this.body;
	}

	public void setBody(DomainOrganizationRole body) {
		this.body = body;
	}

	public PostAuthorizationRoleComparedefaultRightRoleIdRequest withBody(DomainOrganizationRole body) {
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

    public PostAuthorizationRoleComparedefaultRightRoleIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<DomainOrganizationRole> withHttpInfo() {
        
        // verify the required parameter 'leftRoleId' is set
        if (this.leftRoleId == null) {
            throw new IllegalStateException("Missing the required parameter 'leftRoleId' when building request for PostAuthorizationRoleComparedefaultRightRoleIdRequest.");
        }
        
        // verify the required parameter 'rightRoleId' is set
        if (this.rightRoleId == null) {
            throw new IllegalStateException("Missing the required parameter 'rightRoleId' when building request for PostAuthorizationRoleComparedefaultRightRoleIdRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAuthorizationRoleComparedefaultRightRoleIdRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}")
                .withPathParameter("leftRoleId", leftRoleId)
        
                .withPathParameter("rightRoleId", rightRoleId)
        
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

	
	public static Builder builder(String leftRoleId, String rightRoleId, DomainOrganizationRole body) {
	    return new Builder()
	            .withRequiredParams(leftRoleId, rightRoleId, body);
	}
	

	public static class Builder {
		private final PostAuthorizationRoleComparedefaultRightRoleIdRequest request;

		private Builder() {
			request = new PostAuthorizationRoleComparedefaultRightRoleIdRequest();
		}

		
		public Builder withLeftRoleId(String leftRoleId) {
			request.setLeftRoleId(leftRoleId);
			return this;
		}
		
		public Builder withRightRoleId(String rightRoleId) {
			request.setRightRoleId(rightRoleId);
			return this;
		}
		
		public Builder withBody(DomainOrganizationRole body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String leftRoleId, String rightRoleId, DomainOrganizationRole body) {
			request.setLeftRoleId(leftRoleId);
						request.setRightRoleId(rightRoleId);
						request.setBody(body);
			
			return this;
		}
		

		public PostAuthorizationRoleComparedefaultRightRoleIdRequest build() {
            
            // verify the required parameter 'leftRoleId' is set
            if (request.leftRoleId == null) {
                throw new IllegalStateException("Missing the required parameter 'leftRoleId' when building request for PostAuthorizationRoleComparedefaultRightRoleIdRequest.");
            }
            
            // verify the required parameter 'rightRoleId' is set
            if (request.rightRoleId == null) {
                throw new IllegalStateException("Missing the required parameter 'rightRoleId' when building request for PostAuthorizationRoleComparedefaultRightRoleIdRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAuthorizationRoleComparedefaultRightRoleIdRequest.");
            }
            
			return request;
		}
	}
}
