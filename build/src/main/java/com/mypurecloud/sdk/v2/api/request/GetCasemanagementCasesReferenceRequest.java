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
import com.mypurecloud.sdk.v2.model.CaseplanDataSchemaListing;
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

public class GetCasemanagementCasesReferenceRequest {

	private String referenceId;
	public String getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public GetCasemanagementCasesReferenceRequest withReferenceId(String referenceId) {
	    this.setReferenceId(referenceId);
	    return this;
	} 

	private String expands;
	public String getExpands() {
		return this.expands;
	}

	public void setExpands(String expands) {
		this.expands = expands;
	}

	public GetCasemanagementCasesReferenceRequest withExpands(String expands) {
	    this.setExpands(expands);
	    return this;
	} 

	public enum expandsValues { 
		CASEPLAN("caseplan");

		private String value;

		expandsValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandsValues fromString(String key) {
			if (key == null) return null;

			for (expandsValues value : expandsValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandsValues.values()[0];
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

    public GetCasemanagementCasesReferenceRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'referenceId' is set
        if (this.referenceId == null) {
            throw new IllegalStateException("Missing the required parameter 'referenceId' when building request for GetCasemanagementCasesReferenceRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/casemanagement/cases/references/{referenceId}")
                .withPathParameter("referenceId", referenceId)
        

                .withQueryParameters("expands", "", expands)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String referenceId) {
	    return new Builder()
	            .withRequiredParams(referenceId);
	}


	public static class Builder {
		private final GetCasemanagementCasesReferenceRequest request;

		private Builder() {
			request = new GetCasemanagementCasesReferenceRequest();
		}


		public Builder withReferenceId(String referenceId) {
			request.setReferenceId(referenceId);
			return this;
		}

		public Builder withExpands(String expands) {
			request.setExpands(expands);
			return this;
		}



		
		public Builder withExpands(expandsValues expands) {
		    request.setExpands(expands.toString());

		    return this;
		}



		public Builder withRequiredParams(String referenceId) {
			request.setReferenceId(referenceId);

			return this;
		}


		public GetCasemanagementCasesReferenceRequest build() {
            
            // verify the required parameter 'referenceId' is set
            if (request.referenceId == null) {
                throw new IllegalStateException("Missing the required parameter 'referenceId' when building request for GetCasemanagementCasesReferenceRequest.");
            }
            
			return request;
		}
	}
}
