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
import com.mypurecloud.sdk.v2.model.ContestScoresAgentTrendList;
import com.mypurecloud.sdk.v2.model.ContestScoresAgentsPagedList;
import com.mypurecloud.sdk.v2.model.ContestScoresGroupTrendList;
import com.mypurecloud.sdk.v2.model.ContestsCreateRequest;
import com.mypurecloud.sdk.v2.model.ContestsFinalizeRequest;
import com.mypurecloud.sdk.v2.model.ContestsResponse;
import com.mypurecloud.sdk.v2.model.CreateMetric;
import com.mypurecloud.sdk.v2.model.CreatePerformanceProfile;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExternalMetricDataWriteRequest;
import com.mypurecloud.sdk.v2.model.ExternalMetricDataWriteResponse;
import com.mypurecloud.sdk.v2.model.ExternalMetricDefinition;
import com.mypurecloud.sdk.v2.model.ExternalMetricDefinitionCreateRequest;
import com.mypurecloud.sdk.v2.model.ExternalMetricDefinitionListing;
import com.mypurecloud.sdk.v2.model.ExternalMetricDefinitionUpdateRequest;
import com.mypurecloud.sdk.v2.model.GamificationContestPrizeImageUploadUrlRequest;
import com.mypurecloud.sdk.v2.model.GamificationStatus;
import com.mypurecloud.sdk.v2.model.GetContestsEssentialsListing;
import com.mypurecloud.sdk.v2.model.GetMetricDefinitionsResponse;
import com.mypurecloud.sdk.v2.model.GetMetricResponse;
import com.mypurecloud.sdk.v2.model.GetMetricsResponse;
import com.mypurecloud.sdk.v2.model.GetProfilesResponse;
import com.mypurecloud.sdk.v2.model.GetTemplatesResponse;
import com.mypurecloud.sdk.v2.model.InsightsAgents;
import com.mypurecloud.sdk.v2.model.InsightsDetails;
import com.mypurecloud.sdk.v2.model.InsightsRankings;
import com.mypurecloud.sdk.v2.model.InsightsSummary;
import com.mypurecloud.sdk.v2.model.InsightsTrend;
import com.mypurecloud.sdk.v2.model.Leaderboard;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.MemberListing;
import com.mypurecloud.sdk.v2.model.Metric;
import com.mypurecloud.sdk.v2.model.MetricDefinition;
import com.mypurecloud.sdk.v2.model.MetricValueTrendAverage;
import com.mypurecloud.sdk.v2.model.ObjectiveTemplate;
import com.mypurecloud.sdk.v2.model.OverallBestPoints;
import com.mypurecloud.sdk.v2.model.PerformanceProfile;
import com.mypurecloud.sdk.v2.model.PrizeImages;
import com.mypurecloud.sdk.v2.model.SingleWorkdayAveragePoints;
import com.mypurecloud.sdk.v2.model.SingleWorkdayAverageValues;
import com.mypurecloud.sdk.v2.model.TargetPerformanceProfile;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;
import com.mypurecloud.sdk.v2.model.UserBestPoints;
import com.mypurecloud.sdk.v2.model.UserInsightsTrend;
import com.mypurecloud.sdk.v2.model.UserProfilesInDateRange;
import com.mypurecloud.sdk.v2.model.UserProfilesInDateRangeRequest;
import com.mypurecloud.sdk.v2.model.ValidateAssignUsers;
import com.mypurecloud.sdk.v2.model.WorkdayMetricListing;
import com.mypurecloud.sdk.v2.model.WorkdayPointsTrend;
import com.mypurecloud.sdk.v2.model.WorkdayValuesTrend;

public class GetGamificationInsightsDetailsRequest {

	private String filterType;
	public String getFilterType() {
		return this.filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public GetGamificationInsightsDetailsRequest withFilterType(String filterType) {
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

	public GetGamificationInsightsDetailsRequest withFilterId(String filterId) {
	    this.setFilterId(filterId);
	    return this;
	} 

	private String granularity;
	public String getGranularity() {
		return this.granularity;
	}

	public void setGranularity(String granularity) {
		this.granularity = granularity;
	}

	public GetGamificationInsightsDetailsRequest withGranularity(String granularity) {
	    this.setGranularity(granularity);
	    return this;
	} 

	public enum granularityValues { 
		WEEKLY("Weekly"),
		MONTHLY("Monthly");

		private String value;

		granularityValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static granularityValues fromString(String key) {
			if (key == null) return null;

			for (granularityValues value : granularityValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return granularityValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private LocalDate comparativePeriodStartWorkday;
	public LocalDate getComparativePeriodStartWorkday() {
		return this.comparativePeriodStartWorkday;
	}

	public void setComparativePeriodStartWorkday(LocalDate comparativePeriodStartWorkday) {
		this.comparativePeriodStartWorkday = comparativePeriodStartWorkday;
	}

	public GetGamificationInsightsDetailsRequest withComparativePeriodStartWorkday(LocalDate comparativePeriodStartWorkday) {
	    this.setComparativePeriodStartWorkday(comparativePeriodStartWorkday);
	    return this;
	} 

	private LocalDate primaryPeriodStartWorkday;
	public LocalDate getPrimaryPeriodStartWorkday() {
		return this.primaryPeriodStartWorkday;
	}

	public void setPrimaryPeriodStartWorkday(LocalDate primaryPeriodStartWorkday) {
		this.primaryPeriodStartWorkday = primaryPeriodStartWorkday;
	}

	public GetGamificationInsightsDetailsRequest withPrimaryPeriodStartWorkday(LocalDate primaryPeriodStartWorkday) {
	    this.setPrimaryPeriodStartWorkday(primaryPeriodStartWorkday);
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

    public GetGamificationInsightsDetailsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'filterType' is set
        if (this.filterType == null) {
            throw new IllegalStateException("Missing the required parameter 'filterType' when building request for GetGamificationInsightsDetailsRequest.");
        }
        
        // verify the required parameter 'filterId' is set
        if (this.filterId == null) {
            throw new IllegalStateException("Missing the required parameter 'filterId' when building request for GetGamificationInsightsDetailsRequest.");
        }
        
        // verify the required parameter 'granularity' is set
        if (this.granularity == null) {
            throw new IllegalStateException("Missing the required parameter 'granularity' when building request for GetGamificationInsightsDetailsRequest.");
        }
        
        // verify the required parameter 'comparativePeriodStartWorkday' is set
        if (this.comparativePeriodStartWorkday == null) {
            throw new IllegalStateException("Missing the required parameter 'comparativePeriodStartWorkday' when building request for GetGamificationInsightsDetailsRequest.");
        }
        
        // verify the required parameter 'primaryPeriodStartWorkday' is set
        if (this.primaryPeriodStartWorkday == null) {
            throw new IllegalStateException("Missing the required parameter 'primaryPeriodStartWorkday' when building request for GetGamificationInsightsDetailsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/gamification/insights/details")

                .withQueryParameters("filterType", "", filterType)
        

                .withQueryParameters("filterId", "", filterId)
        

                .withQueryParameters("granularity", "", granularity)
        

                .withQueryParameters("comparativePeriodStartWorkday", "", comparativePeriodStartWorkday)
        

                .withQueryParameters("primaryPeriodStartWorkday", "", primaryPeriodStartWorkday)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday) {
	    return new Builder()
	            .withRequiredParams(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday);
	}


	public static class Builder {
		private final GetGamificationInsightsDetailsRequest request;

		private Builder() {
			request = new GetGamificationInsightsDetailsRequest();
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

		public Builder withGranularity(String granularity) {
			request.setGranularity(granularity);
			return this;
		}



		
		public Builder withGranularity(granularityValues granularity) {
		    request.setGranularity(granularity.toString());

		    return this;
		}

		public Builder withComparativePeriodStartWorkday(LocalDate comparativePeriodStartWorkday) {
			request.setComparativePeriodStartWorkday(comparativePeriodStartWorkday);
			return this;
		}

		public Builder withPrimaryPeriodStartWorkday(LocalDate primaryPeriodStartWorkday) {
			request.setPrimaryPeriodStartWorkday(primaryPeriodStartWorkday);
			return this;
		}



		public Builder withRequiredParams(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday) {
			request.setFilterType(filterType);
			request.setFilterId(filterId);
			request.setGranularity(granularity);
			request.setComparativePeriodStartWorkday(comparativePeriodStartWorkday);
			request.setPrimaryPeriodStartWorkday(primaryPeriodStartWorkday);

			return this;
		}


		public GetGamificationInsightsDetailsRequest build() {
            
            // verify the required parameter 'filterType' is set
            if (request.filterType == null) {
                throw new IllegalStateException("Missing the required parameter 'filterType' when building request for GetGamificationInsightsDetailsRequest.");
            }
            
            // verify the required parameter 'filterId' is set
            if (request.filterId == null) {
                throw new IllegalStateException("Missing the required parameter 'filterId' when building request for GetGamificationInsightsDetailsRequest.");
            }
            
            // verify the required parameter 'granularity' is set
            if (request.granularity == null) {
                throw new IllegalStateException("Missing the required parameter 'granularity' when building request for GetGamificationInsightsDetailsRequest.");
            }
            
            // verify the required parameter 'comparativePeriodStartWorkday' is set
            if (request.comparativePeriodStartWorkday == null) {
                throw new IllegalStateException("Missing the required parameter 'comparativePeriodStartWorkday' when building request for GetGamificationInsightsDetailsRequest.");
            }
            
            // verify the required parameter 'primaryPeriodStartWorkday' is set
            if (request.primaryPeriodStartWorkday == null) {
                throw new IllegalStateException("Missing the required parameter 'primaryPeriodStartWorkday' when building request for GetGamificationInsightsDetailsRequest.");
            }
            
			return request;
		}
	}
}
