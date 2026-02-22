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

import com.mypurecloud.sdk.v2.model.CobrowseWebMessagingSession;
import com.mypurecloud.sdk.v2.model.DeploymentIdentityResolutionConfig;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExpandableWebDeploymentEntityListing;
import com.mypurecloud.sdk.v2.model.SignedData;
import com.mypurecloud.sdk.v2.model.WebDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentActiveConfigurationOnDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersion;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersionEntityListing;
import com.mypurecloud.sdk.v2.model.WebDeploymentsAuthorizationResponse;
import com.mypurecloud.sdk.v2.model.WebDeploymentsOAuthExchangeRequest;
import com.mypurecloud.sdk.v2.model.WebDeploymentsRefreshJWTRequest;

public class GetWebdeploymentsConfigurationsRequest {

	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public GetWebdeploymentsConfigurationsRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String before;
	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GetWebdeploymentsConfigurationsRequest withBefore(String before) {
	    this.setBefore(before);
	    return this;
	} 

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetWebdeploymentsConfigurationsRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private Boolean showOnlyPublished;
	public Boolean getShowOnlyPublished() {
		return this.showOnlyPublished;
	}

	public void setShowOnlyPublished(Boolean showOnlyPublished) {
		this.showOnlyPublished = showOnlyPublished;
	}

	public GetWebdeploymentsConfigurationsRequest withShowOnlyPublished(Boolean showOnlyPublished) {
	    this.setShowOnlyPublished(showOnlyPublished);
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

    public GetWebdeploymentsConfigurationsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/webdeployments/configurations")

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("before", "", before)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("showOnlyPublished", "", showOnlyPublished)
        
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
		private final GetWebdeploymentsConfigurationsRequest request;

		private Builder() {
			request = new GetWebdeploymentsConfigurationsRequest();
		}


		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withBefore(String before) {
			request.setBefore(before);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withShowOnlyPublished(Boolean showOnlyPublished) {
			request.setShowOnlyPublished(showOnlyPublished);
			return this;
		}




		public GetWebdeploymentsConfigurationsRequest build() {
            
			return request;
		}
	}
}
