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

import com.mypurecloud.sdk.v2.model.ArchitectExportJobStateResponse;
import com.mypurecloud.sdk.v2.model.ArchitectJobStateResponse;
import com.mypurecloud.sdk.v2.model.ConsumedResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.ConsumingResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.CriteriaQuery;
import com.mypurecloud.sdk.v2.model.DataTable;
import com.mypurecloud.sdk.v2.model.DataTableExportJob;
import com.mypurecloud.sdk.v2.model.DataTableImportEntityListing;
import com.mypurecloud.sdk.v2.model.DataTableImportJob;
import com.mypurecloud.sdk.v2.model.DataTableRowEntityListing;
import com.mypurecloud.sdk.v2.model.DataTablesDomainEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyObject;
import com.mypurecloud.sdk.v2.model.DependencyObjectEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyStatus;
import com.mypurecloud.sdk.v2.model.DependencyType;
import com.mypurecloud.sdk.v2.model.DependencyTypeEntityListing;
import com.mypurecloud.sdk.v2.model.EmergencyGroup;
import com.mypurecloud.sdk.v2.model.EmergencyGroupDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.EmergencyGroupListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExecutionDataFlowSettingsResponse;
import com.mypurecloud.sdk.v2.model.ExecutionDataRequest;
import com.mypurecloud.sdk.v2.model.ExecutionDataSettingsRequest;
import com.mypurecloud.sdk.v2.model.Flow;
import com.mypurecloud.sdk.v2.model.FlowDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.FlowEntityListing;
import com.mypurecloud.sdk.v2.model.FlowExecutionLaunchRequest;
import com.mypurecloud.sdk.v2.model.FlowExecutionLaunchResponse;
import com.mypurecloud.sdk.v2.model.FlowHealth;
import com.mypurecloud.sdk.v2.model.FlowHealthIntent;
import com.mypurecloud.sdk.v2.model.FlowHealthUtterance;
import com.mypurecloud.sdk.v2.model.FlowLogLevelCharacteristicsDefinitions;
import com.mypurecloud.sdk.v2.model.FlowLogLevelRequest;
import com.mypurecloud.sdk.v2.model.FlowMilestone;
import com.mypurecloud.sdk.v2.model.FlowMilestoneDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.FlowMilestoneListing;
import com.mypurecloud.sdk.v2.model.FlowOutcome;
import com.mypurecloud.sdk.v2.model.FlowOutcomeDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.FlowOutcomeListing;
import com.mypurecloud.sdk.v2.model.FlowResultEntityListing;
import com.mypurecloud.sdk.v2.model.FlowRuntimeExecution;
import com.mypurecloud.sdk.v2.model.FlowSettingsResponse;
import com.mypurecloud.sdk.v2.model.FlowSettingsResponseEntityListing;
import com.mypurecloud.sdk.v2.model.FlowVersion;
import com.mypurecloud.sdk.v2.model.FlowVersionEntityListing;
import com.mypurecloud.sdk.v2.model.FlowsQueryCriteriaResponse;
import com.mypurecloud.sdk.v2.model.GetFlowExecutionDataJobResult;
import com.mypurecloud.sdk.v2.model.Grammar;
import com.mypurecloud.sdk.v2.model.GrammarFileUploadRequest;
import com.mypurecloud.sdk.v2.model.GrammarLanguage;
import com.mypurecloud.sdk.v2.model.GrammarLanguageUpdate;
import com.mypurecloud.sdk.v2.model.GrammarListing;
import com.mypurecloud.sdk.v2.model.HistoryListing;
import com.mypurecloud.sdk.v2.model.IVR;
import com.mypurecloud.sdk.v2.model.IVRDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.IVREntityListing;
import com.mypurecloud.sdk.v2.model.IdentityResolutionConfig;
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.Prompt;
import com.mypurecloud.sdk.v2.model.PromptAsset;
import com.mypurecloud.sdk.v2.model.PromptAssetCreate;
import com.mypurecloud.sdk.v2.model.PromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.PromptAssetUpload;
import com.mypurecloud.sdk.v2.model.PromptEntityListing;
import com.mypurecloud.sdk.v2.model.RegisterArchitectExportJob;
import com.mypurecloud.sdk.v2.model.RegisterArchitectExportJobResponse;
import com.mypurecloud.sdk.v2.model.RegisterArchitectJobResponse;
import com.mypurecloud.sdk.v2.model.Schedule;
import com.mypurecloud.sdk.v2.model.ScheduleDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.ScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.ScheduleGroup;
import com.mypurecloud.sdk.v2.model.ScheduleGroupDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.ScheduleGroupEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPrompt;
import com.mypurecloud.sdk.v2.model.SystemPromptAsset;
import com.mypurecloud.sdk.v2.model.SystemPromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPromptEntityListing;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;

public class GetFlowsRequest {

	private List<String> type;
	public List<String> getType() {
		return this.type;
	}

	public void setType(List<String> type) {
		this.type = type;
	}

	public GetFlowsRequest withType(List<String> type) {
	    this.setType(type);
	    return this;
	} 

	public enum typeValues { 
		BOT("bot"),
		COMMONMODULE("commonmodule"),
		DIGITALBOT("digitalbot"),
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
		VOICE("voice"),
		VOICEMAIL("voicemail"),
		VOICESURVEY("voicesurvey"),
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

	public GetFlowsRequest withPageNumber(Integer pageNumber) {
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

	public GetFlowsRequest withPageSize(Integer pageSize) {
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

	public GetFlowsRequest withSortBy(String sortBy) {
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

	public GetFlowsRequest withSortOrder(String sortOrder) {
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

	public GetFlowsRequest withId(List<String> id) {
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

	public GetFlowsRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 

	private String description;
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public GetFlowsRequest withDescription(String description) {
	    this.setDescription(description);
	    return this;
	} 

	private String nameOrDescription;
	public String getNameOrDescription() {
		return this.nameOrDescription;
	}

	public void setNameOrDescription(String nameOrDescription) {
		this.nameOrDescription = nameOrDescription;
	}

	public GetFlowsRequest withNameOrDescription(String nameOrDescription) {
	    this.setNameOrDescription(nameOrDescription);
	    return this;
	} 

	private String publishVersionId;
	public String getPublishVersionId() {
		return this.publishVersionId;
	}

	public void setPublishVersionId(String publishVersionId) {
		this.publishVersionId = publishVersionId;
	}

	public GetFlowsRequest withPublishVersionId(String publishVersionId) {
	    this.setPublishVersionId(publishVersionId);
	    return this;
	} 

	private String editableBy;
	public String getEditableBy() {
		return this.editableBy;
	}

	public void setEditableBy(String editableBy) {
		this.editableBy = editableBy;
	}

	public GetFlowsRequest withEditableBy(String editableBy) {
	    this.setEditableBy(editableBy);
	    return this;
	} 

	private String lockedBy;
	public String getLockedBy() {
		return this.lockedBy;
	}

	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	public GetFlowsRequest withLockedBy(String lockedBy) {
	    this.setLockedBy(lockedBy);
	    return this;
	} 

	private String lockedByClientId;
	public String getLockedByClientId() {
		return this.lockedByClientId;
	}

	public void setLockedByClientId(String lockedByClientId) {
		this.lockedByClientId = lockedByClientId;
	}

	public GetFlowsRequest withLockedByClientId(String lockedByClientId) {
	    this.setLockedByClientId(lockedByClientId);
	    return this;
	} 

	private String secure;
	public String getSecure() {
		return this.secure;
	}

	public void setSecure(String secure) {
		this.secure = secure;
	}

	public GetFlowsRequest withSecure(String secure) {
	    this.setSecure(secure);
	    return this;
	} 

	public enum secureValues { 
		ANY("any"),
		CHECKEDIN("checkedin"),
		PUBLISHED("published");

		private String value;

		secureValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static secureValues fromString(String key) {
			if (key == null) return null;

			for (secureValues value : secureValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return secureValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private Boolean deleted;
	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public GetFlowsRequest withDeleted(Boolean deleted) {
	    this.setDeleted(deleted);
	    return this;
	} 

	private Boolean includeSchemas;
	public Boolean getIncludeSchemas() {
		return this.includeSchemas;
	}

	public void setIncludeSchemas(Boolean includeSchemas) {
		this.includeSchemas = includeSchemas;
	}

	public GetFlowsRequest withIncludeSchemas(Boolean includeSchemas) {
	    this.setIncludeSchemas(includeSchemas);
	    return this;
	} 

	private Boolean virtualAgentEnabled;
	public Boolean getVirtualAgentEnabled() {
		return this.virtualAgentEnabled;
	}

	public void setVirtualAgentEnabled(Boolean virtualAgentEnabled) {
		this.virtualAgentEnabled = virtualAgentEnabled;
	}

	public GetFlowsRequest withVirtualAgentEnabled(Boolean virtualAgentEnabled) {
	    this.setVirtualAgentEnabled(virtualAgentEnabled);
	    return this;
	} 

	private String publishedAfter;
	public String getPublishedAfter() {
		return this.publishedAfter;
	}

	public void setPublishedAfter(String publishedAfter) {
		this.publishedAfter = publishedAfter;
	}

	public GetFlowsRequest withPublishedAfter(String publishedAfter) {
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

	public GetFlowsRequest withPublishedBefore(String publishedBefore) {
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

	public GetFlowsRequest withDivisionId(List<String> divisionId) {
	    this.setDivisionId(divisionId);
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

    public GetFlowsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/flows")

                .withQueryParameters("type", "multi", type)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("sortBy", "", sortBy)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        

                .withQueryParameters("id", "multi", id)
        

                .withQueryParameters("name", "", name)
        

                .withQueryParameters("description", "", description)
        

                .withQueryParameters("nameOrDescription", "", nameOrDescription)
        

                .withQueryParameters("publishVersionId", "", publishVersionId)
        

                .withQueryParameters("editableBy", "", editableBy)
        

                .withQueryParameters("lockedBy", "", lockedBy)
        

                .withQueryParameters("lockedByClientId", "", lockedByClientId)
        

                .withQueryParameters("secure", "", secure)
        

                .withQueryParameters("deleted", "", deleted)
        

                .withQueryParameters("includeSchemas", "", includeSchemas)
        

                .withQueryParameters("virtualAgentEnabled", "", virtualAgentEnabled)
        

                .withQueryParameters("publishedAfter", "", publishedAfter)
        

                .withQueryParameters("publishedBefore", "", publishedBefore)
        

                .withQueryParameters("divisionId", "multi", divisionId)
        
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
		private final GetFlowsRequest request;

		private Builder() {
			request = new GetFlowsRequest();
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

		public Builder withDescription(String description) {
			request.setDescription(description);
			return this;
		}

		public Builder withNameOrDescription(String nameOrDescription) {
			request.setNameOrDescription(nameOrDescription);
			return this;
		}

		public Builder withPublishVersionId(String publishVersionId) {
			request.setPublishVersionId(publishVersionId);
			return this;
		}

		public Builder withEditableBy(String editableBy) {
			request.setEditableBy(editableBy);
			return this;
		}

		public Builder withLockedBy(String lockedBy) {
			request.setLockedBy(lockedBy);
			return this;
		}

		public Builder withLockedByClientId(String lockedByClientId) {
			request.setLockedByClientId(lockedByClientId);
			return this;
		}

		public Builder withSecure(String secure) {
			request.setSecure(secure);
			return this;
		}



		
		public Builder withSecure(secureValues secure) {
		    request.setSecure(secure.toString());

		    return this;
		}

		public Builder withDeleted(Boolean deleted) {
			request.setDeleted(deleted);
			return this;
		}

		public Builder withIncludeSchemas(Boolean includeSchemas) {
			request.setIncludeSchemas(includeSchemas);
			return this;
		}

		public Builder withVirtualAgentEnabled(Boolean virtualAgentEnabled) {
			request.setVirtualAgentEnabled(virtualAgentEnabled);
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




		public GetFlowsRequest build() {
            
			return request;
		}
	}
}
