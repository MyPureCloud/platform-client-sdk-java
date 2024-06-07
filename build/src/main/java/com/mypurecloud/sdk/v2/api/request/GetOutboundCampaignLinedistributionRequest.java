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

import com.mypurecloud.sdk.v2.model.Agent;
import com.mypurecloud.sdk.v2.model.AgentOwnedMappingPreviewListing;
import com.mypurecloud.sdk.v2.model.AttemptLimits;
import com.mypurecloud.sdk.v2.model.AttemptLimitsEntityListing;
import com.mypurecloud.sdk.v2.model.AuditSearchResult;
import com.mypurecloud.sdk.v2.model.CallableTimeSet;
import com.mypurecloud.sdk.v2.model.CallableTimeSetEntityListing;
import com.mypurecloud.sdk.v2.model.Campaign;
import com.mypurecloud.sdk.v2.model.CampaignDiagnostics;
import com.mypurecloud.sdk.v2.model.CampaignDivisionView;
import com.mypurecloud.sdk.v2.model.CampaignDivisionViewListing;
import com.mypurecloud.sdk.v2.model.CampaignEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignInteractions;
import com.mypurecloud.sdk.v2.model.CampaignOutboundLinesDistribution;
import com.mypurecloud.sdk.v2.model.CampaignProgress;
import com.mypurecloud.sdk.v2.model.CampaignRule;
import com.mypurecloud.sdk.v2.model.CampaignRuleEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignSchedule;
import com.mypurecloud.sdk.v2.model.CampaignSequence;
import com.mypurecloud.sdk.v2.model.CampaignSequenceEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignStats;
import com.mypurecloud.sdk.v2.model.CommonCampaignDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.CommonCampaignEntityListing;
import com.mypurecloud.sdk.v2.model.ContactBulkEditRequest;
import com.mypurecloud.sdk.v2.model.ContactBulkSearchParameters;
import com.mypurecloud.sdk.v2.model.ContactCallbackRequest;
import com.mypurecloud.sdk.v2.model.ContactList;
import com.mypurecloud.sdk.v2.model.ContactListDivisionView;
import com.mypurecloud.sdk.v2.model.ContactListDivisionViewListing;
import com.mypurecloud.sdk.v2.model.ContactListEntityListing;
import com.mypurecloud.sdk.v2.model.ContactListFilter;
import com.mypurecloud.sdk.v2.model.ContactListFilterBulkRetrieveBody;
import com.mypurecloud.sdk.v2.model.ContactListFilterEntityListing;
import com.mypurecloud.sdk.v2.model.ContactListTemplate;
import com.mypurecloud.sdk.v2.model.ContactListTemplateBulkRetrieveBody;
import com.mypurecloud.sdk.v2.model.ContactListTemplateEntityListing;
import com.mypurecloud.sdk.v2.model.ContactListingRequest;
import com.mypurecloud.sdk.v2.model.ContactListingResponse;
import com.mypurecloud.sdk.v2.model.ContactsBulkOperationJob;
import com.mypurecloud.sdk.v2.model.ContactsExportRequest;
import com.mypurecloud.sdk.v2.model.DialerAuditRequest;
import com.mypurecloud.sdk.v2.model.DialerContact;
import com.mypurecloud.sdk.v2.model.DialerEventEntityListing;
import com.mypurecloud.sdk.v2.model.DigitalRuleSet;
import com.mypurecloud.sdk.v2.model.DigitalRuleSetEntityListing;
import com.mypurecloud.sdk.v2.model.DncList;
import com.mypurecloud.sdk.v2.model.DncListCreate;
import com.mypurecloud.sdk.v2.model.DncListDivisionView;
import com.mypurecloud.sdk.v2.model.DncListDivisionViewListing;
import com.mypurecloud.sdk.v2.model.DncListEntityListing;
import com.mypurecloud.sdk.v2.model.DncPatchCustomExclusionColumnsRequest;
import com.mypurecloud.sdk.v2.model.DncPatchEmailsRequest;
import com.mypurecloud.sdk.v2.model.DncPatchPhoneNumbersRequest;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.EmailCampaignSchedule;
import com.mypurecloud.sdk.v2.model.EmailCampaignScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EventLog;
import com.mypurecloud.sdk.v2.model.ExportUri;
import com.mypurecloud.sdk.v2.model.FileSpecificationTemplate;
import com.mypurecloud.sdk.v2.model.FileSpecificationTemplateEntityListing;
import com.mypurecloud.sdk.v2.model.FilterPreviewResponse;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import com.mypurecloud.sdk.v2.model.ImportTemplate;
import com.mypurecloud.sdk.v2.model.ImportTemplateEntityListing;
import com.mypurecloud.sdk.v2.model.MessagingCampaign;
import com.mypurecloud.sdk.v2.model.MessagingCampaignDiagnostics;
import com.mypurecloud.sdk.v2.model.MessagingCampaignDivisionView;
import com.mypurecloud.sdk.v2.model.MessagingCampaignDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.MessagingCampaignEntityListing;
import com.mypurecloud.sdk.v2.model.MessagingCampaignSchedule;
import com.mypurecloud.sdk.v2.model.MessagingCampaignScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.OutboundSettings;
import com.mypurecloud.sdk.v2.model.ResponseSet;
import com.mypurecloud.sdk.v2.model.ResponseSetEntityListing;
import com.mypurecloud.sdk.v2.model.RuleSet;
import com.mypurecloud.sdk.v2.model.RuleSetEntityListing;
import com.mypurecloud.sdk.v2.model.SequenceSchedule;
import com.mypurecloud.sdk.v2.model.TimeZoneMappingPreview;
import com.mypurecloud.sdk.v2.model.WrapUpCodeMapping;
import com.mypurecloud.sdk.v2.model.WritableDialerContact;

public class GetOutboundCampaignLinedistributionRequest {

	private String campaignId;
	public String getCampaignId() {
		return this.campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public GetOutboundCampaignLinedistributionRequest withCampaignId(String campaignId) {
	    this.setCampaignId(campaignId);
	    return this;
	} 

	private Boolean includeOnlyActiveCampaigns;
	public Boolean getIncludeOnlyActiveCampaigns() {
		return this.includeOnlyActiveCampaigns;
	}

	public void setIncludeOnlyActiveCampaigns(Boolean includeOnlyActiveCampaigns) {
		this.includeOnlyActiveCampaigns = includeOnlyActiveCampaigns;
	}

	public GetOutboundCampaignLinedistributionRequest withIncludeOnlyActiveCampaigns(Boolean includeOnlyActiveCampaigns) {
	    this.setIncludeOnlyActiveCampaigns(includeOnlyActiveCampaigns);
	    return this;
	} 

	private String edgeGroupId;
	public String getEdgeGroupId() {
		return this.edgeGroupId;
	}

	public void setEdgeGroupId(String edgeGroupId) {
		this.edgeGroupId = edgeGroupId;
	}

	public GetOutboundCampaignLinedistributionRequest withEdgeGroupId(String edgeGroupId) {
	    this.setEdgeGroupId(edgeGroupId);
	    return this;
	} 

	private String siteId;
	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public GetOutboundCampaignLinedistributionRequest withSiteId(String siteId) {
	    this.setSiteId(siteId);
	    return this;
	} 

	private Boolean useWeight;
	public Boolean getUseWeight() {
		return this.useWeight;
	}

	public void setUseWeight(Boolean useWeight) {
		this.useWeight = useWeight;
	}

	public GetOutboundCampaignLinedistributionRequest withUseWeight(Boolean useWeight) {
	    this.setUseWeight(useWeight);
	    return this;
	} 

	private Integer relativeWeight;
	public Integer getRelativeWeight() {
		return this.relativeWeight;
	}

	public void setRelativeWeight(Integer relativeWeight) {
		this.relativeWeight = relativeWeight;
	}

	public GetOutboundCampaignLinedistributionRequest withRelativeWeight(Integer relativeWeight) {
	    this.setRelativeWeight(relativeWeight);
	    return this;
	} 

	private Integer outboundLineCount;
	public Integer getOutboundLineCount() {
		return this.outboundLineCount;
	}

	public void setOutboundLineCount(Integer outboundLineCount) {
		this.outboundLineCount = outboundLineCount;
	}

	public GetOutboundCampaignLinedistributionRequest withOutboundLineCount(Integer outboundLineCount) {
	    this.setOutboundLineCount(outboundLineCount);
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

    public GetOutboundCampaignLinedistributionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'campaignId' is set
        if (this.campaignId == null) {
            throw new IllegalStateException("Missing the required parameter 'campaignId' when building request for GetOutboundCampaignLinedistributionRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/outbound/campaigns/{campaignId}/linedistribution")
                .withPathParameter("campaignId", campaignId)
        

                .withQueryParameters("includeOnlyActiveCampaigns", "", includeOnlyActiveCampaigns)
        

                .withQueryParameters("edgeGroupId", "", edgeGroupId)
        

                .withQueryParameters("siteId", "", siteId)
        

                .withQueryParameters("useWeight", "", useWeight)
        

                .withQueryParameters("relativeWeight", "", relativeWeight)
        

                .withQueryParameters("outboundLineCount", "", outboundLineCount)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String campaignId) {
	    return new Builder()
	            .withRequiredParams(campaignId);
	}


	public static class Builder {
		private final GetOutboundCampaignLinedistributionRequest request;

		private Builder() {
			request = new GetOutboundCampaignLinedistributionRequest();
		}


		public Builder withCampaignId(String campaignId) {
			request.setCampaignId(campaignId);
			return this;
		}

		public Builder withIncludeOnlyActiveCampaigns(Boolean includeOnlyActiveCampaigns) {
			request.setIncludeOnlyActiveCampaigns(includeOnlyActiveCampaigns);
			return this;
		}

		public Builder withEdgeGroupId(String edgeGroupId) {
			request.setEdgeGroupId(edgeGroupId);
			return this;
		}

		public Builder withSiteId(String siteId) {
			request.setSiteId(siteId);
			return this;
		}

		public Builder withUseWeight(Boolean useWeight) {
			request.setUseWeight(useWeight);
			return this;
		}

		public Builder withRelativeWeight(Integer relativeWeight) {
			request.setRelativeWeight(relativeWeight);
			return this;
		}

		public Builder withOutboundLineCount(Integer outboundLineCount) {
			request.setOutboundLineCount(outboundLineCount);
			return this;
		}



		public Builder withRequiredParams(String campaignId) {
			request.setCampaignId(campaignId);

			return this;
		}


		public GetOutboundCampaignLinedistributionRequest build() {
            
            // verify the required parameter 'campaignId' is set
            if (request.campaignId == null) {
                throw new IllegalStateException("Missing the required parameter 'campaignId' when building request for GetOutboundCampaignLinedistributionRequest.");
            }
            
			return request;
		}
	}
}
