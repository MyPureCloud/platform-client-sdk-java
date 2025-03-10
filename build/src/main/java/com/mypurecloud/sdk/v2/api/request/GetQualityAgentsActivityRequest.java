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

import com.mypurecloud.sdk.v2.model.AgentActivityEntityListing;
import com.mypurecloud.sdk.v2.model.AiScoringSettings;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.CalibrationCreate;
import com.mypurecloud.sdk.v2.model.CalibrationEntityListing;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.EvaluationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQuery;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQueryMe;
import com.mypurecloud.sdk.v2.model.EvaluationAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.EvaluationCreateBody;
import com.mypurecloud.sdk.v2.model.EvaluationEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationFormAndScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationFormResponse;
import com.mypurecloud.sdk.v2.model.EvaluationFormResponseEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationResponse;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.v2.model.PublishForm;
import com.mypurecloud.sdk.v2.model.QMAuditQueryRequest;
import com.mypurecloud.sdk.v2.model.QualityAuditQueryExecutionResultsResponse;
import com.mypurecloud.sdk.v2.model.QualityAuditQueryExecutionStatusResponse;
import com.mypurecloud.sdk.v2.model.ScorableSurvey;
import com.mypurecloud.sdk.v2.model.Survey;
import com.mypurecloud.sdk.v2.model.SurveyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregationQuery;
import com.mypurecloud.sdk.v2.model.SurveyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.SurveyForm;
import com.mypurecloud.sdk.v2.model.SurveyFormAndScoringSet;
import com.mypurecloud.sdk.v2.model.SurveyFormEntityListing;
import com.mypurecloud.sdk.v2.model.SurveyScoringSet;

public class GetQualityAgentsActivityRequest {

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetQualityAgentsActivityRequest withPageSize(Integer pageSize) {
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

	public GetQualityAgentsActivityRequest withPageNumber(Integer pageNumber) {
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

	public GetQualityAgentsActivityRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetQualityAgentsActivityRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	private String nextPage;
	public String getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}

	public GetQualityAgentsActivityRequest withNextPage(String nextPage) {
	    this.setNextPage(nextPage);
	    return this;
	} 

	private String previousPage;
	public String getPreviousPage() {
		return this.previousPage;
	}

	public void setPreviousPage(String previousPage) {
		this.previousPage = previousPage;
	}

	public GetQualityAgentsActivityRequest withPreviousPage(String previousPage) {
	    this.setPreviousPage(previousPage);
	    return this;
	} 

	private Date startTime;
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public GetQualityAgentsActivityRequest withStartTime(Date startTime) {
	    this.setStartTime(startTime);
	    return this;
	} 

	private Date endTime;
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public GetQualityAgentsActivityRequest withEndTime(Date endTime) {
	    this.setEndTime(endTime);
	    return this;
	} 

	private List<String> agentUserId;
	public List<String> getAgentUserId() {
		return this.agentUserId;
	}

	public void setAgentUserId(List<String> agentUserId) {
		this.agentUserId = agentUserId;
	}

	public GetQualityAgentsActivityRequest withAgentUserId(List<String> agentUserId) {
	    this.setAgentUserId(agentUserId);
	    return this;
	} 

	private String evaluatorUserId;
	public String getEvaluatorUserId() {
		return this.evaluatorUserId;
	}

	public void setEvaluatorUserId(String evaluatorUserId) {
		this.evaluatorUserId = evaluatorUserId;
	}

	public GetQualityAgentsActivityRequest withEvaluatorUserId(String evaluatorUserId) {
	    this.setEvaluatorUserId(evaluatorUserId);
	    return this;
	} 

	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetQualityAgentsActivityRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 

	private String group;
	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public GetQualityAgentsActivityRequest withGroup(String group) {
	    this.setGroup(group);
	    return this;
	} 

	private String agentTeamId;
	public String getAgentTeamId() {
		return this.agentTeamId;
	}

	public void setAgentTeamId(String agentTeamId) {
		this.agentTeamId = agentTeamId;
	}

	public GetQualityAgentsActivityRequest withAgentTeamId(String agentTeamId) {
	    this.setAgentTeamId(agentTeamId);
	    return this;
	} 

	private String formContextId;
	public String getFormContextId() {
		return this.formContextId;
	}

	public void setFormContextId(String formContextId) {
		this.formContextId = formContextId;
	}

	public GetQualityAgentsActivityRequest withFormContextId(String formContextId) {
	    this.setFormContextId(formContextId);
	    return this;
	} 

	private String userState;
	public String getUserState() {
		return this.userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public GetQualityAgentsActivityRequest withUserState(String userState) {
	    this.setUserState(userState);
	    return this;
	} 

	public enum userStateValues { 
		ANY("Any"),
		LEGACY("Legacy");

		private String value;

		userStateValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static userStateValues fromString(String key) {
			if (key == null) return null;

			for (userStateValues value : userStateValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return userStateValues.values()[0];
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

    public GetQualityAgentsActivityRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/quality/agents/activity")

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("sortBy", "", sortBy)
        

                .withQueryParameters("expand", "multi", expand)
        

                .withQueryParameters("nextPage", "", nextPage)
        

                .withQueryParameters("previousPage", "", previousPage)
        

                .withQueryParameters("startTime", "", startTime)
        

                .withQueryParameters("endTime", "", endTime)
        

                .withQueryParameters("agentUserId", "multi", agentUserId)
        

                .withQueryParameters("evaluatorUserId", "", evaluatorUserId)
        

                .withQueryParameters("name", "", name)
        

                .withQueryParameters("group", "", group)
        

                .withQueryParameters("agentTeamId", "", agentTeamId)
        

                .withQueryParameters("formContextId", "", formContextId)
        

                .withQueryParameters("userState", "", userState)
        
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
		private final GetQualityAgentsActivityRequest request;

		private Builder() {
			request = new GetQualityAgentsActivityRequest();
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

		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withNextPage(String nextPage) {
			request.setNextPage(nextPage);
			return this;
		}

		public Builder withPreviousPage(String previousPage) {
			request.setPreviousPage(previousPage);
			return this;
		}

		public Builder withStartTime(Date startTime) {
			request.setStartTime(startTime);
			return this;
		}

		public Builder withEndTime(Date endTime) {
			request.setEndTime(endTime);
			return this;
		}

		public Builder withAgentUserId(List<String> agentUserId) {
			request.setAgentUserId(agentUserId);
			return this;
		}

		public Builder withEvaluatorUserId(String evaluatorUserId) {
			request.setEvaluatorUserId(evaluatorUserId);
			return this;
		}

		public Builder withName(String name) {
			request.setName(name);
			return this;
		}

		public Builder withGroup(String group) {
			request.setGroup(group);
			return this;
		}

		public Builder withAgentTeamId(String agentTeamId) {
			request.setAgentTeamId(agentTeamId);
			return this;
		}

		public Builder withFormContextId(String formContextId) {
			request.setFormContextId(formContextId);
			return this;
		}

		public Builder withUserState(String userState) {
			request.setUserState(userState);
			return this;
		}



		
		public Builder withUserState(userStateValues userState) {
		    request.setUserState(userState.toString());

		    return this;
		}




		public GetQualityAgentsActivityRequest build() {
            
			return request;
		}
	}
}
