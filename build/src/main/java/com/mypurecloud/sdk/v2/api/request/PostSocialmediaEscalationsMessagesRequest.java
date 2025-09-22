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

public class PostSocialmediaEscalationsMessagesRequest {

	private String divisionId;
	public String getDivisionId() {
		return this.divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	public PostSocialmediaEscalationsMessagesRequest withDivisionId(String divisionId) {
	    this.setDivisionId(divisionId);
	    return this;
	} 

	private ManualEscalationRequest body;
	public ManualEscalationRequest getBody() {
		return this.body;
	}

	public void setBody(ManualEscalationRequest body) {
		this.body = body;
	}

	public PostSocialmediaEscalationsMessagesRequest withBody(ManualEscalationRequest body) {
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

    public PostSocialmediaEscalationsMessagesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ManualEscalationRequest> withHttpInfo() {
        
        // verify the required parameter 'divisionId' is set
        if (this.divisionId == null) {
            throw new IllegalStateException("Missing the required parameter 'divisionId' when building request for PostSocialmediaEscalationsMessagesRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/socialmedia/escalations/messages")

                .withQueryParameters("divisionId", "", divisionId)
        
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


	public static Builder builder(String divisionId) {
	    return new Builder()
	            .withRequiredParams(divisionId);
	}


	public static class Builder {
		private final PostSocialmediaEscalationsMessagesRequest request;

		private Builder() {
			request = new PostSocialmediaEscalationsMessagesRequest();
		}


		public Builder withDivisionId(String divisionId) {
			request.setDivisionId(divisionId);
			return this;
		}

		public Builder withBody(ManualEscalationRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String divisionId) {
			request.setDivisionId(divisionId);

			return this;
		}


		public PostSocialmediaEscalationsMessagesRequest build() {
            
            // verify the required parameter 'divisionId' is set
            if (request.divisionId == null) {
                throw new IllegalStateException("Missing the required parameter 'divisionId' when building request for PostSocialmediaEscalationsMessagesRequest.");
            }
            
			return request;
		}
	}
}
