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

import com.mypurecloud.sdk.v2.model.Leaderboard;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.OverallBestPoints;
import com.mypurecloud.sdk.v2.model.Metric;
import com.mypurecloud.sdk.v2.model.MetricDefinition;
import com.mypurecloud.sdk.v2.model.GetMetricDefinitionsResponse;
import com.mypurecloud.sdk.v2.model.GetMetricsResponse;
import com.mypurecloud.sdk.v2.model.PerformanceProfile;
import com.mypurecloud.sdk.v2.model.GetMetricResponse;
import com.mypurecloud.sdk.v2.model.GetProfilesResponse;
import com.mypurecloud.sdk.v2.model.WorkdayMetricListing;
import com.mypurecloud.sdk.v2.model.AttendanceStatusListing;
import com.mypurecloud.sdk.v2.model.UserBestPoints;
import com.mypurecloud.sdk.v2.model.AllTimePoints;
import com.mypurecloud.sdk.v2.model.SingleWorkdayAveragePoints;
import com.mypurecloud.sdk.v2.model.WorkdayPointsTrend;
import com.mypurecloud.sdk.v2.model.WorkdayValuesTrend;
import com.mypurecloud.sdk.v2.model.SingleWorkdayAverageValues;
import com.mypurecloud.sdk.v2.model.GamificationStatus;
import com.mypurecloud.sdk.v2.model.ObjectiveTemplate;
import com.mypurecloud.sdk.v2.model.GetTemplatesResponse;
import com.mypurecloud.sdk.v2.model.CreatePerformanceProfile;

public class GetGamificationMetricdefinitionRequest {
    
	private String metricDefinitionId;
	public String getMetricDefinitionId() {
		return this.metricDefinitionId;
	}

	public void setMetricDefinitionId(String metricDefinitionId) {
		this.metricDefinitionId = metricDefinitionId;
	}

	public GetGamificationMetricdefinitionRequest withMetricDefinitionId(String metricDefinitionId) {
	    this.setMetricDefinitionId(metricDefinitionId);
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

    public GetGamificationMetricdefinitionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'metricDefinitionId' is set
        if (this.metricDefinitionId == null) {
            throw new IllegalStateException("Missing the required parameter 'metricDefinitionId' when building request for GetGamificationMetricdefinitionRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/gamification/metricdefinitions/{metricDefinitionId}")
                .withPathParameter("metricDefinitionId", metricDefinitionId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String metricDefinitionId) {
	    return new Builder()
	            .withRequiredParams(metricDefinitionId);
	}
	

	public static class Builder {
		private final GetGamificationMetricdefinitionRequest request;

		private Builder() {
			request = new GetGamificationMetricdefinitionRequest();
		}

		
		public Builder withMetricDefinitionId(String metricDefinitionId) {
			request.setMetricDefinitionId(metricDefinitionId);
			return this;
		}
		

		
		public Builder withRequiredParams(String metricDefinitionId) {
			request.setMetricDefinitionId(metricDefinitionId);
			
			return this;
		}
		

		public GetGamificationMetricdefinitionRequest build() {
            
            // verify the required parameter 'metricDefinitionId' is set
            if (request.metricDefinitionId == null) {
                throw new IllegalStateException("Missing the required parameter 'metricDefinitionId' when building request for GetGamificationMetricdefinitionRequest.");
            }
            
			return request;
		}
	}
}
