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

import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.DataIngestionRuleResponseEntityListing;
import com.mypurecloud.sdk.v2.model.DataIngestionRuleStatusPatchRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EscalationRuleRequest;
import com.mypurecloud.sdk.v2.model.EscalationRuleResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ManualEscalationRequest;
import com.mypurecloud.sdk.v2.model.ManualEscalationResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.OpenSocialMediaNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenSocialMediaReactionsRequest;
import com.mypurecloud.sdk.v2.model.OpenSocialNormalizedMessageEntityListing;
import com.mypurecloud.sdk.v2.model.OpenSocialReactionsNormalizedEventEntityListing;
import com.mypurecloud.sdk.v2.model.SocialEscalationResponseEntityListing;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncDetailQuery;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncDetailQueryResponse;
import com.mypurecloud.sdk.v2.model.SocialTopicPatchRequest;
import com.mypurecloud.sdk.v2.model.SocialTopicRequest;
import com.mypurecloud.sdk.v2.model.SocialTopicResponse;
import com.mypurecloud.sdk.v2.model.SocialTopicResponseEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterDataHistoricalTweetRequest;
import com.mypurecloud.sdk.v2.model.TwitterDataHistoricalTweetResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleVersionResponseEntityListing;

public class PostSocialmediaAnalyticsAggregatesJobsRequest {

	private SocialMediaAsyncAggregationQuery body;
	public SocialMediaAsyncAggregationQuery getBody() {
		return this.body;
	}

	public void setBody(SocialMediaAsyncAggregationQuery body) {
		this.body = body;
	}

	public PostSocialmediaAnalyticsAggregatesJobsRequest withBody(SocialMediaAsyncAggregationQuery body) {
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

    public PostSocialmediaAnalyticsAggregatesJobsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<SocialMediaAsyncAggregationQuery> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostSocialmediaAnalyticsAggregatesJobsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/socialmedia/analytics/aggregates/jobs")
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


	public static Builder builder(SocialMediaAsyncAggregationQuery body) {
	    return new Builder()
	            .withRequiredParams(body);
	}


	public static class Builder {
		private final PostSocialmediaAnalyticsAggregatesJobsRequest request;

		private Builder() {
			request = new PostSocialmediaAnalyticsAggregatesJobsRequest();
		}


		public Builder withBody(SocialMediaAsyncAggregationQuery body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(SocialMediaAsyncAggregationQuery body) {
			request.setBody(body);

			return this;
		}


		public PostSocialmediaAnalyticsAggregatesJobsRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostSocialmediaAnalyticsAggregatesJobsRequest.");
            }
            
			return request;
		}
	}
}
