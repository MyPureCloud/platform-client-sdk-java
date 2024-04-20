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

import com.mypurecloud.sdk.v2.model.DownloadResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FaxConfig;
import com.mypurecloud.sdk.v2.model.FaxDocument;
import com.mypurecloud.sdk.v2.model.FaxDocumentEntityListing;
import com.mypurecloud.sdk.v2.model.FaxSummary;

public class PutFaxSettingsRequest {

	private FaxConfig body;
	public FaxConfig getBody() {
		return this.body;
	}

	public void setBody(FaxConfig body) {
		this.body = body;
	}

	public PutFaxSettingsRequest withBody(FaxConfig body) {
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

    public PutFaxSettingsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<FaxConfig> withHttpInfo() {
        

        return ApiRequestBuilder.create("PUT", "/api/v2/fax/settings")
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



	public static class Builder {
		private final PutFaxSettingsRequest request;

		private Builder() {
			request = new PutFaxSettingsRequest();
		}


		public Builder withBody(FaxConfig body) {
			request.setBody(body);
			return this;
		}




		public PutFaxSettingsRequest build() {
            
			return request;
		}
	}
}
