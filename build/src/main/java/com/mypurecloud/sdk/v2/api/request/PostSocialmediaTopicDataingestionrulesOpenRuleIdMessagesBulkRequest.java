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

public class PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest {

	private String topicId;
	public String getTopicId() {
		return this.topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest withTopicId(String topicId) {
	    this.setTopicId(topicId);
	    return this;
	} 

	private String ruleId;
	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest withRuleId(String ruleId) {
	    this.setRuleId(ruleId);
	    return this;
	} 

	private List<OpenSocialMediaNormalizedMessage> body;
	public List<OpenSocialMediaNormalizedMessage> getBody() {
		return this.body;
	}

	public void setBody(List<OpenSocialMediaNormalizedMessage> body) {
		this.body = body;
	}

	public PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest withBody(List<OpenSocialMediaNormalizedMessage> body) {
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

    public PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<List<OpenSocialMediaNormalizedMessage>> withHttpInfo() {
        
        // verify the required parameter 'topicId' is set
        if (this.topicId == null) {
            throw new IllegalStateException("Missing the required parameter 'topicId' when building request for PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest.");
        }
        
        // verify the required parameter 'ruleId' is set
        if (this.ruleId == null) {
            throw new IllegalStateException("Missing the required parameter 'ruleId' when building request for PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/socialmedia/topics/{topicId}/dataingestionrules/open/{ruleId}/messages/bulk")
                .withPathParameter("topicId", topicId)
        
                .withPathParameter("ruleId", ruleId)
        
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


	public static Builder builder(String topicId, String ruleId, List<OpenSocialMediaNormalizedMessage> body) {
	    return new Builder()
	            .withRequiredParams(topicId, ruleId, body);
	}


	public static class Builder {
		private final PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest request;

		private Builder() {
			request = new PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest();
		}


		public Builder withTopicId(String topicId) {
			request.setTopicId(topicId);
			return this;
		}

		public Builder withRuleId(String ruleId) {
			request.setRuleId(ruleId);
			return this;
		}

		public Builder withBody(List<OpenSocialMediaNormalizedMessage> body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String topicId, String ruleId, List<OpenSocialMediaNormalizedMessage> body) {
			request.setTopicId(topicId);
			request.setRuleId(ruleId);
			request.setBody(body);

			return this;
		}


		public PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest build() {
            
            // verify the required parameter 'topicId' is set
            if (request.topicId == null) {
                throw new IllegalStateException("Missing the required parameter 'topicId' when building request for PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest.");
            }
            
            // verify the required parameter 'ruleId' is set
            if (request.ruleId == null) {
                throw new IllegalStateException("Missing the required parameter 'ruleId' when building request for PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest.");
            }
            
			return request;
		}
	}
}
