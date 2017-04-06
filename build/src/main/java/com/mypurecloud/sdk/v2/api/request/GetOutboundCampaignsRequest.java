package com.mypurecloud.sdk.v2.api.request;

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
import com.mypurecloud.sdk.v2.model.Campaign;
import com.mypurecloud.sdk.v2.model.AttemptLimits;
import com.mypurecloud.sdk.v2.model.AttemptLimitsEntityListing;
import com.mypurecloud.sdk.v2.model.CallableTimeSet;
import com.mypurecloud.sdk.v2.model.CallableTimeSetEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseSet;
import com.mypurecloud.sdk.v2.model.ResponseSetEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignDiagnostics;
import com.mypurecloud.sdk.v2.model.CampaignInteractions;
import com.mypurecloud.sdk.v2.model.CampaignProgress;
import com.mypurecloud.sdk.v2.model.CampaignStats;
import com.mypurecloud.sdk.v2.model.CampaignRule;
import com.mypurecloud.sdk.v2.model.CampaignRuleEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignEntityListing;
import com.mypurecloud.sdk.v2.model.ContactList;
import com.mypurecloud.sdk.v2.model.DialerContact;
import com.mypurecloud.sdk.v2.model.ExportUri;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import com.mypurecloud.sdk.v2.model.ContactListEntityListing;
import com.mypurecloud.sdk.v2.model.DncList;
import com.mypurecloud.sdk.v2.model.DncListEntityListing;
import com.mypurecloud.sdk.v2.model.RuleSet;
import com.mypurecloud.sdk.v2.model.RuleSetEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignSchedule;
import com.mypurecloud.sdk.v2.model.SequenceSchedule;
import com.mypurecloud.sdk.v2.model.CampaignSequence;
import com.mypurecloud.sdk.v2.model.CampaignSequenceEntityListing;
import com.mypurecloud.sdk.v2.model.WrapUpCodeMapping;
import com.mypurecloud.sdk.v2.model.AuditSearchResult;
import com.mypurecloud.sdk.v2.model.DialerAuditRequest;
import com.mypurecloud.sdk.v2.model.ContactCallbackRequest;
import com.mypurecloud.sdk.v2.model.UriReference;
import com.mypurecloud.sdk.v2.model.DncListCreate;
import com.mypurecloud.sdk.v2.model.Agent;

public class GetOutboundCampaignsRequest {
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetOutboundCampaignsRequest withPageSize(Integer pageSize) {
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

	public GetOutboundCampaignsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	}

	private String filterType;
	public String getFilterType() {
		return this.filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public GetOutboundCampaignsRequest withFilterType(String filterType) {
	    this.setFilterType(filterType);
	    return this;
	}

	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetOutboundCampaignsRequest withName(String name) {
	    this.setName(name);
	    return this;
	}

	private String contactListId;
	public String getContactListId() {
		return this.contactListId;
	}

	public void setContactListId(String contactListId) {
		this.contactListId = contactListId;
	}

	public GetOutboundCampaignsRequest withContactListId(String contactListId) {
	    this.setContactListId(contactListId);
	    return this;
	}

	private String dncListId;
	public String getDncListId() {
		return this.dncListId;
	}

	public void setDncListId(String dncListId) {
		this.dncListId = dncListId;
	}

	public GetOutboundCampaignsRequest withDncListId(String dncListId) {
	    this.setDncListId(dncListId);
	    return this;
	}

	private String distributionQueueId;
	public String getDistributionQueueId() {
		return this.distributionQueueId;
	}

	public void setDistributionQueueId(String distributionQueueId) {
		this.distributionQueueId = distributionQueueId;
	}

	public GetOutboundCampaignsRequest withDistributionQueueId(String distributionQueueId) {
	    this.setDistributionQueueId(distributionQueueId);
	    return this;
	}

	private String edgeGroupId;
	public String getEdgeGroupId() {
		return this.edgeGroupId;
	}

	public void setEdgeGroupId(String edgeGroupId) {
		this.edgeGroupId = edgeGroupId;
	}

	public GetOutboundCampaignsRequest withEdgeGroupId(String edgeGroupId) {
	    this.setEdgeGroupId(edgeGroupId);
	    return this;
	}

	private String callAnalysisResponseSetId;
	public String getCallAnalysisResponseSetId() {
		return this.callAnalysisResponseSetId;
	}

	public void setCallAnalysisResponseSetId(String callAnalysisResponseSetId) {
		this.callAnalysisResponseSetId = callAnalysisResponseSetId;
	}

	public GetOutboundCampaignsRequest withCallAnalysisResponseSetId(String callAnalysisResponseSetId) {
	    this.setCallAnalysisResponseSetId(callAnalysisResponseSetId);
	    return this;
	}

	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetOutboundCampaignsRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	}

	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetOutboundCampaignsRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
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

    public GetOutboundCampaignsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/outbound/campaigns")
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("filterType", "", filterType)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("contactListId", "", contactListId)
        
                .withQueryParameters("dncListId", "", dncListId)
        
                .withQueryParameters("distributionQueueId", "", distributionQueueId)
        
                .withQueryParameters("edgeGroupId", "", edgeGroupId)
        
                .withQueryParameters("callAnalysisResponseSetId", "", callAnalysisResponseSetId)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("sortOrder", "", sortOrder)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static class Builder {
		private final GetOutboundCampaignsRequest request;

		private Builder() {
			request = new GetOutboundCampaignsRequest();
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		public Builder withFilterType(String filterType) {
			request.setFilterType(filterType);
			return this;
		}
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		public Builder withContactListId(String contactListId) {
			request.setContactListId(contactListId);
			return this;
		}
		public Builder withDncListId(String dncListId) {
			request.setDncListId(dncListId);
			return this;
		}
		public Builder withDistributionQueueId(String distributionQueueId) {
			request.setDistributionQueueId(distributionQueueId);
			return this;
		}
		public Builder withEdgeGroupId(String edgeGroupId) {
			request.setEdgeGroupId(edgeGroupId);
			return this;
		}
		public Builder withCallAnalysisResponseSetId(String callAnalysisResponseSetId) {
			request.setCallAnalysisResponseSetId(callAnalysisResponseSetId);
			return this;
		}
		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}
		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}



		public GetOutboundCampaignsRequest build() {
            
			return request;
		}
	}
}
