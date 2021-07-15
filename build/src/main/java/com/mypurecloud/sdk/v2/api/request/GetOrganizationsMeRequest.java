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

public class GetOrganizationsMeRequest {
    
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

    public GetOrganizationsMeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/organizations/me")
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
		private final GetOrganizationsMeRequest request;

		private Builder() {
			request = new GetOrganizationsMeRequest();
		}

		

		

		public GetOrganizationsMeRequest build() {
            
			return request;
		}
	}
}
