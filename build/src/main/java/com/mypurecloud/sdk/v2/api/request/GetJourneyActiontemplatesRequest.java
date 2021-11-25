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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ActionMap;
import com.mypurecloud.sdk.v2.model.ActionMapListing;
import com.mypurecloud.sdk.v2.model.ActionTarget;
import com.mypurecloud.sdk.v2.model.ActionTargetListing;
import com.mypurecloud.sdk.v2.model.ActionTemplate;
import com.mypurecloud.sdk.v2.model.ActionTemplateListing;
import com.mypurecloud.sdk.v2.model.Outcome;
import com.mypurecloud.sdk.v2.model.OutcomeListing;
import com.mypurecloud.sdk.v2.model.JourneySegment;
import com.mypurecloud.sdk.v2.model.SegmentListing;
import com.mypurecloud.sdk.v2.model.Session;
import com.mypurecloud.sdk.v2.model.OutcomeScoresResult;
import com.mypurecloud.sdk.v2.model.PatchActionMap;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.PatchActionTemplate;
import com.mypurecloud.sdk.v2.model.PatchOutcome;
import com.mypurecloud.sdk.v2.model.PatchSegment;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;

public class GetJourneyActiontemplatesRequest {
    
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetJourneyActiontemplatesRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetJourneyActiontemplatesRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetJourneyActiontemplatesRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 
	
	private String mediaType;
	public String getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public GetJourneyActiontemplatesRequest withMediaType(String mediaType) {
	    this.setMediaType(mediaType);
	    return this;
	} 

	public enum mediaTypeValues { 
		WEBCHAT("webchat"), 
		WEBMESSAGINGOFFER("webMessagingOffer"), 
		CONTENTOFFER("contentOffer"), 
		INTEGRATIONACTION("integrationAction"), 
		ARCHITECTFLOW("architectFlow"), 
		OPENACTION("openAction");

		private String value;

		mediaTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static mediaTypeValues fromString(String key) {
			if (key == null) return null;

			for (mediaTypeValues value : mediaTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return mediaTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String state;
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public GetJourneyActiontemplatesRequest withState(String state) {
	    this.setState(state);
	    return this;
	} 

	public enum stateValues { 
		ACTIVE("Active"), 
		INACTIVE("Inactive"), 
		DELETED("Deleted");

		private String value;

		stateValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static stateValues fromString(String key) {
			if (key == null) return null;

			for (stateValues value : stateValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return stateValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private List<String> queryFields;
	public List<String> getQueryFields() {
		return this.queryFields;
	}

	public void setQueryFields(List<String> queryFields) {
		this.queryFields = queryFields;
	}

	public GetJourneyActiontemplatesRequest withQueryFields(List<String> queryFields) {
	    this.setQueryFields(queryFields);
	    return this;
	} 
	
	private String queryValue;
	public String getQueryValue() {
		return this.queryValue;
	}

	public void setQueryValue(String queryValue) {
		this.queryValue = queryValue;
	}

	public GetJourneyActiontemplatesRequest withQueryValue(String queryValue) {
	    this.setQueryValue(queryValue);
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

    public GetJourneyActiontemplatesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/journey/actiontemplates")
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("mediaType", "", mediaType)
        
                .withQueryParameters("state", "", state)
        
                .withQueryParameters("queryFields", "multi", queryFields)
        
                .withQueryParameters("queryValue", "", queryValue)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	

	public static class Builder {
		private final GetJourneyActiontemplatesRequest request;

		private Builder() {
			request = new GetJourneyActiontemplatesRequest();
		}

		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}
		
		public Builder withMediaType(String mediaType) {
			request.setMediaType(mediaType);
			return this;
		}

		public Builder withMediaType(mediaTypeValues mediaType) {
		    request.setMediaType(mediaType.toString());
		    return this;
		}
		
		public Builder withState(String state) {
			request.setState(state);
			return this;
		}

		public Builder withState(stateValues state) {
		    request.setState(state.toString());
		    return this;
		}
		
		public Builder withQueryFields(List<String> queryFields) {
			request.setQueryFields(queryFields);
			return this;
		}
		
		public Builder withQueryValue(String queryValue) {
			request.setQueryValue(queryValue);
			return this;
		}
		

		

		public GetJourneyActiontemplatesRequest build() {
            
			return request;
		}
	}
}
