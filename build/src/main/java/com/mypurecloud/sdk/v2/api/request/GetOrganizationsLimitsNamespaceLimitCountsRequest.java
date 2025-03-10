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

import com.mypurecloud.sdk.v2.model.EmbeddedIntegration;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FeatureState;
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.FreeTrialLimitDocs;
import com.mypurecloud.sdk.v2.model.IpAddressAuthentication;
import com.mypurecloud.sdk.v2.model.LimitChangeRequestDetails;
import com.mypurecloud.sdk.v2.model.LimitChangeRequestsEntityListing;
import com.mypurecloud.sdk.v2.model.LimitCountListing;
import com.mypurecloud.sdk.v2.model.LimitDocumentation;
import com.mypurecloud.sdk.v2.model.LimitsEntityListing;
import com.mypurecloud.sdk.v2.model.OrgAuthSettings;
import com.mypurecloud.sdk.v2.model.OrgWhitelistSettings;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.OrganizationFeatures;

public class GetOrganizationsLimitsNamespaceLimitCountsRequest {

	private String namespaceName;
	public String getNamespaceName() {
		return this.namespaceName;
	}

	public void setNamespaceName(String namespaceName) {
		this.namespaceName = namespaceName;
	}

	public GetOrganizationsLimitsNamespaceLimitCountsRequest withNamespaceName(String namespaceName) {
	    this.setNamespaceName(namespaceName);
	    return this;
	} 

	private String limitName;
	public String getLimitName() {
		return this.limitName;
	}

	public void setLimitName(String limitName) {
		this.limitName = limitName;
	}

	public GetOrganizationsLimitsNamespaceLimitCountsRequest withLimitName(String limitName) {
	    this.setLimitName(limitName);
	    return this;
	} 

	private String entityId;
	public String getEntityId() {
		return this.entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public GetOrganizationsLimitsNamespaceLimitCountsRequest withEntityId(String entityId) {
	    this.setEntityId(entityId);
	    return this;
	} 

	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public GetOrganizationsLimitsNamespaceLimitCountsRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 

	private String cursor;
	public String getCursor() {
		return this.cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public GetOrganizationsLimitsNamespaceLimitCountsRequest withCursor(String cursor) {
	    this.setCursor(cursor);
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

    public GetOrganizationsLimitsNamespaceLimitCountsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'namespaceName' is set
        if (this.namespaceName == null) {
            throw new IllegalStateException("Missing the required parameter 'namespaceName' when building request for GetOrganizationsLimitsNamespaceLimitCountsRequest.");
        }
        
        // verify the required parameter 'limitName' is set
        if (this.limitName == null) {
            throw new IllegalStateException("Missing the required parameter 'limitName' when building request for GetOrganizationsLimitsNamespaceLimitCountsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/organizations/limits/namespaces/{namespaceName}/limits/{limitName}/counts")
                .withPathParameter("namespaceName", namespaceName)
        
                .withPathParameter("limitName", limitName)
        

                .withQueryParameters("entityId", "", entityId)
        

                .withQueryParameters("userId", "", userId)
        

                .withQueryParameters("cursor", "", cursor)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String namespaceName, String limitName) {
	    return new Builder()
	            .withRequiredParams(namespaceName, limitName);
	}


	public static class Builder {
		private final GetOrganizationsLimitsNamespaceLimitCountsRequest request;

		private Builder() {
			request = new GetOrganizationsLimitsNamespaceLimitCountsRequest();
		}


		public Builder withNamespaceName(String namespaceName) {
			request.setNamespaceName(namespaceName);
			return this;
		}

		public Builder withLimitName(String limitName) {
			request.setLimitName(limitName);
			return this;
		}

		public Builder withEntityId(String entityId) {
			request.setEntityId(entityId);
			return this;
		}

		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}

		public Builder withCursor(String cursor) {
			request.setCursor(cursor);
			return this;
		}



		public Builder withRequiredParams(String namespaceName, String limitName) {
			request.setNamespaceName(namespaceName);
			request.setLimitName(limitName);

			return this;
		}


		public GetOrganizationsLimitsNamespaceLimitCountsRequest build() {
            
            // verify the required parameter 'namespaceName' is set
            if (request.namespaceName == null) {
                throw new IllegalStateException("Missing the required parameter 'namespaceName' when building request for GetOrganizationsLimitsNamespaceLimitCountsRequest.");
            }
            
            // verify the required parameter 'limitName' is set
            if (request.limitName == null) {
                throw new IllegalStateException("Missing the required parameter 'limitName' when building request for GetOrganizationsLimitsNamespaceLimitCountsRequest.");
            }
            
			return request;
		}
	}
}
