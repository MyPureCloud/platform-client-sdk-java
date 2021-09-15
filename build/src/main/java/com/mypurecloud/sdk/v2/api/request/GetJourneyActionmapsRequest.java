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

public class GetJourneyActionmapsRequest {
    
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetJourneyActionmapsRequest withPageNumber(Integer pageNumber) {
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

	public GetJourneyActionmapsRequest withPageSize(Integer pageSize) {
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

	public GetJourneyActionmapsRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 
	
	private String filterField;
	public String getFilterField() {
		return this.filterField;
	}

	public void setFilterField(String filterField) {
		this.filterField = filterField;
	}

	public GetJourneyActionmapsRequest withFilterField(String filterField) {
	    this.setFilterField(filterField);
	    return this;
	} 
	
	private String filterValue;
	public String getFilterValue() {
		return this.filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}

	public GetJourneyActionmapsRequest withFilterValue(String filterValue) {
	    this.setFilterValue(filterValue);
	    return this;
	} 
	
	private List<String> actionMapIds;
	public List<String> getActionMapIds() {
		return this.actionMapIds;
	}

	public void setActionMapIds(List<String> actionMapIds) {
		this.actionMapIds = actionMapIds;
	}

	public GetJourneyActionmapsRequest withActionMapIds(List<String> actionMapIds) {
	    this.setActionMapIds(actionMapIds);
	    return this;
	} 
	
	private List<String> queryFields;
	public List<String> getQueryFields() {
		return this.queryFields;
	}

	public void setQueryFields(List<String> queryFields) {
		this.queryFields = queryFields;
	}

	public GetJourneyActionmapsRequest withQueryFields(List<String> queryFields) {
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

	public GetJourneyActionmapsRequest withQueryValue(String queryValue) {
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

    public GetJourneyActionmapsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/journey/actionmaps")
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("filterField", "", filterField)
        
                .withQueryParameters("filterValue", "", filterValue)
        
                .withQueryParameters("actionMapIds", "multi", actionMapIds)
        
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
		private final GetJourneyActionmapsRequest request;

		private Builder() {
			request = new GetJourneyActionmapsRequest();
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
		
		public Builder withFilterField(String filterField) {
			request.setFilterField(filterField);
			return this;
		}
		
		public Builder withFilterValue(String filterValue) {
			request.setFilterValue(filterValue);
			return this;
		}
		
		public Builder withActionMapIds(List<String> actionMapIds) {
			request.setActionMapIds(actionMapIds);
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
		

		

		public GetJourneyActionmapsRequest build() {
            
			return request;
		}
	}
}
