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

public class DeleteBusinessrulesDecisiontableExportRequest {

	private String tableId;
	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public DeleteBusinessrulesDecisiontableExportRequest withTableId(String tableId) {
	    this.setTableId(tableId);
	    return this;
	} 

	private String exportJobId;
	public String getExportJobId() {
		return this.exportJobId;
	}

	public void setExportJobId(String exportJobId) {
		this.exportJobId = exportJobId;
	}

	public DeleteBusinessrulesDecisiontableExportRequest withExportJobId(String exportJobId) {
	    this.setExportJobId(exportJobId);
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

    public DeleteBusinessrulesDecisiontableExportRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'tableId' is set
        if (this.tableId == null) {
            throw new IllegalStateException("Missing the required parameter 'tableId' when building request for DeleteBusinessrulesDecisiontableExportRequest.");
        }
        
        // verify the required parameter 'exportJobId' is set
        if (this.exportJobId == null) {
            throw new IllegalStateException("Missing the required parameter 'exportJobId' when building request for DeleteBusinessrulesDecisiontableExportRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/businessrules/decisiontables/{tableId}/exports/{exportJobId}")
                .withPathParameter("tableId", tableId)
        
                .withPathParameter("exportJobId", exportJobId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String tableId, String exportJobId) {
	    return new Builder()
	            .withRequiredParams(tableId, exportJobId);
	}


	public static class Builder {
		private final DeleteBusinessrulesDecisiontableExportRequest request;

		private Builder() {
			request = new DeleteBusinessrulesDecisiontableExportRequest();
		}


		public Builder withTableId(String tableId) {
			request.setTableId(tableId);
			return this;
		}

		public Builder withExportJobId(String exportJobId) {
			request.setExportJobId(exportJobId);
			return this;
		}



		public Builder withRequiredParams(String tableId, String exportJobId) {
			request.setTableId(tableId);
			request.setExportJobId(exportJobId);

			return this;
		}


		public DeleteBusinessrulesDecisiontableExportRequest build() {
            
            // verify the required parameter 'tableId' is set
            if (request.tableId == null) {
                throw new IllegalStateException("Missing the required parameter 'tableId' when building request for DeleteBusinessrulesDecisiontableExportRequest.");
            }
            
            // verify the required parameter 'exportJobId' is set
            if (request.exportJobId == null) {
                throw new IllegalStateException("Missing the required parameter 'exportJobId' when building request for DeleteBusinessrulesDecisiontableExportRequest.");
            }
            
			return request;
		}
	}
}
