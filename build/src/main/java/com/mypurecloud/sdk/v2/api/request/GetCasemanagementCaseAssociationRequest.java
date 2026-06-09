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
import com.mypurecloud.sdk.v2.model.CasePriorityUpdate;
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

public class GetCasemanagementCaseAssociationRequest {

	private String caseId;
	public String getCaseId() {
		return this.caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public GetCasemanagementCaseAssociationRequest withCaseId(String caseId) {
	    this.setCaseId(caseId);
	    return this;
	} 

	private String associationId;
	public String getAssociationId() {
		return this.associationId;
	}

	public void setAssociationId(String associationId) {
		this.associationId = associationId;
	}

	public GetCasemanagementCaseAssociationRequest withAssociationId(String associationId) {
	    this.setAssociationId(associationId);
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

    public GetCasemanagementCaseAssociationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'caseId' is set
        if (this.caseId == null) {
            throw new IllegalStateException("Missing the required parameter 'caseId' when building request for GetCasemanagementCaseAssociationRequest.");
        }
        
        // verify the required parameter 'associationId' is set
        if (this.associationId == null) {
            throw new IllegalStateException("Missing the required parameter 'associationId' when building request for GetCasemanagementCaseAssociationRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/casemanagement/cases/{caseId}/associations/{associationId}")
                .withPathParameter("caseId", caseId)
        
                .withPathParameter("associationId", associationId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String caseId, String associationId) {
	    return new Builder()
	            .withRequiredParams(caseId, associationId);
	}


	public static class Builder {
		private final GetCasemanagementCaseAssociationRequest request;

		private Builder() {
			request = new GetCasemanagementCaseAssociationRequest();
		}


		public Builder withCaseId(String caseId) {
			request.setCaseId(caseId);
			return this;
		}

		public Builder withAssociationId(String associationId) {
			request.setAssociationId(associationId);
			return this;
		}



		public Builder withRequiredParams(String caseId, String associationId) {
			request.setCaseId(caseId);
			request.setAssociationId(associationId);

			return this;
		}


		public GetCasemanagementCaseAssociationRequest build() {
            
            // verify the required parameter 'caseId' is set
            if (request.caseId == null) {
                throw new IllegalStateException("Missing the required parameter 'caseId' when building request for GetCasemanagementCaseAssociationRequest.");
            }
            
            // verify the required parameter 'associationId' is set
            if (request.associationId == null) {
                throw new IllegalStateException("Missing the required parameter 'associationId' when building request for GetCasemanagementCaseAssociationRequest.");
            }
            
			return request;
		}
	}
}
