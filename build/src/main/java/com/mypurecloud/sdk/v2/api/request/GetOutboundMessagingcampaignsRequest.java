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

public class GetOutboundMessagingcampaignsRequest {

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetOutboundMessagingcampaignsRequest withPageSize(Integer pageSize) {
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

	public GetOutboundMessagingcampaignsRequest withPageNumber(Integer pageNumber) {
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

	public GetOutboundMessagingcampaignsRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	public enum sortByValues { 
		CAMPAIGNSTATUS("campaignStatus"),
		NAME("name"),
		TYPE("type");

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

	public GetOutboundMessagingcampaignsRequest withSortOrder(String sortOrder) {
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

	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetOutboundMessagingcampaignsRequest withName(String name) {
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

	public GetOutboundMessagingcampaignsRequest withContactListId(String contactListId) {
	    this.setContactListId(contactListId);
	    return this;
	} 

	private List<String> divisionId;
	public List<String> getDivisionId() {
		return this.divisionId;
	}

	public void setDivisionId(List<String> divisionId) {
		this.divisionId = divisionId;
	}

	public GetOutboundMessagingcampaignsRequest withDivisionId(List<String> divisionId) {
	    this.setDivisionId(divisionId);
	    return this;
	} 

	private String type;
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GetOutboundMessagingcampaignsRequest withType(String type) {
	    this.setType(type);
	    return this;
	} 

	public enum typeValues { 
		EMAIL("EMAIL"),
		SMS("SMS"),
		WHATSAPP("WHATSAPP");

		private String value;

		typeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static typeValues fromString(String key) {
			if (key == null) return null;

			for (typeValues value : typeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return typeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String senderSmsPhoneNumber;
	public String getSenderSmsPhoneNumber() {
		return this.senderSmsPhoneNumber;
	}

	public void setSenderSmsPhoneNumber(String senderSmsPhoneNumber) {
		this.senderSmsPhoneNumber = senderSmsPhoneNumber;
	}

	public GetOutboundMessagingcampaignsRequest withSenderSmsPhoneNumber(String senderSmsPhoneNumber) {
	    this.setSenderSmsPhoneNumber(senderSmsPhoneNumber);
	    return this;
	} 

	private List<String> id;
	public List<String> getId() {
		return this.id;
	}

	public void setId(List<String> id) {
		this.id = id;
	}

	public GetOutboundMessagingcampaignsRequest withId(List<String> id) {
	    this.setId(id);
	    return this;
	} 

	private String contentTemplateId;
	public String getContentTemplateId() {
		return this.contentTemplateId;
	}

	public void setContentTemplateId(String contentTemplateId) {
		this.contentTemplateId = contentTemplateId;
	}

	public GetOutboundMessagingcampaignsRequest withContentTemplateId(String contentTemplateId) {
	    this.setContentTemplateId(contentTemplateId);
	    return this;
	} 

	private String campaignStatus;
	public String getCampaignStatus() {
		return this.campaignStatus;
	}

	public void setCampaignStatus(String campaignStatus) {
		this.campaignStatus = campaignStatus;
	}

	public GetOutboundMessagingcampaignsRequest withCampaignStatus(String campaignStatus) {
	    this.setCampaignStatus(campaignStatus);
	    return this;
	} 

	public enum campaignStatusValues { 
		ON("on"),
		STOPPING("stopping"),
		OFF("off"),
		COMPLETE("complete"),
		INVALID("invalid"),
		FORCED_OFF("forced_off"),
		FORCED_STOPPING("forced_stopping");

		private String value;

		campaignStatusValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static campaignStatusValues fromString(String key) {
			if (key == null) return null;

			for (campaignStatusValues value : campaignStatusValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return campaignStatusValues.values()[0];
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

    public GetOutboundMessagingcampaignsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/outbound/messagingcampaigns")

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("sortBy", "", sortBy)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        

                .withQueryParameters("name", "", name)
        

                .withQueryParameters("contactListId", "", contactListId)
        

                .withQueryParameters("divisionId", "multi", divisionId)
        

                .withQueryParameters("type", "", type)
        

                .withQueryParameters("senderSmsPhoneNumber", "", senderSmsPhoneNumber)
        

                .withQueryParameters("id", "multi", id)
        

                .withQueryParameters("contentTemplateId", "", contentTemplateId)
        

                .withQueryParameters("campaignStatus", "", campaignStatus)
        
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
		private final GetOutboundMessagingcampaignsRequest request;

		private Builder() {
			request = new GetOutboundMessagingcampaignsRequest();
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

		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}



		
		public Builder withSortOrder(sortOrderValues sortOrder) {
		    request.setSortOrder(sortOrder.toString());

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

		public Builder withDivisionId(List<String> divisionId) {
			request.setDivisionId(divisionId);
			return this;
		}

		public Builder withType(String type) {
			request.setType(type);
			return this;
		}



		
		public Builder withType(typeValues type) {
		    request.setType(type.toString());

		    return this;
		}

		public Builder withSenderSmsPhoneNumber(String senderSmsPhoneNumber) {
			request.setSenderSmsPhoneNumber(senderSmsPhoneNumber);
			return this;
		}

		public Builder withId(List<String> id) {
			request.setId(id);
			return this;
		}

		public Builder withContentTemplateId(String contentTemplateId) {
			request.setContentTemplateId(contentTemplateId);
			return this;
		}

		public Builder withCampaignStatus(String campaignStatus) {
			request.setCampaignStatus(campaignStatus);
			return this;
		}



		
		public Builder withCampaignStatus(campaignStatusValues campaignStatus) {
		    request.setCampaignStatus(campaignStatus.toString());

		    return this;
		}




		public GetOutboundMessagingcampaignsRequest build() {
            
			return request;
		}
	}
}
