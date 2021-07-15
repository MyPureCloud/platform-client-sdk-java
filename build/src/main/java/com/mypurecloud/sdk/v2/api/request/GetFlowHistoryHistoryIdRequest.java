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

public class GetFlowHistoryHistoryIdRequest {
    
	private String flowId;
	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public GetFlowHistoryHistoryIdRequest withFlowId(String flowId) {
	    this.setFlowId(flowId);
	    return this;
	} 
	
	private String historyId;
	public String getHistoryId() {
		return this.historyId;
	}

	public void setHistoryId(String historyId) {
		this.historyId = historyId;
	}

	public GetFlowHistoryHistoryIdRequest withHistoryId(String historyId) {
	    this.setHistoryId(historyId);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetFlowHistoryHistoryIdRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetFlowHistoryHistoryIdRequest withPageSize(Integer pageSize) {
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

	public GetFlowHistoryHistoryIdRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 
	
	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetFlowHistoryHistoryIdRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	public enum sortByValues { 
		ACTION("action"), 
		TIMESTAMP("timestamp"), 
		USER("user");

		private String value;

		sortByValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static sortByValues fromString(String key) {
			if (key == null) return null;

			for (sortByValues value : sortByValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return sortByValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private List<String> action;
	public List<String> getAction() {
		return this.action;
	}

	public void setAction(List<String> action) {
		this.action = action;
	}

	public GetFlowHistoryHistoryIdRequest withAction(List<String> action) {
	    this.setAction(action);
	    return this;
	} 

	public enum actionValues { 
		CHECKIN("checkin"), 
		CHECKOUT("checkout"), 
		CREATE("create"), 
		DEACTIVATE("deactivate"), 
		DEBUG("debug"), 
		DELETE("delete"), 
		PUBLISH("publish"), 
		REVERT("revert"), 
		SAVE("save");

		private String value;

		actionValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static actionValues fromString(String key) {
			if (key == null) return null;

			for (actionValues value : actionValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return actionValues.values()[0];
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

    public GetFlowHistoryHistoryIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'flowId' is set
        if (this.flowId == null) {
            throw new IllegalStateException("Missing the required parameter 'flowId' when building request for GetFlowHistoryHistoryIdRequest.");
        }
        
        // verify the required parameter 'historyId' is set
        if (this.historyId == null) {
            throw new IllegalStateException("Missing the required parameter 'historyId' when building request for GetFlowHistoryHistoryIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/flows/{flowId}/history/{historyId}")
                .withPathParameter("flowId", flowId)
        
                .withPathParameter("historyId", historyId)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("sortOrder", "", sortOrder)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("action", "multi", action)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String flowId, String historyId) {
	    return new Builder()
	            .withRequiredParams(flowId, historyId);
	}
	

	public static class Builder {
		private final GetFlowHistoryHistoryIdRequest request;

		private Builder() {
			request = new GetFlowHistoryHistoryIdRequest();
		}

		
		public Builder withFlowId(String flowId) {
			request.setFlowId(flowId);
			return this;
		}
		
		public Builder withHistoryId(String historyId) {
			request.setHistoryId(historyId);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
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
		
		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}

		public Builder withSortBy(sortByValues sortBy) {
		    request.setSortBy(sortBy.toString());
		    return this;
		}
		
		public Builder withAction(List<String> action) {
			request.setAction(action);
			return this;
		}

		public Builder withActionEnumValues(List<actionValues> action) {
		    List<String> stringList = new ArrayList<>();
	      for (actionValues e : action) {
	        stringList.add(e.toString());
	      }
	      request.setAction(stringList);
		    return this;
		}
		

		
		public Builder withRequiredParams(String flowId, String historyId) {
			request.setFlowId(flowId);
						request.setHistoryId(historyId);
			
			return this;
		}
		

		public GetFlowHistoryHistoryIdRequest build() {
            
            // verify the required parameter 'flowId' is set
            if (request.flowId == null) {
                throw new IllegalStateException("Missing the required parameter 'flowId' when building request for GetFlowHistoryHistoryIdRequest.");
            }
            
            // verify the required parameter 'historyId' is set
            if (request.historyId == null) {
                throw new IllegalStateException("Missing the required parameter 'historyId' when building request for GetFlowHistoryHistoryIdRequest.");
            }
            
			return request;
		}
	}
}
