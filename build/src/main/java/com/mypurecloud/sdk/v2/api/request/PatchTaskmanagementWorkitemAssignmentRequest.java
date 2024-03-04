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

import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
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
import com.mypurecloud.sdk.v2.model.WorkitemManualAssign;
import com.mypurecloud.sdk.v2.model.WorkitemPostQueryEntityListing;
import com.mypurecloud.sdk.v2.model.WorkitemQueryPostRequest;
import com.mypurecloud.sdk.v2.model.WorkitemStatus;
import com.mypurecloud.sdk.v2.model.WorkitemStatusCreate;
import com.mypurecloud.sdk.v2.model.WorkitemStatusListing;
import com.mypurecloud.sdk.v2.model.WorkitemStatusUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemTerminate;
import com.mypurecloud.sdk.v2.model.WorkitemUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemVersion;
import com.mypurecloud.sdk.v2.model.WorkitemVersionListing;
import com.mypurecloud.sdk.v2.model.WorkitemWrapup;
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

public class PatchTaskmanagementWorkitemAssignmentRequest {

	private String workitemId;
	public String getWorkitemId() {
		return this.workitemId;
	}

	public void setWorkitemId(String workitemId) {
		this.workitemId = workitemId;
	}

	public PatchTaskmanagementWorkitemAssignmentRequest withWorkitemId(String workitemId) {
	    this.setWorkitemId(workitemId);
	    return this;
	} 

	private WorkitemManualAssign body;
	public WorkitemManualAssign getBody() {
		return this.body;
	}

	public void setBody(WorkitemManualAssign body) {
		this.body = body;
	}

	public PatchTaskmanagementWorkitemAssignmentRequest withBody(WorkitemManualAssign body) {
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

    public PatchTaskmanagementWorkitemAssignmentRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<WorkitemManualAssign> withHttpInfo() {
        
        // verify the required parameter 'workitemId' is set
        if (this.workitemId == null) {
            throw new IllegalStateException("Missing the required parameter 'workitemId' when building request for PatchTaskmanagementWorkitemAssignmentRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchTaskmanagementWorkitemAssignmentRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/taskmanagement/workitems/{workitemId}/assignment")
                .withPathParameter("workitemId", workitemId)
        
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


	public static Builder builder(String workitemId, WorkitemManualAssign body) {
	    return new Builder()
	            .withRequiredParams(workitemId, body);
	}


	public static class Builder {
		private final PatchTaskmanagementWorkitemAssignmentRequest request;

		private Builder() {
			request = new PatchTaskmanagementWorkitemAssignmentRequest();
		}


		public Builder withWorkitemId(String workitemId) {
			request.setWorkitemId(workitemId);
			return this;
		}

		public Builder withBody(WorkitemManualAssign body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String workitemId, WorkitemManualAssign body) {
			request.setWorkitemId(workitemId);
			request.setBody(body);

			return this;
		}


		public PatchTaskmanagementWorkitemAssignmentRequest build() {
            
            // verify the required parameter 'workitemId' is set
            if (request.workitemId == null) {
                throw new IllegalStateException("Missing the required parameter 'workitemId' when building request for PatchTaskmanagementWorkitemAssignmentRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchTaskmanagementWorkitemAssignmentRequest.");
            }
            
			return request;
		}
	}
}
