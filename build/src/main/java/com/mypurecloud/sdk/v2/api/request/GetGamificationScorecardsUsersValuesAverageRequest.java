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

public class GetGamificationScorecardsUsersValuesAverageRequest {
    
	private String filterType;
	public String getFilterType() {
		return this.filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public GetGamificationScorecardsUsersValuesAverageRequest withFilterType(String filterType) {
	    this.setFilterType(filterType);
	    return this;
	} 

	public enum filterTypeValues { 
		PERFORMANCEPROFILE("PerformanceProfile"), 
		DIVISION("Division");

		private String value;

		filterTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static filterTypeValues fromString(String key) {
			if (key == null) return null;

			for (filterTypeValues value : filterTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return filterTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String filterId;
	public String getFilterId() {
		return this.filterId;
	}

	public void setFilterId(String filterId) {
		this.filterId = filterId;
	}

	public GetGamificationScorecardsUsersValuesAverageRequest withFilterId(String filterId) {
	    this.setFilterId(filterId);
	    return this;
	} 
	
	private LocalDate workday;
	public LocalDate getWorkday() {
		return this.workday;
	}

	public void setWorkday(LocalDate workday) {
		this.workday = workday;
	}

	public GetGamificationScorecardsUsersValuesAverageRequest withWorkday(LocalDate workday) {
	    this.setWorkday(workday);
	    return this;
	} 
	
	private String timeZone;
	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public GetGamificationScorecardsUsersValuesAverageRequest withTimeZone(String timeZone) {
	    this.setTimeZone(timeZone);
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

    public GetGamificationScorecardsUsersValuesAverageRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'filterType' is set
        if (this.filterType == null) {
            throw new IllegalStateException("Missing the required parameter 'filterType' when building request for GetGamificationScorecardsUsersValuesAverageRequest.");
        }
        
        // verify the required parameter 'filterId' is set
        if (this.filterId == null) {
            throw new IllegalStateException("Missing the required parameter 'filterId' when building request for GetGamificationScorecardsUsersValuesAverageRequest.");
        }
        
        // verify the required parameter 'workday' is set
        if (this.workday == null) {
            throw new IllegalStateException("Missing the required parameter 'workday' when building request for GetGamificationScorecardsUsersValuesAverageRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/gamification/scorecards/users/values/average")
                .withQueryParameters("filterType", "", filterType)
        
                .withQueryParameters("filterId", "", filterId)
        
                .withQueryParameters("workday", "", workday)
        
                .withQueryParameters("timeZone", "", timeZone)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String filterType, String filterId, LocalDate workday) {
	    return new Builder()
	            .withRequiredParams(filterType, filterId, workday);
	}
	

	public static class Builder {
		private final GetGamificationScorecardsUsersValuesAverageRequest request;

		private Builder() {
			request = new GetGamificationScorecardsUsersValuesAverageRequest();
		}

		
		public Builder withFilterType(String filterType) {
			request.setFilterType(filterType);
			return this;
		}

		public Builder withFilterType(filterTypeValues filterType) {
		    request.setFilterType(filterType.toString());
		    return this;
		}
		
		public Builder withFilterId(String filterId) {
			request.setFilterId(filterId);
			return this;
		}
		
		public Builder withWorkday(LocalDate workday) {
			request.setWorkday(workday);
			return this;
		}
		
		public Builder withTimeZone(String timeZone) {
			request.setTimeZone(timeZone);
			return this;
		}
		

		
		public Builder withRequiredParams(String filterType, String filterId, LocalDate workday) {
			request.setFilterType(filterType);
						request.setFilterId(filterId);
						request.setWorkday(workday);
			
			return this;
		}
		

		public GetGamificationScorecardsUsersValuesAverageRequest build() {
            
            // verify the required parameter 'filterType' is set
            if (request.filterType == null) {
                throw new IllegalStateException("Missing the required parameter 'filterType' when building request for GetGamificationScorecardsUsersValuesAverageRequest.");
            }
            
            // verify the required parameter 'filterId' is set
            if (request.filterId == null) {
                throw new IllegalStateException("Missing the required parameter 'filterId' when building request for GetGamificationScorecardsUsersValuesAverageRequest.");
            }
            
            // verify the required parameter 'workday' is set
            if (request.workday == null) {
                throw new IllegalStateException("Missing the required parameter 'workday' when building request for GetGamificationScorecardsUsersValuesAverageRequest.");
            }
            
			return request;
		}
	}
}
