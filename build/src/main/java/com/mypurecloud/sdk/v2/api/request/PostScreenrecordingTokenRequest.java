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
import com.mypurecloud.sdk.v2.model.ScreenRecordingUserAuthenticatedInfo;
import com.mypurecloud.sdk.v2.model.SignedData;

public class PostScreenrecordingTokenRequest {

	private ScreenRecordingUserAuthenticatedInfo body;
	public ScreenRecordingUserAuthenticatedInfo getBody() {
		return this.body;
	}

	public void setBody(ScreenRecordingUserAuthenticatedInfo body) {
		this.body = body;
	}

	public PostScreenrecordingTokenRequest withBody(ScreenRecordingUserAuthenticatedInfo body) {
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

    public PostScreenrecordingTokenRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ScreenRecordingUserAuthenticatedInfo> withHttpInfo() {
        

        return ApiRequestBuilder.create("POST", "/api/v2/screenrecording/token")
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
		private final PostScreenrecordingTokenRequest request;

		private Builder() {
			request = new PostScreenrecordingTokenRequest();
		}


		public Builder withBody(ScreenRecordingUserAuthenticatedInfo body) {
			request.setBody(body);
			return this;
		}




		public PostScreenrecordingTokenRequest build() {
            
			return request;
		}
	}
}
