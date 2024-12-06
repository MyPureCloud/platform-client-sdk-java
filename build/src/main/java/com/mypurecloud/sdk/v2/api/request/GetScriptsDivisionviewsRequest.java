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
import com.mypurecloud.sdk.v2.model.ExportScriptRequest;
import com.mypurecloud.sdk.v2.model.ExportScriptResponse;
import com.mypurecloud.sdk.v2.model.ImportScriptStatusResponse;
import com.mypurecloud.sdk.v2.model.Page;
import com.mypurecloud.sdk.v2.model.PublishScriptRequestData;
import com.mypurecloud.sdk.v2.model.Script;
import com.mypurecloud.sdk.v2.model.ScriptEntityListing;

public class GetScriptsDivisionviewsRequest {

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetScriptsDivisionviewsRequest withPageSize(Integer pageSize) {
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

	public GetScriptsDivisionviewsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 

	private String expand;
	public String getExpand() {
		return this.expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public GetScriptsDivisionviewsRequest withExpand(String expand) {
	    this.setExpand(expand);
	    return this;
	} 

	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetScriptsDivisionviewsRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 

	private String feature;
	public String getFeature() {
		return this.feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public GetScriptsDivisionviewsRequest withFeature(String feature) {
	    this.setFeature(feature);
	    return this;
	} 

	private String flowId;
	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public GetScriptsDivisionviewsRequest withFlowId(String flowId) {
	    this.setFlowId(flowId);
	    return this;
	} 

	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetScriptsDivisionviewsRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	public enum sortByValues { 
		MODIFIEDDATE("modifiedDate"),
		CREATEDDATE("createdDate"),
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

	public GetScriptsDivisionviewsRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 

	public enum sortOrderValues { 
		ASCENDING("ascending"),
		DESCENDING("descending");

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

	private String scriptDataVersion;
	public String getScriptDataVersion() {
		return this.scriptDataVersion;
	}

	public void setScriptDataVersion(String scriptDataVersion) {
		this.scriptDataVersion = scriptDataVersion;
	}

	public GetScriptsDivisionviewsRequest withScriptDataVersion(String scriptDataVersion) {
	    this.setScriptDataVersion(scriptDataVersion);
	    return this;
	} 

	private String divisionIds;
	public String getDivisionIds() {
		return this.divisionIds;
	}

	public void setDivisionIds(String divisionIds) {
		this.divisionIds = divisionIds;
	}

	public GetScriptsDivisionviewsRequest withDivisionIds(String divisionIds) {
	    this.setDivisionIds(divisionIds);
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

    public GetScriptsDivisionviewsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/scripts/divisionviews")

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("expand", "", expand)
        

                .withQueryParameters("name", "", name)
        

                .withQueryParameters("feature", "", feature)
        

                .withQueryParameters("flowId", "", flowId)
        

                .withQueryParameters("sortBy", "", sortBy)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        

                .withQueryParameters("scriptDataVersion", "", scriptDataVersion)
        

                .withQueryParameters("divisionIds", "", divisionIds)
        
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
		private final GetScriptsDivisionviewsRequest request;

		private Builder() {
			request = new GetScriptsDivisionviewsRequest();
		}


		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}

		public Builder withExpand(String expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withName(String name) {
			request.setName(name);
			return this;
		}

		public Builder withFeature(String feature) {
			request.setFeature(feature);
			return this;
		}

		public Builder withFlowId(String flowId) {
			request.setFlowId(flowId);
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

		public Builder withScriptDataVersion(String scriptDataVersion) {
			request.setScriptDataVersion(scriptDataVersion);
			return this;
		}

		public Builder withDivisionIds(String divisionIds) {
			request.setDivisionIds(divisionIds);
			return this;
		}




		public GetScriptsDivisionviewsRequest build() {
            
			return request;
		}
	}
}
