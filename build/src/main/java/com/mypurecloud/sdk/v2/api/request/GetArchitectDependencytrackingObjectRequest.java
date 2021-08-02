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

public class GetArchitectDependencytrackingObjectRequest {
    
	private String id;
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GetArchitectDependencytrackingObjectRequest withId(String id) {
	    this.setId(id);
	    return this;
	} 
	
	private String version;
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public GetArchitectDependencytrackingObjectRequest withVersion(String version) {
	    this.setVersion(version);
	    return this;
	} 
	
	private String objectType;
	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public GetArchitectDependencytrackingObjectRequest withObjectType(String objectType) {
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
	
	private Boolean consumedResources;
	public Boolean getConsumedResources() {
		return this.consumedResources;
	}

	public void setConsumedResources(Boolean consumedResources) {
		this.consumedResources = consumedResources;
	}

	public GetArchitectDependencytrackingObjectRequest withConsumedResources(Boolean consumedResources) {
	    this.setConsumedResources(consumedResources);
	    return this;
	} 
	
	private Boolean consumingResources;
	public Boolean getConsumingResources() {
		return this.consumingResources;
	}

	public void setConsumingResources(Boolean consumingResources) {
		this.consumingResources = consumingResources;
	}

	public GetArchitectDependencytrackingObjectRequest withConsumingResources(Boolean consumingResources) {
	    this.setConsumingResources(consumingResources);
	    return this;
	} 
	
	private List<String> consumedResourceType;
	public List<String> getConsumedResourceType() {
		return this.consumedResourceType;
	}

	public void setConsumedResourceType(List<String> consumedResourceType) {
		this.consumedResourceType = consumedResourceType;
	}

	public GetArchitectDependencytrackingObjectRequest withConsumedResourceType(List<String> consumedResourceType) {
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
	
	private List<String> consumingResourceType;
	public List<String> getConsumingResourceType() {
		return this.consumingResourceType;
	}

	public void setConsumingResourceType(List<String> consumingResourceType) {
		this.consumingResourceType = consumingResourceType;
	}

	public GetArchitectDependencytrackingObjectRequest withConsumingResourceType(List<String> consumingResourceType) {
	    this.setConsumingResourceType(consumingResourceType);
	    return this;
	} 

	public enum consumingResourceTypeValues { 
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

		consumingResourceTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static consumingResourceTypeValues fromString(String key) {
			if (key == null) return null;

			for (consumingResourceTypeValues value : consumingResourceTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return consumingResourceTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private Boolean consumedResourceRequest;
	public Boolean getConsumedResourceRequest() {
		return this.consumedResourceRequest;
	}

	public void setConsumedResourceRequest(Boolean consumedResourceRequest) {
		this.consumedResourceRequest = consumedResourceRequest;
	}

	public GetArchitectDependencytrackingObjectRequest withConsumedResourceRequest(Boolean consumedResourceRequest) {
	    this.setConsumedResourceRequest(consumedResourceRequest);
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

    public GetArchitectDependencytrackingObjectRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'id' is set
        if (this.id == null) {
            throw new IllegalStateException("Missing the required parameter 'id' when building request for GetArchitectDependencytrackingObjectRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/architect/dependencytracking/object")
                .withQueryParameters("id", "", id)
        
                .withQueryParameters("version", "", version)
        
                .withQueryParameters("objectType", "", objectType)
        
                .withQueryParameters("consumedResources", "", consumedResources)
        
                .withQueryParameters("consumingResources", "", consumingResources)
        
                .withQueryParameters("consumedResourceType", "multi", consumedResourceType)
        
                .withQueryParameters("consumingResourceType", "multi", consumingResourceType)
        
                .withQueryParameters("consumedResourceRequest", "", consumedResourceRequest)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String id) {
	    return new Builder()
	            .withRequiredParams(id);
	}
	

	public static class Builder {
		private final GetArchitectDependencytrackingObjectRequest request;

		private Builder() {
			request = new GetArchitectDependencytrackingObjectRequest();
		}

		
		public Builder withId(String id) {
			request.setId(id);
			return this;
		}
		
		public Builder withVersion(String version) {
			request.setVersion(version);
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
		
		public Builder withConsumedResources(Boolean consumedResources) {
			request.setConsumedResources(consumedResources);
			return this;
		}
		
		public Builder withConsumingResources(Boolean consumingResources) {
			request.setConsumingResources(consumingResources);
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
		
		public Builder withConsumingResourceType(List<String> consumingResourceType) {
			request.setConsumingResourceType(consumingResourceType);
			return this;
		}

		public Builder withConsumingResourceTypeEnumValues(List<consumingResourceTypeValues> consumingResourceType) {
		    List<String> stringList = new ArrayList<>();
	      for (consumingResourceTypeValues e : consumingResourceType) {
	        stringList.add(e.toString());
	      }
	      request.setConsumingResourceType(stringList);
		    return this;
		}
		
		public Builder withConsumedResourceRequest(Boolean consumedResourceRequest) {
			request.setConsumedResourceRequest(consumedResourceRequest);
			return this;
		}
		

		
		public Builder withRequiredParams(String id) {
			request.setId(id);
			
			return this;
		}
		

		public GetArchitectDependencytrackingObjectRequest build() {
            
            // verify the required parameter 'id' is set
            if (request.id == null) {
                throw new IllegalStateException("Missing the required parameter 'id' when building request for GetArchitectDependencytrackingObjectRequest.");
            }
            
			return request;
		}
	}
}
