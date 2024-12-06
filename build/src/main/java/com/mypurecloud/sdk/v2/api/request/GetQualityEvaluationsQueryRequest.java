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

public class GetQualityEvaluationsQueryRequest {

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetQualityEvaluationsQueryRequest withPageSize(Integer pageSize) {
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

	public GetQualityEvaluationsQueryRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetQualityEvaluationsQueryRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	private String previousPage;
	public String getPreviousPage() {
		return this.previousPage;
	}

	public void setPreviousPage(String previousPage) {
		this.previousPage = previousPage;
	}

	public GetQualityEvaluationsQueryRequest withPreviousPage(String previousPage) {
	    this.setPreviousPage(previousPage);
	    return this;
	} 

	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public GetQualityEvaluationsQueryRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	} 

	private String agentUserId;
	public String getAgentUserId() {
		return this.agentUserId;
	}

	public void setAgentUserId(String agentUserId) {
		this.agentUserId = agentUserId;
	}

	public GetQualityEvaluationsQueryRequest withAgentUserId(String agentUserId) {
	    this.setAgentUserId(agentUserId);
	    return this;
	} 

	private String agentTeamId;
	public String getAgentTeamId() {
		return this.agentTeamId;
	}

	public void setAgentTeamId(String agentTeamId) {
		this.agentTeamId = agentTeamId;
	}

	public GetQualityEvaluationsQueryRequest withAgentTeamId(String agentTeamId) {
	    this.setAgentTeamId(agentTeamId);
	    return this;
	} 

	private String evaluatorUserId;
	public String getEvaluatorUserId() {
		return this.evaluatorUserId;
	}

	public void setEvaluatorUserId(String evaluatorUserId) {
		this.evaluatorUserId = evaluatorUserId;
	}

	public GetQualityEvaluationsQueryRequest withEvaluatorUserId(String evaluatorUserId) {
	    this.setEvaluatorUserId(evaluatorUserId);
	    return this;
	} 

	private String assigneeUserId;
	public String getAssigneeUserId() {
		return this.assigneeUserId;
	}

	public void setAssigneeUserId(String assigneeUserId) {
		this.assigneeUserId = assigneeUserId;
	}

	public GetQualityEvaluationsQueryRequest withAssigneeUserId(String assigneeUserId) {
	    this.setAssigneeUserId(assigneeUserId);
	    return this;
	} 

	private String queueId;
	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public GetQualityEvaluationsQueryRequest withQueueId(String queueId) {
	    this.setQueueId(queueId);
	    return this;
	} 

	private String startTime;
	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public GetQualityEvaluationsQueryRequest withStartTime(String startTime) {
	    this.setStartTime(startTime);
	    return this;
	} 

	private String endTime;
	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public GetQualityEvaluationsQueryRequest withEndTime(String endTime) {
	    this.setEndTime(endTime);
	    return this;
	} 

	private String formContextId;
	public String getFormContextId() {
		return this.formContextId;
	}

	public void setFormContextId(String formContextId) {
		this.formContextId = formContextId;
	}

	public GetQualityEvaluationsQueryRequest withFormContextId(String formContextId) {
	    this.setFormContextId(formContextId);
	    return this;
	} 

	private List<String> evaluationState;
	public List<String> getEvaluationState() {
		return this.evaluationState;
	}

	public void setEvaluationState(List<String> evaluationState) {
		this.evaluationState = evaluationState;
	}

	public GetQualityEvaluationsQueryRequest withEvaluationState(List<String> evaluationState) {
	    this.setEvaluationState(evaluationState);
	    return this;
	} 

	private Boolean isReleased;
	public Boolean getIsReleased() {
		return this.isReleased;
	}

	public void setIsReleased(Boolean isReleased) {
		this.isReleased = isReleased;
	}

	public GetQualityEvaluationsQueryRequest withIsReleased(Boolean isReleased) {
	    this.setIsReleased(isReleased);
	    return this;
	} 

	private Boolean agentHasRead;
	public Boolean getAgentHasRead() {
		return this.agentHasRead;
	}

	public void setAgentHasRead(Boolean agentHasRead) {
		this.agentHasRead = agentHasRead;
	}

	public GetQualityEvaluationsQueryRequest withAgentHasRead(Boolean agentHasRead) {
	    this.setAgentHasRead(agentHasRead);
	    return this;
	} 

	private Boolean expandAnswerTotalScores;
	public Boolean getExpandAnswerTotalScores() {
		return this.expandAnswerTotalScores;
	}

	public void setExpandAnswerTotalScores(Boolean expandAnswerTotalScores) {
		this.expandAnswerTotalScores = expandAnswerTotalScores;
	}

	public GetQualityEvaluationsQueryRequest withExpandAnswerTotalScores(Boolean expandAnswerTotalScores) {
	    this.setExpandAnswerTotalScores(expandAnswerTotalScores);
	    return this;
	} 

	private Integer maximum;
	public Integer getMaximum() {
		return this.maximum;
	}

	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}

	public GetQualityEvaluationsQueryRequest withMaximum(Integer maximum) {
	    this.setMaximum(maximum);
	    return this;
	} 

	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetQualityEvaluationsQueryRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 

	private Boolean includeDeletedUsers;
	public Boolean getIncludeDeletedUsers() {
		return this.includeDeletedUsers;
	}

	public void setIncludeDeletedUsers(Boolean includeDeletedUsers) {
		this.includeDeletedUsers = includeDeletedUsers;
	}

	public GetQualityEvaluationsQueryRequest withIncludeDeletedUsers(Boolean includeDeletedUsers) {
	    this.setIncludeDeletedUsers(includeDeletedUsers);
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

    public GetQualityEvaluationsQueryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/quality/evaluations/query")

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("expand", "multi", expand)
        

                .withQueryParameters("previousPage", "", previousPage)
        

                .withQueryParameters("conversationId", "", conversationId)
        

                .withQueryParameters("agentUserId", "", agentUserId)
        

                .withQueryParameters("agentTeamId", "", agentTeamId)
        

                .withQueryParameters("evaluatorUserId", "", evaluatorUserId)
        

                .withQueryParameters("assigneeUserId", "", assigneeUserId)
        

                .withQueryParameters("queueId", "", queueId)
        

                .withQueryParameters("startTime", "", startTime)
        

                .withQueryParameters("endTime", "", endTime)
        

                .withQueryParameters("formContextId", "", formContextId)
        

                .withQueryParameters("evaluationState", "multi", evaluationState)
        

                .withQueryParameters("isReleased", "", isReleased)
        

                .withQueryParameters("agentHasRead", "", agentHasRead)
        

                .withQueryParameters("expandAnswerTotalScores", "", expandAnswerTotalScores)
        

                .withQueryParameters("maximum", "", maximum)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        

                .withQueryParameters("includeDeletedUsers", "", includeDeletedUsers)
        
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
		private final GetQualityEvaluationsQueryRequest request;

		private Builder() {
			request = new GetQualityEvaluationsQueryRequest();
		}


		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}

		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withPreviousPage(String previousPage) {
			request.setPreviousPage(previousPage);
			return this;
		}

		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}

		public Builder withAgentUserId(String agentUserId) {
			request.setAgentUserId(agentUserId);
			return this;
		}

		public Builder withAgentTeamId(String agentTeamId) {
			request.setAgentTeamId(agentTeamId);
			return this;
		}

		public Builder withEvaluatorUserId(String evaluatorUserId) {
			request.setEvaluatorUserId(evaluatorUserId);
			return this;
		}

		public Builder withAssigneeUserId(String assigneeUserId) {
			request.setAssigneeUserId(assigneeUserId);
			return this;
		}

		public Builder withQueueId(String queueId) {
			request.setQueueId(queueId);
			return this;
		}

		public Builder withStartTime(String startTime) {
			request.setStartTime(startTime);
			return this;
		}

		public Builder withEndTime(String endTime) {
			request.setEndTime(endTime);
			return this;
		}

		public Builder withFormContextId(String formContextId) {
			request.setFormContextId(formContextId);
			return this;
		}

		public Builder withEvaluationState(List<String> evaluationState) {
			request.setEvaluationState(evaluationState);
			return this;
		}

		public Builder withIsReleased(Boolean isReleased) {
			request.setIsReleased(isReleased);
			return this;
		}

		public Builder withAgentHasRead(Boolean agentHasRead) {
			request.setAgentHasRead(agentHasRead);
			return this;
		}

		public Builder withExpandAnswerTotalScores(Boolean expandAnswerTotalScores) {
			request.setExpandAnswerTotalScores(expandAnswerTotalScores);
			return this;
		}

		public Builder withMaximum(Integer maximum) {
			request.setMaximum(maximum);
			return this;
		}

		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}

		public Builder withIncludeDeletedUsers(Boolean includeDeletedUsers) {
			request.setIncludeDeletedUsers(includeDeletedUsers);
			return this;
		}




		public GetQualityEvaluationsQueryRequest build() {
            
			return request;
		}
	}
}
