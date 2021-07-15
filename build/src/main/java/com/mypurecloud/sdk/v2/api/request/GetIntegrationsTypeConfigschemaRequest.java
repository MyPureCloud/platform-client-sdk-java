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

public class GetIntegrationsTypeConfigschemaRequest {
    
	private String typeId;
	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public GetIntegrationsTypeConfigschemaRequest withTypeId(String typeId) {
	    this.setTypeId(typeId);
	    return this;
	} 
	
	private String configType;
	public String getConfigType() {
		return this.configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
	}

	public GetIntegrationsTypeConfigschemaRequest withConfigType(String configType) {
	    this.setConfigType(configType);
	    return this;
	} 

	public enum configTypeValues { 
		PROPERTIES("properties"), 
		ADVANCED("advanced");

		private String value;

		configTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static configTypeValues fromString(String key) {
			if (key == null) return null;

			for (configTypeValues value : configTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return configTypeValues.values()[0];
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

    public GetIntegrationsTypeConfigschemaRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'typeId' is set
        if (this.typeId == null) {
            throw new IllegalStateException("Missing the required parameter 'typeId' when building request for GetIntegrationsTypeConfigschemaRequest.");
        }
        
        // verify the required parameter 'configType' is set
        if (this.configType == null) {
            throw new IllegalStateException("Missing the required parameter 'configType' when building request for GetIntegrationsTypeConfigschemaRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/integrations/types/{typeId}/configschemas/{configType}")
                .withPathParameter("typeId", typeId)
        
                .withPathParameter("configType", configType)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String typeId, String configType) {
	    return new Builder()
	            .withRequiredParams(typeId, configType);
	}
	

	public static class Builder {
		private final GetIntegrationsTypeConfigschemaRequest request;

		private Builder() {
			request = new GetIntegrationsTypeConfigschemaRequest();
		}

		
		public Builder withTypeId(String typeId) {
			request.setTypeId(typeId);
			return this;
		}
		
		public Builder withConfigType(String configType) {
			request.setConfigType(configType);
			return this;
		}

		public Builder withConfigType(configTypeValues configType) {
		    request.setConfigType(configType.toString());
		    return this;
		}
		

		
		public Builder withRequiredParams(String typeId, String configType) {
			request.setTypeId(typeId);
						request.setConfigType(configType);
			
			return this;
		}
		

		public GetIntegrationsTypeConfigschemaRequest build() {
            
            // verify the required parameter 'typeId' is set
            if (request.typeId == null) {
                throw new IllegalStateException("Missing the required parameter 'typeId' when building request for GetIntegrationsTypeConfigschemaRequest.");
            }
            
            // verify the required parameter 'configType' is set
            if (request.configType == null) {
                throw new IllegalStateException("Missing the required parameter 'configType' when building request for GetIntegrationsTypeConfigschemaRequest.");
            }
            
			return request;
		}
	}
}
