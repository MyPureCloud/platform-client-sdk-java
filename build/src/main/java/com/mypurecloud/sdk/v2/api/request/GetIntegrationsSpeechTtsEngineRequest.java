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

public class GetIntegrationsSpeechTtsEngineRequest {
    
	private String engineId;
	public String getEngineId() {
		return this.engineId;
	}

	public void setEngineId(String engineId) {
		this.engineId = engineId;
	}

	public GetIntegrationsSpeechTtsEngineRequest withEngineId(String engineId) {
	    this.setEngineId(engineId);
	    return this;
	} 
	
	private Boolean includeVoices;
	public Boolean getIncludeVoices() {
		return this.includeVoices;
	}

	public void setIncludeVoices(Boolean includeVoices) {
		this.includeVoices = includeVoices;
	}

	public GetIntegrationsSpeechTtsEngineRequest withIncludeVoices(Boolean includeVoices) {
	    this.setIncludeVoices(includeVoices);
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

    public GetIntegrationsSpeechTtsEngineRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'engineId' is set
        if (this.engineId == null) {
            throw new IllegalStateException("Missing the required parameter 'engineId' when building request for GetIntegrationsSpeechTtsEngineRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/integrations/speech/tts/engines/{engineId}")
                .withPathParameter("engineId", engineId)
        
                .withQueryParameters("includeVoices", "", includeVoices)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String engineId) {
	    return new Builder()
	            .withRequiredParams(engineId);
	}
	

	public static class Builder {
		private final GetIntegrationsSpeechTtsEngineRequest request;

		private Builder() {
			request = new GetIntegrationsSpeechTtsEngineRequest();
		}

		
		public Builder withEngineId(String engineId) {
			request.setEngineId(engineId);
			return this;
		}
		
		public Builder withIncludeVoices(Boolean includeVoices) {
			request.setIncludeVoices(includeVoices);
			return this;
		}
		

		
		public Builder withRequiredParams(String engineId) {
			request.setEngineId(engineId);
			
			return this;
		}
		

		public GetIntegrationsSpeechTtsEngineRequest build() {
            
            // verify the required parameter 'engineId' is set
            if (request.engineId == null) {
                throw new IllegalStateException("Missing the required parameter 'engineId' when building request for GetIntegrationsSpeechTtsEngineRequest.");
            }
            
			return request;
		}
	}
}
