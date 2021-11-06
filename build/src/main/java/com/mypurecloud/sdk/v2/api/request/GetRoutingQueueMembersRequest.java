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

public class GetRoutingQueueMembersRequest {
    
	private String queueId;
	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public GetRoutingQueueMembersRequest withQueueId(String queueId) {
	    this.setQueueId(queueId);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetRoutingQueueMembersRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetRoutingQueueMembersRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetRoutingQueueMembersRequest withSortOrder(String sortOrder) {
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
	
	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetRoutingQueueMembersRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		ROUTINGSTATUS("routingStatus"), 
		PRESENCE("presence"), 
		CONVERSATIONSUMMARY("conversationSummary"), 
		OUTOFOFFICE("outOfOffice"), 
		GEOLOCATION("geolocation"), 
		STATION("station"), 
		AUTHORIZATION("authorization"), 
		LASTTOKENISSUED("lasttokenissued"), 
		DATELASTLOGIN("dateLastLogin"), 
		AUTHORIZATION_UNUSEDROLES("authorization.unusedRoles"), 
		TEAM("team"), 
		PROFILESKILLS("profileSkills"), 
		CERTIFICATIONS("certifications"), 
		LOCATIONS("locations"), 
		GROUPS("groups"), 
		SKILLS("skills"), 
		LANGUAGES("languages"), 
		LANGUAGEPREFERENCE("languagePreference"), 
		EMPLOYERINFO("employerInfo"), 
		BIOGRAPHY("biography");

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
	
	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetRoutingQueueMembersRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 
	
	private List<String> profileSkills;
	public List<String> getProfileSkills() {
		return this.profileSkills;
	}

	public void setProfileSkills(List<String> profileSkills) {
		this.profileSkills = profileSkills;
	}

	public GetRoutingQueueMembersRequest withProfileSkills(List<String> profileSkills) {
	    this.setProfileSkills(profileSkills);
	    return this;
	} 
	
	private List<String> skills;
	public List<String> getSkills() {
		return this.skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public GetRoutingQueueMembersRequest withSkills(List<String> skills) {
	    this.setSkills(skills);
	    return this;
	} 
	
	private List<String> languages;
	public List<String> getLanguages() {
		return this.languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public GetRoutingQueueMembersRequest withLanguages(List<String> languages) {
	    this.setLanguages(languages);
	    return this;
	} 
	
	private List<String> routingStatus;
	public List<String> getRoutingStatus() {
		return this.routingStatus;
	}

	public void setRoutingStatus(List<String> routingStatus) {
		this.routingStatus = routingStatus;
	}

	public GetRoutingQueueMembersRequest withRoutingStatus(List<String> routingStatus) {
	    this.setRoutingStatus(routingStatus);
	    return this;
	} 
	
	private List<String> presence;
	public List<String> getPresence() {
		return this.presence;
	}

	public void setPresence(List<String> presence) {
		this.presence = presence;
	}

	public GetRoutingQueueMembersRequest withPresence(List<String> presence) {
	    this.setPresence(presence);
	    return this;
	} 
	
	private String memberBy;
	public String getMemberBy() {
		return this.memberBy;
	}

	public void setMemberBy(String memberBy) {
		this.memberBy = memberBy;
	}

	public GetRoutingQueueMembersRequest withMemberBy(String memberBy) {
	    this.setMemberBy(memberBy);
	    return this;
	} 

	public enum memberByValues { 
		USER("user"), 
		GROUP("group");

		private String value;

		memberByValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static memberByValues fromString(String key) {
			if (key == null) return null;

			for (memberByValues value : memberByValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return memberByValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private Boolean joined;
	public Boolean getJoined() {
		return this.joined;
	}

	public void setJoined(Boolean joined) {
		this.joined = joined;
	}

	public GetRoutingQueueMembersRequest withJoined(Boolean joined) {
	    this.setJoined(joined);
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

    public GetRoutingQueueMembersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'queueId' is set
        if (this.queueId == null) {
            throw new IllegalStateException("Missing the required parameter 'queueId' when building request for GetRoutingQueueMembersRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/routing/queues/{queueId}/members")
                .withPathParameter("queueId", queueId)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("sortOrder", "", sortOrder)
        
                .withQueryParameters("expand", "multi", expand)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("profileSkills", "multi", profileSkills)
        
                .withQueryParameters("skills", "multi", skills)
        
                .withQueryParameters("languages", "multi", languages)
        
                .withQueryParameters("routingStatus", "multi", routingStatus)
        
                .withQueryParameters("presence", "multi", presence)
        
                .withQueryParameters("memberBy", "", memberBy)
        
                .withQueryParameters("joined", "", joined)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String queueId) {
	    return new Builder()
	            .withRequiredParams(queueId);
	}
	

	public static class Builder {
		private final GetRoutingQueueMembersRequest request;

		private Builder() {
			request = new GetRoutingQueueMembersRequest();
		}

		
		public Builder withQueueId(String queueId) {
			request.setQueueId(queueId);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
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
		
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		
		public Builder withProfileSkills(List<String> profileSkills) {
			request.setProfileSkills(profileSkills);
			return this;
		}
		
		public Builder withSkills(List<String> skills) {
			request.setSkills(skills);
			return this;
		}
		
		public Builder withLanguages(List<String> languages) {
			request.setLanguages(languages);
			return this;
		}
		
		public Builder withRoutingStatus(List<String> routingStatus) {
			request.setRoutingStatus(routingStatus);
			return this;
		}
		
		public Builder withPresence(List<String> presence) {
			request.setPresence(presence);
			return this;
		}
		
		public Builder withMemberBy(String memberBy) {
			request.setMemberBy(memberBy);
			return this;
		}

		public Builder withMemberBy(memberByValues memberBy) {
		    request.setMemberBy(memberBy.toString());
		    return this;
		}
		
		public Builder withJoined(Boolean joined) {
			request.setJoined(joined);
			return this;
		}
		

		
		public Builder withRequiredParams(String queueId) {
			request.setQueueId(queueId);
			
			return this;
		}
		

		public GetRoutingQueueMembersRequest build() {
            
            // verify the required parameter 'queueId' is set
            if (request.queueId == null) {
                throw new IllegalStateException("Missing the required parameter 'queueId' when building request for GetRoutingQueueMembersRequest.");
            }
            
			return request;
		}
	}
}
