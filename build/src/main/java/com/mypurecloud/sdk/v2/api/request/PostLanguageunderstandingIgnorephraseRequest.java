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
import com.mypurecloud.sdk.v2.model.IgnorePhrasesRequest;
import com.mypurecloud.sdk.v2.model.IgnorePhrasesResponse;
import com.mypurecloud.sdk.v2.model.IgnoreTopicsRequest;
import com.mypurecloud.sdk.v2.model.IgnoreTopicsResponse;
import com.mypurecloud.sdk.v2.model.IgnoredMinedPhraseListing;
import com.mypurecloud.sdk.v2.model.IgnoredMinedTopicListing;
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
import com.mypurecloud.sdk.v2.model.RemoveEntitiesRequest;

public class PostLanguageunderstandingIgnorephraseRequest {

	private String languageCode;
	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public PostLanguageunderstandingIgnorephraseRequest withLanguageCode(String languageCode) {
	    this.setLanguageCode(languageCode);
	    return this;
	} 

	private IgnorePhrasesRequest body;
	public IgnorePhrasesRequest getBody() {
		return this.body;
	}

	public void setBody(IgnorePhrasesRequest body) {
		this.body = body;
	}

	public PostLanguageunderstandingIgnorephraseRequest withBody(IgnorePhrasesRequest body) {
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

    public PostLanguageunderstandingIgnorephraseRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<IgnorePhrasesRequest> withHttpInfo() {
        
        // verify the required parameter 'languageCode' is set
        if (this.languageCode == null) {
            throw new IllegalStateException("Missing the required parameter 'languageCode' when building request for PostLanguageunderstandingIgnorephraseRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostLanguageunderstandingIgnorephraseRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/languageunderstanding/ignorephrases/{languageCode}")
                .withPathParameter("languageCode", languageCode)
        
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


	public static Builder builder(String languageCode, IgnorePhrasesRequest body) {
	    return new Builder()
	            .withRequiredParams(languageCode, body);
	}


	public static class Builder {
		private final PostLanguageunderstandingIgnorephraseRequest request;

		private Builder() {
			request = new PostLanguageunderstandingIgnorephraseRequest();
		}


		public Builder withLanguageCode(String languageCode) {
			request.setLanguageCode(languageCode);
			return this;
		}

		public Builder withBody(IgnorePhrasesRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String languageCode, IgnorePhrasesRequest body) {
			request.setLanguageCode(languageCode);
			request.setBody(body);

			return this;
		}


		public PostLanguageunderstandingIgnorephraseRequest build() {
            
            // verify the required parameter 'languageCode' is set
            if (request.languageCode == null) {
                throw new IllegalStateException("Missing the required parameter 'languageCode' when building request for PostLanguageunderstandingIgnorephraseRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostLanguageunderstandingIgnorephraseRequest.");
            }
            
			return request;
		}
	}
}
