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

import com.mypurecloud.sdk.v2.model.AllTimePoints;
import com.mypurecloud.sdk.v2.model.AssignUsers;
import com.mypurecloud.sdk.v2.model.Assignment;
import com.mypurecloud.sdk.v2.model.AssignmentValidation;
import com.mypurecloud.sdk.v2.model.AttendanceStatusListing;
import com.mypurecloud.sdk.v2.model.CreateMetric;
import com.mypurecloud.sdk.v2.model.CreatePerformanceProfile;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExternalMetricDataWriteRequest;
import com.mypurecloud.sdk.v2.model.ExternalMetricDataWriteResponse;
import com.mypurecloud.sdk.v2.model.ExternalMetricDefinition;
import com.mypurecloud.sdk.v2.model.ExternalMetricDefinitionCreateRequest;
import com.mypurecloud.sdk.v2.model.ExternalMetricDefinitionListing;
import com.mypurecloud.sdk.v2.model.ExternalMetricDefinitionUpdateRequest;
import com.mypurecloud.sdk.v2.model.GamificationStatus;
import com.mypurecloud.sdk.v2.model.GetMetricDefinitionsResponse;
import com.mypurecloud.sdk.v2.model.GetMetricResponse;
import com.mypurecloud.sdk.v2.model.GetMetricsResponse;
import com.mypurecloud.sdk.v2.model.GetProfilesResponse;
import com.mypurecloud.sdk.v2.model.GetTemplatesResponse;
import com.mypurecloud.sdk.v2.model.Leaderboard;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.MemberListing;
import com.mypurecloud.sdk.v2.model.Metric;
import com.mypurecloud.sdk.v2.model.MetricDefinition;
import com.mypurecloud.sdk.v2.model.MetricValueTrendAverage;
import com.mypurecloud.sdk.v2.model.ObjectiveTemplate;
import com.mypurecloud.sdk.v2.model.OverallBestPoints;
import com.mypurecloud.sdk.v2.model.PerformanceProfile;
import com.mypurecloud.sdk.v2.model.SingleWorkdayAveragePoints;
import com.mypurecloud.sdk.v2.model.SingleWorkdayAverageValues;
import com.mypurecloud.sdk.v2.model.TargetPerformanceProfile;
import com.mypurecloud.sdk.v2.model.UserBestPoints;
import com.mypurecloud.sdk.v2.model.ValidateAssignUsers;
import com.mypurecloud.sdk.v2.model.WorkdayMetricListing;
import com.mypurecloud.sdk.v2.model.WorkdayPointsTrend;
import com.mypurecloud.sdk.v2.model.WorkdayValuesTrend;

public class GetGamificationScorecardsProfileMetricValuesTrendsRequest {

	private String profileId;
	public String getProfileId() {
		return this.profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public GetGamificationScorecardsProfileMetricValuesTrendsRequest withProfileId(String profileId) {
	    this.setProfileId(profileId);
	    return this;
	} 

	private String metricId;
	public String getMetricId() {
		return this.metricId;
	}

	public void setMetricId(String metricId) {
		this.metricId = metricId;
	}

	public GetGamificationScorecardsProfileMetricValuesTrendsRequest withMetricId(String metricId) {
	    this.setMetricId(metricId);
	    return this;
	} 

	private LocalDate startWorkday;
	public LocalDate getStartWorkday() {
		return this.startWorkday;
	}

	public void setStartWorkday(LocalDate startWorkday) {
		this.startWorkday = startWorkday;
	}

	public GetGamificationScorecardsProfileMetricValuesTrendsRequest withStartWorkday(LocalDate startWorkday) {
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

	public GetGamificationScorecardsProfileMetricValuesTrendsRequest withEndWorkday(LocalDate endWorkday) {
	    this.setEndWorkday(endWorkday);
	    return this;
	} 

	private String filterType;
	public String getFilterType() {
		return this.filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public GetGamificationScorecardsProfileMetricValuesTrendsRequest withFilterType(String filterType) {
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

	private LocalDate referenceWorkday;
	public LocalDate getReferenceWorkday() {
		return this.referenceWorkday;
	}

	public void setReferenceWorkday(LocalDate referenceWorkday) {
		this.referenceWorkday = referenceWorkday;
	}

	public GetGamificationScorecardsProfileMetricValuesTrendsRequest withReferenceWorkday(LocalDate referenceWorkday) {
	    this.setReferenceWorkday(referenceWorkday);
	    return this;
	} 

	private String timeZone;
	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public GetGamificationScorecardsProfileMetricValuesTrendsRequest withTimeZone(String timeZone) {
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

    public GetGamificationScorecardsProfileMetricValuesTrendsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'profileId' is set
        if (this.profileId == null) {
            throw new IllegalStateException("Missing the required parameter 'profileId' when building request for GetGamificationScorecardsProfileMetricValuesTrendsRequest.");
        }
        
        // verify the required parameter 'metricId' is set
        if (this.metricId == null) {
            throw new IllegalStateException("Missing the required parameter 'metricId' when building request for GetGamificationScorecardsProfileMetricValuesTrendsRequest.");
        }
        
        // verify the required parameter 'startWorkday' is set
        if (this.startWorkday == null) {
            throw new IllegalStateException("Missing the required parameter 'startWorkday' when building request for GetGamificationScorecardsProfileMetricValuesTrendsRequest.");
        }
        
        // verify the required parameter 'endWorkday' is set
        if (this.endWorkday == null) {
            throw new IllegalStateException("Missing the required parameter 'endWorkday' when building request for GetGamificationScorecardsProfileMetricValuesTrendsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/gamification/scorecards/profiles/{profileId}/metrics/{metricId}/values/trends")
                .withPathParameter("profileId", profileId)
        
                .withPathParameter("metricId", metricId)
        

                .withQueryParameters("filterType", "", filterType)
        

                .withQueryParameters("startWorkday", "", startWorkday)
        

                .withQueryParameters("endWorkday", "", endWorkday)
        

                .withQueryParameters("referenceWorkday", "", referenceWorkday)
        

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


	public static Builder builder(String profileId, String metricId, LocalDate startWorkday, LocalDate endWorkday) {
	    return new Builder()
	            .withRequiredParams(profileId, metricId, startWorkday, endWorkday);
	}


	public static class Builder {
		private final GetGamificationScorecardsProfileMetricValuesTrendsRequest request;

		private Builder() {
			request = new GetGamificationScorecardsProfileMetricValuesTrendsRequest();
		}


		public Builder withProfileId(String profileId) {
			request.setProfileId(profileId);
			return this;
		}

		public Builder withMetricId(String metricId) {
			request.setMetricId(metricId);
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

		public Builder withFilterType(String filterType) {
			request.setFilterType(filterType);
			return this;
		}



		
		public Builder withFilterType(filterTypeValues filterType) {
		    request.setFilterType(filterType.toString());

		    return this;
		}

		public Builder withReferenceWorkday(LocalDate referenceWorkday) {
			request.setReferenceWorkday(referenceWorkday);
			return this;
		}

		public Builder withTimeZone(String timeZone) {
			request.setTimeZone(timeZone);
			return this;
		}



		public Builder withRequiredParams(String profileId, String metricId, LocalDate startWorkday, LocalDate endWorkday) {
			request.setProfileId(profileId);
			request.setMetricId(metricId);
			request.setStartWorkday(startWorkday);
			request.setEndWorkday(endWorkday);

			return this;
		}


		public GetGamificationScorecardsProfileMetricValuesTrendsRequest build() {
            
            // verify the required parameter 'profileId' is set
            if (request.profileId == null) {
                throw new IllegalStateException("Missing the required parameter 'profileId' when building request for GetGamificationScorecardsProfileMetricValuesTrendsRequest.");
            }
            
            // verify the required parameter 'metricId' is set
            if (request.metricId == null) {
                throw new IllegalStateException("Missing the required parameter 'metricId' when building request for GetGamificationScorecardsProfileMetricValuesTrendsRequest.");
            }
            
            // verify the required parameter 'startWorkday' is set
            if (request.startWorkday == null) {
                throw new IllegalStateException("Missing the required parameter 'startWorkday' when building request for GetGamificationScorecardsProfileMetricValuesTrendsRequest.");
            }
            
            // verify the required parameter 'endWorkday' is set
            if (request.endWorkday == null) {
                throw new IllegalStateException("Missing the required parameter 'endWorkday' when building request for GetGamificationScorecardsProfileMetricValuesTrendsRequest.");
            }
            
			return request;
		}
	}
}
