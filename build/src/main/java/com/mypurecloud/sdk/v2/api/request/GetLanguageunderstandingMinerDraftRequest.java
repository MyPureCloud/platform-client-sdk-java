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

public class GetLanguageunderstandingMinerDraftRequest {

	private String minerId;
	public String getMinerId() {
		return this.minerId;
	}

	public void setMinerId(String minerId) {
		this.minerId = minerId;
	}

	public GetLanguageunderstandingMinerDraftRequest withMinerId(String minerId) {
	    this.setMinerId(minerId);
	    return this;
	} 

	private String draftId;
	public String getDraftId() {
		return this.draftId;
	}

	public void setDraftId(String draftId) {
		this.draftId = draftId;
	}

	public GetLanguageunderstandingMinerDraftRequest withDraftId(String draftId) {
	    this.setDraftId(draftId);
	    return this;
	} 

	private String draftIntentId;
	public String getDraftIntentId() {
		return this.draftIntentId;
	}

	public void setDraftIntentId(String draftIntentId) {
		this.draftIntentId = draftIntentId;
	}

	public GetLanguageunderstandingMinerDraftRequest withDraftIntentId(String draftIntentId) {
	    this.setDraftIntentId(draftIntentId);
	    return this;
	} 

	private String draftTopicId;
	public String getDraftTopicId() {
		return this.draftTopicId;
	}

	public void setDraftTopicId(String draftTopicId) {
		this.draftTopicId = draftTopicId;
	}

	public GetLanguageunderstandingMinerDraftRequest withDraftTopicId(String draftTopicId) {
	    this.setDraftTopicId(draftTopicId);
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

    public GetLanguageunderstandingMinerDraftRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'minerId' is set
        if (this.minerId == null) {
            throw new IllegalStateException("Missing the required parameter 'minerId' when building request for GetLanguageunderstandingMinerDraftRequest.");
        }
        
        // verify the required parameter 'draftId' is set
        if (this.draftId == null) {
            throw new IllegalStateException("Missing the required parameter 'draftId' when building request for GetLanguageunderstandingMinerDraftRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/languageunderstanding/miners/{minerId}/drafts/{draftId}")
                .withPathParameter("minerId", minerId)
        
                .withPathParameter("draftId", draftId)
        

                .withQueryParameters("draftIntentId", "", draftIntentId)
        

                .withQueryParameters("draftTopicId", "", draftTopicId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String minerId, String draftId) {
	    return new Builder()
	            .withRequiredParams(minerId, draftId);
	}


	public static class Builder {
		private final GetLanguageunderstandingMinerDraftRequest request;

		private Builder() {
			request = new GetLanguageunderstandingMinerDraftRequest();
		}


		public Builder withMinerId(String minerId) {
			request.setMinerId(minerId);
			return this;
		}

		public Builder withDraftId(String draftId) {
			request.setDraftId(draftId);
			return this;
		}

		public Builder withDraftIntentId(String draftIntentId) {
			request.setDraftIntentId(draftIntentId);
			return this;
		}

		public Builder withDraftTopicId(String draftTopicId) {
			request.setDraftTopicId(draftTopicId);
			return this;
		}



		public Builder withRequiredParams(String minerId, String draftId) {
			request.setMinerId(minerId);
			request.setDraftId(draftId);

			return this;
		}


		public GetLanguageunderstandingMinerDraftRequest build() {
            
            // verify the required parameter 'minerId' is set
            if (request.minerId == null) {
                throw new IllegalStateException("Missing the required parameter 'minerId' when building request for GetLanguageunderstandingMinerDraftRequest.");
            }
            
            // verify the required parameter 'draftId' is set
            if (request.draftId == null) {
                throw new IllegalStateException("Missing the required parameter 'draftId' when building request for GetLanguageunderstandingMinerDraftRequest.");
            }
            
			return request;
		}
	}
}
