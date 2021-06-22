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
import com.mypurecloud.sdk.v2.model.CoachingAppointmentReference;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentResponse;
import com.mypurecloud.sdk.v2.model.CoachingAnnotation;
import com.mypurecloud.sdk.v2.model.CoachingAnnotationList;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentStatusResponseList;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentResponseList;
import com.mypurecloud.sdk.v2.model.CoachingNotification;
import com.mypurecloud.sdk.v2.model.CoachingNotificationList;
import com.mypurecloud.sdk.v2.model.UpdateCoachingAppointmentRequest;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentStatusRequest;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentStatusResponse;
import com.mypurecloud.sdk.v2.model.CoachingAnnotationCreateRequest;
import com.mypurecloud.sdk.v2.model.AddConversationResponse;
import com.mypurecloud.sdk.v2.model.AddConversationRequest;
import com.mypurecloud.sdk.v2.model.CreateCoachingAppointmentRequest;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentAggregateRequest;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentAggregateResponse;
import com.mypurecloud.sdk.v2.model.CoachingSlotsRequest;
import com.mypurecloud.sdk.v2.model.CoachingSlotsResponse;

public class GetCoachingAppointmentsMeRequest {
    
	private String interval;
	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public GetCoachingAppointmentsMeRequest withInterval(String interval) {
	    this.setInterval(interval);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetCoachingAppointmentsMeRequest withPageNumber(Integer pageNumber) {
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

	public GetCoachingAppointmentsMeRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private List<String> statuses;
	public List<String> getStatuses() {
		return this.statuses;
	}

	public void setStatuses(List<String> statuses) {
		this.statuses = statuses;
	}

	public GetCoachingAppointmentsMeRequest withStatuses(List<String> statuses) {
	    this.setStatuses(statuses);
	    return this;
	} 

	public enum statusesValues { 
		SCHEDULED("Scheduled"), 
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
	
	private List<String> facilitatorIds;
	public List<String> getFacilitatorIds() {
		return this.facilitatorIds;
	}

	public void setFacilitatorIds(List<String> facilitatorIds) {
		this.facilitatorIds = facilitatorIds;
	}

	public GetCoachingAppointmentsMeRequest withFacilitatorIds(List<String> facilitatorIds) {
	    this.setFacilitatorIds(facilitatorIds);
	    return this;
	} 
	
	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetCoachingAppointmentsMeRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 

	public enum sortOrderValues { 
		DESC("Desc"), 
		ASC("Asc");

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
	
	private List<String> relationships;
	public List<String> getRelationships() {
		return this.relationships;
	}

	public void setRelationships(List<String> relationships) {
		this.relationships = relationships;
	}

	public GetCoachingAppointmentsMeRequest withRelationships(List<String> relationships) {
	    this.setRelationships(relationships);
	    return this;
	} 

	public enum relationshipsValues { 
		CREATOR("Creator"), 
		FACILITATOR("Facilitator"), 
		ATTENDEE("Attendee");

		private String value;

		relationshipsValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static relationshipsValues fromString(String key) {
			if (key == null) return null;

			for (relationshipsValues value : relationshipsValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return relationshipsValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String completionInterval;
	public String getCompletionInterval() {
		return this.completionInterval;
	}

	public void setCompletionInterval(String completionInterval) {
		this.completionInterval = completionInterval;
	}

	public GetCoachingAppointmentsMeRequest withCompletionInterval(String completionInterval) {
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

	public GetCoachingAppointmentsMeRequest withOverdue(String overdue) {
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

    public GetCoachingAppointmentsMeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/coaching/appointments/me")
                .withQueryParameters("interval", "", interval)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("statuses", "multi", statuses)
        
                .withQueryParameters("facilitatorIds", "multi", facilitatorIds)
        
                .withQueryParameters("sortOrder", "", sortOrder)
        
                .withQueryParameters("relationships", "multi", relationships)
        
                .withQueryParameters("completionInterval", "", completionInterval)
        
                .withQueryParameters("overdue", "", overdue)
        
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
		private final GetCoachingAppointmentsMeRequest request;

		private Builder() {
			request = new GetCoachingAppointmentsMeRequest();
		}

		
		public Builder withInterval(String interval) {
			request.setInterval(interval);
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
		
		public Builder withFacilitatorIds(List<String> facilitatorIds) {
			request.setFacilitatorIds(facilitatorIds);
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
		
		public Builder withRelationships(List<String> relationships) {
			request.setRelationships(relationships);
			return this;
		}

		public Builder withRelationshipsEnumValues(List<relationshipsValues> relationships) {
		    List<String> stringList = new ArrayList<>();
	      for (relationshipsValues e : relationships) {
	        stringList.add(e.toString());
	      }
	      request.setRelationships(stringList);
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
		

		

		public GetCoachingAppointmentsMeRequest build() {
            
			return request;
		}
	}
}
