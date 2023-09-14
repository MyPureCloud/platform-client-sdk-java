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

import com.mypurecloud.sdk.v2.model.AssessmentScoringSet;
import com.mypurecloud.sdk.v2.model.AssignedLearningModuleDomainEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.LearningAssessmentScoringRequest;
import com.mypurecloud.sdk.v2.model.LearningAssignment;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateParam;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkAddResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkRemoveResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentCreate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentItem;
import com.mypurecloud.sdk.v2.model.LearningAssignmentReschedule;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUpdate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserListing;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserQuery;
import com.mypurecloud.sdk.v2.model.LearningAssignmentsDomainEntity;
import com.mypurecloud.sdk.v2.model.LearningModule;
import com.mypurecloud.sdk.v2.model.LearningModuleCoverArtResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleJobRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleJobResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePublishRequest;
import com.mypurecloud.sdk.v2.model.LearningModulePublishResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleRule;
import com.mypurecloud.sdk.v2.model.LearningModulesDomainEntityListing;
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsQueryRequest;
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsQueryResponse;

public class GetLearningModulesAssignmentsRequest {

	private List<String> userIds;
	public List<String> getUserIds() {
		return this.userIds;
	}

	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

	public GetLearningModulesAssignmentsRequest withUserIds(List<String> userIds) {
	    this.setUserIds(userIds);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetLearningModulesAssignmentsRequest withPageSize(Integer pageSize) {
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

	public GetLearningModulesAssignmentsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 

	private String searchTerm;
	public String getSearchTerm() {
		return this.searchTerm;
	}

	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

	public GetLearningModulesAssignmentsRequest withSearchTerm(String searchTerm) {
	    this.setSearchTerm(searchTerm);
	    return this;
	} 

	private String overdue;
	public String getOverdue() {
		return this.overdue;
	}

	public void setOverdue(String overdue) {
		this.overdue = overdue;
	}

	public GetLearningModulesAssignmentsRequest withOverdue(String overdue) {
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

	private List<String> assignmentStates;
	public List<String> getAssignmentStates() {
		return this.assignmentStates;
	}

	public void setAssignmentStates(List<String> assignmentStates) {
		this.assignmentStates = assignmentStates;
	}

	public GetLearningModulesAssignmentsRequest withAssignmentStates(List<String> assignmentStates) {
	    this.setAssignmentStates(assignmentStates);
	    return this;
	} 

	public enum assignmentStatesValues { 
		NOTASSIGNED("NotAssigned"),
		ASSIGNED("Assigned"),
		INPROGRESS("InProgress"),
		COMPLETED("Completed"),
		INVALIDSCHEDULE("InvalidSchedule");

		private String value;

		assignmentStatesValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static assignmentStatesValues fromString(String key) {
			if (key == null) return null;

			for (assignmentStatesValues value : assignmentStatesValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return assignmentStatesValues.values()[0];
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

	public GetLearningModulesAssignmentsRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		COVERART("coverArt");

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

    public GetLearningModulesAssignmentsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'userIds' is set
        if (this.userIds == null) {
            throw new IllegalStateException("Missing the required parameter 'userIds' when building request for GetLearningModulesAssignmentsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/learning/modules/assignments")

                .withQueryParameters("userIds", "multi", userIds)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("searchTerm", "", searchTerm)
        

                .withQueryParameters("overdue", "", overdue)
        

                .withQueryParameters("assignmentStates", "multi", assignmentStates)
        

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


	public static Builder builder(List<String> userIds) {
	    return new Builder()
	            .withRequiredParams(userIds);
	}


	public static class Builder {
		private final GetLearningModulesAssignmentsRequest request;

		private Builder() {
			request = new GetLearningModulesAssignmentsRequest();
		}


		public Builder withUserIds(List<String> userIds) {
			request.setUserIds(userIds);
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

		public Builder withSearchTerm(String searchTerm) {
			request.setSearchTerm(searchTerm);
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

		public Builder withAssignmentStates(List<String> assignmentStates) {
			request.setAssignmentStates(assignmentStates);
			return this;
		}



		public Builder withAssignmentStatesEnumValues(List<assignmentStatesValues> assignmentStates) {
		    List<String> stringList = new ArrayList<>();
	      for (assignmentStatesValues e : assignmentStates) {
	        stringList.add(e.toString());
	      }
	      request.setAssignmentStates(stringList);
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



		public Builder withRequiredParams(List<String> userIds) {
			request.setUserIds(userIds);

			return this;
		}


		public GetLearningModulesAssignmentsRequest build() {
            
            // verify the required parameter 'userIds' is set
            if (request.userIds == null) {
                throw new IllegalStateException("Missing the required parameter 'userIds' when building request for GetLearningModulesAssignmentsRequest.");
            }
            
			return request;
		}
	}
}
