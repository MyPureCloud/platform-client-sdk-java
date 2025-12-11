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
import com.mypurecloud.sdk.v2.model.CaseManagementAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.CaseManagementAggregationQuery;
import com.mypurecloud.sdk.v2.model.CaseManagementAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.CaseManagementAsyncAggregationQuery;
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
import com.mypurecloud.sdk.v2.model.DataExtractionFileSchemaListing;
import com.mypurecloud.sdk.v2.model.DataExtractionFileUrlListing;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.DownloadServiceRequest;
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

public class GetAnalyticsReportingSettingsDashboardsQueryRequest {

	private String dashboardType;
	public String getDashboardType() {
		return this.dashboardType;
	}

	public void setDashboardType(String dashboardType) {
		this.dashboardType = dashboardType;
	}

	public GetAnalyticsReportingSettingsDashboardsQueryRequest withDashboardType(String dashboardType) {
	    this.setDashboardType(dashboardType);
	    return this;
	} 

	public enum dashboardTypeValues { 
		ALL("All"),
		PUBLIC("Public"),
		PRIVATE("Private"),
		SHARED("Shared"),
		FAVORITES("Favorites");

		private String value;

		dashboardTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static dashboardTypeValues fromString(String key) {
			if (key == null) return null;

			for (dashboardTypeValues value : dashboardTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return dashboardTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String dashboardAccessFilter;
	public String getDashboardAccessFilter() {
		return this.dashboardAccessFilter;
	}

	public void setDashboardAccessFilter(String dashboardAccessFilter) {
		this.dashboardAccessFilter = dashboardAccessFilter;
	}

	public GetAnalyticsReportingSettingsDashboardsQueryRequest withDashboardAccessFilter(String dashboardAccessFilter) {
	    this.setDashboardAccessFilter(dashboardAccessFilter);
	    return this;
	} 

	public enum dashboardAccessFilterValues { 
		OWNEDBYME("OwnedByMe"),
		OWNEDBYANYONE("OwnedByAnyone"),
		NOTOWNEDBYME("NotOwnedByMe");

		private String value;

		dashboardAccessFilterValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static dashboardAccessFilterValues fromString(String key) {
			if (key == null) return null;

			for (dashboardAccessFilterValues value : dashboardAccessFilterValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return dashboardAccessFilterValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetAnalyticsReportingSettingsDashboardsQueryRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 

	private String dashboardState;
	public String getDashboardState() {
		return this.dashboardState;
	}

	public void setDashboardState(String dashboardState) {
		this.dashboardState = dashboardState;
	}

	public GetAnalyticsReportingSettingsDashboardsQueryRequest withDashboardState(String dashboardState) {
	    this.setDashboardState(dashboardState);
	    return this;
	} 

	public enum dashboardStateValues { 
		ACTIVE("Active"),
		DELETED("Deleted");

		private String value;

		dashboardStateValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static dashboardStateValues fromString(String key) {
			if (key == null) return null;

			for (dashboardStateValues value : dashboardStateValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return dashboardStateValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetAnalyticsReportingSettingsDashboardsQueryRequest withSortBy(String sortBy) {
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

	public GetAnalyticsReportingSettingsDashboardsQueryRequest withPageNumber(Integer pageNumber) {
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

	public GetAnalyticsReportingSettingsDashboardsQueryRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
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

    public GetAnalyticsReportingSettingsDashboardsQueryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'dashboardType' is set
        if (this.dashboardType == null) {
            throw new IllegalStateException("Missing the required parameter 'dashboardType' when building request for GetAnalyticsReportingSettingsDashboardsQueryRequest.");
        }
        
        // verify the required parameter 'dashboardAccessFilter' is set
        if (this.dashboardAccessFilter == null) {
            throw new IllegalStateException("Missing the required parameter 'dashboardAccessFilter' when building request for GetAnalyticsReportingSettingsDashboardsQueryRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/analytics/reporting/settings/dashboards/query")

                .withQueryParameters("name", "", name)
        

                .withQueryParameters("dashboardType", "", dashboardType)
        

                .withQueryParameters("dashboardState", "", dashboardState)
        

                .withQueryParameters("dashboardAccessFilter", "", dashboardAccessFilter)
        

                .withQueryParameters("sortBy", "", sortBy)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("pageSize", "", pageSize)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String dashboardType, String dashboardAccessFilter) {
	    return new Builder()
	            .withRequiredParams(dashboardType, dashboardAccessFilter);
	}


	public static class Builder {
		private final GetAnalyticsReportingSettingsDashboardsQueryRequest request;

		private Builder() {
			request = new GetAnalyticsReportingSettingsDashboardsQueryRequest();
		}


		public Builder withDashboardType(String dashboardType) {
			request.setDashboardType(dashboardType);
			return this;
		}



		
		public Builder withDashboardType(dashboardTypeValues dashboardType) {
		    request.setDashboardType(dashboardType.toString());

		    return this;
		}

		public Builder withDashboardAccessFilter(String dashboardAccessFilter) {
			request.setDashboardAccessFilter(dashboardAccessFilter);
			return this;
		}



		
		public Builder withDashboardAccessFilter(dashboardAccessFilterValues dashboardAccessFilter) {
		    request.setDashboardAccessFilter(dashboardAccessFilter.toString());

		    return this;
		}

		public Builder withName(String name) {
			request.setName(name);
			return this;
		}

		public Builder withDashboardState(String dashboardState) {
			request.setDashboardState(dashboardState);
			return this;
		}



		
		public Builder withDashboardState(dashboardStateValues dashboardState) {
		    request.setDashboardState(dashboardState.toString());

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



		public Builder withRequiredParams(String dashboardType, String dashboardAccessFilter) {
			request.setDashboardType(dashboardType);
			request.setDashboardAccessFilter(dashboardAccessFilter);

			return this;
		}


		public GetAnalyticsReportingSettingsDashboardsQueryRequest build() {
            
            // verify the required parameter 'dashboardType' is set
            if (request.dashboardType == null) {
                throw new IllegalStateException("Missing the required parameter 'dashboardType' when building request for GetAnalyticsReportingSettingsDashboardsQueryRequest.");
            }
            
            // verify the required parameter 'dashboardAccessFilter' is set
            if (request.dashboardAccessFilter == null) {
                throw new IllegalStateException("Missing the required parameter 'dashboardAccessFilter' when building request for GetAnalyticsReportingSettingsDashboardsQueryRequest.");
            }
            
			return request;
		}
	}
}
