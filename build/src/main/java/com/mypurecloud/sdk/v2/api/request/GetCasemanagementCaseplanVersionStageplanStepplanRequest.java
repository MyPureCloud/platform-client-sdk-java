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
import com.mypurecloud.sdk.v2.model.StageplanCreate;
import com.mypurecloud.sdk.v2.model.StageplanListing;
import com.mypurecloud.sdk.v2.model.StageplanReposition;
import com.mypurecloud.sdk.v2.model.StageplanUpdate;
import com.mypurecloud.sdk.v2.model.Step;
import com.mypurecloud.sdk.v2.model.StepListing;
import com.mypurecloud.sdk.v2.model.Stepplan;
import com.mypurecloud.sdk.v2.model.StepplanListing;
import com.mypurecloud.sdk.v2.model.StepplanUpdate;
import com.mypurecloud.sdk.v2.model.TerminateJob;

public class GetCasemanagementCaseplanVersionStageplanStepplanRequest {

	private String caseplanId;
	public String getCaseplanId() {
		return this.caseplanId;
	}

	public void setCaseplanId(String caseplanId) {
		this.caseplanId = caseplanId;
	}

	public GetCasemanagementCaseplanVersionStageplanStepplanRequest withCaseplanId(String caseplanId) {
	    this.setCaseplanId(caseplanId);
	    return this;
	} 

	private String versionId;
	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public GetCasemanagementCaseplanVersionStageplanStepplanRequest withVersionId(String versionId) {
	    this.setVersionId(versionId);
	    return this;
	} 

	private String stageplanId;
	public String getStageplanId() {
		return this.stageplanId;
	}

	public void setStageplanId(String stageplanId) {
		this.stageplanId = stageplanId;
	}

	public GetCasemanagementCaseplanVersionStageplanStepplanRequest withStageplanId(String stageplanId) {
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

	public GetCasemanagementCaseplanVersionStageplanStepplanRequest withStepplanId(String stepplanId) {
	    this.setStepplanId(stepplanId);
	    return this;
	} 

	private List<String> expands;
	public List<String> getExpands() {
		return this.expands;
	}

	public void setExpands(List<String> expands) {
		this.expands = expands;
	}

	public GetCasemanagementCaseplanVersionStageplanStepplanRequest withExpands(List<String> expands) {
	    this.setExpands(expands);
	    return this;
	} 

	public enum expandsValues { 
		STAGEPLAN("stageplan"),
		CASEPLAN("caseplan"),
		WORKTYPE("worktype");

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

    public GetCasemanagementCaseplanVersionStageplanStepplanRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'caseplanId' is set
        if (this.caseplanId == null) {
            throw new IllegalStateException("Missing the required parameter 'caseplanId' when building request for GetCasemanagementCaseplanVersionStageplanStepplanRequest.");
        }
        
        // verify the required parameter 'versionId' is set
        if (this.versionId == null) {
            throw new IllegalStateException("Missing the required parameter 'versionId' when building request for GetCasemanagementCaseplanVersionStageplanStepplanRequest.");
        }
        
        // verify the required parameter 'stageplanId' is set
        if (this.stageplanId == null) {
            throw new IllegalStateException("Missing the required parameter 'stageplanId' when building request for GetCasemanagementCaseplanVersionStageplanStepplanRequest.");
        }
        
        // verify the required parameter 'stepplanId' is set
        if (this.stepplanId == null) {
            throw new IllegalStateException("Missing the required parameter 'stepplanId' when building request for GetCasemanagementCaseplanVersionStageplanStepplanRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/casemanagement/caseplans/{caseplanId}/versions/{versionId}/stageplans/{stageplanId}/stepplans/{stepplanId}")
                .withPathParameter("caseplanId", caseplanId)
        
                .withPathParameter("versionId", versionId)
        
                .withPathParameter("stageplanId", stageplanId)
        
                .withPathParameter("stepplanId", stepplanId)
        

                .withQueryParameters("expands", "multi", expands)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String caseplanId, String versionId, String stageplanId, String stepplanId) {
	    return new Builder()
	            .withRequiredParams(caseplanId, versionId, stageplanId, stepplanId);
	}


	public static class Builder {
		private final GetCasemanagementCaseplanVersionStageplanStepplanRequest request;

		private Builder() {
			request = new GetCasemanagementCaseplanVersionStageplanStepplanRequest();
		}


		public Builder withCaseplanId(String caseplanId) {
			request.setCaseplanId(caseplanId);
			return this;
		}

		public Builder withVersionId(String versionId) {
			request.setVersionId(versionId);
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

		public Builder withExpands(List<String> expands) {
			request.setExpands(expands);
			return this;
		}



		public Builder withExpandsEnumValues(List<expandsValues> expands) {
		    List<String> stringList = new ArrayList<>();
	      for (expandsValues e : expands) {
	        stringList.add(e.toString());
	      }
	      request.setExpands(stringList);
		    return this;
		}



		public Builder withRequiredParams(String caseplanId, String versionId, String stageplanId, String stepplanId) {
			request.setCaseplanId(caseplanId);
			request.setVersionId(versionId);
			request.setStageplanId(stageplanId);
			request.setStepplanId(stepplanId);

			return this;
		}


		public GetCasemanagementCaseplanVersionStageplanStepplanRequest build() {
            
            // verify the required parameter 'caseplanId' is set
            if (request.caseplanId == null) {
                throw new IllegalStateException("Missing the required parameter 'caseplanId' when building request for GetCasemanagementCaseplanVersionStageplanStepplanRequest.");
            }
            
            // verify the required parameter 'versionId' is set
            if (request.versionId == null) {
                throw new IllegalStateException("Missing the required parameter 'versionId' when building request for GetCasemanagementCaseplanVersionStageplanStepplanRequest.");
            }
            
            // verify the required parameter 'stageplanId' is set
            if (request.stageplanId == null) {
                throw new IllegalStateException("Missing the required parameter 'stageplanId' when building request for GetCasemanagementCaseplanVersionStageplanStepplanRequest.");
            }
            
            // verify the required parameter 'stepplanId' is set
            if (request.stepplanId == null) {
                throw new IllegalStateException("Missing the required parameter 'stepplanId' when building request for GetCasemanagementCaseplanVersionStageplanStepplanRequest.");
            }
            
			return request;
		}
	}
}
