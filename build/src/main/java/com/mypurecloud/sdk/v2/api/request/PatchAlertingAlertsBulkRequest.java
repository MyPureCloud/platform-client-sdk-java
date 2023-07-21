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

import com.mypurecloud.sdk.v2.model.ActiveAlertCount;
import com.mypurecloud.sdk.v2.model.AlertListing;
import com.mypurecloud.sdk.v2.model.AlertRequest;
import com.mypurecloud.sdk.v2.model.AlertingUnreadStatus;
import com.mypurecloud.sdk.v2.model.BulkResponse;
import com.mypurecloud.sdk.v2.model.CommonAlert;
import com.mypurecloud.sdk.v2.model.CommonAlertBulkUpdateRequest;
import com.mypurecloud.sdk.v2.model.CommonRule;
import com.mypurecloud.sdk.v2.model.CommonRuleBulkDeleteRequest;
import com.mypurecloud.sdk.v2.model.CommonRuleBulkUpdateNotificationsRequest;
import com.mypurecloud.sdk.v2.model.CommonRuleContainer;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GetAlertQuery;
import com.mypurecloud.sdk.v2.model.GetRulesQuery;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlert;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlertContainer;
import com.mypurecloud.sdk.v2.model.InteractionStatsRule;
import com.mypurecloud.sdk.v2.model.InteractionStatsRuleContainer;
import com.mypurecloud.sdk.v2.model.ModifiableRuleProperties;
import com.mypurecloud.sdk.v2.model.UnreadMetric;
import com.mypurecloud.sdk.v2.model.UnreadStatus;

public class PatchAlertingAlertsBulkRequest {

	private CommonAlertBulkUpdateRequest body;
	public CommonAlertBulkUpdateRequest getBody() {
		return this.body;
	}

	public void setBody(CommonAlertBulkUpdateRequest body) {
		this.body = body;
	}

	public PatchAlertingAlertsBulkRequest withBody(CommonAlertBulkUpdateRequest body) {
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

    public PatchAlertingAlertsBulkRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<CommonAlertBulkUpdateRequest> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchAlertingAlertsBulkRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/alerting/alerts/bulk")
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


	public static Builder builder(CommonAlertBulkUpdateRequest body) {
	    return new Builder()
	            .withRequiredParams(body);
	}


	public static class Builder {
		private final PatchAlertingAlertsBulkRequest request;

		private Builder() {
			request = new PatchAlertingAlertsBulkRequest();
		}


		public Builder withBody(CommonAlertBulkUpdateRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(CommonAlertBulkUpdateRequest body) {
			request.setBody(body);

			return this;
		}


		public PatchAlertingAlertsBulkRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchAlertingAlertsBulkRequest.");
            }
            
			return request;
		}
	}
}
