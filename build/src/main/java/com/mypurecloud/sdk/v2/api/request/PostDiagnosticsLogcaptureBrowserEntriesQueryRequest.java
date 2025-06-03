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
import com.mypurecloud.sdk.v2.model.LogCaptureDownloadExecutionResponse;
import com.mypurecloud.sdk.v2.model.LogCaptureQueryRequest;
import com.mypurecloud.sdk.v2.model.LogCaptureQueryResponse;
import com.mypurecloud.sdk.v2.model.LogCaptureUserConfiguration;
import com.mypurecloud.sdk.v2.model.LogCaptureUserConfigurationListing;
import com.mypurecloud.sdk.v2.model.LogCaptureUserConfigurationResponse;

public class PostDiagnosticsLogcaptureBrowserEntriesQueryRequest {

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public PostDiagnosticsLogcaptureBrowserEntriesQueryRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public PostDiagnosticsLogcaptureBrowserEntriesQueryRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private LogCaptureQueryRequest body;
	public LogCaptureQueryRequest getBody() {
		return this.body;
	}

	public void setBody(LogCaptureQueryRequest body) {
		this.body = body;
	}

	public PostDiagnosticsLogcaptureBrowserEntriesQueryRequest withBody(LogCaptureQueryRequest body) {
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

    public PostDiagnosticsLogcaptureBrowserEntriesQueryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<LogCaptureQueryRequest> withHttpInfo() {
        

        return ApiRequestBuilder.create("POST", "/api/v2/diagnostics/logcapture/browser/entries/query")

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        
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
		private final PostDiagnosticsLogcaptureBrowserEntriesQueryRequest request;

		private Builder() {
			request = new PostDiagnosticsLogcaptureBrowserEntriesQueryRequest();
		}


		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withBody(LogCaptureQueryRequest body) {
			request.setBody(body);
			return this;
		}




		public PostDiagnosticsLogcaptureBrowserEntriesQueryRequest build() {
            
			return request;
		}
	}
}
