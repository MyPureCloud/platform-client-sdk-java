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

import com.mypurecloud.sdk.v2.model.Action;
import com.mypurecloud.sdk.v2.model.ActionEntityListing;
import com.mypurecloud.sdk.v2.model.AsyncJob;
import com.mypurecloud.sdk.v2.model.BotConnectorBot;
import com.mypurecloud.sdk.v2.model.BotConnectorBotSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.BotConnectorBotVersionSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.BotExecutionConfiguration;
import com.mypurecloud.sdk.v2.model.BotList;
import com.mypurecloud.sdk.v2.model.CategoryEntityListing;
import com.mypurecloud.sdk.v2.model.ClientAppEntityListing;
import com.mypurecloud.sdk.v2.model.CreateIntegrationRequest;
import com.mypurecloud.sdk.v2.model.Credential;
import com.mypurecloud.sdk.v2.model.CredentialInfo;
import com.mypurecloud.sdk.v2.model.CredentialInfoListing;
import com.mypurecloud.sdk.v2.model.CredentialTypeListing;
import com.mypurecloud.sdk.v2.model.DialogflowAgent;
import com.mypurecloud.sdk.v2.model.DialogflowAgentSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.DraftValidationResult;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Integration;
import com.mypurecloud.sdk.v2.model.IntegrationConfiguration;
import com.mypurecloud.sdk.v2.model.IntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.IntegrationType;
import com.mypurecloud.sdk.v2.model.IntegrationTypeEntityListing;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.LexBotAlias;
import com.mypurecloud.sdk.v2.model.LexBotAliasEntityListing;
import com.mypurecloud.sdk.v2.model.LexBotEntityListing;
import com.mypurecloud.sdk.v2.model.NuanceBot;
import com.mypurecloud.sdk.v2.model.NuanceBotEntityListing;
import com.mypurecloud.sdk.v2.model.NuanceBotLaunchSettings;
import com.mypurecloud.sdk.v2.model.PostActionInput;
import com.mypurecloud.sdk.v2.model.PublishDraftInput;
import com.mypurecloud.sdk.v2.model.TestExecutionResult;
import com.mypurecloud.sdk.v2.model.TtsEngineEntity;
import com.mypurecloud.sdk.v2.model.TtsEngineEntityListing;
import com.mypurecloud.sdk.v2.model.TtsSettings;
import com.mypurecloud.sdk.v2.model.TtsVoiceEntity;
import com.mypurecloud.sdk.v2.model.TtsVoiceEntityListing;
import com.mypurecloud.sdk.v2.model.UCIntegrationListing;
import com.mypurecloud.sdk.v2.model.UpdateActionInput;
import com.mypurecloud.sdk.v2.model.UpdateDraftInput;
import com.mypurecloud.sdk.v2.model.UserAppEntityListing;

public class PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest {

	private String nuanceIntegrationId;
	public String getNuanceIntegrationId() {
		return this.nuanceIntegrationId;
	}

	public void setNuanceIntegrationId(String nuanceIntegrationId) {
		this.nuanceIntegrationId = nuanceIntegrationId;
	}

	public PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest withNuanceIntegrationId(String nuanceIntegrationId) {
	    this.setNuanceIntegrationId(nuanceIntegrationId);
	    return this;
	} 

	private String botId;
	public String getBotId() {
		return this.botId;
	}

	public void setBotId(String botId) {
		this.botId = botId;
	}

	public PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest withBotId(String botId) {
	    this.setBotId(botId);
	    return this;
	} 

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		VARIABLES("variables"),
		TRANSFERNODES("transferNodes"),
		CHANNELS("channels"),
		LOCALES("locales");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String body;
	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest withBody(String body) {
	    this.setBody(body);
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

    public PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<String> withHttpInfo() {
        
        // verify the required parameter 'nuanceIntegrationId' is set
        if (this.nuanceIntegrationId == null) {
            throw new IllegalStateException("Missing the required parameter 'nuanceIntegrationId' when building request for PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest.");
        }
        
        // verify the required parameter 'botId' is set
        if (this.botId == null) {
            throw new IllegalStateException("Missing the required parameter 'botId' when building request for PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/integrations/speech/nuance/{nuanceIntegrationId}/bots/{botId}/jobs")
                .withPathParameter("nuanceIntegrationId", nuanceIntegrationId)
        
                .withPathParameter("botId", botId)
        

                .withQueryParameters("expand", "multi", expand)
        
                .withBody(body)

		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String nuanceIntegrationId, String botId) {
	    return new Builder()
	            .withRequiredParams(nuanceIntegrationId, botId);
	}


	public static class Builder {
		private final PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest request;

		private Builder() {
			request = new PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest();
		}


		public Builder withNuanceIntegrationId(String nuanceIntegrationId) {
			request.setNuanceIntegrationId(nuanceIntegrationId);
			return this;
		}

		public Builder withBotId(String botId) {
			request.setBotId(botId);
			return this;
		}

		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}



		public Builder withExpandEnumValues(List<expandValues> expand) {
		    List<String> stringList = new ArrayList<>();
	      for (expandValues e : expand) {
	        stringList.add(e.toString());
	      }
	      request.setExpand(stringList);
		    return this;
		}

		public Builder withBody(String body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String nuanceIntegrationId, String botId) {
			request.setNuanceIntegrationId(nuanceIntegrationId);
			request.setBotId(botId);

			return this;
		}


		public PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest build() {
            
            // verify the required parameter 'nuanceIntegrationId' is set
            if (request.nuanceIntegrationId == null) {
                throw new IllegalStateException("Missing the required parameter 'nuanceIntegrationId' when building request for PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest.");
            }
            
            // verify the required parameter 'botId' is set
            if (request.botId == null) {
                throw new IllegalStateException("Missing the required parameter 'botId' when building request for PostIntegrationsSpeechNuanceNuanceIntegrationIdBotJobsRequest.");
            }
            
			return request;
		}
	}
}
