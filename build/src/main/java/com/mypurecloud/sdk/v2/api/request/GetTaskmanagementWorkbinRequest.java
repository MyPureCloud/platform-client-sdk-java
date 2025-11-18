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

import com.mypurecloud.sdk.v2.model.BulkJob;
import com.mypurecloud.sdk.v2.model.BulkJobAddRequest;
import com.mypurecloud.sdk.v2.model.BulkJobAddResponse;
import com.mypurecloud.sdk.v2.model.BulkJobTerminateRequest;
import com.mypurecloud.sdk.v2.model.BulkJobTerminateResultsResponse;
import com.mypurecloud.sdk.v2.model.BulkJobUpdate;
import com.mypurecloud.sdk.v2.model.BulkJobsListing;
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CoretypeListing;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.SchemaQuantityLimits;
import com.mypurecloud.sdk.v2.model.Workbin;
import com.mypurecloud.sdk.v2.model.WorkbinChangeListing;
import com.mypurecloud.sdk.v2.model.WorkbinCreate;
import com.mypurecloud.sdk.v2.model.WorkbinQueryEntityListing;
import com.mypurecloud.sdk.v2.model.WorkbinQueryRequest;
import com.mypurecloud.sdk.v2.model.WorkbinUpdate;
import com.mypurecloud.sdk.v2.model.WorkbinVersion;
import com.mypurecloud.sdk.v2.model.WorkbinVersionListing;
import com.mypurecloud.sdk.v2.model.Workitem;
import com.mypurecloud.sdk.v2.model.WorkitemChangeListing;
import com.mypurecloud.sdk.v2.model.WorkitemCreate;
import com.mypurecloud.sdk.v2.model.WorkitemDateBasedRule;
import com.mypurecloud.sdk.v2.model.WorkitemDateBasedRuleCreate;
import com.mypurecloud.sdk.v2.model.WorkitemDateBasedRuleListing;
import com.mypurecloud.sdk.v2.model.WorkitemDateBasedRuleUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemManualAssign;
import com.mypurecloud.sdk.v2.model.WorkitemOnAttributeChangeRule;
import com.mypurecloud.sdk.v2.model.WorkitemOnAttributeChangeRuleCreate;
import com.mypurecloud.sdk.v2.model.WorkitemOnAttributeChangeRuleListing;
import com.mypurecloud.sdk.v2.model.WorkitemOnAttributeChangeRuleUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemOnCreateRule;
import com.mypurecloud.sdk.v2.model.WorkitemOnCreateRuleCreate;
import com.mypurecloud.sdk.v2.model.WorkitemOnCreateRuleListing;
import com.mypurecloud.sdk.v2.model.WorkitemOnCreateRuleUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemPagedEntityListing;
import com.mypurecloud.sdk.v2.model.WorkitemPostQueryEntityListing;
import com.mypurecloud.sdk.v2.model.WorkitemQueryJobCreate;
import com.mypurecloud.sdk.v2.model.WorkitemQueryJobResponse;
import com.mypurecloud.sdk.v2.model.WorkitemQueryPostRequest;
import com.mypurecloud.sdk.v2.model.WorkitemStatus;
import com.mypurecloud.sdk.v2.model.WorkitemStatusCreate;
import com.mypurecloud.sdk.v2.model.WorkitemStatusListing;
import com.mypurecloud.sdk.v2.model.WorkitemStatusUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemTerminate;
import com.mypurecloud.sdk.v2.model.WorkitemUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemVersion;
import com.mypurecloud.sdk.v2.model.WorkitemVersionListing;
import com.mypurecloud.sdk.v2.model.WorkitemWrapupEntityListing;
import com.mypurecloud.sdk.v2.model.WorkitemWrapupUpdate;
import com.mypurecloud.sdk.v2.model.Worktype;
import com.mypurecloud.sdk.v2.model.WorktypeChangeListing;
import com.mypurecloud.sdk.v2.model.WorktypeCreate;
import com.mypurecloud.sdk.v2.model.WorktypeQueryEntityListing;
import com.mypurecloud.sdk.v2.model.WorktypeQueryRequest;
import com.mypurecloud.sdk.v2.model.WorktypeUpdate;
import com.mypurecloud.sdk.v2.model.WorktypeVersion;
import com.mypurecloud.sdk.v2.model.WorktypeVersionListing;

public class GetTaskmanagementWorkbinRequest {

	private String workbinId;
	public String getWorkbinId() {
		return this.workbinId;
	}

	public void setWorkbinId(String workbinId) {
		this.workbinId = workbinId;
	}

	public GetTaskmanagementWorkbinRequest withWorkbinId(String workbinId) {
	    this.setWorkbinId(workbinId);
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

    public GetTaskmanagementWorkbinRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'workbinId' is set
        if (this.workbinId == null) {
            throw new IllegalStateException("Missing the required parameter 'workbinId' when building request for GetTaskmanagementWorkbinRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/taskmanagement/workbins/{workbinId}")
                .withPathParameter("workbinId", workbinId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String workbinId) {
	    return new Builder()
	            .withRequiredParams(workbinId);
	}


	public static class Builder {
		private final GetTaskmanagementWorkbinRequest request;

		private Builder() {
			request = new GetTaskmanagementWorkbinRequest();
		}


		public Builder withWorkbinId(String workbinId) {
			request.setWorkbinId(workbinId);
			return this;
		}



		public Builder withRequiredParams(String workbinId) {
			request.setWorkbinId(workbinId);

			return this;
		}


		public GetTaskmanagementWorkbinRequest build() {
            
            // verify the required parameter 'workbinId' is set
            if (request.workbinId == null) {
                throw new IllegalStateException("Missing the required parameter 'workbinId' when building request for GetTaskmanagementWorkbinRequest.");
            }
            
			return request;
		}
	}
}
