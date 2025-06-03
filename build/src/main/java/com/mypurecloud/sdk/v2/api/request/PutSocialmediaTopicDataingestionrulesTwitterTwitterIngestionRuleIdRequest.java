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

public class PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest {

	private String topicId;
	public String getTopicId() {
		return this.topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest withTopicId(String topicId) {
	    this.setTopicId(topicId);
	    return this;
	} 

	private String twitterIngestionRuleId;
	public String getTwitterIngestionRuleId() {
		return this.twitterIngestionRuleId;
	}

	public void setTwitterIngestionRuleId(String twitterIngestionRuleId) {
		this.twitterIngestionRuleId = twitterIngestionRuleId;
	}

	public PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest withTwitterIngestionRuleId(String twitterIngestionRuleId) {
	    this.setTwitterIngestionRuleId(twitterIngestionRuleId);
	    return this;
	} 

	private TwitterDataIngestionRuleRequest body;
	public TwitterDataIngestionRuleRequest getBody() {
		return this.body;
	}

	public void setBody(TwitterDataIngestionRuleRequest body) {
		this.body = body;
	}

	public PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest withBody(TwitterDataIngestionRuleRequest body) {
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

    public PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<TwitterDataIngestionRuleRequest> withHttpInfo() {
        
        // verify the required parameter 'topicId' is set
        if (this.topicId == null) {
            throw new IllegalStateException("Missing the required parameter 'topicId' when building request for PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest.");
        }
        
        // verify the required parameter 'twitterIngestionRuleId' is set
        if (this.twitterIngestionRuleId == null) {
            throw new IllegalStateException("Missing the required parameter 'twitterIngestionRuleId' when building request for PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/socialmedia/topics/{topicId}/dataingestionrules/twitter/{twitterIngestionRuleId}")
                .withPathParameter("topicId", topicId)
        
                .withPathParameter("twitterIngestionRuleId", twitterIngestionRuleId)
        
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


	public static Builder builder(String topicId, String twitterIngestionRuleId) {
	    return new Builder()
	            .withRequiredParams(topicId, twitterIngestionRuleId);
	}


	public static class Builder {
		private final PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest request;

		private Builder() {
			request = new PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest();
		}


		public Builder withTopicId(String topicId) {
			request.setTopicId(topicId);
			return this;
		}

		public Builder withTwitterIngestionRuleId(String twitterIngestionRuleId) {
			request.setTwitterIngestionRuleId(twitterIngestionRuleId);
			return this;
		}

		public Builder withBody(TwitterDataIngestionRuleRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String topicId, String twitterIngestionRuleId) {
			request.setTopicId(topicId);
			request.setTwitterIngestionRuleId(twitterIngestionRuleId);

			return this;
		}


		public PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest build() {
            
            // verify the required parameter 'topicId' is set
            if (request.topicId == null) {
                throw new IllegalStateException("Missing the required parameter 'topicId' when building request for PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest.");
            }
            
            // verify the required parameter 'twitterIngestionRuleId' is set
            if (request.twitterIngestionRuleId == null) {
                throw new IllegalStateException("Missing the required parameter 'twitterIngestionRuleId' when building request for PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest.");
            }
            
			return request;
		}
	}
}
