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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ReportingTurnsResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributes;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributesMultiGetResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.DataAvailabilityResponse;
import com.mypurecloud.sdk.v2.model.ReportingExportJobListing;
import com.mypurecloud.sdk.v2.model.ReportingExportMetadataJobListing;
import com.mypurecloud.sdk.v2.model.ReportMetaDataEntityListing;
import com.mypurecloud.sdk.v2.model.ReportMetaData;
import com.mypurecloud.sdk.v2.model.ReportSchedule;
import com.mypurecloud.sdk.v2.model.ReportRunEntryEntityDomainListing;
import com.mypurecloud.sdk.v2.model.ReportRunEntry;
import com.mypurecloud.sdk.v2.model.ReportScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.BotAggregationQuery;
import com.mypurecloud.sdk.v2.model.BotAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.ConversationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationAggregationQuery;
import com.mypurecloud.sdk.v2.model.AsyncConversationQuery;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.TranscriptConversationDetailSearchRequest;
import com.mypurecloud.sdk.v2.model.EvaluationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.QueueObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.QueueObservationQuery;
import com.mypurecloud.sdk.v2.model.ReportingExportJobRequest;
import com.mypurecloud.sdk.v2.model.ReportingExportJobResponse;
import com.mypurecloud.sdk.v2.model.RunNowResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregationQuery;
import com.mypurecloud.sdk.v2.model.TranscriptAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.TranscriptAggregationQuery;
import com.mypurecloud.sdk.v2.model.UserAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.UserAggregationQuery;
import com.mypurecloud.sdk.v2.model.AsyncUserDetailsQuery;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.UserObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.UserObservationQuery;

public class PostAnalyticsReportingScheduleRunreportRequest {
    
	private String scheduleId;
	public String getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public PostAnalyticsReportingScheduleRunreportRequest withScheduleId(String scheduleId) {
	    this.setScheduleId(scheduleId);
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

    public PostAnalyticsReportingScheduleRunreportRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'scheduleId' is set
        if (this.scheduleId == null) {
            throw new IllegalStateException("Missing the required parameter 'scheduleId' when building request for PostAnalyticsReportingScheduleRunreportRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/analytics/reporting/schedules/{scheduleId}/runreport")
                .withPathParameter("scheduleId", scheduleId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String scheduleId) {
	    return new Builder()
	            .withRequiredParams(scheduleId);
	}
	

	public static class Builder {
		private final PostAnalyticsReportingScheduleRunreportRequest request;

		private Builder() {
			request = new PostAnalyticsReportingScheduleRunreportRequest();
		}

		
		public Builder withScheduleId(String scheduleId) {
			request.setScheduleId(scheduleId);
			return this;
		}
		

		
		public Builder withRequiredParams(String scheduleId) {
			request.setScheduleId(scheduleId);
			
			return this;
		}
		

		public PostAnalyticsReportingScheduleRunreportRequest build() {
            
            // verify the required parameter 'scheduleId' is set
            if (request.scheduleId == null) {
                throw new IllegalStateException("Missing the required parameter 'scheduleId' when building request for PostAnalyticsReportingScheduleRunreportRequest.");
            }
            
			return request;
		}
	}
}
