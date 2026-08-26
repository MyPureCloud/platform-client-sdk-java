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

import com.mypurecloud.sdk.v2.model.BulkAddDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.BulkAddDecisionTableRowsResponse;
import com.mypurecloud.sdk.v2.model.BulkDeleteDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.BulkUpdateDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.BulkUpdateDecisionTableRowsResponse;
import com.mypurecloud.sdk.v2.model.BusinessRulesDataSchema;
import com.mypurecloud.sdk.v2.model.BusinessRulesDataSchemaListing;
import com.mypurecloud.sdk.v2.model.BusinessRulesSchemaCreateRequest;
import com.mypurecloud.sdk.v2.model.BusinessRulesSchemaUpdateRequest;
import com.mypurecloud.sdk.v2.model.CopyDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CoretypeListing;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableImportJobRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableSnapshotRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableVersionRequest;
import com.mypurecloud.sdk.v2.model.DecisionTable;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionRequest;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionResponse;
import com.mypurecloud.sdk.v2.model.DecisionTableExportJob;
import com.mypurecloud.sdk.v2.model.DecisionTableExportJobListing;
import com.mypurecloud.sdk.v2.model.DecisionTableExportJobRequest;
import com.mypurecloud.sdk.v2.model.DecisionTableImportJob;
import com.mypurecloud.sdk.v2.model.DecisionTableImportJobListing;
import com.mypurecloud.sdk.v2.model.DecisionTableListing;
import com.mypurecloud.sdk.v2.model.DecisionTableRow;
import com.mypurecloud.sdk.v2.model.DecisionTableRowListing;
import com.mypurecloud.sdk.v2.model.DecisionTableVersion;
import com.mypurecloud.sdk.v2.model.DecisionTableVersionListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.PutDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.RollbackDecisionTableVersionRequest;
import com.mypurecloud.sdk.v2.model.SearchDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableImportJobRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableVersionRequest;

public class GetBusinessrulesDecisiontableVersionsRequest {

	private String tableId;
	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public GetBusinessrulesDecisiontableVersionsRequest withTableId(String tableId) {
	    this.setTableId(tableId);
	    return this;
	} 

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetBusinessrulesDecisiontableVersionsRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public GetBusinessrulesDecisiontableVersionsRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private List<String> status;
	public List<String> getStatus() {
		return this.status;
	}

	public void setStatus(List<String> status) {
		this.status = status;
	}

	public GetBusinessrulesDecisiontableVersionsRequest withStatus(List<String> status) {
	    this.setStatus(status);
	    return this;
	} 

	public enum statusValues { 
		DRAFT("Draft"),
		PUBLISHED("Published"),
		ERROR("Error"),
		PREPARING("Preparing"),
		SUPERSEDED("Superseded");

		private String value;

		statusValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static statusValues fromString(String key) {
			if (key == null) return null;

			for (statusValues value : statusValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return statusValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

	}

	private Boolean hasSnapshot;
	public Boolean getHasSnapshot() {
		return this.hasSnapshot;
	}

	public void setHasSnapshot(Boolean hasSnapshot) {
		this.hasSnapshot = hasSnapshot;
	}

	public GetBusinessrulesDecisiontableVersionsRequest withHasSnapshot(Boolean hasSnapshot) {
	    this.setHasSnapshot(hasSnapshot);
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

    public GetBusinessrulesDecisiontableVersionsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'tableId' is set
        if (this.tableId == null) {
            throw new IllegalStateException("Missing the required parameter 'tableId' when building request for GetBusinessrulesDecisiontableVersionsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/businessrules/decisiontables/{tableId}/versions")
                .withPathParameter("tableId", tableId)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("status", "multi", status)
        

                .withQueryParameters("hasSnapshot", "", hasSnapshot)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String tableId) {
	    return new Builder()
	            .withRequiredParams(tableId);
	}


	public static class Builder {
		private final GetBusinessrulesDecisiontableVersionsRequest request;

		private Builder() {
			request = new GetBusinessrulesDecisiontableVersionsRequest();
		}


		public Builder withTableId(String tableId) {
			request.setTableId(tableId);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withStatus(List<String> status) {
			request.setStatus(status);
			return this;
		}



		public Builder withStatusEnumValues(List<statusValues> status) {
		    List<String> stringList = new ArrayList<>();
	      for (statusValues e : status) {
	        stringList.add(e.toString());
	      }
	      request.setStatus(stringList);
		    return this;
		}

		public Builder withHasSnapshot(Boolean hasSnapshot) {
			request.setHasSnapshot(hasSnapshot);
			return this;
		}



		public Builder withRequiredParams(String tableId) {
			request.setTableId(tableId);

			return this;
		}


		public GetBusinessrulesDecisiontableVersionsRequest build() {
            
            // verify the required parameter 'tableId' is set
            if (request.tableId == null) {
                throw new IllegalStateException("Missing the required parameter 'tableId' when building request for GetBusinessrulesDecisiontableVersionsRequest.");
            }
            
			return request;
		}
	}
}
