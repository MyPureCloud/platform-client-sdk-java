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
import com.mypurecloud.sdk.v2.model.CaseplanUpdate;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IntakeSettingsListing;
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

public class GetCasemanagementCasesExternalcontactRequest {

	private String externalContactId;
	public String getExternalContactId() {
		return this.externalContactId;
	}

	public void setExternalContactId(String externalContactId) {
		this.externalContactId = externalContactId;
	}

	public GetCasemanagementCasesExternalcontactRequest withExternalContactId(String externalContactId) {
	    this.setExternalContactId(externalContactId);
	    return this;
	} 

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetCasemanagementCasesExternalcontactRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetCasemanagementCasesExternalcontactRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String divisionIds;
	public String getDivisionIds() {
		return this.divisionIds;
	}

	public void setDivisionIds(String divisionIds) {
		this.divisionIds = divisionIds;
	}

	public GetCasemanagementCasesExternalcontactRequest withDivisionIds(String divisionIds) {
	    this.setDivisionIds(divisionIds);
	    return this;
	} 

	private List<String> expands;
	public List<String> getExpands() {
		return this.expands;
	}

	public void setExpands(List<String> expands) {
		this.expands = expands;
	}

	public GetCasemanagementCasesExternalcontactRequest withExpands(List<String> expands) {
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

    public GetCasemanagementCasesExternalcontactRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'externalContactId' is set
        if (this.externalContactId == null) {
            throw new IllegalStateException("Missing the required parameter 'externalContactId' when building request for GetCasemanagementCasesExternalcontactRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/casemanagement/cases/externalcontacts/{externalContactId}")
                .withPathParameter("externalContactId", externalContactId)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("divisionIds", "", divisionIds)
        

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


	public static Builder builder(String externalContactId) {
	    return new Builder()
	            .withRequiredParams(externalContactId);
	}


	public static class Builder {
		private final GetCasemanagementCasesExternalcontactRequest request;

		private Builder() {
			request = new GetCasemanagementCasesExternalcontactRequest();
		}


		public Builder withExternalContactId(String externalContactId) {
			request.setExternalContactId(externalContactId);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withDivisionIds(String divisionIds) {
			request.setDivisionIds(divisionIds);
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



		public Builder withRequiredParams(String externalContactId) {
			request.setExternalContactId(externalContactId);

			return this;
		}


		public GetCasemanagementCasesExternalcontactRequest build() {
            
            // verify the required parameter 'externalContactId' is set
            if (request.externalContactId == null) {
                throw new IllegalStateException("Missing the required parameter 'externalContactId' when building request for GetCasemanagementCasesExternalcontactRequest.");
            }
            
			return request;
		}
	}
}
