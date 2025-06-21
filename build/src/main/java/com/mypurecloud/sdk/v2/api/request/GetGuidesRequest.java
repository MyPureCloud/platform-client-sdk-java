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

import com.mypurecloud.sdk.v2.model.CreateGuide;
import com.mypurecloud.sdk.v2.model.CreateGuideVersion;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GenerateGuideContentRequest;
import com.mypurecloud.sdk.v2.model.Guide;
import com.mypurecloud.sdk.v2.model.GuideContentGenerationJob;
import com.mypurecloud.sdk.v2.model.GuideEntityListing;
import com.mypurecloud.sdk.v2.model.GuideJob;
import com.mypurecloud.sdk.v2.model.GuideVersion;
import com.mypurecloud.sdk.v2.model.GuideVersionPublishJob;
import com.mypurecloud.sdk.v2.model.GuideVersionPublishJobRequest;
import com.mypurecloud.sdk.v2.model.UpdateGuideVersion;

public class GetGuidesRequest {

	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetGuidesRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 

	private String nameContains;
	public String getNameContains() {
		return this.nameContains;
	}

	public void setNameContains(String nameContains) {
		this.nameContains = nameContains;
	}

	public GetGuidesRequest withNameContains(String nameContains) {
	    this.setNameContains(nameContains);
	    return this;
	} 

	private String status;
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GetGuidesRequest withStatus(String status) {
	    this.setStatus(status);
	    return this;
	} 

	public enum statusValues { 
		PUBLISHED("Published"),
		DRAFT("Draft");

		private String value;

		statusValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static statusValues fromString(String key) {
			if (key == null) return null;

			for (statusValues value : statusValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return statusValues.values()[0];
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

	public GetGuidesRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	public enum sortByValues { 
		DATEMODIFIED("dateModified"),
		NAME("name"),
		STATUS("status");

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

	public GetGuidesRequest withSortOrder(String sortOrder) {
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

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetGuidesRequest withPageNumber(Integer pageNumber) {
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

	public GetGuidesRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
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

    public GetGuidesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/guides")

                .withQueryParameters("name", "", name)
        

                .withQueryParameters("nameContains", "", nameContains)
        

                .withQueryParameters("status", "", status)
        

                .withQueryParameters("sortBy", "", sortBy)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("pageSize", "", pageSize)
        
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
		private final GetGuidesRequest request;

		private Builder() {
			request = new GetGuidesRequest();
		}


		public Builder withName(String name) {
			request.setName(name);
			return this;
		}

		public Builder withNameContains(String nameContains) {
			request.setNameContains(nameContains);
			return this;
		}

		public Builder withStatus(String status) {
			request.setStatus(status);
			return this;
		}



		
		public Builder withStatus(statusValues status) {
		    request.setStatus(status.toString());

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

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}




		public GetGuidesRequest build() {
            
			return request;
		}
	}
}
