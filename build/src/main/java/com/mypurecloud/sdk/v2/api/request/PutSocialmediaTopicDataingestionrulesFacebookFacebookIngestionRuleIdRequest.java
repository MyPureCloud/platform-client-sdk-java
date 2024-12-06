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

import com.mypurecloud.sdk.v2.model.DataIngestionRuleStatusPatchRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.SocialTopicPatchRequest;
import com.mypurecloud.sdk.v2.model.SocialTopicRequest;
import com.mypurecloud.sdk.v2.model.SocialTopicResponse;
import com.mypurecloud.sdk.v2.model.SocialTopicResponseEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleVersionResponseEntityListing;

public class PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest {

	private String topicId;
	public String getTopicId() {
		return this.topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest withTopicId(String topicId) {
	    this.setTopicId(topicId);
	    return this;
	} 

	private String facebookIngestionRuleId;
	public String getFacebookIngestionRuleId() {
		return this.facebookIngestionRuleId;
	}

	public void setFacebookIngestionRuleId(String facebookIngestionRuleId) {
		this.facebookIngestionRuleId = facebookIngestionRuleId;
	}

	public PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest withFacebookIngestionRuleId(String facebookIngestionRuleId) {
	    this.setFacebookIngestionRuleId(facebookIngestionRuleId);
	    return this;
	} 

	private FacebookDataIngestionRuleRequest body;
	public FacebookDataIngestionRuleRequest getBody() {
		return this.body;
	}

	public void setBody(FacebookDataIngestionRuleRequest body) {
		this.body = body;
	}

	public PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest withBody(FacebookDataIngestionRuleRequest body) {
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

    public PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<FacebookDataIngestionRuleRequest> withHttpInfo() {
        
        // verify the required parameter 'topicId' is set
        if (this.topicId == null) {
            throw new IllegalStateException("Missing the required parameter 'topicId' when building request for PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest.");
        }
        
        // verify the required parameter 'facebookIngestionRuleId' is set
        if (this.facebookIngestionRuleId == null) {
            throw new IllegalStateException("Missing the required parameter 'facebookIngestionRuleId' when building request for PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/socialmedia/topics/{topicId}/dataingestionrules/facebook/{facebookIngestionRuleId}")
                .withPathParameter("topicId", topicId)
        
                .withPathParameter("facebookIngestionRuleId", facebookIngestionRuleId)
        
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


	public static Builder builder(String topicId, String facebookIngestionRuleId) {
	    return new Builder()
	            .withRequiredParams(topicId, facebookIngestionRuleId);
	}


	public static class Builder {
		private final PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest request;

		private Builder() {
			request = new PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest();
		}


		public Builder withTopicId(String topicId) {
			request.setTopicId(topicId);
			return this;
		}

		public Builder withFacebookIngestionRuleId(String facebookIngestionRuleId) {
			request.setFacebookIngestionRuleId(facebookIngestionRuleId);
			return this;
		}

		public Builder withBody(FacebookDataIngestionRuleRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String topicId, String facebookIngestionRuleId) {
			request.setTopicId(topicId);
			request.setFacebookIngestionRuleId(facebookIngestionRuleId);

			return this;
		}


		public PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest build() {
            
            // verify the required parameter 'topicId' is set
            if (request.topicId == null) {
                throw new IllegalStateException("Missing the required parameter 'topicId' when building request for PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest.");
            }
            
            // verify the required parameter 'facebookIngestionRuleId' is set
            if (request.facebookIngestionRuleId == null) {
                throw new IllegalStateException("Missing the required parameter 'facebookIngestionRuleId' when building request for PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest.");
            }
            
			return request;
		}
	}
}
