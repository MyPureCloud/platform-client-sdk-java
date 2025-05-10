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

import com.mypurecloud.sdk.v2.model.CopyDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CoretypeListing;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.DecisionTable;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionRequest;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionResponse;
import com.mypurecloud.sdk.v2.model.DecisionTableListing;
import com.mypurecloud.sdk.v2.model.DecisionTableRow;
import com.mypurecloud.sdk.v2.model.DecisionTableRowListing;
import com.mypurecloud.sdk.v2.model.DecisionTableVersion;
import com.mypurecloud.sdk.v2.model.DecisionTableVersionListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.SearchDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableVersionRequest;

public class PatchBusinessrulesDecisiontableVersionRequest {

	private String tableId;
	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public PatchBusinessrulesDecisiontableVersionRequest withTableId(String tableId) {
	    this.setTableId(tableId);
	    return this;
	} 

	private Integer tableVersion;
	public Integer getTableVersion() {
		return this.tableVersion;
	}

	public void setTableVersion(Integer tableVersion) {
		this.tableVersion = tableVersion;
	}

	public PatchBusinessrulesDecisiontableVersionRequest withTableVersion(Integer tableVersion) {
	    this.setTableVersion(tableVersion);
	    return this;
	} 

	private UpdateDecisionTableVersionRequest body;
	public UpdateDecisionTableVersionRequest getBody() {
		return this.body;
	}

	public void setBody(UpdateDecisionTableVersionRequest body) {
		this.body = body;
	}

	public PatchBusinessrulesDecisiontableVersionRequest withBody(UpdateDecisionTableVersionRequest body) {
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

    public PatchBusinessrulesDecisiontableVersionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<UpdateDecisionTableVersionRequest> withHttpInfo() {
        
        // verify the required parameter 'tableId' is set
        if (this.tableId == null) {
            throw new IllegalStateException("Missing the required parameter 'tableId' when building request for PatchBusinessrulesDecisiontableVersionRequest.");
        }
        
        // verify the required parameter 'tableVersion' is set
        if (this.tableVersion == null) {
            throw new IllegalStateException("Missing the required parameter 'tableVersion' when building request for PatchBusinessrulesDecisiontableVersionRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchBusinessrulesDecisiontableVersionRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}")
                .withPathParameter("tableId", tableId)
        
                .withPathParameter("tableVersion", tableVersion)
        
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


	public static Builder builder(String tableId, Integer tableVersion, UpdateDecisionTableVersionRequest body) {
	    return new Builder()
	            .withRequiredParams(tableId, tableVersion, body);
	}


	public static class Builder {
		private final PatchBusinessrulesDecisiontableVersionRequest request;

		private Builder() {
			request = new PatchBusinessrulesDecisiontableVersionRequest();
		}


		public Builder withTableId(String tableId) {
			request.setTableId(tableId);
			return this;
		}

		public Builder withTableVersion(Integer tableVersion) {
			request.setTableVersion(tableVersion);
			return this;
		}

		public Builder withBody(UpdateDecisionTableVersionRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String tableId, Integer tableVersion, UpdateDecisionTableVersionRequest body) {
			request.setTableId(tableId);
			request.setTableVersion(tableVersion);
			request.setBody(body);

			return this;
		}


		public PatchBusinessrulesDecisiontableVersionRequest build() {
            
            // verify the required parameter 'tableId' is set
            if (request.tableId == null) {
                throw new IllegalStateException("Missing the required parameter 'tableId' when building request for PatchBusinessrulesDecisiontableVersionRequest.");
            }
            
            // verify the required parameter 'tableVersion' is set
            if (request.tableVersion == null) {
                throw new IllegalStateException("Missing the required parameter 'tableVersion' when building request for PatchBusinessrulesDecisiontableVersionRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchBusinessrulesDecisiontableVersionRequest.");
            }
            
			return request;
		}
	}
}
