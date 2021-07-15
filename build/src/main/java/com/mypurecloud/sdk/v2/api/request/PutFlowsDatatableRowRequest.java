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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.DependencyObjectEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyStatus;
import com.mypurecloud.sdk.v2.model.ConsumedResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.ConsumingResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyObject;
import com.mypurecloud.sdk.v2.model.DependencyType;
import com.mypurecloud.sdk.v2.model.DependencyTypeEntityListing;
import com.mypurecloud.sdk.v2.model.EmergencyGroup;
import com.mypurecloud.sdk.v2.model.EmergencyGroupListing;
import com.mypurecloud.sdk.v2.model.IVR;
import com.mypurecloud.sdk.v2.model.IVREntityListing;
import com.mypurecloud.sdk.v2.model.Prompt;
import com.mypurecloud.sdk.v2.model.HistoryListing;
import com.mypurecloud.sdk.v2.model.PromptAsset;
import com.mypurecloud.sdk.v2.model.PromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.PromptEntityListing;
import com.mypurecloud.sdk.v2.model.Schedule;
import com.mypurecloud.sdk.v2.model.ScheduleGroup;
import com.mypurecloud.sdk.v2.model.ScheduleGroupEntityListing;
import com.mypurecloud.sdk.v2.model.ScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPrompt;
import com.mypurecloud.sdk.v2.model.SystemPromptAsset;
import com.mypurecloud.sdk.v2.model.SystemPromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPromptEntityListing;
import com.mypurecloud.sdk.v2.model.Flow;
import com.mypurecloud.sdk.v2.model.FlowVersion;
import com.mypurecloud.sdk.v2.model.FlowVersionEntityListing;
import com.mypurecloud.sdk.v2.model.FlowEntityListing;
import com.mypurecloud.sdk.v2.model.DataTable;
import com.mypurecloud.sdk.v2.model.DataTableExportJob;
import com.mypurecloud.sdk.v2.model.DataTableImportJob;
import com.mypurecloud.sdk.v2.model.DataTableImportEntityListing;
import com.mypurecloud.sdk.v2.model.DataTableRowEntityListing;
import com.mypurecloud.sdk.v2.model.DataTablesDomainEntityListing;
import com.mypurecloud.sdk.v2.model.FlowDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.FlowRuntimeExecution;
import com.mypurecloud.sdk.v2.model.FlowMilestone;
import com.mypurecloud.sdk.v2.model.FlowMilestoneListing;
import com.mypurecloud.sdk.v2.model.FlowMilestoneDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.FlowOutcome;
import com.mypurecloud.sdk.v2.model.FlowOutcomeListing;
import com.mypurecloud.sdk.v2.model.FlowOutcomeDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.PromptAssetCreate;
import com.mypurecloud.sdk.v2.model.FlowExecutionLaunchResponse;
import com.mypurecloud.sdk.v2.model.FlowExecutionLaunchRequest;

public class PutFlowsDatatableRowRequest {
    
	private String datatableId;
	public String getDatatableId() {
		return this.datatableId;
	}

	public void setDatatableId(String datatableId) {
		this.datatableId = datatableId;
	}

	public PutFlowsDatatableRowRequest withDatatableId(String datatableId) {
	    this.setDatatableId(datatableId);
	    return this;
	} 
	
	private String rowId;
	public String getRowId() {
		return this.rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public PutFlowsDatatableRowRequest withRowId(String rowId) {
	    this.setRowId(rowId);
	    return this;
	} 
	
	private Object body;
	public Object getBody() {
		return this.body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public PutFlowsDatatableRowRequest withBody(Object body) {
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

    public PutFlowsDatatableRowRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Object> withHttpInfo() {
        
        // verify the required parameter 'datatableId' is set
        if (this.datatableId == null) {
            throw new IllegalStateException("Missing the required parameter 'datatableId' when building request for PutFlowsDatatableRowRequest.");
        }
        
        // verify the required parameter 'rowId' is set
        if (this.rowId == null) {
            throw new IllegalStateException("Missing the required parameter 'rowId' when building request for PutFlowsDatatableRowRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/flows/datatables/{datatableId}/rows/{rowId}")
                .withPathParameter("datatableId", datatableId)
        
                .withPathParameter("rowId", rowId)
        
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

	
	public static Builder builder(String datatableId, String rowId) {
	    return new Builder()
	            .withRequiredParams(datatableId, rowId);
	}
	

	public static class Builder {
		private final PutFlowsDatatableRowRequest request;

		private Builder() {
			request = new PutFlowsDatatableRowRequest();
		}

		
		public Builder withDatatableId(String datatableId) {
			request.setDatatableId(datatableId);
			return this;
		}
		
		public Builder withRowId(String rowId) {
			request.setRowId(rowId);
			return this;
		}
		
		public Builder withBody(Object body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String datatableId, String rowId) {
			request.setDatatableId(datatableId);
						request.setRowId(rowId);
			
			return this;
		}
		

		public PutFlowsDatatableRowRequest build() {
            
            // verify the required parameter 'datatableId' is set
            if (request.datatableId == null) {
                throw new IllegalStateException("Missing the required parameter 'datatableId' when building request for PutFlowsDatatableRowRequest.");
            }
            
            // verify the required parameter 'rowId' is set
            if (request.rowId == null) {
                throw new IllegalStateException("Missing the required parameter 'rowId' when building request for PutFlowsDatatableRowRequest.");
            }
            
			return request;
		}
	}
}
