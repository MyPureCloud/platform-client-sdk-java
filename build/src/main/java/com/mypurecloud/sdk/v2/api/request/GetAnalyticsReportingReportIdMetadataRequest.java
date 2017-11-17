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

public class GetAnalyticsReportingReportIdMetadataRequest {
    
	private String reportId;
	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public GetAnalyticsReportingReportIdMetadataRequest withReportId(String reportId) {
	    this.setReportId(reportId);
	    return this;
	} 
	
	private String locale;
	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public GetAnalyticsReportingReportIdMetadataRequest withLocale(String locale) {
	    this.setLocale(locale);
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

    public GetAnalyticsReportingReportIdMetadataRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'reportId' is set
        if (this.reportId == null) {
            throw new IllegalStateException("Missing the required parameter 'reportId' when building request for GetAnalyticsReportingReportIdMetadataRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/analytics/reporting/{reportId}/metadata")
                .withPathParameter("reportId", reportId)
        
                .withQueryParameters("locale", "", locale)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String reportId) {
	    return new Builder()
	            .withRequiredParams(reportId);
	}
	

	public static class Builder {
		private final GetAnalyticsReportingReportIdMetadataRequest request;

		private Builder() {
			request = new GetAnalyticsReportingReportIdMetadataRequest();
		}

		
		public Builder withReportId(String reportId) {
			request.setReportId(reportId);
			return this;
		}
		
		public Builder withLocale(String locale) {
			request.setLocale(locale);
			return this;
		}
		

		
		public Builder withRequiredParams(String reportId) {
			request.setReportId(reportId);
			
			return this;
		}
		

		public GetAnalyticsReportingReportIdMetadataRequest build() {
            
            // verify the required parameter 'reportId' is set
            if (request.reportId == null) {
                throw new IllegalStateException("Missing the required parameter 'reportId' when building request for GetAnalyticsReportingReportIdMetadataRequest.");
            }
            
			return request;
		}
	}
}
