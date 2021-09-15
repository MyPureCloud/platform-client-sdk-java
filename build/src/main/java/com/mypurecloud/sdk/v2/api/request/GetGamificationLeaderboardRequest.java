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

public class GetGamificationLeaderboardRequest {
    
	private LocalDate startWorkday;
	public LocalDate getStartWorkday() {
		return this.startWorkday;
	}

	public void setStartWorkday(LocalDate startWorkday) {
		this.startWorkday = startWorkday;
	}

	public GetGamificationLeaderboardRequest withStartWorkday(LocalDate startWorkday) {
	    this.setStartWorkday(startWorkday);
	    return this;
	} 
	
	private LocalDate endWorkday;
	public LocalDate getEndWorkday() {
		return this.endWorkday;
	}

	public void setEndWorkday(LocalDate endWorkday) {
		this.endWorkday = endWorkday;
	}

	public GetGamificationLeaderboardRequest withEndWorkday(LocalDate endWorkday) {
	    this.setEndWorkday(endWorkday);
	    return this;
	} 
	
	private String metricId;
	public String getMetricId() {
		return this.metricId;
	}

	public void setMetricId(String metricId) {
		this.metricId = metricId;
	}

	public GetGamificationLeaderboardRequest withMetricId(String metricId) {
	    this.setMetricId(metricId);
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

    public GetGamificationLeaderboardRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'startWorkday' is set
        if (this.startWorkday == null) {
            throw new IllegalStateException("Missing the required parameter 'startWorkday' when building request for GetGamificationLeaderboardRequest.");
        }
        
        // verify the required parameter 'endWorkday' is set
        if (this.endWorkday == null) {
            throw new IllegalStateException("Missing the required parameter 'endWorkday' when building request for GetGamificationLeaderboardRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/gamification/leaderboard")
                .withQueryParameters("startWorkday", "", startWorkday)
        
                .withQueryParameters("endWorkday", "", endWorkday)
        
                .withQueryParameters("metricId", "", metricId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(LocalDate startWorkday, LocalDate endWorkday) {
	    return new Builder()
	            .withRequiredParams(startWorkday, endWorkday);
	}
	

	public static class Builder {
		private final GetGamificationLeaderboardRequest request;

		private Builder() {
			request = new GetGamificationLeaderboardRequest();
		}

		
		public Builder withStartWorkday(LocalDate startWorkday) {
			request.setStartWorkday(startWorkday);
			return this;
		}
		
		public Builder withEndWorkday(LocalDate endWorkday) {
			request.setEndWorkday(endWorkday);
			return this;
		}
		
		public Builder withMetricId(String metricId) {
			request.setMetricId(metricId);
			return this;
		}
		

		
		public Builder withRequiredParams(LocalDate startWorkday, LocalDate endWorkday) {
			request.setStartWorkday(startWorkday);
						request.setEndWorkday(endWorkday);
			
			return this;
		}
		

		public GetGamificationLeaderboardRequest build() {
            
            // verify the required parameter 'startWorkday' is set
            if (request.startWorkday == null) {
                throw new IllegalStateException("Missing the required parameter 'startWorkday' when building request for GetGamificationLeaderboardRequest.");
            }
            
            // verify the required parameter 'endWorkday' is set
            if (request.endWorkday == null) {
                throw new IllegalStateException("Missing the required parameter 'endWorkday' when building request for GetGamificationLeaderboardRequest.");
            }
            
			return request;
		}
	}
}
