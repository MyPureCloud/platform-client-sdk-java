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
import com.mypurecloud.sdk.v2.model.CommonAllAlertUpdateRequest;
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

public class PatchAlertingAlertsAllRequest {

	private CommonAllAlertUpdateRequest body;
	public CommonAllAlertUpdateRequest getBody() {
		return this.body;
	}

	public void setBody(CommonAllAlertUpdateRequest body) {
		this.body = body;
	}

	public PatchAlertingAlertsAllRequest withBody(CommonAllAlertUpdateRequest body) {
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

    public PatchAlertingAlertsAllRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<CommonAllAlertUpdateRequest> withHttpInfo() {
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/alerting/alerts/all")
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
		private final PatchAlertingAlertsAllRequest request;

		private Builder() {
			request = new PatchAlertingAlertsAllRequest();
		}


		public Builder withBody(CommonAllAlertUpdateRequest body) {
			request.setBody(body);
			return this;
		}




		public PatchAlertingAlertsAllRequest build() {
            
			return request;
		}
	}
}
