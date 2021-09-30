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
import com.mypurecloud.sdk.v2.model.LearningAssignment;
import com.mypurecloud.sdk.v2.model.LearningAssignmentsDomainEntity;
import com.mypurecloud.sdk.v2.model.LearningModule;
import com.mypurecloud.sdk.v2.model.LearningModuleRule;
import com.mypurecloud.sdk.v2.model.LearningModulesDomainEntityListing;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUpdate;
import com.mypurecloud.sdk.v2.model.AssessmentScoringSet;
import com.mypurecloud.sdk.v2.model.LearningAssessmentScoringRequest;
import com.mypurecloud.sdk.v2.model.LearningAssignmentCreate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateParam;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkAddResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentItem;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkRemoveResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePublishResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleRequest;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserListing;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserQuery;

public class GetLearningAssignmentsMeRequest {
    
	private String moduleId;
	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public GetLearningAssignmentsMeRequest withModuleId(String moduleId) {
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

	public GetLearningAssignmentsMeRequest withInterval(String interval) {
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

	public GetLearningAssignmentsMeRequest withCompletionInterval(String completionInterval) {
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

	public GetLearningAssignmentsMeRequest withOverdue(String overdue) {
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

	public GetLearningAssignmentsMeRequest withPageSize(Integer pageSize) {
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

	public GetLearningAssignmentsMeRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private String pass;
	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public GetLearningAssignmentsMeRequest withPass(String pass) {
	    this.setPass(pass);
	    return this;
	} 

	public enum passValues { 
		TRUE("True"), 
		FALSE("False"), 
		ANY("Any");

		private String value;

		passValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static passValues fromString(String key) {
			if (key == null) return null;

			for (passValues value : passValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return passValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private Float minPercentageScore;
	public Float getMinPercentageScore() {
		return this.minPercentageScore;
	}

	public void setMinPercentageScore(Float minPercentageScore) {
		this.minPercentageScore = minPercentageScore;
	}

	public GetLearningAssignmentsMeRequest withMinPercentageScore(Float minPercentageScore) {
	    this.setMinPercentageScore(minPercentageScore);
	    return this;
	} 
	
	private Float maxPercentageScore;
	public Float getMaxPercentageScore() {
		return this.maxPercentageScore;
	}

	public void setMaxPercentageScore(Float maxPercentageScore) {
		this.maxPercentageScore = maxPercentageScore;
	}

	public GetLearningAssignmentsMeRequest withMaxPercentageScore(Float maxPercentageScore) {
	    this.setMaxPercentageScore(maxPercentageScore);
	    return this;
	} 
	
	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetLearningAssignmentsMeRequest withSortOrder(String sortOrder) {
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
	
	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetLearningAssignmentsMeRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	public enum sortByValues { 
		RECOMMENDEDCOMPLETIONDATE("RecommendedCompletionDate"), 
		DATEMODIFIED("DateModified");

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
	
	private List<String> types;
	public List<String> getTypes() {
		return this.types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public GetLearningAssignmentsMeRequest withTypes(List<String> types) {
	    this.setTypes(types);
	    return this;
	} 

	public enum typesValues { 
		INFORMATIONAL("Informational"), 
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
	
	private List<String> states;
	public List<String> getStates() {
		return this.states;
	}

	public void setStates(List<String> states) {
		this.states = states;
	}

	public GetLearningAssignmentsMeRequest withStates(List<String> states) {
	    this.setStates(states);
	    return this;
	} 

	public enum statesValues { 
		ASSIGNED("Assigned"), 
		INPROGRESS("InProgress"), 
		COMPLETED("Completed");

		private String value;

		statesValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static statesValues fromString(String key) {
			if (key == null) return null;

			for (statesValues value : statesValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return statesValues.values()[0];
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

	public GetLearningAssignmentsMeRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		MODULESUMMARY("ModuleSummary");

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

    public GetLearningAssignmentsMeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/learning/assignments/me")
                .withQueryParameters("moduleId", "", moduleId)
        
                .withQueryParameters("interval", "", interval)
        
                .withQueryParameters("completionInterval", "", completionInterval)
        
                .withQueryParameters("overdue", "", overdue)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pass", "", pass)
        
                .withQueryParameters("minPercentageScore", "", minPercentageScore)
        
                .withQueryParameters("maxPercentageScore", "", maxPercentageScore)
        
                .withQueryParameters("sortOrder", "", sortOrder)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("types", "multi", types)
        
                .withQueryParameters("states", "multi", states)
        
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
		private final GetLearningAssignmentsMeRequest request;

		private Builder() {
			request = new GetLearningAssignmentsMeRequest();
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
		
		public Builder withPass(String pass) {
			request.setPass(pass);
			return this;
		}

		public Builder withPass(passValues pass) {
		    request.setPass(pass.toString());
		    return this;
		}
		
		public Builder withMinPercentageScore(Float minPercentageScore) {
			request.setMinPercentageScore(minPercentageScore);
			return this;
		}
		
		public Builder withMaxPercentageScore(Float maxPercentageScore) {
			request.setMaxPercentageScore(maxPercentageScore);
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
		
		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}

		public Builder withSortBy(sortByValues sortBy) {
		    request.setSortBy(sortBy.toString());
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
		
		public Builder withStates(List<String> states) {
			request.setStates(states);
			return this;
		}

		public Builder withStatesEnumValues(List<statesValues> states) {
		    List<String> stringList = new ArrayList<>();
	      for (statesValues e : states) {
	        stringList.add(e.toString());
	      }
	      request.setStates(stringList);
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
		

		

		public GetLearningAssignmentsMeRequest build() {
            
			return request;
		}
	}
}
