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
import com.mypurecloud.sdk.v2.model.ActiveAlertCount;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlert;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlertContainer;
import com.mypurecloud.sdk.v2.model.UnreadMetric;
import com.mypurecloud.sdk.v2.model.InteractionStatsRule;
import com.mypurecloud.sdk.v2.model.InteractionStatsRuleContainer;
import com.mypurecloud.sdk.v2.model.UnreadStatus;

public class DeleteAlertingInteractionstatsAlertRequest {
    
	private String alertId;
	public String getAlertId() {
		return this.alertId;
	}

	public void setAlertId(String alertId) {
		this.alertId = alertId;
	}

	public DeleteAlertingInteractionstatsAlertRequest withAlertId(String alertId) {
	    this.setAlertId(alertId);
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

    public DeleteAlertingInteractionstatsAlertRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'alertId' is set
        if (this.alertId == null) {
            throw new IllegalStateException("Missing the required parameter 'alertId' when building request for DeleteAlertingInteractionstatsAlertRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/alerting/interactionstats/alerts/{alertId}")
                .withPathParameter("alertId", alertId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String alertId) {
	    return new Builder()
	            .withRequiredParams(alertId);
	}
	

	public static class Builder {
		private final DeleteAlertingInteractionstatsAlertRequest request;

		private Builder() {
			request = new DeleteAlertingInteractionstatsAlertRequest();
		}

		
		public Builder withAlertId(String alertId) {
			request.setAlertId(alertId);
			return this;
		}
		

		
		public Builder withRequiredParams(String alertId) {
			request.setAlertId(alertId);
			
			return this;
		}
		

		public DeleteAlertingInteractionstatsAlertRequest build() {
            
            // verify the required parameter 'alertId' is set
            if (request.alertId == null) {
                throw new IllegalStateException("Missing the required parameter 'alertId' when building request for DeleteAlertingInteractionstatsAlertRequest.");
            }
            
			return request;
		}
	}
}
