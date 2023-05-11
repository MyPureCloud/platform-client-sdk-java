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

import com.mypurecloud.sdk.v2.model.AcceleratorInput;
import com.mypurecloud.sdk.v2.model.AcceleratorList;
import com.mypurecloud.sdk.v2.model.AcceleratorSpecification;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.InfrastructureascodeJob;

public class GetInfrastructureascodeJobsRequest {

	private Integer maxResults;
	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public GetInfrastructureascodeJobsRequest withMaxResults(Integer maxResults) {
	    this.setMaxResults(maxResults);
	    return this;
	} 

	private Boolean includeErrors;
	public Boolean getIncludeErrors() {
		return this.includeErrors;
	}

	public void setIncludeErrors(Boolean includeErrors) {
		this.includeErrors = includeErrors;
	}

	public GetInfrastructureascodeJobsRequest withIncludeErrors(Boolean includeErrors) {
	    this.setIncludeErrors(includeErrors);
	    return this;
	} 

	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetInfrastructureascodeJobsRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	public enum sortByValues { 
		ID("id"),
		DATESUBMITTED("dateSubmitted"),
		SUBMITTEDBY("submittedBy"),
		ACCELERATORID("acceleratorId"),
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

	public GetInfrastructureascodeJobsRequest withSortOrder(String sortOrder) {
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

	private String acceleratorId;
	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
	}

	public GetInfrastructureascodeJobsRequest withAcceleratorId(String acceleratorId) {
	    this.setAcceleratorId(acceleratorId);
	    return this;
	} 

	private String submittedBy;
	public String getSubmittedBy() {
		return this.submittedBy;
	}

	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}

	public GetInfrastructureascodeJobsRequest withSubmittedBy(String submittedBy) {
	    this.setSubmittedBy(submittedBy);
	    return this;
	} 

	private String status;
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GetInfrastructureascodeJobsRequest withStatus(String status) {
	    this.setStatus(status);
	    return this;
	} 

	public enum statusValues { 
		CREATED("Created"),
		QUEUED("Queued"),
		RUNNING("Running"),
		COMPLETE("Complete"),
		FAILED("Failed"),
		INCOMPLETE("Incomplete");

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

    public GetInfrastructureascodeJobsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/infrastructureascode/jobs")

                .withQueryParameters("maxResults", "", maxResults)
        

                .withQueryParameters("includeErrors", "", includeErrors)
        

                .withQueryParameters("sortBy", "", sortBy)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        

                .withQueryParameters("acceleratorId", "", acceleratorId)
        

                .withQueryParameters("submittedBy", "", submittedBy)
        

                .withQueryParameters("status", "", status)
        
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
		private final GetInfrastructureascodeJobsRequest request;

		private Builder() {
			request = new GetInfrastructureascodeJobsRequest();
		}


		public Builder withMaxResults(Integer maxResults) {
			request.setMaxResults(maxResults);
			return this;
		}

		public Builder withIncludeErrors(Boolean includeErrors) {
			request.setIncludeErrors(includeErrors);
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

		public Builder withAcceleratorId(String acceleratorId) {
			request.setAcceleratorId(acceleratorId);
			return this;
		}

		public Builder withSubmittedBy(String submittedBy) {
			request.setSubmittedBy(submittedBy);
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




		public GetInfrastructureascodeJobsRequest build() {
            
			return request;
		}
	}
}
