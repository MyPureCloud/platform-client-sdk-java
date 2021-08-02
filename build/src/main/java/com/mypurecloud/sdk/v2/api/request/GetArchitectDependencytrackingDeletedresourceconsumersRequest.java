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

public class GetArchitectDependencytrackingDeletedresourceconsumersRequest {
    
	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetArchitectDependencytrackingDeletedresourceconsumersRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 
	
	private List<String> objectType;
	public List<String> getObjectType() {
		return this.objectType;
	}

	public void setObjectType(List<String> objectType) {
		this.objectType = objectType;
	}

	public GetArchitectDependencytrackingDeletedresourceconsumersRequest withObjectType(List<String> objectType) {
	    this.setObjectType(objectType);
	    return this;
	} 

	public enum objectTypeValues { 
		ACDLANGUAGE("ACDLANGUAGE"), 
		ACDSKILL("ACDSKILL"), 
		ACDWRAPUPCODE("ACDWRAPUPCODE"), 
		BOTCONNECTORBOT("BOTCONNECTORBOT"), 
		BOTCONNECTORINTEGRATION("BOTCONNECTORINTEGRATION"), 
		BOTFLOW("BOTFLOW"), 
		BRIDGEACTION("BRIDGEACTION"), 
		COMMONMODULEFLOW("COMMONMODULEFLOW"), 
		COMPOSERSCRIPT("COMPOSERSCRIPT"), 
		CONTACTLIST("CONTACTLIST"), 
		DATAACTION("DATAACTION"), 
		DATATABLE("DATATABLE"), 
		DIALOGENGINEBOT("DIALOGENGINEBOT"), 
		DIALOGENGINEBOTVERSION("DIALOGENGINEBOTVERSION"), 
		DIALOGFLOWAGENT("DIALOGFLOWAGENT"), 
		DIALOGFLOWCXAGENT("DIALOGFLOWCXAGENT"), 
		EMAILROUTE("EMAILROUTE"), 
		EMERGENCYGROUP("EMERGENCYGROUP"), 
		FLOWACTION("FLOWACTION"), 
		FLOWDATATYPE("FLOWDATATYPE"), 
		FLOWMILESTONE("FLOWMILESTONE"), 
		FLOWOUTCOME("FLOWOUTCOME"), 
		GROUP("GROUP"), 
		INBOUNDCALLFLOW("INBOUNDCALLFLOW"), 
		INBOUNDCHATFLOW("INBOUNDCHATFLOW"), 
		INBOUNDEMAILFLOW("INBOUNDEMAILFLOW"), 
		INBOUNDSHORTMESSAGEFLOW("INBOUNDSHORTMESSAGEFLOW"), 
		INQUEUECALLFLOW("INQUEUECALLFLOW"), 
		INQUEUEEMAILFLOW("INQUEUEEMAILFLOW"), 
		INQUEUESHORTMESSAGEFLOW("INQUEUESHORTMESSAGEFLOW"), 
		IVRCONFIGURATION("IVRCONFIGURATION"), 
		KNOWLEDGEBASE("KNOWLEDGEBASE"), 
		LANGUAGE("LANGUAGE"), 
		LEXBOT("LEXBOT"), 
		LEXBOTALIAS("LEXBOTALIAS"), 
		LEXV2BOT("LEXV2BOT"), 
		LEXV2BOTALIAS("LEXV2BOTALIAS"), 
		NLUDOMAIN("NLUDOMAIN"), 
		NUANCEMIXBOT("NUANCEMIXBOT"), 
		NUANCEMIXINTEGRATION("NUANCEMIXINTEGRATION"), 
		OUTBOUNDCALLFLOW("OUTBOUNDCALLFLOW"), 
		QUEUE("QUEUE"), 
		RECORDINGPOLICY("RECORDINGPOLICY"), 
		RESPONSE("RESPONSE"), 
		SCHEDULE("SCHEDULE"), 
		SCHEDULEGROUP("SCHEDULEGROUP"), 
		SECUREACTION("SECUREACTION"), 
		SECURECALLFLOW("SECURECALLFLOW"), 
		SURVEYINVITEFLOW("SURVEYINVITEFLOW"), 
		SYSTEMPROMPT("SYSTEMPROMPT"), 
		TTSENGINE("TTSENGINE"), 
		TTSVOICE("TTSVOICE"), 
		USER("USER"), 
		USERPROMPT("USERPROMPT"), 
		VOICEMAILFLOW("VOICEMAILFLOW"), 
		WIDGET("WIDGET"), 
		WORKFLOW("WORKFLOW"), 
		WORKITEMFLOW("WORKITEMFLOW");

		private String value;

		objectTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static objectTypeValues fromString(String key) {
			if (key == null) return null;

			for (objectTypeValues value : objectTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return objectTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String flowFilter;
	public String getFlowFilter() {
		return this.flowFilter;
	}

	public void setFlowFilter(String flowFilter) {
		this.flowFilter = flowFilter;
	}

	public GetArchitectDependencytrackingDeletedresourceconsumersRequest withFlowFilter(String flowFilter) {
	    this.setFlowFilter(flowFilter);
	    return this;
	} 

	public enum flowFilterValues { 
		CHECKEDIN("checkedIn"), 
		PUBLISHED("published");

		private String value;

		flowFilterValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static flowFilterValues fromString(String key) {
			if (key == null) return null;

			for (flowFilterValues value : flowFilterValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return flowFilterValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private Boolean consumedResources;
	public Boolean getConsumedResources() {
		return this.consumedResources;
	}

	public void setConsumedResources(Boolean consumedResources) {
		this.consumedResources = consumedResources;
	}

	public GetArchitectDependencytrackingDeletedresourceconsumersRequest withConsumedResources(Boolean consumedResources) {
	    this.setConsumedResources(consumedResources);
	    return this;
	} 
	
	private List<String> consumedResourceType;
	public List<String> getConsumedResourceType() {
		return this.consumedResourceType;
	}

	public void setConsumedResourceType(List<String> consumedResourceType) {
		this.consumedResourceType = consumedResourceType;
	}

	public GetArchitectDependencytrackingDeletedresourceconsumersRequest withConsumedResourceType(List<String> consumedResourceType) {
	    this.setConsumedResourceType(consumedResourceType);
	    return this;
	} 

	public enum consumedResourceTypeValues { 
		ACDLANGUAGE("ACDLANGUAGE"), 
		ACDSKILL("ACDSKILL"), 
		ACDWRAPUPCODE("ACDWRAPUPCODE"), 
		BOTCONNECTORBOT("BOTCONNECTORBOT"), 
		BOTCONNECTORINTEGRATION("BOTCONNECTORINTEGRATION"), 
		BOTFLOW("BOTFLOW"), 
		BRIDGEACTION("BRIDGEACTION"), 
		COMMONMODULEFLOW("COMMONMODULEFLOW"), 
		COMPOSERSCRIPT("COMPOSERSCRIPT"), 
		CONTACTLIST("CONTACTLIST"), 
		DATAACTION("DATAACTION"), 
		DATATABLE("DATATABLE"), 
		DIALOGENGINEBOT("DIALOGENGINEBOT"), 
		DIALOGENGINEBOTVERSION("DIALOGENGINEBOTVERSION"), 
		DIALOGFLOWAGENT("DIALOGFLOWAGENT"), 
		DIALOGFLOWCXAGENT("DIALOGFLOWCXAGENT"), 
		EMAILROUTE("EMAILROUTE"), 
		EMERGENCYGROUP("EMERGENCYGROUP"), 
		FLOWACTION("FLOWACTION"), 
		FLOWDATATYPE("FLOWDATATYPE"), 
		FLOWMILESTONE("FLOWMILESTONE"), 
		FLOWOUTCOME("FLOWOUTCOME"), 
		GROUP("GROUP"), 
		INBOUNDCALLFLOW("INBOUNDCALLFLOW"), 
		INBOUNDCHATFLOW("INBOUNDCHATFLOW"), 
		INBOUNDEMAILFLOW("INBOUNDEMAILFLOW"), 
		INBOUNDSHORTMESSAGEFLOW("INBOUNDSHORTMESSAGEFLOW"), 
		INQUEUECALLFLOW("INQUEUECALLFLOW"), 
		INQUEUEEMAILFLOW("INQUEUEEMAILFLOW"), 
		INQUEUESHORTMESSAGEFLOW("INQUEUESHORTMESSAGEFLOW"), 
		IVRCONFIGURATION("IVRCONFIGURATION"), 
		KNOWLEDGEBASE("KNOWLEDGEBASE"), 
		LANGUAGE("LANGUAGE"), 
		LEXBOT("LEXBOT"), 
		LEXBOTALIAS("LEXBOTALIAS"), 
		LEXV2BOT("LEXV2BOT"), 
		LEXV2BOTALIAS("LEXV2BOTALIAS"), 
		NLUDOMAIN("NLUDOMAIN"), 
		NUANCEMIXBOT("NUANCEMIXBOT"), 
		NUANCEMIXINTEGRATION("NUANCEMIXINTEGRATION"), 
		OUTBOUNDCALLFLOW("OUTBOUNDCALLFLOW"), 
		QUEUE("QUEUE"), 
		RECORDINGPOLICY("RECORDINGPOLICY"), 
		RESPONSE("RESPONSE"), 
		SCHEDULE("SCHEDULE"), 
		SCHEDULEGROUP("SCHEDULEGROUP"), 
		SECUREACTION("SECUREACTION"), 
		SECURECALLFLOW("SECURECALLFLOW"), 
		SURVEYINVITEFLOW("SURVEYINVITEFLOW"), 
		SYSTEMPROMPT("SYSTEMPROMPT"), 
		TTSENGINE("TTSENGINE"), 
		TTSVOICE("TTSVOICE"), 
		USER("USER"), 
		USERPROMPT("USERPROMPT"), 
		VOICEMAILFLOW("VOICEMAILFLOW"), 
		WIDGET("WIDGET"), 
		WORKFLOW("WORKFLOW"), 
		WORKITEMFLOW("WORKITEMFLOW");

		private String value;

		consumedResourceTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static consumedResourceTypeValues fromString(String key) {
			if (key == null) return null;

			for (consumedResourceTypeValues value : consumedResourceTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return consumedResourceTypeValues.values()[0];
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

	public GetArchitectDependencytrackingDeletedresourceconsumersRequest withPageNumber(Integer pageNumber) {
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

	public GetArchitectDependencytrackingDeletedresourceconsumersRequest withPageSize(Integer pageSize) {
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

    public GetArchitectDependencytrackingDeletedresourceconsumersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/architect/dependencytracking/deletedresourceconsumers")
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("objectType", "multi", objectType)
        
                .withQueryParameters("flowFilter", "", flowFilter)
        
                .withQueryParameters("consumedResources", "", consumedResources)
        
                .withQueryParameters("consumedResourceType", "multi", consumedResourceType)
        
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

	

	public static class Builder {
		private final GetArchitectDependencytrackingDeletedresourceconsumersRequest request;

		private Builder() {
			request = new GetArchitectDependencytrackingDeletedresourceconsumersRequest();
		}

		
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		
		public Builder withObjectType(List<String> objectType) {
			request.setObjectType(objectType);
			return this;
		}

		public Builder withObjectTypeEnumValues(List<objectTypeValues> objectType) {
		    List<String> stringList = new ArrayList<>();
	      for (objectTypeValues e : objectType) {
	        stringList.add(e.toString());
	      }
	      request.setObjectType(stringList);
		    return this;
		}
		
		public Builder withFlowFilter(String flowFilter) {
			request.setFlowFilter(flowFilter);
			return this;
		}

		public Builder withFlowFilter(flowFilterValues flowFilter) {
		    request.setFlowFilter(flowFilter.toString());
		    return this;
		}
		
		public Builder withConsumedResources(Boolean consumedResources) {
			request.setConsumedResources(consumedResources);
			return this;
		}
		
		public Builder withConsumedResourceType(List<String> consumedResourceType) {
			request.setConsumedResourceType(consumedResourceType);
			return this;
		}

		public Builder withConsumedResourceTypeEnumValues(List<consumedResourceTypeValues> consumedResourceType) {
		    List<String> stringList = new ArrayList<>();
	      for (consumedResourceTypeValues e : consumedResourceType) {
	        stringList.add(e.toString());
	      }
	      request.setConsumedResourceType(stringList);
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
		

		

		public GetArchitectDependencytrackingDeletedresourceconsumersRequest build() {
            
			return request;
		}
	}
}
