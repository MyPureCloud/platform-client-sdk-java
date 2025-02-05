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

public class GetLanguageunderstandingDomainFeedbackFeedbackIdRequest {

	private String domainId;
	public String getDomainId() {
		return this.domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public GetLanguageunderstandingDomainFeedbackFeedbackIdRequest withDomainId(String domainId) {
	    this.setDomainId(domainId);
	    return this;
	} 

	private String feedbackId;
	public String getFeedbackId() {
		return this.feedbackId;
	}

	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}

	public GetLanguageunderstandingDomainFeedbackFeedbackIdRequest withFeedbackId(String feedbackId) {
	    this.setFeedbackId(feedbackId);
	    return this;
	} 

	private List<String> fields;
	public List<String> getFields() {
		return this.fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public GetLanguageunderstandingDomainFeedbackFeedbackIdRequest withFields(List<String> fields) {
	    this.setFields(fields);
	    return this;
	} 

	public enum fieldsValues { 
		VERSION("version"),
		DATECREATED("dateCreated"),
		TEXT("text"),
		INTENTS("intents");

		private String value;

		fieldsValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static fieldsValues fromString(String key) {
			if (key == null) return null;

			for (fieldsValues value : fieldsValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return fieldsValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
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

    public GetLanguageunderstandingDomainFeedbackFeedbackIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'domainId' is set
        if (this.domainId == null) {
            throw new IllegalStateException("Missing the required parameter 'domainId' when building request for GetLanguageunderstandingDomainFeedbackFeedbackIdRequest.");
        }
        
        // verify the required parameter 'feedbackId' is set
        if (this.feedbackId == null) {
            throw new IllegalStateException("Missing the required parameter 'feedbackId' when building request for GetLanguageunderstandingDomainFeedbackFeedbackIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/languageunderstanding/domains/{domainId}/feedback/{feedbackId}")
                .withPathParameter("domainId", domainId)
        
                .withPathParameter("feedbackId", feedbackId)
        

                .withQueryParameters("fields", "multi", fields)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String domainId, String feedbackId) {
	    return new Builder()
	            .withRequiredParams(domainId, feedbackId);
	}


	public static class Builder {
		private final GetLanguageunderstandingDomainFeedbackFeedbackIdRequest request;

		private Builder() {
			request = new GetLanguageunderstandingDomainFeedbackFeedbackIdRequest();
		}


		public Builder withDomainId(String domainId) {
			request.setDomainId(domainId);
			return this;
		}

		public Builder withFeedbackId(String feedbackId) {
			request.setFeedbackId(feedbackId);
			return this;
		}

		public Builder withFields(List<String> fields) {
			request.setFields(fields);
			return this;
		}



		public Builder withFieldsEnumValues(List<fieldsValues> fields) {
		    List<String> stringList = new ArrayList<>();
	      for (fieldsValues e : fields) {
	        stringList.add(e.toString());
	      }
	      request.setFields(stringList);
		    return this;
		}



		public Builder withRequiredParams(String domainId, String feedbackId) {
			request.setDomainId(domainId);
			request.setFeedbackId(feedbackId);

			return this;
		}


		public GetLanguageunderstandingDomainFeedbackFeedbackIdRequest build() {
            
            // verify the required parameter 'domainId' is set
            if (request.domainId == null) {
                throw new IllegalStateException("Missing the required parameter 'domainId' when building request for GetLanguageunderstandingDomainFeedbackFeedbackIdRequest.");
            }
            
            // verify the required parameter 'feedbackId' is set
            if (request.feedbackId == null) {
                throw new IllegalStateException("Missing the required parameter 'feedbackId' when building request for GetLanguageunderstandingDomainFeedbackFeedbackIdRequest.");
            }
            
			return request;
		}
	}
}
