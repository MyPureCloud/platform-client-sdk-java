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

public class GetRoutingSmsPhonenumbersRequest {

	private String phoneNumber;
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public GetRoutingSmsPhonenumbersRequest withPhoneNumber(String phoneNumber) {
	    this.setPhoneNumber(phoneNumber);
	    return this;
	} 

	private List<String> phoneNumberType;
	public List<String> getPhoneNumberType() {
		return this.phoneNumberType;
	}

	public void setPhoneNumberType(List<String> phoneNumberType) {
		this.phoneNumberType = phoneNumberType;
	}

	public GetRoutingSmsPhonenumbersRequest withPhoneNumberType(List<String> phoneNumberType) {
	    this.setPhoneNumberType(phoneNumberType);
	    return this;
	} 

	public enum phoneNumberTypeValues { 
		LOCAL("local"),
		MOBILE("mobile"),
		TOLLFREE("tollfree"),
		SHORTCODE("shortcode"),
		ALPHANUMERIC("alphanumeric");

		private String value;

		phoneNumberTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static phoneNumberTypeValues fromString(String key) {
			if (key == null) return null;

			for (phoneNumberTypeValues value : phoneNumberTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return phoneNumberTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private List<String> phoneNumberStatus;
	public List<String> getPhoneNumberStatus() {
		return this.phoneNumberStatus;
	}

	public void setPhoneNumberStatus(List<String> phoneNumberStatus) {
		this.phoneNumberStatus = phoneNumberStatus;
	}

	public GetRoutingSmsPhonenumbersRequest withPhoneNumberStatus(List<String> phoneNumberStatus) {
	    this.setPhoneNumberStatus(phoneNumberStatus);
	    return this;
	} 

	public enum phoneNumberStatusValues { 
		ACTIVE("active"),
		INVALID("invalid"),
		INITIATED("initiated"),
		PORTING("porting"),
		PENDING("pending"),
		PENDING_CANCELLATION("pending-cancellation");

		private String value;

		phoneNumberStatusValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static phoneNumberStatusValues fromString(String key) {
			if (key == null) return null;

			for (phoneNumberStatusValues value : phoneNumberStatusValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return phoneNumberStatusValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private List<String> countryCode;
	public List<String> getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(List<String> countryCode) {
		this.countryCode = countryCode;
	}

	public GetRoutingSmsPhonenumbersRequest withCountryCode(List<String> countryCode) {
	    this.setCountryCode(countryCode);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetRoutingSmsPhonenumbersRequest withPageSize(Integer pageSize) {
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

	public GetRoutingSmsPhonenumbersRequest withPageNumber(Integer pageNumber) {
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

	public GetRoutingSmsPhonenumbersRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	public enum sortByValues { 
		PHONENUMBER("phoneNumber"),
		COUNTRYCODE("countryCode"),
		COUNTRY("country"),
		DATECREATED("dateCreated"),
		DATEMODIFIED("dateModified"),
		PHONENUMBERSTATUS("phoneNumberStatus"),
		PHONENUMBERTYPE("phoneNumberType"),
		PURCHASEDATE("purchaseDate"),
		SUPPORTSMMS("supportsMms"),
		SUPPORTSSMS("supportsSms"),
		SUPPORTSVOICE("supportsVoice");

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

	public GetRoutingSmsPhonenumbersRequest withSortOrder(String sortOrder) {
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

	private String language;
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public GetRoutingSmsPhonenumbersRequest withLanguage(String language) {
	    this.setLanguage(language);
	    return this;
	} 

	private String integrationId;
	public String getIntegrationId() {
		return this.integrationId;
	}

	public void setIntegrationId(String integrationId) {
		this.integrationId = integrationId;
	}

	public GetRoutingSmsPhonenumbersRequest withIntegrationId(String integrationId) {
	    this.setIntegrationId(integrationId);
	    return this;
	} 

	private String supportedContentId;
	public String getSupportedContentId() {
		return this.supportedContentId;
	}

	public void setSupportedContentId(String supportedContentId) {
		this.supportedContentId = supportedContentId;
	}

	public GetRoutingSmsPhonenumbersRequest withSupportedContentId(String supportedContentId) {
	    this.setSupportedContentId(supportedContentId);
	    return this;
	} 

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetRoutingSmsPhonenumbersRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		IDENTITYRESOLUTION("identityresolution"),
		SUPPORTEDCONTENT("supportedContent");

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

    public GetRoutingSmsPhonenumbersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/routing/sms/phonenumbers")

                .withQueryParameters("phoneNumber", "", phoneNumber)
        

                .withQueryParameters("phoneNumberType", "multi", phoneNumberType)
        

                .withQueryParameters("phoneNumberStatus", "multi", phoneNumberStatus)
        

                .withQueryParameters("countryCode", "multi", countryCode)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("sortBy", "", sortBy)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        

                .withQueryParameters("language", "", language)
        

                .withQueryParameters("integration.id", "", integrationId)
        

                .withQueryParameters("supportedContent.id", "", supportedContentId)
        

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



	public static class Builder {
		private final GetRoutingSmsPhonenumbersRequest request;

		private Builder() {
			request = new GetRoutingSmsPhonenumbersRequest();
		}


		public Builder withPhoneNumber(String phoneNumber) {
			request.setPhoneNumber(phoneNumber);
			return this;
		}

		public Builder withPhoneNumberType(List<String> phoneNumberType) {
			request.setPhoneNumberType(phoneNumberType);
			return this;
		}



		public Builder withPhoneNumberTypeEnumValues(List<phoneNumberTypeValues> phoneNumberType) {
		    List<String> stringList = new ArrayList<>();
	      for (phoneNumberTypeValues e : phoneNumberType) {
	        stringList.add(e.toString());
	      }
	      request.setPhoneNumberType(stringList);
		    return this;
		}

		public Builder withPhoneNumberStatus(List<String> phoneNumberStatus) {
			request.setPhoneNumberStatus(phoneNumberStatus);
			return this;
		}



		public Builder withPhoneNumberStatusEnumValues(List<phoneNumberStatusValues> phoneNumberStatus) {
		    List<String> stringList = new ArrayList<>();
	      for (phoneNumberStatusValues e : phoneNumberStatus) {
	        stringList.add(e.toString());
	      }
	      request.setPhoneNumberStatus(stringList);
		    return this;
		}

		public Builder withCountryCode(List<String> countryCode) {
			request.setCountryCode(countryCode);
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

		public Builder withLanguage(String language) {
			request.setLanguage(language);
			return this;
		}

		public Builder withIntegrationId(String integrationId) {
			request.setIntegrationId(integrationId);
			return this;
		}

		public Builder withSupportedContentId(String supportedContentId) {
			request.setSupportedContentId(supportedContentId);
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




		public GetRoutingSmsPhonenumbersRequest build() {
            
			return request;
		}
	}
}
