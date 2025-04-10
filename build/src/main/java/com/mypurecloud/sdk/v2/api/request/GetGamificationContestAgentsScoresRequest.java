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

public class GetGamificationContestAgentsScoresRequest {

	private String contestId;
	public String getContestId() {
		return this.contestId;
	}

	public void setContestId(String contestId) {
		this.contestId = contestId;
	}

	public GetGamificationContestAgentsScoresRequest withContestId(String contestId) {
	    this.setContestId(contestId);
	    return this;
	} 

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetGamificationContestAgentsScoresRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetGamificationContestAgentsScoresRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private LocalDate workday;
	public LocalDate getWorkday() {
		return this.workday;
	}

	public void setWorkday(LocalDate workday) {
		this.workday = workday;
	}

	public GetGamificationContestAgentsScoresRequest withWorkday(LocalDate workday) {
	    this.setWorkday(workday);
	    return this;
	} 

	private String returnsView;
	public String getReturnsView() {
		return this.returnsView;
	}

	public void setReturnsView(String returnsView) {
		this.returnsView = returnsView;
	}

	public GetGamificationContestAgentsScoresRequest withReturnsView(String returnsView) {
	    this.setReturnsView(returnsView);
	    return this;
	} 

	public enum returnsViewValues { 
		ALL("All"),
		TOPANDBOTTOM("TopAndBottom");

		private String value;

		returnsViewValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static returnsViewValues fromString(String key) {
			if (key == null) return null;

			for (returnsViewValues value : returnsViewValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return returnsViewValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
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

    public GetGamificationContestAgentsScoresRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'contestId' is set
        if (this.contestId == null) {
            throw new IllegalStateException("Missing the required parameter 'contestId' when building request for GetGamificationContestAgentsScoresRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/gamification/contests/{contestId}/agents/scores")
                .withPathParameter("contestId", contestId)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("workday", "", workday)
        

                .withQueryParameters("returnsView", "", returnsView)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String contestId) {
	    return new Builder()
	            .withRequiredParams(contestId);
	}


	public static class Builder {
		private final GetGamificationContestAgentsScoresRequest request;

		private Builder() {
			request = new GetGamificationContestAgentsScoresRequest();
		}


		public Builder withContestId(String contestId) {
			request.setContestId(contestId);
			return this;
		}

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withWorkday(LocalDate workday) {
			request.setWorkday(workday);
			return this;
		}

		public Builder withReturnsView(String returnsView) {
			request.setReturnsView(returnsView);
			return this;
		}



		
		public Builder withReturnsView(returnsViewValues returnsView) {
		    request.setReturnsView(returnsView.toString());

		    return this;
		}



		public Builder withRequiredParams(String contestId) {
			request.setContestId(contestId);

			return this;
		}


		public GetGamificationContestAgentsScoresRequest build() {
            
            // verify the required parameter 'contestId' is set
            if (request.contestId == null) {
                throw new IllegalStateException("Missing the required parameter 'contestId' when building request for GetGamificationContestAgentsScoresRequest.");
            }
            
			return request;
		}
	}
}
