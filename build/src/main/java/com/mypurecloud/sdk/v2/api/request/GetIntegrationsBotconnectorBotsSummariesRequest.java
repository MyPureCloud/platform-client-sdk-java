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
import com.mypurecloud.sdk.v2.model.CredentialInfoCursorListing;
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

public class GetIntegrationsBotconnectorBotsSummariesRequest {

	private String integrationId;
	public String getIntegrationId() {
		return this.integrationId;
	}

	public void setIntegrationId(String integrationId) {
		this.integrationId = integrationId;
	}

	public GetIntegrationsBotconnectorBotsSummariesRequest withIntegrationId(String integrationId) {
	    this.setIntegrationId(integrationId);
	    return this;
	} 

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetIntegrationsBotconnectorBotsSummariesRequest withPageNumber(Integer pageNumber) {
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

	public GetIntegrationsBotconnectorBotsSummariesRequest withPageSize(Integer pageSize) {
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

    public GetIntegrationsBotconnectorBotsSummariesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'integrationId' is set
        if (this.integrationId == null) {
            throw new IllegalStateException("Missing the required parameter 'integrationId' when building request for GetIntegrationsBotconnectorBotsSummariesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/integrations/botconnectors/{integrationId}/bots/summaries")
                .withPathParameter("integrationId", integrationId)
        

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


	public static Builder builder(String integrationId) {
	    return new Builder()
	            .withRequiredParams(integrationId);
	}


	public static class Builder {
		private final GetIntegrationsBotconnectorBotsSummariesRequest request;

		private Builder() {
			request = new GetIntegrationsBotconnectorBotsSummariesRequest();
		}


		public Builder withIntegrationId(String integrationId) {
			request.setIntegrationId(integrationId);
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



		public Builder withRequiredParams(String integrationId) {
			request.setIntegrationId(integrationId);

			return this;
		}


		public GetIntegrationsBotconnectorBotsSummariesRequest build() {
            
            // verify the required parameter 'integrationId' is set
            if (request.integrationId == null) {
                throw new IllegalStateException("Missing the required parameter 'integrationId' when building request for GetIntegrationsBotconnectorBotsSummariesRequest.");
            }
            
			return request;
		}
	}
}
