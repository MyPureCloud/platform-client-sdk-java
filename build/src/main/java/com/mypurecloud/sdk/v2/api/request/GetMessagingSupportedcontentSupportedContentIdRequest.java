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
import com.mypurecloud.sdk.v2.model.MessagingConfigListing;
import com.mypurecloud.sdk.v2.model.MessagingSetting;
import com.mypurecloud.sdk.v2.model.MessagingSettingDefaultRequest;
import com.mypurecloud.sdk.v2.model.MessagingSettingRequest;
import com.mypurecloud.sdk.v2.model.SupportedContent;
import com.mypurecloud.sdk.v2.model.SupportedContentListing;

public class GetMessagingSupportedcontentSupportedContentIdRequest {

	private String supportedContentId;
	public String getSupportedContentId() {
		return this.supportedContentId;
	}

	public void setSupportedContentId(String supportedContentId) {
		this.supportedContentId = supportedContentId;
	}

	public GetMessagingSupportedcontentSupportedContentIdRequest withSupportedContentId(String supportedContentId) {
	    this.setSupportedContentId(supportedContentId);
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

    public GetMessagingSupportedcontentSupportedContentIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'supportedContentId' is set
        if (this.supportedContentId == null) {
            throw new IllegalStateException("Missing the required parameter 'supportedContentId' when building request for GetMessagingSupportedcontentSupportedContentIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/messaging/supportedcontent/{supportedContentId}")
                .withPathParameter("supportedContentId", supportedContentId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String supportedContentId) {
	    return new Builder()
	            .withRequiredParams(supportedContentId);
	}


	public static class Builder {
		private final GetMessagingSupportedcontentSupportedContentIdRequest request;

		private Builder() {
			request = new GetMessagingSupportedcontentSupportedContentIdRequest();
		}


		public Builder withSupportedContentId(String supportedContentId) {
			request.setSupportedContentId(supportedContentId);
			return this;
		}



		public Builder withRequiredParams(String supportedContentId) {
			request.setSupportedContentId(supportedContentId);

			return this;
		}


		public GetMessagingSupportedcontentSupportedContentIdRequest build() {
            
            // verify the required parameter 'supportedContentId' is set
            if (request.supportedContentId == null) {
                throw new IllegalStateException("Missing the required parameter 'supportedContentId' when building request for GetMessagingSupportedcontentSupportedContentIdRequest.");
            }
            
			return request;
		}
	}
}
