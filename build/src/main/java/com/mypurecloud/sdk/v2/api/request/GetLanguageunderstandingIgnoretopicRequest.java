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

public class GetLanguageunderstandingIgnoretopicRequest {

	private String languageCode;
	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public GetLanguageunderstandingIgnoretopicRequest withLanguageCode(String languageCode) {
	    this.setLanguageCode(languageCode);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetLanguageunderstandingIgnoretopicRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetLanguageunderstandingIgnoretopicRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 

	private String text;
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public GetLanguageunderstandingIgnoretopicRequest withText(String text) {
	    this.setText(text);
	    return this;
	} 

	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetLanguageunderstandingIgnoretopicRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 

	public enum sortOrderValues { 
		ASC("asc"),
		DESC("desc");

		private String value;

		sortOrderValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static sortOrderValues fromString(String key) {
			if (key == null) return null;

			for (sortOrderValues value : sortOrderValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return sortOrderValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetLanguageunderstandingIgnoretopicRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	public enum sortByValues { 
		DATEMODIFIED("dateModified"),
		TEXT("text");

		private String value;

		sortByValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static sortByValues fromString(String key) {
			if (key == null) return null;

			for (sortByValues value : sortByValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return sortByValues.values()[0];
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

    public GetLanguageunderstandingIgnoretopicRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'languageCode' is set
        if (this.languageCode == null) {
            throw new IllegalStateException("Missing the required parameter 'languageCode' when building request for GetLanguageunderstandingIgnoretopicRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/languageunderstanding/ignoretopics/{languageCode}")
                .withPathParameter("languageCode", languageCode)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("text", "", text)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        

                .withQueryParameters("sortBy", "", sortBy)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String languageCode) {
	    return new Builder()
	            .withRequiredParams(languageCode);
	}


	public static class Builder {
		private final GetLanguageunderstandingIgnoretopicRequest request;

		private Builder() {
			request = new GetLanguageunderstandingIgnoretopicRequest();
		}


		public Builder withLanguageCode(String languageCode) {
			request.setLanguageCode(languageCode);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}

		public Builder withText(String text) {
			request.setText(text);
			return this;
		}

		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}



		
		public Builder withSortOrder(sortOrderValues sortOrder) {
		    request.setSortOrder(sortOrder.toString());

		    return this;
		}

		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}



		
		public Builder withSortBy(sortByValues sortBy) {
		    request.setSortBy(sortBy.toString());

		    return this;
		}



		public Builder withRequiredParams(String languageCode) {
			request.setLanguageCode(languageCode);

			return this;
		}


		public GetLanguageunderstandingIgnoretopicRequest build() {
            
            // verify the required parameter 'languageCode' is set
            if (request.languageCode == null) {
                throw new IllegalStateException("Missing the required parameter 'languageCode' when building request for GetLanguageunderstandingIgnoretopicRequest.");
            }
            
			return request;
		}
	}
}
