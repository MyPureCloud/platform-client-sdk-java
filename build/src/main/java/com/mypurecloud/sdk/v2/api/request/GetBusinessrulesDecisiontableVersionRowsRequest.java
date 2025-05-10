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

public class GetBusinessrulesDecisiontableVersionRowsRequest {

	private String tableId;
	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public GetBusinessrulesDecisiontableVersionRowsRequest withTableId(String tableId) {
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

	public GetBusinessrulesDecisiontableVersionRowsRequest withTableVersion(Integer tableVersion) {
	    this.setTableVersion(tableVersion);
	    return this;
	} 

	private String pageNumber;
	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetBusinessrulesDecisiontableVersionRowsRequest withPageNumber(String pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 

	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public GetBusinessrulesDecisiontableVersionRowsRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
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

    public GetBusinessrulesDecisiontableVersionRowsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'tableId' is set
        if (this.tableId == null) {
            throw new IllegalStateException("Missing the required parameter 'tableId' when building request for GetBusinessrulesDecisiontableVersionRowsRequest.");
        }
        
        // verify the required parameter 'tableVersion' is set
        if (this.tableVersion == null) {
            throw new IllegalStateException("Missing the required parameter 'tableVersion' when building request for GetBusinessrulesDecisiontableVersionRowsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/businessrules/decisiontables/{tableId}/versions/{tableVersion}/rows")
                .withPathParameter("tableId", tableId)
        
                .withPathParameter("tableVersion", tableVersion)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("pageSize", "", pageSize)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String tableId, Integer tableVersion) {
	    return new Builder()
	            .withRequiredParams(tableId, tableVersion);
	}


	public static class Builder {
		private final GetBusinessrulesDecisiontableVersionRowsRequest request;

		private Builder() {
			request = new GetBusinessrulesDecisiontableVersionRowsRequest();
		}


		public Builder withTableId(String tableId) {
			request.setTableId(tableId);
			return this;
		}

		public Builder withTableVersion(Integer tableVersion) {
			request.setTableVersion(tableVersion);
			return this;
		}

		public Builder withPageNumber(String pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}

		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}



		public Builder withRequiredParams(String tableId, Integer tableVersion) {
			request.setTableId(tableId);
			request.setTableVersion(tableVersion);

			return this;
		}


		public GetBusinessrulesDecisiontableVersionRowsRequest build() {
            
            // verify the required parameter 'tableId' is set
            if (request.tableId == null) {
                throw new IllegalStateException("Missing the required parameter 'tableId' when building request for GetBusinessrulesDecisiontableVersionRowsRequest.");
            }
            
            // verify the required parameter 'tableVersion' is set
            if (request.tableVersion == null) {
                throw new IllegalStateException("Missing the required parameter 'tableVersion' when building request for GetBusinessrulesDecisiontableVersionRowsRequest.");
            }
            
			return request;
		}
	}
}
