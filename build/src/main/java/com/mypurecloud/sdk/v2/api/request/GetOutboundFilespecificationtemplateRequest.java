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
import com.mypurecloud.sdk.v2.model.CallableTimeSet;
import com.mypurecloud.sdk.v2.model.CallableTimeSetEntityListing;
import com.mypurecloud.sdk.v2.model.Campaign;
import com.mypurecloud.sdk.v2.model.CampaignDiagnostics;
import com.mypurecloud.sdk.v2.model.CampaignDivisionView;
import com.mypurecloud.sdk.v2.model.CampaignDivisionViewListing;
import com.mypurecloud.sdk.v2.model.CampaignEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignInteractions;
import com.mypurecloud.sdk.v2.model.CampaignOutboundLinesDistribution;
import com.mypurecloud.sdk.v2.model.CampaignPatchRequest;
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
import com.mypurecloud.sdk.v2.model.ContactsBulkOperationJobListing;
import com.mypurecloud.sdk.v2.model.ContactsExportRequest;
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
import com.mypurecloud.sdk.v2.model.DncPatchWhatsAppNumbersRequest;
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
import com.mypurecloud.sdk.v2.model.PagedSkillCombinationListing;
import com.mypurecloud.sdk.v2.model.ResponseSet;
import com.mypurecloud.sdk.v2.model.ResponseSetEntityListing;
import com.mypurecloud.sdk.v2.model.RuleSet;
import com.mypurecloud.sdk.v2.model.RuleSetEntityListing;
import com.mypurecloud.sdk.v2.model.SequenceSchedule;
import com.mypurecloud.sdk.v2.model.TimeZoneMappingPreview;
import com.mypurecloud.sdk.v2.model.WrapUpCodeMapping;
import com.mypurecloud.sdk.v2.model.WritableDialerContact;

public class GetOutboundFilespecificationtemplateRequest {

	private String fileSpecificationTemplateId;
	public String getFileSpecificationTemplateId() {
		return this.fileSpecificationTemplateId;
	}

	public void setFileSpecificationTemplateId(String fileSpecificationTemplateId) {
		this.fileSpecificationTemplateId = fileSpecificationTemplateId;
	}

	public GetOutboundFilespecificationtemplateRequest withFileSpecificationTemplateId(String fileSpecificationTemplateId) {
	    this.setFileSpecificationTemplateId(fileSpecificationTemplateId);
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

    public GetOutboundFilespecificationtemplateRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'fileSpecificationTemplateId' is set
        if (this.fileSpecificationTemplateId == null) {
            throw new IllegalStateException("Missing the required parameter 'fileSpecificationTemplateId' when building request for GetOutboundFilespecificationtemplateRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/outbound/filespecificationtemplates/{fileSpecificationTemplateId}")
                .withPathParameter("fileSpecificationTemplateId", fileSpecificationTemplateId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String fileSpecificationTemplateId) {
	    return new Builder()
	            .withRequiredParams(fileSpecificationTemplateId);
	}


	public static class Builder {
		private final GetOutboundFilespecificationtemplateRequest request;

		private Builder() {
			request = new GetOutboundFilespecificationtemplateRequest();
		}


		public Builder withFileSpecificationTemplateId(String fileSpecificationTemplateId) {
			request.setFileSpecificationTemplateId(fileSpecificationTemplateId);
			return this;
		}



		public Builder withRequiredParams(String fileSpecificationTemplateId) {
			request.setFileSpecificationTemplateId(fileSpecificationTemplateId);

			return this;
		}


		public GetOutboundFilespecificationtemplateRequest build() {
            
            // verify the required parameter 'fileSpecificationTemplateId' is set
            if (request.fileSpecificationTemplateId == null) {
                throw new IllegalStateException("Missing the required parameter 'fileSpecificationTemplateId' when building request for GetOutboundFilespecificationtemplateRequest.");
            }
            
			return request;
		}
	}
}
