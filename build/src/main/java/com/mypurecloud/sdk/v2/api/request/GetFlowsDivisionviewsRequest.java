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

public class GetFlowsDivisionviewsRequest {
    
	private List<String> type;
	public List<String> getType() {
		return this.type;
	}

	public void setType(List<String> type) {
		this.type = type;
	}

	public GetFlowsDivisionviewsRequest withType(List<String> type) {
	    this.setType(type);
	    return this;
	} 

	public enum typeValues { 
		BOT("bot"), 
		COMMONMODULE("commonmodule"), 
		INBOUNDCALL("inboundcall"), 
		INBOUNDCHAT("inboundchat"), 
		INBOUNDEMAIL("inboundemail"), 
		INBOUNDSHORTMESSAGE("inboundshortmessage"), 
		OUTBOUNDCALL("outboundcall"), 
		INQUEUECALL("inqueuecall"), 
		INQUEUEEMAIL("inqueueemail"), 
		INQUEUESHORTMESSAGE("inqueueshortmessage"), 
		SPEECH("speech"), 
		SECURECALL("securecall"), 
		SURVEYINVITE("surveyinvite"), 
		VOICEMAIL("voicemail"), 
		WORKFLOW("workflow"), 
		WORKITEM("workitem");

		private String value;

		typeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static typeValues fromString(String key) {
			if (key == null) return null;

			for (typeValues value : typeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return typeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetFlowsDivisionviewsRequest withPageNumber(Integer pageNumber) {
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

	public GetFlowsDivisionviewsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetFlowsDivisionviewsRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 
	
	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetFlowsDivisionviewsRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 
	
	private List<String> id;
	public List<String> getId() {
		return this.id;
	}

	public void setId(List<String> id) {
		this.id = id;
	}

	public GetFlowsDivisionviewsRequest withId(List<String> id) {
	    this.setId(id);
	    return this;
	} 
	
	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetFlowsDivisionviewsRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 
	
	private String publishVersionId;
	public String getPublishVersionId() {
		return this.publishVersionId;
	}

	public void setPublishVersionId(String publishVersionId) {
		this.publishVersionId = publishVersionId;
	}

	public GetFlowsDivisionviewsRequest withPublishVersionId(String publishVersionId) {
	    this.setPublishVersionId(publishVersionId);
	    return this;
	} 
	
	private String publishedAfter;
	public String getPublishedAfter() {
		return this.publishedAfter;
	}

	public void setPublishedAfter(String publishedAfter) {
		this.publishedAfter = publishedAfter;
	}

	public GetFlowsDivisionviewsRequest withPublishedAfter(String publishedAfter) {
	    this.setPublishedAfter(publishedAfter);
	    return this;
	} 
	
	private String publishedBefore;
	public String getPublishedBefore() {
		return this.publishedBefore;
	}

	public void setPublishedBefore(String publishedBefore) {
		this.publishedBefore = publishedBefore;
	}

	public GetFlowsDivisionviewsRequest withPublishedBefore(String publishedBefore) {
	    this.setPublishedBefore(publishedBefore);
	    return this;
	} 
	
	private List<String> divisionId;
	public List<String> getDivisionId() {
		return this.divisionId;
	}

	public void setDivisionId(List<String> divisionId) {
		this.divisionId = divisionId;
	}

	public GetFlowsDivisionviewsRequest withDivisionId(List<String> divisionId) {
	    this.setDivisionId(divisionId);
	    return this;
	} 
	
	private Boolean includeSchemas;
	public Boolean getIncludeSchemas() {
		return this.includeSchemas;
	}

	public void setIncludeSchemas(Boolean includeSchemas) {
		this.includeSchemas = includeSchemas;
	}

	public GetFlowsDivisionviewsRequest withIncludeSchemas(Boolean includeSchemas) {
	    this.setIncludeSchemas(includeSchemas);
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

    public GetFlowsDivisionviewsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/flows/divisionviews")
                .withQueryParameters("type", "multi", type)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("sortOrder", "", sortOrder)
        
                .withQueryParameters("id", "multi", id)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("publishVersionId", "", publishVersionId)
        
                .withQueryParameters("publishedAfter", "", publishedAfter)
        
                .withQueryParameters("publishedBefore", "", publishedBefore)
        
                .withQueryParameters("divisionId", "multi", divisionId)
        
                .withQueryParameters("includeSchemas", "", includeSchemas)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	

	public static class Builder {
		private final GetFlowsDivisionviewsRequest request;

		private Builder() {
			request = new GetFlowsDivisionviewsRequest();
		}

		
		public Builder withType(List<String> type) {
			request.setType(type);
			return this;
		}

		public Builder withTypeEnumValues(List<typeValues> type) {
		    List<String> stringList = new ArrayList<>();
	      for (typeValues e : type) {
	        stringList.add(e.toString());
	      }
	      request.setType(stringList);
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
		
		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}
		
		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}
		
		public Builder withId(List<String> id) {
			request.setId(id);
			return this;
		}
		
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		
		public Builder withPublishVersionId(String publishVersionId) {
			request.setPublishVersionId(publishVersionId);
			return this;
		}
		
		public Builder withPublishedAfter(String publishedAfter) {
			request.setPublishedAfter(publishedAfter);
			return this;
		}
		
		public Builder withPublishedBefore(String publishedBefore) {
			request.setPublishedBefore(publishedBefore);
			return this;
		}
		
		public Builder withDivisionId(List<String> divisionId) {
			request.setDivisionId(divisionId);
			return this;
		}
		
		public Builder withIncludeSchemas(Boolean includeSchemas) {
			request.setIncludeSchemas(includeSchemas);
			return this;
		}
		

		

		public GetFlowsDivisionviewsRequest build() {
            
			return request;
		}
	}
}
