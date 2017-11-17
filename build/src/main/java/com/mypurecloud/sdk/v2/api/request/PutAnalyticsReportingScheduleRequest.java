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
import com.mypurecloud.sdk.v2.model.AnalyticsConversation;
import com.mypurecloud.sdk.v2.model.ReportMetaDataEntityListing;
import com.mypurecloud.sdk.v2.model.ReportMetaData;
import com.mypurecloud.sdk.v2.model.ReportSchedule;
import com.mypurecloud.sdk.v2.model.ReportRunEntryEntityDomainListing;
import com.mypurecloud.sdk.v2.model.ReportRunEntry;
import com.mypurecloud.sdk.v2.model.ReportScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.QualifierMappingObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;
import com.mypurecloud.sdk.v2.model.RunNowResponse;
import com.mypurecloud.sdk.v2.model.PresenceQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.ObservationQueryResponse;

public class PutAnalyticsReportingScheduleRequest {
    
	private String scheduleId;
	public String getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public PutAnalyticsReportingScheduleRequest withScheduleId(String scheduleId) {
	    this.setScheduleId(scheduleId);
	    return this;
	} 
	
	private ReportSchedule body;
	public ReportSchedule getBody() {
		return this.body;
	}

	public void setBody(ReportSchedule body) {
		this.body = body;
	}

	public PutAnalyticsReportingScheduleRequest withBody(ReportSchedule body) {
	    this.setBody(body);
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

    public PutAnalyticsReportingScheduleRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ReportSchedule> withHttpInfo() {
        
        // verify the required parameter 'scheduleId' is set
        if (this.scheduleId == null) {
            throw new IllegalStateException("Missing the required parameter 'scheduleId' when building request for PutAnalyticsReportingScheduleRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAnalyticsReportingScheduleRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/analytics/reporting/schedules/{scheduleId}")
                .withPathParameter("scheduleId", scheduleId)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String scheduleId, ReportSchedule body) {
	    return new Builder()
	            .withRequiredParams(scheduleId, body);
	}
	

	public static class Builder {
		private final PutAnalyticsReportingScheduleRequest request;

		private Builder() {
			request = new PutAnalyticsReportingScheduleRequest();
		}

		
		public Builder withScheduleId(String scheduleId) {
			request.setScheduleId(scheduleId);
			return this;
		}
		
		public Builder withBody(ReportSchedule body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String scheduleId, ReportSchedule body) {
			request.setScheduleId(scheduleId);
						request.setBody(body);
			
			return this;
		}
		

		public PutAnalyticsReportingScheduleRequest build() {
            
            // verify the required parameter 'scheduleId' is set
            if (request.scheduleId == null) {
                throw new IllegalStateException("Missing the required parameter 'scheduleId' when building request for PutAnalyticsReportingScheduleRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAnalyticsReportingScheduleRequest.");
            }
            
			return request;
		}
	}
}
