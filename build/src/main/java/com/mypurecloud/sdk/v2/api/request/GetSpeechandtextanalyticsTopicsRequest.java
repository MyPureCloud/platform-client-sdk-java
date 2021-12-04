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
import com.mypurecloud.sdk.v2.model.ConversationMetrics;
import com.mypurecloud.sdk.v2.model.TranscriptUrl;
import com.mypurecloud.sdk.v2.model.Program;
import com.mypurecloud.sdk.v2.model.ProgramMappings;
import com.mypurecloud.sdk.v2.model.ProgramsEntityListing;
import com.mypurecloud.sdk.v2.model.GeneralProgramJob;
import com.mypurecloud.sdk.v2.model.ProgramsMappingsEntityListing;
import com.mypurecloud.sdk.v2.model.ProgramJob;
import com.mypurecloud.sdk.v2.model.UnpublishedProgramsEntityListing;
import com.mypurecloud.sdk.v2.model.EntityListing;
import com.mypurecloud.sdk.v2.model.SentimentFeedbackEntityListing;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsSettingsResponse;
import com.mypurecloud.sdk.v2.model.Topic;
import com.mypurecloud.sdk.v2.model.TopicsEntityListing;
import com.mypurecloud.sdk.v2.model.GeneralTopicsEntityListing;
import com.mypurecloud.sdk.v2.model.TopicJob;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.model.ProgramRequest;
import com.mypurecloud.sdk.v2.model.GeneralProgramJobRequest;
import com.mypurecloud.sdk.v2.model.ProgramJobRequest;
import com.mypurecloud.sdk.v2.model.SentimentFeedback;
import com.mypurecloud.sdk.v2.model.TopicRequest;
import com.mypurecloud.sdk.v2.model.TopicJobRequest;
import com.mypurecloud.sdk.v2.model.TranscriptSearchRequest;
import com.mypurecloud.sdk.v2.model.JsonSearchResponse;
import com.mypurecloud.sdk.v2.model.ProgramMappingsRequest;

public class GetSpeechandtextanalyticsTopicsRequest {
    
	private String nextPage;
	public String getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}

	public GetSpeechandtextanalyticsTopicsRequest withNextPage(String nextPage) {
	    this.setNextPage(nextPage);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetSpeechandtextanalyticsTopicsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private String state;
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public GetSpeechandtextanalyticsTopicsRequest withState(String state) {
	    this.setState(state);
	    return this;
	} 

	public enum stateValues { 
		LATEST("latest"), 
		PUBLISHED("published");

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
	
	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetSpeechandtextanalyticsTopicsRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 
	
	private List<String> ids;
	public List<String> getIds() {
		return this.ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public GetSpeechandtextanalyticsTopicsRequest withIds(List<String> ids) {
	    this.setIds(ids);
	    return this;
	} 
	
	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetSpeechandtextanalyticsTopicsRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	public enum sortByValues { 
		NAME("name");

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
	
	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetSpeechandtextanalyticsTopicsRequest withSortOrder(String sortOrder) {
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

    public GetSpeechandtextanalyticsTopicsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/speechandtextanalytics/topics")
                .withQueryParameters("nextPage", "", nextPage)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("state", "", state)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("ids", "multi", ids)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("sortOrder", "", sortOrder)
        
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
		private final GetSpeechandtextanalyticsTopicsRequest request;

		private Builder() {
			request = new GetSpeechandtextanalyticsTopicsRequest();
		}

		
		public Builder withNextPage(String nextPage) {
			request.setNextPage(nextPage);
			return this;
		}
		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
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
		
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		
		public Builder withIds(List<String> ids) {
			request.setIds(ids);
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
		
		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}

		public Builder withSortOrder(sortOrderValues sortOrder) {
		    request.setSortOrder(sortOrder.toString());
		    return this;
		}
		

		

		public GetSpeechandtextanalyticsTopicsRequest build() {
            
			return request;
		}
	}
}
