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
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.EmbeddedIntegration;
import com.mypurecloud.sdk.v2.model.IpAddressAuthentication;
import com.mypurecloud.sdk.v2.model.LimitChangeRequestDetails;
import com.mypurecloud.sdk.v2.model.LimitChangeRequestsEntityListing;
import com.mypurecloud.sdk.v2.model.UrlResponse;
import com.mypurecloud.sdk.v2.model.LimitsEntityListing;
import com.mypurecloud.sdk.v2.model.PagedNamespaceListing;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.OrgWhitelistSettings;
import com.mypurecloud.sdk.v2.model.OrganizationFeatures;
import com.mypurecloud.sdk.v2.model.FeatureState;

public class GetOrganizationsLimitsNamespaceRequest {
    
	private String namespaceName;
	public String getNamespaceName() {
		return this.namespaceName;
	}

	public void setNamespaceName(String namespaceName) {
		this.namespaceName = namespaceName;
	}

	public GetOrganizationsLimitsNamespaceRequest withNamespaceName(String namespaceName) {
	    this.setNamespaceName(namespaceName);
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

    public GetOrganizationsLimitsNamespaceRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'namespaceName' is set
        if (this.namespaceName == null) {
            throw new IllegalStateException("Missing the required parameter 'namespaceName' when building request for GetOrganizationsLimitsNamespaceRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/organizations/limits/namespaces/{namespaceName}")
                .withPathParameter("namespaceName", namespaceName)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String namespaceName) {
	    return new Builder()
	            .withRequiredParams(namespaceName);
	}
	

	public static class Builder {
		private final GetOrganizationsLimitsNamespaceRequest request;

		private Builder() {
			request = new GetOrganizationsLimitsNamespaceRequest();
		}

		
		public Builder withNamespaceName(String namespaceName) {
			request.setNamespaceName(namespaceName);
			return this;
		}
		

		
		public Builder withRequiredParams(String namespaceName) {
			request.setNamespaceName(namespaceName);
			
			return this;
		}
		

		public GetOrganizationsLimitsNamespaceRequest build() {
            
            // verify the required parameter 'namespaceName' is set
            if (request.namespaceName == null) {
                throw new IllegalStateException("Missing the required parameter 'namespaceName' when building request for GetOrganizationsLimitsNamespaceRequest.");
            }
            
			return request;
		}
	}
}
