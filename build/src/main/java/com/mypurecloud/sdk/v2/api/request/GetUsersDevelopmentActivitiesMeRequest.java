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
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.DataAvailabilityResponse;
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.DivsPermittedEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzSubject;
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.UserProfileEntityListing;
import com.mypurecloud.sdk.v2.model.AgentMaxUtilization;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.Adjacents;
import com.mypurecloud.sdk.v2.model.CallForwarding;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.Geolocation;
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import com.mypurecloud.sdk.v2.model.UserProfile;
import com.mypurecloud.sdk.v2.model.UserQueueEntityListing;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.UserLanguageEntityListing;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import com.mypurecloud.sdk.v2.model.UserState;
import com.mypurecloud.sdk.v2.model.UserStations;
import com.mypurecloud.sdk.v2.model.TrustorEntityListing;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityListing;
import com.mypurecloud.sdk.v2.model.DevelopmentActivity;
import com.mypurecloud.sdk.v2.model.UserMe;
import com.mypurecloud.sdk.v2.model.UsersSearchResponse;
import com.mypurecloud.sdk.v2.model.UpdateUser;
import com.mypurecloud.sdk.v2.model.UserQueue;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguagePost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.PatchUser;
import com.mypurecloud.sdk.v2.model.UserAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.UserAggregationQuery;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncUserDetailsQuery;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.UserObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.UserObservationQuery;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;
import com.mypurecloud.sdk.v2.model.ChangePasswordRequest;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.CreateUser;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityAggregateResponse;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityAggregateParam;
import com.mypurecloud.sdk.v2.model.ChangeMyPasswordRequest;
import com.mypurecloud.sdk.v2.model.UserSearchRequest;
import com.mypurecloud.sdk.v2.model.Utilization;

public class GetUsersDevelopmentActivitiesMeRequest {
    
	private String moduleId;
	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public GetUsersDevelopmentActivitiesMeRequest withModuleId(String moduleId) {
	    this.setModuleId(moduleId);
	    return this;
	} 
	
	private String interval;
	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public GetUsersDevelopmentActivitiesMeRequest withInterval(String interval) {
	    this.setInterval(interval);
	    return this;
	} 
	
	private String completionInterval;
	public String getCompletionInterval() {
		return this.completionInterval;
	}

	public void setCompletionInterval(String completionInterval) {
		this.completionInterval = completionInterval;
	}

	public GetUsersDevelopmentActivitiesMeRequest withCompletionInterval(String completionInterval) {
	    this.setCompletionInterval(completionInterval);
	    return this;
	} 
	
	private String overdue;
	public String getOverdue() {
		return this.overdue;
	}

	public void setOverdue(String overdue) {
		this.overdue = overdue;
	}

	public GetUsersDevelopmentActivitiesMeRequest withOverdue(String overdue) {
	    this.setOverdue(overdue);
	    return this;
	} 

	public enum overdueValues { 
		TRUE("True"), 
		FALSE("False"), 
		ANY("Any");

		private String value;

		overdueValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static overdueValues fromString(String key) {
			if (key == null) return null;

			for (overdueValues value : overdueValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return overdueValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetUsersDevelopmentActivitiesMeRequest withPageSize(Integer pageSize) {
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

	public GetUsersDevelopmentActivitiesMeRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetUsersDevelopmentActivitiesMeRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 

	public enum sortOrderValues { 
		ASC("Asc"), 
		DESC("Desc");

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
	
	private List<String> types;
	public List<String> getTypes() {
		return this.types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public GetUsersDevelopmentActivitiesMeRequest withTypes(List<String> types) {
	    this.setTypes(types);
	    return this;
	} 

	public enum typesValues { 
		INFORMATIONAL("Informational"), 
		COACHING("Coaching"), 
		ASSESSEDCONTENT("AssessedContent"), 
		ASSESSMENT("Assessment");

		private String value;

		typesValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static typesValues fromString(String key) {
			if (key == null) return null;

			for (typesValues value : typesValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return typesValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private List<String> statuses;
	public List<String> getStatuses() {
		return this.statuses;
	}

	public void setStatuses(List<String> statuses) {
		this.statuses = statuses;
	}

	public GetUsersDevelopmentActivitiesMeRequest withStatuses(List<String> statuses) {
	    this.setStatuses(statuses);
	    return this;
	} 

	public enum statusesValues { 
		PLANNED("Planned"), 
		INPROGRESS("InProgress"), 
		COMPLETED("Completed"), 
		INVALIDSCHEDULE("InvalidSchedule");

		private String value;

		statusesValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static statusesValues fromString(String key) {
			if (key == null) return null;

			for (statusesValues value : statusesValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return statusesValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private List<String> relationship;
	public List<String> getRelationship() {
		return this.relationship;
	}

	public void setRelationship(List<String> relationship) {
		this.relationship = relationship;
	}

	public GetUsersDevelopmentActivitiesMeRequest withRelationship(List<String> relationship) {
	    this.setRelationship(relationship);
	    return this;
	} 

	public enum relationshipValues { 
		CREATOR("Creator"), 
		FACILITATOR("Facilitator"), 
		ATTENDEE("Attendee");

		private String value;

		relationshipValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static relationshipValues fromString(String key) {
			if (key == null) return null;

			for (relationshipValues value : relationshipValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return relationshipValues.values()[0];
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

    public GetUsersDevelopmentActivitiesMeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/users/development/activities/me")
                .withQueryParameters("moduleId", "", moduleId)
        
                .withQueryParameters("interval", "", interval)
        
                .withQueryParameters("completionInterval", "", completionInterval)
        
                .withQueryParameters("overdue", "", overdue)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("sortOrder", "", sortOrder)
        
                .withQueryParameters("types", "multi", types)
        
                .withQueryParameters("statuses", "multi", statuses)
        
                .withQueryParameters("relationship", "multi", relationship)
        
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
		private final GetUsersDevelopmentActivitiesMeRequest request;

		private Builder() {
			request = new GetUsersDevelopmentActivitiesMeRequest();
		}

		
		public Builder withModuleId(String moduleId) {
			request.setModuleId(moduleId);
			return this;
		}
		
		public Builder withInterval(String interval) {
			request.setInterval(interval);
			return this;
		}
		
		public Builder withCompletionInterval(String completionInterval) {
			request.setCompletionInterval(completionInterval);
			return this;
		}
		
		public Builder withOverdue(String overdue) {
			request.setOverdue(overdue);
			return this;
		}

		public Builder withOverdue(overdueValues overdue) {
		    request.setOverdue(overdue.toString());
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
		
		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}

		public Builder withSortOrder(sortOrderValues sortOrder) {
		    request.setSortOrder(sortOrder.toString());
		    return this;
		}
		
		public Builder withTypes(List<String> types) {
			request.setTypes(types);
			return this;
		}

		public Builder withTypesEnumValues(List<typesValues> types) {
		    List<String> stringList = new ArrayList<>();
	      for (typesValues e : types) {
	        stringList.add(e.toString());
	      }
	      request.setTypes(stringList);
		    return this;
		}
		
		public Builder withStatuses(List<String> statuses) {
			request.setStatuses(statuses);
			return this;
		}

		public Builder withStatusesEnumValues(List<statusesValues> statuses) {
		    List<String> stringList = new ArrayList<>();
	      for (statusesValues e : statuses) {
	        stringList.add(e.toString());
	      }
	      request.setStatuses(stringList);
		    return this;
		}
		
		public Builder withRelationship(List<String> relationship) {
			request.setRelationship(relationship);
			return this;
		}

		public Builder withRelationshipEnumValues(List<relationshipValues> relationship) {
		    List<String> stringList = new ArrayList<>();
	      for (relationshipValues e : relationship) {
	        stringList.add(e.toString());
	      }
	      request.setRelationship(stringList);
		    return this;
		}
		

		

		public GetUsersDevelopmentActivitiesMeRequest build() {
            
			return request;
		}
	}
}
