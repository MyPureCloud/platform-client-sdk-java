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

public class GetAuthorizationRoleComparedefaultRightRoleIdRequest {

	private String leftRoleId;
	public String getLeftRoleId() {
		return this.leftRoleId;
	}

	public void setLeftRoleId(String leftRoleId) {
		this.leftRoleId = leftRoleId;
	}

	public GetAuthorizationRoleComparedefaultRightRoleIdRequest withLeftRoleId(String leftRoleId) {
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

	public GetAuthorizationRoleComparedefaultRightRoleIdRequest withRightRoleId(String rightRoleId) {
	    this.setRightRoleId(rightRoleId);
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

    public GetAuthorizationRoleComparedefaultRightRoleIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'leftRoleId' is set
        if (this.leftRoleId == null) {
            throw new IllegalStateException("Missing the required parameter 'leftRoleId' when building request for GetAuthorizationRoleComparedefaultRightRoleIdRequest.");
        }
        
        // verify the required parameter 'rightRoleId' is set
        if (this.rightRoleId == null) {
            throw new IllegalStateException("Missing the required parameter 'rightRoleId' when building request for GetAuthorizationRoleComparedefaultRightRoleIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}")
                .withPathParameter("leftRoleId", leftRoleId)
        
                .withPathParameter("rightRoleId", rightRoleId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String leftRoleId, String rightRoleId) {
	    return new Builder()
	            .withRequiredParams(leftRoleId, rightRoleId);
	}


	public static class Builder {
		private final GetAuthorizationRoleComparedefaultRightRoleIdRequest request;

		private Builder() {
			request = new GetAuthorizationRoleComparedefaultRightRoleIdRequest();
		}


		public Builder withLeftRoleId(String leftRoleId) {
			request.setLeftRoleId(leftRoleId);
			return this;
		}

		public Builder withRightRoleId(String rightRoleId) {
			request.setRightRoleId(rightRoleId);
			return this;
		}



		public Builder withRequiredParams(String leftRoleId, String rightRoleId) {
			request.setLeftRoleId(leftRoleId);
			request.setRightRoleId(rightRoleId);

			return this;
		}


		public GetAuthorizationRoleComparedefaultRightRoleIdRequest build() {
            
            // verify the required parameter 'leftRoleId' is set
            if (request.leftRoleId == null) {
                throw new IllegalStateException("Missing the required parameter 'leftRoleId' when building request for GetAuthorizationRoleComparedefaultRightRoleIdRequest.");
            }
            
            // verify the required parameter 'rightRoleId' is set
            if (request.rightRoleId == null) {
                throw new IllegalStateException("Missing the required parameter 'rightRoleId' when building request for GetAuthorizationRoleComparedefaultRightRoleIdRequest.");
            }
            
			return request;
		}
	}
}
