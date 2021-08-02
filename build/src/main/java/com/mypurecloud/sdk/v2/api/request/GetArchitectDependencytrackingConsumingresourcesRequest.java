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

public class GetArchitectDependencytrackingConsumingresourcesRequest {
    
	private String id;
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GetArchitectDependencytrackingConsumingresourcesRequest withId(String id) {
	    this.setId(id);
	    return this;
	} 
	
	private String objectType;
	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public GetArchitectDependencytrackingConsumingresourcesRequest withObjectType(String objectType) {
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
	
	private List<String> resourceType;
	public List<String> getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(List<String> resourceType) {
		this.resourceType = resourceType;
	}

	public GetArchitectDependencytrackingConsumingresourcesRequest withResourceType(List<String> resourceType) {
	    this.setResourceType(resourceType);
	    return this;
	} 

	public enum resourceTypeValues { 
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

		resourceTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static resourceTypeValues fromString(String key) {
			if (key == null) return null;

			for (resourceTypeValues value : resourceTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return resourceTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String version;
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public GetArchitectDependencytrackingConsumingresourcesRequest withVersion(String version) {
	    this.setVersion(version);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetArchitectDependencytrackingConsumingresourcesRequest withPageNumber(Integer pageNumber) {
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

	public GetArchitectDependencytrackingConsumingresourcesRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private String flowFilter;
	public String getFlowFilter() {
		return this.flowFilter;
	}

	public void setFlowFilter(String flowFilter) {
		this.flowFilter = flowFilter;
	}

	public GetArchitectDependencytrackingConsumingresourcesRequest withFlowFilter(String flowFilter) {
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

    public GetArchitectDependencytrackingConsumingresourcesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'id' is set
        if (this.id == null) {
            throw new IllegalStateException("Missing the required parameter 'id' when building request for GetArchitectDependencytrackingConsumingresourcesRequest.");
        }
        
        // verify the required parameter 'objectType' is set
        if (this.objectType == null) {
            throw new IllegalStateException("Missing the required parameter 'objectType' when building request for GetArchitectDependencytrackingConsumingresourcesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/architect/dependencytracking/consumingresources")
                .withQueryParameters("id", "", id)
        
                .withQueryParameters("objectType", "", objectType)
        
                .withQueryParameters("resourceType", "multi", resourceType)
        
                .withQueryParameters("version", "", version)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("flowFilter", "", flowFilter)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String id, String objectType) {
	    return new Builder()
	            .withRequiredParams(id, objectType);
	}
	

	public static class Builder {
		private final GetArchitectDependencytrackingConsumingresourcesRequest request;

		private Builder() {
			request = new GetArchitectDependencytrackingConsumingresourcesRequest();
		}

		
		public Builder withId(String id) {
			request.setId(id);
			return this;
		}
		
		public Builder withObjectType(String objectType) {
			request.setObjectType(objectType);
			return this;
		}

		public Builder withObjectType(objectTypeValues objectType) {
		    request.setObjectType(objectType.toString());
		    return this;
		}
		
		public Builder withResourceType(List<String> resourceType) {
			request.setResourceType(resourceType);
			return this;
		}

		public Builder withResourceTypeEnumValues(List<resourceTypeValues> resourceType) {
		    List<String> stringList = new ArrayList<>();
	      for (resourceTypeValues e : resourceType) {
	        stringList.add(e.toString());
	      }
	      request.setResourceType(stringList);
		    return this;
		}
		
		public Builder withVersion(String version) {
			request.setVersion(version);
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
		
		public Builder withFlowFilter(String flowFilter) {
			request.setFlowFilter(flowFilter);
			return this;
		}

		public Builder withFlowFilter(flowFilterValues flowFilter) {
		    request.setFlowFilter(flowFilter.toString());
		    return this;
		}
		

		
		public Builder withRequiredParams(String id, String objectType) {
			request.setId(id);
						request.setObjectType(objectType);
			
			return this;
		}
		

		public GetArchitectDependencytrackingConsumingresourcesRequest build() {
            
            // verify the required parameter 'id' is set
            if (request.id == null) {
                throw new IllegalStateException("Missing the required parameter 'id' when building request for GetArchitectDependencytrackingConsumingresourcesRequest.");
            }
            
            // verify the required parameter 'objectType' is set
            if (request.objectType == null) {
                throw new IllegalStateException("Missing the required parameter 'objectType' when building request for GetArchitectDependencytrackingConsumingresourcesRequest.");
            }
            
			return request;
		}
	}
}
