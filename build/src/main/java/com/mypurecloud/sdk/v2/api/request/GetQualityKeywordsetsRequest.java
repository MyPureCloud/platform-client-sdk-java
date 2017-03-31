package com.mypurecloud.sdk.v2.api.request;

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
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.AgentActivityEntityListing;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.CalibrationEntityListing;
import com.mypurecloud.sdk.v2.model.QualityAuditPage;
import com.mypurecloud.sdk.v2.model.EvaluationEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationFormEntityListing;
import com.mypurecloud.sdk.v2.model.KeywordSet;
import com.mypurecloud.sdk.v2.model.KeywordSetEntityListing;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.CalibrationCreate;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationFormAndScoringSet;

public class GetQualityKeywordsetsRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetQualityKeywordsetsRequest withPageSize(Integer pageSize) {
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

	public GetQualityKeywordsetsRequest withPageNumber(Integer pageNumber) {
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

	public GetQualityKeywordsetsRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	}

	private List<Object> expand;
	public List<Object> getExpand() {
		return this.expand;
	}

	public void setExpand(List<Object> expand) {
		this.expand = expand;
	}

	public GetQualityKeywordsetsRequest withExpand(List<Object> expand) {
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

	public GetQualityKeywordsetsRequest withNextPage(String nextPage) {
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

	public GetQualityKeywordsetsRequest withPreviousPage(String previousPage) {
	    this.setPreviousPage(previousPage);
	    return this;
	}

	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetQualityKeywordsetsRequest withName(String name) {
	    this.setName(name);
	    return this;
	}

	private String queueId;
	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public GetQualityKeywordsetsRequest withQueueId(String queueId) {
	    this.setQueueId(queueId);
	    return this;
	}

	private String agentId;
	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public GetQualityKeywordsetsRequest withAgentId(String agentId) {
	    this.setAgentId(agentId);
	    return this;
	}

	private String operator;
	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public GetQualityKeywordsetsRequest withOperator(String operator) {
	    this.setOperator(operator);
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

    public GetQualityKeywordsetsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/quality/keywordsets")
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("expand", "multi", expand)
        
                .withQueryParameters("nextPage", "", nextPage)
        
                .withQueryParameters("previousPage", "", previousPage)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("queueId", "", queueId)
        
                .withQueryParameters("agentId", "", agentId)
        
                .withQueryParameters("operator", "", operator)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static class Builder {
		private final GetQualityKeywordsetsRequest request;

		private Builder() {
			request = new GetQualityKeywordsetsRequest();
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
		public Builder withExpand(List<Object> expand) {
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
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		public Builder withQueueId(String queueId) {
			request.setQueueId(queueId);
			return this;
		}
		public Builder withAgentId(String agentId) {
			request.setAgentId(agentId);
			return this;
		}
		public Builder withOperator(String operator) {
			request.setOperator(operator);
			return this;
		}



		public GetQualityKeywordsetsRequest build() {
			return request;
		}
	}
}
