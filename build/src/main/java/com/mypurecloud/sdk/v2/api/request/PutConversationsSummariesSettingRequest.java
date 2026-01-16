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

import com.mypurecloud.sdk.v2.model.CreateGuide;
import com.mypurecloud.sdk.v2.model.CreateGuideVersion;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GenerateGuideContentRequest;
import com.mypurecloud.sdk.v2.model.Guide;
import com.mypurecloud.sdk.v2.model.GuideContentGenerationJob;
import com.mypurecloud.sdk.v2.model.GuideEntityListing;
import com.mypurecloud.sdk.v2.model.GuideJob;
import com.mypurecloud.sdk.v2.model.GuideSessionTurnRequest;
import com.mypurecloud.sdk.v2.model.GuideSessionTurnResponse;
import com.mypurecloud.sdk.v2.model.GuideVersion;
import com.mypurecloud.sdk.v2.model.GuideVersionPublishJob;
import com.mypurecloud.sdk.v2.model.GuideVersionPublishJobRequest;
import com.mypurecloud.sdk.v2.model.SummarySetting;
import com.mypurecloud.sdk.v2.model.SummarySettingEntityListing;
import com.mypurecloud.sdk.v2.model.SummarySettingWithTranscript;
import com.mypurecloud.sdk.v2.model.UpdateGuide;
import com.mypurecloud.sdk.v2.model.UpdateGuideVersion;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;

public class PutConversationsSummariesSettingRequest {

	private String summarySettingId;
	public String getSummarySettingId() {
		return this.summarySettingId;
	}

	public void setSummarySettingId(String summarySettingId) {
		this.summarySettingId = summarySettingId;
	}

	public PutConversationsSummariesSettingRequest withSummarySettingId(String summarySettingId) {
	    this.setSummarySettingId(summarySettingId);
	    return this;
	} 

	private SummarySetting body;
	public SummarySetting getBody() {
		return this.body;
	}

	public void setBody(SummarySetting body) {
		this.body = body;
	}

	public PutConversationsSummariesSettingRequest withBody(SummarySetting body) {
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

    public PutConversationsSummariesSettingRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<SummarySetting> withHttpInfo() {
        
        // verify the required parameter 'summarySettingId' is set
        if (this.summarySettingId == null) {
            throw new IllegalStateException("Missing the required parameter 'summarySettingId' when building request for PutConversationsSummariesSettingRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutConversationsSummariesSettingRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/conversations/summaries/settings/{summarySettingId}")
                .withPathParameter("summarySettingId", summarySettingId)
        
                .withBody(body)

		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String summarySettingId, SummarySetting body) {
	    return new Builder()
	            .withRequiredParams(summarySettingId, body);
	}


	public static class Builder {
		private final PutConversationsSummariesSettingRequest request;

		private Builder() {
			request = new PutConversationsSummariesSettingRequest();
		}


		public Builder withSummarySettingId(String summarySettingId) {
			request.setSummarySettingId(summarySettingId);
			return this;
		}

		public Builder withBody(SummarySetting body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String summarySettingId, SummarySetting body) {
			request.setSummarySettingId(summarySettingId);
			request.setBody(body);

			return this;
		}


		public PutConversationsSummariesSettingRequest build() {
            
            // verify the required parameter 'summarySettingId' is set
            if (request.summarySettingId == null) {
                throw new IllegalStateException("Missing the required parameter 'summarySettingId' when building request for PutConversationsSummariesSettingRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutConversationsSummariesSettingRequest.");
            }
            
			return request;
		}
	}
}
