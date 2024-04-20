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

import com.mypurecloud.sdk.v2.model.Draft;
import com.mypurecloud.sdk.v2.model.DraftListing;
import com.mypurecloud.sdk.v2.model.DraftRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.MinedIntentsListing;
import com.mypurecloud.sdk.v2.model.Miner;
import com.mypurecloud.sdk.v2.model.MinerExecuteRequest;
import com.mypurecloud.sdk.v2.model.MinerIntent;
import com.mypurecloud.sdk.v2.model.MinerListing;
import com.mypurecloud.sdk.v2.model.MinerTopic;
import com.mypurecloud.sdk.v2.model.MinerTopicPhrase;
import com.mypurecloud.sdk.v2.model.MinerTopicsListing;
import com.mypurecloud.sdk.v2.model.NluDetectionRequest;
import com.mypurecloud.sdk.v2.model.NluDetectionResponse;
import com.mypurecloud.sdk.v2.model.NluDomain;
import com.mypurecloud.sdk.v2.model.NluDomainListing;
import com.mypurecloud.sdk.v2.model.NluDomainVersion;
import com.mypurecloud.sdk.v2.model.NluDomainVersionListing;
import com.mypurecloud.sdk.v2.model.NluDomainVersionQualityReport;
import com.mypurecloud.sdk.v2.model.NluDomainVersionTrainingResponse;
import com.mypurecloud.sdk.v2.model.NluFeedbackListing;
import com.mypurecloud.sdk.v2.model.NluFeedbackRequest;
import com.mypurecloud.sdk.v2.model.NluFeedbackResponse;
import com.mypurecloud.sdk.v2.model.NluOrganization;

public class GetLanguageunderstandingMinerTopicPhraseRequest {

	private String minerId;
	public String getMinerId() {
		return this.minerId;
	}

	public void setMinerId(String minerId) {
		this.minerId = minerId;
	}

	public GetLanguageunderstandingMinerTopicPhraseRequest withMinerId(String minerId) {
	    this.setMinerId(minerId);
	    return this;
	} 

	private String topicId;
	public String getTopicId() {
		return this.topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public GetLanguageunderstandingMinerTopicPhraseRequest withTopicId(String topicId) {
	    this.setTopicId(topicId);
	    return this;
	} 

	private String phraseId;
	public String getPhraseId() {
		return this.phraseId;
	}

	public void setPhraseId(String phraseId) {
		this.phraseId = phraseId;
	}

	public GetLanguageunderstandingMinerTopicPhraseRequest withPhraseId(String phraseId) {
	    this.setPhraseId(phraseId);
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

    public GetLanguageunderstandingMinerTopicPhraseRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'minerId' is set
        if (this.minerId == null) {
            throw new IllegalStateException("Missing the required parameter 'minerId' when building request for GetLanguageunderstandingMinerTopicPhraseRequest.");
        }
        
        // verify the required parameter 'topicId' is set
        if (this.topicId == null) {
            throw new IllegalStateException("Missing the required parameter 'topicId' when building request for GetLanguageunderstandingMinerTopicPhraseRequest.");
        }
        
        // verify the required parameter 'phraseId' is set
        if (this.phraseId == null) {
            throw new IllegalStateException("Missing the required parameter 'phraseId' when building request for GetLanguageunderstandingMinerTopicPhraseRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/languageunderstanding/miners/{minerId}/topics/{topicId}/phrases/{phraseId}")
                .withPathParameter("minerId", minerId)
        
                .withPathParameter("topicId", topicId)
        
                .withPathParameter("phraseId", phraseId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String minerId, String topicId, String phraseId) {
	    return new Builder()
	            .withRequiredParams(minerId, topicId, phraseId);
	}


	public static class Builder {
		private final GetLanguageunderstandingMinerTopicPhraseRequest request;

		private Builder() {
			request = new GetLanguageunderstandingMinerTopicPhraseRequest();
		}


		public Builder withMinerId(String minerId) {
			request.setMinerId(minerId);
			return this;
		}

		public Builder withTopicId(String topicId) {
			request.setTopicId(topicId);
			return this;
		}

		public Builder withPhraseId(String phraseId) {
			request.setPhraseId(phraseId);
			return this;
		}



		public Builder withRequiredParams(String minerId, String topicId, String phraseId) {
			request.setMinerId(minerId);
			request.setTopicId(topicId);
			request.setPhraseId(phraseId);

			return this;
		}


		public GetLanguageunderstandingMinerTopicPhraseRequest build() {
            
            // verify the required parameter 'minerId' is set
            if (request.minerId == null) {
                throw new IllegalStateException("Missing the required parameter 'minerId' when building request for GetLanguageunderstandingMinerTopicPhraseRequest.");
            }
            
            // verify the required parameter 'topicId' is set
            if (request.topicId == null) {
                throw new IllegalStateException("Missing the required parameter 'topicId' when building request for GetLanguageunderstandingMinerTopicPhraseRequest.");
            }
            
            // verify the required parameter 'phraseId' is set
            if (request.phraseId == null) {
                throw new IllegalStateException("Missing the required parameter 'phraseId' when building request for GetLanguageunderstandingMinerTopicPhraseRequest.");
            }
            
			return request;
		}
	}
}
