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

public class PutGamificationProfileRequest {
    
	private String performanceProfileId;
	public String getPerformanceProfileId() {
		return this.performanceProfileId;
	}

	public void setPerformanceProfileId(String performanceProfileId) {
		this.performanceProfileId = performanceProfileId;
	}

	public PutGamificationProfileRequest withPerformanceProfileId(String performanceProfileId) {
	    this.setPerformanceProfileId(performanceProfileId);
	    return this;
	} 
	
	private PerformanceProfile body;
	public PerformanceProfile getBody() {
		return this.body;
	}

	public void setBody(PerformanceProfile body) {
		this.body = body;
	}

	public PutGamificationProfileRequest withBody(PerformanceProfile body) {
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

    public PutGamificationProfileRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<PerformanceProfile> withHttpInfo() {
        
        // verify the required parameter 'performanceProfileId' is set
        if (this.performanceProfileId == null) {
            throw new IllegalStateException("Missing the required parameter 'performanceProfileId' when building request for PutGamificationProfileRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/gamification/profiles/{performanceProfileId}")
                .withPathParameter("performanceProfileId", performanceProfileId)
        
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

	
	public static Builder builder(String performanceProfileId) {
	    return new Builder()
	            .withRequiredParams(performanceProfileId);
	}
	

	public static class Builder {
		private final PutGamificationProfileRequest request;

		private Builder() {
			request = new PutGamificationProfileRequest();
		}

		
		public Builder withPerformanceProfileId(String performanceProfileId) {
			request.setPerformanceProfileId(performanceProfileId);
			return this;
		}
		
		public Builder withBody(PerformanceProfile body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String performanceProfileId) {
			request.setPerformanceProfileId(performanceProfileId);
			
			return this;
		}
		

		public PutGamificationProfileRequest build() {
            
            // verify the required parameter 'performanceProfileId' is set
            if (request.performanceProfileId == null) {
                throw new IllegalStateException("Missing the required parameter 'performanceProfileId' when building request for PutGamificationProfileRequest.");
            }
            
			return request;
		}
	}
}
