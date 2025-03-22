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

public class DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest {

	private String topicId;
	public String getTopicId() {
		return this.topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest withTopicId(String topicId) {
	    this.setTopicId(topicId);
	    return this;
	} 

	private String openId;
	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest withOpenId(String openId) {
	    this.setOpenId(openId);
	    return this;
	} 

	private Boolean hardDelete;
	public Boolean getHardDelete() {
		return this.hardDelete;
	}

	public void setHardDelete(Boolean hardDelete) {
		this.hardDelete = hardDelete;
	}

	public DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest withHardDelete(Boolean hardDelete) {
	    this.setHardDelete(hardDelete);
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

    public DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'topicId' is set
        if (this.topicId == null) {
            throw new IllegalStateException("Missing the required parameter 'topicId' when building request for DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest.");
        }
        
        // verify the required parameter 'openId' is set
        if (this.openId == null) {
            throw new IllegalStateException("Missing the required parameter 'openId' when building request for DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/socialmedia/topics/{topicId}/dataingestionrules/open/{openId}")
                .withPathParameter("topicId", topicId)
        
                .withPathParameter("openId", openId)
        

                .withQueryParameters("hardDelete", "", hardDelete)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String topicId, String openId) {
	    return new Builder()
	            .withRequiredParams(topicId, openId);
	}


	public static class Builder {
		private final DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest request;

		private Builder() {
			request = new DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest();
		}


		public Builder withTopicId(String topicId) {
			request.setTopicId(topicId);
			return this;
		}

		public Builder withOpenId(String openId) {
			request.setOpenId(openId);
			return this;
		}

		public Builder withHardDelete(Boolean hardDelete) {
			request.setHardDelete(hardDelete);
			return this;
		}



		public Builder withRequiredParams(String topicId, String openId) {
			request.setTopicId(topicId);
			request.setOpenId(openId);

			return this;
		}


		public DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest build() {
            
            // verify the required parameter 'topicId' is set
            if (request.topicId == null) {
                throw new IllegalStateException("Missing the required parameter 'topicId' when building request for DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest.");
            }
            
            // verify the required parameter 'openId' is set
            if (request.openId == null) {
                throw new IllegalStateException("Missing the required parameter 'openId' when building request for DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest.");
            }
            
			return request;
		}
	}
}
