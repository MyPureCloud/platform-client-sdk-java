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

import com.mypurecloud.sdk.v2.model.ActionAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ActionAggregationQuery;
import com.mypurecloud.sdk.v2.model.ActionAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ActionAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.AgentCopilotAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.AgentCopilotAggregationQuery;
import com.mypurecloud.sdk.v2.model.AgentCopilotAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.AgentCopilotAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.AgentStateCountsRequest;
import com.mypurecloud.sdk.v2.model.AgentStateQueryRequest;
import com.mypurecloud.sdk.v2.model.AnalyticsAgentStateAgentResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsAgentStateCountsResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsAgentStateQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributes;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributesMultiGetResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsDataRetentionResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsReportingSettings;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncConversationQuery;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.AsyncUserDetailsQuery;
import com.mypurecloud.sdk.v2.model.BotAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.BotAggregationQuery;
import com.mypurecloud.sdk.v2.model.BotAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.BotAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.ConversationActivityQuery;
import com.mypurecloud.sdk.v2.model.ConversationActivityResponse;
import com.mypurecloud.sdk.v2.model.ConversationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationAggregationQuery;
import com.mypurecloud.sdk.v2.model.ConversationAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.DashboardConfigurationBulkRequest;
import com.mypurecloud.sdk.v2.model.DashboardConfigurationListing;
import com.mypurecloud.sdk.v2.model.DashboardConfigurationQueryRequest;
import com.mypurecloud.sdk.v2.model.DashboardUser;
import com.mypurecloud.sdk.v2.model.DashboardUserListing;
import com.mypurecloud.sdk.v2.model.DataAvailabilityResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EvaluationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQuery;
import com.mypurecloud.sdk.v2.model.EvaluationAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowActivityQuery;
import com.mypurecloud.sdk.v2.model.FlowActivityResponse;
import com.mypurecloud.sdk.v2.model.FlowAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowExecutionAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowExecutionAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowExecutionAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowExecutionAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.KnowledgeAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeAggregationQuery;
import com.mypurecloud.sdk.v2.model.KnowledgeAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.QueueObservationQuery;
import com.mypurecloud.sdk.v2.model.QueueObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.RateLimitAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.RateLimitAggregationQuery;
import com.mypurecloud.sdk.v2.model.ReportingExportJobListing;
import com.mypurecloud.sdk.v2.model.ReportingExportJobRequest;
import com.mypurecloud.sdk.v2.model.ReportingExportJobResponse;
import com.mypurecloud.sdk.v2.model.ReportingExportMetadataJobListing;
import com.mypurecloud.sdk.v2.model.ReportingTurnsResponse;
import com.mypurecloud.sdk.v2.model.ResolutionAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ResolutionAggregationQuery;
import com.mypurecloud.sdk.v2.model.ResolutionAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ResolutionAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.RoutingActivityQuery;
import com.mypurecloud.sdk.v2.model.RoutingActivityResponse;
import com.mypurecloud.sdk.v2.model.SessionsResponse;
import com.mypurecloud.sdk.v2.model.SummaryAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SummaryAggregationQuery;
import com.mypurecloud.sdk.v2.model.SummaryAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SummaryAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.SurveyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregationQuery;
import com.mypurecloud.sdk.v2.model.SurveyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.TaskManagementAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.TaskManagementAggregationQuery;
import com.mypurecloud.sdk.v2.model.TaskManagementAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.TaskManagementAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.TeamActivityQuery;
import com.mypurecloud.sdk.v2.model.TeamActivityResponse;
import com.mypurecloud.sdk.v2.model.TranscriptAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.TranscriptAggregationQuery;
import com.mypurecloud.sdk.v2.model.TranscriptAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.TranscriptAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.TranscriptConversationDetailSearchRequest;
import com.mypurecloud.sdk.v2.model.UpdateAnalyticsDataRetentionRequest;
import com.mypurecloud.sdk.v2.model.UserActivityQuery;
import com.mypurecloud.sdk.v2.model.UserActivityResponse;
import com.mypurecloud.sdk.v2.model.UserAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.UserAggregationQuery;
import com.mypurecloud.sdk.v2.model.UserAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.UserAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.UserObservationQuery;
import com.mypurecloud.sdk.v2.model.UserObservationQueryResponse;

public class GetAnalyticsReportingSettingsUserDashboardsRequest {

	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public GetAnalyticsReportingSettingsUserDashboardsRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 

	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetAnalyticsReportingSettingsUserDashboardsRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetAnalyticsReportingSettingsUserDashboardsRequest withPageNumber(Integer pageNumber) {
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

	public GetAnalyticsReportingSettingsUserDashboardsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private Boolean publicOnly;
	public Boolean getPublicOnly() {
		return this.publicOnly;
	}

	public void setPublicOnly(Boolean publicOnly) {
		this.publicOnly = publicOnly;
	}

	public GetAnalyticsReportingSettingsUserDashboardsRequest withPublicOnly(Boolean publicOnly) {
	    this.setPublicOnly(publicOnly);
	    return this;
	} 

	private Boolean favoriteOnly;
	public Boolean getFavoriteOnly() {
		return this.favoriteOnly;
	}

	public void setFavoriteOnly(Boolean favoriteOnly) {
		this.favoriteOnly = favoriteOnly;
	}

	public GetAnalyticsReportingSettingsUserDashboardsRequest withFavoriteOnly(Boolean favoriteOnly) {
	    this.setFavoriteOnly(favoriteOnly);
	    return this;
	} 

	private Boolean deletedOnly;
	public Boolean getDeletedOnly() {
		return this.deletedOnly;
	}

	public void setDeletedOnly(Boolean deletedOnly) {
		this.deletedOnly = deletedOnly;
	}

	public GetAnalyticsReportingSettingsUserDashboardsRequest withDeletedOnly(Boolean deletedOnly) {
	    this.setDeletedOnly(deletedOnly);
	    return this;
	} 

	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetAnalyticsReportingSettingsUserDashboardsRequest withName(String name) {
	    this.setName(name);
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

    public GetAnalyticsReportingSettingsUserDashboardsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for GetAnalyticsReportingSettingsUserDashboardsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/analytics/reporting/settings/users/{userId}/dashboards")
                .withPathParameter("userId", userId)
        

                .withQueryParameters("sortBy", "", sortBy)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("publicOnly", "", publicOnly)
        

                .withQueryParameters("favoriteOnly", "", favoriteOnly)
        

                .withQueryParameters("deletedOnly", "", deletedOnly)
        

                .withQueryParameters("name", "", name)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String userId) {
	    return new Builder()
	            .withRequiredParams(userId);
	}


	public static class Builder {
		private final GetAnalyticsReportingSettingsUserDashboardsRequest request;

		private Builder() {
			request = new GetAnalyticsReportingSettingsUserDashboardsRequest();
		}


		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}

		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
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

		public Builder withPublicOnly(Boolean publicOnly) {
			request.setPublicOnly(publicOnly);
			return this;
		}

		public Builder withFavoriteOnly(Boolean favoriteOnly) {
			request.setFavoriteOnly(favoriteOnly);
			return this;
		}

		public Builder withDeletedOnly(Boolean deletedOnly) {
			request.setDeletedOnly(deletedOnly);
			return this;
		}

		public Builder withName(String name) {
			request.setName(name);
			return this;
		}



		public Builder withRequiredParams(String userId) {
			request.setUserId(userId);

			return this;
		}


		public GetAnalyticsReportingSettingsUserDashboardsRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for GetAnalyticsReportingSettingsUserDashboardsRequest.");
            }
            
			return request;
		}
	}
}
