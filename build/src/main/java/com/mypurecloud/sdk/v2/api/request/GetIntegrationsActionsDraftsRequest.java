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

import com.mypurecloud.sdk.v2.model.Integration;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IntegrationConfiguration;
import com.mypurecloud.sdk.v2.model.IntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.Action;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.DraftValidationResult;
import com.mypurecloud.sdk.v2.model.ActionEntityListing;
import com.mypurecloud.sdk.v2.model.CategoryEntityListing;
import com.mypurecloud.sdk.v2.model.BotConnectorBot;
import com.mypurecloud.sdk.v2.model.BotConnectorBotVersionSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.BotList;
import com.mypurecloud.sdk.v2.model.BotConnectorBotSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.ClientAppEntityListing;
import com.mypurecloud.sdk.v2.model.Credential;
import com.mypurecloud.sdk.v2.model.CredentialInfoListing;
import com.mypurecloud.sdk.v2.model.CredentialTypeListing;
import com.mypurecloud.sdk.v2.model.IntegrationEventEntityListing;
import com.mypurecloud.sdk.v2.model.IntegrationEvent;
import com.mypurecloud.sdk.v2.model.DialogflowAgent;
import com.mypurecloud.sdk.v2.model.DialogflowAgentSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.LexBotAlias;
import com.mypurecloud.sdk.v2.model.LexBotAliasEntityListing;
import com.mypurecloud.sdk.v2.model.LexBotEntityListing;
import com.mypurecloud.sdk.v2.model.TtsEngineEntity;
import com.mypurecloud.sdk.v2.model.TtsVoiceEntity;
import com.mypurecloud.sdk.v2.model.TtsVoiceEntityListing;
import com.mypurecloud.sdk.v2.model.TtsEngineEntityListing;
import com.mypurecloud.sdk.v2.model.TtsSettings;
import com.mypurecloud.sdk.v2.model.IntegrationType;
import com.mypurecloud.sdk.v2.model.IntegrationTypeEntityListing;
import com.mypurecloud.sdk.v2.model.UserAppEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateActionInput;
import com.mypurecloud.sdk.v2.model.UpdateDraftInput;
import com.mypurecloud.sdk.v2.model.CreateIntegrationRequest;
import com.mypurecloud.sdk.v2.model.PublishDraftInput;
import com.mypurecloud.sdk.v2.model.TestExecutionResult;
import com.mypurecloud.sdk.v2.model.PostActionInput;
import com.mypurecloud.sdk.v2.model.CredentialInfo;
import com.mypurecloud.sdk.v2.model.UserActionCategoryEntityListing;
import com.mypurecloud.sdk.v2.model.VendorConnectionRequest;

public class GetIntegrationsActionsDraftsRequest {
    
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetIntegrationsActionsDraftsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetIntegrationsActionsDraftsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private String nextPage;
	public String getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}

	public GetIntegrationsActionsDraftsRequest withNextPage(String nextPage) {
	    this.setNextPage(nextPage);
	    return this;
	} 
	
	private String previousPage;
	public String getPreviousPage() {
		return this.previousPage;
	}

	public void setPreviousPage(String previousPage) {
		this.previousPage = previousPage;
	}

	public GetIntegrationsActionsDraftsRequest withPreviousPage(String previousPage) {
	    this.setPreviousPage(previousPage);
	    return this;
	} 
	
	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetIntegrationsActionsDraftsRequest withSortBy(String sortBy) {
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

	public GetIntegrationsActionsDraftsRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 

	public enum sortOrderValues { 
		ASC("ASC"), 
		DESC("DESC");

		private String value;

		sortOrderValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static sortOrderValues fromString(String key) {
			if (key == null) return null;

			for (sortOrderValues value : sortOrderValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return sortOrderValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String category;
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public GetIntegrationsActionsDraftsRequest withCategory(String category) {
	    this.setCategory(category);
	    return this;
	} 
	
	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetIntegrationsActionsDraftsRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 
	
	private String secure;
	public String getSecure() {
		return this.secure;
	}

	public void setSecure(String secure) {
		this.secure = secure;
	}

	public GetIntegrationsActionsDraftsRequest withSecure(String secure) {
	    this.setSecure(secure);
	    return this;
	} 

	public enum secureValues { 
		TRUE("true"), 
		FALSE("false");

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
	
	private String includeAuthActions;
	public String getIncludeAuthActions() {
		return this.includeAuthActions;
	}

	public void setIncludeAuthActions(String includeAuthActions) {
		this.includeAuthActions = includeAuthActions;
	}

	public GetIntegrationsActionsDraftsRequest withIncludeAuthActions(String includeAuthActions) {
	    this.setIncludeAuthActions(includeAuthActions);
	    return this;
	} 

	public enum includeAuthActionsValues { 
		TRUE("true"), 
		FALSE("false");

		private String value;

		includeAuthActionsValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static includeAuthActionsValues fromString(String key) {
			if (key == null) return null;

			for (includeAuthActionsValues value : includeAuthActionsValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return includeAuthActionsValues.values()[0];
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

    public GetIntegrationsActionsDraftsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/integrations/actions/drafts")
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("nextPage", "", nextPage)
        
                .withQueryParameters("previousPage", "", previousPage)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("sortOrder", "", sortOrder)
        
                .withQueryParameters("category", "", category)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("secure", "", secure)
        
                .withQueryParameters("includeAuthActions", "", includeAuthActions)
        
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
		private final GetIntegrationsActionsDraftsRequest request;

		private Builder() {
			request = new GetIntegrationsActionsDraftsRequest();
		}

		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withNextPage(String nextPage) {
			request.setNextPage(nextPage);
			return this;
		}
		
		public Builder withPreviousPage(String previousPage) {
			request.setPreviousPage(previousPage);
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

		public Builder withSortOrder(sortOrderValues sortOrder) {
		    request.setSortOrder(sortOrder.toString());
		    return this;
		}
		
		public Builder withCategory(String category) {
			request.setCategory(category);
			return this;
		}
		
		public Builder withName(String name) {
			request.setName(name);
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
		
		public Builder withIncludeAuthActions(String includeAuthActions) {
			request.setIncludeAuthActions(includeAuthActions);
			return this;
		}

		public Builder withIncludeAuthActions(includeAuthActionsValues includeAuthActions) {
		    request.setIncludeAuthActions(includeAuthActions.toString());
		    return this;
		}
		

		

		public GetIntegrationsActionsDraftsRequest build() {
            
			return request;
		}
	}
}
