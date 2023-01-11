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

import com.mypurecloud.sdk.v2.model.CreateTriggerRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.TestModeEventResults;
import com.mypurecloud.sdk.v2.model.TestModeResults;
import com.mypurecloud.sdk.v2.model.TopicCursorEntityListing;
import com.mypurecloud.sdk.v2.model.Trigger;
import com.mypurecloud.sdk.v2.model.TriggerEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateTriggerRequest;

public class GetProcessautomationTriggersRequest {

	private String before;
	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GetProcessautomationTriggersRequest withBefore(String before) {
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

	public GetProcessautomationTriggersRequest withAfter(String after) {
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

	public GetProcessautomationTriggersRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String topicName;
	public String getTopicName() {
		return this.topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public GetProcessautomationTriggersRequest withTopicName(String topicName) {
	    this.setTopicName(topicName);
	    return this;
	} 

	private Boolean enabled;
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public GetProcessautomationTriggersRequest withEnabled(Boolean enabled) {
	    this.setEnabled(enabled);
	    return this;
	} 

	private Boolean hasDelayBy;
	public Boolean getHasDelayBy() {
		return this.hasDelayBy;
	}

	public void setHasDelayBy(Boolean hasDelayBy) {
		this.hasDelayBy = hasDelayBy;
	}

	public GetProcessautomationTriggersRequest withHasDelayBy(Boolean hasDelayBy) {
	    this.setHasDelayBy(hasDelayBy);
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

    public GetProcessautomationTriggersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/processautomation/triggers")

                .withQueryParameters("before", "", before)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("topicName", "", topicName)
        

                .withQueryParameters("enabled", "", enabled)
        

                .withQueryParameters("hasDelayBy", "", hasDelayBy)
        
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
		private final GetProcessautomationTriggersRequest request;

		private Builder() {
			request = new GetProcessautomationTriggersRequest();
		}


		public Builder withBefore(String before) {
			request.setBefore(before);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withTopicName(String topicName) {
			request.setTopicName(topicName);
			return this;
		}

		public Builder withEnabled(Boolean enabled) {
			request.setEnabled(enabled);
			return this;
		}

		public Builder withHasDelayBy(Boolean hasDelayBy) {
			request.setHasDelayBy(hasDelayBy);
			return this;
		}




		public GetProcessautomationTriggersRequest build() {
            
			return request;
		}
	}
}
