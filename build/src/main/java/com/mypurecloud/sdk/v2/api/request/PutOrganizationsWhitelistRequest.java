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
import com.mypurecloud.sdk.v2.model.LimitDocumentation;
import com.mypurecloud.sdk.v2.model.LimitsEntityListing;
import com.mypurecloud.sdk.v2.model.OrgAuthSettings;
import com.mypurecloud.sdk.v2.model.OrgWhitelistSettings;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.OrganizationFeatures;

public class PutOrganizationsWhitelistRequest {

	private OrgWhitelistSettings body;
	public OrgWhitelistSettings getBody() {
		return this.body;
	}

	public void setBody(OrgWhitelistSettings body) {
		this.body = body;
	}

	public PutOrganizationsWhitelistRequest withBody(OrgWhitelistSettings body) {
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

    public PutOrganizationsWhitelistRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<OrgWhitelistSettings> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutOrganizationsWhitelistRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/organizations/whitelist")
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


	public static Builder builder(OrgWhitelistSettings body) {
	    return new Builder()
	            .withRequiredParams(body);
	}


	public static class Builder {
		private final PutOrganizationsWhitelistRequest request;

		private Builder() {
			request = new PutOrganizationsWhitelistRequest();
		}


		public Builder withBody(OrgWhitelistSettings body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(OrgWhitelistSettings body) {
			request.setBody(body);

			return this;
		}


		public PutOrganizationsWhitelistRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutOrganizationsWhitelistRequest.");
            }
            
			return request;
		}
	}
}
