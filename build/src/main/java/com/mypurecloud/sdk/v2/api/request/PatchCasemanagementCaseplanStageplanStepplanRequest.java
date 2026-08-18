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

public class PatchCasemanagementCaseplanStageplanStepplanRequest {

	private String caseplanId;
	public String getCaseplanId() {
		return this.caseplanId;
	}

	public void setCaseplanId(String caseplanId) {
		this.caseplanId = caseplanId;
	}

	public PatchCasemanagementCaseplanStageplanStepplanRequest withCaseplanId(String caseplanId) {
	    this.setCaseplanId(caseplanId);
	    return this;
	} 

	private String stageplanId;
	public String getStageplanId() {
		return this.stageplanId;
	}

	public void setStageplanId(String stageplanId) {
		this.stageplanId = stageplanId;
	}

	public PatchCasemanagementCaseplanStageplanStepplanRequest withStageplanId(String stageplanId) {
	    this.setStageplanId(stageplanId);
	    return this;
	} 

	private String stepplanId;
	public String getStepplanId() {
		return this.stepplanId;
	}

	public void setStepplanId(String stepplanId) {
		this.stepplanId = stepplanId;
	}

	public PatchCasemanagementCaseplanStageplanStepplanRequest withStepplanId(String stepplanId) {
	    this.setStepplanId(stepplanId);
	    return this;
	} 

	private StepplanUpdate body;
	public StepplanUpdate getBody() {
		return this.body;
	}

	public void setBody(StepplanUpdate body) {
		this.body = body;
	}

	public PatchCasemanagementCaseplanStageplanStepplanRequest withBody(StepplanUpdate body) {
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

    public PatchCasemanagementCaseplanStageplanStepplanRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<StepplanUpdate> withHttpInfo() {
        
        // verify the required parameter 'caseplanId' is set
        if (this.caseplanId == null) {
            throw new IllegalStateException("Missing the required parameter 'caseplanId' when building request for PatchCasemanagementCaseplanStageplanStepplanRequest.");
        }
        
        // verify the required parameter 'stageplanId' is set
        if (this.stageplanId == null) {
            throw new IllegalStateException("Missing the required parameter 'stageplanId' when building request for PatchCasemanagementCaseplanStageplanStepplanRequest.");
        }
        
        // verify the required parameter 'stepplanId' is set
        if (this.stepplanId == null) {
            throw new IllegalStateException("Missing the required parameter 'stepplanId' when building request for PatchCasemanagementCaseplanStageplanStepplanRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchCasemanagementCaseplanStageplanStepplanRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/casemanagement/caseplans/{caseplanId}/stageplans/{stageplanId}/stepplans/{stepplanId}")
                .withPathParameter("caseplanId", caseplanId)
        
                .withPathParameter("stageplanId", stageplanId)
        
                .withPathParameter("stepplanId", stepplanId)
        
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


	public static Builder builder(String caseplanId, String stageplanId, String stepplanId, StepplanUpdate body) {
	    return new Builder()
	            .withRequiredParams(caseplanId, stageplanId, stepplanId, body);
	}


	public static class Builder {
		private final PatchCasemanagementCaseplanStageplanStepplanRequest request;

		private Builder() {
			request = new PatchCasemanagementCaseplanStageplanStepplanRequest();
		}


		public Builder withCaseplanId(String caseplanId) {
			request.setCaseplanId(caseplanId);
			return this;
		}

		public Builder withStageplanId(String stageplanId) {
			request.setStageplanId(stageplanId);
			return this;
		}

		public Builder withStepplanId(String stepplanId) {
			request.setStepplanId(stepplanId);
			return this;
		}

		public Builder withBody(StepplanUpdate body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String caseplanId, String stageplanId, String stepplanId, StepplanUpdate body) {
			request.setCaseplanId(caseplanId);
			request.setStageplanId(stageplanId);
			request.setStepplanId(stepplanId);
			request.setBody(body);

			return this;
		}


		public PatchCasemanagementCaseplanStageplanStepplanRequest build() {
            
            // verify the required parameter 'caseplanId' is set
            if (request.caseplanId == null) {
                throw new IllegalStateException("Missing the required parameter 'caseplanId' when building request for PatchCasemanagementCaseplanStageplanStepplanRequest.");
            }
            
            // verify the required parameter 'stageplanId' is set
            if (request.stageplanId == null) {
                throw new IllegalStateException("Missing the required parameter 'stageplanId' when building request for PatchCasemanagementCaseplanStageplanStepplanRequest.");
            }
            
            // verify the required parameter 'stepplanId' is set
            if (request.stepplanId == null) {
                throw new IllegalStateException("Missing the required parameter 'stepplanId' when building request for PatchCasemanagementCaseplanStageplanStepplanRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchCasemanagementCaseplanStageplanStepplanRequest.");
            }
            
			return request;
		}
	}
}
