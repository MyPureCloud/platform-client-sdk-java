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
import com.mypurecloud.sdk.v2.model.BenefitAssessment;
import com.mypurecloud.sdk.v2.model.AssessmentListing;
import com.mypurecloud.sdk.v2.model.BenefitAssessmentJob;
import com.mypurecloud.sdk.v2.model.AssessmentJobListing;
import com.mypurecloud.sdk.v2.model.InboundDomain;
import com.mypurecloud.sdk.v2.model.InboundRoute;
import com.mypurecloud.sdk.v2.model.InboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.InboundDomainEntityListing;
import com.mypurecloud.sdk.v2.model.EmailSetup;
import com.mypurecloud.sdk.v2.model.LanguageEntityListing;
import com.mypurecloud.sdk.v2.model.Recipient;
import com.mypurecloud.sdk.v2.model.RecipientListing;
import com.mypurecloud.sdk.v2.model.Predictor;
import com.mypurecloud.sdk.v2.model.PredictorListing;
import com.mypurecloud.sdk.v2.model.KeyPerformanceIndicator;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.ComparisonPeriod;
import com.mypurecloud.sdk.v2.model.ComparisonPeriodListing;
import com.mypurecloud.sdk.v2.model.EstimatedWaitTimePredictions;
import com.mypurecloud.sdk.v2.model.QueueMemberEntityListing;
import com.mypurecloud.sdk.v2.model.WrapupCodeEntityListing;
import com.mypurecloud.sdk.v2.model.QueueEntityListing;
import com.mypurecloud.sdk.v2.model.UserQueueEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingSettings;
import com.mypurecloud.sdk.v2.model.ContactCenterSettings;
import com.mypurecloud.sdk.v2.model.TranscriptionSettings;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import com.mypurecloud.sdk.v2.model.SkillEntityListing;
import com.mypurecloud.sdk.v2.model.SmsAddress;
import com.mypurecloud.sdk.v2.model.SmsAddressEntityListing;
import com.mypurecloud.sdk.v2.model.SMSAvailablePhoneNumberEntityListing;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumber;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberEntityListing;
import com.mypurecloud.sdk.v2.model.AgentMaxUtilization;
import com.mypurecloud.sdk.v2.model.Utilization;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.UserLanguageEntityListing;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingConversationAttributesRequest;
import com.mypurecloud.sdk.v2.model.RoutingConversationAttributesResponse;
import com.mypurecloud.sdk.v2.model.InboundDomainPatchRequest;
import com.mypurecloud.sdk.v2.model.PatchPredictorRequest;
import com.mypurecloud.sdk.v2.model.QueueMember;
import com.mypurecloud.sdk.v2.model.UserQueue;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguagePost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.QueueObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.QueueObservationQuery;
import com.mypurecloud.sdk.v2.model.CreateBenefitAssessmentRequest;
import com.mypurecloud.sdk.v2.model.CreateBenefitAssessmentJobRequest;
import com.mypurecloud.sdk.v2.model.TestMessage;
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.CreatePredictorRequest;
import com.mypurecloud.sdk.v2.model.WritableEntity;
import com.mypurecloud.sdk.v2.model.WrapUpCodeReference;
import com.mypurecloud.sdk.v2.model.CreateQueueRequest;
import com.mypurecloud.sdk.v2.model.SmsAddressProvision;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberProvision;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.QueueRequest;

public class GetRoutingSmsAvailablephonenumbersRequest {
    
	private String countryCode;
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public GetRoutingSmsAvailablephonenumbersRequest withCountryCode(String countryCode) {
	    this.setCountryCode(countryCode);
	    return this;
	} 
	
	private String phoneNumberType;
	public String getPhoneNumberType() {
		return this.phoneNumberType;
	}

	public void setPhoneNumberType(String phoneNumberType) {
		this.phoneNumberType = phoneNumberType;
	}

	public GetRoutingSmsAvailablephonenumbersRequest withPhoneNumberType(String phoneNumberType) {
	    this.setPhoneNumberType(phoneNumberType);
	    return this;
	} 

	public enum phoneNumberTypeValues { 
		LOCAL("local"), 
		MOBILE("mobile"), 
		TOLLFREE("tollfree");

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
	
	private String region;
	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public GetRoutingSmsAvailablephonenumbersRequest withRegion(String region) {
	    this.setRegion(region);
	    return this;
	} 
	
	private String city;
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public GetRoutingSmsAvailablephonenumbersRequest withCity(String city) {
	    this.setCity(city);
	    return this;
	} 
	
	private String areaCode;
	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public GetRoutingSmsAvailablephonenumbersRequest withAreaCode(String areaCode) {
	    this.setAreaCode(areaCode);
	    return this;
	} 
	
	private String pattern;
	public String getPattern() {
		return this.pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public GetRoutingSmsAvailablephonenumbersRequest withPattern(String pattern) {
	    this.setPattern(pattern);
	    return this;
	} 
	
	private String addressRequirement;
	public String getAddressRequirement() {
		return this.addressRequirement;
	}

	public void setAddressRequirement(String addressRequirement) {
		this.addressRequirement = addressRequirement;
	}

	public GetRoutingSmsAvailablephonenumbersRequest withAddressRequirement(String addressRequirement) {
	    this.setAddressRequirement(addressRequirement);
	    return this;
	} 

	public enum addressRequirementValues { 
		NONE("none"), 
		ANY("any"), 
		LOCAL("local"), 
		FOREIGN("foreign");

		private String value;

		addressRequirementValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static addressRequirementValues fromString(String key) {
			if (key == null) return null;

			for (addressRequirementValues value : addressRequirementValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return addressRequirementValues.values()[0];
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

    public GetRoutingSmsAvailablephonenumbersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'countryCode' is set
        if (this.countryCode == null) {
            throw new IllegalStateException("Missing the required parameter 'countryCode' when building request for GetRoutingSmsAvailablephonenumbersRequest.");
        }
        
        // verify the required parameter 'phoneNumberType' is set
        if (this.phoneNumberType == null) {
            throw new IllegalStateException("Missing the required parameter 'phoneNumberType' when building request for GetRoutingSmsAvailablephonenumbersRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/routing/sms/availablephonenumbers")
                .withQueryParameters("countryCode", "", countryCode)
        
                .withQueryParameters("region", "", region)
        
                .withQueryParameters("city", "", city)
        
                .withQueryParameters("areaCode", "", areaCode)
        
                .withQueryParameters("phoneNumberType", "", phoneNumberType)
        
                .withQueryParameters("pattern", "", pattern)
        
                .withQueryParameters("addressRequirement", "", addressRequirement)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String countryCode, String phoneNumberType) {
	    return new Builder()
	            .withRequiredParams(countryCode, phoneNumberType);
	}
	

	public static class Builder {
		private final GetRoutingSmsAvailablephonenumbersRequest request;

		private Builder() {
			request = new GetRoutingSmsAvailablephonenumbersRequest();
		}

		
		public Builder withCountryCode(String countryCode) {
			request.setCountryCode(countryCode);
			return this;
		}
		
		public Builder withPhoneNumberType(String phoneNumberType) {
			request.setPhoneNumberType(phoneNumberType);
			return this;
		}

		public Builder withPhoneNumberType(phoneNumberTypeValues phoneNumberType) {
		    request.setPhoneNumberType(phoneNumberType.toString());
		    return this;
		}
		
		public Builder withRegion(String region) {
			request.setRegion(region);
			return this;
		}
		
		public Builder withCity(String city) {
			request.setCity(city);
			return this;
		}
		
		public Builder withAreaCode(String areaCode) {
			request.setAreaCode(areaCode);
			return this;
		}
		
		public Builder withPattern(String pattern) {
			request.setPattern(pattern);
			return this;
		}
		
		public Builder withAddressRequirement(String addressRequirement) {
			request.setAddressRequirement(addressRequirement);
			return this;
		}

		public Builder withAddressRequirement(addressRequirementValues addressRequirement) {
		    request.setAddressRequirement(addressRequirement.toString());
		    return this;
		}
		

		
		public Builder withRequiredParams(String countryCode, String phoneNumberType) {
			request.setCountryCode(countryCode);
						request.setPhoneNumberType(phoneNumberType);
			
			return this;
		}
		

		public GetRoutingSmsAvailablephonenumbersRequest build() {
            
            // verify the required parameter 'countryCode' is set
            if (request.countryCode == null) {
                throw new IllegalStateException("Missing the required parameter 'countryCode' when building request for GetRoutingSmsAvailablephonenumbersRequest.");
            }
            
            // verify the required parameter 'phoneNumberType' is set
            if (request.phoneNumberType == null) {
                throw new IllegalStateException("Missing the required parameter 'phoneNumberType' when building request for GetRoutingSmsAvailablephonenumbersRequest.");
            }
            
			return request;
		}
	}
}
