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

public class PutCasemanagementCaseplanDataschemaRequest {

	private String caseplanId;
	public String getCaseplanId() {
		return this.caseplanId;
	}

	public void setCaseplanId(String caseplanId) {
		this.caseplanId = caseplanId;
	}

	public PutCasemanagementCaseplanDataschemaRequest withCaseplanId(String caseplanId) {
	    this.setCaseplanId(caseplanId);
	    return this;
	} 

	private String schemaKeyName;
	public String getSchemaKeyName() {
		return this.schemaKeyName;
	}

	public void setSchemaKeyName(String schemaKeyName) {
		this.schemaKeyName = schemaKeyName;
	}

	public PutCasemanagementCaseplanDataschemaRequest withSchemaKeyName(String schemaKeyName) {
	    this.setSchemaKeyName(schemaKeyName);
	    return this;
	} 

	private CaseplanDataSchemaRequest body;
	public CaseplanDataSchemaRequest getBody() {
		return this.body;
	}

	public void setBody(CaseplanDataSchemaRequest body) {
		this.body = body;
	}

	public PutCasemanagementCaseplanDataschemaRequest withBody(CaseplanDataSchemaRequest body) {
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

    public PutCasemanagementCaseplanDataschemaRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<CaseplanDataSchemaRequest> withHttpInfo() {
        
        // verify the required parameter 'caseplanId' is set
        if (this.caseplanId == null) {
            throw new IllegalStateException("Missing the required parameter 'caseplanId' when building request for PutCasemanagementCaseplanDataschemaRequest.");
        }
        
        // verify the required parameter 'schemaKeyName' is set
        if (this.schemaKeyName == null) {
            throw new IllegalStateException("Missing the required parameter 'schemaKeyName' when building request for PutCasemanagementCaseplanDataschemaRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutCasemanagementCaseplanDataschemaRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/casemanagement/caseplans/{caseplanId}/dataschemas/{schemaKeyName}")
                .withPathParameter("caseplanId", caseplanId)
        
                .withPathParameter("schemaKeyName", schemaKeyName)
        
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


	public static Builder builder(String caseplanId, String schemaKeyName, CaseplanDataSchemaRequest body) {
	    return new Builder()
	            .withRequiredParams(caseplanId, schemaKeyName, body);
	}


	public static class Builder {
		private final PutCasemanagementCaseplanDataschemaRequest request;

		private Builder() {
			request = new PutCasemanagementCaseplanDataschemaRequest();
		}


		public Builder withCaseplanId(String caseplanId) {
			request.setCaseplanId(caseplanId);
			return this;
		}

		public Builder withSchemaKeyName(String schemaKeyName) {
			request.setSchemaKeyName(schemaKeyName);
			return this;
		}

		public Builder withBody(CaseplanDataSchemaRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String caseplanId, String schemaKeyName, CaseplanDataSchemaRequest body) {
			request.setCaseplanId(caseplanId);
			request.setSchemaKeyName(schemaKeyName);
			request.setBody(body);

			return this;
		}


		public PutCasemanagementCaseplanDataschemaRequest build() {
            
            // verify the required parameter 'caseplanId' is set
            if (request.caseplanId == null) {
                throw new IllegalStateException("Missing the required parameter 'caseplanId' when building request for PutCasemanagementCaseplanDataschemaRequest.");
            }
            
            // verify the required parameter 'schemaKeyName' is set
            if (request.schemaKeyName == null) {
                throw new IllegalStateException("Missing the required parameter 'schemaKeyName' when building request for PutCasemanagementCaseplanDataschemaRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutCasemanagementCaseplanDataschemaRequest.");
            }
            
			return request;
		}
	}
}
