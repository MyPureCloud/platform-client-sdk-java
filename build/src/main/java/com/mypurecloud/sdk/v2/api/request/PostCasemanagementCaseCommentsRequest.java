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

import com.mypurecloud.sdk.v2.model.CaseAssociation;
import com.mypurecloud.sdk.v2.model.CaseAssociationCreate;
import com.mypurecloud.sdk.v2.model.CaseAssociationListing;
import com.mypurecloud.sdk.v2.model.CaseAssociationQuery;
import com.mypurecloud.sdk.v2.model.CaseAssociationQueryEntityListing;
import com.mypurecloud.sdk.v2.model.CaseCreate;
import com.mypurecloud.sdk.v2.model.CaseDateDueUpdate;
import com.mypurecloud.sdk.v2.model.CaseListing;
import com.mypurecloud.sdk.v2.model.CaseOwnerUpdate;
import com.mypurecloud.sdk.v2.model.CasePriorityUpdate;
import com.mypurecloud.sdk.v2.model.CaseQueryJobCreate;
import com.mypurecloud.sdk.v2.model.CaseQueryJobResponse;
import com.mypurecloud.sdk.v2.model.CaseQueryJobResultsResponse;
import com.mypurecloud.sdk.v2.model.CaseSummaryUpdate;
import com.mypurecloud.sdk.v2.model.Caseplan;
import com.mypurecloud.sdk.v2.model.CaseplanCreate;
import com.mypurecloud.sdk.v2.model.CaseplanCreateResponse;
import com.mypurecloud.sdk.v2.model.CaseplanDataSchema;
import com.mypurecloud.sdk.v2.model.CaseplanDataSchemaListing;
import com.mypurecloud.sdk.v2.model.CaseplanDataSchemaRequest;
import com.mypurecloud.sdk.v2.model.CaseplanListing;
import com.mypurecloud.sdk.v2.model.CaseplanQueryEntityListing;
import com.mypurecloud.sdk.v2.model.CaseplanQueryRequest;
import com.mypurecloud.sdk.v2.model.CaseplanUpdate;
import com.mypurecloud.sdk.v2.model.Comment;
import com.mypurecloud.sdk.v2.model.CommentCreate;
import com.mypurecloud.sdk.v2.model.CommentListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IntakeSettingsListing;
import com.mypurecloud.sdk.v2.model.IntakeSettingsUpdate;
import com.mypurecloud.sdk.v2.model.ModelCase;
import com.mypurecloud.sdk.v2.model.Stage;
import com.mypurecloud.sdk.v2.model.StageListing;
import com.mypurecloud.sdk.v2.model.Stageplan;
import com.mypurecloud.sdk.v2.model.StageplanListing;
import com.mypurecloud.sdk.v2.model.StageplanUpdate;
import com.mypurecloud.sdk.v2.model.Step;
import com.mypurecloud.sdk.v2.model.StepListing;
import com.mypurecloud.sdk.v2.model.Stepplan;
import com.mypurecloud.sdk.v2.model.StepplanListing;
import com.mypurecloud.sdk.v2.model.StepplanUpdate;
import com.mypurecloud.sdk.v2.model.TerminateJob;

public class PostCasemanagementCaseCommentsRequest {

	private String caseId;
	public String getCaseId() {
		return this.caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public PostCasemanagementCaseCommentsRequest withCaseId(String caseId) {
	    this.setCaseId(caseId);
	    return this;
	} 

	private CommentCreate body;
	public CommentCreate getBody() {
		return this.body;
	}

	public void setBody(CommentCreate body) {
		this.body = body;
	}

	public PostCasemanagementCaseCommentsRequest withBody(CommentCreate body) {
	    this.setBody(body);
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

    public PostCasemanagementCaseCommentsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<CommentCreate> withHttpInfo() {
        
        // verify the required parameter 'caseId' is set
        if (this.caseId == null) {
            throw new IllegalStateException("Missing the required parameter 'caseId' when building request for PostCasemanagementCaseCommentsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostCasemanagementCaseCommentsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/casemanagement/cases/{caseId}/comments")
                .withPathParameter("caseId", caseId)
        
                .withBody(body)

		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String caseId, CommentCreate body) {
	    return new Builder()
	            .withRequiredParams(caseId, body);
	}


	public static class Builder {
		private final PostCasemanagementCaseCommentsRequest request;

		private Builder() {
			request = new PostCasemanagementCaseCommentsRequest();
		}


		public Builder withCaseId(String caseId) {
			request.setCaseId(caseId);
			return this;
		}

		public Builder withBody(CommentCreate body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String caseId, CommentCreate body) {
			request.setCaseId(caseId);
			request.setBody(body);

			return this;
		}


		public PostCasemanagementCaseCommentsRequest build() {
            
            // verify the required parameter 'caseId' is set
            if (request.caseId == null) {
                throw new IllegalStateException("Missing the required parameter 'caseId' when building request for PostCasemanagementCaseCommentsRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostCasemanagementCaseCommentsRequest.");
            }
            
			return request;
		}
	}
}
