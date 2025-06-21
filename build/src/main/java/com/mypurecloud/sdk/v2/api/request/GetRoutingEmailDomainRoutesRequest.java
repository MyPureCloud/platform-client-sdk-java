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

import com.mypurecloud.sdk.v2.model.AgentDirectRoutingBackupSettings;
import com.mypurecloud.sdk.v2.model.AgentMaxUtilizationResponse;
import com.mypurecloud.sdk.v2.model.AssessmentJobListing;
import com.mypurecloud.sdk.v2.model.AssessmentListing;
import com.mypurecloud.sdk.v2.model.AssistantQueue;
import com.mypurecloud.sdk.v2.model.AvailableMediaTypeEntityListing;
import com.mypurecloud.sdk.v2.model.BenefitAssessment;
import com.mypurecloud.sdk.v2.model.BenefitAssessmentJob;
import com.mypurecloud.sdk.v2.model.ComparisonPeriod;
import com.mypurecloud.sdk.v2.model.ComparisonPeriodListing;
import com.mypurecloud.sdk.v2.model.ContactCenterSettings;
import com.mypurecloud.sdk.v2.model.CreateBenefitAssessmentJobRequest;
import com.mypurecloud.sdk.v2.model.CreateBenefitAssessmentRequest;
import com.mypurecloud.sdk.v2.model.CreatePredictorRequest;
import com.mypurecloud.sdk.v2.model.CreateQueueRequest;
import com.mypurecloud.sdk.v2.model.CreateUtilizationLabelRequest;
import com.mypurecloud.sdk.v2.model.CreateUtilizationTagRequest;
import com.mypurecloud.sdk.v2.model.EmailOutboundDomainResult;
import com.mypurecloud.sdk.v2.model.EmailSetup;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EstimatedWaitTimePredictions;
import com.mypurecloud.sdk.v2.model.IdentityResolutionConfig;
import com.mypurecloud.sdk.v2.model.IdentityResolutionQueueConfig;
import com.mypurecloud.sdk.v2.model.InboundDomain;
import com.mypurecloud.sdk.v2.model.InboundDomainEntityListing;
import com.mypurecloud.sdk.v2.model.InboundDomainPatchRequest;
import com.mypurecloud.sdk.v2.model.InboundRoute;
import com.mypurecloud.sdk.v2.model.InboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.KeyPerformanceIndicator;
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.LanguageEntityListing;
import com.mypurecloud.sdk.v2.model.OutboundDomain;
import com.mypurecloud.sdk.v2.model.OutboundDomainEntityListing;
import com.mypurecloud.sdk.v2.model.PatchPredictorRequest;
import com.mypurecloud.sdk.v2.model.Predictor;
import com.mypurecloud.sdk.v2.model.PredictorListing;
import com.mypurecloud.sdk.v2.model.PredictorModelFeatureListing;
import com.mypurecloud.sdk.v2.model.PredictorModels;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.QueueEntityListing;
import com.mypurecloud.sdk.v2.model.QueueMember;
import com.mypurecloud.sdk.v2.model.QueueMemberEntityListing;
import com.mypurecloud.sdk.v2.model.QueueMemberEntityListingV1;
import com.mypurecloud.sdk.v2.model.QueueObservationQuery;
import com.mypurecloud.sdk.v2.model.QueueObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.QueueRequest;
import com.mypurecloud.sdk.v2.model.Recipient;
import com.mypurecloud.sdk.v2.model.RecipientListing;
import com.mypurecloud.sdk.v2.model.RecipientRequest;
import com.mypurecloud.sdk.v2.model.RoutingActivityQuery;
import com.mypurecloud.sdk.v2.model.RoutingActivityResponse;
import com.mypurecloud.sdk.v2.model.RoutingConversationAttributesRequest;
import com.mypurecloud.sdk.v2.model.RoutingConversationAttributesResponse;
import com.mypurecloud.sdk.v2.model.RoutingSettings;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import com.mypurecloud.sdk.v2.model.SMSAvailablePhoneNumberEntityListing;
import com.mypurecloud.sdk.v2.model.SkillEntityListing;
import com.mypurecloud.sdk.v2.model.SkillGroup;
import com.mypurecloud.sdk.v2.model.SkillGroupEntityListing;
import com.mypurecloud.sdk.v2.model.SkillGroupMemberDivisionList;
import com.mypurecloud.sdk.v2.model.SkillGroupMemberDivisions;
import com.mypurecloud.sdk.v2.model.SkillGroupMemberEntityListing;
import com.mypurecloud.sdk.v2.model.SkillGroupWithMemberDivisions;
import com.mypurecloud.sdk.v2.model.SmsAddress;
import com.mypurecloud.sdk.v2.model.SmsAddressEntityListing;
import com.mypurecloud.sdk.v2.model.SmsAddressProvision;
import com.mypurecloud.sdk.v2.model.SmsAlphanumericProvision;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumber;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberEntityListing;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberImport;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberPatchRequest;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberProvision;
import com.mypurecloud.sdk.v2.model.TestMessage;
import com.mypurecloud.sdk.v2.model.TranscriptionSettings;
import com.mypurecloud.sdk.v2.model.UpdateUtilizationLabelRequest;
import com.mypurecloud.sdk.v2.model.UserLanguageEntityListing;
import com.mypurecloud.sdk.v2.model.UserQueue;
import com.mypurecloud.sdk.v2.model.UserQueueEntityListing;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguagePost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.UserSkillGroupEntityListing;
import com.mypurecloud.sdk.v2.model.UtilizationLabel;
import com.mypurecloud.sdk.v2.model.UtilizationLabelEntityListing;
import com.mypurecloud.sdk.v2.model.UtilizationRequest;
import com.mypurecloud.sdk.v2.model.UtilizationResponse;
import com.mypurecloud.sdk.v2.model.UtilizationTag;
import com.mypurecloud.sdk.v2.model.UtilizationTagEntityListing;
import com.mypurecloud.sdk.v2.model.WrapUpCodeReference;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.WrapupCodeEntityListing;
import com.mypurecloud.sdk.v2.model.WrapupCodeRequest;
import com.mypurecloud.sdk.v2.model.WritableEntity;

public class GetRoutingEmailDomainRoutesRequest {

	private String domainName;
	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public GetRoutingEmailDomainRoutesRequest withDomainName(String domainName) {
	    this.setDomainName(domainName);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetRoutingEmailDomainRoutesRequest withPageSize(Integer pageSize) {
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

	public GetRoutingEmailDomainRoutesRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 

	private String pattern;
	public String getPattern() {
		return this.pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public GetRoutingEmailDomainRoutesRequest withPattern(String pattern) {
	    this.setPattern(pattern);
	    return this;
	} 

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetRoutingEmailDomainRoutesRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		IDENTITYRESOLUTION("identityresolution");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
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

    public GetRoutingEmailDomainRoutesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'domainName' is set
        if (this.domainName == null) {
            throw new IllegalStateException("Missing the required parameter 'domainName' when building request for GetRoutingEmailDomainRoutesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/routing/email/domains/{domainName}/routes")
                .withPathParameter("domainName", domainName)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("pattern", "", pattern)
        

                .withQueryParameters("expand", "multi", expand)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String domainName) {
	    return new Builder()
	            .withRequiredParams(domainName);
	}


	public static class Builder {
		private final GetRoutingEmailDomainRoutesRequest request;

		private Builder() {
			request = new GetRoutingEmailDomainRoutesRequest();
		}


		public Builder withDomainName(String domainName) {
			request.setDomainName(domainName);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}

		public Builder withPattern(String pattern) {
			request.setPattern(pattern);
			return this;
		}

		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}



		public Builder withExpandEnumValues(List<expandValues> expand) {
		    List<String> stringList = new ArrayList<>();
	      for (expandValues e : expand) {
	        stringList.add(e.toString());
	      }
	      request.setExpand(stringList);
		    return this;
		}



		public Builder withRequiredParams(String domainName) {
			request.setDomainName(domainName);

			return this;
		}


		public GetRoutingEmailDomainRoutesRequest build() {
            
            // verify the required parameter 'domainName' is set
            if (request.domainName == null) {
                throw new IllegalStateException("Missing the required parameter 'domainName' when building request for GetRoutingEmailDomainRoutesRequest.");
            }
            
			return request;
		}
	}
}
