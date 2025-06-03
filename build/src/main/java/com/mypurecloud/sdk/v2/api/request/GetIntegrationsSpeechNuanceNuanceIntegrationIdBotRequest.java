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
import com.mypurecloud.sdk.v2.model.ActionCertificateListing;
import com.mypurecloud.sdk.v2.model.ActionEntityListing;
import com.mypurecloud.sdk.v2.model.AsyncJob;
import com.mypurecloud.sdk.v2.model.AudioConnectorIntegration;
import com.mypurecloud.sdk.v2.model.AudioConnectorIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.Bot;
import com.mypurecloud.sdk.v2.model.BotConnectorBot;
import com.mypurecloud.sdk.v2.model.BotConnectorBotSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.BotConnectorBotVersionSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.BotExecutionConfiguration;
import com.mypurecloud.sdk.v2.model.BotList;
import com.mypurecloud.sdk.v2.model.BotListing;
import com.mypurecloud.sdk.v2.model.BotSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.CategoryEntityListing;
import com.mypurecloud.sdk.v2.model.ClientAppEntityListing;
import com.mypurecloud.sdk.v2.model.CreateIntegrationRequest;
import com.mypurecloud.sdk.v2.model.Credential;
import com.mypurecloud.sdk.v2.model.CredentialInfo;
import com.mypurecloud.sdk.v2.model.CredentialInfoListing;
import com.mypurecloud.sdk.v2.model.CredentialTypeListing;
import com.mypurecloud.sdk.v2.model.DialogflowAgent;
import com.mypurecloud.sdk.v2.model.DialogflowAgentSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.DialogflowCXAgent;
import com.mypurecloud.sdk.v2.model.DialogflowCXAgentSummaryEntityListing;
import com.mypurecloud.sdk.v2.model.DraftValidationResult;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Function;
import com.mypurecloud.sdk.v2.model.FunctionConfig;
import com.mypurecloud.sdk.v2.model.FunctionRuntime;
import com.mypurecloud.sdk.v2.model.FunctionUploadRequest;
import com.mypurecloud.sdk.v2.model.FunctionUploadResponse;
import com.mypurecloud.sdk.v2.model.IncomingMessageRequest;
import com.mypurecloud.sdk.v2.model.IncomingMessageResponse;
import com.mypurecloud.sdk.v2.model.Integration;
import com.mypurecloud.sdk.v2.model.IntegrationConfiguration;
import com.mypurecloud.sdk.v2.model.IntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.IntegrationType;
import com.mypurecloud.sdk.v2.model.IntegrationTypeEntityListing;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.LexBotAlias;
import com.mypurecloud.sdk.v2.model.LexBotAliasEntityListing;
import com.mypurecloud.sdk.v2.model.LexBotEntityListing;
import com.mypurecloud.sdk.v2.model.LexV2BotAlias;
import com.mypurecloud.sdk.v2.model.LexV2BotAliasEntityListing;
import com.mypurecloud.sdk.v2.model.LexV2BotEntityListing;
import com.mypurecloud.sdk.v2.model.NuanceBot;
import com.mypurecloud.sdk.v2.model.NuanceBotEntityListing;
import com.mypurecloud.sdk.v2.model.NuanceBotLaunchSettings;
import com.mypurecloud.sdk.v2.model.OutgoingMessageRequest;
import com.mypurecloud.sdk.v2.model.OutgoingMessageResponse;
import com.mypurecloud.sdk.v2.model.PostActionInput;
import com.mypurecloud.sdk.v2.model.PublishDraftInput;
import com.mypurecloud.sdk.v2.model.SttEngineEntity;
import com.mypurecloud.sdk.v2.model.SttEngineEntityListing;
import com.mypurecloud.sdk.v2.model.TestExecutionResult;
import com.mypurecloud.sdk.v2.model.TrustedCertificates;
import com.mypurecloud.sdk.v2.model.TtsEngineEntity;
import com.mypurecloud.sdk.v2.model.TtsEngineEntityListing;
import com.mypurecloud.sdk.v2.model.TtsSettings;
import com.mypurecloud.sdk.v2.model.TtsVoiceEntity;
import com.mypurecloud.sdk.v2.model.TtsVoiceEntityListing;
import com.mypurecloud.sdk.v2.model.UCIntegrationListing;
import com.mypurecloud.sdk.v2.model.UCThirdPartyPresence;
import com.mypurecloud.sdk.v2.model.UnifiedCommunicationsIntegration;
import com.mypurecloud.sdk.v2.model.UnifiedCommunicationsIntegrationListing;
import com.mypurecloud.sdk.v2.model.UpdateActionInput;
import com.mypurecloud.sdk.v2.model.UpdateDraftInput;
import com.mypurecloud.sdk.v2.model.UserAppEntityListing;
import com.mypurecloud.sdk.v2.model.WebhookInvocationResponse;

public class GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest {

	private String nuanceIntegrationId;
	public String getNuanceIntegrationId() {
		return this.nuanceIntegrationId;
	}

	public void setNuanceIntegrationId(String nuanceIntegrationId) {
		this.nuanceIntegrationId = nuanceIntegrationId;
	}

	public GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest withNuanceIntegrationId(String nuanceIntegrationId) {
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

	public GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest withBotId(String botId) {
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

	public GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest withExpand(List<String> expand) {
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

	private String targetChannel;
	public String getTargetChannel() {
		return this.targetChannel;
	}

	public void setTargetChannel(String targetChannel) {
		this.targetChannel = targetChannel;
	}

	public GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest withTargetChannel(String targetChannel) {
	    this.setTargetChannel(targetChannel);
	    return this;
	} 

	public enum targetChannelValues { 
		DIGITAL("digital"),
		VOICE("voice");

		private String value;

		targetChannelValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static targetChannelValues fromString(String key) {
			if (key == null) return null;

			for (targetChannelValues value : targetChannelValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return targetChannelValues.values()[0];
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

    public GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'nuanceIntegrationId' is set
        if (this.nuanceIntegrationId == null) {
            throw new IllegalStateException("Missing the required parameter 'nuanceIntegrationId' when building request for GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest.");
        }
        
        // verify the required parameter 'botId' is set
        if (this.botId == null) {
            throw new IllegalStateException("Missing the required parameter 'botId' when building request for GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/integrations/speech/nuance/{nuanceIntegrationId}/bots/{botId}")
                .withPathParameter("nuanceIntegrationId", nuanceIntegrationId)
        
                .withPathParameter("botId", botId)
        

                .withQueryParameters("expand", "multi", expand)
        

                .withQueryParameters("targetChannel", "", targetChannel)
        
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
		private final GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest request;

		private Builder() {
			request = new GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest();
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

		public Builder withTargetChannel(String targetChannel) {
			request.setTargetChannel(targetChannel);
			return this;
		}



		
		public Builder withTargetChannel(targetChannelValues targetChannel) {
		    request.setTargetChannel(targetChannel.toString());

		    return this;
		}



		public Builder withRequiredParams(String nuanceIntegrationId, String botId) {
			request.setNuanceIntegrationId(nuanceIntegrationId);
			request.setBotId(botId);

			return this;
		}


		public GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest build() {
            
            // verify the required parameter 'nuanceIntegrationId' is set
            if (request.nuanceIntegrationId == null) {
                throw new IllegalStateException("Missing the required parameter 'nuanceIntegrationId' when building request for GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest.");
            }
            
            // verify the required parameter 'botId' is set
            if (request.botId == null) {
                throw new IllegalStateException("Missing the required parameter 'botId' when building request for GetIntegrationsSpeechNuanceNuanceIntegrationIdBotRequest.");
            }
            
			return request;
		}
	}
}
