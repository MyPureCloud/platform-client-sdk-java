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

import com.mypurecloud.sdk.v2.model.ADFS;
import com.mypurecloud.sdk.v2.model.CustomProvider;
import com.mypurecloud.sdk.v2.model.CustomerInteractionCenter;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GSuite;
import com.mypurecloud.sdk.v2.model.GenericSAML;
import com.mypurecloud.sdk.v2.model.IdentityNow;
import com.mypurecloud.sdk.v2.model.IdentityProvider;
import com.mypurecloud.sdk.v2.model.IdentityProviderEntityListing;
import com.mypurecloud.sdk.v2.model.Okta;
import com.mypurecloud.sdk.v2.model.OneLogin;
import com.mypurecloud.sdk.v2.model.PingIdentity;
import com.mypurecloud.sdk.v2.model.PureCloud;
import com.mypurecloud.sdk.v2.model.PureEngage;
import com.mypurecloud.sdk.v2.model.Salesforce;

public class GetIdentityproviderRequest {

	private String providerId;
	public String getProviderId() {
		return this.providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public GetIdentityproviderRequest withProviderId(String providerId) {
	    this.setProviderId(providerId);
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

    public GetIdentityproviderRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'providerId' is set
        if (this.providerId == null) {
            throw new IllegalStateException("Missing the required parameter 'providerId' when building request for GetIdentityproviderRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/identityproviders/{providerId}")
                .withPathParameter("providerId", providerId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String providerId) {
	    return new Builder()
	            .withRequiredParams(providerId);
	}


	public static class Builder {
		private final GetIdentityproviderRequest request;

		private Builder() {
			request = new GetIdentityproviderRequest();
		}


		public Builder withProviderId(String providerId) {
			request.setProviderId(providerId);
			return this;
		}



		public Builder withRequiredParams(String providerId) {
			request.setProviderId(providerId);

			return this;
		}


		public GetIdentityproviderRequest build() {
            
            // verify the required parameter 'providerId' is set
            if (request.providerId == null) {
                throw new IllegalStateException("Missing the required parameter 'providerId' when building request for GetIdentityproviderRequest.");
            }
            
			return request;
		}
	}
}
