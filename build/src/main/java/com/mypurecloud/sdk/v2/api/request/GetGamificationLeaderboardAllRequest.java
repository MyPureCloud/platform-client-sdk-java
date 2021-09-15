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

public class GetGamificationLeaderboardAllRequest {
    
	private String filterType;
	public String getFilterType() {
		return this.filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public GetGamificationLeaderboardAllRequest withFilterType(String filterType) {
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

	public GetGamificationLeaderboardAllRequest withFilterId(String filterId) {
	    this.setFilterId(filterId);
	    return this;
	} 
	
	private LocalDate startWorkday;
	public LocalDate getStartWorkday() {
		return this.startWorkday;
	}

	public void setStartWorkday(LocalDate startWorkday) {
		this.startWorkday = startWorkday;
	}

	public GetGamificationLeaderboardAllRequest withStartWorkday(LocalDate startWorkday) {
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

	public GetGamificationLeaderboardAllRequest withEndWorkday(LocalDate endWorkday) {
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

	public GetGamificationLeaderboardAllRequest withMetricId(String metricId) {
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

    public GetGamificationLeaderboardAllRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'filterType' is set
        if (this.filterType == null) {
            throw new IllegalStateException("Missing the required parameter 'filterType' when building request for GetGamificationLeaderboardAllRequest.");
        }
        
        // verify the required parameter 'filterId' is set
        if (this.filterId == null) {
            throw new IllegalStateException("Missing the required parameter 'filterId' when building request for GetGamificationLeaderboardAllRequest.");
        }
        
        // verify the required parameter 'startWorkday' is set
        if (this.startWorkday == null) {
            throw new IllegalStateException("Missing the required parameter 'startWorkday' when building request for GetGamificationLeaderboardAllRequest.");
        }
        
        // verify the required parameter 'endWorkday' is set
        if (this.endWorkday == null) {
            throw new IllegalStateException("Missing the required parameter 'endWorkday' when building request for GetGamificationLeaderboardAllRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/gamification/leaderboard/all")
                .withQueryParameters("filterType", "", filterType)
        
                .withQueryParameters("filterId", "", filterId)
        
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

	
	public static Builder builder(String filterType, String filterId, LocalDate startWorkday, LocalDate endWorkday) {
	    return new Builder()
	            .withRequiredParams(filterType, filterId, startWorkday, endWorkday);
	}
	

	public static class Builder {
		private final GetGamificationLeaderboardAllRequest request;

		private Builder() {
			request = new GetGamificationLeaderboardAllRequest();
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
		

		
		public Builder withRequiredParams(String filterType, String filterId, LocalDate startWorkday, LocalDate endWorkday) {
			request.setFilterType(filterType);
						request.setFilterId(filterId);
						request.setStartWorkday(startWorkday);
						request.setEndWorkday(endWorkday);
			
			return this;
		}
		

		public GetGamificationLeaderboardAllRequest build() {
            
            // verify the required parameter 'filterType' is set
            if (request.filterType == null) {
                throw new IllegalStateException("Missing the required parameter 'filterType' when building request for GetGamificationLeaderboardAllRequest.");
            }
            
            // verify the required parameter 'filterId' is set
            if (request.filterId == null) {
                throw new IllegalStateException("Missing the required parameter 'filterId' when building request for GetGamificationLeaderboardAllRequest.");
            }
            
            // verify the required parameter 'startWorkday' is set
            if (request.startWorkday == null) {
                throw new IllegalStateException("Missing the required parameter 'startWorkday' when building request for GetGamificationLeaderboardAllRequest.");
            }
            
            // verify the required parameter 'endWorkday' is set
            if (request.endWorkday == null) {
                throw new IllegalStateException("Missing the required parameter 'endWorkday' when building request for GetGamificationLeaderboardAllRequest.");
            }
            
			return request;
		}
	}
}
