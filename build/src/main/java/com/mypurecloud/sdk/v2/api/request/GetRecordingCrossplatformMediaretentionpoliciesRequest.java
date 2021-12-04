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

public class GetRecordingCrossplatformMediaretentionpoliciesRequest {
    
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetRecordingCrossplatformMediaretentionpoliciesRequest withPageSize(Integer pageSize) {
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

	public GetRecordingCrossplatformMediaretentionpoliciesRequest withPageNumber(Integer pageNumber) {
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

	public GetRecordingCrossplatformMediaretentionpoliciesRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 
	
	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetRecordingCrossplatformMediaretentionpoliciesRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 
	
	private String nextPage;
	public String getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}

	public GetRecordingCrossplatformMediaretentionpoliciesRequest withNextPage(String nextPage) {
	    this.setNextPage(nextPage);
	    return this;
	} 
	
	private String previousPage;
	public String getPreviousPage() {
		return this.previousPage;
	}

	public void setPreviousPage(String previousPage) {
		this.previousPage = previousPage;
	}

	public GetRecordingCrossplatformMediaretentionpoliciesRequest withPreviousPage(String previousPage) {
	    this.setPreviousPage(previousPage);
	    return this;
	} 
	
	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetRecordingCrossplatformMediaretentionpoliciesRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 
	
	private Boolean enabled;
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public GetRecordingCrossplatformMediaretentionpoliciesRequest withEnabled(Boolean enabled) {
	    this.setEnabled(enabled);
	    return this;
	} 
	
	private Boolean summary;
	public Boolean getSummary() {
		return this.summary;
	}

	public void setSummary(Boolean summary) {
		this.summary = summary;
	}

	public GetRecordingCrossplatformMediaretentionpoliciesRequest withSummary(Boolean summary) {
	    this.setSummary(summary);
	    return this;
	} 
	
	private Boolean hasErrors;
	public Boolean getHasErrors() {
		return this.hasErrors;
	}

	public void setHasErrors(Boolean hasErrors) {
		this.hasErrors = hasErrors;
	}

	public GetRecordingCrossplatformMediaretentionpoliciesRequest withHasErrors(Boolean hasErrors) {
	    this.setHasErrors(hasErrors);
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

    public GetRecordingCrossplatformMediaretentionpoliciesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/recording/crossplatform/mediaretentionpolicies")
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("expand", "multi", expand)
        
                .withQueryParameters("nextPage", "", nextPage)
        
                .withQueryParameters("previousPage", "", previousPage)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("enabled", "", enabled)
        
                .withQueryParameters("summary", "", summary)
        
                .withQueryParameters("hasErrors", "", hasErrors)
        
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
		private final GetRecordingCrossplatformMediaretentionpoliciesRequest request;

		private Builder() {
			request = new GetRecordingCrossplatformMediaretentionpoliciesRequest();
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
		
		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}
		
		public Builder withNextPage(String nextPage) {
			request.setNextPage(nextPage);
			return this;
		}
		
		public Builder withPreviousPage(String previousPage) {
			request.setPreviousPage(previousPage);
			return this;
		}
		
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		
		public Builder withEnabled(Boolean enabled) {
			request.setEnabled(enabled);
			return this;
		}
		
		public Builder withSummary(Boolean summary) {
			request.setSummary(summary);
			return this;
		}
		
		public Builder withHasErrors(Boolean hasErrors) {
			request.setHasErrors(hasErrors);
			return this;
		}
		

		

		public GetRecordingCrossplatformMediaretentionpoliciesRequest build() {
            
			return request;
		}
	}
}
