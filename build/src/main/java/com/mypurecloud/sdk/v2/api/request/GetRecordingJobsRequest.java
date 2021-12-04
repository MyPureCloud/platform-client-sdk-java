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
import com.mypurecloud.sdk.v2.model.OrphanRecording;
import com.mypurecloud.sdk.v2.model.Recording;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.RecordingMetadata;
import com.mypurecloud.sdk.v2.model.OrphanRecordingListing;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobStatusResult;
import com.mypurecloud.sdk.v2.model.PolicyEntityListing;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicy;
import com.mypurecloud.sdk.v2.model.RecordingJob;
import com.mypurecloud.sdk.v2.model.FailedRecordingEntityListing;
import com.mypurecloud.sdk.v2.model.RecordingJobEntityListing;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfigurationListing;
import com.mypurecloud.sdk.v2.model.Policy;
import com.mypurecloud.sdk.v2.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.v2.model.KeyRotationSchedule;
import com.mypurecloud.sdk.v2.model.RecordingSettings;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionListing;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyUpdate;
import com.mypurecloud.sdk.v2.model.PolicyUpdate;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionRequest;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmission;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmissionResult;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyCreate;
import com.mypurecloud.sdk.v2.model.RecordingJobsQuery;
import com.mypurecloud.sdk.v2.model.LocalEncryptionKeyRequest;
import com.mypurecloud.sdk.v2.model.EncryptionKey;
import com.mypurecloud.sdk.v2.model.PolicyCreate;
import com.mypurecloud.sdk.v2.model.ConversationDeletionProtectionQuery;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.AcknowledgeScreenRecordingRequest;
import com.mypurecloud.sdk.v2.model.ScreenRecordingMetaDataRequest;
import com.mypurecloud.sdk.v2.model.OrphanUpdateRequest;
import com.mypurecloud.sdk.v2.model.ExecuteRecordingJobsQuery;

public class GetRecordingJobsRequest {
    
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetRecordingJobsRequest withPageSize(Integer pageSize) {
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

	public GetRecordingJobsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetRecordingJobsRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	public enum sortByValues { 
		USERID("userId"), 
		DATECREATED("dateCreated");

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
	
	private String state;
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public GetRecordingJobsRequest withState(String state) {
	    this.setState(state);
	    return this;
	} 

	public enum stateValues { 
		FULFILLED("FULFILLED"), 
		PENDING("PENDING"), 
		READY("READY"), 
		PROCESSING("PROCESSING"), 
		CANCELLED("CANCELLED"), 
		FAILED("FAILED");

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
	
	private Boolean showOnlyMyJobs;
	public Boolean getShowOnlyMyJobs() {
		return this.showOnlyMyJobs;
	}

	public void setShowOnlyMyJobs(Boolean showOnlyMyJobs) {
		this.showOnlyMyJobs = showOnlyMyJobs;
	}

	public GetRecordingJobsRequest withShowOnlyMyJobs(Boolean showOnlyMyJobs) {
	    this.setShowOnlyMyJobs(showOnlyMyJobs);
	    return this;
	} 
	
	private String jobType;
	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public GetRecordingJobsRequest withJobType(String jobType) {
	    this.setJobType(jobType);
	    return this;
	} 

	public enum jobTypeValues { 
		DELETE("DELETE"), 
		EXPORT("EXPORT");

		private String value;

		jobTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static jobTypeValues fromString(String key) {
			if (key == null) return null;

			for (jobTypeValues value : jobTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return jobTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private Boolean includeTotal;
	public Boolean getIncludeTotal() {
		return this.includeTotal;
	}

	public void setIncludeTotal(Boolean includeTotal) {
		this.includeTotal = includeTotal;
	}

	public GetRecordingJobsRequest withIncludeTotal(Boolean includeTotal) {
	    this.setIncludeTotal(includeTotal);
	    return this;
	} 
	
	private String cursor;
	public String getCursor() {
		return this.cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public GetRecordingJobsRequest withCursor(String cursor) {
	    this.setCursor(cursor);
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

    public GetRecordingJobsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/recording/jobs")
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("state", "", state)
        
                .withQueryParameters("showOnlyMyJobs", "", showOnlyMyJobs)
        
                .withQueryParameters("jobType", "", jobType)
        
                .withQueryParameters("includeTotal", "", includeTotal)
        
                .withQueryParameters("cursor", "", cursor)
        
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
		private final GetRecordingJobsRequest request;

		private Builder() {
			request = new GetRecordingJobsRequest();
		}

		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
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
		
		public Builder withState(String state) {
			request.setState(state);
			return this;
		}

		public Builder withState(stateValues state) {
		    request.setState(state.toString());
		    return this;
		}
		
		public Builder withShowOnlyMyJobs(Boolean showOnlyMyJobs) {
			request.setShowOnlyMyJobs(showOnlyMyJobs);
			return this;
		}
		
		public Builder withJobType(String jobType) {
			request.setJobType(jobType);
			return this;
		}

		public Builder withJobType(jobTypeValues jobType) {
		    request.setJobType(jobType.toString());
		    return this;
		}
		
		public Builder withIncludeTotal(Boolean includeTotal) {
			request.setIncludeTotal(includeTotal);
			return this;
		}
		
		public Builder withCursor(String cursor) {
			request.setCursor(cursor);
			return this;
		}
		

		

		public GetRecordingJobsRequest build() {
            
			return request;
		}
	}
}
