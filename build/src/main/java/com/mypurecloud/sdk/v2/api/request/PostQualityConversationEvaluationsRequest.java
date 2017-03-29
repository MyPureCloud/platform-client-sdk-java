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

public class PostQualityConversationEvaluationsRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public PostQualityConversationEvaluationsRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	}

	private Evaluation body;
	public Evaluation getBody() {
		return this.body;
	}

	public void setBody(Evaluation body) {
		this.body = body;
	}

	public PostQualityConversationEvaluationsRequest withBody(Evaluation body) {
	    this.setBody(body);
	    return this;
	}

	private String expand;
	public String getExpand() {
		return this.expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public PostQualityConversationEvaluationsRequest withExpand(String expand) {
	    this.setExpand(expand);
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

    public PostQualityConversationEvaluationsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Evaluation> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new ApiException(400, "Missing the required parameter 'conversationId' when building request for PostQualityConversationEvaluationsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when building request for PostQualityConversationEvaluationsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/quality/conversations/{conversationId}/evaluations")
                .withPathParameter("conversationId", conversationId)
        
                .withQueryParameters("expand", "", expand)
        
                .withBody(body)
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String conversationId, Evaluation body) {
	    return new Builder()
	            .withRequiredParams(conversationId, body);
	}

	public static class Builder {
		private final PostQualityConversationEvaluationsRequest request;

		private Builder() {
			request = new PostQualityConversationEvaluationsRequest();
		}

		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}
		public Builder withBody(Evaluation body) {
			request.setBody(body);
			return this;
		}
		public Builder withExpand(String expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withRequiredParams(String conversationId, Evaluation body) {
			request.setConversationId(conversationId);
			request.setBody(body);
			return this;
		}


		public PostQualityConversationEvaluationsRequest build() {
			return request;
		}
	}
}
