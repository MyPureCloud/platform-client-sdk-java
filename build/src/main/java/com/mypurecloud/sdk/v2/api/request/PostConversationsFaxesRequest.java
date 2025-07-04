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
import com.mypurecloud.sdk.v2.model.AdditionalSocialMediaMessage;
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
import com.mypurecloud.sdk.v2.model.ConsultTransferToAddress;
import com.mypurecloud.sdk.v2.model.ConsultTransferToAgent;
import com.mypurecloud.sdk.v2.model.ConsultTransferToExternal;
import com.mypurecloud.sdk.v2.model.ConsultTransferToExternalContact;
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
import com.mypurecloud.sdk.v2.model.ConversationSummariesGetResponse;
import com.mypurecloud.sdk.v2.model.ConversationTagsUpdate;
import com.mypurecloud.sdk.v2.model.ConversationThreadingWindow;
import com.mypurecloud.sdk.v2.model.ConversationUser;
import com.mypurecloud.sdk.v2.model.ConversationUtilizationLabelUpdate;
import com.mypurecloud.sdk.v2.model.CopyAttachmentsRequest;
import com.mypurecloud.sdk.v2.model.CreateCallRequest;
import com.mypurecloud.sdk.v2.model.CreateCallResponse;
import com.mypurecloud.sdk.v2.model.CreateCallbackCommand;
import com.mypurecloud.sdk.v2.model.CreateCallbackOnConversationCommand;
import com.mypurecloud.sdk.v2.model.CreateCallbackResponse;
import com.mypurecloud.sdk.v2.model.CreateEmailRequest;
import com.mypurecloud.sdk.v2.model.CreateOutboundMessagingConversationRequest;
import com.mypurecloud.sdk.v2.model.CreateOutboundMessagingConversationResponse;
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
import com.mypurecloud.sdk.v2.model.EngagementRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FacebookAppCredentials;
import com.mypurecloud.sdk.v2.model.FacebookIntegration;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationRequest;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationUpdateRequest;
import com.mypurecloud.sdk.v2.model.FacebookPermissionEntityListing;
import com.mypurecloud.sdk.v2.model.FaxSendRequest;
import com.mypurecloud.sdk.v2.model.FaxSendResponse;
import com.mypurecloud.sdk.v2.model.Feedback;
import com.mypurecloud.sdk.v2.model.FeedbackAddRequest;
import com.mypurecloud.sdk.v2.model.FeedbackUpdateRequest;
import com.mypurecloud.sdk.v2.model.GenerateMeetingIdRequest;
import com.mypurecloud.sdk.v2.model.IdentityResolutionConfig;
import com.mypurecloud.sdk.v2.model.InboundMessageRequest;
import com.mypurecloud.sdk.v2.model.InstagramIntegration;
import com.mypurecloud.sdk.v2.model.InstagramIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.InstagramIntegrationRequest;
import com.mypurecloud.sdk.v2.model.InstagramIntegrationUpdateRequest;
import com.mypurecloud.sdk.v2.model.InternalMessageConversation;
import com.mypurecloud.sdk.v2.model.InternalMessageConversationEntityListing;
import com.mypurecloud.sdk.v2.model.InternalMessageData;
import com.mypurecloud.sdk.v2.model.InternalMessageDataEntityListing;
import com.mypurecloud.sdk.v2.model.InternalMessageRequest;
import com.mypurecloud.sdk.v2.model.JsonCursorSearchResponse;
import com.mypurecloud.sdk.v2.model.MaxParticipants;
import com.mypurecloud.sdk.v2.model.MediaParticipantRequest;
import com.mypurecloud.sdk.v2.model.MeetingIdRecord;
import com.mypurecloud.sdk.v2.model.MessageConversation;
import com.mypurecloud.sdk.v2.model.MessageConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MessageData;
import com.mypurecloud.sdk.v2.model.MessageMediaData;
import com.mypurecloud.sdk.v2.model.MessageMediaUploadData;
import com.mypurecloud.sdk.v2.model.MessageTypingEventRequest;
import com.mypurecloud.sdk.v2.model.MessagingConferResponse;
import com.mypurecloud.sdk.v2.model.MessagingConferWithUserRequest;
import com.mypurecloud.sdk.v2.model.MessagingConfigListing;
import com.mypurecloud.sdk.v2.model.MessagingIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.MessagingSetting;
import com.mypurecloud.sdk.v2.model.MessagingSettingDefaultRequest;
import com.mypurecloud.sdk.v2.model.MessagingSettingPatchRequest;
import com.mypurecloud.sdk.v2.model.MessagingSettingRequest;
import com.mypurecloud.sdk.v2.model.OpenEventNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenInboundNormalizedEvent;
import com.mypurecloud.sdk.v2.model.OpenInboundNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenInboundNormalizedReceipt;
import com.mypurecloud.sdk.v2.model.OpenInboundStructuredResponseMessage;
import com.mypurecloud.sdk.v2.model.OpenIntegration;
import com.mypurecloud.sdk.v2.model.OpenIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.OpenIntegrationRequest;
import com.mypurecloud.sdk.v2.model.OpenIntegrationUpdateRequest;
import com.mypurecloud.sdk.v2.model.OpenMessageNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenMessagingIdentityResolutionConfig;
import com.mypurecloud.sdk.v2.model.OpenNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenReceiptNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenStructuredResponseNormalizedMessage;
import com.mypurecloud.sdk.v2.model.ParkingStateRequest;
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
import com.mypurecloud.sdk.v2.model.SocialMediaMessageData;
import com.mypurecloud.sdk.v2.model.Suggestion;
import com.mypurecloud.sdk.v2.model.SuggestionEngagement;
import com.mypurecloud.sdk.v2.model.SuggestionListing;
import com.mypurecloud.sdk.v2.model.SupportedContent;
import com.mypurecloud.sdk.v2.model.SupportedContentListing;
import com.mypurecloud.sdk.v2.model.SupportedContentReference;
import com.mypurecloud.sdk.v2.model.TextMessageListing;
import com.mypurecloud.sdk.v2.model.TransferRequest;
import com.mypurecloud.sdk.v2.model.TransferToAddressRequest;
import com.mypurecloud.sdk.v2.model.TransferToAgentRequest;
import com.mypurecloud.sdk.v2.model.TransferToExternalContactRequest;
import com.mypurecloud.sdk.v2.model.TransferToExternalRequest;
import com.mypurecloud.sdk.v2.model.TransferToQueueRequest;
import com.mypurecloud.sdk.v2.model.TwitterIntegration;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationRequest;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationUpdateRequest;
import com.mypurecloud.sdk.v2.model.TwitterOAuthSettings;
import com.mypurecloud.sdk.v2.model.TwitterSignupOAuthSettings;
import com.mypurecloud.sdk.v2.model.UploadMediaRequest;
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

public class PostConversationsFaxesRequest {

	private FaxSendRequest body;
	public FaxSendRequest getBody() {
		return this.body;
	}

	public void setBody(FaxSendRequest body) {
		this.body = body;
	}

	public PostConversationsFaxesRequest withBody(FaxSendRequest body) {
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

    public PostConversationsFaxesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<FaxSendRequest> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostConversationsFaxesRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/conversations/faxes")
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


	public static Builder builder(FaxSendRequest body) {
	    return new Builder()
	            .withRequiredParams(body);
	}


	public static class Builder {
		private final PostConversationsFaxesRequest request;

		private Builder() {
			request = new PostConversationsFaxesRequest();
		}


		public Builder withBody(FaxSendRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(FaxSendRequest body) {
			request.setBody(body);

			return this;
		}


		public PostConversationsFaxesRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostConversationsFaxesRequest.");
            }
            
			return request;
		}
	}
}
