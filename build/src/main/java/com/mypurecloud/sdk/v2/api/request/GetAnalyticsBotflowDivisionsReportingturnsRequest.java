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

public class GetAnalyticsBotflowDivisionsReportingturnsRequest {

	private String botFlowId;
	public String getBotFlowId() {
		return this.botFlowId;
	}

	public void setBotFlowId(String botFlowId) {
		this.botFlowId = botFlowId;
	}

	public GetAnalyticsBotflowDivisionsReportingturnsRequest withBotFlowId(String botFlowId) {
	    this.setBotFlowId(botFlowId);
	    return this;
	} 

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetAnalyticsBotflowDivisionsReportingturnsRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public GetAnalyticsBotflowDivisionsReportingturnsRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String interval;
	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public GetAnalyticsBotflowDivisionsReportingturnsRequest withInterval(String interval) {
	    this.setInterval(interval);
	    return this;
	} 

	private String actionId;
	public String getActionId() {
		return this.actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public GetAnalyticsBotflowDivisionsReportingturnsRequest withActionId(String actionId) {
	    this.setActionId(actionId);
	    return this;
	} 

	private String sessionId;
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public GetAnalyticsBotflowDivisionsReportingturnsRequest withSessionId(String sessionId) {
	    this.setSessionId(sessionId);
	    return this;
	} 

	private String language;
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public GetAnalyticsBotflowDivisionsReportingturnsRequest withLanguage(String language) {
	    this.setLanguage(language);
	    return this;
	} 

	private String askActionResults;
	public String getAskActionResults() {
		return this.askActionResults;
	}

	public void setAskActionResults(String askActionResults) {
		this.askActionResults = askActionResults;
	}

	public GetAnalyticsBotflowDivisionsReportingturnsRequest withAskActionResults(String askActionResults) {
	    this.setAskActionResults(askActionResults);
	    return this;
	} 

	public enum askActionResultsValues { 
		AGENTREQUESTEDBYUSER("AgentRequestedByUser"),
		CONFIRMATIONREQUIRED("ConfirmationRequired"),
		DISAMBIGUATIONREQUIRED("DisambiguationRequired"),
		ERROR("Error"),
		EXPRESSIONERROR("ExpressionError"),
		NOINPUTCOLLECTION("NoInputCollection"),
		NOINPUTCONFIRMATION("NoInputConfirmation"),
		NOINPUTDISAMBIGUATION("NoInputDisambiguation"),
		NOMATCHCOLLECTION("NoMatchCollection"),
		NOMATCHCONFIRMATION("NoMatchConfirmation"),
		NOMATCHDISAMBIGUATION("NoMatchDisambiguation"),
		SUCCESSCOLLECTION("SuccessCollection"),
		SKIPPEDCOLLECTION("SkippedCollection"),
		SUCCESSCONFIRMATIONNO("SuccessConfirmationNo"),
		SUCCESSCONFIRMATIONYES("SuccessConfirmationYes"),
		SUCCESSDISAMBIGUATION("SuccessDisambiguation"),
		SUCCESSDISAMBIGUATIONNONE("SuccessDisambiguationNone");

		private String value;

		askActionResultsValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static askActionResultsValues fromString(String key) {
			if (key == null) return null;

			for (askActionResultsValues value : askActionResultsValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return askActionResultsValues.values()[0];
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

    public GetAnalyticsBotflowDivisionsReportingturnsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'botFlowId' is set
        if (this.botFlowId == null) {
            throw new IllegalStateException("Missing the required parameter 'botFlowId' when building request for GetAnalyticsBotflowDivisionsReportingturnsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/analytics/botflows/{botFlowId}/divisions/reportingturns")
                .withPathParameter("botFlowId", botFlowId)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("interval", "", interval)
        

                .withQueryParameters("actionId", "", actionId)
        

                .withQueryParameters("sessionId", "", sessionId)
        

                .withQueryParameters("language", "", language)
        

                .withQueryParameters("askActionResults", "", askActionResults)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String botFlowId) {
	    return new Builder()
	            .withRequiredParams(botFlowId);
	}


	public static class Builder {
		private final GetAnalyticsBotflowDivisionsReportingturnsRequest request;

		private Builder() {
			request = new GetAnalyticsBotflowDivisionsReportingturnsRequest();
		}


		public Builder withBotFlowId(String botFlowId) {
			request.setBotFlowId(botFlowId);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withInterval(String interval) {
			request.setInterval(interval);
			return this;
		}

		public Builder withActionId(String actionId) {
			request.setActionId(actionId);
			return this;
		}

		public Builder withSessionId(String sessionId) {
			request.setSessionId(sessionId);
			return this;
		}

		public Builder withLanguage(String language) {
			request.setLanguage(language);
			return this;
		}

		public Builder withAskActionResults(String askActionResults) {
			request.setAskActionResults(askActionResults);
			return this;
		}



		
		public Builder withAskActionResults(askActionResultsValues askActionResults) {
		    request.setAskActionResults(askActionResults.toString());

		    return this;
		}



		public Builder withRequiredParams(String botFlowId) {
			request.setBotFlowId(botFlowId);

			return this;
		}


		public GetAnalyticsBotflowDivisionsReportingturnsRequest build() {
            
            // verify the required parameter 'botFlowId' is set
            if (request.botFlowId == null) {
                throw new IllegalStateException("Missing the required parameter 'botFlowId' when building request for GetAnalyticsBotflowDivisionsReportingturnsRequest.");
            }
            
			return request;
		}
	}
}
