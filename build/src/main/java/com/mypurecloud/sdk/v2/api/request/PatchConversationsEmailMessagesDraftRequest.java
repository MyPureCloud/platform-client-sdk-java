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

import com.mypurecloud.sdk.v2.model.AdditionalMessage;
import com.mypurecloud.sdk.v2.model.AfterCallWorkUpdate;
import com.mypurecloud.sdk.v2.model.AgentlessEmailSendRequestDto;
import com.mypurecloud.sdk.v2.model.AgentlessEmailSendResponseDto;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributes;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributesMultiGetResponse;
import com.mypurecloud.sdk.v2.model.AssignedWrapupCode;
import com.mypurecloud.sdk.v2.model.AsyncConversationQuery;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.BulkCallbackDisconnectRequest;
import com.mypurecloud.sdk.v2.model.BulkCallbackPatchRequest;
import com.mypurecloud.sdk.v2.model.BulkCallbackPatchResponse;
import com.mypurecloud.sdk.v2.model.CachedMediaItem;
import com.mypurecloud.sdk.v2.model.CachedMediaItemEntityListing;
import com.mypurecloud.sdk.v2.model.CallCommand;
import com.mypurecloud.sdk.v2.model.CallConversation;
import com.mypurecloud.sdk.v2.model.CallConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallHistoryConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallbackConversation;
import com.mypurecloud.sdk.v2.model.CallbackConversationEntityListing;
import com.mypurecloud.sdk.v2.model.ChatConversation;
import com.mypurecloud.sdk.v2.model.ChatConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CobrowseConversation;
import com.mypurecloud.sdk.v2.model.CobrowseConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CobrowseWebMessagingSession;
import com.mypurecloud.sdk.v2.model.ConsultTransfer;
import com.mypurecloud.sdk.v2.model.ConsultTransferResponse;
import com.mypurecloud.sdk.v2.model.ConsultTransferToAgent;
import com.mypurecloud.sdk.v2.model.ConsultTransferToExternal;
import com.mypurecloud.sdk.v2.model.ConsultTransferToQueue;
import com.mypurecloud.sdk.v2.model.ConsultTransferUpdate;
import com.mypurecloud.sdk.v2.model.Conversation;
import com.mypurecloud.sdk.v2.model.ConversationActivityQuery;
import com.mypurecloud.sdk.v2.model.ConversationActivityResponse;
import com.mypurecloud.sdk.v2.model.ConversationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationAggregationQuery;
import com.mypurecloud.sdk.v2.model.ConversationAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.ConversationEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.ConversationEncryptionConfigurationListing;
import com.mypurecloud.sdk.v2.model.ConversationEntityListing;
import com.mypurecloud.sdk.v2.model.ConversationParticipantSearchRequest;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.ConversationSecureAttributes;
import com.mypurecloud.sdk.v2.model.ConversationTagsUpdate;
import com.mypurecloud.sdk.v2.model.ConversationThreadingWindow;
import com.mypurecloud.sdk.v2.model.ConversationUser;
import com.mypurecloud.sdk.v2.model.CopyAttachmentsRequest;
import com.mypurecloud.sdk.v2.model.CreateCallRequest;
import com.mypurecloud.sdk.v2.model.CreateCallResponse;
import com.mypurecloud.sdk.v2.model.CreateCallbackCommand;
import com.mypurecloud.sdk.v2.model.CreateCallbackOnConversationCommand;
import com.mypurecloud.sdk.v2.model.CreateCallbackResponse;
import com.mypurecloud.sdk.v2.model.CreateEmailRequest;
import com.mypurecloud.sdk.v2.model.CreateOutboundMessagingConversationRequest;
import com.mypurecloud.sdk.v2.model.CreateSecureSession;
import com.mypurecloud.sdk.v2.model.CreateWebChatMessageRequest;
import com.mypurecloud.sdk.v2.model.CreateWebChatRequest;
import com.mypurecloud.sdk.v2.model.DataAvailabilityResponse;
import com.mypurecloud.sdk.v2.model.Digits;
import com.mypurecloud.sdk.v2.model.DraftManipulationRequest;
import com.mypurecloud.sdk.v2.model.EmailConversation;
import com.mypurecloud.sdk.v2.model.EmailConversationEntityListing;
import com.mypurecloud.sdk.v2.model.EmailMessage;
import com.mypurecloud.sdk.v2.model.EmailMessagePreviewListing;
import com.mypurecloud.sdk.v2.model.EmailMessageReply;
import com.mypurecloud.sdk.v2.model.EmailsSettings;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FacebookAppCredentials;
import com.mypurecloud.sdk.v2.model.FacebookIntegration;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationRequest;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationUpdateRequest;
import com.mypurecloud.sdk.v2.model.FacebookPermissionEntityListing;
import com.mypurecloud.sdk.v2.model.FaxSendRequest;
import com.mypurecloud.sdk.v2.model.FaxSendResponse;
import com.mypurecloud.sdk.v2.model.FeedbackAddRequest;
import com.mypurecloud.sdk.v2.model.GenerateMeetingIdRequest;
import com.mypurecloud.sdk.v2.model.InboundMessageRequest;
import com.mypurecloud.sdk.v2.model.InstagramIntegration;
import com.mypurecloud.sdk.v2.model.InstagramIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.InstagramIntegrationRequest;
import com.mypurecloud.sdk.v2.model.InstagramIntegrationUpdateRequest;
import com.mypurecloud.sdk.v2.model.JsonCursorSearchResponse;
import com.mypurecloud.sdk.v2.model.LineIntegration;
import com.mypurecloud.sdk.v2.model.LineIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.LineIntegrationRequest;
import com.mypurecloud.sdk.v2.model.MaxParticipants;
import com.mypurecloud.sdk.v2.model.MediaParticipantRequest;
import com.mypurecloud.sdk.v2.model.MeetingIdRecord;
import com.mypurecloud.sdk.v2.model.MessageConversation;
import com.mypurecloud.sdk.v2.model.MessageConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MessageData;
import com.mypurecloud.sdk.v2.model.MessageMediaData;
import com.mypurecloud.sdk.v2.model.MessageTypingEventRequest;
import com.mypurecloud.sdk.v2.model.MessagingConfigListing;
import com.mypurecloud.sdk.v2.model.MessagingIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.MessagingSetting;
import com.mypurecloud.sdk.v2.model.MessagingSettingDefaultRequest;
import com.mypurecloud.sdk.v2.model.MessagingSettingPatchRequest;
import com.mypurecloud.sdk.v2.model.MessagingSettingRequest;
import com.mypurecloud.sdk.v2.model.MessagingStickerEntityListing;
import com.mypurecloud.sdk.v2.model.OpenEventNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenInboundNormalizedEvent;
import com.mypurecloud.sdk.v2.model.OpenInboundNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenInboundNormalizedReceipt;
import com.mypurecloud.sdk.v2.model.OpenIntegration;
import com.mypurecloud.sdk.v2.model.OpenIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.OpenIntegrationRequest;
import com.mypurecloud.sdk.v2.model.OpenIntegrationUpdateRequest;
import com.mypurecloud.sdk.v2.model.OpenMessageNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenReceiptNormalizedMessage;
import com.mypurecloud.sdk.v2.model.ParticipantAttributes;
import com.mypurecloud.sdk.v2.model.PatchCallbackRequest;
import com.mypurecloud.sdk.v2.model.PatchCallbackResponse;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.SecureSession;
import com.mypurecloud.sdk.v2.model.SecureSessionEntityListing;
import com.mypurecloud.sdk.v2.model.SendAgentlessOutboundMessageRequest;
import com.mypurecloud.sdk.v2.model.SendAgentlessOutboundMessageResponse;
import com.mypurecloud.sdk.v2.model.SetRecordingState;
import com.mypurecloud.sdk.v2.model.SetUuiDataRequest;
import com.mypurecloud.sdk.v2.model.Settings;
import com.mypurecloud.sdk.v2.model.SupportedContent;
import com.mypurecloud.sdk.v2.model.SupportedContentListing;
import com.mypurecloud.sdk.v2.model.SupportedContentReference;
import com.mypurecloud.sdk.v2.model.TextMessageListing;
import com.mypurecloud.sdk.v2.model.TransferRequest;
import com.mypurecloud.sdk.v2.model.TransferToAgentRequest;
import com.mypurecloud.sdk.v2.model.TransferToExternalRequest;
import com.mypurecloud.sdk.v2.model.TransferToQueueRequest;
import com.mypurecloud.sdk.v2.model.TwitterIntegration;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationRequest;
import com.mypurecloud.sdk.v2.model.VideoConferenceDetails;
import com.mypurecloud.sdk.v2.model.WebChatMessage;
import com.mypurecloud.sdk.v2.model.WebChatMessageEntityList;
import com.mypurecloud.sdk.v2.model.WebChatTyping;
import com.mypurecloud.sdk.v2.model.WhatsAppEmbeddedSignupIntegrationActivationRequest;
import com.mypurecloud.sdk.v2.model.WhatsAppEmbeddedSignupIntegrationRequest;
import com.mypurecloud.sdk.v2.model.WhatsAppIntegration;
import com.mypurecloud.sdk.v2.model.WhatsAppIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.WhatsAppIntegrationRequest;
import com.mypurecloud.sdk.v2.model.WhatsAppIntegrationUpdateRequest;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.WrapupInput;

public class PatchConversationsEmailMessagesDraftRequest {

	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public PatchConversationsEmailMessagesDraftRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	} 

	private Boolean autoFill;
	public Boolean getAutoFill() {
		return this.autoFill;
	}

	public void setAutoFill(Boolean autoFill) {
		this.autoFill = autoFill;
	}

	public PatchConversationsEmailMessagesDraftRequest withAutoFill(Boolean autoFill) {
	    this.setAutoFill(autoFill);
	    return this;
	} 

	private Boolean discard;
	public Boolean getDiscard() {
		return this.discard;
	}

	public void setDiscard(Boolean discard) {
		this.discard = discard;
	}

	public PatchConversationsEmailMessagesDraftRequest withDiscard(Boolean discard) {
	    this.setDiscard(discard);
	    return this;
	} 

	private DraftManipulationRequest body;
	public DraftManipulationRequest getBody() {
		return this.body;
	}

	public void setBody(DraftManipulationRequest body) {
		this.body = body;
	}

	public PatchConversationsEmailMessagesDraftRequest withBody(DraftManipulationRequest body) {
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

    public PatchConversationsEmailMessagesDraftRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<DraftManipulationRequest> withHttpInfo() {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for PatchConversationsEmailMessagesDraftRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/conversations/emails/{conversationId}/messages/draft")
                .withPathParameter("conversationId", conversationId)
        

                .withQueryParameters("autoFill", "", autoFill)
        

                .withQueryParameters("discard", "", discard)
        
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


	public static Builder builder(String conversationId) {
	    return new Builder()
	            .withRequiredParams(conversationId);
	}


	public static class Builder {
		private final PatchConversationsEmailMessagesDraftRequest request;

		private Builder() {
			request = new PatchConversationsEmailMessagesDraftRequest();
		}


		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}

		public Builder withAutoFill(Boolean autoFill) {
			request.setAutoFill(autoFill);
			return this;
		}

		public Builder withDiscard(Boolean discard) {
			request.setDiscard(discard);
			return this;
		}

		public Builder withBody(DraftManipulationRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String conversationId) {
			request.setConversationId(conversationId);

			return this;
		}


		public PatchConversationsEmailMessagesDraftRequest build() {
            
            // verify the required parameter 'conversationId' is set
            if (request.conversationId == null) {
                throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for PatchConversationsEmailMessagesDraftRequest.");
            }
            
			return request;
		}
	}
}
