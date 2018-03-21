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
import com.mypurecloud.sdk.v2.model.ReportingExportJobListing;
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
import com.mypurecloud.sdk.v2.model.ReportingExportJobRequest;
import com.mypurecloud.sdk.v2.model.ReportingExportJobResponse;
import com.mypurecloud.sdk.v2.model.RunNowResponse;
import com.mypurecloud.sdk.v2.model.PresenceQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.ObservationQueryResponse;

public class PostAnalyticsReportingExportsRequest {
    
	private ReportingExportJobRequest body;
	public ReportingExportJobRequest getBody() {
		return this.body;
	}

	public void setBody(ReportingExportJobRequest body) {
		this.body = body;
	}

	public PostAnalyticsReportingExportsRequest withBody(ReportingExportJobRequest body) {
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

    public PostAnalyticsReportingExportsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ReportingExportJobRequest> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAnalyticsReportingExportsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/analytics/reporting/exports")
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

	
	public static Builder builder(ReportingExportJobRequest body) {
	    return new Builder()
	            .withRequiredParams(body);
	}
	

	public static class Builder {
		private final PostAnalyticsReportingExportsRequest request;

		private Builder() {
			request = new PostAnalyticsReportingExportsRequest();
		}

		
		public Builder withBody(ReportingExportJobRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(ReportingExportJobRequest body) {
			request.setBody(body);
			
			return this;
		}
		

		public PostAnalyticsReportingExportsRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAnalyticsReportingExportsRequest.");
            }
            
			return request;
		}
	}
}
