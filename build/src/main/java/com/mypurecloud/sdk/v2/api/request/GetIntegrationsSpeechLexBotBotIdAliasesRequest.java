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

public class GetIntegrationsSpeechLexBotBotIdAliasesRequest {
    
	private String botId;
	public String getBotId() {
		return this.botId;
	}

	public void setBotId(String botId) {
		this.botId = botId;
	}

	public GetIntegrationsSpeechLexBotBotIdAliasesRequest withBotId(String botId) {
	    this.setBotId(botId);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetIntegrationsSpeechLexBotBotIdAliasesRequest withPageNumber(Integer pageNumber) {
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

	public GetIntegrationsSpeechLexBotBotIdAliasesRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private String status;
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GetIntegrationsSpeechLexBotBotIdAliasesRequest withStatus(String status) {
	    this.setStatus(status);
	    return this;
	} 

	public enum statusValues { 
		READY("READY"), 
		FAILED("FAILED"), 
		BUILDING("BUILDING"), 
		NOT_BUILT("NOT_BUILT");

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
	
	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetIntegrationsSpeechLexBotBotIdAliasesRequest withName(String name) {
	    this.setName(name);
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

    public GetIntegrationsSpeechLexBotBotIdAliasesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'botId' is set
        if (this.botId == null) {
            throw new IllegalStateException("Missing the required parameter 'botId' when building request for GetIntegrationsSpeechLexBotBotIdAliasesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/integrations/speech/lex/bot/{botId}/aliases")
                .withPathParameter("botId", botId)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("status", "", status)
        
                .withQueryParameters("name", "", name)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String botId) {
	    return new Builder()
	            .withRequiredParams(botId);
	}
	

	public static class Builder {
		private final GetIntegrationsSpeechLexBotBotIdAliasesRequest request;

		private Builder() {
			request = new GetIntegrationsSpeechLexBotBotIdAliasesRequest();
		}

		
		public Builder withBotId(String botId) {
			request.setBotId(botId);
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
		
		public Builder withStatus(String status) {
			request.setStatus(status);
			return this;
		}

		public Builder withStatus(statusValues status) {
		    request.setStatus(status.toString());
		    return this;
		}
		
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		

		
		public Builder withRequiredParams(String botId) {
			request.setBotId(botId);
			
			return this;
		}
		

		public GetIntegrationsSpeechLexBotBotIdAliasesRequest build() {
            
            // verify the required parameter 'botId' is set
            if (request.botId == null) {
                throw new IllegalStateException("Missing the required parameter 'botId' when building request for GetIntegrationsSpeechLexBotBotIdAliasesRequest.");
            }
            
			return request;
		}
	}
}
