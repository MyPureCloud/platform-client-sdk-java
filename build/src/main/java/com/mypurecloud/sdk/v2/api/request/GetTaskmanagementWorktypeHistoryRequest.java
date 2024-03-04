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

public class GetTaskmanagementWorktypeHistoryRequest {

	private String worktypeId;
	public String getWorktypeId() {
		return this.worktypeId;
	}

	public void setWorktypeId(String worktypeId) {
		this.worktypeId = worktypeId;
	}

	public GetTaskmanagementWorktypeHistoryRequest withWorktypeId(String worktypeId) {
	    this.setWorktypeId(worktypeId);
	    return this;
	} 

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetTaskmanagementWorktypeHistoryRequest withAfter(String after) {
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

	public GetTaskmanagementWorktypeHistoryRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetTaskmanagementWorktypeHistoryRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 

	public enum sortOrderValues { 
		ASCENDING("ascending"),
		DESCENDING("descending");

		private String value;

		sortOrderValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static sortOrderValues fromString(String key) {
			if (key == null) return null;

			for (sortOrderValues value : sortOrderValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return sortOrderValues.values()[0];
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

    public GetTaskmanagementWorktypeHistoryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'worktypeId' is set
        if (this.worktypeId == null) {
            throw new IllegalStateException("Missing the required parameter 'worktypeId' when building request for GetTaskmanagementWorktypeHistoryRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/taskmanagement/worktypes/{worktypeId}/history")
                .withPathParameter("worktypeId", worktypeId)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String worktypeId) {
	    return new Builder()
	            .withRequiredParams(worktypeId);
	}


	public static class Builder {
		private final GetTaskmanagementWorktypeHistoryRequest request;

		private Builder() {
			request = new GetTaskmanagementWorktypeHistoryRequest();
		}


		public Builder withWorktypeId(String worktypeId) {
			request.setWorktypeId(worktypeId);
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

		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}



		
		public Builder withSortOrder(sortOrderValues sortOrder) {
		    request.setSortOrder(sortOrder.toString());

		    return this;
		}



		public Builder withRequiredParams(String worktypeId) {
			request.setWorktypeId(worktypeId);

			return this;
		}


		public GetTaskmanagementWorktypeHistoryRequest build() {
            
            // verify the required parameter 'worktypeId' is set
            if (request.worktypeId == null) {
                throw new IllegalStateException("Missing the required parameter 'worktypeId' when building request for GetTaskmanagementWorktypeHistoryRequest.");
            }
            
			return request;
		}
	}
}
