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

public class DeleteConversationsSummariesSettingRequest {

	private String summarySettingId;
	public String getSummarySettingId() {
		return this.summarySettingId;
	}

	public void setSummarySettingId(String summarySettingId) {
		this.summarySettingId = summarySettingId;
	}

	public DeleteConversationsSummariesSettingRequest withSummarySettingId(String summarySettingId) {
	    this.setSummarySettingId(summarySettingId);
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

    public DeleteConversationsSummariesSettingRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'summarySettingId' is set
        if (this.summarySettingId == null) {
            throw new IllegalStateException("Missing the required parameter 'summarySettingId' when building request for DeleteConversationsSummariesSettingRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/conversations/summaries/settings/{summarySettingId}")
                .withPathParameter("summarySettingId", summarySettingId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String summarySettingId) {
	    return new Builder()
	            .withRequiredParams(summarySettingId);
	}


	public static class Builder {
		private final DeleteConversationsSummariesSettingRequest request;

		private Builder() {
			request = new DeleteConversationsSummariesSettingRequest();
		}


		public Builder withSummarySettingId(String summarySettingId) {
			request.setSummarySettingId(summarySettingId);
			return this;
		}



		public Builder withRequiredParams(String summarySettingId) {
			request.setSummarySettingId(summarySettingId);

			return this;
		}


		public DeleteConversationsSummariesSettingRequest build() {
            
            // verify the required parameter 'summarySettingId' is set
            if (request.summarySettingId == null) {
                throw new IllegalStateException("Missing the required parameter 'summarySettingId' when building request for DeleteConversationsSummariesSettingRequest.");
            }
            
			return request;
		}
	}
}
